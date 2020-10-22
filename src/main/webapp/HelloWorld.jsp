<!DOCTYPE html>

<%-- VIEW (MVC)--%>

<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%-- taglib tells Servlet container that this page will be using Struts 2 tags preceded by an "s" --%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World!</title>
    </head>
    <body>
        <%-- <s: ... /> = Struts 2 tag --%>
        <%-- <s:property> tag displays the value returned by calling the method
             getMessageStore of HelloWorldAction. That method returns a MessageStore object. By adding
             the .message onto the messageStore part of the value attribute we are telling the Struts 2
             framework to call the getMessage method of that MessageStore object. The getMessage-method
             of class MessageStore returns a String. It is that String that will be displayed by the
             <s:property> tag --%>
        <%-- Most common use of the property-tag is to "get" the value returned by calling a public get method
             (of the Action class) and then to include that value in the HTML returned to the browser. Useful
             S2 property-tag automatically converts the most common data types (int, double, boolean) to their
             String equivalents. --%>
        <h2><s:property value="messageStore.message" /></h2>
    </body>
</html>
