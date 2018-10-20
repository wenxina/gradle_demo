package com.example.hl;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        /**
         * 堆溢出
         */
        /*ArrayList arrayList = new ArrayList();
        while (true){
            arrayList.add(new Demo1());
        }*/
        HashMap hashMap = new HashMap();
        /**
         * 栈溢出
         */
        new Demo1().test();
    }

    private void test(){
        test();
    }
}
