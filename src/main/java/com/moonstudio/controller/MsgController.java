package com.moonstudio.controller;

import com.moonstudio.jpa.MsgJpa;
import com.moonstudio.pojo.Msg;
import com.moonstudio.util.MsgUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.annotations.Cacheable;

import java.util.List;

@RestController
@RequestMapping(value = "/msg", method = RequestMethod.POST)
@Api(tags = "消息相关接口", description = "提供消息相关的 Rest API")
public class MsgController {
    @Autowired
    private MsgJpa msgJpa;

    @ApiOperation("获取资源列表")
    @RequestMapping("/list")
    public List<Msg> list() {
        return msgJpa.findAll();
    }

    @ApiOperation("保存")
    @RequestMapping("/save")
    public Msg save(Msg entity) {
        return msgJpa.save(entity);
    }

    @ApiOperation("根据age获取短信内容")
    @RequestMapping("/getByAge/{age}")
    public List<Msg> getMsgByAge(@PathVariable(name = "age") String age) {
        return msgJpa.findByAge(age);
    }

    @ApiIgnore
    @ApiOperation(value = "测试方法")
    @GetMapping("/item/{id}")
    public Msg queryMsgById(@PathVariable(name = "id") Long id) {
        return MsgUtil.getMsgById(id);
    }

}
