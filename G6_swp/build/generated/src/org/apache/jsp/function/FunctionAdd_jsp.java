package org.apache.jsp.function;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FunctionAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/function/../home/HeaderLink.jsp");
    _jspx_dependants.add("/function/../home/Header.jsp");
    _jspx_dependants.add("/function/../home/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Function Add</title>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(request.getContextPath());
      out.write("/imgs/home_img.png\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\">\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/fontawesome-free/css/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jqvmap/jqvmap.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("  <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/summernote/summernote-bs4.min.css\">\r\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"layout-top-nav sidebar-closed sidebar-collapse\">\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    <!-- Navbar -->\r\n");
      out.write("    <nav class=\"main-header navbar navbar-expand-md navbar-light navbar-white\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"\" class=\"navbar-brand\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/imgs/FPT.jpg\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8; height: 35px\">\r\n");
      out.write("                <span class=\"brand-text font-weight-light\">FPT Project</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Left navbar links -->\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("                    <a href=\"home\" class=\"nav-link\">Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_4.setPageContext(_jspx_page_context);
      _jspx_th_c_if_4.setParent(null);
      _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
          out.write("                    <li class=\"nav-item dropdown show\" style=\"padding-right: 10px;\">\r\n");
          out.write("                        <a href=\"#\" class=\"d-block nav-link\" data-toggle=\"dropdown\" aria-expanded=\"true\" style=\"padding-top: 5px;font-size: 20px; padding-right: 10px;color: #212529\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\r\n");
          out.write("                            ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_5.setPageContext(_jspx_page_context);
          _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
          _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.avatarLink == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
          if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                <img src=\"");
              out.print(request.getContextPath());
              out.write("/home/pages/comment.png\" alt=\"User Image\" style=\"height: 40px; width: 40px; border-radius: 25%\">\r\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
          out.write("\r\n");
          out.write("                            ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_6.setPageContext(_jspx_page_context);
          _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
          _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.avatarLink != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
          if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                                <img src=\"");
              out.print(request.getContextPath());
              out.write("/imgs/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.avatarLink}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\" alt=\"User Image\" style=\"height: 40px; width: 40px; border-radius: 25%\">\r\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
          out.write("\r\n");
          out.write("                        </a>\r\n");
          out.write("                        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\" style=\"left: inherit; right: 0px;\">\r\n");
          out.write("                            <span class=\"dropdown-item dropdown-header\">User features</span>\r\n");
          out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
          out.write("                            <a href=\"userprofile\" class=\"dropdown-item\">\r\n");
          out.write("                                <i class=\"bi bi-file-person-fill\" style=\"font-size: 21px;\"></i> User Profile\r\n");
          out.write("                            </a>\r\n");
          out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
          out.write("                            <a href=\"changepassword\" class=\"dropdown-item\">\r\n");
          out.write("                                <i class=\"bi bi-file-earmark-lock2-fill\" style=\"font-size: 21px;\"></i> Change Password\r\n");
          out.write("                            </a>\r\n");
          out.write("                            <div class=\"dropdown-divider\"></div>\r\n");
          out.write("                            <a href=\"logout\" class=\"dropdown-item\">\r\n");
          out.write("                                <i class=\"bi bi-box-arrow-right\" style=\"font-size: 21px;\"></i>  Log Out  \r\n");
          out.write("                            </a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </li>\r\n");
          out.write("                </ul>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div> \r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"main-sidebar elevation-4 sidebar-light-navy\">\r\n");
      out.write("        <!-- Brand Logo -->\r\n");
      out.write("        <a href=\"\" class=\"brand-link\">\r\n");
      out.write("            <img src=\"");
      out.print(request.getContextPath());
      out.write("/imgs/FPT.jpg\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\r\n");
      out.write("            <span class=\"brand-text font-weight-light\">FPT Project</span>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <div class=\"sidebar os-theme-dark\">\r\n");
      out.write("            <!-- Sidebar Menu -->\r\n");
      out.write("            <nav class=\"mt-2\">\r\n");
      out.write("                <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("                    <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("                         with font-awesome or any other icon font library -->\r\n");
      out.write("                    <li class=\"nav-item menu-open\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">\r\n");
      out.write("                            <i class=\"nav-icon fas fa-tachometer-alt\"></i>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                Dashboard\r\n");
      out.write("                                <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"nav nav-treeview\">\r\n");
      out.write("                            <!--Admin-->                \r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <!--Admin-->  \r\n");
      out.write("                            <!--Author-->\r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <!--Author-->\r\n");
      out.write("                            <!--Trainer-->\r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <!--Trainer--> \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- /.sidebar-menu -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.sidebar -->\r\n");
      out.write("    </aside>\r\n");
      out.write("\r\n");
      out.write("    <!-- Title -->\r\n");
      out.write("    <div class=\"content-wrapper\" style=\"min-height: 632px;\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"container\" style=\"padding-bottom: 16px; padding-top: 10px\">");
      out.write("\n");
      out.write("\n");
      out.write("        <!--        noi dung-->\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <section class=\"content\">\n");
      out.write("            <!-- Content Header (Page header) -->\n");
      out.write("            <section class=\"content-header\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col-sm-6 card-header\">\n");
      out.write("                            <h1 class=\"text-uppercase card-title\">Add new function</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!-- /.container-fluid -->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Main content -->\n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- left column -->\n");
      out.write("                        <div class=\"col-md-10\">\n");
      out.write("                            <!-- general form elements -->\n");
      out.write("                            <div class=\"card card-primary\">\n");
      out.write("                                <!-- /.card-header -->\n");
      out.write("                                <!-- form start -->\n");
      out.write("                                <form id=\"myform\" action=\"class\" method=\"post\" >\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Class code*</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.classCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'readonly':'required'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"background: white;\" />\n");
      out.write("                                           \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Subject</label>\n");
      out.write("                                            <select class=\"selectpicker form-control\" name=\"subject\">\n");
      out.write("                                                <option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"author\"&&tag==\"update\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Not assigned</option>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                               \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <input name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.classId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden/>\n");
      out.write("                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                <label>Trainer</label>\n");
      out.write("                                                <select class=\"selectpicker form-control\" name=\"trainer\">\n");
      out.write("                                                    <option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Not assigned</option>\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </select>  \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                <label>Term*</label>\n");
      out.write("                                                <select class=\"selectpicker form-control\" name=\"term\">                                                \n");
      out.write("                                                    <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.term==1? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Spring</option>\n");
      out.write("                                                    <option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.term==2? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Summer</option>\n");
      out.write("                                                    <option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.term==3? 'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Fall</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Year*</label>\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.classYear}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"year\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'readonly':'required'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" style=\"background: white;\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"form-group clearfix col-md-6\">\n");
      out.write("                                                <div class=\"icheck-success d-inline\">\n");
      out.write("                                                    <input name=\"bl5\" type=\"checkbox\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.block5Class==true? 'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" id=\"checkboxSuccess1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? \"onclick='return false;'\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                                    <label for=\"checkboxSuccess1\">\n");
      out.write("                                                        Block 5 class\n");
      out.write("                                                    </label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>                                         \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label>Status*</label> <br/>\n");
      out.write("                                                <input type=\"radio\" name=\"status\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(aclass.status==1 ||aclass.status==null )? \"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"1\" required>Active   &nbsp;&nbsp;\n");
      out.write("                                                <input type=\"radio\" name=\"status\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.status==2 ? \"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"2\">Closed  &nbsp;&nbsp;\n");
      out.write("                                                <input type=\"radio\" name=\"status\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.status==3 ? \"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"3\">Canceled\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <!-- /.card-body -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--        noi dung-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--noi dung-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("<!--noi dung-->\r\n");
      out.write("\r\n");
      out.write("<!-- /.content-wrapper -->\r\n");
      out.write("       <footer class=\"main-footer\" style=\"background-color: #f3f3f1; height: auto;\">\r\n");
      out.write("           <strong ><a href=\"\" style=\"color: #869099\">Introduce</a>  <a href=\"\" style=\"color: #869099; padding-left: 20px\">Question &amp; answer</a> <a href=\"\" style=\"color: #869099;padding-left: 20px\">Privacy Policy</a></strong>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"float-right d-none d-sm-inline-block\">\r\n");
      out.write("      <b> Connect with us</b> <i class=\"bi bi-facebook\"></i> <i class=\"bi bi-whatsapp\"></i> <i class=\"bi bi-youtube\"></i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"display: flex; border-top: 1px solid #6c757d; width: auto;\">\r\n");
      out.write("      <div style=\"width: 50% ; height: auto; padding-top: 15px; padding-left: 20px\">\r\n");
      out.write("        <strong style=\"color: #212529; font-size: 20px\">Address and contact information: </strong>\r\n");
      out.write("        <div style=\"width: 100%; height: 15px\"></div>\r\n");
      out.write("        <p><samp style=\"color: #212529;\"><i class=\"bi bi-telephone-fill\"></i> </samp>012345667</p>\r\n");
      out.write("        <p><samp style=\"color: #212529;\"><i class=\"bi bi-envelope-fill\"></i> </samp>funnyteam@gmail.com.edu</p>\r\n");
      out.write("        <p><samp style=\"color: #212529;\"><i class=\"bi bi-geo-alt-fill\"></i></samp> FPT University, KCN Hòa Lạc, Thạch Thất, Hà Nội</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"width: 50% ; height: auto; padding-top: 15px\" >\r\n");
      out.write("        <!--<strong style=\"color: #212529; font-size: 20px;\">Address: </strong>-->\r\n");
      out.write("        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6400.969411817355!2d105.52522669583932!3d21.01332388341186!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2zVHLGsOG7nW5nIMSQ4bqhaSBI4buNYyBGUFQ!5e0!3m2!1svi!2s!4v1654130804504!5m2!1svi!2s\" \r\n");
      out.write("                width=\"90%\" height=\"300\" style=\"\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   <div class=\"text-center p-1\" style=\"padding-bottom: 6px\">\r\n");
      out.write("    © 2022 Copyright:\r\n");
      out.write("    <a class=\"text-dark\" href=\"\">G6_SWP_SE1619</a>\r\n");
      out.write("  </div>\r\n");
      out.write("    \r\n");
      out.write("  </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <!-- jQuery UI 1.11.4 -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("        <script>\r\n");
      out.write("            $.widget.bridge('uibutton'; $.ui.button)\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- Bootstrap 4 -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <!-- ChartJS -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/chart.js/Chart.min.js\"></script>\r\n");
      out.write("        <!-- Sparkline -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/sparklines/sparkline.js\"></script>\r\n");
      out.write("        <!-- JQVMap -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jqvmap/jquery.vmap.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\r\n");
      out.write("        <!-- jQuery Knob Chart -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/jquery-knob/jquery.knob.min.js\"></script>\r\n");
      out.write("        <!-- daterangepicker -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("        <!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("        <!-- Summernote -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/summernote/summernote-bs4.min.js\"></script>\r\n");
      out.write("        <!-- overlayScrollbars -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\r\n");
      out.write("        <!-- AdminLTE App -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/dist/js/adminlte.js\"></script>\r\n");
      out.write("        <!-- AdminLTE for demo purposes -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/dist/js/demo.js\"></script>\r\n");
      out.write("        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/home/dist/js/pages/dashboard.js\"></script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("student");
    _jspx_th_c_set_0.setValue(new String("student"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.roleId != student&&sessionScope.useraccount != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                    <!--student-->\r\n");
        out.write("\r\n");
        out.write("                    </li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("student");
    _jspx_th_c_set_1.setValue(new String("student"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.roleId == student}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li class=\"nav-item dropdown\">\r\n");
        out.write("                            <a id=\"dropdownSubMenu1\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" class=\"nav-link dropdown-toggle\"> Dashboard </a>\r\n");
        out.write("\r\n");
        out.write("                            <!--student-->\r\n");
        out.write("                            <ul aria-labelledby=\"dropdownSubMenu1\" class=\"dropdown-menu border-0 shadow\" style=\"left: 0px; right: inherit;\">\r\n");
        out.write("                                <li><a href=\"featurelist\" class=\"dropdown-item\"> Feature List </a></li>\r\n");
        out.write("                                \r\n");
        out.write("                            </ul>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
        out.write("                    <li class=\"nav-item\" style=\"padding-right: 10px;\">\r\n");
        out.write("                        <a href=\"login\" ><button type=\"button\" class=\"btn btn-block btn-light\" >Login</button></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a href=\"registration\"><button type=\"button\" class=\"btn btn-block btn-light\" >Registration</button></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("                </ul>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("admin");
    _jspx_th_c_set_2.setValue(new String("admin"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.roleId == admin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"setting\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> System Settings </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"userlist\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> User List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"subject\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Subject List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"subjectsetting\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Subject Setting </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"iterationlist\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Iteration List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"class\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Class List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"evalcriteria\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Criteria List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("Author");
    _jspx_th_c_set_3.setValue(new String("author"));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.roleId == Author}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"subjectsetting\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Subject Setting </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"iterationlist\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Iteration List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"class\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Class List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"evalcriteria\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Criteria List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("Trainer");
    _jspx_th_c_set_4.setValue(new String("trainer"));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.useraccount.roleId == Trainer}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"class\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Class List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"classuser\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Class User List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"team\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Team List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"milestone\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Milestone List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li class=\"nav-item\">\r\n");
        out.write("                                    <a href=\"featurelist\" class=\"nav-link\">\r\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\r\n");
        out.write("                                        <p> Feature List </p>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subjectList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.subject.subjectId== s.key ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"author\"&&tag==\"update\"&&aclass.subject.subjectId!= s.key ? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trainerList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("t");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.trainer.userId== t.key ? \"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId==\"trainer\"? 'disabled':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId=='trainer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <a href=\"milestone?class=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aclass.classId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("&status=&from=&to=\" style=\"float:left;\"><h4>See class milestone <i class=\"fa fa-arrow-right\"></i></h4></a>  \n");
        out.write("                                                </div>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${useraccount.roleId!='trainer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"card-footer\">\n");
        out.write("                                            <button class=\"btn btn-primary\" type=\"reset\">Reset</button>\n");
        out.write("                                            <button type=\"submit\" class=\"btn btn-primary\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</button>\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }
}
