package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.R;
import com.whatsapp.camera.overlays.AutofocusOverlay;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5rX  reason: invalid class name and case insensitive filesystem */
public class C117195rX implements Runnable {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public C117195rX(Object obj, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void run() {
        float f;
        AnonymousClass5OK r3;
        float left;
        View view;
        switch (this.A03) {
            case 0:
                float f2 = this.A00;
                f = this.A01;
                AnonymousClass5ZS r1 = (AnonymousClass5ZS) ((C1234468l) this.A02).A00;
                r3 = r1.A0H;
                left = ((float) r1.A08.getLeft()) + f2;
                view = r1.A08;
                break;
            case 1:
                C132906gD r32 = (C132906gD) this.A02;
                float f3 = this.A00;
                float f4 = this.A01;
                synchronized (r32) {
                    Camera camera = r32.A07;
                    if (camera != null && r32.A0M) {
                        camera.cancelAutoFocus();
                        Camera.Parameters parameters = r32.A07.getParameters();
                        int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                        C18260x0.A0w("cameraview/max-focus-areas  ", AnonymousClass001.A0o(), maxNumFocusAreas);
                        if (maxNumFocusAreas > 0) {
                            float dimension = C18290x4.A0G(r32).getDimension(R.dimen.f6nameremoved);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("cameraview/focus-area-size:");
                            A0o.append(dimension);
                            AnonymousClass0x2.A18(A0o);
                            float f5 = dimension / 2.0f;
                            RectF A09 = AnonymousClass4L0.A09(f3 - f5, f4 - f5, f3 + f5, f5 + f4);
                            Matrix A05 = AnonymousClass002.A05();
                            float f6 = 1.0f;
                            if (r32.A0N) {
                                f6 = -1.0f;
                            }
                            A05.setScale(f6, 1.0f);
                            A05.postRotate((float) r32.A01);
                            float width = (float) r32.getWidth();
                            float height = (float) r32.getHeight();
                            A05.postScale(width / 2000.0f, height / 2000.0f);
                            A05.postTranslate(width / 2.0f, height / 2.0f);
                            A05.invert(A05);
                            A05.mapRect(A09);
                            Rect A0N = AnonymousClass001.A0N();
                            int A002 = C132906gD.A00(A09.left);
                            A0N.left = A002;
                            int A003 = C132906gD.A00(A09.top);
                            A0N.top = A003;
                            int A004 = C132906gD.A00(A09.right);
                            A0N.right = A004;
                            int A005 = C132906gD.A00(A09.bottom);
                            A0N.bottom = A005;
                            if (AnonymousClass001.A0A(A003, A005) < 10) {
                                A003 -= 5;
                                A0N.top = A003;
                                A005 += 5;
                                A0N.bottom = A005;
                            }
                            if (AnonymousClass001.A0A(A002, A004) < 10) {
                                A002 -= 5;
                                A0N.left = A002;
                                A004 += 5;
                                A0N.right = A004;
                            }
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("cameraview/focus-area  ");
                            A0o2.append(A002);
                            A0o2.append(",");
                            A0o2.append(A003);
                            A0o2.append(" - ");
                            A0o2.append(A004);
                            C18260x0.A0w(",", A0o2, A005);
                            ArrayList A0s = AnonymousClass001.A0s();
                            A0s.add(new Camera.Area(A0N, 1000));
                            parameters.setFocusAreas(A0s);
                            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            r32.A07.setParameters(parameters);
                            C185898uQ r0 = r32.A0F;
                            Objects.requireNonNull(r0);
                            r0.BN3(f3, f4);
                        }
                        r32.A07.autoFocus(new C1895691u(r32, 0));
                    }
                }
                return;
            default:
                float f7 = this.A00;
                f = this.A01;
                C106735a4 r12 = (C106735a4) ((C1234468l) this.A02).A00;
                r3 = r12.A04;
                left = ((float) r12.A06.A03.getLeft()) + f7;
                view = r12.A06.A03;
                break;
        }
        float top = ((float) view.getTop()) + f;
        AutofocusOverlay autofocusOverlay = r3.A03;
        float f8 = autofocusOverlay.A00 / 2.0f;
        autofocusOverlay.A01 = AnonymousClass4L0.A09(left - f8, top - f8, f8 + left, f8 + top);
        autofocusOverlay.A03 = null;
        autofocusOverlay.setVisibility(0);
        if (autofocusOverlay.A04) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 0, left, 0, top);
            scaleAnimation.setDuration(400);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillAfter(true);
            autofocusOverlay.startAnimation(scaleAnimation);
        }
        autofocusOverlay.invalidate();
        autofocusOverlay.removeCallbacks(autofocusOverlay.A07);
    }
}
