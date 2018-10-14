package js.innerclass.callback;

/**
* @Title: Select
* @Description: 模拟 select 控件 选择事件触发 接口回调
* @author chy
* @date 2018/9/16 23:01
*/
public class Select {

    private OnSelectItemListener onSelectItemListener;

    public Select() {

    }

    interface OnSelectItemListener {
        void onSelectItem();
    }

    public OnSelectItemListener getOnSelectItemListener() {
        return onSelectItemListener;
    }

    public void setOnSelectItemListener(OnSelectItemListener onSelectItemListener) {
        this.onSelectItemListener = onSelectItemListener;
    }

    public void OnSelectItem() {
        System.out.println("Select 选择事件触发");
        onSelectItemListener.onSelectItem();
    }
}
