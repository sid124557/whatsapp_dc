package X;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: X.33a  reason: invalid class name and case insensitive filesystem */
public class C619833a {
    public int A00 = 0;
    public int A01 = 1;
    public int A02 = 0;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public C158797kZ A06;
    public AnonymousClass2UL A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A = null;
    public Integer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final long A0I;
    public final C56612sH A0J;
    public final AnonymousClass5LM A0K;
    public final C55812qx A0L;
    public final AnonymousClass4FS A0M;
    public final boolean A0N;

    public synchronized int A01() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x021c A[Catch:{ URISyntaxException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0246 A[Catch:{ URISyntaxException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0297 A[Catch:{ URISyntaxException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8 A[Catch:{ URISyntaxException -> 0x01e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cf A[Catch:{ URISyntaxException -> 0x01e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C26061bW A02(X.AnonymousClass1VX r14, int r15, int r16) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.1bW r5 = new X.1bW     // Catch:{ all -> 0x02f9 }
            r5.<init>()     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r4 = r13.A04(r15)     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r8 = r13.A03(r15)     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x02f9 }
            r5.A02 = r0     // Catch:{ all -> 0x02f9 }
            int r0 = r13.A00     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0N = r0     // Catch:{ all -> 0x02f9 }
            long r2 = r13.A03     // Catch:{ all -> 0x02f9 }
            long r0 = r13.A0I     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x02f9 }
            boolean r2 = r13.A0F     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r0, r2)     // Catch:{ all -> 0x02f9 }
            r5.A0c = r0     // Catch:{ all -> 0x02f9 }
            X.5LM r7 = r13.A0K     // Catch:{ all -> 0x02f9 }
            long r0 = r7.A07     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r0, r2)     // Catch:{ all -> 0x02f9 }
            r5.A0X = r0     // Catch:{ all -> 0x02f9 }
            int r0 = r7.A03     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0V = r0     // Catch:{ all -> 0x02f9 }
            int r2 = r13.A02     // Catch:{ all -> 0x02f9 }
            int r1 = r7.A0B     // Catch:{ all -> 0x02f9 }
            r0 = 2
            r6 = 1
            if (r1 != r0) goto L_0x004a
            r1 = 7
            goto L_0x0059
        L_0x004a:
            if (r2 == 0) goto L_0x0058
            if (r2 == r0) goto L_0x0058
            r0 = 3
            r1 = 5
            if (r2 == r0) goto L_0x0059
            r0 = 4
            if (r2 != r0) goto L_0x0082
            r1 = 8
            goto L_0x0059
        L_0x0058:
            r1 = 1
        L_0x0059:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x02f9 }
            r5.A0H = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = r13.A09     // Catch:{ all -> 0x02f9 }
            r5.A0F = r0     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13.A0N     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A04 = r0     // Catch:{ all -> 0x02f9 }
            int r1 = r7.A00     // Catch:{ all -> 0x02f9 }
            if (r1 == 0) goto L_0x0089
            r0 = 1
            if (r1 == r6) goto L_0x0090
            r0 = 2
            if (r1 == r0) goto L_0x0090
            r0 = 3
            if (r1 == r0) goto L_0x0090
            r0 = 4
            if (r1 == r0) goto L_0x0090
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x02f9 }
            goto L_0x0088
        L_0x0082:
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x02f9 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x02f9 }
        L_0x0089:
            java.lang.String r0 = "mediajobeventbuilder/key reuse type not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02f9 }
            r0 = 0
            goto L_0x0094
        L_0x0090:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02f9 }
        L_0x0094:
            r5.A0E = r0     // Catch:{ all -> 0x02f9 }
            r5.A0G = r8     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13.A0D     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A03 = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x02f9 }
            r5.A0I = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = r13.A08     // Catch:{ all -> 0x02f9 }
            r5.A01 = r0     // Catch:{ all -> 0x02f9 }
            int r0 = r13.A01     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0L = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = r13.A0A     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x00b8
            r5.A0K = r0     // Catch:{ all -> 0x02f9 }
        L_0x00b8:
            if (r14 == 0) goto L_0x00d0
            r1 = 4468(0x1174, float:6.261E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x02f9 }
            boolean r0 = r14.A0Y(r0, r1)     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x00d0
            boolean r1 = r13.A0E     // Catch:{ all -> 0x02f9 }
            r0 = 0
            if (r1 == 0) goto L_0x00ca
            r0 = 3
        L_0x00ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0M = r0     // Catch:{ all -> 0x02f9 }
        L_0x00d0:
            long r0 = r13.A04     // Catch:{ all -> 0x02f9 }
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00f4
            long r0 = r7.A08     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            boolean r9 = r13.A0F     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r0, r9)     // Catch:{ all -> 0x02f9 }
            r5.A0Y = r0     // Catch:{ all -> 0x02f9 }
            long r2 = r13.A03     // Catch:{ all -> 0x02f9 }
            long r0 = r13.A04     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r0, r9)     // Catch:{ all -> 0x02f9 }
            r5.A0e = r0     // Catch:{ all -> 0x02f9 }
        L_0x00f4:
            X.7kZ r2 = r13.A06     // Catch:{ all -> 0x02f9 }
            if (r2 == 0) goto L_0x012f
            X.6ie r0 = r2.A03     // Catch:{ all -> 0x02f9 }
            java.lang.Long r1 = r0.A0A     // Catch:{ all -> 0x02f9 }
            boolean r0 = r13.A0F     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r1, r0)     // Catch:{ all -> 0x02f9 }
            r5.A0d = r0     // Catch:{ all -> 0x02f9 }
            X.6ie r1 = r2.A03     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r1.A0K     // Catch:{ all -> 0x02f9 }
            r5.A0U = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r2 = r1.A07     // Catch:{ all -> 0x02f9 }
            java.lang.Long r1 = r1.A09     // Catch:{ all -> 0x02f9 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x02f9 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x02f9 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ all -> 0x02f9 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x012f
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ all -> 0x02f9 }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x02f9 }
            r5.A0O = r0     // Catch:{ all -> 0x02f9 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r1)     // Catch:{ all -> 0x02f9 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x02f9 }
            r5.A0P = r0     // Catch:{ all -> 0x02f9 }
        L_0x012f:
            X.2UL r10 = r13.A07     // Catch:{ all -> 0x02f9 }
            if (r10 == 0) goto L_0x02ae
            java.lang.Boolean r0 = r10.A04     // Catch:{ all -> 0x02f9 }
            r9 = 0
            if (r0 == 0) goto L_0x0144
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x0141
            r0 = 4
            goto L_0x0146
        L_0x0141:
            r0 = 3
            goto L_0x0146
        L_0x0144:
            r0 = r9
            goto L_0x014a
        L_0x0146:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
        L_0x014a:
            r5.A0Z = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r10.A0C     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x01d4
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x02f9 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x02f9 }
        L_0x0158:
            r5.A09 = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r5.A0O     // Catch:{ all -> 0x02f9 }
            if (r0 != 0) goto L_0x0166
            java.lang.Long r0 = r10.A0B     // Catch:{ all -> 0x02f9 }
            r5.A0O = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r10.A0D     // Catch:{ all -> 0x02f9 }
            r5.A0P = r0     // Catch:{ all -> 0x02f9 }
        L_0x0166:
            java.lang.Long r0 = r10.A0G     // Catch:{ all -> 0x02f9 }
            r5.A0b = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r3 = r10.A09     // Catch:{ all -> 0x02f9 }
            if (r3 == 0) goto L_0x01d2
            long r11 = r3.longValue()     // Catch:{ all -> 0x02f9 }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01d2
        L_0x0178:
            boolean r12 = r13.A0F     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C106495Zf.A03(r3, r12)     // Catch:{ all -> 0x02f9 }
            r5.A0i = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r1 = r10.A0F     // Catch:{ all -> 0x02f9 }
            if (r1 == 0) goto L_0x01d0
            java.lang.Long r0 = r10.A0E     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x01d0
            long r2 = r0.longValue()     // Catch:{ all -> 0x02f9 }
            long r0 = r1.longValue()     // Catch:{ all -> 0x02f9 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x01d0
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)     // Catch:{ all -> 0x02f9 }
        L_0x0198:
            java.lang.Long r0 = X.C106495Zf.A03(r0, r12)     // Catch:{ all -> 0x02f9 }
            r5.A0k = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = r10.A02     // Catch:{ all -> 0x02f9 }
            r5.A06 = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r10.A0A     // Catch:{ all -> 0x02f9 }
            r5.A0j = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r10.A0M     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = A00(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0C = r0     // Catch:{ all -> 0x02f9 }
            X.2UL r2 = r13.A07     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x02f9 }
            r5.A07 = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r2.A08     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x01c0
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x02f9 }
            java.lang.Double r9 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x02f9 }
        L_0x01c0:
            r5.A0A = r9     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r2.A0N     // Catch:{ all -> 0x02f9 }
            r5.A0n = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r2.A0K     // Catch:{ all -> 0x02f9 }
            r5.A0m = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r1 = r2.A0O     // Catch:{ all -> 0x02f9 }
            r2 = 0
            if (r1 == 0) goto L_0x01e6
            goto L_0x01d6
        L_0x01d0:
            r0 = 0
            goto L_0x0198
        L_0x01d2:
            r3 = 0
            goto L_0x0178
        L_0x01d4:
            r0 = r9
            goto L_0x0158
        L_0x01d6:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01e0 }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x01e0 }
            java.lang.String r2 = r0.getHost()     // Catch:{ URISyntaxException -> 0x01e0 }
            goto L_0x01e6
        L_0x01e0:
            r1 = move-exception
            java.lang.String r0 = "MediaJobEventBuilder/getDomainName syntax exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02f9 }
        L_0x01e6:
            r5.A0q = r2     // Catch:{ all -> 0x02f9 }
            X.2UL r3 = r13.A07     // Catch:{ all -> 0x02f9 }
            java.lang.Long r11 = r3.A0H     // Catch:{ all -> 0x02f9 }
            if (r11 == 0) goto L_0x0207
            long r9 = r11.longValue()     // Catch:{ all -> 0x02f9 }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0207
        L_0x01f8:
            r5.A0W = r11     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = r3.A07     // Catch:{ all -> 0x02f9 }
            r5.A0D = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = r3.A06     // Catch:{ all -> 0x02f9 }
            r5.A0B = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x02f9 }
            r5.A0p = r0     // Catch:{ all -> 0x02f9 }
            goto L_0x0209
        L_0x0207:
            r11 = 0
            goto L_0x01f8
        L_0x0209:
            r2 = 3
            if (r4 == 0) goto L_0x0214
            int r0 = r4.intValue()     // Catch:{ all -> 0x02f9 }
            if (r0 == r6) goto L_0x0218
            if (r0 == r2) goto L_0x0218
        L_0x0214:
            java.lang.String r0 = r3.A0O     // Catch:{ all -> 0x02f9 }
            r5.A0o = r0     // Catch:{ all -> 0x02f9 }
        L_0x0218:
            X.5Jt r3 = r3.A00     // Catch:{ all -> 0x02f9 }
            if (r3 == 0) goto L_0x0240
            long r0 = r3.A00     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0Q = r0     // Catch:{ all -> 0x02f9 }
            long r0 = r3.A02     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0S = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x02f9 }
            r5.A00 = r0     // Catch:{ all -> 0x02f9 }
            long r0 = r3.A01     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0R = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = A00(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0C = r0     // Catch:{ all -> 0x02f9 }
        L_0x0240:
            X.2UL r0 = r13.A07     // Catch:{ all -> 0x02f9 }
            X.5Ie r1 = r0.A01     // Catch:{ all -> 0x02f9 }
            if (r1 == 0) goto L_0x0291
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x02f9 }
            r5.A0l = r0     // Catch:{ all -> 0x02f9 }
            if (r4 == 0) goto L_0x0269
            int r0 = r4.intValue()     // Catch:{ all -> 0x02f9 }
            if (r0 != r6) goto L_0x0269
            java.lang.Integer r0 = r1.A01     // Catch:{ all -> 0x02f9 }
            if (r0 != 0) goto L_0x025f
            java.lang.String r0 = "ResumeCheckStat result is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x02f9 }
        L_0x025f:
            int r0 = r0.intValue()     // Catch:{ all -> 0x02f9 }
            if (r0 != r2) goto L_0x0269
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02f9 }
        L_0x0269:
            X.5Jt r2 = r1.A00     // Catch:{ all -> 0x02f9 }
            if (r2 == 0) goto L_0x0291
            long r0 = r2.A00     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0f = r0     // Catch:{ all -> 0x02f9 }
            long r0 = r2.A02     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0h = r0     // Catch:{ all -> 0x02f9 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x02f9 }
            r5.A05 = r0     // Catch:{ all -> 0x02f9 }
            long r0 = r2.A01     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0g = r0     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x02f9 }
            java.lang.Integer r0 = A00(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0C = r0     // Catch:{ all -> 0x02f9 }
        L_0x0291:
            X.2UL r0 = r13.A07     // Catch:{ all -> 0x02f9 }
            java.lang.Float r0 = r0.A05     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x02ae
            float r2 = r0.floatValue()     // Catch:{ all -> 0x02f9 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 - r2
            float r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02f9 }
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02ae
            double r0 = (double) r2     // Catch:{ all -> 0x02f9 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x02f9 }
            r5.A08 = r0     // Catch:{ all -> 0x02f9 }
        L_0x02ae:
            java.lang.String r0 = r7.A0D     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = X.C18290x4.A0g(r0)     // Catch:{ all -> 0x02f9 }
            r5.A0T = r0     // Catch:{ all -> 0x02f9 }
            X.7kZ r0 = r13.A06     // Catch:{ all -> 0x02f9 }
            r2 = 0
            if (r0 == 0) goto L_0x02cd
            X.6ie r0 = r0.A03     // Catch:{ all -> 0x02f9 }
            java.lang.Long r0 = r0.A0O     // Catch:{ all -> 0x02f9 }
            if (r0 == 0) goto L_0x02cd
            long r0 = r0.longValue()     // Catch:{ all -> 0x02f9 }
        L_0x02c6:
            java.lang.Long r0 = X.AnonymousClass0x9.A0n(r0, r2)     // Catch:{ all -> 0x02f9 }
            r5.A0a = r0     // Catch:{ all -> 0x02f9 }
            goto L_0x02d0
        L_0x02cd:
            r0 = 0
            goto L_0x02c6
        L_0x02d0:
            if (r4 == 0) goto L_0x02e8
            int r1 = r4.intValue()     // Catch:{ all -> 0x02f9 }
            r0 = 12
            if (r1 != r0) goto L_0x02e8
            if (r8 == 0) goto L_0x02e8
            int r0 = r8.intValue()     // Catch:{ all -> 0x02f9 }
            if (r0 != r6) goto L_0x02e8
            r0 = 30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02f9 }
        L_0x02e8:
            r5.A0J = r4     // Catch:{ all -> 0x02f9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02f9 }
            java.lang.String r0 = "MediaJobEventBuilder/postWamMediaUpload2Event "
            java.lang.String r0 = X.C18300x5.A0k(r5, r0, r1)     // Catch:{ all -> 0x02f9 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x02f9 }
            monitor-exit(r13)
            return r5
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619833a.A02(X.1VX, int, int):X.1bW");
    }

    public synchronized void A06() {
        if (!this.A0H) {
            this.A0B = C18290x4.A0Z();
        } else {
            this.A0B = AnonymousClass001.A0f();
        }
    }

    public synchronized void A07() {
        this.A04 = SystemClock.uptimeMillis();
        this.A05 = this.A0J.A0H();
    }

    public synchronized void A08(byte b, int i, boolean z) {
        synchronized (this) {
            this.A09 = Integer.valueOf(C106495Zf.A00(b, i, z));
            this.A0F = z;
        }
    }

    public synchronized void A09(int i) {
        this.A02 = i;
    }

    public synchronized void A0A(C158797kZ r2) {
        this.A06 = r2;
    }

    public synchronized void A0B(AnonymousClass2UL r2) {
        this.A07 = r2;
    }

    public synchronized void A0C(Boolean bool) {
        this.A08 = bool;
    }

    public final Integer A04(int i) {
        int i2;
        if (this.A07 == null && i == 0) {
            return null;
        }
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 12;
                break;
            case 2:
                i2 = 10;
                break;
            case 3:
                i2 = 7;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 9;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 11;
                break;
            case 8:
                i2 = 13;
                break;
            case 9:
                i2 = 4;
                break;
            case 10:
                i2 = 14;
                break;
            case 11:
                i2 = 15;
                break;
            case 12:
                i2 = 16;
                break;
            case 13:
                i2 = 17;
                break;
            case 14:
            case 32:
                i2 = 30;
                break;
            case 15:
                i2 = 19;
                break;
            case 16:
                i2 = 38;
                break;
            case 17:
                i2 = 5;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 41;
                break;
            case 20:
                i2 = 29;
                break;
            case 21:
                i2 = 35;
                break;
            case 22:
                i2 = 18;
                break;
            case 23:
                i2 = 40;
                break;
            case 24:
                i2 = 32;
                break;
            case 25:
                i2 = 21;
                break;
            case 26:
                i2 = 39;
                break;
            case 27:
                i2 = 26;
                break;
            case 28:
                i2 = 27;
                break;
            case 29:
                i2 = 28;
                break;
            case 33:
                i2 = 31;
                break;
            case 34:
                i2 = 33;
                break;
            case 35:
                i2 = 34;
                break;
            case 36:
                i2 = 36;
                break;
            case 37:
                i2 = 37;
                break;
            default:
                i2 = 2;
                break;
        }
        return Integer.valueOf(i2);
    }

    public final void A05() {
        AnonymousClass5LM r7 = this.A0K;
        long j = this.A03;
        r7.A07 += j - this.A0I;
        long j2 = this.A04;
        if (j2 != -1) {
            r7.A08 += j - j2;
        }
        C71533cG.A00(this.A0M, this, 35);
    }

    public C619833a(C56612sH r3, AnonymousClass5LM r4, C55812qx r5, AnonymousClass4FS r6, boolean z) {
        this.A0J = r3;
        this.A0M = r6;
        this.A0L = r5;
        this.A0K = r4;
        this.A0N = z;
        this.A0I = SystemClock.uptimeMillis();
    }

    public static Integer A00(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            if ("h3".equalsIgnoreCase(str)) {
                i = 2;
            } else if ("h2".equalsIgnoreCase(str)) {
                i = 1;
            } else if ("http/1.1".equalsIgnoreCase(str)) {
                i = 0;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public Integer A03(int i) {
        Integer valueOf = Integer.valueOf(i);
        C626936e.A06(valueOf);
        if (valueOf.intValue() == 14) {
            return C18290x4.A0b();
        }
        if (!this.A0C) {
            return 0;
        }
        if (AnonymousClass75J.A00(this.A0B, 0)) {
            return 0;
        }
        return this.A0B;
    }
}
