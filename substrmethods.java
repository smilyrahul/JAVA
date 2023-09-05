public class substrmethods {
    public static void main(String[] args) {
        //ALL OF THESE TAKES INDEX NUMBERING SYSYTEM
        String name = "Rahul";
        // System.out.println(name.substring(3));
        // System.out.println(name.substring(1,5));
        // System.out.println(name.substring(0));
        // replace methods in string
        System.out.println(name.replace('h', 'k'));
        System.out.println(name.replace("ahul", "ohan"));

        // * start with string methodes *
        System.out.println(name.startsWith("Ra"));
                System.out.println(name.startsWith("sa"));
                // * END WITH STRING METHODES *
                System.out.println(name.endsWith("ul"));
                System.out.println(name.endsWith("Ra"));
                
                //charAt methods 
                System.out.println(name.charAt(1));

    }

}
