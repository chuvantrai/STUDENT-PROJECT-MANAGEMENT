<%-- 
    Document   : SettingDetail
    Created on : May 12, 2022, 11:14:32 AM
    Author     : admin
--%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Setting Detail</title>

    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/home/plugins/fontawesome-free/css/all.min.css">
    <!-- jsGrid -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/home/plugins/jsgrid/jsgrid.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/home/plugins/jsgrid/jsgrid-theme.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/home/dist/css/adminlte.min.css">
    <%@include file="../home/HeaderLink.jsp" %>
</head>

<body class="layout-top-nav sidebar-closed sidebar-collapse">
    <%@include file="../home/Header.jsp" %>
    <c:if test="${requestScope.tag eq 'update'}">
        <c:set value="${requestScope.setting}" var="s"/>
        <div class="container h-100">
            <div class="row h-100 justify-content-center align-items-center" >
                <form class='card p-3 bg-light' method="post" action="setting">
                    <h2 class="text-uppercase"> Setting details </h2>
                    <input value="update" name="tag" hidden/>
                    <input type="text" value="${requestScope.id}" name="settingId" hidden />
                    <div class="form-row">
                        <small>Type*</small><br>
                        <select class="form-control" name="typeId">
                            <c:forEach items="${requestScope.listType}" var="t">
                                <option value="${t.key}" ${s.typeId == t.key ?"selected":""}>${t.value}</option>
                            </c:forEach>
                        </select> 
                    </div>
                    <div class="form-row">
                        <small>Title*</small>
                        <input type="text" name="settingTitle" maxlength="20" value="${s.settingTitle}" class="form-control" id="validationDefault03" required>
                    </div>
                    <div class="form-row">
                        <small>Value</small>
                        <input type="text" name="settingValue" maxlength="20" value="${s.settingValue}" class="form-control" id="validationDefault03" >                      
                    </div>
                    <div class="form-row">
                        <div class="col-md-6" style="margin-right: 40px;">
                            <small>Order*</small>
                            <input type="number" class="form-control" name="displayOrder" 
                                   value="${s.displayOrder}" required>
                        </div>
                        <div class="col-md-4 mb-3">
                            <small>Status*</small><br>
                            <input type="radio" name="status" ${s.status==true ? "checked":""} value="1">Active   &nbsp;&nbsp;
                            <input type="radio" name="status" ${s.status==false ? "checked":""} value="0">Inactive
                        </div> 
                    </div>
                    <div class="form-group">
                        <small>Description</small><br>
                        <div class="col-12">
                            <textarea rows="3" cols="80" maxlength="200" name="note">${s.note}</textarea>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                </form>
            </div>
        </div>

    </c:if>
    <c:if test="${requestScope.tag eq 'add'}">
        <div class="container h-100">
            <div class="row h-100 justify-content-center align-items-center">
                <form class = 'card p-3 bg-light' method="post" action="setting">
                    <input value="add" name="tag" hidden/>
                    <h1> Setting Add </h1>
                    <div class="form-row">
                        <small>Type*</small><br>
                        <select class="form-control" name="typeId">
                            <c:forEach items="${requestScope.listType}" var="t">
                                <option value="${t.key}">${t.value}</option>
                            </c:forEach>
                        </select> 
                    </div>
                    <div class="form-row">
                        <small>Title*</small>
                        <input type="text" name="settingTitle" maxlength="20" class="form-control" id="validationDefault03" required>
                    </div>
                    <div class="form-row">
                        <small>Value</small>
                        <input type="text" maxlength="20" name="settingValue" class="form-control" id="validationDefault03">                      
                    </div>
                    <div class="form-row">
                        <div class="col-md-5 mb-3">
                            <small>Order*</small>
                            <input type="number" class="form-control" name="displayOrder" required>
                        </div>
                        <div class="col-md-4 mb-3">
                            <small>Status</small><br>
                            <input type="radio" name="status" checked value="1">Active   &nbsp;&nbsp;
                            <input type="radio" name="status" value="0">Inactive
                        </div>  
                    </div>
                    <div class="form-group">
                        <small>Description</small><br>
                        <div class="col-12">
                            <textarea rows="3" maxlength="200" cols="80" name="note"></textarea>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary"> Add </button>
                </form>
            </div>
        </div>
    </c:if>
    <%@include file="../home/Footer.jsp" %>
</body>
</html>
