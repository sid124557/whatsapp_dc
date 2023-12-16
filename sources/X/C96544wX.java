package X;

import android.view.View;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4wX  reason: invalid class name and case insensitive filesystem */
public final class C96544wX extends AnonymousClass6mM {
    public final View A00;
    public final Chip A01;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C136116ls r4 = (C136116ls) obj;
        C162457s7.A0J(r4, 0);
        Chip chip = this.A01;
        chip.setText(r4.A01);
        chip.setOnCloseIconClickListener(new C109305eP(r4, 16));
    }

    public C96544wX(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (Chip) C18280x3.A0E(view, R.id.search_context_category_chip);
    }
}
