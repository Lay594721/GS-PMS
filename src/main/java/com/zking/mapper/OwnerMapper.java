package com.zking.mapper;

import com.zking.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerMapper {
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