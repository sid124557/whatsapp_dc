package X;

import android.view.View;

/* renamed from: X.39y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C636139y implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C194711h A01;
    public final /* synthetic */ AnonymousClass1UD A02;
    public final /* synthetic */ AnonymousClass39M A03;

    public final boolean onLongClick(View view) {
        C194711h r6 = this.A01;
        AnonymousClass1UD r4 = this.A02;
        int i = this.A00;
        AnonymousClass39M r8 = this.A03;
        View view2 = view;
        C162457s7.A0H(view);
        if (!r6.A02) {
            return false;
        }
        C54872pQ r3 = r6.A05;
        if ((!r3.A00() || !r3.A04.A0Y(C58422vE.A02, 4643)) && (!r3.A00() || !r3.A04.A0Y(C58422vE.A02, 6222))) {
            return false;
        }
        r6.A01.BkM(new C70623an(view2, r6, r4.A00, r8, i, 4));
        return true;
    }

    public /* synthetic */ C636139y(C194711h r1, AnonymousClass1UD r2, AnonymousClass39M r3, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }
}
