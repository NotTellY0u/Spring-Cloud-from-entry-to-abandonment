package com.lin.webflux;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.
        reactive.function.server.RouterFunctions.route;
import static org.springframework.web.
        reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.
        reactive.function.server.ServerResponse.ok;
import static reactor.core.publisher.Mono.just;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.concurrent.Executor;

@Configuration
public class FluxConfiguration {

    /**
     * 运行，网址输入 IP:8080/hello 看看啊
     *电脑终于修好
     *almost forget this
     * @return
     */
    
    @Bean
    public RouterFunction<?> helloRouterFunction() {
        return route(GET("/hello"),
                serverRequest -> ok().body(just("Hello World!"), String.class))
                .andRoute(POST("/index"), this::test);
    }

    public Mono<ServerResponse> test(ServerRequest serverRequest) {
        return ServerResponse.ok().body("asdasd", String.class);
    }
}
