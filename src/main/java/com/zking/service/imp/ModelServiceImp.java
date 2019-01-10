package com.zking.service.imp;

import com.zking.mapper.ModelMapper;
import com.zking.model.Model;
import com.zking.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImp implements ModelService {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Model> queryModel() {
        return modelMapper.queryModel();
    }

    @Override
    public List<Model> queryModelId(String Id) {
        return modelMapper.queryModelId(Id);
    }
}
