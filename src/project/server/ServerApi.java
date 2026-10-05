package project.server;

import project.annotations.NetworkAPI;
import project.server.job.JobRequest;
import project.server.job.JobResult;

@NetworkAPI
public interface ServerApi {
    JobResult runJob(JobRequest job);
}