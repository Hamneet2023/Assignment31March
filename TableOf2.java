package Loops;

public class TableOf2 {
	int number;

	void printMultiples() {
		int finalNumber = 10;
		//while loop check  the condition 11 times  10 times its true but 11th time its get false because 11<=10
		while (number <= finalNumber) {
			int tableResult = number * 2;
			System.out.println(+tableResult);
			number++;
		}
	}

}
