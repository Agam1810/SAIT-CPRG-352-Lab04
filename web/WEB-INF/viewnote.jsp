<%-- 
    Document   : viewnote
    Created on : 8-Jun-2022, 7:11:05 PM
    Author     : prince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>java beans</title>
    </head>
    <body>
        <h1><b>Simple Note Keeper</b></h1>
        
        <h2><b>View Note</b></h2>
        
        <label><b>Tittle:</b> ${note.title} </label>
        <br>
        <br>
        <label><b>Contents:</b></label>
        <br>
        <label>${note.context}</label>
        <br>
        <br>
        <a href="note?editNote"> Edit</a>
    </body>
</html>
