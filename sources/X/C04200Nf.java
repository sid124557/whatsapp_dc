package X;

import android.util.Base64;
import java.util.List;

/* renamed from: X.0Nf  reason: invalid class name and case insensitive filesystem */
public final class C04200Nf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C04200Nf(String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        list.getClass();
        this.A04 = list;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        this.A00 = AnonymousClass000.A0U(str2, "-", str3, sb);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("FontRequest {mProviderAuthority: ");
        A0o2.append(this.A01);
        A0o2.append(", mProviderPackage: ");
        A0o2.append(this.A02);
        A0o2.append(", mQuery: ");
        A0o2.append(this.A03);
        A0o2.append(", mCertificates:");
        AnonymousClass000.A1B(A0o2, A0o);
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                A0o.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    A0o.append(" \"");
                    A0o.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    A0o.append("\"");
                }
                A0o.append(" ]");
                i++;
            } else {
                A0o.append("}");
                return AnonymousClass000.A0X(AnonymousClass000.A0Y("mCertificatesArray: ", AnonymousClass001.A0o(), 0), A0o);
            }
        }
    }
}
