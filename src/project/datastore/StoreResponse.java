package project.datastore;

public class StoreResponse {

    private boolean success;
    private String result;
    private String errorMessage;

    public StoreResponse(boolean success, String result, String errorMessage) {
        this.success = success;
        this.result = result;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
