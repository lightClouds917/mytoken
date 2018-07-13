package com.java4all.jwt;


/**
 * Author: yunqing
 * Date: 2018/7/12
 * Description:
 */
public class JwtClaimBean {

    /**jwt签发者，可选*/
    private String issuer;

    /**issued at 签发时间 unix时间戳 可选*/
    private Long iat;

    /**接收者，可选*/
    private String audience;

    /**什么时候过期 unix时间戳，可选*/
    private Long expires;

    /**jwt所面向的客户，可选*/
    private String subject;
    
    /**邮件*/
    private String email;
    
    /***/
    private String key;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Long getIat() {
        return iat;
    }

    public void setIat(Long iat) {
        this.iat = iat;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Long getExpires() {
        return expires;
    }

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
