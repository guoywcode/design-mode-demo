package com.guoyw.desginmode;

import java.lang.reflect.Constructor;

/**
 * author: guoyw
 * create: 2020-06-06 09:55
 **/

public class TestMain{
  
  public static void main(String[] args) throws Exception{
   /* // 懒汉模式
    LazySingleton singleton1 = LazySingleton.getInstance();
    LazySingleton singleton2 = LazySingleton.getInstance();
    System.out.println(singleton1);
    System.out.println(singleton2)*/;
    
    HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
    HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
    System.out.println(hungrySingleton1);
    System.out.println(hungrySingleton2);
    
    // 反射使单例失效
    Constructor<HungrySingleton> hungrySingleton =  HungrySingleton.class.getDeclaredConstructor();
    hungrySingleton.setAccessible(true);
    HungrySingleton hungrySingleton3 =  hungrySingleton.newInstance();
    System.out.println(hungrySingleton3);
  }
  
}
