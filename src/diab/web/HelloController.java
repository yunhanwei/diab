package diab.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Date;

public class HelloController implements Controller {
	
	private final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String now = (new Date()).toString();
		//want to pass data from sql -> hibernate dao -> helloservice -> helloctonroller -> jsp

		logger.info("Returning hello view" + now);
		return new ModelAndView("hello", "now", now);

	}
}

