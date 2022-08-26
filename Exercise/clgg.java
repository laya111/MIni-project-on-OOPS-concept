
class Head{
     private int SfNo;
     private String branch;
    public void Set_SfNO(int SfNo)
    {
         this.SfNo=SfNo;
        
    }
    public void Set_br(String branch)
    {
        this.branch=branch;
    }
    public int  Get_SfNO()
    {
        return SfNo;
    }
    public String Get_br()
    {
        return branch;
    }

    
}

public class clgg {
    public static void main(String []args)
     {
        Head h=new Head();
     
    h.Set_br("Cm");
h.Get_SfNO();
h.Get_br();  }
}
