<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>
        SSE Demo
    </title>
</head>
<body>
    <div id="msgFromPush"></div>
    <script type="text/javascript" src="assets/js/jquery.js"></script>
    <script type="text/javascript">
        if (!!window.EventSource){
            var source = new EventSource('push');
            s = '';
            source.addEventListener('message',function(e){
                s+=e.data+"<br/>";
                $("#msgFromPush").html(s);
            });

            source.addEventListener('open',function (e) {
                console.log("链接打开");
            },false);

            source.addEventListener('error',function(e){
                if(e.readyState == EventSource.CLOSED){
                    console.log("链接关闭");
                }else {
                    console.log(e.readyState);
                }
            },false);
        }else {
            console.log("你的浏览器不支持 sse")
        }
    </script>
</body>
</html>