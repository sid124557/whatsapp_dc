package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9jS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201059jS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1902094n A02;

    public final void run() {
        AnonymousClass9QE r2;
        C1902094n r6 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass8EA r22 = r6.A0C;
        C624034w r1 = r6.A07;
        C166587yw A08 = r22.A08(r1.A0H);
        r6.A05 = A08;
        if (A08 == null) {
            r2 = new AnonymousClass9QE(3);
            Context context = r6.A04.A00;
            r2.A08 = context.getString(R.string.f11nameremoved);
            r2.A07 = context.getString(i);
        } else {
            r2 = new AnonymousClass9QE(i2);
            r2.A03 = r1;
        }
        r6.A09.A0G(r2);
    }

    public /* synthetic */ C201059jS(C1902094n r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
