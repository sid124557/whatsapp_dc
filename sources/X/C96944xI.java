package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4xI  reason: invalid class name and case insensitive filesystem */
public final class C96944xI extends C125676Iy {
    public C179588jO A00;
    public final WaTextView A01;
    public final WaTextView A02;

    public void A07(C1452374s r3) {
        WaTextView waTextView;
        int i;
        C162457s7.A0J(r3, 0);
        if (r3 instanceof C136846nM) {
            waTextView = this.A02;
            i = R.string.f11nameremoved;
        } else if (r3 instanceof C136876nP) {
            waTextView = this.A02;
            i = R.string.f11nameremoved;
        } else {
            if (r3 instanceof C136866nO) {
                this.A02.setText(R.string.f11nameremoved);
                WaTextView waTextView2 = this.A01;
                C162457s7.A0C(waTextView2);
                waTextView2.setVisibility(8);
            }
            C18310x6.A19(this.A0H, this, r3, 42);
        }
        waTextView.setText(i);
        C18310x6.A19(this.A0H, this, r3, 42);
    }

    public C96944xI(View view, C179588jO r3) {
        super(view);
        this.A00 = r3;
        this.A02 = C86644Kx.A0O(view, R.id.title);
        this.A01 = C86644Kx.A0O(view, R.id.cta_line);
    }
}
