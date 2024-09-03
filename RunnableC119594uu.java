package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4uu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC119594uu implements Runnable {
    public static final Executor LCCII = new ThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), new ThreadPoolExecutor.DiscardOldestPolicy());
    public Handler L = new Handler(Looper.getMainLooper());
    public boolean LB;
    public boolean LBL;
    public final int LC;
    public final Runnable LCC;

    @Override // java.lang.Runnable
    public void run() {
        if (this.LBL) {
            LCCII.execute(this.LCC);
            this.LBL = false;
        }
        this.L.postDelayed(this, this.LC);
    }

    public RunnableC119594uu(Runnable runnable, int i) {
        this.LCC = runnable;
        this.LC = i;
    }
}
