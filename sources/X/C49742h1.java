package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.2h1  reason: invalid class name and case insensitive filesystem */
public final class C49742h1 {
    public int A00;
    public long A01;
    public String A02;
    public String A03;
    public byte[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AnonymousClass001.A1a(obj, C49742h1.class)) {
                return false;
            }
            C49742h1 r7 = (C49742h1) obj;
            if (this.A01 != r7.A01 || this.A00 != r7.A00 || !TextUtils.equals(this.A03, r7.A03) || !Arrays.equals(this.A04, r7.A04) || !TextUtils.equals(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public C49742h1(String str, String str2, byte[] bArr, int i, long j) {
        this.A03 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A01 = j;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C162457s7.A0D(copyOf);
        this.A04 = copyOf;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = this.A03;
        return Objects.hash(A0L);
    }
}
