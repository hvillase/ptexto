# Ptexto
Patrón para aplicar la operación módulo a una lista de valores.

## Introducción
Este patrón está diseñado para obtener el resultado de la operación módulo de una lista de números.

## Instalación
Clona el repositorio y colocalo en la carpeta Extensions de SuperCollider.

## Cómo funciona
Primero escribe una lista de números en el arreglo del patrón. Luego especifica el número que calcula la operación módulo. Puedes escribir un número para sumar al resultado de la operación en caso de que sea 0. Cero es un resultado problemático cuando pasa a la duración \dur. Finalmente escribe la longitud del patrón. 
```
n=Ptexto([2, 3, 4, 5], 2, 0, inf).asStream;
n.next;
```
## Ejemplo
Un ejemplo con Pdef y el Synth genérico de SuperCollider.
```
Pdef(\texto, Pbind(
            \instrument, \default,
            \dur, Ptexto([2, 3, 4, 7, 8], 1.5, 0.5, inf),
            \note, Ptexto([3, 4, 5, 9], 3.75, 0, inf)
            )
).play
```

