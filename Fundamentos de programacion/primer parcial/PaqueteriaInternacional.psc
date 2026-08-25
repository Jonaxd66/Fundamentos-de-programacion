Algoritmo PaqueteriaInternacional 
	
    Definir peso, tarifa, costo Como Real; 
	
    Definir zona Como Entero; 
	
	
	
    Escribir "Ingrese el peso del paquete en kg: "; 
	
    Leer peso; 
	
    Escribir "Ingrese la zona (1 a 5): "; 
	
    Leer zona; 
	
	
	
    Si peso > 5 Entonces 
		
        Escribir "Paquete rechazado"; 
		
    SiNo 
		
        Segun zona Hacer 
			
            1: tarifa <- 11; 
				
            2: tarifa <- 10; 
				
            3: tarifa <- 12; 
				
            4: tarifa <- 25; 
				
            5: tarifa <- 30; 
				
        FinSegun 
		
        costo <- (peso * 1000) * tarifa; 
		
        Escribir "Costo del envío: ", costo; 
		
    FinSi 
	
FinAlgoritmo