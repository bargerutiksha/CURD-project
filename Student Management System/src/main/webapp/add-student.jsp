<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

</head>
<body class="bg-light">
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container-fluid px-0">
<div class="row">
<jsp:include page="side-panel.jsp"></jsp:include>


<!-- heading section -->
<div class="col-10 p-4">
<div class="mb-4">
<h4>Add Student</h4>
<div class="text-secondary">Enter Student Details</div>
</div>

<!-- form section -->
<div class="card shadow">
<div class="card-body p-4">

<form action="AddStudent" method="post">
<div class="row g-3">


<!-- first name -->
<div class="col-md-6">
<label for="name" class="form-label"> Name</label>
<input type="text" name="name" class="form-control" required>
</div>


<!-- phone -->
<div class="col-md-6">
<label for="phone" class="form-label">Phone</label>
<input type="text" name="phone" class="form-control" required>
</div>

<!-- Department -->
<div class="col-md-6">
<label for="department" class="form-label">Department</label>
<input type="text" name="department" class="form-control" required>
</div>

<!-- email -->
<div class="col-md-6">
<label for="email" class="form-label">Email</label>
<input type="text" name="email" class="form-control" required>
</div>

<!-- city -->
<div class="col-md-6">
<label for="city" class="form-label">city</label>
<input type="text" name="city" class="form-control" required>
</div>



</div>

<div class="mt-4">

<button type="submit" class="btn btn-primary">
<i class="bi bi-save me-1"></i>Save Student
</button>
</div>
</form>
</div>

</div>


</div>
</div>
</div>

</body>
</html>