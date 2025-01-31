package com.example.project1;

import com.example.project2.Util;
import com.example.project3.Util;

public class FunctionCaller {
    public static void main(String[] args) {
        com.example.project2.Util util1 = new com.example.project2.Util();
        util1.performAction();

        com.example.project3.Util util2 = new com.example.project3.Util();
        util2.performAction();
    }
}
