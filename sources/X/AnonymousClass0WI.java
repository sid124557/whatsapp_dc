package X;

import java.lang.reflect.Method;

/* renamed from: X.0WI  reason: invalid class name */
public final class AnonymousClass0WI {
    public final AnonymousClass0Q7 A00;
    public final ClassLoader A01;

    public static final boolean A01(AnonymousClass4GP r2) {
        try {
            return ((Boolean) r2.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final Class A03() {
        Class<?> loadClass = this.A01.loadClass("androidx.window.extensions.layout.FoldingFeature");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public final Class A04() {
        Class<?> loadClass = this.A01.loadClass("androidx.window.extensions.WindowExtensions");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public final Class A05() {
        Class<?> loadClass = this.A01.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public final Class A06() {
        Class<?> loadClass = this.A01.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public final boolean A07() {
        return A01(new C14100od(this));
    }

    public final boolean A08() {
        return A01(new C14110oe(this));
    }

    public final boolean A09() {
        return A01(new C14120of(this));
    }

    public final boolean A0A() {
        return A01(new C14130og(this));
    }

    public AnonymousClass0WI(AnonymousClass0Q7 r1, ClassLoader classLoader) {
        this.A01 = classLoader;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (A07() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.window.extensions.layout.WindowLayoutComponent A02() {
        /*
            r2 = this;
            boolean r0 = r2.A0A()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r2.A09()
            if (r0 == 0) goto L_0x0019
            boolean r1 = r2.A07()
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r1 = 0
            if (r0 == 0) goto L_0x0025
            androidx.window.extensions.WindowExtensions r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch:{ UnsupportedOperationException -> 0x0025 }
            androidx.window.extensions.layout.WindowLayoutComponent r1 = r0.getWindowLayoutComponent()     // Catch:{ UnsupportedOperationException -> 0x0025 }
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WI.A02():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final boolean A0B(Method method, C85424Ge r4) {
        return method.getReturnType().equals(C154547dL.A00(r4));
    }
}
