package me.rldnd;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet");

        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        //생성자 메서드를 통한 접근이 아니다.(ioc)
        HelloService helloService = context.getBean(HelloService.class);



        resp.getWriter().println("<html>");
        resp.getWriter().println("<head>sample page");
        resp.getWriter().println("</head>");
        resp.getWriter().println("<body><h1>hello " + helloService.getName() + " servlet");
        resp.getWriter().println("</h1></body>");
        resp.getWriter().println("</html>");
    }

    private Object getName() {
        return getServletContext().getAttribute("name");
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }
}
