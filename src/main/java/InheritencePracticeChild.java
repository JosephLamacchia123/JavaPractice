public class InheritencePracticeChild extends InheritencePracticeParent {


    /**
     * Below is an example of inheritence which I cannot spell.  This class uses the 'extends' keyword
     * as you can see above which gives it access to all the non-private fields and methods of the class it extends.
     *
     */

    public static void main(String[] args) {
        InheritencePracticeChild practiceChild = new InheritencePracticeChild();


        //This line is printing the 'stringBelongingToParentClass' field that was defined in the InheritencePracticeParent class
        System.out.println(practiceChild.stringBelongingToParentClass);

        //This line is invoking the 'printString()' method that was defined in the InheritencePracticeParent class
        practiceChild.printString();
    }
}
