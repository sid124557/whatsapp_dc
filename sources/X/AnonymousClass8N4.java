package X;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: X.8N4  reason: invalid class name */
public final class AnonymousClass8N4 implements PrivilegedExceptionAction {
    public final /* synthetic */ AlgorithmParameterSpec A00;

    public AnonymousClass8N4(AlgorithmParameterSpec algorithmParameterSpec) {
        this.A00 = algorithmParameterSpec;
    }

    public Object run() {
        Method method = C159887md.A01;
        AlgorithmParameterSpec algorithmParameterSpec = this.A00;
        return new C176438d0((byte[]) method.invoke(algorithmParameterSpec, new Object[0]), AnonymousClass001.A0K(C159887md.A02.invoke(algorithmParameterSpec, new Object[0])) / 8);
    }
}
