package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.4WH  reason: invalid class name */
public class AnonymousClass4WH extends AnonymousClass0R6 {
    public final MaterialCalendar A00;

    public int A0G() {
        return this.A00.A07.A03;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        int i2 = this.A00.A07.A06.A04 + i;
        TextView textView = ((AnonymousClass6I7) r9).A00;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i2);
        textView.setText(String.format(locale, "%d", new Object[]{valueOf}));
        Context context = textView.getContext();
        int i3 = C161097oz.A00().get(1);
        int i4 = R.string.f11nameremoved;
        if (i3 == i2) {
            i4 = R.string.f11nameremoved;
        }
        textView.setContentDescription(String.format(context.getString(i4), new Object[]{valueOf}));
        C161097oz.A00().get(1);
        throw AnonymousClass001.A0g("getSelectedDays");
    }

    public AnonymousClass4WH(MaterialCalendar materialCalendar) {
        this.A00 = materialCalendar;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass6I7((TextView) AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }
}
