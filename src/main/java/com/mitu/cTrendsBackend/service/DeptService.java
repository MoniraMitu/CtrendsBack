package com.mitu.cTrendsBackend.service;

import com.mitu.cTrendsBackend.entity.Dept;
import com.mitu.cTrendsBackend.entity.Emp;

import com.mitu.cTrendsBackend.repository.DeptDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptService {
    @Autowired
    private DeptDao dd;

    public void create (Dept d){
        dd.save(d);
    }

//    public void update (Emp e){
//        ed.save(e);
//    }

    public Dept update (Dept d,Long id){
        var existingDept=
                dd.findById(id).orElseThrow(() -> new IllegalArgumentException("Record not found by " + id));
        BeanUtils.copyProperties(d, existingDept, "id");
        return dd.save(existingDept);

    }

    public List<Dept> getAllDept(){
        return dd.findAll();
    }

    public Dept getById(Long id){
        return dd.findById(id).orElseThrow(() -> new IllegalArgumentException("Record not found by " + id));
    }

    public void delete(Long id){
        dd.deleteById(id);
    }
}
