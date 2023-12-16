package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Cz  reason: invalid class name and case insensitive filesystem */
public final class C64313Cz implements AnonymousClass4FP {
    public final List A00;

    public void Awm(C30331mH r1) {
    }

    public /* bridge */ /* synthetic */ C117025rG B4J(String str) {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C162457s7.A0P(((AnonymousClass1Hp) obj).A02, str)) {
                break;
            }
        }
        return (C117025rG) obj;
    }

    public Iterator B4K() {
        C129586aY copyOf = C129586aY.copyOf((Collection) this.A00);
        C162457s7.A0D(copyOf);
        C172878Nf it = copyOf.iterator();
        C162457s7.A0D(it);
        return it;
    }

    public int B4L() {
        return this.A00.size();
    }

    public int BBt() {
        C129586aY copyOf = C129586aY.copyOf((Collection) this.A00);
        C162457s7.A0D(copyOf);
        Iterator it = copyOf.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((AnonymousClass1Hp) it.next()).A00;
        }
        return (int) j;
    }

    public String BBu(C95814uZ r5, long j) {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AnonymousClass1Hp) obj).A01) {
                break;
            }
        }
        AnonymousClass1Hp r1 = (AnonymousClass1Hp) obj;
        if (r1 != null) {
            return r1.A02;
        }
        return null;
    }

    public C64313Cz(List list) {
        this.A00 = list;
    }

    public AnonymousClass4FP B0T() {
        return this;
    }

    public Collection B4S() {
        return AnonymousClass001.A0s();
    }

    public void BjZ(C30331mH r1, C30331mH r2, boolean z) {
    }
}
