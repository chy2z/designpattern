package js.com.adapter.my;

/**
* @Title: AdapterRs485
* @Description: rs-485 转 rs-485
* @author chy
* @date 2018/5/12 16:14
*/
public class AdapterRs485 implements DefaultRs232 {
    public void format(String type) {
        System.out.println("rs-485 转 rs-232");
    }
}
