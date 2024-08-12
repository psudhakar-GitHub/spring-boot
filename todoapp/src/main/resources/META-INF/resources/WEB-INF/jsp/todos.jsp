<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <link
      rel="stylesheet"
      type="text/css"
      href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css"
    />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Todo tracker</title>
    <script
      type="text/javascript"
      src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"
      defer
    ></script>
    <script
      type="text/javascript"
      src="webjars/jquery/3.6.0/jquery.min.js"
      defer
    ></script>
  </head>
  <body>
    <h1>Welcome ${name}</h1>
    <h2>Todo tracker</h2>
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>Task</th>
          <th>Target Date</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.target}</td>
            <td>${todo.isCompleted}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
