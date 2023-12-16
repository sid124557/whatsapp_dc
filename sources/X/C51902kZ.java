package X;

import java.util.Set;

/* renamed from: X.2kZ  reason: invalid class name and case insensitive filesystem */
public final class C51902kZ {
    public final String A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51902kZ) {
                C51902kZ r5 = (C51902kZ) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18270x1.A00(this.A00) * 31);
    }

    public C51902kZ(String str, Set set) {
        this.A00 = str;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BlockListData(dHash=");
        A0o.append(this.A00);
        A0o.append(", blockList=");
        return C18260x0.A04(this.A01, A0o);
    }
}
