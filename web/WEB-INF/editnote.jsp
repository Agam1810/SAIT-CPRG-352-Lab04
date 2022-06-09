<%-- 
    Document   : editnote
    Created on : 8-Jun-2022, 7:11:26 PM
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
        
        <form method="post" action="note">
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <br>
        <label>Title:</label>
        <input type="text" name="title" value="${note.title}">
        <br>
        <label>Contents:</label>
        <textarea name="context" cols="60" rows="9">${note.context}</textarea>
        <br>
        <input type="submit" value="Save">
        
        </form>
    </body>
</html>
