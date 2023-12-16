package X;

import android.view.View;

/* renamed from: X.07s  reason: invalid class name and case insensitive filesystem */
public class C009807s extends AnonymousClass0O3 {
    public final /* synthetic */ C08310eF A00;

    public C009807s(C08310eF r1) {
        this.A00 = r1;
    }

    public View A00(int i) {
        C08310eF r1 = this.A00;
        View view = r1.A0B;
        if (view != null) {
            return view.findViewById(i);
        }
        throw AnonymousClass000.A0I(" does not have a view", AnonymousClass000.A0j(r1));
    }

    public boolean A01() {
        return AnonymousClass000.A1W(this.A00.A0B);
    }
}
