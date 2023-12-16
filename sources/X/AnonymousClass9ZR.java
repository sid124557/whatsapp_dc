package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import java.io.File;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9ZR  reason: invalid class name */
public class AnonymousClass9ZR implements C203539nu {
    public static final Camera.ShutterCallback A0h = new AnonymousClass9XI();
    public static volatile AnonymousClass9ZR A0i;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Camera.ErrorCallback A04;
    public C194559Tk A05;
    public C202339lr A06;
    public AnonymousClass9SV A07;
    public C192959Mk A08;
    public C203589nz A09;
    public AnonymousClass9VT A0A;
    public UUID A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final int A0H;
    public final Context A0I;
    public final C194919Vb A0J;
    public final C194349Sn A0K;
    public final AnonymousClass9RS A0L;
    public final AnonymousClass9TI A0M;
    public final C193809Qd A0N = new C193809Qd();
    public final AnonymousClass9XE A0O;
    public final AnonymousClass9T8 A0P;
    public final C194439Sw A0Q = new C194439Sw();
    public final C194439Sw A0R = new C194439Sw();
    public final C194439Sw A0S = new C194439Sw();
    public final AnonymousClass9TX A0T;
    public final C194959Vh A0U;
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public volatile int A0Y;
    public volatile Camera A0Z;
    public volatile C194559Tk A0a;
    public volatile AnonymousClass9KV A0b;
    public volatile FutureTask A0c;
    public volatile boolean A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;
    public volatile boolean A0g;

    public final void A04() {
        try {
            if (this.A0f) {
                A06();
            }
        } catch (RuntimeException e) {
            Log.e("Camera1Device", "Stop video recording failed, likely due to nothing being captured", e);
        } catch (Throwable th) {
            if (this.A0Z != null) {
                A03();
                this.A0M.A00();
            }
            if (this.A0a != null) {
                this.A0a.A02();
            }
            this.A0a = null;
            this.A07 = null;
            throw th;
        }
        if (this.A0Z != null) {
            A03();
            this.A0M.A00();
        }
        if (this.A0a != null) {
            this.A0a.A02();
        }
        this.A0a = null;
        this.A07 = null;
    }

    public final void A06() {
        try {
            C194559Tk r0 = this.A05;
            if (r0 != null) {
                r0.A03();
                this.A05 = null;
            }
        } finally {
            A02();
            this.A0f = false;
        }
    }

    public final synchronized void A07() {
        FutureTask futureTask = this.A0c;
        if (futureTask != null) {
            this.A0U.A08(futureTask);
            this.A0c = null;
        }
    }

    public boolean BJ5() {
        try {
            C194919Vb r2 = this.A0J;
            int i = C194919Vb.A03;
            if (i == -1) {
                if (r2.A05()) {
                    i = C194919Vb.A03;
                } else {
                    r2.A02.A06("Number of cameras must be loaded on background thread.");
                    i = Camera.getNumberOfCameras();
                    C194919Vb.A03 = i;
                }
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void Bn3(AnonymousClass9SG r4, int i) {
        this.A0U.A00(r4, "set_rotation", new C204509pT(this, i, 0));
    }

    public void Bnv(AnonymousClass9SG r5, int i) {
        this.A0U.A00((AnonymousClass9SG) null, "set_zoom_level", new C204509pT(this, i, 2));
    }

    public final int A00(int i) {
        int i2;
        int i3;
        int i4 = this.A00;
        int A012 = this.A0J.A01(i4);
        if (i == 1) {
            i2 = 90;
        } else if (i != 2) {
            i2 = 270;
            if (i != 3) {
                i2 = 0;
            }
        } else {
            i2 = 180;
        }
        if (i4 == 1) {
            i3 = 360 - ((A012 + i2) % 360);
        } else {
            i3 = (A012 - i2) + 360;
        }
        return i3 % 360;
    }

    public final C193479Ou A01(AnonymousClass9SV r25, C203589nz r26, int i) {
        List A032;
        List list;
        List list2;
        int i2;
        Trace.beginSection("Camera1Device.initialiseCamera");
        AnonymousClass9WU.A01("initialiseCamera should not run on the UI thread");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A0Z != null) {
            AnonymousClass9WT.A00();
            AtomicBoolean atomicBoolean = this.A0V;
            AnonymousClass9SV r3 = r25;
            C203589nz r6 = r26;
            int i3 = i;
            if (!atomicBoolean.get() || !r3.equals(this.A07) || this.A0a != r3.A02 || this.A01 != i3 || C1899593h.A1V(C203589nz.A0Q, r6)) {
                this.A09 = r6;
                this.A07 = r3;
                C194559Tk r9 = r3.A02;
                this.A0a = r9;
                this.A0L.A00(false, this.A0Z);
                C203589nz r2 = this.A09;
                Object B3x = r2.B3x(C203589nz.A0P);
                Object B3x2 = r2.B3x(C203589nz.A0T);
                int i4 = r3.A01;
                int i5 = r3.A00;
                C195119Wa r32 = (C195119Wa) r2.B3x(C203589nz.A0R);
                AnonymousClass9QR r22 = (AnonymousClass9QR) r2.B3x(C203589nz.A09);
                this.A0G = C1899593h.A1V(C203589nz.A0E, r6);
                boolean A1V = C1899593h.A1V(C203589nz.A0H, r6);
                this.A01 = i3;
                A00(i3);
                AnonymousClass9T8 r1 = this.A0P;
                C194899Ux A012 = r1.A01(this.A00);
                C192459Jv r0 = C192459Jv.DEACTIVATED;
                boolean equals = B3x2.equals(r0);
                boolean equals2 = B3x.equals(r0);
                if (!equals) {
                    if (!equals2) {
                        list = C194899Ux.A03(C194899Ux.A0n, A012);
                        list2 = C194899Ux.A03(C194899Ux.A0x, A012);
                        A032 = C194899Ux.A03(C194899Ux.A0r, A012);
                    } else {
                        list2 = C194899Ux.A03(C194899Ux.A0x, A012);
                        A032 = C194899Ux.A03(C194899Ux.A0r, A012);
                        list = null;
                    }
                } else if (!equals2) {
                    list = C194899Ux.A03(C194899Ux.A0n, A012);
                    A032 = C194899Ux.A03(C194899Ux.A0r, A012);
                    list2 = null;
                } else {
                    A032 = C194899Ux.A03(C194899Ux.A0r, A012);
                    list = null;
                    list2 = null;
                }
                C193459Os A042 = r32.A04(list, list2, A032, i4, i5);
                AnonymousClass96v A002 = r1.A00(this.A00);
                if (A1V) {
                    AnonymousClass9My.A02(C195049Vr.A0a, A002, new AnonymousClass9T4(0, 0));
                }
                AnonymousClass9T4 r4 = A042.A00;
                if (r4 != null) {
                    AnonymousClass9My.A02(C195049Vr.A0h, A002, r4);
                }
                AnonymousClass9T4 r02 = A042.A01;
                AnonymousClass9Mx r13 = C195049Vr.A0n;
                AnonymousClass9My.A02(r13, A002, r02);
                AnonymousClass9T4 r42 = A042.A02;
                if (r42 != null) {
                    AnonymousClass9My.A02(C195049Vr.A0u, A002, r42);
                }
                A002.A03();
                A002.A00.A01(C195049Vr.A00, C18290x4.A0a());
                A002.A00.A01(C195049Vr.A0v, AnonymousClass001.A0f());
                A002.A00.A01(C195049Vr.A0k, r22.A00(C194899Ux.A03(C194899Ux.A0p, A002.A00)));
                A002.A00.A01(C195049Vr.A0p, C18290x4.A0Z());
                int i6 = this.A00;
                C194899Ux A013 = r1.A01(i6);
                Number number = (Number) this.A09.B3x(C203589nz.A0J);
                if (number.intValue() != 0) {
                    AnonymousClass9My.A02(C195049Vr.A0Y, A002, number);
                }
                A002.A02();
                AnonymousClass9TI r8 = this.A0M;
                r8.A01(this.A0Z);
                C195049Vr A022 = r1.A02(i6);
                AnonymousClass9T4 r23 = (AnonymousClass9T4) C195049Vr.A04(r13, A022);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("startCameraPreview ");
                int i7 = r23.A02;
                A0o.append(i7);
                A0o.append("x");
                int i8 = r23.A01;
                Trace.beginSection(AnonymousClass000.A0h(A0o, i8));
                AnonymousClass9WT.A00();
                AnonymousClass9Mx r24 = C195049Vr.A0j;
                C195049Vr.A06(r24, A022);
                int A014 = this.A0J.A01(i6);
                int i9 = this.A0Y;
                int i10 = this.A01;
                if (i10 == 1) {
                    i2 = 90;
                } else if (i10 != 2) {
                    i2 = 270;
                    if (i10 != 3) {
                        i2 = 0;
                    }
                } else {
                    i2 = 180;
                }
                SurfaceTexture A003 = r9.A00(i7, i8, A014, i9, i2);
                AnonymousClass9WT.A00();
                Camera camera = this.A0Z;
                if (A003 != null) {
                    camera.setPreviewTexture(A003);
                } else {
                    camera.setPreviewDisplay((SurfaceHolder) null);
                }
                this.A0Z.setDisplayOrientation(A00(0));
                this.A0E = C194899Ux.A04(C194899Ux.A0S, A013);
                atomicBoolean.set(true);
                this.A0W.set(false);
                this.A0g = C194899Ux.A04(C194899Ux.A0W, A013);
                AnonymousClass9XE r43 = this.A0O;
                Camera camera2 = this.A0Z;
                int i11 = this.A00;
                r43.A03 = camera2;
                r43.A00 = i11;
                AnonymousClass9T8 r92 = r43.A05;
                C194899Ux A015 = r92.A01(i11);
                r43.A0A = C194899Ux.A03(C194899Ux.A10, A015);
                r43.A0E = C194899Ux.A04(C194899Ux.A0V, A015);
                r43.A09 = C195049Vr.A02(C195049Vr.A0x, r92.A02(i11));
                r43.A01 = C194899Ux.A01(C194899Ux.A0a, r92.A01(i11));
                Camera camera3 = r43.A03;
                camera3.getClass();
                camera3.setZoomChangeListener(r43);
                r43.A0B = true;
                C194349Sn r14 = this.A0K;
                Camera camera4 = this.A0Z;
                int i12 = this.A00;
                r14.A06.A06("The FocusController must be prepared on the Optic thread.");
                r14.A01 = camera4;
                r14.A00 = i12;
                r14.A09 = true;
                r14.A08 = false;
                r14.A07 = false;
                r14.A04 = true;
                r14.A0A = false;
                A08(i7, i8);
                r8.A02(this.A0Z, (AnonymousClass9T4) A022.A08(r13), C195049Vr.A02(r24, A022));
                A05();
                AnonymousClass9VK.A00().A01 = 0;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("time to setPreviewSurfaceTexture:");
                A0o2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                Log.d("Camera1Device", AnonymousClass000.A0X("ms", A0o2));
                C193479Ou r12 = new C193479Ou(new C193469Ot(A013, A022, i6));
                AnonymousClass9WT.A00();
                Trace.endSection();
                Trace.endSection();
                return r12;
            }
            if (this.A0L.A00.A00()) {
                A05();
            }
            int i13 = this.A00;
            C194899Ux B5H = B5H();
            A0B("Cannot get camera settings");
            return new C193479Ou(new C193469Ot(B5H, this.A0P.A02(this.A00), i13));
        }
        throw AnonymousClass002.A0E("Can't connect to the camera service.");
    }

    public void A02() {
        Camera camera = this.A0Z;
        if (camera != null) {
            boolean z = this.A0C;
            int i = this.A02;
            camera.lock();
            if (C194989Vk.A02(AnonymousClass9UX.A01)) {
                camera.reconnect();
            }
            AnonymousClass96v A002 = this.A0P.A00(this.A00);
            AnonymousClass9My.A02(C195049Vr.A0A, A002, Integer.valueOf(i));
            A002.A00.A01(C195049Vr.A0T, Boolean.valueOf(z));
            A002.A03();
            A002.A02();
        }
    }

    public final void A03() {
        if (this.A0Z != null) {
            A07();
            this.A0V.set(false);
            this.A0W.set(false);
            Camera camera = this.A0Z;
            this.A0Z = null;
            AnonymousClass9XE r2 = this.A0O;
            if (r2.A0B) {
                Handler handler = r2.A04;
                handler.removeMessages(1);
                handler.removeMessages(2);
                r2.A0A = null;
                Camera camera2 = r2.A03;
                camera2.getClass();
                camera2.setZoomChangeListener((Camera.OnZoomChangeListener) null);
                r2.A03 = null;
                r2.A0B = false;
            }
            C194349Sn r22 = this.A0K;
            r22.A06.A06("The FocusController must be released on the Optic thread.");
            r22.A09 = false;
            r22.A01 = null;
            r22.A08 = false;
            r22.A07 = false;
            this.A0g = false;
            AnonymousClass9T8 r0 = this.A0P;
            r0.A02.remove(r0.A03.A02(this.A00));
            this.A0U.A03("close_camera_on_camera_handler_thread", new C204489pR(camera, 6, this));
        }
    }

    public final void A08(int i, int i2) {
        Matrix matrix;
        float f;
        float f2;
        float f3;
        Matrix matrix2 = new Matrix();
        this.A03 = matrix2;
        float f4 = 1.0f;
        if (this.A00 == 1) {
            f4 = -1.0f;
        }
        matrix2.setScale(f4, 1.0f);
        int A002 = A00(this.A01);
        this.A03.postRotate((float) A002);
        if (A002 == 90 || A002 == 270) {
            matrix = this.A03;
            f = (float) i2;
            f2 = f / 2000.0f;
            f3 = (float) i;
        } else {
            matrix = this.A03;
            f = (float) i;
            f2 = f / 2000.0f;
            f3 = (float) i2;
        }
        matrix.postScale(f2, f3 / 2000.0f);
        this.A03.postTranslate(f / 2.0f, f3 / 2.0f);
    }

    public final void A0A(C203589nz r9, int i) {
        AnonymousClass96p r5;
        SparseArray sparseArray;
        if (AnonymousClass9UU.A00(this.A0I)) {
            AnonymousClass9WU.A01("Should not check for open camera on the UI thread.");
            int i2 = i;
            if (this.A0Z == null || this.A00 != i) {
                int A022 = this.A0J.A02(i);
                if (A022 != -1) {
                    A03();
                    AnonymousClass9VK.A00().A00 = SystemClock.elapsedRealtime();
                    Camera camera = (Camera) this.A0U.A03("open_camera_on_camera_handler_thread", new C204509pT(this, A022, 1));
                    camera.getClass();
                    this.A0Z = camera;
                    this.A00 = i;
                    Camera camera2 = this.A0Z;
                    Camera.ErrorCallback errorCallback = this.A04;
                    if (errorCallback == null) {
                        errorCallback = new AnonymousClass9XD(this);
                        this.A04 = errorCallback;
                    }
                    camera2.setErrorCallback(errorCallback);
                    AnonymousClass9T8 r2 = this.A0P;
                    Camera camera3 = this.A0Z;
                    if (camera3 != null) {
                        AnonymousClass9WT.A00();
                        int A023 = r2.A03.A02(i);
                        Camera.Parameters parameters = camera3.getParameters();
                        if (r9 == null || !C1899593h.A1V(C203589nz.A00, r9)) {
                            r5 = new AnonymousClass96p(parameters);
                            sparseArray = r2.A00;
                        } else {
                            sparseArray = r2.A00;
                            r5 = (AnonymousClass96p) sparseArray.get(A023);
                            if (r5 == null) {
                                r5 = new AnonymousClass96p(parameters);
                            }
                            AnonymousClass96s r6 = new AnonymousClass96s(parameters, r5);
                            r2.A01.put(A023, r6);
                            r2.A02.put(A023, new AnonymousClass96v(parameters, camera3, r5, r6, i2));
                            AnonymousClass9WT.A00();
                            return;
                        }
                        sparseArray.put(A023, r5);
                        AnonymousClass96s r62 = new AnonymousClass96s(parameters, r5);
                        r2.A01.put(A023, r62);
                        r2.A02.put(A023, new AnonymousClass96v(parameters, camera3, r5, r62, i2));
                        AnonymousClass9WT.A00();
                        return;
                    }
                    throw AnonymousClass001.A0g("camera is null!");
                }
                throw new C201709kb(AnonymousClass000.A0Y("Open Camera 1 failed: camera facing is not available: ", AnonymousClass001.A0o(), i));
            }
            return;
        }
        throw new SecurityException("Open Camera 1 failed: No camera permissions!");
    }

    public void Awe(C202339lr r6) {
        if (r6 != null) {
            AnonymousClass9TI r4 = this.A0M;
            synchronized (r4) {
                r4.A05.A01(r6);
            }
            C195049Vr A022 = this.A0P.A02(this.A00);
            C194959Vh r2 = this.A0U;
            boolean A092 = r2.A09();
            boolean isConnected = isConnected();
            if (A092) {
                if (isConnected) {
                    r4.A02(this.A0Z, (AnonymousClass9T4) A022.A08(C195049Vr.A0n), C195049Vr.A02(C195049Vr.A0j, A022));
                }
            } else if (isConnected) {
                r2.A07("enable_preview_frame_listeners", new C204489pR(A022, 2, this));
            }
        } else {
            throw AnonymousClass001.A0c("listener is required");
        }
    }

    public void Awf(AnonymousClass9QW r4) {
        C203589nz r1 = this.A09;
        if (r1 == null || !C1899593h.A1V(C203589nz.A0F, r1)) {
            this.A0L.A01.A01(r4);
        } else {
            this.A0U.A07("add_on_preview_started_listener", new C204489pR(r4, 4, this));
        }
    }

    public boolean B1n(AnonymousClass9SG r7) {
        AnonymousClass9TX r2 = this.A0T;
        UUID uuid = r2.A03;
        AnonymousClass9WT.A00();
        C193809Qd r1 = this.A0N;
        AtomicReference atomicReference = r1.A00;
        C1899593h.A1U(atomicReference);
        C1899593h.A1U(atomicReference);
        r1.A00(0);
        AnonymousClass9RS r12 = this.A0L;
        r12.A01.A00();
        r12.A02.A00();
        BmJ((C202329lq) null);
        this.A0O.A06.A00();
        this.A0R.A00();
        if (this.A0F) {
            r2.A02(this.A0B);
            this.A0B = null;
        }
        C194959Vh r3 = this.A0U;
        r3.A00(r7, "disconnect", new C204489pR(uuid, 1, this));
        r3.A07("disconnect_guard", new C204499pS(0));
        return true;
    }

    public void B3P(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0H;
        rect.inset(i3, i3);
        this.A0U.A00(new C203849oP(this, 5), "focus", new C204489pR(rect, 5, this));
    }

    public C194899Ux B5H() {
        A0B("Cannot get camera capabilities");
        return this.A0P.A01(this.A00);
    }

    public int BCp() {
        return this.A0J.A01(this.A00);
    }

    public boolean BFC(int i) {
        try {
            return this.A0J.A06(i);
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public void BG9(Matrix matrix, int i, int i2, int i3) {
        C192959Mk r1 = new C192959Mk(matrix, i3, A00(this.A01), i, i2);
        this.A08 = r1;
        this.A0K.A03 = r1;
    }

    public boolean BKU(float[] fArr) {
        C192959Mk r0 = this.A08;
        if (r0 == null) {
            return false;
        }
        r0.A00.mapPoints(fArr);
        return true;
    }

    public void BLK(AnonymousClass9SG r4, AnonymousClass9SE r5) {
        this.A0U.A00(r4, "modify_settings", new C204489pR(r5, 3, this));
    }

    public void BXV(int i) {
        if (!this.A0D) {
            this.A0Y = i;
            C194559Tk r1 = this.A0a;
            if (r1 != null) {
                r1.A00 = this.A0Y;
            }
        }
    }

    public void BjI(C202339lr r4) {
        if (r4 != null) {
            AnonymousClass9TI r1 = this.A0M;
            synchronized (r1) {
                r1.A07.remove(r4);
                r1.A05.A02(r4);
            }
            if (this.A0T.A04) {
                this.A0U.A07("disable_preview_frame_listeners", new C204469pP((Object) this, 1));
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("listener is required");
    }

    public void BjJ(AnonymousClass9QW r4) {
        C203589nz r1 = this.A09;
        if (r1 == null || !C1899593h.A1V(C203589nz.A0F, r1)) {
            this.A0L.A01.A02(r4);
        } else {
            this.A0U.A07("remove_on_preview_started_listener", new C204489pR(r4, 0, this));
        }
    }

    public void Blu(Handler handler) {
        this.A0U.A00 = handler;
    }

    public void BmJ(C202329lq r2) {
        this.A0K.A02 = r2;
    }

    public void BmZ(boolean z) {
        this.A0D = z;
        if (z) {
            this.A0Y = 0;
            C194559Tk r1 = this.A0a;
            if (r1 != null) {
                r1.A00 = this.A0Y;
            }
        }
    }

    public void Bmj(AnonymousClass9ML r3) {
        AnonymousClass9TX r0 = this.A0T;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void BqE(AnonymousClass9SG r4, boolean z) {
        if (!this.A0f) {
            r4.A00(AnonymousClass002.A0E("Not recording video"));
            return;
        }
        this.A0U.A00(r4, "stop_video_recording", new C201469kB(this, SystemClock.elapsedRealtime()));
    }

    public void BqX(AnonymousClass9SG r6) {
        Object obj = this.A0N.A00.get();
        obj.getClass();
        if (((CountDownLatch) obj).getCount() <= 0) {
            AnonymousClass9WT.A00();
            this.A0U.A00(r6, "switch_camera", new C204469pP((Object) this, 0));
        }
    }

    public int getZoomLevel() {
        AnonymousClass9XE r1 = this.A0O;
        if (r1.A0B) {
            return r1.A09;
        }
        return 0;
    }

    public boolean isConnected() {
        if (this.A0Z == null) {
            return false;
        }
        if (this.A0V.get() || this.A0W.get()) {
            return true;
        }
        return false;
    }

    public AnonymousClass9ZR(Context context) {
        this.A0I = context;
        C194959Vh r3 = new C194959Vh();
        this.A0U = r3;
        AnonymousClass9TX r2 = new AnonymousClass9TX(r3);
        this.A0T = r2;
        C194919Vb r0 = new C194919Vb(context.getPackageManager(), r2, r3);
        this.A0J = r0;
        AnonymousClass9T8 r1 = new AnonymousClass9T8(r0);
        this.A0P = r1;
        this.A0L = new AnonymousClass9RS();
        this.A0O = new AnonymousClass9XE(r1, r3);
        this.A0K = new C194349Sn(r1, r3);
        this.A0H = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0B(context)));
        this.A0M = new AnonymousClass9TI();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r5 = this;
            boolean r0 = r5.isConnected()
            if (r0 == 0) goto L_0x0093
            X.9lr r1 = r5.A06
            if (r1 != 0) goto L_0x0012
            r0 = 1
            X.9pq r1 = new X.9pq
            r1.<init>(r5, r0)
            r5.A06 = r1
        L_0x0012:
            r5.Awe(r1)
            X.9RS r0 = r5.A0L
            android.hardware.Camera r4 = r5.A0Z
            X.9Qs r3 = r0.A00
            java.util.concurrent.locks.ReentrantLock r2 = r3.A01
            r2.lock()
            if (r4 == 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            r2.lock()     // Catch:{ all -> 0x0080 }
            int r0 = r3.A00     // Catch:{ all -> 0x007b }
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0048
            r2.lock()     // Catch:{ all -> 0x0080 }
            int r0 = r3.A00     // Catch:{ all -> 0x007b }
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass000.A1U(r0, r1)
            r2.unlock()     // Catch:{ all -> 0x0080 }
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r2.unlock()     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            int r0 = r3.A00     // Catch:{ all -> 0x0080 }
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0059
            r1 = 0
        L_0x0059:
            r2.unlock()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x008d
            r2.lock()     // Catch:{ all -> 0x0085 }
            boolean r0 = r3.A00()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0074
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x0080 }
            r2.unlock()     // Catch:{ all -> 0x0085 }
            X.AnonymousClass9WT.A00()     // Catch:{ all -> 0x0085 }
            r4.startPreview()     // Catch:{ all -> 0x0085 }
            goto L_0x008d
        L_0x0074:
            java.lang.String r0 = "Cannot progress to STARTING, not in STOPPED state"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0080 }
        L_0x007f:
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            r2.unlock()     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            X.AnonymousClass9WT.A00()
            r2.unlock()
            throw r0
        L_0x008d:
            X.AnonymousClass9WT.A00()
            r2.unlock()
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZR.A05():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r10.A00(X.AnonymousClass9VN.A0P) != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r10.A00(X.AnonymousClass9VN.A0b) != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass9SQ r7, X.C203589nz r8, X.AnonymousClass9V5 r9, X.C194409St r10, X.AnonymousClass9VN r11) {
        /*
            r6 = this;
            boolean r0 = X.C195029Vp.A00()
            r5 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0039
            X.9Mv r0 = X.C203589nz.A0C
            boolean r0 = X.C1899593h.A1V(r0, r8)
            if (r0 != 0) goto L_0x0039
            X.9N2 r0 = X.AnonymousClass9VN.A0T
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9N2 r0 = X.AnonymousClass9VN.A0Z
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9N2 r0 = X.AnonymousClass9VN.A0O
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9N2 r0 = X.AnonymousClass9VN.A0V
            java.lang.Object r0 = r10.A00(r0)
            if (r0 != 0) goto L_0x0039
            X.9N2 r0 = X.AnonymousClass9VN.A0P
            java.lang.Object r0 = r10.A00(r0)
            r3 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            X.9N0 r0 = X.AnonymousClass9V5.A02
            boolean r0 = X.AnonymousClass9V5.A00(r0, r9)
            if (r0 == 0) goto L_0x004b
            X.9N2 r0 = X.AnonymousClass9VN.A0b
            java.lang.Object r0 = r10.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            X.9N2 r1 = X.AnonymousClass9VN.A0X
            java.lang.Object r0 = r10.A00(r1)
            if (r0 != 0) goto L_0x017a
            if (r11 == 0) goto L_0x017b
            android.graphics.Rect r0 = r11.A03
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A01 = r0
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r11.A00(r1)
            byte[] r0 = (byte[]) r0
            r10.A0F = r0
        L_0x006a:
            X.9N2 r1 = X.AnonymousClass9VN.A0b
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r11.A00(r1)
            byte[] r0 = (byte[]) r0
            r10.A0G = r0
        L_0x007a:
            X.9N2 r1 = X.AnonymousClass9VN.A0Y
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r11.A00(r1)
            X.9S8 r0 = (X.AnonymousClass9S8) r0
            r10.A03 = r0
        L_0x008a:
            X.9N2 r1 = X.AnonymousClass9VN.A0d
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r11.A00(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.A02 = r0
        L_0x009a:
            X.9N2 r1 = X.AnonymousClass9VN.A0T
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            r10.A0E = r0
        L_0x00aa:
            X.9N2 r1 = X.AnonymousClass9VN.A0Z
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0A = r0
        L_0x00ba:
            X.9N2 r1 = X.AnonymousClass9VN.A0O
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A06 = r0
        L_0x00ca:
            X.9N2 r1 = X.AnonymousClass9VN.A0P
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A08 = r0
        L_0x00da:
            X.9N2 r1 = X.AnonymousClass9VN.A0V
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r10.A07 = r0
        L_0x00ea:
            X.9N2 r1 = X.AnonymousClass9VN.A0R
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x00f5
            r11.A00(r1)
        L_0x00f5:
            X.9N2 r1 = X.AnonymousClass9VN.A0Q
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r11.A00(r1)
            X.9VN r0 = (X.AnonymousClass9VN) r0
            r10.A04 = r0
        L_0x0105:
            X.9N2 r1 = X.AnonymousClass9VN.A0a
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0B = r0
        L_0x0115:
            X.9N2 r1 = X.AnonymousClass9VN.A0e
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0D = r0
        L_0x0125:
            X.9N2 r1 = X.AnonymousClass9VN.A0S
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r10.A05 = r0
        L_0x0135:
            X.9N2 r1 = X.AnonymousClass9VN.A0c
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0145
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A0C = r0
        L_0x0145:
            X.9N2 r1 = X.AnonymousClass9VN.A0U
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r11.A00(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r10.A09 = r0
        L_0x0155:
            X.9N2 r1 = X.AnonymousClass9VN.A0W
            java.lang.Object r0 = r11.A00(r1)
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r11.A00(r1)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r10.A00 = r0
        L_0x0165:
            if (r3 != 0) goto L_0x0179
            if (r2 != 0) goto L_0x0179
            if (r4 != 0) goto L_0x0179
            X.9Vh r2 = r6.A0U
            X.9TX r0 = r6.A0T
            java.util.UUID r1 = r0.A03
            X.9hJ r0 = new X.9hJ
            r0.<init>(r7, r10)
            r2.A05(r0, r1)
        L_0x0179:
            return
        L_0x017a:
            r5 = 0
        L_0x017b:
            r4 = r5
            goto L_0x0165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZR.A09(X.9SQ, X.9nz, X.9V5, X.9St, X.9VN):void");
    }

    public final void A0B(String str) {
        if (!isConnected()) {
            throw new C201659kW(str);
        }
    }

    public void AzW(AnonymousClass9SG r10, AnonymousClass9SV r11, C203589nz r12, C202039lH r13, C202049lI r14, String str, int i, int i2) {
        AnonymousClass9WT.A00();
        if (this.A0F) {
            this.A0B = this.A0T.A00(this.A0U.A00, str);
        }
        this.A0U.A00(r10, "connect", new C204459pO(r11, this, r12, i, i2, 0));
        AnonymousClass9WT.A00();
    }

    public boolean Bny(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        float f;
        matrix.reset();
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f2 / f3;
        int A002 = A00(this.A01);
        if (A002 == 90 || A002 == 270) {
            int i5 = i4;
            i4 = i3;
            i3 = i5;
        }
        float f5 = (float) i3;
        float f6 = (float) i4;
        int i6 = ((f5 / f6) > f4 ? 1 : ((f5 / f6) == f4 ? 0 : -1));
        if (!z ? i6 <= 0 : i6 > 0) {
            f = f3 / f6;
        } else {
            f = f2 / f5;
        }
        matrix.setScale((f5 / f2) * f, (f6 / f3) * f, (float) (i / 2), (float) (i2 / 2));
        return true;
    }

    public void Bq5(AnonymousClass9SG r6, File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw AnonymousClass001.A0c("Both videoPath and videoFileDescriptor cannot be null, one must contain a valid value");
        } else if (!isConnected()) {
            r6.A00(AnonymousClass002.A0E("Can't record video before it's initialised."));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A0f = true;
            this.A0U.A00(new C203839oO(r6, 0, this), "start_video", new C201479kC(this, absolutePath, elapsedRealtime));
        }
    }

    public void BqZ(AnonymousClass9SQ r7, AnonymousClass9V5 r8) {
        if (!isConnected()) {
            r7.A00(new C201659kW("Cannot take a photo"));
            return;
        }
        C193809Qd r3 = this.A0N;
        Object obj = r3.A00.get();
        obj.getClass();
        if (((CountDownLatch) obj).getCount() > 0) {
            r7.A00(new AnonymousClass9KK("Busy taking photo"));
        } else if (!this.A0f || this.A0E) {
            AnonymousClass9VK.A00().A03 = SystemClock.elapsedRealtime();
            A0B("Cannot get camera settings");
            C195049Vr.A06(C195049Vr.A0e, this.A0P.A02(this.A00));
            AnonymousClass9WT.A00();
            r3.A00(2);
            this.A0X.set(false);
            this.A0U.A00(new AnonymousClass96m(r7, this, r8), "take_photo", new C204479pQ(r8, this, r7, 0));
        } else {
            r7.A00(new AnonymousClass9KK("Cannot take a photo while recording video"));
        }
    }

    public int B5C() {
        return this.A00;
    }

    public boolean BIg() {
        return this.A0f;
    }
}
