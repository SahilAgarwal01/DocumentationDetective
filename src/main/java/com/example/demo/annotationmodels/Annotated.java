package com.example.demo.annotationmodels;

import com.example.demo.annotationinterface.ClassJavaDoc;
import com.example.demo.annotationinterface.MethodJavaDoc;

@ClassJavaDoc("Case 1 - Only Annotation")
public class Annotated {

    @MethodJavaDoc("This is case 1 Method 1")
    public void case1method1() {
        System.out.println("Case 1 Method 1");
    }

    @MethodJavaDoc("This is case 1 Method 2")
    public void case1method2() {
        System.out.println("Case 1 Method 2");
    }

    @MethodJavaDoc("This is case 1 Method 3")
    public void case1method3() {
        System.out.println("Case 1 Method 3");
    }

    @MethodJavaDoc("This is case 1 Method 4")
    public void case1method4() {
        System.out.println("Case 1 Method 4");
    }
}
