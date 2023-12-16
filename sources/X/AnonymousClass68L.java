package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;

/* renamed from: X.68L  reason: invalid class name */
public class AnonymousClass68L extends C107075ae {
    public final int A00;

    public AnonymousClass68L(int i) {
        this.A00 = i;
    }

    public void A02(Context context, Spannable spannable, int i, int i2) {
        int i3;
        int i4;
        int i5;
        switch (this.A00) {
            case 0:
                spannable.setSpan(C86634Kw.A0I(context, R.color.f5nameremoved), i, i2, 33);
                return;
            case 1:
                i3 = 33;
                spannable.setSpan(new BackgroundColorSpan(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved)), i, i2, 33);
                i4 = R.attr.f3nameremoved;
                i5 = R.color.f5nameremoved;
                break;
            default:
                i3 = 33;
                spannable.setSpan(new AnonymousClass4N1(), i, i2, 33);
                i4 = R.attr.f3nameremoved;
                i5 = R.color.f5nameremoved;
                break;
        }
        spannable.setSpan(new ForegroundColorSpan(C18300x5.A03(context, i4, i5)), i, i2, i3);
    }
}
