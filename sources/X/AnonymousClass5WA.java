package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;

/* renamed from: X.5WA  reason: invalid class name */
public final class AnonymousClass5WA {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass5WA(C195349Xk r5) {
        String A002 = AnonymousClass32L.A00();
        C162457s7.A0D(A002);
        this.A03 = A002;
        AnonymousClass9WL r2 = r5.A02;
        String str = "";
        if (r2.A02 == ARAssetType.EFFECT) {
            String A003 = C192519Kk.A00(r5);
            C162457s7.A0D(A003);
            this.A00 = A003;
            String str2 = r2.A0B;
            if (str2 != null) {
                str2 = r5.A0C ? Integer.toString(r5.hashCode()) : str2;
                C162457s7.A0H(str2);
            } else {
                str2 = str;
            }
            this.A01 = str2;
            String A022 = r5.A02();
            this.A02 = A022 != null ? C175738Zn.A0U(A022, "\"", str, false) : str;
            this.A04 = "AREffect";
            return;
        }
        this.A00 = str;
        this.A02 = str;
        this.A04 = str;
        this.A01 = str;
    }
}
