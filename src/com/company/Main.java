package com.company;

public class Main {
    public static int[] one = {3,1,3,1,3};
    public static int[] two = {3,1,3,3};
    public static int[] three = {3,4,3,3,4};

    public static void main(String[] args) {
	System.out.println(DWongLib.haveThree(one));
	System.out.println(DWongLib.haveThree(two));
	System.out.println(DWongLib.haveThree(three));
    }
}
