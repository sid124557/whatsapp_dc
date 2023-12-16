package X;

import com.whatsapp.util.Log;

/* renamed from: X.5Xf  reason: invalid class name and case insensitive filesystem */
public class C105995Xf {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass2M9 A02;
    public volatile Boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1.A0X(2012) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0024
            monitor-enter(r2)
            X.1VX r1 = r2.A00     // Catch:{ all -> 0x0021 }
            r0 = 2755(0xac3, float:3.86E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0018
            r0 = 2012(0x7dc, float:2.82E-42)
            boolean r1 = r1.A0X(r0)     // Catch:{ all -> 0x0021 }
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0021 }
            r2.A03 = r0     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0024
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0024:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r2.A03
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105995Xf.A04():boolean");
    }

    public C105995Xf(AnonymousClass1VX r1, AnonymousClass4FV r2, AnonymousClass2M9 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935 || hashCode != 3005871 || !str.equals("auto")) {
                return 3;
            }
            return 1;
        } else if (str.equals("on")) {
            return 2;
        } else {
            return 3;
        }
    }

    public void A01(int i) {
        if (A04()) {
            Log.d("CameraCaptureFlowLogger/logCaptureInitialized");
            C95164sj r3 = new C95164sj();
            r3.A09 = AnonymousClass001.A0f();
            if (i == 1 || i == 2 || i == 3) {
                AnonymousClass2M9 r2 = this.A02;
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
            r3.A0G = this.A02.A00;
            r3.A08 = Integer.valueOf(i);
            this.A01.BhA(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r7 == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r6, int r7, int r8, long r9, boolean r11, boolean r12) {
        /*
            r5 = this;
            boolean r0 = r5.A04()
            if (r0 == 0) goto L_0x0069
            X.4sj r4 = new X.4sj
            r4.<init>()
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A09 = r0
            X.2M9 r0 = r5.A02
            java.lang.Long r0 = r0.A00
            r4.A0G = r0
            int r0 = X.C18280x3.A01(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A07 = r0
            r0 = 100
            if (r7 == r0) goto L_0x0029
            r0 = 1
            if (r7 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A05 = r0
            int r0 = A00(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A = r0
            if (r12 == 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.A0C = r0
            double r2 = (double) r9
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A06 = r0
            java.lang.String r0 = ""
            r4.A0H = r0
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r4.A0E = r0
            X.4FV r0 = r5.A01
            r0.BhA(r4)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105995Xf.A02(java.lang.String, int, int, long, boolean, boolean):void");
    }

    public void A03(boolean z, int i) {
        if (A04()) {
            Log.d("CameraCaptureFlowLogger/logGalleryBrowserMediaUsed");
            C95164sj r1 = new C95164sj();
            r1.A0G = this.A02.A00;
            r1.A02 = Boolean.TRUE;
            r1.A09 = C18290x4.A0b();
            r1.A0B = Integer.valueOf(C18280x3.A00(z ? 1 : 0));
            r1.A0F = AnonymousClass0x9.A0m(i);
            this.A01.BhA(r1);
        }
    }
}
