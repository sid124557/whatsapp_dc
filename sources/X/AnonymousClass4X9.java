package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.4X9  reason: invalid class name */
public abstract class AnonymousClass4X9 extends AnonymousClass0R6 {
    public static final CardView A00(View view, ViewGroup viewGroup) {
        View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) inflate;
        cardView.addView(view);
        return cardView;
    }
}
