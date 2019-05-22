package com.json.resumes.WSJsonResumes;

import com.json.resumes.WSJsonResumes.managers.ResumesRepository;
import com.json.resumes.WSJsonResumes.models.Award;
import com.json.resumes.WSJsonResumes.models.Basics;
import com.json.resumes.WSJsonResumes.models.Education;
import com.json.resumes.WSJsonResumes.models.Interest;
import com.json.resumes.WSJsonResumes.models.Language;
import com.json.resumes.WSJsonResumes.models.Location;
import com.json.resumes.WSJsonResumes.models.Profile;
import com.json.resumes.WSJsonResumes.models.Publication;
import com.json.resumes.WSJsonResumes.models.Reference;
import com.json.resumes.WSJsonResumes.models.Resume;
import com.json.resumes.WSJsonResumes.models.Skill;
import com.json.resumes.WSJsonResumes.models.Volunteer;
import com.json.resumes.WSJsonResumes.models.Work;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner{
    
//    private ResumesRepository resumesRepository;
//    
//    public DBSeeder(ResumesRepository resumesRepository){
//        this.resumesRepository = resumesRepository;
//    }

    @Override
    public void run(String... args) throws Exception {
        
//        Reference ref = new Reference("Jane Doe", "Reference...");
//        List<Reference> refL = new ArrayList();
//        refL.add(ref);
//        
//        List keywList = new ArrayList();
//        keywList.add("Ferrets");
//        keywList.add("Unicorns");
//        Interest inte = new Interest("Wildlife", keywList);
//        List<Interest> inteL = new ArrayList();
//        inteL.add(inte);
//        
//        Language lang = new Language("English", "Native Speaker");
//        List<Language> langL = new ArrayList();
//        langL.add(lang);
//        
//        List keyL = new ArrayList();
//        keyL.add("HTML");
//        keyL.add("CSS");
//        keyL.add("Javascript");
//        Skill sk = new Skill("Web Development", "Master", keyL);
//        List<Skill> skL = new ArrayList();
//        skL.add(sk);
//        
//        Publication pub = new Publication("Publication", "Company", "2014-10-01", "http://publication.com", "Description...");
//        List<Publication> pubL = new ArrayList();
//        pubL.add(pub);
//        
//        Award aw = new Award("Award", "2014-11-01", "Company", "There is no spoon.");
//        List<Award> awL = new ArrayList();
//        awL.add(aw);
//        
//        List courses = new ArrayList();
//        courses.add("DB1101 - Basic SQL");
//        Education ed = new Education("University", "Software Development", "Bachelor", "2011-03-01", "2013-12-01", "4.0", courses);
//        List<Education> edL = new ArrayList();
//        edL.add(ed);
//        
//        List highlights = new ArrayList();
//        highlights.add("Awarded 'Volunteer of the Month'");
//        Volunteer vol = new Volunteer("Organization", "Volunteer", "http://organization.com/", "2012-01-01", "2013-01-0", "Description...", highlights);
//        
//        List<Volunteer> volL = new ArrayList();
//        volL.add(vol);
//        
//        List high = new ArrayList();
//        high.add("Started the company");
//        Work wo = new Work("Company", "President", "http://company.com", "2013-01-01", "2014-01-01", "Description..", high);
//        List<Work> woL = new ArrayList();
//        woL.add(wo);
//        
//        Profile pro = new Profile("Twitter","john","http://twitter.com/john");
//        List proL = new ArrayList();
//        proL.add(pro);
//        
//        Location loc = new Location("2712 Broadway St", "CA 94115", "San Francisco", "US", "California");
//        
//        Basics bas = new Basics("21121121", "John Doe", "Programmer", "", "john@gmail.com", "(912) 555-4321", "http://johndoe.com", "A summary of John Doe...", loc, proL);
//        Resume resu1 = new Resume(bas, woL, volL, edL, awL, pubL, skL, langL, inteL, refL);
//
//        
//        this.resumesRepository.deleteAll();
//        this.resumesRepository.save(resu1);
    }
    
}
