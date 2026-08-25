Algoritmo CalculoPlatillo
	Definir personas Como Entero
	Definir precioPlatillo Como Real
	Definir presupuesto Como Real

	Escribir "Numero de personas: "
	Leer personas

	Si personas <= 0 Entonces
		Escribir "El numero de personas debe ser mayor a cero."
	SiNo
		Si personas <= 100 Entonces
			precioPlatillo <- 100
		SiNo
			Si personas <= 200 Entonces
				precioPlatillo <- 95
			SiNo
				Si personas <= 300 Entonces
					precioPlatillo <- 85
				SiNo
					precioPlatillo <- 75
				FinSi
			FinSi
		FinSi

		presupuesto <- personas * precioPlatillo

		Escribir "El precio sera de ", presupuesto, " con un precio de ", precioPlatillo, " para este numero de personas ", personas
	FinSi

FinAlgoritmo
