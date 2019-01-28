package com.oyo.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/today")
public class RPCController {
    @Autowired
    private RPCThriftClient rpcThriftClient;

    @RequestMapping(value = "/thrift", method = RequestMethod.GET)
    public String thriftTest(HttpServletRequest request, HttpServletResponse response) {
        try {
            rpcThriftClient.open();
            return rpcThriftClient.getRPCThriftService().getDate("ankitsingh26");
        } catch (Exception e) {
            return "error";
        } finally {
            rpcThriftClient.close();
        }
    }
}
