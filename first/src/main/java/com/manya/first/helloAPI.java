package com.manya.first;
import java.util.Map;
import org.springframework.web.bind.annotation.*;

@RestController
public class helloAPI {

    // hello API
    @GetMapping("hello")
    public String hello() {
        return "hello manya";
    }

    // read name from URL
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello "+name;
    }

    // take sum from URL
    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b){
        return a+b;
    }

    // sum but better way
    @GetMapping("/sum")
    public Map<String,Integer> sum2(@RequestParam int a, @RequestParam int b){
        return Map.of("result", a + b);
    }
}
