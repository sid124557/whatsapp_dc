package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.4aG  reason: invalid class name and case insensitive filesystem */
public class C88604aG extends AnonymousClass7XV {
    public boolean A00 = false;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ AnonymousClass5ZS A02;
    public final /* synthetic */ AnonymousClass5UD A03;

    public C88604aG(C89654ea r2, AnonymousClass5ZS r3, AnonymousClass5UD r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A02(View view, float f) {
        AnonymousClass5ZS r1 = this.A02;
        float f2 = 1.0f - f;
        r1.A05.setAlpha(f2);
        r1.A0G.A00.setAlpha(f2);
        r1.A0I.A01.setAlpha(f2);
        AnonymousClass5OK r2 = r1.A0H;
        r2.A01.setBackgroundColor(((int) (255.0f * f)) << 24);
        AnonymousClass5UD r22 = this.A03;
        if (r22.A07.getConfiguration().orientation != 2 || r22.A0D) {
            r22.A0A.setAlpha(f2);
            DragGalleryStripIndicator dragGalleryStripIndicator = r22.A03;
            if (dragGalleryStripIndicator != null) {
                dragGalleryStripIndicator.setAlpha(f2);
            }
        }
        r22.A09.setAlpha(f);
    }

    public void A03(View view, int i) {
        AnonymousClass4X4 r0;
        AnonymousClass5UD r2 = this.A03;
        r2.A03(true);
        AnonymousClass5ZS r6 = this.A02;
        boolean z = this.A00;
        C08310eF r5 = r6.A0Z;
        int i2 = 0;
        r5.A15(AnonymousClass001.A1X(i, 4));
        if (i == 3) {
            if (!z && (r5 instanceof C185038sx)) {
                C104405Qv r02 = r6.A0i;
                ((C185038sx) r5).BnK(r02.A03, r02.A09, r02.A0A);
            }
            C18270x1.A0l(C18270x1.A03(r6.A0p), "show_camera_gallery_tip", false);
            r6.A05.setVisibility(4);
            AnonymousClass5UD r03 = r6.A0F;
            if (r03 != null) {
                r03.A0B.A00 = true;
            }
        } else {
            r6.A05.setVisibility(0);
            AnonymousClass5UD r1 = r6.A0F;
            if (!(r1 == null || r6.A0i.A01 == 1)) {
                r1.A0B.A00 = false;
            }
        }
        AnonymousClass5MR r04 = r6.A0G;
        if (i == 3) {
            i2 = 4;
        }
        r04.A00.setVisibility(i2);
        if (i == 4) {
            if (z && (r5 instanceof C185038sx)) {
                C104405Qv r05 = r6.A0i;
                ((C185038sx) r5).BCe(r05.A03, r05.A0A);
            }
            C86654Ky.A1L(r6.A0E, r6.A0i.A0A);
            AnonymousClass5OK r52 = r6.A0H;
            r52.A01.setBackgroundColor(C54292oU.A00(r6.A0o).getColor(R.color.f5nameremoved));
        }
        if (i != 1 || r2.A0C) {
            C89654ea r62 = this.A01;
            if (i == 3) {
                C107405bG.A08(r62, AnonymousClass5Yj.A02(r62, R.attr.f3nameremoved, R.color.f5nameremoved));
                C107405bG.A09(r62, AnonymousClass5Yj.A02(r62, R.attr.f3nameremoved, R.color.f5nameremoved), 1);
                View view2 = r2.A01;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                r2.A0A.setVisibility(4);
                this.A00 = true;
            } else {
                C107405bG.A0C(r62.getWindow(), false);
                C107405bG.A04(r62);
                C107405bG.A09(r62, AnonymousClass5Yj.A02(r62, R.attr.f3nameremoved, R.color.f5nameremoved), 2);
                View view3 = r2.A01;
                if (view3 != null) {
                    view3.setVisibility(AnonymousClass001.A08(r2.A0C ? 1 : 0));
                }
                r2.A0A.setVisibility(0);
                if (i == 4) {
                    if (this.A00 && (r0 = r2.A04) != null) {
                        r0.A05();
                    }
                    this.A00 = false;
                    r2.A09.setEnabled(false);
                    return;
                }
            }
            View view4 = r2.A09;
            view4.setEnabled(true);
            view4.setVisibility(0);
            return;
        }
        r2.A0B.A0S(4);
        this.A00 = false;
    }
}
