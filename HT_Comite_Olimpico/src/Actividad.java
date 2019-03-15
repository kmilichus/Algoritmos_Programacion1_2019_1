public class Actividad{


	//Punto 1
	
	//En la clase SedeOlimpica
	
	public int cantidadDeportistasDelegacionAnfitriona (){
		
		int total = 0;
		boolean encontrada = false;
		
		for(int i=0; i<CANTIDAD_DELEGACIONES && !encontrada; i++){
			
			if(delegaciones[i]!=null){
				
				if(paisSede.equals(delegaciones[i].darPais())){
					total = delegaciones[i].contarDeportistasDelegacion();
					encontrada = true;
				}
			}
			
		}
		return total;
	}
	
	//Punto 2
	
	//En la clase SedeOlimpica

	public ArrayList<Entrenador> listadoDeEntrenadoresDelegacionesAsiaticas(){
		
		ArrayList<Entrenador> lista = new ArrayList<Entrenador>();
		
		int i =0;
		
		while(i<CANTIDAD_DELEGACIONES){
			
			if(delegaciones[i]!=null && delegaciones[i].esContinente(Delegacion.ASIA) && delegaciones[i].darEntrenador().tieneMasDeDiezAnhosExp()){
				lista.add(delegaciones[i].darEntrenador());
			}
			
			++i;
		}
		
		
		return lista;
	}
	
	//En la clase Delegacion
	
	public boolean esContinente(char conti){
		return continente == conti;
	}


	//En la clase Entrenador
	
	public boolean tieneMasDeDiezAnhosExp(){
		return anhosExperiencia>10;
	}
	
	
	//Punto 3
	
	//Sede Olimpica
	
	public Competencia competenciaConMenorCantidadDeDeportistasDebutantes(){
		Competencia menor = null;
		
		for(int j = 0; j< CANTIDAD_COMPETENCIAS; ++j){
			
			if(compentencias[j]!=null){
				if(menor==null){
					menor = competencias[j];
				}else if (competencias[j].contarDebutantes() < menor.contarDebutantes()){
					menor = compentencias[j];
				}
				
			}
		}
		
		return menor; 
	}
	
	
	//Competencia
	
	public int contarDebutantes(){
		
		int total = 0;
		
		for(int a = 0; a< competidores.size(); a++){
			if(competidores.get(a).darEsDebutante()){
				total++;
			}
		}
		
		return total;
	}



}