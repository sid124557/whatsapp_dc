package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: X.0VU  reason: invalid class name */
public class AnonymousClass0VU {
    public static Map A00 = AnonymousClass001.A0t();
    public static Map A01 = AnonymousClass001.A0t();

    public static void A01(Object obj, Constructor constructor) {
        try {
            constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r0.booleanValue() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Class r9) {
        /*
            java.util.Map r5 = A00
            java.lang.Object r0 = r5.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000f
            int r0 = r0.intValue()
            return r0
        L_0x000f:
            java.lang.String r0 = r9.getCanonicalName()
            r7 = 1
            if (r0 == 0) goto L_0x0091
            java.lang.Package r0 = r9.getPackage()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.String r6 = r9.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r4 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
        L_0x0024:
            boolean r3 = r4.isEmpty()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            if (r3 != 0) goto L_0x0034
            int r0 = r4.length()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            int r0 = r0 + 1
            java.lang.String r6 = r6.substring(r0)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.String r2 = "."
            java.lang.String r0 = "_"
            java.lang.String r0 = r6.replace(r2, r0)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            r1.append(r0)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            goto L_0x004d
        L_0x004a:
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x004d:
            if (r3 != 0) goto L_0x0057
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.String r1 = X.AnonymousClass000.A0U(r4, r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
        L_0x0057:
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            r0 = 0
            r1[r0] = r9     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            boolean r0 = r2.isAccessible()     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
            if (r0 != 0) goto L_0x006d
            r2.setAccessible(r7)     // Catch:{ ClassNotFoundException -> 0x007f, NoSuchMethodException -> 0x0078 }
        L_0x006d:
            java.util.Map r1 = A01
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r1.put(r9, r0)
            goto L_0x010f
        L_0x0078:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x007f:
            X.0Vq r8 = X.C05960Vq.A02
            java.util.Map r6 = r8.A01
            java.lang.Object r0 = r6.get(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x009a
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b8
        L_0x0091:
            r1 = 1
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.put(r9, r0)
            return r1
        L_0x009a:
            java.lang.reflect.Method[] r4 = r9.getDeclaredMethods()     // Catch:{ NoClassDefFoundError -> 0x0111 }
            int r3 = r4.length
            r2 = 0
        L_0x00a0:
            if (r2 >= r3) goto L_0x00b3
            r1 = r4[r2]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r0 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L_0x00b0
            r8.A01(r9, r4)
            goto L_0x0091
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00b3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.put(r9, r0)
        L_0x00b8:
            java.lang.Class r1 = r9.getSuperclass()
            if (r1 == 0) goto L_0x0106
            java.lang.Class<X.0qn> r0 = X.C15110qn.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0106
            int r0 = A00(r1)
            if (r0 == r7) goto L_0x0091
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)
        L_0x00d8:
            java.lang.Class[] r4 = r9.getInterfaces()
            int r3 = r4.length
            r2 = 0
        L_0x00de:
            if (r2 >= r3) goto L_0x0108
            r1 = r4[r2]
            if (r1 == 0) goto L_0x0103
            java.lang.Class<X.0qn> r0 = X.C15110qn.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x0103
            int r0 = A00(r1)
            if (r0 == r7) goto L_0x0091
            if (r6 != 0) goto L_0x00f8
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
        L_0x00f8:
            java.util.Map r0 = A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
        L_0x0103:
            int r2 = r2 + 1
            goto L_0x00de
        L_0x0106:
            r6 = 0
            goto L_0x00d8
        L_0x0108:
            if (r6 == 0) goto L_0x0091
            java.util.Map r0 = A01
            r0.put(r9, r6)
        L_0x010f:
            r1 = 2
            goto L_0x0092
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VU.A00(java.lang.Class):int");
    }
}
