package com.oyo.demo.server;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.oyo.demo.RPCDateService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;

@Controller
public class RPCDateServiceImpl implements RPCDateService.Iface {

    @Override
    public String getDate(String userName) throws TException{
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String nowTime = simpleDateFormat.format(now);
        return "Hello " + userName + "\n" + nowTime;
    }
}
