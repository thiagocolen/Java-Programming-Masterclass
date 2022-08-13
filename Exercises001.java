public class Exercises001 {
    public void main() {

        System.out.println("\n \n");
        System.out.println("Java Programming Masterclass #5 - Exercises 001");
        System.out.println("------------------------------------------------- \n");
        String exercise001_01Text = "### Positive, Negative or Zero \n" +
                "---------------------------- \n" +
                "Write a method called checkNumber with an int parameter number. \n" +
                "The method should not return any value, and it needs to print out: \n" +
                " 'positive' if the parameter number is > 0 \n" +
                " 'negative' if the parameter number is < 0 \n" +
                " 'zero' if the parameter number is equal to 0 \n" +
                " \n" +
                " NOTE: The checkNumber method needs to be defined as public static\n";
        System.out.println(exercise001_01Text);
        System.out.println("------------------------------------------------- \n");

        checkNumber(163);
        checkNumber(-134);
        checkNumber(0);

        System.out.println("\n------------------------------------------------- \n");
        String exercise001_02Text = "### Speed Converter\n" +
                "---------------------------- \n" +
                " 1. Write a method called toMilesPerHour that has 1 parameter of type double with the name \n" +
                " kilometersPerHour. This method needs to return the rounded value of the calculation of type long. \n" +
                " If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 \n" +
                " to indicate an invalid value.\n" +
                " Otherwise, if is positive, calculate the value of miles per hour, round it and return it. \n" +
                " \n" +
                " NOTE: For conversion and rounding use method Math.round to round the number of calculated miles per hour(double). \n" +
                " The method round returns long. \n" +
                " How to use the method round an how it works? \n" +
                " The Math.round() is a build-in math method which returns the closest long to the argument. \n" +
                " The result is rounded to an integer y adding 1/2, taking the floor of the result after adding 1/2,\n" +
                " and typecasting the result to type long. The method returns the value of the argument rounded to\n" +
                " the nearest int value.\n" +
                " \n" +
                " NOTE: 1 mile per hour is 1.609 kilometers per hour.\n" +
                " \n" +
                " 2. Write another method called printConversion with 1 parameter of type double with the name kilometerPerHour.\n" +
                " This method should not return anything(void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.\n" +
                " Then it needs to print a message in the format 'XX km/h = YY mi/h'. \n" +
                " XX represents the original value kilometersPerHour.\n" +
                " YY represents the rounded milesPerHour from the kilometersPerHour parameter.\n" +
                " If the parameter kilometersPerHour is < 0 then print the next 'Invalid Value'\n";
        System.out.println(exercise001_02Text);
        System.out.println("------------------------------------------------- \n");

        System.out.println("Let's test the method toMilesPerHour()! \n");
        boolean test1 = toMilesPerHourShouldReturn(1.5, 1);
        System.out.println("toMilesPerHour(1.5) should return value 1: " + test1);

        boolean test2 = toMilesPerHourShouldReturn(10.25, 6);
        System.out.println("toMilesPerHour(10.25) should return value 6: " + test2);

        boolean test3 = toMilesPerHourShouldReturn(-5.6, -1);
        System.out.println("toMilesPerHour(-5.6) should return value -1: " + test3);

        boolean test4 = toMilesPerHourShouldReturn(25.42, 16);
        System.out.println("toMilesPerHour(25.42) should return value 16: " + test4);

        boolean test5 = toMilesPerHourShouldReturn(75.114, 47);
        System.out.println("toMilesPerHour(75.114) should return value 47: " + test5);

        System.out.println("------------------------------------------------- \n");

        System.out.println("Calling method printConversion() \n");
        printConversion(48.609);
        printConversion(-10);
        printConversion(0);
        System.out.println("------------------------------------------------- \n");

        System.out.println("\n------------------------------------------------- \n");
        String exercise001_03Text = "### MegaBytes Converter\n" +
                "---------------------------- \n" +
                " Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes. \n" +
                " The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.\n" +
                " Then it needs to print a message in the format \"XX KB = YY MB and ZZ KB\".\n" +
                " XX represents the original value kiloBytes. \n" +
                " YY represents the calculated megabytes. \n" +
                " ZZ represents the calculated remaining kilobytes. \n" +
                " For example, when the parameter kiloBytes is 2500 it needs to print \"2500 KB = 2 MB and 452 KB\" \n" +
                " If the parameter kiloBytes is less than 0 then print the text \"Invalid Value\". \n" +
                " TIP: 1 MB = 1024 KB \n";
        System.out.println(exercise001_03Text);
        System.out.println("------------------------------------------------- \n");
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        System.out.println("------------------------------------------------- \n");

        String exercise001_04Text = "### Barking Dog\n" +
                "---------------------------- \n" +
                " We have a dog that likes to bark. We need to wake up if the dog is barking at night! \n" +
                " Write a method shouldWakeUp that has 2 parameters. \n" +
                " 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking. \n" +
                " 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23. \n" +
                " We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.  \n" +
                " In all other cases return false. \n" +
                " If the hourOfDay parameter is less than 0 or greater than 23 return false. \n";

        System.out.println(exercise001_04Text);
        System.out.println("------------------------------------------------- \n");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("------------------------------------------------- \n");

        String exercise001_05Text = "### Leap Year Calculator\n" +
                "---------------------------- \n" +
                " Write a method isLeapYear with a parameter of type int named year.\n" +
                " The parameter needs to be greater than or equal to 1 and less than or equal to 9999.\n" +
                " If the parameter is not in that range return false.\n" +
                " Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.\n" +
                " \n" +
                " To determine whether a year is a leap year, follow these steps: \n" +
                " 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.\n" +
                " 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.\n" +
                " 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.\n" +
                " 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.\n" +
                " 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.\n" +
                " \n" +
                " The following years are not leap years:\n" +
                " 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600\n" +
                " This is because they are evenly divisible by 100 but not by 400.\n" +
                " \n" +
                " The following years are leap years:\n" +
                " 1600, 2000, 2400\n" +
                " This is because they are evenly divisible by both 100 and 400.\n" +
                " \n";

        System.out.println(exercise001_05Text);
        System.out.println("------------------------------------------------- \n");
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));
        System.out.println("------------------------------------------------- \n");

        String exercise001_06Text = "### Decimal Comparator\n" +
                "---------------------------- \n" +
                " Write a method areEqualByThreeDecimalPlaces with two parameters of type double.\n" +
                " The method should return boolean and it needs to return true if two double numbers" +
                " are the same up to three decimal places. Otherwise, return false.\n";

        System.out.println(exercise001_06Text);
        System.out.println("------------------------------------------------- \n");

        System.out.println("areEqualByThreeDecimalPlaces(-3.1756, -3.175); " +
                "→ should return true since numbers are equal up to 3 decimal places.");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println("areEqualByThreeDecimalPlaces(3.175, 3.176); " +
                "→ should return false since numbers are not equal up to 3 decimal places");
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

        System.out.println("areEqualByThreeDecimalPlaces(3.0, 3.0); " +
                "→ should return true since numbers are equal up to 3 decimal places.");
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("areEqualByThreeDecimalPlaces(-3.123, 3.123); " +
                "→ should return false since numbers are not equal up to 3 decimal places.");
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println("areEqualByThreeDecimalPlaces(4.0, 5.0); " +
                "→ should return true since numbers are not equal up to 3 decimal places.");
        System.out.println(areEqualByThreeDecimalPlaces(4.0, 5.0));

        System.out.println("------------------------------------------------- \n");


        String exercise001_07Text = "### Equal Sum Checker\n" +
                "---------------------------- \n" +
                " Write a method hasEqualSum with 3 parameters of type int.\n" +
                "\n" +
                " The method should return boolean and it needs to return true if the sum of the first " +
                " and second parameter is equal to the third parameter. Otherwise, return false.\n";

        System.out.println(exercise001_07Text);
        System.out.println("------------------------------------------------- \n");

        System.out.println("hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1: " + hasEqualSum(1, 1 ,1));
        System.out.println("hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2: " + hasEqualSum(1, 1, 2));
        System.out.println("hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0: " + hasEqualSum(1, -1, 0));

        System.out.println("------------------------------------------------- \n");

        String exercise001_08Text = "### Teen Number Checker\n" +
                "---------------------------- \n" +
                " We'll say that a number is \"teen\" if it is in the range 13 -19 (inclusive).\n" +
                " Write a method named hasTeen with 3 parameters of type int.\n" +
                " The method should return boolean and it needs to return true if one of the parameters " +
                " is in range 13(inclusive) - 19 (inclusive). Otherwise return false.\n" +
                " Write another method named isTeen with 1 parameter of type int.\n" +
                " The method should return boolean and it needs to return true " +
                " if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.";

        System.out.println(exercise001_08Text);
        System.out.println("------------------------------------------------- \n");

        System.out.println("hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19: " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19: " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19: " + hasTeen(22, 23, 34));

        System.out.println("isTeen(9);  should return false since 9 is in not range 13 - 19: " + isTeen(9));
        System.out.println("isTeen(13);  should return true since 13 is in range 13 - 19: " + isTeen(13));

        System.out.println("------------------------------------------------- \n");
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long result = Math.round(kilometersPerHour / 1.609);
        return result;
    }

    public static boolean toMilesPerHourShouldReturn(double inputValue, int outputValue) {
        long result = toMilesPerHour(inputValue);

        if (result == outputValue) {
            return true;
        } else {
            return false;
        }
    }

    public static void printConversion(double kilometerPerHour) {
        long milesPerHour = toMilesPerHour(kilometerPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = Math.round(kiloBytes / 1024);
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false) return false;
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        if (hourOfDay >= 8 && hourOfDay <= 22) return false;
        return true;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        int remainingOfFour = year % 4;
        if (remainingOfFour != 0) return false;

        int remainingOfHundred = year % 100;
        if (remainingOfHundred != 0) return true;

        int remainingOfFourHundred = year % 400;
        if (remainingOfFourHundred != 0) return false;

        return true;
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        int transformedNumberOne = (int)(numberOne * 1000);
        int transformedNumberTwo = (int)(numberTwo * 1000);
        if (transformedNumberOne == transformedNumberTwo) return true;
        return false;
    }

    public static boolean hasEqualSum(int int1, int int2, int int3) {
        if (int1 + int2 == int3) return true;
        return false;
    }

    public static boolean hasTeen(int int1, int int2, int int3) {
        if (isTeen(int1) || isTeen(int2) || isTeen(int3)) return true;
        return false;
    }

    public static boolean isTeen(int int1) {
        if (int1 >= 13 && int1 <= 19) return true;
        return false;
    }

}
