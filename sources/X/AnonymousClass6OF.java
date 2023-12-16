package X;

import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6OF  reason: invalid class name */
public abstract class AnonymousClass6OF extends AnonymousClass861 {
    public static final byte[] A10 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public MediaFormat A0F;
    public C143886zd A0G;
    public C166527yp A0H;
    public C166527yp A0I;
    public C166527yp A0J;
    public C150277Pz A0K;
    public C178058gt A0L;
    public C178058gt A0M;
    public AnonymousClass7JZ A0N;
    public C183878qo A0O;
    public C160687o8 A0P;
    public C143836zY A0Q;
    public ByteBuffer A0R;
    public ArrayDeque A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final float A0n;
    public final MediaCodec.BufferInfo A0o;
    public final C126496Oc A0p = new C126496Oc(0);
    public final C126496Oc A0q = new C126496Oc(2);
    public final C126496Oc A0r = new C126496Oc(0);
    public final C126486Ob A0s;
    public final C186638vh A0t;
    public final C186968wE A0u;
    public final AnonymousClass7MG A0v;
    public final ArrayList A0w;
    public final long[] A0x;
    public final long[] A0y;
    public final long[] A0z;

    public void A0A() {
        try {
            A0L();
            A0H();
        } finally {
            this.A0M = null;
        }
    }

    public void A0B() {
        this.A0I = null;
        this.A0E = -9223372036854775807L;
        this.A0D = -9223372036854775807L;
        this.A09 = 0;
        if (this.A0M == null && this.A0L == null) {
            A0V();
        } else {
            A0A();
        }
    }

    public void A0C(long j, boolean z) {
        int i;
        this.A0g = false;
        this.A0j = false;
        this.A0k = false;
        if (this.A0U) {
            this.A0s.clear();
            this.A0q.clear();
            this.A0V = false;
        } else if (A0V()) {
            A0O();
        }
        AnonymousClass7MG r2 = this.A0v;
        synchronized (r2) {
            i = r2.A01;
        }
        if (i > 0) {
            this.A0m = true;
        }
        synchronized (r2) {
            r2.A00 = 0;
            r2.A01 = 0;
            Arrays.fill(r2.A03, (Object) null);
        }
        int i2 = this.A09;
        if (i2 != 0) {
            this.A0D = this.A0x[i2 - 1];
            this.A0E = this.A0y[i2 - 1];
            this.A09 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (X.C162387ry.A01 >= 23) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (A0X() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cc, code lost:
        if (r8 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        if (A0W() == false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C151887Wr A0F(X.C147807Fu r16) {
        /*
            r15 = this;
            r4 = 1
            r15.A0m = r4
            r1 = r16
            X.7yp r11 = r1.A00
            r11.getClass()
            java.lang.String r0 = r11.A0T
            if (r0 == 0) goto L_0x011c
            X.8gt r2 = r1.A01
            r15.A0M = r2
            r15.A0I = r11
            boolean r1 = r15.A0U
            r0 = 0
            if (r1 == 0) goto L_0x001c
            r15.A0T = r4
            return r0
        L_0x001c:
            X.8qo r3 = r15.A0O
            if (r3 != 0) goto L_0x0026
            r15.A0S = r0
            r15.A0O()
            return r0
        L_0x0026:
            X.7o8 r5 = r15.A0P
            X.7yp r10 = r15.A0H
            X.8gt r0 = r15.A0L
            if (r0 != r2) goto L_0x00f8
            r8 = 0
            if (r2 == r0) goto L_0x0039
            r8 = 1
            int r2 = X.C162387ry.A01
            r1 = 23
            r0 = 0
            if (r2 < r1) goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            X.C161487pm.A04(r0)
            r7 = r15
            boolean r0 = r15 instanceof X.C126666Ov
            if (r0 == 0) goto L_0x00db
            X.6Ov r7 = (X.C126666Ov) r7
            X.7Wr r6 = r5.A02(r10, r11)
            int r14 = r6.A00
            int r1 = r11.A0I
            X.7Jl r2 = r7.A0L
            int r0 = r2.A02
            if (r1 > r0) goto L_0x0058
            int r1 = r11.A09
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x005a
        L_0x0058:
            r14 = r14 | 256(0x100, float:3.59E-43)
        L_0x005a:
            int r1 = X.C126666Ov.A00(r11, r5)
            X.7Jl r0 = r7.A0L
            int r0 = r0.A01
            if (r1 <= r0) goto L_0x0066
            r14 = r14 | 64
        L_0x0066:
            java.lang.String r12 = r5.A03
            if (r14 != 0) goto L_0x00f5
            int r13 = r6.A01
        L_0x006c:
            X.7Wr r9 = new X.7Wr
            r9.<init>(r10, r11, r12, r13, r14)
            int r0 = r9.A01
            r2 = 3
            if (r0 == 0) goto L_0x0118
            r1 = 2
            if (r0 == r4) goto L_0x0094
            if (r0 == r1) goto L_0x00ac
            if (r0 != r2) goto L_0x0113
            boolean r0 = r15.A0X()
            if (r0 != 0) goto L_0x00ca
        L_0x0083:
            r14 = 16
        L_0x0085:
            X.8qo r0 = r15.A0O
            if (r0 != r3) goto L_0x008d
            int r0 = r15.A04
            if (r0 != r2) goto L_0x011b
        L_0x008d:
            r13 = 0
        L_0x008e:
            X.7Wr r9 = new X.7Wr
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L_0x0094:
            boolean r0 = r15.A0X()
            if (r0 == 0) goto L_0x0083
            r15.A0H = r11
            if (r8 != 0) goto L_0x00ce
            boolean r0 = r15.A0d
            if (r0 == 0) goto L_0x00d9
            r15.A05 = r4
            boolean r0 = r15.A0Y
            if (r0 == 0) goto L_0x00d7
            r15.A04 = r2
        L_0x00aa:
            r14 = 2
            goto L_0x0085
        L_0x00ac:
            boolean r0 = r15.A0X()
            if (r0 == 0) goto L_0x0083
            r15.A0f = r4
            r15.A06 = r4
            int r0 = r15.A03
            if (r0 == r1) goto L_0x00c8
            if (r0 != r4) goto L_0x00d5
            int r1 = r11.A0I
            int r0 = r10.A0I
            if (r1 != r0) goto L_0x00d5
            int r1 = r11.A09
            int r0 = r10.A09
            if (r1 != r0) goto L_0x00d5
        L_0x00c8:
            r15.A0X = r4
        L_0x00ca:
            r15.A0H = r11
            if (r8 == 0) goto L_0x00d9
        L_0x00ce:
            boolean r0 = r15.A0W()
            if (r0 != 0) goto L_0x00d9
            goto L_0x00aa
        L_0x00d5:
            r4 = 0
            goto L_0x00c8
        L_0x00d7:
            r15.A04 = r4
        L_0x00d9:
            r14 = 0
            goto L_0x0085
        L_0x00db:
            X.6Ow r7 = (X.C126676Ow) r7
            X.7Wr r2 = r5.A02(r10, r11)
            int r14 = r2.A00
            int r1 = r7.A0a(r11, r5)
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x00ed
            r14 = r14 | 64
        L_0x00ed:
            java.lang.String r12 = r5.A03
            if (r14 != 0) goto L_0x00f5
            int r13 = r2.A01
            goto L_0x006c
        L_0x00f5:
            r13 = 0
            goto L_0x006c
        L_0x00f8:
            if (r2 == 0) goto L_0x0109
            if (r0 == 0) goto L_0x0109
            int r1 = X.C162387ry.A01
            r0 = 23
            if (r1 < r0) goto L_0x0109
            java.util.UUID r1 = X.C161207pD.A02
            java.util.UUID r0 = X.C161207pD.A03
            r1.equals(r0)
        L_0x0109:
            r15.A0M()
            java.lang.String r12 = r5.A03
            r13 = 0
            r14 = 128(0x80, float:1.794E-43)
            goto L_0x008e
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0118:
            r15.A0M()
        L_0x011b:
            return r9
        L_0x011c:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass6CA.A0N()
            r0 = 0
            X.6zd r0 = r15.A06(r11, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.A0F(X.7Fu):X.7Wr");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.7VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.7GH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.7VZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.7VZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H() {
        /*
            r6 = this;
            r5 = 0
            X.8qo r0 = r6.A0O     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0037
            X.87P r0 = (X.AnonymousClass87P) r0     // Catch:{ all -> 0x003f }
            android.media.MediaCodec r0 = r0.A00     // Catch:{ all -> 0x003f }
            r0.release()     // Catch:{ all -> 0x003f }
            X.7Pz r1 = r6.A0K     // Catch:{ all -> 0x003f }
            int r0 = r1.A01     // Catch:{ all -> 0x003f }
            int r0 = r0 + 1
            r1.A01 = r0     // Catch:{ all -> 0x003f }
            X.7o8 r0 = r6.A0P     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r0.A03     // Catch:{ all -> 0x003f }
            r1 = r6
            boolean r0 = r6 instanceof X.C126666Ov     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x002d
            X.6Ov r1 = (X.C126666Ov) r1     // Catch:{ all -> 0x003f }
            X.7GH r3 = r1.A0Y     // Catch:{ all -> 0x003f }
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x003f }
            r1 = 1
        L_0x0024:
            X.3bv r0 = new X.3bv     // Catch:{ all -> 0x003f }
            r0.<init>(r1, r4, r3)     // Catch:{ all -> 0x003f }
            r2.post(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x002d:
            X.6Ow r1 = (X.C126676Ow) r1     // Catch:{ all -> 0x003f }
            X.7VZ r3 = r1.A09     // Catch:{ all -> 0x003f }
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0037
            r1 = 0
            goto L_0x0024
        L_0x0037:
            r6.A0O = r5
            r6.A0L = r5
            r6.A0K()
            return
        L_0x003f:
            r0 = move-exception
            r6.A0O = r5
            r6.A0L = r5
            r6.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.A0H():void");
    }

    public void A0J() {
        this.A07 = -1;
        this.A0p.A01 = null;
        this.A08 = -1;
        this.A0R = null;
        this.A0A = -9223372036854775807L;
        this.A0e = false;
        this.A0d = false;
        this.A0X = false;
        this.A0l = false;
        this.A0h = false;
        this.A0i = false;
        this.A0w.clear();
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        AnonymousClass7JZ r2 = this.A0N;
        if (r2 != null) {
            r2.A01 = 0;
            r2.A00 = 0;
            r2.A02 = false;
        }
        this.A05 = 0;
        this.A04 = 0;
        this.A06 = this.A0f ? 1 : 0;
    }

    public final void A0L() {
        this.A0T = false;
        this.A0s.clear();
        this.A0q.clear();
        this.A0V = false;
        this.A0U = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if ("AXON 7 mini".equals(r5) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r1 < 24) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r4.A0A.B7p(X.C162387ry.A06(4, r7, r6)) != 2) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r2.setInteger("pcm-encoding", 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        ((X.AnonymousClass87P) r11).A00.configure(r2, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if ("audio/raw".equals(r12.A02) == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00eb, code lost:
        if ("audio/raw".equals(r10.A0T) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        r4.A02 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        if (r1 <= 28) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(android.media.MediaCrypto r9, X.C166527yp r10, X.C183878qo r11, X.C160687o8 r12, float r13) {
        /*
            r8 = this;
            r4 = r8
            X.6Ow r4 = (X.C126676Ow) r4
            r3 = 0
            X.7yp[] r7 = r4.A08
            r7.getClass()
            int r5 = r4.A0a(r10, r12)
            int r6 = r7.length
            r0 = 1
            if (r6 == r0) goto L_0x0029
            r2 = 0
        L_0x0012:
            if (r2 >= r6) goto L_0x0029
            r1 = r7[r2]
            X.7Wr r0 = r12.A02(r10, r1)
            int r0 = r0.A01
            if (r0 == 0) goto L_0x0026
            int r0 = r4.A0a(r1, r12)
            int r5 = java.lang.Math.max(r5, r0)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0029:
            r4.A00 = r5
            java.lang.String r2 = r12.A03
            int r1 = X.C162387ry.A01
            r0 = 24
            if (r1 >= r0) goto L_0x00fc
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = "samsung"
            java.lang.String r0 = X.C162387ry.A04
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = X.C162387ry.A02
            java.lang.String r0 = "zeroflte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "herolte"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "heroqlte"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00fc
        L_0x005f:
            r0 = 1
        L_0x0060:
            r4.A07 = r0
            java.lang.String r6 = r12.A01
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r0 = "mime"
            r2.setString(r0, r6)
            int r7 = r10.A06
            java.lang.String r0 = "channel-count"
            r2.setInteger(r0, r7)
            java.lang.String r0 = "sample-rate"
            int r6 = r10.A0F
            r2.setInteger(r0, r6)
            java.util.List r0 = r10.A0U
            X.AnonymousClass72C.A00(r2, r0)
            java.lang.String r0 = "max-input-size"
            X.AnonymousClass6C9.A0u(r2, r0, r5)
            r0 = 23
            if (r1 < r0) goto L_0x00ac
            java.lang.String r5 = "priority"
            r0 = 0
            r2.setInteger(r5, r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00f7
            r0 = 23
            if (r1 != r0) goto L_0x00f2
            java.lang.String r5 = X.C162387ry.A05
            java.lang.String r0 = "ZTE B2017G"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "AXON 7 mini"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00f2
        L_0x00ac:
            java.lang.String r5 = "audio/ac4"
            java.lang.String r0 = r10.A0T
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r5 = "ac4-is-sync"
            r0 = 1
            r2.setInteger(r5, r0)
        L_0x00bc:
            r0 = 24
            if (r1 < r0) goto L_0x00d3
        L_0x00c0:
            X.8vH r1 = r4.A0A
            r5 = 4
            X.7yp r0 = X.C162387ry.A06(r5, r7, r6)
            int r1 = r1.B7p(r0)
            r0 = 2
            if (r1 != r0) goto L_0x00d3
            java.lang.String r0 = "pcm-encoding"
            r2.setInteger(r0, r5)
        L_0x00d3:
            X.87P r11 = (X.AnonymousClass87P) r11
            r1 = 0
            android.media.MediaCodec r0 = r11.A00
            r0.configure(r2, r3, r3, r1)
            java.lang.String r0 = r12.A02
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r10.A0T
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f0
        L_0x00ed:
            r4.A02 = r10
            return
        L_0x00f0:
            r10 = r3
            goto L_0x00ed
        L_0x00f2:
            java.lang.String r0 = "operating-rate"
            r2.setFloat(r0, r13)
        L_0x00f7:
            r0 = 28
            if (r1 > r0) goto L_0x00c0
            goto L_0x00ac
        L_0x00fc:
            r0 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.A0S(android.media.MediaCrypto, X.7yp, X.8qo, X.7o8, float):void");
    }

    public boolean A0Y(C166527yp r6, C183878qo r7, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        C126676Ow r3 = (C126676Ow) this;
        byteBuffer.getClass();
        if (r3.A02 != null && (i2 & 2) != 0) {
            r7.getClass();
            ((AnonymousClass87P) r7).A00.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            if (r7 != null) {
                ((AnonymousClass87P) r7).A00.releaseOutputBuffer(i, false);
            }
            r3.A0K.A08 += i3;
            ((AnonymousClass86A) r3.A0A).A0U = true;
            return true;
        } else {
            try {
                if (!r3.A0A.BEu(byteBuffer, i3, j3)) {
                    return false;
                }
                if (r7 != null) {
                    ((AnonymousClass87P) r7).A00.releaseOutputBuffer(i, false);
                }
                r3.A0K.A06 += i3;
                return true;
            } catch (C143576z7 e) {
                throw r3.A06(e.format, e, e.isRecoverable);
            } catch (C143586z8 e2) {
                throw r3.A06(r6, e2, e2.isRecoverable);
            }
        }
    }

    private void A00() {
        int i = this.A04;
        if (i == 1) {
            A0N();
        } else if (i == 2) {
            A0N();
            A0P();
            throw AnonymousClass000.A0L();
        } else if (i != 3) {
            this.A0j = true;
            A0I();
        } else {
            A0H();
            A0O();
        }
    }

    public void A0D(boolean z, boolean z2) {
        this.A0K = new C150277Pz();
    }

    public float A0E(C166527yp[] r7, float f) {
        if (this instanceof C126666Ov) {
            float f2 = -1.0f;
            for (C166527yp r0 : r7) {
                float f3 = r0.A01;
                if (f3 != -1.0f) {
                    f2 = Math.max(f2, f3);
                }
            }
            if (f2 != -1.0f) {
                return f2 * f;
            }
            return -1.0f;
        }
        int i = -1;
        for (C166527yp r02 : r7) {
            int i2 = r02.A0F;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    public List A0G(C166527yp r6, C186968wE r7) {
        Object obj;
        if (this instanceof C126666Ov) {
            return C126666Ov.A02(r6, r7, false, ((C126666Ov) this).A0T);
        }
        C126676Ow r0 = (C126676Ow) this;
        String str = r6.A0T;
        if (str == null) {
            return Collections.emptyList();
        }
        if (((AnonymousClass86A) r0.A0A).B7p(r6) != 0) {
            List A022 = C162267rY.A02("audio/raw", false, false);
            if (!A022.isEmpty() && (obj = A022.get(0)) != null) {
                return Collections.singletonList(obj);
            }
        }
        ArrayList A0J2 = AnonymousClass002.A0J(r7.B6o(str, false, false));
        AnonymousClass91R.A00(new AnonymousClass87V(r6), A0J2, 6);
        if ("audio/eac3-joc".equals(str)) {
            A0J2 = AnonymousClass002.A0J(A0J2);
            A0J2.addAll(r7.B6o("audio/eac3", false, false));
        }
        return Collections.unmodifiableList(A0J2);
    }

    public void A0I() {
        if (this instanceof C126676Ow) {
            C126676Ow r3 = (C126676Ow) this;
            try {
                r3.A0A.Bgu();
            } catch (C143586z8 e) {
                throw r3.A06(e.format, e, e.isRecoverable);
            }
        }
    }

    public final void A0M() {
        if (this.A0d) {
            this.A05 = 1;
            this.A04 = 3;
            return;
        }
        A0H();
        A0O();
    }

    public final void A0N() {
        try {
            ((AnonymousClass87P) this.A0O).A00.flush();
        } finally {
            A0J();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        if ("OMX.google.aac.decoder".equals(r4) == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01db, code lost:
        if ("OMX.rk.video_decoder.avc".equals(r4) == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01eb, code lost:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r4) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a6, code lost:
        if ("c2.android.aac.decoder".equals(r4) == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b6, code lost:
        if ("OMX.google.vorbis.decoder".equals(r4) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bf A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01cf A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d0 A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e5 A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0220 A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x022c A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0241 A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x028e A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019f A[Catch:{ Exception -> 0x02af }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01af A[Catch:{ Exception -> 0x02af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O() {
        /*
            r21 = this;
            r0 = r21
            X.8qo r1 = r0.A0O
            if (r1 != 0) goto L_0x004d
            boolean r1 = r0.A0U
            if (r1 != 0) goto L_0x004d
            X.7yp r2 = r0.A0I
            if (r2 == 0) goto L_0x004d
            X.8gt r1 = r0.A0M
            if (r1 != 0) goto L_0x0055
            boolean r1 = r0 instanceof X.C126676Ow
            if (r1 == 0) goto L_0x0055
            r1 = r0
            X.6Ow r1 = (X.C126676Ow) r1
            X.8vH r1 = r1.A0A
            X.86A r1 = (X.AnonymousClass86A) r1
            int r1 = r1.B7p(r2)
            boolean r1 = X.AnonymousClass000.A1S(r1)
            if (r1 == 0) goto L_0x0055
            X.7yp r1 = r0.A0I
            r0.A0L()
            java.lang.String r2 = r1.A0T
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            r3 = 1
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004e
            X.6Ob r1 = r0.A0s
            r1.A00 = r3
        L_0x004b:
            r0.A0U = r3
        L_0x004d:
            return
        L_0x004e:
            X.6Ob r2 = r0.A0s
            r1 = 32
            r2.A00 = r1
            goto L_0x004b
        L_0x0055:
            X.8gt r2 = r0.A0M
            r0.A0L = r2
            if (r2 == 0) goto L_0x006b
            boolean r1 = X.AnonymousClass86I.A00
            if (r1 == 0) goto L_0x006b
            X.86E r2 = (X.AnonymousClass86E) r2
            X.6tl r3 = r2.A00
            X.7yp r2 = r0.A0I
            r1 = 0
            X.6zd r0 = r0.A06(r2, r3, r1)
            throw r0
        L_0x006b:
            r12 = 0
            r1 = 0
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 6zY -> 0x0332 }
            if (r2 != 0) goto L_0x0093
            X.8wE r3 = r0.A0u     // Catch:{ 6yS -> 0x0323 }
            X.7yp r2 = r0.A0I     // Catch:{ 6yS -> 0x0323 }
            java.util.List r4 = r0.A0G(r2, r3)     // Catch:{ 6yS -> 0x0323 }
            r4.isEmpty()     // Catch:{ 6yS -> 0x0323 }
            java.util.ArrayDeque r2 = X.AnonymousClass6CA.A0a()     // Catch:{ 6yS -> 0x0323 }
            r0.A0S = r2     // Catch:{ 6yS -> 0x0323 }
            boolean r2 = r4.isEmpty()     // Catch:{ 6yS -> 0x0323 }
            if (r2 != 0) goto L_0x0091
            java.util.ArrayDeque r3 = r0.A0S     // Catch:{ 6yS -> 0x0323 }
            java.lang.Object r2 = r4.get(r1)     // Catch:{ 6yS -> 0x0323 }
            r3.add(r2)     // Catch:{ 6yS -> 0x0323 }
        L_0x0091:
            r0.A0Q = r12     // Catch:{ 6yS -> 0x0323 }
        L_0x0093:
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 6zY -> 0x0332 }
            boolean r2 = r2.isEmpty()     // Catch:{ 6zY -> 0x0332 }
            if (r2 == 0) goto L_0x00a7
            X.7yp r3 = r0.A0I     // Catch:{ 6zY -> 0x0332 }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            X.6zY r5 = new X.6zY     // Catch:{ 6zY -> 0x0332 }
            r5.<init>(r3, r12, r2)     // Catch:{ 6zY -> 0x0332 }
            goto L_0x032e
        L_0x00a7:
            X.8qo r2 = r0.A0O     // Catch:{ 6zY -> 0x0332 }
            if (r2 != 0) goto L_0x032f
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 6zY -> 0x0332 }
            java.lang.Object r11 = r2.peekFirst()     // Catch:{ 6zY -> 0x0332 }
            X.7o8 r11 = (X.C160687o8) r11     // Catch:{ 6zY -> 0x0332 }
            boolean r5 = r0 instanceof X.C126666Ov     // Catch:{ 6zY -> 0x0332 }
            if (r5 == 0) goto L_0x00c4
            r3 = r0
            X.6Ov r3 = (X.C126666Ov) r3     // Catch:{ 6zY -> 0x0332 }
            android.view.Surface r2 = r3.A0K     // Catch:{ 6zY -> 0x0332 }
            if (r2 != 0) goto L_0x00c4
            boolean r2 = r3.A0h(r11)     // Catch:{ 6zY -> 0x0332 }
            if (r2 == 0) goto L_0x004d
        L_0x00c4:
            java.lang.String r4 = r11.A03     // Catch:{ Exception -> 0x02af }
            int r6 = X.C162387ry.A01     // Catch:{ Exception -> 0x02af }
            r2 = 23
            if (r6 >= r2) goto L_0x00cf
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00da
        L_0x00cf:
            float r3 = r0.A02     // Catch:{ Exception -> 0x02af }
            X.7yp[] r2 = r0.A08     // Catch:{ Exception -> 0x02af }
            r2.getClass()     // Catch:{ Exception -> 0x02af }
            float r3 = r0.A0E(r2, r3)     // Catch:{ Exception -> 0x02af }
        L_0x00da:
            float r2 = r0.A0n     // Catch:{ Exception -> 0x02af }
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00e2:
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02a7 }
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x02a7 }
            java.lang.String r2 = "createCodec:"
            java.lang.String r2 = X.AnonymousClass000.A0V(r2, r4, r7)     // Catch:{ Exception -> 0x02a7 }
            android.os.Trace.beginSection(r2)     // Catch:{ Exception -> 0x02a7 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r4)     // Catch:{ Exception -> 0x02a7 }
            X.87P r7 = new X.87P     // Catch:{ Exception -> 0x02a7 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x02a7 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "configureCodec"
            android.os.Trace.beginSection(r2)     // Catch:{ Exception -> 0x02a5 }
            X.7yp r2 = r0.A0I     // Catch:{ Exception -> 0x02a5 }
            r13 = r0
            r14 = r12
            r15 = r2
            r16 = r7
            r17 = r11
            r18 = r3
            r13.A0S(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02a5 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "startCodec"
            android.os.Trace.beginSection(r2)     // Catch:{ Exception -> 0x02a5 }
            android.media.MediaCodec r2 = r7.A00     // Catch:{ Exception -> 0x02a5 }
            r2.start()     // Catch:{ Exception -> 0x02a5 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x02a5 }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02a5 }
            r0.A0O = r7     // Catch:{ Exception -> 0x02af }
            r0.A0P = r11     // Catch:{ Exception -> 0x02af }
            r0.A00 = r3     // Catch:{ Exception -> 0x02af }
            X.7yp r2 = r0.A0I     // Catch:{ Exception -> 0x02af }
            r0.A0H = r2     // Catch:{ Exception -> 0x02af }
            r2 = 25
            if (r6 > r2) goto L_0x0198
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0160
            java.lang.String r3 = X.C162387ry.A05     // Catch:{ Exception -> 0x02af }
            java.lang.String r2 = "SM-T585"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = "SM-A510"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = "SM-A520"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = "SM-J700"
            boolean r2 = r3.startsWith(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0160
        L_0x015e:
            r2 = 2
            goto L_0x0199
        L_0x0160:
            r2 = 24
            if (r6 >= r2) goto L_0x0198
            java.lang.String r2 = "OMX.Nvidia.h264.decode"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0174
            java.lang.String r2 = "OMX.Nvidia.h264.decode.secure"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0198
        L_0x0174:
            java.lang.String r3 = X.C162387ry.A02     // Catch:{ Exception -> 0x02af }
            java.lang.String r2 = "flounder"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0196
            java.lang.String r2 = "flounder_lte"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0196
            java.lang.String r2 = "grouper"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0196
            java.lang.String r2 = "tilapia"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0198
        L_0x0196:
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            r0.A03 = r2     // Catch:{ Exception -> 0x02af }
            r2 = 29
            if (r6 != r2) goto L_0x01a8
            java.lang.String r2 = "c2.android.aac.decoder"
            boolean r3 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            r2 = 1
            if (r3 != 0) goto L_0x01a9
        L_0x01a8:
            r2 = 0
        L_0x01a9:
            r0.A0b = r2     // Catch:{ Exception -> 0x02af }
            r2 = 23
            if (r6 > r2) goto L_0x01b8
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r3 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            r2 = 1
            if (r3 != 0) goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            r0.A0Y = r2     // Catch:{ Exception -> 0x02af }
            r2 = 21
            if (r6 != r2) goto L_0x01c8
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r3 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            r2 = 1
            if (r3 != 0) goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            r0.A0Z = r2     // Catch:{ Exception -> 0x02af }
            r2 = 25
            if (r6 > r2) goto L_0x01d0
            goto L_0x01d5
        L_0x01d0:
            r2 = 29
            if (r6 > r2) goto L_0x01ed
            goto L_0x01dd
        L_0x01d5:
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0215
        L_0x01dd:
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0215
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 != 0) goto L_0x0215
        L_0x01ed:
            java.lang.String r3 = "Amazon"
            java.lang.String r2 = X.C162387ry.A04     // Catch:{ Exception -> 0x02af }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0206
            java.lang.String r3 = "AFTS"
            java.lang.String r2 = X.C162387ry.A05     // Catch:{ Exception -> 0x02af }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0206
            boolean r2 = r11.A06     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0206
            goto L_0x0215
        L_0x0206:
            if (r5 == 0) goto L_0x0213
            r2 = r0
            X.6Ov r2 = (X.C126666Ov) r2     // Catch:{ Exception -> 0x02af }
            boolean r2 = r2.A0T     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0213
            r2 = 23
            if (r6 < r2) goto L_0x0215
        L_0x0213:
            r2 = 0
            goto L_0x0216
        L_0x0215:
            r2 = 1
        L_0x0216:
            r0.A0a = r2     // Catch:{ Exception -> 0x02af }
            java.lang.String r2 = "c2.android.mp3.decoder"
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0227
            X.7JZ r2 = new X.7JZ     // Catch:{ Exception -> 0x02af }
            r2.<init>()     // Catch:{ Exception -> 0x02af }
            r0.A0N = r2     // Catch:{ Exception -> 0x02af }
        L_0x0227:
            int r3 = r0.A01     // Catch:{ Exception -> 0x02af }
            r2 = 2
            if (r3 != r2) goto L_0x0235
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02af }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 + r7
            r0.A0A = r2     // Catch:{ Exception -> 0x02af }
        L_0x0235:
            X.7Pz r3 = r0.A0K     // Catch:{ Exception -> 0x02af }
            int r2 = r3.A00     // Catch:{ Exception -> 0x02af }
            int r2 = r2 + 1
            r3.A00 = r2     // Catch:{ Exception -> 0x02af }
            long r19 = r17 - r9
            if (r5 == 0) goto L_0x028e
            r5 = r0
            X.6Ov r5 = (X.C126666Ov) r5     // Catch:{ Exception -> 0x02af }
            X.7GH r3 = r5.A0Y     // Catch:{ Exception -> 0x02af }
            android.os.Handler r2 = r3.A00     // Catch:{ Exception -> 0x02af }
            r16 = 3
            X.8ML r13 = new X.8ML     // Catch:{ Exception -> 0x02af }
            r14 = r3
            r15 = r4
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ Exception -> 0x02af }
            r2.post(r13)     // Catch:{ Exception -> 0x02af }
            boolean r2 = X.C126666Ov.A04(r4)     // Catch:{ Exception -> 0x02af }
            r5.A0O = r2     // Catch:{ Exception -> 0x02af }
            X.7o8 r4 = r5.A0P     // Catch:{ Exception -> 0x02af }
            r4.getClass()     // Catch:{ Exception -> 0x02af }
            r2 = 29
            r7 = 0
            if (r6 < r2) goto L_0x0289
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            java.lang.String r2 = r4.A02     // Catch:{ Exception -> 0x02af }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0289
            android.media.MediaCodecInfo$CodecCapabilities r2 = r4.A00     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x0276
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r2.profileLevels     // Catch:{ Exception -> 0x02af }
            if (r6 != 0) goto L_0x0278
        L_0x0276:
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r1]     // Catch:{ Exception -> 0x02af }
        L_0x0278:
            int r4 = r6.length     // Catch:{ Exception -> 0x02af }
        L_0x0279:
            if (r7 >= r4) goto L_0x0289
            r2 = r6[r7]     // Catch:{ Exception -> 0x02af }
            int r3 = r2.profile     // Catch:{ Exception -> 0x02af }
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r2) goto L_0x0284
            goto L_0x0287
        L_0x0284:
            int r7 = r7 + 1
            goto L_0x0279
        L_0x0287:
            r2 = 1
            goto L_0x028a
        L_0x0289:
            r2 = 0
        L_0x028a:
            r5.A0N = r2     // Catch:{ Exception -> 0x02af }
            goto L_0x00a7
        L_0x028e:
            r2 = r0
            X.6Ow r2 = (X.C126676Ow) r2     // Catch:{ Exception -> 0x02af }
            X.7VZ r3 = r2.A09     // Catch:{ Exception -> 0x02af }
            android.os.Handler r2 = r3.A00     // Catch:{ Exception -> 0x02af }
            if (r2 == 0) goto L_0x00a7
            r16 = 2
            X.8ML r13 = new X.8ML     // Catch:{ Exception -> 0x02af }
            r14 = r3
            r15 = r4
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ Exception -> 0x02af }
            r2.post(r13)     // Catch:{ Exception -> 0x02af }
            goto L_0x00a7
        L_0x02a5:
            r3 = move-exception
            goto L_0x02a9
        L_0x02a7:
            r3 = move-exception
            goto L_0x02ae
        L_0x02a9:
            android.media.MediaCodec r2 = r7.A00     // Catch:{ Exception -> 0x02af }
            r2.release()     // Catch:{ Exception -> 0x02af }
        L_0x02ae:
            throw r3     // Catch:{ Exception -> 0x02af }
        L_0x02af:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = "Failed to initialize decoder: "
            java.lang.String r3 = X.AnonymousClass000.A0P(r11, r2, r3)     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = "MediaCodecRenderer"
            X.C159307lc.A01(r3, r2, r5)     // Catch:{ 6zY -> 0x0332 }
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 6zY -> 0x0332 }
            r2.removeFirst()     // Catch:{ 6zY -> 0x0332 }
            X.7yp r4 = r0.A0I     // Catch:{ 6zY -> 0x0332 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = "Decoder init failed: "
            r3.append(r2)     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = r11.A03     // Catch:{ 6zY -> 0x0332 }
            r3.append(r2)     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = ", "
            java.lang.String r13 = X.AnonymousClass000.A0P(r4, r2, r3)     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r14 = r4.A0T     // Catch:{ 6zY -> 0x0332 }
            boolean r2 = r5 instanceof android.media.MediaCodec.CodecException     // Catch:{ 6zY -> 0x0332 }
            if (r2 == 0) goto L_0x0321
            r2 = r5
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r15 = r2.getDiagnosticInfo()     // Catch:{ 6zY -> 0x0332 }
        L_0x02e7:
            X.6zY r10 = new X.6zY     // Catch:{ 6zY -> 0x0332 }
            r17 = r1
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ 6zY -> 0x0332 }
            X.6zY r2 = r0.A0Q     // Catch:{ 6zY -> 0x0332 }
            if (r2 != 0) goto L_0x0301
            r0.A0Q = r10     // Catch:{ 6zY -> 0x0332 }
        L_0x02f6:
            java.util.ArrayDeque r2 = r0.A0S     // Catch:{ 6zY -> 0x0332 }
            boolean r2 = r2.isEmpty()     // Catch:{ 6zY -> 0x0332 }
            if (r2 == 0) goto L_0x00a7
            X.6zY r5 = r0.A0Q     // Catch:{ 6zY -> 0x0332 }
            goto L_0x032e
        L_0x0301:
            java.lang.String r16 = r2.getMessage()     // Catch:{ 6zY -> 0x0332 }
            java.lang.Throwable r19 = r2.getCause()     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r5 = r2.mimeType     // Catch:{ 6zY -> 0x0332 }
            boolean r4 = r2.secureDecoderRequired     // Catch:{ 6zY -> 0x0332 }
            X.7o8 r3 = r2.codecInfo     // Catch:{ 6zY -> 0x0332 }
            java.lang.String r2 = r2.diagnosticInfo     // Catch:{ 6zY -> 0x0332 }
            X.6zY r13 = new X.6zY     // Catch:{ 6zY -> 0x0332 }
            r14 = r3
            r15 = r10
            r17 = r5
            r18 = r2
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 6zY -> 0x0332 }
            r0.A0Q = r13     // Catch:{ 6zY -> 0x0332 }
            goto L_0x02f6
        L_0x0321:
            r15 = 0
            goto L_0x02e7
        L_0x0323:
            r4 = move-exception
            X.7yp r3 = r0.A0I     // Catch:{ 6zY -> 0x0332 }
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            X.6zY r5 = new X.6zY     // Catch:{ 6zY -> 0x0332 }
            r5.<init>(r3, r4, r2)     // Catch:{ 6zY -> 0x0332 }
        L_0x032e:
            throw r5     // Catch:{ 6zY -> 0x0332 }
        L_0x032f:
            r0.A0S = r12     // Catch:{ 6zY -> 0x0332 }
            return
        L_0x0332:
            r3 = move-exception
            X.7yp r2 = r0.A0I
            X.6zd r0 = r0.A06(r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.A0O():void");
    }

    public final void A0P() {
        try {
            throw AnonymousClass001.A0g("sessionId");
        } catch (MediaCryptoException e) {
            throw A06(this.A0I, e, false);
        }
    }

    public void A0Q(long j) {
        while (true) {
            int i = this.A09;
            if (i != 0) {
                long[] jArr = this.A0z;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.A0y;
                    this.A0E = jArr2[0];
                    long[] jArr3 = this.A0x;
                    this.A0D = jArr3[0];
                    int i2 = i - 1;
                    this.A09 = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.A09);
                    System.arraycopy(jArr, 1, jArr, 0, this.A09);
                    if (this instanceof C126666Ov) {
                        ((C126666Ov) this).A0b();
                    } else {
                        ((AnonymousClass86A) ((C126676Ow) this).A0A).A0U = true;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.7yp} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(long r10) {
        /*
            r9 = this;
            X.7MG r6 = r9.A0v
            monitor-enter(r6)
            r5 = 0
        L_0x0004:
            int r7 = r6.A01     // Catch:{ all -> 0x006c }
            if (r7 <= 0) goto L_0x0028
            long[] r0 = r6.A02     // Catch:{ all -> 0x006c }
            int r8 = r6.A00     // Catch:{ all -> 0x006c }
            r0 = r0[r8]     // Catch:{ all -> 0x006c }
            long r3 = r10 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            r3 = 1
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x006c }
            r5 = r2[r8]     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r8] = r0     // Catch:{ all -> 0x006c }
            int r1 = r8 + 1
            int r0 = r2.length     // Catch:{ all -> 0x006c }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x006c }
            int r7 = r7 - r3
            r6.A01 = r7     // Catch:{ all -> 0x006c }
            goto L_0x0004
        L_0x0028:
            monitor-exit(r6)
            X.7yp r5 = (X.C166527yp) r5
            if (r5 != 0) goto L_0x0056
            boolean r0 = r9.A0c
            if (r0 == 0) goto L_0x0056
            monitor-enter(r6)
            int r4 = r6.A01     // Catch:{ all -> 0x006c }
            if (r4 != 0) goto L_0x0037
            goto L_0x0052
        L_0x0037:
            r3 = 1
            boolean r0 = X.AnonymousClass001.A1W(r4)
            X.C161487pm.A04(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x006c }
            int r1 = r6.A00     // Catch:{ all -> 0x006c }
            r5 = r2[r1]     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r1] = r0     // Catch:{ all -> 0x006c }
            int r1 = r1 + 1
            int r0 = r2.length     // Catch:{ all -> 0x006c }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x006c }
            int r4 = r4 - r3
            r6.A01 = r4     // Catch:{ all -> 0x006c }
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            monitor-exit(r6)
            X.7yp r5 = (X.C166527yp) r5
        L_0x0056:
            r1 = 0
            if (r5 == 0) goto L_0x0063
            r9.A0J = r5
        L_0x005b:
            android.media.MediaFormat r0 = r9.A0F
            r9.A0T(r0, r5)
            r9.A0c = r1
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r9.A0c
            if (r0 == 0) goto L_0x0062
            X.7yp r5 = r9.A0J
            if (r5 == 0) goto L_0x0062
            goto L_0x005b
        L_0x006c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.A0R(long):void");
    }

    public void A0T(MediaFormat mediaFormat, C166527yp r9) {
        int i;
        int i2;
        boolean z;
        int integer;
        int integer2;
        if (this instanceof C126666Ov) {
            C126666Ov r4 = (C126666Ov) this;
            C183878qo r0 = r4.A0O;
            if (r0 != null) {
                ((AnonymousClass87P) r0).A00.setVideoScalingMode(r4.A0A);
            }
            if (r4.A0T) {
                r4.A05 = r9.A0I;
                integer2 = r9.A09;
            } else {
                mediaFormat.getClass();
                if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                    z = false;
                    integer = mediaFormat.getInteger("width");
                } else {
                    z = true;
                    integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                }
                r4.A05 = integer;
                if (z) {
                    integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
                } else {
                    integer2 = mediaFormat.getInteger("height");
                }
            }
            r4.A04 = integer2;
            float f = r9.A02;
            r4.A00 = f;
            int i3 = r9.A0E;
            if (i3 == 90 || i3 == 270) {
                int i4 = r4.A05;
                r4.A05 = integer2;
                r4.A04 = i4;
                r4.A00 = 1.0f / f;
            }
            C158657kL r42 = r4.A0X;
            r42.A00 = r9.A01;
            C149637Nf r3 = r42.A0E;
            r3.A03.A00();
            r3.A02.A00();
            r3.A04 = false;
            r3.A01 = -9223372036854775807L;
            r3.A00 = 0;
            r42.A02();
            return;
        }
        C126676Ow r32 = (C126676Ow) this;
        C166527yp r02 = r32.A02;
        int[] iArr = null;
        if (r02 != null) {
            r9 = r02;
        } else if (r32.A0O != null) {
            if ("audio/raw".equals(r9.A0T)) {
                i = r9.A0B;
            } else if (C162387ry.A01 >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = C162387ry.A01(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            C157057he A002 = C157057he.A00();
            A002.A0R = "audio/raw";
            A002.A09 = i;
            A002.A05 = r9.A07;
            A002.A06 = r9.A08;
            A002.A04 = mediaFormat.getInteger("channel-count");
            A002.A0D = mediaFormat.getInteger("sample-rate");
            C166527yp A003 = C166527yp.A00(A002);
            if (r32.A07 && A003.A06 == 6 && (i2 = r9.A06) < 6) {
                iArr = new int[i2];
                for (int i5 = 0; i5 < i2; i5++) {
                    iArr[i5] = i5;
                }
            }
            r9 = A003;
        }
        try {
            r32.A0A.AzT(r9, iArr, 0);
        } catch (C143796zU e) {
            throw r32.A06(e.format, e, false);
        }
    }

    public void A0U(C126496Oc r1) {
    }

    public boolean A0V() {
        if (this.A0O != null) {
            if (this.A04 == 3 || ((this.A0b && !this.A0W) || (this.A0Y && this.A0e))) {
                A0H();
                return true;
            }
            A0N();
        }
        return false;
    }

    public final boolean A0W() {
        if (this.A0d) {
            this.A05 = 1;
            if (this.A0Y) {
                this.A04 = 3;
                return false;
            }
            this.A04 = 2;
            return true;
        }
        A0P();
        throw AnonymousClass000.A0L();
    }

    public final boolean A0X() {
        if (C162387ry.A01 >= 23) {
            float f = this.A02;
            C166527yp[] r0 = this.A08;
            r0.getClass();
            float A0E2 = A0E(r0, f);
            float f2 = this.A00;
            if (f2 != A0E2) {
                if (A0E2 == -1.0f) {
                    A0M();
                    return false;
                } else if (f2 != -1.0f || A0E2 > this.A0n) {
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putFloat("operating-rate", A0E2);
                    ((AnonymousClass87P) this.A0O).A00.setParameters(A082);
                    this.A00 = A0E2;
                }
            }
        }
        return true;
    }

    public final boolean A0Z(boolean z) {
        C147807Fu r4 = this.A0A;
        r4.A01 = null;
        r4.A00 = null;
        C126496Oc r3 = this.A0r;
        r3.clear();
        int A052 = A05(r4, r3, z);
        if (A052 == -5) {
            A0F(r4);
            return true;
        } else if (A052 != -4 || !C153567bZ.A00(r3)) {
            return false;
        } else {
            this.A0g = true;
            A00();
            return false;
        }
    }

    public boolean BHW() {
        if (!(this instanceof C126676Ow)) {
            return this.A0j;
        }
        C126676Ow r1 = (C126676Ow) this;
        if (!r1.A0j) {
            return false;
        }
        AnonymousClass86A r12 = (AnonymousClass86A) r1.A0A;
        if (r12.A0C == null) {
            return true;
        }
        if (!r12.A0Q || r12.BFP()) {
            return false;
        }
        return true;
    }

    public boolean BIe() {
        boolean BIe;
        if (this.A0I == null) {
            return false;
        }
        if (BFS()) {
            BIe = this.A06;
        } else {
            C185338tU r0 = this.A05;
            r0.getClass();
            BIe = r0.BIe();
        }
        if (BIe || this.A08 >= 0) {
            return true;
        }
        long j = this.A0A;
        if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void BjR(long r30, long r32) {
        /*
            r29 = this;
            r0 = r30
            r14 = r29
            boolean r3 = r14.A0k
            r2 = 0
            if (r3 == 0) goto L_0x000e
            r14.A0k = r2
            r14.A00()
        L_0x000e:
            X.6zd r3 = r14.A0G
            if (r3 != 0) goto L_0x05ac
            boolean r3 = r14.A0j     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x001a
            r14.A0I()     // Catch:{ IllegalStateException -> 0x0575 }
            return
        L_0x001a:
            X.7yp r3 = r14.A0I     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x0026
            r3 = 1
            boolean r3 = r14.A0Z(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x0026
            return
        L_0x0026:
            r14.A0O()     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r3 = r14.A0U     // Catch:{ IllegalStateException -> 0x0575 }
            r23 = r32
            if (r3 == 0) goto L_0x0108
            java.lang.String r3 = "bypassRender"
            android.os.Trace.beginSection(r3)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0034:
            boolean r3 = r14.A0j     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = r3 ^ 1
            X.C161487pm.A04(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            X.6Ob r5 = r14.A0s     // Catch:{ IllegalStateException -> 0x0575 }
            int r10 = r5.A01     // Catch:{ IllegalStateException -> 0x0575 }
            if (r10 <= 0) goto L_0x0072
            r16 = 0
            java.nio.ByteBuffer r9 = r5.A01     // Catch:{ IllegalStateException -> 0x0575 }
            int r8 = r14.A08     // Catch:{ IllegalStateException -> 0x0575 }
            long r3 = r5.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r5.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r6 = r6 & r7
            boolean r27 = X.AnonymousClass000.A1U(r6, r7)     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r28 = X.C153567bZ.A00(r5)     // Catch:{ IllegalStateException -> 0x0575 }
            X.7yp r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x0575 }
            r18 = r8
            r19 = r2
            r20 = r10
            r21 = r0
            r25 = r3
            r17 = r9
            boolean r3 = r14.A0Y(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0079
            long r3 = r5.A02     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0Q(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r5.clear()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0072:
            boolean r3 = r14.A0g     // Catch:{ IllegalStateException -> 0x0575 }
            r9 = 1
            if (r3 == 0) goto L_0x0082
            r14.A0j = r9     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0079:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x007c:
            X.7Pz r0 = r14.A0K     // Catch:{ IllegalStateException -> 0x0575 }
            monitor-enter(r0)     // Catch:{ IllegalStateException -> 0x0575 }
            monitor-exit(r0)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0562
        L_0x0082:
            boolean r3 = r14.A0V     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0091
            X.6Oc r3 = r14.A0q     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r3 = r5.A02(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            X.C161487pm.A04(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0V = r2     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0091:
            boolean r3 = r14.A0T     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x00a6
            int r3 = r5.A01     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 > 0) goto L_0x0034
            r14.A0L()     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0T = r2     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0O()     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r3 = r14.A0U     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x00a6
            goto L_0x0079
        L_0x00a6:
            boolean r3 = r14.A0g     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = r3 ^ 1
            X.C161487pm.A04(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            X.7Fu r8 = r14.A0A     // Catch:{ IllegalStateException -> 0x0575 }
            r7 = 0
            r8.A01 = r7     // Catch:{ IllegalStateException -> 0x0575 }
            r8.A00 = r7     // Catch:{ IllegalStateException -> 0x0575 }
            X.6Oc r6 = r14.A0q     // Catch:{ IllegalStateException -> 0x0575 }
            r6.clear()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x00b9:
            r6.clear()     // Catch:{ IllegalStateException -> 0x0575 }
            int r4 = r14.A05(r8, r6, r2)     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = -5
            if (r4 == r3) goto L_0x00f0
            r3 = -4
            if (r4 == r3) goto L_0x00cb
            r3 = -3
            if (r4 == r3) goto L_0x00f3
            goto L_0x0570
        L_0x00cb:
            boolean r3 = X.C153567bZ.A00(r6)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x00d4
            r14.A0g = r9     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x00f3
        L_0x00d4:
            boolean r3 = r14.A0m     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x00e4
            X.7yp r3 = r14.A0I     // Catch:{ IllegalStateException -> 0x0575 }
            r3.getClass()     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0J = r3     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0T(r7, r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0m = r2     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x00e4:
            r6.A00()     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r3 = r5.A02(r6)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x00b9
            r14.A0V = r9     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x00f3
        L_0x00f0:
            r14.A0F(r8)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x00f3:
            int r3 = r5.A01     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 <= 0) goto L_0x00fa
            r5.A00()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x00fa:
            int r3 = r5.A01     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 > 0) goto L_0x0034
            boolean r3 = r14.A0g     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x0034
            boolean r3 = r14.A0T     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0079
            goto L_0x0034
        L_0x0108:
            X.8qo r3 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0549
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0575 }
            java.lang.String r3 = "drainAndFeed"
            android.os.Trace.beginSection(r3)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0114:
            int r3 = r14.A08     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 >= 0) goto L_0x019c
            r5 = 1
            boolean r3 = r14.A0Z     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0135
            boolean r3 = r14.A0e     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0135
            X.8qo r8 = r14.A0O     // Catch:{ IllegalStateException -> 0x01d5 }
            android.media.MediaCodec$BufferInfo r6 = r14.A0o     // Catch:{ IllegalStateException -> 0x01d5 }
            X.87P r8 = (X.AnonymousClass87P) r8     // Catch:{ IllegalStateException -> 0x01d5 }
        L_0x0127:
            android.media.MediaCodec r7 = r8.A00     // Catch:{ IllegalStateException -> 0x01d5 }
            r3 = 0
            int r4 = r7.dequeueOutputBuffer(r6, r3)     // Catch:{ IllegalStateException -> 0x01d5 }
            r3 = -3
            if (r4 == r3) goto L_0x0127
            if (r4 == r3) goto L_0x0127
            goto L_0x0148
        L_0x0135:
            X.8qo r8 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec$BufferInfo r6 = r14.A0o     // Catch:{ IllegalStateException -> 0x0575 }
            X.87P r8 = (X.AnonymousClass87P) r8     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x013b:
            android.media.MediaCodec r7 = r8.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = 0
            int r4 = r7.dequeueOutputBuffer(r6, r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = -3
            if (r4 == r3) goto L_0x013b
            if (r4 == r3) goto L_0x013b
        L_0x0148:
            if (r4 >= 0) goto L_0x0186
            r3 = -2
            if (r4 != r3) goto L_0x0177
            r14.A0W = r5     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r3 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            X.87P r3 = (X.AnonymousClass87P) r3     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r3 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaFormat r6 = r3.getOutputFormat()     // Catch:{ IllegalStateException -> 0x0575 }
            int r3 = r14.A03     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0172
            java.lang.String r3 = "width"
            int r3 = r6.getInteger(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r4 = 32
            if (r3 != r4) goto L_0x0172
            java.lang.String r3 = "height"
            int r3 = r6.getInteger(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != r4) goto L_0x0172
            r14.A0l = r5     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0114
        L_0x0172:
            r14.A0F = r6     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0c = r5     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0114
        L_0x0177:
            boolean r0 = r14.A0a     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x022e
            boolean r0 = r14.A0g     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x022b
            int r1 = r14.A05     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = 2
            if (r1 != r0) goto L_0x022e
            goto L_0x022b
        L_0x0186:
            boolean r3 = r14.A0l     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0221
            r14.A0l = r2     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r3 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            X.87P r3 = (X.AnonymousClass87P) r3     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r3 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r3.releaseOutputBuffer(r4, r2)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0114
        L_0x0197:
            r14.A0i = r3     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0R(r4)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x019c:
            boolean r3 = r14.A0Z     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x01e0
            boolean r3 = r14.A0e     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x01e0
            X.8qo r11 = r14.A0O     // Catch:{ IllegalStateException -> 0x01cd }
            java.nio.ByteBuffer r10 = r14.A0R     // Catch:{ IllegalStateException -> 0x01cd }
            int r9 = r14.A08     // Catch:{ IllegalStateException -> 0x01cd }
            android.media.MediaCodec$BufferInfo r6 = r14.A0o     // Catch:{ IllegalStateException -> 0x01cd }
            int r8 = r6.flags     // Catch:{ IllegalStateException -> 0x01cd }
            long r3 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01cd }
            boolean r7 = r14.A0h     // Catch:{ IllegalStateException -> 0x01cd }
            boolean r5 = r14.A0i     // Catch:{ IllegalStateException -> 0x01cd }
            X.7yp r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x01cd }
            r20 = 1
            r18 = r9
            r19 = r8
            r21 = r0
            r25 = r3
            r27 = r7
            r28 = r5
            r16 = r11
            r17 = r10
            boolean r3 = r14.A0Y(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x01cd }
            goto L_0x0208
        L_0x01cd:
            r14.A00()     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r0 = r14.A0j     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x022e
            goto L_0x01dc
        L_0x01d5:
            r14.A00()     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r0 = r14.A0j     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x022e
        L_0x01dc:
            r14.A0H()     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x022e
        L_0x01e0:
            X.8qo r11 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r10 = r14.A0R     // Catch:{ IllegalStateException -> 0x0575 }
            int r9 = r14.A08     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec$BufferInfo r6 = r14.A0o     // Catch:{ IllegalStateException -> 0x0575 }
            int r8 = r6.flags     // Catch:{ IllegalStateException -> 0x0575 }
            long r3 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r7 = r14.A0h     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r5 = r14.A0i     // Catch:{ IllegalStateException -> 0x0575 }
            X.7yp r15 = r14.A0J     // Catch:{ IllegalStateException -> 0x0575 }
            r20 = 1
            r18 = r9
            r19 = r8
            r21 = r0
            r25 = r3
            r27 = r7
            r28 = r5
            r16 = r11
            r17 = r10
            boolean r3 = r14.A0Y(r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0208:
            if (r3 == 0) goto L_0x022e
            long r3 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0Q(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            int r3 = r6.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = r3 & 4
            boolean r4 = X.AnonymousClass000.A1S(r3)
            r3 = -1
            r14.A08 = r3     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = 0
            r14.A0R = r3     // Catch:{ IllegalStateException -> 0x0575 }
            if (r4 != 0) goto L_0x022b
            goto L_0x0114
        L_0x0221:
            int r3 = r6.size     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 != 0) goto L_0x04df
            int r3 = r6.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x04df
        L_0x022b:
            r14.A00()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x022e:
            X.8qo r3 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            if (r3 == 0) goto L_0x0079
            int r0 = r14.A05     // Catch:{ IllegalStateException -> 0x0575 }
            r1 = 2
            if (r0 == r1) goto L_0x0079
            boolean r0 = r14.A0g     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x0079
            int r0 = r14.A07     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 >= 0) goto L_0x025e
            X.87P r3 = (X.AnonymousClass87P) r3     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r3 = 0
            int r4 = r0.dequeueInputBuffer(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A07 = r4     // Catch:{ IllegalStateException -> 0x0575 }
            if (r4 < 0) goto L_0x0079
            X.6Oc r3 = r14.A0p     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r0 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            X.87P r0 = (X.AnonymousClass87P) r0     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r4)     // Catch:{ IllegalStateException -> 0x0575 }
            r3.A01 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r3.clear()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x025e:
            int r0 = r14.A05     // Catch:{ IllegalStateException -> 0x0575 }
            r4 = 1
            if (r0 != r4) goto L_0x0285
            boolean r0 = r14.A0a     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x0281
            r14.A0e = r4     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r0 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            int r4 = r14.A07     // Catch:{ IllegalStateException -> 0x0575 }
            r7 = 0
            r9 = 4
            X.87P r0 = (X.AnonymousClass87P) r0     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r3 = r0.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r6 = r2
            r5 = r2
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = -1
            r14.A07 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            X.6Oc r3 = r14.A0p     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = 0
            r3.A01 = r0     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0281:
            r14.A05 = r1     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0079
        L_0x0285:
            boolean r0 = r14.A0X     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x02ae
            r14.A0X = r2     // Catch:{ IllegalStateException -> 0x0575 }
            X.6Oc r3 = r14.A0p     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r1 = r3.A01     // Catch:{ IllegalStateException -> 0x0575 }
            byte[] r0 = A10     // Catch:{ IllegalStateException -> 0x0575 }
            r1.put(r0)     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r1 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            int r6 = r14.A07     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r0.length     // Catch:{ IllegalStateException -> 0x0575 }
            r9 = 0
            X.87P r1 = (X.AnonymousClass87P) r1     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r5 = r1.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r11 = r2
            r7 = r2
            r8 = r0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = -1
            r14.A07 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = 0
            r3.A01 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0d = r4     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x022e
        L_0x02ae:
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != r4) goto L_0x02d1
            r5 = 0
        L_0x02b3:
            X.7yp r0 = r14.A0H     // Catch:{ IllegalStateException -> 0x0575 }
            java.util.List r0 = r0.A0U     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r0.size()     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 >= r0) goto L_0x02cf
            X.7yp r0 = r14.A0H     // Catch:{ IllegalStateException -> 0x0575 }
            java.util.List r0 = r0.A0U     // Catch:{ IllegalStateException -> 0x0575 }
            byte[] r3 = X.AnonymousClass6C9.A1V(r0, r5)     // Catch:{ IllegalStateException -> 0x0575 }
            X.6Oc r0 = r14.A0p     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r0 = r0.A01     // Catch:{ IllegalStateException -> 0x0575 }
            r0.put(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            int r5 = r5 + 1
            goto L_0x02b3
        L_0x02cf:
            r14.A06 = r1     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x02d1:
            X.6Oc r3 = r14.A0p     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0575 }
            int r9 = r0.position()     // Catch:{ IllegalStateException -> 0x0575 }
            X.7Fu r8 = r14.A0A     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = 0
            r8.A01 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r8.A00 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            int r7 = r14.A05(r8, r3, r2)     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r0 = r14.BFS()     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x02ee
            long r5 = r14.A0B     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0C = r5     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x02ee:
            r0 = -3
            if (r7 == r0) goto L_0x0079
            r0 = -5
            if (r7 != r0) goto L_0x0302
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != r1) goto L_0x02fd
            r3.clear()     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A06 = r4     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x02fd:
            r14.A0F(r8)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x022e
        L_0x0302:
            boolean r0 = X.C153567bZ.A00(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 == 0) goto L_0x031c
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != r1) goto L_0x0311
            r3.clear()     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A06 = r4     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0311:
            r14.A0g = r4     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r0 = r14.A0d     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x052b
            r14.A00()     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0079
        L_0x031c:
            boolean r0 = r14.A0d     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x0335
            int r0 = r3.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r4)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x0335
            r3.clear()     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r14.A06     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != r1) goto L_0x022e
            r14.A06 = r4     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x022e
        L_0x0335:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r3.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = r0 & r1
            boolean r13 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r13 == 0) goto L_0x0355
            X.7PP r0 = r3.A05     // Catch:{ IllegalStateException -> 0x0575 }
            if (r9 == 0) goto L_0x0355
            int[] r1 = r0.A04     // Catch:{ IllegalStateException -> 0x0575 }
            if (r1 != 0) goto L_0x0350
            int[] r1 = new int[r4]     // Catch:{ IllegalStateException -> 0x0575 }
            r0.A04 = r1     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec$CryptoInfo r0 = r0.A06     // Catch:{ IllegalStateException -> 0x0575 }
            r0.numBytesOfClearData = r1     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0350:
            r0 = r1[r2]     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r0 + r9
            r1[r2] = r0     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0355:
            long r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            X.7JZ r7 = r14.A0N     // Catch:{ IllegalStateException -> 0x0575 }
            if (r7 == 0) goto L_0x0386
            X.7yp r11 = r14.A0I     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r0 = r7.A02     // Catch:{ IllegalStateException -> 0x0575 }
            if (r0 != 0) goto L_0x0384
            java.nio.ByteBuffer r6 = r3.A01     // Catch:{ IllegalStateException -> 0x0575 }
            r6.getClass()     // Catch:{ IllegalStateException -> 0x0575 }
            r5 = 0
            r1 = 0
        L_0x0368:
            int r1 = r1 << 8
            int r0 = X.AnonymousClass6CA.A08(r6, r5)     // Catch:{ IllegalStateException -> 0x0575 }
            r1 = r1 | r0
            int r5 = r5 + 1
            r0 = 4
            if (r5 < r0) goto L_0x0368
            int r10 = X.C159937mi.A01(r1)     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = -1
            if (r10 != r0) goto L_0x03a0
            r7.A02 = r4     // Catch:{ IllegalStateException -> 0x0575 }
            java.lang.String r1 = "C2Mp3TimestampTracker"
            java.lang.String r0 = "MPEG audio header is invalid."
            android.util.Log.w(r1, r0)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0384:
            long r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0386:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r3.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r5 = r5 & r6
            boolean r5 = X.AnonymousClass000.A1U(r5, r6)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 == 0) goto L_0x0396
            java.util.ArrayList r5 = r14.A0w     // Catch:{ IllegalStateException -> 0x0575 }
            X.AnonymousClass0x2.A1Q(r5, r0)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0396:
            boolean r5 = r14.A0m     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 == 0) goto L_0x0427
            X.7MG r9 = r14.A0v     // Catch:{ IllegalStateException -> 0x0575 }
            X.7yp r11 = r14.A0I     // Catch:{ IllegalStateException -> 0x0575 }
            monitor-enter(r9)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x03c4
        L_0x03a0:
            long r5 = r7.A01     // Catch:{ IllegalStateException -> 0x0575 }
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x03b3
            long r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r7.A00 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            long r5 = (long) r10     // Catch:{ IllegalStateException -> 0x0575 }
            r8 = 529(0x211, double:2.614E-321)
            long r5 = r5 - r8
            r7.A01 = r5     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0386
        L_0x03b3:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r5 * r0
            int r0 = r11.A0F     // Catch:{ IllegalStateException -> 0x0575 }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x0575 }
            long r8 = r8 / r0
            long r0 = (long) r10     // Catch:{ IllegalStateException -> 0x0575 }
            long r5 = r5 + r0
            r7.A01 = r5     // Catch:{ IllegalStateException -> 0x0575 }
            long r0 = r7.A00     // Catch:{ IllegalStateException -> 0x0575 }
            long r0 = r0 + r8
            goto L_0x0386
        L_0x03c4:
            int r6 = r9.A01     // Catch:{ all -> 0x0565 }
            if (r6 <= 0) goto L_0x03e1
            int r5 = r9.A00     // Catch:{ all -> 0x0565 }
            int r5 = r5 + r6
            int r6 = r5 + -1
            java.lang.Object[] r8 = r9.A03     // Catch:{ all -> 0x0565 }
            int r5 = r8.length     // Catch:{ all -> 0x0565 }
            int r6 = r6 % r5
            long[] r5 = r9.A02     // Catch:{ all -> 0x0565 }
            r6 = r5[r6]     // Catch:{ all -> 0x0565 }
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x03e1
            r9.A00 = r2     // Catch:{ all -> 0x0563 }
            r9.A01 = r2     // Catch:{ all -> 0x0563 }
            r5 = 0
            java.util.Arrays.fill(r8, r5)     // Catch:{ all -> 0x0563 }
        L_0x03e1:
            java.lang.Object[] r10 = r9.A03     // Catch:{ all -> 0x0565 }
            int r8 = r10.length     // Catch:{ all -> 0x0565 }
            int r5 = r9.A01     // Catch:{ all -> 0x0565 }
            if (r5 < r8) goto L_0x0413
            int r5 = r8 * 2
            long[] r7 = new long[r5]     // Catch:{ all -> 0x0565 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0565 }
            int r6 = r9.A00     // Catch:{ all -> 0x0565 }
            int r8 = r8 - r6
            long[] r5 = r9.A02     // Catch:{ all -> 0x0565 }
            java.lang.System.arraycopy(r5, r6, r7, r2, r8)     // Catch:{ all -> 0x0565 }
            java.lang.Object[] r6 = r9.A03     // Catch:{ all -> 0x0565 }
            int r5 = r9.A00     // Catch:{ all -> 0x0565 }
            java.lang.System.arraycopy(r6, r5, r10, r2, r8)     // Catch:{ all -> 0x0565 }
            int r6 = r9.A00     // Catch:{ all -> 0x0565 }
            if (r6 <= 0) goto L_0x040d
            long[] r5 = r9.A02     // Catch:{ all -> 0x0565 }
            java.lang.System.arraycopy(r5, r2, r7, r8, r6)     // Catch:{ all -> 0x0565 }
            java.lang.Object[] r6 = r9.A03     // Catch:{ all -> 0x0565 }
            int r5 = r9.A00     // Catch:{ all -> 0x0565 }
            java.lang.System.arraycopy(r6, r2, r10, r8, r5)     // Catch:{ all -> 0x0565 }
        L_0x040d:
            r9.A02 = r7     // Catch:{ all -> 0x0565 }
            r9.A03 = r10     // Catch:{ all -> 0x0565 }
            r9.A00 = r2     // Catch:{ all -> 0x0565 }
        L_0x0413:
            int r7 = r9.A00     // Catch:{ all -> 0x0565 }
            int r6 = r9.A01     // Catch:{ all -> 0x0565 }
            int r7 = r7 + r6
            int r5 = r10.length     // Catch:{ all -> 0x0565 }
            int r7 = r7 % r5
            long[] r5 = r9.A02     // Catch:{ all -> 0x0565 }
            r5[r7] = r0     // Catch:{ all -> 0x0565 }
            r10[r7] = r11     // Catch:{ all -> 0x0565 }
            int r5 = r6 + 1
            r9.A01 = r5     // Catch:{ all -> 0x0565 }
            monitor-exit(r9)     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0m = r2     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0427:
            X.7JZ r7 = r14.A0N     // Catch:{ IllegalStateException -> 0x0575 }
            long r5 = r14.A0B     // Catch:{ IllegalStateException -> 0x0575 }
            if (r7 == 0) goto L_0x045e
            long r7 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            long r5 = java.lang.Math.max(r5, r7)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0433:
            r14.A0B = r5     // Catch:{ IllegalStateException -> 0x0575 }
            r3.A00()     // Catch:{ IllegalStateException -> 0x0575 }
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            int r5 = r3.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r5 = r5 & r6
            boolean r5 = X.AnonymousClass000.A1U(r5, r6)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 == 0) goto L_0x0446
            r14.A0U(r3)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0446:
            boolean r5 = r14 instanceof X.C126666Ov     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 == 0) goto L_0x047c
            r9 = r14
            X.6Ov r9 = (X.C126666Ov) r9     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r7 = r9.A0T     // Catch:{ IllegalStateException -> 0x0575 }
            if (r7 != 0) goto L_0x0457
            int r5 = r9.A02     // Catch:{ IllegalStateException -> 0x0575 }
            int r5 = r5 + 1
            r9.A02 = r5     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0457:
            int r6 = X.C162387ry.A01     // Catch:{ IllegalStateException -> 0x0575 }
            r5 = 23
            if (r6 >= r5) goto L_0x04a1
            goto L_0x0463
        L_0x045e:
            long r5 = java.lang.Math.max(r5, r0)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0433
        L_0x0463:
            if (r7 == 0) goto L_0x04a1
            long r5 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            r9.A0R(r5)     // Catch:{ IllegalStateException -> 0x0575 }
            r9.A0d()     // Catch:{ IllegalStateException -> 0x0575 }
            X.7Pz r8 = r9.A0K     // Catch:{ IllegalStateException -> 0x0575 }
            int r7 = r8.A06     // Catch:{ IllegalStateException -> 0x0575 }
            int r7 = r7 + 1
            r8.A06 = r7     // Catch:{ IllegalStateException -> 0x0575 }
            r9.A0a()     // Catch:{ IllegalStateException -> 0x0575 }
            r9.A0Q(r5)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x04a1
        L_0x047c:
            r12 = r14
            X.6Ow r12 = (X.C126676Ow) r12     // Catch:{ IllegalStateException -> 0x0575 }
            boolean r5 = r12.A04     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 == 0) goto L_0x04a1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r3.flags     // Catch:{ IllegalStateException -> 0x0575 }
            r5 = r5 & r6
            boolean r5 = X.AnonymousClass000.A1U(r5, r6)     // Catch:{ IllegalStateException -> 0x0575 }
            if (r5 != 0) goto L_0x04a1
            long r5 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            long r7 = r12.A01     // Catch:{ IllegalStateException -> 0x0575 }
            long r10 = X.AnonymousClass6C9.A0N(r5, r7)     // Catch:{ IllegalStateException -> 0x0575 }
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x049f
            r12.A01 = r5     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x049f:
            r12.A04 = r2     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x04a1:
            if (r13 == 0) goto L_0x04b7
            X.8qo r6 = r14.A0O     // Catch:{ CryptoException -> 0x0568 }
            int r7 = r14.A07     // Catch:{ CryptoException -> 0x0568 }
            X.7PP r5 = r3.A05     // Catch:{ CryptoException -> 0x0568 }
            X.87P r6 = (X.AnonymousClass87P) r6     // Catch:{ CryptoException -> 0x0568 }
            android.media.MediaCodec r6 = r6.A00     // Catch:{ CryptoException -> 0x0568 }
            android.media.MediaCodec$CryptoInfo r5 = r5.A06     // Catch:{ CryptoException -> 0x0568 }
            r12 = r2
            r8 = r2
            r9 = r5
            r10 = r0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0568 }
            goto L_0x04cb
        L_0x04b7:
            X.8qo r6 = r14.A0O     // Catch:{ CryptoException -> 0x0568 }
            int r7 = r14.A07     // Catch:{ CryptoException -> 0x0568 }
            java.nio.ByteBuffer r5 = r3.A01     // Catch:{ CryptoException -> 0x0568 }
            int r9 = r5.limit()     // Catch:{ CryptoException -> 0x0568 }
            X.87P r6 = (X.AnonymousClass87P) r6     // Catch:{ CryptoException -> 0x0568 }
            android.media.MediaCodec r6 = r6.A00     // Catch:{ CryptoException -> 0x0568 }
            r12 = r2
            r8 = r2
            r10 = r0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0568 }
        L_0x04cb:
            r0 = -1
            r14.A07 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r0 = 0
            r3.A01 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0d = r4     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A06 = r2     // Catch:{ IllegalStateException -> 0x0575 }
            X.7Pz r1 = r14.A0K     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r1.A04     // Catch:{ IllegalStateException -> 0x0575 }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x022e
        L_0x04df:
            r14.A08 = r4     // Catch:{ IllegalStateException -> 0x0575 }
            X.8qo r3 = r14.A0O     // Catch:{ IllegalStateException -> 0x0575 }
            X.87P r3 = (X.AnonymousClass87P) r3     // Catch:{ IllegalStateException -> 0x0575 }
            android.media.MediaCodec r3 = r3.A00     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r4 = r3.getOutputBuffer(r4)     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0R = r4     // Catch:{ IllegalStateException -> 0x0575 }
            if (r4 == 0) goto L_0x04fe
            int r3 = r6.offset     // Catch:{ IllegalStateException -> 0x0575 }
            r4.position(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            java.nio.ByteBuffer r5 = r14.A0R     // Catch:{ IllegalStateException -> 0x0575 }
            int r4 = r6.offset     // Catch:{ IllegalStateException -> 0x0575 }
            int r3 = r6.size     // Catch:{ IllegalStateException -> 0x0575 }
            int r4 = r4 + r3
            r5.limit(r4)     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x04fe:
            long r4 = r6.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0575 }
            java.util.ArrayList r10 = r14.A0w     // Catch:{ IllegalStateException -> 0x0575 }
            int r9 = r10.size()     // Catch:{ IllegalStateException -> 0x0575 }
            r8 = 0
        L_0x0507:
            if (r8 >= r9) goto L_0x051e
            java.lang.Object r3 = r10.get(r8)     // Catch:{ IllegalStateException -> 0x0575 }
            long r6 = X.C18310x6.A0B(r3)     // Catch:{ IllegalStateException -> 0x0575 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0519
            r10.remove(r8)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x051c
        L_0x0519:
            int r8 = r8 + 1
            goto L_0x0507
        L_0x051c:
            r3 = 1
            goto L_0x051f
        L_0x051e:
            r3 = 0
        L_0x051f:
            r14.A0h = r3     // Catch:{ IllegalStateException -> 0x0575 }
            long r6 = r14.A0C     // Catch:{ IllegalStateException -> 0x0575 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1T(r3)
            goto L_0x0197
        L_0x052b:
            boolean r0 = r14.A0a     // Catch:{ CryptoException -> 0x0568 }
            if (r0 != 0) goto L_0x0079
            r14.A0e = r4     // Catch:{ CryptoException -> 0x0568 }
            X.8qo r0 = r14.A0O     // Catch:{ CryptoException -> 0x0568 }
            int r5 = r14.A07     // Catch:{ CryptoException -> 0x0568 }
            r8 = 0
            r10 = 4
            X.87P r0 = (X.AnonymousClass87P) r0     // Catch:{ CryptoException -> 0x0568 }
            android.media.MediaCodec r4 = r0.A00     // Catch:{ CryptoException -> 0x0568 }
            r7 = r2
            r6 = r2
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x0568 }
            r0 = -1
            r14.A07 = r0     // Catch:{ CryptoException -> 0x0568 }
            r0 = 0
            r3.A01 = r0     // Catch:{ CryptoException -> 0x0568 }
            goto L_0x0079
        L_0x0549:
            X.7Pz r7 = r14.A0K     // Catch:{ IllegalStateException -> 0x0575 }
            int r6 = r7.A07     // Catch:{ IllegalStateException -> 0x0575 }
            X.8tU r5 = r14.A05     // Catch:{ IllegalStateException -> 0x0575 }
            r5.getClass()     // Catch:{ IllegalStateException -> 0x0575 }
            long r3 = r14.A03     // Catch:{ IllegalStateException -> 0x0575 }
            long r0 = r30 - r3
            int r0 = r5.BpO(r0)     // Catch:{ IllegalStateException -> 0x0575 }
            int r6 = r6 + r0
            r7.A07 = r6     // Catch:{ IllegalStateException -> 0x0575 }
            r14.A0Z(r2)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x007c
        L_0x0562:
            return
        L_0x0563:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0565 }
        L_0x0565:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0574
        L_0x0568:
            r1 = move-exception
            X.7yp r0 = r14.A0I     // Catch:{ IllegalStateException -> 0x0575 }
            X.6zd r0 = r14.A06(r0, r1, r2)     // Catch:{ IllegalStateException -> 0x0575 }
            goto L_0x0574
        L_0x0570:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0574:
            throw r0     // Catch:{ IllegalStateException -> 0x0575 }
        L_0x0575:
            r3 = move-exception
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException
            if (r0 != 0) goto L_0x058f
            java.lang.StackTraceElement[] r1 = r3.getStackTrace()
            int r0 = r1.length
            if (r0 <= 0) goto L_0x05af
            r0 = r1[r2]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = "android.media.MediaCodec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05af
        L_0x058f:
            X.7o8 r4 = r14.A0P
            boolean r0 = r14 instanceof X.C126666Ov
            if (r0 == 0) goto L_0x05a6
            r0 = r14
            X.6Ov r0 = (X.C126666Ov) r0
            android.view.Surface r0 = r0.A0K
            X.6Ou r1 = new X.6Ou
            r1.<init>(r0, r4, r3)
        L_0x059f:
            X.7yp r0 = r14.A0I
            X.6zd r3 = r14.A06(r0, r1, r2)
            throw r3
        L_0x05a6:
            X.6OW r1 = new X.6OW
            r1.<init>(r4, r3)
            goto L_0x059f
        L_0x05ac:
            r0 = 0
            r14.A0G = r0
        L_0x05af:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.BjR(long, long):void");
    }

    public void Bmz(float f, float f2) {
        this.A01 = f;
        this.A02 = f2;
        if (this.A0O != null && this.A04 != 3 && this.A01 != 0) {
            A0X();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if (X.AnonymousClass86I.class.equals(r3) != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BqO(X.C166527yp r11) {
        /*
            r10 = this;
            X.8wE r6 = r10.A0u     // Catch:{ 6yS -> 0x0105 }
            r5 = r10
            boolean r0 = r10 instanceof X.C126666Ov     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r11.A0T     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = X.C162107rG.A05(r0)     // Catch:{ 6yS -> 0x0105 }
            r3 = 0
            if (r0 == 0) goto L_0x0103
            X.7z2 r0 = r11.A0K     // Catch:{ 6yS -> 0x0105 }
            r5 = 1
            boolean r4 = X.AnonymousClass000.A1W(r0)     // Catch:{ 6yS -> 0x0105 }
            java.util.List r2 = X.C126666Ov.A02(r11, r6, r4, r3)     // Catch:{ 6yS -> 0x0105 }
            if (r4 == 0) goto L_0x0027
            boolean r0 = r2.isEmpty()     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0027
            java.util.List r2 = X.C126666Ov.A02(r11, r6, r3, r3)     // Catch:{ 6yS -> 0x0105 }
        L_0x0027:
            boolean r0 = r2.isEmpty()     // Catch:{ 6yS -> 0x0105 }
            if (r0 != 0) goto L_0x0101
            java.lang.Class r1 = r11.A0N     // Catch:{ 6yS -> 0x0105 }
            if (r1 == 0) goto L_0x0039
            java.lang.Class<X.86I> r0 = X.AnonymousClass86I.class
            boolean r0 = r0.equals(r1)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00ff
        L_0x0039:
            java.lang.Object r0 = r2.get(r3)     // Catch:{ 6yS -> 0x0105 }
            X.7o8 r0 = (X.C160687o8) r0     // Catch:{ 6yS -> 0x0105 }
            boolean r1 = r0.A05(r11)     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r0.A06(r11)     // Catch:{ 6yS -> 0x0105 }
            r2 = 8
            if (r0 == 0) goto L_0x004d
            r2 = 16
        L_0x004d:
            if (r1 == 0) goto L_0x006c
            java.util.List r1 = X.C126666Ov.A02(r11, r6, r4, r5)     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yS -> 0x0105 }
            if (r0 != 0) goto L_0x0070
            java.lang.Object r1 = r1.get(r3)     // Catch:{ 6yS -> 0x0105 }
            X.7o8 r1 = (X.C160687o8) r1     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r1.A05(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0070
            boolean r0 = r1.A06(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0070
            goto L_0x006e
        L_0x006c:
            r0 = 3
            goto L_0x0071
        L_0x006e:
            r3 = 32
        L_0x0070:
            r0 = 4
        L_0x0071:
            r0 = r0 | r2
            r0 = r0 | r3
            return r0
        L_0x0074:
            X.6Ow r5 = (X.C126676Ow) r5     // Catch:{ 6yS -> 0x0105 }
            java.lang.String r2 = r11.A0T     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = X.C162107rG.A03(r2)     // Catch:{ 6yS -> 0x0105 }
            r4 = 0
            if (r0 == 0) goto L_0x0103
            java.lang.Class r3 = r11.A0N     // Catch:{ 6yS -> 0x0105 }
            r1 = 0
            if (r3 == 0) goto L_0x008e
            r1 = 1
            java.lang.Class<X.86I> r0 = X.AnonymousClass86I.class
            boolean r0 = r0.equals(r3)     // Catch:{ 6yS -> 0x0105 }
            r9 = 0
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r9 = 1
        L_0x008f:
            r8 = 8
            r7 = 4
            if (r9 == 0) goto L_0x00b3
            X.8vH r0 = r5.A0A     // Catch:{ 6yS -> 0x0105 }
            X.86A r0 = (X.AnonymousClass86A) r0     // Catch:{ 6yS -> 0x0105 }
            int r0 = r0.B7p(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "audio/raw"
            java.util.List r1 = X.C162267rY.A02(r0, r4, r4)     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yS -> 0x0105 }
            if (r0 != 0) goto L_0x00b3
            java.lang.Object r0 = r1.get(r4)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00b3
            goto L_0x00fb
        L_0x00b3:
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r2)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00c5
            X.8vH r0 = r5.A0A     // Catch:{ 6yS -> 0x0105 }
            X.86A r0 = (X.AnonymousClass86A) r0     // Catch:{ 6yS -> 0x0105 }
            int r0 = r0.B7p(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0101
        L_0x00c5:
            X.8vH r3 = r5.A0A     // Catch:{ 6yS -> 0x0105 }
            int r2 = r11.A06     // Catch:{ 6yS -> 0x0105 }
            int r1 = r11.A0F     // Catch:{ 6yS -> 0x0105 }
            r0 = 2
            X.7yp r0 = X.C162387ry.A06(r0, r2, r1)     // Catch:{ 6yS -> 0x0105 }
            X.86A r3 = (X.AnonymousClass86A) r3     // Catch:{ 6yS -> 0x0105 }
            int r0 = r3.B7p(r0)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x0101
            java.util.List r1 = r5.A0G(r11, r6)     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yS -> 0x0105 }
            if (r0 != 0) goto L_0x0101
            if (r9 == 0) goto L_0x00ff
            java.lang.Object r1 = r1.get(r4)     // Catch:{ 6yS -> 0x0105 }
            X.7o8 r1 = (X.C160687o8) r1     // Catch:{ 6yS -> 0x0105 }
            boolean r0 = r1.A05(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r1.A06(r11)     // Catch:{ 6yS -> 0x0105 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x00f9
        L_0x00f7:
            r7 = 3
            goto L_0x00fb
        L_0x00f9:
            r8 = 16
        L_0x00fb:
            r7 = r7 | r8
            r0 = r7 | 32
            return r0
        L_0x00ff:
            r0 = 2
            return r0
        L_0x0101:
            r0 = 1
            return r0
        L_0x0103:
            r0 = 0
            return r0
        L_0x0105:
            r1 = move-exception
            r0 = 0
            X.6zd r0 = r10.A06(r11, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OF.BqO(X.7yp):int");
    }

    public AnonymousClass6OF(C186638vh r7, C186968wE r8, float f, int i) {
        super(i);
        this.A0t = r7;
        this.A0u = r8;
        this.A0n = f;
        C126486Ob r4 = new C126486Ob();
        this.A0s = r4;
        this.A0v = new AnonymousClass7MG();
        this.A0w = AnonymousClass001.A0s();
        this.A0o = new MediaCodec.BufferInfo();
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A0y = new long[10];
        this.A0x = new long[10];
        this.A0z = new long[10];
        this.A0E = -9223372036854775807L;
        this.A0D = -9223372036854775807L;
        r4.A01(0);
        r4.A01.order(ByteOrder.nativeOrder());
        A0K();
    }

    public void A0K() {
        A0J();
        this.A0G = null;
        this.A0N = null;
        this.A0S = null;
        this.A0P = null;
        this.A0H = null;
        this.A0F = null;
        this.A0c = false;
        this.A0W = false;
        this.A00 = -1.0f;
        this.A03 = 0;
        this.A0b = false;
        this.A0Y = false;
        this.A0Z = false;
        this.A0a = false;
        this.A0f = false;
        this.A06 = 0;
    }
}
