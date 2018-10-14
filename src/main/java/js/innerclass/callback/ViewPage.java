package js.innerclass.callback;

/**
* @Title: ViewPage
* @Description: 回调函数
* @author chy
* @date 2018/9/16 22:59
*/
public class ViewPage implements Button.OnClickListener {

    private Button button;

    private Select select;

    private String des="ViewPage";

    public ViewPage() {
        button = new Button(this);

        select=new Select();
        select.setOnSelectItemListener(new Select.OnSelectItemListener() {
            @Override
            public void onSelectItem() {
                System.out.println("ViewPage "+des);
                System.out.println("ViewPage 选择事件触发");
            }
        });
    }

    @Override
    public void onClick() {
        System.out.println("ViewPage 点击事件触发");
    }

    public void onButCick() {
        button.onClick();
    }

    public void onSelecItem(){
        select.OnSelectItem();
    }

    public static void main(String[] args) {
        ViewPage viewPage=new ViewPage();
        viewPage.onButCick();
        viewPage.onSelecItem();
    }
}
