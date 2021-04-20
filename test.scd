// Ptexto test file

// A list passes its values through a modulo operator
// Sometimes is necessary to add a value at the third parmeter. This is convenient to not get a 0, for example when you use Ptexto with a \dur key inside a Pbind


// Example 1: integer values, no addition in parameter 3
~pt = Ptexto([1, 2, 3, 4], 2, 0, inf).asStream;
~pt.next;

// Example 2: float values and 0.5 addition inn parameter 3
~pt = Ptexto([2.5, 2.25, 3.5, 4.75], 2, 0.5, inf).asStream;
~pt.next;

// Example 3: a Pattern nested inside Ptexto
~pt = Ptexto([2.5, 2.25, 3.5, 4.75, Pseq([2, 3, 4, 5])], 2, 0.25, inf).asStream;
~pt.next;
