package bg.softuni.plainwebapp;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/hello-servlet")
public class HelloFilter implements Filter {

    // ---> Filter --> Servlet -> Browser
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("username", "Emo");
        chain.doFilter(request, response);
    }
}
