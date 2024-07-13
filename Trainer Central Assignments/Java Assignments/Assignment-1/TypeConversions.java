// 2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short

public class TypeConversions {

    public static String getType(Object obj) {
        return obj.getClass().getSimpleName(); //user defined method to find datatype
    }
    public static void main(String[] args) {
        System.out.println("Implicit Conversions : ");
        implicitConversions();
        System.out.println("_________________________________________________________________\nExplicit Conversions : ");
        explicitConversions();
        System.out.println("_________________________________________________________________\nCharacter and Integer Conversions : ");
        charAndIntConversions();
        System.out.println("_________________________________________________________________\nString and primitive-types Conversions : ");
        stringAndPrimitiveConversion();
        System.out.println("________________________________________________________________");

    }

    public static void implicitConversions(){
        //implicit conversions --> Widening
        byte byteVal = 57;
        System.out.println(byteVal+" is of type : "+getType(byteVal));

        short shortVal = byteVal; //auto converts byte value to SHORT and stores it
        System.out.println(shortVal+" is of type : "+getType(shortVal));
        
        int intVal = shortVal; //auto converts short value to INTEGER and stores it
        System.out.println(intVal+" is of type : "+getType(intVal));

        long longVal = intVal; //auto converts int value to LONG and stores it
        System.out.println(longVal+" is of type : "+getType(longVal));

        float floatVal = longVal; //auto converts long value to FLOAT and stores it
        System.out.println(floatVal+" is of type : "+getType(floatVal));

        double doubleVal = floatVal/7; //auto converts float value to DOUBLE and stores it
        System.out.println(doubleVal+" is of type : "+getType(doubleVal));
    }
    
    public static void explicitConversions(){
        // Explicit Conversions  --> Narrowing    
        //works as expected only if the numeric is in the range of type to be converted to else anomalies occur
        double doubleVal =9.78;
        System.out.println(doubleVal+" is of type : "+getType(doubleVal));

        float floatVal = (float) doubleVal; // we force change type to FLOAT
        System.out.println(floatVal+" is of type : "+getType(floatVal));

        long longVal = (long) floatVal; // to LONG
        System.out.println(longVal+" is of type : "+getType(longVal));

        int intVal = (int) longVal; // to INTEGER
        System.out.println(intVal+" is of type : "+getType(intVal));

        short shortVal = (short) intVal; // to SHORT
        System.out.println(shortVal+" is of type : "+getType(shortVal));

        byte byteVal = (byte) shortVal; // to BYTE
        System.out.println(byteVal+" is of type : "+getType(byteVal));

    }

    public static void charAndIntConversions(){
        //ASCII values play a huge role and links an INTEGER value to a CHARACTER
        char charVal = 'A';
        int intVal = charVal; //ASCII value of 'A' is assigned to intVal (here) Implicitly
        System.out.println("Implicitly: The corresponding value for "+ getType(charVal)+ ""+charVal+ "is : " + intVal+" of type-" + getType(intVal));

        intVal = 122; 
        charVal = (char)intVal; //ASCII character coresponding to 122 is assigned to charVal (here) Explicitly
        System.out.println("Explicitly: The corresponding value for "+ getType(intVal)+ ""+intVal+ "is : " + charVal+" of type-" + getType(charVal));

    }

    public static void stringAndPrimitiveConversion(){
        // Converting String to primitive types
        String intString = "123";
        String doubleString = "123.45";
        String booleanString = "true";

        int intValue = Integer.parseInt(intString);         // String to int
        System.out.println("String to int: " + intValue);
        double doubleValue = Double.parseDouble(doubleString); // String to double
        System.out.println("String to double: " + doubleValue);

        boolean booleanValue = Boolean.parseBoolean(booleanString); // String to boolean
        System.out.println("String to boolean: " + booleanValue);

        // Converting primitive types to String
        int intPrimitive = 456;
        double doublePrimitive = 456.78;
        boolean booleanPrimitive = false;

        String intToString = Integer.toString(intPrimitive);    // int to String
        System.out.println("int to String: " + intToString);

        String doubleToString = Double.toString(doublePrimitive); // double to String
        System.out.println("double to String: " + doubleToString);

        String booleanToString = Boolean.toString(booleanPrimitive); // boolean to String
        System.out.println("boolean to String: " + booleanToString);
    }


}
