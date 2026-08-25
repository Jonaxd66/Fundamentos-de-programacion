Algoritmo Estacionamiento 
	
    Definir horas, total Como Real; 
	
	
	
    Escribir "Ingrese las horas de estacionamiento: "; 
	
    Leer horas; 
	
	
	
    Si horas <= 2 Entonces 
		
        total <- horas * 30; 
		
    SiNo 
		
        Si horas <= 5 Entonces 
			
            total <- (2 * 30) + (horas - 2) * 25; 
			
        SiNo 
			
            Si horas <= 10 Entonces 
				
                total <- (2 * 30) + (3 * 25) + (horas - 5) * 20; 
				
            SiNo 
				
                total <- 380; 
				
            FinSi 
			
        FinSi 
		
    FinSi 
	
	
	
    Escribir "Total a pagar: ", total; 
	
FinAlgoritmo 