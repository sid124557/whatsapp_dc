package X;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.camera.overlays.AutofocusOverlay;
import com.whatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.5OK  reason: invalid class name */
public class AnonymousClass5OK {
    public boolean A00;
    public final View A01;
    public final AnonymousClass678 A02;
    public final AutofocusOverlay A03;
    public final ShutterOverlay A04;
    public final ZoomOverlay A05;

    public void A00(boolean z, boolean z2) {
        long j;
        AutofocusOverlay autofocusOverlay = this.A03;
        autofocusOverlay.A03 = Boolean.valueOf(z);
        autofocusOverlay.invalidate();
        Runnable runnable = autofocusOverlay.A07;
        if (z2) {
            j = 0;
        } else {
            j = 1000;
        }
        autofocusOverlay.postDelayed(runnable, j);
    }

    public AnonymousClass5OK(ViewGroup viewGroup, AnonymousClass678 r6, boolean z) {
        this.A02 = r6;
        this.A01 = C86664Kz.A0h(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
        this.A00 = z;
        AutofocusOverlay autofocusOverlay = (AutofocusOverlay) C06560Yg.A02(viewGroup, R.id.autofocus_overlay);
        this.A03 = autofocusOverlay;
        this.A05 = (ZoomOverlay) C06560Yg.A02(viewGroup, R.id.zoom_overlay);
        ShutterOverlay shutterOverlay = (ShutterOverlay) C06560Yg.A02(viewGroup, R.id.shutter_overlay);
        this.A04 = shutterOverlay;
        if (z) {
            Paint paint = shutterOverlay.A03;
            AnonymousClass001.A10(paint);
            paint.setColor(-16777216);
        }
        autofocusOverlay.A04 = z;
        if (z) {
            autofocusOverlay.A06.setStrokeWidth(autofocusOverlay.getResources().getDimension(R.dimen.f6nameremoved));
            autofocusOverlay.A00 = autofocusOverlay.getResources().getDimension(R.dimen.f6nameremoved);
        }
    }
}
