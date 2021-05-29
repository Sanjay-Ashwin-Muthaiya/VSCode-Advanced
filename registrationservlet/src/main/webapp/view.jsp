<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
 
<html>
    <style>
        #head{
            color:green;
            text-align: center;
        }
        #para{
            text-align: center;
        }
    </style>
<body>
    <p id="para">First Name: ${fname} </p>
    <p id="para">Last Name : ${lname} </p>
    <p id="para">DOB : ${dob} </p>
    <p id="para">Qualification : ${qualification} </p>
    <p id="para">Mobile : ${mobile} </p>
    <p id="para">Appointment Date : ${appoint_date} </p>

    <h1 id="head">Your registration success</h1>
</body>
</html>