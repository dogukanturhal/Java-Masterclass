public class App {
    public static void main(String[] args) throws Exception {

        // primitive types
        int num = 5;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        char myChar = 'D';
        char myUnicode = '\u00A9'; // unicode for ©

        boolean trueOrFalse = true;// can be false and 1 for true 0 for false
        System.out.println(myUnicode);
        long literalValue = 24563548632L; // L for long decleration
        float literalFloat = 5.25f;// f for float decleration

        double literalDouble = 5.32d;// d for double decleration

        String myString = "Welcome to java masterclass";

        System.out.println("My first num");
        System.out.println(myMinValue);
        System.out.println(myMaxValue);
        System.out.println(myMinByte);
        System.out.println(myMaxByte);
        System.out.println(myMinShort);
        System.out.println(myMaxShort);
        System.out.println(myMinLong);
        System.out.println(myMaxLong);
        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);
        System.out.println(myMinDouble);
        System.out.println(myMaxDouble);
        // if you try to break min or max values overflow or underflow will come up :(
        System.out.println(myString);
        // Casting
        byte myMinByteValue = (byte) (myMinByte / 2); // Casting value to byte
        short myMinShortValue = (short) (myMinShort / 2); // Casting value to short
        float literalFloatCasting = (float) 5.25;// Casting to float

    }
}
