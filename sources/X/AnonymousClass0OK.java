package X;

import java.util.HashSet;

/* renamed from: X.0OK  reason: invalid class name */
public class AnonymousClass0OK {
    public final AnonymousClass0QU A00;
    public final AnonymousClass0QW A01;

    public void A00() {
        AnonymousClass0QW r2 = this.A01;
        AnonymousClass0QU r0 = this.A00;
        HashSet hashSet = r2.A06;
        if (hashSet.remove(r0) && hashSet.isEmpty()) {
            r2.A00();
        }
    }

    public boolean A01() {
        AnonymousClass0QW r1 = this.A01;
        AnonymousClass0GJ A012 = AnonymousClass0GJ.A01(r1.A04.A0B);
        AnonymousClass0GJ r12 = r1.A01;
        if (A012 == r12) {
            return true;
        }
        AnonymousClass0GJ r0 = AnonymousClass0GJ.VISIBLE;
        if (A012 == r0 || r12 == r0) {
            return false;
        }
        return true;
    }

    public AnonymousClass0OK(AnonymousClass0QU r1, AnonymousClass0QW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
