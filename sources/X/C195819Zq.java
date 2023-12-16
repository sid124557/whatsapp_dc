package X;

/* renamed from: X.9Zq  reason: invalid class name and case insensitive filesystem */
public class C195819Zq implements C183818qi {
    public int A00;
    public int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C195819Zq r5 = (C195819Zq) obj;
            if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C195819Zq(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean B1Q() {
        return true;
    }

    public AnonymousClass22N BDx() {
        return AnonymousClass22N.INPUT_PREVIEW_SIZE;
    }
}
