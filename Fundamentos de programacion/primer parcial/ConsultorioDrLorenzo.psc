Algoritmo ConsultorioDrLorenzo 
	
    Definir numeroCita, i, monto Como Entero; 
	
    Definir acumulado, montoCitaActual Como Real; 
	
	
	
    Escribir "Ingrese el número de cita: "; 
	
    Leer numeroCita; 
	
	
	
    acumulado <- 0; 
	
	
	
    Para i <- 1 Hasta numeroCita Con Paso 1 Hacer 
		
        Si i <= 3 Entonces 
			
            monto <- 900; 
			
        SiNo 
			
            Si i <= 5 Entonces 
				
                monto <- 800; 
				
            SiNo 
				
                Si i <= 8 Entonces 
					
                    monto <- 600; 
					
                SiNo 
					
                    monto <- 500; 
					
                FinSi 
				
            FinSi 
			
        FinSi 
		
        acumulado <- acumulado + monto; 
		
    FinPara 
	
	
	
    montoCitaActual <- monto; 
	
	
	
    Escribir "Pago de la cita actual: ", montoCitaActual; 
	
    Escribir "Total pagado en el tratamiento: ", acumulado; 
	
FinAlgoritmo 