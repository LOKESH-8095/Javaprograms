package ex_13_Stringbuilder_Stringbuffer_functions;

public class Lab_62_string_functions {
    public static void main(String[] args)
    {
        String name = "Vinod shetty";
        String name1 = "Shetty";

        System.out.println(name.length()); // length
        System.out.println(name.charAt(3)); // char

        System.out.println(name.concat("Shetty")); // concat

        System.out.println(name.contains("al")); // contains

        System.out.println(name.equals("Sonal")); // equals

        System.out.println(name.equalsIgnoreCase("Vinod"));
//
        System.out.println(name.indexOf("l")); // indexof

        System.out.println(name.replace('K','k')); // replace
//
        String name2 = "lokesh@shetty@live.com";
        String[] split = name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]); // split
//
//                System.out.println(name.substring(1, 3)); // substring

        System.out.println(name1.startsWith("V"));
        System.out.println(name1.endsWith("v"));

        System.out.println(name1.trim()); //trim

        System.out.println(name.compareTo("Vinod"));

        StringBuilder stringBuilder = new StringBuilder("Vinod");
        stringBuilder.append("shetty");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hiii");
        System.out.println(sb.toString());

        String anotherpalindrome = "Niagara. 0 roar again";
        String roar = anotherpalindrome.substring(11, 15);
        System.out.println(roar);



    }

}
