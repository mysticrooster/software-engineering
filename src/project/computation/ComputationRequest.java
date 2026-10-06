package project.computation;

import java.util.List;

import project.server.data.DataOutputFormat;

public class ComputationRequest {
    private List<Integer> inputData;
    private DataOutputFormat desiredOutputFormat;

    public ComputationRequest(List<Integer> inputData, DataOutputFormat desiredOutputFormat) {
        this.inputData = inputData;
        this.desiredOutputFormat = desiredOutputFormat;
    }

    public DataOutputFormat getDesiredOutputFormat() {
        return desiredOutputFormat;
    }

    public List<Integer> getInputData() {
        return inputData;
    }
}