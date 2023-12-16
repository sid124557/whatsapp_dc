package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2r4  reason: invalid class name and case insensitive filesystem */
public class C55882r4 {
    public final C55682qk A00;
    public final C64773Ex A01;
    public final C56612sH A02;
    public final AnonymousClass33p A03;
    public final AnonymousClass318 A04;
    public final AnonymousClass1VX A05;
    public final C56572sD A06;

    public AnonymousClass2T1 A00(C95814uZ r18, C95814uZ r19, DeviceJid deviceJid, UserJid userJid, String[] strArr, long j, boolean z) {
        AnonymousClass2T1 r11;
        C95814uZ r12 = r19;
        String str = "read-self";
        C95814uZ r6 = r18;
        if (!z && ((C627336j.A0K(r6) || this.A03.A2G()) && !(r6 instanceof C95804uY) && !(r6 instanceof C135216kJ))) {
            str = "read";
        }
        DeviceJid deviceJid2 = deviceJid;
        UserJid userJid2 = userJid;
        String[] strArr2 = strArr;
        if (r12 instanceof C135166kE) {
            Log.w("ReadReceiptUtils/buildReadReceiptHandler malformed participant flipping");
            r11 = new AnonymousClass2T1(r6, deviceJid2, userJid2, AnonymousClass2z0.A05(C135166kE.A00, strArr[0], false), str);
        } else {
            AnonymousClass2z0 A052 = AnonymousClass2z0.A05(r6, strArr[0], false);
            if (r6 instanceof C135216kJ) {
                r12 = null;
            }
            r11 = new AnonymousClass2T1(r12, deviceJid2, userJid2, A052, str);
        }
        r11.A00 = j;
        int length = strArr2.length;
        if (length > 1) {
            int i = length - 1;
            String[] strArr3 = new String[i];
            r11.A01 = strArr3;
            System.arraycopy(strArr2, 1, strArr3, 0, i);
        }
        return r11;
    }

    public boolean A05(C624134x r6) {
        if (!A02(r6.A1J.A00) || r6.A0K < 1415214000000L || (r6 instanceof C30331mH)) {
            return false;
        }
        return true;
    }

    public C55882r4(C55682qk r1, C64773Ex r2, C56612sH r3, AnonymousClass33p r4, AnonymousClass318 r5, AnonymousClass1VX r6, C56572sD r7) {
        this.A02 = r3;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public boolean A01(C95814uZ r2) {
        if (A02(r2)) {
            return true;
        }
        if (!AnonymousClass0x7.A1S(this.A04.A04())) {
            return false;
        }
        if (C627336j.A0K(r2) || (r2 instanceof C95804uY) || (r2 instanceof C135216kJ) || !A03(r2)) {
            return true;
        }
        return false;
    }

    public boolean A02(C95814uZ r3) {
        if (C627336j.A0K(r3) || (r3 instanceof C95804uY) || (r3 instanceof C135216kJ) || (this.A03.A2G() && !A03(r3))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r1.A02() != false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C95814uZ r4) {
        /*
            r3 = this;
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r4)
            r2 = 0
            if (r4 == 0) goto L_0x0029
            if (r1 == 0) goto L_0x0029
            X.2sD r0 = r3.A06
            boolean r0 = r0.A09(r1)
            if (r0 != 0) goto L_0x0029
            X.3Ex r0 = r3.A01
            X.3ZH r0 = r0.A07(r4)
            if (r0 == 0) goto L_0x0029
            X.2qS r1 = r0.A0E
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x002a
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x002f
        L_0x0029:
            return r2
        L_0x002a:
            X.1VX r2 = r3.A05
            r1 = 5263(0x148f, float:7.375E-42)
            goto L_0x0033
        L_0x002f:
            X.1VX r2 = r3.A05
            r1 = 3962(0xf7a, float:5.552E-42)
        L_0x0033:
            X.2vE r0 = X.C58422vE.A02
            boolean r2 = r2.A0Y(r0, r1)
            if (r2 == 0) goto L_0x0029
            java.lang.String r0 = "Disabling read receipts for possible spam"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55882r4.A03(X.4uZ):boolean");
    }

    public boolean A04(C95814uZ r5, Throwable th, String[] strArr, long j, boolean z) {
        String str;
        if (A01(r5)) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (C107575bX.A0F(strArr[i])) {
                    Log.e("ReadReceiptUtils/buildReadReceiptHandler received invalid message id(s)");
                    if (th != null) {
                        this.A00.A09("SendReadReceiptInvalidMessageIds", "Unable to send read receipts as it has invalid message id(s)", th);
                    }
                } else {
                    i++;
                }
            }
            if ((r5 instanceof C135166kE) && j > 0 && j + 86400000 < this.A02.A0H()) {
                return false;
            }
            if (z || ((!C627336j.A0K(r5) && !this.A03.A2G()) || (r5 instanceof C95804uY) || (r5 instanceof C135216kJ))) {
                str = "read-self";
            } else {
                str = "read";
            }
            if (!"read-self".equals(str) || AnonymousClass0x7.A1S(this.A04.A04())) {
                return true;
            }
            Log.d("ReadReceiptUtils/buildReadReceiptHandler skipping sending read-self/no companions");
            return false;
        }
        return false;
    }
}
