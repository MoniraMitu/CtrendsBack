package com.mitu.cTrendsBackend.service;

import com.mitu.cTrendsBackend.entity.Emp;
import com.mitu.cTrendsBackend.repository.EmpDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpDao ed;

    public void create (Emp e){
        ed.save(e);
    }

//    public void update (Emp e){
//        ed.save(e);
//    }

    public Emp update (Emp e,Long id){
        var existingEmp=
                ed.findById(id).orElseThrow(() -> new IllegalArgumentException("Record not found by " + id));
        BeanUtils.copyProperties(e, existingEmp, "id");
        return ed.save(existingEmp);

    }

    public List<Emp> getAllEmp(){
        return ed.findAll();
    }

    public Emp getById(Long id){
        return ed.findById(id).orElseThrow(() -> new IllegalArgumentException("Record not found by " + id));
    }

    public void delete(Long id){
     ed.deleteById(id);
    }



}


