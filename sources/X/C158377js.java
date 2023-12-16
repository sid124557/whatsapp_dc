package X;

import java.util.List;

/* renamed from: X.7js  reason: invalid class name and case insensitive filesystem */
public final class C158377js {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158377js) {
                C158377js r5 = (C158377js) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A01) * 31) + C18310x6.A07(this.A00);
    }

    public C158377js(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchSuggestion(suggestedSearches=");
        A0o.append(this.A01);
        A0o.append(", popularSearches=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C158377js() {
        this((List) null, (List) null);
    }
}
