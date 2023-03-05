<%@ page contentType="text/html; charset=UTF-16" pageEncoding="UTF-16" %>
<!DOCTYPE html>
<html>
<head>
    <style><%@include file="/indexstyle.css"%></style>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/indexstyle.css"/>
    <title>test build</title>
    <meta charset="UTF-16"/>
</head>

<body>
    <h1>Book Archive</h1><br/>

    <form name="outputGenre" action="searchGenre">
        <b>Query genre</b>
        <input type="text"  name="inputGenre" id="inputGenre" required>

        <b>Name query</b>
        <input type="text"  name="inputName" id="inputName" required>

        <button type="submit">Ввод</button>
    </form>

    <div>
        <h3>1)-------------------novels-----------------------------</h3>
        lord of the rings<br/>
        dark beginnings<br/>
        the hitchhiker's guide to the galaxy<br/>
        winnie pooh<br/>
        1984<br/>
        jane eyre<br/>
        catch-22<br/>
        rebecca<br/>
        birdsong<br/>
        wind in the willows<br/>
        <h3>2)---------------------proses----------------------------</h3>
        blueberry girl<br/>
        fight club<br/>
        <h3>3)---------------------fantasy----------------------------</h3>
        american gods<br/>
        stardust<br/>
        the sleeper and the spindle<br/>
        the truth is a cave in the black mountains<br/>
    </div>

</body>
</html>