package com.example.rt.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.rt.entity.ClusterInfoDO;
import com.example.rt.entity.Student;
import com.example.rt.mapper.ClusterInfoMapper;
import com.example.rt.service.ClusterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("resttemplate")
public class RestHander {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ClusterInfoService clusterInfoService;

    @Autowired
    private ClusterInfoMapper clusterInfoMapper;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
//        return restTemplate.getForObject("http://localhost:1235/student/findAll", Collection.class);
        return restTemplate.getForEntity("http://localhost:1235/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/ttt")
    public Object list() {
        return clusterInfoService.list();
    }

    @GetMapping("selectAll")
    public Collection<ClusterInfoDO> selectById(){
        QueryWrapper<ClusterInfoDO> queryWrapper = new QueryWrapper<ClusterInfoDO>();
//        queryWrapper.eq("name", "1");
        queryWrapper.lambda().eq(ClusterInfoDO::getIpAddr, "1");
        return clusterInfoMapper.selectList(queryWrapper);
    }

}
