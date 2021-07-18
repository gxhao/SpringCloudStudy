package com.yangGuo.springCloud.service.impl;

import com.yangGuo.springCloud.Dao.PaymentDao;
import com.yangGuo.springCloud.entities.Payment;
import com.yangGuo.springCloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author gxhao
 * @Date 2021/7/18 22:05
 * @Description This is description of method
 * @Param 
 * @Return 
 * @Since version-1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private  PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
