package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;

/* renamed from: X.7Re  reason: invalid class name and case insensitive filesystem */
public class C150537Re {
    public final /* synthetic */ AnonymousClass4LC A00;

    public C150537Re(AnonymousClass4LC r1) {
        this.A00 = r1;
    }

    public void A00(int i) {
        PenModeView penModeView = this.A00.A08;
        for (View background : penModeView.A01) {
            background.setBackground((Drawable) null);
        }
        int i2 = R.id.pen_mode_thin;
        if (i != 1) {
            i2 = R.id.pen_mode_medium;
            if (i != 2) {
                i2 = R.id.pen_mode_thick;
                if (i != 3) {
                    if (i == 4) {
                        i2 = R.id.pen_mode_blur;
                    } else {
                        return;
                    }
                }
            }
        }
        C06560Yg.A02(penModeView, i2).setBackgroundResource(R.drawable.pen_mode_selected_background);
    }
}
