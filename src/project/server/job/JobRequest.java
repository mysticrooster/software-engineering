package project.server.job;

import project.server.data.DataDestination;
import project.server.data.DataOutputFormat;
import project.server.data.DataSource;

public class JobRequest {
    private DataSource inputSource;
    private DataDestination outputDestination;
    private char[] delimiters;
    private DataOutputFormat outputFormat;

    public JobRequest(DataSource inputSource, DataDestination outputDestination, char[] delimiters,
            DataOutputFormat outputFormat) {
        this.inputSource = inputSource;
        this.outputDestination = outputDestination;
        this.delimiters = delimiters;
        this.outputFormat = outputFormat;
    }

    public DataSource getInputSource() {
        return inputSource;
    }

    public DataDestination getOutputDestination() {
        return outputDestination;
    }

    public DataOutputFormat getOutputFormat() {
        return outputFormat;
    }

    public char[] getDelimiters() {
        return delimiters;
    }

}
