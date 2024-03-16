package com.taxah.diplom_calculate.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.taxah.diplom_calculate.model.database.TempUser;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class Debt {

    private TempUser toWhom;
    private Map<TempUser, Double> debtors;

    public void pileUp(Debt debt) {
        for (Map.Entry<TempUser, Double> entry : debt.getDebtors().entrySet()) {
            TempUser user = entry.getKey();
            Double value = entry.getValue();
            if (debt.getDebtors().containsKey(user)) {
                Double existingValue = 0.0; //TODO need to test
                if (this.getDebtors().get(user) != null) {
                    existingValue = this.getDebtors().get(user);
                }
                this.getDebtors().put(user, existingValue + value);
            }
        }
    }
}
