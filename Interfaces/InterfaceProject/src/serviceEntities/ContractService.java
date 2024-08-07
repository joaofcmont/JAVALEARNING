package serviceEntities;

import entities.Contract;
import entities.Installment;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue()/months;

        for(int i =1;i<=months;i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interrest(basicQuota,i);
            double fee = onlinePaymentService.paymentFee(basicQuota+interest);
            double quota = basicQuota +interest+fee;
            contract.getInstallmentList().add(new Installment(dueDate,quota));
        }

    }
}
