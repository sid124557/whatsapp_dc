package X;

/* renamed from: X.8AW  reason: invalid class name */
public final class AnonymousClass8AW implements C183948qv {
    public static final AnonymousClass8AW A00 = new AnonymousClass8AW();

    public final boolean BtN(Class cls) {
        return C128166Va.class.isAssignableFrom(cls);
    }

    public final C178548hi Bta(Class cls) {
        IllegalStateException illegalStateException;
        String str;
        Class<C128166Va> cls2 = C128166Va.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw AnonymousClass001.A0c(AnonymousClass6C7.A0k("Unsupported message type: ", name, name.length()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            C128166Va r1 = (C128166Va) C128166Va.zzjr.get(asSubclass);
            if (r1 == null) {
                try {
                    String name2 = asSubclass.getName();
                    Class.forName(name2, true, asSubclass.getClassLoader());
                    r1 = (C128166Va) C128166Va.zzjr.get(asSubclass);
                    if (r1 == null) {
                        if (name2.length() != 0) {
                            str = "Unable to get default instance for: ".concat(name2);
                        } else {
                            str = new String("Unable to get default instance for: ");
                        }
                        illegalStateException = AnonymousClass001.A0e(str);
                        throw illegalStateException;
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (C178548hi) r1.A06(3);
        } catch (Exception e2) {
            String name3 = cls.getName();
            throw AnonymousClass6CA.A0Q(AnonymousClass6C7.A0k("Unable to get message info for ", name3, name3.length()), e2);
        }
    }
}
