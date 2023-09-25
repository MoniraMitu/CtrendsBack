package com.mitu.cTrendsBackend.controller;

import com.mitu.cTrendsBackend.entity.Emp;
import com.mitu.cTrendsBackend.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService es;

    @PostMapping("emp")
    public void saveData(@RequestBody Emp e){
        es.create(e);
    }

    @GetMapping("emp")
    public List<Emp> getAllEmp(){
        return es.getAllEmp();
    }

    @GetMapping("emp/{id}")
    public Emp getById(@PathVariable Long id){
        return es.getById(id);
    }

    @PutMapping("emp/{id}")
    public void Update (@PathVariable Long id, @RequestBody Emp e){
        es.update(e,id);
    }

    @DeleteMapping("emp/{id}")
    public void delete (@PathVariable Long id){
        es.delete(id);
    }

}
