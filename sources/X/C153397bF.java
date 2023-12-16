package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7bF  reason: invalid class name and case insensitive filesystem */
public class C153397bF {
    public int A00 = 0;
    public final C180408kz A01;
    public final LinkedHashMap A02 = C18320x8.A0r();

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        int i;
        remove = this.A02.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BD7(remove);
        }
        this.A00 = i2 - i;
        return remove;
    }

    public synchronized ArrayList A03(AnonymousClass7AR r7) {
        ArrayList A0s;
        int i;
        A0s = AnonymousClass001.A0s();
        Iterator A0u = AnonymousClass001.A0u(this.A02);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            Object key = A0w.getKey();
            String str = r7.A00;
            String str2 = (String) key;
            C162457s7.A0J(str2, 1);
            if (C162457s7.A0P(str, str2)) {
                A0s.add(A0w.getValue());
                int i2 = this.A00;
                Object value = A0w.getValue();
                if (value == null) {
                    i = 0;
                } else {
                    i = this.A01.BD7(value);
                }
                this.A00 = i2 - i;
                A0u.remove();
            }
        }
        return A0s;
    }

    public synchronized void A04(Object obj, Object obj2) {
        int i;
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        int i2 = this.A00;
        if (remove == null) {
            i = 0;
        } else {
            i = this.A01.BD7(remove);
        }
        this.A00 = i2 - i;
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.BD7(obj2);
    }

    public C153397bF(C180408kz r2) {
        this.A01 = r2;
    }
}
