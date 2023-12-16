package X;

import android.os.Handler;
import com.facebook.debug.tracer.Tracer;

/* renamed from: X.0gt  reason: invalid class name and case insensitive filesystem */
public class C09870gt implements C187468xG {
    public static C09870gt A04;
    public C06030Vy A00;
    public AnonymousClass0MX A01;
    public String A02;
    public boolean A03;

    public static C09870gt A00() {
        C09870gt r0 = A04;
        if (r0 != null) {
            return r0;
        }
        C09870gt r02 = new C09870gt();
        A04 = r02;
        return r02;
    }

    public void A01(Handler handler, C16820u1 r3, C187478xH r4, int i, boolean z) {
        if (r3 != null) {
            this.A03 = z;
            this.A01 = new AnonymousClass0MX(handler, r3, i);
            this.A02 = "HeroSimpleCache";
            this.A00 = new C06030Vy();
            r4.AwN(this);
        }
    }

    public void A02(C172488Li r3) {
        Tracer.A01("CacheInstrumentationListener.onReleaseHoleSpan");
        try {
            C06030Vy r1 = this.A00;
            synchronized (r1) {
                r1.A01.remove(r3);
                r1.A00.remove(r3);
            }
            Tracer.A00();
        } catch (Throwable th) {
            Tracer.A00();
            throw th;
        }
    }

    public void A03(C172488Li r2, C160777oI r3, String str) {
        Tracer.A01("CacheInstrumentationListener.onOpenHoleSpan");
        if (r2 != null) {
            try {
                if (!r2.A08) {
                    this.A00.A03(r2, r3, str);
                }
            } catch (Throwable th) {
                Tracer.A00();
                throw th;
            }
        }
        Tracer.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r0 > -1) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass0UP r28) {
        /*
            r27 = this;
            java.lang.String r0 = "CacheInstrumentationListener.onRequestComplete"
            com.facebook.debug.tracer.Tracer.A01(r0)
            r1 = r27
            X.0MX r4 = r1.A01     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0081
            r8 = r28
            boolean r0 = r8.A08     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0081
            X.6wi r14 = r8.A01()     // Catch:{ all -> 0x0085 }
            boolean r0 = r1.A03     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0081
            java.lang.String r15 = r1.A02     // Catch:{ all -> 0x0085 }
            X.7oI r6 = r8.A0A     // Catch:{ all -> 0x0085 }
            java.lang.String r16 = r6.A01()     // Catch:{ all -> 0x0085 }
            X.6vI r0 = r6.A00()     // Catch:{ all -> 0x0085 }
            java.lang.String r17 = r0.name()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r8.A07     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r8.A0B     // Catch:{ all -> 0x0085 }
            long r2 = r8.A03     // Catch:{ all -> 0x0085 }
            r12 = r2
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            long r0 = r8.A02     // Catch:{ all -> 0x0085 }
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            java.lang.Long r0 = r8.A06     // Catch:{ all -> 0x0085 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0085 }
        L_0x0048:
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            java.lang.Long r0 = r8.A05     // Catch:{ all -> 0x0085 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0085 }
            goto L_0x0061
        L_0x0059:
            long r0 = r8.A02     // Catch:{ all -> 0x0085 }
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0052
        L_0x0061:
            android.util.Pair r13 = r8.A04     // Catch:{ all -> 0x0085 }
            java.lang.String r20 = r6.A04()     // Catch:{ all -> 0x0085 }
            java.lang.String r21 = r6.A03()     // Catch:{ all -> 0x0085 }
            boolean r26 = r6.A06()     // Catch:{ all -> 0x0085 }
            X.8LJ r12 = new X.8LJ     // Catch:{ all -> 0x0085 }
            r22 = r2
            r24 = r0
            r18 = r7
            r19 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26)     // Catch:{ all -> 0x0085 }
            java.util.List r0 = r4.A04     // Catch:{ all -> 0x0085 }
            r0.add(r12)     // Catch:{ all -> 0x0085 }
        L_0x0081:
            com.facebook.debug.tracer.Tracer.A00()
            return
        L_0x0085:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09870gt.A04(X.0UP):void");
    }

    public void Bbr(C186458vL r16, C172488Li r17) {
        boolean z;
        String str;
        String str2;
        Tracer.A01("CacheInstrumentationListener.onSpanAdded");
        try {
            if (this.A01 != null) {
                String str3 = "";
                String str4 = "UNKNOWN";
                C172488Li r2 = r17;
                AnonymousClass0LY A002 = this.A00.A02(r2);
                String str5 = "unknown";
                if (A002 != null) {
                    C160777oI r1 = A002.A00;
                    str2 = r1.A01();
                    str4 = r1.A00().name();
                    str3 = A002.A01;
                    str = r1.A04();
                    if (str == null) {
                        str = str5;
                    }
                    String A032 = r1.A03();
                    if (A032 != null) {
                        str5 = A032;
                    }
                    z = r1.A06();
                } else {
                    str2 = str5;
                    str = str5;
                    z = false;
                }
                AnonymousClass0MX r0 = this.A01;
                r0.A04.add(AnonymousClass8LJ.A01(this.A02, str2, str4, r2.A07, str3, str, str5, r2.A05, r2.A04, z));
            }
        } finally {
            Tracer.A00();
        }
    }

    public void Bbs(C186458vL r2, C172488Li r3) {
        Tracer.A01("CacheInstrumentationListener.onSpanRemoved");
        Tracer.A00();
    }

    public void Bbt(C140846uc r12, C186458vL r13, C172488Li r14, C172488Li r15) {
        Tracer.A01("CacheInstrumentationListener.onSpanTouched");
        try {
            AnonymousClass0MX r0 = this.A01;
            if (!(r0 == null || r14 == null || r12 == C140846uc.INIT_SEGMENT)) {
                r0.A04.add(AnonymousClass8LJ.A00(this.A02, r14.A07, r14.A05, r14.A04, r15.A05, r15.A04));
            }
        } finally {
            Tracer.A00();
        }
    }

    public void BSI(String str, String str2, int i, int i2) {
    }

    public void BcC(C186458vL r1, String str, long j, long j2) {
    }
}
