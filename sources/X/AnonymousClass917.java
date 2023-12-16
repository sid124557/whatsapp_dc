package X;

import android.content.DialogInterface;

/* renamed from: X.917  reason: invalid class name */
public class AnonymousClass917 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass917(C153427bI r1, C131266dJ r2, AnonymousClass84O r3, AnonymousClass8DJ r4, int i) {
        this.A04 = i;
        this.A00 = r4;
        this.A01 = r3;
        this.A02 = r1;
        this.A03 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass84O r5 = (AnonymousClass84O) this.A01;
        C153427bI r4 = (C153427bI) this.A02;
        C131266dJ r3 = (C131266dJ) this.A03;
        C835248t A0L = r5.A0L(35);
        if (A0L != null) {
            C152057Xj r1 = new C152057Xj();
            r1.A05(r5, 0);
            C157157hp.A00(r3, C152057Xj.A00(r1, r4, 1), A0L);
        }
    }
}
