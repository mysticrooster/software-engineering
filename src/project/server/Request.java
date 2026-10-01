package project.server;

import project.annotations.NetworkAPI;

// 1. The API Interface
@NetworkAPI
public interface Request {
    void configureJob(String inputSource, String outputDestination, char delimiter);
}