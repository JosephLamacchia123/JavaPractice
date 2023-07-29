public class ExceptionPractice {

/**
 * Kind of a weird example but let's say you have a method (A method is a function or thing an object can do) that adds 2 numbers
 * like below and you want to make sure that only
 * numbers greater than 5 are given as input.  Then you can do something like the following.
 * **/
    public int addNumbers(int number1, int number2) throws Exception {

        if (number1 > 5 | number2 > 5) {
            throw new Exception("Both numbers must be greater than 5.  the numbers you provided were " + number1 +  " and  " + number2);
        }
        return number1 + number2;
    }



    public static void main(String args[]) throws Exception {

        /**This is how you create an object from a class.  It's called instantiating an object.
         *  Now we can use the method 'addNumbers' we defined in the class 'ExceptionPractice'.
         *
         * The 'new' keyword below combined with the 'Constructor' 'ExceptionPractice()' are what are needed to create an object.
         *
         **/
        ExceptionPractice practice = new ExceptionPractice();

        /**
         * The method 'addNumbers' defined above takes 2 numbers and returns their sum, but throws an exception when one of the numbers is less than 5.
         * I arbitrarily passed 3 and 8 as arguments to this method, but you can add whatever. See what happens if you try and pass a string like this
         * "This is a string" as an argument.
         * **/
        System.out.println(practice.addNumbers(3,8));


    }

}



