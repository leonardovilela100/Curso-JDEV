/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-03-08 05:10:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.principal;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class usuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Pre-loader start -->\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "theme-loader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Pre-loader end -->\r\n");
      out.write("	<div id=\"pcoded\" class=\"pcoded\">\r\n");
      out.write("		<div class=\"pcoded-overlay-box\"></div>\r\n");
      out.write("		<div class=\"pcoded-container navbar-wrapper\">\r\n");
      out.write("\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"pcoded-main-container\">\r\n");
      out.write("				<div class=\"pcoded-wrapper\">\r\n");
      out.write("\r\n");
      out.write("					");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbarmainmenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"pcoded-content\">\r\n");
      out.write("						<!-- Page-header start -->\r\n");
      out.write("\r\n");
      out.write("						");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "page-header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!-- Page-header end -->\r\n");
      out.write("						<div class=\"pcoded-inner-content\">\r\n");
      out.write("							<!-- Main-body start -->\r\n");
      out.write("							<div class=\"main-body\">\r\n");
      out.write("								<div class=\"page-wrapper\">\r\n");
      out.write("									<!-- Page-body start -->\r\n");
      out.write("									<div class=\"page-body\">\r\n");
      out.write("\r\n");
      out.write("										<div class=\"row\">\r\n");
      out.write("											<div class=\"col-sm-12\">\r\n");
      out.write("												<!-- Basic Form Inputs card start -->\r\n");
      out.write("												<div class=\"card\">\r\n");
      out.write("													<div class=\"card-block\">\r\n");
      out.write("														<h4 class=\"sub-title\">Cad. Usuário</h4>\r\n");
      out.write("\r\n");
      out.write("														<form class=\"form-material\"\r\n");
      out.write("															action=\"");
      out.print(request.getContextPath());
      out.write("/ServletUsuarioController\"\r\n");
      out.write("															method=\"post\" id=\"formUser\">\r\n");
      out.write("\r\n");
      out.write("															<input type=\"hidden\" name=\"acao\" id=\"acao\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"text\" name=\"id\" id=\"id\"\r\n");
      out.write("																	class=\"form-control\" readonly=\"readonly\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modolLogin.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <span\r\n");
      out.write("																	class=\"form-bar\"></span> <label class=\"float-label\">ID:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"text\" name=\"nome\" id=\"nome\"\r\n");
      out.write("																	class=\"form-control\" required=\"required\"\r\n");
      out.write("																	value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modolLogin.nome}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <span\r\n");
      out.write("																	class=\"form-bar\"></span> <label class=\"float-label\">Nome:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"email\" name=\"email\" id=\"email\"\r\n");
      out.write("																	class=\"form-control\" required=\"required\"\r\n");
      out.write("																	autocomplete=\"off\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modolLogin.email}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("																<span class=\"form-bar\"></span> <label\r\n");
      out.write("																	class=\"float-label\">E-mail:</label>\r\n");
      out.write("															</div>\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"text\" name=\"login\" id=\"login\"\r\n");
      out.write("																	class=\"form-control\" required=\"required\"\r\n");
      out.write("																	autocomplete=\"off\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modolLogin.login}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("																<span class=\"form-bar\"></span> <label\r\n");
      out.write("																	class=\"float-label\">Login</label>\r\n");
      out.write("															</div>\r\n");
      out.write("\r\n");
      out.write("															<div class=\"form-group form-default form-static-label\">\r\n");
      out.write("																<input type=\"password\" name=\"senha\" id=\"senha\"\r\n");
      out.write("																	class=\"form-control\" required=\"required\"\r\n");
      out.write("																	autocomplete=\"off\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${modolLogin.senha}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("																<span class=\"form-bar\"></span> <label\r\n");
      out.write("																	class=\"float-label\">Senha</label>\r\n");
      out.write("															</div>\r\n");
      out.write("\r\n");
      out.write("															<button type=\"button\"\r\n");
      out.write("																class=\"btn btn-primary waves-effect waves-light\"\r\n");
      out.write("																onclick=\"limparForm();\">Novo</button>\r\n");
      out.write("															<button class=\"btn btn-success waves-effect waves-light\">Salvar</button>\r\n");
      out.write("															<button type=\"button\"\r\n");
      out.write("																class=\"btn btn-info waves-effect waves-light\"\r\n");
      out.write("																onclick=\"criarDeleteComAjax();\">Excluir</button>\r\n");
      out.write("															<button type=\"button\" class=\"btn btn-warning\"\r\n");
      out.write("																data-toggle=\"modal\" data-target=\"#exampleModalUsuario\">\r\n");
      out.write("																Pesquisar</button>\r\n");
      out.write("														</form>\r\n");
      out.write("\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<span style=\"color: green; font-size: 30px\" id=\"msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									<!-- Page-body end -->\r\n");
      out.write("								</div>\r\n");
      out.write("								<div id=\"styleSelector\"></div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "javascriptfile.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"exampleModalUsuario\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"exampleModalLabel\">Pesquisa de\r\n");
      out.write("						usuário</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"input-group mb-3\">\r\n");
      out.write("						<input type=\"text\" class=\"form-control\" placeholder=\"Nome\"\r\n");
      out.write("							aria-label=\"nome\" id=\"nomeBusca\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("						<div class=\"input-group-append\">\r\n");
      out.write("							<button class=\"btn btn-success\" type=\"button\"\r\n");
      out.write("								onclick=\"buscarUsuario()\">Buscar</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("						<thead>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th scope=\"col\">Id</th>\r\n");
      out.write("								<th scope=\"col\">Nome</th>\r\n");
      out.write("								<th scope=\"col\">Ver</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Fechar</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		function buscarUsuario() {\r\n");
      out.write("\r\n");
      out.write("			var nomeBusca = document.getElementById('nomeBusca').value;\r\n");
      out.write("\r\n");
      out.write("			if (nomeBusca != null && nomeBusca != '' && nomeBusca.trim() != '') { // Validando que precisa ter valor para buscar no banco de dados\r\n");
      out.write("\r\n");
      out.write("				var urlAction = document.getElementById('formUser').action;\r\n");
      out.write("\r\n");
      out.write("				$.ajax({\r\n");
      out.write("\r\n");
      out.write("					method : \"get\",\r\n");
      out.write("					url : urlAction,\r\n");
      out.write("					data : \"nomeBusca=\" + nomeBusca + '&acao=buscarUserAjax',\r\n");
      out.write("					success : function(response) {\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("				}).fail(\r\n");
      out.write("						function(xhr, status, errorThrown) {\r\n");
      out.write("							alert('Erro ao buscar usuário por nome: '\r\n");
      out.write("									+ xhr.responseText);\r\n");
      out.write("						});\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function criarDeleteComAjax() {\r\n");
      out.write("\r\n");
      out.write("			if (confirm('Deseja realmente excluir os dados?')) {\r\n");
      out.write("\r\n");
      out.write("				var urlAction = document.getElementById('formUser').action;\r\n");
      out.write("				var idUser = document.getElementById('id').value;\r\n");
      out.write("\r\n");
      out.write("				$.ajax({\r\n");
      out.write("\r\n");
      out.write("					method : \"get\",\r\n");
      out.write("					url : urlAction,\r\n");
      out.write("					data : \"id=\" + idUser + '&acao=deletarajax',\r\n");
      out.write("					success : function(response) {\r\n");
      out.write("\r\n");
      out.write("						limparForm();\r\n");
      out.write("						document.getElementById('msg').textContent = response;\r\n");
      out.write("					}\r\n");
      out.write("\r\n");
      out.write("				}).fail(\r\n");
      out.write("						function(xhr, status, errorThrown) {\r\n");
      out.write("							alert('Erro ao deletar usuário por id: '\r\n");
      out.write("									+ xhr.responseText);\r\n");
      out.write("						});\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function criarDelete() {\r\n");
      out.write("\r\n");
      out.write("			if (confirm('Deseja realmente excluir os dados?')) {\r\n");
      out.write("\r\n");
      out.write("				document.getElementById(\"formUser\").method = 'get';\r\n");
      out.write("				document.getElementById(\"acao\").value = 'deletar';\r\n");
      out.write("				document.getElementById(\"formUser\").submit();\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function limparForm() {\r\n");
      out.write("\r\n");
      out.write("			var elementos = document.getElementById(\"formUser\").elements; /*Retorna os elementos html dentro do form*/\r\n");
      out.write("\r\n");
      out.write("			for (p = 0; p < elementos.length; p++) {\r\n");
      out.write("				elementos[p].value = '';\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
