package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.6EW  reason: invalid class name */
public class AnonymousClass6EW extends SurfaceView implements C186388vE, AnonymousClass4GJ {
    public int A00;
    public int A01;
    public Camera.Size A02;
    public Camera A03;
    public Handler A04;
    public Handler A05;
    public HandlerThread A06;
    public HandlerThread A07;
    public AnonymousClass6YW A08;
    public C84874Eb A09;
    public C116855qy A0A;
    public List A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Camera.AutoFocusCallback A0H;
    public final Camera.PreviewCallback A0I;
    public final Handler A0J;
    public final SurfaceHolder.Callback A0K;
    public final SurfaceHolder A0L;
    public final C157227hx A0M;
    public final Runnable A0N;

    public AnonymousClass6EW(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0J = AnonymousClass000.A0A();
        this.A0M = new C157227hx();
        this.A0E = false;
        AnonymousClass91N r2 = new AnonymousClass91N(this, 1);
        this.A0K = r2;
        this.A0I = new C1898292u(this, 1);
        this.A0H = new C1895691u(this, 1);
        this.A0N = new C71273bq((Object) this, 46);
        SurfaceHolder holder = getHolder();
        this.A0L = holder;
        holder.addCallback(r2);
    }

    public final void A00(int i) {
        if (this.A09 != null) {
            this.A0J.post(new C71563cJ((Object) this, i, 6));
        }
    }

    public boolean BJ7() {
        Camera camera = this.A03;
        if (camera == null || !this.A0F) {
            return false;
        }
        boolean equals = "torch".equals(camera.getParameters().getFlashMode());
        this.A0G = equals;
        return equals;
    }

    public void Bjp() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new C70033Zp(this, 3));
        }
    }

    public void Bk5() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new C71273bq((Object) this, 49));
        }
    }

    public void Bpb() {
        Log.i("qrview/startcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.startPreview();
            } catch (RuntimeException e) {
                Log.e("qrview/startCamerapreview ", e);
            }
        }
    }

    public void BqA() {
        Log.i("qrview/stopcameraPreview");
        Camera camera = this.A03;
        if (camera != null) {
            try {
                camera.stopPreview();
            } catch (Exception e) {
                Log.w("qrview/stopcamera error stopping camera preview", e);
            }
        }
    }

    public boolean BqT() {
        return this.A0F;
    }

    public void Bqx() {
        String str;
        Camera camera = this.A03;
        if (camera != null && this.A0F) {
            this.A0G = !this.A0G;
            Camera.Parameters parameters = camera.getParameters();
            if (this.A0G) {
                str = "torch";
            } else {
                str = "off";
            }
            parameters.setFlashMode(str);
            camera.setParameters(parameters);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public Camera.Size getPreviewSize() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        Log.i("qrview/onAttachedToWindow");
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("QrScannerCamera");
        this.A06 = handlerThread;
        handlerThread.start();
        this.A04 = AnonymousClass6C9.A0R(this.A06);
        HandlerThread handlerThread2 = new HandlerThread("QrScannerViewDecode");
        this.A07 = handlerThread2;
        handlerThread2.start();
        this.A05 = AnonymousClass6C9.A0R(this.A07);
        if (this.A0E) {
            AnonymousClass7GO r1 = new AnonymousClass7GO(getContext().getApplicationContext());
            AnonymousClass6TM r2 = r1.A01;
            r2.A00 = 256;
            this.A08 = new AnonymousClass6YW(new AnonymousClass6YJ(r1.A00, r2));
        }
    }

    public void onDetachedFromWindow() {
        Log.i("qrview/onDetachedFromWindow");
        super.onDetachedFromWindow();
        HandlerThread handlerThread = this.A06;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.A07;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        AnonymousClass6YW r0 = this.A08;
        if (r0 != null) {
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r1 == 2) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r10 = r17
            r1 = r18
            r0 = r19
            super.onMeasure(r1, r0)
            r0 = 0
            r10.A01 = r0
            r10.A00 = r0
            int r9 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            android.hardware.Camera r0 = r10.A03
            java.lang.String r7 = "x"
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/measure/no camera "
            X.AnonymousClass6C7.A1J(r0, r7, r1, r9, r8)
            java.lang.String r0 = r1.toString()
        L_0x0029:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x002c:
            return
        L_0x002d:
            java.util.List r0 = r10.A0B
            if (r0 == 0) goto L_0x00f0
            android.content.Context r0 = r10.getContext()
            android.view.WindowManager r0 = X.C620633i.A01(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            if (r1 == 0) goto L_0x0047
            r0 = 2
            r3 = 0
            if (r1 != r0) goto L_0x0048
        L_0x0047:
            r3 = 1
        L_0x0048:
            java.util.List r2 = r10.A0B
            r1 = r9
            r0 = r8
            if (r3 == 0) goto L_0x0050
            r1 = r8
            r0 = r9
        L_0x0050:
            android.hardware.Camera$Size r6 = X.C132906gD.A01(r2, r1, r0)
            if (r6 == 0) goto L_0x00f0
            double r4 = (double) r9
            double r2 = (double) r8
            double r15 = r4 / r2
            int r14 = r6.width
            double r0 = (double) r14
            int r13 = r6.height
            double r11 = (double) r13
            double r0 = r0 / r11
            double r15 = r15 - r0
            double r11 = java.lang.Math.abs(r15)
            double r15 = r2 / r4
            double r15 = r15 - r0
            double r0 = java.lang.Math.abs(r15)
            double r0 = java.lang.Math.min(r11, r0)
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "qrview/measure optimalpreviewsize:"
            X.AnonymousClass6C7.A1J(r11, r7, r12, r14, r13)
            java.lang.String r11 = " measured:"
            X.AnonymousClass6C7.A1J(r11, r7, r12, r9, r8)
            java.lang.String r11 = " aspect diff:"
            r12.append(r11)
            r12.append(r0)
            X.C18280x3.A14(r12)
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x002c
            boolean r1 = X.C86624Kv.A1W(r9, r8)
            int r11 = r6.width
            int r9 = r6.height
            boolean r0 = X.C86624Kv.A1W(r11, r9)
            java.lang.String r8 = "qrview/measure optimalpreviewsize scale:"
            if (r1 != r0) goto L_0x00d6
            double r0 = (double) r11
            double r4 = r4 / r0
            double r0 = (double) r9
            double r2 = r2 / r0
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r8)
            r0.append(r2)
            X.C18280x3.A14(r0)
            int r0 = r6.width
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r6.height
        L_0x00bc:
            double r0 = (double) r0
            double r2 = r2 * r0
            int r4 = (int) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/measure result:"
            r1.append(r0)
            r1.append(r5)
            X.C18260x0.A0y(r7, r1, r4)
            r10.A01 = r5
            r10.A00 = r4
            r10.setMeasuredDimension(r5, r4)
            return
        L_0x00d6:
            double r0 = (double) r9
            double r4 = r4 / r0
            double r0 = (double) r11
            double r2 = r2 / r0
            double r2 = java.lang.Math.max(r4, r2)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r8)
            r0.append(r2)
            X.C18280x3.A14(r0)
            int r0 = r6.height
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r6.width
            goto L_0x00bc
        L_0x00f0:
            java.lang.String r0 = "qrview/measure/no preview"
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EW.onMeasure(int, int):void");
    }

    public void setQrDecodeHints(Map map) {
        this.A0C = map;
    }

    public void setQrScannerCallback(C84874Eb r1) {
        this.A09 = r1;
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A0E = z;
    }
}
