Algoritmo sin_titulo
	Algoritmo ParImparNeutro 
		
		Definir n Como Entero; 
		
		Definir resultado Como Cadena; 
		
		
		
		Escribir "Ingrese un número entero: "; 
		
		Leer n; 
		
		
		
		Si n = 0 Entonces 
			
			resultado <- "Neutro"; 
			
		SiNo 
			
			Si n MOD 2 = 0 Entonces 
				
				resultado <- "Par"; 
				
			SiNo 
				
				resultado <- "Impar"; 
				
			FinSi 
			
		FinSi 
		
		
		
		Escribir "El número es: ", resultado; 
		
FinAlgoritmo
