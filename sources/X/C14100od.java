package X;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0od  reason: invalid class name and case insensitive filesystem */
public final class C14100od extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0WI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14100od(AnonymousClass0WI r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke() {
        Class A03 = this.this$0.A03();
        boolean z = false;
        Method method = A03.getMethod("getBounds", new Class[0]);
        Method method2 = A03.getMethod("getType", new Class[0]);
        Method method3 = A03.getMethod("getState", new Class[0]);
        AnonymousClass0WI r1 = this.this$0;
        C162457s7.A0D(method);
        if (r1.A0B(method, C57982uW.A00(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            AnonymousClass0WI r12 = this.this$0;
            C162457s7.A0D(method2);
            Class cls = Integer.TYPE;
            if (r12.A0B(method2, C57982uW.A00(cls)) && Modifier.isPublic(method2.getModifiers())) {
                AnonymousClass0WI r13 = this.this$0;
                C162457s7.A0D(method3);
                if (r13.A0B(method3, C57982uW.A00(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
