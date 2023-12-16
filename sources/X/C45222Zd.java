package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Zd  reason: invalid class name and case insensitive filesystem */
public class C45222Zd {
    public int A00 = 0;
    public final C60442yZ A01;
    public final List A02;

    public String A00() {
        int size;
        StringBuilder A0o;
        String A0n;
        C60962zS A002;
        if (this.A00 != -1) {
            C60442yZ r3 = this.A01;
            C56312rm r1 = r3.A00;
            if (r1.A05()) {
                AnonymousClass1VX r2 = r1.A00;
                if (r2.A0Y(C58422vE.A01, 3641) && r2.A0Y(C58422vE.A02, 4074) && (A002 = r3.A00()) != null) {
                    this.A00 = -1;
                    A0o = AnonymousClass001.A0o();
                    A0o.append(C58172up.A0M);
                    C18290x4.A1R(A0o, A002.A03);
                    A0o.append(A002.A01);
                    return AnonymousClass000.A0X(C58172up.A0R, A0o);
                }
            }
            List list = this.A02;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
                int i = this.A00;
                if (i < size) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append(C58172up.A0M);
                    this.A00 = i + 1;
                    A0n = AnonymousClass001.A0n(list, i);
                    A0o.append(A0n);
                    return AnonymousClass000.A0X(C58172up.A0R, A0o);
                }
            }
            int i2 = this.A00;
            if (i2 == size) {
                this.A00 = i2 + 1;
                A0o = AnonymousClass001.A0o();
                A0o.append(C58172up.A0M);
                A0n = C58172up.A0Q;
                A0o.append(A0n);
                return AnonymousClass000.A0X(C58172up.A0R, A0o);
            }
        }
        return null;
    }

    public C45222Zd(C60442yZ r5, AnonymousClass5LI r6) {
        ArrayList arrayList;
        this.A01 = r5;
        if (r6 != null) {
            List<C47502dM> list = r6.A0A;
            if (!list.isEmpty()) {
                arrayList = AnonymousClass001.A0s();
                for (C47502dM r1 : list) {
                    Set set = r1.A0B;
                    if (set == null || !set.isEmpty()) {
                        String str = r1.A05;
                        if (str != null) {
                            arrayList.add(str);
                        }
                        String str2 = r1.A01;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
                this.A02 = arrayList;
            }
        }
        arrayList = null;
        this.A02 = arrayList;
    }
}
