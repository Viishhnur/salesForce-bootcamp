/*Nagesh has given two words to check whether the first word 'source' is a sub-series of second word 'target'.

A sub-series from a word can be formed by removing 0 or more characters without changing the relative order of other characters in the word.

For example, 'nest' is a subseries of a word 'interst' , where as 'rest' is not.

Help Nagesh to return true if source is a subseries of target, otherwise false.

Constraints:
 0 <= source.length <= 100
 0 <= target.length <= 10^4
 source and target consist only of lowercase English letters.

Input Format:
-------------
Line-1:Two space separeted strings

 
Output Format:
--------------
Print a boolean result.
 
 
Sample Input-1:
---------------
pqsv pqrstuv
 
Sample Output-1:
----------------
true

Sample Input-2:
---------------
psr pqrst

Sample Output-2:
----------------
false
*/

#include<iostream>
using namespace std;


bool isSubSeq(string source,string target){
   int ptr1 = 0;
   int ptr2 = 0;
   while(ptr1 < source.size() && ptr2  < target.size()){
        if(source[ptr1] == target[ptr2]){
            ptr1++;
        }
        ptr2++;

        
   }

    return (ptr1 == source.size());
}
int main(){


    string source , target;
    getline(cin,source);
    getline(cin,target);
    // cin >> source >> target;

    cout << isSubSeq(source,target);
    return 0;
}