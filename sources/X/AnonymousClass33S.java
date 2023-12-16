package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;

/* renamed from: X.33S  reason: invalid class name */
public class AnonymousClass33S {
    public final C55682qk A00;
    public final C49712gy A01;
    public final C29411im A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass31C A04;
    public final AnonymousClass34P A05;
    public final C55882r4 A06;
    public final C55892r5 A07;

    public void A00() {
        this.A04.A0J(AnonymousClass0x7.A0G(13));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if ("played".equals(r4) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass39T r11) {
        /*
            r10 = this;
            X.2r5 r0 = r10.A07
            long r7 = r11.A00
            r0.A04(r7)
            X.1im r0 = r10.A02
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0075
            java.lang.String r5 = r11.A05
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "read"
            java.lang.String r4 = r11.A08
            boolean r3 = r0.equals(r4)
            X.34P r0 = r10.A05
            X.1VX r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "played"
            boolean r1 = r0.equals(r4)
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r3 != 0) goto L_0x003e
            if (r0 == 0) goto L_0x0076
        L_0x003e:
            X.1VX r4 = r10.A03
            X.2qk r3 = r10.A00
            X.2r4 r1 = r10.A06
            com.whatsapp.jid.Jid r0 = r11.A02
            X.4uZ r0 = X.C627336j.A02(r0)
            boolean r0 = r1.A02(r0)
            r2 = r0 ^ 1
            boolean r9 = r11.A04()
            java.lang.String r6 = r11.A03()
            X.AnonymousClass36N.A0A(r3, r4, r5, r6, r7, r9)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "stanzaKey"
            r1.putParcelable(r0, r11)
            java.lang.String r0 = "disable"
            r1.putBoolean(r0, r2)
            r0 = 96
            android.os.Message r0 = X.C18290x4.A0J(r0, r1)
            X.31C r2 = r10.A04
        L_0x0072:
            r2.A0J(r0)
        L_0x0075:
            return
        L_0x0076:
            X.31C r2 = r10.A04
            X.1VX r1 = r10.A03
            X.2qk r0 = r10.A00
            android.os.Message r0 = X.AnonymousClass36N.A03(r0, r1, r11)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33S.A01(X.39T):void");
    }

    public void A02(C30471mV r5) {
        StringBuilder A0o;
        String str;
        AnonymousClass2z0 r1 = r5.A1J;
        if (r1.A02) {
            A0o = AnonymousClass001.A0o();
            str = "sendMethods/sendMessageMediaError skip sending error because message is from_me:";
        } else if (r1.A00 instanceof C135176kF) {
            A0o = AnonymousClass001.A0o();
            str = "sendMethods/sendMessageMediaError skip sending error because jid is gdpr";
        } else {
            AnonymousClass33C r0 = r5.A01;
            if (r0 == null || r0.A0W == null) {
                A0o = AnonymousClass001.A0o();
                str = "sendMethods/sendMessageMediaError skip sending error since no media key";
            } else {
                C18260x0.A1P(AnonymousClass001.A0o(), "sendMethods/sendMessageMediaError message:", r5);
                C49712gy r3 = this.A01;
                byte[] bArr = C30471mV.A00(r5).A0W;
                C626936e.A06(bArr);
                r3.A02(new SendMediaErrorReceiptJob((C95814uZ) null, r5, (String) null, bArr));
                return;
            }
        }
        C18260x0.A1P(A0o, str, r5);
    }

    public boolean A06(String str, String str2) {
        return this.A04.A0J(C18290x4.A0J(36, new AnonymousClass2LQ(str, str2)));
    }

    public AnonymousClass33S(C55682qk r1, C49712gy r2, C29411im r3, AnonymousClass1VX r4, AnonymousClass31C r5, AnonymousClass34P r6, C55882r4 r7, C55892r5 r8) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A07 = r8;
    }

    public void A03(String str, Long l) {
        Log.i("sendmethods/sendClearDirty");
        AnonymousClass31C r5 = this.A04;
        Message A0G = AnonymousClass0x7.A0G(18);
        A0G.getData().putString("category", str);
        if (l != null) {
            A0G.getData().putLong("timestamp", l.longValue());
        }
        r5.A0J(A0G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((r3 instanceof X.C95804uY) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.Set r10, boolean r11) {
        /*
            r9 = this;
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            java.util.Iterator r8 = r10.iterator()
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005a
            X.34x r7 = X.C18300x5.A0T(r8)
            X.2z0 r6 = r7.A1J
            X.4uZ r3 = r6.A00
            X.4uZ r2 = r7.A0n()
            boolean r0 = r7 instanceof X.C30331mH
            if (r0 != 0) goto L_0x0023
            boolean r1 = r3 instanceof X.C95804uY
            r0 = 0
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            X.2xw r4 = new X.2xw
            r4.<init>(r3, r2, r0)
            boolean r0 = r5.containsKey(r4)
            if (r0 == 0) goto L_0x0044
            java.lang.Object r3 = r5.get(r4)
            java.util.List r3 = (java.util.List) r3
            java.lang.Long r2 = X.C624134x.A0A(r7)
            java.lang.String r1 = r6.A01
            X.2fY r0 = new X.2fY
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L_0x0008
        L_0x0044:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.lang.Long r2 = X.C624134x.A0A(r7)
            java.lang.String r1 = r6.A01
            X.2fY r0 = new X.2fY
            r0.<init>(r2, r1)
            r3.add(r0)
            r5.put(r4, r3)
            goto L_0x0008
        L_0x005a:
            java.util.Set r0 = X.AnonymousClass34P.A00(r5)
            java.util.Iterator r3 = r0.iterator()
        L_0x0062:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r3.next()
            X.2b1 r2 = (X.C46062b1) r2
            X.2gy r1 = r9.A01
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r11)
            r1.A02(r0)
            goto L_0x0062
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33S.A04(java.util.Set, boolean):void");
    }

    public void A05(boolean z) {
        Log.i("sendmethods/sendGetServerProps");
        AnonymousClass31C r2 = this.A04;
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("forceRefresh", z);
        r2.A0J(C18290x4.A0J(21, A08));
    }
}
