package X;

import com.google.protobuf.UnsafeUtil;

/* renamed from: X.8Cf  reason: invalid class name and case insensitive filesystem */
public class C170188Cf implements C183988qz {
    public static final C170188Cf A00 = new C170188Cf();

    public boolean BJ4(Class cls) {
        return C130786cX.class.isAssignableFrom(cls);
    }

    public AnonymousClass7MO BLD(Class cls) {
        IllegalStateException illegalStateException;
        Class<C130786cX> cls2 = C130786cX.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                C130786cX r2 = (C130786cX) C130786cX.defaultInstanceMap.get(asSubclass);
                if (r2 == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        r2 = (C130786cX) C130786cX.defaultInstanceMap.get(asSubclass);
                        if (r2 == null) {
                            r2 = (C130786cX) ((C130786cX) UnsafeUtil.A00(asSubclass)).A0J(C141056ux.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
                            if (r2 != null) {
                                C130786cX.defaultInstanceMap.put(asSubclass, r2);
                            } else {
                                illegalStateException = AnonymousClass6CA.A0O();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (AnonymousClass7MO) r2.A0J(C141056ux.BUILD_MESSAGE_INFO, (Object) null, (Object) null);
            } catch (Exception e2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unable to get message info for ");
                throw AnonymousClass6CA.A0Q(AnonymousClass000.A0X(cls.getName(), A0o), e2);
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Unsupported message type: ");
            throw AnonymousClass000.A0F(cls.getName(), A0o2);
        }
    }
}
