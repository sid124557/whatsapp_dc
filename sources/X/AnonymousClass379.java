package X;

import android.content.DialogInterface;

/* renamed from: X.379  reason: invalid class name */
public final /* synthetic */ class AnonymousClass379 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C69263Wi A00;
    public final /* synthetic */ AnonymousClass5Ul A01;
    public final /* synthetic */ C621033m A02;
    public final /* synthetic */ C66543Lv A03;
    public final /* synthetic */ C620333f A04;
    public final /* synthetic */ C40812Hv A05;
    public final /* synthetic */ AnonymousClass4FS A06;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C40812Hv r0 = this.A05;
        C69263Wi r7 = this.A00;
        AnonymousClass5Ul r8 = this.A01;
        AnonymousClass4FS r2 = this.A06;
        C621033m r9 = this.A02;
        C66543Lv r6 = this.A03;
        C620333f r5 = this.A04;
        for (Object r4 : r0.A00) {
            r2.BkM(new C71723cZ(r4, r5, r6, r7, r8, r9, 9));
        }
        dialogInterface.dismiss();
    }

    public /* synthetic */ AnonymousClass379(C69263Wi r1, AnonymousClass5Ul r2, C621033m r3, C66543Lv r4, C620333f r5, C40812Hv r6, AnonymousClass4FS r7) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
