package X;

/* renamed from: X.0dD  reason: invalid class name and case insensitive filesystem */
public class C08030dD implements C16600tf {
    public int A00;
    public final Object[] A01;

    public boolean Bio(Object obj) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i >= i2) {
                Object[] objArr = this.A01;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.A00 = i2 + 1;
                return true;
            } else if (this.A01[i] == obj) {
                throw AnonymousClass001.A0e("Already in the pool!");
            } else {
                i++;
            }
        }
    }

    public Object AwG() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.A00 = i2;
        return obj;
    }

    public C08030dD(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw AnonymousClass001.A0c("The max pool size must be > 0");
    }
}
