package X;

import android.app.ActivityManager;
import android.os.Looper;

/* renamed from: X.3U8  reason: invalid class name */
public final class AnonymousClass3U8 implements AnonymousClass66C {
    public static final AnonymousClass3U8 A00 = new AnonymousClass3U8();

    public void B27(AnonymousClass30Y r4) {
        C162457s7.A0J(r4, 0);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        r4.A00(1, "process_priority", AnonymousClass0x9.A0m(runningAppProcessInfo.importance));
    }

    public final void A00(C186568vZ r4, int i) {
        r4.markerAnnotate(i, "thread_priority", Thread.currentThread().getPriority());
        r4.markerAnnotate(i, "thread_ui", AnonymousClass000.A1Y(Looper.getMainLooper(), Looper.myLooper()));
        r4.BKd(this, i);
    }

    public String B9C() {
        return "process_priority";
    }
}
