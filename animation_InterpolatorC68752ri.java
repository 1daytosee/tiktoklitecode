package X;

import android.view.animation.Interpolator;

/* renamed from: X.2ri  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class animation.InterpolatorC68752ri implements Interpolator {
    public float L = 4.0f;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.L;
        return (float) ((pow * Math.sin(((f - (f2 / 4.0f)) * 6.283185307179586d) / f2)) + 1.0d);
    }
}
