package X;

import android.widget.SeekBar;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1;

/* renamed from: X.0aq  reason: invalid class name and case insensitive filesystem */
public final class C07420aq implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass0D5 A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ AnonymousClass84O A02;

    public C07420aq(AnonymousClass0D5 r1, C153427bI r2, AnonymousClass84O r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C153427bI r3 = this.A01;
        AnonymousClass84O r4 = this.A02;
        C03830Ls r2 = (C03830Ls) C162377rs.A05(r3, r4);
        if (r2 != null) {
            AnonymousClass0Pr r0 = r2.A02;
            int i2 = i;
            if (r0 != null) {
                AnonymousClass0D5 r1 = this.A00;
                r0.A00 = i;
                r1.A0S(r0.A03);
            }
            AnonymousClass0Pr r02 = r2.A02;
            if (r02 != null && !r02.A05) {
                C835248t A0L = r4.A0L(42);
                C85474Gj unused = C616131n.A02((C85494Gl) null, new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(r3, r4, A0L, (C84814Du) null, i2), AnonymousClass349.A02(AnonymousClass34M.A01()), (AnonymousClass20D) null, 3);
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        AnonymousClass0Pr r3;
        C153427bI r4 = this.A01;
        AnonymousClass84O r5 = this.A02;
        C03830Ls r0 = (C03830Ls) C162377rs.A05(r4, r5);
        if (r0 != null && (r3 = r0.A02) != null && r3.A05) {
            C835248t A0L = r5.A0L(42);
            C85474Gj unused = C616131n.A02((C85494Gl) null, new ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1(r3, r4, r5, A0L, (C84814Du) null), AnonymousClass349.A02(AnonymousClass34M.A01()), (AnonymousClass20D) null, 3);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }
}
