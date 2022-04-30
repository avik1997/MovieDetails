<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Movie Details</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

    <div class="container">
        <form action="register" method="POST">
            <div class="row mb-3">
              <label for="moviename" class="col-sm-2 col-form-label">Movie Name</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="moviename" name="moviename">
              </div>
            </div>
            <div class="row mb-3">
              <label for="actorname" class="col-sm-2 col-form-label">Actor Name</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="actorname" name="actorname">
              </div>
            </div>
            <div class="row mb-3">
                <label for="actressname" class="col-sm-2 col-form-label">Actress Name</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="actressname" name="actressname">
                </div>
            </div>
            <div class="row mb-3">
                <label for="date" class="col-sm-2 col-form-label">Relesed Date</label>
                <div class="col-sm-10">
                  <input type="date" class="form-control" id="date" name="date">
                </div>
            </div>
            <div class="row mb-3">
                <label for="budget" class="col-sm-2 col-form-label">Budget</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="budget" name="budget">
                </div>
            </div>
            <button type="submit" class="btn btn-primary" value="register">Submit</button>
          </form>


    </div>

</body>
</html>