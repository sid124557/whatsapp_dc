package X;

import android.view.View;
import java.io.File;

/* renamed from: X.39x  reason: invalid class name */
public final /* synthetic */ class AnonymousClass39x implements View.OnLongClickListener {
    public final /* synthetic */ C23481Tk A00;
    public final /* synthetic */ AnonymousClass1U0 A01;
    public final /* synthetic */ AnonymousClass39M A02;

    public final boolean onLongClick(View view) {
        AnonymousClass1U0 r1 = this.A01;
        AnonymousClass39M r4 = this.A02;
        C23481Tk r3 = this.A00;
        AnonymousClass4GR r2 = r1.A07;
        if (!r4.A0J && r4.A09 == null) {
            C56352rq r12 = r1.A03;
            String str = r4.A0D;
            if (str == null) {
                str = "";
            }
            File A022 = r12.A02(str);
            r4 = r4.A03();
            AnonymousClass39M.A01(r4, A022);
        }
        r2.invoke(r4, r3.A00);
        return true;
    }

    public /* synthetic */ AnonymousClass39x(C23481Tk r1, AnonymousClass1U0 r2, AnonymousClass39M r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
