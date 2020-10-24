import java.util.HashMap;
import java.util.Map;

public class ProductInfo <E> extends HomeAppliances
{
    HashMap<Integer,HomeAppliances> hm=new HashMap<Integer, HomeAppliances>(10);

    public ProductInfo(E produtname , E productcode , E productgender , E productweigh)
    {
      this.productname=produtname;
      this.productcode=productcode;
      this.productweigh=productweigh;
      this.productgender=productgender;
    }
   public void setinfo()
   {
       ProductInfo pi1=new ProductInfo("vacume","v123","plastic","5kg");
       hm.put(1,pi1);
       ProductInfo pi2=new ProductInfo("refrigrator","r123","metal","60kg");
       hm.put(2,pi2);
       ProductInfo pi3=new ProductInfo("sofa","s123","textile","8kg");
       hm.put(3,pi3);
       ProductInfo pi4=new ProductInfo("washingmachine","w123","metal","70kg");
       hm.put(4,pi4);
       ProductInfo pi5=new ProductInfo("microwave","m123","metal","20kg");
       hm.put(5,pi5);
       ProductInfo pi6=new ProductInfo("table","t123","wood","25kg");
       hm.put(6,pi6);
       ProductInfo pi7=new ProductInfo("carpet","c123","silk","17kg");
       hm.put(7,pi7);
       ProductInfo pi8=new ProductInfo("Teapot","T123","crystal","300g");
       hm.put(8,pi8);
       ProductInfo pi9=new ProductInfo("pot","p123","teflon","500g");
       hm.put(9,pi9);
       ProductInfo pi10=new ProductInfo("television","tv123","plastic","12kg");
       hm.put(10,pi10);
   }

}
