package com.guoyw.desginmode;

/**
 * author: guoyw
 * create: 2020-06-06 10:01
 * 类加载的 初始化阶段就完成了 实例的初始化 。
 * 本质上就是借助于jvm 类加载机制，保证实例的唯一性（初始化过程只会执行一次）及线程安 全（JVM以同步的形式来完成类加载的整个过程）。
 * 类加载过程：
 * 1，加载二进制数据到内存中， 生成对应的Class数据结构，
 * 2，连接： a. 验证， b.准备（给类的静态成员变量赋默认值），c.解析
 * 3，初始化： 给类的静态变量赋初值 只有在真正使用对应的类时，才会触发初始化
 * 如（ 当前类是启动类即 main函数所在类，直接进行new 操作，访问静态属性、访问静态方 法，用反射访问类，初始化一个类的子类等.）
 **/

public class HungrySingleton{
  
  private static HungrySingleton hungrySingleton = new HungrySingleton();
  
  private HungrySingleton(){}
  
  public static HungrySingleton getInstance(){
    return hungrySingleton;
  }
  
}
