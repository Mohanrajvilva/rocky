package interview;

public class RemoveChar {
	
	public static String removechar(String s,int p)
	{
	return s.substring(0,p) + s.substring(p + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s="Mohanraj";
		System.out.println(removechar(s,6));
	}
}
