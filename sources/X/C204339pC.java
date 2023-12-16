package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.9pC  reason: invalid class name and case insensitive filesystem */
public class C204339pC implements C181548mw {
    public Object A00;
    public final int A01;

    public C204339pC(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BP1() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            Context context = (Context) obj;
            Intent A07 = C18320x8.A07();
            A07.setClassName(context.getPackageName(), "com.whatsapp.registration.ChangeNumberOverview");
            context.startActivity(A07);
            return;
        }
        C89654ea r3 = (C89654ea) obj;
        Intent A072 = C18320x8.A07();
        A072.setClassName(r3.getPackageName(), "com.whatsapp.registration.ChangeNumberOverview");
        r3.A6T(A072, true);
    }
}
