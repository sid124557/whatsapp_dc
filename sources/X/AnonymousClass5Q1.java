package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.5Q1  reason: invalid class name */
public class AnonymousClass5Q1 {
    public final Context A00;
    public final WaImageButton A01;
    public final C620733j A02;

    public void A00(int i) {
        if (i != 0) {
            WaImageButton waImageButton = this.A01;
            waImageButton.setImageResource(R.drawable.ic_done);
            C18300x5.A13(this.A00, waImageButton, R.string.f11nameremoved);
            return;
        }
        WaImageButton waImageButton2 = this.A01;
        C620733j r2 = this.A02;
        Context context = this.A00;
        C18270x1.A0d(context, waImageButton2, r2, R.drawable.input_send);
        C18300x5.A13(context, waImageButton2, R.string.f11nameremoved);
    }

    public AnonymousClass5Q1(WaImageButton waImageButton, C620733j r3) {
        this.A01 = waImageButton;
        this.A00 = waImageButton.getContext();
        this.A02 = r3;
    }

    public void A01(boolean z) {
        int i;
        int i2 = R.dimen.f6nameremoved;
        if (z) {
            i2 = R.dimen.f6nameremoved;
        }
        Context context = this.A00;
        int A002 = C18320x8.A00(context, i2);
        WaImageButton waImageButton = this.A01;
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(waImageButton);
        C620733j r3 = this.A02;
        C107555bV.A06(waImageButton, r3, A0T.leftMargin, A0T.topMargin, A0T.rightMargin, A002);
        if (z) {
            C18270x1.A0d(context, waImageButton, r3, R.drawable.input_send);
            i = R.string.f11nameremoved;
        } else {
            waImageButton.setImageResource(R.drawable.ic_done);
            i = R.string.f11nameremoved;
        }
        C18300x5.A13(context, waImageButton, i);
    }
}
