package project.computation;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface Computation {
    ComputationResponse compute(ComputationRequest request);
}