package X;

import java.lang.reflect.Proxy;

/* renamed from: X.0P6  reason: invalid class name */
public final class AnonymousClass0P6 {
    public final ClassLoader A00;

    public final Object A01(AnonymousClass4GQ r6, C85424Ge r7) {
        C01310Ac r3 = new C01310Ac(r6, r7);
        Object newProxyInstance = Proxy.newProxyInstance(this.A00, new Class[]{A00()}, r3);
        C162457s7.A0D(newProxyInstance);
        return newProxyInstance;
    }

    public final Object A02(AnonymousClass4GR r6, C85424Ge r7, C85424Ge r8) {
        C01320Ad r3 = new C01320Ad(r6, r7, r8);
        Object newProxyInstance = Proxy.newProxyInstance(this.A00, new Class[]{A00()}, r3);
        C162457s7.A0D(newProxyInstance);
        return newProxyInstance;
    }

    public final Class A00() {
        Class<?> loadClass = this.A00.loadClass("java.util.function.Predicate");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public AnonymousClass0P6(ClassLoader classLoader) {
        this.A00 = classLoader;
    }
}
