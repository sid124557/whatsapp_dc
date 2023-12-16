package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: X.0S0  reason: invalid class name */
public final class AnonymousClass0S0 {
    public static final C04490Om A00(Context context) {
        if (!C175738Zn.A0V("androidx.work.workdb")) {
            return new C04490Om(context, "androidx.work.workdb");
        }
        throw AnonymousClass001.A0c("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object A01() {
        String str;
        Class<WorkDatabase> cls = WorkDatabase.class;
        Package packageR = cls.getPackage();
        C162457s7.A0H(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C162457s7.A0H(canonicalName);
        C162457s7.A0D(name);
        int length = name.length();
        boolean z = false;
        if (!AnonymousClass000.A1T(length)) {
            canonicalName = canonicalName.substring(length + 1);
            C162457s7.A0D(canonicalName);
        }
        String A0V = AnonymousClass000.A0V(C175738Zn.A0T(canonicalName), "_Impl", AnonymousClass001.A0o());
        if (length == 0) {
            z = true;
        }
        if (z) {
            str = A0V;
        } else {
            try {
                StringBuilder A0l = AnonymousClass000.A0l(name);
                A0l.append('.');
                str = AnonymousClass000.A0X(A0V, A0l);
            } catch (ClassNotFoundException unused) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Cannot find implementation for ");
                A0o.append(cls.getCanonicalName());
                A0o.append(". ");
                A0o.append(A0V);
                throw AnonymousClass002.A0E(AnonymousClass000.A0X(" does not exist", A0o));
            } catch (IllegalAccessException unused2) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass000.A17(cls, "Cannot access the constructor ", ".canonicalName", A0o2);
                throw AnonymousClass002.A0E(A0o2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass000.A17(cls, "Failed to create an instance of ", ".canonicalName", A0o3);
                throw AnonymousClass002.A0E(A0o3.toString());
            }
        }
        Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
        C162457s7.A0K(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
        return cls2.newInstance();
    }
}
