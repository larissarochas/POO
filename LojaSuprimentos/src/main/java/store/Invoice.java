package store;

/**
 *
 * @author laryr
 */

public class Invoice {
    public String desc;
    private int quant, num;
    private double valorUnit;

    public Invoice(String desc, int quant, int num, double valorUnit) {
        this.desc = desc;
        this.quant = quant;
        this.num = num;
        this.valorUnit = valorUnit;
    }

    Invoice() {}

    public double getInvoiceAmount(){
        double am = valorUnit*quant;
        if (quant < 0) {
            this.quant = 0;
        } 
        
        if (valorUnit < 0) {
            this.valorUnit = 0.0;
        }
        return am;
    }
    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }
}
