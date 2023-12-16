package X;

import java.util.List;

/* renamed from: X.4wI  reason: invalid class name and case insensitive filesystem */
public final class C96394wI extends C136186lz {
    public final List A00;
    public final AnonymousClass4GQ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96394wI) {
                C96394wI r5 = (C96394wI) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A00, 0));
    }

    public C96394wI(List list, AnonymousClass4GQ r3) {
        super(51);
        this.A00 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SuggestedSearchListItemData(suggestionType=");
        A0o.append(0);
        A0o.append(", suggestedSearch=");
        A0o.append(this.A00);
        A0o.append(", clickListener=");
        return C18260x0.A04(this.A01, A0o);
    }
}
