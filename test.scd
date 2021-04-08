// Ptexto test file

// A list passes its values through a modulo operator
// Sometimes add a value at third parmeter is convenient to no get 0, for examplke when you use Ptexto with a \dur key

~pt = Ptexto([1, 2, 3, 4], 2, 0.5, inf).asStream;
~pt.next;