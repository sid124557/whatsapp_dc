package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.4XU  reason: invalid class name */
public class AnonymousClass4XU extends C04580Ov {
    public final Calendar A00 = C86664Kz.A1O();
    public final Calendar A01 = C86664Kz.A1O();
    public final /* synthetic */ MaterialCalendar A02;

    public AnonymousClass4XU(MaterialCalendar materialCalendar) {
        this.A02 = materialCalendar;
    }

    public void A01(Canvas canvas, AnonymousClass0Q1 r3, RecyclerView recyclerView) {
        if ((recyclerView.A0N instanceof AnonymousClass4WH) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw AnonymousClass001.A0g("getSelectedRanges");
        }
    }
}
