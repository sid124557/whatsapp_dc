package X;

import android.media.MediaCodec;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;

/* renamed from: X.6JQ  reason: invalid class name */
public abstract class AnonymousClass6JQ extends C1673180p {
    public static final byte[] A0l = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06 = -9223372036854775807L;
    public long A07 = -9223372036854775807L;
    public long A08;
    public long A09;
    public C166637z1 A0A;
    public C150237Pv A0B;
    public C184698sN A0C;
    public C184698sN A0D;
    public C186508vT A0E;
    public C160577nt A0F;
    public C143826zX A0G;
    public String A0H;
    public ByteBuffer A0I;
    public ArrayDeque A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y;
    public final int A0Z;
    public final int A0a;
    public final MediaCodec.BufferInfo A0b;
    public final C1463279v A0c;
    public final AnonymousClass6Jl A0d;
    public final AnonymousClass6Jl A0e;
    public final C185208tG A0f;
    public final C187008wI A0g;
    public final C147717Fj A0h;
    public final AnonymousClass7QT A0i;
    public final List A0j;
    public final boolean A0k;

    public void A0B() {
        this.A0A = null;
        this.A0J = null;
        try {
            A0G();
            try {
                C184698sN r1 = this.A0C;
                if (r1 != null) {
                    this.A0f.Biw(r1);
                }
                try {
                    A01(this);
                } finally {
                    this.A0C = null;
                    this.A0D = null;
                }
            } catch (Throwable th) {
                A01(this);
                throw th;
            } finally {
                this.A0C = null;
                this.A0D = null;
            }
        } catch (Throwable th2) {
            try {
                A01(this);
                throw th2;
            } finally {
                this.A0C = null;
                this.A0D = null;
            }
        } finally {
        }
    }

    public void A0C(long j, boolean z) {
        this.A0R = false;
        this.A0S = false;
        if (this.A0E != null) {
            A0F();
        }
    }

    public final void A0J() {
        this.A03 = -1;
        this.A0d.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r0 <= r8) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(android.media.MediaCrypto r14, X.C166637z1 r15, X.C186508vT r16, X.C160577nt r17) {
        /*
            r13 = this;
            r3 = r13
            X.6Ju r3 = (X.C125866Ju) r3
            X.7z1[] r0 = r3.A0A
            r0.getClass()
            r2 = r17
            int r6 = r3.A0N(r15, r2)
            r3.A00 = r6
            java.lang.String r1 = r2.A02
            int r5 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 24
            if (r5 >= r0) goto L_0x00f1
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "samsung"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "zeroflte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "herolte"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "heroqlte"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f1
        L_0x0044:
            r0 = 1
        L_0x0045:
            r3.A0B = r0
            boolean r0 = r2.A06
            r3.A0C = r0
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "audio/raw"
        L_0x0051:
            android.media.MediaFormat r9 = new android.media.MediaFormat
            r9.<init>()
            java.lang.String r2 = "mime"
            r9.setString(r2, r0)
            int r1 = r15.A05
            java.lang.String r0 = "channel-count"
            r9.setInteger(r0, r1)
            java.lang.String r1 = "sample-rate"
            int r0 = r15.A0F
            r9.setInteger(r1, r0)
            java.util.List r0 = r15.A0T
            X.AnonymousClass713.A00(r9, r0)
            java.lang.String r0 = "max-input-size"
            X.AnonymousClass6C9.A0u(r9, r0, r6)
            r0 = 23
            if (r5 < r0) goto L_0x007d
            java.lang.String r1 = "priority"
            r0 = 0
            r9.setInteger(r1, r0)
        L_0x007d:
            java.lang.String r1 = r15.A0O
            if (r1 == 0) goto L_0x00dc
            java.lang.String r0 = "mp4a.40.42"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dc
            X.7QT r6 = r3.A0i
            boolean r0 = r6.A0E
            if (r0 == 0) goto L_0x00dc
            java.lang.String r5 = "aac-drc-effect-type"
            int r7 = r6.A05
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x00d2
            int r7 = r6.A00
            int r8 = r6.A01
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 11
            int r0 = r1.get(r0)
            if (r0 >= r7) goto L_0x00aa
            r7 = 3
            if (r0 > r8) goto L_0x00ab
        L_0x00aa:
            r7 = 1
        L_0x00ab:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x00d2
            android.media.AudioManager r1 = r3.A06
            if (r1 != 0) goto L_0x00bf
            android.content.Context r1 = r3.A0D
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r3.A06 = r1
        L_0x00bf:
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r1.isBluetoothScoOn()
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r1.isBluetoothA2dpOn()
            if (r0 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 5
        L_0x00d2:
            r9.setInteger(r5, r7)
            int r1 = r6.A06
            java.lang.String r0 = "aac-target-ref-level"
            r9.setInteger(r0, r1)
        L_0x00dc:
            r10 = 0
            r12 = 0
            r8 = r14
            r7 = r16
            r11 = r10
            r7.AzS(r8, r9, r10, r11, r12)
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x00f4
            r3.A07 = r9
            java.lang.String r0 = r15.A0S
            r9.setString(r2, r0)
            return
        L_0x00f1:
            r0 = 0
            goto L_0x0045
        L_0x00f4:
            r3.A07 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.A0K(android.media.MediaCrypto, X.7z1, X.8vT, X.7nt):void");
    }

    public boolean A0M(C186508vT r9, ByteBuffer byteBuffer, int i, int i2, long j, long j2, long j3, boolean z) {
        C166637z1 r1;
        int i3;
        C125866Ju r4 = (C125866Ju) this;
        if (r4.A0C && (i2 & 2) != 0) {
            r9.Bir(i, false);
            return true;
        } else if (z) {
            r9.Bir(i, false);
            r4.A0B.A09++;
            r4.A0F.A0R = true;
            return true;
        } else {
            if (r4.A0H) {
                C166637z1 r2 = r4.A08;
                if ((!"audio/raw".equals(r2.A0S) || r2.A0B == 2) && i2 == 0 && r4.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
                    int position = byteBuffer.position();
                    int limit = byteBuffer.limit();
                    byteBuffer.position(10);
                    short s = byteBuffer.getShort();
                    byteBuffer.position(position);
                    byteBuffer.limit(limit);
                    int limit2 = r4.A01 + (byteBuffer.limit() - byteBuffer.position());
                    r4.A01 = limit2;
                    r4.A02++;
                    r4.A05 += (long) Math.abs(s);
                    if (limit2 >= r4.A03 * 2) {
                        r4.A01 = 0;
                        r4.A02 = 0;
                        r4.A05 = 0;
                    }
                }
            }
            if (r4.A0G && byteBuffer.limit() > byteBuffer.position()) {
                int position2 = byteBuffer.position();
                int limit3 = byteBuffer.limit();
                ByteBuffer allocate = ByteBuffer.allocate(limit3 - position2);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit3);
            }
            try {
                if (!r4.A0F.A0G(byteBuffer, j3)) {
                    return false;
                }
                r9.Bir(i, false);
                r4.A0B.A07++;
                return true;
            } catch (C143556z5 e) {
                e = e;
                r1 = r4.A08;
                i3 = 5001;
                throw r4.A07(r1, e, i3);
            } catch (C143566z6 e2) {
                e = e2;
                r1 = r4.A0A;
                i3 = 5002;
                throw r4.A07(r1, e, i3);
            }
        }
    }

    private void A00() {
        if (this.A02 == 2) {
            A0G();
            A0I();
            return;
        }
        this.A0S = true;
        A0H();
    }

    public static void A01(AnonymousClass6JQ r2) {
        C184698sN r1 = r2.A0D;
        if (r1 != null && r1 != r2.A0C) {
            r2.A0f.Biw(r1);
        }
    }

    public void A0D(boolean z, boolean z2) {
        this.A0B = new C150237Pv();
        this.A09 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r2 == null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0E(X.C166637z1 r4, X.C187008wI r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C125856Jt
            if (r0 == 0) goto L_0x000d
            java.lang.String r2 = r4.A0S
            if (r2 != 0) goto L_0x0027
        L_0x0008:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x000d:
            r1 = r3
            X.6Ju r1 = (X.C125866Ju) r1
            java.lang.String r2 = r4.A0S
            if (r2 == 0) goto L_0x0008
            int r0 = r4.A05
            boolean r0 = r1.A0P(r0, r2)
            if (r0 == 0) goto L_0x0027
            X.7nt r0 = r5.BAc()
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L_0x0027:
            r0 = 0
            java.util.List r0 = r5.B6o(r2, r6, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.A0E(X.7z1, X.8wI, boolean):java.util.List");
    }

    public void A0H() {
        if (this instanceof C125866Ju) {
            C125866Ju r3 = (C125866Ju) this;
            try {
                r3.A0F.A05();
            } catch (C143566z6 e) {
                throw r3.A07(r3.A08, e, 5002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027c, code lost:
        if ("OMX.rk.video_decoder.avc".equals(r6) == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028c, code lost:
        if ("OMX.broadcom.video_decoder.tunnel.secure".equals(r6) == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0296, code lost:
        if ("Amazon".equals(com.facebook.android.exoplayer2.util.Util.A03) == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a0, code lost:
        if ("AFTS".equals(com.facebook.android.exoplayer2.util.Util.A04) == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a4, code lost:
        if (r7.A07 == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b6, code lost:
        if ("OMX.google.vorbis.decoder".equals(r6) == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c6, code lost:
        if ("OMX.google.aac.decoder".equals(r6) == false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r12.requiresSecureDecoderComponent(r3) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02fd, code lost:
        if ("OMX.google.vorbis.decoder".equals(r6) == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0301, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0305, code lost:
        if (r5 <= 29) goto L_0x027e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
            r23 = this;
            r2 = r23
            X.8vT r0 = r2.A0E
            if (r0 != 0) goto L_0x0381
            X.7z1 r0 = r2.A0A
            if (r0 == 0) goto L_0x0381
            X.8sN r4 = r2.A0D
            r2.A0C = r4
            java.lang.String r3 = r0.A0S
            r1 = 0
            r13 = 1
            if (r4 == 0) goto L_0x0020
            X.7gO r0 = r4.B6H()
            if (r0 != 0) goto L_0x0028
            X.6tt r0 = r4.B7N()
            if (r0 == 0) goto L_0x0381
        L_0x0020:
            r12 = r1
        L_0x0021:
            r0 = 0
        L_0x0022:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0032
        L_0x0028:
            android.media.MediaCrypto r12 = r0.A00
            boolean r3 = r12.requiresSecureDecoderComponent(r3)
            r0 = 1
            if (r3 != 0) goto L_0x0022
            goto L_0x0021
        L_0x0032:
            java.util.ArrayDeque r7 = r2.A0J     // Catch:{ 6zX -> 0x0345 }
            r8 = 0
            if (r7 != 0) goto L_0x00cd
            X.8wI r7 = r2.A0g     // Catch:{ 6yN -> 0x00c1 }
            X.7z1 r5 = r2.A0A     // Catch:{ 6yN -> 0x00c1 }
            java.util.List r9 = r2.A0E(r5, r7, r0)     // Catch:{ 6yN -> 0x00c1 }
            boolean r5 = r9.isEmpty()     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x0076
            if (r0 == 0) goto L_0x0076
            X.7z1 r5 = r2.A0A     // Catch:{ 6yN -> 0x00c1 }
            java.util.List r9 = r2.A0E(r5, r7, r8)     // Catch:{ 6yN -> 0x00c1 }
            boolean r5 = r9.isEmpty()     // Catch:{ 6yN -> 0x00c1 }
            if (r5 != 0) goto L_0x0076
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = "Drm session requires secure decoder for "
            r6.append(r5)     // Catch:{ 6yN -> 0x00c1 }
            X.7z1 r5 = r2.A0A     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = r5.A0S     // Catch:{ 6yN -> 0x00c1 }
            r6.append(r5)     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = ", but no secure decoder available. Trying to proceed with "
            r6.append(r5)     // Catch:{ 6yN -> 0x00c1 }
            r6.append(r9)     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = "."
            java.lang.String r6 = X.AnonymousClass000.A0X(r5, r6)     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = "MediaCodecRenderer"
            android.util.Log.w(r5, r6)     // Catch:{ 6yN -> 0x00c1 }
        L_0x0076:
            boolean r5 = r9.isEmpty()     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x00a5
            boolean r5 = r2.A0V     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x00a5
            X.7z1 r5 = r2.A0A     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = X.C162317rh.A01(r5)     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x00a5
            java.util.List r7 = r7.B6o(r5, r8, r8)     // Catch:{ 6yN -> 0x00c1 }
            int r6 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 6yN -> 0x00c1 }
            r5 = 26
            if (r6 < r5) goto L_0x00a5
            X.7z1 r5 = r2.A0A     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r6 = r5.A0S     // Catch:{ 6yN -> 0x00c1 }
            java.lang.String r5 = "video/dolby-vision"
            boolean r5 = r5.equals(r6)     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x00a5
            boolean r5 = r7.isEmpty()     // Catch:{ 6yN -> 0x00c1 }
            if (r5 != 0) goto L_0x00a5
            r9 = r7
        L_0x00a5:
            boolean r5 = r2.A0k     // Catch:{ 6yN -> 0x00c1 }
            if (r5 == 0) goto L_0x00b3
            java.util.ArrayDeque r7 = new java.util.ArrayDeque     // Catch:{ 6yN -> 0x00c1 }
            r7.<init>(r9)     // Catch:{ 6yN -> 0x00c1 }
        L_0x00ae:
            r2.A0J = r7     // Catch:{ 6yN -> 0x00c1 }
            r2.A0G = r1     // Catch:{ 6yN -> 0x00c1 }
            goto L_0x00cd
        L_0x00b3:
            java.lang.Object r5 = r9.get(r8)     // Catch:{ 6yN -> 0x00c1 }
            java.util.List r5 = java.util.Collections.singletonList(r5)     // Catch:{ 6yN -> 0x00c1 }
            java.util.ArrayDeque r7 = new java.util.ArrayDeque     // Catch:{ 6yN -> 0x00c1 }
            r7.<init>(r5)     // Catch:{ 6yN -> 0x00c1 }
            goto L_0x00ae
        L_0x00c1:
            r8 = move-exception
            X.7z1 r7 = r2.A0A     // Catch:{ 6zX -> 0x0345 }
            r6 = -49998(0xffffffffffff3cb2, float:NaN)
            X.6zX r5 = new X.6zX     // Catch:{ 6zX -> 0x0345 }
            r5.<init>(r7, r8, r6, r0)     // Catch:{ 6zX -> 0x0345 }
            throw r5     // Catch:{ 6zX -> 0x0345 }
        L_0x00cd:
            X.7z1 r6 = r2.A0A     // Catch:{ 6zX -> 0x0345 }
            if (r6 == 0) goto L_0x00f1
            boolean r5 = r2.A0W     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x00f1
            java.lang.String r5 = "video/av01"
            java.lang.String r6 = r6.A0S     // Catch:{ 6zX -> 0x0345 }
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x00f1
            java.lang.String r15 = "meta.dav1d.av1.decoder"
            r19 = r8
            r14 = r1
            r16 = r6
            r17 = r8
            r18 = r13
            X.7nt r5 = X.C160577nt.A00(r14, r15, r16, r17, r18, r19)     // Catch:{ 6zX -> 0x0345 }
            r7.addFirst(r5)     // Catch:{ 6zX -> 0x0345 }
        L_0x00f1:
            java.util.ArrayDeque r5 = r2.A0J     // Catch:{ 6zX -> 0x0345 }
            boolean r5 = r5.isEmpty()     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x0104
            X.7z1 r7 = r2.A0A     // Catch:{ 6zX -> 0x0345 }
            r6 = -49999(0xffffffffffff3cb1, float:NaN)
            X.6zX r5 = new X.6zX     // Catch:{ 6zX -> 0x0345 }
            r5.<init>(r7, r1, r6, r0)     // Catch:{ 6zX -> 0x0345 }
        L_0x0103:
            throw r5     // Catch:{ 6zX -> 0x0345 }
        L_0x0104:
            java.util.ArrayDeque r5 = r2.A0J     // Catch:{ 6zX -> 0x0345 }
            java.lang.Object r7 = r5.peekFirst()     // Catch:{ 6zX -> 0x0345 }
            X.7nt r7 = (X.C160577nt) r7     // Catch:{ 6zX -> 0x0345 }
            boolean r6 = r2 instanceof X.C125856Jt     // Catch:{ 6zX -> 0x0345 }
            if (r6 == 0) goto L_0x0127
            r9 = r2
            X.6Jt r9 = (X.C125856Jt) r9     // Catch:{ 6zX -> 0x0345 }
            android.view.Surface r8 = r9.A0R     // Catch:{ 6zX -> 0x0345 }
            if (r8 == 0) goto L_0x0121
            boolean r5 = r9.A0W     // Catch:{ 6zX -> 0x0345 }
            if (r5 != 0) goto L_0x0127
            boolean r5 = r8.isValid()     // Catch:{ 6zX -> 0x0345 }
            if (r5 != 0) goto L_0x0127
        L_0x0121:
            boolean r5 = r9.A0S(r7)     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x0381
        L_0x0127:
            java.lang.String r10 = r7.A02     // Catch:{ Exception -> 0x01b9 }
            r8 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01b2 }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "createCodec:"
            java.lang.String r5 = X.AnonymousClass000.A0V(r5, r10, r9)     // Catch:{ Exception -> 0x01b2 }
            X.C153827c5.A01(r5)     // Catch:{ Exception -> 0x01b2 }
            X.7QT r9 = r2.A0i     // Catch:{ Exception -> 0x01b2 }
            boolean r11 = r9.A09     // Catch:{ Exception -> 0x01b2 }
            boolean r5 = r9.A0N     // Catch:{ Exception -> 0x01b2 }
            X.81D r14 = new X.81D     // Catch:{ Exception -> 0x01b2 }
            r14.<init>(r11, r5)     // Catch:{ Exception -> 0x01b2 }
            X.7kY r11 = X.C158787kY.A04     // Catch:{ Exception -> 0x01b2 }
            if (r6 == 0) goto L_0x014c
            r5 = 1
            goto L_0x014d
        L_0x014c:
            r5 = 0
        L_0x014d:
            X.8vT r8 = r11.A00(r14, r9, r10, r5)     // Catch:{ Exception -> 0x01b2 }
            r2.A0H = r10     // Catch:{ Exception -> 0x01b2 }
            X.C153827c5.A00()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "configureCodec"
            X.C153827c5.A01(r5)     // Catch:{ Exception -> 0x01b2 }
            X.7z1 r5 = r2.A0A     // Catch:{ Exception -> 0x01b2 }
            r2.A0K(r12, r5, r8, r7)     // Catch:{ Exception -> 0x01b2 }
            X.C153827c5.A00()     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r5 = "startCodec"
            X.C153827c5.A01(r5)     // Catch:{ Exception -> 0x01b2 }
            r8.start()     // Catch:{ Exception -> 0x01b2 }
            X.C153827c5.A00()     // Catch:{ Exception -> 0x01b2 }
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01b2 }
            r2.A0E = r8     // Catch:{ Exception -> 0x01b9 }
            r2.A0F = r7     // Catch:{ Exception -> 0x01b9 }
            long r20 = r18 - r15
            if (r6 == 0) goto L_0x0199
            r11 = r2
            X.6Jt r11 = (X.C125856Jt) r11     // Catch:{ Exception -> 0x01b9 }
            X.7FE r8 = r11.A0j     // Catch:{ Exception -> 0x01b9 }
            android.os.Handler r6 = r8.A00     // Catch:{ Exception -> 0x01b9 }
            if (r6 == 0) goto L_0x0191
            X.8ML r5 = new X.8ML     // Catch:{ Exception -> 0x01b9 }
            r16 = r10
            r17 = r13
            r14 = r5
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ Exception -> 0x01b9 }
            r6.post(r5)     // Catch:{ Exception -> 0x01b9 }
        L_0x0191:
            boolean r5 = r11.A0T(r10)     // Catch:{ Exception -> 0x01b9 }
            r11.A0Y = r5     // Catch:{ Exception -> 0x01b9 }
            goto L_0x0236
        L_0x0199:
            r5 = r2
            X.6Ju r5 = (X.C125866Ju) r5     // Catch:{ Exception -> 0x01b9 }
            X.7Rt r8 = r5.A0E     // Catch:{ Exception -> 0x01b9 }
            android.os.Handler r6 = r8.A00     // Catch:{ Exception -> 0x01b9 }
            if (r6 == 0) goto L_0x0236
            r17 = 0
            X.8ML r5 = new X.8ML     // Catch:{ Exception -> 0x01b9 }
            r16 = r10
            r14 = r5
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r20)     // Catch:{ Exception -> 0x01b9 }
            r6.post(r5)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x0236
        L_0x01b2:
            r5 = move-exception
            if (r8 == 0) goto L_0x01b8
            r8.release()     // Catch:{ Exception -> 0x01b9 }
        L_0x01b8:
            throw r5     // Catch:{ Exception -> 0x01b9 }
        L_0x01b9:
            r8 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = "Failed to initialize decoder: "
            java.lang.String r6 = X.AnonymousClass000.A0P(r7, r5, r6)     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = "MediaCodecRenderer"
            android.util.Log.w(r5, r6, r8)     // Catch:{ 6zX -> 0x0345 }
            java.util.ArrayDeque r5 = r2.A0J     // Catch:{ 6zX -> 0x0345 }
            r5.removeFirst()     // Catch:{ 6zX -> 0x0345 }
            X.7z1 r9 = r2.A0A     // Catch:{ 6zX -> 0x0345 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = "Decoder init failed: "
            r6.append(r5)     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = r7.A02     // Catch:{ 6zX -> 0x0345 }
            r6.append(r5)     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = ", "
            java.lang.String r17 = X.AnonymousClass000.A0P(r9, r5, r6)     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r6 = r9.A0S     // Catch:{ 6zX -> 0x0345 }
            boolean r5 = r8 instanceof android.media.MediaCodec.CodecException     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x0233
            r5 = r8
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r19 = r5.getDiagnosticInfo()     // Catch:{ 6zX -> 0x0345 }
        L_0x01f1:
            X.6zX r14 = new X.6zX     // Catch:{ 6zX -> 0x0345 }
            r20 = r8
            r21 = r0
            r16 = r1
            r18 = r6
            r15 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 6zX -> 0x0345 }
            X.6zX r5 = r2.A0G     // Catch:{ 6zX -> 0x0345 }
            if (r5 != 0) goto L_0x0211
            r2.A0G = r14     // Catch:{ 6zX -> 0x0345 }
        L_0x0205:
            java.util.ArrayDeque r5 = r2.A0J     // Catch:{ 6zX -> 0x0345 }
            boolean r5 = r5.isEmpty()     // Catch:{ 6zX -> 0x0345 }
            if (r5 == 0) goto L_0x0104
            X.6zX r5 = r2.A0G     // Catch:{ 6zX -> 0x0345 }
            goto L_0x0103
        L_0x0211:
            java.lang.String r18 = r5.getMessage()     // Catch:{ 6zX -> 0x0345 }
            java.lang.Throwable r21 = r5.getCause()     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r8 = r5.mimeType     // Catch:{ 6zX -> 0x0345 }
            boolean r7 = r5.secureDecoderRequired     // Catch:{ 6zX -> 0x0345 }
            X.7nt r6 = r5.codecInfo     // Catch:{ 6zX -> 0x0345 }
            java.lang.String r5 = r5.diagnosticInfo     // Catch:{ 6zX -> 0x0345 }
            X.6zX r15 = new X.6zX     // Catch:{ 6zX -> 0x0345 }
            r16 = r6
            r17 = r14
            r19 = r8
            r20 = r5
            r22 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 6zX -> 0x0345 }
            r2.A0G = r15     // Catch:{ 6zX -> 0x0345 }
            goto L_0x0205
        L_0x0233:
            r19 = 0
            goto L_0x01f1
        L_0x0236:
            boolean r8 = r9.A0Q
            X.7nt r7 = r2.A0F
            java.lang.String r6 = r7.A02
            int r5 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 25
            if (r5 > r0) goto L_0x0342
            java.lang.String r0 = "OMX.Exynos.avc.dec.secure"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0309
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "SM-T585"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "SM-A510"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "SM-A520"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "SM-J700"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x0309
        L_0x026c:
            r0 = 2
        L_0x026d:
            r2.A00 = r0
            r0 = 0
            if (r8 == 0) goto L_0x02a7
            r0 = 25
            if (r5 > r0) goto L_0x0303
            java.lang.String r0 = "OMX.rk.video_decoder.avc"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x02a6
        L_0x027e:
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x02a6
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x02a6
        L_0x028e:
            java.lang.String r9 = "Amazon"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0301
            java.lang.String r9 = "AFTS"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A04
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0301
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0301
        L_0x02a6:
            r0 = 1
        L_0x02a7:
            r2.A0N = r0
            r0 = 23
            if (r8 == 0) goto L_0x02f4
            if (r5 > r0) goto L_0x02b8
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r6)
            r7 = 1
            if (r0 != 0) goto L_0x02b9
        L_0x02b8:
            r7 = 0
        L_0x02b9:
            r2.A0L = r7
            r0 = 21
            if (r5 != r0) goto L_0x02c8
            java.lang.String r0 = "OMX.google.aac.decoder"
            boolean r5 = r0.equals(r6)
            r0 = 1
            if (r5 != 0) goto L_0x02c9
        L_0x02c8:
            r0 = 0
        L_0x02c9:
            r2.A0M = r0
            int r5 = r2.A01
            r0 = 2
            if (r5 != r0) goto L_0x02ee
            long r7 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 + r5
        L_0x02d7:
            r2.A05 = r7
            r2.A0J()
            r0 = -1
            r2.A04 = r0
            r2.A0I = r1
            r2.A07 = r3
            r2.A0X = r13
            X.7Pv r1 = r2.A0B
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
            return
        L_0x02ee:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02d7
        L_0x02f4:
            if (r5 > r0) goto L_0x02ff
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r6)
            r7 = 1
            if (r0 != 0) goto L_0x02b9
        L_0x02ff:
            r7 = 0
            goto L_0x02b9
        L_0x0301:
            r0 = 0
            goto L_0x02a7
        L_0x0303:
            r0 = 29
            if (r5 > r0) goto L_0x028e
            goto L_0x027e
        L_0x0309:
            r0 = 24
            if (r5 >= r0) goto L_0x0342
            java.lang.String r0 = "OMX.Nvidia.h264.decode"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "OMX.Nvidia.h264.decode.secure"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0342
        L_0x031d:
            java.lang.String r9 = com.facebook.android.exoplayer2.util.Util.A01
            java.lang.String r0 = "flounder"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x033f
            java.lang.String r0 = "flounder_lte"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x033f
            java.lang.String r0 = "grouper"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x033f
            java.lang.String r0 = "tilapia"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0342
        L_0x033f:
            r0 = 1
            goto L_0x026d
        L_0x0342:
            r0 = 0
            goto L_0x026d
        L_0x0345:
            r11 = move-exception
            int r7 = r2.A0a
            if (r7 <= 0) goto L_0x0378
            long r5 = r2.A07
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x035a
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r5
            long r7 = (long) r7
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0378
        L_0x035a:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x036b
            java.lang.String r3 = "MediaCodecRenderer"
            java.lang.String r0 = "Decoder initialization failed, retry"
            android.util.Log.w(r3, r0)
            long r3 = java.lang.System.currentTimeMillis()
            r2.A07 = r3
        L_0x036b:
            java.util.ArrayDeque r0 = r2.A0J
            if (r0 == 0) goto L_0x0381
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0381
            r2.A0J = r1
            return
        L_0x0378:
            X.7z1 r1 = r2.A0A
            r0 = 4001(0xfa1, float:5.607E-42)
            X.6JW r0 = r2.A07(r1, r11, r0)
            throw r0
        L_0x0381:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.A0I():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x015c, code lost:
        if (r8.A01(r9) != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        if (r2.A09 == r8.A09) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.C166637z1 r14) {
        /*
            r13 = this;
            X.7z1 r8 = r13.A0A
            r13.A0A = r14
            X.7z3 r1 = r14.A0L
            r3 = 0
            if (r8 != 0) goto L_0x002d
            r0 = r3
        L_0x000a:
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            X.7z1 r4 = r13.A0A
            X.7z3 r0 = r4.A0L
            if (r0 == 0) goto L_0x0074
            X.8tG r6 = r13.A0f
            if (r6 == 0) goto L_0x0066
            X.7QT r0 = r13.A0i
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x004a
            X.7mn r7 = X.C159977mn.A00()
            X.7z1 r0 = r13.A0A
            X.7z3 r5 = r0.A0L
            monitor-enter(r7)
            goto L_0x0030
        L_0x002d:
            X.7z3 r0 = r8.A0L
            goto L_0x000a
        L_0x0030:
            android.util.LruCache r0 = r7.A00     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            java.util.UUID r4 = X.C155567f7.A04     // Catch:{ all -> 0x0047 }
            r0 = 0
            X.7yl r4 = X.C1674180z.A00(r5, r4, r0)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0059
            android.util.LruCache r0 = r7.A00     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0047 }
            X.8sN r1 = (X.C184698sN) r1     // Catch:{ all -> 0x0047 }
            goto L_0x0059
        L_0x0047:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x004a:
            android.os.Looper r1 = android.os.Looper.myLooper()
            X.7z1 r0 = r13.A0A
            X.7z3 r0 = r0.A0L
            X.8sN r1 = r6.AwH(r1, r0)
            r13.A0D = r1
            goto L_0x005e
        L_0x0059:
            monitor-exit(r7)
            if (r1 == 0) goto L_0x004a
            r13.A0D = r1
        L_0x005e:
            X.8sN r0 = r13.A0C
            if (r1 != r0) goto L_0x0076
            r6.Biw(r1)
            goto L_0x0076
        L_0x0066:
            java.lang.String r0 = "Media requires a DrmSessionManager"
            X.6zw r1 = new X.6zw
            r1.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            X.6JW r0 = r13.A07(r4, r1, r0)
            throw r0
        L_0x0074:
            r13.A0D = r3
        L_0x0076:
            X.8sN r1 = r13.A0D
            X.8sN r0 = r13.A0C
            r6 = 0
            if (r1 != r0) goto L_0x01dd
            X.8vT r0 = r13.A0E
            if (r0 == 0) goto L_0x01dd
            X.7nt r5 = r13.A0F
            X.7z1 r9 = r13.A0A
            r4 = r13
            boolean r0 = r13 instanceof X.C125856Jt
            if (r0 == 0) goto L_0x00f2
            X.6Jt r4 = (X.C125856Jt) r4
            X.7z1 r7 = r4.A0A
            if (r7 == 0) goto L_0x00af
            boolean r0 = r4.A0W
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = r7.A0S
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.String r1 = r8.A0S
            java.lang.String r0 = r9.A0S
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00af
            int r1 = r8.A0E
            int r0 = r9.A0E
            if (r1 != r0) goto L_0x00af
        L_0x00ae:
            return
        L_0x00af:
            boolean r0 = r5.A03
            boolean r0 = X.C125856Jt.A05(r8, r9, r0)
            if (r0 == 0) goto L_0x01dd
            int r1 = r9.A0I
            X.7Iz r5 = r4.A0S
            int r0 = r5.A02
            if (r1 > r0) goto L_0x01dd
            int r1 = r9.A09
            int r0 = r5.A00
            if (r1 > r0) goto L_0x01dd
            int r1 = X.C125856Jt.A00(r9)
            X.7Iz r0 = r4.A0S
            int r0 = r0.A01
            if (r1 > r0) goto L_0x01dd
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x00ae
            r13.A0Q = r2
            r13.A01 = r2
            int r1 = r13.A00
            r0 = 2
            if (r1 == r0) goto L_0x00ee
            if (r1 != r2) goto L_0x00ef
            X.7z1 r2 = r13.A0A
            int r1 = r2.A0I
            int r0 = r8.A0I
            if (r1 != r0) goto L_0x00ef
            int r1 = r2.A09
            int r0 = r8.A09
            if (r1 != r0) goto L_0x00ef
        L_0x00ee:
            r6 = 1
        L_0x00ef:
            r13.A0K = r6
            return
        L_0x00f2:
            X.6Ju r4 = (X.C125866Ju) r4
            X.7QT r0 = r4.A0i
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x01dd
            int r1 = r4.A0N(r9, r5)
            int r0 = r4.A00
            if (r1 > r0) goto L_0x01dd
            java.lang.String r1 = r8.A0S
            java.lang.String r0 = r9.A0S
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            r12 = 0
            if (r0 != 0) goto L_0x010f
            r12 = 8
        L_0x010f:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x017e
            int r1 = r8.A0E
            int r0 = r9.A0E
            if (r1 == r0) goto L_0x011b
            r12 = r12 | 1024(0x400, float:1.435E-42)
        L_0x011b:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x012d
            int r1 = r8.A0I
            int r0 = r9.A0I
            if (r1 != r0) goto L_0x012b
            int r1 = r8.A09
            int r0 = r9.A09
            if (r1 == r0) goto L_0x012d
        L_0x012b:
            r12 = r12 | 512(0x200, float:7.175E-43)
        L_0x012d:
            X.7z0 r1 = r8.A0N
            X.7z0 r0 = r9.A0N
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r1, r0)
            if (r0 != 0) goto L_0x0139
            r12 = r12 | 2048(0x800, float:2.87E-42)
        L_0x0139:
            java.lang.String r10 = r5.A02
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "SM-T230"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0155
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x0155
            r12 = r12 | 2
        L_0x0155:
            if (r12 != 0) goto L_0x01d9
            boolean r0 = r8.A01(r9)
            r11 = 2
            if (r0 == 0) goto L_0x015f
        L_0x015e:
            r11 = 3
        L_0x015f:
            r12 = 0
        L_0x0160:
            X.7Wl r7 = new X.7Wl
            r7.<init>(r8, r9, r10, r11, r12)
            int r1 = r7.A01
            r0 = 2
            if (r1 == r0) goto L_0x016d
            r0 = 3
            if (r1 != r0) goto L_0x01dd
        L_0x016d:
            int r0 = r8.A07
            if (r0 != 0) goto L_0x01dd
            int r0 = r8.A08
            if (r0 != 0) goto L_0x01dd
            int r0 = r9.A07
            if (r0 != 0) goto L_0x01dd
            int r0 = r9.A08
            if (r0 != 0) goto L_0x01dd
            return
        L_0x017e:
            int r1 = r8.A05
            int r0 = r9.A05
            if (r1 == r0) goto L_0x0186
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x0186:
            int r1 = r8.A0F
            int r0 = r9.A0F
            if (r1 == r0) goto L_0x018e
            r12 = r12 | 8192(0x2000, float:1.14794E-41)
        L_0x018e:
            int r1 = r8.A0B
            int r0 = r9.A0B
            if (r1 == r0) goto L_0x0196
            r12 = r12 | 16384(0x4000, float:2.2959E-41)
        L_0x0196:
            if (r12 != 0) goto L_0x01bf
            java.lang.String r1 = "audio/mp4a-latm"
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01bf
            android.util.Pair r1 = X.C162317rh.A00(r8)
            android.util.Pair r0 = X.C162317rh.A00(r9)
            if (r1 == 0) goto L_0x01bf
            if (r0 == 0) goto L_0x01bf
            int r4 = X.C18280x3.A03(r1)
            int r1 = X.C18280x3.A03(r0)
            r0 = 42
            if (r4 != r0) goto L_0x01bf
            if (r1 != r0) goto L_0x01bf
            java.lang.String r10 = r5.A02
            goto L_0x015e
        L_0x01bf:
            boolean r0 = r8.A01(r9)
            if (r0 != 0) goto L_0x01c7
            r12 = r12 | 32
        L_0x01c7:
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d3
            r12 = r12 | 2
        L_0x01d3:
            if (r12 != 0) goto L_0x01d9
            java.lang.String r10 = r5.A02
            r11 = 1
            goto L_0x015f
        L_0x01d9:
            java.lang.String r10 = r5.A02
            r11 = 0
            goto L_0x0160
        L_0x01dd:
            r13.A0J = r3
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x01e6
            r13.A02 = r2
            return
        L_0x01e6:
            r13.A0G()
            r13.A0I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.A0L(X.7z1):void");
    }

    public boolean BHW() {
        if (!(this instanceof C125866Ju)) {
            return this.A0S;
        }
        C125866Ju r1 = (C125866Ju) this;
        if (!r1.A0S) {
            return false;
        }
        DefaultAudioSink defaultAudioSink = r1.A0F;
        if (defaultAudioSink.A0B == null) {
            return true;
        }
        if (!defaultAudioSink.A0O || defaultAudioSink.A0D()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BIe() {
        /*
            r5 = this;
            X.7z1 r0 = r5.A0A
            if (r0 != 0) goto L_0x003d
            X.6xQ r0 = X.C142576xQ.NULL_FORMAT
        L_0x0006:
            r5.A07 = r0
        L_0x0008:
            X.7z1 r0 = r5.A0A
            if (r0 == 0) goto L_0x005f
            boolean r0 = r5.A0Y
            if (r0 != 0) goto L_0x005f
            boolean r0 = r5.BFS()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r5.A08
        L_0x0018:
            if (r0 != 0) goto L_0x0031
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0031
            long r3 = r5.A05
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
        L_0x0031:
            r0 = 1
            return r0
        L_0x0033:
            X.8tJ r0 = r5.A06
            r0.getClass()
            boolean r0 = r0.BIe()
            goto L_0x0018
        L_0x003d:
            boolean r0 = r5.A0Y
            if (r0 == 0) goto L_0x0044
            X.6xQ r0 = X.C142576xQ.WAITING_FOR_KEYS
            goto L_0x0006
        L_0x0044:
            boolean r0 = r5.BFS()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r5.A08
        L_0x004c:
            if (r0 != 0) goto L_0x0008
            int r0 = r5.A04
            if (r0 >= 0) goto L_0x0008
            X.6xQ r0 = X.C142576xQ.NO_OUTPUT_BUFFER
            goto L_0x0006
        L_0x0055:
            X.8tJ r0 = r5.A06
            r0.getClass()
            boolean r0 = r0.BIe()
            goto L_0x004c
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.BIe():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:267|268|269|270|271) */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x027d, code lost:
        if (r3.A02 == 2) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x027f, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x033a, code lost:
        if (r3.A01 != 2) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x033c, code lost:
        r7.A00();
        r3.A01 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0341, code lost:
        r3.A0R = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0345, code lost:
        if (r3.A0O != false) goto L_0x034c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0347, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x034e, code lost:
        if (r3.A0N != false) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0350, code lost:
        r3.A0P = true;
        r3.A0E.Bi5(r3.A03, 0, 0, 0, 4);
        A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04b5, code lost:
        if (r11 != false) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04c5, code lost:
        X.C153827c5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:270:0x04af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjR(long r28, long r30) {
        /*
            r27 = this;
            r4 = r28
            r3 = r27
            boolean r0 = r3.A0S
            if (r0 == 0) goto L_0x000c
            r3.A0H()
        L_0x000b:
            return
        L_0x000c:
            X.7z1 r0 = r3.A0A
            r6 = 1
            r9 = -4
            r10 = -5
            if (r0 != 0) goto L_0x0026
            X.6Jl r2 = r3.A0e
            r2.A00()
            X.79v r1 = r3.A0c
            r0 = 2
            int r0 = r3.A06(r1, r2, r0)
            if (r0 != r10) goto L_0x002e
            X.7z1 r0 = r1.A00
            r3.A0L(r0)
        L_0x0026:
            r3.A0I()
            X.8vT r0 = r3.A0E
            if (r0 == 0) goto L_0x04c9
            goto L_0x0042
        L_0x002e:
            if (r0 != r9) goto L_0x000b
            r1 = 4
            int r0 = r2.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C159197lM.A02(r0)
            r3.A0R = r6
            r3.A00()
            return
        L_0x0042:
            java.lang.String r0 = "drainAndFeed"
            X.C153827c5.A01(r0)     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0047:
            int r0 = r3.A04     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 >= 0) goto L_0x01ce
            r11 = 0
            boolean r0 = r3.A0M     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x005d
            boolean r0 = r3.A0P     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x005d
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0267 }
            android.media.MediaCodec$BufferInfo r7 = r3.A0b     // Catch:{ IllegalStateException -> 0x0267 }
            int r1 = r0.B1W(r7)     // Catch:{ IllegalStateException -> 0x0267 }
            goto L_0x0065
        L_0x005d:
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaCodec$BufferInfo r7 = r3.A0b     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r0.B1W(r7)     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0065:
            if (r1 < 0) goto L_0x00bf
            boolean r0 = r3.A0T     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x0073
            r3.A0T = r11     // Catch:{ IllegalStateException -> 0x0482 }
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            r0.Bir(r1, r11)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0047
        L_0x0073:
            int r0 = r7.size     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != 0) goto L_0x007f
            int r0 = r7.flags     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x007f
            goto L_0x027f
        L_0x007f:
            r3.A04 = r1     // Catch:{ IllegalStateException -> 0x0482 }
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r1 = r0.BAG(r1)     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A0I = r1     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 == 0) goto L_0x009a
            int r0 = r7.offset     // Catch:{ IllegalStateException -> 0x0482 }
            r1.position(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r2 = r3.A0I     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r7.offset     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r7.size     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r1 + r0
            r2.limit(r1)     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x009a:
            long r1 = r7.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0482 }
            java.util.List r12 = r3.A0j     // Catch:{ IllegalStateException -> 0x0482 }
            int r11 = r12.size()     // Catch:{ IllegalStateException -> 0x0482 }
            r9 = 0
        L_0x00a3:
            if (r9 >= r11) goto L_0x00ba
            java.lang.Object r0 = r12.get(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            long r7 = X.C18320x8.A05(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            r12.remove(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x00b8
        L_0x00b5:
            int r9 = r9 + 1
            goto L_0x00a3
        L_0x00b8:
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            r3.A0U = r0     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x01ce
        L_0x00bf:
            r0 = -2
            if (r1 != r0) goto L_0x01c9
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaFormat r12 = r0.BAI()     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r3.A00     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            r1 = 32
            if (r0 != r1) goto L_0x00e2
            java.lang.String r0 = "height"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r1) goto L_0x00e2
            r3.A0T = r6     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0047
        L_0x00e2:
            X.8vT r7 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r3 instanceof X.C125856Jt     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x0159
            r8 = r3
            X.6Jt r8 = (X.C125856Jt) r8     // Catch:{ IllegalStateException -> 0x0482 }
            r8.A0P = r12     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r1 = "crop-right"
            boolean r0 = r12.containsKey(r1)     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r9 = "crop-top"
            java.lang.String r2 = "crop-bottom"
            java.lang.String r13 = "crop-left"
            if (r0 == 0) goto L_0x011c
            boolean r0 = r12.containsKey(r13)     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x011c
            boolean r0 = r12.containsKey(r2)     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x011c
            boolean r0 = r12.containsKey(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x011c
            r11 = 1
            int r1 = r12.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r12.getInteger(r13)     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r1 - r0
            int r0 = r1 + 1
        L_0x0119:
            r8.A06 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0123
        L_0x011c:
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0119
        L_0x0123:
            if (r11 == 0) goto L_0x0131
            int r1 = r12.getInteger(r2)     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r12.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r1 - r0
            int r9 = r1 + 1
            goto L_0x0137
        L_0x0131:
            java.lang.String r0 = "height"
            int r9 = r12.getInteger(r0)     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0137:
            r8.A05 = r9     // Catch:{ IllegalStateException -> 0x0482 }
            float r2 = r8.A01     // Catch:{ IllegalStateException -> 0x0482 }
            r8.A00 = r2     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r8.A0B     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 90
            if (r1 == r0) goto L_0x0147
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0152
        L_0x0147:
            int r0 = r8.A06     // Catch:{ IllegalStateException -> 0x0482 }
            r8.A06 = r9     // Catch:{ IllegalStateException -> 0x0482 }
            r8.A05 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            r8.A00 = r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0152:
            int r0 = r8.A0F     // Catch:{ IllegalStateException -> 0x0482 }
            r7.Bnn(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0047
        L_0x0159:
            r7 = r3
            X.6Ju r7 = (X.C125866Ju) r7     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaFormat r1 = r7.A07     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 == 0) goto L_0x0180
            java.lang.String r0 = "mime"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            int r13 = X.C162097rD.A00(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaFormat r0 = r7.A07     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x016c:
            java.lang.String r11 = "channel-count"
            int r1 = r0.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r9 = "sample-rate"
            int r0 = r0.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0 * r1
            r7.A03 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r7.A0B     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x01a5
            goto L_0x0192
        L_0x0180:
            X.7z1 r2 = r7.A08     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r1 = r2.A0S     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x018f
            int r13 = r2.A0B     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0190
        L_0x018f:
            r13 = 2
        L_0x0190:
            r0 = r12
            goto L_0x016c
        L_0x0192:
            r2 = 6
            if (r1 != r2) goto L_0x01a5
            X.7z1 r0 = r7.A08     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r0.A05     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 >= r2) goto L_0x01a5
            int[] r8 = new int[r1]     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 0
        L_0x019e:
            if (r0 >= r1) goto L_0x01a6
            r8[r0] = r0     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0 + 1
            goto L_0x019e
        L_0x01a5:
            r8 = 0
        L_0x01a6:
            X.7it r2 = new X.7it     // Catch:{ IllegalStateException -> 0x0482 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.String r0 = "audio/raw"
            r2.A0R = r0     // Catch:{ IllegalStateException -> 0x0482 }
            r2.A0A = r13     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r12.getInteger(r11)     // Catch:{ IllegalStateException -> 0x0482 }
            r2.A04 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r12.getInteger(r9)     // Catch:{ IllegalStateException -> 0x0482 }
            r2.A0E = r0     // Catch:{ IllegalStateException -> 0x0482 }
            X.7z1 r1 = new X.7z1     // Catch:{ IllegalStateException -> 0x0482 }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x0482 }
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r0 = r7.A0F     // Catch:{ 6zQ -> 0x025d }
            r0.A0A(r1, r8)     // Catch:{ 6zQ -> 0x025d }
            goto L_0x0047
        L_0x01c9:
            r0 = -3
            if (r1 == r0) goto L_0x0047
            goto L_0x0272
        L_0x01ce:
            boolean r0 = r3.A0M     // Catch:{ IllegalStateException -> 0x0482 }
            r22 = r30
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r3.A0P     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x01fa
            X.8vT r11 = r3.A0E     // Catch:{ IllegalStateException -> 0x0267 }
            java.nio.ByteBuffer r9 = r3.A0I     // Catch:{ IllegalStateException -> 0x0267 }
            int r8 = r3.A04     // Catch:{ IllegalStateException -> 0x0267 }
            android.media.MediaCodec$BufferInfo r14 = r3.A0b     // Catch:{ IllegalStateException -> 0x0267 }
            int r7 = r14.flags     // Catch:{ IllegalStateException -> 0x0267 }
            long r0 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0267 }
            boolean r2 = r3.A0U     // Catch:{ IllegalStateException -> 0x0267 }
            r17 = r9
            r18 = r8
            r19 = r7
            r20 = r4
            r24 = r0
            r26 = r2
            r15 = r3
            r16 = r11
            boolean r0 = r15.A0M(r16, r17, r18, r19, r20, r22, r24, r26)     // Catch:{ IllegalStateException -> 0x0267 }
            goto L_0x021b
        L_0x01fa:
            X.8vT r11 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r9 = r3.A0I     // Catch:{ IllegalStateException -> 0x0482 }
            int r8 = r3.A04     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaCodec$BufferInfo r14 = r3.A0b     // Catch:{ IllegalStateException -> 0x0482 }
            int r7 = r14.flags     // Catch:{ IllegalStateException -> 0x0482 }
            long r0 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r2 = r3.A0U     // Catch:{ IllegalStateException -> 0x0482 }
            r17 = r9
            r18 = r8
            r19 = r7
            r20 = r4
            r24 = r0
            r26 = r2
            r15 = r3
            r16 = r11
            boolean r0 = r15.A0M(r16, r17, r18, r19, r20, r22, r24, r26)     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x021b:
            if (r0 == 0) goto L_0x0282
            long r1 = r14.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r3 instanceof X.C125856Jt     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x024b
            r13 = r3
            X.6Jt r13 = (X.C125856Jt) r13     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r13.A03     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0 - r6
            r13.A03 = r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x022b:
            int r15 = r13.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            if (r15 == 0) goto L_0x024b
            long[] r12 = r13.A0m     // Catch:{ IllegalStateException -> 0x0482 }
            r11 = 0
            r7 = r12[r11]     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x024b
            long[] r9 = r13.A0l     // Catch:{ IllegalStateException -> 0x0482 }
            r7 = r9[r11]     // Catch:{ IllegalStateException -> 0x0482 }
            r13.A0O = r7     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r15 + -1
            r13.A0A = r0     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.System.arraycopy(r9, r6, r9, r11, r0)     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r13.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            java.lang.System.arraycopy(r12, r6, r12, r11, r0)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x022b
        L_0x024b:
            int r0 = r14.flags     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass000.A1S(r0)
            r0 = -1
            r3.A04 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 0
            r3.A0I = r0     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 != 0) goto L_0x027f
            goto L_0x0047
        L_0x025d:
            r2 = move-exception
            X.7z1 r1 = r7.A08     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 5001(0x1389, float:7.008E-42)
            X.6JW r0 = r7.A07(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x0482 }
            throw r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0267:
            r3.A00()     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r3.A0S     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x0282
            r3.A0G()     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0282
        L_0x0272:
            boolean r0 = r3.A0N     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x0282
            boolean r0 = r3.A0R     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != 0) goto L_0x027f
            int r1 = r3.A02     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = 2
            if (r1 != r0) goto L_0x0282
        L_0x027f:
            r3.A00()     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0282:
            X.8vT r4 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            r2 = 0
            if (r4 == 0) goto L_0x02c5
            int r0 = r3.A02     // Catch:{ IllegalStateException -> 0x0482 }
            r1 = 2
            if (r0 == r1) goto L_0x02c5
            boolean r0 = r3.A0R     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != 0) goto L_0x02c5
            int r0 = r3.A03     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 >= 0) goto L_0x02a9
            int r5 = r4.B1S()     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A03 = r5     // Catch:{ IllegalStateException -> 0x0482 }
            if (r5 < 0) goto L_0x02c5
            X.6Jl r4 = r3.A0d     // Catch:{ IllegalStateException -> 0x0482 }
            X.8vT r0 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r0 = r0.B8O(r5)     // Catch:{ IllegalStateException -> 0x0482 }
            r4.A01 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            r4.A00()     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x02a9:
            int r0 = r3.A02     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r6) goto L_0x02ce
            boolean r0 = r3.A0N     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != 0) goto L_0x02c3
            r3.A0P = r6     // Catch:{ IllegalStateException -> 0x0482 }
            X.8vT r4 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r3.A03     // Catch:{ IllegalStateException -> 0x0482 }
            r8 = 0
            r10 = 4
            r7 = r2
            r5 = r0
            r6 = r2
            r4.Bi5(r5, r6, r7, r8, r10)     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A0J()     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x02c3:
            r3.A02 = r1     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x02c5:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.A06 = r0     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x04b7
        L_0x02ce:
            boolean r0 = r3.A0K     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x02f2
            r3.A0K = r2     // Catch:{ IllegalStateException -> 0x0482 }
            X.6Jl r0 = r3.A0d     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r1 = r0.A01     // Catch:{ IllegalStateException -> 0x0482 }
            byte[] r0 = A0l     // Catch:{ IllegalStateException -> 0x0482 }
            r1.put(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            X.8vT r11 = r3.A0E     // Catch:{ IllegalStateException -> 0x0482 }
            int r1 = r3.A03     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0.length     // Catch:{ IllegalStateException -> 0x0482 }
            r15 = 0
            r17 = r2
            r12 = r1
            r13 = r2
            r14 = r0
            r11.Bi5(r12, r13, r14, r15, r17)     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A0J()     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A0O = r6     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0282
        L_0x02f2:
            boolean r0 = r3.A0Y     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x02f8
            r9 = 0
            goto L_0x032f
        L_0x02f8:
            int r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r6) goto L_0x031b
            r5 = 0
        L_0x02fd:
            X.7z1 r0 = r3.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            java.util.List r0 = r0.A0T     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0.size()     // Catch:{ IllegalStateException -> 0x0482 }
            if (r5 >= r0) goto L_0x0319
            X.7z1 r0 = r3.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            java.util.List r0 = r0.A0T     // Catch:{ IllegalStateException -> 0x0482 }
            byte[] r4 = X.AnonymousClass6C9.A1V(r0, r5)     // Catch:{ IllegalStateException -> 0x0482 }
            X.6Jl r0 = r3.A0d     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r0 = r0.A01     // Catch:{ IllegalStateException -> 0x0482 }
            r0.put(r4)     // Catch:{ IllegalStateException -> 0x0482 }
            int r5 = r5 + 1
            goto L_0x02fd
        L_0x0319:
            r3.A01 = r1     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x031b:
            X.6Jl r7 = r3.A0d     // Catch:{ IllegalStateException -> 0x0482 }
            java.nio.ByteBuffer r0 = r7.A01     // Catch:{ IllegalStateException -> 0x0482 }
            int r9 = r0.position()     // Catch:{ IllegalStateException -> 0x0482 }
            X.79v r5 = r3.A0c     // Catch:{ IllegalStateException -> 0x0482 }
            int r4 = r3.A06(r5, r7, r2)     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = -3
            if (r4 == r0) goto L_0x02c5
            if (r4 != r10) goto L_0x032f
            goto L_0x03a9
        L_0x032f:
            X.6Jl r7 = r3.A0d     // Catch:{ IllegalStateException -> 0x0482 }
            r8 = 4
            int r5 = r7.A00     // Catch:{ IllegalStateException -> 0x0482 }
            r0 = r5 & 4
            if (r0 != r8) goto L_0x0364
            int r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r1) goto L_0x0341
            r7.A00()     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A01 = r6     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0341:
            r3.A0R = r6     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r3.A0O     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != 0) goto L_0x034c
            r3.A00()     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x02c5
        L_0x034c:
            boolean r0 = r3.A0N     // Catch:{ CryptoException -> 0x0472 }
            if (r0 != 0) goto L_0x02c5
            r3.A0P = r6     // Catch:{ CryptoException -> 0x0472 }
            X.8vT r9 = r3.A0E     // Catch:{ CryptoException -> 0x0472 }
            int r0 = r3.A03     // Catch:{ CryptoException -> 0x0472 }
            r13 = 0
            r12 = r2
            r10 = r0
            r11 = r2
            r15 = r8
            r9.Bi5(r10, r11, r12, r13, r15)     // Catch:{ CryptoException -> 0x0472 }
            r3.A0J()     // Catch:{ CryptoException -> 0x0472 }
            goto L_0x02c5
        L_0x0364:
            boolean r0 = r3.A0X     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x036d
            r0 = r5 & 1
            if (r0 == r6) goto L_0x036d
            goto L_0x03b9
        L_0x036d:
            r3.A0X = r2     // Catch:{ IllegalStateException -> 0x0482 }
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r5 & r1
            boolean r16 = X.AnonymousClass000.A1U(r0, r1)
            X.7Fj r0 = r3.A0h     // Catch:{ IllegalStateException -> 0x0482 }
            boolean r0 = r0.A01     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == 0) goto L_0x0394
            if (r16 == 0) goto L_0x0394
            X.7Pk r0 = r7.A03     // Catch:{ IllegalStateException -> 0x0482 }
            if (r9 == 0) goto L_0x0394
            int[] r1 = r0.A06     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 != 0) goto L_0x038f
            int[] r1 = new int[r6]     // Catch:{ IllegalStateException -> 0x0482 }
            r0.A06 = r1     // Catch:{ IllegalStateException -> 0x0482 }
            android.media.MediaCodec$CryptoInfo r0 = r0.A08     // Catch:{ IllegalStateException -> 0x0482 }
            r0.numBytesOfClearData = r1     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x038f:
            r0 = r1[r2]     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r0 + r9
            r1[r2] = r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0394:
            X.8sN r4 = r3.A0C     // Catch:{ IllegalStateException -> 0x0482 }
            r1 = 0
            if (r4 == 0) goto L_0x03a4
            if (r16 == 0) goto L_0x03a4
            int r0 = r4.BDG()     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 == r6) goto L_0x045c
            if (r0 == r8) goto L_0x03a4
            r1 = 1
        L_0x03a4:
            r3.A0Y = r1     // Catch:{ IllegalStateException -> 0x0482 }
            if (r1 != 0) goto L_0x02c5
            goto L_0x03c4
        L_0x03a9:
            int r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r1) goto L_0x03b2
            r7.A00()     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A01 = r6     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x03b2:
            X.7z1 r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0482 }
            r3.A0L(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0282
        L_0x03b9:
            r7.A00()     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0482 }
            if (r0 != r1) goto L_0x0282
            r3.A01 = r6     // Catch:{ IllegalStateException -> 0x0482 }
            goto L_0x0282
        L_0x03c4:
            long r8 = r7.A00     // Catch:{ CryptoException -> 0x0472 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r0
            if (r5 != r0) goto L_0x03d0
            java.util.List r0 = r3.A0j     // Catch:{ CryptoException -> 0x0472 }
            X.AnonymousClass6C8.A1G(r0, r8)     // Catch:{ CryptoException -> 0x0472 }
        L_0x03d0:
            long r0 = r3.A08     // Catch:{ CryptoException -> 0x0472 }
            long r0 = java.lang.Math.max(r0, r8)     // Catch:{ CryptoException -> 0x0472 }
            r3.A08 = r0     // Catch:{ CryptoException -> 0x0472 }
            java.nio.ByteBuffer r0 = r7.A01     // Catch:{ CryptoException -> 0x0472 }
            if (r0 == 0) goto L_0x03df
            r0.flip()     // Catch:{ CryptoException -> 0x0472 }
        L_0x03df:
            boolean r0 = r3 instanceof X.C125856Jt     // Catch:{ CryptoException -> 0x0472 }
            if (r0 == 0) goto L_0x0404
            r11 = r3
            X.6Jt r11 = (X.C125856Jt) r11     // Catch:{ CryptoException -> 0x0472 }
            int r0 = r11.A03     // Catch:{ CryptoException -> 0x0472 }
            int r0 = r0 + 1
            r11.A03 = r0     // Catch:{ CryptoException -> 0x0472 }
            long r4 = r7.A00     // Catch:{ CryptoException -> 0x0472 }
            long r0 = r11.A0L     // Catch:{ CryptoException -> 0x0472 }
            long r0 = java.lang.Math.max(r4, r0)     // Catch:{ CryptoException -> 0x0472 }
            r11.A0L = r0     // Catch:{ CryptoException -> 0x0472 }
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ CryptoException -> 0x0472 }
            r0 = 23
            if (r1 >= r0) goto L_0x0425
            boolean r0 = r11.A0d     // Catch:{ CryptoException -> 0x0472 }
            if (r0 == 0) goto L_0x0425
            r11.A0N()     // Catch:{ CryptoException -> 0x0472 }
            goto L_0x0425
        L_0x0404:
            r13 = r3
            X.6Ju r13 = (X.C125866Ju) r13     // Catch:{ CryptoException -> 0x0472 }
            boolean r0 = r13.A09     // Catch:{ CryptoException -> 0x0472 }
            if (r0 == 0) goto L_0x0425
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r7.A00     // Catch:{ CryptoException -> 0x0472 }
            r0 = r0 & r1
            if (r0 == r1) goto L_0x0425
            long r4 = r7.A00     // Catch:{ CryptoException -> 0x0472 }
            long r0 = r13.A04     // Catch:{ CryptoException -> 0x0472 }
            long r14 = X.AnonymousClass6C9.A0N(r4, r0)     // Catch:{ CryptoException -> 0x0472 }
            r11 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0423
            r13.A04 = r4     // Catch:{ CryptoException -> 0x0472 }
        L_0x0423:
            r13.A09 = r2     // Catch:{ CryptoException -> 0x0472 }
        L_0x0425:
            if (r16 == 0) goto L_0x0428
            goto L_0x043b
        L_0x0428:
            X.8vT r11 = r3.A0E     // Catch:{ CryptoException -> 0x0472 }
            int r1 = r3.A03     // Catch:{ CryptoException -> 0x0472 }
            java.nio.ByteBuffer r0 = r7.A01     // Catch:{ CryptoException -> 0x0472 }
            int r14 = r0.limit()     // Catch:{ CryptoException -> 0x0472 }
            r17 = r2
            r12 = r1
            r13 = r2
            r15 = r8
            r11.Bi5(r12, r13, r14, r15, r17)     // Catch:{ CryptoException -> 0x0472 }
            goto L_0x044b
        L_0x043b:
            X.8vT r4 = r3.A0E     // Catch:{ CryptoException -> 0x0472 }
            int r1 = r3.A03     // Catch:{ CryptoException -> 0x0472 }
            X.7Pk r0 = r7.A03     // Catch:{ CryptoException -> 0x0472 }
            r15 = r2
            r11 = r4
            r12 = r0
            r13 = r1
            r14 = r2
            r16 = r8
            r11.Bi8(r12, r13, r14, r15, r16)     // Catch:{ CryptoException -> 0x0472 }
        L_0x044b:
            r3.A0J()     // Catch:{ CryptoException -> 0x0472 }
            r3.A0O = r6     // Catch:{ CryptoException -> 0x0472 }
            r3.A01 = r2     // Catch:{ CryptoException -> 0x0472 }
            X.7Pv r1 = r3.A0B     // Catch:{ CryptoException -> 0x0472 }
            int r0 = r1.A06     // Catch:{ CryptoException -> 0x0472 }
            int r0 = r0 + 1
            r1.A06 = r0     // Catch:{ CryptoException -> 0x0472 }
            goto L_0x0282
        L_0x045c:
            X.6tt r4 = r4.B7N()     // Catch:{ IllegalStateException -> 0x0482 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0482 }
            X.8sN r0 = r3.A0C     // Catch:{ IllegalStateException -> 0x0482 }
            X.6tt r2 = r0.B7N()     // Catch:{ IllegalStateException -> 0x0482 }
            X.7z1 r1 = r3.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r4.errorCode     // Catch:{ IllegalStateException -> 0x0482 }
            X.6JW r0 = r3.A07(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x0482 }
            throw r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0472:
            r2 = move-exception
            X.7z1 r1 = r3.A0A     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = r2.getErrorCode()     // Catch:{ IllegalStateException -> 0x0482 }
            int r0 = com.facebook.android.exoplayer2.util.Util.A01(r0)     // Catch:{ IllegalStateException -> 0x0482 }
            X.6JW r0 = r3.A07(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x0482 }
            throw r0     // Catch:{ IllegalStateException -> 0x0482 }
        L_0x0482:
            r8 = move-exception
            int r1 = r3.A0Z     // Catch:{ all -> 0x04c4 }
            r11 = 0
            if (r1 <= 0) goto L_0x04bb
            long r6 = r3.A06     // Catch:{ all -> 0x04c4 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x049d
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04c4 }
            long r4 = r4 - r6
            long r1 = (long) r1     // Catch:{ all -> 0x04c4 }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x049e
        L_0x049d:
            r11 = 1
        L_0x049e:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x04b5
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r0 = "Dequeue failed, retry"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x04c4 }
            r0 = 0
            r3.A0J = r0     // Catch:{ IllegalStateException -> 0x04af }
            r3.A0G()     // Catch:{ IllegalStateException -> 0x04af }
        L_0x04af:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04c4 }
            r3.A06 = r0     // Catch:{ all -> 0x04c4 }
        L_0x04b5:
            if (r11 == 0) goto L_0x04bb
        L_0x04b7:
            X.C153827c5.A00()
            goto L_0x04f0
        L_0x04bb:
            X.7z1 r1 = r3.A0A     // Catch:{ all -> 0x04c4 }
            r0 = 4003(0xfa3, float:5.61E-42)
            X.6JW r0 = r3.A07(r1, r8, r0)     // Catch:{ all -> 0x04c4 }
            throw r0     // Catch:{ all -> 0x04c4 }
        L_0x04c4:
            r0 = move-exception
            X.C153827c5.A00()
            throw r0
        L_0x04c9:
            X.7Pv r8 = r3.A0B
            int r7 = r8.A08
            X.8tJ r2 = r3.A06
            r2.getClass()
            long r0 = r3.A03
            long r4 = r28 - r0
            int r0 = r2.BpO(r4)
            int r7 = r7 + r0
            r8.A08 = r7
            X.6Jl r2 = r3.A0e
            r2.A00()
            X.79v r1 = r3.A0c
            r0 = 0
            int r0 = r3.A06(r1, r2, r0)
            if (r0 != r10) goto L_0x04f5
            X.7z1 r0 = r1.A00
            r3.A0L(r0)
        L_0x04f0:
            X.7Pv r0 = r3.A0B
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x04f5:
            if (r0 != r9) goto L_0x04f0
            r1 = 4
            int r0 = r2.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            X.C159197lM.A02(r0)
            r3.A0R = r6
            r3.A00()
            goto L_0x04f0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.BjR(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0194, code lost:
        if (X.C18280x3.A03(r0) == 42) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == 2) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BqN(X.C166637z1 r13) {
        /*
            r12 = this;
            X.8wI r8 = r12.A0g     // Catch:{ 6yN -> 0x019e }
            r6 = r12
            boolean r0 = r12 instanceof X.C125856Jt     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0025
            X.6Jt r6 = (X.C125856Jt) r6     // Catch:{ 6yN -> 0x019e }
            if (r13 == 0) goto L_0x001c
            boolean r0 = r6.A0W     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = "video/av01"
            java.lang.String r0 = r13.A0S     // Catch:{ 6yN -> 0x019e }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x001c
            r0 = 20
            return r0
        L_0x001c:
            boolean r1 = r6.A0Z     // Catch:{ 6yN -> 0x019e }
            boolean r0 = r6.A0V     // Catch:{ 6yN -> 0x019e }
            int r0 = X.C125856Jt.A02(r13, r8, r1, r0)     // Catch:{ 6yN -> 0x019e }
            return r0
        L_0x0025:
            X.6Ju r6 = (X.C125866Ju) r6     // Catch:{ 6yN -> 0x019e }
            java.lang.String r3 = r13.A0S     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = "audio"
            boolean r0 = X.C162097rD.A07(r3, r0)     // Catch:{ 6yN -> 0x019e }
            r5 = 0
            if (r0 != 0) goto L_0x0034
            r0 = 0
            return r0
        L_0x0034:
            int r1 = r13.A06     // Catch:{ 6yN -> 0x019e }
            if (r1 == 0) goto L_0x003c
            r0 = 2
            r11 = 0
            if (r1 != r0) goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            r10 = 4
            r9 = 8
            if (r11 == 0) goto L_0x0053
            int r0 = r13.A05     // Catch:{ 6yN -> 0x019e }
            boolean r0 = r6.A0P(r0, r3)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0053
            X.7nt r0 = r8.BAc()     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0053
            r0 = 44
            return r0
        L_0x0053:
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r3)     // Catch:{ 6yN -> 0x019e }
            r7 = 1
            if (r0 == 0) goto L_0x0068
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r3 = r6.A0F     // Catch:{ 6yN -> 0x019e }
            int r1 = r13.A05     // Catch:{ 6yN -> 0x019e }
            int r0 = r13.A0B     // Catch:{ 6yN -> 0x019e }
            boolean r0 = r3.A0F(r1, r0)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x019c
        L_0x0068:
            com.facebook.android.exoplayer2.audio.DefaultAudioSink r1 = r6.A0F     // Catch:{ 6yN -> 0x019e }
            int r4 = r13.A05     // Catch:{ 6yN -> 0x019e }
            r0 = 2
            boolean r0 = r1.A0F(r4, r0)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x019c
            java.util.List r1 = r6.A0E(r13, r8, r5)     // Catch:{ 6yN -> 0x019e }
            boolean r0 = r1.isEmpty()     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0080
            r0 = 129(0x81, float:1.81E-43)
            return r0
        L_0x0080:
            if (r11 != 0) goto L_0x0085
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x0085:
            java.lang.Object r3 = r1.get(r5)     // Catch:{ 6yN -> 0x019e }
            X.7nt r3 = (X.C160577nt) r3     // Catch:{ 6yN -> 0x019e }
            int r5 = r13.A0F     // Catch:{ 6yN -> 0x019e }
            r1 = -1
            if (r5 == r1) goto L_0x00b5
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "sampleRate.caps"
        L_0x0096:
            r3.A02(r0)     // Catch:{ 6yN -> 0x019e }
            goto L_0x017d
        L_0x009b:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "sampleRate.aCaps"
            goto L_0x0096
        L_0x00a4:
            boolean r0 = r0.isSampleRateSupported(r5)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = "sampleRate.support, "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)     // Catch:{ 6yN -> 0x019e }
            goto L_0x0096
        L_0x00b5:
            if (r4 == r1) goto L_0x017f
            android.media.MediaCodecInfo$CodecCapabilities r0 = r3.A00     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "channelCount.caps"
            goto L_0x0096
        L_0x00be:
            android.media.MediaCodecInfo$AudioCapabilities r0 = r0.getAudioCapabilities()     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "channelCount.aCaps"
            goto L_0x0096
        L_0x00c7:
            java.lang.String r6 = r3.A02     // Catch:{ 6yN -> 0x019e }
            java.lang.String r1 = r3.A01     // Catch:{ 6yN -> 0x019e }
            int r5 = r0.getMaxInputChannelCount()     // Catch:{ 6yN -> 0x019e }
            if (r5 > r7) goto L_0x00d9
            int r7 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ 6yN -> 0x019e }
            r0 = 26
            if (r7 < r0) goto L_0x00dd
            if (r5 <= 0) goto L_0x00dd
        L_0x00d9:
            if (r5 >= r4) goto L_0x017f
            goto L_0x0171
        L_0x00dd:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r2.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x013d
            r2 = 6
            goto L_0x0149
        L_0x013d:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r1)     // Catch:{ 6yN -> 0x019e }
            r2 = 30
            if (r0 == 0) goto L_0x0149
            r2 = 16
        L_0x0149:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = "AssumedMaxChannelAdjustment: "
            r1.append(r0)     // Catch:{ 6yN -> 0x019e }
            r1.append(r6)     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = ", ["
            r1.append(r0)     // Catch:{ 6yN -> 0x019e }
            r1.append(r5)     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ 6yN -> 0x019e }
            r1.append(r2)     // Catch:{ 6yN -> 0x019e }
            java.lang.String r1 = X.AnonymousClass000.A0f(r1)     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = "MediaCodecInfo"
            android.util.Log.w(r0, r1)     // Catch:{ 6yN -> 0x019e }
            r5 = r2
            goto L_0x00d9
        L_0x0171:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6yN -> 0x019e }
            java.lang.String r0 = "channelCount.support, "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r4)     // Catch:{ 6yN -> 0x019e }
            goto L_0x0096
        L_0x017d:
            r10 = 3
            goto L_0x0198
        L_0x017f:
            boolean r0 = r3.A05     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0188
            boolean r0 = r3.A03     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0198
            goto L_0x0196
        L_0x0188:
            android.util.Pair r0 = X.C162317rh.A00(r13)     // Catch:{ 6yN -> 0x019e }
            if (r0 == 0) goto L_0x0198
            int r1 = X.C18280x3.A03(r0)     // Catch:{ 6yN -> 0x019e }
            r0 = 42
            if (r1 != r0) goto L_0x0198
        L_0x0196:
            r9 = 16
        L_0x0198:
            r0 = r9 | 32
            r0 = r0 | r10
            return r0
        L_0x019c:
            r0 = 1
            return r0
        L_0x019e:
            r1 = move-exception
            r0 = 4002(0xfa2, float:5.608E-42)
            X.6JW r0 = r12.A07(r13, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.BqN(X.7z1):int");
    }

    public AnonymousClass6JQ(C185208tG r5, C187008wI r6, C147717Fj r7, AnonymousClass7QT r8, int i, int i2, int i3, boolean z) {
        super(i);
        this.A0i = r8;
        this.A0h = r7;
        this.A0g = r6;
        this.A0f = r5;
        this.A0k = z;
        this.A0a = i2;
        this.A0Z = i3;
        this.A0d = new AnonymousClass6Jl(0);
        this.A0e = new AnonymousClass6Jl(0);
        this.A0c = new C1463279v();
        this.A0j = AnonymousClass001.A0s();
        this.A0b = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
        this.A08 = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0N) < 500) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F() {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A05 = r0
            r7.A0J()
            r0 = -1
            r7.A04 = r0
            r0 = 0
            r7.A0I = r0
            r5 = 1
            r7.A0X = r5
            r6 = 0
            r7.A0Y = r6
            r7.A0U = r6
            java.util.List r0 = r7.A0j
            r0.clear()
            r7.A0K = r6
            r7.A0T = r6
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0029
            boolean r0 = r7.A0P
            if (r0 != 0) goto L_0x0057
        L_0x0029:
            r1 = r7
            boolean r0 = r7 instanceof X.C125856Jt
            if (r0 == 0) goto L_0x0041
            X.6Jt r1 = (X.C125856Jt) r1
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x0041
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0N
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
        L_0x0041:
            int r0 = r7.A02
            if (r0 != 0) goto L_0x0057
            X.8vT r0 = r7.A0E
            r0.flush()
            r7.A0O = r6
        L_0x004c:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x0056
            X.7z1 r0 = r7.A0A
            if (r0 == 0) goto L_0x0056
            r7.A01 = r5
        L_0x0056:
            return
        L_0x0057:
            r7.A0G()
            r7.A0I()
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JQ.A0F():void");
    }

    public void A0G() {
        boolean z;
        this.A05 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        A0J();
        this.A04 = -1;
        this.A0I = null;
        this.A0Y = false;
        this.A0U = false;
        this.A0j.clear();
        this.A0F = null;
        this.A0Q = false;
        this.A0O = false;
        this.A00 = 0;
        this.A0N = false;
        this.A0L = false;
        this.A0K = false;
        this.A0T = false;
        this.A0P = false;
        this.A01 = 0;
        this.A02 = 0;
        C186508vT r5 = this.A0E;
        if (r5 != null) {
            this.A0B.A02++;
            try {
                C158787kY r4 = C158787kY.A04;
                if (this instanceof C125856Jt) {
                    z = true;
                } else {
                    z = false;
                }
                r4.A01(r5, C141246vG.RENDERER, this.A0i, this.A0H, z);
                this.A0E = null;
                C184698sN r1 = this.A0C;
                if (r1 != null && this.A0D != r1) {
                    try {
                        this.A0f.Biw(r1);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0E = null;
                C184698sN r12 = this.A0C;
                if (!(r12 == null || this.A0D == r12)) {
                    this.A0f.Biw(r12);
                }
                throw th;
            } finally {
                this.A0C = null;
                this.A0H = null;
            }
        }
    }
}
