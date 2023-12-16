package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0p6  reason: invalid class name and case insensitive filesystem */
public final class C14200p6 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C10070hL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14200p6(C10070hL r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            boolean z = th instanceof CancellationException;
            AnonymousClass0BT A00 = this.this$0.A00;
            if (z) {
                A00.cancel(true);
            } else {
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                A00.A0A(th);
            }
        } else if (!this.this$0.A00.isDone()) {
            throw AnonymousClass001.A0c("Failed requirement.");
        }
        return C59022wD.A00;
    }
}
