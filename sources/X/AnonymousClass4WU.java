package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import java.util.List;

/* renamed from: X.4WU  reason: invalid class name */
public final class AnonymousClass4WU extends AnonymousClass0R6 {
    public final int A00;
    public final StatusSeeAllAdapter A01;
    public final List A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        View inflate = C86604Kt.A0E(viewGroup, 0).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) inflate;
        C106905aM.A04(chip);
        chip.setChipIconVisible(false);
        chip.setCheckedIconVisible(false);
        return new AnonymousClass6IN(chip);
    }

    public int A0G() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r4, int i) {
        AnonymousClass6IN r42 = (AnonymousClass6IN) r4;
        C162457s7.A0J(r42, 0);
        Chip chip = r42.A00;
        List list = this.A02;
        chip.setText((CharSequence) list.get(i));
        chip.setSelected(AnonymousClass000.A1U(i, this.A00));
        chip.setContentDescription((CharSequence) list.get(i));
        C109695f2.A00(chip, this, i, 21);
    }

    public AnonymousClass4WU(StatusSeeAllAdapter statusSeeAllAdapter, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = statusSeeAllAdapter;
    }
}
