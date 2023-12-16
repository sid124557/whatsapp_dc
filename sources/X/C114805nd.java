package X;

import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.5nd  reason: invalid class name and case insensitive filesystem */
public class C114805nd implements C188048yE {
    public final Runnable A00;
    public final /* synthetic */ C114825nf A01;

    public C114805nd(C114825nf r1, Runnable runnable) {
        this.A01 = r1;
        this.A00 = runnable;
    }

    public void BRR() {
        C114825nf r2 = this.A01;
        r2.A0V.A0C = true;
        if (r2.A0O.A02 || r2.A0P.A01 != null) {
            Handler handler = r2.A0C;
            Runnable runnable = this.A00;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 400);
        }
    }

    public void BRS() {
        C114825nf r4 = this.A01;
        C105305Uj r2 = r4.A0V;
        int i = 0;
        r2.A0C = false;
        C103795Ol r7 = r4.A0O;
        if (r7.A02 || r4.A0P.A01 != null) {
            AnonymousClass5US r5 = r4.A0T;
            C105425Uw r6 = r5.A01;
            r4.A0C.removeCallbacks(this.A00);
            if (!r4.A0A()) {
                if (r6 == null) {
                    r4.A0J.A04(true);
                    r4.A05.A00();
                } else if (r7.A02) {
                    ColorPickerComponent colorPickerComponent = r4.A0J;
                    if (colorPickerComponent.A05.getVisibility() != 0) {
                        colorPickerComponent.A00();
                    }
                }
                if (C86604Kt.A05(r2.A0G.A05) == 2) {
                    r2.A0I.A01(r2.A0F);
                    r4.A0J.A00();
                } else {
                    r2.A03();
                }
                r4.A0M.setSystemUiVisibility(1280);
                if (!AnonymousClass0x7.A1S(r5.A03.A00)) {
                    i = 4;
                }
                TitleBarView titleBarView = r2.A0I;
                titleBarView.setUndoButtonVisibility(i);
                boolean A002 = C102805Ki.A00(r4.A0F);
                RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
                View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
                layoutParams.addRule(A002 ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
                toolbarExtra.setLayoutParams(layoutParams);
                r4.A05.A02();
            }
        }
    }

    public void BbS(C105425Uw r6) {
        C114825nf r3 = this.A01;
        AnonymousClass08M r4 = r3.A0V.A0G.A05;
        if (C86604Kt.A05(r4) != 2) {
            boolean A0R = r6.A0R();
            if (A0R || r6.A0Q()) {
                if (C86604Kt.A05(r4) == 5) {
                    r3.A0J.A00();
                }
                if (r6.A0Q()) {
                    int color = r6.A01.getColor();
                    if (color != 0) {
                        r3.A0J.setColorAndInvalidate(color);
                    }
                    ColorPickerView colorPickerView = r3.A0J.A05;
                    colorPickerView.A01();
                    colorPickerView.invalidate();
                }
                if (A0R) {
                    r3.A0J.setSizeAndInvalidate(r6.A08() * r3.A0M.A00);
                }
            } else {
                r3.A0J.A04(true);
                r3.A05.A00();
            }
            r3.A06();
        }
    }
}
