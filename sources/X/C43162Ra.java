package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

/* renamed from: X.2Ra  reason: invalid class name and case insensitive filesystem */
public class C43162Ra {
    public final Handler A00;
    public final HandlerThread A01;
    public final SparseArray A02 = new SparseArray();
    public final AnonymousClass4FS A03;
    public volatile boolean A04;

    public C43162Ra(AnonymousClass4FS r4) {
        this.A03 = r4;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
