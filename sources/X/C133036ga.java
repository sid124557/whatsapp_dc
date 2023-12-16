package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6ga  reason: invalid class name and case insensitive filesystem */
public final class C133036ga extends AnonymousClass7DR {
    public final List A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C133036ga) {
                C133036ga r5 = (C133036ga) obj;
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

    public C133036ga(List list, Map map) {
        super(list);
        this.A00 = list;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CategoryGroupsWithLoadingChildItems(catalogCategoryGroups=");
        A0o.append(this.A00);
        A0o.append(", parentCategoryToChildItemMap=");
        return C18260x0.A04(this.A01, A0o);
    }
}
