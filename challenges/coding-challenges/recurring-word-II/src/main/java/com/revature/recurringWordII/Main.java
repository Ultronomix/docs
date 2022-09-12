package com.revature.recurringWordII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String myStr = "We tell people sometimes: we're like drug dealers, come into town and get everybody absolutely addicted to painting. It doesn't take much to get you addicted. If we're gonna walk though the woods, we need a little path. We artists are a different breed of people. We're a happy bunch. All you have to learn here is how to have fun. It's a very cold picture, I may have to go get my coat. It’s about to freeze me to death.";
        String[] splited = myStr.split(" ");
        Arrays.sort(splited);
        System.out.println(Arrays.toString(splited));
        int max = 0;
        int count= 1;
        String word = splited[0];
        String curr = splited[0];
        for(int i = 1; i<splited.length; i++){
            if(splited[i].equals(curr)){
                count++;
            }
            else{
                count =1;
                curr = splited[i];
            }
            if(max<count){
                max = count;
                word = splited[i];
            }
        }
        System.out.println(max + " x " + word);
    }


}

