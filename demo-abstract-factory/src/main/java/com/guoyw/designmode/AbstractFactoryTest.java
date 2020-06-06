package com.guoyw.designmode;

/**
 * author: guoyw
 * create: 2020-06-06 11:13
 * 提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体的类
 **/

public class AbstractFactoryTest{
  public static void main(String[] args){
    MysqlDataBaseUtils dataBaseUtils = new MysqlDataBaseUtils();
    IConnection connection = dataBaseUtils.getConnection();
    connection.connect();
    
    ICommand command = dataBaseUtils.getCommand();
    command.commad();
  }
}


interface IConnection{
  void connect();
}

interface ICommand{
  void commad();
}

interface IDatabaseUtils{
  IConnection getConnection();
  
  ICommand getCommand();
}

class MysqlConnction implements IConnection{
  
  @Override
  public void connect(){
    System.out.println("mysql connected.");
  }
}

class MysqlCommad implements ICommand{
  
  @Override
  public void commad(){
    System.out.println("mysql commaded.");
  }
}

class OrderConnction implements IConnection{
  
  @Override
  public void connect(){
    System.out.println("Order connected.");
  }
}

class OrderCommad implements ICommand{
  
  @Override
  public void commad(){
    System.out.println("Order commaded.");
  }
}

class MysqlDataBaseUtils implements IDatabaseUtils{
  
  @Override
  public IConnection getConnection(){
    return new MysqlConnction();
  }
  
  @Override
  public ICommand getCommand(){
    return new MysqlCommad();
  }
}

class OracleDataBaseUtils implements IDatabaseUtils{
  
  @Override
  public IConnection getConnection(){
    return new OrderConnction();
  }
  
  @Override
  public ICommand getCommand(){
    return new OrderCommad();
  }
}