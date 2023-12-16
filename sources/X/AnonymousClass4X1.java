package X;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.4X1  reason: invalid class name */
public class AnonymousClass4X1 extends AnonymousClass0R6 {
    public final int A00;
    public final C108625dI A01;
    public final C178818i9 A02;

    public long A0B(int i) {
        Calendar A012 = C161097oz.A01(this.A01.A06.A06);
        A012.add(2, i);
        return new C117045rI(A012).A06.getTimeInMillis();
    }

    public int A0G() {
        return this.A01.A02;
    }

    public int A0K(C117045rI r5) {
        C117045rI r3 = this.A01.A06;
        if (r3.A06 instanceof GregorianCalendar) {
            return ((r5.A04 - r3.A04) * 12) + (r5.A03 - r3.A03);
        }
        throw AnonymousClass001.A0c("Only Gregorian calendars are supported.");
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        AnonymousClass6IP r82 = (AnonymousClass6IP) r8;
        C108625dI r4 = this.A01;
        Calendar A012 = C161097oz.A01(r4.A06.A06);
        A012.add(2, i);
        C117045rI r5 = new C117045rI(A012);
        TextView textView = r82.A00;
        String str = r5.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, r5.A06.getTimeInMillis(), 8228);
            r5.A00 = str;
        }
        textView.setText(str);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) r82.A01.findViewById(R.id.month_grid);
        if (materialCalendarGridView.A00() == null || !r5.equals(materialCalendarGridView.A00().A02)) {
            new C87154Of(r4, r5);
            throw AnonymousClass000.A0L();
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.A00();
        throw AnonymousClass001.A0g("iterator");
    }

    public AnonymousClass4X1(Context context, C108625dI r5, C178818i9 r6) {
        int i;
        C117045rI r0 = r5.A06;
        C117045rI r2 = r5.A05;
        C117045rI r1 = r5.A00;
        Calendar calendar = r0.A06;
        Calendar calendar2 = r1.A06;
        if (calendar.compareTo(calendar2) > 0) {
            throw AnonymousClass001.A0c("firstPage cannot be after currentPage");
        } else if (calendar2.compareTo(r2.A06) <= 0) {
            int dimensionPixelSize = C87154Of.A04 * context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (MaterialDatePicker.A01(context, 16843277)) {
                i = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            } else {
                i = 0;
            }
            this.A00 = dimensionPixelSize + i;
            this.A01 = r5;
            this.A02 = r6;
            A0E(true);
        } else {
            throw AnonymousClass001.A0c("currentPage cannot be after lastPage");
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        if (!MaterialDatePicker.A01(viewGroup.getContext(), 16843277)) {
            return new AnonymousClass6IP(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C002102g(-1, this.A00));
        return new AnonymousClass6IP(linearLayout, true);
    }
}
