/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-09-05 00:47:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.WebEditors;
import org.openxava.model.meta.MetaProperty;
import org.openxava.view.View;
import org.openxava.util.XavaPreferences;

public final class collectionTotals_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/danie/Desktop/New%20folder/openxava-studio-7-r3/workspace/libreria/target/libreria/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("jar:file:/C:/Users/danie/Desktop/New%20folder/openxava-studio-7-r3/workspace/libreria/target/libreria/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153403082000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1725367725714L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1718411764000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1718411762000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.web.WebEditors");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject");
View view = (View) context.get(request, viewObject);
String collectionName = request.getParameter("collectionName");
View subview = view.getSubview(collectionName);
String idCollection = org.openxava.web.Collections.id(request, collectionName);
String propertyPrefix = request.getParameter("propertyPrefix");
String collectionPrefix = propertyPrefix == null?collectionName + ".":propertyPrefix + collectionName + ".";
String collectionArgv=",collection="+collectionName; 

boolean elementCollection = subview.isRepresentsElementCollection(); 
int additionalTotalsCount = subview.getCollectionTotalsCount();
for (int i=0; i<additionalTotalsCount; i++) {

      out.write("\n");
      out.write("	<tr class=\"");
      out.print(style.getTotalRow());
      out.write("\">\n");
      out.write("	");
 if (!(subview.isRepresentsElementCollection() && !subview.isCollectionEditable())) { 
      out.write("\n");
      out.write("		<td/>\n");
      out.write("		");
 if (!subview.getMetaCollection().isElementCollection()) { 
      out.write("\n");
      out.write("		<td/>\n");
      out.write("		");
 } 
      out.write('\n');
      out.write('	');
 } 
      out.write('	');
      out.write('\n');

java.util.Iterator it = subview.getMetaPropertiesList().iterator(); 
for (int c = 0; it.hasNext(); c++) {
	MetaProperty p = (MetaProperty) it.next();
	String align =p.isNumber() && !p.hasValidValues()?"ox-text-align-right":"";
	if (subview.hasCollectionTotal(i, c)) {
	
      out.write(" 	\n");
      out.write("	<td class=\"ox-total-cell ");
      out.print(align);
      out.write("\">	\n");
      out.write("	<div id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f0_reused = false;
      try {
        _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f0.setParent(null);
        // /xava/editors/collectionTotals.jsp(42,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fid_005f0.setName("collection_total_" + i + "_" + c + "_" + collectionPrefix);
        int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
        if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        _jspx_th_xava_005fid_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
      }
      out.write("\" class=\" ");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f1_reused = false;
      try {
        _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f1.setParent(null);
        // /xava/editors/collectionTotals.jsp(42,101) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fid_005f1.setName(idCollection);
        int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
        if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        _jspx_th_xava_005fid_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f1_reused);
      }
      out.write("_col");
      out.print(c);
      out.write("\">\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "collectionTotal.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("row", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(i), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("column", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(c), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("	</div>	\n");
      out.write("	</td>\n");
      out.write("	");

	}
	else if (i==0 && XavaPreferences.getInstance().isSummationInList() && subview.isCollectionTotalCapable(c)) { 
	
      out.write("\n");
      out.write("	<td class=\"ox-total-capable-cell\">\n");
      out.write("		<div class=\" ");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f2_reused = false;
      try {
        _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f2.setParent(null);
        // /xava/editors/collectionTotals.jsp(54,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005fid_005f2.setName(idCollection);
        int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
        if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        _jspx_th_xava_005fid_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f2_reused);
      }
      out.write("_col");
      out.print(c);
      out.write("\"> \n");
      out.write("			");
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f0 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      boolean _jspx_th_xava_005faction_005f0_reused = false;
      try {
        _jspx_th_xava_005faction_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005faction_005f0.setParent(null);
        // /xava/editors/collectionTotals.jsp(55,3) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005faction_005f0.setAction("CollectionTotals.sumColumn");
        // /xava/editors/collectionTotals.jsp(55,3) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_xava_005faction_005f0.setArgv("property="+p.getName() + collectionArgv);
        int _jspx_eval_xava_005faction_005f0 = _jspx_th_xava_005faction_005f0.doStartTag();
        if (_jspx_th_xava_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f0);
        _jspx_th_xava_005faction_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005faction_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005faction_005f0_reused);
      }
      out.write("&nbsp;\n");
      out.write("		</div>	\n");
      out.write("	</td>\n");
      out.write("	");

	}
	else if (subview.hasCollectionTotal(i, c + 1) && (i > 0 || !subview.hasCollectionSum(c + 1))) { 	
	
      out.write("\n");
      out.write("	<td class=\"ox-total-label-cell\">\n");
      out.write("		");
      out.print(subview.getCollectionTotalLabel(i, c + 1));
      out.write("&nbsp;\n");
      out.write("	</td>\n");
      out.write("	");
	
	}
	else {
	
      out.write("	 \n");
      out.write("	<td/>\n");
      out.write("	");
		
	}	
	if (elementCollection && subview.isLastSearchKey(p.getName())) { 
	
      out.write("\n");
      out.write("	<td/>	\n");
      out.write("	");
	
	}
}

      out.write("\n");
      out.write("</tr>\n");

} // for additionalTotalsCount 

      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
