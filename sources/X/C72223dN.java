package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.3dN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72223dN implements ThreadFactory {
    public final /* synthetic */ C48972fm A00;

    public final Thread newThread(Runnable runnable) {
        C48972fm r3 = this.A00;
        C173778Rq r1 = new C173778Rq(C69983Zk.A00(runnable, 10), "SignalExecutor");
        r3.A01 = AnonymousClass0x9.A14(r1);
        return r1;
    }

    public /* synthetic */ C72223dN(C48972fm r1) {
        this.A00 = r1;
    }
}
