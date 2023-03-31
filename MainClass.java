package Loops;

public class MainClass {

	public static void main(String[] args) {
		
		TableOf2  Table = new TableOf2();
		Table.number =1;
		//Table.printMultiples();	
		
		System.out.println("--------------   while loop ends here ----------------");

        TableOf5 T = new TableOf5();
        T.start= 1;
        T.end= 10;
       // T.tableof5();	
        
        
        AtmPin Atm = new AtmPin();
        Atm.checkPinIsCorrect();
        
        
	}

}
