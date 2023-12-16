package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1ih  reason: invalid class name and case insensitive filesystem */
public class C29361ih extends C29451iq {
    public final AnonymousClass2MF A00;

    public C29361ih(AnonymousClass2MF r1) {
        this.A00 = r1;
    }

    public void A08() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((C56872sh) A03.next()).A01();
        }
    }

    /* renamed from: A09 */
    public void A06(C56872sh r7) {
        super.A06(r7);
        HashMap hashMap = new HashMap(this.A00.A01);
        Iterator A11 = C18290x4.A11(hashMap);
        while (A11.hasNext()) {
            String A0m = AnonymousClass001.A0m(A11);
            int A0K = AnonymousClass001.A0K(hashMap.get(A0m));
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                C56872sh r0 = (C56872sh) A03.next();
                r0.toString();
                r0.A0D(A0m, A0K);
            }
        }
    }
}
