package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1On  reason: invalid class name */
public class AnonymousClass1On extends C56822sc {
    public AnonymousClass2HU A00;
    public final C65203Gp A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final ArrayList A04 = AnonymousClass001.A0s();

    public final void A0D(String str, boolean z) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C53232ml r1 = ((AnonymousClass2HV) it.next()).A00;
            C162457s7.A0J(str, 1);
            C85064Eu r0 = (C85064Eu) r1.A04.get(str);
            if (r0 != null) {
                r0.BLm(z);
            }
        }
    }

    public AnonymousClass1On(C65203Gp r2, C56612sH r3, C623934v r4, AnonymousClass1VX r5) {
        super(r4);
        this.A02 = r3;
        this.A03 = r5;
        this.A01 = r2;
    }
}
