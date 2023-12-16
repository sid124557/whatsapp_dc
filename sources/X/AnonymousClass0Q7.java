package X;

import android.app.Activity;
import java.lang.reflect.Proxy;

/* renamed from: X.0Q7  reason: invalid class name */
public final class AnonymousClass0Q7 {
    public final ClassLoader A00;

    public final C15290r6 A00(Activity activity, Object obj, AnonymousClass4GQ r12, C85424Ge r13) {
        Object A02 = A02(r12, r13);
        Class<?> cls = obj.getClass();
        Class[] clsArr = new Class[2];
        clsArr[0] = Activity.class;
        AnonymousClass001.A0r(cls, A01(), "addWindowLayoutInfoListener", clsArr, 1).invoke(obj, new Object[]{activity, A02});
        return new C08800f8(obj, A02, AnonymousClass001.A0r(cls, A01(), "removeWindowLayoutInfoListener", new Class[1], 0));
    }

    public final Class A01() {
        Class<?> loadClass = this.A00.loadClass("java.util.function.Consumer");
        C162457s7.A0D(loadClass);
        return loadClass;
    }

    public final Object A02(AnonymousClass4GQ r6, C85424Ge r7) {
        C13380n5 r4 = new C13380n5(r6, r7);
        Object newProxyInstance = Proxy.newProxyInstance(this.A00, new Class[]{A01()}, r4);
        C162457s7.A0D(newProxyInstance);
        return newProxyInstance;
    }

    public final void A03(Object obj, AnonymousClass4GQ r8, C85424Ge r9) {
        AnonymousClass001.A0r(obj.getClass(), A01(), "setSplitInfoCallback", new Class[1], 0).invoke(obj, new Object[]{A02(r8, r9)});
    }

    public AnonymousClass0Q7(ClassLoader classLoader) {
        this.A00 = classLoader;
    }
}
