package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.08X  reason: invalid class name */
public class AnonymousClass08X extends C08380eM {
    public static AnonymousClass08X A01;
    public static final C15120qo A02 = C08390eN.A00;
    public final Application A00;

    public C05550Ty Azr(Class cls) {
        C162457s7.A0J(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw AnonymousClass002.A0G("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        C162457s7.A0J(cls, 0);
        C162457s7.A0J(r2, 1);
        if (this.A00 != null) {
            return Azr(cls);
        }
        Application application = (Application) r2.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!AnonymousClass08N.class.isAssignableFrom(cls)) {
            return super.Azr(cls);
        }
        throw AnonymousClass001.A0c("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final C05550Ty A00(Application application, Class cls) {
        if (!AnonymousClass08N.class.isAssignableFrom(cls)) {
            return super.Azr(cls);
        }
        try {
            C05550Ty r0 = (C05550Ty) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            C162457s7.A0B(r0);
            return r0;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e4);
        }
    }

    public AnonymousClass08X(Application application) {
        this.A00 = application;
    }

    public AnonymousClass08X() {
        this.A00 = null;
    }
}
