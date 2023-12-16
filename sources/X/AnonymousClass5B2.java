package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.5B2  reason: invalid class name */
public final class AnonymousClass5B2 {
    public static final void A00(View view, C08310eF r10, AnonymousClass4GP r11) {
        TextView A09 = AnonymousClass002.A09(view, R.id.galleryPermissionsInfoText);
        if (A09 != null) {
            String string = C08310eF.A09(r10).getString(R.string.f11nameremoved);
            C162457s7.A0D(string);
            String string2 = C08310eF.A09(r10).getString(R.string.f11nameremoved);
            C162457s7.A0D(string2);
            String A0n = AnonymousClass0x7.A0n(r10, string2, C18310x6.A1b(string, 0), 1, R.string.f11nameremoved);
            C162457s7.A0D(A0n);
            int A0G = C175728Zm.A0G(A0n, string, 0, false);
            int A0G2 = C175728Zm.A0G(A0n, string2, 0, false);
            SpannableStringBuilder A00 = C18330xA.A00(A0n);
            A00.setSpan(new StyleSpan(1), A0G, C86664Kz.A0L(string, A0G), 33);
            A00.setSpan(new StyleSpan(1), A0G2, C86664Kz.A0L(string2, A0G2), 33);
            A09.setText(A00);
            A09.requestLayout();
            View findViewById = view.findViewById(R.id.galleryPermisionsDeniedButton);
            if (findViewById != null) {
                C18310x6.A19(findViewById, r11, r10, 10);
            }
        }
    }
}
