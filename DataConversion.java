public class DataConversion {
    public static void main(String[] args) {
        
    // Convert the string strFloat into a float.

    String strFloat = "374.25";
    float floatValue = Float.parseFloat(strFloat); // assign here

    // Convert the string strInt into an integer.

    String strInt = "1250";
    int intValue = Integer.parseInt(strInt); // assign here

    // Convert the float floatNum into an integer.

    float floatNum = 56.715f;
    int intFromFloat = (int) floatNum; // assign here

    // Convert the integer intNum into a float.

    int intNum = 1500;
    float floatFromInt = intNum; // assign here

    // Convert the double doubleNum into a string.

    double doubleNum = 3.14159265;
    String strValue = String.valueOf(doubleNum); // assign here



    }

}