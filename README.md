# Ptexto
A pattern for modular lists in SuperCollider.

## Introduction
This pattern is designed to get the modulo operation from a list of numbers.

## Installation
Clone the respository and put it in your SuperCollider Extensions.

## How it works
First write a list of numbers in the pattern array. Thne specify the number that makes the modulo operation. You can write a number to sum to the modulo operation just in case the result of the operation is 0 and you apply the pattern to a \dur key. Last, write the length of the pattern.
```
Ptexto([2, 3, 4, 5], 2, 0, inf)
```
## Example
An example with Pdef and default synth.
```
Pdef(\texto, Pbind(
            \instrument, \default,
            \dur, Ptexto([2, 3, 4, 7, 8], 1.5, 0.5, inf),
            \note, Ptexto([3, 4, 5, 9], 3.75, 0, inf)
            )
).play
```

