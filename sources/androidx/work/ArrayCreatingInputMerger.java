package androidx.work;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Q9;
import X.AnonymousClass0TT;
import X.AnonymousClass0Xq;
import X.C162457s7;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends AnonymousClass0TT {
    public static final Object A00(Class cls, Object obj) {
        Object newInstance = Array.newInstance(cls, 1);
        Array.set(newInstance, 0, obj);
        C162457s7.A0D(newInstance);
        return newInstance;
    }

    public AnonymousClass0Xq A03(List list) {
        Class cls;
        AnonymousClass0Q9 r8 = new AnonymousClass0Q9();
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((AnonymousClass0Xq) it.next()).A00);
            C162457s7.A0D(unmodifiableMap);
            Iterator A0q = AnonymousClass000.A0q(unmodifiableMap);
            while (true) {
                if (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    Object key = A0w.getKey();
                    Object value = A0w.getValue();
                    if (value != null) {
                        cls = value.getClass();
                    } else {
                        cls = String.class;
                    }
                    Object obj = A0t.get(key);
                    C162457s7.A0B(key);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (C162457s7.A0P(cls2, cls)) {
                            C162457s7.A0D(value);
                            value = A02(obj, value);
                        } else if (C162457s7.A0P(cls2.getComponentType(), cls)) {
                            value = A01(cls, obj, value);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (!cls.isArray()) {
                        value = A00(cls, value);
                    }
                    C162457s7.A0G(value);
                    A0t.put(key, value);
                }
            }
        }
        r8.A03(A0t);
        return r8.A00();
    }

    public static final Object A01(Class cls, Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        C162457s7.A0D(newInstance);
        return newInstance;
    }

    public static final Object A02(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        C162457s7.A0H(componentType);
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        C162457s7.A0D(newInstance);
        return newInstance;
    }
}
