package cn.js.today.web.rest;

import cn.js.today.domain.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

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
public class logsResource {

    private final Logger logger = LoggerFactory.getLogger(logsResource.class);

    @PostMapping("/logs")
    @ResponseBody
    public ResponseEntity<ResponseBean> createLogs(@RequestBody Log log) throws URISyntaxException {
        logger.debug("REST request to save Log : {}", log);
        return new ResponseEntity<ResponseBean>(HttpStatus.OK);

    }


}
