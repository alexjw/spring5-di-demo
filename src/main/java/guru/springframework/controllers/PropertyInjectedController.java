package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

    /*public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }*/

}
