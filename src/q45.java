
public class q45 {
    void readCard(int cardNo) throws Exception{
    	System.out.println("reading card");
    }
    void checkCard(int cardNo) throws RuntimeException {
    	System.out.println("checking card") ;
    }
	
	
	public static void main(String[] args) throws Exception {
		q45 q = new q45();
		int cardNo =12344;
		q.checkCard(cardNo);
		q.readCard(cardNo);
	}
}
