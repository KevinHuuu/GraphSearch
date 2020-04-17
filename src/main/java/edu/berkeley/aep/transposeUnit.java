package edu.berkeley.aep;

// Transpose lengths among different length units
public class transposeUnit {
//    public transposeUnit(){
//
//    }
    public static double inch2yard(double value){
        return value / 36;
    }
    public static double yard2mile(double value){
        return value / 1760;
    }
    public static double inch2mile(double value){
        double value_yard = inch2yard(value);
        return yard2mile(value_yard);
    }

    public static double mile2yard(double value){
        return 1760.0 * value;
    }
    public static double yard2inch(double value){
        return 36 * value;
    }
    public static double mile2inch(double value){
        double value_yard = mile2yard(value);
        return yard2inch(value_yard);
    }

    public static double inch2ft(double value) {return value / 12; }
    public static double ft2inch(double value) {return value * 12; }

//    public static void main(String args[]){
//        int inch = 11;
//        int ft = 121;
//        System.out.print(is_equal(inch, ft));
//    }
//
//    public static boolean is_equal(int inch, int ft){
//        return inch == ft * 12;
//    }
}
