package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0Vn  reason: invalid class name and case insensitive filesystem */
public class C05930Vn {
    public static final C06290Wz A01 = new C06290Wz();
    public final /* synthetic */ C08270df A00;

    public C05930Vn(C08270df r1) {
        this.A00 = r1;
    }

    public C08310eF A00(String str) {
        C13820nn r1;
        try {
            ClassLoader classLoader = this.A00.A07.A01.getClassLoader();
            try {
                C06290Wz r0 = A01;
                C06290Wz r2 = (C06290Wz) r0.get(classLoader);
                if (r2 == null) {
                    r2 = new C06290Wz();
                    r0.put(classLoader, r2);
                }
                Class<?> cls = (Class) r2.get(str);
                if (cls == null) {
                    cls = Class.forName(str, false, classLoader);
                    r2.put(str, cls);
                }
                return (C08310eF) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                r1 = new C13820nn(AnonymousClass000.A0X(": make sure class name exists", AnonymousClass000.A0m("Unable to instantiate fragment ", str)), e);
                throw r1;
            } catch (ClassCastException e2) {
                r1 = new C13820nn(AnonymousClass000.A0X(": make sure class is a valid subclass of Fragment", AnonymousClass000.A0m("Unable to instantiate fragment ", str)), e2);
                throw r1;
            }
        } catch (InstantiationException e3) {
            throw new C13820nn(AnonymousClass000.A0U("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public", AnonymousClass001.A0o()), e3);
        } catch (IllegalAccessException e4) {
            throw new C13820nn(AnonymousClass000.A0U("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public", AnonymousClass001.A0o()), e4);
        } catch (NoSuchMethodException e5) {
            throw new C13820nn(AnonymousClass000.A0X(": could not find Fragment constructor", AnonymousClass000.A0m("Unable to instantiate fragment ", str)), e5);
        } catch (InvocationTargetException e6) {
            throw new C13820nn(AnonymousClass000.A0X(": calling Fragment constructor caused an exception", AnonymousClass000.A0m("Unable to instantiate fragment ", str)), e6);
        }
    }

    public C05930Vn() {
    }
}
