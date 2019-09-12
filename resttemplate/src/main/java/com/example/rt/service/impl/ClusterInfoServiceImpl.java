package com.example.rt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rt.entity.ClusterInfoDO;
import com.example.rt.mapper.ClusterInfoMapper;
import com.example.rt.service.ClusterInfoService;
import org.springframework.stereotype.Service;

@Service
public class ClusterInfoServiceImpl extends ServiceImpl<ClusterInfoMapper, ClusterInfoDO> implements ClusterInfoService {
}
