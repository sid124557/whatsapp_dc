package X;

import java.util.List;

/* renamed from: X.4wF  reason: invalid class name and case insensitive filesystem */
public class C96364wF extends C136186lz {
    public final AnonymousClass7HA A00;
    public final AnonymousClass3ZH A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C96364wF(AnonymousClass7HA r2, AnonymousClass3ZH r3, String str, String str2, List list) {
        super(36);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = list;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C96364wF r4 = (C96364wF) obj;
            if (this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A04.equals(r4.A04)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        int A07 = AnonymousClass0x2.A07(this.A02, super.hashCode() * 31);
        return AnonymousClass002.A02(this.A01, (AnonymousClass0x2.A07(this.A03, A07) + this.A04.hashCode()) * 31);
    }
}
