package X;

import android.view.View;

/* renamed from: X.0Uh  reason: invalid class name and case insensitive filesystem */
public class C05640Uh {
    public static final AnonymousClass0XY A01 = new C05290St().A00.A00().A00.A06().A00.A07().A00.A08();
    public final AnonymousClass0XY A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05640Uh)) {
            return false;
        }
        C05640Uh r4 = (C05640Uh) obj;
        return A0I() == r4.A0I() && A0A() == r4.A0A() && C04880Ra.A01(A0B(), r4.A0B()) && C04880Ra.A01(A02(), r4.A02()) && C04880Ra.A01(A05(), r4.A05());
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass001.A1R(objArr, A0I());
        AnonymousClass000.A1R(objArr, A0A());
        objArr[2] = A0B();
        objArr[3] = A02();
        objArr[4] = A05();
        return C04880Ra.A00(objArr);
    }

    public AnonymousClass0XU A02() {
        return AnonymousClass0XU.A04;
    }

    public AnonymousClass0UQ A05() {
        return null;
    }

    public AnonymousClass0XY A06() {
        return this.A00;
    }

    public AnonymousClass0XY A07() {
        return this.A00;
    }

    public AnonymousClass0XY A08() {
        return this.A00;
    }

    public boolean A0A() {
        return false;
    }

    public AnonymousClass0XU A0B() {
        return AnonymousClass0XU.A04;
    }

    public AnonymousClass0XU A0D(int i) {
        if ((i & 8) == 0) {
            return AnonymousClass0XU.A04;
        }
        throw AnonymousClass001.A0c("Unable to query the maximum insets for IME");
    }

    public boolean A0I() {
        return false;
    }

    public C05640Uh(AnonymousClass0XY r1) {
        this.A00 = r1;
    }

    public AnonymousClass0XU A01() {
        return A0B();
    }

    public AnonymousClass0XU A03() {
        return A0B();
    }

    public AnonymousClass0XU A04() {
        return A0B();
    }

    public void A09(AnonymousClass0XU r1) {
    }

    public AnonymousClass0XU A0C(int i) {
        return AnonymousClass0XU.A04;
    }

    public void A0F(View view) {
    }

    public void A0G(AnonymousClass0XY r1) {
    }

    public void A0H(AnonymousClass0XU[] r1) {
    }

    public AnonymousClass0XY A0E(int i, int i2, int i3, int i4) {
        return A01;
    }
}
