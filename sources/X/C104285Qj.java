package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Qj  reason: invalid class name and case insensitive filesystem */
public final class C104285Qj {
    public final AnonymousClass64Q A00;
    public final AnonymousClass33p A01;
    public final C29041iB A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;
    public final C56572sD A05;
    public final boolean A06;
    public final boolean A07;

    public final void A00(C89644eZ r12, AnonymousClass3ZH r13, boolean z) {
        String str;
        C89644eZ r3 = r12;
        boolean A1Y = AnonymousClass0x2.A1Y(r12, r13);
        Jid A052 = AnonymousClass3ZH.A05(r13, UserJid.class);
        C162457s7.A0D(A052);
        UserJid userJid = (UserJid) A052;
        boolean A09 = this.A05.A09(userJid);
        if (z) {
            if (A09) {
                str = "chat_fmx_card_safety_tools_block";
            } else {
                str = "chat_fmx_card_safety_tools_block_suspicious";
            }
        } else if (A09) {
            str = "chat_fmx_card_block";
        } else {
            str = "chat_fmx_card_block_suspicious";
        }
        if (r13.A0R()) {
            r12.startActivity(C627736r.A0m(r3, userJid, str, A1Y, false, A1Y, A1Y, A1Y));
            return;
        }
        AnonymousClass64Q r0 = this.A00;
        C626936e.A06(userJid);
        C103835Op Azw = r0.Azw(userJid, str);
        Azw.A04 = A1Y;
        Azw.A05 = false;
        AnonymousClass1VX r1 = Azw.A06;
        if (!r1.A0X(6187)) {
            Azw.A02 = A1Y;
        }
        if (!r1.A0X(6185)) {
            Azw.A03 = A1Y;
        }
        Azw.A01(A1Y ? 1 : 0, A1Y);
        r12.Boo(C103835Op.A00(Azw));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass4UP r5, java.lang.Integer r6, int r7, int r8) {
        /*
            r4 = this;
            X.1a7 r3 = new X.1a7
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A03 = r0
            if (r5 == 0) goto L_0x006e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A02 = r0
            X.08M r2 = r5.A01
            java.util.List r0 = X.C86644Kx.A0h(r2)
            if (r0 == 0) goto L_0x007a
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C134276ik
            if (r0 == 0) goto L_0x0023
            r0 = 1
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            java.util.List r0 = X.C86644Kx.A0h(r2)
            if (r0 == 0) goto L_0x0078
            java.util.Iterator r2 = r0.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r1 = r2.next()
            X.74Y r1 = (X.AnonymousClass74Y) r1
            boolean r0 = r1 instanceof X.C134266ij
            if (r0 == 0) goto L_0x0042
            X.6ij r1 = (X.C134266ij) r1
            X.5XS r0 = r1.A00
            int r0 = r0.A00
        L_0x0058:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r3.A06 = r0
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x006e
            X.3ZH r0 = r5.A03
            boolean r0 = r0.A0R()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
        L_0x006e:
            if (r6 == 0) goto L_0x0072
            r3.A05 = r6
        L_0x0072:
            X.4FV r0 = r4.A04
            r0.BhD(r3)
            return
        L_0x0078:
            r0 = 0
            goto L_0x0058
        L_0x007a:
            r0 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104285Qj.A01(X.4UP, java.lang.Integer, int, int):void");
    }

    public C104285Qj(AnonymousClass64Q r2, AnonymousClass33p r3, C29041iB r4, AnonymousClass1VX r5, AnonymousClass4FV r6, C56572sD r7) {
        C18260x0.A0f(r5, r6, r7, r3, r4);
        C162457s7.A0J(r2, 6);
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A06 = r5.A0X(3962);
        this.A07 = r5.A0X(5263);
    }
}
