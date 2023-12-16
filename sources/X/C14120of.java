package X;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0of  reason: invalid class name and case insensitive filesystem */
public final class C14120of extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0WI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14120of(AnonymousClass0WI r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke() {
        Class cls;
        try {
            cls = this.this$0.A00.A01();
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return Boolean.FALSE;
        }
        Class A06 = this.this$0.A06();
        boolean z = false;
        Method method = A06.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls});
        Method method2 = A06.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
        C162457s7.A0D(method);
        if (Modifier.isPublic(method.getModifiers())) {
            C162457s7.A0D(method2);
            if (Modifier.isPublic(method2.getModifiers())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
