package X;

import android.os.CancellationSignal;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
public final class C14180p4 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CancellationSignal $canceller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14180p4(CancellationSignal cancellationSignal) {
        super(1);
        this.$canceller = cancellationSignal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$canceller.cancel();
        return C59022wD.A00;
    }
}
