class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String myName;
public NamedCow(String type,String sound,String name){
		myType=type;
		mySound=sound;
		myName=name;
}
public NamedCow()
{
myType="cow";
mySound="moo";
myName="John Cena";
}
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     public String getName(){return myName;} 
}