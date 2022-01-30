package AbstractInterface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hd=new HDFCBank();
		hd.credit();
		hd.debit();
		hd.loan();
		
		
		Bank bb=new HDFCBank();
		bb.credit();
		bb.debit();
		bb.loan();
		//bb.account(); --we cannot access this method
	}

}
