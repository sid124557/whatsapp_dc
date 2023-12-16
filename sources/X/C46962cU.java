package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2cU  reason: invalid class name and case insensitive filesystem */
public class C46962cU {
    public final C55682qk A00;
    public final AnonymousClass33p A01;
    public final C42232Nh A02 = new C42232Nh();
    public final C55272q5 A03;
    public final C72303dV A04;
    public final C56082rO A05;
    public final Map A06 = Collections.synchronizedMap(new C174218Tk(200));

    public void A00() {
        C42232Nh r2 = this.A02;
        synchronized (r2) {
            Iterator A0v = AnonymousClass001.A0v(r2.A02);
            if (A0v.hasNext()) {
                A0v.next();
                throw AnonymousClass001.A0g("count");
            }
        }
    }

    public C46962cU(C55682qk r3, AnonymousClass33p r4, C55272q5 r5, C72303dV r6, C56082rO r7) {
        this.A00 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r4;
        this.A03 = r5;
    }
}
