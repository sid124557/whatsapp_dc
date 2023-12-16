package X;

import android.widget.TextView;

/* renamed from: X.4fp  reason: invalid class name and case insensitive filesystem */
public class C90094fp extends C111265ho {
    public final AnonymousClass1VX A00;

    public C90094fp(AnonymousClass4Pc r1, C90064fm r2, AnonymousClass5HH r3, AnonymousClass1VX r4, AnonymousClass4FS r5) {
        super(r1, r2, r3, r4, r5);
        this.A00 = r4;
    }

    public void A02(AnonymousClass5K6 r4, AnonymousClass5K7 r5, C833748d r6) {
        AnonymousClass2TD r0;
        super.A02(r4, r5, r6);
        if (r6 != null && (r0 = ((AnonymousClass3YL) r6).A07) != null) {
            String str = r0.A06;
            if (str == null || str.isEmpty()) {
                r5.A05.setVisibility(8);
                return;
            }
            TextView textView = r5.A05;
            textView.setText(str);
            textView.setTextDirection(5);
        }
    }
}
