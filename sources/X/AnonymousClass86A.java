package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.86A  reason: invalid class name */
public final class AnonymousClass86A implements C186418vH {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public AudioTrack A0C;
    public C158477k2 A0D;
    public C158427jx A0E;
    public C186018uc A0F;
    public C151407Uq A0G;
    public AnonymousClass7UV A0H;
    public AnonymousClass7UV A0I;
    public AnonymousClass7M3 A0J;
    public AnonymousClass7M3 A0K;
    public AnonymousClass7WA A0L;
    public ByteBuffer A0M;
    public ByteBuffer A0N;
    public ByteBuffer A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public C187058wN[] A0X;
    public ByteBuffer[] A0Y;
    public final ConditionVariable A0Z = new ConditionVariable(true);
    public final C160527no A0a;
    public final AnonymousClass7XR A0b = new AnonymousClass7XR(new AnonymousClass86B(this));
    public final AnonymousClass6OR A0c;
    public final C178048gs A0d;
    public final AnonymousClass7S4 A0e;
    public final AnonymousClass7S4 A0f;
    public final AnonymousClass6OS A0g;
    public final ArrayDeque A0h;
    public final C187058wN[] A0i;
    public final C187058wN[] A0j;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r2 == 5) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r2 == 6) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        if (r2 == 18) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (r2 == 17) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r2 == 7) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r2 == 8) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r2 != 14) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, r2) < 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r2 != 18) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        if (X.C162387ry.A01 < 29) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        r3 = A00(r7.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        if (r3 != 0) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        android.util.Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b1, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, 8) >= 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        if (java.util.Arrays.binarySearch(r8.A01, 18) >= 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bd, code lost:
        r2 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bf, code lost:
        r3 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c3, code lost:
        if (r3 <= r8.A00) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c6, code lost:
        r1 = X.C162387ry.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ca, code lost:
        if (r1 > 28) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cc, code lost:
        if (r3 != 7) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ce, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d2, code lost:
        if (r1 > 26) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if ("fugu".equals(X.C162387ry.A02) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00df, code lost:
        if (r3 != 1) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e1, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e2, code lost:
        r0 = X.C162387ry.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e6, code lost:
        if (r0 == 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f4, code lost:
        return android.util.Pair.create(java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f6, code lost:
        if (r3 == 3) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f9, code lost:
        if (r3 == 4) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fc, code lost:
        if (r3 != 5) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00fe, code lost:
        r3 = 6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A02(X.C166527yp r7, X.C160527no r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x0011
            java.lang.String r2 = r7.A0T
            r2.getClass()
            java.lang.String r1 = r7.A0O
            int r0 = r2.hashCode()
            switch(r0) {
                case -2123537834: goto L_0x0012;
                case -1095064472: goto L_0x001d;
                case -53558318: goto L_0x0027;
                case 187078296: goto L_0x003e;
                case 187078297: goto L_0x0048;
                case 1504578661: goto L_0x0053;
                case 1505942594: goto L_0x005d;
                case 1556697186: goto L_0x0068;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r6
        L_0x0012:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 18
            goto L_0x0072
        L_0x001d:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 7
            goto L_0x0072
        L_0x0027:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            X.7GG r0 = X.C162107rG.A01(r1)
            if (r0 == 0) goto L_0x0011
            int r0 = r0.A00
            int r2 = X.AnonymousClass6C9.A06(r0)
            goto L_0x0072
        L_0x003e:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 5
            goto L_0x0072
        L_0x0048:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 17
            goto L_0x0072
        L_0x0053:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 6
            goto L_0x0072
        L_0x005d:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 8
            goto L_0x0072
        L_0x0068:
            java.lang.String r0 = "audio/true-hd"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0011
            r2 = 14
        L_0x0072:
            r0 = 5
            r4 = 7
            r5 = 8
            r3 = 6
            r1 = 18
            if (r2 == r0) goto L_0x008b
            if (r2 == r3) goto L_0x008b
            if (r2 == r1) goto L_0x00b5
            r0 = 17
            if (r2 == r0) goto L_0x008b
            if (r2 == r4) goto L_0x008b
            if (r2 == r5) goto L_0x00ab
            r0 = 14
            if (r2 != r0) goto L_0x0011
        L_0x008b:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r2)
            if (r0 < 0) goto L_0x0011
            if (r2 != r1) goto L_0x00bf
            int r1 = X.C162387ry.A01
            r0 = 29
            if (r1 < r0) goto L_0x00c6
            int r0 = r7.A0F
            int r3 = A00(r0)
            if (r3 != 0) goto L_0x00c6
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r1, r0)
            return r6
        L_0x00ab:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r5)
            if (r0 >= 0) goto L_0x008b
            r2 = 7
            goto L_0x008b
        L_0x00b5:
            int[] r0 = r8.A01
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L_0x008b
            r2 = 6
            goto L_0x008b
        L_0x00bf:
            int r3 = r7.A06
            int r0 = r8.A00
            if (r3 <= r0) goto L_0x00c6
            return r6
        L_0x00c6:
            int r1 = X.C162387ry.A01
            r0 = 28
            if (r1 > r0) goto L_0x00e2
            if (r3 != r4) goto L_0x00f5
            r3 = 8
        L_0x00d0:
            r0 = 26
            if (r1 > r0) goto L_0x00e2
            java.lang.String r1 = "fugu"
            java.lang.String r0 = X.C162387ry.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e2
            r0 = 1
            if (r3 != r0) goto L_0x00e2
            r3 = 2
        L_0x00e2:
            int r0 = X.C162387ry.A00(r3)
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x00f5:
            r0 = 3
            if (r3 == r0) goto L_0x00fe
            r0 = 4
            if (r3 == r0) goto L_0x00fe
            r0 = 5
            if (r3 != r0) goto L_0x00d0
        L_0x00fe:
            r3 = 6
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.A02(X.7yp, X.7no):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r5 == -32) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.nio.ByteBuffer r14, long r15) {
        /*
            r13 = this;
            r8 = r14
            boolean r0 = r14.hasRemaining()
            if (r0 == 0) goto L_0x006a
            java.nio.ByteBuffer r0 = r13.A0O
            r10 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0132
            boolean r0 = X.AnonymousClass000.A1Y(r0, r14)
            X.C161487pm.A03(r0)
        L_0x0014:
            int r9 = r14.remaining()
            boolean r0 = r13.A0W
            if (r0 == 0) goto L_0x012a
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C161487pm.A04(r0)
            android.media.AudioTrack r7 = r13.A0C
            int r1 = X.C162387ry.A01
            r0 = 26
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r1 < r0) goto L_0x00d1
            long r11 = r15 * r2
            int r5 = r7.write(r8, r9, r10, r11)
        L_0x003a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r13.A06 = r0
            if (r5 >= 0) goto L_0x006b
            int r1 = X.C162387ry.A01
            r0 = 24
            if (r1 < r0) goto L_0x004b
            r0 = -6
            if (r5 == r0) goto L_0x0050
        L_0x004b:
            r0 = -32
            r2 = 0
            if (r5 != r0) goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            X.7UV r0 = r13.A0H
            X.7yp r0 = r0.A07
            X.6z8 r1 = new X.6z8
            r1.<init>(r0, r5, r2)
            X.8uc r0 = r13.A0F
            if (r0 == 0) goto L_0x0061
            r0.BMt(r1)
        L_0x0061:
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x0136
            X.7S4 r0 = r13.A0f
            r0.A00(r1)
        L_0x006a:
            return
        L_0x006b:
            X.7S4 r1 = r13.A0f
            r0 = 0
            r1.A01 = r0
            android.media.AudioTrack r2 = r13.A0C
            int r1 = X.C162387ry.A01
            r0 = 29
            if (r1 < r0) goto L_0x00aa
            boolean r0 = r2.isOffloadedPlayback()
            if (r0 == 0) goto L_0x00aa
            long r0 = r13.A0A
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0088
            r13.A0R = r6
        L_0x0088:
            boolean r2 = r13.A0S
            if (r2 == 0) goto L_0x00aa
            X.8uc r2 = r13.A0F
            if (r2 == 0) goto L_0x00aa
            if (r5 >= r9) goto L_0x00aa
            boolean r2 = r13.A0R
            if (r2 != 0) goto L_0x00aa
            X.7XR r4 = r13.A0b
            long r2 = r4.A00()
            long r0 = r0 - r2
            long r0 = A01(r4, r0)
            long r0 = X.C161207pD.A01(r0)
            X.8uc r2 = r13.A0F
            r2.BXK(r0)
        L_0x00aa:
            X.7UV r0 = r13.A0H
            int r4 = r0.A04
            if (r4 != 0) goto L_0x00b6
            long r2 = r13.A0B
            long r0 = (long) r5
            long r2 = r2 + r0
            r13.A0B = r2
        L_0x00b6:
            if (r5 != r9) goto L_0x006a
            if (r4 == 0) goto L_0x00cd
            java.nio.ByteBuffer r0 = r13.A0N
            if (r14 == r0) goto L_0x00bf
            r10 = 0
        L_0x00bf:
            X.C161487pm.A04(r10)
            long r2 = r13.A0A
            int r1 = r13.A04
            int r0 = r13.A05
            int r1 = r1 * r0
            long r0 = (long) r1
            long r2 = r2 + r0
            r13.A0A = r2
        L_0x00cd:
            r0 = 0
            r13.A0O = r0
            return
        L_0x00d1:
            java.nio.ByteBuffer r0 = r13.A0M
            if (r0 != 0) goto L_0x00ea
            r0 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r13.A0M = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r0)
            java.nio.ByteBuffer r1 = r13.A0M
            r0 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r0)
        L_0x00ea:
            int r0 = r13.A02
            if (r0 != 0) goto L_0x0104
            java.nio.ByteBuffer r1 = r13.A0M
            r0 = 4
            r1.putInt(r0, r9)
            java.nio.ByteBuffer r1 = r13.A0M
            r0 = 8
            long r11 = r15 * r2
            r1.putLong(r0, r11)
            java.nio.ByteBuffer r0 = r13.A0M
            r0.position(r6)
            r13.A02 = r9
        L_0x0104:
            java.nio.ByteBuffer r0 = r13.A0M
            int r1 = r0.remaining()
            if (r1 <= 0) goto L_0x0119
            java.nio.ByteBuffer r0 = r13.A0M
            int r5 = r7.write(r0, r1, r10)
            if (r5 < 0) goto L_0x0126
            if (r5 >= r1) goto L_0x0119
            r5 = 0
            goto L_0x003a
        L_0x0119:
            int r5 = r7.write(r14, r9, r10)
            if (r5 < 0) goto L_0x0126
            int r0 = r13.A02
            int r0 = r0 - r5
            r13.A02 = r0
            goto L_0x003a
        L_0x0126:
            r13.A02 = r6
            goto L_0x003a
        L_0x012a:
            android.media.AudioTrack r0 = r13.A0C
            int r5 = r0.write(r14, r9, r10)
            goto L_0x003a
        L_0x0132:
            r13.A0O = r14
            goto L_0x0014
        L_0x0136:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.A0A(java.nio.ByteBuffer, long):void");
    }

    public void AzT(C166527yp r15, int[] iArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C187058wN[] r7;
        C166527yp r6 = r15;
        if ("audio/raw".equals(r15.A0T)) {
            int i8 = r15.A0B;
            C161487pm.A03(C162387ry.A0C(i8));
            int i9 = r15.A06;
            i7 = C162387ry.A02(i8, i9);
            r7 = this.A0j;
            AnonymousClass6OS r2 = this.A0g;
            int i10 = r15.A07;
            int i11 = r15.A08;
            r2.A03 = i10;
            r2.A02 = i11;
            this.A0c.A01 = iArr;
            C157507iQ r4 = new C157507iQ(r15.A0F, i9, i8);
            int length = r7.length;
            int i12 = 0;
            while (i12 < length) {
                C187058wN r0 = r7[i12];
                try {
                    C157507iQ AzP = r0.AzP(r4);
                    if (r0.BGz()) {
                        r4 = AzP;
                    }
                    i12++;
                } catch (C143166yR e) {
                    throw new C143796zU(r15, (Throwable) e);
                }
            }
            i2 = r4.A02;
            i4 = r4.A03;
            int i13 = r4.A01;
            i3 = C162387ry.A00(i13);
            i5 = C162387ry.A02(i2, i13);
            i6 = 0;
        } else {
            r7 = new C187058wN[0];
            i4 = r15.A0F;
            i5 = -1;
            Pair A022 = A02(r15, this.A0a);
            if (A022 != null) {
                i2 = C18280x3.A03(A022);
                i3 = C18290x4.A03(A022);
                i6 = 2;
                i7 = -1;
            } else {
                throw new C143796zU(r15, AnonymousClass000.A0P(r15, "Unable to configure passthrough for: ", AnonymousClass001.A0o()));
            }
        }
        if (i2 == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A19("Invalid output encoding (mode=", ") for: ", A0o, i6);
            throw new C143796zU(r15, AnonymousClass000.A0R(r15, A0o));
        } else if (i3 != 0) {
            AnonymousClass7UV r5 = new AnonymousClass7UV(r6, r7, i7, i6, i5, i4, i3, i2);
            if (this.A0C != null) {
                this.A0I = r5;
            } else {
                this.A0H = r5;
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18270x1.A19("Invalid output channel config (mode=", ") for: ", A0o2, i6);
            throw new C143796zU(r15, AnonymousClass000.A0R(r15, A0o2));
        }
    }

    public static int A00(int i) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        int i2 = 8;
        while (!AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i).setChannelMask(C162387ry.A00(i2)).build(), build)) {
            i2--;
            if (i2 <= 0) {
                return 0;
            }
        }
        return i2;
    }

    public final long A03() {
        AnonymousClass7UV r1 = this.A0H;
        if (r1.A04 == 0) {
            return this.A0B / ((long) r1.A05);
        }
        return this.A0A;
    }

    public final AnonymousClass7M3 A04() {
        AnonymousClass7M3 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        ArrayDeque arrayDeque = this.A0h;
        if (!arrayDeque.isEmpty()) {
            return (AnonymousClass7M3) arrayDeque.getLast();
        }
        return this.A0K;
    }

    public final void A05() {
        if (!this.A0V) {
            this.A0V = true;
            AnonymousClass7XR r4 = this.A0b;
            long A032 = A03();
            r4.A0J = r4.A00();
            r4.A0K = AnonymousClass6C8.A0L();
            r4.A06 = A032;
            this.A0C.stop();
            this.A02 = 0;
        }
    }

    public final void A06(long j) {
        C158477k2 r4;
        boolean z;
        if (this.A0W || !"audio/raw".equals(this.A0H.A07.A0T)) {
            r4 = C158477k2.A03;
        } else {
            C178048gs r1 = this.A0d;
            r4 = A04().A02;
            AnonymousClass866 r2 = ((AnonymousClass86C) r1).A01;
            float f = r4.A01;
            if (r2.A01 != f) {
                r2.A01 = f;
                r2.A0D = true;
            }
            float f2 = r4.A00;
            if (r2.A00 != f2) {
                r2.A00 = f2;
                r2.A0D = true;
            }
        }
        if (this.A0W || !"audio/raw".equals(this.A0H.A07.A0T)) {
            z = false;
        } else {
            C178048gs r12 = this.A0d;
            z = A04().A03;
            ((AnonymousClass86C) r12).A00.A05 = z;
        }
        this.A0h.add(new AnonymousClass7M3(r4, Math.max(0, j), (A03() * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A0H.A06), z));
        C187058wN[] r5 = this.A0H.A08;
        ArrayList A0s = AnonymousClass001.A0s();
        for (C187058wN r13 : r5) {
            if (r13.BGz()) {
                A0s.add(r13);
            } else {
                r13.flush();
            }
        }
        int size = A0s.size();
        this.A0X = (C187058wN[]) A0s.toArray(new C187058wN[size]);
        this.A0Y = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C187058wN[] r14 = this.A0X;
            if (i >= r14.length) {
                break;
            }
            C187058wN r0 = r14[i];
            r0.flush();
            this.A0Y[i] = r0.BAF();
            i++;
        }
        C186018uc r02 = this.A0F;
        if (r02 != null) {
            r02.Bbk(z);
        }
    }

    public final void A07(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0X.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0N;
                if (byteBuffer == null) {
                    byteBuffer = C187058wN.A00;
                }
            } else {
                byteBuffer = this.A0Y[i - 1];
            }
            if (i == length) {
                A0A(byteBuffer, j);
            } else {
                C187058wN r1 = this.A0X[i];
                if (i > this.A03) {
                    r1.Bi4(byteBuffer);
                }
                ByteBuffer BAF = r1.BAF();
                this.A0Y[i] = BAF;
                if (BAF.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    public final void A08(AudioTrack audioTrack) {
        AnonymousClass7WA r0 = this.A0L;
        if (r0 == null) {
            r0 = new AnonymousClass7WA(this);
            this.A0L = r0;
        }
        r0.A00(audioTrack);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0O != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B() {
        /*
            r9 = this;
            int r8 = r9.A03
            r7 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto L_0x002c
            r9.A03 = r6
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.8wN[] r3 = r9.A0X
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.Bi3()
        L_0x001c:
            r9.A07(r1)
            boolean r0 = r0.BHW()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A03
            int r8 = r0 + 1
            r9.A03 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0O
            if (r0 == 0) goto L_0x003a
            r9.A0A(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0O
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r6
        L_0x003a:
            r9.A03 = r5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.A0B():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r17 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r17 != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c3, code lost:
        if (r17 == false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B6X(boolean r22) {
        /*
            r21 = this;
            r14 = r21
            android.media.AudioTrack r0 = r14.A0C
            if (r0 == 0) goto L_0x0338
            boolean r0 = r14.A0T
            if (r0 != 0) goto L_0x0338
            X.7XR r9 = r14.A0b
            android.media.AudioTrack r0 = r9.A0L
            r0.getClass()
            int r0 = r0.getPlayState()
            r13 = 3
            if (r0 != r13) goto L_0x01bb
            long r0 = r9.A00()
            long r11 = A01(r9, r0)
            r2 = 0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x01bb
            long r0 = java.lang.System.nanoTime()
            long r6 = X.C18290x4.A0B(r0)
            long r0 = r9.A09
            long r15 = r6 - r0
            r4 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0060
            long[] r8 = r9.A0U
            int r4 = r9.A02
            long r0 = r11 - r6
            r8[r4] = r0
            int r1 = r4 + 1
            r0 = 10
            int r1 = r1 % r0
            r9.A02 = r1
            int r5 = r9.A04
            if (r5 >= r0) goto L_0x004f
            int r5 = r5 + 1
            r9.A04 = r5
        L_0x004f:
            r9.A09 = r6
            r9.A0I = r2
            r4 = 0
        L_0x0054:
            if (r4 >= r5) goto L_0x0060
            r15 = r8[r4]
            long r0 = (long) r5
            long r15 = r15 / r0
            long r2 = r2 + r15
            r9.A0I = r2
            int r4 = r4 + 1
            goto L_0x0054
        L_0x0060:
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x01bb
            X.7U3 r8 = r9.A0M
            r8.getClass()
            X.7Nb r10 = r8.A05
            long r0 = r8.A03
            long r3 = r6 - r0
            long r0 = r8.A04
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00ae
            r8.A03 = r6
            android.media.AudioTrack r0 = r10.A04
            android.media.AudioTimestamp r4 = r10.A03
            boolean r17 = r0.getTimestamp(r4)
            if (r17 == 0) goto L_0x009a
            long r2 = r4.framePosition
            long r0 = r10.A01
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0090
            long r0 = r10.A02
            r15 = 1
            long r0 = r0 + r15
            r10.A02 = r0
        L_0x0090:
            r10.A01 = r2
            long r0 = r10.A02
            r5 = 32
            long r0 = r0 << r5
            long r2 = r2 + r0
            r10.A00 = r2
        L_0x009a:
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L_0x00c6
            r5 = 2
            if (r0 == r2) goto L_0x00dc
            if (r0 == r5) goto L_0x00c3
            if (r0 != r13) goto L_0x00ac
            if (r17 == 0) goto L_0x00ae
        L_0x00a8:
            r0 = 0
            r8.A00(r0)
        L_0x00ac:
            if (r17 != 0) goto L_0x00e9
        L_0x00ae:
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x01bb
            java.lang.reflect.Method r5 = r9.A0N
            if (r5 == 0) goto L_0x01bb
            long r0 = r9.A08
            long r3 = r6 - r0
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01bb
            goto L_0x017b
        L_0x00c3:
            if (r17 != 0) goto L_0x00e9
            goto L_0x00a8
        L_0x00c6:
            if (r17 == 0) goto L_0x016b
            long r0 = r4.nanoTime
            long r15 = X.C18290x4.A0B(r0)
            long r0 = r8.A02
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x00ae
            long r0 = r10.A00
            r8.A01 = r0
            r8.A00(r2)
            goto L_0x00e9
        L_0x00dc:
            if (r17 == 0) goto L_0x00a8
            long r2 = r10.A00
            long r0 = r8.A01
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x00e9
            r8.A00(r5)
        L_0x00e9:
            long r0 = r4.nanoTime
            long r4 = X.C18290x4.A0B(r0)
            long r2 = r10.A00
            long r15 = X.AnonymousClass6C9.A0N(r4, r6)
            r17 = 5000000(0x4c4b40, double:2.470328E-317)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            X.8gr r1 = r9.A0T
            X.86B r1 = (X.AnonymousClass86B) r1
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Spurious audio timestamp (system clock mismatch): "
        L_0x0106:
            r10.append(r0)
            r10.append(r2)
            java.lang.String r13 = ", "
            r10.append(r13)
            r10.append(r4)
            r10.append(r13)
            r10.append(r6)
            r10.append(r13)
            r10.append(r11)
            r10.append(r13)
            X.86A r4 = r1.A00
            X.7UV r2 = r4.A0H
            int r0 = r2.A04
            if (r0 != 0) goto L_0x014a
            long r0 = r4.A09
            int r2 = r2.A01
            long r2 = (long) r2
            long r0 = r0 / r2
        L_0x0131:
            r10.append(r0)
            r10.append(r13)
            long r0 = r4.A03()
            java.lang.String r1 = X.AnonymousClass001.A0k(r10, r0)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
            r0 = 4
        L_0x0145:
            r8.A00(r0)
            goto L_0x00ae
        L_0x014a:
            long r0 = r4.A08
            goto L_0x0131
        L_0x014d:
            long r0 = A01(r9, r2)
            long r15 = X.AnonymousClass6C9.A0N(r0, r11)
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            X.8gr r1 = r9.A0T
            X.86B r1 = (X.AnonymousClass86B) r1
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Spurious audio timestamp (frame position mismatch): "
            goto L_0x0106
        L_0x0164:
            int r1 = r8.A00
            r0 = 4
            if (r1 != r0) goto L_0x00ae
            r0 = 0
            goto L_0x0145
        L_0x016b:
            long r0 = r8.A02
            long r3 = r6 - r0
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            r8.A00(r13)
            goto L_0x00ae
        L_0x017b:
            android.media.AudioTrack r1 = r9.A0L     // Catch:{ Exception -> 0x01b6 }
            r1.getClass()     // Catch:{ Exception -> 0x01b6 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0U()     // Catch:{ Exception -> 0x01b6 }
            java.lang.Object r0 = r5.invoke(r1, r0)     // Catch:{ Exception -> 0x01b6 }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ Exception -> 0x01b6 }
            long r0 = X.C18290x4.A0A(r0)     // Catch:{ Exception -> 0x01b6 }
            long r2 = r9.A05     // Catch:{ Exception -> 0x01b6 }
            long r0 = r0 - r2
            r9.A0D = r0     // Catch:{ Exception -> 0x01b6 }
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ Exception -> 0x01b6 }
            r9.A0D = r0     // Catch:{ Exception -> 0x01b6 }
            r10 = 5000000(0x4c4b40, double:2.470328E-317)
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b9
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r4 = "Ignoring impossibly large audio latency: "
            java.lang.String r1 = X.AnonymousClass000.A0Z(r4, r5, r0)     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x01b6 }
            r9.A0D = r2     // Catch:{ Exception -> 0x01b6 }
            goto L_0x01b9
        L_0x01b6:
            r0 = 0
            r9.A0N = r0
        L_0x01b9:
            r9.A08 = r6
        L_0x01bb:
            long r6 = java.lang.System.nanoTime()
            r19 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r19
            X.7U3 r2 = r9.A0M
            r2.getClass()
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x028e
            r8 = 1
            X.7Nb r2 = r2.A05
            long r0 = r2.A00
            long r4 = A01(r9, r0)
            android.media.AudioTimestamp r0 = r2.A03
            long r2 = r0.nanoTime
            long r2 = r2 / r19
            long r0 = r6 - r2
            float r10 = r9.A00
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x01ed
            double r2 = (double) r0
            double r0 = (double) r10
            double r2 = r2 * r0
            long r0 = java.lang.Math.round(r2)
        L_0x01ed:
            long r4 = r4 + r0
        L_0x01ee:
            boolean r0 = r9.A0Q
            if (r0 == r8) goto L_0x01fa
            long r0 = r9.A0C
            r9.A0G = r0
            long r0 = r9.A0A
            r9.A0F = r0
        L_0x01fa:
            long r0 = r9.A0G
            long r10 = r6 - r0
            r17 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0223
            long r2 = r9.A0F
            float r12 = r9.A00
            r15 = r10
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0217
            double r0 = (double) r10
            double r12 = (double) r12
            double r0 = r0 * r12
            long r15 = java.lang.Math.round(r0)
        L_0x0217:
            long r2 = r2 + r15
            long r10 = r10 * r19
            long r10 = r10 / r17
            long r4 = r4 * r10
            long r0 = r19 - r10
            long r0 = r0 * r2
            long r4 = r4 + r0
            long r4 = r4 / r19
        L_0x0223:
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x025b
            long r0 = r9.A0A
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x025b
            r2 = 1
            r9.A0S = r2
            long r2 = r4 - r0
            long r2 = X.C161207pD.A01(r2)
            float r10 = r9.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0245
            double r0 = (double) r2
            double r2 = (double) r10
            double r0 = r0 / r2
            long r2 = java.lang.Math.round(r0)
        L_0x0245:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = X.C161207pD.A01(r2)
            long r0 = r0 - r2
            X.8gr r2 = r9.A0T
            X.86B r2 = (X.AnonymousClass86B) r2
            X.86A r2 = r2.A00
            X.8uc r2 = r2.A0F
            if (r2 == 0) goto L_0x025b
            r2.BYQ(r0)
        L_0x025b:
            r9.A0C = r6
            r9.A0A = r4
            r9.A0Q = r8
            X.7UV r0 = r14.A0H
            long r2 = r14.A03()
            long r2 = r2 * r17
            int r0 = r0.A06
            long r0 = (long) r0
            long r2 = r2 / r0
            long r7 = java.lang.Math.min(r4, r2)
        L_0x0271:
            java.util.ArrayDeque r3 = r14.A0h
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02a9
            java.lang.Object r0 = r3.getFirst()
            X.7M3 r0 = (X.AnonymousClass7M3) r0
            long r1 = r0.A00
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02a9
            java.lang.Object r0 = r3.remove()
            X.7M3 r0 = (X.AnonymousClass7M3) r0
            r14.A0K = r0
            goto L_0x0271
        L_0x028e:
            r8 = 0
            int r0 = r9.A04
            if (r0 != 0) goto L_0x02a5
            long r0 = r9.A00()
            long r4 = A01(r9, r0)
        L_0x029b:
            if (r22 != 0) goto L_0x01ee
            long r0 = r9.A0D
            long r4 = X.AnonymousClass6C8.A0Q(r4, r0)
            goto L_0x01ee
        L_0x02a5:
            long r4 = r9.A0I
            long r4 = r4 + r6
            goto L_0x029b
        L_0x02a9:
            X.7M3 r2 = r14.A0K
            long r0 = r2.A00
            long r4 = r7 - r0
            X.7k2 r1 = r2.A02
            X.7k2 r0 = X.C158477k2.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02ce
            long r2 = r2.A01
        L_0x02bb:
            long r2 = r2 + r4
        L_0x02bc:
            X.7UV r1 = r14.A0H
            X.8gs r0 = r14.A0d
            X.86C r0 = (X.AnonymousClass86C) r0
            X.6OT r0 = r0.A00
            long r4 = r0.A04
            long r4 = r4 * r17
            int r0 = r1.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 + r4
            return r2
        L_0x02ce:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0318
            X.8gs r0 = r14.A0d
            X.86C r0 = (X.AnonymousClass86C) r0
            X.866 r2 = r0.A01
            long r8 = r2.A03
            r6 = 1024(0x400, double:5.06E-321)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0311
            long r6 = r2.A02
            X.7b6 r0 = r2.A08
            r0.getClass()
            int r1 = r0.A00
            int r0 = r0.A0G
            int r1 = r1 * r0
            int r0 = r1 * 2
            long r0 = (long) r0
            long r6 = r6 - r0
            X.7iQ r0 = r2.A05
            int r1 = r0.A03
            X.7iQ r0 = r2.A04
            int r8 = r0.A03
            if (r1 != r8) goto L_0x030a
            long r2 = r2.A03
        L_0x02fe:
            r8 = r4
            r10 = r6
            r12 = r2
            long r4 = X.C162387ry.A05(r8, r10, r12)
        L_0x0305:
            X.7M3 r0 = r14.A0K
            long r2 = r0.A01
            goto L_0x02bb
        L_0x030a:
            long r0 = (long) r1
            long r6 = r6 * r0
            long r2 = r2.A03
            long r0 = (long) r8
            long r2 = r2 * r0
            goto L_0x02fe
        L_0x0311:
            float r0 = r2.A01
            double r2 = (double) r0
            double r0 = (double) r4
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x0305
        L_0x0318:
            java.lang.Object r6 = r3.getFirst()
            X.7M3 r6 = (X.AnonymousClass7M3) r6
            long r4 = r6.A00
            long r4 = r4 - r7
            X.7M3 r0 = r14.A0K
            X.7k2 r0 = r0.A02
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0334
            double r2 = (double) r4
            double r0 = (double) r1
            double r2 = r2 * r0
            long r4 = java.lang.Math.round(r2)
        L_0x0334:
            long r2 = r6.A01
            long r2 = r2 - r4
            goto L_0x02bc
        L_0x0338:
            r2 = -9223372036854775808
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.B6X(boolean):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int B7p(X.C166527yp r5) {
        /*
            r4 = this;
            java.lang.String r1 = r5.A0T
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            r3 = 0
            r1 = 2
            if (r0 == 0) goto L_0x0028
            int r2 = r5.A0B
            boolean r0 = X.C162387ry.A0C(r2)
            if (r0 != 0) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.String r1 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.String r0 = "DefaultAudioSink"
            android.util.Log.w(r0, r1)
        L_0x0023:
            return r3
        L_0x0024:
            if (r2 == r1) goto L_0x0030
            r0 = 1
            return r0
        L_0x0028:
            X.7no r0 = r4.A0a
            android.util.Pair r0 = A02(r5, r0)
            if (r0 == 0) goto L_0x0023
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.B7p(X.7yp):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0304, code lost:
        if (r8 == 11) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x030c, code lost:
        if (r8 != 11) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0311, code lost:
        if (r8 != 8) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r6 == r1) goto L_0x000e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0174 */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BEu(java.nio.ByteBuffer r21, int r22, long r23) {
        /*
            r20 = this;
            r2 = r20
            java.nio.ByteBuffer r1 = r2.A0N
            r5 = 1
            r18 = 0
            r6 = r21
            if (r1 == 0) goto L_0x000e
            r0 = 0
            if (r6 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C161487pm.A03(r0)
            X.7UV r3 = r2.A0I
            r19 = 0
            r0 = r23
            if (r3 == 0) goto L_0x006d
            boolean r3 = r2.A0B()
            if (r3 == 0) goto L_0x04f2
            X.7UV r7 = r2.A0I
            X.7UV r8 = r2.A0H
            int r4 = r8.A04
            int r3 = r7.A04
            if (r4 != r3) goto L_0x0072
            int r4 = r8.A03
            int r3 = r7.A03
            if (r4 != r3) goto L_0x0072
            int r4 = r8.A06
            int r3 = r7.A06
            if (r4 != r3) goto L_0x0072
            int r4 = r8.A02
            int r3 = r7.A02
            if (r4 != r3) goto L_0x0072
            int r4 = r8.A05
            int r3 = r7.A05
            if (r4 != r3) goto L_0x0072
            r2.A0H = r7
            r3 = r19
            r2.A0I = r3
            android.media.AudioTrack r7 = r2.A0C
            int r4 = X.C162387ry.A01
            r3 = 29
            if (r4 < r3) goto L_0x006a
            boolean r3 = r7.isOffloadedPlayback()
            if (r3 == 0) goto L_0x006a
            android.media.AudioTrack r3 = r2.A0C
            r3.setOffloadEndOfStream()
            android.media.AudioTrack r7 = r2.A0C
            X.7UV r3 = r2.A0H
            X.7yp r3 = r3.A07
            int r4 = r3.A07
            int r3 = r3.A08
            r7.setOffloadDelayPadding(r4, r3)
            r2.A0R = r5
        L_0x006a:
            r2.A06(r0)
        L_0x006d:
            android.media.AudioTrack r3 = r2.A0C
            if (r3 != 0) goto L_0x01bd
            goto L_0x007f
        L_0x0072:
            r2.A05()
            boolean r3 = r2.BFP()
            if (r3 != 0) goto L_0x04f2
            r2.flush()
            goto L_0x006a
        L_0x007f:
            android.os.ConditionVariable r3 = r2.A0Z     // Catch:{ 6z7 -> 0x01b1 }
            r3.block()     // Catch:{ 6z7 -> 0x01b1 }
            X.7UV r7 = r2.A0H     // Catch:{ 6z7 -> 0x01a8 }
            r7.getClass()     // Catch:{ 6z7 -> 0x01a8 }
            boolean r9 = r2.A0W     // Catch:{ 6z7 -> 0x01a8 }
            X.7jx r4 = r2.A0E     // Catch:{ 6z7 -> 0x01a8 }
            int r10 = r2.A01     // Catch:{ 6z7 -> 0x01a8 }
            int r8 = X.C162387ry.A01     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            r3 = 29
            if (r8 < r3) goto L_0x009a
            android.media.AudioTrack r4 = r7.A00(r4, r10, r9)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            goto L_0x00cf
        L_0x009a:
            if (r9 == 0) goto L_0x00b5
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            r4.<init>()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            r3 = 3
            android.media.AudioAttributes$Builder r4 = r4.setContentType(r3)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            r3 = 16
            android.media.AudioAttributes$Builder r3 = r4.setFlags(r3)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            android.media.AudioAttributes r12 = r3.build()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            goto L_0x00b9
        L_0x00b5:
            android.media.AudioAttributes r12 = r4.A00()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
        L_0x00b9:
            int r9 = r7.A06     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            int r4 = r7.A02     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            int r3 = r7.A03     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            android.media.AudioFormat r13 = X.AnonymousClass6C8.A0U(r9, r4, r3)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            int r3 = r7.A00     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            android.media.AudioTrack r4 = new android.media.AudioTrack     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
            r11 = r4
            r14 = r3
            r15 = r5
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x018e }
        L_0x00cf:
            int r9 = r4.getState()     // Catch:{ 6z7 -> 0x01a8 }
            if (r9 != r5) goto L_0x0171
            r2.A0C = r4     // Catch:{ 6z7 -> 0x01b1 }
            r3 = 29
            if (r8 < r3) goto L_0x00f3
            boolean r3 = r4.isOffloadedPlayback()     // Catch:{ 6z7 -> 0x01b1 }
            if (r3 == 0) goto L_0x00f3
            android.media.AudioTrack r3 = r2.A0C     // Catch:{ 6z7 -> 0x01b1 }
            r2.A08(r3)     // Catch:{ 6z7 -> 0x01b1 }
            android.media.AudioTrack r7 = r2.A0C     // Catch:{ 6z7 -> 0x01b1 }
            X.7UV r3 = r2.A0H     // Catch:{ 6z7 -> 0x01b1 }
            X.7yp r3 = r3.A07     // Catch:{ 6z7 -> 0x01b1 }
            int r4 = r3.A07     // Catch:{ 6z7 -> 0x01b1 }
            int r3 = r3.A08     // Catch:{ 6z7 -> 0x01b1 }
            r7.setOffloadDelayPadding(r4, r3)     // Catch:{ 6z7 -> 0x01b1 }
        L_0x00f3:
            android.media.AudioTrack r3 = r2.A0C     // Catch:{ 6z7 -> 0x01b1 }
            int r3 = r3.getAudioSessionId()     // Catch:{ 6z7 -> 0x01b1 }
            r2.A01 = r3     // Catch:{ 6z7 -> 0x01b1 }
            X.7XR r11 = r2.A0b     // Catch:{ 6z7 -> 0x01b1 }
            android.media.AudioTrack r13 = r2.A0C     // Catch:{ 6z7 -> 0x01b1 }
            X.7UV r9 = r2.A0H     // Catch:{ 6z7 -> 0x01b1 }
            int r4 = r9.A04     // Catch:{ 6z7 -> 0x01b1 }
            r3 = 2
            boolean r12 = X.AnonymousClass000.A1U(r4, r3)
            int r7 = r9.A03     // Catch:{ 6z7 -> 0x01b1 }
            int r10 = r9.A05     // Catch:{ 6z7 -> 0x01b1 }
            int r4 = r9.A00     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0L = r13     // Catch:{ 6z7 -> 0x01b1 }
            r11.A01 = r4     // Catch:{ 6z7 -> 0x01b1 }
            X.7U3 r3 = new X.7U3     // Catch:{ 6z7 -> 0x01b1 }
            r3.<init>(r13)     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0M = r3     // Catch:{ 6z7 -> 0x01b1 }
            int r9 = r13.getSampleRate()     // Catch:{ 6z7 -> 0x01b1 }
            r11.A03 = r9     // Catch:{ 6z7 -> 0x01b1 }
            if (r12 == 0) goto L_0x012d
            r3 = 23
            if (r8 >= r3) goto L_0x012d
            r3 = 5
            if (r7 == r3) goto L_0x012b
            r3 = 6
            if (r7 != r3) goto L_0x012d
        L_0x012b:
            r3 = 1
            goto L_0x012e
        L_0x012d:
            r3 = 0
        L_0x012e:
            r11.A0R = r3     // Catch:{ 6z7 -> 0x01b1 }
            boolean r3 = X.C162387ry.A0C(r7)     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0P = r3     // Catch:{ 6z7 -> 0x01b1 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014b
        L_0x0144:
            int r4 = r4 / r10
            long r3 = X.AnonymousClass6CA.A0G(r4)     // Catch:{ 6z7 -> 0x01b1 }
            long r9 = (long) r9     // Catch:{ 6z7 -> 0x01b1 }
            long r3 = r3 / r9
        L_0x014b:
            r11.A05 = r3     // Catch:{ 6z7 -> 0x01b1 }
            r3 = 0
            r11.A0B = r3     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0H = r3     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0E = r3     // Catch:{ 6z7 -> 0x01b1 }
            r9 = r18
            r11.A0O = r9     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0K = r7     // Catch:{ 6z7 -> 0x01b1 }
            r11.A07 = r7     // Catch:{ 6z7 -> 0x01b1 }
            r11.A08 = r3     // Catch:{ 6z7 -> 0x01b1 }
            r11.A0D = r3     // Catch:{ 6z7 -> 0x01b1 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r11.A00 = r3     // Catch:{ 6z7 -> 0x01b1 }
            android.media.AudioTrack r4 = r2.A0C     // Catch:{ 6z7 -> 0x01b1 }
            if (r4 == 0) goto L_0x016e
            float r3 = r2.A00     // Catch:{ 6z7 -> 0x01b1 }
            r4.setVolume(r3)     // Catch:{ 6z7 -> 0x01b1 }
        L_0x016e:
            r2.A0T = r5     // Catch:{ 6z7 -> 0x01b1 }
            goto L_0x01bd
        L_0x0171:
            r4.release()     // Catch:{ Exception -> 0x0174 }
        L_0x0174:
            int r5 = r7.A06     // Catch:{ 6z7 -> 0x01a8 }
            int r4 = r7.A02     // Catch:{ 6z7 -> 0x01a8 }
            int r3 = r7.A00     // Catch:{ 6z7 -> 0x01a8 }
            X.7yp r1 = r7.A07     // Catch:{ 6z7 -> 0x01a8 }
            int r0 = r7.A04     // Catch:{ 6z7 -> 0x01a8 }
            boolean r13 = X.AnonymousClass6C9.A1M(r0)
            X.6z7 r6 = new X.6z7     // Catch:{ 6z7 -> 0x01a8 }
            r10 = r5
            r11 = r4
            r12 = r3
            r7 = r1
            r8 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 6z7 -> 0x01a8 }
            throw r6     // Catch:{ 6z7 -> 0x01a8 }
        L_0x018e:
            r9 = move-exception
            int r4 = r7.A06     // Catch:{ 6z7 -> 0x01a8 }
            int r3 = r7.A02     // Catch:{ 6z7 -> 0x01a8 }
            int r1 = r7.A00     // Catch:{ 6z7 -> 0x01a8 }
            X.7yp r8 = r7.A07     // Catch:{ 6z7 -> 0x01a8 }
            int r0 = r7.A04     // Catch:{ 6z7 -> 0x01a8 }
            boolean r14 = X.AnonymousClass6C9.A1M(r0)
            X.6z7 r7 = new X.6z7     // Catch:{ 6z7 -> 0x01a8 }
            r10 = r18
            r11 = r4
            r12 = r3
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 6z7 -> 0x01a8 }
            throw r7     // Catch:{ 6z7 -> 0x01a8 }
        L_0x01a8:
            r1 = move-exception
            X.8uc r0 = r2.A0F     // Catch:{ 6z7 -> 0x01b1 }
            if (r0 == 0) goto L_0x01b0
            r0.BMt(r1)     // Catch:{ 6z7 -> 0x01b1 }
        L_0x01b0:
            throw r1     // Catch:{ 6z7 -> 0x01b1 }
        L_0x01b1:
            r1 = move-exception
            boolean r0 = r1.isRecoverable
            if (r0 != 0) goto L_0x01bc
            X.7S4 r0 = r2.A0e
            r0.A00(r1)
            return r18
        L_0x01bc:
            throw r1
        L_0x01bd:
            X.7S4 r4 = r2.A0e
            r3 = r19
            r4.A01 = r3
            boolean r3 = r2.A0T
            r10 = 0
            if (r3 == 0) goto L_0x01f3
            long r3 = java.lang.Math.max(r10, r0)
            r2.A07 = r3
            r3 = r18
            r2.A0U = r3
            r2.A0T = r3
            r2.A06(r0)
            boolean r3 = r2.A0S
            if (r3 == 0) goto L_0x01f3
            r2.A0S = r5
            android.media.AudioTrack r3 = r2.A0C
            if (r3 == 0) goto L_0x01f3
            X.7XR r3 = r2.A0b
            X.7U3 r4 = r3.A0M
            r4.getClass()
            r3 = r18
            r4.A00(r3)
            android.media.AudioTrack r3 = r2.A0C
            r3.play()
        L_0x01f3:
            X.7XR r9 = r2.A0b
            long r3 = r2.A03()
            android.media.AudioTrack r7 = r9.A0L
            r7.getClass()
            int r8 = r7.getPlayState()
            boolean r7 = r9.A0R
            if (r7 == 0) goto L_0x0219
            r7 = 2
            if (r8 != r7) goto L_0x020e
            r0 = r18
            r9.A0O = r0
            return r18
        L_0x020e:
            if (r8 != r5) goto L_0x0219
            long r12 = r9.A00()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0219
            return r18
        L_0x0219:
            boolean r7 = r9.A0O
            boolean r3 = r9.A01(r3)
            r9.A0O = r3
            if (r7 == 0) goto L_0x0246
            if (r3 != 0) goto L_0x0246
            if (r8 == r5) goto L_0x0246
            X.8gr r8 = r9.A0T
            int r7 = r9.A01
            long r3 = r9.A05
            long r14 = X.C161207pD.A01(r3)
            X.86B r8 = (X.AnonymousClass86B) r8
            X.86A r3 = r8.A00
            X.8uc r8 = r3.A0F
            if (r8 == 0) goto L_0x0246
            long r16 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3.A06
            long r16 = r16 - r3
            r13 = r7
            r12 = r8
            r12.Ber(r13, r14, r16)
        L_0x0246:
            java.nio.ByteBuffer r3 = r2.A0N
            java.lang.String r17 = "DefaultAudioSink"
            if (r3 != 0) goto L_0x04a6
            java.nio.ByteOrder r4 = r6.order()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            boolean r3 = X.AnonymousClass000.A1Y(r4, r3)
            X.C161487pm.A03(r3)
            boolean r3 = r6.hasRemaining()
            if (r3 == 0) goto L_0x04f1
            X.7UV r4 = r2.A0H
            int r3 = r4.A04
            if (r3 == 0) goto L_0x0416
            int r3 = r2.A04
            if (r3 != 0) goto L_0x0416
            int r3 = r4.A03
            r15 = 1024(0x400, float:1.435E-42)
            r7 = -1
            switch(r3) {
                case 5: goto L_0x0317;
                case 6: goto L_0x0317;
                case 7: goto L_0x0353;
                case 8: goto L_0x0353;
                case 9: goto L_0x03ac;
                case 10: goto L_0x0411;
                case 11: goto L_0x03bf;
                case 12: goto L_0x03bf;
                case 13: goto L_0x0271;
                case 14: goto L_0x03c2;
                case 15: goto L_0x040f;
                case 16: goto L_0x0411;
                case 17: goto L_0x027c;
                case 18: goto L_0x0317;
                default: goto L_0x0271;
            }
        L_0x0271:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r3)
            throw r0
        L_0x027c:
            r7 = 16
            byte[] r4 = new byte[r7]
            int r3 = r6.position()
            r6.get(r4)
            r6.position(r3)
            X.7oL r15 = new X.7oL
            r15.<init>(r4, r7)
            r15.A04(r7)
            int r4 = r15.A04(r7)
            r3 = 65535(0xffff, float:9.1834E-41)
            r14 = 4
            if (r4 != r3) goto L_0x02a1
            r3 = 24
            r15.A04(r3)
        L_0x02a1:
            r13 = 2
            int r3 = r15.A04(r13)
            r12 = 3
            if (r3 != r12) goto L_0x02b2
        L_0x02a9:
            r15.A04(r13)
            boolean r3 = r15.A0D()
            if (r3 != 0) goto L_0x02a9
        L_0x02b2:
            r3 = 10
            int r16 = r15.A04(r3)
            boolean r3 = r15.A0D()
            if (r3 == 0) goto L_0x02c7
            int r3 = r15.A04(r12)
            if (r3 <= 0) goto L_0x02c7
            r15.A09(r13)
        L_0x02c7:
            boolean r8 = r15.A0D()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r4 = 44100(0xac44, float:6.1797E-41)
            r3 = 44100(0xac44, float:6.1797E-41)
            if (r8 == 0) goto L_0x02d9
            r3 = 48000(0xbb80, float:6.7262E-41)
        L_0x02d9:
            int r8 = r15.A04(r14)
            if (r3 != r4) goto L_0x02e9
            r3 = 13
            if (r8 != r3) goto L_0x0314
            int[] r3 = X.C159607mA.A00
            r15 = r3[r8]
            goto L_0x0411
        L_0x02e9:
            if (r3 != r7) goto L_0x0314
            int[] r4 = X.C159607mA.A00
            int r3 = r4.length
            if (r8 >= r3) goto L_0x0314
            r15 = r4[r8]
            int r7 = r16 % 5
            r4 = 8
            if (r7 == r5) goto L_0x030f
            r3 = 11
            if (r7 == r13) goto L_0x030a
            if (r7 == r12) goto L_0x030f
            if (r7 != r14) goto L_0x0411
            if (r8 == r12) goto L_0x0306
            if (r8 == r4) goto L_0x0306
            if (r8 != r3) goto L_0x0411
        L_0x0306:
            int r15 = r15 + 1
            goto L_0x0411
        L_0x030a:
            if (r8 == r4) goto L_0x0306
            if (r8 != r3) goto L_0x0411
            goto L_0x0306
        L_0x030f:
            if (r8 == r12) goto L_0x0306
            if (r8 != r4) goto L_0x0411
            goto L_0x0306
        L_0x0314:
            r15 = 0
            goto L_0x0411
        L_0x0317:
            int r3 = r6.position()
            int r3 = r3 + 5
            byte r3 = r6.get(r3)
            r7 = r3 & 248(0xf8, float:3.48E-43)
            r4 = 3
            int r7 = r7 >> r4
            r3 = 10
            if (r7 <= r3) goto L_0x034f
            int r3 = r6.position()
            int r3 = r3 + 4
            byte r3 = r6.get(r3)
            r3 = r3 & 192(0xc0, float:2.69E-43)
            int r3 = r3 >> 6
            if (r3 == r4) goto L_0x0347
            int r3 = r6.position()
            int r3 = r3 + 4
            byte r3 = r6.get(r3)
            r3 = r3 & 48
            int r4 = r3 >> 4
        L_0x0347:
            int[] r3 = X.C155627fD.A01
            r3 = r3[r4]
            int r15 = r3 * 256
            goto L_0x0411
        L_0x034f:
            r15 = 1536(0x600, float:2.152E-42)
            goto L_0x0411
        L_0x0353:
            int r4 = r6.position()
            byte r8 = r6.get(r4)
            r3 = -2
            if (r8 == r3) goto L_0x039f
            if (r8 == r7) goto L_0x037f
            r3 = 31
            if (r8 == r3) goto L_0x038c
            int r3 = r4 + 4
            byte r3 = r6.get(r3)
            r3 = r3 & 1
            int r7 = r3 << 6
            int r3 = r4 + 5
        L_0x0370:
            byte r3 = r6.get(r3)
            r3 = r3 & 252(0xfc, float:3.53E-43)
        L_0x0376:
            int r3 = r3 >> 2
            r3 = r3 | r7
            int r3 = r3 + 1
            int r15 = r3 * 32
            goto L_0x0411
        L_0x037f:
            int r3 = r4 + 4
            byte r3 = r6.get(r3)
            r3 = r3 & 7
            int r7 = r3 << 4
            int r3 = r4 + 7
            goto L_0x0398
        L_0x038c:
            int r3 = r4 + 5
            byte r3 = r6.get(r3)
            r3 = r3 & 7
            int r7 = r3 << 4
            int r3 = r4 + 6
        L_0x0398:
            byte r3 = r6.get(r3)
            r3 = r3 & 60
            goto L_0x0376
        L_0x039f:
            int r3 = r4 + 5
            byte r3 = r6.get(r3)
            r3 = r3 & 1
            int r7 = r3 << 6
            int r3 = r4 + 4
            goto L_0x0370
        L_0x03ac:
            int r3 = r6.position()
            int r3 = X.AnonymousClass6C9.A0D(r6, r3)
            int r15 = X.C159937mi.A01(r3)
            if (r15 != r7) goto L_0x0411
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x03bf:
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0411
        L_0x03c2:
            int r13 = r6.position()
            int r3 = r6.limit()
            int r12 = r3 + -10
            r8 = r13
        L_0x03cd:
            if (r8 > r12) goto L_0x040d
            int r3 = r8 + 4
            int r3 = X.AnonymousClass6C9.A0D(r6, r3)
            r4 = r3 & -2
            r3 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r4 != r3) goto L_0x040a
            int r8 = r8 - r13
            if (r8 == r7) goto L_0x040d
            int r3 = r6.position()
            int r3 = r3 + r8
            int r3 = r3 + 7
            int r4 = X.AnonymousClass6CA.A08(r6, r3)
            r3 = 187(0xbb, float:2.62E-43)
            boolean r7 = X.AnonymousClass000.A1U(r4, r3)
            int r4 = r6.position()
            int r4 = r4 + r8
            r3 = 8
            if (r7 == 0) goto L_0x03fb
            r3 = 9
        L_0x03fb:
            int r4 = r4 + r3
            byte r3 = r6.get(r4)
            int r3 = r3 >> 4
            r4 = r3 & 7
            r3 = 40
            int r3 = r3 << r4
            int r15 = r3 * 16
            goto L_0x0411
        L_0x040a:
            int r8 = r8 + 1
            goto L_0x03cd
        L_0x040d:
            r15 = 0
            goto L_0x0411
        L_0x040f:
            r15 = 512(0x200, float:7.175E-43)
        L_0x0411:
            r2.A04 = r15
            if (r15 != 0) goto L_0x0416
            return r5
        L_0x0416:
            X.7M3 r3 = r2.A0J
            if (r3 == 0) goto L_0x0427
            boolean r3 = r2.A0B()
            if (r3 == 0) goto L_0x04f2
            r2.A06(r0)
            r3 = r19
            r2.A0J = r3
        L_0x0427:
            long r3 = r2.A07
            X.7UV r14 = r2.A0H
            int r7 = r14.A04
            if (r7 != 0) goto L_0x04c5
            long r7 = r2.A09
            int r12 = r14.A01
            long r12 = (long) r12
            long r7 = r7 / r12
        L_0x0435:
            X.6OS r12 = r2.A0g
            long r12 = r12.A04
            long r7 = r7 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r12
            X.7yp r12 = r14.A07
            int r12 = r12.A0F
            long r12 = (long) r12
            long r7 = r7 / r12
            long r3 = r3 + r7
            boolean r7 = r2.A0U
            if (r7 != 0) goto L_0x0471
            long r14 = X.AnonymousClass6C9.A0N(r3, r0)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0490
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "Discontinuity detected [expected "
            r12.append(r7)
            r12.append(r3)
            java.lang.String r7 = ", got "
            r12.append(r7)
            r12.append(r0)
            java.lang.String r8 = "]"
            r7 = r17
            X.AnonymousClass000.A1D(r8, r7, r12)
            r2.A0U = r5
        L_0x0471:
            boolean r7 = r2.A0B()
            if (r7 == 0) goto L_0x04f2
            long r7 = r23 - r3
            long r3 = r2.A07
            long r3 = r3 + r7
            r2.A07 = r3
            r3 = r18
            r2.A0U = r3
            r2.A06(r0)
            X.8uc r4 = r2.A0F
            if (r4 == 0) goto L_0x0490
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0490
            r4.BYR()
        L_0x0490:
            X.7UV r3 = r2.A0H
            int r3 = r3.A04
            r12 = r22
            if (r3 != 0) goto L_0x04ba
            long r3 = r2.A09
            int r7 = r6.remaining()
            long r7 = (long) r7
            long r3 = r3 + r7
            r2.A09 = r3
        L_0x04a2:
            r2.A0N = r6
            r2.A05 = r12
        L_0x04a6:
            r2.A07(r0)
            java.nio.ByteBuffer r0 = r2.A0N
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x04c9
            r0 = r19
            r2.A0N = r0
            r0 = r18
            r2.A05 = r0
            return r5
        L_0x04ba:
            long r3 = r2.A08
            int r7 = r2.A04
            int r7 = r7 * r22
            long r7 = (long) r7
            long r3 = r3 + r7
            r2.A08 = r3
            goto L_0x04a2
        L_0x04c5:
            long r7 = r2.A08
            goto L_0x0435
        L_0x04c9:
            long r12 = r2.A03()
            long r3 = r9.A07
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x04f2
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f2
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r3
            r3 = 200(0xc8, double:9.9E-322)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x04f2
            java.lang.String r1 = "Resetting stalled audio track"
            r0 = r17
            android.util.Log.w(r0, r1)
            r2.flush()
        L_0x04f1:
            return r5
        L_0x04f2:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86A.BEu(java.nio.ByteBuffer, int, long):boolean");
    }

    public boolean BFP() {
        if (this.A0C == null || !this.A0b.A01(A03())) {
            return false;
        }
        return true;
    }

    public void Bgu() {
        if (!this.A0Q && this.A0C != null && A0B()) {
            A05();
            this.A0Q = true;
        }
    }

    public void Bmy(C158477k2 r5) {
        A09(new C158477k2(AnonymousClass001.A01(r5.A01, 8.0f, 0.1f), AnonymousClass001.A01(r5.A00, 8.0f, 0.1f)), A04().A03);
    }

    public void flush() {
        if (this.A0C != null) {
            this.A09 = 0;
            this.A08 = 0;
            this.A0B = 0;
            this.A0A = 0;
            int i = 0;
            this.A0R = false;
            this.A04 = 0;
            this.A0K = new AnonymousClass7M3(A04().A02, 0, 0, A04().A03);
            this.A07 = 0;
            this.A0J = null;
            this.A0h.clear();
            this.A0N = null;
            this.A05 = 0;
            this.A0O = null;
            this.A0V = false;
            this.A0Q = false;
            this.A03 = -1;
            this.A0M = null;
            this.A02 = 0;
            this.A0g.A04 = 0;
            while (true) {
                C187058wN[] r1 = this.A0X;
                if (i >= r1.length) {
                    break;
                }
                C187058wN r0 = r1[i];
                r0.flush();
                this.A0Y[i] = r0.BAF();
                i++;
            }
            AnonymousClass7XR r3 = this.A0b;
            AudioTrack audioTrack = r3.A0L;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A0C.pause();
            }
            AudioTrack audioTrack2 = this.A0C;
            if (C162387ry.A01 >= 29 && audioTrack2.isOffloadedPlayback()) {
                AnonymousClass7WA r12 = this.A0L;
                r12.getClass();
                r12.A01(this.A0C);
            }
            AudioTrack audioTrack3 = this.A0C;
            this.A0C = null;
            AnonymousClass7UV r02 = this.A0I;
            if (r02 != null) {
                this.A0H = r02;
                this.A0I = null;
            }
            r3.A0I = 0;
            r3.A04 = 0;
            r3.A02 = 0;
            r3.A09 = 0;
            r3.A0C = 0;
            r3.A0G = 0;
            r3.A0S = false;
            r3.A0L = null;
            r3.A0M = null;
            this.A0Z.close();
            new C173758Ro(audioTrack3, this).start();
        }
        this.A0f.A01 = null;
        this.A0e.A01 = null;
    }

    public AnonymousClass86A(C160527no r8, C178048gs r9) {
        this.A0a = r8;
        this.A0d = r9;
        AnonymousClass6OR r4 = new AnonymousClass6OR();
        this.A0c = r4;
        AnonymousClass6OS r3 = new AnonymousClass6OS();
        this.A0g = r3;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass867[] r1 = new AnonymousClass867[3];
        r1[0] = new AnonymousClass6OQ();
        C18300x5.A1K(r4, r3, r1);
        Collections.addAll(A0s, r1);
        Collections.addAll(A0s, ((AnonymousClass86C) r9).A02);
        this.A0j = (C187058wN[]) A0s.toArray(new C187058wN[0]);
        this.A0i = new C187058wN[]{new AnonymousClass6OU()};
        this.A00 = 1.0f;
        this.A0E = C158427jx.A02;
        this.A01 = 0;
        this.A0G = new C151407Uq();
        C158477k2 r12 = C158477k2.A03;
        this.A0K = new AnonymousClass7M3(r12, 0, 0, false);
        this.A0D = r12;
        this.A03 = -1;
        this.A0X = new C187058wN[0];
        this.A0Y = new ByteBuffer[0];
        this.A0h = AnonymousClass6CA.A0a();
        this.A0e = new AnonymousClass7S4();
        this.A0f = new AnonymousClass7S4();
    }

    public static long A01(AnonymousClass7XR r2, long j) {
        return (j * SearchActionVerificationClientService.MS_TO_NS) / ((long) r2.A03);
    }

    public final void A09(C158477k2 r9, boolean z) {
        AnonymousClass7M3 A042 = A04();
        C158477k2 r2 = r9;
        boolean z2 = z;
        if (!r9.equals(A042.A02) || z != A042.A03) {
            AnonymousClass7M3 r1 = new AnonymousClass7M3(r2, -9223372036854775807L, -9223372036854775807L, z2);
            if (this.A0C != null) {
                this.A0J = r1;
            } else {
                this.A0K = r1;
            }
        }
    }

    public void reset() {
        flush();
        for (C187058wN reset : this.A0j) {
            reset.reset();
        }
        for (C187058wN reset2 : this.A0i) {
            reset2.reset();
        }
        this.A0S = false;
    }
}
