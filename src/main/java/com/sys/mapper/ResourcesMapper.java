package com.sys.mapper;

import java.util.List;
import java.util.Map;

import com.sys.model.Resources;
import com.util.MyMapper;

public interface ResourcesMapper extends MyMapper<Resources> {

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}