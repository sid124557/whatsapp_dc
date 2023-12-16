package X;

import java.util.List;

/* renamed from: X.6H9  reason: invalid class name */
public class AnonymousClass6H9 extends AnonymousClass0QO {
    public final /* synthetic */ C125336Hk A00;
    public final /* synthetic */ List A01;

    public AnonymousClass6H9(C125336Hk r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public int A00() {
        return this.A00.A03.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C151627Vn r3 = (C151627Vn) this.A01.get(i);
        C151627Vn r2 = (C151627Vn) this.A00.A03.get(i2);
        C162457s7.A0J(r2, 0);
        if (!C04880Ra.A01(r3.A01, r2.A01) || r3.A00.A00 != r2.A00.A00) {
            return false;
        }
        return true;
    }

    public boolean A04(int i, int i2) {
        return AnonymousClass000.A1T((((long) ((C151627Vn) this.A01.get(i)).A01.A02) > ((long) ((C151627Vn) this.A00.A03.get(i2)).A01.A02) ? 1 : (((long) ((C151627Vn) this.A01.get(i)).A01.A02) == ((long) ((C151627Vn) this.A00.A03.get(i2)).A01.A02) ? 0 : -1)));
    }
}
