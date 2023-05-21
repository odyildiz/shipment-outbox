package org.odyildiz.common;

import org.odyildiz.common.model.UseCase;

public interface VoidUseCaseHandler<T extends UseCase> {

    void handle(T useCase);
}
