package com.parv.jobportal.job;

import java.util.List;

public interface JobService {

    List<Job> findAll();

    boolean createJob(Job jobData);

    Job findByJobId(long id);

    String deleteJob(long id);

    Job updatejob(long id, Job prevJob);
}
