package X;

import android.animation.AnimatorSet;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.5jt  reason: invalid class name and case insensitive filesystem */
public class C112535jt implements C186148up {
    public final /* synthetic */ AnonymousClass5ZS A00;

    public C112535jt(AnonymousClass5ZS r1) {
        this.A00 = r1;
    }

    public void BRT(float f, float f2) {
        AnonymousClass5ZS r0 = this.A00;
        r0.A0B();
        r0.A09();
    }

    public void BTb() {
        AnonymousClass5ZS r1 = this.A00;
        if (!r1.A0C.BIf()) {
            r1.A09();
        }
    }

    public void BTc() {
        AnonymousClass5ZS r4 = this.A00;
        if (!r4.A0f.A00 && !r4.A0C.BIf()) {
            AnonymousClass5UD r3 = r4.A0F;
            if (r3 == null || r4.A0i.A01 != 1) {
                C104405Qv r2 = r4.A0i;
                if (r2.A01 != 1 && r3 != null) {
                    AnimatorSet animatorSet = r3.A00;
                    if (animatorSet == null || !animatorSet.isStarted()) {
                        r2.A01 = 1;
                        r4.A0D();
                        r4.A0F.A02(true);
                        return;
                    }
                    return;
                }
                return;
            }
            CameraBottomSheetBehavior cameraBottomSheetBehavior = r3.A0B;
            cameraBottomSheetBehavior.A0S(3);
            cameraBottomSheetBehavior.A00 = true;
            r3.A08.setVisibility(0);
            r3.A00();
        }
    }

    public void BUM(float f) {
        AnonymousClass5ZS r1 = this.A00;
        if (!r1.A0C.BIf()) {
            r1.A0G.A00(f);
        }
    }

    public void Bbi(float f, float f2) {
        AnonymousClass5ZS r1 = this.A00;
        r1.A0C.B3Q(f, f2);
        r1.A0C.Ays();
        r1.A09();
    }

    public void Bft(float f) {
        AnonymousClass5OK r6 = this.A00.A0H;
        ZoomOverlay zoomOverlay = r6.A05;
        float maxScale = zoomOverlay.getMaxScale();
        if (maxScale >= 1.0f) {
            if (f > maxScale) {
                f = maxScale;
            }
            AnonymousClass678 r2 = r6.A02;
            int Bnu = r2.Bnu(Math.round((((float) r2.getMaxZoom()) * (f - 1.0f)) / (maxScale - 1.0f)));
            if (!r2.BIf() || r6.A00) {
                zoomOverlay.A00 = f;
                Context context = zoomOverlay.getContext();
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass001.A1P(A0L, ((float) Bnu) / 100.0f, 0);
                zoomOverlay.A02 = context.getString(R.string.f11nameremoved, A0L);
                zoomOverlay.invalidate();
            }
        }
    }

    public void Bfu(float f) {
        AnonymousClass5ZS r1 = this.A00;
        if (!(!r1.A0i.A0A.isEmpty())) {
            r1.A0N(false);
        }
        AnonymousClass5OK r12 = r1.A0H;
        if (!r12.A02.BIf() || r12.A00) {
            ZoomOverlay zoomOverlay = r12.A05;
            zoomOverlay.setVisibility(0);
            zoomOverlay.A00 = f;
            zoomOverlay.invalidate();
            zoomOverlay.removeCallbacks(zoomOverlay.A07);
            return;
        }
        r12.A05.setVisibility(4);
    }

    public void Bfv(float f) {
        AnonymousClass5ZS r1 = this.A00;
        if (!r1.A0C.BIf()) {
            r1.A0N(true);
        }
        ZoomOverlay zoomOverlay = r1.A0H.A05;
        zoomOverlay.invalidate();
        zoomOverlay.postDelayed(zoomOverlay.A07, 300);
    }
}
