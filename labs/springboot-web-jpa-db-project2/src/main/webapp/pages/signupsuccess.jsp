<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h1> User Details inserted Successfully</h1>
         
         ${obj.empId}    ${obj.empName}    ${obj.empEmail}
         
         <h1> Select User </h1>
         
          <form action="/selectEmp">
    		 UserId : <input type="number" name="empId"/><br>
     		 <input type="submit" value="submit">
          </form>
          
           <h1> View All User </h1>
         
          <form action="/selectAllEmp">
     		 <input type="submit" value="ViewAll">
          </form>
</body>
</html>