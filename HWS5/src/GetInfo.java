import java.util.HashMap;
import java.util.Map;

class GetInfo extends ProductInfo
{
    HashMap<Integer,HomeAppliances> hm=new HashMap<Integer, HomeAppliances>(10);

    public GetInfo(Object produtname, Object productcode, Object productgender, Object productweigh) {
        super(produtname, productcode, productgender, productweigh);
    }


    @Override
    public void Displayproductinfo() {
        for (Map.Entry<Integer, HomeAppliances> entry: hm.entrySet())
        {
        int key=entry.getKey();
        HomeAppliances value=entry.getValue();
            System.out.println(key+"details: \n"+value.productname+"\n"+value.productcode+"\n"+value.productgender+"\n"+value.productweigh);
        }
        super.Displayproductinfo();
    }
}