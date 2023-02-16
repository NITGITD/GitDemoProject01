<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color: red;text-align: center">Edit the employee Details</h1>
<form:form action="edit_employee" method="post" modelAttribute="emp">
<table align="center" border="0" bgcolor="cyan">
<tr>
    <td>Emp number::</td>
    <td><form:input path="empno" readonly="true"/></td>
  </tr>

  <tr>
    <td>Emp name::</td>
    <td><form:input path="ename"/></td>
  </tr>
    <tr>
    <td>Emp Job::</td>
    <td><form:input path="job"/></td>
  </tr>
    <tr>
    <td>Emp Salary::</td>
    <td><form:input path="sal"/></td>
  </tr>
    <tr>
    <td>Emp deptno::</td>
    <td><form:input path="deptno"/></td>
  </tr>
    <tr>
    <td><input type="submit" value="Edit Employee"></td>
    <td><input type="reset" value="cancel"></td>
  </tr>
  
</table>

</form:form>