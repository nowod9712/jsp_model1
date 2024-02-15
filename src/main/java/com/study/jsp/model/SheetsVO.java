package com.study.jsp.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class SheetsVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private int seq;
  private String title;
  private String nickname;
  private String content;
  private Date regdate;
  private int cnt;
  private String userid;
  
  
}
