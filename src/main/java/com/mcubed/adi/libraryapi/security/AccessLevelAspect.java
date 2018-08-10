package com.mcubed.adi.libraryapi.security;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class AccessLevelAspect {
    @Pointcut("@annotation(com.mcubed.adi.libraryapi.security.AccessLevel)")
    private void customSecurityAnnotation() {
    }

    @Around("com.mcubed.adi.libraryapi.security.AccessLevelAspect.customSecurityAnnotation()")
    public Object checkAccess(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest req = getRequest();
        // Check header values
        // Throw Spring's AccessDeniedException if needed
        return pjp.proceed();
    }

    private HttpServletRequest getRequest() {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return sra.getRequest();
    }
}
