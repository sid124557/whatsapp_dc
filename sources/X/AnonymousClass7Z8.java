package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.7Z8  reason: invalid class name */
public final class AnonymousClass7Z8 {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Z8) {
                AnonymousClass7Z8 r5 = (AnonymousClass7Z8) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass0x2.A07(this.A01, AnonymousClass000.A08(this.A03, C18300x5.A04(this.A00))));
    }

    public AnonymousClass7Z8(Object obj, String str, List list, Map map) {
        C18260x0.A0c(obj, map, str, list);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Template(templateId=");
        A0o.append(this.A00);
        A0o.append(", expandedVariables=");
        A0o.append(this.A03);
        A0o.append(", scopeKey=");
        A0o.append(this.A01);
        A0o.append(", keyPathBase=");
        return C18260x0.A04(this.A02, A0o);
    }
}
