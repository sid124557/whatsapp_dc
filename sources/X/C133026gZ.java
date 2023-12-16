package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6gZ  reason: invalid class name and case insensitive filesystem */
public final class C133026gZ extends AnonymousClass7DR {
    public final List A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C133026gZ) {
                C133026gZ r5 = (C133026gZ) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133026gZ(List list, Map map) {
        super(list);
        C18260x0.A0Q(list, map);
        this.A00 = list;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CategoryGroupsWithChildItems(catalogCategoryGroups=");
        A0o.append(this.A00);
        A0o.append(", parentCategoryToChildItemMap=");
        return C18260x0.A04(this.A01, A0o);
    }
}
