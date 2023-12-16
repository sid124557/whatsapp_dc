package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.54m  reason: invalid class name and case insensitive filesystem */
public class C991154m extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final AnonymousClass5Y0 A01;
    public final C27991fJ A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A0U(this.A02, -1, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) this.A03.get();
        if (textView != null && textView.getTag().equals(this.A02)) {
            textView.setText(C107345b9.A05(textView.getContext(), this.A01, str));
        }
    }

    public C991154m(TextView textView, AnonymousClass5ZU r3, AnonymousClass5Y0 r4, C27991fJ r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass0x9.A14(textView);
    }
}
