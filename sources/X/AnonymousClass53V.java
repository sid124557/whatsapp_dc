package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.53V  reason: invalid class name */
public final class AnonymousClass53V extends C88504Yz {
    public boolean A00;
    public final WaImageView A01;
    public final AnonymousClass4GQ A02;

    public AnonymousClass53V(View view, AnonymousClass4GQ r5, int i) {
        super(view);
        this.A02 = r5;
        TextView A0I = C86614Ku.A0I(view);
        A0I.setText(i);
        A0I.setTextSize(0, A0I.getResources().getDimension(R.dimen.f6nameremoved));
        C106905aM.A04(A0I);
        WaImageView waImageView = (WaImageView) C18290x4.A0M(view, R.id.status_chevron);
        this.A01 = waImageView;
        waImageView.setVisibility(0);
        C109395eY.A00(view, this, 23);
    }
}
