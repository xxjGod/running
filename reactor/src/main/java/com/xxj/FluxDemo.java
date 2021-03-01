package com.xxj;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class FluxDemo {


    public static void main(String[] args) {
//        Flux<Integer> flux = Flux.just(1, 2, 3);
//        flux.map(t -> {
//            if (t >= 3) {
//                throw new RuntimeException("value must be less 3!");
//            }
//            return t + 1;
//        }).subscribe(UtilWrite::writeRight
//                , UtilWrite::writeRight
//        );
        List<Integer> num = Arrays.asList(1, 2, 3);
        Flux.fromIterable(num)
                .concatMap(mapping -> {
                    return mapping + 1;
                })
                .next()
                .switchIfEmpty(Mono.error(HANDLER_NOT_FOUND_EXCEPTION))
                .flatMap(handler -> invokeHandler(exchange, handler))
                .flatMap(result -> handleResult(exchange, result));

    }

}
