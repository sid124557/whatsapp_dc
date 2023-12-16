package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7ni  reason: invalid class name and case insensitive filesystem */
public class C160487ni {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final C160347nU A0E;
    public final C160087n1 A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public boolean A00() {
        if (this.A0G == null || this.A0H == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A0J);
        A0o.append(", ");
        A0o.append(this.A09);
        A0o.append(", ");
        A0o.append(this.A0P);
        A0o.append(", ");
        A0o.append(this.A07);
        A0o.append(", ");
        A0o.append(this.A06);
        A0o.append(", ");
        A0o.append(this.A00);
        A0o.append(", ");
        A0o.append(this.A08);
        A0o.append(", ");
        A0o.append(this.A0R);
        A0o.append(", ");
        A0o.append(this.A0O);
        A0o.append(", ");
        A0o.append(this.A04);
        A0o.append(", ");
        A0o.append(this.A0C);
        A0o.append(", ");
        A0o.append(this.A0A);
        A0o.append(", ");
        A0o.append(this.A01);
        A0o.append(", ");
        A0o.append(this.A03);
        A0o.append(", ");
        A0o.append(this.A05);
        A0o.append(", ");
        A0o.append(this.A02);
        A0o.append(", ");
        A0o.append(-1);
        AnonymousClass6C8.A1F(A0o, ", ");
        A0o.append(", ");
        return AnonymousClass000.A0X(this.A0L, A0o);
    }

    public C160487ni(C160347nU r4, C160087n1 r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A0N = A0t;
        this.A0J = str;
        this.A09 = j;
        this.A0P = z;
        this.A07 = i;
        this.A06 = i2;
        this.A00 = i3;
        this.A08 = i4;
        this.A0R = z2;
        this.A0O = z3;
        this.A04 = i5;
        this.A0B = j2;
        this.A0F = r5;
        this.A0D = j3;
        this.A0Q = z4;
        this.A05 = i6;
        this.A02 = i7;
        this.A0C = j4;
        this.A0A = j5;
        this.A01 = i8;
        this.A03 = i9;
        this.A0G = str3;
        this.A0H = str2;
        if (map != null) {
            A0t.putAll(map);
        }
        this.A0E = r4;
        this.A0L = str4;
        this.A0I = str5;
        this.A0M = str6;
        this.A0K = str7;
    }

    public C160487ni() {
        this(C160347nU.A02, new C160087n1(), "", (String) null, (String) null, "", "", "", (String) null, (Map) null, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, false, false, false, false);
    }
}
