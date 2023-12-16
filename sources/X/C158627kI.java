package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7kI  reason: invalid class name and case insensitive filesystem */
public class C158627kI {
    public static final AnonymousClass8RU A0A = new AnonymousClass8RU();
    public int A00 = 0;
    public final AnonymousClass7TV A01;
    public final C151637Vo A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final HashMap A06 = AnonymousClass001.A0t();
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public Object A00() {
        C151637Vo r3 = this.A02;
        if (!r3.A00.A06()) {
            return this.A05;
        }
        if (this.A00 != 0) {
            C187038wL r0 = this.A01.A00;
            Object obj = this.A05;
            int BJg = r0.BJg(obj);
            if (BJg <= 0) {
                return null;
            }
            return ((List) obj).get(BJg - 1);
        } else if (this.A09) {
            return null;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "No results for path: ", r3);
            throw new C131276dK(A0o.toString());
        }
    }

    public void A02(C172478Lh r5, Object obj, String str) {
        if (this.A08) {
            this.A07.add(r5);
        }
        AnonymousClass7TV r3 = this.A01;
        C187038wL r2 = r3.A00;
        r2.Bli(this.A05, this.A00, obj);
        r2.Bli(this.A03, this.A00, str);
        this.A00++;
        Collection collection = r3.A02;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("resultFound");
            }
        }
    }

    public C158627kI(AnonymousClass7TV r3, C151637Vo r4, Object obj, boolean z) {
        C160947oi.A03(obj, "root can not be null");
        C160947oi.A03(r3, "configuration can not be null");
        this.A08 = z;
        this.A02 = r4;
        this.A04 = obj;
        this.A01 = r3;
        C153467bN r1 = ((C170598Du) r3.A00).A00;
        this.A05 = r1.A01();
        this.A03 = r1.A01();
        this.A07 = AnonymousClass001.A0s();
        this.A09 = r3.A03.contains(C141926wM.SUPPRESS_EXCEPTIONS);
    }

    public List A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A00 > 0) {
            Iterator it = this.A01.A00.Bqo(this.A03).iterator();
            while (it.hasNext()) {
                C18310x6.A1R(A0s, it);
            }
        }
        return A0s;
    }
}
