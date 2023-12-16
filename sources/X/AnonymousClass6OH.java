package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6OH  reason: invalid class name */
public final class AnonymousClass6OH extends AnonymousClass861 implements Handler.Callback {
    public int A00;
    public int A01;
    public long A02;
    public C166527yp A03;
    public C187598xV A04;
    public C126476Oa A05;
    public C126506Oe A06;
    public C126506Oe A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final C147807Fu A0C;
    public final C186658vj A0D;
    public final C180748lZ A0E;

    public void A0B() {
        this.A03 = null;
        this.A02 = -9223372036854775807L;
        A0F();
        A0H();
        C187598xV r0 = this.A04;
        r0.getClass();
        r0.release();
        this.A04 = null;
        this.A00 = 0;
    }

    public final void A0G() {
        C187598xV r2;
        String str;
        this.A0A = true;
        C166527yp r22 = this.A03;
        r22.getClass();
        String str2 = r22.A0T;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1351681404:
                    if (str2.equals("application/dvbsubs")) {
                        r2 = new AnonymousClass6PT(r22.A0U);
                        break;
                    }
                    break;
                case -1248334819:
                    if (str2.equals("application/pgs")) {
                        r2 = new AnonymousClass6PW();
                        break;
                    }
                    break;
                case -1026075066:
                    if (str2.equals("application/x-mp4-vtt")) {
                        r2 = new AnonymousClass6PU();
                        break;
                    }
                    break;
                case -1004728940:
                    if (str2.equals("text/vtt")) {
                        r2 = new AnonymousClass6PV();
                        break;
                    }
                    break;
                case 691401887:
                    if (str2.equals("application/x-quicktime-tx3g")) {
                        r2 = new AnonymousClass6PX(r22.A0U);
                        break;
                    }
                    break;
                case 822864842:
                    if (str2.equals("text/x-ssa")) {
                        r2 = new C126716Pa(r22.A0U);
                        break;
                    }
                    break;
                case 930165504:
                    str = "application/x-mp4-cea-608";
                    break;
                case 1566015601:
                    str = "application/cea-608";
                    break;
                case 1566016562:
                    if (str2.equals("application/cea-708")) {
                        r2 = new C126756Pe(r22.A0U, r22.A03);
                        break;
                    }
                    break;
                case 1668750253:
                    if (str2.equals("application/x-subrip")) {
                        r2 = new AnonymousClass6PY();
                        break;
                    }
                    break;
                case 1693976202:
                    if (str2.equals("application/ttml+xml")) {
                        r2 = new AnonymousClass6PZ();
                        break;
                    }
                    break;
            }
            if (str2.equals(str)) {
                r2 = new C126766Pf(str2, r22.A03);
                this.A04 = r2;
                return;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Attempted to create decoder for unsupported MIME type: ");
        throw AnonymousClass000.A0F(str2, A0o);
    }

    public final void A0H() {
        this.A05 = null;
        this.A01 = -1;
        C126506Oe r0 = this.A07;
        if (r0 != null) {
            r0.release();
            this.A07 = null;
        }
        C126506Oe r02 = this.A06;
        if (r02 != null) {
            r02.release();
            this.A06 = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OH(Looper looper, C180748lZ r4) {
        super(3);
        Handler handler;
        C186658vj r1 = C186658vj.A00;
        this.A0E = r4;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A0B = handler;
        this.A0D = r1;
        this.A0C = new C147807Fu();
        this.A02 = -9223372036854775807L;
    }

    public final long A0E() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        this.A07.getClass();
        if (this.A01 < this.A07.B7S()) {
            return this.A07.B7R(this.A01);
        }
        return Long.MAX_VALUE;
    }

    public boolean BHW() {
        return this.A09;
    }

    public boolean BIe() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        if (r8 != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2 A[LOOP:1: B:51:0x00d2->B:83:0x00d2, LOOP_START, SYNTHETIC, Splitter:B:51:0x00d2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjR(long r11, long r13) {
        /*
            r10 = this;
            boolean r0 = r10.A06
            r5 = 1
            if (r0 == 0) goto L_0x0019
            long r1 = r10.A02
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            r10.A0H()
            r10.A09 = r5
        L_0x0019:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x015a
            X.6Oe r0 = r10.A06
            if (r0 != 0) goto L_0x0053
            X.8xV r0 = r10.A04
            r0.getClass()
            r0.Bn1(r11)
            X.8xV r0 = r10.A04     // Catch:{ 6OY -> 0x0037 }
            r0.getClass()     // Catch:{ 6OY -> 0x0037 }
            java.lang.Object r0 = r0.B1V()     // Catch:{ 6OY -> 0x0037 }
            X.6Oe r0 = (X.C126506Oe) r0     // Catch:{ 6OY -> 0x0037 }
            r10.A06 = r0     // Catch:{ 6OY -> 0x0037 }
            goto L_0x0053
        L_0x0037:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.7yp r0 = r10.A03
            java.lang.String r1 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.String r0 = "TextRenderer"
            X.C159307lc.A02(r0, r1, r2)
            r10.A0F()
            r10.A0I()
            return
        L_0x0053:
            int r0 = r10.A01
            r4 = 2
            if (r0 != r4) goto L_0x015a
            X.6Oe r0 = r10.A07
            r3 = 0
            if (r0 == 0) goto L_0x0072
            long r1 = r10.A0E()
            r8 = 0
        L_0x0062:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            long r1 = r10.A0E()
            r8 = 1
            goto L_0x0062
        L_0x0072:
            r8 = 0
        L_0x0073:
            X.6Oe r7 = r10.A06
            r2 = 0
            if (r7 == 0) goto L_0x009f
            boolean r0 = X.C153567bZ.A00(r7)
            if (r0 == 0) goto L_0x00a2
            if (r8 != 0) goto L_0x00b9
            long r8 = r10.A0E()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0094
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0099
            r10.A0I()
        L_0x0094:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x00d2
            return
        L_0x0099:
            r10.A0H()
            r10.A09 = r5
            goto L_0x0094
        L_0x009f:
            if (r8 == 0) goto L_0x0094
            goto L_0x00b9
        L_0x00a2:
            long r0 = r7.timeUs
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x009f
            X.6Oe r0 = r10.A07
            if (r0 == 0) goto L_0x00af
            r0.release()
        L_0x00af:
            int r0 = r7.B9y(r11)
            r10.A01 = r0
            r10.A07 = r7
            r10.A06 = r2
        L_0x00b9:
            X.6Oe r0 = r10.A07
            r0.getClass()
            X.6Oe r0 = r10.A07
            java.util.List r1 = r0.B6I(r11)
            android.os.Handler r0 = r10.A0B
            if (r0 == 0) goto L_0x00cc
            X.C18290x4.A1C(r0, r1, r3)
            goto L_0x0094
        L_0x00cc:
            X.8lZ r0 = r10.A0E
            r0.BQU(r1)
            goto L_0x0094
        L_0x00d2:
            boolean r0 = r10.A08     // Catch:{ 6OY -> 0x013f }
            if (r0 != 0) goto L_0x015a
            X.6Oa r6 = r10.A05     // Catch:{ 6OY -> 0x013f }
            if (r6 != 0) goto L_0x00e9
            X.8xV r0 = r10.A04     // Catch:{ 6OY -> 0x013f }
            r0.getClass()     // Catch:{ 6OY -> 0x013f }
            java.lang.Object r6 = r0.B1R()     // Catch:{ 6OY -> 0x013f }
            X.6Oa r6 = (X.C126476Oa) r6     // Catch:{ 6OY -> 0x013f }
            if (r6 == 0) goto L_0x015a
            r10.A05 = r6     // Catch:{ 6OY -> 0x013f }
        L_0x00e9:
            int r0 = r10.A00     // Catch:{ 6OY -> 0x013f }
            if (r0 != r5) goto L_0x00fd
            r0 = 4
            r6.flags = r0     // Catch:{ 6OY -> 0x013f }
            X.8xV r0 = r10.A04     // Catch:{ 6OY -> 0x013f }
            r0.getClass()     // Catch:{ 6OY -> 0x013f }
            r0.Bi7(r6)     // Catch:{ 6OY -> 0x013f }
            r10.A05 = r2     // Catch:{ 6OY -> 0x013f }
            r10.A00 = r4     // Catch:{ 6OY -> 0x013f }
            goto L_0x013e
        L_0x00fd:
            X.7Fu r7 = r10.A0C     // Catch:{ 6OY -> 0x013f }
            int r1 = r10.A05(r7, r6, r3)     // Catch:{ 6OY -> 0x013f }
            r0 = -4
            if (r1 != r0) goto L_0x013a
            boolean r0 = X.C153567bZ.A00(r6)     // Catch:{ 6OY -> 0x013f }
            if (r0 == 0) goto L_0x011b
            r10.A08 = r5     // Catch:{ 6OY -> 0x013f }
            r10.A0A = r3     // Catch:{ 6OY -> 0x013f }
        L_0x0110:
            X.8xV r0 = r10.A04     // Catch:{ 6OY -> 0x013f }
            r0.getClass()     // Catch:{ 6OY -> 0x013f }
            r0.Bi7(r6)     // Catch:{ 6OY -> 0x013f }
            r10.A05 = r2     // Catch:{ 6OY -> 0x013f }
            goto L_0x00d2
        L_0x011b:
            X.7yp r0 = r7.A00     // Catch:{ 6OY -> 0x013f }
            if (r0 == 0) goto L_0x015a
            long r0 = r0.A0J     // Catch:{ 6OY -> 0x013f }
            r6.A00 = r0     // Catch:{ 6OY -> 0x013f }
            r6.A00()     // Catch:{ 6OY -> 0x013f }
            boolean r1 = r10.A0A     // Catch:{ 6OY -> 0x013f }
            int r0 = r6.flags     // Catch:{ 6OY -> 0x013f }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r5)     // Catch:{ 6OY -> 0x013f }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r1 = r1 & r0
            r10.A0A = r1     // Catch:{ 6OY -> 0x013f }
            if (r1 != 0) goto L_0x00d2
            goto L_0x0110
        L_0x013a:
            r0 = -3
            if (r1 != r0) goto L_0x00d2
            return
        L_0x013e:
            return
        L_0x013f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.7yp r0 = r10.A03
            java.lang.String r1 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.String r0 = "TextRenderer"
            X.C159307lc.A02(r0, r1, r2)
            r10.A0F()
            r10.A0I()
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OH.BjR(long, long):void");
    }

    public int BqO(C166527yp r3) {
        String str = r3.A0T;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str)) {
            return AnonymousClass000.A1S(C162107rG.A04(str) ? 1 : 0) ? 1 : 0;
        }
        if (r3.A0N == null) {
            return 4;
        }
        return 2;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A0E.BQU((List) message.obj);
            return true;
        }
        throw AnonymousClass6CA.A0O();
    }

    public void A0C(long j, boolean z) {
        A0F();
        this.A08 = false;
        this.A09 = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A0I();
            return;
        }
        A0H();
        C187598xV r0 = this.A04;
        r0.getClass();
        r0.flush();
    }

    public final void A0F() {
        List emptyList = Collections.emptyList();
        Handler handler = this.A0B;
        if (handler != null) {
            C18290x4.A1C(handler, emptyList, 0);
        } else {
            this.A0E.BQU(emptyList);
        }
    }

    public final void A0I() {
        A0H();
        C187598xV r0 = this.A04;
        r0.getClass();
        r0.release();
        this.A04 = null;
        this.A00 = 0;
        A0G();
    }
}
