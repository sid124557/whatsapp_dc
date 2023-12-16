package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0og  reason: invalid class name and case insensitive filesystem */
public final class C14130og extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0WI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14130og(AnonymousClass0WI r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke() {
        boolean z = false;
        Method declaredMethod = this.this$0.A05().getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class A04 = this.this$0.A04();
        C162457s7.A0D(declaredMethod);
        if (declaredMethod.getReturnType().equals(A04) && Modifier.isPublic(declaredMethod.getModifiers())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
