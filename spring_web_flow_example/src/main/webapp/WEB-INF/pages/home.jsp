<html xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:form="http://www.springframework.org/tags/form">

<jsp:output omit-xml-declaration="yes"/>
<jsp:directive.page contentType="text/html;charset=UTF-8" />

<head><title>Spring Web Flow Example</title></head>

<body>
    <h2>Welcome to this Spring Web Flow Example</h2>
    <form:form>
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
        <input type="submit" name="_eventId_newUser" value="create a new user" />
        <input type="submit" name="_eventId_showUsers" value="show exisiting users" />
    </form:form>
    <a href="${flowExecutionUrl}&_eventId=newUser">create a new user</a>

</body>