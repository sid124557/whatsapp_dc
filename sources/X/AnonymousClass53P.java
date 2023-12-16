package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.53P  reason: invalid class name */
public final class AnonymousClass53P extends C88504Yz {
    public WaTextView A00;

    public AnonymousClass53P(View view) {
        super(view);
        C18290x4.A0M(view, R.id.status_chevron).setVisibility(8);
        View findViewById = view.findViewById(R.id.title);
        WaTextView waTextView = (WaTextView) findViewById;
        waTextView.setTextSize(0, waTextView.getResources().getDimension(R.dimen.f6nameremoved));
        C106905aM.A04(waTextView);
        C162457s7.A0D(findViewById);
        this.A00 = waTextView;
    }
}
