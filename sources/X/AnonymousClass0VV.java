package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0VV  reason: invalid class name */
public final class AnonymousClass0VV {
    public static final List A00;
    public static final List A01;

    static {
        Class<AnonymousClass0XV> cls = AnonymousClass0XV.class;
        A00 = AnonymousClass8UF.A0o(Application.class, cls);
        A01 = C159507lx.A0g(cls);
    }

    public static final C05550Ty A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (C05550Ty) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Failed to access ", AnonymousClass001.A0o()), e);
        } catch (InstantiationException e2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("A ");
            A0o.append(cls);
            throw new RuntimeException(AnonymousClass000.A0X(" cannot be instantiated.", A0o), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "An exception happened in constructor of ", AnonymousClass001.A0o()), e3.getCause());
        }
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        C162457s7.A0D(constructors);
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C162457s7.A0D(parameterTypes);
            List A04 = C73703fw.A04(parameterTypes);
            if (list.equals(A04)) {
                return constructor;
            }
            if (list.size() != A04.size() || !A04.containsAll(list)) {
                i++;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Class ");
                A0o.append(cls.getSimpleName());
                throw AnonymousClass002.A0G(AnonymousClass000.A0P(list, " must have parameters in the proper order: ", A0o));
            }
        }
        return null;
    }
}
