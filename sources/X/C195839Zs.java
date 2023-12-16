package X;

/* renamed from: X.9Zs  reason: invalid class name and case insensitive filesystem */
public class C195839Zs implements C183818qi {
    public float A00;
    public int A01;
    public int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C195839Zs r5 = (C195839Zs) obj;
            if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + ((int) this.A00);
    }

    public C195839Zs(int i, int i2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public boolean B1Q() {
        return true;
    }

    public AnonymousClass22N BDx() {
        return AnonymousClass22N.PREVIEW_VIEW_SIZE;
    }
}
