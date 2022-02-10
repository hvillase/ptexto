Ptexto : Pattern {

	// variables: lista is the array of values, modVal the modulo value, sumVal adds to modulo
	var <>lista, <>modVal, <>sumVal, <>repeats;

	// the constructor
	*new { |lista, modVal = 1, sumVal = 0, repeats = 1|
		^super.newCopyArgs(lista, modVal, sumVal, repeats)
	}

	// to embed the values of the list into the stream
	embedInStream { |inval|
		var listVal = lista;
		var item;

		repeats.do({ |i|
	// this line applies the modulo operation to the list values
			item = (listVal[i % lista.size].mod(modVal) + sumVal);
	// this line makes possible to nest a pattern inside Ptexto
			inval = item.embedInStream(inval);
		});
		^inval;
	}
}
