package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //debemos leer lo que se envia del formulario
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        System.out.println("usuario: " + usuario);
        System.out.println("password: " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro de usuario es: " + usuario);
        out.print("<br/>");
        out.print("El parametro de password es: " + password);
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");
        
        
    }
    
    
    
}
