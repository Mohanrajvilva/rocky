package interview;

public class Ptring {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub\
		String s="Mohanraj";
		String k="";
		//System.out.println(s.compareTo(k));
		int i=0;
		while(true)
		{
			try {
				s.charAt(i);
				i++;
			}
			catch(Exception e)
			{
				System.out.println(i);
				break;
			}
		}
		
		

	}

}
