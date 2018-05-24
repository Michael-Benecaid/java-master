package scope;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String privateVar = "This is private to main()";
		ScopeCheck scopeCheck = new ScopeCheck();
		System.out.println("ScopeCheck privateVar is " + scopeCheck.getPrivateVar() );
		System.out.println(privateVar);
		scopeCheck.timesTwo();
		System.out.println("**************************");
		ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
		innerClass.timesTwo();
	}

}
