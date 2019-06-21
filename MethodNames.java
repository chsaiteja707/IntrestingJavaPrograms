import java.lang.reflect.*;
class MethodNames
{
	public static void main(String A[]) throws Exception
	{
		Class cls=Class.forName("MethodNames");
		Method m[]=cls.getDeclaredMethods();
		int count=0;
		for(Method k:m){
			String method=k.getName();
			System.out.println(method);
			count++;
		}
		System.out.println(count);
	}
	public void hai()	
	{
		System.out.println("hai");
	}
	public void hello()
	{
		System.out.println("hello");
	}
}