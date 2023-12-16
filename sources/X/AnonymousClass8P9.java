package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.8P9  reason: invalid class name */
public abstract class AnonymousClass8P9 implements C84814Du, AnonymousClass4C3, Serializable {
    public final C84814Du completion;

    public abstract Object A09(Object obj);

    public final void BkD(Object obj) {
        C84814Du r2 = this;
        while (true) {
            AnonymousClass8P9 r22 = (AnonymousClass8P9) r2;
            C84814Du r1 = r22.completion;
            C162457s7.A0H(r1);
            try {
                obj = r22.A09(obj);
                if (obj == AnonymousClass218.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new AnonymousClass3Z0(th);
            }
            r22.A08();
            if (r1 instanceof AnonymousClass8P9) {
                r2 = r1;
            } else {
                r1.BkD(obj);
                return;
            }
        }
    }

    public void A08() {
    }

    public C84814Du A0A(Object obj, C84814Du r3) {
        throw AnonymousClass002.A0G("create(Any?;Continuation) has not been overridden");
    }

    public AnonymousClass4C3 B5B() {
        C84814Du r1 = this.completion;
        if (r1 instanceof AnonymousClass4C3) {
            return (AnonymousClass4C3) r1;
        }
        return null;
    }

    public AnonymousClass8P9(C84814Du r1) {
        this.completion = r1;
    }

    public StackTraceElement A07() {
        int i;
        int i2;
        String A0X;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        int i3;
        Integer num;
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null) {
            return null;
        }
        int v = debugMetadata.v();
        if (v <= 1) {
            try {
                Field declaredField = cls.getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (!(obj2 instanceof Integer) || (num = (Integer) obj2) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
                i = i3 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                i2 = -1;
            } else {
                i2 = debugMetadata.l()[i];
            }
            AnonymousClass7LS r8 = AnonymousClass78p.A00;
            if (r8 == null) {
                try {
                    r8 = new AnonymousClass7LS(Class.class.getDeclaredMethod("getModule", new Class[0]), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new Class[0]));
                    AnonymousClass78p.A00 = r8;
                } catch (Exception unused2) {
                    r8 = AnonymousClass78p.A01;
                    AnonymousClass78p.A00 = r8;
                }
            }
            String str = null;
            if (!(r8 == AnonymousClass78p.A01 || (method = r8.A01) == null || (invoke = method.invoke(cls, new Object[0])) == null || (method2 = r8.A00) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = r8.A02;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            if (str == null) {
                A0X = debugMetadata.c();
            } else {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append('/');
                A0X = AnonymousClass000.A0X(debugMetadata.c(), A0l);
            }
            return new StackTraceElement(A0X, debugMetadata.m(), debugMetadata.f(), i2);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Debug metadata version mismatch. Expected: ");
        A0o.append(1);
        A0o.append(", got ");
        A0o.append(v);
        throw AnonymousClass000.A0I(". Please update the Kotlin standard library.", A0o);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Continuation at ");
        Object A07 = A07();
        if (A07 == null) {
            A07 = AnonymousClass000.A0O(this);
        }
        return AnonymousClass000.A0R(A07, A0o);
    }
}
