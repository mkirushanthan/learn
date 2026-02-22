package com.example.helloworld;

public class EvenOddNumber {
    public static void main(String[] args) {
        Demo obj=new Demo();

        boolean result=obj.findEvenorOdd(2);

        System.out.println(result);
    }
}

class Demo{
    public boolean findEvenorOdd(int i){
        if(i%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
