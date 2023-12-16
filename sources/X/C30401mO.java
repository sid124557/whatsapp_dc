package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.1mO  reason: invalid class name and case insensitive filesystem */
public final class C30401mO extends C624134x implements AnonymousClass4B9 {
    public C47852dw A00;
    public AnonymousClass3ZF A01;

    public void A1G(int i) {
        super.A1G(6);
    }

    public C624134x Az3(AnonymousClass2z0 r4) {
        C162457s7.A0J(r4, 0);
        return new C30401mO(this, r4, this.A0K);
    }

    public C30401mO(C47852dw r3, AnonymousClass2z0 r4, AnonymousClass3ZF r5) {
        this(r4, r5.A0B);
        UserJid userJid;
        this.A01 = r5;
        this.A00 = r3;
        AnonymousClass39J r1 = r5.A0E;
        if (r1.A03) {
            DeviceJid deviceJid = r5.A0C;
            if (deviceJid != null) {
                userJid = deviceJid.userJid;
            } else {
                return;
            }
        } else {
            userJid = r1.A01;
        }
        A1J(userJid);
    }

    public final boolean A1v() {
        AnonymousClass3ZF r1 = this.A01;
        if (r1 == null || r1.A05 != null || !r1.A0L()) {
            return false;
        }
        return true;
    }

    public final boolean A1w() {
        AnonymousClass3ZF r1 = this.A01;
        if (r1 == null || !r1.A0E.A03 || r1.A00 != 7) {
            return false;
        }
        return true;
    }

    public final boolean A1y() {
        AnonymousClass3ZF r0;
        C47852dw r1;
        String str;
        Object obj;
        AnonymousClass3ZF r02 = this.A01;
        Boolean bool = null;
        if (r02 != null) {
            bool = Boolean.valueOf(r02.A0L());
        }
        if (AnonymousClass0x9.A1Q(bool)) {
            AnonymousClass3ZF r03 = this.A01;
            if (r03 == null || r03.A07 == null) {
                return false;
            }
            return true;
        } else if (!C162457s7.A0P(bool, Boolean.FALSE) || (r0 = this.A01) == null || r0.A00 != 0 || (r1 = this.A00) == null || (str = this.A1J.A01) == null || (obj = r1.A00.get(C627436k.A07(str))) == null || obj == CallState.NONE || obj == CallState.LINK || obj == CallState.PRECALLING) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.A02 == 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1z() {
        /*
            r3 = this;
            X.3ZF r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x003f
            int r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.A20()
            if (r0 == 0) goto L_0x003f
            X.3ZF r0 = r3.A01
            if (r0 == 0) goto L_0x003f
            r0.A0A()
            int r0 = r0.A02
            if (r0 != 0) goto L_0x003f
        L_0x001a:
            X.2dw r1 = r3.A00
            if (r1 == 0) goto L_0x003f
            X.2z0 r0 = r3.A1J
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x003f
            java.util.HashMap r1 = r1.A00
            java.lang.String r0 = X.C627436k.A07(r0)
            java.lang.Object r0 = r1.get(r0)
            com.whatsapp.voipcalling.CallState r0 = (com.whatsapp.voipcalling.CallState) r0
            if (r0 == 0) goto L_0x003f
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0040
            r0 = 2
            if (r1 == r0) goto L_0x0040
            r0 = 3
            if (r1 == r0) goto L_0x0040
        L_0x003f:
            return r2
        L_0x0040:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30401mO.A1z():boolean");
    }

    public final boolean A20() {
        AnonymousClass3ZF r1 = this.A01;
        if (r1 == null || r1.A05 == null || r1.A0H != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r0.A02 == 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1x() {
        /*
            r4 = this;
            boolean r0 = r4.A1y()
            r3 = 0
            if (r0 != 0) goto L_0x0033
            X.3ZF r0 = r4.A01
            if (r0 == 0) goto L_0x0033
            int r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0033
            r0 = 2
            if (r2 == r0) goto L_0x0021
            r0 = 4
            if (r2 == r0) goto L_0x0021
            if (r2 == r1) goto L_0x0021
            if (r2 == 0) goto L_0x0021
            r0 = 3
            if (r2 != r0) goto L_0x0033
        L_0x0021:
            boolean r0 = r4.A20()
            if (r0 == 0) goto L_0x0034
            X.3ZF r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            r0.A0A()
            int r0 = r0.A02
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        L_0x0034:
            boolean r0 = r4.A20()
            if (r0 != 0) goto L_0x0033
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30401mO.A1x():boolean");
    }

    public C30401mO(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 90, j);
        A1G(6);
    }

    public C30401mO(C30401mO r8, AnonymousClass2z0 r9, long j) {
        super(r8, r9, j, true);
        this.A01 = r8.A01;
        this.A00 = r8.A00;
    }
}
