public class Comparison{
    public static void main (String []args){

        int a=20;
        int b=6;
        
        boolean isGreater = a>b;
        boolean isLess = a<b;
        boolean isEqual = a==b;
        boolean isNotEqual = a!=b;

        System.out.println("Is a greater than b " +(a>b));
        System.out .println("Is a less than b "+(a<b));
        System.out.println("Is a equal to b "+(a==b));
        System.out.println("Is a not equal to b "+(a!=b));
        System.out.println("Is a greater than or equal to b " +(a>=b));
        System.out .println("Is a less than or equal to b "+(a<=b));

        System.out.println("Is a greater than b " +isGreater);
        System.out .println("Is a less than b "+isLess);
        System.out.println("Is a equal to b "+isEqual);
        System.out.println("Is a not equal to b "+isNotEqual);
      
    }
}
