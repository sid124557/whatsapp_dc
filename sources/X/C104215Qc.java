package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.5Qc  reason: invalid class name and case insensitive filesystem */
public class C104215Qc {
    public Bitmap A00;
    public AnonymousClass3ZH A01;
    public String A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C104215Qc) && this.A04 == ((C104215Qc) obj).A04;
        }
        return true;
    }

    public C104215Qc(String str, long j, String str2) {
        this.A06 = str;
        this.A04 = j;
        this.A05 = str2;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        C18280x3.A1S(A0L, this.A04);
        return Arrays.hashCode(A0L);
    }
}
