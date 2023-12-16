package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* renamed from: X.0Vq  reason: invalid class name and case insensitive filesystem */
public final class C05960Vq {
    public static C05960Vq A02 = new C05960Vq();
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();

    public static final void A00(AnonymousClass0OL r4, AnonymousClass0GH r5, Class cls, Map map) {
        Object obj = map.get(r4);
        if (obj == null) {
            map.put(r4, r5);
        } else if (r5 != obj) {
            Method method = r4.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Method ");
            A0o.append(method.getName());
            A0o.append(" in ");
            A0o.append(cls.getName());
            A0o.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0o.append(obj);
            throw AnonymousClass000.A0E(r5, ", new value ", A0o);
        }
    }

    public final AnonymousClass0T1 A01(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap A0t = AnonymousClass001.A0t();
        if (superclass != null) {
            AnonymousClass0T1 r0 = (AnonymousClass0T1) this.A00.get(superclass);
            if (r0 == null) {
                r0 = A01(superclass, (Method[]) null);
            }
            A0t.putAll(r0.A01);
        }
        for (Class cls2 : cls.getInterfaces()) {
            AnonymousClass0T1 r02 = (AnonymousClass0T1) this.A00.get(cls2);
            if (r02 == null) {
                r02 = A01(cls2, (Method[]) null);
            }
            Iterator A0q = AnonymousClass000.A0q(r02.A01);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A00((AnonymousClass0OL) A0w.getKey(), (AnonymousClass0GH) A0w.getValue(), cls, A0t);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C15910sA.class)) {
                    i = 1;
                } else {
                    throw AnonymousClass001.A0c("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AnonymousClass0GH value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AnonymousClass0GH.class)) {
                        throw AnonymousClass001.A0c("invalid parameter type. second arg must be an event");
                    } else if (value == AnonymousClass0GH.ON_ANY) {
                        i = 2;
                        if (length > 2) {
                            throw AnonymousClass001.A0c("cannot have more than 2 params");
                        }
                    } else {
                        throw AnonymousClass001.A0c("Second arg is supported only for ON_ANY value");
                    }
                }
                A00(new AnonymousClass0OL(method, i), value, cls, A0t);
                z = true;
            }
        }
        AnonymousClass0T1 r2 = new AnonymousClass0T1(A0t);
        this.A00.put(cls, r2);
        this.A01.put(cls, Boolean.valueOf(z));
        return r2;
    }
}
