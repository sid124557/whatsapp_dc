package X;

import android.os.HandlerThread;

/* renamed from: X.5zZ  reason: invalid class name and case insensitive filesystem */
public final class C121035zZ extends C829045j implements AnonymousClass4GP {
    public static final C121035zZ A00 = new C121035zZ();

    public C121035zZ() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("Emoji Expressions Thread");
        handlerThread.start();
        return handlerThread;
    }
}
