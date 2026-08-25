Algoritmo MultaVelocidad 
	
    Definir velocidad, limiteBajo, limiteAlto, resultado Como Entero; 
	
    Definir esCumpleanios Como Logico; 
	
	
	
    limiteBajo <- 60; 
	
    limiteAlto <- 80; 
	
	
	
    Escribir "Ingrese la velocidad: "; 
	
    Leer velocidad; 
	
    Escribir "¿Es su cumpleaños? (Verdadero/Falso): "; 
	
    Leer esCumpleanios; 
	
	
	
    Si esCumpleanios Entonces 
		
        limiteBajo <- limiteBajo * 5; 
		
        limiteAlto <- limiteAlto * 5; 
		
    FinSi 
	
	
	
    Si velocidad <= limiteBajo Entonces 
		
        resultado <- 0; 
		
    SiNo 
		
        Si velocidad <= limiteAlto Entonces 
			
            resultado <- 1; 
			
        SiNo 
			
            resultado <- 2; 
			
        FinSi 
		
    FinSi 
	Escribir "Resultado: ", resultado; 
	
FinAlgoritmo 