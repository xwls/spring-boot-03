package com.hwua.springboot03.controller;

import com.hwua.springboot03.controller.po.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.bind.ValidationEvent;
import java.util.*;

@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    ///hello?id=1&name=张三&email=zs@zs.com&age=18
    @RequestMapping("/hello")
    @ResponseBody
    public Object hello(@Validated Person person,BindingResult result){
        //获取是否校验失败
        boolean hasErrors = result.hasErrors();
        if (hasErrors){
            List<Map<String,Object>> errors = new ArrayList<>();
            //校验失败获取失败的校验信息
            List<FieldError> fieldErrors = result.getFieldErrors();
            //遍历校验的错误信息
            for (FieldError fieldError: fieldErrors) {
                Map<String,Object> error = new HashMap<>();
                //获取属性
                String field = fieldError.getField();
                //获取错误信息
                String defaultMessage = fieldError.getDefaultMessage();
                error.put("field",field);
                error.put("message",defaultMessage);
                //改动了部分代码
                errors.add(error);
            }
            return errors;
        }
        logger.debug(person.toString());
        return "Hello World !";
    }

}
