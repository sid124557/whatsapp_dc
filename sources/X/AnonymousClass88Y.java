package X;

import android.content.Context;

/* renamed from: X.88Y  reason: invalid class name */
public final class AnonymousClass88Y implements C180778lc {
    public final Context A00;
    public final C180778lc A01;

    public AnonymousClass88Y(Context context, String str) {
        AnonymousClass88X r1 = new AnonymousClass88X();
        r1.A00 = str;
        this.A00 = context.getApplicationContext();
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ C187668xc B0Y() {
        return new C1691488e(this.A00, this.A01.B0Y());
    }

    public AnonymousClass88Y(Context context) {
        AnonymousClass88X r1 = new AnonymousClass88X();
        r1.A00 = null;
        this.A00 = context.getApplicationContext();
        this.A01 = r1;
    }
}
