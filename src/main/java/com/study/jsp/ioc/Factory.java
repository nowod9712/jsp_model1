package com.study.jsp.ioc;

import org.apache.catalina.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.study.jsp.dao.SheetsMapper;
import com.study.jsp.dao.SheetsMapperDAO;
import com.study.jsp.dao.UserMapper;
import com.study.jsp.dao.UserMapperDAO;
import com.study.jsp.srv.SheetsService;
import com.study.jsp.srv.SheetsServiceImpl;
import com.study.jsp.srv.UserService;
import com.study.jsp.srv.UserServiceImpl;

import myBatis.MyBatisManager;

public enum Factory {

  INSTANCE;
  
  private SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
  private SqlSession sqlSession = sqlSessionFactory.openSession(false);
  
  private UserMapper userDao = new UserMapperDAO(sqlSession); 
  private SheetsMapper sheetsDao = new SheetsMapperDAO(sqlSession);
  
  
  private UserService userSrv = new UserServiceImpl(userDao);
  public UserService getUserSrv() {
    
    return userSrv;
  }
  
  private SheetsService sheetsSrv = new SheetsServiceImpl(sheetsDao);
  public SheetsService getSheetsSrv() {
    
    return sheetsSrv;
  }
  
  
}
