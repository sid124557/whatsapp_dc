package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1su  reason: invalid class name and case insensitive filesystem */
public class C33381su extends AnonymousClass5ZM {
    public AnonymousClass499 A00;
    public UserJid A01;
    public final /* synthetic */ C620433g A02;

    public C33381su(AnonymousClass499 r1, C620433g r2, UserJid userJid) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A02.A02(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C108985dt r14 = (C108985dt) obj;
        AnonymousClass499 r0 = this.A00;
        if (r0 != null) {
            r0.BNt(r14);
        }
        if (r14 != null) {
            C620433g r1 = this.A02;
            if ((r1.A05.A00() & 512) > 0 && r14.A0Z) {
                C60922zO r5 = r1.A09;
                UserJid userJid = this.A01;
                C162457s7.A0J(userJid, 0);
                AnonymousClass1VX r2 = r5.A04;
                C58422vE r12 = C58422vE.A02;
                if (!r2.A0Y(r12, 5333) || !r2.A0Y(r12, 1319)) {
                    C23651Ud r4 = r5.A03;
                    int A0C = r4.A0C(userJid, "prefetch_conversation");
                    C56162rW r7 = r5.A01;
                    Integer valueOf = Integer.valueOf(A0C);
                    C41572Kt A002 = r7.A00(userJid, valueOf);
                    if (!r5.A02(userJid) && C60922zO.A00(A002)) {
                        r4.A0E(valueOf, 2);
                        r5.A01(userJid);
                    } else if (A002 == null) {
                        r7.A09.BkM(new C70833b8(new AnonymousClass3MH(r5, userJid, A0C), r7, userJid, valueOf, (String) null, (String) null, true));
                    } else {
                        r4.A0E(valueOf, 2);
                    }
                }
            }
        }
    }
}
