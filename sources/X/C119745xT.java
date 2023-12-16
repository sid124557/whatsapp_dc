package X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.5xT  reason: invalid class name and case insensitive filesystem */
public final class C119745xT extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass5NV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119745xT(AnonymousClass5NV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HandlerThread handlerThread = new HandlerThread("WAHeroPlayerThread", -2);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        C162457s7.A0D(looper);
        return looper;
    }
}
