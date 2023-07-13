<%@page contentType="text/html; charset=utf-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<jsp:useBean id="now" class="java.util.Date"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
   <form action="student" method="POST">
     <table>
      <tr>
       <td>StudentName:</td>
       <td><input type="text" name="sName"/></td>
      </tr> 
      
      <tr>
       <td>StudentPass:</td>
       <td><input type="text" name="sPass"/></td>
      </tr> 
      
      <tr>
       <td>Email:</td>
       <td><input type="text" name="email"/></td>
      </tr> 
      
      <tr>
       <td>Age:</td>
       <td><input type="text" name="age"/></td>
      </tr> 
      
      <tr>
       <td>Mark:</td>
       <td><input type="text" name="mark"/></td>
      </tr> 
      
      <tr>
       <td><input type="submit" name="submit"/></td>
      </tr> 
   
   </form>
   
  
</body>
</html>