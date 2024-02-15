<%@page import="com.study.jsp.model.UserDTO"%>
<%@page import="com.study.jsp.ioc.Factory"%>
<%@page import="com.study.jsp.srv.UserService"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");

	Map<String, String> loginInfo = new HashMap<String, String>();
	loginInfo.put("userid", userid);
	loginInfo.put("password", password);
	
	
	
	
	UserService userSrv = Factory.INSTANCE.getUserSrv();
	UserDTO dto = userSrv.getOne(loginInfo);
	
	if(dto!=null){
	  session.setAttribute("userid", dto.getUserid());
	  session.setAttribute("name", dto.getName());
	  
	  response.sendRedirect("./list,jsp");
	  
	}else{
	  
	  
	  
	  response.sendRedirect("../index,jsp");
	}
	

%>