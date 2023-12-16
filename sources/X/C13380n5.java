package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.0n5  reason: invalid class name and case insensitive filesystem */
public final class C13380n5 implements InvocationHandler {
    public final AnonymousClass4GQ A00;
    public final C85424Ge A01;

    public final void A04(Object obj) {
        C162457s7.A0J(obj, 0);
        this.A00.invoke(obj);
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        C162457s7.A0J(obj, 0);
        C162457s7.A0J(method, 1);
        Object obj2 = null;
        boolean z = false;
        if (A00(method, objArr)) {
            C85424Ge r0 = this.A01;
            if (objArr != null) {
                obj2 = objArr[0];
            }
            AnonymousClass2A9.A00(obj2, r0);
            A04(obj2);
            return C59022wD.A00;
        } else if (A01(method, objArr)) {
            if (objArr != null && obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (A02(method, objArr)) {
            return Integer.valueOf(this.A00.hashCode());
        } else {
            if (A03(method, objArr)) {
                return this.A00.toString();
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unexpected method call object:");
            A0o.append(obj);
            A0o.append(", method: ");
            A0o.append(method);
            throw AnonymousClass002.A0G(AnonymousClass000.A0P(objArr, ", args: ", A0o));
        }
    }

    public C13380n5(AnonymousClass4GQ r1, C85424Ge r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final boolean A00(Method method, Object[] objArr) {
        if (!C162457s7.A0P(method.getName(), "accept") || objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A01(Method method, Object[] objArr) {
        return AnonymousClass000.A1a(method, objArr, C162457s7.A0P(method.getName(), "equals") ? 1 : 0);
    }

    public static final boolean A02(Method method, Object[] objArr) {
        if (!C162457s7.A0P(method.getName(), "hashCode") || !method.getReturnType().equals(Integer.TYPE) || objArr != null) {
            return false;
        }
        return true;
    }

    public static final boolean A03(Method method, Object[] objArr) {
        if (!C162457s7.A0P(method.getName(), "toString") || !method.getReturnType().equals(String.class) || objArr != null) {
            return false;
        }
        return true;
    }
}
