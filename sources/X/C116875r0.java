package X;

import android.content.Context;

/* renamed from: X.5r0  reason: invalid class name and case insensitive filesystem */
public final class C116875r0 implements AnonymousClass4C0 {
    public final Context A00;
    public final C15940sD A01;
    public final Object A02 = AnonymousClass002.A0D();
    public volatile C116835qw A03;

    public /* bridge */ /* synthetic */ Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = ((C87634Ub) C124086Ax.A00(this.A01, this.A00, this, 14).A01(C87634Ub.class)).A00;
                }
            }
        }
        return this.A03;
    }

    public C116875r0(C004805c r2) {
        this.A01 = r2;
        this.A00 = r2;
    }
}
