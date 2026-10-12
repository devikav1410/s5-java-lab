# Module 4 - Servlets, JSP & MVC Architecture Lab

1. **Simple MVC Application** [orig. Roll 23, Q1]
   Develop a simple Student Management application following Model-View-Controller architecture.
   - Folder: `q1_simple_mvc/`
   - Files: `Student.java`, `StudentController.java`, `student_view.jsp`

2. **MVC CRUD Application** [orig. Roll 23, Q2]
   Develop an MVC-based application to add, view, update and delete student records using JSP, Servlet and JDBC.
   - Folder: `q2_mvc_crud/`
   - Files: `Student.java`, `StudentCRUDController.java`, `student_crud.jsp`

3. **Basic Servlet** [orig. Roll 23, Q3]
   Create a Servlet that displays student information and deploy it on a servlet container such as Apache Tomcat.
   - Folder: `q3_basic_servlet/`
   - File: `BasicServlet.java`

4. **Servlet Life Cycle** [orig. Roll 23, Q4]
   Create a Servlet demonstrating the init(), service() and destroy() life-cycle methods and display messages showing when each method is executed.
   - Folder: `q4_servlet_lifecycle/`
   - File: `ServletLifeCycle.java`

5. **GenericServlet and HttpServlet** [orig. Roll 24, Q1]
   Create one Servlet using GenericServlet and another using HttpServlet, and demonstrate their differences.
   - Folder: `q5_generic_and_http_servlet/`
   - Files: `GenericServletDemo.java`, `HttpServletDemo.java`

6. **GET, POST and HEAD Requests** [orig. Roll 24, Q2]
   Create an HTML form and Servlet that handles GET and POST requests. Implement a response for a HEAD request and demonstrate the differences.
   - Folder: `q6_get_post_head/`
   - Files: `GetPostHeadServlet.java`, `requests.html`

7. **Servlet Request and Response** [orig. Roll 24, Q3]
   Create a Servlet that reads parameters from an HTML form and generates an appropriate HTML response using HttpServletRequest and HttpServletResponse.
   - Folder: `q7_request_and_response/`
   - Files: `RequestResponseServlet.java`, `form.html`

8. **Servlet Error Handling** [orig. Roll 25, Q1]
   Create a Servlet that intentionally generates an error and implement a custom error page using appropriate Servlet/web configuration.
   - Folder: `q8_servlet_error_handling/`
   - Files: `ErrorServlet.java`, `error.jsp`

9. **Servlet Security** [orig. Roll 25, Q2]
   Develop a simple login application with protected resources where only authenticated users can access a particular Servlet or page.
   - Folder: `q9_servlet_security/`
   - Files: `login.html`, `LoginServlet.java`, `ProtectedServlet.java`

10. **Servlet Chaining** [orig. Roll 25, Q3]
    Create two Servlets where the first Servlet processes a request and forwards or includes the request to the second Servlet using RequestDispatcher.
    - Folder: `q10_servlet_chaining/`
    - Files: `ServletOne.java`, `ServletTwo.java`

11. **Cookies** [orig. Roll 26, Q1]
    Create a Servlet application that stores the user's name or preferences in a cookie and retrieves the information during subsequent requests.
    - Folder: `q11_cookies/`
    - Files: `SetCookieServlet.java`, `GetCookieServlet.java`

12. **Session Tracking** [orig. Roll 26, Q2]
    Develop a simple shopping cart/session-based application using HttpSession to maintain user information across multiple requests.
    - Folder: `q12_session_tracking/`
    - File: `CartSessionServlet.java`

13. **Basic JSP & JSP Life Cycle** [orig. Roll 26, Q3]
    Create a JSP page that displays dynamic student information and demonstrate the JSP translation, compilation and execution process.
    - Folder: `q13_jsp_lifecycle/`
    - File: `student_lifecycle.jsp`

14. **JSP Expressions and Declarations** [orig. Roll 26, Q4]
    Create a JSP page that uses declarations and expressions to calculate and display student marks, total and average.
    - Folder: `q14_jsp_expressions_declarations/`
    - File: `marks_calc.jsp`

15. **JSP Directives** [orig. Roll 27, Q1]
    Create JSP pages demonstrating important page directive attributes such as import, contentType and errorPage.
    - Folder: `q15_jsp_directives/`
    - Files: `directives_demo.jsp`, `error_page.jsp`

16. **JSP Actions** [orig. Roll 27, Q2]
    Create a JSP application demonstrating standard JSP actions such as jsp:include, jsp:forward, jsp:useBean, jsp:setProperty and jsp:getProperty.
    - Folder: `q16_jsp_actions/`
    - Files: `StudentBean.java`, `header.jsp`, `forward_target.jsp`, `actions_demo.jsp`

17. **JSP Implicit Objects** [orig. Roll 27, Q3]
    Develop a JSP page demonstrating commonly used implicit objects such as request, response, session, application, out, config, pageContext and exception.
    - Folder: `q17_jsp_implicit_objects/`
    - Files: `implicit_objects.jsp`, `error_page.jsp`

18. **Standard Tag Library (JSTL)** [orig. Roll 28, Q1]
    Create a JSP application using JSTL tags for conditions, iteration and formatting, including c:if, c:forEach, c:choose, c:when and c:otherwise.
    - Folder: `q18_jstl/`
    - File: `jstl_demo.jsp`

19. **Custom Tag Library** [orig. Roll 28, Q2]
    Create a custom JSP tag that performs a reusable operation such as displaying student information, formatting text or generating a message, using a custom tag handler and TLD file.
    - Folder: `q19_custom_tag_library/`
    - Files: `StudentTag.java`, `studenttag.tld`, `custom_tag_demo.jsp`

20. **JSP Expression Language (EL)** [orig. Roll 28, Q3]
    Develop a JSP application using Expression Language (EL) to access JavaBean properties, request parameters, session attributes, etc.
    - Folder: `q20_jsp_expression_language/`
    - Files: `StudentBean.java`, `el_demo.jsp`

---

## Deployment Configuration
- `web.xml` (Root configuration descriptor for Apache Tomcat)
