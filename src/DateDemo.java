import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println("Date is: "+d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");
		sdf.format(d);
		System.out.println(sdf.format(d));
		
		
		
	}

}
