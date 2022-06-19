public class Operators {
    public void main() {
        System.out.println("\n \n");
        System.out.println("Java Programming Masterclass #2 - Operators");
        System.out.println("------------------------------------------------- \n");

        int additiveResult = 1 + 2;
        System.out.println("Additive operator: 1 + 2 = " + additiveResult);

        int subtractionResult = 10 - 3;
        System.out.println("Subtraction operator: 10 - 3 = " + subtractionResult);

        int multiplicationResult = 3 * 7;
        System.out.println("Multiplication operator: 3 * 7 = " + multiplicationResult);

        int divisionResult = 25 / 5;
        System.out.println("Division operator: 25 / 5 = " + divisionResult);

        int remainderResult = 10 % 3;
        System.out.println("Remainder operator: 10 % 3 = " + remainderResult);

        System.out.println("\n ------------------------------------- \n");

        int incrementResult = 10;
        incrementResult++;
        System.out.println("Increment operator: incrementResult = 10 | incrementResult++ : " + incrementResult);

        int decrementResult = 10;
        decrementResult--;
        System.out.println("Decrement operator: decrementResult = 10 | decrementResult-- : " + decrementResult);

        System.out.println("\n ------------------------------------- \n");

        int abbreviatingAdditive = 10;
        abbreviatingAdditive += 1;
        System.out.println("Abbreviating Additive operator: abbreviatingAdditive = 10 | abbreviatingAdditive += 1 : " + abbreviatingAdditive);

        int abbreviatingSubtraction = 10;
        abbreviatingSubtraction -= 1;
        System.out.println("Abbreviating Subtraction operator: abbreviatingSubtraction = 10 | abbreviatingSubtraction -= 1 : " + abbreviatingSubtraction);

        int abbreviatingMultiplication = 10;
        abbreviatingMultiplication *= 2;
        System.out.println("Abbreviating Multiplication operator: abbreviatingMultiplication = 10 | abbreviatingMultiplication *= 2 : " + abbreviatingMultiplication);

        int abbreviatingDivision = 10;
        abbreviatingDivision /= 2;
        System.out.println("Abbreviating Division operator: abbreviatingDivision = 10 | abbreviatingDivision /= 2 : " + abbreviatingDivision);

        System.out.println("\n ------------------------------------- \n");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien. Just this line is executed without using a code block '{ some code }'");


        if (isAlien == false) {
            System.out.println("With code block '{ some code }' this line is executed,");
            System.out.println("and this line is executed too.");
        }

        boolean wasAlien = isAlien ? true : false;
        System.out.println("wasAlien: " + wasAlien);

        System.out.println("\n ------------------------------------- \n");

        System.out.println("Java Operator Precedence Table");
        System.out.println("www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html ");

        System.out.println("\n ------------------------------------- \n");

        System.out.println("Operator Challenge");

        double myDoubleValue = 20.00d;
        double myAnotherDoubleValue = 80.00d;
        double myResult = (myDoubleValue + myAnotherDoubleValue) * 100.00d;
        double myRemainderResult = myResult % 40.00d;
        boolean myBooleanValue = (myRemainderResult == 0) ? true : false;
        System.out.println("Final result: " + myBooleanValue);
        if (!myBooleanValue) {
            System.out.println("Got some remainder");
        }

        System.out.println("\n ------------------------------------- \n");

        System.out.println("Java Docs");
        System.out.println("docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html");
    }
}
