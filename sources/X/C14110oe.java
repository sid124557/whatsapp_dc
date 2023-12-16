package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0oe  reason: invalid class name and case insensitive filesystem */
public final class C14110oe extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0WI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14110oe(AnonymousClass0WI r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke() {
        boolean z = false;
        Method method = this.this$0.A04().getMethod("getWindowLayoutComponent", new Class[0]);
        Class A06 = this.this$0.A06();
        C162457s7.A0D(method);
        if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(A06)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
