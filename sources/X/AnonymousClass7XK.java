package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.7XK  reason: invalid class name */
public class AnonymousClass7XK {
    public C192439Jt A00;
    public String A01;
    public final AnonymousClass9V9 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final HashMap A0B;
    public final Map A0C;

    public boolean A00(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AnonymousClass7XK r5 = (AnonymousClass7XK) obj;
        return Objects.equals(this.A0B, r5.A0B) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals(this.A07, r5.A07) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals((Object) null, (Object) null) && Objects.equals(this.A05, r5.A05) && Objects.equals("0", "0") && Objects.equals(this.A08, r5.A08) && Objects.equals("0", "0") && Objects.equals(this.A09, r5.A09) && Objects.equals(this.A0A, r5.A0A) && Objects.equals(this.A0C, r5.A0C) && Objects.equals(this.A03, r5.A03) && Objects.equals(this.A04, r5.A04) && Objects.equals((Object) null, (Object) null) && this.A00 == r5.A00 && Objects.equals((Object) null, (Object) null) && Objects.equals(this.A02, r5.A02) && Objects.equals(this.A06, r5.A06);
    }

    public AnonymousClass7XK(C160587nv r2) {
        this.A0B = r2.A0B;
        this.A05 = r2.A05;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
        this.A0A = r2.A0A;
        this.A03 = r2.A02;
        this.A04 = r2.A03;
        this.A00 = r2.A01;
        this.A02 = r2.A00;
        this.A0C = r2.A0C;
        this.A07 = r2.A07;
        this.A01 = r2.A04;
        this.A06 = r2.A06;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18280x3.A1G(A0o, "FbMsqrdConfig{hashCode=", this);
        A0o.append(" effectId=");
        A0o.append(this.A08);
        A0o.append(" effectInstanceId=");
        A0o.append(this.A09);
        A0o.append(" effectName=");
        A0o.append(this.A0A);
        A0o.append(" effectSessionId=");
        A0o.append(this.A06);
        A0o.append(" deliveryOperationId=");
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }
}
