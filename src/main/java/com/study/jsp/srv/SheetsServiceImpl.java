package com.study.jsp.srv;

import java.util.ArrayList;
import java.util.List;

import com.study.jsp.dao.SheetsMapper;
import com.study.jsp.model.SheetsDTO;
import com.study.jsp.model.SheetsVO;





public class SheetsServiceImpl implements SheetsService {

  private SheetsMapper sheetsDao;
  
  public SheetsServiceImpl(SheetsMapper sheetsDao) {
    this.sheetsDao = sheetsDao;
  }
  
  
  
  
  @Override
  public List<SheetsDTO> findAll() {

    List<SheetsVO> daoList = sheetsDao.findAll();
    List<SheetsDTO> list = null;
  
  if(daoList!=null) {
    list = new ArrayList<SheetsDTO>();

    for(SheetsVO vo : daoList) {
      
      SheetsDTO dto = new SheetsDTO();
      dto.setCnt(vo.getCnt());
      dto.setContent(vo.getContent());
      dto.setNickname(vo.getNickname());
      dto.setRegdate(vo.getRegdate());
      dto.setSeq(vo.getSeq());
      dto.setTitle(vo.getTitle());
      dto.setUserid(vo.getUserid());
      
      list.add(dto);
      
      
    }//for
  }//if
    
    return list;
    
  }

}
