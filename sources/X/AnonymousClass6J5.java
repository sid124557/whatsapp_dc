package X;

import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.6J5  reason: invalid class name */
public abstract class AnonymousClass6J5 extends C05570Ua {
    public void A07(C147037Co r7) {
        if (this instanceof C132476fO) {
            ((C132476fO) this).A08();
        } else if (this instanceof C132446fL) {
            WaTextView waTextView = ((C132446fL) this).A00;
            waTextView.setText((CharSequence) null);
            waTextView.setContentDescription(waTextView.getContext().getString(R.string.f11nameremoved, AnonymousClass000.A1b((Object) null)));
        } else if (this instanceof C132466fN) {
            C132466fN r5 = (C132466fN) this;
            C132416fF r72 = (C132416fF) r7;
            Resources A0G = C18290x4.A0G(r5.A0H);
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = r72.A01;
            r5.A01.setText(A0G.getString(R.string.f11nameremoved, A0L));
            r5.A00.setText(r72.A00);
        } else if (this instanceof C132456fM) {
            ((C132456fM) this).A00.setVisibility(0);
        }
    }

    public AnonymousClass6J5(View view) {
        super(view);
    }
}
