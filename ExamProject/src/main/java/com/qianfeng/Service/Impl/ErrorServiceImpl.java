package com.qianfeng.Service.Impl;

import com.qianfeng.Dao.ErrorMapping;
import com.qianfeng.Service.Inter.ErrorService;
import com.qianfeng.domain.ErrorLV;
import com.qianfeng.domain.ErrorXZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErrorServiceImpl implements ErrorService {

    @Autowired
    ErrorMapping errorMapping;

    @Override
    public List<ErrorLV> errorXQ() {
        List<ErrorLV> errorLVS = errorMapping.errorXQ();
        return errorLVS;
    }

    @Override
    public List<ErrorXZ> getData() {

        List<ErrorXZ> data = errorMapping.getData();

        return data;
    }
}
