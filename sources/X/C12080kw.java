package X;

import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.0kw  reason: invalid class name and case insensitive filesystem */
public class C12080kw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SystemForegroundService A01;

    public C12080kw(SystemForegroundService systemForegroundService, int i) {
        this.A01 = systemForegroundService;
        this.A00 = i;
    }

    public void run() {
        this.A01.A00.cancel(this.A00);
    }
}
