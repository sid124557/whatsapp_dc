package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.0ol  reason: invalid class name and case insensitive filesystem */
public final class C14160ol extends C829045j implements AnonymousClass4GP {
    public static final C14160ol A00 = new C14160ol();

    public C14160ol() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("BloksScriptDispatchLowPriThread", 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
