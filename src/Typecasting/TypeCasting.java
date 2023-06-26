package Typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 10;
        double myDouble = myInt; 
        System.out.println("Implicit casting: int to double");
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        double myDouble2 = 7.5;
        int myInt2 = (int) myDouble2;
        System.out.println("\nExplicit casting: double to int");
        System.out.println("myDouble2: " + myDouble2);
        System.out.println("myInt2: " + myInt2);
    }

	}


