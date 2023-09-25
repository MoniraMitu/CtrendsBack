package com.mitu.cTrendsBackend.controller;

import com.mitu.cTrendsBackend.entity.Dept;
import com.mitu.cTrendsBackend.entity.Emp;
import com.mitu.cTrendsBackend.service.DeptService;
import com.mitu.cTrendsBackend.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin
public class DeptController {
    @Autowired
    private DeptService ds;

    @PostMapping("dept")
    public void saveData(@RequestBody Dept d){
        ds.create(d);


    }

    @GetMapping("dept")
    public List<Dept> getAllDept(){
        return ds.getAllDept();
    }

    @GetMapping("dept/{id}")
    public Dept getById(@PathVariable Long id){
        return ds.getById(id);
    }

    @PutMapping("dept")
    public void Update (@RequestBody Dept d,Long id){
        ds.update(d,id);
    }

    @DeleteMapping("dept/{id}")
    public void delete (@PathVariable Long id){
        ds.delete(id);
    }
}
