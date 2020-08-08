
public class AustrelianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		CentralTraffic ct=new AustrelianTraffic();
		ct.greenGo();
		ct.redStop();
		ct.FlashYellow();
	}

	@Override
	public void greenGo() {
	System.out.println("Green Go implementation");
		
	}

	@Override
	public void redStop() {
	System.out.println("Red Stop implementation");
	}

	@Override
	public void FlashYellow() {
		System.out.println("Flash Yellow implementation");
		
	}

}
