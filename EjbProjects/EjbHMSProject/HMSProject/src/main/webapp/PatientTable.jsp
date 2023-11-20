<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h:form>
        		<center>
                <h2><h:outputText value="Patient Records"/></h2>
            </center>
        <h:dataTable value="#{ejbImpl.showPatientEjb()}" var="e" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Patient id" />
                    </f:facet>
                    <h:outputText value="#{e.pid}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Patient Name" />
                    </f:facet>
                    <h:outputText value="#{e.name}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Age" />
                    </f:facet>
                    <h:outputText value="#{e.age}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Weight" />
                    </f:facet>
                    <h:outputText value="#{e.weight}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Gender" />
                    </f:facet>
                    <h:outputText value="#{e.gender}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="address" />
                    </f:facet>
                    <h:outputText value="#{e.address}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Phoneno" />
                    </f:facet>
                    <h:outputText value="#{e.phoneno}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Disease" />
                    </f:facet>
                    <h:outputText value="#{e.disease}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Doctor id" />
                    </f:facet>
                    <h:outputText value="#{e.doctor_id}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Search" />
                    </f:facet>
        <h:commandButton action="#{ejbImpl.searchEjb(e.pid)}" value="Search" />
                </h:column>
                
        </h:dataTable>
        
        </h:form>
    </body>
</html>
</f:view>
