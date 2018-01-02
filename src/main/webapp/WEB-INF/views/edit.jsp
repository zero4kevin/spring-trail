<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div>
    <h2>Create a free Spitter account</h2>

//    Bind form to model attribute
    <sf:form method="POST" modelAttribute="spitter">
        <fieldset>
            <table cellspacing="0">
                <tr>
                    <th><label for="user_screen_name">Full name:</label></th>
                    <td><sf:input path="fullName" size="15" /></td>
                </tr>

//username field
                <tr>
                    <th><label for="user_screen_name">Username:</label></th>
                    <td>
                        <sf:input path="username" size="15" maxlength="15" />
                        <small id="username_msg">No spaces, please.</small>
                        <sf:errors path="username" cssClass="error"/>
                    </td>
                </tr>

//password field
                <tr>
                    <th><label for="user_password">Password:</label></th>
                    <td>
                        <sf:password path="password" size="30" showPassword="true"/>
                        <small>6 characters or more (be tricky!)</small>
                        <sf:error path="password" cssClass="error"/>
                    </td>
                </tr>

//email field
                <tr>
                    <th><label for="user_email">Email Address:</label></th>
                    <td>
                        <sf:input path="email" size="30"/>
                        <small>In case you forget something</small>
                        <sf:error path="email" cssClass="error" />
                    </td>
                </tr>

//update-by-email checkbox
                <tr>
                    <th></th>
                    <td>
                        <sf:checkbox path="updateByEmail"/>
                        <label for="user_send_email_newsletter">Send me email updates!</label>
                    </td>
                </tr>
            </table>
        </fieldset>
    </sf:form>
</div>
