package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.4WP  reason: invalid class name */
public final class AnonymousClass4WP extends AnonymousClass0R6 {
    public final AnonymousClass5ZU A00;
    public final /* synthetic */ SelectedContactsList A01;

    public AnonymousClass4WP(AnonymousClass5ZU r1, SelectedContactsList selectedContactsList) {
        this.A01 = selectedContactsList;
        this.A00 = r1;
    }

    public int A0G() {
        return this.A01.A09.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        AnonymousClass4YP r82 = (AnonymousClass4YP) r8;
        SelectedContactsList selectedContactsList = this.A01;
        AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(selectedContactsList.A09, i);
        TextView textView = r82.A01;
        AnonymousClass5ZU r5 = this.A00;
        textView.setText(C18300x5.A0h(r5, A0L));
        selectedContactsList.A08.B1w(r82.A02, A0L, false);
        View view = r82.A00;
        C109725f5.A00(view, this, A0L, r82, 29);
        Resources resources = view.getResources();
        Object[] A0L2 = AnonymousClass002.A0L();
        C18300x5.A1E(r5, A0L, A0L2, 0);
        view.setContentDescription(resources.getString(R.string.f11nameremoved, A0L2));
        C107295b4.A03(view, R.string.f11nameremoved);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YP(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, this.A01.getSelectedContactsLayout()));
    }
}
