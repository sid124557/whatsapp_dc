package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0Th  reason: invalid class name and case insensitive filesystem */
public class C05430Th {
    public C15580rb A00;
    public C15590rc A01;
    public final Context A02;
    public final View A03;
    public final C07890cz A04;
    public final AnonymousClass0QK A05;

    public void A00() {
        if (!this.A05.A03()) {
            throw AnonymousClass001.A0e("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public C05430Th(Context context, View view, int i, int i2, int i3) {
        this.A02 = context;
        this.A03 = view;
        C07890cz r5 = new C07890cz(context);
        this.A04 = r5;
        r5.A0D(new AnonymousClass0b1(this));
        AnonymousClass0QK r2 = new AnonymousClass0QK(context, view, r5, i2, i3, false);
        this.A05 = r2;
        r2.A00 = i;
        r2.A02 = new C17970wX(this, 1);
    }
}
