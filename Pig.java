class Pig implements Animal
{
	private String maType;
	private String maSound;
	public Pig(String atyp,String asoun){
     	maType= atyp;
     	maSound = asoun;
     }
     public Pig(){
     	maType="pig";
     	maSound="oink";
     }
     public String getSound(){return maSound;}     
     public String getType(){return maType;} 

}