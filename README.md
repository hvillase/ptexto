# Ptexto
A pattern for modular lists in SuperCollider.

## Introduction
This pattern is designed to get the modulo operation from a list of numbers.

## Installation
Clone the respository and put it in your SuperCollider Extensions.

## How it works
Write a list of numbers in the pattern array. Specify the number that makes the modulo operation. Write a number to sum to the modulo operation, just in case the result is 0 and you apply this pattern to a \dur key. Write the length of the pattern.
```
Ptexto([2, 3, 4, 5], 2, 0, inf)
```
