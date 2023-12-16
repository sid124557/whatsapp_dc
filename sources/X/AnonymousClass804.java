package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* renamed from: X.804  reason: invalid class name */
public class AnonymousClass804 implements C15830s0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MaterialDatePicker A03;

    public AnonymousClass0XY BMX(View view, AnonymousClass0XY r8) {
        int i = r8.A00.A0C(7).A03;
        int i2 = this.A00;
        if (i2 >= 0) {
            View view2 = this.A02;
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.A02;
        view3.setPadding(view3.getPaddingLeft(), this.A01 + i, view3.getPaddingRight(), view3.getPaddingBottom());
        return r8;
    }

    public AnonymousClass804(View view, MaterialDatePicker materialDatePicker, int i, int i2) {
        this.A03 = materialDatePicker;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
    }
}
