package me.rldnd;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebApplication implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        //@EnableWebMvc사용시 WebMvcConfigurationSupport에서 servletContext를 참조하기 때문에 등록해 주어야 한다.
        applicationContext.setServletContext(servletContext);
        applicationContext.register(WebConfig.class);
        applicationContext.refresh();

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        ServletRegistration.Dynamic app = servletContext.addServlet("abb",dispatcherServlet);
        app.addMapping("/app/*");
    }
}
