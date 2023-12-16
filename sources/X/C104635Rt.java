package X;

import java.util.Arrays;

/* renamed from: X.5Rt  reason: invalid class name and case insensitive filesystem */
public class C104635Rt {
    public final long A00;
    public final long[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C104635Rt r7 = (C104635Rt) obj;
            if (this.A00 != r7.A00 || !Arrays.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(Long.valueOf(this.A00)) + Arrays.hashCode(this.A01);
    }

    public C104635Rt(long[] jArr, long j) {
        this.A00 = j;
        this.A01 = jArr;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Duration{staticDurationMillis=");
        A0o.append(this.A00);
        A0o.append(", repeatDurationMills=");
        A0o.append(Arrays.toString(this.A01));
        return AnonymousClass000.A0d(A0o);
    }
}
