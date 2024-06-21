package selenium;

public class ParametrizedConstructor {
		int x; String name;
		
		ParametrizedConstructor(int a, String Value){
			x=a;
			name=Value;
		}
		public void show() {
			System.out.println(x+" "+name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrizedConstructor c =new ParametrizedConstructor(10,"Gayatri");
		c.show();
		
	}

}
