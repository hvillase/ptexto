//===================================//
// Ptexto: A Pattern for modul list  //
// Author: Hernani Villasenor        //
//                                   //
// A list pass through a modulo and  //
// add a value to no get 0 in case   //
// you use with \dur                 //
//===================================//

Ptexto : Pattern {

	var <>list, <>modVal, <>sumVal, <>repeats, <>offset;

	*new { arg list, modVal = 1, sumVal = 0, repeats = 1, offset = 0;
		^super.newCopyArgs(list, modVal, sumVal, repeats, offset)
	}

	embedInStream { arg inval;
		var listVal = Pseq(list, inf).asStream;

		repeats.do({
			inval = (listVal.next.mod(modVal) + sumVal).yield;
		});
		^inval;
	}
}