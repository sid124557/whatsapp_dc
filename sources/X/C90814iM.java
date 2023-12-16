package X;

import android.view.View;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.4iM  reason: invalid class name and case insensitive filesystem */
public final class C90814iM extends AnonymousClass6J2 {
    public final Chip A00;

    public void A07(C150417Qq r5) {
        Chip chip = this.A00;
        View view = this.A0H;
        chip.setText(view.getContext().getText(R.string.f11nameremoved));
        C18290x4.A1H(view, this, 45);
    }

    public C90814iM(View view, C185648u1 r3) {
        super(view, r3);
        this.A00 = (Chip) C18290x4.A0M(view, R.id.clear_chip);
    }
}
