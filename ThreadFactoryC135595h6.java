package X;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.5h6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ThreadFactoryC135595h6 implements ThreadFactory {
    public InterfaceC135585h5 L;
    public final String LB;

    public ThreadFactoryC135595h6(String str) {
        this.LB = "APM_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() { // from class: X.5h4
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                if (ThreadFactoryC135595h6.this.L != null) {
                    ThreadFactoryC135595h6.this.L.L(Thread.currentThread().getId());
                }
                try {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } catch (Throwable th) {
                    C135565h3.L.L(th, "APM_INNER_ERROR_async_task");
                }
            }
        }, this.LB);
    }
}
