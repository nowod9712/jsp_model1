package com.study.jsp.dao;

import java.util.List;

import com.study.jsp.model.SheetsDTO;
import com.study.jsp.model.SheetsVO;

public interface SheetsMapper {

  List<SheetsVO> findAll();
}
