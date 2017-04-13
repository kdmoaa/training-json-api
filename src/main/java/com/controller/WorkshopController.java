package com.controller;

import com.form.Event;
import com.form.ResultSet;
import com.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fujiwara_shuhei_gn on 2017/04/13.
 */
@Controller
public class WorkshopController {

    @Autowired
    private WorkshopService workshopService;

    @RequestMapping(value = "/workshop", method = RequestMethod.GET)
    public ModelAndView workshop() {
        ResultSet result = workshopService.loadWorkshops();
        Event event = result.getEvents()[0];

        return new ModelAndView("workshop/input", "result", event.toString());
    }
}
