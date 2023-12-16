package X;

import android.os.HandlerThread;

/* renamed from: X.8XC  reason: invalid class name */
public final class AnonymousClass8XC extends C829045j implements AnonymousClass4GP {
    public static final AnonymousClass8XC A00 = new AnonymousClass8XC();

    public AnonymousClass8XC() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return AnonymousClass6C9.A0R(handlerThread);
    }
}
