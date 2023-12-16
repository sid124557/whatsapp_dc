package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.0n4  reason: invalid class name and case insensitive filesystem */
public abstract class C13370n4 implements InvocationHandler {
    public final C85424Ge A00;

    public abstract boolean A04(Object obj, Object obj2);

    public Object invoke(Object obj, Method method, Object[] objArr) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(method, 1);
        Object obj2 = null;
        boolean z = false;
        if (A02(method, objArr)) {
            C85424Ge r0 = this.A00;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            AnonymousClass2A9.A00(obj2, r0);
            return Boolean.valueOf(A04(obj, obj2));
        } else if (A00(method, objArr)) {
            if (objArr != null) {
                obj2 = objArr[0];
            }
            C162457s7.A0H(obj2);
            if (obj == obj2) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (A01(method, objArr)) {
            return Integer.valueOf(hashCode());
        } else {
            if (A03(method, objArr)) {
                return toString();
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unexpected method call object:");
            A0o.append(obj);
            A0o.append(", method: ");
            A0o.append(method);
            throw AnonymousClass002.A0G(AnonymousClass000.A0P(objArr, ", args: ", A0o));
        }
    }

    public C13370n4(C85424Ge r1) {
        this.A00 = r1;
    }

    public static final boolean A00(Method method, Object[] objArr) {
        return AnonymousClass000.A1a(method, objArr, C162457s7.A0P(method.getName(), "equals") ? 1 : 0);
    }

    public static final boolean A01(Method method, Object[] objArr) {
        if (!C162457s7.A0P(method.getName(), "hashCode") || !method.getReturnType().equals(Integer.TYPE) || objArr != null) {
            return false;
        }
        return true;
    }

    public static final boolean A02(Method method, Object[] objArr) {
        return AnonymousClass000.A1a(method, objArr, C162457s7.A0P(method.getName(), "test") ? 1 : 0);
    }

    public static final boolean A03(Method method, Object[] objArr) {
        if (!C162457s7.A0P(method.getName(), "toString") || !method.getReturnType().equals(String.class) || objArr != null) {
            return false;
        }
        return true;
    }
}
