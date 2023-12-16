package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ko  reason: invalid class name and case insensitive filesystem */
public class C113055ko implements C182268o8 {
    public C116985rC A00;
    public C105035Th A01;
    public C620433g A02;
    public AnonymousClass5X1 A03;
    public C195909Zz A04;
    public C1907099n A05;
    public AnonymousClass9Tp A06;
    public C194229Sb A07;
    public C195219Wq A08;

    public static /* synthetic */ void A00(Context context, C108985dt r5, C113055ko r6, AnonymousClass39S r7, C624134x r8, int i) {
        String A002 = r6.A01.A00(r5);
        Context context2 = context;
        if ("UNBLOCKED".equals(A002)) {
            AnonymousClass39S r52 = r7;
            String A0c = r6.A08.A0c(r7);
            AnonymousClass9T2 r2 = new AnonymousClass9T2(r6.A04, r6.A05);
            UserJid A0o = r8.A0o();
            C626936e.A06(A0o);
            r2.A00(context2, A0o, r52, r8.A1J, A0c, i);
            return;
        }
        r6.A03.A02(context, A002);
    }

    public void Bgi(Context context, C624134x r13, AnonymousClass39W r14, int i) {
        Intent A0L;
        AnonymousClass39S r4 = r14.A01;
        if (r4 != null) {
            Context context2 = context;
            C624134x r9 = r13;
            int i2 = i;
            if (!"review_order".equals(r14.A01())) {
                AnonymousClass2z0 r2 = r13.A1J;
                if (!r2.A02 || !this.A08.A0l() || !this.A08.A0n() || !this.A08.A0u(r2.A00)) {
                    this.A06.A00();
                } else {
                    if (i == 10) {
                        C116985rC r1 = this.A00;
                        if (r1.A07()) {
                            r1.A04();
                            throw AnonymousClass001.A0g("launchUpdateStatus");
                        }
                    }
                    this.A06.A00();
                    if (this.A06.A06()) {
                        this.A06.A02();
                        throw AnonymousClass000.A0L();
                    }
                }
            } else if (i != 0) {
                if (i == 1) {
                    A0L = this.A07.A00(context2, r4, r13.A1J, r4.A0D, r4.A04, (String) null);
                    if (A0L == null) {
                        return;
                    }
                } else if (i == 3) {
                    A0L = C627736r.A0L(context, (Parcelable) null, "com.bloks.www.payments.whatsapp.f2care", (String) null);
                } else {
                    return;
                }
                context.startActivity(A0L);
                return;
            }
            this.A02.A06(new AnonymousClass8EM(context, this, r4, r9, i2), r13.A0o());
        }
    }
}
