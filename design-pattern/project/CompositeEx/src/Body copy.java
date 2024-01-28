protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 1. servlet reads request parameters
	String customerId = request.getParameter("customerId");

	// 2-1). Do business logic and get a bean that contains result
	
 	// 2-2). Store the bean in the request context
    request.setAttribute("customer", customer);
    
    // forward the request to a jsp page
    String address;
    if (customer == null) {
      request.setAttribute("badId", customerId);
      address = "/error.jsp";
    } else  {
      address = "/success.jsp";
    } 

    // 3) Servlet invokes JSP page 
	RequestDispatcher dispatcher = request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
}
https://gmlwjd9405.github.io/2018/11/05/mvc-architecture.html