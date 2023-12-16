package X;

/* renamed from: X.3ZN  reason: invalid class name */
public class AnonymousClass3ZN implements Comparable {
    public final Class A00;
    public final Object A01;

    public AnonymousClass3ZN(Object obj) {
        Class<String> cls = String.class;
        if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
            return;
        }
        throw AnonymousClass001.A0c("Mismatched args: value is not an instance of type");
    }

    public int compareTo(Object obj) {
        if (obj instanceof AnonymousClass3ZN) {
            AnonymousClass3ZN r4 = (AnonymousClass3ZN) obj;
            Object obj2 = r4.A01;
            Class cls = r4.A00;
            Class<Float> cls2 = this.A00;
            if (!cls2.equals(cls)) {
                throw AnonymousClass001.A0c("compareTo objects have mismatched types");
            } else if (cls2 == Boolean.class) {
                throw AnonymousClass001.A0c("compareTo should not be called on boolean types");
            } else if (cls2 == String.class) {
                return ((String) this.A01).compareTo((String) obj2);
            } else {
                if (cls2 == Integer.class) {
                    return Integer.compare(AnonymousClass001.A0K(this.A01), AnonymousClass001.A0K(obj2));
                }
                if (cls2 == Float.class) {
                    return Float.compare(((Number) this.A01).floatValue(), ((Number) obj2).floatValue());
                }
                throw AnonymousClass001.A0e("Invalid type: must be one of {Boolean, Integer, Float, String}");
            }
        } else {
            throw AnonymousClass001.A0c("compareTo o should be an instance of ConfigPrimitive");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3ZN)) {
            return false;
        }
        AnonymousClass3ZN r5 = (AnonymousClass3ZN) obj;
        Object obj2 = r5.A01;
        if (!this.A00.equals(r5.A00) || !this.A01.equals(obj2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A01.toString();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
