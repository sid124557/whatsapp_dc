package X;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6aE  reason: invalid class name and case insensitive filesystem */
public abstract class C129386aE extends C129356aB implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient AnonymousClass8OQ map;
    public final transient int size;

    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public Map createAsMap() {
        throw AnonymousClass0x9.A0i("should never be called");
    }

    public Set createKeySet() {
        throw AnonymousClass0x9.A0i("unreachable");
    }

    public C174098Sy createValues() {
        return new C129516aR(this);
    }

    public C129526aS keySet() {
        return this.map.keySet();
    }

    public int size() {
        return this.size;
    }

    public C172878Nf valueIterator() {
        return new C129956b9(this);
    }

    public C129386aE(AnonymousClass8OQ r1, int i) {
        this.map = r1;
        this.size = i;
    }

    @Deprecated
    public final void clear() {
        throw C18320x8.A0m();
    }

    @Deprecated
    public final boolean put(Object obj, Object obj2) {
        throw C18320x8.A0m();
    }

    public C174098Sy values() {
        return (C174098Sy) super.values();
    }

    public AnonymousClass8OQ asMap() {
        return this.map;
    }
}
