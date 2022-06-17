class PrimitiveTypes {
    public void main() {
        System.out.println("\n \n");
        System.out.println("Java Programming Masterclass #1 - Primitive Types");
        System.out.println("------------------------------------------------- \n");

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("--> int 32 bits");
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximun Value = " + myMaxIntValue);
        System.out.println("\n");

        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Busted Maximun Value = " + (myMaxIntValue + 1));
        System.out.println("\n");

        int myMaxIntWithUnderlines = 2_147_483_647;
        System.out.println("Maximun Value w/ underlines = " + myMaxIntWithUnderlines);
        System.out.println("------------------------------------------------- \n");

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(":: byte 8 bits");
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximun Value = " + myMaxByteValue);
        System.out.println("------------------------------------------------- \n");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(":: short 16 bits");
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximun Value = " + myMaxShortValue);
        System.out.println("------------------------------------------------- \n");

        long myLongValue = 100L;
        System.out.println("put L at final of number - myLongValue = " + myLongValue + "\n");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(":: long 64 bits");
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximun Value = " + myMaxLongValue);
        System.out.println("------------------------------------------------- \n");

        float myFloatValue = 5.25f;
        System.out.println("put f at final of number - myFloatValue = " + myFloatValue + "\n");

        float myAnotherFloatValue = (float) 5.25;
        System.out.println("or put (float) at final of number - myAnotherFloatValue = " + myAnotherFloatValue + "\n");

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(":: float 32 bits");
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximun Value = " + myMaxFloatValue);
        System.out.println("------------------------------------------------- \n");

        double myDoubleValue = 5.25d;
        System.out.println("put d at final of number - myDoubleValue = " + myDoubleValue + "\n");

        double myAnotherDoubleValue = (double) 5.25;
        System.out.println("or put (double) before the number - myAnotherDoubleValue = " + myAnotherDoubleValue + "\n");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(":: double 64 bits");
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximun Value = " + myMaxDoubleValue);
        System.out.println("------------------------------------------------- \n");

        char myCharValue = 'C';
        System.out.println(":: char 16 bits (use single quotes)");
        System.out.println("Char Value = " + myCharValue);
        System.out.println("\n");

        System.out.println("www.rapidtables.com/code/text/unicode-characters.html ");
        char myAnotherCharValue = '\u04C1';
        System.out.println("Char Unicode Value = " + myAnotherCharValue);
        System.out.println("\n");

        System.out.println("emojidb.org/java-emojis ");
        char myEmojiCharValue = '☕';
        System.out.println("Emoji Char Value = " + myEmojiCharValue);
        System.out.println("------------------------------------------------- \n");

        boolean myBooleanValue = false;
        System.out.println("Boolean Value = " + myBooleanValue);
        System.out.println("------------------------------------------------- \n");

        System.out.println("String have the uppercase S, because String is not a primitive type, it's a Class");
        String myStringValue = "This is a string";
        System.out.println("String Value = " + myStringValue);
        System.out.println("------------------------------------------------- \n");

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Java Programming Masterclass #1 - Casting in Java");
        System.out.println("------------------------------------------------- \n");
        int myNewIntValue = (myMinIntValue / 2);
        System.out.println("myNewIntValue Value = " + myNewIntValue);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("myNewByteValue Value = " + myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("myNewShortValue Value = " + myNewShortValue);
        System.out.println("------------------------------------------------- \n");
    }
}