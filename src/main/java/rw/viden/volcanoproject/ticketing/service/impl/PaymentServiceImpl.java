package rw.viden.volcanoproject.ticketing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rw.viden.volcanoproject.ticketing.dao.PaymentDao;
import rw.viden.volcanoproject.ticketing.model.Payment;
import rw.viden.volcanoproject.ticketing.service.PaymentService;

import java.util.Date;
import java.util.List;

/**
 * Created by Viden ltd on 19/05/2016.
 */
@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;


    @Override
    public void saveOrUpdate(Payment payment) {paymentDao.save(payment);}

    @Override
    public void disable(Payment payment) {

    }

    @Override
    public List<Payment> getAll() {
        return paymentDao.findAll();
    }

    @Override
    public List<Payment> getByDate(Date date) {
        return paymentDao.findByDatePayment(date);
    }

   // @Override
    //public List<Payment> getByReceipt(String receipt) {
        //return paymentDao.findAll();
   // }

    @Override
    public Payment getById(Integer idPayment) {
        return paymentDao.findOne(idPayment);
    }
}
