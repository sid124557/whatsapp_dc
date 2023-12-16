package X;

import com.whatsapp.R;

/* renamed from: X.5t3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118135t3 implements AnonymousClass4GQ {
    public final /* synthetic */ C90514ha A00;
    public final /* synthetic */ String A01;

    public final Object invoke(Object obj) {
        C90514ha r4 = this.A00;
        String str = this.A01;
        C52332lJ r6 = (C52332lJ) obj;
        if (r6 == null) {
            C49732h0 r2 = r4.A0h;
            r2.A01(new AnonymousClass43X(r2, AnonymousClass000.A1W(r4.A0V)));
        }
        r4.A0Y.A09(new AnonymousClass7PB(r6, r4.A0r, Integer.valueOf(r4.getIntent().getIntExtra("thumb_width", AnonymousClass4L0.A01(r4.getResources(), R.dimen.f6nameremoved))), Integer.valueOf(r4.getIntent().getIntExtra("thumb_height", AnonymousClass4L0.A01(r4.getResources(), R.dimen.f6nameremoved))), str, r4.A0X.A02, false));
        return null;
    }

    public /* synthetic */ C118135t3(C90514ha r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
