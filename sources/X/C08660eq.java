package X;

import android.content.Context;

/* renamed from: X.0eq  reason: invalid class name and case insensitive filesystem */
public final class C08660eq implements C17400vT {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass0U2 A02;
    public final String A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C14070oa(this));
    public final boolean A05;
    public final boolean A06;

    public final C001000s A00() {
        return (C001000s) this.A04.getValue();
    }

    public void Bnt(boolean z) {
        if (this.A04.BHk()) {
            C02950If.A00(A00(), z);
        }
        this.A00 = z;
    }

    public void close() {
        if (this.A04.BHk()) {
            A00().close();
        }
    }

    public C08660eq(Context context, AnonymousClass0U2 r3, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = z2;
    }
}
