package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass31C;
import X.AnonymousClass39V;
import X.AnonymousClass7I9;
import X.AnonymousClass8s3;
import X.C05550Ty;
import X.C135206kI;
import X.C136976nZ;
import X.C162457s7;
import X.C18260x0;
import X.C35351wj;
import X.C40602Ha;
import X.C56052rL;
import X.C620933l;
import X.C626836d;
import X.C69263Wi;
import android.content.Context;
import com.whatsapp.jid.Jid;

public final class BrazilIncomeCollectionViewModel extends C05550Ty {
    public final C69263Wi A00;
    public final AnonymousClass31C A01;
    public final C40602Ha A02;
    public final C620933l A03;

    public final void A0D(Context context, AnonymousClass8s3 r35, AnonymousClass7I9 r36) {
        Long l;
        AnonymousClass7I9 r2 = r36;
        C162457s7.A0J(r2, 1);
        long j = r2.A01;
        long j2 = r2.A00;
        AnonymousClass31C r9 = this.A01;
        String A032 = r9.A03();
        Long valueOf = Long.valueOf(j);
        if (j2 != Long.MAX_VALUE) {
            l = Long.valueOf(j2);
        } else {
            l = null;
        }
        C35351wj r5 = new C35351wj(A032, 12);
        C56052rL r4 = new C56052rL("iq");
        r4.A0G(new AnonymousClass39V((Jid) C135206kI.A00, "to"));
        C56052rL.A0D(r4, "xmlns", "w:pay");
        C56052rL r3 = new C56052rL("account");
        C56052rL.A0D(r3, "action", "br-save-income-information");
        C56052rL r22 = new C56052rL("self_reported_income_range");
        if (C626836d.A0J(valueOf, 0, 9007199254740991L, false)) {
            C56052rL.A0C(r22, "min", j);
        }
        if (l != null && C626836d.A0J(l, 0, 9007199254740991L, true)) {
            C56052rL.A0C(r22, "max", l.longValue());
        }
        C56052rL.A07(r22, r3);
        C56052rL.A07(r3, r4);
        r4.A0I(r5.A00);
        AnonymousClass31C r14 = r9;
        r14.A0D(new C136976nZ(context, this.A00, this.A02, r35, this), r4.A0F(), A032, 204, 0);
    }

    public BrazilIncomeCollectionViewModel(C69263Wi r1, AnonymousClass31C r2, C40602Ha r3, C620933l r4) {
        C18260x0.A0c(r1, r2, r4, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
