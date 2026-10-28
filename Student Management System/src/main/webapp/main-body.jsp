<!-- main body -->
<div class="col-10 bg-light min-vh-100 p-4">
<!-- Welcome section -->

<div>
<h2>
Welcome <span class="badge bg-success">${admin.username }</span>
</h2>
</div>
<hr>

<!-- Dashboard section -->
<div class="mb-4">
<h5>Dashboard</h5>
<div class="text-secondary">Quick Actions</div>
</div>

<!-- Cards -->
<div class="row g-4">

<!-- View student card -->
<div class="col">
<div class="card shadow text-center p-4">
<i class="bi bi-people fs-1 mb-2"></i>
<h5>View Students</h5>
<a href="GetAllStudents" class="btn btn-primary">Open</a>
</div>
</div>

<!--Add Student Card -->
<div class="col">
<div class="card shadow text-center p-4">
<i class="bi bi-person-plus fs-1 mb-2"></i>
<h5>Add Students</h5>
<a href="add-student.jsp"class="btn btn-success">Open</a>
</div>
</div>

<!-- Admin Details -->
<div class="col">
<div class="card shadow text-center p-4">
<i class="bi bi-person-gear fs-1 mb-2"></i>
<h5>Admin Details</h5>
<a href="#" class="btn btn-warning">Open</a>
</div>
</div>

<!-- Dashboard-->
<div class="col">
<div class="card shadow text-center p-4">
<i class="bi bi-speedometer2 fs-1 mb-2"></i>
<h5>Dash board</h5>
<a href="#" class="btn btn-dark">Open</a>
</div>
</div>

</div>
</div>