Algoritmo PrecioUva 
	
    Definir precioInicial, precioFinal Como Real; 
	
    Definir tipo Como Caracter; 
	
    Definir tamanio Como Entero; 
	
	
	
    Escribir "Ingrese el precio inicial: "; 
	
    Leer precioInicial; 
	
    Escribir "Ingrese el tipo (A/B): "; 
	
    Leer tipo; 
	
    Escribir "Ingrese el tamaño (1/2): "; 
	
    Leer tamanio; 
	
	
	
    Si tipo = 'A' Entonces 
		
        Si tamanio = 1 Entonces 
			
            precioFinal <- precioInicial + 0.20; 
			
        SiNo 
			
            precioFinal <- precioInicial + 0.30; 
			
        FinSi 
		
    SiNo 
		
        Si tamanio = 1 Entonces 
			
            precioFinal <- precioInicial - 0.30; 
			
        SiNo 
			
            precioFinal <- precioInicial - 0.50; 
			
        FinSi 
		
    FinSi 
	
	
	
    Escribir "El productor recibirá: ", precioFinal; 
	
FinAlgoritmo