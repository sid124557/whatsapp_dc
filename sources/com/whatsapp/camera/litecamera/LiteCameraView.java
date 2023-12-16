package com.whatsapp.camera.litecamera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5PM;
import X.AnonymousClass678;
import X.AnonymousClass6C7;
import X.AnonymousClass7X7;
import X.AnonymousClass9JW;
import X.AnonymousClass9LJ;
import X.AnonymousClass9M2;
import X.AnonymousClass9N7;
import X.AnonymousClass9N8;
import X.AnonymousClass9N9;
import X.AnonymousClass9O4;
import X.AnonymousClass9SG;
import X.AnonymousClass9SQ;
import X.AnonymousClass9SR;
import X.AnonymousClass9T4;
import X.AnonymousClass9V5;
import X.AnonymousClass9VA;
import X.AnonymousClass9XR;
import X.C116855qy;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C185898uQ;
import X.C192589Ks;
import X.C193259Nt;
import X.C194559Tk;
import X.C194899Ux;
import X.C195119Wa;
import X.C195579Yl;
import X.C202289li;
import X.C203389nc;
import X.C203539nu;
import X.C203699oA;
import X.C203849oP;
import X.C49632gq;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;

public class LiteCameraView extends FrameLayout implements AnonymousClass678, AnonymousClass4GJ {
    public C185898uQ A00;
    public C49632gq A01;
    public AnonymousClass4FS A02;
    public C116855qy A03;
    public Runnable A04;
    public String A05;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final SharedPreferences A0C;
    public final C203389nc A0D;
    public final C203699oA A0E;
    public final C195119Wa A0F;
    public final AnonymousClass9VA A0G;
    public final AnonymousClass9N7 A0H;
    public final AnonymousClass9N8 A0I;
    public final AnonymousClass9SR A0J;
    public volatile boolean A0K;

    public static LiteCameraView createCenterCropView(Context context, int i) {
        AnonymousClass9JW r0;
        TextureView textureView = new TextureView(context);
        C194559Tk r6 = new C194559Tk(true);
        boolean A002 = AnonymousClass9M2.A00(context);
        Context applicationContext = context.getApplicationContext();
        if (A002) {
            r0 = AnonymousClass9JW.CAMERA2;
        } else {
            r0 = AnonymousClass9JW.CAMERA1;
        }
        C195579Yl r2 = new C195579Yl(applicationContext, textureView, new AnonymousClass9XR(), r6, AnonymousClass9LJ.A00(context, r0), A002);
        r2.A0F = true;
        return new LiteCameraView(context, i, (C203699oA) r2);
    }

    public static LiteCameraView createSimpleView(Context context, int i) {
        return new LiteCameraView(context, i, C192589Ks.A00(context, new TextureView(context)));
    }

    public void A01() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = (C49632gq) A002.A00.A2E.get();
            this.A02 = C64333Db.A8y(A002);
        }
    }

    public void A03(Runnable runnable) {
        Log.d("LiteCamera/stopVideoCaptureAsync");
        this.A04 = runnable;
        ((C195579Yl) this.A0E).A04(false);
    }

    public void Ays() {
        AnonymousClass7X7 r1 = this.A0G.A03;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void B3Q(float f, float f2) {
        C195579Yl r6 = (C195579Yl) this.A0E;
        r6.A0E = new AnonymousClass9N9(this);
        int i = (int) f;
        int i2 = (int) f2;
        C194899Ux A022 = r6.A02();
        if (A022 != null) {
            float[] fArr = {(float) i, (float) i2};
            C203539nu r2 = r6.A0Q;
            r2.BKU(fArr);
            if (C194899Ux.A04(C194899Ux.A0O, A022)) {
                r2.B3P((int) fArr[0], (int) fArr[1]);
            }
        }
    }

    public boolean BHe() {
        return AnonymousClass001.A1T(((C195579Yl) this.A0E).A00);
    }

    public boolean BIf() {
        return ((C195579Yl) this.A0E).A0Q.BIg();
    }

    public boolean BJ7() {
        return "torch".equals(this.A05);
    }

    public void BLW() {
        Log.d("LiteCamera/nextCamera");
        C195579Yl r2 = (C195579Yl) this.A0E;
        C203539nu r1 = r2.A0Q;
        if (r1.BJ5()) {
            this.A0G.A00();
            if (!r2.A0H && r1.BJ5()) {
                r1.BqX(r2.A0U);
            }
        }
    }

    public String BLX() {
        Log.d("LiteCamera/nextFlashMode");
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(this.A05);
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String A0n = AnonymousClass001.A0n(flashModes, (indexOf + 1) % flashModes.size());
        this.A05 = A0n;
        this.A0E.BmI(A00(A0n));
        return this.A05;
    }

    public void Bk6() {
        if (this.A0K) {
            C185898uQ r0 = this.A00;
            if (r0 != null) {
                r0.BYs();
                return;
            }
            return;
        }
        Bk9();
    }

    public void Bk9() {
        Log.d("LiteCamera/resume");
        C203699oA r3 = this.A0E;
        C195579Yl r2 = (C195579Yl) r3;
        r2.A0G = this.A0A;
        C203389nc r1 = this.A0D;
        if (r1 != null) {
            r2.A0W.A01(r1);
        }
        r2.A0D = this.A0H;
        r3.Bk9();
        this.A0J.A01(10000);
    }

    public void Bq4(File file, int i) {
        Log.d("LiteCamera/startVideoCapture");
        C203699oA r4 = this.A0E;
        AnonymousClass9N8 r6 = this.A0I;
        C195579Yl r42 = (C195579Yl) r4;
        if (r42.A0H) {
            AnonymousClass6C7.A10(r42.A0J, AnonymousClass4L0.A0V(r6, AnonymousClass001.A0e("Cannot start video recording while camera is paused."), 2), 10);
            return;
        }
        synchronized (r42.A0X) {
            if (r42.A0b) {
                AnonymousClass6C7.A10(r42.A0J, AnonymousClass4L0.A0V(r6, AnonymousClass001.A0e("Cannot start video recording. Another recording already in progress"), 2), 10);
            } else {
                r42.A0b = true;
                r42.A0a = r6;
                r42.A0Q.Bq5(new C203849oP(r42, 0), file, (File) null);
            }
        }
    }

    public void BqD() {
        Log.d("LiteCamera/stopVideoCapture");
        ((C195579Yl) this.A0E).A04(true);
    }

    public void Bqa(AnonymousClass5PM r4, boolean z) {
        Log.d("LiteCamera/takePicture");
        C193259Nt r1 = new C193259Nt();
        r1.A01 = false;
        r1.A00 = false;
        r1.A01 = z;
        r1.A00 = true;
        C195579Yl r12 = (C195579Yl) this.A0E;
        AnonymousClass9SQ r2 = new AnonymousClass9SQ(r12, new AnonymousClass9O4(r4, this));
        C203539nu r13 = r12.A0Q;
        AnonymousClass9V5 r0 = new AnonymousClass9V5();
        r0.A00 = z;
        r13.BqZ(r2, r0);
    }

    public void Bqx() {
        String str;
        if (this.A0B) {
            boolean BJ7 = BJ7();
            C203699oA r1 = this.A0E;
            if (BJ7) {
                r1.BmI(0);
                str = "off";
            } else {
                r1.BmI(3);
                str = "torch";
            }
            this.A05 = str;
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public int getCameraApi() {
        return AnonymousClass000.A1Y(((C195579Yl) this.A0E).A0V, AnonymousClass9JW.CAMERA2) ? 1 : 0;
    }

    public int getMaxZoom() {
        C194899Ux A022;
        C195579Yl r0 = (C195579Yl) this.A0E;
        C194899Ux A023 = r0.A02();
        if (A023 == null || (A022 = r0.A02()) == null || !C194899Ux.A04(C194899Ux.A0W, A022)) {
            return 0;
        }
        return C194899Ux.A01(C194899Ux.A0a, A023);
    }

    public int getNumberOfCameras() {
        if (((C195579Yl) this.A0E).A0Q.BJ5()) {
            return 2;
        }
        return 1;
    }

    public long getPictureResolution() {
        AnonymousClass9T4 r0 = this.A0F.A00;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getStoredFlashModeCount() {
        return C18280x3.A02(this.A0C, getFlashModesCountPrefKey());
    }

    public long getVideoResolution() {
        AnonymousClass9T4 r0 = this.A0F.A02;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getZoomLevel() {
        return this.A0E.BEf();
    }

    public void pause() {
        Log.d("LiteCamera/pause");
        C203699oA r3 = this.A0E;
        r3.pause();
        C203389nc r2 = this.A0D;
        C195579Yl r1 = (C195579Yl) r3;
        if (r2 != null) {
            r1.A0W.A02(r2);
        }
        r1.A0D = null;
        r3.Bn4((C202289li) null);
        this.A0G.A00();
        this.A0K = false;
        this.A0J.A00();
    }

    public void setQrDecodeHints(Map map) {
        this.A0G.A03.A02 = map;
    }

    public void setQrScanningEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            if (z) {
                C203699oA r2 = this.A0E;
                AnonymousClass9VA r1 = this.A0G;
                r2.Bn4(r1.A01);
                if (!r1.A08) {
                    r1.A03.A01();
                    r1.A08 = true;
                    return;
                }
                return;
            }
            this.A0G.A00();
            this.A0E.Bn4((C202289li) null);
        }
    }

    public LiteCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    return 1;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    return 0;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    return 2;
                }
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Not able to map app flash mode: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    private String getFlashModesCountPrefKey() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("flash_modes_count");
        return AnonymousClass000.A0h(A0o, ((C195579Yl) this.A0E).A00);
    }

    public final void A02() {
        List flashModes = getFlashModes();
        SharedPreferences sharedPreferences = this.A0C;
        if (C18280x3.A02(sharedPreferences, getFlashModesCountPrefKey()) != flashModes.size()) {
            C18270x1.A0h(sharedPreferences.edit(), getFlashModesCountPrefKey(), flashModes.size());
        }
    }

    public boolean BLO() {
        if (!BHe() || this.A05.equals("off")) {
            return false;
        }
        return true;
    }

    public int Bnu(int i) {
        C18260x0.A0w("LiteCamera/setZoomLevel: ", AnonymousClass001.A0o(), i);
        C203699oA r3 = this.A0E;
        C195579Yl r2 = (C195579Yl) r3;
        C194899Ux A022 = r2.A02();
        if (A022 != null && C194899Ux.A04(C194899Ux.A0W, A022)) {
            r2.A0Q.Bnv((AnonymousClass9SG) null, i);
        }
        return r3.BEf();
    }

    public List getFlashModes() {
        if (BHe()) {
            return this.A07;
        }
        return this.A06;
    }

    public boolean BHi() {
        return this.A0K;
    }

    public boolean BqT() {
        return this.A0B;
    }

    public int getCameraType() {
        return 1;
    }

    public String getFlashMode() {
        return this.A05;
    }

    public void setCameraCallback(C185898uQ r1) {
        this.A00 = r1;
    }

    public LiteCameraView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a5, code lost:
        if (java.lang.Math.abs(1.0d - r1) <= 0.30000001192092896d) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LiteCameraView(android.content.Context r9, int r10, X.C203699oA r11) {
        /*
            r8 = this;
            r8.<init>(r9)
            java.lang.String r0 = "off"
            r8.A05 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r8.A06 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r8.A07 = r0
            X.9Yk r0 = new X.9Yk
            r0.<init>(r8)
            r8.A0D = r0
            X.9N7 r0 = new X.9N7
            r0.<init>(r8)
            r8.A0H = r0
            X.9N8 r0 = new X.9N8
            r0.<init>(r8)
            r8.A0I = r0
            X.4FS r1 = r8.A02
            X.9SR r0 = new X.9SR
            r0.<init>(r1)
            r8.A0J = r0
            java.lang.String r0 = X.C58152un.A0A
            r2 = 0
            android.content.SharedPreferences r1 = r9.getSharedPreferences(r0, r2)
            r8.A0C = r1
            java.lang.String r0 = "camera_facing"
            int r0 = r1.getInt(r0, r2)
            r8.A0E = r11
            r11.BmQ(r0)
            r0 = 2015(0x7df, float:2.824E-42)
            if (r10 < r0) goto L_0x00da
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r5 = 2073600(0x1fa400, float:2.905732E-39)
        L_0x004e:
            java.lang.String r0 = "window"
            java.lang.Object r3 = r9.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r2 = r3.getDefaultDisplay()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00cd
            android.view.WindowMetrics r0 = r3.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x0070:
            int r1 = r1 * r0
            float r7 = (float) r1
            r0 = 1241325568(0x49fd2000, float:2073600.0)
            float r1 = r7 / r0
            r0 = 1231093760(0x49610000, float:921600.0)
            float r7 = r7 / r0
            double r1 = (double) r1
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c9
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            double r1 = (double) r7
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 307200(0x4b000, float:4.30479E-40)
            if (r0 > 0) goto L_0x00aa
        L_0x00a7:
            r2 = 921600(0xe1000, float:1.291437E-39)
        L_0x00aa:
            r1 = 1
            X.9Wa r0 = new X.9Wa
            r0.<init>(r2, r6, r5, r1)
            r8.A0F = r0
            X.9Yl r11 = (X.C195579Yl) r11
            r11.A0B = r0
            android.view.TextureView r1 = r11.A0M
            r0 = -2
            r8.addView(r1, r0)
            X.9N6 r1 = new X.9N6
            r1.<init>(r8)
            X.9VA r0 = new X.9VA
            r0.<init>(r1)
            r8.A0G = r0
            return
        L_0x00c9:
            r2 = 2073600(0x1fa400, float:2.905732E-39)
            goto L_0x00aa
        L_0x00cd:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r2.getRealMetrics(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            goto L_0x0070
        L_0x00da:
            r0 = 2013(0x7dd, float:2.821E-42)
            r6 = 2097152(0x200000, float:2.938736E-39)
            r5 = 307200(0x4b000, float:4.30479E-40)
            if (r10 < r0) goto L_0x004e
            r6 = 5242880(0x500000, float:7.34684E-39)
            r5 = 921600(0xe1000, float:1.291437E-39)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.litecamera.LiteCameraView.<init>(android.content.Context, int, X.9oA):void");
    }

    public LiteCameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public LiteCameraView(Context context) {
        super(context);
        A01();
    }
}
