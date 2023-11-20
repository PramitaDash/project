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
                <h2 style="text-align: center" class="col-sm-4">Insert Your Record</h2>
            <hr/>
AgentID
                    <h:inputText id="agentID" value="#{agent.agentID}" /> <br/>
Agent Name
                    <h:inputText id="name" value="#{agent.name}" /> <br/>
City 
                    <h:inputText id="city" value="#{agent.city}" /> <br/>                    
Gender
                    <h:inputText id="gender" value="#{agent.gender}" /> <br/>
MaritalStatus
                    <h:inputText id="maritalStatus" value="#{agent.maritalStatus}" /> <br/>
Premium
                    <h:inputText id="premium" value="#{agent.premium}"/> <br/>

                    <h:commandButton value="Insert" 
                    	action="#{ejbImpl.addAgentEjb(agent)}" />
        
        </h:form>

</body>
</html>
</f:view>