package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] Number = {15,20,21,45,44,46,55,67,88,90,100,120,145,68};

        int Index_to_find = 145;

        int index = indexOf(Number, Index_to_find); // Pass the array of Numbers along with the Index to find

        System.out.println("Index position of " + Index_to_find + " is " + index );
    }

    public static int  indexOf(int [] Num, int find) {

        int [] temp = Num;

        int nu = 0;

        for(int i = 0 ; i<temp.length ; i++){
            if (temp[i] == find) {                     // if the number in the array matches with the number of interest
               nu = i;              // assign the position to an integer "nu"
            }

            }
          return nu;   // return the index position
        }

    }

