package com.foucrazy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowMessage implements Controller{
	private final Logger LOGGER = Logger.getLogger(ShowMessage.class);
	
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		LOGGER.debug("default");
		return new ModelAndView("showMessage");
	}

}
