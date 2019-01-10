package com.zking.service;

import com.zking.model.Owner;

import java.util.List;

public interface OwnerService {
    int deleteByPrimaryKey(String o_number);

    int insert(Owner record);

    Owner selectByPrimaryKey(String o_number);

    int updateByPrimaryKey(Owner record);

    /**
     * 查询全部业主
     * @return
     */
    List<Owner> queryOwnerList();


}