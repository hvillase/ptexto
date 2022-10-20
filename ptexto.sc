// Sequential pattern to modulo

Ptexto : Pattern {

	// list: the array of values, modVal: modulo value, sumVal: adds to modulo
	var <>list, <>modVal, <>sumVal, <>repeats;

	// Constructor
	*new { |list, modVal = 1, sumVal = 0, repeats = 1|
		^super.newCopyArgs(list, modVal, sumVal, repeats)
	}

	// Embed the values of the list into the stream
	embedInStream { |inval|
		var listVal = list;
		var item;

		repeats.do({ |i|
	// Apply the modulo operation to the list values
			item = (listVal[i % list.size].mod(modVal) + sumVal);
	// Allows to place the resulting values from Ptexto computation in the pattern stream
			inval = item.embedInStream(inval);
		});
		^inval;
	}
}
