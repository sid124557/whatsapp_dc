package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.53T  reason: invalid class name */
public final class AnonymousClass53T extends C88504Yz {
    public boolean A00;
    public final WaImageView A01;
    public final UpdatesAdapter A02;

    public AnonymousClass53T(View view, UpdatesAdapter updatesAdapter) {
        super(view);
        this.A02 = updatesAdapter;
        TextView A0I = C86614Ku.A0I(view);
        A0I.setText(R.string.f11nameremoved);
        A0I.setTextSize(0, A0I.getResources().getDimension(R.dimen.f6nameremoved));
        C106905aM.A04(A0I);
        WaImageView waImageView = (WaImageView) C18290x4.A0M(view, R.id.status_chevron);
        this.A01 = waImageView;
        waImageView.setVisibility(0);
        C109395eY.A00(view, this, 15);
    }
}
