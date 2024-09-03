package androidx.viewpager.widget;

import X.C03880Er;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ViewPager$LayoutParams extends ViewGroup.LayoutParams {
    public boolean L;
    public int LB;
    public float LBL;
    public boolean LC;
    public int LCC;
    public int position;

    public ViewPager$LayoutParams() {
        super(-1, -1);
    }

    public ViewPager$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C03880Er.L);
        this.LB = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
