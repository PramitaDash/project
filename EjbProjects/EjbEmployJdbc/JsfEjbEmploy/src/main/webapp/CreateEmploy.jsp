<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h:form>
                <h2 style="text-align: center" class="col-sm-4">Create Your Record</h2>
            <hr/>
Employ No
                    <h:inputText id="empno" value="#{employ.empno}" /> <br/>
Employ Name
                    <h:inputText id="name" value="#{employ.name}" /> <br/>
Gender 
                    <h:inputText id="gender" value="#{employ.gender}" /> <br/>                    
Department 
                    <h:inputText id="dept" value="#{employ.dept}" /> <br/>
Designation
                    <h:inputText id="desig" value="#{employ.desig}" /> <br/>
Basic
                    <h:inputText id="basic" value="#{employ.basic}"/> <br/>
                    <h:commandButton value="Insert" 
                    	action="#{ejbImpl.addEmployEjb(employ)}" />
        
        </h:form>

</body>
</html>
</f:view>