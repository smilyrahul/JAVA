public class strindexmethods {

    public static void main(String[] args) {
        String name = "Rahul";
        System.out.println(name.indexOf("hu")); // it is give result of first letter
        System.out.println(name.indexOf("h", 2));
        String modifiedname = "Rahuhul";
        System.out.println(modifiedname.indexOf("uh", '2'));

        // equal method (Case sensitive (captial ! small letter))
        System.out.println(name.equals("Rahul"));
        System.out.println(name.equals("rahul"));
        System.out.println(name.equals("aahul"));

        // equal methods (no case sensitive)
        System.out.println(name.equalsIgnoreCase("rAHUL")); // in this methods capital or small letter are nothing all
                                                            // are equal

        System.out.println(name.equalsIgnoreCase("rahul"));

    }
}
