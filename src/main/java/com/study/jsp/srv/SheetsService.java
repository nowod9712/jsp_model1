package com.study.jsp.srv;

import java.util.List;

import com.study.jsp.model.SheetsDTO;

public interface SheetsService {

  List<SheetsDTO> findAll();
}
