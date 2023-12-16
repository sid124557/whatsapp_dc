package X;

import java.util.Map;

/* renamed from: X.08K  reason: invalid class name */
public final class AnonymousClass08K extends AnonymousClass08M {
    public AnonymousClass0XV A00;
    public String A01;

    public void A0H(Object obj) {
        AnonymousClass0XV r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            C85524Gp r0 = (C85524Gp) r2.A01.get(str);
            if (r0 != null) {
                r0.setValue(obj);
            }
        }
        super.A0H(obj);
    }

    public AnonymousClass08K(AnonymousClass0XV r1, Object obj, String str) {
        super(obj);
        this.A01 = str;
        this.A00 = r1;
    }

    public AnonymousClass08K(AnonymousClass0XV r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
