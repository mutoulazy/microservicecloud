package com.cloud.service;

import com.cloud.bean.Dept;
import java.util.List;

/**
 * Created by mutoulazy on 2018/7/26.
 */
public interface DeptService {

  public boolean add(Dept dept);

  public Dept get(Long id);

  public List<Dept> list();
}
