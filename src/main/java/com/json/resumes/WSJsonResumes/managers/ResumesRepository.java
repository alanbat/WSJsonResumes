package com.json.resumes.WSJsonResumes.managers;

import com.json.resumes.WSJsonResumes.models.Resume;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumesRepository extends MongoRepository<Resume, String>{
    
    @Query(value = "{_id:?0}")
    Optional<Resume> findByIds(String id);
    
    @Query(value = "{'_basics._name':?0}")
    List<Resume> findByName(String name);
}
