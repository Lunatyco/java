package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>    \n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s3\"></div>\n");
      out.write("            <div class=\"col s6\">\n");
      out.write("\n");
      out.write("                <div class=\"card-panel blue\">\n");
      out.write("                    <span class=\"white-text\"> Login\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <form action=\"TelefoniaServlet\" method=\"post\">\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"user\" type=\"text\" name=\"txtUsuario\" class=\"validate\">\n");
      out.write("                        <label for=\"user\">Usuario</label>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"input-field \">\n");
      out.write("                        <input id=\"clave\" type=\"password\" name=\"txtContrasena\" class=\"validate\">\n");
      out.write("                        <label for=\"clave\">Clave</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"btn waves-effect waves-light blue\" type=\"submit\" name=\"bt\" value=\"Ingresar\">Ingresar\n");
      out.write("                    </button> \n");
      out.write("                </form>\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <input disabled id=\"msj\" type=\"text\" name=\"txtMsj\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"red-text\">\n");
      out.write("                    <label for=\"msj\"></label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s3\">\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
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
}
