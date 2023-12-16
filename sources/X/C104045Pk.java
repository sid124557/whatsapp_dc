package X;

import android.widget.RadioButton;
import com.whatsapp.R;

/* renamed from: X.5Pk  reason: invalid class name and case insensitive filesystem */
public final class C104045Pk {
    public final C620733j A00;
    public final AnonymousClass4S6 A01;

    public final void A00(int i) {
        RadioButton radioButton;
        AnonymousClass4S6 r2 = this.A01;
        r2.A00();
        if (i != 0) {
            if (i == 1) {
                radioButton = r2.A02;
            } else if (i == 2) {
                radioButton = r2.A03;
            } else if (i != 3) {
                return;
            }
            radioButton.setChecked(true);
        }
        radioButton = r2.A04;
        radioButton.setChecked(true);
    }

    public final void A01(int i, int i2) {
        C620733j r5 = this.A00;
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, i);
        String A0L = r5.A0L(objArr, R.plurals.f9nameremoved, (long) i);
        C162457s7.A0D(A0L);
        AnonymousClass4S6 r2 = this.A01;
        r2.A06.setText(A0L);
        String A0q = C86604Kt.A0q(r5, i2, A1Y ? 1 : 0, R.plurals.f9nameremoved);
        C162457s7.A0D(A0q);
        r2.A05.setText(A0q);
    }

    public C104045Pk(C620733j r1, AnonymousClass4S6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
