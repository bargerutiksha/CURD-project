<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel</title>
    
    <!--cdn for bs css classes-->

<link 
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">
      
      <!-- cdn for bs icons -->
      
<link rel="stylesheet" 
    href= https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">          
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container-fluid">
<div class="row px-0">
<jsp:include page="side-panel.jsp"></jsp:include>
<jsp:include page="main-body.jsp"></jsp:include>
</div>
</div>




</body>
</html>