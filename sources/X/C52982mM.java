package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2mM  reason: invalid class name and case insensitive filesystem */
public class C52982mM {
    public final C56612sH A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass316 A02;
    public final ConcurrentHashMap A03 = AnonymousClass0x9.A1D();

    public void A00(Integer num, String str, int i) {
        AnonymousClass2TM r5 = (AnonymousClass2TM) this.A03.get(str);
        if (r5 != null && r5.A06 == 0) {
            r5.A06 = SystemClock.uptimeMillis();
            r5.A01 = Integer.valueOf(i);
            r5.A02 = num;
            AnonymousClass316 r2 = this.A02;
            int hashCode = str.hashCode();
            r2.A03(hashCode, "iq_send");
            r2.A04(hashCode, "iq_processing_queue");
        }
    }

    public void A01(String str) {
        AnonymousClass2TM r5 = (AnonymousClass2TM) this.A03.get(str);
        if (r5 != null && r5.A03 == 0) {
            r5.A03 = SystemClock.uptimeMillis();
            AnonymousClass316 r2 = this.A02;
            int hashCode = str.hashCode();
            r2.A03(hashCode, "iq_processing_queue");
            r2.A04(hashCode, "iq_processing");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r9, java.lang.Integer r10) {
        /*
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.A03
            java.lang.Object r4 = r0.remove(r9)
            X.2TM r4 = (X.AnonymousClass2TM) r4
            if (r4 == 0) goto L_0x0080
            long r1 = r4.A04
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A04 = r0
            if (r10 == 0) goto L_0x001c
            r4.A01 = r10
        L_0x001c:
            X.1aT r5 = new X.1aT
            r5.<init>()
            int r0 = r4.A00
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r5.A06 = r0
            long r2 = r4.A07
            long r0 = r4.A05
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A04 = r0
            long r2 = r4.A06
            long r0 = r4.A07
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A01 = r0
            long r2 = r4.A04
            long r0 = r4.A03
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A02 = r0
            long r2 = r4.A04
            long r0 = r4.A06
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A03 = r0
            long r2 = r4.A04
            long r0 = r4.A05
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r5.A05 = r0
            java.lang.Integer r0 = r4.A01
            r3 = 1
            if (r0 != 0) goto L_0x0081
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0064:
            r5.A00 = r0
        L_0x0066:
            X.4FV r0 = r8.A01
            r0.BhD(r5)
            X.316 r3 = r8.A02
            int r2 = r9.hashCode()
            java.lang.String r0 = "iq_processing"
            r3.A03(r2, r0)
            java.lang.Integer r1 = r4.A01
            r0 = 2
            if (r1 == 0) goto L_0x007d
            r0 = 87
        L_0x007d:
            r3.A07(r2, r0)
        L_0x0080:
            return
        L_0x0081:
            int r2 = r0.intValue()
            r1 = 2
            r0 = 3
            if (r0 == r2) goto L_0x0092
            if (r1 == r2) goto L_0x0092
            if (r3 == r2) goto L_0x0092
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0064
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A00 = r0
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0066
            int r0 = r0.intValue()
            long r1 = (long) r0
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r5.A07 = r0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52982mM.A02(java.lang.String, java.lang.Integer):void");
    }

    public C52982mM(C59052wG r4, C56612sH r5, AnonymousClass4FV r6) {
        this.A00 = r5;
        this.A01 = r6;
        C47122ck r1 = new C47122ck(154475307);
        r1.A05 = r1.A05;
        r1.A03 = false;
        this.A02 = r4.A01(r1, "IqPerfTracker");
    }
}
