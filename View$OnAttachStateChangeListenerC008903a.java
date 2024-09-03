package X;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.03a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC008903a implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {
    public static View$OnAttachStateChangeListenerC008903a LB;
    public static View$OnAttachStateChangeListenerC008903a LBL;
    public final View L;
    public final CharSequence LC;
    public final int LCC;
    public final Runnable LCCII = new Runnable() { // from class: X.03Y
        @Override // java.lang.Runnable
        public final void run() {
            View$OnAttachStateChangeListenerC008903a.this.L(false);
        }
    };
    public final Runnable LCI = new Runnable() { // from class: X.03Z
        @Override // java.lang.Runnable
        public final void run() {
            View$OnAttachStateChangeListenerC008903a.this.L();
        }
    };
    public int LD;
    public int LF;
    public C007902q LFF;
    public boolean LFFFF;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void L() {
        if (LBL == this) {
            LBL = null;
            C007902q c007902q = this.LFF;
            if (c007902q != null) {
                c007902q.L();
                this.LFF = null;
                LC();
                this.L.removeOnAttachStateChangeListener(this);
            }
        }
        if (LB == this) {
            L((View$OnAttachStateChangeListenerC008903a) null);
        }
        this.L.removeCallbacks(this.LCI);
    }

    private void LC() {
        this.LD = Integer.MAX_VALUE;
        this.LF = Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0188, code lost:
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(boolean r16) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.View$OnAttachStateChangeListenerC008903a.L(boolean):void");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.LD = view.getWidth() / 2;
        this.LF = view.getHeight() / 2;
        L(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        L();
    }

    public static void L(View$OnAttachStateChangeListenerC008903a view$OnAttachStateChangeListenerC008903a) {
        View$OnAttachStateChangeListenerC008903a view$OnAttachStateChangeListenerC008903a2 = LB;
        if (view$OnAttachStateChangeListenerC008903a2 != null) {
            view$OnAttachStateChangeListenerC008903a2.L.removeCallbacks(view$OnAttachStateChangeListenerC008903a2.LCCII);
        }
        LB = view$OnAttachStateChangeListenerC008903a;
        if (view$OnAttachStateChangeListenerC008903a != null) {
            view$OnAttachStateChangeListenerC008903a.L.postDelayed(view$OnAttachStateChangeListenerC008903a.LCCII, ViewConfiguration.getLongPressTimeout());
        }
    }

    public View$OnAttachStateChangeListenerC008903a(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.L = view;
        this.LC = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = viewConfiguration.getScaledHoverSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.LCC = scaledTouchSlop;
        LC();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.LFF != null && this.LFFFF) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.L.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                LC();
                L();
            }
        } else if (this.L.isEnabled() && this.LFF == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.LD) <= this.LCC && Math.abs(y - this.LF) <= this.LCC) {
                return false;
            }
            this.LD = x;
            this.LF = y;
            L(this);
            return false;
        }
        return false;
    }
}
