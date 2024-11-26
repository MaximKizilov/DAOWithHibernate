package ru.netology.daowithhibernate.controller;


import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
@RequestMapping("/secured")
public class SecuredController {
    @GetMapping("/read")
    @Secured("ROLE_READ")
    public String read(Principal principal) {
        return principal.toString();
    }

    @GetMapping("/write")
    @RolesAllowed("ROLE_WRITE")
    public String write(Authentication authentication) {
        return authentication.toString();
    }

    @GetMapping("/delete")
    @PreAuthorize("hasRole('ROLE_WRITE') || hasRole('ROLE_DELETE')")
    public String delete() {
        return SecurityContextHolder.getContext().getAuthentication().toString();
    }

    @GetMapping("/user")
    @PostAuthorize("#username == authentication.principal.username")
    public String user(@RequestParam String username) {
        org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.toString();
    }

}
