package com.zking.service;

import com.zking.model.Model;

import java.util.List;

public interface ModelService {

    /**
     * 查询所有model
     * @return
     */
    List<Model> queryModel();

    /**
     * 根据id查询model
     * @param Id
     * @return
     */
    List<Model> queryModelId(String Id);
}