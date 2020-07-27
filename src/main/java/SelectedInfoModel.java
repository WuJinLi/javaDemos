

import java.io.Serializable;

public class SelectedInfoModel implements Serializable {
    private String POWER_USER_NAME;
    private String POWER_USER_ID;
    private int SUB_REDUCE_AMOUNT;


    public String getPOWER_USER_NAME() {
        return POWER_USER_NAME;
    }

    public void setPOWER_USER_NAME(String POWER_USER_NAME) {
        this.POWER_USER_NAME = POWER_USER_NAME;
    }

    public String getPOWER_USER_ID() {
        return POWER_USER_ID;
    }

    public void setPOWER_USER_ID(String POWER_USER_ID) {
        this.POWER_USER_ID = POWER_USER_ID;
    }

    public int getSUB_REDUCE_AMOUNT() {
        return SUB_REDUCE_AMOUNT;
    }

    public void setSUB_REDUCE_AMOUNT(int SUB_REDUCE_AMOUNT) {
        this.SUB_REDUCE_AMOUNT = SUB_REDUCE_AMOUNT;
    }


    @Override
    public String toString() {
        return "SelectedInfoModel{" +
                "POWER_USER_NAME='" + POWER_USER_NAME + '\'' +
                ", POWER_USER_ID='" + POWER_USER_ID + '\'' +
                ", SUB_REDUCE_AMOUNT=" + SUB_REDUCE_AMOUNT +
                '}';
    }
}
