package com.example.oauth2_authorization.contr;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {

    @GetMapping("/public")
    public String publicApi() {
        return "OpenWeather is a public API";
    }

    @GetMapping("/secure")
    public String privateApi(OAuth2AuthenticationToken token) {
        return "authorized "+token.getPrincipal().getAttribute("email");
    }
}
