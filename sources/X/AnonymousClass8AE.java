package X;

import java.util.Map;

/* renamed from: X.8AE  reason: invalid class name */
public final class AnonymousClass8AE implements C183938qu {
    public static final AnonymousClass8AE A00 = new AnonymousClass8AE();

    public final C178488hc BtY(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass6V4> cls2 = AnonymousClass6V4.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                Map map = AnonymousClass6V4.zzb;
                if (((AnonymousClass6V4) map.get(asSubclass)) == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        if (((AnonymousClass6V4) map.get(asSubclass)) == null) {
                            C162327ri.A02(asSubclass);
                            AnonymousClass6VG r0 = AnonymousClass6VG.zzb;
                            if (r0 != null) {
                                map.put(asSubclass, r0);
                            } else {
                                illegalStateException = AnonymousClass6CA.A0O();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = "zzd";
                return new AnonymousClass8AB(AnonymousClass6VG.zzb, A0L);
            } catch (Exception e2) {
                throw AnonymousClass6CA.A0Q("Unable to get message info for ".concat(cls.getName()), e2);
            }
        } else {
            throw AnonymousClass001.A0c("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean Btr(Class cls) {
        return AnonymousClass6V4.class.isAssignableFrom(cls);
    }
}
