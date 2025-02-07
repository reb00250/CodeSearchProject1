package com.example.project1;

import com.example.project2.Util1;
import com.example.project3.Util2;

public class FunctionCaller {
    public static void main(String[] args) {
        Util1 util1 = new Util1();
        util1.performAction();

        Util2 util2 = new Util2();
        util2.performAction();
    }
}
