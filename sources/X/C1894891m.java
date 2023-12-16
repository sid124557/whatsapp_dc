package X;

import java.util.Enumeration;

/* renamed from: X.91m  reason: invalid class name and case insensitive filesystem */
public class C1894891m implements Enumeration {
    public int A00;
    public Object A01;
    public final int A02;

    public C1894891m(C176658dM r2, int i) {
        this.A02 = i;
        this.A01 = r2;
        this.A00 = 0;
    }

    public boolean hasMoreElements() {
        int i = this.A02;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                if (i2 < ((C176958dq) obj).A00.length) {
                    return true;
                }
                return false;
            case 1:
                if (i2 < ((C176998du) obj).A01.length) {
                    return true;
                }
                return false;
            case 2:
                if (i2 < ((C176778dY) obj).A00.length) {
                    return true;
                }
                return false;
            default:
                if (i2 < ((C176658dM) obj).A00.length) {
                    return true;
                }
                return false;
        }
    }

    public Object nextElement() {
        switch (this.A02) {
            case 0:
                int i = this.A00;
                C183618qL[] r1 = ((C176958dq) this.A01).A00;
                if (i < r1.length) {
                    this.A00 = i + 1;
                    return r1[i];
                }
                throw AnonymousClass6CA.A0c();
            case 1:
                int i2 = this.A00;
                C183618qL[] r12 = ((C176998du) this.A01).A01;
                if (i2 < r12.length) {
                    this.A00 = i2 + 1;
                    return r12[i2];
                }
                throw AnonymousClass6CA.A0c();
            case 2:
                int i3 = this.A00;
                byte[] bArr = ((C176778dY) this.A01).A00;
                int length = bArr.length;
                if (i3 < length) {
                    int min = Math.min(length - i3, 1000);
                    byte[] bArr2 = new byte[min];
                    System.arraycopy(bArr, i3, bArr2, 0, min);
                    this.A00 += min;
                    return new C176648dL(bArr2);
                }
                throw AnonymousClass6CA.A0c();
            default:
                int i4 = this.A00;
                C176778dY[] r13 = ((C176658dM) this.A01).A00;
                if (i4 < r13.length) {
                    this.A00 = i4 + 1;
                    return r13[i4];
                }
                throw AnonymousClass6CA.A0c();
        }
    }

    public C1894891m(C176998du r2) {
        this.A02 = 1;
        this.A01 = r2;
        this.A00 = 0;
    }

    public C1894891m(C176958dq r2) {
        this.A02 = 0;
        this.A01 = r2;
        this.A00 = 0;
    }
}
