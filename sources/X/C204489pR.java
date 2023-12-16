package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.9pR  reason: invalid class name and case insensitive filesystem */
public class C204489pR implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204489pR(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object call() {
        Point point;
        AnonymousClass9WQ r0;
        C203429ng r5;
        long j;
        HashMap A0t;
        Float f;
        float f2;
        AnonymousClass9ZW r9;
        HashMap A0t2;
        switch (this.A02) {
            case 0:
                ((AnonymousClass9ZR) this.A00).A0L.A01.A02(this.A01);
                return null;
            case 1:
                AnonymousClass9ZR r4 = (AnonymousClass9ZR) this.A00;
                Object obj = this.A01;
                try {
                    AnonymousClass9TX r1 = r4.A0T;
                    Objects.equals(obj, r1.A03);
                    AnonymousClass9WT.A00();
                    r4.A04();
                    Objects.equals(obj, r1.A03);
                    AnonymousClass9WT.A00();
                    return null;
                } catch (Exception e) {
                    Objects.equals(obj, r4.A0T.A03);
                    AnonymousClass9WT.A00();
                    throw e;
                } catch (Throwable th) {
                    Objects.equals(obj, r4.A0T.A03);
                    AnonymousClass9WT.A00();
                    throw th;
                }
            case 2:
                AnonymousClass9ZR r12 = (AnonymousClass9ZR) this.A00;
                C195049Vr r42 = (C195049Vr) this.A01;
                if (!r12.isConnected()) {
                    return null;
                }
                r12.A0M.A02(r12.A0Z, (AnonymousClass9T4) r42.A08(C195049Vr.A0n), C195049Vr.A02(C195049Vr.A0j, r42));
                return null;
            case 3:
                AnonymousClass9ZR r43 = (AnonymousClass9ZR) this.A00;
                r43.A0B("Cannot modify settings");
                int i = r43.A00;
                AnonymousClass9T8 r13 = r43.A0P;
                r13.A00(i).A04((AnonymousClass9SE) this.A01);
                return r13.A02(r43.A00);
            case 4:
                ((AnonymousClass9ZR) this.A00).A0L.A01.A01(this.A01);
                return null;
            case 5:
                AnonymousClass9ZR r14 = (AnonymousClass9ZR) this.A00;
                Rect rect = (Rect) this.A01;
                if (!r14.isConnected()) {
                    return null;
                }
                r14.A07();
                C194349Sn r44 = r14.A0K;
                C204729pp r3 = new C204729pp(r14, 1);
                r44.A06.A06("Focus requests must be on the Optic thread. ");
                if (!r44.A09) {
                    return null;
                }
                AnonymousClass9T8 r8 = r44.A05;
                if (C194899Ux.A04(C194899Ux.A0P, r8.A01(r44.A00))) {
                    AnonymousClass96v A002 = r8.A00(r44.A00);
                    A002.A00.A01(C195049Vr.A0c, C195139We.A03(rect));
                    A002.A02();
                }
                if (!r44.A09) {
                    return null;
                }
                C194899Ux A012 = r8.A01(r44.A00);
                C193049Mw r2 = C194899Ux.A0O;
                if (!C194899Ux.A04(r2, A012) && !C194899Ux.A04(C194899Ux.A03, A012)) {
                    return null;
                }
                if (r44.A08) {
                    Camera camera = r44.A01;
                    camera.getClass();
                    camera.cancelAutoFocus();
                }
                r44.A07 = false;
                r44.A08 = true;
                r44.A0A = false;
                AnonymousClass96v A003 = r8.A00(r44.A00);
                if (C194899Ux.A04(r2, r8.A01(r44.A00))) {
                    A003.A00.A01(C195049Vr.A0B, C195139We.A03(rect));
                    point = new Point(rect.centerX(), rect.centerY());
                } else {
                    point = new Point(0, 0);
                }
                AnonymousClass9My.A02(C195049Vr.A0C, A003, 1);
                A003.A02();
                r44.A00(point, C192379Jm.FOCUSING, r44.A02);
                Camera camera2 = r44.A01;
                camera2.getClass();
                camera2.autoFocus(new AnonymousClass9XC(point, r3, r44));
                return null;
            case 6:
                AnonymousClass9ZR r45 = (AnonymousClass9ZR) this.A00;
                AnonymousClass9RS r15 = r45.A0L;
                Camera camera3 = (Camera) this.A01;
                r15.A00(true, camera3);
                try {
                    camera3.setPreviewTexture((SurfaceTexture) null);
                } catch (IOException e2) {
                    Log.e("Camera1Device", "Unable to remove the current SurfaceTexture", e2);
                }
                r45.A0M.A01(camera3);
                camera3.release();
                return null;
            case 7:
                AnonymousClass9ZR r22 = ((AnonymousClass96m) this.A00).A01;
                boolean A004 = AnonymousClass9V5.A00(AnonymousClass9V5.A03, (AnonymousClass9V5) this.A01);
                AnonymousClass9WU.A01("Performing post photo capture on UI thread");
                if (!r22.isConnected()) {
                    return null;
                }
                if (A004) {
                    r22.A05();
                }
                r22.A0N.A00(0);
                return null;
            case 8:
                AnonymousClass9ZS r46 = (AnonymousClass9ZS) this.A00;
                Rect rect2 = (Rect) this.A01;
                float[] fArr = {(float) rect2.centerX(), (float) rect2.centerY()};
                if (r46.A04 != null) {
                    Matrix matrix = new Matrix();
                    r46.A04.invert(matrix);
                    matrix.mapPoints(fArr);
                }
                C194549Tj r122 = r46.A0X;
                boolean z = r46.A0L;
                CaptureRequest.Builder builder = r46.A06;
                C203559nw r23 = r46.A0C;
                AnonymousClass9ZW r132 = r46.A0l;
                AnonymousClass9T1 r16 = r122.A0A;
                r16.A01("Cannot perform focus, not on Optic thread.");
                r16.A01("Can only check if the prepared on the Optic thread");
                if (!r16.A00) {
                    return null;
                }
                C192969Ml r02 = r122.A03;
                r02.getClass();
                if (!r02.A00.isConnected() || (r0 = r122.A04) == null || !r0.A0Q || builder == null || r132 == null) {
                    return null;
                }
                C194899Ux r17 = r122.A07;
                r17.getClass();
                if (!C194899Ux.A04(C194899Ux.A0O, r17) || r23 == null || r122.A05 == null || !r122.A0D || (r5 = r122.A04.A08) == null) {
                    return null;
                }
                r122.A00();
                r122.A03(C192379Jm.FOCUSING, fArr);
                MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[1];
                AnonymousClass9WO r03 = r122.A05;
                Rect rect3 = r03.A05;
                Rect rect4 = r03.A04;
                if (!(rect3 == null || rect4 == null)) {
                    float width = ((float) rect4.width()) / ((float) rect3.width());
                    float height = ((float) rect4.height()) / ((float) rect3.height());
                    int width2 = (rect3.width() - rect4.width()) / 2;
                    int height2 = (rect3.height() - rect4.height()) / 2;
                    int centerX = (int) ((((float) rect2.centerX()) * width) + ((float) width2));
                    int centerY = (int) ((((float) rect2.centerY()) * height) + ((float) height2));
                    Rect rect5 = new Rect(centerX, centerY, centerX, centerY);
                    rect5.inset((-rect2.width()) / 2, (-rect2.height()) / 2);
                    rect2 = rect5;
                }
                meteringRectangleArr[0] = new MeteringRectangle(rect2, 1000);
                r132.A05 = null;
                r132.A07 = new AnonymousClass9ZU(builder, r122, r132, fArr, z);
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                r122.A0C = true;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                C1899593h.A0l(builder, key, 2);
                r5.Ayh(builder.build(), (Handler) null, r132);
                C1899593h.A0l(builder, key, 0);
                r5.BnB(builder.build(), (Handler) null, r132);
                builder.set(key, 1);
                r5.Ayh(builder.build(), (Handler) null, r132);
                if (z) {
                    j = 6000;
                } else {
                    j = 4000;
                }
                r122.A02(builder, r132, j);
                return null;
            case 9:
                AnonymousClass9ZS r24 = (AnonymousClass9ZS) this.A00;
                if (r24.A0A == null || r24.A06 == null || r24.A0j == null || r24.A0E == null) {
                    throw AnonymousClass001.A0e("Cannot modify settings, camera was closed.");
                }
                AnonymousClass96t r04 = r24.A0A;
                AnonymousClass9Mx r6 = C195049Vr.A0I;
                boolean A07 = C195049Vr.A07(r6, r04);
                AnonymousClass96t r18 = r24.A0A;
                AnonymousClass9Mx r7 = C195049Vr.A0U;
                boolean A072 = C195049Vr.A07(r7, r18);
                AnonymousClass96t r19 = r24.A0A;
                AnonymousClass9Mx r92 = C195049Vr.A0K;
                boolean A073 = C195049Vr.A07(r92, r19);
                AnonymousClass96t r110 = r24.A0A;
                AnonymousClass9Mx r82 = C195049Vr.A02;
                HashMap hashMap = (HashMap) r110.A08(r82);
                if (hashMap != null) {
                    A0t = new HashMap(hashMap);
                } else {
                    A0t = AnonymousClass001.A0t();
                }
                if (r24.A0A.A0A((AnonymousClass9SE) this.A01)) {
                    AnonymousClass9WQ r111 = r24.A0Z;
                    if (r111.A0Q) {
                        if (r24.A0C != null) {
                            boolean A074 = C195049Vr.A07(r92, r24.A0A);
                            HashMap hashMap2 = (HashMap) r24.A0A.A08(r82);
                            if (hashMap2 != null) {
                                A0t2 = new HashMap(hashMap2);
                            } else {
                                A0t2 = AnonymousClass001.A0t();
                            }
                            if (A073 == A074) {
                                if (A073 && A074 && !A0t2.equals(A0t)) {
                                    r24.A07(true);
                                    r24.A06(r24.A0j.getId(), (Float) null);
                                }
                            }
                        }
                        r24.A0o = C195049Vr.A07(C195049Vr.A0R, r24.A0A);
                        if (C195049Vr.A07(C195049Vr.A0O, r24.A0A) && r24.A0l != null) {
                            r24.A0X.A04(r24.A0l);
                        }
                        r111.A04();
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 0);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 1);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 2);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 3);
                        int i2 = 4;
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 4);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 5);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 6);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 7);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 8);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 9);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 10);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 11);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 12);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 13);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 14);
                        AnonymousClass9U8.A01(r24.A06, r24.A0A, r24.A0E, 15);
                        CameraManager cameraManager = r24.A0O;
                        AnonymousClass9U8.A00(cameraManager, r24.A06, r24.A0A, r24.A0E, r24.A0j.getId(), 0);
                        String id = r24.A0j.getId();
                        AnonymousClass9U8.A00(cameraManager, r24.A06, r24.A0A, r24.A0E, id, 1);
                        if (C194899Ux.A04(C194899Ux.A0B, r24.A0E)) {
                            r24.A0A.A08(C195049Vr.A0i);
                        }
                        AnonymousClass96t r10 = r111.A09;
                        if (!(r10 == null || (r9 = r111.A07) == null)) {
                            r9.A0G = C195049Vr.A07(C195049Vr.A0Q, r10);
                        }
                        boolean A075 = C195049Vr.A07(r6, r24.A0A);
                        if (A075 != A07) {
                            r24.A07(true);
                            r24.A06(r24.A0j.getId(), (Float) null);
                            r24.A0p = A075;
                        } else {
                            boolean A076 = C195049Vr.A07(r7, r24.A0A);
                            if (!(r24.A0E instanceof AnonymousClass96q) || r24.A0Y.A0F || r24.A0a.A0D || A076 == A072) {
                                r111.A03();
                            } else {
                                AnonymousClass9WO r112 = r24.A09;
                                if (r112 != null) {
                                    float A03 = r112.A03(r112.A02()) * 100.0f;
                                    if ("Google".equalsIgnoreCase(Build.BRAND)) {
                                        f2 = 0.88495576f;
                                        if (A076) {
                                            f2 = 1.13f;
                                        }
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    f = Float.valueOf(A03 * f2);
                                } else {
                                    f = null;
                                }
                                r24.A07(true);
                                AnonymousClass96q r05 = (AnonymousClass96q) r24.A0E;
                                if (!A076) {
                                    i2 = -1;
                                }
                                r05.A07(i2);
                                AnonymousClass9ZS.A02(r24, r24.A0j.getId());
                                AnonymousClass9ZS.A00(r24);
                                r24.A06(r24.A0j.getId(), f);
                            }
                        }
                    }
                }
                return r24.A0A;
            case 10:
                try {
                    UUID uuid = (UUID) this.A01;
                    AnonymousClass9ZS r25 = (AnonymousClass9ZS) this.A00;
                    AnonymousClass9TX r113 = r25.A0e;
                    Objects.equals(uuid, r113.A03);
                    AnonymousClass9WT.A00();
                    r25.A04();
                    if (r25.A0k != null) {
                        r25.A0k.A02();
                        r25.A0k = null;
                        r25.A0C = null;
                    }
                    r25.A07 = null;
                    r25.A0D = null;
                    Objects.equals(uuid, r113.A03);
                    AnonymousClass9WT.A00();
                    return null;
                } catch (Exception e3) {
                    Objects.equals((UUID) this.A01, ((AnonymousClass9ZS) this.A00).A0e.A03);
                    AnonymousClass9WT.A00();
                    throw e3;
                } catch (Throwable th2) {
                    Objects.equals(this.A01, ((AnonymousClass9ZS) this.A00).A0e.A03);
                    AnonymousClass9WT.A00();
                    throw th2;
                }
            default:
                C195729Zh r52 = (C195729Zh) this.A01;
                r52.A00.A01();
                return r52;
        }
    }
}
