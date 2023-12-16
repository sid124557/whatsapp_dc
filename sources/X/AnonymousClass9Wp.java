package X;

import java.util.List;

/* renamed from: X.9Wp  reason: invalid class name */
public class AnonymousClass9Wp implements C202439m1 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass9Wp(C133736hr r1, AnonymousClass9OJ r2, String str, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = str;
    }

    public final void BMJ(List list) {
        boolean z;
        int i = this.A03;
        AnonymousClass9OJ r0 = (AnonymousClass9OJ) this.A00;
        C133736hr r3 = (C133736hr) this.A01;
        String str = this.A02;
        if (i != 0) {
            z = false;
        } else {
            z = true;
        }
        r0.A01.A7D(r0.A00, r3, str, (List) null, z);
    }
}
