package com.zking.mapper;

import com.zking.model.Model;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelMapper {

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