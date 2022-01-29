package com.company;

public class TwoStringasCLI {
    public static void main(String[] args) {
        if(args[0].equalsIgnoreCase("GLA")&& args[1].equalsIgnoreCase("Mathura")){
            System.out.println("GLA University Mathura");
        }
        else if(args[0].equalsIgnoreCase("AAA")&& args[1].equalsIgnoreCase("Delhi")){
            System.out.println("AAA Technologies Delhi");
        }
        else
            System.out.println("Wrong input");
    }
}
