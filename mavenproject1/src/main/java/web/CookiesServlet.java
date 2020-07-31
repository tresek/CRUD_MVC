package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //supangamos el usuario entra por primera vez a nuestro sitio
        boolean nuevoUsuario = true;
        
        //obtenemos el arreglo de la cookies
        Cookie[] cookies = request.getCookies();
        
        //buscamos si ya exite una cookies creada anteriormente
        //LLamada visitanteRecurrente
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitateRecurrente") && c.getName().equals("SI")){
                    //Si ya existe la ccokie es porque es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "SI");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("mensaje: " + mensaje);
        out.close();
    }
}
