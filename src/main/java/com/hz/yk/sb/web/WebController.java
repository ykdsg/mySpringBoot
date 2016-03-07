package com.hz.yk.sb.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wuzheng.yk on 16/3/7.
 */
@Controller
public class WebController {
    private static final Logger log = LoggerFactory.getLogger(WebController.class);

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        log.info("---->进入index页");
        log.error("------>输出错误日志");
        return "index";
    }
}
