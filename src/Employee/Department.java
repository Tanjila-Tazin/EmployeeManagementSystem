package Employee;

import javax.management.OperationsException;

public class Department {
    String Accounting;
    String Operationsmanagement;
    String Humanresource;
    String Marketing;
    String IT;

    public Department() {
       Accounting="unknown";
       Operationsmanagement="unknown";
       Humanresource="unknown";
       Marketing="unknown";
       IT="unknownn";
      }

    public Department(String Accounting, String Operationsmanagement, String Humanresource, String Marketing, String IT) {
        this.Accounting=Accounting;
        this.Operationsmanagement = Operationsmanagement;
        this.Humanresource = Humanresource;
        this.Marketing=Marketing;
        this.IT=IT;
    }
    public String getAccounting(){
        return Accounting;
    }
    public void setAccounting(){
        this.Accounting=Accounting;
    }
    public String getOperationsmanagement(){
        return Operationsmanagement;
    }
    public void setOperationsmanagement(){
        this.Operationsmanagement= Operationsmanagement ;
    }

    public String getHumanresource() {
        return Humanresource;
    }
    public void setHumanresource(){
        this.Humanresource = Humanresource;
    }

    public String   getMarketing (){
        return Marketing;
    }
    public void setMarketing (){
        this.Marketing = Marketing;
    }
    public String  getIT(){
        return IT ;
    }
    public void setIT (){
        this.IT = IT ;
    }

}






