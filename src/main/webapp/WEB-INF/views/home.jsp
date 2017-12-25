<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>


<div>
    <h2>A global community of friends and strangers spitting out their inner-most and personal thoughts on the web for everyone else to see.</h2>
    <h3>Look at what these people are spitting right now...</h3>

    //Iterate over the list of Spittle
    <ol class="spittle-list">
        <c:forEach var="spittle" items="${spittles}">

        //Construct a context-relative Spitter URL
            <s:url value="/spitters/{spitterName}" var="spitter_url" >
                <s:param name="spitterName" value="${spittle.spitter.username}" />
            </s:url>

            <li>

        //Display Spitter prooperties
                <span class="spittleListText">
                    <a href="${spitter_url}">
                        <c:out value="${spittle.spitter.username}" />
                    </a>
                    <c:out value="${spittle.text}" /><br/>
                    <small><s:eval expression="spittle.when"/></small>
                </span>
            </li>
        </c:forEach>
    </ol>
</div>