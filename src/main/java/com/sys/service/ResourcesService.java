package com.sys.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.sys.model.Resources;

/**
 * Created by lhh on 2020/12/01
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}
