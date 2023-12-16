package X;

import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.4mY  reason: invalid class name and case insensitive filesystem */
public final class C92364mY extends AnonymousClass4Z0 {
    public C92364mY(CardView cardView) {
        super(cardView);
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        cardView.setLayoutParams(layoutParams);
        cardView.setRadius(C86664Kz.A01(C18290x4.A0G(cardView), R.dimen.f6nameremoved));
    }
}
