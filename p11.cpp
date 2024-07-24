/*
When a number is turned upside down (i.e., 180 degrees in clock wise 
direction), if the new number is same as original. It is called Rotating-Number

For Example: 
If you turn the digit 2 upsde down, 2 is not a valid digit.
If you turn the digit 6 upsde down, it will become 6.
Likewise, you need turn the whole number upside down

You are given a list of strings,
Your task is to findout, whether each of the given number
is Rotating-Number or Not and If yes, print 'true', Otherwise 'false'.

Input Format:
-------------
space separated numeric strings, as list num[].

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
69 962

Sample Output-1:
----------------
true false
*/
#include<iostream>
#include<algorithm>
#include<unordered_map>
#include<sstream>
using namespace std;

bool isRotating(string s,unordered_map<char,char> &rotating){
    string original = s;
    for(int i=0;s[i];i++){
        if(rotating.find(s[i]) != rotating.end()){
            // if found in map replace with 
            s[i] = rotating[s[i]];
        }
        else{
            return false; // if any digit is not rotating return false
        }
    }
    
    reverse(s.begin(),s.end());
    
    return (s == original);
}
int main(){
    unordered_map<char,char> rotating;
    rotating['0'] = '0';
    rotating['1'] = '1';
    rotating['6'] = '9';
    rotating['8'] = '8';
    rotating['9'] = '6';
    
    
    string input;
    getline(cin,input);
    istringstream iss(input);
    
    string num;
        
    while(iss >> num){
        
        if(isRotating(num,rotating)) cout << "true";
        else cout << "false";
    }
    
    return 0;
}
