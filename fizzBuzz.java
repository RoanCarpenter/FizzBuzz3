public class fizzBuzz{
 
     public static void fizzBuzz(String[] args)
    {
        String s = "";
        for (int i = 1, fizz = 0, buzz = 0; i <= 100; i++) {
            fizz++;
            buzz++;
            //the loop goes and each time it goes up one, fizz and buzz also increase
            //each time one reaches (3) or (5), they reset to 0 and begin counting again
            //this allows for every 3 and 5 to be fizz, buzz or fizzbuzz
            if (fizz == 3 && buzz == 5) {
                s += "fizzbuzz";
                fizz = 0;
                buzz = 0;
            }
            if (fizz == 3) {
                s += "fizz";
                fizz = 0;
            }
            if (buzz == 5) {
                s += "buzz";
                buzz = 0;
            }
            if (s.length() == 0)
                System.out.println(i);
            else
                System.out.println(s);
            s = "";
        }
    }
}
