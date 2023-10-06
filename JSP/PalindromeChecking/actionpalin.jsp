<html>
  <head>
    <title>Palinchecking</title>
  </head>
  <body>
    <% int n,p,num1,rev=0%>
    <%
        n=Integer.parseInt(request.getParameter("string"));
        num1=n;
        while(num1>0)
          {
            p=n%10;
            rev=10*rev+p;
            num1=num1/10;
          }
        if(rev==n)
        {
          out.println("Entered number is palindrome");
        }
        else
        {
          out.println("Entered number is not Palindrome");
        }
    %>
  </body>
</html>
