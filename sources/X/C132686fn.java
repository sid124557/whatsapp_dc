package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.6fn  reason: invalid class name and case insensitive filesystem */
public class C132686fn extends C136216mE {
    public /* bridge */ /* synthetic */ void A09(Object obj) {
        int i;
        C132666fl r6 = (C132666fl) obj;
        super.A0A(r6);
        WaImageView waImageView = this.A01;
        View view = this.A0H;
        waImageView.setImageDrawable(C18310x6.A0G(view.getContext(), R.drawable.ic_location_nearby));
        this.A03.setText(R.string.f11nameremoved);
        boolean z = r6.A00;
        WaTextView waTextView = this.A02;
        if (z) {
            waTextView.setText(R.string.f11nameremoved);
            i = 0;
            waTextView.setVisibility(0);
            this.A00.setImageDrawable(C18310x6.A0G(view.getContext(), R.drawable.ic_action_info));
        } else {
            i = 8;
            waTextView.setVisibility(8);
        }
        this.A00.setVisibility(i);
    }

    public C132686fn(View view) {
        super(view);
    }
}
