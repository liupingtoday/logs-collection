package cn.js.today.web.rest;

import cn.js.today.domain.Log;
import cn.js.today.domain.MobileLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Simple to Introduction
 *
 * @Description: 一句话描述该类的功能
 * @Author: liuping
 * @Since 2019-12-18
 * @UpdateUser: liuping
 * @UpdateDate: 2019-12-18
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
@RestController
@RequestMapping("/api")
public class LogsResource {

    private final Logger logger = LoggerFactory.getLogger(LogsResource.class);

    @PostMapping("/logs")
    @ResponseBody
    public ResponseEntity<ResponseBean> createLogs(@RequestBody Log log) {
        logger.info("REST request to save Log : {}", log);
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode("0000");
        responseBean.setMsg("success");
        return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);

    }

    @PostMapping("/logs/mobileLog")
    @ResponseBody
    public ResponseEntity<ResponseBean> createMobileLogs(@RequestBody MobileLog mobileLog) {
        logger.info("REST request to save Log : {}", mobileLog);
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode("0000");
        responseBean.setMsg("success");
        return new ResponseEntity<ResponseBean>(responseBean, HttpStatus.OK);

    }

}
