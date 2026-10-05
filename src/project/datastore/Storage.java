package project.datastore;

import project.annotations.ProcessAPI;
import java.util.List;

@ProcessAPI
public interface Storage {
    List<Integer> readInputData(String inputSource);
}
