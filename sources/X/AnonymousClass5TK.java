package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import com.whatsapp.WaImageView;

/* renamed from: X.5TK  reason: invalid class name */
public class AnonymousClass5TK {
    public int A00 = 0;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04 = false;
    public final int A05;
    public final int A06;
    public final int A07;
    public final AnonymousClass7E7 A08;
    public final C103795Ol A09;
    public final C150537Re A0A;
    public final AnonymousClass5N6 A0B;

    public void A00(int i, int i2) {
        int i3;
        this.A01 = i2;
        this.A0A.A00.A07.A01(i2);
        if (this.A02 != i || this.A04) {
            if (this.A04) {
                i3 = this.A00;
            } else {
                i3 = 0;
            }
            A01(i3, i);
        }
    }

    public void A01(int i, int i2) {
        if (!this.A03) {
            C150537Re r0 = this.A0A;
            r0.A00(i);
            this.A00 = i;
            this.A02 = i2;
            AnonymousClass4LC r2 = r0.A00;
            r2.A06.setSizeAndInvalidate((float) i2);
            if (this.A04) {
                r2.A07.A01(this.A01);
                this.A04 = false;
            }
        }
    }

    public final void A02(boolean z) {
        Interpolator r0;
        C150537Re r1 = this.A0A;
        boolean A1S = AnonymousClass0x7.A1S(this.A0B.A01.A03.A00);
        AnonymousClass4LC r3 = r1.A00;
        WaImageView waImageView = r3.A05;
        if (waImageView != null) {
            int i = 4;
            int visibility = waImageView.getVisibility();
            if (!A1S) {
                if (visibility == 4) {
                    return;
                }
            } else if (visibility == 0) {
                return;
            }
            WaImageView waImageView2 = r3.A05;
            if (A1S) {
                i = 0;
            }
            waImageView2.setVisibility(i);
            if (z) {
                float f = 0.0f;
                float f2 = 1.0f;
                if (A1S) {
                    f2 = 0.0f;
                    f = 1.0f;
                }
                AlphaAnimation A0C = AnonymousClass4L0.A0C(f2, f);
                if (A1S) {
                    r0 = new AnonymousClass089();
                } else {
                    r0 = new AnonymousClass087();
                }
                A0C.setInterpolator(r0);
                A0C.setDuration(100);
                r3.A05.startAnimation(A0C);
            }
        }
    }

    public AnonymousClass5TK(AnonymousClass7E7 r2, C103795Ol r3, C150537Re r4, AnonymousClass5N6 r5, int i, int i2, int i3) {
        this.A05 = i;
        this.A07 = i2;
        this.A06 = i3;
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = r2;
        this.A0A = r4;
        r3.A02 = true;
        r3.A00 = new AnonymousClass8HZ(this);
    }
}
