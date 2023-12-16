package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.util.TypedValue;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.9ZS  reason: invalid class name */
public class AnonymousClass9ZS implements C203539nu {
    public static final Map A0t;
    public static volatile AnonymousClass9ZS A0u;
    public int A00;
    public int A01;
    public int A02;
    public Matrix A03;
    public Matrix A04;
    public Rect A05;
    public CaptureRequest.Builder A06;
    public AnonymousClass9SV A07;
    public AnonymousClass9S3 A08;
    public AnonymousClass9WO A09;
    public AnonymousClass96t A0A;
    public AnonymousClass96u A0B;
    public C203559nw A0C;
    public C203589nz A0D;
    public C194899Ux A0E;
    public AnonymousClass9T4 A0F;
    public AnonymousClass9T4 A0G;
    public UUID A0H;
    public FutureTask A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final Context A0N;
    public final CameraManager A0O;
    public final C192979Mm A0P = new C192979Mm(this);
    public final C192989Mn A0Q = new C192989Mn(this);
    public final C192999Mo A0R = new C192999Mo(this);
    public final C193009Mp A0S = new C193009Mp(this);
    public final C193019Mq A0T = new C193019Mq(this);
    public final C193029Mr A0U = new C193029Mr(this);
    public final AnonymousClass96o A0V = new AnonymousClass96o();
    public final C194609Ts A0W;
    public final C194549Tj A0X;
    public final C195079Vu A0Y;
    public final AnonymousClass9WQ A0Z;
    public final AnonymousClass9SA A0a;
    public final C194439Sw A0b = new C194439Sw();
    public final C194439Sw A0c = new C194439Sw();
    public final C194439Sw A0d = new C194439Sw();
    public final AnonymousClass9TX A0e;
    public final C194959Vh A0f;
    public final Object A0g = AnonymousClass002.A0D();
    public final Callable A0h = new C204469pP(this, 9);
    public volatile int A0i;
    public volatile CameraDevice A0j;
    public volatile C194559Tk A0k;
    public volatile AnonymousClass9ZW A0l;
    public volatile AnonymousClass9KV A0m;
    public volatile boolean A0n;
    public volatile boolean A0o;
    public volatile boolean A0p;
    public volatile boolean A0q;
    public volatile boolean A0r;
    public volatile boolean A0s;

    public boolean B1n(AnonymousClass9SG r6) {
        AnonymousClass9WT.A00();
        AnonymousClass9TX r1 = this.A0e;
        UUID uuid = r1.A03;
        AnonymousClass9WQ r4 = this.A0Z;
        r4.A0L.A00();
        r4.A0M.A00();
        AnonymousClass9S3 r0 = this.A08;
        this.A08 = null;
        if (r0 != null) {
            r0.A08.A00();
        }
        this.A0c.A00();
        this.A0d.A00();
        AnonymousClass9WO r02 = this.A09;
        if (r02 != null) {
            r02.A0F.A00();
        }
        this.A0o = false;
        if (this.A0K) {
            r1.A02(this.A0H);
            this.A0H = null;
        }
        C194959Vh r3 = this.A0f;
        r3.A00(r6, "disconnect", new C204489pR(uuid, 10, this));
        r3.A07("disconnect_guard", new C204499pS(1));
        return true;
    }

    public boolean BFC(int i) {
        try {
            return this.A0W.A03(i) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public void BG9(Matrix matrix, int i, int i2, int i3) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix.mapRect(rectF);
        Rect rect = this.A05;
        if (rect == null) {
            rect = (Rect) AnonymousClass9UR.A00(this.A0O, this.A0W.A03(i3)).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A032 = A03();
        if (A032 == 90 || A032 == 270) {
            rect.getClass();
            rectF2.set((float) rect.left, (float) rect.top, (float) rect.bottom, (float) rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f = 1.0f;
        if (this.A00 == 1) {
            f = -1.0f;
        }
        matrix2.postScale(f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A032 / 90);
        Matrix matrix3 = new Matrix();
        for (int i4 = 0; i4 < abs; i4++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A04 = matrix2;
    }

    public boolean BJ5() {
        int i;
        C193439Oq[] r0;
        try {
            C194609Ts r2 = this.A0W;
            if (r2.A06()) {
                i = C194609Ts.A06;
            } else {
                if (r2.A05 != null) {
                    r0 = r2.A05;
                } else {
                    r2.A04.A06("Number of cameras must be loaded on background thread.");
                    r2.A04();
                    r0 = r2.A05;
                    r0.getClass();
                }
                i = r0.length;
            }
            return i > 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void Bnv(AnonymousClass9SG r5, int i) {
        this.A0f.A00((AnonymousClass9SG) null, "set_zoom_level", new C204509pT(this, i, 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x012d, code lost:
        if (X.C1899593h.A1V(X.C203589nz.A0I, r4.A07) == false) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass9ZS r14) {
        /*
            X.9WO r6 = r14.A09
            if (r6 == 0) goto L_0x0092
            X.9Ux r4 = r14.A0E
            r4.getClass()
            X.96t r1 = r14.A0A
            X.96u r0 = r14.A0B
            android.graphics.Rect r2 = r14.A05
            r2.getClass()
            r6.A08 = r4
            r6.A06 = r1
            r6.A07 = r0
            r6.A05 = r2
            int r5 = r2.width()
            int r3 = r2.height()
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r1, r5, r3)
            r6.A04 = r0
            X.9Mw r0 = X.C194899Ux.A0I
            boolean r0 = X.C194899Ux.A04(r0, r4)
            r6.A0B = r0
            X.9Mw r0 = X.C194899Ux.A0c
            int r0 = X.C194899Ux.A01(r0, r4)
            r6.A03 = r0
            X.9Mw r0 = X.C194899Ux.A0z
            java.util.List r0 = X.C194899Ux.A03(r0, r4)
            r6.A09 = r0
            X.9Mw r0 = X.C194899Ux.A10
            java.util.List r0 = X.C194899Ux.A03(r0, r4)
            r6.A0A = r0
            X.9Mw r0 = X.C194899Ux.A0a
            int r0 = X.C194899Ux.A01(r0, r4)
            r6.A02 = r0
            int r1 = r2.width()
            int r0 = r2.height()
            int r0 = java.lang.Math.min(r1, r0)
            float r1 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r6.A00 = r0
            int r0 = r6.A03
            float r2 = (float) r0
            int r0 = r6.A02
            float r1 = (float) r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 0
            float r0 = X.AnonymousClass9WO.A00(r0, r2, r1, r4, r5)
            r6.A01 = r0
            X.96u r3 = r6.A07
            if (r3 == 0) goto L_0x0092
            int r0 = r6.A04()
            float r2 = (float) r0
            int r0 = r6.A03
            float r1 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r0 = X.AnonymousClass9WO.A00(r2, r1, r0, r4, r5)
            X.9Mx r1 = X.C195049Vr.A0q
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            X.AnonymousClass96u.A00(r3, r1, r0)
        L_0x0092:
            X.9Tj r13 = r14.A0X
            X.9Ml r7 = new X.9Ml
            r7.<init>(r14)
            android.hardware.camera2.CameraManager r6 = r14.A0O
            android.hardware.camera2.CameraDevice r5 = r14.A0j
            X.9Ux r4 = r14.A0E
            X.96t r3 = r14.A0A
            X.9WO r1 = r14.A09
            X.9WQ r12 = r14.A0Z
            X.9T1 r2 = r13.A0A
            java.lang.String r0 = "Can only prepare the FocusController on the Optic thread."
            r2.A01(r0)
            r13.A03 = r7
            r13.A01 = r6
            r13.A00 = r5
            r13.A07 = r4
            r13.A06 = r3
            r13.A05 = r1
            r13.A04 = r12
            r0 = 0
            r13.A0E = r0
            r1 = 1
            r13.A0D = r1
            java.lang.String r0 = "Failed to prepare FocusController."
            r2.A02(r1, r0)
            X.9SA r11 = r14.A0a
            android.hardware.camera2.CameraDevice r4 = r14.A0j
            X.9Ux r3 = r14.A0E
            X.96t r2 = r14.A0A
            X.9nz r0 = r14.A0D
            X.9T1 r1 = r11.A09
            java.lang.String r10 = "Can prepare only on the Optic thread"
            r1.A01(r10)
            r11.A0B = r4
            r11.A06 = r3
            r11.A04 = r2
            r11.A05 = r0
            r11.A03 = r12
            r11.A02 = r13
            r5 = 1
            java.lang.String r0 = "Failed to prepare VideoCaptureController."
            r1.A02(r5, r0)
            X.9Vu r4 = r14.A0Y
            android.hardware.camera2.CameraDevice r9 = r14.A0j
            X.9Ux r8 = r14.A0E
            X.96t r7 = r14.A0A
            int r3 = r14.A02
            X.9Tk r2 = r14.A0k
            X.9WO r0 = r14.A09
            X.9nz r1 = r14.A0D
            X.9T1 r6 = r4.A0B
            r6.A01(r10)
            r4.A00 = r9
            r4.A08 = r8
            r4.A06 = r7
            r4.A03 = r11
            r4.A05 = r0
            r4.A02 = r12
            r4.A01 = r13
            r4.A07 = r1
            if (r2 == 0) goto L_0x0114
            r0 = 0
            r4.A09 = r0
            r4.A04 = r0
        L_0x0114:
            r0 = 0
            r4.A0A = r0
            if (r1 == 0) goto L_0x016d
            r8.getClass()
            X.9Mw r0 = X.C194899Ux.A0U
            boolean r0 = X.C194899Ux.A04(r0, r8)
            if (r0 == 0) goto L_0x012f
            X.9nz r1 = r4.A07
            X.9Mv r0 = X.C203589nz.A0I
            boolean r0 = X.C1899593h.A1V(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0130
        L_0x012f:
            r2 = 0
        L_0x0130:
            r4.A0A = r2
            X.9nz r1 = r4.A07
            X.9Mv r0 = X.C203589nz.A04
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 != 0) goto L_0x013e
            if (r2 == 0) goto L_0x016d
        L_0x013e:
            r0 = 0
            r4.A09 = r0
        L_0x0141:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0167
            X.9Zf r0 = r4.A04
            if (r0 != 0) goto L_0x0150
            X.9Zf r0 = new X.9Zf
            r0.<init>()
            r4.A04 = r0
        L_0x0150:
            X.96t r1 = r4.A06
            if (r1 == 0) goto L_0x0167
            X.9Mx r0 = X.C195049Vr.A0w
            java.lang.Object r0 = r1.A08(r0)
            X.9T4 r0 = (X.AnonymousClass9T4) r0
            if (r0 == 0) goto L_0x0167
            X.9Zf r2 = r4.A04
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BFo(r1, r0, r3)
        L_0x0167:
            java.lang.String r0 = "Failed to prepare PhotoCaptureController."
            r6.A02(r5, r0)
            return
        L_0x016d:
            X.9nh r1 = r4.A09
            if (r1 != 0) goto L_0x018e
            X.96t r0 = r4.A06
            if (r0 == 0) goto L_0x01ec
            X.9Mx r1 = X.C195049Vr.A0f
            java.lang.Object r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x01ec
            X.96t r0 = r4.A06
            java.lang.Object r0 = r0.A08(r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x0187:
            X.9Zg r1 = new X.9Zg
            r1.<init>(r0)
            r4.A09 = r1
        L_0x018e:
            int r1 = r1.B8F()
            r0 = 32
            if (r1 == r0) goto L_0x01bc
            r0 = 35
            if (r1 == r0) goto L_0x01d3
            r0 = 37
            if (r1 == r0) goto L_0x01b5
            r0 = 256(0x100, float:3.59E-43)
            if (r1 == r0) goto L_0x01ae
            r0 = 4101(0x1005, float:5.747E-42)
            if (r1 == r0) goto L_0x01ae
        L_0x01a6:
            java.lang.String r1 = "Invalid picture size"
            X.9ka r0 = new X.9ka
            r0.<init>(r1)
            throw r0
        L_0x01ae:
            X.96t r1 = r4.A06
            if (r1 == 0) goto L_0x01a6
            X.9Mx r0 = X.C195049Vr.A0h
            goto L_0x01d9
        L_0x01b5:
            X.9Ux r1 = r4.A08
            if (r1 == 0) goto L_0x01a6
            X.9Mw r0 = X.C194899Ux.A0s
            goto L_0x01c2
        L_0x01bc:
            X.9Ux r1 = r4.A08
            if (r1 == 0) goto L_0x01a6
            X.9Mw r0 = X.C194899Ux.A0t
        L_0x01c2:
            java.util.List r1 = X.C194899Ux.A03(r0, r1)
            if (r1 == 0) goto L_0x01a6
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a6
            java.lang.Object r0 = X.C18290x4.A0k(r1)
            goto L_0x01dd
        L_0x01d3:
            X.96t r1 = r4.A06
            if (r1 == 0) goto L_0x01a6
            X.9Mx r0 = X.C195049Vr.A0w
        L_0x01d9:
            java.lang.Object r0 = r1.A08(r0)
        L_0x01dd:
            X.9T4 r0 = (X.AnonymousClass9T4) r0
            if (r0 == 0) goto L_0x01a6
            X.9nh r2 = r4.A09
            int r1 = r0.A02
            int r0 = r0.A01
            r2.BFo(r1, r0, r3)
            goto L_0x0141
        L_0x01ec:
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0187
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.A00(X.9ZS):void");
    }

    public static /* synthetic */ void A01(AnonymousClass9ZS r9, String str) {
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        C203589nz r1;
        C194959Vh r8 = r9.A0f;
        r8.A06("Method openCamera() must run on the Optic Background Thread.");
        Context context = r9.A0N;
        if (AnonymousClass9UU.A00(context)) {
            if (r9.A0j != null) {
                if (!r9.A0j.getId().equals(str)) {
                    r9.A04();
                } else {
                    return;
                }
            }
            r9.A0Z.A0O.clear();
            CameraManager cameraManager = r9.A0O;
            CameraCharacteristics A002 = AnonymousClass9UR.A00(cameraManager, str);
            C203589nz r12 = r9.A0D;
            if (r12 == null || !C1899593h.A1V(C203589nz.A0K, r12)) {
                cameraExtensionCharacteristics = null;
            } else {
                cameraExtensionCharacteristics = AnonymousClass9US.A00(cameraManager, str);
            }
            C1900693s r2 = new C1900693s(r9.A0P, r9.A0Q);
            C201489kD r6 = new C201489kD(r9, r2, str);
            synchronized (r8) {
                UUID uuid = r8.A01;
                uuid.getClass();
                r8.A02.post(new C201799kk(r8, "open_camera_on_camera_handler_thread", uuid, r6));
            }
            int A012 = r9.A0W.A01(str);
            r9.A00 = A012;
            AnonymousClass96r r13 = new AnonymousClass96r(context, A002, cameraExtensionCharacteristics, A012);
            r9.A0E = r13;
            if (C194899Ux.A04(C194899Ux.A05, r13) && cameraExtensionCharacteristics != null && (r1 = r9.A0D) != null && C1899593h.A1V(C203589nz.A0K, r1)) {
                r9.A0E = new AnonymousClass96q(cameraExtensionCharacteristics, r9.A0E);
            }
            AnonymousClass96t r14 = new AnonymousClass96t(r9.A0E);
            r9.A0A = r14;
            r9.A0B = new AnonymousClass96u(r14);
            Number number = (Number) A002.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Objects.requireNonNull(number);
            r9.A02 = number.intValue();
            r9.A05 = (Rect) A002.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            r2.Ay4();
            Boolean bool = r2.A02;
            if (bool == null) {
                throw AnonymousClass001.A0e("Open Camera operation hasn't completed yet.");
            } else if (bool.booleanValue()) {
                CameraDevice cameraDevice = r2.A00;
                cameraDevice.getClass();
                r9.A0j = cameraDevice;
            } else {
                throw r2.A01;
            }
        } else {
            throw new SecurityException("Open Camera 2 failed: No camera permissions!");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (X.C1899593h.A1V(X.C203589nz.A0D, r13.A0D) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A02(X.AnonymousClass9ZS r13, java.lang.String r14) {
        /*
            if (r14 == 0) goto L_0x013d
            X.9SV r0 = r13.A07
            if (r0 == 0) goto L_0x0136
            X.9nz r1 = r13.A0D
            if (r1 == 0) goto L_0x012f
            X.9Ux r2 = r13.A0E
            if (r2 == 0) goto L_0x0128
            X.96t r0 = r13.A0A
            if (r0 == 0) goto L_0x0121
            X.96u r0 = r13.A0B
            if (r0 == 0) goto L_0x0121
            X.9nw r0 = r13.A0C
            if (r0 == 0) goto L_0x011a
            X.9Mv r0 = X.C203589nz.A0R
            java.lang.Object r7 = r1.B3x(r0)
            X.9Wa r7 = (X.C195119Wa) r7
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L_0x003b
            X.9Mw r0 = X.C194899Ux.A0Q
            boolean r0 = X.C194899Ux.A04(r0, r2)
            if (r0 == 0) goto L_0x003b
            X.9nz r1 = r13.A0D
            X.9Mv r0 = X.C203589nz.A0D
            boolean r0 = X.C1899593h.A1V(r0, r1)
            r6 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            X.9nz r1 = r13.A0D
            X.9Mv r0 = X.C203589nz.A0P
            r1.B3x(r0)
            X.9Mv r0 = X.C203589nz.A0T
            r1.B3x(r0)
            X.9Ux r1 = r13.A0E
            X.9Mw r0 = X.C194899Ux.A0r
            java.util.List r10 = X.C194899Ux.A03(r0, r1)
            X.9Ux r1 = r13.A0E
            if (r6 == 0) goto L_0x010f
            X.9Mw r0 = X.C194899Ux.A0w
        L_0x0056:
            java.util.List r8 = X.C194899Ux.A03(r0, r1)
            X.9Ux r1 = r13.A0E
            X.9Mw r0 = X.C194899Ux.A0h
            r1.A05(r0)
            X.9Ux r1 = r13.A0E
            X.9Mw r0 = X.C194899Ux.A0x
            java.util.List r9 = X.C194899Ux.A03(r0, r1)
            X.9SV r0 = r13.A07
            int r11 = r0.A01
            int r12 = r0.A00
            r13.A03()
            X.9Os r5 = r7.A04(r8, r9, r10, r11, r12)
            X.9T4 r4 = r5.A01
            X.9T4 r2 = r5.A00
            if (r2 == 0) goto L_0x0113
            r13.A0F = r4
            X.96u r3 = r13.A0B
            X.9Mx r0 = X.C195049Vr.A0n
            X.AnonymousClass9My.A02(r0, r3, r4)
            X.9Mx r1 = X.C195049Vr.A0f
            r0 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x008d
            r0 = 4101(0x1005, float:5.747E-42)
        L_0x008d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass9My.A02(r1, r3, r0)
            X.9Mx r0 = X.C195049Vr.A0h
            X.AnonymousClass9My.A02(r0, r3, r2)
            X.9Mx r1 = X.C195049Vr.A0u
            X.9T4 r0 = r5.A02
            if (r0 != 0) goto L_0x00a0
            r0 = r4
        L_0x00a0:
            X.AnonymousClass9My.A02(r1, r3, r0)
            X.9Mx r1 = X.C195049Vr.A0R
            boolean r0 = r13.A0o
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass9My.A02(r1, r3, r0)
            X.9Mx r2 = X.C195049Vr.A0O
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass9My.A02(r2, r3, r1)
            X.9Mx r0 = X.C195049Vr.A0K
            X.AnonymousClass9My.A02(r0, r3, r1)
            X.9Mx r1 = X.C195049Vr.A02
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            X.AnonymousClass96u.A00(r3, r1, r0)
            X.9Ux r1 = r13.A0E
            X.9Mw r0 = X.C194899Ux.A0v
            java.util.List r3 = X.C194899Ux.A03(r0, r1)
            r0 = 5
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x00ed
            X.9nz r1 = r13.A0D
            if (r1 == 0) goto L_0x00ed
            X.9Mv r0 = X.C203589nz.A0S
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x00ed
            X.96u r1 = r13.A0B
            X.9Mx r0 = X.C195049Vr.A0r
            X.AnonymousClass9My.A02(r0, r1, r2)
        L_0x00ed:
            X.96u r2 = r13.A0B
            X.9Mx r1 = X.C195049Vr.A0I
            boolean r0 = r13.A0p
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AnonymousClass9My.A02(r1, r2, r0)
            X.96u r2 = r13.A0B
            X.9Sv r0 = r2.A00
            X.9SE r1 = r0.A00()
            X.9Sv r0 = new X.9Sv
            r0.<init>()
            r2.A00 = r0
            X.96t r0 = r2.A00
            r0.A0A(r1)
            return
        L_0x010f:
            X.9Mw r0 = X.C194899Ux.A0n
            goto L_0x0056
        L_0x0113:
            java.lang.String r0 = "Invalid picture size: 'null'"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x011a:
            java.lang.String r0 = "Trying to setup camera params without instantiating PreviewSetupDelegate."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0121:
            java.lang.String r0 = "Trying to setup camera params without instantiating CameraSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0128:
            java.lang.String r0 = "Trying to setup camera params without a Capabilities."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x012f:
            java.lang.String r0 = "Trying to setup camera params without a StartupSettings."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0136:
            java.lang.String r0 = "Trying to setup camera params without a CameraDeviceConfig."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x013d:
            java.lang.String r1 = "Camera ID must be provided to setup camera params."
            X.9ka r0 = new X.9ka
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.A02(X.9ZS, java.lang.String):void");
    }

    public int A03() {
        Number number = (Number) AnonymousClass001.A0i(A0t, this.A01);
        if (number != null) {
            return ((this.A02 - number.intValue()) + 360) % 360;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Invalid display rotation value: ");
        throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o2, this.A01));
    }

    public final void A04() {
        this.A0f.A06("Method closeCamera() must run on the Optic Background Thread.");
        AnonymousClass9SA r4 = this.A0a;
        if (r4.A0D && !this.A0s) {
            r4.A00();
        }
        A07(false);
        C194549Tj r2 = this.A0X;
        r2.A0A.A02(false, "Failed to release PreviewController.");
        r2.A03 = null;
        r2.A01 = null;
        r2.A00 = null;
        r2.A07 = null;
        r2.A06 = null;
        r2.A05 = null;
        r2.A04 = null;
        r2.A02 = null;
        C195079Vu r22 = this.A0Y;
        r22.A0B.A02(false, "Failed to release PhotoCaptureController.");
        r22.A00 = null;
        r22.A08 = null;
        r22.A06 = null;
        r22.A03 = null;
        r22.A05 = null;
        r22.A02 = null;
        r22.A01 = null;
        r22.A07 = null;
        C203439nh r0 = r22.A09;
        if (r0 != null) {
            r0.release();
            r22.A09 = null;
        }
        C195709Zf r02 = r22.A04;
        if (r02 != null) {
            r02.release();
            r22.A04 = null;
        }
        r4.A09.A02(false, "Failed to release VideoCaptureController.");
        r4.A0B = null;
        r4.A06 = null;
        r4.A04 = null;
        r4.A05 = null;
        r4.A03 = null;
        r4.A02 = null;
        if (this.A0j != null) {
            AnonymousClass96o r23 = this.A0V;
            r23.A00 = this.A0j.getId();
            r23.A02(0);
            this.A0j.close();
            r23.A00();
        }
        this.A0Z.A0O.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r6 == 180) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r6 == 180) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r1 = r1 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r6 == 90) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a9, code lost:
        r2 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r2 = (float) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r6 == 270) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r2 = r2 - r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r13 = this;
            X.9T4 r1 = r13.A0F
            if (r1 == 0) goto L_0x00c6
            X.9T4 r0 = r13.A0G
            if (r0 == 0) goto L_0x00c6
            android.graphics.Rect r0 = r13.A05
            if (r0 == 0) goto L_0x00c6
            int r2 = r1.A02
            int r1 = r1.A01
            int r10 = r0.width()
            android.graphics.Rect r0 = r13.A05
            int r3 = r0.height()
            int r6 = r13.A03()
            X.9T4 r0 = r13.A0F
            X.9T4 r11 = r13.A0G
            int r9 = r0.A02
            int r7 = r0.A01
            int r8 = r9 - r7
            int r5 = r11.A02
            int r4 = r11.A01
            int r0 = r5 - r4
            int r8 = r8 * r0
            if (r8 >= 0) goto L_0x0036
            X.9T4 r11 = new X.9T4
            r11.<init>(r4, r5)
        L_0x0036:
            float r8 = (float) r9
            int r0 = r11.A01
            float r5 = (float) r0
            int r0 = r11.A02
            float r4 = (float) r0
            float r0 = r5 / r4
            float r8 = r8 * r0
            int r0 = (int) r8
            if (r0 > r7) goto L_0x00bc
            X.9T4 r4 = new X.9T4
            r4.<init>(r9, r0)
        L_0x0048:
            int r0 = r4.A02
            int r0 = r2 - r0
            int r8 = r0 / 2
            int r0 = r4.A01
            int r0 = r1 - r0
            int r7 = r0 / 2
            int r4 = r13.A00
            r0 = 1
            r9 = 180(0xb4, float:2.52E-43)
            r11 = 270(0x10e, float:3.78E-43)
            r12 = 90
            if (r4 != r0) goto L_0x0089
            if (r6 == r12) goto L_0x00ac
            if (r6 == r11) goto L_0x00ac
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            int r0 = -r1
            float r4 = (float) r0
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x006e
            int r2 = -r8
        L_0x006e:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x009a
        L_0x0071:
            int r1 = -r7
        L_0x0072:
            float r2 = (float) r1
        L_0x0073:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r13.A03 = r1
            float r0 = (float) r6
            r1.postRotate(r0)
            android.graphics.Matrix r0 = r13.A03
            r0.postScale(r5, r4)
            android.graphics.Matrix r0 = r13.A03
            r0.postTranslate(r3, r2)
            return
        L_0x0089:
            if (r6 == r12) goto L_0x009c
            if (r6 == r11) goto L_0x009c
            float r5 = (float) r2
            float r0 = (float) r10
            float r5 = r5 / r0
            float r4 = (float) r1
            float r0 = (float) r3
            float r4 = r4 / r0
            int r2 = r2 - r8
            if (r6 == r9) goto L_0x0097
            int r2 = -r8
        L_0x0097:
            float r3 = (float) r2
            if (r6 != r9) goto L_0x0071
        L_0x009a:
            int r1 = r1 - r7
            goto L_0x0072
        L_0x009c:
            float r5 = (float) r1
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r12) goto L_0x00a6
            int r1 = -r7
        L_0x00a6:
            float r3 = (float) r1
            if (r6 != r12) goto L_0x00ba
        L_0x00a9:
            int r2 = -r8
        L_0x00aa:
            float r2 = (float) r2
            goto L_0x0073
        L_0x00ac:
            int r0 = -r1
            float r5 = (float) r0
            float r0 = (float) r3
            float r5 = r5 / r0
            float r4 = (float) r2
            float r0 = (float) r10
            float r4 = r4 / r0
            int r1 = r1 - r7
            if (r6 == r11) goto L_0x00b7
            int r1 = -r7
        L_0x00b7:
            float r3 = (float) r1
            if (r6 != r11) goto L_0x00a9
        L_0x00ba:
            int r2 = r2 - r8
            goto L_0x00aa
        L_0x00bc:
            float r0 = (float) r7
            float r4 = r4 / r5
            float r0 = r0 * r4
            int r0 = (int) r0
            X.9T4 r4 = new X.9T4
            r4.<init>(r0, r7)
            goto L_0x0048
        L_0x00c6:
            java.lang.String r0 = "Method updateDriverToPreviewMatrix() invoked without proper initialisation."
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.A05():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x038f, code lost:
        if (r14 >= r4) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a8, code lost:
        if (A08() != false) goto L_0x01aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r22, java.lang.Float r23) {
        /*
            r21 = this;
            r9 = r21
            X.9Vh r12 = r9.A0f
            java.lang.String r0 = "Method configureAndStartCameraPreview() must run on the Optic Background Thread."
            r12.A06(r0)
            android.hardware.camera2.CameraDevice r0 = r9.A0j
            if (r0 == 0) goto L_0x0403
            X.9Ux r0 = r9.A0E
            if (r0 == 0) goto L_0x0403
            X.9SV r0 = r9.A07
            if (r0 == 0) goto L_0x0403
            X.9Tk r0 = r9.A0k
            if (r0 == 0) goto L_0x03fb
            X.9nw r0 = r9.A0C
            if (r0 == 0) goto L_0x03f3
            X.9nz r0 = r9.A0D
            if (r0 == 0) goto L_0x03ec
            X.96t r0 = r9.A0A
            java.lang.String r20 = "Camera params need to be configured before invoking configureAndStartCameraPreview()"
            if (r0 == 0) goto L_0x03e7
            X.96u r0 = r9.A0B
            if (r0 == 0) goto L_0x03e7
            X.9WQ r8 = r9.A0Z
            boolean r0 = r8.A0Q
            r7 = 0
            if (r0 == 0) goto L_0x0035
            r9.A07(r7)
        L_0x0035:
            X.9Tk r1 = r9.A0k
            java.util.List r4 = java.util.Collections.emptyList()
            X.9S3 r14 = r9.A08
            if (r14 == 0) goto L_0x0048
            X.9Sw r0 = r14.A08
            java.util.List r4 = r0.A00
            X.9Sw r0 = r14.A08
            r0.A00()
        L_0x0048:
            if (r1 != 0) goto L_0x004c
            if (r14 != 0) goto L_0x0051
        L_0x004c:
            X.9S3 r14 = new X.9S3
            r14.<init>()
        L_0x0051:
            X.9Sw r3 = r14.A08
            r3.A00()
            int r2 = r4.size()
            r1 = 0
        L_0x005b:
            if (r1 >= r2) goto L_0x0067
            java.lang.Object r0 = r4.get(r1)
            r3.A01(r0)
            int r1 = r1 + 1
            goto L_0x005b
        L_0x0067:
            r9.A08 = r14
            android.hardware.camera2.CameraDevice r15 = r9.A0j
            X.96t r13 = r9.A0A
            X.96u r11 = r9.A0B
            X.9nz r10 = r9.A0D
            X.9Ux r5 = r9.A0E
            android.hardware.camera2.CameraManager r1 = r9.A0O
            r16 = r22
            r0 = r16
            android.hardware.camera2.CameraCharacteristics r4 = X.AnonymousClass9UR.A00(r1, r0)
            X.9nw r3 = r9.A0C
            X.9Vu r6 = r9.A0Y
            X.9T1 r1 = r6.A0B
            java.lang.String r0 = "Cannot get picture ImageReader, not prepared"
            r1.A00(r0)
            X.9nh r0 = r6.A09
            if (r0 == 0) goto L_0x015e
            android.view.Surface r2 = r0.BDP()
        L_0x0090:
            java.lang.String r0 = "Cannot get raw picture ImageReader, not prepared"
            r1.A00(r0)
            r19 = 0
            java.lang.String r0 = "Cannot get YUV picture ImageReader, not prepared"
            r1.A00(r0)
            X.9Zf r0 = r6.A04
            if (r0 == 0) goto L_0x015b
            android.view.Surface r1 = r0.BDP()
        L_0x00a4:
            X.9T1 r6 = r8.A0H
            java.lang.String r0 = "Can only prepare on the Optic thread"
            r6.A01(r0)
            r8.A01 = r15
            r8.A09 = r13
            r8.A0A = r11
            r8.A0C = r10
            r8.A0D = r5
            r8.A00 = r4
            r8.A0B = r3
            r8.A06 = r14
            r8.A03 = r2
            r8.A05 = r1
            X.9ZW r0 = new X.9ZW
            r0.<init>()
            r8.A07 = r0
            r1 = 1
            java.lang.String r0 = "Failed to prepare PreviewController."
            r6.A02(r1, r0)
            X.9Ts r1 = r9.A0W
            r0 = r16
            r1.A01(r0)
            X.9SV r0 = r9.A07
            int r2 = r0.A01
            int r1 = r0.A00
            X.9T4 r0 = new X.9T4
            r0.<init>(r2, r1)
            r9.A0G = r0
            X.9T4 r13 = r9.A0F
            if (r13 != 0) goto L_0x00e9
            X.9T4 r13 = new X.9T4
            r13.<init>(r7, r7)
        L_0x00e9:
            X.96t r3 = r9.A0A
            X.9nz r2 = r9.A0D
            X.9Ux r1 = r9.A0E
            r14.A04 = r12
            X.9Mw r0 = X.C194899Ux.A0N
            boolean r0 = X.C194899Ux.A04(r0, r1)
            r14.A05 = r0
            r14.A03 = r3
            X.9Mx r11 = X.C195049Vr.A0j
            int r18 = X.C195049Vr.A02(r11, r3)
            X.9Mv r0 = X.C203589nz.A0G
            boolean r0 = X.C1899593h.A1V(r0, r2)
            if (r0 == 0) goto L_0x0161
            X.9Mw r0 = X.C194899Ux.A0h
            java.util.List r17 = X.C194899Ux.A03(r0, r1)
            int r12 = r13.A02
            int r10 = r13.A01
            int r15 = r12 * r10
            int r5 = r17.size()
            r4 = 0
        L_0x011a:
            if (r4 >= r5) goto L_0x0161
            r0 = r17
            java.lang.Object r3 = r0.get(r4)
            X.9T4 r3 = (X.AnonymousClass9T4) r3
            r16 = 953267991(0x38d1b717, float:1.0E-4)
            int r1 = r3.A02
            int r0 = r3.A01
            int r2 = java.lang.Math.max(r1, r0)
            float r2 = (float) r2
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.max(r12, r10)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r12, r10)
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 - r1
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0158
            int r1 = r3.A02
            int r0 = r3.A01
            int r1 = r1 * r0
            if (r1 >= r15) goto L_0x0158
            r0 = 180000(0x2bf20, float:2.52234E-40)
            if (r1 < r0) goto L_0x0158
            r13 = r3
            r15 = r1
        L_0x0158:
            int r4 = r4 + 1
            goto L_0x011a
        L_0x015b:
            r1 = 0
            goto L_0x00a4
        L_0x015e:
            r2 = 0
            goto L_0x0090
        L_0x0161:
            int r3 = r13.A02
            int r2 = r13.A01
            r1 = 1
            r0 = r18
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r3, r2, r0, r1)
            r14.A01 = r2
            android.media.ImageReader$OnImageAvailableListener r1 = r14.A06
            r0 = r19
            r2.setOnImageAvailableListener(r1, r0)
            r9.A05()
            X.9T4 r2 = r9.A0F
            if (r2 == 0) goto L_0x03e2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "startCameraPreview "
            r1.append(r0)
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            int r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            android.os.Trace.beginSection(r0)
            X.9nz r1 = r9.A0D
            X.9Mv r0 = X.C203589nz.A0B
            boolean r0 = X.C1899593h.A1V(r0, r1)
            r3 = 1
            if (r0 != 0) goto L_0x01aa
            boolean r0 = r9.A08()
            r2 = 0
            if (r0 == 0) goto L_0x01ab
        L_0x01aa:
            r2 = 1
        L_0x01ab:
            X.96t r1 = r9.A0A
            X.9Mx r0 = X.C195049Vr.A0I
            java.lang.Object r0 = r1.A08(r0)
            r0.getClass()
            X.9Tk r12 = r9.A0k
            X.9T4 r0 = r9.A0F
            int r13 = r0.A02
            int r14 = r0.A01
            X.96t r0 = r9.A0A
            X.C195049Vr.A06(r11, r0)
            int r15 = r9.A02
            int r4 = r9.A0i
            int r1 = r9.A01
            if (r1 == r3) goto L_0x03cf
            r0 = 2
            if (r1 == r0) goto L_0x03cb
            r0 = 3
            r17 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x01d5
            r17 = 0
        L_0x01d5:
            r16 = r4
            android.graphics.SurfaceTexture r4 = r12.A00(r13, r14, r15, r16, r17)
            r9.A0q = r3
            X.9Tj r5 = r9.A0X
            r5.A0C = r7
            if (r4 == 0) goto L_0x03da
            X.9T4 r0 = r9.A0F
            int r1 = r0.A02
            int r0 = r0.A01
            r4.setDefaultBufferSize(r1, r0)
            X.9Mo r0 = r9.A0R
            r8.A06(r4, r0)
            X.9WO r4 = r9.A09
            if (r4 == 0) goto L_0x0288
            java.lang.String r0 = "Cannot get default AF regions."
            r6.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r1 = r8.A0G
            java.lang.String r0 = "Cannot get default AE regions."
            r6.A00(r0)
            android.hardware.camera2.params.MeteringRectangle[] r0 = r8.A0F
            r4.A0D = r1
            r4.A0C = r0
            if (r23 == 0) goto L_0x0288
            X.9WO r7 = r9.A09
            float r10 = r23.floatValue()
            r14 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 / r14
            java.util.List r12 = r7.A0A
            if (r12 == 0) goto L_0x03c8
            java.util.List r0 = r7.A09
            if (r0 == 0) goto L_0x03c8
            int r0 = r12.size()
            int r11 = r0 + -1
            r1 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            float r0 = X.C1899593h.A01(r12, r1)
            float r0 = r0 / r14
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0393
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r13, r13)
        L_0x0233:
            int r1 = X.C18280x3.A03(r4)
            java.lang.Object r0 = r4.second
            int r12 = X.AnonymousClass001.A0K(r0)
            java.util.List r0 = r7.A0A
            float r11 = X.C1899593h.A01(r0, r12)
            float r11 = r11 / r14
            java.util.List r0 = r7.A0A
            float r4 = X.C1899593h.A01(r0, r1)
            float r4 = r4 / r14
            float r1 = (float) r1
            float r0 = (float) r12
            float r11 = X.AnonymousClass9WO.A00(r10, r4, r11, r1, r0)
            java.util.List r0 = r7.A09
            int r0 = r0.size()
            int r0 = r0 + -1
            int r0 = -r0
            float r10 = (float) r0
            java.util.List r0 = r7.A0A
            int r0 = r0.size()
            int r0 = r0 + -1
            float r4 = (float) r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = X.AnonymousClass9WO.A00(r11, r10, r4, r1, r0)
        L_0x026c:
            X.9Ux r4 = r7.A08
            X.96t r0 = r7.A06
            X.96u r13 = r7.A07
            android.graphics.Rect r11 = r7.A05
            android.graphics.Rect r10 = r7.A04
            java.util.List r1 = r7.A0A
            if (r0 == 0) goto L_0x0288
            if (r13 == 0) goto L_0x0288
            if (r4 == 0) goto L_0x0288
            if (r1 == 0) goto L_0x0288
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0306
            java.util.List r0 = r7.A09
            if (r0 != 0) goto L_0x0306
        L_0x0288:
            java.lang.String r0 = "Cannot get preview request builder."
            r6.A00(r0)
            android.hardware.camera2.CaptureRequest$Builder r0 = r8.A02
            if (r0 == 0) goto L_0x03d3
            r9.A06 = r0
            java.lang.String r0 = "Cannot get camera operations callback."
            r6.A00(r0)
            X.9ZW r0 = r8.A07
            r9.A0l = r0
            X.9lt r0 = r8.A0J
            r8.A02(r0, r2, r3)
            X.96t r1 = r9.A0A
            X.9Mx r0 = X.C195049Vr.A0O
            boolean r0 = X.C195049Vr.A07(r0, r1)
            if (r0 == 0) goto L_0x02b3
            X.9ZW r0 = r9.A0l
            r0.getClass()
            r5.A04(r0)
        L_0x02b3:
            X.9Ux r1 = r9.A0E
            X.9Mw r0 = X.C194899Ux.A05
            boolean r0 = X.C194899Ux.A04(r0, r1)
            if (r0 == 0) goto L_0x02ff
            X.9nz r1 = r9.A0D
            X.9Mv r0 = X.C203589nz.A0K
            boolean r0 = X.C1899593h.A1V(r0, r1)
            if (r0 == 0) goto L_0x02ff
            X.9ZW r0 = r9.A0l
            r0.getClass()
            X.9nz r4 = r9.A0D
            X.9Mv r0 = X.C203589nz.A0M
            java.lang.Object r0 = r4.B3x(r0)
            long r2 = X.C18310x6.A0B(r0)
            X.9Mv r0 = X.C203589nz.A0N
            java.lang.Object r0 = r4.B3x(r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            X.9Mv r0 = X.C203589nz.A0L
            java.lang.Object r0 = r4.B3x(r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            X.AnonymousClass9ZW.A0L = r2
            X.AnonymousClass9ZW.A0K = r1
            X.AnonymousClass9ZW.A0J = r0
            X.9ZW r1 = r9.A0l
            r1.getClass()
            X.9Mq r0 = r9.A0T
        L_0x02f9:
            r1.A02 = r0
            android.os.Trace.endSection()
            return
        L_0x02ff:
            X.9ZW r1 = r9.A0l
            r1.getClass()
            r0 = 0
            goto L_0x02f9
        L_0x0306:
            if (r10 == 0) goto L_0x0288
            if (r11 == 0) goto L_0x0288
            float r0 = r7.A02()
            float r0 = r12 - r0
            float r4 = java.lang.Math.abs(r0)
            float r0 = r7.A00
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0288
            float r14 = r7.A02()
            float r4 = r7.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0388
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0388
            r15 = 1
        L_0x0329:
            int r0 = r1.size()
            int r0 = r0 - r3
            float r14 = (float) r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            float r0 = X.AnonymousClass9WO.A00(r12, r4, r1, r0, r14)
            int r4 = (int) r0
            X.9Mx r1 = X.C195049Vr.A0x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.AnonymousClass96u.A00(r13, r1, r0)
            X.9Mx r1 = X.C195049Vr.A0q
            java.lang.Float r0 = java.lang.Float.valueOf(r12)
            X.AnonymousClass96u.A00(r13, r1, r0)
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0380
            android.os.Handler r1 = r7.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            android.os.Message r0 = r1.obtainMessage(r3, r4, r3, r0)
            r1.sendMessage(r0)
        L_0x035c:
            X.9WO r1 = r9.A09
            float r0 = r1.A02()
            float r10 = r1.A03(r0)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r0
            X.9WO r1 = r9.A09
            android.graphics.Rect r7 = r1.A04
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0D
            android.hardware.camera2.params.MeteringRectangle[] r4 = r1.A05(r0)
            X.9WO r1 = r9.A09
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A0C
            android.hardware.camera2.params.MeteringRectangle[] r0 = r1.A05(r0)
            r8.A05(r7, r4, r0, r10)
            goto L_0x0288
        L_0x0380:
            float r0 = r7.A03(r12)
            X.AnonymousClass9WO.A01(r11, r10, r0)
            goto L_0x035c
        L_0x0388:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0391
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            r15 = 2
            if (r0 < 0) goto L_0x0329
        L_0x0391:
            r15 = 0
            goto L_0x0329
        L_0x0393:
            float r0 = X.C1899593h.A01(r12, r11)
            float r0 = r0 / r14
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03a7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r0, r0)
            goto L_0x0233
        L_0x03a7:
            r4 = 0
        L_0x03a8:
            if (r4 >= r11) goto L_0x03b6
            float r0 = X.C1899593h.A01(r12, r4)
            float r0 = r0 / r14
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03b6
            int r4 = r4 + 1
            goto L_0x03a8
        L_0x03b6:
            if (r4 <= 0) goto L_0x03ba
            int r1 = r4 + -1
        L_0x03ba:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r4 = X.AnonymousClass0x9.A0C(r1, r0)
            goto L_0x0233
        L_0x03c8:
            r12 = 0
            goto L_0x026c
        L_0x03cb:
            r17 = 180(0xb4, float:2.52E-43)
            goto L_0x01d5
        L_0x03cf:
            r17 = 90
            goto L_0x01d5
        L_0x03d3:
            java.lang.String r0 = "Trying to get mPreviewRequestBuilder before configuring preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x03da:
            java.lang.String r0 = "SurfacePipeCoordinator unable to provide surface texture and surface holder."
            X.9ka r1 = new X.9ka
            r1.<init>(r0)
            throw r1
        L_0x03e2:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r20)
            throw r1
        L_0x03e7:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r20)
            throw r1
        L_0x03ec:
            java.lang.String r0 = "StartupSettings must be provided to configure preview."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x03f3:
            java.lang.String r0 = "PreviewSetupDelegate must be provided to configure preview."
            X.9ka r1 = new X.9ka
            r1.<init>(r0)
            throw r1
        L_0x03fb:
            java.lang.String r0 = "SurfacePipeCoordinator must be provided to configure preview."
            X.9ka r1 = new X.9ka
            r1.<init>(r0)
            throw r1
        L_0x0403:
            java.lang.String r0 = "Camera must be opened to configure preview."
            X.9ka r1 = new X.9ka
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.A06(java.lang.String, java.lang.Float):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    public final void A07(boolean r9) {
        /*
            r8 = this;
            X.9Vh r5 = r8.A0f
            java.lang.String r0 = "Method stopCameraPreview() must run on the Optic Background Thread."
            r5.A06(r0)
            java.lang.Object r7 = X.AnonymousClass9WQ.A0S
            monitor-enter(r7)
            X.9WQ r2 = r8.A0Z     // Catch:{ all -> 0x00e6 }
            X.9T1 r6 = r2.A0H     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "Failed to release PreviewController."
            r3 = 0
            r6.A02(r3, r0)     // Catch:{ all -> 0x00e6 }
            r2.A0Q = r3     // Catch:{ all -> 0x00e6 }
            X.9S3 r1 = r2.A06     // Catch:{ all -> 0x00e6 }
            r4 = 0
            if (r1 == 0) goto L_0x003a
            android.media.ImageReader r0 = r1.A01     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0029
            r0.setOnImageAvailableListener(r4, r4)     // Catch:{ all -> 0x00e6 }
            android.media.ImageReader r0 = r1.A01     // Catch:{ all -> 0x00e6 }
            r0.close()     // Catch:{ all -> 0x00e6 }
            r1.A01 = r4     // Catch:{ all -> 0x00e6 }
        L_0x0029:
            android.media.Image r0 = r1.A00     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ all -> 0x00e6 }
            r1.A00 = r4     // Catch:{ all -> 0x00e6 }
        L_0x0032:
            r1.A04 = r4     // Catch:{ all -> 0x00e6 }
            r1.A03 = r4     // Catch:{ all -> 0x00e6 }
            r1.A02 = r4     // Catch:{ all -> 0x00e6 }
            r2.A06 = r4     // Catch:{ all -> 0x00e6 }
        L_0x003a:
            X.9ZW r0 = r2.A07     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0042
            r0.A0H = r3     // Catch:{ all -> 0x00e6 }
            r2.A07 = r4     // Catch:{ all -> 0x00e6 }
        L_0x0042:
            if (r9 == 0) goto L_0x0089
            java.lang.String r0 = "Method closeCameraSession must be called on Optic Thread."
            r6.A01(r0)     // Catch:{ Exception -> 0x0089 }
            X.9ng r0 = r2.A08     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.BHY()     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x006e
        L_0x0053:
            X.9Zi r1 = r2.A0K     // Catch:{ Exception -> 0x0089 }
            r0 = 2
            r1.A03 = r0     // Catch:{ Exception -> 0x0089 }
            X.9T9 r3 = r1.A02     // Catch:{ Exception -> 0x0089 }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x0089 }
            X.9Vh r3 = r2.A0N     // Catch:{ Exception -> 0x0089 }
            r0 = 15
            X.9pP r1 = new X.9pP     // Catch:{ Exception -> 0x0089 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = "camera_session_close_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0089
        L_0x006e:
            X.9Zi r1 = r2.A0K     // Catch:{ Exception -> 0x0089 }
            r0 = 3
            r1.A03 = r0     // Catch:{ Exception -> 0x0089 }
            X.9T9 r3 = r1.A02     // Catch:{ Exception -> 0x0089 }
            r0 = 0
            r3.A02(r0)     // Catch:{ Exception -> 0x0089 }
            X.9Vh r3 = r2.A0N     // Catch:{ Exception -> 0x0089 }
            r0 = 14
            X.9pP r1 = new X.9pP     // Catch:{ Exception -> 0x0089 }
            r1.<init>((java.lang.Object) r2, (int) r0)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = "camera_session_abort_capture_on_camera_handler_thread"
            r3.A04(r0, r1)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0053
        L_0x0089:
            X.9nw r0 = r2.A0B     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x008f
            r2.A0B = r4     // Catch:{ all -> 0x00e6 }
        L_0x008f:
            android.view.Surface r1 = r2.A04     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x009c
            boolean r0 = r2.A0E     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x009a
            r1.release()     // Catch:{ all -> 0x00e6 }
        L_0x009a:
            r2.A04 = r4     // Catch:{ all -> 0x00e6 }
        L_0x009c:
            X.9ng r0 = r2.A08     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00a5
            r0.close()     // Catch:{ all -> 0x00e6 }
            r2.A08 = r4     // Catch:{ all -> 0x00e6 }
        L_0x00a5:
            r2.A02 = r4     // Catch:{ all -> 0x00e6 }
            r2.A0G = r4     // Catch:{ all -> 0x00e6 }
            r2.A0F = r4     // Catch:{ all -> 0x00e6 }
            r2.A01 = r4     // Catch:{ all -> 0x00e6 }
            r2.A09 = r4     // Catch:{ all -> 0x00e6 }
            r2.A0A = r4     // Catch:{ all -> 0x00e6 }
            r2.A0C = r4     // Catch:{ all -> 0x00e6 }
            r2.A0D = r4     // Catch:{ all -> 0x00e6 }
            r2.A00 = r4     // Catch:{ all -> 0x00e6 }
            java.lang.Object r1 = r8.A0g     // Catch:{ all -> 0x00e6 }
            monitor-enter(r1)     // Catch:{ all -> 0x00e6 }
            java.util.concurrent.FutureTask r0 = r8.A0I     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x00c3
            r5.A08(r0)     // Catch:{ all -> 0x00e3 }
            r8.A0I = r4     // Catch:{ all -> 0x00e3 }
        L_0x00c3:
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            r8.A0l = r4     // Catch:{ all -> 0x00e6 }
            r8.A06 = r4     // Catch:{ all -> 0x00e6 }
            r8.A0G = r4     // Catch:{ all -> 0x00e6 }
            X.9Vu r1 = r8.A0Y     // Catch:{ all -> 0x00e6 }
            r0 = 0
            r1.A0F = r0     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e6 }
            X.9Sw r0 = r2.A0M
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e2
            X.9fN r0 = new X.9fN
            r0.<init>(r2)
            X.AnonymousClass9WU.A00(r0)
        L_0x00e2:
            return
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.A07(boolean):void");
    }

    public final boolean A08() {
        AnonymousClass9S3 r0 = this.A08;
        if (r0 == null || !(!r0.A08.A00.isEmpty())) {
            return false;
        }
        return true;
    }

    public void Awe(C202339lr r4) {
        if (r4 != null) {
            AnonymousClass9S3 r2 = this.A08;
            if (r2 != null) {
                boolean z = !A08();
                boolean A012 = r2.A08.A01(r4);
                if (z && A012) {
                    this.A0f.A07("restart_preview_to_resume_cpu_frames", new C204469pP(this, 5));
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("Cannot add null OnPreviewFrameListener.");
    }

    public void Awf(AnonymousClass9QW r2) {
        if (r2 != null) {
            this.A0Z.A0L.A01(r2);
            return;
        }
        throw AnonymousClass001.A0c("Cannot add null OnPreviewStartedListener.");
    }

    public void B3P(int i, int i2) {
        Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0M;
        rect.inset(i3, i3);
        this.A0f.A00(new C203849oP(this, 7), "focus", new C204489pR(rect, 8, this));
    }

    public boolean BIg() {
        return this.A0a.A0D;
    }

    public boolean BKU(float[] fArr) {
        Matrix matrix = this.A04;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    public void BLK(AnonymousClass9SG r4, AnonymousClass9SE r5) {
        this.A0f.A00(r4, "modify_settings_on_background_thread", new C204489pR(r5, 9, this));
    }

    public void BXV(int i) {
        if (!this.A0J) {
            this.A0i = i;
            C194559Tk r1 = this.A0k;
            if (r1 != null) {
                r1.A00 = this.A0i;
            }
        }
    }

    public void BjI(C202339lr r7) {
        AnonymousClass9S3 r0 = this.A08;
        if (r7 != null && r0 != null && r0.A08.A02(r7) && !A08()) {
            synchronized (this.A0g) {
                FutureTask futureTask = this.A0I;
                if (futureTask != null) {
                    this.A0f.A08(futureTask);
                }
                this.A0I = this.A0f.A02("restart_preview_if_to_stop_cpu_frames", this.A0h, 200);
            }
        }
    }

    public void BjJ(AnonymousClass9QW r2) {
        if (r2 != null) {
            this.A0Z.A0L.A02(r2);
        }
    }

    public void Blu(Handler handler) {
        this.A0f.A00 = handler;
    }

    public void BmJ(C202329lq r2) {
        this.A0X.A02 = r2;
    }

    public void BmZ(boolean z) {
        this.A0J = z;
        if (z) {
            this.A0i = 0;
            C194559Tk r1 = this.A0k;
            if (r1 != null) {
                r1.A00 = this.A0i;
            }
        }
    }

    public void Bmj(AnonymousClass9ML r3) {
        AnonymousClass9TX r0 = this.A0e;
        synchronized (r0.A02) {
            r0.A00 = r3;
        }
    }

    public void Bn3(AnonymousClass9SG r4, int i) {
        this.A01 = i;
        this.A0f.A00(r4, "set_rotation", new C204469pP(this, 6));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 == 180) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bny(android.graphics.Matrix r7, int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r6 = this;
            X.9T4 r0 = r6.A0F
            if (r0 == 0) goto L_0x007c
            r7.reset()
            float r1 = (float) r8
            float r0 = (float) r9
            r5 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r5, r5, r1, r0)
            int r4 = r6.A02
            if (r4 == 0) goto L_0x0019
            r2 = 180(0xb4, float:2.52E-43)
            float r1 = (float) r11
            float r0 = (float) r10
            if (r4 != r2) goto L_0x001b
        L_0x0019:
            float r1 = (float) r10
            float r0 = (float) r11
        L_0x001b:
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r5, r5, r1, r0)
            float r5 = r3.centerX()
            float r4 = r3.centerY()
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0061
            float r0 = r2.centerX()
            float r1 = r5 - r0
            float r0 = r2.centerY()
            float r0 = r4 - r0
            r2.offset(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            r7.setRectToRect(r3, r2, r0)
            int r0 = java.lang.Math.max(r8, r9)
            float r2 = (float) r0
            int r0 = java.lang.Math.max(r10, r11)
            float r0 = (float) r0
            float r2 = r2 / r0
            int r0 = java.lang.Math.min(r8, r9)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r10, r11)
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r12 == 0) goto L_0x0077
            float r0 = java.lang.Math.max(r2, r1)
        L_0x005e:
            r7.postScale(r0, r0, r5, r4)
        L_0x0061:
            int r3 = r6.A01
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x0072
            r0 = 3
            if (r3 == r0) goto L_0x0072
            if (r3 != r2) goto L_0x0071
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x006e:
            r7.postRotate(r0, r5, r4)
        L_0x0071:
            return r1
        L_0x0072:
            int r3 = r3 - r2
            int r0 = r3 * 90
            float r0 = (float) r0
            goto L_0x006e
        L_0x0077:
            float r0 = java.lang.Math.min(r2, r1)
            goto L_0x005e
        L_0x007c:
            java.lang.String r0 = "Camera params need to be configured before invoking setupViewTransformMatrix()"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZS.Bny(android.graphics.Matrix, int, int, int, int, boolean):boolean");
    }

    public void Bq5(AnonymousClass9SG r19, File file, File file2) {
        AnonymousClass9SA r8 = this.A0a;
        String absolutePath = file.getAbsolutePath();
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A0i;
        C194559Tk r6 = this.A0k;
        C193029Mr r7 = this.A0U;
        CaptureRequest.Builder builder = this.A06;
        boolean A082 = A08();
        AnonymousClass9ZW r9 = this.A0l;
        AnonymousClass9WQ r1 = r8.A03;
        AnonymousClass9SG r0 = r19;
        if (r1 == null || !r1.A0Q || r8.A04 == null) {
            r0.A00(AnonymousClass001.A0e("Cannot start recording video, camera is not ready or has been closed."));
        } else if (r8.A0D) {
            r0.A00(AnonymousClass001.A0e("Cannot start recording video, there is a video already being recorded"));
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass96t r12 = r8.A04;
            AnonymousClass9Mx r3 = C195049Vr.A0u;
            Object A083 = r12.A08(r3);
            AnonymousClass96t r13 = r8.A04;
            if (A083 == null) {
                r3 = C195049Vr.A0n;
            }
            AnonymousClass9T4 r10 = (AnonymousClass9T4) r13.A08(r3);
            if (absolutePath == null) {
                r0.A00(AnonymousClass001.A0c("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            r8.A0D = true;
            r8.A0A.A00(new AnonymousClass96n(builder, r0, r8, r9, A082), "start_video_recording", new C201549kJ(builder, r6, r7, r8, r9, r10, absolutePath, i, i2, i3, elapsedRealtime));
        }
    }

    public void BqE(AnonymousClass9SG r9, boolean z) {
        AnonymousClass9SA r4 = this.A0a;
        CaptureRequest.Builder builder = this.A06;
        A08();
        AnonymousClass9ZW r5 = this.A0l;
        if (!r4.A0D) {
            r9.A00(AnonymousClass001.A0e("Not recording video."));
            return;
        }
        r4.A0A.A00(r9, "stop_video_capture", new C201539kI(builder, r4, r5, SystemClock.elapsedRealtime()));
    }

    public void BqZ(AnonymousClass9SQ r19, AnonymousClass9V5 r20) {
        int i;
        int i2;
        Integer num;
        AnonymousClass9WQ r0;
        C203589nz r1 = this.A0D;
        if (r1 != null) {
            i = AnonymousClass001.A0K(r1.B3x(C203589nz.A0J));
        } else {
            i = 0;
        }
        C195079Vu r9 = this.A0Y;
        CameraManager cameraManager = this.A0O;
        int i3 = this.A00;
        int i4 = (((this.A0i + 45) / 90) * 90) % 360;
        int i5 = this.A00;
        int i6 = this.A02;
        if (i5 == 1) {
            i2 = (i6 - i4) + 360;
        } else {
            i2 = i6 + i4;
        }
        int i7 = i2 % 360;
        int A032 = A03();
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        CaptureRequest.Builder builder = this.A06;
        C203559nw r11 = this.A0C;
        boolean A082 = A08();
        AnonymousClass9ZW r10 = this.A0l;
        AnonymousClass9SQ r8 = r19;
        if (r9.A00 == null || (r0 = r9.A02) == null || !r0.A0Q) {
            r9.A02(r8, new C201699ka("Camera not ready to take photo."));
        } else if (r9.A0F) {
            r9.A02(r8, new C201699ka("Cannot take photo, another capture in progress."));
        } else {
            AnonymousClass9SA r02 = r9.A03;
            r02.getClass();
            if (r02.A0D) {
                r9.A02(r8, new C201699ka("Cannot take photo, video recording in progress."));
                return;
            }
            AnonymousClass96t r12 = r9.A06;
            r12.getClass();
            C195049Vr.A06(C195049Vr.A0e, r12);
            AnonymousClass9WT.A00();
            r9.A0F = true;
            C194549Tj r03 = r9.A01;
            r03.getClass();
            r03.A00();
            r9.A0E.A00(new C203839oO(r8, 1, r9), "take_photo", new C201559kK(cameraManager, builder, r8, r9, r10, r11, r20, num, i3, i7, A032, A082));
        }
    }

    public int getZoomLevel() {
        AnonymousClass9WO r0 = this.A09;
        if (r0 == null) {
            return -1;
        }
        return r0.A04();
    }

    public boolean isConnected() {
        if (this.A0j == null || !this.A0q) {
            return false;
        }
        return true;
    }

    static {
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t = A0t2;
        Integer A0Z2 = C18290x4.A0Z();
        A0t2.put(A0Z2, A0Z2);
        A0t2.put(C18270x1.A0F(C18270x1.A0E(AnonymousClass001.A0f(), 90, A0t2), 180, A0t2), 270);
    }

    public AnonymousClass9ZS(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A0N = applicationContext;
        C194959Vh r4 = new C194959Vh();
        this.A0f = r4;
        AnonymousClass9TX r3 = new AnonymousClass9TX(r4);
        this.A0e = r3;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        this.A0O = cameraManager;
        C194609Ts r1 = new C194609Ts(applicationContext.getPackageManager(), cameraManager, r3, r4);
        this.A0W = r1;
        this.A0Y = new C195079Vu(r3, r4);
        this.A0a = new AnonymousClass9SA(r1, r4);
        this.A0M = Math.round(TypedValue.applyDimension(1, 30.0f, AnonymousClass000.A0B(context)));
        this.A0X = new C194549Tj(r4);
        this.A0Z = new AnonymousClass9WQ(r4);
    }

    public void AzW(AnonymousClass9SG r10, AnonymousClass9SV r11, C203589nz r12, C202039lH r13, C202049lI r14, String str, int i, int i2) {
        AnonymousClass9WT.A00();
        if (this.A0K) {
            this.A0H = this.A0e.A00(this.A0f.A00, str);
        }
        this.A0f.A00(r10, "connect", new C204459pO(r11, this, r12, i, i2, 1));
        AnonymousClass9WT.A00();
    }

    public C194899Ux B5H() {
        C194899Ux r0;
        if (isConnected() && (r0 = this.A0E) != null) {
            return r0;
        }
        throw new C201659kW("Cannot get camera capabilities");
    }

    public void BqX(AnonymousClass9SG r4) {
        AnonymousClass9WT.A00();
        this.A0f.A00(r4, "switch_camera", new C204469pP(this, 8));
    }

    public int B5C() {
        return this.A00;
    }

    public int BCp() {
        return this.A02;
    }
}
