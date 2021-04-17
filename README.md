# Hanoi Towers

## **Historia**

El problema de las torres de Hanoi, también llamado las Torres de Brama o el problema del fin del mundo, se atribuye al matemático francés Édouard Lucas d’Amiens, que lo publicó en 1883 en París bajo el pseudónimo de “N. Claus de Siam”. Se le llamó las Torres de Hanoi probablemente debido a que por esas fechas en las que Francia estaba involucrado militarmente en Tonkin y Annam el nombre Hanoi aparecía mucho en las primeras planas de los diarios. El problema está inspirado en una leyenda de un templo hindú en donde se empleaba un rompecabezas para probar la habilidad mental de los jóvenes sacerdotes. Otro matemático francés, De Parville, desarrolló en 1884 la siguiente historia, muy relacionada con el problema: 

“En el gran templo de Benarés, debajo de la cúpula que marca el centro del mundo, yace una base de bronce, en donde se encuentran acomodadas 3 agujas de diamante (o torres), cada una del grueso del cuerpo de una abeja y de una altura de 50 cm aproximadamente En una de estas agujas, Dios, al momento de la creación, colocó 64 discos de oro —el mayor sobre el plato de bronce, y el resto de menor tamaño conforme se llega a la cima. Día y noche, incesantemente, los sacerdotes del templo mueven los discos de una aguja a otra de acuerdo con las leyes impuestas e inmutables de Brahma, que requieren que los sacerdotes se encuentren todo el tiempo trabajando, no muevan más de un disco a la vez y que deben colocar el disco en alguna de las agujas de modo que no cubra a un disco de radio menor. Cuando los 64 discos hayan sido transferidos de la aguja en la que Dios colocó los discos en el momento de la creación, a otra aguja, el templo y los brahmanes se convertirán en polvo y junto con ellos el mundo desaparecerá.”

## **Problema**

El problema anterior, aunque originalmente pensado para 64 discos, puede ser configurado para diferente cantidad de discos. Así, por ejemplo, si la cantidad de discos, a la que llamaremos n, es 2, la forma más rápida de dar solución siguiendo las reglas es la que se observa a la izquierda.

Para n=3, la solución paso a paso se observa en la gráfica de la derecha. Cada uno de estos estados puede ser codificado fácilmente con tres números que indiquen la cantidad de discos en cada torre. De esta manera, los cuatro estados para llegar del estado inicial al estado final en la solución con n=2 podrían verse así:
2 0 0 / 1 1 0 / 0 1 1 / 0 0 2

La codificación de cada uno de los estados de la solución del problema con n=3 sería:
3 0 0 / 2 0 1 / 1 1 1 / 1 2 0 / 0 2 1 / 1 1 1 / 1 0 2 / 0 0 3.

## **Enunciado**

### ***Entrada***

La primera línea indica m, la cantidad de problemas con diferentes discos que serán propuestos. Luego, siguen m líneas, cada una de las cuales indica la cantidad n de discos para los cuales se debe mostrar la codificación de cada uno de los estados por los que se pasa para dar solución al problema.
### ***Salida***

Por cada problema propuesto en la entrada se debe imprimir la lista de estados codificados para pasar del primer estado al final. Cada estado está separado por un salto de línea y cuando se pasa a la solución de otro problema hay un salto de línea adicional.

### ***Ejemplo***

Entrada

3
2
1
3

Salida

2 0 0/
1 1 0/
0 1 1/
0 0 2

1 0 0/
0 0 1

3 0 0/
2 0 1/
1 1 1/
1 2 0/
0 2 1/
1 1 1/
1 0 2/
0 0 3




