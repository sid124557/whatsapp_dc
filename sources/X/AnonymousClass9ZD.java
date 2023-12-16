package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.9ZD  reason: invalid class name */
public class AnonymousClass9ZD implements C183758qb {
    public static final float[] A05;
    public C194729Ug A00;
    public boolean A01;
    public boolean A02 = false;
    public final AnonymousClass7J7 A03;
    public final Map A04 = AnonymousClass001.A0t();

    static {
        float[] fArr = new float[16];
        A05 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void B1c() {
        Map map = this.A04;
        for (C160457nf A032 : map.values()) {
            A032.A03();
        }
        map.clear();
    }

    public void BjU(C151837Wm r22, C185558ts r23, C152667Zv r24) {
        C152827aC r9 = ((AnonymousClass9ZC) r23).A04;
        C152667Zv r1 = r24;
        int i = r1.A00;
        int i2 = r1.A01;
        int i3 = r1.A03;
        int i4 = r1.A02;
        float[] fArr = r1.A08;
        float[] fArr2 = r1.A06;
        float[] fArr3 = r1.A07;
        float[] fArr4 = r1.A05;
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err1 Already in error state entering renderAfterBind", new Object[0]);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err4", new Object[0]);
        GLES20.glViewport(0, 0, i3, i4);
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err4b glViewport", new Object[0]);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err5a glClearColor", new Object[0]);
        GLES20.glClear(16640);
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err5b glClear", new Object[0]);
        C151837Wm r8 = r22;
        int i5 = r8.A01;
        boolean A1U = AnonymousClass000.A1U(i5, 36197);
        int i6 = A1U ? 1 : 0;
        Map map = this.A04;
        Integer valueOf = Integer.valueOf(i6 + (i * 2) + (i2 * 100));
        C160457nf r11 = (C160457nf) map.get(valueOf);
        if (r11 == null) {
            if (i != 6) {
                if (i != 7) {
                    if (A1U) {
                        try {
                            if (this.A02) {
                                r11 = r9.A01(C02440Ge.passthrough_300_vs, C02440Ge.bt709_yuv_to_rgb_sampler_fs, true);
                            }
                        } catch (Exception unused) {
                            r11 = r9.A01(R.raw.passthrough_vs, R.raw.passthrough_fs, A1U);
                        }
                    }
                    r11 = r9.A01(R.raw.passthrough_vs, R.raw.passthrough_fs, A1U);
                } else if (A1U) {
                    if (i2 == 3) {
                        r11 = r9.A01(C02440Ge.passthrough_300_vs, C02440Ge.wrapping_tonemap_hlg_fs, true);
                        GLES20.glUniform1f(r11.A02().A00("alpha"), 1.0f);
                    } else {
                        r11 = r9.A01(C02440Ge.hdr_yuv_to_rgb_sampler_vs, C02440Ge.hdr_yuv_to_rgb_sampler_fs, true);
                    }
                } else if (i2 == 3) {
                    r11 = r9.A01(C02440Ge.passthrough_300_vs, C02440Ge.bt2020_rgb_to_bt709, false);
                    GLES20.glUniform1f(r11.A02().A00("alpha"), 1.0f);
                } else {
                    r11 = r9.A01(R.raw.passthrough_vs, R.raw.passthrough_fs, false);
                }
            } else if (i2 == 3) {
                r11 = r9.A01(C02440Ge.wrapping_tonemap_pq_vs, C02440Ge.wrapping_tonemap_pq_fs, A1U);
            } else if (i2 == 7) {
                r11 = r9.A01(C02440Ge.wrapping_tonemap_pq_vs, C02440Ge.wrapping_tonemap_pq_to_hlg_fs, A1U);
            } else {
                r11 = r9.A01(C02440Ge.hdr_yuv_to_rgb_sampler_vs, C02440Ge.hdr_yuv_to_rgb_sampler_fs, A1U);
            }
            map.put(valueOf, r11);
        }
        C159217lP.A02("GlCoreCopyRenderer::renderFrame:err6", new Object[0]);
        try {
            AnonymousClass7J8 r0 = r8.A02;
            int i7 = r0.A01;
            int i8 = r0.A00;
            if (this.A01) {
                Object[] objArr = new Object[4];
                C86604Kt.A1X(objArr, i7, 0, i8, 1);
                AnonymousClass000.A1P(objArr, i3, 2);
                AnonymousClass000.A1P(objArr, i4, 3);
                C162477s9.A06("GlCoreCopyRenderer", String.format("input=%dx%d output=%dx%d", objArr));
            }
            C151997Xd A022 = r11.A02();
            A022.A02("uTextureTransformMatrix", fArr);
            A022.A02("uCropTransformMatrix", fArr2);
            A022.A02("uInContentTransformMatrix", fArr3);
            A022.A02("uContentTransformMatrix", fArr4);
            A022.A01(r8, "sTexture");
            C160457nf r6 = A022.A00;
            if (GLES20.glGetUniformLocation(r6.A00, "uMaxContentLuminance") != -1) {
                GLES20.glUniform1f(A022.A00("uMaxContentLuminance"), 1000.0f);
            }
            C160457nf.A01(this.A03, r6);
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A1P(A0M, i5, 0);
            AnonymousClass000.A1P(A0M, r8.A00, 1);
            C159217lP.A02("GlCoreCopyRenderer::renderFrame: textureTarget: %s textureHandle: %s", A0M);
        } catch (AnonymousClass8RP e) {
            AnonymousClass8RP r02 = new AnonymousClass8RP(e.mLastErrorCode, AnonymousClass000.A0a("GlCoreCopyRenderer", AnonymousClass001.A0o(), e));
            r02.initCause(e);
            throw r02;
        }
    }

    public AnonymousClass9ZD(C194729Ug r5) {
        C150817Si r3 = new C150817Si();
        r3.A00 = 5;
        r3.A00(new AnonymousClass7FV(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}), "aPosition");
        r3.A00(new AnonymousClass7FV(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}), "aTextureCoord");
        this.A03 = new AnonymousClass7J7(r3);
        this.A00 = r5;
        AnonymousClass9LF r2 = C194729Ug.A05;
        Object obj = Boolean.FALSE;
        Object obj2 = r5.A00.get(r2);
        this.A01 = AnonymousClass001.A1Z(obj2 != null ? obj2 : obj);
    }
}
