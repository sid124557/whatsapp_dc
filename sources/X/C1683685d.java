package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.85d  reason: invalid class name and case insensitive filesystem */
public class C1683685d implements C186208uv {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public MediaFormat A05;
    public MediaFormat A06;
    public C140276tT A07;
    public C158667kM A08;
    public C142366x5 A09;
    public C186208uv A0A;
    public AnonymousClass7B9 A0B = new AnonymousClass7B9();
    public C150307Qc A0C;
    public C151367Um A0D;
    public Map A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final C1445371y A0M;
    public final C147767Fq A0N;
    public final String A0O;

    public void stop() {
        try {
            A02(false);
            long j = this.A0L;
            long j2 = j;
            long j3 = this.A04;
            if (j3 != -1) {
                j = j3;
            }
            long j4 = this.A02;
            if (j4 != -1) {
                j = Math.min(j, j4);
            }
            A01(this.A0A, j2 - j, true);
        } finally {
            this.A0H = false;
        }
    }

    public final void A00(long j) {
        String path;
        if (this.A0F || (path = this.A0O) == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("segmentingMuxer_");
            A0o.append(this.A00);
            A0o.append("_");
            A0o.append(System.currentTimeMillis());
            A0o.append("_");
            path = File.createTempFile(AnonymousClass000.A0X(this.A09.name(), A0o), ".mp4", (File) null).getPath();
        }
        boolean z = this.A0I;
        C140276tT r4 = new C140276tT(path, z);
        this.A07 = r4;
        boolean z2 = this.A0G;
        Map map = this.A0E;
        AnonymousClass7M0 r3 = new AnonymousClass7M0();
        r3.A00 = -1;
        if (z2) {
            r3.A03 = true;
            r3.A01 = "1000000";
        }
        if (map != null) {
            r3.A02 = map;
        }
        C159297la.A02(!new C147747Fo(r3.A02, r3.A03).A01, "PlatformBasedCodecMuxer cannot be used to produce fragMp4");
        C186208uv r1 = new C1683485b();
        this.A0A = r1;
        if (z) {
            C186208uv r0 = new C1683585c(r4, r1);
            this.A0A = r0;
            r1 = r0;
        }
        r1.AzR(r4.getPath());
        MediaFormat mediaFormat = this.A05;
        if (mediaFormat != null) {
            this.A0A.Bll(mediaFormat);
            this.A02 = j;
        }
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            this.A0A.Bnl(mediaFormat2);
            this.A0A.Bml(this.A01);
            this.A04 = j;
        }
        this.A0A.start();
        this.A00++;
        this.A03 = 0;
    }

    public final void A01(C186208uv r24, long j, boolean z) {
        if (r24 != null) {
            C147767Fq r1 = this.A0N;
            C140276tT r11 = this.A07;
            C142366x5 r10 = this.A09;
            MediaFormat mediaFormat = this.A06;
            C152797a8 r2 = r1.A01;
            boolean z2 = z;
            r2.A03 = z2;
            AnonymousClass7QR r3 = r2.A0G;
            if (r3.A09 != null) {
                C151307Uf r0 = r1.A00;
                long j2 = r0.A08;
                long length = r11.length();
                int i = r0.A05;
                int i2 = r0.A03;
                long j3 = r0.A06;
                C158247jf r9 = r3.A04;
                C158667kM r8 = r2.A0C;
                C152527Zf r7 = null;
                if (r10 == C142366x5.AUDIO) {
                    C160727oD r32 = r2.A0E;
                    if (r32 != null) {
                        r7 = r32.A04;
                    }
                } else {
                    C186348v9 r33 = r2.A0I;
                    if (r33 != null) {
                        r7 = r33.B9T();
                    }
                }
                r2.A0J.add(new C152787a7(mediaFormat, r7, r8, r9, r10, r11, i, i2, j2, length, j3, j, z2));
            }
        }
    }

    public final void A02(boolean z) {
        C186208uv r1 = this.A0A;
        C140276tT r2 = this.A07;
        if (r1 != null && r1.BJ1()) {
            try {
                r1.stop();
                if (z) {
                    r2.delete();
                }
            } catch (RuntimeException e) {
                if (r2.exists()) {
                    r2.A00();
                }
                throw AnonymousClass6CA.A0Q("Cannot stop the muxer", e);
            }
        }
    }

    public void AzR(String str) {
    }

    public boolean BJ1() {
        return this.A0H;
    }

    public void Bll(MediaFormat mediaFormat) {
        this.A05 = mediaFormat;
    }

    public void Bml(int i) {
        this.A01 = i;
    }

    public void Bnl(MediaFormat mediaFormat) {
        this.A06 = mediaFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A06 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r3 = this;
            android.media.MediaFormat r0 = r3.A05
            r2 = 1
            if (r0 != 0) goto L_0x000a
            android.media.MediaFormat r0 = r3.A06
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C159297la.A02(r1, r0)
            r0 = -1
            r3.A00(r0)
            r3.A0H = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683685d.start():void");
    }

    public void Bse(C184848se r7) {
        MediaCodec.BufferInfo B4v = r7.B4v();
        if (this.A02 == -1) {
            this.A02 = B4v.presentationTimeUs;
        }
        this.A0A.Bse(r7);
        long j = this.A03 + ((long) r7.B4v().size);
        this.A03 = j;
        this.A08.A01 = j;
    }

    public void Bsl(C184848se r9) {
        MediaCodec.BufferInfo B4v = r9.B4v();
        if (this.A04 == -1) {
            this.A04 = B4v.presentationTimeUs;
        }
        if ((B4v.flags & 2) != 0) {
            this.A0B.A00.add(new AnonymousClass85Y(r9));
        }
        if ((B4v.flags & 1) != 0) {
            long j = B4v.presentationTimeUs;
            boolean A1U = AnonymousClass001.A1U(((j - this.A04) > this.A0K ? 1 : ((j - this.A04) == this.A0K ? 0 : -1)));
            if (this.A0L - j >= this.A0J && A1U) {
                A02(false);
                A01(this.A0A, B4v.presentationTimeUs - this.A04, false);
                A00(B4v.presentationTimeUs);
                AnonymousClass7B9 r0 = this.A0B;
                C186208uv r2 = this.A0A;
                for (C184848se Bsl : r0.A00) {
                    r2.Bsl(Bsl);
                }
            }
        }
        B4v.presentationTimeUs -= this.A04;
        this.A0A.Bsl(r9);
        long j2 = this.A03 + ((long) B4v.size);
        this.A03 = j2;
        this.A08.A01 = j2;
    }

    public C1683685d(C151307Uf r9, C158667kM r10, C1445371y r11, C142366x5 r12, C150307Qc r13, C147767Fq r14, C151367Um r15, String str, long j, long j2, long j3, boolean z, boolean z2) {
        C141086v0 r1;
        C141086v0 r16;
        this.A0N = r14;
        this.A0M = r11;
        this.A0C = r13;
        this.A0L = j;
        this.A0K = j2;
        this.A0J = j3;
        this.A09 = r12;
        this.A0I = z;
        this.A0G = z2;
        this.A08 = r10;
        this.A0D = r15;
        if (!z || z2) {
            this.A0F = AnonymousClass001.A1W((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            HashMap A0t = AnonymousClass001.A0t();
            this.A0E = A0t;
            this.A0O = str;
            if (!A0t.containsKey("copyright")) {
                String str2 = r9.A0E;
                if (str2 != null) {
                    C141086v0[] values = C141086v0.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            r16 = C141086v0.DEFAULT;
                            break;
                        }
                        r16 = values[i];
                        if (r16.source.equals(str2)) {
                            break;
                        }
                        i++;
                    }
                    if (!r16.equals(C141086v0.DEFAULT)) {
                        A0t.put("copyright", str2);
                    }
                } else {
                    HashMap hashMap = r9.A0J;
                    if (hashMap != null) {
                        Iterator A10 = C18290x4.A10(hashMap);
                        loop0:
                        while (true) {
                            if (!A10.hasNext()) {
                                break;
                            }
                            Iterator A102 = C18290x4.A10((AbstractMap) A10.next());
                            while (true) {
                                if (A102.hasNext()) {
                                    Iterator A0q = C18320x8.A0q(A102.next());
                                    while (true) {
                                        if (A0q.hasNext()) {
                                            str2 = ((C151307Uf) A0q.next()).A0E;
                                            if (str2 != null) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Map map = this.A0E;
            if (!map.containsKey("composer")) {
                String str3 = r9.A0D;
                if (str3 != null) {
                    C141086v0[] values2 = C141086v0.values();
                    int length2 = values2.length;
                    int i2 = 0;
                } else {
                    HashMap hashMap2 = r9.A0J;
                    if (hashMap2 != null) {
                        Iterator A103 = C18290x4.A10(hashMap2);
                        loop4:
                        while (A103.hasNext()) {
                            Iterator A104 = C18290x4.A10((AbstractMap) A103.next());
                            while (true) {
                                if (A104.hasNext()) {
                                    Iterator A0q2 = C18320x8.A0q(A104.next());
                                    while (true) {
                                        if (A0q2.hasNext()) {
                                            str3 = ((C151307Uf) A0q2.next()).A0D;
                                            if (str3 != null) {
                                                break loop4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                C141086v0[] values22 = C141086v0.values();
                int length22 = values22.length;
                int i22 = 0;
                while (true) {
                    if (i22 >= length22) {
                        r1 = C141086v0.DEFAULT;
                        break;
                    }
                    r1 = values22[i22];
                    if (r1.source.equals(str3)) {
                        break;
                    }
                    i22++;
                }
                if (!r1.equals(C141086v0.DEFAULT)) {
                    map.put("composer", str3);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Streaming mode can be used only with fragmented files");
    }
}
