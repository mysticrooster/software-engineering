package project.computation;

import project.annotations.ConceptualAPI;

// 1. The API Interface
@ConceptualAPI
public interface Computation {
    String computeResult(int input);
}