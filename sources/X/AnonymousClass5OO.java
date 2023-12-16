package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;

/* renamed from: X.5OO  reason: invalid class name */
public class AnonymousClass5OO {
    public final Context A00;
    public final C620633i A01;
    public final C56982ss A02;
    public final AnonymousClass5Y0 A03;
    public final CaptionView A04;
    public final C60152y5 A05;

    public void A00(Integer num) {
        int intValue;
        View view;
        int i;
        CaptionView captionView;
        WaImageView waImageView;
        Context context;
        int i2;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        captionView = this.A04;
                        captionView.A0C.setEnabled(true);
                        waImageView = captionView.A0D;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(false);
                        waImageView.setEnabled(true);
                        context = captionView.A06;
                        i2 = R.string.f11nameremoved;
                    } else if (intValue == 3) {
                        captionView = this.A04;
                        captionView.A0C.setEnabled(false);
                        waImageView = captionView.A0D;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(true);
                        waImageView.setEnabled(true);
                        context = captionView.A06;
                        i2 = R.string.f11nameremoved;
                    } else {
                        throw AnonymousClass001.A0e(AnonymousClass000.A0P(num, "Unexpected value: ", AnonymousClass001.A0o()));
                    }
                    C18300x5.A13(context, waImageView, i2);
                    view = captionView.A09;
                } else {
                    CaptionView captionView2 = this.A04;
                    captionView2.A0C.setEnabled(true);
                    WaImageView waImageView2 = captionView2.A0D;
                    waImageView2.setVisibility(0);
                    waImageView2.setActivated(false);
                    waImageView2.setEnabled(false);
                    view = captionView2.A09;
                }
                i = 8;
            } else {
                CaptionView captionView3 = this.A04;
                captionView3.A0C.setEnabled(true);
                captionView3.A0D.setVisibility(8);
                view = captionView3.A09;
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public AnonymousClass5OO(C620633i r2, C56982ss r3, AnonymousClass5Y0 r4, CaptionView captionView, C60152y5 r6) {
        this.A04 = captionView;
        this.A00 = captionView.getContext();
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        C107295b4.A03(captionView, R.string.f11nameremoved);
        captionView.setLayoutTransition(new AnonymousClass4LA());
    }
}
