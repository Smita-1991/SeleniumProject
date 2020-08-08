
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="MADAM";
		String Reverse="";
		
		for(int i=S.length()-1; i>=0; i--){
			
			Reverse+=S.charAt(i);
		
		}
		
		
		System.out.println(Reverse);
		
		if(S.equals(Reverse)){
			System.out.println("String is pallidrome");
		}else{
			System.out.println("String is not pallidrome");
		}
		
		
		
		//Output=atimS
	}

}
