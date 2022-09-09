package com.revature.app;

import java.util.ArrayList;

public class Solution {
    public String brackets(String s) {
        /* Write your code here */
        String x="";
        ArrayList<Character> y = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++){
            y.add(s.charAt(i));
        }
        for(int i = 0 ; i< y.size() ; i++){
            if(y.get(i).equals('.')){
                x=x.concat("["+Character.toString(y.get(i))+"]");
                i++;
            }
            boolean z = i>=y.size();
            if(!z){
            x=x.concat(Character.toString(y.get(i)));
            }
        }
        return x;
    }
}
