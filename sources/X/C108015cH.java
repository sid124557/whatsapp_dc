package X;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: X.5cH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108015cH implements DialogInterface.OnClickListener {
    public final /* synthetic */ C111095hX A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ AnonymousClass64H A02;
    public final /* synthetic */ C53602nM A03;
    public final /* synthetic */ C66433Lk A04;
    public final /* synthetic */ boolean A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass64H r5 = this.A02;
        boolean z = this.A05;
        C53602nM r4 = this.A03;
        C89654ea r3 = this.A01;
        C66433Lk r1 = this.A04;
        C111095hX r2 = this.A00;
        r5.BZn();
        if (!z) {
            r4.A01(r3, "how-to-delete-messages");
            return;
        }
        Intent A0D = C18310x6.A0D(r1.A03("251090924134584"));
        A0D.addFlags(268435456);
        r2.A0A(r3, A0D);
    }

    public /* synthetic */ C108015cH(C111095hX r1, C89654ea r2, AnonymousClass64H r3, C53602nM r4, C66433Lk r5, boolean z) {
        this.A02 = r3;
        this.A05 = z;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }
}
