package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Du  reason: invalid class name and case insensitive filesystem */
public class C170598Du implements C187038wL {
    public final C153467bN A00 = C159877mc.A02.A01;

    public Collection BBl(Object obj) {
        if (!(obj instanceof List)) {
            return ((Map) obj).keySet();
        }
        throw C18320x8.A0m();
    }

    public int BJg(Object obj) {
        String str;
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return BBl(obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("length operation cannot be applied to ");
        if (obj != null) {
            str = AnonymousClass000.A0O(obj);
        } else {
            str = "null";
        }
        throw new C173678Re(AnonymousClass000.A0X(str, A0o));
    }

    public void Bli(Object obj, int i, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i == list.size()) {
                list.add(obj2);
            } else {
                list.set(i, obj2);
            }
        } else {
            throw C18320x8.A0m();
        }
    }

    public void Bn8(Object obj, Object obj2, Object obj3) {
        String str;
        if (obj instanceof Map) {
            ((Map) obj).put(obj2.toString(), obj3);
            return;
        }
        if (AnonymousClass000.A0P(obj, "setProperty operation cannot be used with ", AnonymousClass001.A0o()) != null) {
            str = AnonymousClass000.A0O(obj);
        } else {
            str = "null";
        }
        throw new C173678Re(str);
    }

    public Iterable Bqo(Object obj) {
        String str;
        if (obj instanceof List) {
            return (Iterable) obj;
        }
        if (AnonymousClass000.A0P(obj, "Cannot iterate over ", AnonymousClass001.A0o()) != null) {
            str = AnonymousClass000.A0O(obj);
        } else {
            str = "null";
        }
        throw new C173678Re(str);
    }
}
