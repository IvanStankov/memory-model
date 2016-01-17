package com.ivan.jmp.metaspace;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ваня on 17.01.2016.
 */
public class MetaspaceMain {

    public static void main(String[] args) {
        ClassPool classPool = ClassPool.getDefault();
        List<Class> map = new ArrayList<>();
        for (int i = 0; ; i++) {
            try {
                Class clazz = classPool.makeClass("com.ivan.jmp.Lolo" + i).toClass();
                map.add(clazz);

                System.out.println(clazz.getName());
            } catch (CannotCompileException e) {
                // nothing
            }
        }
    }

}
