public class Seguimiento8{
	
	
	// Clase Company
	
	private Article findMinFragileArticleGoingSouth(){
		
		Article art = null;
		
			for(int i = 0; i<trucks.length ; i++){
				
				if(trucks[i]!=null && trucks[i].getZone().equals(Truck.SOUTH)){
					
					Article a = trucks[i].findMinArticleFragile();
					if(art==null){
						art = a;
					}else if(a!=null && a.getWeigth() < art.getWeigth())){
						art = a;
					}
					
				}
				
			}
		
		
		return art;
	}
	
	
	
	//Clase Truck
	
	public Article findMinArticleFragile(){
		Article a = null;
		
		for(int i = 0; i < MAX_ARTICLE; i++){
			
			if(articles[i]!=null && articles[i].isFragile()){
				
				if(a==null){
					a = articles[i];
				}else if( articles[i].getWeigth() < a.getWeigth()){
					a = articles[i];
				}
				
			}
		}
		
		return a;
	}
	
	
	

}