package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.85f  reason: invalid class name and case insensitive filesystem */
public class C1683885f implements C186218uw {
    public long A00 = -1;
    public C1683385a A01;
    public C153037aZ A02;
    public C149587Na A03;
    public C151367Um A04;
    public boolean A05;
    public final /* synthetic */ C1684185i A06;

    public void finish() {
        long j;
        C1445171w.A00("VideoTranscoderJBMR2", "finish", new Object[0]);
        AnonymousClass7VY r5 = new AnonymousClass7VY();
        AnonymousClass7B2.A00(r5, this.A02);
        C149587Na r8 = this.A03;
        if (r8 != null) {
            long j2 = r8.A00;
            C162777sk r7 = r8.A03;
            r7.getClass();
            synchronized (r7) {
                j = r7.A00;
            }
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = Double.valueOf((((double) (j2 - j)) / ((double) r8.A00)) * 100.0d);
            C1445171w.A00("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", A0L);
            C149587Na r4 = this.A03;
            C1445171w.A00("TranscodeOutputSurfaceForJBMR2", "release", new Object[0]);
            Surface surface = r4.A02;
            if (surface != null) {
                surface.release();
            }
            r4.A02 = null;
            r4.A03 = null;
            if (r4.A01 != null) {
                C1445171w.A00("TranscodeOutputSurfaceForJBMR2", "release: mHandlerThread.quitSafely", new Object[0]);
                r4.A01.quitSafely();
                r4.A01 = null;
            }
        }
        Throwable th = r5.A01;
        if (th != null) {
            throw th;
        }
    }

    public C1683885f(C1684185i r3) {
        this.A06 = r3;
    }

    public long B1K(long j) {
        RuntimeException A0E;
        C1683385a r3 = this.A01;
        long j2 = -1;
        if (r3 != null && r3.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = r3.A00;
            long j3 = bufferInfo.presentationTimeUs;
            try {
                C153037aZ r9 = this.A02;
                boolean A1U = AnonymousClass001.A1U((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)));
                Trace.beginSection("MediaCodecWrapper.releaseOutputBuffer");
                int i = r3.A02;
                if (i >= 0) {
                    r9.A04.releaseOutputBuffer(i, A1U);
                }
                Trace.endSection();
                if ((bufferInfo.flags & 4) != 0) {
                    this.A05 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        C149587Na r0 = this.A03;
                        r0.A00++;
                        C162777sk r8 = r0.A03;
                        r8.getClass();
                        long nanoTime = System.nanoTime();
                        long j4 = C162777sk.A06 + nanoTime;
                        Object obj = r8.A03;
                        synchronized (obj) {
                            while (!r8.A01) {
                                if (nanoTime < j4) {
                                    try {
                                        obj.wait(10000);
                                        nanoTime = System.nanoTime();
                                    } catch (InterruptedException e) {
                                        C18300x5.A11();
                                        A0E = C18330xA.A09(e);
                                    }
                                } else {
                                    A0E = AnonymousClass002.A0E("Surface frame wait timed out");
                                    throw A0E;
                                }
                            }
                            r8.A01 = false;
                        }
                        C159217lP.A02("before updateTexImage", new Object[0]);
                        r8.A02.updateTexImage();
                    }
                    j2 = j3;
                }
                this.A01 = null;
            } catch (IllegalStateException e2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("codec info: ");
                A0o.append(this.A02.A01);
                throw new IllegalStateException(AnonymousClass000.A0Z(" , mDecoder Presentation Time: ", A0o, j3), e2);
            }
        }
        C1683385a A012 = this.A02.A01(j);
        if (A012 != null && A012.A02 >= 0) {
            this.A01 = A012;
            this.A00 = A012.A00.presentationTimeUs;
        }
        return j2;
    }

    public C1683385a B1T(long j) {
        return this.A02.A00(j);
    }

    public long B6n() {
        return this.A00;
    }

    public String B6p() {
        try {
            return this.A02.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public boolean BJA() {
        return this.A05;
    }

    public void BhK(MediaFormat mediaFormat, C151367Um r9, List list, int i) {
        C153037aZ r0;
        this.A04 = r9;
        this.A03 = new C149587Na(this.A06.A00);
        if (list.isEmpty()) {
            String string = mediaFormat.getString("mime");
            Surface surface = this.A03.A02;
            if (!C162127rJ.A05(string)) {
                throw new AnonymousClass6O0(AnonymousClass000.A0V("Unsupported codec for ", string, AnonymousClass001.A0o()));
            }
            try {
                r0 = C162127rJ.A01(MediaCodec.createDecoderByType(string), mediaFormat, surface);
            } catch (IOException e) {
                throw new AnonymousClass6O0((Throwable) e);
            }
        } else {
            Surface surface2 = this.A03.A02;
            AnonymousClass7B7 A032 = C162127rJ.A03(mediaFormat.getString("mime"), list);
            if (A032 == null) {
                String string2 = mediaFormat.getString("mime");
                C159297la.A02(false, (String) null);
                C159297la.A02(C162127rJ.A05(string2), (String) null);
                int codecCount = MediaCodecList.getCodecCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= codecCount) {
                        A032 = C162127rJ.A03(string2, (List) null);
                        if (A032 == null) {
                            throw new AnonymousClass6O0(AnonymousClass000.A0V("Unsupported codec for ", string2, AnonymousClass001.A0o()));
                        }
                    } else {
                        MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                        if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(string2)) {
                            String name = codecInfoAt.getName();
                            if (C162127rJ.A06.contains(name)) {
                                A032 = new AnonymousClass7B7(name);
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            MediaCodec createByCodecName = MediaCodec.createByCodecName(A032.A00);
            mediaFormat.setInteger("max-input-size", 0);
            r0 = C162127rJ.A01(createByCodecName, mediaFormat, surface2);
        }
        this.A02 = r0;
        r0.A02();
    }

    public void Bi6(C1683385a r2) {
        this.A02.A03(r2);
    }

    public void Brb(int i, Bitmap bitmap) {
        int i2;
        AnonymousClass7QP r1 = this.A06.A00.A00;
        r1.getClass();
        float[] fArr = r1.A0G;
        float f = (float) r1.A06.A06;
        if (f != 0.0f) {
            Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        }
        if (!r1.A0F.isEmpty()) {
            C151837Wm r2 = r1.A04;
            C159297la.A02(AnonymousClass000.A1W(r2), (String) null);
            i2 = r2.A00;
        } else {
            i2 = r1.A01;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }
}
