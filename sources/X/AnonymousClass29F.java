package X;

import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.29F  reason: invalid class name */
public final class AnonymousClass29F {
    public static /* synthetic */ void A00(C009707r r5, Toolbar toolbar, C620733j r7, CharSequence charSequence) {
        int A00 = AnonymousClass34K.A00(C18290x4.A0F(toolbar));
        AnonymousClass43N r3 = new AnonymousClass43N(r5);
        C162457s7.A0J(charSequence, 3);
        toolbar.setTitle(charSequence);
        toolbar.setBackgroundResource(A00);
        toolbar.A0J(r5, R.style.f12nameremoved);
        toolbar.setNavigationIcon((Drawable) AnonymousClass0x7.A0J(toolbar.getContext(), r7, R.drawable.ic_back));
        toolbar.setNavigationOnClickListener(new C109395eY(r3, 28));
        toolbar.setNavigationContentDescription((int) R.string.f11nameremoved);
        Window window = r5.getWindow();
        window.clearFlags(67108864);
        window.setStatusBarColor(AnonymousClass0Y8.A04(r5, A00));
        r5.setTitle(charSequence);
        r5.setSupportActionBar(toolbar);
    }
}
