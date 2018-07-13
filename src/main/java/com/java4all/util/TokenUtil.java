package com.java4all.util;

import com.auth0.jwt.JWTSigner;
import com.java4all.jwt.JwtClaimBean;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * Author: yunqing
 * Date: 2018/7/13
 * Description:token工具类
 */
public class TokenUtil {
    org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    private JwtClaimBean jwtClaimBean;

    public String generateToken(String username,String userId,String platFromId){
        final long iat = System.currentTimeMillis()/1000L;
        final long exp = iat + jwtClaimBean.getExpires();

        final JWTSigner signer = new JWTSigner(jwtClaimBean.getKey());
        final HashMap<String,Object> claims = new HashMap<>();
        claims.put("iss", jwtClaimBean.getIssuer());
        claims.put("exp", exp);
        claims.put("iat", iat);
        claims.put("userName", username);
        claims.put("email", jwtClaimBean.getEmail());
        claims.put("userId", userId);
        claims.put("platFromId", platFromId);
        final String jwt = signer.sign(claims);
        return jwt;

    }

}
