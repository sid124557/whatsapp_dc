package X;

/* renamed from: X.11W  reason: invalid class name */
public class AnonymousClass11W extends AnonymousClass0QO {
    public final /* synthetic */ C129586aY A00;
    public final /* synthetic */ C129586aY A01;
    public final /* synthetic */ AnonymousClass2R1 A02;

    public AnonymousClass11W(C129586aY r1, C129586aY r2, AnonymousClass2R1 r3) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public Object A02(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    public boolean A03(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.A02.A02.A00.A00(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i, int i2) {
        Object obj = this.A01.get(i);
        Object obj2 = this.A00.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return this.A02.A02.A00.A01(obj, obj2);
            }
            return false;
        } else if (obj2 != null) {
            return false;
        } else {
            return true;
        }
    }
}
