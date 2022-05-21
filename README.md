# Ptexto
A pattern for modular lists in SuperCollider.

## Introduction
This pattern is designed to get the result of the modulo operation from a list of numbers.

## Installation
Clone the respository and put it in your SuperCollider Extensions.

## How it works
First write a list of numbers in the pattern array. Then specify the number that makes the modulo operation. You can write a number to sum to the result of the modulo operation just in case is 0. Zero is a problematic result when passes to the duration \dur key. Finally write the length of the pattern.
```
n=Ptexto([2, 3, 4, 5], 2, 0, inf).asStream;
n.next;
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

