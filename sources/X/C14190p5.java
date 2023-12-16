package X;

import android.os.CancellationSignal;

/* renamed from: X.0p5  reason: invalid class name and case insensitive filesystem */
public final class C14190p5 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CancellationSignal $canceller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14190p5(CancellationSignal cancellationSignal) {
        super(1);
        this.$canceller = cancellationSignal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$canceller.cancel();
        return C59022wD.A00;
    }
}
