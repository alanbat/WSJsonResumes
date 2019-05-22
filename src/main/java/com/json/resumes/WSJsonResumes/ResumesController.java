package com.json.resumes.WSJsonResumes;

import com.json.resumes.WSJsonResumes.managers.ResumesRepository;
import com.json.resumes.WSJsonResumes.models.Resume;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alan Battistelli
 */
@RestController
@RequestMapping("/JResumes")
public class ResumesController {
    
    private ResumesRepository resumeRepository;
    
    public ResumesController(ResumesRepository resumeRepository){
        this.resumeRepository = resumeRepository;
    }
    
    @RequestMapping("/all")
    public List<Resume> getAll(){
        List<Resume> resumes = this.resumeRepository.findAll();
        
        return resumes;
    }
    
    @PutMapping
    public void insert(@RequestBody Resume resume){
        this.resumeRepository.insert(resume);
    }
    
    @PostMapping
    public void update(@RequestBody Resume resume){
        this.resumeRepository.save(resume);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.resumeRepository.deleteById(id);
    }
    
    @GetMapping("/{id}")
    public Optional<Resume> getById(@PathVariable("id") String id){
        Optional<Resume> resume = this.resumeRepository.findByIds(id);
        
        return resume;
    }
    
    @GetMapping("/name/{name}")
    public List<Resume> getByName(@PathVariable("name") String name){
        List<Resume> resumeList = this.resumeRepository.findByName(name);
        
        return resumeList;
    }
}
