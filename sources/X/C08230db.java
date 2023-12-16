package X;

import java.util.ArrayList;

/* renamed from: X.0db  reason: invalid class name and case insensitive filesystem */
public class C08230db implements C15880s7 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ C08270df A03;

    public C08230db(C08270df r1, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean B3h(ArrayList arrayList, ArrayList arrayList2) {
        C08270df r2 = this.A03;
        C08310eF r1 = r2.A06;
        if (r1 != null && this.A01 < 0 && this.A02 == null && r1.A0T().A0z((String) null)) {
            return false;
        }
        return r2.A10(this.A02, arrayList, arrayList2, this.A01, this.A00);
    }
}
