package com.br.emailservice.core;

public record EmailRequest(String to, String subject, String body) {

}
