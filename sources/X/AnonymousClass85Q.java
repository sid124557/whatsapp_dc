package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.85Q  reason: invalid class name */
public class AnonymousClass85Q implements C185808uH {
    public int A00;
    public int A01;
    public Bitmap.Config A02;
    public Uri A03;
    public C172258Kh A04;
    public C160457nf A05;
    public C160457nf A06;
    public C151837Wm A07;
    public C154787dk A08;
    public C141276vJ A09;
    public C158007jH A0A;
    public boolean A0B;
    public boolean A0C = false;
    public final RectF A0D = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final AnonymousClass7J7 A0E;
    public final AnonymousClass7FV A0F;
    public final float[] A0G;
    public volatile AnonymousClass7B5 A0H;

    public final void A00(boolean z) {
        C151837Wm r0;
        this.A0B = true;
        if (z && (r0 = this.A07) != null) {
            r0.A00();
            this.A07 = null;
        }
        C172258Kh r02 = this.A04;
        if (r02 != null) {
            r02.close();
        }
        this.A04 = null;
        this.A09 = null;
    }

    public void Bdk(C152827aC r7) {
        A00(true);
        this.A06 = C152827aC.A00(r7, R.raw.lite_overlay_vs, R.raw.lite_overlay_fs);
        try {
            int[] A0E2 = C18330xA.A0E();
            A0E2[0] = R.raw.inverse_tonemap_hlg_lib;
            String A032 = r7.A03(R.raw.overlay_hdr_fs);
            String A033 = r7.A03(R.raw.overlay_300_vs);
            StringBuilder A0A2 = C18330xA.A0A(A032);
            StringBuilder A0A3 = C18330xA.A0A(A033);
            String A034 = r7.A03(A0E2[0]);
            A0A2.append("\n");
            A0A2.append(A034);
            this.A05 = r7.A02(AnonymousClass000.A0V("\n", A034, A0A3), A0A2.toString(), false);
        } catch (RuntimeException e) {
            if (AnonymousClass6C8.A1N()) {
                C162477s9.A01.B2G("LiteOverlayRenderer", "Could not compile HDR shader", e);
            }
        }
    }

    public void Bdl() {
        A00(true);
        C160457nf r0 = this.A06;
        if (r0 != null) {
            r0.A03();
            this.A06 = null;
        }
        C160457nf r02 = this.A05;
        if (r02 != null) {
            r02.A03();
            this.A05 = null;
        }
    }

    public AnonymousClass85Q(Uri uri, C154787dk r8) {
        C158007jH r5 = new C158007jH(uri, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        float[] fArr = new float[16];
        this.A0G = fArr;
        this.A08 = r8;
        this.A0A = r5;
        AnonymousClass7FV r1 = new AnonymousClass7FV(r5.A01);
        this.A0F = r1;
        Matrix.setIdentityM(fArr, 0);
        C150817Si r2 = new C150817Si();
        r2.A00 = 5;
        r2.A00(r1, "aPosition");
        r2.A00(new AnonymousClass7FV(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}), "aTextureCoord");
        this.A0E = new AnonymousClass7J7(r2);
        this.A03 = uri;
        this.A0B = true;
    }

    public boolean BRf(C157607ia r7, long j) {
        C160457nf r3;
        AnonymousClass7B4 r0;
        C151837Wm r02 = r7.A01;
        if (r02 != null) {
            if (!r02.A02.A02 || (r3 = this.A05) == null) {
                r3 = this.A06;
            } else {
                this.A0C = true;
            }
            r3.getClass();
            if (this.A0B) {
                C158007jH r1 = this.A0A;
                if (r1.A00 != null) {
                    A00(true);
                    Uri uri = r1.A00;
                    if (uri != null) {
                        C172258Kh A002 = C154787dk.A00(uri);
                        C141276vJ r4 = C141276vJ.StaticImage;
                        this.A09 = r4;
                        if (A002 != null) {
                            this.A04 = A002;
                            Bitmap A003 = C172258Kh.A00(A002);
                            if (this.A07 == null || A003.getWidth() != this.A01 || A003.getHeight() != this.A00 || A003.getConfig() != this.A02 || this.A07.A02.A02 != this.A0C) {
                                C151837Wm r03 = this.A07;
                                if (r03 != null) {
                                    r03.A00();
                                }
                                C150027Ov r12 = new C150027Ov("LiteOverlayRenderer");
                                AnonymousClass6C8.A0x(r12.A06);
                                r12.A03 = A003;
                                r12.A05 = this.A0C;
                                this.A07 = new C151837Wm(r12);
                                this.A01 = A003.getWidth();
                                this.A00 = A003.getHeight();
                                this.A02 = A003.getConfig();
                            } else if (!A003.isRecycled()) {
                                GLES20.glBindTexture(3553, this.A07.A00);
                                GLUtils.texImage2D(3553, 0, A003, 0);
                                GLES20.glBindTexture(3553, 0);
                            } else {
                                throw AnonymousClass002.A0E("bitmap is recycled");
                            }
                            if (this.A09 == r4) {
                                this.A0B = false;
                            }
                        } else {
                            throw AnonymousClass000.A0H(uri, "Fail to load image for ", AnonymousClass001.A0o());
                        }
                    }
                }
            }
            if (this.A07 != null) {
                GLES20.glEnable(3042);
                C159217lP.A02("GL_BLEND", new Object[0]);
                GLES20.glBlendFunc(1, 771);
                GLES20.glBlendEquation(32774);
                C159217lP.A02("blendFunc", new Object[0]);
                C151997Xd A022 = r3.A02();
                A022.A02("uSceneMatrix", r7.A03);
                A022.A02("uRotationMatrix", this.A0G);
                A022.A01(this.A07, "sOverlay");
                C160457nf.A01(this.A0E, A022.A00);
                C172258Kh r04 = this.A04;
                if (r04 == null) {
                    return true;
                }
                r04.close();
                this.A04 = null;
                return true;
            }
            AnonymousClass7B5 r13 = this.A0H;
            if (r13 == null) {
                return false;
            }
            String obj = C18330xA.A0A("LiteOverlayRenderer").toString();
            Map map = r13.A00;
            if (!map.containsKey(obj)) {
                r0 = new AnonymousClass7B4();
                map.put(obj, r0);
            } else {
                r0 = (AnonymousClass7B4) map.get(obj);
                if (r0 == null) {
                    return false;
                }
            }
            r0.A00++;
            return false;
        }
        throw AnonymousClass001.A0e("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public void Blh(AnonymousClass7B5 r1) {
        this.A0H = r1;
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1W(this.A0A.A00);
    }

    public void Bdj(int i, int i2) {
    }
}
