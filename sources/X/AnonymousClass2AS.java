package X;

/* renamed from: X.2AS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2AS {
    public static final long A00(String str, long j, long j2, long j3) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long A07 = C829745q.A07(property);
                if (A07 != null) {
                    long longValue = A07.longValue();
                    if (j2 <= longValue && longValue <= j3) {
                        return longValue;
                    }
                    StringBuilder A0m = AnonymousClass000.A0m("System property '", str);
                    A0m.append("' should be in range ");
                    A0m.append(j2);
                    A0m.append("..");
                    A0m.append(j3);
                    A0m.append(", but is '");
                    A0m.append(longValue);
                    throw AnonymousClass001.A0e(AnonymousClass001.A0j(A0m, '\''));
                }
                StringBuilder A0m2 = AnonymousClass000.A0m("System property '", str);
                A0m2.append("' has unrecognized value '");
                A0m2.append(property);
                throw AnonymousClass001.A0e(AnonymousClass001.A0j(A0m2, '\''));
            }
        } catch (SecurityException unused) {
        }
        return j;
    }
}
