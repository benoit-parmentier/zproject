package com.parmentier.jredis;


import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.Set;

public class JRedisTest {

    @Test
    public void testPublish() {
        Jedis jedis = new Jedis("localhost");
        jedis.set("key", "helloWorld");
        jedis.publish("FOO", "helloChannel");
    }

    @Test
    public void testTransaction(){
        Jedis jedis = new Jedis("localhost");
        Transaction t = jedis.multi();
        t.set("foo", "bar");
        t.exec();
    }

    @Test
    public void testPipeline() {
        Jedis jedis = new Jedis("localhost");
        Pipeline p = jedis.pipelined();
        for(int i = 0; i < 100000; i++){
            p.set("fool", "bar");
            p.zadd("foo", 1, "barowitch");
            p.zadd("foo", 0, "barinsky");
            p.zadd("foo", 0, "barikoviev");
        }
        Response<String> pipeString = p.get("fool");
        Response<Set<String>> sose = p.zrange("foo", 0, -1);
        p.sync();
    }

}