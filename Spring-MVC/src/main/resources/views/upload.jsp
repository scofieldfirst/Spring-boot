<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>
        upload page
    </title>
</head>
<body>
<div class="upload">
    <form action="upload" enctype="multipart/form-data" method="post" accept-charset="UTF-8">
        <input type="file" name="file"/><br/>
        <input type="submit" value="上传">
    </form>
</div>
</body>
</html>