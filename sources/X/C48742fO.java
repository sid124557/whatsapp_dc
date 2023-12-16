package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fO  reason: invalid class name and case insensitive filesystem */
public class C48742fO {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C48742fO r7 = (C48742fO) obj;
            return this.A00 == r7.A00 && this.A01 == r7.A01;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass0x2.A00(this.A00 * 31, this.A01);
    }

    public C48742fO(int i, long j) {
        this.A00 = i;
        if (i != 0 || j == 0) {
            this.A01 = j;
        } else {
            Log.e("GrowthLock Nonzero expiration for unlocked GrowthLock");
        }
    }
}
