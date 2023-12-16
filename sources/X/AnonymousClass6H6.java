package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6H6  reason: invalid class name */
public class AnonymousClass6H6 extends C05550Ty implements C85094Ex {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final Map A03 = C18320x8.A0r();

    public boolean A0D(int i) {
        Number number = (Number) this.A02.A07();
        if (number == null || number.intValue() != i) {
            return false;
        }
        return true;
    }

    public void BXY(C50612iT r4) {
        Map map = this.A03;
        String str = r4.A0G;
        C06270Wx r1 = (C06270Wx) map.get(str);
        if (r1 != null && r1.A07() != null) {
            r1.A0H(new C148307Hw(r4, str));
        }
    }

    public void BXZ(List list) {
        Map map = this.A03;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50612iT r0 = (C50612iT) it.next();
            String str = r0.A0G;
            map.put(str, new AnonymousClass08M(new C148307Hw(r0, str)));
        }
        this.A02.A0H(C18280x3.A0S());
    }

    public void BXa() {
        this.A02.A0H(C18290x4.A0a());
    }

    public void BXb(String str) {
        C06270Wx r2 = (C06270Wx) this.A03.get(str);
        if (r2 != null && r2.A07() != null) {
            r2.A0H(new C148307Hw((C50612iT) null, str));
        }
    }
}
