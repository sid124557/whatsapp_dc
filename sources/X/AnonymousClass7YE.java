package X;

import java.util.List;

/* renamed from: X.7YE  reason: invalid class name */
public class AnonymousClass7YE {
    public final C166587yw A00;
    public final List A01 = AnonymousClass001.A0s();

    public String A00() {
        C133796hx r0;
        String str;
        C166587yw r02 = this.A00;
        if (r02 == null || (r0 = r02.A08) == null) {
            r0 = null;
        }
        if (r0 == null || (str = ((C133776hv) r0).A07) == null) {
            return "NONE";
        }
        return str;
    }

    public String A01() {
        C133796hx r1;
        C133776hv r12;
        C166587yw r0 = this.A00;
        if (r0 == null || (r1 = r0.A08) == null || !(r1 instanceof C133776hv) || (r12 = (C133776hv) r1) == null) {
            return null;
        }
        return r12.A06;
    }

    public String A02() {
        C166557yt r0;
        Object obj;
        C166587yw r02 = this.A00;
        if (r02 == null || (r0 = r02.A09) == null || (obj = r0.A00) == null) {
            return "";
        }
        return (String) obj;
    }

    public AnonymousClass7YE(C133706ho r2) {
        this.A00 = r2;
    }
}
