<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces" prefix="af"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces/html" prefix="afh"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
%>
<f:view>
	<afh:html>
	<afh:head title="测试">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	</afh:head>
	<script>
	
	</script>
	<afh:body onkeydown="KeyDown();">
		<af:form>
			<af:showOneTab position="above">
				<af:showDetailItem 	text="">
					<af:table
						value="#{contactForm.contactList}" banding="row"
						var="contact" id="salesCommissionDetailTable" styleClass="leftside" varStatus="index"
						width="300" rows="20" 	onkeydown="autoChecked();" onclick="autoChecked();">
						<!-- 序号 -->
						<af:column headerText="序号" width="20px">
							<af:panelHorizontal>
								<af:outputText value="#{index.index+1}" />
							</af:panelHorizontal>
						</af:column>
						<af:column headerText="姓名" width="80px">
							<af:panelHorizontal>
								<af:outputText value="#{contact.name}" />
							</af:panelHorizontal>
						</af:column>
						<af:column headerText="年龄" width="50px">
							<af:panelHorizontal>
								<af:outputText value="#{contact.age}" />
							</af:panelHorizontal>
						</af:column>
						<af:column headerText="邮箱" width="80px">
							<af:panelHorizontal>
								<af:outputText value="#{contact.email}" />
							</af:panelHorizontal>
						</af:column>
					</af:table>
				</af:showDetailItem>
			</af:showOneTab>
		</af:form>
	</afh:body>
	</afh:html>
</f:view>