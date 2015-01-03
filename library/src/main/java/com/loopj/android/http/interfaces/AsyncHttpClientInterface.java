package com.loopj.android.http.interfaces;

import org.apache.http.client.methods.HttpUriRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AsyncHttpClientInterface {

    @NotNull
    RequestHandleInterface get(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface post(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface put(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface head(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface delete(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface patch(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface options(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface trace(
            @NotNull String target,
            @Nullable RequestParamsInterface params,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

    @NotNull
    RequestHandleInterface executeRawRequest(
            @Nullable HttpUriRequest request,
            @Nullable RequestOptionsInterface options,
            @Nullable ResponseHandlerInterface responseHandler
    );

}
