package com.pzl.materialdesignlibrarydemo.CoordinatorLayout;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

import com.pzl.materialdesignlibrarydemo.R;


/**
 * @author zl.peng
 * @version [1.0, 2016-08-26]
 */
public class MyBehavior extends CoordinatorLayout.Behavior<View> {

    /**
     * 必需重写此构造，它将通过反射2参构造实现实例化;
     *
     * @param context
     * @param attrs
     */
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 确定依赖关系，判定回调的 dependency view 是否是绑定了该Behavior的View需要依赖的那个View;
     * dependency view 通过间接触发Behavior来和child view(绑定了本Behavior的view)协同交互;
     * CoordinatorLayout将通过遍历view判断依赖关系；
     *
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency.getId() == R.id.view01;
    }

    /**
     * 所依赖的那个view发生变化会回调此
     *
     * @param parent
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        child.setY(dependency.getY() + dependency.getHeight() + 50);
        return true;
    }

}
