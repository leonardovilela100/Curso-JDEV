<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Curso JSP</title>

<style type="text/css">

form {
 position: absolute;
 top: 30%;
 left: 28%;
 right: 28%;
}

h3 {
 position: absolute;
 top: 20%;
 left: 28%;
}

.msg {
 position: absolute;
 top: 10%;
 left: 28%;
 font-size: 20px;
color: #842029;
    background-color: #f8d7da;
    border-color: #f5c2c7;
 
}

</style>

</head>
<body>

	<h3>Bem vindo ao Curso de JSP</h3>

	<form action="<%=request.getContextPath()%>/ServletLogin" method="POST" class="row g-3 needs-validation" novalidate>
		<input type="hidden" value=" <%=request.getParameter("url")%>"
			name="url">

		<div class="mb-3">
			<label class="form-label">Login:</label> 
			<input name="login" type="text" class="form-control" required>
				 <div class="valid-feedback">
			      Muito Bem
			    </div>
			     <div class="invalid-feedback">
			      Obrigatorio!
			    </div>
			
		</div>
	
		<div class="mb-3">
			<label class="form-label">Senha:</label> 
			<input name="senha" type="password" class="form-control" required>
				 <div class="valid-feedback">
			      Muito Bem
			    </div>
			     <div class="invalid-feedback">
			      Obrigatorio
			    </div>
		</div>
			<input type="submit" value="Acessar" class="btn btn-primary">

	</form>
	<h5 class="msg">${msg}</h5>
	
	

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"> </script>
	
	<script type="text/javascript">
	(function () {
		  'use strict'

		  // Fetch all the forms we want to apply custom Bootstrap validation styles to
		  var forms = document.querySelectorAll('.needs-validation')

		  // Loop over them and prevent submission
		  Array.prototype.slice.call(forms)
		    .forEach(function (form) {
		      form.addEventListener('submit', function (event) {
		        if (!form.checkValidity()) {
		          event.preventDefault()
		          event.stopPropagation()
		        }

		        form.classList.add('was-validated')
		      }, false)
		    })
		})()
	</script>
</body>
</html>