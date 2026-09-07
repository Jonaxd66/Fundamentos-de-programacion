Algoritmo PatronesAsteriscos
	Definir n, i, j Como Entero
	
	Escribir "Ingrese el numero de lineas: "
	Leer n
	Escribir ""
	
	// Patron 1: Rectangulo
	Escribir "Patron 1: Rectangulo"
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Para j <- 1 Hasta n Con Paso 1 Hacer
			Escribir "*  " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	// Patron 2: Piramide invertida
	Escribir "Patron 2: Piramide invertida"
	Para i <- n Hasta 1 Con Paso -1 Hacer
		Para j <- 1 Hasta (2*i - 1) Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	// Patron 3: Triangulo rectangulo
	Escribir "Patron 3: Triangulo rectangulo"
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Para j <- 1 Hasta (2*i - 1) Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo