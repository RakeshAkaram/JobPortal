package com.parv.jobportal.job.impl;

import com.parv.jobportal.job.Job;
import com.parv.jobportal.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    List<Job> jobs=new ArrayList<>();
    private int id=1;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public boolean createJob(Job jobData) {
        jobData.setId(id++);
        jobs.add(jobData);
        return true;
    }

    @Override
    public Job findByJobId(long id) {
        if(jobs!=null){
            for(Job job:jobs){
                if(job.getId()==id){
                    return job;
                }
            }
        }
        return null;
    }

    @Override
    public String deleteJob(long id) {
        String msg="Data not found to Delete";
        if(!jobs.isEmpty()){
            for(Job j:jobs){
                if((j.getId())==(id)){
                    msg="Job with id "+id+" with title "+j.getTitle()+" is deleted Successfull";
                    jobs.remove(j);
                    break;
                }
            }
        }
        else{
            msg="No Jobs exists to delete";
        }
        return msg;
    }

    @Override
    public Job updatejob(long id, Job currJob) {
        Job updatedJob=null;
        if(!jobs.isEmpty()){
            for(Job j:jobs){
                if(j.getId()==id){
                    j.setTitle(currJob.getTitle());
                    j.setDescription(currJob.getDescription());
                    j.setLocation(currJob.getLocation());
                    j.setMinPay(currJob.getMinPay());
                    j.setMaxPay(currJob.getMaxPay());
                    j.setNoOfPositions(currJob.getNoOfPositions());
                    System.out.println("Job id:"+j.getId());
                    updatedJob=j;
                    updatedJob.setId(j.getId());
                    break;
                }
            }
        }
        return updatedJob;
    }
}
