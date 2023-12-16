package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.2YX  reason: invalid class name */
public final class AnonymousClass2YX {
    public final C66383Le A00;
    public final AnonymousClass4rH A01;

    public final C624134x A00(AnonymousClass3ST r12, long j) {
        long j2;
        int i = 0;
        Jid jid = r12.A18;
        if (C627336j.A02(jid) instanceof C95804uY) {
            AnonymousClass1EU r4 = r12.A0M;
            if (r4 != null) {
                Integer num = r12.A0V;
                if (num != null) {
                    i = num.intValue();
                }
                C51612k6 r1 = r12.A0B;
                if (r1 != null) {
                    j2 = r1.A01;
                } else {
                    j2 = r12.A16;
                }
                AnonymousClass2z0 A002 = AnonymousClass3ST.A00(r12);
                C162457s7.A0D(A002);
                C47612dX r3 = new C47612dX(r4, r4, A002, j2);
                r3.A04 = C627336j.A02(r12.A0E);
                r3.A0F = true;
                C47612dX.A00(r3, r12, i);
                r3.A0B = r12.A0p;
                r3.A02 = r12.A08;
                r3.A0D = r12.A0q;
                C624134x A003 = this.A00.A00(r3.A01());
                if (r12.A01 == 3) {
                    A003.A1B(AnonymousClass35S.A0F);
                    if (r1 != null) {
                        AnonymousClass2z0 r6 = A003.A1J;
                        long j3 = r1.A00;
                        A003.A1V(new C42602Ou(r6, j3, j3));
                        A003.A0K = r1.A01;
                    }
                }
                if (!this.A01.A07(A003)) {
                    A003 = new C30351mJ(A003.A1J, r4.A0F(), 2, A003.A0K);
                }
                if (A003.A1J.A02) {
                    A003.A1G(4);
                }
                A003.A1M = j;
                return A003;
            }
            boolean z = r12.A0Q.A02;
            C95814uZ A02 = C627336j.A02(jid);
            String str = r12.A1B;
            C30951nU r13 = new C30951nU(AnonymousClass2z0.A05(A02, str, z), r12.A16);
            r13.A01 = str;
            if (z) {
                r13.A1G(4);
            }
            r13.A1M = j;
            return r13;
        }
        throw AnonymousClass24W.A01(0, "NewsletterMessageManager/trying to process newsletter message for non newsletter chat");
    }

    public AnonymousClass2YX(C66383Le r1, AnonymousClass4rH r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
