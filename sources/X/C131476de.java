package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.6de  reason: invalid class name and case insensitive filesystem */
public class C131476de extends C159187lJ {
    public final Object A00;
    public final boolean A01 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C131476de)) {
                return false;
            }
            Object obj2 = this.A00;
            Object obj3 = ((C131476de) obj).A00;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (!obj2.equals(obj3)) {
                return false;
            }
        }
    }

    public Object A07() {
        try {
            if (this.A01) {
                return this.A00;
            }
            return new C175808Zu(-1).A0D(this.A00.toString(), C159877mc.A02.A00);
        } catch (C143816zW e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public C131476de(CharSequence charSequence) {
        this.A00 = charSequence.toString();
    }

    public static C159187lJ A00(C159187lJ r1) {
        C131476de A02 = r1.A02();
        if (!(A02.A07() instanceof List)) {
            return C186738vr.A03;
        }
        return new C131496dg(Collections.unmodifiableList((List) A02.A07()));
    }

    public C131476de(Object obj) {
        this.A00 = obj;
    }
}
