package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: X.8N5  reason: invalid class name */
public final class AnonymousClass8N5 implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;
    public final /* synthetic */ AnonymousClass8QN A01;

    public AnonymousClass8N5(AlgorithmParameterSpec algorithmParameterSpec, AnonymousClass8QN r2) {
        this.A01 = r2;
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        AnonymousClass8QN r5 = this.A01;
        Method method = C159887md.A02;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new AnonymousClass8QK(r5, (byte[]) C159887md.A01.invoke(algorithmParameterSpec, new Object[0]), (byte[]) null, AnonymousClass001.A0K(method.invoke(algorithmParameterSpec, new Object[0])));
    }
}
