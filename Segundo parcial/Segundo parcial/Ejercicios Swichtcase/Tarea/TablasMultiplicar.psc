Algoritmo TablasMultiplicar
	Definir n, i, resultado Como Entero
	
	Repetir
		Escribir "Ingrese un numero (0 para salir): "
		Leer n
		
		Si n <> 0 Entonces
			Escribir "Tabla del ", n, ":"
			Para i <- 1 Hasta 10 Con Paso 1 Hacer
				resultado <- n * i
				Escribir n, " x ", i, " = ", resultado
			FinPara
			Escribir ""
		FinSi
	Hasta Que n = 0
	
	Escribir "Programa terminado."
FinAlgoritmo