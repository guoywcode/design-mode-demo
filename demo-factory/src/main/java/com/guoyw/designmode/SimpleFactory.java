package com.guoyw.designmode;

/**
 * 简单工厂
 * author: guoyw
 * create: 2020-06-06 10:25
 **/



public class SimpleFactory{
  
  public static void main(String[] args){
//    SimpleFactory.creatProduct("0").method1();
//    SimpleFactory.creatProduct("1").method1();
    
    Application application = new ConcreteProductA();
    application.getObject().method1();
  }
  

  // 简单工厂
  public static Product creatProduct(String type){
    if("0".equals(type))
      return new ProductA();
    else if("1".equals(type))
      return new ProductB();
    return null;
  }

}

// 工厂方法
abstract class Application{
  abstract Product createProduct();
  Product getObject(){
    Product product =createProduct();
    return product;
  }
  
}

class ConcreteProductA extends Application{
  
  @Override
  Product createProduct(){
    return new ProductA();
  }
}


class ConcreteProductB extends Application{
  
  @Override
  Product createProduct(){
    return new ProductB();
  }
}


// --------------------------

// 稳定接口
interface Product {
  public void method1();
}

class ProductA implements  Product{
  
  @Override
  public void method1(){
    System.out.println("ProductA method1 前来报道.....");
  }
}

class ProductB implements Product{
  @Override
  public void method1(){
    System.out.println("ProductB method1 前来报道.....");
  }
}