class myEMployee(){

	private String name;
	private int id;

	public void getName(){
		System.out.println("Employee name is: "+name);

	public void setName(String n){
		name = n;}

}




public class access_modifiers{
	public static void main(String[]args){
		myEMployee user1 = new myEMployee();
		user1.setName("krish dhiman");
		user1.getName();
	



	}}
