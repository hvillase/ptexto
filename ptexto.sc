//===================================//
// Ptexto: A Pattern for modul list  //
// Author: Hernani Villasenor        //
//                                   //
// A list pass through a modulo and  //
// add a value for not to get 0 in   //
// case you use it with \dur         //
//===================================//

Ptexto : Pattern {

	var <>lista, <>modVal, <>sumVal, <>repeats, <>offset;

	*new { arg lista, modVal = 1, sumVal = 0, repeats = 1, offset = 0;
		^super.newCopyArgs(lista, modVal, sumVal, repeats, offset)
	}

	embedInStream { arg inval;
		var listVal = lista;

		repeats.do({arg i;
			inval = (listVal[i % lista.size].mod(modVal) + sumVal).yield;
		});
		^inval;
	}
}