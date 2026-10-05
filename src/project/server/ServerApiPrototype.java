package project.server;

import project.annotations.NetworkAPIPrototype;
import project.server.data.DataDestination;
import project.server.data.DataOutputFormat;
import project.server.data.DataSource;
import project.server.job.JobRequest;
import project.server.job.JobResult;
import project.server.job.JobStatus;

public class ServerApiPrototype {

    @NetworkAPIPrototype
    public void prototype(ServerApi server) {
        JobRequest request = new JobRequest(
                new DataSource("sftp://server/input.csv"),
                new DataDestination("./output.csv"),
                new char[] { ';' },
                DataOutputFormat.CSV);

        JobResult result = server.runJob(request);
        if (result.getStatus() == JobStatus.SUCCESS) {
            System.out.println("Job successful: " + result.getResult());
        } else if (result.getStatus() == JobStatus.REJECTED) {
            System.out.println("Job rejected: " + result.getResult());
        } else {
            System.out.println("Job failed: " + result.getResult());
        }
    }
}