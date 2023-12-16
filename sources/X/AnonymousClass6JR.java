package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.facebook.android.exoplayer2.ext.opus.OpusDecoder;
import com.facebook.android.exoplayer2.ext.opus.OpusLibrary;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* renamed from: X.6JR  reason: invalid class name */
public class AnonymousClass6JR extends C1673180p implements C184788sW {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C166637z1 A06;
    public C150237Pv A07;
    public AnonymousClass6Jl A08;
    public C152737a2 A09;
    public SimpleOutputBuffer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C1463279v A0H;
    public final C150677Rt A0I = new C150677Rt((Handler) null, (AnonymousClass81X) null);
    public final DefaultAudioSink A0J;
    public final AnonymousClass6Jl A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6JR() {
        super(1);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(new C187048wM[0]);
        this.A0J = defaultAudioSink;
        defaultAudioSink.A0E = new C1673780v(this);
        this.A0H = new C1463279v();
        this.A0K = new AnonymousClass6Jl(0);
        this.A01 = 0;
        this.A0D = true;
    }

    /* JADX INFO: finally extract failed */
    public void A0B() {
        this.A06 = null;
        this.A0D = true;
        try {
            A0G();
            DefaultAudioSink defaultAudioSink = this.A0J;
            defaultAudioSink.A04();
            for (C187048wM reset : defaultAudioSink.A0g) {
                reset.reset();
            }
            for (C187048wM reset2 : defaultAudioSink.A0f) {
                reset2.reset();
            }
            defaultAudioSink.A0P = false;
            synchronized (this.A07) {
            }
            this.A0I.A00(this.A07);
        } catch (Throwable th) {
            synchronized (this.A07) {
                this.A0I.A00(this.A07);
                throw th;
            }
        }
    }

    public final void A0F() {
        this.A0G = true;
        try {
            this.A0J.A05();
        } catch (C143566z6 e) {
            throw A07(this.A06, e, 5002);
        }
    }

    public void A0C(long j, boolean z) {
        this.A0J.A04();
        this.A05 = j;
        this.A0B = true;
        this.A0C = true;
        this.A0F = false;
        this.A0G = false;
        if (this.A09 == null) {
            return;
        }
        if (this.A01 != 0) {
            A0G();
            A0E();
            return;
        }
        this.A08 = null;
        SimpleOutputBuffer simpleOutputBuffer = this.A0A;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.A0A = null;
        }
        C152737a2 r5 = this.A09;
        synchronized (r5.A07) {
            r5.A05 = true;
            r5.A02 = 0;
            AnonymousClass6Jl r3 = r5.A04;
            if (r3 != null) {
                r3.A00();
                AnonymousClass6Jl[] r2 = r5.A0B;
                int i = r5.A00;
                r5.A00 = i + 1;
                r2[i] = r3;
                r5.A04 = null;
            }
            while (true) {
                ArrayDeque arrayDeque = r5.A09;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                AnonymousClass6Jl r32 = (AnonymousClass6Jl) arrayDeque.removeFirst();
                r32.A00();
                AnonymousClass6Jl[] r22 = r5.A0B;
                int i2 = r5.A00;
                r5.A00 = i2 + 1;
                r22[i2] = r32;
            }
            while (true) {
                ArrayDeque arrayDeque2 = r5.A0A;
                if (!arrayDeque2.isEmpty()) {
                    ((SimpleOutputBuffer) arrayDeque2.removeFirst()).release();
                }
            }
        }
        this.A0E = false;
    }

    public void A0D(boolean z, boolean z2) {
        C150237Pv r3 = new C150237Pv();
        this.A07 = r3;
        C150677Rt r2 = this.A0I;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, r3, 1);
        }
        C157937jA r0 = this.A04;
        r0.getClass();
        if (r0.A00 != 0) {
            throw AnonymousClass6CA.A0O();
        }
    }

    public final void A0E() {
        if (this.A09 == null) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C153827c5.A01("createAudioDecoder");
                C166637z1 r1 = this.A06;
                int i = r1.A0A;
                if (i == -1) {
                    i = 5760;
                }
                OpusDecoder opusDecoder = new OpusDecoder(r1.A0T, i);
                this.A00 = opusDecoder.A01;
                this.A04 = 48000;
                this.A09 = opusDecoder;
                C153827c5.A00();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                C150677Rt r5 = this.A0I;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("libopus");
                String A0X = AnonymousClass000.A0X(OpusLibrary.opusGetVersion(), A0o);
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = r5.A00;
                if (handler != null) {
                    handler.post(new AnonymousClass8ML(r5, A0X, 0, elapsedRealtime2, j));
                }
                this.A07.A01++;
            } catch (C125796Jm e) {
                throw A07(this.A06, e, 5001);
            }
        }
    }

    public final void A0G() {
        C152737a2 r1 = this.A09;
        if (r1 != null) {
            this.A08 = null;
            this.A0A = null;
            r1.A01();
            this.A09 = null;
            this.A07.A02++;
            this.A01 = 0;
            this.A0E = false;
        }
    }

    public final void A0H() {
        long A012 = this.A0J.A01(BHW());
        if (A012 != Long.MIN_VALUE) {
            if (!this.A0C) {
                A012 = Math.max(this.A05, A012);
            }
            this.A05 = A012;
            this.A0C = false;
        }
    }

    public final void A0I(C166637z1 r4) {
        C166637z1 r2 = this.A06;
        this.A06 = r4;
        C166657z3 r1 = r4.A0L;
        C166657z3 r0 = null;
        if (r2 != null) {
            r0 = r2.A0L;
        }
        if (!Util.A0D(r1, r0)) {
            C166637z1 r22 = this.A06;
            if (r22.A0L != null) {
                throw A07(r22, new C144056zw("Media requires a DrmSessionManager"), 5002);
            }
        }
        if (this.A0E) {
            this.A01 = 1;
        } else {
            A0G();
            A0E();
            this.A0D = true;
        }
        this.A02 = r4.A07;
        this.A03 = r4.A08;
        C150677Rt r23 = this.A0I;
        Handler handler = r23.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r23, r4, 2);
        }
    }

    public C158167jX BBQ() {
        return this.A0J.A03().A02;
    }

    public long BBa() {
        if (this.A01 == 2) {
            A0H();
        }
        return this.A05;
    }

    public boolean BHW() {
        if (!this.A0G) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = this.A0J;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0O || defaultAudioSink.A0D()) {
            return false;
        }
        return true;
    }

    public boolean BIe() {
        boolean BIe;
        if (this.A0J.A0D()) {
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        if (BFS()) {
            BIe = this.A08;
        } else {
            C185238tJ r0 = this.A06;
            r0.getClass();
            BIe = r0.BIe();
        }
        if (BIe || this.A0A != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0193, code lost:
        r3.release();
        r13.A0A = null;
        A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00db, code lost:
        if (r13.A01 != 2) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dd, code lost:
        A0G();
        A0E();
        r13.A0D = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjR(long r14, long r16) {
        /*
            r13 = this;
            boolean r0 = r13.A0G
            r8 = 5002(0x138a, float:7.009E-42)
            if (r0 == 0) goto L_0x000c
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r13.A0J     // Catch:{ 6z6 -> 0x01a6 }
            r0.A05()     // Catch:{ 6z6 -> 0x01a6 }
            return
        L_0x000c:
            X.7z1 r0 = r13.A06
            if (r0 != 0) goto L_0x0024
            X.6Jl r3 = r13.A0K
            r3.A00()
            X.79v r2 = r13.A0H
            r0 = 2
            int r1 = r13.A06(r2, r3, r0)
            r0 = -5
            if (r1 != r0) goto L_0x01b6
            X.7z1 r0 = r2.A00
            r13.A0I(r0)
        L_0x0024:
            r13.A0E()
            X.7a2 r0 = r13.A09
            if (r0 == 0) goto L_0x01cb
            r7 = 5001(0x1389, float:7.008E-42)
            java.lang.String r0 = "drainAndFeed"
            X.C153827c5.A01(r0)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x0032:
            com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer r3 = r13.A0A     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r5 = 0
            if (r3 != 0) goto L_0x005f
            X.7a2 r1 = r13.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            java.lang.Object r2 = r1.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            monitor-enter(r2)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.6zG r0 = r1.A03     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x00d3
            java.util.ArrayDeque r1 = r1.A0A     // Catch:{ all -> 0x00d4 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x004b
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            r3 = 0
            goto L_0x0052
        L_0x004b:
            java.lang.Object r3 = r1.removeFirst()     // Catch:{ all -> 0x00d4 }
            com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer r3 = (com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer) r3     // Catch:{ all -> 0x00d4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
        L_0x0052:
            r13.A0A = r3     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r3 == 0) goto L_0x00e5
            X.7Pv r2 = r13.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r1 = r2.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r3.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r1 = r1 + r0
            r2.A09 = r1     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x005f:
            r1 = 4
            int r0 = r3.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L_0x006d
            goto L_0x00d8
        L_0x006d:
            boolean r0 = r13.A0D     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "audio/raw"
            int r3 = r13.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r2 = r13.A04     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7it r1 = new X.7it     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.<init>()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0P = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0R = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0N = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = -1
            r1.A03 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A09 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A04 = r3     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0E = r2     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = 2
            r1.A0A = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0S = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0K = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0F = r5     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.A0Q = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7z1 r0 = new X.7z1     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.<init>(r1)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7it r2 = new X.7it     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r2.<init>(r0)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r13.A02     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r2.A06 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r13.A03     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r2.A07 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7z1 r1 = new X.7z1     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1.<init>(r2)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r13.A0J     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.A0A(r1, r4)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0D = r5     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x00b4:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r3 = r13.A0J     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r13.A0A     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            java.nio.ByteBuffer r2 = r0.data     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            long r0 = r0.A01     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            boolean r0 = r3.A0G(r2, r0)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r0 == 0) goto L_0x00e5
            X.7Pv r1 = r13.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r1.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r0 + 1
            r1.A07 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r13.A0A     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.release()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0A = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x0032
        L_0x00d3:
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            goto L_0x01a0
        L_0x00d8:
            int r1 = r13.A01     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = 2
            if (r1 != r0) goto L_0x0193
            r13.A0G()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0E()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0D = r2     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x00e5:
            X.7a2 r5 = r13.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r12 = 0
            if (r5 == 0) goto L_0x012f
            int r0 = r13.A01     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r3 = 2
            if (r0 == r3) goto L_0x012f
            boolean r0 = r13.A0F     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r0 != 0) goto L_0x012f
            X.6Jl r1 = r13.A08     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r1 != 0) goto L_0x011d
            java.lang.Object r4 = r5.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            monitor-enter(r4)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.6zG r0 = r5.A03     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x019d
            X.6Jl r0 = r5.A04     // Catch:{ all -> 0x019e }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.C159197lM.A02(r0)     // Catch:{ all -> 0x019e }
            int r1 = r5.A00     // Catch:{ all -> 0x019e }
            if (r1 != 0) goto L_0x010e
            r1 = 0
            goto L_0x0115
        L_0x010e:
            X.6Jl[] r0 = r5.A0B     // Catch:{ all -> 0x019e }
            int r1 = r1 - r2
            r5.A00 = r1     // Catch:{ all -> 0x019e }
            r1 = r0[r1]     // Catch:{ all -> 0x019e }
        L_0x0115:
            r5.A04 = r1     // Catch:{ all -> 0x019e }
            monitor-exit(r4)     // Catch:{ all -> 0x019e }
            r13.A08 = r1     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r1 != 0) goto L_0x011d
            goto L_0x012f
        L_0x011d:
            int r0 = r13.A01     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r9 = 0
            r11 = 1
            if (r0 != r11) goto L_0x0133
            r0 = 4
            r1.A00 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7a2 r0 = r13.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.A02(r1)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A08 = r9     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A01 = r3     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x012f:
            X.C153827c5.A00()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x01a1
        L_0x0133:
            X.79v r2 = r13.A0H     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r1 = r13.A06(r2, r1, r12)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = -3
            if (r1 == r0) goto L_0x012f
            r0 = -5
            if (r1 != r0) goto L_0x0140
            goto L_0x0153
        L_0x0140:
            X.6Jl r2 = r13.A08     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1 = 4
            int r0 = r2.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0159
            r13.A0F = r11     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7a2 r0 = r13.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.A02(r2)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A08 = r9     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x012f
        L_0x0153:
            X.7z1 r0 = r2.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0I(r0)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x00e5
        L_0x0159:
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r0 == 0) goto L_0x0160
            r0.flip()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x0160:
            X.6Jl r10 = r13.A08     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            boolean r0 = r13.A0B     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            if (r0 == 0) goto L_0x0180
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r10.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0 = r0 & r1
            if (r0 == r1) goto L_0x0180
            long r5 = r10.A00     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            long r0 = r13.A05     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            long r3 = X.AnonymousClass6C9.A0N(r5, r0)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
            r13.A05 = r5     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x017e:
            r13.A0B = r12     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x0180:
            X.7a2 r0 = r13.A09     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r0.A02(r10)     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0E = r11     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            X.7Pv r1 = r13.A07     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r1.A06     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A08 = r9     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x00e5
        L_0x0193:
            r3.release()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0A = r4     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            r13.A0F()     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
            goto L_0x00e5
        L_0x019d:
            throw r0     // Catch:{ all -> 0x019e }
        L_0x019e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019e }
        L_0x01a0:
            throw r0     // Catch:{ 6Jm | 6z5 | 6zQ -> 0x01ae }
        L_0x01a1:
            X.7Pv r0 = r13.A07
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x01a6:
            r1 = move-exception
            X.7z1 r0 = r13.A06
            X.6JW r0 = r13.A07(r0, r1, r8)
            throw r0
        L_0x01ae:
            r1 = move-exception
            X.7z1 r0 = r13.A06
            X.6JW r0 = r13.A07(r0, r1, r7)
            throw r0
        L_0x01b6:
            r0 = -4
            if (r1 != r0) goto L_0x01cb
            r1 = 4
            int r0 = r3.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C159197lM.A02(r0)
            r0 = 1
            r13.A0F = r0
            r13.A0F()
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JR.BjR(long, long):void");
    }

    public C158167jX Bmx(C158167jX r2) {
        this.A0J.A0B(r2);
        return r2;
    }

    public final int BqN(C166637z1 r5) {
        int i = r5.A06;
        boolean z = true;
        if (i != 0 && (i == 1 || i != 1)) {
            z = false;
        }
        if (!"audio/opus".equalsIgnoreCase(r5.A0S)) {
            return 0;
        }
        if (!this.A0J.A0F(r5.A05, 2)) {
            return 1;
        }
        if (z) {
            return 44;
        }
        return 2;
    }

    public String getName() {
        return "LibopusAudioRenderer";
    }
}
