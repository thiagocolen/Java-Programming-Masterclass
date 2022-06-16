class Main {  
  public static void main(String args[]) { 
    System.out.println("\n \n"); 
    System.out.println("Java Programming Masterclass #1 - Primitive Types"); 
    System.out.println("------------------------------------------------- \n"); 
    
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("--> int 32 bits"); 
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximun Value = " + myMaxIntValue);
    System.out.println("------------------------------------------------- \n"); 
    
    // System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
    // System.out.println("Busted Maximun Value = " + (myMaxIntValue + 1));
    // System.out.println("------------------------------------------------- \n"); 
    
    // int myMaxIntWithUnderlines = 2_147_483_647;
    // System.out.println("Maximun Value w/ underlines = " + myMaxIntWithUnderlines);
    // System.out.println("------------------------------------------------- \n"); 
    
    // byte myMinByteValue = Byte.MIN_VALUE;
    // byte myMaxByteValue = Byte.MAX_VALUE;
    // System.out.println("--> byte 8 bits"); 
    // System.out.println("Byte Minimum Value = " + myMinByteValue);
    // System.out.println("Byte Maximun Value = " + myMaxByteValue);
    // System.out.println("------------------------------------------------- \n"); 
   
    // short myMinShortValue = Short.MIN_VALUE;
    // short myMaxShortValue = Short.MAX_VALUE;
    // System.out.println("--> short 16 bits"); 
    // System.out.println("Short Minimum Value = " + myMinShortValue);
    // System.out.println("Short Maximun Value = " + myMaxShortValue);
    // System.out.println("------------------------------------------------- \n"); 

    // long myLongValue = 100L;
    // System.out.println("put L at final of number - myLongValue = " + myLongValue + "\n");
    // long myMinLongValue = Long.MIN_VALUE;
    // long myMaxLongValue = Long.MAX_VALUE;
    // System.out.println("--> long 64 bits"); 
    // System.out.println("Long Minimum Value = " + myMinLongValue);
    // System.out.println("Long Maximun Value = " + myMaxLongValue);
    // System.out.println("------------------------------------------------- \n"); 
    
    System.out.println("Casting in Java \n"); 
    int myTotal = (myMaxIntValue * 2);
    System.out.println("myTotal Value = " + myTotal);
    
    System.out.println("------------------------------------------------- \n"); 
    
  } 
} 