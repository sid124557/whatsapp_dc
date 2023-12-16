package X;

import android.content.Context;
import android.util.TypedValue;
import com.whatsapp.R;

/* renamed from: X.1NJ  reason: invalid class name */
public final class AnonymousClass1NJ extends AnonymousClass1NN {
    public AnonymousClass1NJ(Context context) {
        super(context);
        setBackground(AnonymousClass0RP.A00(context, R.drawable.event_rounded_border));
        C107555bV.A06(this, getWhatsAppLocale(), 0, 0, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843868, typedValue, true);
        this.A06.setBackgroundResource(typedValue.resourceId);
    }
}
