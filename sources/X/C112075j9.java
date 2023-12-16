package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5j9  reason: invalid class name and case insensitive filesystem */
public final class C112075j9 implements AnonymousClass64O {
    public final WaTextView A00;

    public C112075j9(View view) {
        C162457s7.A0J(view, 1);
        WaTextView waTextView = (WaTextView) C18290x4.A0M(view, R.id.title);
        this.A00 = waTextView;
        C107295b4.A06(view, true);
        C106905aM.A04(waTextView);
    }

    public void BNe(AnonymousClass64P r4) {
        int i;
        int i2 = ((C112115jD) r4).A00;
        if (i2 != 0) {
            i = R.string.f11nameremoved;
            if (i2 != 1) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        this.A00.setText(i);
    }
}
