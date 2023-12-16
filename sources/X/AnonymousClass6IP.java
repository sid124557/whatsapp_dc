package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.whatsapp.R;

/* renamed from: X.6IP  reason: invalid class name */
public class AnonymousClass6IP extends C05570Ua {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public AnonymousClass6IP(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView A09 = AnonymousClass002.A09(linearLayout, R.id.month_title);
        this.A00 = A09;
        C06560Yg.A0T(A09, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            A09.setVisibility(8);
        }
    }
}
