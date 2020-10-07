package javafxapplication2;

import java.sql.Date;


public class ModelTableOrder
{
    String item,workername,cliname;
    Date dateorder;
    
    public ModelTableOrder(String item,String workername,Date dateorder,String cliname)
    {
        this.item = item;
        this.workername = workername;
        this.dateorder = dateorder;
        this.cliname = cliname;
        
        
        
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername;
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname;
    }

    public Date getDateorder() {
        return dateorder;
    }

    public void setDateorder(Date dateorder) {
        this.dateorder = dateorder;
    }
}