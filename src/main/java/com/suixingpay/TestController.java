package com.suixingpay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chiyajing on 2017/7/26.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    //list sadfdasfdasfsad
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list() {
            //d f fixfsdaf fsadf
1111
www
     return "test list";

    }
}
