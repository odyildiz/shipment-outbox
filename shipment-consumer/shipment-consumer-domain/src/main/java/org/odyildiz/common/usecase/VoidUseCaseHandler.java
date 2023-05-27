package org.odyildiz.common.usecase;

import org.odyildiz.common.model.UseCase;

public interface VoidUseCaseHandler<T extends UseCase> {

    void handle(T useCase);
}
