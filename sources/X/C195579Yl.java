package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9Yl  reason: invalid class name and case insensitive filesystem */
public class C195579Yl implements C203699oA, TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C202289li A0A;
    public C195119Wa A0B;
    public C193479Ou A0C;
    public AnonymousClass9N7 A0D;
    public AnonymousClass9N9 A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final Handler A0J;
    public final HandlerThread A0K;
    public final OrientationEventListener A0L;
    public final TextureView A0M;
    public final AnonymousClass9ML A0N;
    public final AnonymousClass9QW A0O;
    public final C194559Tk A0P;
    public final C203539nu A0Q;
    public final C202329lq A0R;
    public final C202339lr A0S;
    public final AnonymousClass9SG A0T;
    public final AnonymousClass9SG A0U;
    public final AnonymousClass9JW A0V;
    public final C194439Sw A0W = new C194439Sw();
    public final Object A0X = AnonymousClass002.A0D();
    public final String A0Y;
    public final boolean A0Z;
    public volatile AnonymousClass9N8 A0a;
    public volatile boolean A0b;

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.await(5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw X.AnonymousClass002.A0E("Timeout stopping video recording.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r6 == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(boolean r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            java.lang.Object r2 = r5.A0X
            monitor-enter(r2)
            boolean r0 = r5.A0b     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return
        L_0x0010:
            X.9nu r1 = r5.A0Q     // Catch:{ all -> 0x002d }
            X.96l r0 = new X.96l     // Catch:{ all -> 0x002d }
            r0.<init>(r5, r3, r6)     // Catch:{ all -> 0x002d }
            r1.BqE(r0, r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x002c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0025 }
            r0 = 5
            r3.await(r0, r2)     // Catch:{ InterruptedException -> 0x0025 }
            return
        L_0x0025:
            java.lang.String r0 = "Timeout stopping video recording."
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195579Yl.A04(boolean):void");
    }

    public C195579Yl(Context context, TextureView textureView, AnonymousClass9XR r8, C194559Tk r9, C203539nu r10, boolean z) {
        AnonymousClass9JW r0;
        boolean z2 = false;
        this.A07 = 0;
        this.A05 = 0;
        this.A09 = 0;
        this.A04 = -1;
        this.A03 = -1;
        this.A0F = true;
        this.A0T = new C203849oP(this, 3);
        this.A0U = new C203849oP(this, 4);
        this.A0R = new C204729pp(this, 0);
        this.A0N = new AnonymousClass9ML(this);
        this.A0O = new AnonymousClass9QW(this);
        this.A0S = new C204739pq(this, 0);
        this.A0I = context;
        this.A0Y = "WhatsAppCamera";
        if (z) {
            r0 = AnonymousClass9JW.CAMERA2;
        } else {
            r0 = AnonymousClass9JW.CAMERA1;
        }
        this.A0V = r0;
        this.A02 = 1920;
        this.A01 = 1080;
        this.A0Q = r10;
        this.A0P = r9;
        this.A0J = new Handler(Looper.getMainLooper(), r8);
        HandlerThread handlerThread = new HandlerThread("Simple-Lite-Camera-Callback-Thread");
        this.A0K = handlerThread;
        handlerThread.start();
        this.A00 = this.A0Q.BFC(0) ^ true ? 1 : 0;
        this.A0H = true;
        this.A0Z = textureView == null ? true : z2;
        textureView = textureView == null ? new AnonymousClass944(context) : textureView;
        this.A0M = textureView;
        textureView.setSurfaceTextureListener(this);
        this.A0L = new AnonymousClass943(context, this);
    }

    public static /* synthetic */ void A00(C195579Yl r3, C193479Ou r4) {
        if (r3.A0Z) {
            AnonymousClass9T4 r0 = (AnonymousClass9T4) r4.A02.A08(C195049Vr.A0n);
            int i = r0.A02;
            r3.A08 = i;
            int i2 = r0.A01;
            r3.A06 = i2;
            AnonymousClass944 r1 = (AnonymousClass944) r3.A0M;
            r1.A01 = i;
            r1.A00 = i2;
            r1.A02 = true;
            AnonymousClass9WU.A00(new C198619fD(r3));
        }
    }

    public final int A01() {
        WindowManager windowManager = (WindowManager) this.A0I.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public final C194899Ux A02() {
        C203539nu r1 = this.A0Q;
        if (r1 == null || !r1.isConnected()) {
            return null;
        }
        try {
            return r1.B5H();
        } catch (C201659kW unused) {
            return null;
        }
    }

    public final void A03(C193479Ou r5) {
        C203539nu r3 = this.A0Q;
        if (r3.isConnected() && r5 != null) {
            int A012 = A01();
            if (this.A04 == A012) {
                Object[] A1Z = AnonymousClass6C9.A1Z(this, 4);
                A1Z[1] = this.A0C;
                AnonymousClass000.A1N(A1Z, this.A08);
                A1Z[3] = Integer.valueOf(this.A06);
                AnonymousClass6C7.A10(this.A0J, A1Z, 15);
                return;
            }
            this.A04 = A012;
            r3.Bn3(new C203849oP(this, 2), A012);
        }
    }

    public void Bk9() {
        C192459Jv r2;
        if (this.A0H) {
            this.A0H = false;
            OrientationEventListener orientationEventListener = this.A0L;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = this.A0K;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                C203539nu r4 = this.A0Q;
                r4.Blu(new Handler(looper));
                C195119Wa r3 = this.A0B;
                if (r3 == null) {
                    r3 = new C195119Wa(this.A07, this.A05, this.A09);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    r2 = C192459Jv.HIGH;
                } else {
                    r2 = C192459Jv.MEDIUM;
                }
                C195699Ze r7 = new C195699Ze(r3, new AnonymousClass9QR(), C192459Jv.HIGH, r2);
                r7.A00.put(3, Boolean.valueOf(this.A0G));
                this.A04 = A01();
                r4.Awf(this.A0O);
                r4.BmJ(this.A0R);
                String str = this.A0Y;
                int i = this.A00;
                int i2 = 0;
                if (i != 0) {
                    i2 = 1;
                    if (i != 1) {
                        throw C1899593h.A0Y("Could not convert camera facing to optic: ", AnonymousClass001.A0o(), i);
                    }
                }
                r4.AzW(this.A0T, new AnonymousClass9SV(new C193429Op(this.A0P, this.A02, this.A01)), r7, (C202039lH) null, (C202049lI) null, str, i2, this.A04);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Callback handler looper is null. CallbackHandlerThread is alive: ");
            A0o.append(handlerThread.isAlive());
            throw AnonymousClass6C7.A0e(A0o);
        }
    }

    public void BmI(int i) {
        int i2 = 1;
        if (this.A00 != 1) {
            C194429Sv r2 = new C194429Sv();
            AnonymousClass9Mx r1 = C195049Vr.A0A;
            if (i == 0) {
                i2 = 0;
            } else if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                }
            }
            r2.A01(r1, Integer.valueOf(i2));
            this.A0Q.BLK(new AnonymousClass96k(), r2.A00());
        }
    }

    public void BmQ(int i) {
        if (this.A0H) {
            C203539nu r1 = this.A0Q;
            int i2 = 0;
            if (i != 0) {
                i2 = 1;
                if (i != 1) {
                    throw C1899593h.A0Y("Could not convert camera facing to optic: ", AnonymousClass001.A0o(), i);
                }
            }
            if (r1.BFC(i2)) {
                this.A00 = i;
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("Initial camera facing must be set before initializing the camera.");
    }

    public void Bmm(boolean z) {
        this.A0Q.BmZ(z);
    }

    public void Bmu(int i) {
        if (this.A0H) {
            this.A05 = 1048576;
            return;
        }
        throw AnonymousClass001.A0e("Photo resolution level must be set before initializing the camera.");
    }

    public void Bn4(C202289li r3) {
        if (!this.A0H) {
            C203539nu r1 = this.A0Q;
            if (r1.isConnected()) {
                if (r3 != null) {
                    r1.Awe(this.A0S);
                } else if (this.A0A != null) {
                    r1.BjI(this.A0S);
                }
            }
        }
        this.A0A = r3;
    }

    public void finalize() {
        this.A0K.quitSafely();
        super.finalize();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C194559Tk r0 = this.A0P;
        r0.A05 = i;
        r0.A03 = i2;
        synchronized (r0.A0B) {
            r0.A0E = surfaceTexture;
            r0.A0A.countDown();
        }
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C194559Tk r4 = this.A0P;
        synchronized (r4.A0B) {
            if (r4.A0E != null) {
                r4.A0D = null;
                r4.A0E = null;
                r4.A0A = new CountDownLatch(1);
            }
            AnonymousClass9XB r1 = r4.A0F;
            if (r1 != null) {
                r1.A03((SurfaceTexture) null, 0);
            }
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C194559Tk r0 = this.A0P;
        r0.A05 = i;
        r0.A03 = i2;
        this.A08 = i;
        this.A06 = i2;
        A03(this.A0C);
    }

    public void pause() {
        if (!this.A0H) {
            OrientationEventListener orientationEventListener = this.A0L;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            this.A0H = true;
            C203539nu r1 = this.A0Q;
            r1.BjJ(this.A0O);
            r1.BmJ((C202329lq) null);
            r1.B1n(new C203849oP(this, 1));
        }
    }

    public int BEf() {
        C194899Ux A022;
        int i;
        C194899Ux A023 = A02();
        if (A023 == null || (A022 = A02()) == null) {
            return 100;
        }
        C193049Mw r2 = C194899Ux.A0W;
        if (!C194899Ux.A04(r2, A022)) {
            return 100;
        }
        List A032 = C194899Ux.A03(C194899Ux.A10, A023);
        C194899Ux A024 = A02();
        if (A024 == null || !C194899Ux.A04(r2, A024)) {
            i = 0;
        } else {
            i = this.A0Q.getZoomLevel();
        }
        return AnonymousClass000.A09(A032, i);
    }

    public void Bn5(int i) {
        if (this.A0H) {
            this.A07 = 921600;
            return;
        }
        throw AnonymousClass001.A0e("Preview resolution level must be set before initializing the camera.");
    }

    public void Bnm(int i) {
        if (this.A0H) {
            this.A09 = 921600;
            return;
        }
        throw AnonymousClass001.A0e("Video resolution level must be set before initializing the camera.");
    }

    public void destroy() {
    }

    public View B5D(Context context) {
        return this.A0M;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
