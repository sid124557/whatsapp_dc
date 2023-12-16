package X;

import android.content.Context;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.whatsapp.perf.profilo.ProfiloUploadService;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.316  reason: invalid class name */
public class AnonymousClass316 {
    public long A00;
    public C25661as A01;
    public C49172g6 A02;
    public C48732fN A03;
    public Long A04;
    public boolean A05;
    public final long A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final AnonymousClass4FV A09;
    public final C47122ck A0A;
    public final C84084Ay A0B;
    public final AnonymousClass8JP A0C;
    public final C186568vZ A0D;
    public final AnonymousClass4FS A0E;
    public final String A0F;

    public final void A00() {
        C47122ck r1 = this.A0A;
        if (r1.A04 && this.A03 != null) {
            Log.d("IntegratedPerfTracker/endProfilo");
            C48732fN r4 = this.A03;
            Long l = this.A04;
            int i = r1.A07;
            r4.A01(l, new HashMap(4), i);
            C49172g6 r0 = this.A02;
            if (r0 != null) {
                r0.A00();
            }
            C159837mX.A00(i);
            Context context = this.A08.A00;
            Class<ProfiloUploadService> cls = ProfiloUploadService.class;
            AnonymousClass00W.A00(context, AnonymousClass0x9.A08(context, cls), cls, 8);
        }
    }

    public final void A01() {
        C25661as r8 = this.A01;
        if (r8 != null && !this.A05) {
            C47122ck r1 = this.A0A;
            r8.A05 = Integer.valueOf(r1.A00);
            r8.A09 = r1.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanoTime = System.nanoTime();
            long j = this.A00;
            if (j <= 0) {
                j = this.A06;
            }
            r8.A08 = Long.valueOf(timeUnit.convert(nanoTime - j, TimeUnit.NANOSECONDS));
            this.A09.BhD(this.A01);
            this.A05 = true;
        }
    }

    public final void A02() {
        C126216Mx r0;
        C47122ck r1 = this.A0A;
        if (r1.A04) {
            Log.d("IntegratedPerfTracker/startProfilo");
            Context context = this.A08.A00;
            int i = r1.A07;
            C159837mX.A01(context, i);
            if (C159837mX.A00 == 2 && (r0 = C159837mX.A01) != null) {
                MultiBufferLogger A002 = r0.A00();
                this.A03 = new C48732fN(A002);
                this.A02 = this.A0B.B02(A002);
                this.A04 = this.A03.A00(i);
            }
        }
    }

    public void A05(int i, String str) {
        C47122ck r2 = this.A0A;
        if (r2.A00()) {
            this.A0D.markerPoint(r2.A07, i, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(int r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            r2 = -1
            X.2ck r1 = r8.A0A
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x000f
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            r8.A00 = r2
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x001c
            X.1as r0 = new X.1as
            r0.<init>()
            r8.A01 = r0
        L_0x001c:
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x000e
            X.8JP r2 = r8.A0C
            int r5 = r1.A07
            java.lang.String r3 = "perf_origin"
            java.lang.String r4 = "Censored"
            boolean r1 = r1.A03
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x003c
        L_0x0035:
            X.8vZ r2 = r2.A01
            r6 = r9
            r7 = r11
            r2.BKo(r3, r4, r5, r6, r7)
        L_0x003c:
            r8.A02()
            return
        L_0x0040:
            r4 = r10
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass316.A06(int, java.lang.String, boolean):void");
    }

    public void A07(int i, short s) {
        C47122ck r2 = this.A0A;
        if (r2.A00()) {
            this.A0D.markerEnd(r2.A07, i, s);
        }
        if (r2.A06) {
            A01();
        }
        A00();
    }

    public void A08(long j) {
        C186568vZ r4 = this.A0D;
        int i = this.A0A.A07;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("launch_2_");
        String str = this.A0F;
        A0o.append(str);
        String A0X = AnonymousClass000.A0X("_start", A0o);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        r4.markerPoint(i, A0X, j, timeUnit);
        String A0X2 = AnonymousClass000.A0X("_end", AnonymousClass000.A0m("launch_2_", str));
        long j2 = this.A06;
        r4.markerPoint(i, A0X2, j2, timeUnit);
        r4.markerPoint(i, AnonymousClass000.A0U("init_2_", str, "_start", AnonymousClass001.A0o()), j2, timeUnit);
        A09(AnonymousClass000.A0T("init_2_", str));
    }

    public void A0B(String str) {
        C47122ck r2 = this.A0A;
        if (r2.A00()) {
            this.A0D.markerPoint(r2.A07, str);
        }
    }

    public void A0C(String str, boolean z, String str2) {
        if (z) {
            this.A0D.markerAnnotate(this.A0A.A07, str, str2);
        } else {
            this.A0C.markerAnnotate(this.A0A.A07, str, str2);
        }
    }

    public void A0D(String str, boolean z, boolean z2) {
        if (z2) {
            this.A0D.markerAnnotate(this.A0A.A07, str, z);
        } else {
            this.A0C.markerAnnotate(this.A0A.A07, str, z);
        }
    }

    public void A0E(short s) {
        C47122ck r2 = this.A0A;
        if (r2.A00()) {
            this.A0D.markerEnd(r2.A07, s);
        }
        if (r2.A06) {
            A01();
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r1 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(java.lang.String r10, long r11) {
        /*
            r9 = this;
            X.2ck r1 = r9.A0A
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            r6 = r11
            r9.A00 = r11
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x001c
            X.1as r0 = new X.1as
            r0.<init>()
            r9.A01 = r0
        L_0x001c:
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0048
            r2 = 0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            X.8JP r2 = r9.A0C
            int r3 = r1.A07
            java.lang.String r4 = "perf_origin"
            java.lang.String r5 = "Censored"
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r1 = r1.A03
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x0042
        L_0x003d:
            X.8vZ r2 = r2.A01
            r2.BKm(r3, r4, r5, r6, r8)
        L_0x0042:
            r9.A08(r11)
        L_0x0045:
            r9.A02()
        L_0x0048:
            r0 = 1
            return r0
        L_0x004a:
            r5 = r10
            goto L_0x003d
        L_0x004c:
            X.8JP r5 = r9.A0C
            int r4 = r1.A07
            java.lang.String r3 = "perf_origin"
            java.lang.String r2 = "Censored"
            boolean r1 = r1.A03
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x0060
            if (r1 == 0) goto L_0x0045
            r10 = r2
        L_0x0060:
            X.8vZ r0 = r5.A01
            r0.markerStart(r4, r3, r10)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass316.A0F(java.lang.String, long):boolean");
    }

    public AnonymousClass316(C56612sH r3, C54292oU r4, AnonymousClass4FV r5, C47122ck r6, C84084Ay r7, AnonymousClass8JP r8, C186568vZ r9, AnonymousClass4FS r10, String str) {
        this.A00 = -1;
        this.A05 = false;
        this.A0D = r9;
        this.A0F = str;
        this.A07 = r3;
        this.A08 = r4;
        this.A0E = r10;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
        this.A06 = System.nanoTime();
        this.A0C = r8;
    }

    public void A03(int i, String str) {
        A05(i, AnonymousClass000.A0X("_end", AnonymousClass000.A0l(str)));
    }

    public void A04(int i, String str) {
        A05(i, AnonymousClass000.A0X("_start", AnonymousClass000.A0l(str)));
    }

    public void A09(String str) {
        A0B(AnonymousClass000.A0X("_end", AnonymousClass000.A0l(str)));
    }

    public void A0A(String str) {
        A0B(AnonymousClass000.A0X("_start", AnonymousClass000.A0l(str)));
    }

    public AnonymousClass316(C56612sH r11, C54292oU r12, AnonymousClass4FV r13, C84084Ay r14, AnonymousClass8JP r15, C186568vZ r16, AnonymousClass4FS r17, String str, int i) {
        this(r11, r12, r13, new C47122ck(i), r14, r15, r16, r17, str);
    }
}
