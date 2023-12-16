package X;

import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.R;
import com.whatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.util.Log;

/* renamed from: X.5PM  reason: invalid class name */
public class AnonymousClass5PM {
    public final /* synthetic */ AnonymousClass5ZS A00;

    public AnonymousClass5PM(AnonymousClass5ZS r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass5ZS r3 = this.A00;
        AnonymousClass5UM r1 = r3.A0k;
        if (r1.A0B) {
            r1.A09.markerPoint(554240366, "on_shutter");
        }
        r3.A0b.A0S(C117695sL.A00(this, 47));
    }

    public void A01(byte[] bArr, boolean z) {
        int i;
        AnonymousClass5ZS r1 = this.A00;
        if (r1.A0A != null) {
            ShutterOverlay shutterOverlay = r1.A0H.A04;
            shutterOverlay.A02 = true;
            shutterOverlay.invalidate();
            shutterOverlay.postDelayed(new C71553cI((Object) shutterOverlay, 4), 50);
            Log.i("cameraui/picturetaken");
            byte[] bArr2 = bArr;
            boolean A1X = AnonymousClass000.A1X(bArr2);
            AnonymousClass5UM r11 = r1.A0k;
            AnonymousClass678 r3 = r1.A0C;
            Integer valueOf = Integer.valueOf(r3.getCameraApi());
            int cameraType = r3.getCameraType();
            boolean z2 = !r3.BHe();
            String flashMode = r3.getFlashMode();
            String l = Long.toString(r3.getPictureResolution());
            if (!flashMode.equals("on")) {
                i = 2;
                if (!flashMode.equals("auto")) {
                    i = 0;
                }
            } else {
                i = 1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - r11.A00;
            AnonymousClass4s2 r32 = new AnonymousClass4s2();
            r32.A02 = Integer.valueOf(cameraType);
            r32.A00 = valueOf;
            r32.A01 = Integer.valueOf(z2 ? 1 : 0);
            r32.A03 = Integer.valueOf(i);
            r32.A05 = l;
            r32.A04 = Long.valueOf(elapsedRealtime);
            if (r11.A0A) {
                r11.A08.BhD(r32);
            }
            if (r11.A0B) {
                r11.A03(valueOf, 554240366, cameraType);
                r11.A00(554240366, z2);
                C186568vZ r33 = r11.A09;
                r33.markerAnnotate(554240366, "flash_mode", flashMode);
                r33.markerAnnotate(554240366, "requested_photo_resolution", l);
                short s = 2;
                if (A1X) {
                    s = 87;
                }
                r33.markerEnd(554240366, s);
            }
            C105995Xf r5 = r1.A0j;
            AnonymousClass678 r2 = r1.A0C;
            boolean BHe = r2.BHe();
            int zoomLevel = r2.getZoomLevel();
            String flashMode2 = r1.A0C.getFlashMode();
            boolean A1U = AnonymousClass000.A1U(C86604Kt.A02(r1.A0o.A00), 2);
            Log.d("CameraCaptureFlowLogger/logPhotoCaptureCompleted");
            r5.A02(flashMode2, zoomLevel, 1, 0, BHe, A1U);
            AnonymousClass5Y6 r34 = r1.A0E;
            Window window = r1.A04().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            r34.A0B.setVisibility(4);
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
            if (A1X) {
                r1.A0b.A0H(R.string.f11nameremoved, 1);
                r1.A11.BOE();
                return;
            }
            if (r1.A0A != null) {
                if (AnonymousClass34G.A01(r1.A0m, r1.A0t) < 2013) {
                    C86604Kt.A1E(r1.A09, R.id.save_progress, 0);
                }
            }
            C64393Dh r4 = r1.A0a;
            C60152y5 r52 = r1.A0t;
            C633138t r6 = C633138t.A0C;
            int i2 = 1;
            if (r1.A0r.A0X(401)) {
                i2 = 4;
            }
            r1.A0K = C107655bf.A0Q(r4, r52, r6, ".jpeg", 0, i2);
            r1.A0v.BkO(new C992254x(r1.A04(), new AnonymousClass7DM(r1), r1.A0K, bArr2, r1.A03(), z), new Void[0]);
        }
    }
}
