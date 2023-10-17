package com.core.banking.system.product.service.application.expetion.handler;

import com.core.banking.system.coomon.application.ErrorDTO;
import com.core.banking.system.product.domain.core.exeption.ProductDomainExeption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ProductGlobalExeption {
    @ResponseBody
    @ExceptionHandler(value = {ProductDomainExeption.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO handelExeption(ProductDomainExeption productDomainExeption){
        return  ErrorDTO.builder()
                .code(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message(productDomainExeption.getMessage())
                .build();

    }

}
