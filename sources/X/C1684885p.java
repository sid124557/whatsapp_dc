package X;

import android.content.Context;
import android.media.MediaFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.85p  reason: invalid class name and case insensitive filesystem */
public class C1684885p implements C186228ux {
    public C151307Uf A00;
    public C186408vG A01;
    public Future A02;
    public boolean A03;
    public final Context A04;
    public final MediaFormat A05;
    public final C180608lL A06;
    public final C158667kM A07;
    public final C1683685d A08;
    public final AnonymousClass7QR A09;
    public final C183838qk A0A;
    public final ExecutorService A0B;

    public static boolean A00(C151307Uf r4, int i) {
        HashMap hashMap;
        if (r4 != null && (hashMap = r4.A0J) != null) {
            C142366x5 r1 = C142366x5.VIDEO;
            if (hashMap.get(r1) != null) {
                Iterator A10 = C18290x4.A10((AbstractMap) hashMap.get(r1));
                loop0:
                while (A10.hasNext()) {
                    Iterator A0q = C18320x8.A0q(A10.next());
                    while (true) {
                        if (A0q.hasNext()) {
                            if (((C151307Uf) A0q.next()).A02 != i) {
                                break loop0;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void cancel() {
        this.A03 = true;
        Future future = this.A02;
        if (future != null) {
            if (!future.isDone()) {
                this.A02.cancel(true);
            }
            try {
                this.A02.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4 A[Catch:{ all -> 0x0064, all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe A[Catch:{ all -> 0x0064, all -> 0x0216 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r29 = this;
            r3 = r29
            X.8qk r0 = r3.A0A
            X.8vG r0 = r0.B0b()
            r3.A01 = r0
            X.7QR r2 = r3.A09
            boolean r0 = X.C159277lY.A02(r2)
            if (r0 != 0) goto L_0x0236
            X.7Um r0 = r2.A07
            r28 = r0
            r0 = 1
            int r25 = java.lang.Math.max(r0, r0)
        L_0x001b:
            int r25 = r25 + -1
            if (r25 < 0) goto L_0x0236
            X.7kM r6 = r3.A07     // Catch:{ all -> 0x0216 }
            long r4 = r6.A08     // Catch:{ all -> 0x0216 }
            r0 = 1
            long r4 = r4 + r0
            r6.A08 = r4     // Catch:{ all -> 0x0216 }
            X.7jf r4 = r2.A04     // Catch:{ all -> 0x0216 }
            X.7YY r0 = r4.A0E     // Catch:{ all -> 0x0216 }
            if (r0 != 0) goto L_0x0203
            X.724 r0 = r2.A06     // Catch:{ all -> 0x0216 }
            r27 = r0
            boolean r0 = r4.A0H     // Catch:{ all -> 0x0216 }
            r6 = 1
            r24 = 0
            if (r0 == 0) goto L_0x007f
            java.util.List r5 = r3.A01()     // Catch:{ all -> 0x0216 }
        L_0x003d:
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x0216 }
        L_0x0041:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x0236
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0216 }
            X.7YY r8 = (X.AnonymousClass7YY) r8     // Catch:{ all -> 0x0216 }
            r4.A0E = r8     // Catch:{ all -> 0x0064 }
            X.8vG r5 = r3.A01     // Catch:{ all -> 0x0064 }
            android.content.Context r1 = r3.A04     // Catch:{ all -> 0x0064 }
            X.7Uf r0 = r3.A00     // Catch:{ all -> 0x0064 }
            r10 = r5
            r11 = r1
            r12 = r0
            r13 = r4
            r14 = r27
            r15 = r28
            r16 = r24
            r10.BhL(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0064 }
            goto L_0x0236
        L_0x0064:
            r7 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ all -> 0x0216 }
            r5[r24] = r8     // Catch:{ all -> 0x0216 }
            java.lang.String r1 = "VideoEncodeMuxerWrapper"
            java.lang.String r0 = "error preparing %s"
            X.C162477s9.A0C(r1, r0, r7, r5)     // Catch:{ all -> 0x0216 }
            int r0 = r8.A01     // Catch:{ all -> 0x0216 }
            if (r6 != r0) goto L_0x0041
            X.6xU r1 = X.C142616xU.CODEC_VIDEO_H264     // Catch:{ all -> 0x0216 }
            X.6xU r0 = r8.A02     // Catch:{ all -> 0x0216 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x0041
            throw r7     // Catch:{ all -> 0x0216 }
        L_0x007f:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0216 }
            X.7bV r7 = r2.A05     // Catch:{ all -> 0x0216 }
            r8 = 1
            r1 = 7
            if (r7 != 0) goto L_0x0092
            X.7Uf r10 = r3.A00     // Catch:{ all -> 0x0216 }
            if (r10 == 0) goto L_0x00a0
            int r0 = r10.A02     // Catch:{ all -> 0x0216 }
            if (r0 != r1) goto L_0x00a0
            goto L_0x00a1
        L_0x0092:
            X.7Uf r10 = r3.A00     // Catch:{ all -> 0x0216 }
            boolean r0 = A00(r10, r1)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x00a0
            X.6x5 r0 = X.C142366x5.VIDEO     // Catch:{ all -> 0x0216 }
            X.C160887oa.A03(r0, r7)     // Catch:{ all -> 0x0216 }
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            r9 = 2
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0216 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0216 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x00b0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0216 }
            X.7YY r0 = (X.AnonymousClass7YY) r0     // Catch:{ all -> 0x0216 }
            r8.add(r0)     // Catch:{ all -> 0x0216 }
            goto L_0x00b0
        L_0x00c0:
            r5.addAll(r8)     // Catch:{ all -> 0x0216 }
        L_0x00c3:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0216 }
            r0 = 29
            if (r1 < r0) goto L_0x00d7
            r0 = 6
            if (r7 == 0) goto L_0x00d7
            boolean r0 = A00(r10, r0)     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x00d7
            X.6x5 r0 = X.C142366x5.VIDEO     // Catch:{ all -> 0x0216 }
            X.C160887oa.A03(r0, r7)     // Catch:{ all -> 0x0216 }
        L_0x00d7:
            r8 = 64
            r1 = 1024(0x400, float:1.435E-42)
            r0 = 4
            java.lang.String r23 = "VideoEncodeMuxerWrapper"
            java.lang.Integer[] r7 = new java.lang.Integer[r0]     // Catch:{ all -> 0x0216 }
            r0 = r24
            X.AnonymousClass000.A1P(r7, r1, r0)     // Catch:{ all -> 0x0216 }
            r0 = 256(0x100, float:3.59E-43)
            X.C86604Kt.A1X(r7, r0, r6, r8, r9)     // Catch:{ all -> 0x0216 }
            r1 = 16
            r0 = 3
            X.AnonymousClass000.A1P(r7, r1, r0)     // Catch:{ all -> 0x0216 }
            java.util.List r0 = java.util.Arrays.asList(r7)     // Catch:{ all -> 0x0216 }
            java.util.Iterator r22 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x00f8:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r13 = r22.next()     // Catch:{ all -> 0x0216 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0216 }
            int r12 = r13.intValue()     // Catch:{ all -> 0x0216 }
            java.util.ArrayList r21 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0216 }
            java.lang.String r20 = "EncoderCheck"
            X.6xU r11 = X.C142616xU.CODEC_VIDEO_HEVC     // Catch:{ RuntimeException -> 0x01c2 }
            java.util.HashSet r19 = X.AnonymousClass002.A0K()     // Catch:{ RuntimeException -> 0x01c2 }
            r10 = 0
        L_0x0115:
            int r0 = android.media.MediaCodecList.getCodecCount()     // Catch:{ RuntimeException -> 0x01c2 }
            if (r10 >= r0) goto L_0x01b4
            android.media.MediaCodecInfo r8 = android.media.MediaCodecList.getCodecInfoAt(r10)     // Catch:{ RuntimeException -> 0x01c2 }
            boolean r0 = r8.isEncoder()     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 != r6) goto L_0x01b0
            java.lang.String r7 = r11.value     // Catch:{ RuntimeException -> 0x01c2 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.String[] r0 = r8.getSupportedTypes()     // Catch:{ RuntimeException -> 0x01c2 }
            java.util.Collections.addAll(r1, r0)     // Catch:{ RuntimeException -> 0x01c2 }
            boolean r0 = r1.contains(r7)     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r8.getName()     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.String r1 = r0.toLowerCase()     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.String r0 = ".mtk."
            boolean r0 = r1.contains(r0)     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 == 0) goto L_0x0154
            java.lang.String r7 = "skip codec %s "
            java.lang.String r1 = r8.getName()     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.String r0 = "MediaCodecListWrapper"
            X.C162477s9.A04(r1, r0, r7)     // Catch:{ RuntimeException -> 0x01c2 }
            goto L_0x01b0
        L_0x0154:
            java.lang.String r0 = r11.value     // Catch:{ RuntimeException -> 0x01c2 }
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.getCapabilitiesForType(r0)     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 == 0) goto L_0x01b0
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = r0.profileLevels     // Catch:{ RuntimeException -> 0x01c2 }
            if (r9 == 0) goto L_0x01b0
            int r0 = r9.length     // Catch:{ RuntimeException -> 0x01c2 }
            r26 = r0
            r8 = 0
        L_0x0164:
            r0 = r26
            if (r8 >= r0) goto L_0x01b0
            r14 = r9[r8]     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.String r18 = "MediaCodecListWrapper"
            java.lang.String r15 = "requesting profile,level: [%s,%s], found [%s,%s]"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ RuntimeException -> 0x01c2 }
            int r0 = r14.profile     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01c2 }
            int r0 = r14.level     // Catch:{ RuntimeException -> 0x01c2 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x01c2 }
            X.8vJ r1 = X.C162477s9.A01     // Catch:{ RuntimeException -> 0x01c2 }
            r0 = 3
            boolean r0 = r1.BI0(r0)     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 == 0) goto L_0x0194
            r1 = r17
            r0 = r16
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r15, r7, r13, r1, r0)     // Catch:{ RuntimeException -> 0x01c2 }
            r0 = r18
            X.C162477s9.A06(r0, r1)     // Catch:{ RuntimeException -> 0x01c2 }
        L_0x0194:
            int r0 = r14.profile     // Catch:{ RuntimeException -> 0x01c2 }
            if (r0 != r6) goto L_0x01ad
            int r7 = r14.level     // Catch:{ RuntimeException -> 0x01c2 }
            r0 = -1
            if (r7 >= r12) goto L_0x01a0
            if (r12 != r0) goto L_0x01ad
            goto L_0x01a3
        L_0x01a0:
            if (r12 == r0) goto L_0x01a3
            r7 = r12
        L_0x01a3:
            X.7YY r1 = new X.7YY     // Catch:{ RuntimeException -> 0x01c2 }
            r1.<init>(r11, r6, r7)     // Catch:{ RuntimeException -> 0x01c2 }
            r0 = r19
            r0.add(r1)     // Catch:{ RuntimeException -> 0x01c2 }
        L_0x01ad:
            int r8 = r8 + 1
            goto L_0x0164
        L_0x01b0:
            int r10 = r10 + 1
            goto L_0x0115
        L_0x01b4:
            java.lang.String r7 = "encoder support for hevc? %s"
            r1 = r20
            r0 = r19
            X.C162477s9.A04(r0, r1, r7)     // Catch:{ RuntimeException -> 0x01c2 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r19)     // Catch:{ RuntimeException -> 0x01c2 }
            goto L_0x01d6
        L_0x01c2:
            r8 = move-exception
            java.lang.String r7 = "hevc support check error"
            boolean r0 = X.AnonymousClass6C8.A1N()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01d2
            X.8vJ r1 = X.C162477s9.A01     // Catch:{ all -> 0x0216 }
            r0 = r20
            r1.B2G(r0, r7, r8)     // Catch:{ all -> 0x0216 }
        L_0x01d2:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0216 }
        L_0x01d6:
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0216 }
        L_0x01da:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0216 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0216 }
            X.7YY r1 = (X.AnonymousClass7YY) r1     // Catch:{ all -> 0x0216 }
            r0 = r21
            r0.add(r1)     // Catch:{ all -> 0x0216 }
            goto L_0x01da
        L_0x01ec:
            r0 = r21
            r5.addAll(r0)     // Catch:{ all -> 0x0216 }
            goto L_0x00f8
        L_0x01f3:
            java.util.List r0 = r3.A01()     // Catch:{ all -> 0x0216 }
            r5.addAll(r0)     // Catch:{ all -> 0x0216 }
            java.lang.String r1 = "codec setting fallback loop: %s"
            r0 = r23
            X.C162477s9.A04(r5, r0, r1)     // Catch:{ all -> 0x0216 }
            goto L_0x003d
        L_0x0203:
            X.8vG r6 = r3.A01     // Catch:{ all -> 0x0216 }
            android.content.Context r5 = r3.A04     // Catch:{ all -> 0x0216 }
            X.724 r1 = r2.A06     // Catch:{ all -> 0x0216 }
            r12 = 0
            X.7Uf r0 = r3.A00     // Catch:{ all -> 0x0216 }
            r7 = r5
            r8 = r0
            r9 = r4
            r10 = r1
            r11 = r28
            r6.BhL(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0216 }
            goto L_0x0236
        L_0x0216:
            r4 = move-exception
            if (r25 <= 0) goto L_0x0235
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0235
            java.lang.Throwable r1 = r4.getCause()
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r0 = r1.isTransient()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r1.isRecoverable()
            if (r0 == 0) goto L_0x0235
            goto L_0x001b
        L_0x0235:
            throw r4
        L_0x0236:
            X.7kM r4 = r3.A07
            X.8vG r0 = r3.A01
            java.lang.String r0 = r0.B7K()
            r4.A0E = r0
            X.7jf r0 = r2.A04
            if (r0 == 0) goto L_0x0258
            X.7YY r0 = r0.A0E
            if (r0 == 0) goto L_0x0258
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x025f
            r0 = 2
            if (r1 == r0) goto L_0x025c
            r0 = 8
            if (r1 == r0) goto L_0x0259
            java.lang.String r0 = ""
        L_0x0256:
            r4.A0F = r0
        L_0x0258:
            return
        L_0x0259:
            java.lang.String r0 = "high"
            goto L_0x0256
        L_0x025c:
            java.lang.String r0 = "main"
            goto L_0x0256
        L_0x025f:
            java.lang.String r0 = "baseline"
            goto L_0x0256
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684885p.A02():void");
    }

    public void B1y(long j) {
        if (j >= 0) {
            this.A01.B1y(j);
        }
    }

    public boolean BHF() {
        Future future = this.A02;
        if (future == null || !future.isDone()) {
            return false;
        }
        this.A02.get();
        return true;
    }

    public void BjW(long j) {
        if (j >= 0) {
            this.A01.BjW(j);
        }
    }

    public boolean BpL() {
        this.A01.BpK();
        return true;
    }

    public void BpW(C160227nH r10, int i) {
        C142366x5 r3 = C142366x5.VIDEO;
        long A002 = C153977cN.A00(this.A04, this.A06, r3, this.A09);
        this.A02 = this.A0B.submit(new AnonymousClass91G(r10, this, i, 1, A002));
    }

    public void BsQ() {
        Future future = this.A02;
        if (future != null) {
            future.get();
        }
    }

    public void flush() {
    }

    public void release() {
        AnonymousClass7VY r1 = new AnonymousClass7VY();
        try {
            C186408vG r0 = this.A01;
            if (r0 != null) {
                r0.finish();
                this.A01 = null;
            }
        } catch (Throwable th) {
            r1.A00(th);
        }
        Throwable th2 = r1.A01;
        if (th2 != null) {
            throw th2;
        }
    }

    public C1684885p(Context context, MediaFormat mediaFormat, C151307Uf r3, C180608lL r4, C158667kM r5, C1683685d r6, AnonymousClass7QR r7, C183838qk r8, ExecutorService executorService) {
        this.A07 = r5;
        this.A09 = r7;
        this.A05 = mediaFormat;
        this.A0B = executorService;
        this.A06 = r4;
        this.A04 = context;
        this.A08 = r6;
        this.A0A = r8;
        this.A00 = r3;
    }

    public final List A01() {
        AnonymousClass7YY r0;
        int i;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (C140996ur obj : C140996ur.values()) {
            String obj2 = obj.toString();
            if ("high".equalsIgnoreCase(obj2)) {
                i = 8;
            } else if ("main".equalsIgnoreCase(obj2)) {
                i = 2;
            } else if ("baseline".equalsIgnoreCase(obj2)) {
                i = 1;
            } else {
                r0 = null;
                A0s2.add(r0);
            }
            r0 = new AnonymousClass7YY(C142616xU.CODEC_VIDEO_H264, i, 256);
            A0s2.add(r0);
        }
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            C18310x6.A1R(A0s, it);
        }
        return A0s;
    }
}
