/* Given an 2D character array, Letters[][], of size r*c.
You have to construct the word W, using the given array.

Rules to construct the word are as follows:
	- All the letters of the word W, should be adjacent to each other 
	in the array Letters(either horizontal or vertical).
	- You can use each charcater in Letters[][] only once.

If you are able to construct the word W, return 'true'
Otherwise 'false'.

Input Format:
-------------
Line-1 -> two integers R and C, array size.
R lines -> C space separated characters.
Last line -> a string, word W

Output Format:
--------------
print the boolean result.


Sample Input-1:
---------------
3 3
a b c
d e f
g h i
bad

Sample Output-1:
----------------
true


Sample Input-2:
---------------
3 3
a b c
d e f
g h i
ace

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 3
a b c
d e f
g h i
add

Sample Output-3:
----------------
false
*/

import java.util.*;

public class p4{
    private static boolean backtrack(int i , int j , String [][]arr , String w,int z){
        if(z==w.length()){
            return true;
        }
        if(i<0 || i>= arr.length || j<0 || j >= arr[0].length || !String.valueOf(w.charAt(z)).equals(arr[i][j])){
            return false;
        }
        String t = arr[i][j];
        arr[i][j] = ".";
        z++;
        boolean b =  (backtrack(i+1,j,arr,w,z)|backtrack(i-1,j,arr,w,z)|backtrack(i,j-1,arr,w,z)|backtrack(i,j+1,arr,w,z));
        arr[i][j]  = t;
        return b;
        
    }
    public static void main(String [] args){
        int r ;
        int c ;
        Scanner cin = new Scanner(System.in);
        r = cin.nextInt();
        c = cin.nextInt();
        cin.nextLine();
        String [][] arr = new String[r][c];
        for(int i = 0 ; i < r ; i++){
            
            arr[i] = cin.nextLine().split(" ");
        }
        String w = cin.nextLine();
        boolean flag = false;
        for( int i = 0; i < r ; i++){
            for( int j = 0; j < c ; j++){
                if(String.valueOf(w.charAt(0)).equals(arr[i][j])){
                    flag = backtrack(i,j,arr,w,0);
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        
     
            System.out.println(flag);
        
        
        
    }
}

