package js.innerclass.callback;

/**
* @Title: OuterClass6
* @Description: 模拟 Button 控件 点击事件触发 接口回调
* @author chy
* @date 2018/9/16 22:46
*/
public class Button {

    private OnClickListener onClickListener;

    interface OnClickListener {
        void onClick();
    }

    public Button(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        System.out.println("Button 点击事件触发");
        onClickListener.onClick();
    }

}
