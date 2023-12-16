package X;

/* renamed from: X.8Au  reason: invalid class name and case insensitive filesystem */
public final class C169828Au implements C183958qw {
    public static final C169828Au A00 = new C169828Au();

    public final boolean BtN(Class cls) {
        return C128766Xj.class.isAssignableFrom(cls);
    }

    public final C178618hp Btb(Class cls) {
        IllegalStateException illegalStateException;
        Class<C128766Xj> cls2 = C128766Xj.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw AnonymousClass001.A0c(AnonymousClass6C7.A0k("Unsupported message type: ", name, name.length()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            C128766Xj r1 = (C128766Xj) C128766Xj.zzd.get(asSubclass);
            if (r1 == null) {
                try {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    r1 = (C128766Xj) C128766Xj.zzd.get(asSubclass);
                    if (r1 == null) {
                        r1 = (C128766Xj) ((C128766Xj) C162367ro.A02(asSubclass)).A09(6);
                        if (r1 != null) {
                            C128766Xj.A05(asSubclass, r1);
                        } else {
                            illegalStateException = AnonymousClass6CA.A0O();
                            throw illegalStateException;
                        }
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (C178618hp) r1.A09(3);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw AnonymousClass6CA.A0Q(AnonymousClass6C7.A0k("Unable to get message info for ", name2, name2.length()), e2);
        }
    }
}
