package X;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/* renamed from: X.7lJ  reason: invalid class name and case insensitive filesystem */
public abstract class C159187lJ {
    public static C159187lJ A01(Object obj) {
        char charAt;
        if (obj == null) {
            return C186738vr.A02;
        }
        if (obj instanceof C159187lJ) {
            return (C159187lJ) obj;
        }
        if (obj instanceof Class) {
            return new C131416dY((Class) obj);
        }
        if (obj instanceof String) {
            String trim = obj.toString().trim();
            if (trim.length() > 0 && ((charAt = trim.charAt(0)) == '@' || charAt == '$')) {
                try {
                    C158347jp.A00(trim, new C181468mo[0]);
                    return new C131436da(C158347jp.A00(obj.toString().toString(), new C181468mo[0]), false, false);
                } catch (Exception unused) {
                }
            }
            String trim2 = obj.toString().trim();
            int length = trim2.length();
            if (length > 1) {
                char charAt2 = trim2.charAt(0);
                char charAt3 = trim2.charAt(length - 1);
                if (charAt2 != '[' ? charAt2 == '{' && charAt3 == '}' : charAt3 == ']') {
                    try {
                        new C175808Zu(-1).A0D(trim2, C159877mc.A02.A00);
                        return new C131476de((CharSequence) obj.toString());
                    } catch (Exception unused2) {
                    }
                }
            }
            return new C131446db(obj.toString(), true);
        } else if (obj instanceof Character) {
            return new C131446db(obj.toString(), false);
        } else {
            if (obj instanceof Number) {
                return new C131486df((CharSequence) obj.toString());
            }
            if (obj instanceof Boolean) {
                if (Boolean.parseBoolean(obj.toString().toString())) {
                    return C186738vr.A01;
                }
                return C186738vr.A00;
            } else if (obj instanceof Pattern) {
                return new C131466dd((Pattern) obj);
            } else {
                if (obj instanceof OffsetDateTime) {
                    return new C131456dc(obj.toString());
                }
                throw new C173678Re("Could not determine value type");
            }
        }
    }

    public C131476de A02() {
        if (this instanceof C131476de) {
            return (C131476de) this;
        }
        throw C131316dO.A00("Expected json node");
    }

    public C131486df A03() {
        if (this instanceof C131446db) {
            try {
                return new C131486df(new BigDecimal(((C131446db) this).A01));
            } catch (NumberFormatException unused) {
                return C131486df.A01;
            }
        } else if (this instanceof C131486df) {
            return (C131486df) this;
        } else {
            throw C131316dO.A00("Expected number node");
        }
    }

    public C131456dc A04() {
        if (this instanceof C131456dc) {
            return (C131456dc) this;
        }
        throw C131316dO.A00("Expected offsetDateTime node");
    }

    public C131446db A05() {
        if (this instanceof C131446db) {
            return (C131446db) this;
        }
        if (this instanceof C131486df) {
            return new C131446db(((C131486df) this).A00.toString(), false);
        }
        throw C131316dO.A00("Expected string node");
    }

    public C131496dg A06() {
        if (this instanceof C131496dg) {
            return (C131496dg) this;
        }
        throw C131316dO.A00("Expected value list node");
    }
}
