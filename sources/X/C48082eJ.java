package X;

/* renamed from: X.2eJ  reason: invalid class name and case insensitive filesystem */
public final class C48082eJ {
    public final Object A00;

    public boolean equals(Object obj) {
        Object obj2;
        if (this != obj) {
            if (obj == null || C48082eJ.class != obj.getClass()) {
                return false;
            }
            C48082eJ r5 = (C48082eJ) obj;
            Object obj3 = this.A00;
            return (obj3 == null || (obj2 = r5.A00) == null) ? obj3 == r5.A00 : obj3 == obj2 || obj3.equals(obj2);
        }
    }

    public C48082eJ(Object obj) {
        double doubleValue;
        if (obj == null) {
            obj = null;
        } else {
            if (obj instanceof Boolean) {
                if (AnonymousClass001.A1Z(obj)) {
                    doubleValue = 1.0d;
                } else {
                    doubleValue = 0.0d;
                }
            } else if (obj instanceof Number) {
                doubleValue = ((Number) obj).doubleValue();
            } else if (!(obj instanceof String)) {
                throw AnonymousClass001.A0c("Attribute type must be Boolean, Number, or String");
            }
            obj = Double.valueOf(doubleValue);
        }
        this.A00 = obj;
    }

    public int hashCode() {
        return C18310x6.A08(this.A00, AnonymousClass002.A0L(), 0);
    }
}
