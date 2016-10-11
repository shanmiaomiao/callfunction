
public class MAX {
	
	public static void main(String[] args){
      int x = 3 ;
      int y =5 ;
      int c = 0;
      MAX m = new MAX();
      c = m.max(x,y );
      System.out.print("the max is ="+c);
      
	}
	 int max(int a, int b){
		 int iMax = 0;
		if ( a > b){
			iMax = a;
		}
		else if (a < b){
			iMax = b;
		}
		else {
			iMax = a;
			System.out.println("the two numbers is equal");
		}
		return  iMax;
	}
	
}
