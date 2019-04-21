class StringDemo1 {
    
    //string immutability check & intern(). everytime string is modified new string object is created
    static void stringImmut() {
        String s1 = "hello";
        System.out.println("string s1 = " + s1 + " , present at memory address : " + s1.hashCode());
        s1 += " rooney";
        System.out.println("string s1 = " + s1 + " , present at memory address : " + s1.hashCode());
        String s2 = "hello".intern();
        System.out.println("string s2 = " + s2 + " , present at memory address : " + s2.hashCode());
        String s3 = "java".intern();
        System.out.println("string s3 = " + s3 + " , present at memory address : " + s3.hashCode());
    }

    static void stringInit() {
        //3 ways to create string class object
        String s1 = new String("Hello Java");
        System.out.println("string s1 created using new = " + s1 + " , present at memory address = " + s1.hashCode());

        String s2 = "Hello Java";
        System.out.println("string s2 created using string literal = " + s2 + " , present at memory address = " + s2.hashCode());

        System.out.println("string s3 created using anonymous string object = " + "Hello Sublime" + " , present at memory address = " + "Hello Sublime".hashCode());        
    }

    public static void main(String[] args) {
        String str = "Hello Sublime";
        System.out.println("string is : " + str);
        System.out.println("length of string is : " + str.length());

        stringImmut();
        stringInit();

        //3 ways to create string class object
        String s1 = "what";
        String s2 = new String("what");
        System.out.println("s1=" + s1 + " , s2=" + s2);
        System.out.println("s1.hashCode()=" + s1.hashCode() + " , s2.hashCode()=" + s2.hashCode());

        System.out.println("s1==s2 : " + (s1==s2) + " , s1.equals(s2) : " + s1.equals(s2));

        for(int i=0;i<args.length;i++) {
           System.out.println("argument " + (i+1) + " is : " + args[i]); 
        }
        
    }
}