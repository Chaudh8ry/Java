class typeConversion{
    public static void main(String args[]){
        // byte b = 127;
        // int a = b;
        // System.out.println(a); // 127
    
        // int x = 17;
        // byte y = (byte)x;
        // System.out.println(y);

        // Out of Range
        int g = 257;
        byte h = (byte)g;
        System.out.println(h); // 1
        // 257 % 256(range of byte -128 to 127)
    }
}

// Conversion is Automatic Conversion
// Casting is Explicit Conversion