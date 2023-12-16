package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1SN  reason: invalid class name */
public class AnonymousClass1SN extends AnonymousClass33W {
    public final C27981fH A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r1[0].equals(r2) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1SN(X.C60642yt r13, X.AnonymousClass33J r14, X.C27981fH r15, com.whatsapp.jid.UserJid r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20) {
        /*
            r12 = this;
            r2 = r18
            r1 = r19
            r8 = 2
            r11 = 0
            java.lang.String r7 = "critical_unblock_low"
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r17
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r0 = r16
            r12.A01 = r0
            r12.A00 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = ""
        L_0x0020:
            r12.A02 = r1
            if (r18 == 0) goto L_0x0038
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0035
            r0 = r1[r11]
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0038
        L_0x0035:
            r12.A03 = r2
            return
        L_0x0038:
            java.lang.String r2 = ""
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SN.<init>(X.2yt, X.33J, X.1fH, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public AnonymousClass18L A06() {
        if (this.A05.equals(C60642yt.A02)) {
            return null;
        }
        C130546c9 A0G = AnonymousClass1CM.DEFAULT_INSTANCE.A0G();
        String str = this.A02;
        AnonymousClass1CM r1 = (AnonymousClass1CM) C18320x8.A0C(A0G);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.fullName_ = str;
        String str2 = this.A03;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass1CM r12 = (AnonymousClass1CM) C18320x8.A0C(A0G);
            str2.getClass();
            r12.bitField0_ |= 2;
            r12.firstName_ = str2;
        }
        C27981fH r0 = this.A00;
        if (r0 != null) {
            String A0g = C18300x5.A0g(A0G, r0);
            AnonymousClass1CM r13 = (AnonymousClass1CM) A0G.A00;
            A0g.getClass();
            r13.bitField0_ |= 4;
            r13.lidJid_ = A0g;
        }
        AnonymousClass18L A06 = super.A06();
        AnonymousClass1EO A002 = AnonymousClass33W.A00(A06);
        AnonymousClass1CM r02 = (AnonymousClass1CM) A0G.A06();
        r02.getClass();
        A002.contactAction_ = r02;
        A002.bitField0_ |= 4;
        return A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass33W.A02(this, "ContactMutation{rowId=", A0o);
        A0o.append(", contactJid=");
        A0o.append(this.A01);
        A0o.append(", lidJid=");
        A0o.append(this.A00);
        A0o.append(", givenName=");
        A0o.append(this.A03);
        A0o.append(", displayName=");
        A0o.append(this.A02);
        A0o.append(", timestamp=");
        AnonymousClass33W.A05(this, A0o, this.A04);
        return A0o.toString();
    }
}
