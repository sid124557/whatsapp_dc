package X;

import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.4aA  reason: invalid class name and case insensitive filesystem */
public class C88554aA extends AnonymousClass84C {
    public final float A00;
    public final float A01;
    public final /* synthetic */ CreationModeBottomBar A02;

    public C88554aA(CreationModeBottomBar creationModeBottomBar, float f, float f2) {
        this.A02 = creationModeBottomBar;
        this.A01 = f;
        this.A00 = f2;
    }

    public double A00(C153317b2 r11, float f, float f2) {
        float f3 = this.A01;
        float f4 = this.A00;
        float min = Math.min(f3, f4);
        float max = Math.max(f3, f4);
        double d = (double) min;
        double d2 = (double) f;
        return d2 + (((r11.A07.A00 - d) / (((double) max) - d)) * (((double) f2) - d2));
    }

    public void Bbv(C153317b2 r6) {
        float f = (float) r6.A07.A00;
        CreationModeBottomBar creationModeBottomBar = this.A02;
        creationModeBottomBar.A04.setScaleX(f);
        creationModeBottomBar.A04.setScaleY(f);
        creationModeBottomBar.A03(Math.max((int) A00(r6, 0.0f, 76.0f), 0));
    }
}
