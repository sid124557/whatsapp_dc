package X;

import android.view.View;
import java.io.File;

/* renamed from: X.1sb  reason: invalid class name and case insensitive filesystem */
public final class C33191sb extends C109665ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass1U0 A02;
    public final /* synthetic */ AnonymousClass39M A03;

    public C33191sb(AnonymousClass1U0 r1, AnonymousClass39M r2, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public void A07(View view) {
        AnonymousClass1U0 r1 = this.A02;
        AnonymousClass4BP r3 = r1.A05;
        AnonymousClass39M r2 = this.A03;
        if (!r2.A0J && r2.A09 == null) {
            C56352rq r12 = r1.A03;
            String str = r2.A0D;
            if (str == null) {
                str = "";
            }
            File A022 = r12.A02(str);
            r2 = r2.A03();
            AnonymousClass39M.A01(r2, A022);
        }
        r3.Bci(r2, Integer.valueOf(this.A01), this.A00);
    }
}
