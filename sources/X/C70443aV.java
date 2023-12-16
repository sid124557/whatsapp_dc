package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3aV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70443aV implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ AnonymousClass6BH A01;
    public final /* synthetic */ AnonymousClass5ZQ A02;
    public final /* synthetic */ File A03;

    public final void run() {
        AnonymousClass6BH r5 = this.A01;
        File file = this.A03;
        double d = this.A00;
        AnonymousClass5ZQ r4 = this.A02;
        if (d == 0.0d) {
            d = 43.0d;
        }
        List A022 = AnonymousClass31P.A02(file, (int) d);
        ArrayList A0p = AnonymousClass000.A0p(A022);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            A0p.add(Float.valueOf(((float) C18300x5.A00(it)) / 100.0f));
        }
        ((C116635qb) r5.A00).A0F.A0S(new C70363aN(r5, A0p, r4, 29));
    }

    public /* synthetic */ C70443aV(AnonymousClass6BH r1, AnonymousClass5ZQ r2, File file, double d) {
        this.A01 = r1;
        this.A03 = file;
        this.A00 = d;
        this.A02 = r2;
    }
}
