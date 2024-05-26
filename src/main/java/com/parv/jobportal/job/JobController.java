package com.parv.jobportal.job;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/job")
    public List<Job> findAll(){
        return jobService.findAll();
    }

    @PostMapping("/job")
    public String createJob(@RequestBody Job jobData){
            if(jobService.createJob(jobData)){
                return "Job added Successfully";
            }
        return "Failed to add the data";
    }
    @GetMapping("/job/{id}")
    public Job findByJobId(@PathVariable long id){
        Job job=jobService.findByJobId(id);
        if(job!=null)
            return job;
        else return null;
    }
    @DeleteMapping("/job/{id}")
    public String deleteJob(@PathVariable long id){
        String msg=jobService.deleteJob(id);
        return msg;
    }
    @PutMapping("job/{id}/update")
    public Job updateJob(@PathVariable long id, @RequestBody Job job){
        Job prevJob=job;
        Job updatedJob =jobService.updatejob(id,prevJob);
        return job;
    }
}
/*
Get all the job details  -- Done
get job details by id  -- Done
create/post the job details  -- Done
delete job details by id  -- Done
update job details by id
* */
