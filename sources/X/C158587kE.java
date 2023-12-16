package X;

import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.7kE  reason: invalid class name and case insensitive filesystem */
public final class C158587kE {
    public final AnonymousClass7J9 A00;
    public final AnonymousClass36K A01;
    public final C35721xK A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158587kE) {
                C158587kE r5 = (C158587kE) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A03, C18300x5.A04(this.A00)) + C18270x1.A00(this.A05);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("\n        |---- Request Info ------------------------------\n        |IqId: ");
        A0o.append(this.A03);
        A0o.append("\n        |persistedId: ");
        A0o.append(this.A05);
        A0o.append("\n        |operationName: ");
        A0o.append(this.A00.A02);
        A0o.append("");
        return C830345w.A09(AnonymousClass000.A0X("\n        |------------------------------------------------\n      ", A0o));
    }

    public C158587kE(AnonymousClass7J9 r5, String str, String str2) {
        C18260x0.A0Q(r5, str);
        this.A00 = r5;
        this.A03 = str;
        this.A05 = str2;
        AnonymousClass13M r2 = r5.A00.A00;
        TreeMap treeMap = new TreeMap();
        r2.A04(r2.A00, treeMap);
        JSONObject jSONObject = new JSONObject(treeMap);
        String str3 = str2;
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("queryId", str2 == null ? "" : str3);
        A1G.put("variables", jSONObject);
        C35721xK r0 = new C35721xK(new C35381wm(str, 23), str2, C18290x4.A0o(A1G));
        this.A02 = r0;
        AnonymousClass36K r02 = r0.A00;
        C162457s7.A0D(r02);
        this.A01 = r02;
        String str4 = r5.A02;
        C162457s7.A0D(str4);
        this.A04 = str4;
    }

    public C158587kE() {
        this(C1458177k.A00, "", (String) null);
    }
}
