<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset= utf-8">
    <title>
       HTTPMessageConverter Demo
    </title>
</head>
<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"/>
    <script type="text/javascript" src="assets/js/jquery.js"></script>
    <script>
        function req(){
            $.ajax({
                url:"convert",
                data:"1-wangyunfei",
                type:"POST",
                contentType:"application/x-wisely",
                success:function (data) {
                    $("#resp").html(data);
                }
            })
        }
    </script>
</body>
</html>