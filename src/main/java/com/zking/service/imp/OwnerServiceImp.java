package com.zking.service.imp;

import com.zking.mapper.OwnerMapper;
import com.zking.model.Owner;
import com.zking.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImp implements OwnerService {

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public int deleteByPrimaryKey(String o_number) {
        return 0;
    }

    @Override
    public int insert(Owner record) {
        return 0;
    }

    @Override
    public Owner selectByPrimaryKey(String o_number) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Owner record) {
        return 0;
    }

    @Override
    public List<Owner> queryOwnerList() {
        return ownerMapper.queryOwnerList();
    }
}
