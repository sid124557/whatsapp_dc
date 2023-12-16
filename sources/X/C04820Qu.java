package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Qu  reason: invalid class name and case insensitive filesystem */
public abstract class C04820Qu {
    public final AnonymousClass05C A00;
    public final AnonymousClass05C A01;
    public final AnonymousClass05C A02;

    public abstract C04820Qu A02();

    public C15260r3 A03() {
        String readString = ((AnonymousClass0AX) this).A05.readString();
        if (readString == null) {
            return null;
        }
        C04820Qu A022 = A02();
        try {
            AnonymousClass05C r4 = this.A01;
            Method method = (Method) r4.get(readString);
            if (method == null) {
                System.currentTimeMillis();
                Class<C04820Qu> cls = C04820Qu.class;
                method = Class.forName(readString, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                r4.put(readString, method);
            }
            return (C15260r3) method.invoke((Object) null, AnonymousClass000.A1b(A022));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public abstract void A05(int i);

    public abstract boolean A09(int i);

    public final Class A04(Class cls) {
        AnonymousClass05C r5 = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) r5.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = name2;
        A0M[1] = cls.getSimpleName();
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", A0M), false, cls.getClassLoader());
        r5.put(name, cls3);
        return cls3;
    }

    public void A08(C15260r3 r9) {
        if (r9 == null) {
            ((AnonymousClass0AX) this).A05.writeString((String) null);
            return;
        }
        try {
            Class<?> cls = r9.getClass();
            ((AnonymousClass0AX) this).A05.writeString(A04(cls).getName());
            C04820Qu A022 = A02();
            try {
                AnonymousClass05C r6 = this.A02;
                String name = cls.getName();
                Method method = (Method) r6.get(name);
                if (method == null) {
                    Class A04 = A04(cls);
                    System.currentTimeMillis();
                    method = A04.getDeclaredMethod("write", new Class[]{cls, C04820Qu.class});
                    r6.put(name, method);
                }
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass000.A16(r9, A022, A0M);
                method.invoke((Object) null, A0M);
                AnonymousClass0AX r4 = (AnonymousClass0AX) A022;
                int i = r4.A00;
                if (i >= 0) {
                    int i2 = r4.A06.get(i);
                    Parcel parcel = r4.A05;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw e2.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1A(r9, A0o);
            throw new RuntimeException(AnonymousClass000.A0X(" does not have a Parcelizer", A0o), e5);
        }
    }

    public C04820Qu(AnonymousClass05C r1, AnonymousClass05C r2, AnonymousClass05C r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public int A00(int i, int i2) {
        if (A09(i2)) {
            return ((AnonymousClass0AX) this).A05.readInt();
        }
        return i;
    }

    public Parcelable A01(Parcelable parcelable, int i) {
        if (!A09(i)) {
            return parcelable;
        }
        AnonymousClass0AX r0 = (AnonymousClass0AX) this;
        return r0.A05.readParcelable(r0.getClass().getClassLoader());
    }

    public void A06(int i, int i2) {
        A05(i2);
        ((AnonymousClass0AX) this).A05.writeInt(i);
    }

    public void A07(Parcelable parcelable, int i) {
        A05(i);
        ((AnonymousClass0AX) this).A05.writeParcelable(parcelable, 0);
    }
}
