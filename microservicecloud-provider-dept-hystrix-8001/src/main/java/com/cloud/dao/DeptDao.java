package com.cloud.dao;

import com.cloud.bean.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mutoulazy on 2018/7/26.
 */
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();
}
