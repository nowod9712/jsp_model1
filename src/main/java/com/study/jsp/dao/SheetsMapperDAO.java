package com.study.jsp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.study.jsp.model.SheetsVO;

public class SheetsMapperDAO implements SheetsMapper {

  private SqlSession sqlSession;
  
  public SheetsMapperDAO(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
    
  }
  
  private SheetsMapper mp() {
    
    return sqlSession.getMapper(SheetsMapper.class);
  }

  @Override
  public List<SheetsVO> findAll() {
    return mp().findAll();
  }
  
  
  
  
  
}
