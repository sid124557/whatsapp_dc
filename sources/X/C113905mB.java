package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.5mB  reason: invalid class name and case insensitive filesystem */
public class C113905mB implements AnonymousClass4FW, C185958uW, AnonymousClass4F5, AnonymousClass485 {
    public SharedPreferences A00;
    public final C116985rC A01;
    public final C55682qk A02;
    public final C56972sr A03;
    public final C620433g A04;
    public final C61012zY A05;
    public final C153167am A06;
    public final C52782m2 A07;
    public final C41242Jm A08;
    public final C64773Ex A09;
    public final C56422rx A0A;
    public final C60862zI A0B;
    public final C56612sH A0C;
    public final AnonymousClass33p A0D;
    public final C53412n3 A0E;
    public final C56922sm A0F;
    public final C56982ss A0G;
    public final C66543Lv A0H;
    public final C56892sj A0I;
    public final AnonymousClass2S7 A0J;
    public final C56152rV A0K;
    public final C59972xn A0L;
    public final C56382rt A0M;
    public final C56362rr A0N;
    public final C55622qe A0O;
    public final C56662sM A0P;
    public final AnonymousClass311 A0Q;
    public final C620333f A0R;
    public final AnonymousClass36Y A0S;
    public final C56112rR A0T;
    public final AnonymousClass1VX A0U;
    public final AnonymousClass4FV A0V;
    public final AnonymousClass30N A0W;
    public final C49882hF A0X;
    public final C60152y5 A0Y;
    public final AnonymousClass1R1 A0Z;
    public final C55832qz A0a;
    public final AnonymousClass2II A0b;
    public final AnonymousClass2IJ A0c;
    public final C56072rN A0d;
    public final C72173dI A0e;
    public final C183538qC A0f;

    public void A04(AnonymousClass21N r8, C95814uZ r9) {
        SharedPreferences A012 = A01();
        String rawString = r9.getRawString();
        StringBuilder A0X2 = C18270x1.A0X(rawString);
        A0X2.append(rawString);
        this.A0e.execute(new C71603cN(this, A012, r8, AnonymousClass000.A0X("_BotMentionsRowCount", A0X2), 13));
    }

    public void BOl(C95814uZ r9, UserJid userJid, AnonymousClass2z0 r11, int i) {
        this.A0e.execute(new C70623an(this, r9, userJid, r11, i, 2));
    }

    public static void A00(C72173dI r1, Object obj, Object obj2, Object obj3, int i) {
        r1.execute(new C70333aK(obj, obj2, obj3, i));
    }

    public final SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A032 = this.A0Y.A03("chatCounts");
        this.A00 = A032;
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0832, code lost:
        if (r1 != false) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x089c, code lost:
        if (r1 == 1) goto L_0x089e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x095b, code lost:
        if (r0 < 0) goto L_0x095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x09b3, code lost:
        if (r8.A0F == null) goto L_0x09b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x05a4 A[Catch:{ all -> 0x0c6c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03ca A[Catch:{ all -> 0x0c6c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A02() {
        /*
            r37 = this;
            r5 = r37
            monitor-enter(r5)
            android.content.SharedPreferences r24 = r5.A01()     // Catch:{ all -> 0x0d0d }
            X.2sH r0 = r5.A0C     // Catch:{ all -> 0x0d0d }
            long r20 = r0.A0H()     // Catch:{ all -> 0x0d0d }
            X.30N r0 = r5.A0W     // Catch:{ all -> 0x0d0d }
            r36 = r0
            java.util.Random r1 = new java.util.Random     // Catch:{ all -> 0x0d0d }
            r1.<init>()     // Catch:{ all -> 0x0d0d }
            long r18 = r0.A03(r1)     // Catch:{ all -> 0x0d0d }
            long r16 = r20 - r18
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0d0b
            java.util.Map r0 = r24.getAll()     // Catch:{ all -> 0x0d0d }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0d0d }
            java.util.LinkedHashSet r3 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0033:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0064
            java.lang.String r2 = X.AnonymousClass001.A0m(r4)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "thread_user_secret"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0033
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "_"
            int r1 = r2.lastIndexOf(r0)     // Catch:{ all -> 0x0d0d }
            r0 = -1
            if (r1 == r0) goto L_0x0060
            java.lang.String r2 = X.AnonymousClass0x7.A0r(r2, r1)     // Catch:{ all -> 0x0d0d }
        L_0x0060:
            r3.add(r2)     // Catch:{ all -> 0x0d0d }
            goto L_0x0033
        L_0x0064:
            java.util.Iterator r23 = r3.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0068:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0c74
            java.lang.String r22 = X.AnonymousClass001.A0m(r23)     // Catch:{ all -> 0x0d0d }
            X.4sq r4 = new X.4sq     // Catch:{ all -> 0x0d0d }
            r4.<init>()     // Catch:{ all -> 0x0d0d }
            long r0 = X.C18290x4.A0B(r18)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A25 = r0     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r1 = r5.A01()     // Catch:{ all -> 0x0d0d }
            r0 = r22
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0210
            X.5XM r2 = X.AnonymousClass5XM.A00(r1)     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A07     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1Y = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A06     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1X = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A01     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0w = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A00     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0v = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A0A     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2O = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A09     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2N = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A08     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2M = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0M     // Catch:{ all -> 0x0d0d }
            r4.A0x = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0y     // Catch:{ all -> 0x0d0d }
            r4.A1o = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0x     // Catch:{ all -> 0x0d0d }
            r4.A1n = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A18     // Catch:{ all -> 0x0d0d }
            r4.A28 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A16     // Catch:{ all -> 0x0d0d }
            r4.A26 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0n     // Catch:{ all -> 0x0d0d }
            r4.A1O = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0o     // Catch:{ all -> 0x0d0d }
            r4.A1P = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0H     // Catch:{ all -> 0x0d0d }
            r4.A0b = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = r2.A0B     // Catch:{ all -> 0x0d0d }
            r4.A0B = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0F     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0102
            long r6 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            r0 = 2
            long r6 = r6 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            r4.A0Z = r0     // Catch:{ all -> 0x0d0d }
        L_0x0102:
            java.lang.Long r0 = r2.A0S     // Catch:{ all -> 0x0d0d }
            r4.A12 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0G     // Catch:{ all -> 0x0d0d }
            r4.A0a = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A15     // Catch:{ all -> 0x0d0d }
            r4.A1x = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A14     // Catch:{ all -> 0x0d0d }
            r4.A1v = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A13     // Catch:{ all -> 0x0d0d }
            r4.A1u = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0L     // Catch:{ all -> 0x0d0d }
            r4.A0u = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0I     // Catch:{ all -> 0x0d0d }
            r4.A0p = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0O     // Catch:{ all -> 0x0d0d }
            r4.A0z = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0N     // Catch:{ all -> 0x0d0d }
            r4.A0y = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0Q     // Catch:{ all -> 0x0d0d }
            r4.A11 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0P     // Catch:{ all -> 0x0d0d }
            r4.A10 = r0     // Catch:{ all -> 0x0d0d }
            X.1VX r1 = r5.A0U     // Catch:{ all -> 0x0d0d }
            r0 = 5785(0x1699, float:8.107E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0170
            java.lang.Long r0 = r2.A1C     // Catch:{ all -> 0x0d0d }
            r4.A2C = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0s     // Catch:{ all -> 0x0d0d }
            r4.A1i = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A1E     // Catch:{ all -> 0x0d0d }
            r4.A2I = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A1B     // Catch:{ all -> 0x0d0d }
            r4.A2B = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0r     // Catch:{ all -> 0x0d0d }
            r4.A1h = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A1D     // Catch:{ all -> 0x0d0d }
            r4.A2H = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0g     // Catch:{ all -> 0x0d0d }
            r4.A1G = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0c     // Catch:{ all -> 0x0d0d }
            r4.A1C = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0i     // Catch:{ all -> 0x0d0d }
            r4.A1I = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0f     // Catch:{ all -> 0x0d0d }
            r4.A1F = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0b     // Catch:{ all -> 0x0d0d }
            r4.A1B = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0h     // Catch:{ all -> 0x0d0d }
            r4.A1H = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0a     // Catch:{ all -> 0x0d0d }
            r4.A1A = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0Z     // Catch:{ all -> 0x0d0d }
            r4.A19 = r0     // Catch:{ all -> 0x0d0d }
        L_0x0170:
            r0 = 5963(0x174b, float:8.356E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x01ec
            java.lang.Long r0 = r2.A1G     // Catch:{ all -> 0x0d0d }
            r4.A2L = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A1F     // Catch:{ all -> 0x0d0d }
            r4.A2K = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0k     // Catch:{ all -> 0x0d0d }
            r4.A1K = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0j     // Catch:{ all -> 0x0d0d }
            r4.A1J = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0m     // Catch:{ all -> 0x0d0d }
            r4.A1M = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0l     // Catch:{ all -> 0x0d0d }
            r4.A1L = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0Y     // Catch:{ all -> 0x0d0d }
            r4.A18 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0X     // Catch:{ all -> 0x0d0d }
            r4.A17 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0E     // Catch:{ all -> 0x0d0d }
            r4.A0X = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0D     // Catch:{ all -> 0x0d0d }
            r4.A0W = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0U     // Catch:{ all -> 0x0d0d }
            r4.A14 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0T     // Catch:{ all -> 0x0d0d }
            r4.A13 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0K     // Catch:{ all -> 0x0d0d }
            r4.A0t = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0J     // Catch:{ all -> 0x0d0d }
            r4.A0s = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0W     // Catch:{ all -> 0x0d0d }
            r4.A16 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0V     // Catch:{ all -> 0x0d0d }
            r4.A15 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A1A     // Catch:{ all -> 0x0d0d }
            r4.A2A = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A19     // Catch:{ all -> 0x0d0d }
            r4.A29 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0e     // Catch:{ all -> 0x0d0d }
            r4.A1E = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0d     // Catch:{ all -> 0x0d0d }
            r4.A1D = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A12     // Catch:{ all -> 0x0d0d }
            r4.A1s = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A11     // Catch:{ all -> 0x0d0d }
            r4.A1r = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A10     // Catch:{ all -> 0x0d0d }
            r4.A1q = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0z     // Catch:{ all -> 0x0d0d }
            r4.A1p = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0u     // Catch:{ all -> 0x0d0d }
            r4.A1k = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0t     // Catch:{ all -> 0x0d0d }
            r4.A1j = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0w     // Catch:{ all -> 0x0d0d }
            r4.A1m = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0v     // Catch:{ all -> 0x0d0d }
            r4.A1l = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A17     // Catch:{ all -> 0x0d0d }
            r4.A27 = r0     // Catch:{ all -> 0x0d0d }
        L_0x01ec:
            long r0 = r2.A05     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A23 = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A03     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A22 = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A04     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A20 = r0     // Catch:{ all -> 0x0d0d }
            long r0 = r2.A02     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1z = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r2.A0q     // Catch:{ all -> 0x0d0d }
            r4.A1W = r0     // Catch:{ all -> 0x0d0d }
        L_0x0210:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_businessTools"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0244
            java.lang.String[] r6 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            java.lang.Long r3 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 1
            java.lang.Long r2 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 2
            java.lang.Long r1 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            r4.A1U = r3     // Catch:{ all -> 0x0d0d }
            r4.A0Y = r2     // Catch:{ all -> 0x0d0d }
            r4.A1N = r1     // Catch:{ all -> 0x0d0d }
            r4.A1t = r0     // Catch:{ all -> 0x0d0d }
        L_0x0244:
            X.5Yw r35 = X.C95814uZ.A00     // Catch:{ all -> 0x0d0d }
            r1 = r35
            r0 = r22
            X.4uZ r7 = r1.A05(r0)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x03ec
            X.2rt r8 = r5.A0M     // Catch:{ all -> 0x0c59 }
            r6 = 0
            long r0 = r8.A03(r7, r6)     // Catch:{ all -> 0x0c59 }
            r9 = 1
            r31 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x03c2
            X.2qz r2 = r5.A0a     // Catch:{ all -> 0x0c59 }
            X.34x r30 = X.C55122pp.A00(r2, r0)     // Catch:{ all -> 0x0c59 }
            if (r30 != 0) goto L_0x0272
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c59 }
            java.lang.String r2 = "ChatMessageCounts/getGaStatus/Null message for id - "
            X.C18260x0.A11(r2, r3, r0)     // Catch:{ all -> 0x0c59 }
            goto L_0x03c2
        L_0x0272:
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0c59 }
            r0 = 11
            r1.set(r0, r6)     // Catch:{ all -> 0x0c59 }
            r0 = 12
            r1.set(r0, r6)     // Catch:{ all -> 0x0c59 }
            r0 = 13
            r1.set(r0, r6)     // Catch:{ all -> 0x0c59 }
            r0 = 14
            r1.set(r0, r6)     // Catch:{ all -> 0x0c59 }
            long r2 = r1.getTimeInMillis()     // Catch:{ all -> 0x0c59 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r28 = r2 - r0
            long r26 = r36.A02()     // Catch:{ all -> 0x0c59 }
            r14 = 1
            int[] r12 = new int[r14]     // Catch:{ all -> 0x0c59 }
            r0 = 7
            r12[r6] = r0     // Catch:{ all -> 0x0c59 }
            X.2rr r13 = r5.A0N     // Catch:{ all -> 0x0c59 }
            X.2ss r0 = r13.A02     // Catch:{ all -> 0x0c59 }
            X.31A r11 = r0.A0A(r7, r6)     // Catch:{ all -> 0x0c59 }
            r0 = -9223372036854775808
            if (r11 == 0) goto L_0x0311
            long r9 = r11.A0H     // Catch:{ all -> 0x0c59 }
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x030f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ?"
            java.lang.StringBuilder r9 = X.C18290x4.A0w(r0, r1)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = " AND "
            r9.append(r0)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = X.AnonymousClass34U.A00(r12)     // Catch:{ all -> 0x0c59 }
            X.C18270x1.A1C(r0, r9, r1)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x0c59 }
            java.lang.String r10 = "sort_id"
            r1.append(r10)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = " ASC LIMIT 1"
            java.lang.String r25 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0c59 }
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ all -> 0x0c59 }
            X.2sm r0 = r13.A01     // Catch:{ all -> 0x0c59 }
            long r0 = r0.A07(r7)     // Catch:{ all -> 0x0c59 }
            X.AnonymousClass0x2.A1S(r9, r6, r0)     // Catch:{ all -> 0x0c59 }
            X.3dV r0 = r13.A04     // Catch:{ all -> 0x0c59 }
            X.4GK r15 = r0.get()     // Catch:{ all -> 0x0c59 }
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0c3e }
            X.2sg r13 = r0.A03     // Catch:{ all -> 0x0c3e }
            java.lang.String r1 = "GET_FIRST_SORT_REF_SQL_EXCLUDE_TYPES"
            r0 = r25
            android.database.Cursor r9 = r13.A0E(r0, r1, r9)     // Catch:{ all -> 0x0c3e }
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0c32 }
            if (r0 == 0) goto L_0x0300
            long r0 = X.AnonymousClass0x2.A0C(r9, r10)     // Catch:{ all -> 0x0c32 }
            r11.A0H = r0     // Catch:{ all -> 0x0c32 }
            goto L_0x0309
        L_0x0300:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c32 }
            java.lang.String r0 = "msgstore/getfirstsortrefexcludetypes can't get value for "
            X.C18260x0.A1S(r1, r0, r7)     // Catch:{ all -> 0x0c32 }
        L_0x0309:
            r9.close()     // Catch:{ all -> 0x0c3e }
            r15.close()     // Catch:{ all -> 0x0c59 }
        L_0x030f:
            long r0 = r11.A0H     // Catch:{ all -> 0x0c59 }
        L_0x0311:
            X.3Lv r9 = r5.A0H     // Catch:{ all -> 0x0c59 }
            X.2qz r9 = r9.A2D     // Catch:{ all -> 0x0c59 }
            X.34x r9 = r9.A02(r0)     // Catch:{ all -> 0x0c59 }
            if (r9 != 0) goto L_0x0326
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c59 }
            java.lang.String r2 = "Failed to get message from coreMessageStore, sortId - "
            X.C18260x0.A11(r2, r3, r0)     // Catch:{ all -> 0x0c59 }
            goto L_0x03c2
        L_0x0326:
            long r0 = r9.A0K     // Catch:{ all -> 0x0c59 }
            int r9 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r9 <= 0) goto L_0x0332
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0c59 }
            goto L_0x03c4
        L_0x0332:
            r0 = r28
            long r27 = r8.A05(r7, r12, r0)     // Catch:{ all -> 0x0c59 }
            long r25 = r8.A05(r7, r12, r2)     // Catch:{ all -> 0x0c59 }
            r0 = 3
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x0c59 }
            X.2sm r0 = r8.A01     // Catch:{ all -> 0x0c59 }
            long r0 = r0.A07(r7)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0c59 }
            r9 = 0
            r10[r6] = r0     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = java.lang.Long.toString(r27)     // Catch:{ all -> 0x0c59 }
            r10[r14] = r0     // Catch:{ all -> 0x0c59 }
            r1 = 2
            java.lang.String r0 = java.lang.Long.toString(r25)     // Catch:{ all -> 0x0c59 }
            r10[r1] = r0     // Catch:{ all -> 0x0c59 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND _id>? AND _id<=?"
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r0, r6)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0c59 }
            java.lang.String r0 = X.AnonymousClass34U.A00(r12)     // Catch:{ all -> 0x0c59 }
            X.C18270x1.A1C(r0, r1, r6)     // Catch:{ all -> 0x0c59 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0c59 }
            X.3dV r0 = r8.A05     // Catch:{ all -> 0x0c59 }
            X.4GK r8 = r0.get()     // Catch:{ all -> 0x0c59 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0c4f }
            X.2sg r1 = r0.A03     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = "COUNT_MESSAGES_EXCLUDE_TYPES"
            android.database.Cursor r6 = r1.A0E(r6, r0, r10)     // Catch:{ all -> 0x0c4f }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0c43 }
            if (r0 == 0) goto L_0x039a
            java.lang.String r0 = "count"
            int r9 = X.AnonymousClass0x2.A04(r6, r0)     // Catch:{ all -> 0x0c43 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "msgstore/getmessagesatid/pos:"
            X.C18260x0.A0y(r0, r1, r9)     // Catch:{ all -> 0x0c43 }
            goto L_0x03a3
        L_0x039a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0c43 }
            java.lang.String r0 = "msgstore/getmessagesatid/db no message for "
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x0c43 }
        L_0x03a3:
            r6.close()     // Catch:{ all -> 0x0c4f }
            r8.close()     // Catch:{ all -> 0x0c59 }
            long r8 = (long) r9     // Catch:{ all -> 0x0c59 }
            r0 = r30
            long r0 = r0.A0K     // Catch:{ all -> 0x0c59 }
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x03bd
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0c59 }
            goto L_0x03c4
        L_0x03bd:
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0c59 }
            goto L_0x03c4
        L_0x03c2:
            r0 = r31
        L_0x03c4:
            r4.A0T = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x03ec
            r2 = r7
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x0d0d }
            X.3Ex r0 = r5.A09     // Catch:{ all -> 0x0d0d }
            X.3ZH r0 = r0.A07(r2)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x054f
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Contact is null for jid - "
        L_0x03db:
            r3.append(r0)     // Catch:{ all -> 0x0d0d }
            r3.append(r2)     // Catch:{ all -> 0x0d0d }
        L_0x03e1:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0d0d }
        L_0x03e5:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d0d }
        L_0x03e8:
            r0 = r31
            r4.A0M = r0     // Catch:{ all -> 0x0d0d }
        L_0x03ec:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_commerce"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0446
            X.5Wm r1 = X.C105805Wm.A00(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A06     // Catch:{ all -> 0x0d0d }
            r4.A1g = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0d0d }
            r4.A1d = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A05     // Catch:{ all -> 0x0d0d }
            r4.A1f = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x0d0d }
            r4.A1e = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x0d0d }
            r4.A0r = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x0d0d }
            r4.A0q = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = r1.A00     // Catch:{ all -> 0x0d0d }
            r4.A0n = r0     // Catch:{ all -> 0x0d0d }
            X.3Ex r0 = r5.A09     // Catch:{ all -> 0x0d0d }
            X.3ZH r0 = r0.A07(r7)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0446
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0446
            boolean r0 = r1.A07     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A07 = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r1.A09     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A09 = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r1.A08     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A08 = r0     // Catch:{ all -> 0x0d0d }
        L_0x0446:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_integrity"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x048f
            java.lang.String[] r1 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            long r8 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            long r6 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r2 = X.C624334z.A02(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 2
            java.lang.Boolean r1 = X.C624334z.A01(r1, r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d0d }
            r4.A24 = r0     // Catch:{ all -> 0x0d0d }
            X.32W r3 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x0d0d }
            r0 = r22
            com.whatsapp.jid.Jid r0 = r3.A03(r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.C627336j.A0K(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0489
            r4.A0N = r2     // Catch:{ all -> 0x0d0d }
            r4.A06 = r1     // Catch:{ all -> 0x0d0d }
        L_0x0489:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            r4.A21 = r0     // Catch:{ all -> 0x0d0d }
        L_0x048f:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_voip"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = X.C18280x3.A0Z(r2, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0527
            java.lang.String[] r1 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            long r33 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 1
            long r31 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 2
            long r29 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            long r27 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 4
            long r25 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 5
            long r14 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 6
            long r12 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 7
            long r10 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 8
            long r8 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 9
            long r6 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 10
            long r1 = X.C624334z.A00(r1, r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r33)     // Catch:{ all -> 0x0d0d }
            r4.A0d = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x0d0d }
            r4.A0c = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r29)     // Catch:{ all -> 0x0d0d }
            r4.A2D = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0d0d }
            r4.A2J = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0d0d }
            r4.A2P = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d0d }
            r4.A0g = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d0d }
            r4.A0i = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d0d }
            r4.A0j = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0d0d }
            r4.A0e = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d0d }
            r4.A0f = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d0d }
            r4.A0h = r0     // Catch:{ all -> 0x0d0d }
        L_0x0527:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_discovery"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x05b3
            java.lang.String[] r6 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            int r1 = r6.length     // Catch:{ all -> 0x0d0d }
            r3 = 0
            if (r1 <= r0) goto L_0x05a0
            r2 = r6[r0]     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x05a1
            goto L_0x05a0
        L_0x054f:
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x03e8
            X.33g r0 = r5.A04     // Catch:{ all -> 0x0d0d }
            X.5dt r1 = r0.A02(r2)     // Catch:{ all -> 0x0d0d }
            if (r1 != 0) goto L_0x0565
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Failed to get profile for jid - "
            goto L_0x03db
        L_0x0565:
            java.lang.String r0 = "catalog"
            java.lang.String r1 = r1.A0D     // Catch:{ all -> 0x0d0d }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0571
            r0 = 1
            goto L_0x057a
        L_0x0571:
            java.lang.String r0 = "shop"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0580
            r0 = 0
        L_0x057a:
            java.lang.Integer r31 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            goto L_0x03e8
        L_0x0580:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x03e8
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x059c
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Unknown commerceExperience value - "
            r3.append(r0)     // Catch:{ all -> 0x0d0d }
            r3.append(r1)     // Catch:{ all -> 0x0d0d }
            goto L_0x03e1
        L_0x059c:
            java.lang.String r0 = "ChatMessageCounts/getBizCatalogType/Empty commerceExperience value"
            goto L_0x03e5
        L_0x05a0:
            r2 = r3
        L_0x05a1:
            r0 = 1
            if (r1 <= r0) goto L_0x05af
            r1 = r6[r0]     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x05af
            r3 = r1
        L_0x05af:
            r4.A2Q = r2     // Catch:{ all -> 0x0d0d }
            r4.A2R = r3     // Catch:{ all -> 0x0d0d }
        L_0x05b3:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_actions"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x05d1
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0m = r0     // Catch:{ all -> 0x0d0d }
        L_0x05d1:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_cart"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x05ef
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0k = r0     // Catch:{ all -> 0x0d0d }
        L_0x05ef:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_messageToAgent"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = X.C18280x3.A0Z(r2, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0611
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2G = r0     // Catch:{ all -> 0x0d0d }
        L_0x0611:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_messageFromAgent"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = X.C18280x3.A0Z(r2, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0633
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2F = r0     // Catch:{ all -> 0x0d0d }
        L_0x0633:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_editFromAgent"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = X.C18280x3.A0Z(r2, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0655
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A2E = r0     // Catch:{ all -> 0x0d0d }
        L_0x0655:
            r1 = 0
            r0 = r22
            X.C162457s7.A0J(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_BotMentionsRowCount"
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r0 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.String r3 = X.AnonymousClass0x9.A0v(r0, r2)     // Catch:{ all -> 0x0d0d }
            r0 = 1
            X.C162457s7.A0J(r3, r0)     // Catch:{ all -> 0x0d0d }
            char[] r2 = new char[r0]     // Catch:{ all -> 0x0d0d }
            r0 = 44
            r2[r1] = r0     // Catch:{ all -> 0x0d0d }
            java.util.List r0 = X.C175728Zm.A0O(r3, r2)     // Catch:{ all -> 0x0d0d }
            java.lang.String[] r6 = X.AnonymousClass0x7.A1b(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C624334z.A04(r6, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r10 = X.AnonymousClass0x2.A0T()     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x068a
            r0 = r10
        L_0x068a:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r3.<init>(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 1
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x069b
            r0 = r10
        L_0x069b:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r2.<init>(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 2
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x06ac
            r0 = r10
        L_0x06ac:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r7.<init>(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x06bd
            r0 = r10
        L_0x06bd:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r8.<init>(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 4
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x06ce
            r0 = r10
        L_0x06ce:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r9.<init>(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 5
            java.lang.Long r0 = X.C624334z.A04(r6, r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x06df
            r10 = r0
        L_0x06df:
            long r0 = r10.longValue()     // Catch:{ all -> 0x0d0d }
            java.util.concurrent.atomic.AtomicLong r6 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x0d0d }
            r6.<init>(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r3)     // Catch:{ all -> 0x0d0d }
            r4.A1c = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r2)     // Catch:{ all -> 0x0d0d }
            r4.A1T = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r7)     // Catch:{ all -> 0x0d0d }
            r4.A1b = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r8)     // Catch:{ all -> 0x0d0d }
            r4.A1S = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r9)     // Catch:{ all -> 0x0d0d }
            r4.A0o = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C86664Kz.A1I(r6)     // Catch:{ all -> 0x0d0d }
            r4.A1R = r0     // Catch:{ all -> 0x0d0d }
            X.1VX r12 = r5.A0U     // Catch:{ all -> 0x0d0d }
            r0 = 2474(0x9aa, float:3.467E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0753
            X.2II r0 = r5.A0b     // Catch:{ all -> 0x0d0d }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x071e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0753
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0d0d }
            X.2IG r0 = (X.AnonymousClass2IG) r0     // Catch:{ all -> 0x0d0d }
            X.1VX r1 = r0.A00     // Catch:{ all -> 0x0d0d }
            r0 = 2474(0x9aa, float:3.467E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x071e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r22)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = "_location"
            r0 = r24
            java.lang.String r1 = X.C86604Kt.A0n(r0, r1, r2)     // Catch:{ all -> 0x0d0d }
            if (r1 == 0) goto L_0x071e
            int r0 = r1.length()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x071e
            long r0 = X.C615531h.A03(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1V = r0     // Catch:{ all -> 0x0d0d }
            goto L_0x071e
        L_0x0753:
            r1 = r35
            r0 = r22
            X.4uZ r11 = r1.A05(r0)     // Catch:{ all -> 0x0d0d }
            if (r11 == 0) goto L_0x0068
            r2 = 28800000(0x1b77400, double:1.42290906E-316)
            long r0 = r18 - r2
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0d0d }
            r2.<init>(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "yyyy/MM/dd"
            java.text.SimpleDateFormat r0 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.String r1 = r0.format(r2)     // Catch:{ all -> 0x0d0d }
            r4.A2S = r1     // Catch:{ all -> 0x0d0d }
            java.util.Random r2 = new java.util.Random     // Catch:{ all -> 0x0d0d }
            r2.<init>()     // Catch:{ all -> 0x0d0d }
            r0 = r36
            byte[] r2 = r0.A06(r2)     // Catch:{ all -> 0x0d0d }
            r0 = r22
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r1)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = X.AnonymousClass30N.A01(r2, r0)     // Catch:{ all -> 0x0d0d }
            r4.A2T = r0     // Catch:{ all -> 0x0d0d }
            X.3Ex r10 = r5.A09     // Catch:{ all -> 0x0d0d }
            X.3ZH r9 = r10.A07(r11)     // Catch:{ all -> 0x0d0d }
            if (r9 == 0) goto L_0x0842
            boolean r0 = r9.A0U()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0842
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r4.A03 = r0     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.GroupJid r0 = X.C86664Kz.A1C(r9)     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.UserJid r0 = r10.A0D(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x07ad
            X.3ZH r8 = r10.A07(r0)     // Catch:{ all -> 0x0d0d }
        L_0x07aa:
            boolean r0 = r11 instanceof X.C27991fJ     // Catch:{ all -> 0x0d0d }
            goto L_0x07af
        L_0x07ad:
            r8 = 0
            goto L_0x07aa
        L_0x07af:
            if (r0 == 0) goto L_0x083b
            X.2sj r1 = r5.A0I     // Catch:{ all -> 0x0d0d }
            r0 = r11
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0d0d }
            X.33k r1 = X.C56892sj.A01(r1, r0)     // Catch:{ all -> 0x0d0d }
            java.util.Map r0 = r1.A09     // Catch:{ all -> 0x0d0d }
            int r0 = r0.size()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1Q = r0     // Catch:{ all -> 0x0d0d }
            X.6aS r0 = r1.A04()     // Catch:{ all -> 0x0d0d }
            X.8Nf r2 = r0.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x07ce:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x07f2
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0d0d }
            X.2zG r0 = (X.C60842zG) r0     // Catch:{ all -> 0x0d0d }
            X.2sr r1 = r5.A03     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.UserJid r0 = r0.A03     // Catch:{ all -> 0x0d0d }
            boolean r1 = r1.A0a(r0)     // Catch:{ all -> 0x0d0d }
            if (r1 != 0) goto L_0x07ce
            X.3ZH r0 = r10.A07(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x07ce
            boolean r0 = r0.A0R()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x07ce
            r0 = 1
            goto L_0x07f3
        L_0x07f2:
            r0 = 0
        L_0x07f3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A01 = r0     // Catch:{ all -> 0x0d0d }
            X.2ss r1 = r5.A0G     // Catch:{ all -> 0x0d0d }
            r3 = r11
            X.1fJ r3 = (X.C27991fJ) r3     // Catch:{ all -> 0x0d0d }
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.C627336j.A0K(r3)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x080a
            r0 = 0
            goto L_0x0821
        L_0x080a:
            int r2 = r1.A07(r3)     // Catch:{ all -> 0x0d0d }
            r1 = 2
            if (r2 == r1) goto L_0x081d
            r0 = 3
            if (r2 == r0) goto L_0x0818
            r0 = 6
            if (r2 == r0) goto L_0x081d
            r0 = 1
        L_0x0818:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            goto L_0x0821
        L_0x081d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0d0d }
        L_0x0821:
            r4.A0V = r0     // Catch:{ all -> 0x0d0d }
            X.2hF r0 = r5.A0X     // Catch:{ all -> 0x0d0d }
            boolean r1 = r0.A00(r9, r3)     // Catch:{ all -> 0x0d0d }
            if (r1 != 0) goto L_0x0834
            X.2hv r0 = r0.A04     // Catch:{ all -> 0x0d0d }
            boolean r1 = r0.A00(r9, r3)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            if (r1 == 0) goto L_0x0835
        L_0x0834:
            r0 = 1
        L_0x0835:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A00 = r0     // Catch:{ all -> 0x0d0d }
        L_0x083b:
            boolean r0 = r9.A14     // Catch:{ all -> 0x0d0d }
            int r0 = X.C18280x3.A01(r0)
            goto L_0x0848
        L_0x0842:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0d0d }
            r4.A03 = r0     // Catch:{ all -> 0x0d0d }
            r8 = r9
            goto L_0x084e
        L_0x0848:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0U = r0     // Catch:{ all -> 0x0d0d }
        L_0x084e:
            X.8qC r1 = r5.A0f     // Catch:{ all -> 0x0d0d }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0d0d }
            X.2sS r0 = (X.C56722sS) r0     // Catch:{ all -> 0x0d0d }
            X.2m4 r0 = r0.A01     // Catch:{ all -> 0x0d0d }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x086b
            r1.get()     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.C155477ey.A00(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0G = r0     // Catch:{ all -> 0x0d0d }
        L_0x086b:
            boolean r0 = X.AnonymousClass75P.A00(r12)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0883
            X.2Jm r0 = r5.A08     // Catch:{ all -> 0x0d0d }
            X.3Lo r0 = r0.A00     // Catch:{ all -> 0x0d0d }
            X.3ZH r0 = r0.A01(r11)     // Catch:{ all -> 0x0d0d }
            boolean r0 = r0.A0T()     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0F = r0     // Catch:{ all -> 0x0d0d }
        L_0x0883:
            if (r9 == 0) goto L_0x08a4
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x08a4
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r9)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x08a4
            X.3ZH r0 = r10.A07(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x08c8
            int r1 = r0.A00     // Catch:{ all -> 0x0d0d }
            r0 = 1
            if (r1 != r0) goto L_0x08c8
        L_0x089e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0E = r0     // Catch:{ all -> 0x0d0d }
        L_0x08a4:
            X.2rR r1 = r5.A0T     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r0 = r1.A05()     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.C18280x3.A0U(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1y = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x08c1
            r0 = r11
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0d0d }
            int r0 = r1.A01(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1w = r0     // Catch:{ all -> 0x0d0d }
        L_0x08c1:
            X.2ss r7 = r5.A0G     // Catch:{ all -> 0x0d0d }
            X.31A r2 = X.C56982ss.A00(r7, r11)     // Catch:{ all -> 0x0d0d }
            goto L_0x08ca
        L_0x08c8:
            r0 = 0
            goto L_0x089e
        L_0x08ca:
            if (r2 == 0) goto L_0x0907
            X.3Z2 r0 = r2.A0b     // Catch:{ all -> 0x0d0d }
            int r1 = r0.disappearingMessagesInitiator     // Catch:{ all -> 0x0d0d }
            r0 = 1
            if (r1 == 0) goto L_0x08d7
            r0 = 2
            if (r1 != r0) goto L_0x08d7
            r0 = 3
        L_0x08d7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0Q = r0     // Catch:{ all -> 0x0d0d }
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0907
            X.2kh r1 = r2.A0a     // Catch:{ all -> 0x0d0d }
            if (r1 == 0) goto L_0x0907
            int r0 = r1.A00     // Catch:{ all -> 0x0d0d }
            int r0 = X.AnonymousClass36M.A02(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0S = r0     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = r1.A01     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0907
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0d0d }
            int r0 = X.C18280x3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0R = r0     // Catch:{ all -> 0x0d0d }
        L_0x0907:
            X.2sm r0 = r5.A0F     // Catch:{ all -> 0x0d0d }
            r27 = r0
            long r2 = r0.A07(r11)     // Catch:{ all -> 0x0d0d }
            r13 = 0
            r0 = -1
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x095d
            r6 = r27
            X.3dV r6 = r6.A06     // Catch:{ all -> 0x0d0d }
            X.4GK r25 = r6.get()     // Catch:{ all -> 0x0d0d }
            r6 = r25
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x0c67 }
            X.2sg r6 = r6.A03     // Catch:{ all -> 0x0c67 }
            r14 = r6
            java.lang.String r13 = "SELECT created_timestamp FROM chat WHERE _id = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0c67 }
            r26 = r6
            X.C18260x0.A1Y(r6, r2)     // Catch:{ all -> 0x0c67 }
            java.lang.String r6 = "GET_CREATED_TIME_FOR_CHAT"
            r15 = r14
            r14 = r13
            r13 = r6
            r6 = r26
            android.database.Cursor r13 = r15.A0E(r14, r13, r6)     // Catch:{ all -> 0x0c67 }
            boolean r6 = r13.moveToNext()     // Catch:{ all -> 0x0c5b }
            if (r6 == 0) goto L_0x0951
            java.lang.String r6 = "created_timestamp"
            int r6 = r13.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0c5b }
            boolean r14 = r13.isNull(r6)     // Catch:{ all -> 0x0c5b }
            if (r14 != 0) goto L_0x0951
            long r0 = r13.getLong(r6)     // Catch:{ all -> 0x0c5b }
        L_0x0951:
            r13.close()     // Catch:{ all -> 0x0c67 }
            r25.close()     // Catch:{ all -> 0x0d0d }
            r13 = 0
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0996
        L_0x095d:
            X.3Lv r0 = r5.A0H     // Catch:{ all -> 0x0d0d }
            long r0 = r0.A04(r2)     // Catch:{ all -> 0x0d0d }
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0996
            r6 = r27
            X.3dV r6 = r6.A06     // Catch:{ all -> 0x0d0d }
            X.4Fq r25 = r6.A04()     // Catch:{ all -> 0x0d0d }
            android.content.ContentValues r13 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0c67 }
            java.lang.String r6 = "created_timestamp"
            X.C18270x1.A0c(r13, r6, r0)     // Catch:{ all -> 0x0c67 }
            r6 = r25
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x0c67 }
            X.2sg r14 = r6.A03     // Catch:{ all -> 0x0c67 }
            java.lang.String r28 = "chat"
            java.lang.String r29 = "_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0c67 }
            X.C18260x0.A1Y(r6, r2)     // Catch:{ all -> 0x0c67 }
            java.lang.String r30 = "setCreatedTime"
            r26 = r14
            r27 = r13
            r31 = r6
            r26.A05(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0c67 }
            r25.close()     // Catch:{ all -> 0x0d0d }
        L_0x0996:
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0H = r0     // Catch:{ all -> 0x0d0d }
            X.1R1 r3 = r5.A0Z     // Catch:{ all -> 0x0d0d }
            boolean r6 = r3.A0h(r11)     // Catch:{ all -> 0x0d0d }
            X.2sa r0 = X.AnonymousClass1R1.A00(r11, r3)     // Catch:{ all -> 0x0d0d }
            boolean r1 = r0.A0I     // Catch:{ all -> 0x0d0d }
            if (r8 == 0) goto L_0x09b5
            X.2k5 r0 = r8.A0F     // Catch:{ all -> 0x0d0d }
            r2 = 1
            if (r0 != 0) goto L_0x09b6
        L_0x09b5:
            r2 = 0
        L_0x09b6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0d0d }
            r4.A02 = r0     // Catch:{ all -> 0x0d0d }
            if (r6 != 0) goto L_0x09c0
            r0 = 1
            goto L_0x09c4
        L_0x09c0:
            r0 = 2
            if (r1 == 0) goto L_0x09c4
            r0 = 3
        L_0x09c4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0O = r0     // Catch:{ all -> 0x0d0d }
            r0 = 4505(0x1199, float:6.313E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x09e5
            X.2sa r0 = X.AnonymousClass1R1.A00(r11, r3)     // Catch:{ all -> 0x0d0d }
            int r2 = r0.A00     // Catch:{ all -> 0x0d0d }
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x09df
            if (r2 == r0) goto L_0x09df
            r0 = 0
        L_0x09df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A05 = r0     // Catch:{ all -> 0x0d0d }
        L_0x09e5:
            if (r8 == 0) goto L_0x0a00
            boolean r0 = r8.A0R()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a00
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x0d0d }
            r4.A0P = r0     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r8)     // Catch:{ all -> 0x0d0d }
            boolean r1 = r8.A0P()     // Catch:{ all -> 0x0d0d }
            if (r1 == 0) goto L_0x0a15
            if (r0 == 0) goto L_0x0a15
            goto L_0x0a07
        L_0x0a00:
            java.lang.Integer r0 = X.AnonymousClass001.A0f()     // Catch:{ all -> 0x0d0d }
            r4.A0P = r0     // Catch:{ all -> 0x0d0d }
            goto L_0x0a15
        L_0x0a07:
            X.2rx r1 = r5.A0A     // Catch:{ all -> 0x0d0d }
            boolean r0 = r1.A03(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a15
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x0d0d }
            r4.A0P = r0     // Catch:{ all -> 0x0d0d }
        L_0x0a15:
            boolean r0 = r3.A0i(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0C = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r7.A0M(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A04 = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.C627336j.A0L(r11)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a59
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r4.A0D = r1     // Catch:{ all -> 0x0d0d }
            r2 = r11
            X.1fH r2 = (X.C27981fH) r2     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = r4.A0B     // Catch:{ all -> 0x0d0d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0d0d }
            X.311 r1 = r5.A0Q     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a52
            monitor-enter(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x0c71 }
            long r13 = r1.A00(r2)     // Catch:{ all -> 0x0c71 }
            r8 = 0
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            goto L_0x0a79
        L_0x0a52:
            java.lang.Boolean r0 = r1.A01(r2)     // Catch:{ all -> 0x0d0d }
            r4.A0K = r0     // Catch:{ all -> 0x0d0d }
            goto L_0x0a90
        L_0x0a59:
            if (r9 == 0) goto L_0x0a74
            boolean r0 = r9.A0U()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a74
            r0 = r11
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ all -> 0x0d0d }
            int r1 = r7.A06(r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            if (r1 != r0) goto L_0x0a74
            boolean r0 = r9.A0k     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0a74
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r4.A0D = r0     // Catch:{ all -> 0x0d0d }
            goto L_0x0a90
        L_0x0a74:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0d0d }
            r4.A0D = r0     // Catch:{ all -> 0x0d0d }
            goto L_0x0a90
        L_0x0a79:
            monitor-exit(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0I = r0     // Catch:{ all -> 0x0d0d }
            X.2sM r0 = r5.A0P     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r2)     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.AnonymousClass000.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0J = r0     // Catch:{ all -> 0x0d0d }
        L_0x0a90:
            int r0 = r7.A03(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1a = r0     // Catch:{ all -> 0x0d0d }
            X.2qe r0 = r5.A0O     // Catch:{ all -> 0x0d0d }
            long r0 = r0.A00(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A1Z = r0     // Catch:{ all -> 0x0d0d }
            int r0 = X.AnonymousClass352.A00(r10, r7, r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0l = r0     // Catch:{ all -> 0x0d0d }
            r0 = 3689(0xe69, float:5.17E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0ae4
            X.33p r0 = r5.A0D     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "1on1_invite_sender"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x0d0d }
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0d0d }
            com.whatsapp.jid.UserJid r2 = r1.A0E(r0)     // Catch:{ all -> 0x0d0d }
            r0 = r22
            com.whatsapp.jid.UserJid r1 = r1.A0E(r0)     // Catch:{ all -> 0x0d0d }
            if (r2 == 0) goto L_0x0ad8
            boolean r0 = r2.equals(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0ae0
        L_0x0ad8:
            X.2xn r0 = r5.A0L     // Catch:{ all -> 0x0d0d }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0ae4
        L_0x0ae0:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d0d }
            r4.A0A = r0     // Catch:{ all -> 0x0d0d }
        L_0x0ae4:
            r0 = 4471(0x1177, float:6.265E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0b14
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r22)     // Catch:{ all -> 0x0d0d }
            if (r1 == 0) goto L_0x0b14
            X.33p r0 = r5.A0D     // Catch:{ all -> 0x0d0d }
            java.lang.String r2 = r1.getRawString()     // Catch:{ all -> 0x0d0d }
            if (r2 != 0) goto L_0x0afc
            r0 = 0
            goto L_0x0b0e
        L_0x0afc:
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ all -> 0x0d0d }
            java.util.HashSet r1 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "contactless_jids_store"
            java.util.Set r0 = r3.getStringSet(r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0d0d }
        L_0x0b0e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r4.A0L = r0     // Catch:{ all -> 0x0d0d }
        L_0x0b14:
            X.4FV r13 = r5.A0V     // Catch:{ all -> 0x0d0d }
            r13.BhB(r4)     // Catch:{ all -> 0x0d0d }
            java.lang.String r14 = r11.getRawString()     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r14)     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = "_notification"
            java.lang.String r1 = X.C86604Kt.A0n(r2, r0, r1)     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0b8f
            java.lang.String[] r1 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x0d0d }
            r0 = 0
            java.lang.Long r12 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 1
            java.lang.Long r31 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 2
            java.lang.Long r30 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            java.lang.Long r29 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 4
            java.lang.Long r10 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 5
            java.lang.Long r9 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 6
            java.lang.Long r8 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 7
            java.lang.Long r7 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 8
            java.lang.Long r6 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 9
            java.lang.Long r3 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 10
            java.lang.Long r2 = X.C624334z.A04(r1, r0)     // Catch:{ all -> 0x0d0d }
            r27 = 0
            if (r12 == 0) goto L_0x0b7b
            long r25 = r12.longValue()     // Catch:{ all -> 0x0d0d }
            int r0 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0bc5
        L_0x0b7b:
            if (r3 == 0) goto L_0x0b85
            long r25 = r3.longValue()     // Catch:{ all -> 0x0d0d }
            int r0 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0bc5
        L_0x0b85:
            if (r2 == 0) goto L_0x0b8f
            long r25 = r2.longValue()     // Catch:{ all -> 0x0d0d }
            int r0 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0bc5
        L_0x0b8f:
            android.content.SharedPreferences r1 = r5.A01()     // Catch:{ all -> 0x0d0d }
            r0 = r22
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x0d0d }
            X.4rN r6 = new X.4rN     // Catch:{ all -> 0x0d0d }
            r6.<init>()     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = r4.A2T     // Catch:{ all -> 0x0d0d }
            r6.A02 = r0     // Catch:{ all -> 0x0d0d }
            java.lang.String r0 = r4.A2S     // Catch:{ all -> 0x0d0d }
            r6.A01 = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0d0d }
            if (r0 != 0) goto L_0x0068
            X.5XM r0 = X.AnonymousClass5XM.A00(r1)     // Catch:{ all -> 0x0d0d }
            java.lang.Long r3 = r0.A0p     // Catch:{ all -> 0x0d0d }
            if (r3 == 0) goto L_0x0068
            long r7 = r3.longValue()     // Catch:{ all -> 0x0d0d }
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            r6.A00 = r3     // Catch:{ all -> 0x0d0d }
            r13.BhD(r6)     // Catch:{ all -> 0x0d0d }
            goto L_0x0068
        L_0x0bc5:
            X.4sh r1 = new X.4sh     // Catch:{ all -> 0x0d0d }
            r1.<init>()     // Catch:{ all -> 0x0d0d }
            r0 = r36
            java.lang.String r0 = r0.A04(r14)     // Catch:{ all -> 0x0d0d }
            r1.A0E = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = X.C627336j.A0K(r11)     // Catch:{ all -> 0x0d0d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r1.A00 = r0     // Catch:{ all -> 0x0d0d }
            boolean r0 = r11 instanceof X.C27991fJ     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0bef
            X.2rN r14 = r5.A0d     // Catch:{ all -> 0x0d0d }
            r0 = r11
            X.1fJ r0 = (X.C27991fJ) r0     // Catch:{ all -> 0x0d0d }
            int r0 = r14.A00(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r1.A02 = r0     // Catch:{ all -> 0x0d0d }
        L_0x0bef:
            boolean r0 = r11 instanceof X.C28011fL     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0c07
            X.2sj r0 = r5.A0I     // Catch:{ all -> 0x0d0d }
            X.1fL r11 = (X.C28011fL) r11     // Catch:{ all -> 0x0d0d }
            X.33h r0 = r0.A09     // Catch:{ all -> 0x0d0d }
            int r0 = r0.A03(r11)     // Catch:{ all -> 0x0d0d }
            int r0 = X.AnonymousClass36M.A04(r0)     // Catch:{ all -> 0x0d0d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d0d }
            r1.A01 = r0     // Catch:{ all -> 0x0d0d }
        L_0x0c07:
            if (r6 == 0) goto L_0x0c13
            long r14 = r6.longValue()     // Catch:{ all -> 0x0d0d }
            int r0 = (r14 > r27 ? 1 : (r14 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x0c13
            r1.A03 = r6     // Catch:{ all -> 0x0d0d }
        L_0x0c13:
            r1.A06 = r7     // Catch:{ all -> 0x0d0d }
            r0 = r29
            r1.A07 = r0     // Catch:{ all -> 0x0d0d }
            r1.A08 = r10     // Catch:{ all -> 0x0d0d }
            r0 = r30
            r1.A09 = r0     // Catch:{ all -> 0x0d0d }
            r1.A0A = r9     // Catch:{ all -> 0x0d0d }
            r1.A0B = r8     // Catch:{ all -> 0x0d0d }
            r1.A0C = r12     // Catch:{ all -> 0x0d0d }
            r0 = r31
            r1.A0D = r0     // Catch:{ all -> 0x0d0d }
            r1.A04 = r3     // Catch:{ all -> 0x0d0d }
            r1.A05 = r2     // Catch:{ all -> 0x0d0d }
            r13.BhB(r1)     // Catch:{ all -> 0x0d0d }
            goto L_0x0b8f
        L_0x0c32:
            r1 = move-exception
            if (r9 == 0) goto L_0x0c3d
            r9.close()     // Catch:{ all -> 0x0c39 }
            goto L_0x0c3d
        L_0x0c39:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c3e }
        L_0x0c3d:
            throw r1     // Catch:{ all -> 0x0c3e }
        L_0x0c3e:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0c54 }
            goto L_0x0c58
        L_0x0c43:
            r1 = move-exception
            if (r6 == 0) goto L_0x0c4e
            r6.close()     // Catch:{ all -> 0x0c4a }
            goto L_0x0c4e
        L_0x0c4a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c4f }
        L_0x0c4e:
            throw r1     // Catch:{ all -> 0x0c4f }
        L_0x0c4f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0c54 }
            goto L_0x0c58
        L_0x0c54:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c59 }
        L_0x0c58:
            throw r1     // Catch:{ all -> 0x0c59 }
        L_0x0c59:
            r0 = move-exception
            goto L_0x0c73
        L_0x0c5b:
            r1 = move-exception
            if (r13 == 0) goto L_0x0c66
            r13.close()     // Catch:{ all -> 0x0c62 }
            goto L_0x0c66
        L_0x0c62:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c67 }
        L_0x0c66:
            throw r1     // Catch:{ all -> 0x0c67 }
        L_0x0c67:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x0c6c }
            goto L_0x0c70
        L_0x0c6c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d0d }
        L_0x0c70:
            throw r1     // Catch:{ all -> 0x0d0d }
        L_0x0c71:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0d0d }
        L_0x0c73:
            throw r0     // Catch:{ all -> 0x0d0d }
        L_0x0c74:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r18 + r6
            long r3 = r0 + r6
            int r2 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0c85
            long r16 = r16 / r6
            long r16 = r16 * r6
            long r0 = r18 + r16
        L_0x0c85:
            android.content.SharedPreferences r2 = r5.A01()     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences$Editor r2 = r2.clear()     // Catch:{ all -> 0x0d0d }
            r2.apply()     // Catch:{ all -> 0x0d0d }
            r2 = r36
            r2.A05(r0)     // Catch:{ all -> 0x0d0d }
            X.2zI r6 = r5.A0B     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r0 = r6.A02()     // Catch:{ all -> 0x0d0d }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0d0d }
            java.util.Set r2 = r0.keySet()     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r0 = r6.A01()     // Catch:{ all -> 0x0d0d }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x0d0d }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x0d0d }
            java.util.HashSet r0 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0d0d }
            r0.addAll(r2)     // Catch:{ all -> 0x0d0d }
            r0.addAll(r1)     // Catch:{ all -> 0x0d0d }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0d0d }
        L_0x0cc1:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0d0d }
            if (r0 == 0) goto L_0x0d0b
            java.lang.String r4 = X.AnonymousClass001.A0m(r9)     // Catch:{ all -> 0x0d0d }
            java.lang.String[] r8 = X.C18320x8.A1b(r4)     // Catch:{ all -> 0x0d0d }
            int r2 = r8.length     // Catch:{ all -> 0x0d0d }
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0cfc
            r0 = r8[r0]     // Catch:{ all -> 0x0d0d }
            X.4uZ r7 = X.C18310x6.A0S(r0)     // Catch:{ all -> 0x0d0d }
            if (r7 == 0) goto L_0x0cfc
            X.2qz r3 = r6.A04     // Catch:{ all -> 0x0d0d }
            r2 = 1
            r1 = r8[r2]     // Catch:{ all -> 0x0d0d }
            X.2z0 r0 = new X.2z0     // Catch:{ all -> 0x0d0d }
            r0.<init>(r7, r1, r2)     // Catch:{ all -> 0x0d0d }
            X.34x r1 = r3.A05(r0)     // Catch:{ all -> 0x0d0d }
            if (r1 == 0) goto L_0x0cfc
            X.2sH r0 = r6.A02     // Catch:{ all -> 0x0d0d }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0d0d }
            long r0 = r1.A0K     // Catch:{ all -> 0x0d0d }
            int r1 = X.C107175ap.A00(r2, r0)     // Catch:{ all -> 0x0d0d }
            r0 = 3
            if (r1 >= r0) goto L_0x0cfc
            goto L_0x0cc1
        L_0x0cfc:
            android.content.SharedPreferences r0 = r6.A02()     // Catch:{ all -> 0x0d0d }
            X.C18270x1.A0n(r0, r4)     // Catch:{ all -> 0x0d0d }
            android.content.SharedPreferences r0 = r6.A01()     // Catch:{ all -> 0x0d0d }
            X.C18270x1.A0n(r0, r4)     // Catch:{ all -> 0x0d0d }
            goto L_0x0cc1
        L_0x0d0b:
            monitor-exit(r5)
            return
        L_0x0d0d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113905mB.A02():void");
    }

    public final void A03(C15790rw r3, UserJid userJid) {
        AnonymousClass3ZH A072;
        if (!this.A03.A0a(userJid) && (A072 = this.A09.A07(userJid)) != null && A072.A0R()) {
            A00(this.A0e, this, userJid, r3, 10);
        }
    }

    public void A05(C95814uZ r4, int i) {
        if (!this.A03.A0a(r4)) {
            this.A0e.execute(new C71733ca(this, r4, i, 25));
        }
    }

    public void A06(C95814uZ r4, int i) {
        if (!this.A03.A0a(r4)) {
            this.A0e.execute(new C71733ca(this, r4, i, 27));
        }
    }

    public void A08(AnonymousClass3ZF r4, Integer num) {
        Object obj;
        if (r4 != null && num != null) {
            if (r4.A0L()) {
                obj = r4.A05;
            } else {
                obj = r4.A0E.A01;
            }
            if (obj != null) {
                A00(this.A0e, this, obj, num, 3);
            }
        }
    }

    public final boolean A09(AnonymousClass2z0 r4) {
        if (this.A0a.A05(r4) == null && this.A0R.A02(r4) == 56) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void BNb(C624134x r1, int i) {
    }

    public /* synthetic */ void BO8(AnonymousClass3ZF r1, boolean z) {
    }

    public void BOm(C95814uZ r3, AnonymousClass2z0 r4) {
        A00(this.A0e, this, r4, r3, 8);
    }

    public void BOn(C95814uZ r3, AnonymousClass2z0 r4) {
        A00(this.A0e, this, r3, r4, 5);
    }

    public void BOo(AnonymousClass2z0 r3, List list) {
        A00(this.A0e, this, list, r3, 4);
    }

    public void BW4(C95814uZ r4) {
        this.A0e.execute(new C71333bw(this, 5, r4));
    }

    public /* synthetic */ void BWS(C624134x r1, int i) {
    }

    public void BWU(C624134x r4, int i) {
        if (i == 25 && !r4.A1J.A02 && C627636p.A0J(r4.A1I)) {
            this.A0e.execute(new C71333bw(this, 6, r4));
        }
    }

    public /* synthetic */ void BWX(C624134x r1, C624134x r2) {
    }

    public void BWg(Collection collection, Map map) {
        if (map != null && !map.isEmpty()) {
            A00(this.A0e, this, map, collection, 6);
        }
    }

    public /* synthetic */ void BX5(C95804uY r1, boolean z) {
    }

    public /* synthetic */ void BXI() {
    }

    public /* synthetic */ void BY8(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void BY9(C624134x r1, C624134x r2) {
    }

    public /* synthetic */ void Bbe() {
    }

    public void BO1(AnonymousClass3ZF r4) {
        Object obj;
        if (r4.A0L()) {
            obj = r4.A05;
        } else {
            obj = r4.A0E.A01;
        }
        if (obj != null) {
            A00(this.A0e, this, obj, r4, 9);
        }
    }

    public /* synthetic */ void BOB(AnonymousClass3ZF r1) {
    }

    public /* synthetic */ void BRi(C624134x r1) {
    }

    public /* synthetic */ void BVB(C95814uZ r1) {
    }

    public /* synthetic */ void BWW(C624134x r1) {
    }

    public /* synthetic */ void BWY(C624134x r1) {
    }

    public /* synthetic */ void BWf(C95814uZ r1) {
    }

    public /* synthetic */ void BWj(Collection collection) {
    }

    public /* synthetic */ void BX3(C95804uY r1) {
    }

    public /* synthetic */ void BX4(C624134x r1) {
    }

    public /* synthetic */ void BX6(C95804uY r1) {
    }

    public /* synthetic */ void BOC(C95814uZ r1, CallState callState, String str) {
    }

    public /* synthetic */ void BWh(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWi(C95814uZ r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void BWe(Collection collection, int i) {
        C381525x.A00(this, collection, i);
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public C113905mB(C116985rC r2, C55682qk r3, C56972sr r4, C620433g r5, C61012zY r6, C153167am r7, C52782m2 r8, C41242Jm r9, C64773Ex r10, C56422rx r11, C60862zI r12, C56612sH r13, AnonymousClass33p r14, C53412n3 r15, C56922sm r16, C56982ss r17, C66543Lv r18, C56892sj r19, AnonymousClass2S7 r20, C56152rV r21, C59972xn r22, C56382rt r23, C56362rr r24, C55622qe r25, C56662sM r26, AnonymousClass311 r27, C620333f r28, AnonymousClass36Y r29, C56112rR r30, AnonymousClass1VX r31, AnonymousClass4FV r32, AnonymousClass30N r33, C49882hF r34, C60152y5 r35, AnonymousClass1R1 r36, C55832qz r37, AnonymousClass2II r38, AnonymousClass2IJ r39, C56072rN r40, AnonymousClass4FS r41, C183538qC r42) {
        this.A0C = r13;
        this.A0U = r31;
        this.A0F = r16;
        this.A02 = r3;
        this.A03 = r4;
        this.A0G = r17;
        this.A0V = r32;
        this.A0M = r23;
        this.A0N = r24;
        this.A0J = r20;
        this.A0f = r42;
        this.A09 = r10;
        this.A0S = r29;
        this.A0d = r40;
        this.A0X = r34;
        this.A0a = r37;
        this.A0K = r21;
        this.A0P = r26;
        this.A0Z = r36;
        this.A06 = r7;
        this.A0W = r33;
        this.A0R = r28;
        this.A0O = r25;
        this.A0A = r11;
        this.A0D = r14;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A0Q = r27;
        this.A0H = r18;
        this.A08 = r9;
        this.A0I = r19;
        this.A0Y = r35;
        this.A01 = r2;
        this.A0E = r15;
        this.A0L = r22;
        this.A0B = r12;
        this.A0T = r30;
        this.A0c = r39;
        this.A0b = r38;
        this.A0e = C72173dI.A00(r41);
    }

    /* JADX WARNING: type inference failed for: r0v235, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v240, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c5, code lost:
        if (r14.A1s(1) != false) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d1, code lost:
        if (r14 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0212, code lost:
        if (((X.C30721mu) r14).A25() == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0236, code lost:
        if ((r0.A1J.A00 instanceof X.C135166kE) != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        if (r40.intValue() != 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0475, code lost:
        if (r17.A1s(4194304) == false) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x049c, code lost:
        if (r15.A1s(4194304) == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0536, code lost:
        if (r1.A0K(r2) == false) goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        if (r9 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        if (r28 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        if (X.C627636p.A0J(r0.A1I) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0147, code lost:
        if (r0.A0w() == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0162, code lost:
        if (X.C627636p.A0g(r0) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0176, code lost:
        if (r4.A0R.A02(r6) != 93) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0186, code lost:
        if (X.C624134x.A0g(r0) == false) goto L_0x0188;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03df A[Catch:{ all -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x045b A[Catch:{ all -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0463 A[Catch:{ all -> 0x06cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04d3 A[SYNTHETIC, Splitter:B:312:0x04d3] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0683  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A07(X.C95814uZ r37, com.whatsapp.jid.UserJid r38, X.AnonymousClass2z0 r39, java.lang.Integer r40, boolean r41, boolean r42, boolean r43) {
        /*
            r36 = this;
            r4 = r36
            monitor-enter(r4)
            X.30N r1 = r4.A0W     // Catch:{ all -> 0x06d7 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x06d7 }
            r0.<init>()     // Catch:{ all -> 0x06d7 }
            long r2 = r1.A03(r0)     // Catch:{ all -> 0x06d7 }
            X.2qz r8 = r4.A0a     // Catch:{ all -> 0x06d7 }
            r6 = r39
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            r7 = 0
            r5 = r41
            if (r0 == 0) goto L_0x006c
            long r0 = r0.A0K     // Catch:{ all -> 0x06d7 }
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x006c
            X.4uZ r6 = r6.A00     // Catch:{ all -> 0x06d7 }
            int r6 = X.AnonymousClass36M.A05(r6)     // Catch:{ all -> 0x06d7 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06d7 }
            java.lang.String r8 = "ChatMessageCounts/isMessageWithinLoggingWindow/message.timestamp = "
            r9.append(r8)     // Catch:{ all -> 0x06d7 }
            r9.append(r0)     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "/startTime = "
            r9.append(r0)     // Catch:{ all -> 0x06d7 }
            r9.append(r2)     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "/sent = "
            r9.append(r0)     // Catch:{ all -> 0x06d7 }
            r9.append(r5)     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "/chatType = "
            X.C18260x0.A0w(r0, r9, r6)     // Catch:{ all -> 0x06d7 }
            X.1VX r1 = r4.A0U     // Catch:{ all -> 0x06d7 }
            r0 = 3098(0xc1a, float:4.341E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x0118
            X.2qk r2 = r4.A02     // Catch:{ all -> 0x06d7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "message-out-of-logging-window-"
            r1.append(r0)     // Catch:{ all -> 0x06d7 }
            r1.append(r5)     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r6)     // Catch:{ all -> 0x06d7 }
            r0 = 0
            r2.A0A(r1, r7, r0)     // Catch:{ all -> 0x06d7 }
            goto L_0x0118
        L_0x006c:
            X.2sr r0 = r4.A03     // Catch:{ all -> 0x06d7 }
            r35 = r0
            r10 = r37
            boolean r0 = r0.A0a(r10)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x0118
            X.34x r9 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            X.8qC r1 = r4.A0f     // Catch:{ all -> 0x06d7 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x06d7 }
            X.2sS r0 = (X.C56722sS) r0     // Catch:{ all -> 0x06d7 }
            X.2m4 r0 = r0.A01     // Catch:{ all -> 0x06d7 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x06d7 }
            r28 = 0
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x06d7 }
            X.2sS r3 = (X.C56722sS) r3     // Catch:{ all -> 0x06d7 }
            if (r9 == 0) goto L_0x009a
            java.util.List r0 = r9.A18     // Catch:{ all -> 0x06d7 }
            r28 = r0
        L_0x009a:
            r2 = 1
            X.C162457s7.A0J(r10, r2)     // Catch:{ all -> 0x06d7 }
            r7 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x06d7 }
            if (r41 != 0) goto L_0x00c2
            boolean r0 = X.C155477ey.A00(r10)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x00b3
            if (r38 == 0) goto L_0x00d1
            boolean r0 = X.C155477ey.A00(r38)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x00d1
        L_0x00b3:
            if (r40 == 0) goto L_0x00bc
            int r0 = r40.intValue()     // Catch:{ all -> 0x06d7 }
            r1 = 3
            if (r0 == r2) goto L_0x00bd
        L_0x00bc:
            r1 = 2
        L_0x00bd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x06d7 }
            goto L_0x00d1
        L_0x00c2:
            boolean r0 = X.C155477ey.A00(r10)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x00d0
            r0 = r28
            com.whatsapp.jid.UserJid r0 = r3.A00(r0)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x00d1
        L_0x00d0:
            r7 = r1
        L_0x00d1:
            r28 = r7
        L_0x00d3:
            if (r41 != 0) goto L_0x00d8
            r2 = 1
            if (r9 == 0) goto L_0x00d9
        L_0x00d8:
            r2 = 0
        L_0x00d9:
            X.1VX r12 = r4.A0U     // Catch:{ all -> 0x06d7 }
            r0 = 5963(0x174b, float:8.356E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x06d7 }
            r33 = 0
            if (r0 == 0) goto L_0x00f7
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x00f7
            X.33f r0 = r4.A0R     // Catch:{ all -> 0x06d7 }
            byte r1 = r0.A02(r6)     // Catch:{ all -> 0x06d7 }
            r0 = 67
            if (r1 != r0) goto L_0x00f7
            r33 = 1
        L_0x00f7:
            if (r2 != 0) goto L_0x00fd
            boolean r0 = r9 instanceof X.AnonymousClass48R     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x011a
        L_0x00fd:
            boolean r0 = r4.A09(r6)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x011a
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            if (r0 != 0) goto L_0x0114
            X.33f r0 = r4.A0R     // Catch:{ all -> 0x06d7 }
            byte r1 = r0.A02(r6)     // Catch:{ all -> 0x06d7 }
            r0 = 93
            if (r1 != r0) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            if (r33 != 0) goto L_0x011a
            if (r28 != 0) goto L_0x011a
        L_0x0118:
            monitor-exit(r4)
            return
        L_0x011a:
            if (r9 != 0) goto L_0x012c
            X.33f r0 = r4.A0R     // Catch:{ all -> 0x06d7 }
            byte r1 = r0.A02(r6)     // Catch:{ all -> 0x06d7 }
            r0 = 68
            if (r0 != r1) goto L_0x012c
            java.lang.String r0 = "excluding keep in chat message while recording counts"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x06d7 }
            goto L_0x0118
        L_0x012c:
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x013b
            byte r0 = r0.A1I     // Catch:{ all -> 0x06d7 }
            boolean r0 = X.C627636p.A0J(r0)     // Catch:{ all -> 0x06d7 }
            r11 = 1
            if (r0 != 0) goto L_0x013c
        L_0x013b:
            r11 = 0
        L_0x013c:
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x0149
            X.34x r0 = r0.A0w()     // Catch:{ all -> 0x06d7 }
            r7 = 1
            if (r0 != 0) goto L_0x014a
        L_0x0149:
            r7 = 0
        L_0x014a:
            android.content.SharedPreferences r32 = r4.A01()     // Catch:{ all -> 0x06d5 }
            java.lang.String r31 = r10.getRawString()     // Catch:{ all -> 0x06d5 }
            X.34x r14 = r8.A05(r6)     // Catch:{ all -> 0x06d5 }
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0164
            boolean r0 = X.C627636p.A0g(r0)     // Catch:{ all -> 0x06d5 }
            r30 = 1
            if (r0 != 0) goto L_0x0166
        L_0x0164:
            r30 = 0
        L_0x0166:
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x0178
            X.33f r0 = r4.A0R     // Catch:{ all -> 0x06d5 }
            byte r1 = r0.A02(r6)     // Catch:{ all -> 0x06d5 }
            r0 = 93
            r29 = 1
            if (r1 == r0) goto L_0x017a
        L_0x0178:
            r29 = 0
        L_0x017a:
            X.34x r0 = r8.A05(r6)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0188
            boolean r0 = X.C624134x.A0g(r0)     // Catch:{ all -> 0x06d5 }
            r27 = 1
            if (r0 != 0) goto L_0x018a
        L_0x0188:
            r27 = 0
        L_0x018a:
            r3 = 1
            if (r14 == 0) goto L_0x01ca
            r0 = 5785(0x1699, float:8.107E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x01ca
            boolean r2 = r14 instanceof X.C30481mW     // Catch:{ all -> 0x06d5 }
            boolean r26 = X.C627636p.A0p(r14)     // Catch:{ all -> 0x06d5 }
            byte r1 = r14.A1I     // Catch:{ all -> 0x06d5 }
            r25 = 1
            if (r1 == r3) goto L_0x01af
            r0 = 25
            if (r1 == r0) goto L_0x01af
            r0 = 57
            if (r1 == r0) goto L_0x01af
            r0 = 42
            if (r1 == r0) goto L_0x01af
            r25 = 0
        L_0x01af:
            if (r41 == 0) goto L_0x01bf
            java.lang.Long r0 = r14.A0s     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x01bf
            long r17 = r0.longValue()     // Catch:{ all -> 0x06d5 }
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x01c7
        L_0x01bf:
            boolean r0 = r14.A1s(r3)     // Catch:{ all -> 0x06d5 }
            r24 = 0
            if (r0 == 0) goto L_0x01d3
        L_0x01c7:
            r24 = 1
            goto L_0x01d3
        L_0x01ca:
            r24 = 0
            r2 = 0
            r25 = 0
            r26 = 0
            if (r14 == 0) goto L_0x0217
        L_0x01d3:
            r0 = 5963(0x174b, float:8.356E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0217
            byte r1 = r14.A1I     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "video"
            java.lang.String r1 = X.C627636p.A0D(r1)     // Catch:{ all -> 0x06d5 }
            boolean r23 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "gif"
            boolean r22 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "audio"
            boolean r21 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "document"
            boolean r20 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "sticker"
            boolean r19 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "ptv"
            boolean r18 = r0.equals(r1)     // Catch:{ all -> 0x06d5 }
            boolean r0 = r14 instanceof X.C30721mu     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0214
            r0 = r14
            X.1mu r0 = (X.C30721mu) r0     // Catch:{ all -> 0x06d5 }
            boolean r0 = r0.A25()     // Catch:{ all -> 0x06d5 }
            r17 = 1
            if (r0 != 0) goto L_0x0228
        L_0x0214:
            r17 = 0
            goto L_0x0228
        L_0x0217:
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r1 = 0
        L_0x0226:
            r3 = 0
            goto L_0x0238
        L_0x0228:
            boolean r1 = r14 instanceof X.C30451mT     // Catch:{ all -> 0x06d5 }
            X.34x r0 = r14.A0w()     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0226
            X.2z0 r0 = r0.A1J     // Catch:{ all -> 0x06d5 }
            X.4uZ r0 = r0.A00     // Catch:{ all -> 0x06d5 }
            boolean r0 = r0 instanceof X.C135166kE     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0226
        L_0x0238:
            boolean r0 = r14 instanceof X.C30461mU     // Catch:{ all -> 0x06d5 }
            r16 = r0
            java.lang.String r15 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            r13 = r32
            r0 = r31
            java.lang.String r0 = r13.getString(r0, r15)     // Catch:{ all -> 0x06d5 }
            X.5XM r13 = X.AnonymousClass5XM.A00(r0)     // Catch:{ all -> 0x06d5 }
            r34 = r42
            if (r41 == 0) goto L_0x0313
            r0 = 0
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0259
            r0 = 43
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0259:
            if (r42 == 0) goto L_0x025f
            r0 = 2
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x025f:
            if (r11 == 0) goto L_0x0265
            r0 = 4
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0265:
            if (r7 == 0) goto L_0x026c
            r0 = 21
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x026c:
            if (r43 == 0) goto L_0x0273
            r0 = 22
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0273:
            if (r30 == 0) goto L_0x027a
            r0 = 24
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x027a:
            if (r2 == 0) goto L_0x0288
            r0 = 31
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0288
            r0 = 33
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0288:
            if (r25 == 0) goto L_0x0296
            r0 = 35
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0296
            r0 = 37
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0296:
            if (r26 == 0) goto L_0x02a4
            r0 = 39
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02a4
            r0 = 41
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02a4:
            if (r23 == 0) goto L_0x02b2
            r0 = 49
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02b2
            r0 = 51
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02b2:
            if (r22 == 0) goto L_0x02c0
            r0 = 53
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02c0
            r0 = 55
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02c0:
            if (r21 == 0) goto L_0x02ce
            r0 = 57
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02ce
            r0 = 59
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02ce:
            if (r20 == 0) goto L_0x02dc
            r0 = 61
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02dc
            r0 = 63
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02dc:
            if (r19 == 0) goto L_0x02ea
            r0 = 65
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x02ea
            r0 = 67
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02ea:
            if (r18 == 0) goto L_0x02f1
            r0 = 70
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02f1:
            if (r17 == 0) goto L_0x02f8
            r0 = 72
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02f8:
            if (r1 == 0) goto L_0x02ff
            r0 = 74
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x02ff:
            if (r33 == 0) goto L_0x0306
            r0 = 76
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0306:
            if (r16 == 0) goto L_0x030d
            r0 = 45
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x030d:
            if (r29 == 0) goto L_0x03d9
            r0 = 47
            goto L_0x03d6
        L_0x0313:
            r0 = 1
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x031e
            r0 = 44
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x031e:
            if (r42 == 0) goto L_0x0324
            r0 = 3
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0324:
            if (r11 == 0) goto L_0x032a
            r0 = 5
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x032a:
            if (r43 == 0) goto L_0x0331
            r0 = 23
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0331:
            if (r27 == 0) goto L_0x0338
            r0 = 30
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0338:
            if (r2 == 0) goto L_0x0346
            r0 = 32
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0346
            r0 = 34
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0346:
            if (r25 == 0) goto L_0x0354
            r0 = 36
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0354
            r0 = 38
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0354:
            if (r26 == 0) goto L_0x0362
            r0 = 40
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0362
            r0 = 42
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0362:
            if (r23 == 0) goto L_0x0370
            r0 = 50
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x0370
            r0 = 52
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x0370:
            if (r22 == 0) goto L_0x037e
            r0 = 54
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x037e
            r0 = 56
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x037e:
            if (r21 == 0) goto L_0x038c
            r0 = 58
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x038c
            r0 = 60
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x038c:
            if (r20 == 0) goto L_0x039a
            r0 = 62
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x039a
            r0 = 64
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x039a:
            if (r19 == 0) goto L_0x03a8
            r0 = 66
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
            if (r24 == 0) goto L_0x03a8
            r0 = 68
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03a8:
            if (r18 == 0) goto L_0x03af
            r0 = 71
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03af:
            if (r17 == 0) goto L_0x03b6
            r0 = 73
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03b6:
            if (r1 == 0) goto L_0x03bd
            r0 = 75
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03bd:
            if (r33 == 0) goto L_0x03c4
            r0 = 77
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03c4:
            if (r3 == 0) goto L_0x03cb
            r0 = 78
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03cb:
            if (r16 == 0) goto L_0x03d2
            r0 = 46
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03d2:
            if (r29 == 0) goto L_0x03d9
            r0 = 48
        L_0x03d6:
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x03d9:
            boolean r18 = X.C627336j.A0K(r10)     // Catch:{ all -> 0x06cc }
            if (r18 != 0) goto L_0x0458
            X.3Ex r0 = r4.A09     // Catch:{ all -> 0x06cc }
            X.3ZH r2 = r0.A07(r10)     // Catch:{ all -> 0x06cc }
            if (r2 != 0) goto L_0x03f8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06cc }
            java.lang.String r0 = "ChatMessageCounts/recordEngagementConversationRows/Can't get contact for jid - "
            r1.append(r0)     // Catch:{ all -> 0x06cc }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x06cc }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x06cc }
            goto L_0x0458
        L_0x03f8:
            java.lang.Boolean r0 = r13.A0B     // Catch:{ all -> 0x06cc }
            if (r0 != 0) goto L_0x0412
            boolean r0 = X.AnonymousClass000.A1T(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06cc }
            r13.A0B = r0     // Catch:{ all -> 0x06cc }
            if (r41 != 0) goto L_0x0412
            if (r14 == 0) goto L_0x0412
            long r0 = r14.A0I     // Catch:{ all -> 0x06cc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06cc }
            r13.A0R = r0     // Catch:{ all -> 0x06cc }
        L_0x0412:
            boolean r0 = r2.A0R()     // Catch:{ all -> 0x06cc }
            if (r0 == 0) goto L_0x043c
            java.lang.Long r1 = r13.A0F     // Catch:{ all -> 0x06cc }
            if (r1 != 0) goto L_0x0429
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()     // Catch:{ all -> 0x06cc }
            r13.A0F = r0     // Catch:{ all -> 0x06cc }
        L_0x0422:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x06cc }
            r13.A0C = r0     // Catch:{ all -> 0x06cc }
            goto L_0x043c
        L_0x0429:
            java.lang.Boolean r0 = r13.A0C     // Catch:{ all -> 0x06cc }
            if (r0 == 0) goto L_0x0422
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x06cc }
            r0 = r0 ^ r41
            if (r0 == 0) goto L_0x0422
            java.lang.Long r0 = X.AnonymousClass0x7.A0j(r1)     // Catch:{ all -> 0x06cc }
            r13.A0F = r0     // Catch:{ all -> 0x06cc }
            goto L_0x0422
        L_0x043c:
            if (r41 == 0) goto L_0x0458
            java.lang.Long r1 = r13.A0R     // Catch:{ all -> 0x06cc }
            if (r1 == 0) goto L_0x0458
            java.lang.Long r0 = r13.A0S     // Catch:{ all -> 0x06cc }
            if (r0 != 0) goto L_0x0458
            if (r14 == 0) goto L_0x0458
            long r2 = r14.A0K     // Catch:{ all -> 0x06cc }
            long r0 = r1.longValue()     // Catch:{ all -> 0x06cc }
            long r0 = X.C18280x3.A08(r2, r0)     // Catch:{ all -> 0x06cc }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06cc }
            r13.A0S = r0     // Catch:{ all -> 0x06cc }
        L_0x0458:
            r3 = r14
            if (r43 == 0) goto L_0x0461
            X.33f r0 = r4.A0R     // Catch:{ all -> 0x06cc }
            X.34x r3 = r0.A05(r6)     // Catch:{ all -> 0x06cc }
        L_0x0461:
            if (r3 == 0) goto L_0x04d1
            X.34x r17 = r3.A0w()     // Catch:{ all -> 0x06cc }
            if (r7 == 0) goto L_0x0477
            if (r17 == 0) goto L_0x0477
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r17
            boolean r0 = r0.A1s(r1)     // Catch:{ all -> 0x06cc }
            r16 = 1
            if (r0 != 0) goto L_0x0479
        L_0x0477:
            r16 = 0
        L_0x0479:
            r15 = 0
            X.2rV r0 = r4.A0K     // Catch:{ all -> 0x06cc }
            r1 = r0
            r2 = 0
            r0 = 1
            java.util.List r1 = r1.A04(r10, r0, r2, r2)     // Catch:{ all -> 0x06cc }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x06cc }
            if (r0 != 0) goto L_0x048d
            X.34x r15 = X.C18320x8.A0R(r1, r2)     // Catch:{ all -> 0x06cc }
        L_0x048d:
            if (r41 == 0) goto L_0x049e
            if (r43 != 0) goto L_0x049e
            if (r17 != 0) goto L_0x049e
            if (r15 == 0) goto L_0x049e
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = r15.A1s(r0)     // Catch:{ all -> 0x06cc }
            r0 = 1
            if (r1 != 0) goto L_0x049f
        L_0x049e:
            r0 = 0
        L_0x049f:
            if (r16 != 0) goto L_0x04a3
            if (r0 == 0) goto L_0x04a8
        L_0x04a3:
            r0 = 28
            r13.A01(r0)     // Catch:{ all -> 0x06cc }
        L_0x04a8:
            if (r43 == 0) goto L_0x04b7
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r3.A1s(r0)     // Catch:{ all -> 0x06cc }
            if (r0 == 0) goto L_0x04b7
            r0 = 29
            r13.A01(r0)     // Catch:{ all -> 0x06cc }
        L_0x04b7:
            if (r41 == 0) goto L_0x04c4
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r3.A1s(r0)     // Catch:{ all -> 0x06cc }
            if (r0 == 0) goto L_0x04d1
            r0 = 26
            goto L_0x04ce
        L_0x04c4:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r3.A1s(r0)     // Catch:{ all -> 0x06cc }
            if (r0 == 0) goto L_0x04d1
            r0 = 27
        L_0x04ce:
            r13.A01(r0)     // Catch:{ all -> 0x06cc }
        L_0x04d1:
            if (r14 == 0) goto L_0x04de
            boolean r0 = r14.A1B     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x04de
            if (r41 != 0) goto L_0x04de
            r0 = 20
            r13.A01(r0)     // Catch:{ all -> 0x06d5 }
        L_0x04de:
            android.content.SharedPreferences$Editor r2 = r32.edit()     // Catch:{ all -> 0x06d5 }
            java.lang.String r1 = r13.toString()     // Catch:{ all -> 0x06d5 }
            r0 = r31
            X.C18270x1.A0j(r2, r0, r1)     // Catch:{ all -> 0x06d5 }
            if (r18 != 0) goto L_0x058d
            android.content.SharedPreferences r14 = r4.A01()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x06d5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "_commerce"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r14.getString(r3, r0)     // Catch:{ all -> 0x06d5 }
            X.5Wm r13 = X.C105805Wm.A00(r0)     // Catch:{ all -> 0x06d5 }
            X.34x r8 = r8.A05(r6)     // Catch:{ all -> 0x06d5 }
            r15 = 0
            if (r8 == 0) goto L_0x0539
            boolean r0 = r8 instanceof X.C30821nD     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x0538
            boolean r0 = r8 instanceof X.C30771mz     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x0538
            byte r1 = r8.A1I     // Catch:{ all -> 0x06d5 }
            r0 = 52
            if (r1 == r0) goto L_0x0538
            r0 = 54
            if (r1 == r0) goto L_0x0538
            boolean r0 = r8 instanceof X.C30481mW     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0539
            java.lang.String r2 = r8.A13()     // Catch:{ all -> 0x06d5 }
            X.36Y r1 = r4.A0S     // Catch:{ all -> 0x06d5 }
            boolean r0 = r1.A0J(r2)     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x0538
            boolean r0 = r1.A0K(r2)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x0539
        L_0x0538:
            r15 = 1
        L_0x0539:
            r0 = 1
            if (r15 == 0) goto L_0x0549
            if (r41 == 0) goto L_0x0540
            goto L_0x056e
        L_0x0540:
            java.lang.Long r2 = r13.A01     // Catch:{ all -> 0x06d5 }
            java.lang.Long r0 = X.C624334z.A03(r2, r0)     // Catch:{ all -> 0x06d5 }
            r13.A01 = r0     // Catch:{ all -> 0x06d5 }
            goto L_0x0582
        L_0x0549:
            boolean r2 = r8 instanceof X.C30481mW     // Catch:{ all -> 0x06d5 }
            if (r2 == 0) goto L_0x058d
            if (r41 == 0) goto L_0x0616
            X.34x r8 = r8.A0w()     // Catch:{ all -> 0x06d5 }
            boolean r2 = r8 instanceof X.C30771mz     // Catch:{ all -> 0x06d5 }
            if (r2 == 0) goto L_0x0582
            X.1mz r8 = (X.C30771mz) r8     // Catch:{ all -> 0x06d5 }
            X.2z0 r2 = r8.A1J     // Catch:{ all -> 0x06d5 }
            java.lang.String r8 = r2.A01     // Catch:{ all -> 0x06d5 }
            java.lang.String r2 = "product_inquiry"
            boolean r2 = r8.startsWith(r2)     // Catch:{ all -> 0x06d5 }
            if (r2 == 0) goto L_0x0582
            java.lang.Long r2 = r13.A05     // Catch:{ all -> 0x06d5 }
            java.lang.Long r0 = X.C624334z.A03(r2, r0)     // Catch:{ all -> 0x06d5 }
            r13.A05 = r0     // Catch:{ all -> 0x06d5 }
            goto L_0x0582
        L_0x056e:
            boolean r2 = r8 instanceof X.C30821nD     // Catch:{ all -> 0x06d5 }
            if (r2 == 0) goto L_0x057a
            java.lang.Long r2 = r13.A03     // Catch:{ all -> 0x06d5 }
            java.lang.Long r2 = X.C624334z.A03(r2, r0)     // Catch:{ all -> 0x06d5 }
            r13.A03 = r2     // Catch:{ all -> 0x06d5 }
        L_0x057a:
            java.lang.Long r2 = r13.A02     // Catch:{ all -> 0x06d5 }
            java.lang.Long r0 = X.C624334z.A03(r2, r0)     // Catch:{ all -> 0x06d5 }
            r13.A02 = r0     // Catch:{ all -> 0x06d5 }
        L_0x0582:
            android.content.SharedPreferences$Editor r1 = r14.edit()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x06d5 }
            X.C18270x1.A0j(r1, r3, r0)     // Catch:{ all -> 0x06d5 }
        L_0x058d:
            if (r41 == 0) goto L_0x0616
            X.4uZ r2 = r6.A00     // Catch:{ all -> 0x06d5 }
            boolean r0 = r2 instanceof X.AnonymousClass1fI     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x059a
            r0 = 19
            r4.A05(r10, r0)     // Catch:{ all -> 0x06d5 }
        L_0x059a:
            X.2zI r8 = r4.A0B     // Catch:{ all -> 0x06d5 }
            if (r2 == 0) goto L_0x0616
            android.content.SharedPreferences r1 = r8.A01()     // Catch:{ all -> 0x06d5 }
            java.lang.String r3 = r6.A01     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = X.C60862zI.A00(r2, r3)     // Catch:{ all -> 0x06d5 }
            java.lang.String r1 = X.AnonymousClass0x9.A0v(r1, r0)     // Catch:{ all -> 0x06d5 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x06d5 }
            if (r0 == 0) goto L_0x05b3
            goto L_0x05ba
        L_0x05b3:
            java.lang.String r0 = "quick_reply"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x06d5 }
            goto L_0x05bb
        L_0x05ba:
            r0 = 0
        L_0x05bb:
            r6 = 3
            if (r0 == 0) goto L_0x05e1
            r0 = r35
            boolean r0 = r0.A0a(r10)     // Catch:{ all -> 0x06d5 }
            if (r0 != 0) goto L_0x05d2
            X.3dI r13 = r4.A0e     // Catch:{ all -> 0x06d5 }
            r1 = 28
            X.3ca r0 = new X.3ca     // Catch:{ all -> 0x06d5 }
            r0.<init>((X.C113905mB) r4, (X.C95814uZ) r10, (int) r6, (int) r1)     // Catch:{ all -> 0x06d5 }
            r13.execute(r0)     // Catch:{ all -> 0x06d5 }
        L_0x05d2:
            android.content.SharedPreferences r0 = r8.A01()     // Catch:{ all -> 0x06d5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = X.C60862zI.A00(r2, r3)     // Catch:{ all -> 0x06d5 }
            X.C18270x1.A0g(r1, r0)     // Catch:{ all -> 0x06d5 }
        L_0x05e1:
            r13 = 0
            android.content.SharedPreferences r1 = r8.A02()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = X.C60862zI.A00(r2, r3)     // Catch:{ all -> 0x06d5 }
            int r13 = r1.getInt(r0, r13)     // Catch:{ all -> 0x06d5 }
            if (r13 == 0) goto L_0x0616
            r1 = 1
            r0 = 8
            if (r13 == r1) goto L_0x0604
            r0 = 2
            if (r13 == r0) goto L_0x0602
            r0 = 11
            if (r13 == r6) goto L_0x0604
            r0 = 4
            if (r13 != r0) goto L_0x0607
            r0 = 10
            goto L_0x0604
        L_0x0602:
            r0 = 12
        L_0x0604:
            r4.A05(r10, r0)     // Catch:{ all -> 0x06d5 }
        L_0x0607:
            android.content.SharedPreferences r0 = r8.A02()     // Catch:{ all -> 0x06d5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = X.C60862zI.A00(r2, r3)     // Catch:{ all -> 0x06d5 }
            X.C18270x1.A0g(r1, r0)     // Catch:{ all -> 0x06d5 }
        L_0x0616:
            if (r28 == 0) goto L_0x065d
            android.content.SharedPreferences r8 = r4.A01()     // Catch:{ all -> 0x06d5 }
            java.lang.String r2 = r10.getRawString()     // Catch:{ all -> 0x06d5 }
            int r1 = r28.intValue()     // Catch:{ all -> 0x06d5 }
            r0 = 1
            if (r1 == r0) goto L_0x0634
            r0 = 2
            if (r1 == r0) goto L_0x063b
            r0 = 3
            if (r1 != r0) goto L_0x06ce
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "_editFromAgent"
            goto L_0x0641
        L_0x0634:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "_messageToAgent"
            goto L_0x0641
        L_0x063b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "_messageFromAgent"
        L_0x0641:
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = "0"
            java.lang.String r0 = r8.getString(r6, r0)     // Catch:{ all -> 0x06d5 }
            long r2 = X.C615531h.A03(r0)     // Catch:{ all -> 0x06d5 }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x06d5 }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x06d5 }
            X.C18270x1.A0j(r1, r6, r0)     // Catch:{ all -> 0x06d5 }
        L_0x065d:
            r0 = 2474(0x9aa, float:3.467E-42)
            boolean r0 = r12.A0X(r0)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x0118
            if (r9 == 0) goto L_0x0118
            android.content.SharedPreferences r8 = r4.A01()     // Catch:{ all -> 0x06d7 }
            if (r8 == 0) goto L_0x0118
            X.2IJ r1 = r4.A0c     // Catch:{ all -> 0x06d7 }
            X.7ZO r6 = new X.7ZO     // Catch:{ all -> 0x06d7 }
            r0 = r34
            r6.<init>(r5, r0, r11, r7)     // Catch:{ all -> 0x06d7 }
            r7 = 0
            java.util.Set r0 = r1.A00     // Catch:{ all -> 0x06d7 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x06d7 }
        L_0x067d:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x06d7 }
            X.2IH r0 = (X.AnonymousClass2IH) r0     // Catch:{ all -> 0x06d7 }
            X.1VX r1 = r0.A00     // Catch:{ all -> 0x06d7 }
            r0 = 2474(0x9aa, float:3.467E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x067d
            boolean r1 = r9 instanceof X.C30361mK     // Catch:{ all -> 0x06d7 }
            boolean r0 = r9 instanceof X.C30801n8     // Catch:{ all -> 0x06d7 }
            if (r1 == 0) goto L_0x067d
            if (r0 != 0) goto L_0x067d
            boolean r0 = r6.A02     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x067d
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x06d7 }
            X.C162457s7.A0J(r0, r7)     // Catch:{ all -> 0x06d7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = "_location"
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x06d7 }
            java.lang.String r1 = "0"
            java.lang.String r0 = r8.getString(r5, r1)     // Catch:{ all -> 0x06d7 }
            if (r0 == 0) goto L_0x06b9
            r1 = r0
        L_0x06b9:
            long r2 = X.C615531h.A03(r1)     // Catch:{ all -> 0x06d7 }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r8.edit()     // Catch:{ all -> 0x06d7 }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06d7 }
            X.C18270x1.A0j(r1, r5, r0)     // Catch:{ all -> 0x06d7 }
            goto L_0x067d
        L_0x06cc:
            r0 = move-exception
            goto L_0x06d4
        L_0x06ce:
            java.lang.String r0 = "agent type does not exit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x06d5 }
        L_0x06d4:
            throw r0     // Catch:{ all -> 0x06d5 }
        L_0x06d5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06d7 }
        L_0x06d7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113905mB.A07(X.4uZ, com.whatsapp.jid.UserJid, X.2z0, java.lang.Integer, boolean, boolean, boolean):void");
    }
}
