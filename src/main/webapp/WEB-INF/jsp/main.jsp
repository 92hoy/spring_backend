<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="utf-8" />
	<title>Spring Boot + JPA + Datatables</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<script src="/js/datatable.js"></script>
</head>
<script>
    $(document).ready( function () {
	 var table = $('#TestTable').DataTable({
			"sAjaxSource": "/test_table",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		        { "mData": "name" },
                { "mData": "lastName" },
                { "mData": "email" },
                { "mData": "phone" },
                { "mData": "active" }
			]
	 })
});
</script>
<body>
	<h1>Employees Table</h1>
	<table id="TestTable" class="display">
      
       <!-- Header Table -->
       <thead>
            <tr>
                <th>Id</th>
				<th>Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Active</th>
            </tr>
        </thead>
        <!-- Footer Table -->
        <tfoot>
            <tr>
                <th>Id</th>
				<th>Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Active</th>
            </tr>
        </tfoot>
    </table>
    
</body>
</html>