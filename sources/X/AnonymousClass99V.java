package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.99V  reason: invalid class name */
public final class AnonymousClass99V extends AnonymousClass3ZG {
    public final String A00;
    public final AnonymousClass9PD[] A01;

    public void serialize(AnonymousClass4AD r6) {
        for (AnonymousClass9PD r0 : this.A01) {
            r6.Blb(r0.A00, r0.A02);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.A00);
        sb.append(" {");
        for (AnonymousClass9PD r1 : this.A01) {
            Object obj = r1.A01;
            if (obj != null) {
                C57292tP.A00(sb, r1.A03, String.valueOf(obj));
            }
        }
        return AnonymousClass000.A0X("}", sb);
    }

    public AnonymousClass99V(AnonymousClass5ZC r1, String str, AnonymousClass9PD[] r3, int i, int i2, int i3) {
        super(i, r1, i2, i3);
        this.A00 = str;
        this.A01 = r3;
    }

    public Map getFieldsMap() {
        HashMap A0t = AnonymousClass001.A0t();
        for (AnonymousClass9PD r2 : this.A01) {
            A0t.put(Integer.valueOf(r2.A00), r2.A02);
        }
        return A0t;
    }
}
