package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.8LB  reason: invalid class name */
public class AnonymousClass8LB implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object keys;
    public final Object values;

    public final Object legacyReadResolve() {
        Object[] objArr = (Object[]) this.keys;
        Object[] objArr2 = (Object[]) this.values;
        C160667o6 makeBuilder = makeBuilder(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            makeBuilder.put(objArr[i], objArr2[i]);
        }
        return makeBuilder.build();
    }

    public C160667o6 makeBuilder(int i) {
        return new C160667o6(i);
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (!(obj instanceof C129526aS)) {
            return legacyReadResolve();
        }
        C174098Sy r2 = (C174098Sy) obj;
        C160667o6 makeBuilder = makeBuilder(r2.size());
        C172878Nf it = r2.iterator();
        C172878Nf it2 = ((C174098Sy) this.values).iterator();
        while (it.hasNext()) {
            makeBuilder.put(it.next(), it2.next());
        }
        return makeBuilder.build();
    }

    public AnonymousClass8LB(AnonymousClass8OQ r7) {
        Object[] objArr = new Object[r7.size()];
        Object[] objArr2 = new Object[r7.size()];
        C172878Nf it = r7.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            objArr[i] = A0w.getKey();
            objArr2[i] = A0w.getValue();
            i++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }
}
