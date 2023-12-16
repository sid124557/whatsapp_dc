package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.4WG  reason: invalid class name */
public final class AnonymousClass4WG extends AnonymousClass09G implements Filterable {
    public static final AnonymousClass0O4 A04 = new C1231067d(1);
    public C148977Kl A00;
    public List A01;
    public List A02;
    public final CountrySelectorBottomSheet A03;

    public void BNf(C05570Ua r4, int i) {
        C162457s7.A0J(r4, 0);
        Object A0K = A0K(i);
        C162457s7.A0D(A0K);
        C148977Kl r2 = (C148977Kl) A0K;
        C162457s7.A0J(r2, 0);
        AppCompatRadioButton appCompatRadioButton = ((AnonymousClass4YK) r4).A00;
        appCompatRadioButton.setText(r2.A01);
        appCompatRadioButton.setChecked(r2.A00);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YK(C18310x6.A0I(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved, false), this);
    }

    public Filter getFilter() {
        return new AnonymousClass67V(this, 0);
    }

    public AnonymousClass4WG(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        this();
        this.A03 = countrySelectorBottomSheet;
    }

    public AnonymousClass4WG() {
        super(A04);
        this.A02 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass001.A0s();
    }
}
