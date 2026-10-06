package project.server.job;

import project.server.data.DataDestination;
import project.server.data.DataSource;

public interface JobResult {

    DataSource getSource();

    DataDestination getDestination();

    Character[] getDelimiters();

    boolean hasCustomDelimiters();

    JobStatus getStatus();

    String getResult();

    String getErrorMessage();
}