package ex_14_Arrays;

public class Lab_66_Arrays {
    public static void main(String[] args)
    {
        String [] names = {"Vinod","kumar","Loki"}; //method 1 declaration

        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);


        String [] names1  = new String[3]; // method 2 declaration
        names1[0] = "Vinod";
        names1[1] = "Kumar";
        names1[2] = "Loki";

    }
}

