package X;

/* renamed from: X.0vk  reason: invalid class name and case insensitive filesystem */
public class C17540vk extends AnonymousClass0UU {
    public Object A00;
    public final int A01;

    public C17540vk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A01() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            return ((C13570nO) obj).A00;
        }
        return ((C06290Wz) obj).A00;
    }

    public int A02(Object obj) {
        if (this.A01 == 0) {
            return ((C06290Wz) this.A00).A04(obj);
        }
        C13570nO r1 = (C13570nO) this.A00;
        if (obj == null) {
            return r1.A01();
        }
        return r1.A02(obj, obj.hashCode());
    }

    public Object A03(int i, int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            return ((C13570nO) obj).A03[i];
        }
        return ((C06290Wz) obj).A02[(i << 1) + i2];
    }

    public void A04() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C13570nO) obj).clear();
        } else {
            ((C06290Wz) obj).clear();
        }
    }

    public void A05(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((C13570nO) obj).A03(i);
        } else {
            ((C06290Wz) obj).A07(i);
        }
    }
}
