<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
  </head>
  <body>
    <h2>Login</h2>
    <pre>${error}</pre>
    <form action="login" method="post">
      <div>
        <label for="name">Name</label>
        <input type="text" name="name" id="name" />
      </div>
      <br />
      <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password" />
      </div>
      <br />
      <button type="submit">Login</button>
    </form>
  </body>
</html>
