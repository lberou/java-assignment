public class Casting {
    public static void main(String[] args){

        int integerNumber = 42;
        double doubleNumber = 123.456;

        // Implicit Typecast από int σε double (μικρότερος τύπος σε μεγαλύτερο)
        double intToDouble = integerNumber;

        // Casting από double σε int
        int doubleToInt = (int) doubleNumber;

        // Casting από int σε byte
        byte intToByte = (byte) integerNumber;

        // Casting από double σε float
        float doubleToFloat = (float)doubleNumber;

        System.out.println("Casting από int σε double " + intToDouble);
        System.out.println("Casting από double σε int " + doubleToInt);
        System.out.println("Casting από int σε byte " + intToByte);
        System.out.println("Casting από double σε float " + doubleToFloat);

    }
}
