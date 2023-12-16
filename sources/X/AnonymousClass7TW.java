package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7TW  reason: invalid class name */
public final class AnonymousClass7TW {
    public int A00 = 1;
    public String A01 = "";
    public final TextView A02;
    public final C620733j A03;

    public AnonymousClass7TW(TextView textView, C620733j r4) {
        C18270x1.A10(r4, 1, textView);
        this.A03 = r4;
        this.A02 = textView;
    }

    public final void A00(String str, boolean z) {
        TextView textView = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        C620733j r5 = this.A03;
        boolean A0U = r5.A0U();
        boolean A1T = AnonymousClass001.A1T(this.A00);
        if (A0U) {
            A0o.append(8207);
        }
        A0o.append(C107555bV.A02(this.A01));
        if (A1T) {
            A0o.append(C107555bV.A01(r5, ": "));
            A0o.append(C107555bV.A02(str));
        }
        if (!z && A1T) {
            Context A0F = C18290x4.A0F(textView);
            A0o.append(C107555bV.A01(r5, " • "));
            A0o.append(A0F.getString(R.string.f11nameremoved));
        }
        textView.setText(C18290x4.A0o(A0o));
    }
}
