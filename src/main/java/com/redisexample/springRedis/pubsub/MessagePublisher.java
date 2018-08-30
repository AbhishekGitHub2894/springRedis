package com.redisexample.springRedis.pubsub;

public interface MessagePublisher {
    void publish(final String message);
}