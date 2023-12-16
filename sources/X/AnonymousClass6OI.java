package X;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.ext.opus.OpusDecoder;

/* renamed from: X.6OI  reason: invalid class name */
public class AnonymousClass6OI extends AnonymousClass861 implements C184928sm {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C166527yp A04;
    public C185818uI A05;
    public C150277Pz A06;
    public C126496Oc A07;
    public SimpleOutputBuffer A08;
    public C178058gt A09;
    public C178058gt A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass7VZ A0H;
    public final C186418vH A0I;
    public final C126496Oc A0J;

    public AnonymousClass6OI(Handler handler, C186238uy r3, C186418vH r4) {
        this(handler, r3, r4, 0);
    }

    public void A0B() {
        this.A04 = null;
        this.A0D = true;
        try {
            this.A0A = null;
            A0F();
            this.A0I.reset();
        } finally {
            this.A0H.A00(this.A06);
        }
    }

    public final void A0F() {
        this.A07 = null;
        this.A08 = null;
        this.A00 = 0;
        this.A0E = false;
        C185818uI r2 = this.A05;
        if (r2 != null) {
            this.A06.A01++;
            r2.release();
            AnonymousClass7VZ r4 = this.A0H;
            String name = this.A05.getName();
            Handler handler = r4.A00;
            if (handler != null) {
                handler.post(new C71323bv(0, name, r4));
            }
            this.A05 = null;
        }
        this.A09 = null;
    }

    public void A0C(long j, boolean z) {
        this.A0I.flush();
        this.A03 = j;
        this.A0B = true;
        this.A0C = true;
        this.A0F = false;
        this.A0G = false;
        if (this.A05 == null) {
            return;
        }
        if (this.A00 != 0) {
            A0F();
            A0E();
            return;
        }
        this.A07 = null;
        SimpleOutputBuffer simpleOutputBuffer = this.A08;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.A08 = null;
        }
        this.A05.flush();
        this.A0E = false;
    }

    public void A0D(boolean z, boolean z2) {
        C150277Pz r3 = new C150277Pz();
        this.A06 = r3;
        AnonymousClass7VZ r2 = this.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, r3, 27);
        }
        C157957jC r0 = this.A04;
        r0.getClass();
        boolean z3 = r0.A00;
        AnonymousClass86A r22 = (AnonymousClass86A) this.A0I;
        if (z3) {
            C161487pm.A04(r22.A0P);
            if (!r22.A0W) {
                r22.A0W = true;
            } else {
                return;
            }
        } else if (r22.A0W) {
            r22.A0W = false;
        } else {
            return;
        }
        r22.flush();
    }

    public final void A0E() {
        if (this.A05 == null) {
            this.A09 = this.A0A;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Trace.beginSection("createAudioDecoder");
                C166527yp r4 = this.A04;
                Trace.beginSection("createOpusDecoder");
                boolean A1U = AnonymousClass000.A1U(this.A0I.B7p(C162387ry.A06(4, r4.A06, r4.A0F)), 2);
                int i = r4.A0A;
                if (i == -1) {
                    i = 5760;
                }
                OpusDecoder opusDecoder = new OpusDecoder(r4.A0U, i, A1U);
                Trace.endSection();
                this.A05 = opusDecoder;
                Trace.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                AnonymousClass7VZ r7 = this.A0H;
                String name = this.A05.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = r7.A00;
                if (handler != null) {
                    handler.post(new AnonymousClass8ML(r7, name, 2, elapsedRealtime2, j));
                }
                this.A06.A00++;
            } catch (C143896ze | OutOfMemoryError e) {
                throw A06(this.A04, e, false);
            }
        }
    }

    public final void A0G() {
        long B6X = this.A0I.B6X(BHW());
        if (B6X != Long.MIN_VALUE) {
            if (!this.A0C) {
                B6X = Math.max(this.A03, B6X);
            }
            this.A03 = B6X;
            this.A0C = false;
        }
    }

    public final void A0H(C147807Fu r12) {
        int i;
        Handler handler;
        C172708Mj r3;
        C166527yp r7 = r12.A00;
        r7.getClass();
        C178058gt r2 = r12.A01;
        this.A0A = r2;
        C166527yp r6 = this.A04;
        this.A04 = r7;
        this.A01 = r7.A07;
        this.A02 = r7.A08;
        C185818uI r1 = this.A05;
        if (r1 == null) {
            A0E();
            AnonymousClass7VZ r5 = this.A0H;
            C166527yp r22 = this.A04;
            handler = r5.A00;
            if (handler != null) {
                r3 = new C172708Mj(r5, r22, (Object) null, 7);
            } else {
                return;
            }
        } else {
            C178058gt r0 = this.A09;
            String name = r1.getName();
            if (r2 != r0) {
                i = 128;
            } else {
                i = 1;
            }
            C151887Wr r52 = new C151887Wr(r6, r7, name, 0, i);
            if (this.A0E) {
                this.A00 = 1;
            } else {
                A0F();
                A0E();
                this.A0D = true;
            }
            AnonymousClass7VZ r23 = this.A0H;
            C166527yp r13 = this.A04;
            handler = r23.A00;
            if (handler != null) {
                r3 = new C172708Mj(r23, r13, r52, 7);
            } else {
                return;
            }
        }
        handler.post(r3);
    }

    public C158477k2 BBR() {
        return ((AnonymousClass86A) this.A0I).A04().A02;
    }

    public long BBa() {
        if (this.A01 == 2) {
            A0G();
        }
        return this.A03;
    }

    public boolean BHW() {
        if (!this.A0G) {
            return false;
        }
        AnonymousClass86A r1 = (AnonymousClass86A) this.A0I;
        if (r1.A0C == null) {
            return true;
        }
        if (!r1.A0Q || r1.BFP()) {
            return false;
        }
        return true;
    }

    public boolean BIe() {
        boolean BIe;
        if (this.A0I.BFP()) {
            return true;
        }
        if (this.A04 == null) {
            return false;
        }
        if (BFS()) {
            BIe = this.A06;
        } else {
            C185338tU r0 = this.A05;
            r0.getClass();
            BIe = r0.BIe();
        }
        if (BIe || this.A08 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r11.A00 != 2) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        A0F();
        A0E();
        r11.A0D = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0103, code lost:
        r6.release();
        r11.A08 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r11.A0G = true;
        r11.A0I.Bgu();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0164, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0165, code lost:
        r0 = A06(r2.format, r2, r2.isRecoverable);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjR(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x000a
            X.8vH r0 = r11.A0I     // Catch:{ 6z8 -> 0x0194 }
            r0.Bgu()     // Catch:{ 6z8 -> 0x0194 }
            return
        L_0x000a:
            X.7yp r0 = r11.A04
            if (r0 != 0) goto L_0x0025
            X.7Fu r4 = r11.A0A
            r0 = 0
            r4.A01 = r0
            r4.A00 = r0
            X.6Oc r3 = r11.A0J
            r3.clear()
            r2 = 1
            int r1 = r11.A05(r4, r3, r2)
            r0 = -5
            if (r1 != r0) goto L_0x0178
            r11.A0H(r4)
        L_0x0025:
            r11.A0E()
            X.8uI r0 = r11.A05
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = "drainAndFeed"
            android.os.Trace.beginSection(r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x0031:
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r6 = r11.A08     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r3 = 0
            if (r6 != 0) goto L_0x0054
            X.8uI r0 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            java.lang.Object r6 = r0.B1V()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r6 = (com.google.android.exoplayer2.decoder.SimpleOutputBuffer) r6     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A08 = r6     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r6 == 0) goto L_0x0069
            int r2 = r6.skippedOutputBufferCount     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r2 <= 0) goto L_0x0054
            X.7Pz r1 = r11.A06     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r1.A08     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r0 + r2
            r1.A08 = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.8vH r1 = r11.A0I     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.86A r1 = (X.AnonymousClass86A) r1     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0 = 1
            r1.A0U = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x0054:
            boolean r0 = X.C153567bZ.A00(r6)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0111
            int r1 = r11.A00     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0 = 2
            if (r1 != r0) goto L_0x0103
            r11.A0F()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A0E()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A0D = r5     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x0069:
            X.8uI r3 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r10 = 0
            if (r3 == 0) goto L_0x0098
            int r0 = r11.A00     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r2 = 2
            if (r0 == r2) goto L_0x0098
            boolean r0 = r11.A0F     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 != 0) goto L_0x0098
            X.6Oc r1 = r11.A07     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r1 != 0) goto L_0x0086
            java.lang.Object r1 = r3.B1R()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.6Oc r1 = (X.C126496Oc) r1     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A07 = r1     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r1 != 0) goto L_0x0086
            goto L_0x0098
        L_0x0086:
            int r0 = r11.A00     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r7 = 0
            r9 = 1
            if (r0 != r9) goto L_0x009d
            r0 = 4
            r1.flags = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.8uI r0 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0.Bi7(r1)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A07 = r7     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A00 = r2     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x0098:
            android.os.Trace.endSection()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x019e
        L_0x009d:
            X.7Fu r2 = r11.A0A     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r2.A01 = r7     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r2.A00 = r7     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r1 = r11.A05(r2, r1, r10)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0 = -5
            if (r1 == r0) goto L_0x00fe
            r0 = -4
            if (r1 == r0) goto L_0x00b2
            r0 = -3
            if (r1 == r0) goto L_0x0098
            goto L_0x015f
        L_0x00b2:
            X.6Oc r1 = r11.A07     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            boolean r0 = X.C153567bZ.A00(r1)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 == 0) goto L_0x00c4
            r11.A0F = r9     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.8uI r0 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0.Bi7(r1)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A07 = r7     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x0098
        L_0x00c4:
            r1.A00()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.6Oc r8 = r11.A07     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            boolean r0 = r11.A0B     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 == 0) goto L_0x00eb
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r8.flags     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 != 0) goto L_0x00eb
            long r5 = r8.A00     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            long r0 = r11.A03     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            long r3 = X.AnonymousClass6C9.A0N(r5, r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            r11.A03 = r5     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x00e9:
            r11.A0B = r10     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x00eb:
            X.8uI r0 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0.Bi7(r8)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A0E = r9     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.7Pz r1 = r11.A06     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r1.A04     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r0 + 1
            r1.A04 = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A07 = r7     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x0069
        L_0x00fe:
            r11.A0H(r2)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x0069
        L_0x0103:
            r6.release()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A08 = r4     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A0G = r5     // Catch:{ 6z8 -> 0x0164 }
            X.8vH r0 = r11.A0I     // Catch:{ 6z8 -> 0x0164 }
            r0.Bgu()     // Catch:{ 6z8 -> 0x0164 }
            goto L_0x0069
        L_0x0111:
            boolean r0 = r11.A0D     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 == 0) goto L_0x0140
            X.8uI r1 = r11.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            com.google.android.exoplayer2.ext.opus.OpusDecoder r1 = (com.google.android.exoplayer2.ext.opus.OpusDecoder) r1     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            boolean r0 = r1.A05     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r2 = 2
            if (r0 == 0) goto L_0x011f
            r2 = 4
        L_0x011f:
            int r1 = r1.A01     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0 = 48000(0xbb80, float:6.7262E-41)
            X.7yp r0 = X.C162387ry.A06(r2, r1, r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.7he r1 = new X.7he     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r1.<init>(r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r11.A01     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r1.A05 = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r11.A02     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r1.A06 = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.7yp r1 = X.C166527yp.A00(r1)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.8vH r0 = r11.A0I     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0.AzT(r1, r4, r3)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A0D = r3     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x0140:
            X.8vH r3 = r11.A0I     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r11.A08     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            java.nio.ByteBuffer r2 = r0.data     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            long r0 = r0.timeUs     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            boolean r0 = r3.BEu(r2, r5, r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            if (r0 == 0) goto L_0x0069
            X.7Pz r1 = r11.A06     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r1.A06     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            com.google.android.exoplayer2.decoder.SimpleOutputBuffer r0 = r11.A08     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r0.release()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            r11.A08 = r4     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x0031
        L_0x015f:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            goto L_0x016d
        L_0x0164:
            r2 = move-exception
            X.7yp r1 = r2.format     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            boolean r0 = r2.isRecoverable     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
            X.6zd r0 = r11.A06(r1, r2, r0)     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x016d:
            throw r0     // Catch:{ 6ze -> 0x0174, 6zU -> 0x018f, 6z7 -> 0x016e }
        L_0x016e:
            r2 = move-exception
            X.7yp r1 = r2.format
            boolean r0 = r2.isRecoverable
            goto L_0x0199
        L_0x0174:
            r2 = move-exception
            X.7yp r1 = r11.A04
            goto L_0x0192
        L_0x0178:
            r0 = -4
            if (r1 != r0) goto L_0x01a2
            boolean r0 = X.C153567bZ.A00(r3)
            X.C161487pm.A04(r0)
            r11.A0F = r2
            r11.A0G = r2     // Catch:{ 6z8 -> 0x018c }
            X.8vH r0 = r11.A0I     // Catch:{ 6z8 -> 0x018c }
            r0.Bgu()     // Catch:{ 6z8 -> 0x018c }
            return
        L_0x018c:
            r2 = move-exception
            r1 = 0
            goto L_0x0192
        L_0x018f:
            r2 = move-exception
            X.7yp r1 = r2.format
        L_0x0192:
            r0 = 0
            goto L_0x0199
        L_0x0194:
            r2 = move-exception
            X.7yp r1 = r2.format
            boolean r0 = r2.isRecoverable
        L_0x0199:
            X.6zd r0 = r11.A06(r1, r2, r0)
            throw r0
        L_0x019e:
            X.7Pz r0 = r11.A06
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6OI.BjR(long, long):void");
    }

    public void Bmy(C158477k2 r2) {
        this.A0I.Bmy(r2);
    }

    public final int BqO(C166527yp r5) {
        String str = r5.A0T;
        if (!C162107rG.A03(str)) {
            return 0;
        }
        boolean z = true;
        if (r5.A0N != null) {
            z = false;
        }
        if (!"audio/opus".equalsIgnoreCase(str)) {
            return 0;
        }
        if (((AnonymousClass86A) this.A0I).B7p(C162387ry.A06(2, r5.A06, r5.A0F)) == 0) {
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

    public AnonymousClass6OI(Handler handler, C186238uy r5, C186418vH r6, int i) {
        super(1);
        this.A0H = new AnonymousClass7VZ(handler, r5);
        this.A0I = r6;
        ((AnonymousClass86A) r6).A0F = new AnonymousClass868(this);
        this.A0J = new C126496Oc(0);
        this.A00 = 0;
        this.A0D = true;
    }

    public AnonymousClass6OI() {
        this((Handler) null, (C186238uy) null, new AnonymousClass86A((C160527no) null, new AnonymousClass86C(new C187058wN[0])), 0);
    }
}
