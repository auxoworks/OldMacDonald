class Chick implements Animal 
{     
	private String mType;
	private String mSound;
	private String mSound2;
	public Chick(String typ,String soun,String soun2){
     	mType= typ;
     	mSound = soun;
     	mSound2=soun2;
     }
     public Chick(){
     	mType="chick";
     	mSound=getSound();
     	mSound2=getSound();
     }
     public String getSound(){
     	if(Math.random()>0.5)
     	{
     		return mSound2;
     	}     
     	else
     		return mSound;
     }
     public String getType(){return mType;} 
}