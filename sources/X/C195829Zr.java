package X;

/* renamed from: X.9Zr  reason: invalid class name and case insensitive filesystem */
public class C195829Zr implements C183818qi {
    public int A00;
    public int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C195829Zr r5 = (C195829Zr) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C195829Zr(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean B1Q() {
        return true;
    }

    public AnonymousClass22N BDx() {
        return AnonymousClass22N.INPUT_ROTATION;
    }
}
