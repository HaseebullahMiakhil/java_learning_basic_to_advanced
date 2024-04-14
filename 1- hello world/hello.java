/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        System.out.println("this is start of our java codes");
        

        //learning output
        System.out.println("Hello world");
        System.out.println("i am learning Java!");
        System.out.println("it is awesome");

        //learning numbers in java
        System.out.println(3+3);
        System.out.println(3 + 3);
        System.out.println(2 * 5);

        //comments in java
        /* you can use like that comment */   // or you can use like that comment.

        //variables in java
        String name = "my home";
        System.out.println(name);

        int mynum = 15;
        System.out.println(mynum);

        float myfloat = 12.5f;
        System.out.println(myfloat);

        char myletter = 'd';
        System.out.println(myletter);

        boolean mytrue = true;
        boolean myflase = false;
        System.out.println(mytrue);
        System.out.println(myflase);

        //print vaiables in java
        String myname = "hasseeb";
        System.out.println("hello Mr." + myname);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        //Declare Multiple Variable 
        int a = 2;
        int b = 3;
        int c = 7;
        System.out.println(a + b + c);

        // all java varaibales must be identified with unique names

        //good
        int minutesperhour = 60;

        //ok but not good for one professional programmer
        int m = 27;

        //Data Types are divided in to two parts:
        // Primitive Data Types - byte short int float long double boolean char
        //Non- Primitive Data Types - String , Arrays , Classes

        //Java Type Casting 

        int myint = 9;
        double mydouble = myint;
        System.out.println(myint);
        System.out.println(mydouble);

        double mydoubl = 2.7;
        int myintdouble = (int)mydoubl;
        System.out.println(mydoubl);
        System.out.println(myintdouble);

        //java operators

        int xx = 100 + 200;
        System.out.println(xx);
        int yy = 200/100;
        System.out.println(yy);
        int xxx = 5-2;
        System.out.println(xxx);
        int xxxx = 10 * 10;
        System.out.println(xxxx);
        int xxxxx = 5%2;
        System.out.println(xxxxx);

        ///-----------------java string-----------///
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the lenght of the text is" + " "+ txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("DEFGH"));
    
        ///----------------string concatenation-------------///
        String firstname = "Haseebullah";
        String Lastname = "Miakhil";
        System.out.println(firstname + " " + Lastname);
        System.out.println(firstname.concat(Lastname));

        ///-------- adding numbers and string -------------///
        int a1 = 10;
        int a2 = 20;
        int a3 = a1 + a2;
        System.out.println(a3);

        //------special characters-----------------////
        //    \' \" \\

        //---------java math----------//
        System.out.println(Math.sqrt(25));
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.abs(-4));
        System.out.println(Math.random());

        //--------Java Booleans------///
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        int numbol1 = 10;
        int numbol2 = 5;
        System.out.println(numbol1 > numbol2);
        System.out.println(numbol1 < numbol2);

        System.out.println(10 > 2);
        System.out.println(10 < 5);

        int myage = 25;
        int myfriend_age  = 20;
        System.out.println(myage >= myfriend_age);

        if (myage >= myfriend_age) {
            System.out.println("you are bigger than your friend");
        }else{
            System.out.println("your friend is bigger than you");
        }
        //-------Java if/else------------------//
        if (20 > 18) {
            System.out.println("this is bigger than second number");
        }
        
        int time = 20;
        if (time < 18) {
            System.out.println("good day");
        }else{
            System.out.println("good evening");
        }

        if (time < 10) {
            System.out.println("good morning");
        }else  if( time < 19){
            System.out.println("good day");
        }else{
            System.out.println("good evening");
        }
        //---------java Switch-------------------//
        int day = 0;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("looking forward to the weekend");
                break;
        }
    }
}