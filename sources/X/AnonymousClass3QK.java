package X;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.3QK  reason: invalid class name */
public final class AnonymousClass3QK implements AnonymousClass4EV {
    public final AnonymousClass3XB A00 = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A01 = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A02 = AnonymousClass3XB.A00();
    public final Executor A03;

    public void BRU(long j) {
        this.A00.A05(Long.valueOf(j));
    }

    public void BRW(boolean z) {
        this.A01.A05(Boolean.valueOf(z));
    }

    public AnonymousClass3QK(Executor executor) {
        this.A03 = executor;
    }

    public void BRX(C625435m r3, C56902sk r4) {
        C18260x0.A0O(r3, r4);
        this.A02.A05(Pair.create(r3, r4));
    }
}
