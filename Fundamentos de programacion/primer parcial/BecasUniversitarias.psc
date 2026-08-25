Algoritmo BecasUniversitarias 
	
    Definir edad Como Entero; 
	
    Definir promedio, beca Como Real; 
	
	
	
    Escribir "Ingrese la edad: "; 
	
    Leer edad; 
	
    Escribir "Ingrese el promedio: "; 
	
    Leer promedio; 
	
	
	
    Si edad > 18 Entonces 
		
        Si promedio >= 9 Entonces 
			
            beca <- 10000; 
			
            Escribir "Beca asignada: ", beca; 
			
        SiNo 
			
            Si promedio >= 7.5 Entonces 
				
                beca <- 8000; 
				
                Escribir "Beca asignada: ", beca; 
				
            SiNo 
				
                Si promedio >= 6 Entonces 
					
                    beca <- 5000; 
					
                    Escribir "Beca asignada: ", beca; 
					
                SiNo 
					
                    Escribir "Carta de invitación"; 
					
                FinSi 
				
            FinSi 
			
        FinSi 
		
    SiNo 
		
        Si promedio >= 9 Entonces 
			
            beca <- 8000; 
			
            Escribir "Beca asignada: ", beca; 
			
        SiNo 
			
            Si promedio >= 8 Entonces 
				
                beca <- 6000; 
				
                Escribir "Beca asignada: ", beca; 
				
            SiNo 
				
                Si promedio >= 6 Entonces 
					
                    beca <- 4000; 
					
                    Escribir "Beca asignada: ", beca; 
					
                SiNo 
					
                    Escribir "Carta de invitación"; 
					
                FinSi 
				
            FinSi 
			
        FinSi 
		
    FinSi 
	
FinAlgoritmo