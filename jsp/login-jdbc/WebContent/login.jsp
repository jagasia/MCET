<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="jag.css">
</head>
<body>
<div class="p-5 bg-info text-white">
    <h1 class="text-center">Welcome to my page</h1>
    <p class="text-center">This is created by III IT</p>
</div>
<div class="row">
    <div class="col-sm-4">
        One
    </div>
    <div class="col-sm-4">
        <form class="container-fluid" action="LoginServlet">
            User name: <input type="text" name="username" id="" class="form-control" >
            Password: <input type="password" name="password" id="" class="form-control">
            <br>
            <input type="submit" value="Login" class="btn btn-success">&nbsp;&nbsp;&nbsp;
            <input type="reset" value="Reset" class="btn btn-warning">
        </form>
        <br>
    </div>
    <div class="col-sm-4">
        Three
    </div>    
</div>
<div class="row">
    <div class="col-sm-2">

    </div>
    <div class="col-sm-8">
        <table border="1" width="100%">
            <thead>
                <tr>
                    <th class="text-center" colspan="4">Performance Report</th>
                </tr>
            </thead>
        <thead>
            <tr>
                <th>Year</th>
                <th>Semester</th>
                <th>Subject</th>
                <th>Marks</th>
            </tr>
          </thead>
          <tbody>
            <tr>
                <td rowspan="6">1</td>
                <td rowspan="3">1</td>
                <td>1</td>
                <td>50</td>            
            </tr>
            <tr>
                <td>2</td>
                <td>50</td>            
            </tr>
            <tr>
                <td>3</td>
                <td>50</td>
            </tr>
            <tr>
                <td rowspan="3">2</td>
                <td>4</td>
                <td>50</td>
            </tr>
            <tr>
                <td>5</td>
                <td>50</td>
            </tr>
            <tr>
                <td>6</td>
                <td>50</td>
            </tr>
            <tr>
                <td rowspan="6">2</td>
                <td rowspan="3">3</td>
                <td>7</td>
                <td>50</td>            
            </tr>
            <tr>
                <td>8</td>
                <td>50</td>            
            </tr>
            <tr>
                <td>9</td>
                <td>50</td>
            </tr>
            <tr>
                <td rowspan="3">4</td>
                <td>10</td>
                <td>50</td>
            </tr>
            <tr>
                <td>11</td>
                <td>50</td>
            </tr>
            <tr>
                <td>12</td>
                <td>50</td>
            </tr>
          </tbody>
        </table>
    </div>
    <div class="col-sm-2">

    </div>
</div>
</body>
</html>