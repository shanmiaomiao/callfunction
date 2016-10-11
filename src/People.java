
public class People {
	 String  name;
	 static int age;
	 public  People( String  namep){
		 name = namep;
	}
	 public void setAge(int  agep){
		 age = agep;
	 }
	 public  int  getAge(){
		 return  age;
	 }
	 public static void main(String[] args){
		 People  p = new  People (" Mike" );
		 p.setAge(21);
		 int a =0;
		 a = p.getAge();
		 //p.getAge();
		 
		 System.out.println(a);
	 }
}
