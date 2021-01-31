
//===================================//
// Ptexto: A Pattern for modul list  //
// Autor: Hernani Villasenor         //
//===================================//

// experimentar con valores innecesarios de la rutina
// Pattern actua en combinación con storeArgs

Ptexto : Pattern {

	var <>list, <>mod, <>sum, <>repeats, <>offset;

	// incio argumentos del pattern
	*new { arg list, mod = 1, sum = 0, repeats = 1, offset = 0;
		^super.newCopyArgs(list, mod, sum, repeats, offset)
	}

	// con esto obtengo los valores del array uno a uno(?). offest no tiene funcion
	storeArgs {^[list, mod, sum, repeats, offset]}

	// [].asStream para generar stream del array
	// incrustarEnFlujo los valores entrantes (inval)
	embedInStream { arg inval;
		var listVal = Pseq(list, inf).asStream;
		var modStr = mod.asStream;
		var sumStr = sum.asStream;
		var modVal;
		var sumVal;

		// rutina
		repeats.value(inval).do({ // usar .value(inval) si el valor no se mueve
			modVal = modStr.next(inval); // inval = [].next(inval)
			sumVal = sumStr.next(inval); // modStr y sumStr son valores fijos en este momento

			// yield escupe los valores del cálculo
			// inval => Pseq % modVal + sumVal
			inval = (listVal.next.mod(modVal) + sumVal).yield;
		});
		^inval; // esto es lo que regresa el pattern
	}
}