package X;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6da  reason: invalid class name and case insensitive filesystem */
public class C131436da extends C159187lJ {
    public final C151637Vo A00;
    public final boolean A01;
    public final boolean A02;

    public C159187lJ A07(AnonymousClass7MS r7) {
        Object A002;
        if (this.A01) {
            try {
                AnonymousClass7TU r4 = new AnonymousClass7TU();
                r4.A00 = r7.A00.A00;
                r4.A03.addAll(Arrays.asList(new C141926wM[]{C141926wM.REQUIRE_PROPERTIES}));
                if (this.A00.A00(r4.A00(), r7.A01, r7.A02).A00() == C187038wL.A00) {
                    return C186738vr.A00;
                }
                return C186738vr.A01;
            } catch (C131276dK unused) {
                return C186738vr.A00;
            }
        } else {
            try {
                C151637Vo r5 = this.A00;
                if (r5.A01) {
                    HashMap hashMap = r7.A03;
                    if (hashMap.containsKey(r5)) {
                        r5.toString();
                        A002 = hashMap.get(r5);
                    } else {
                        Object obj = r7.A02;
                        A002 = r5.A00(r7.A00, obj, obj).A00();
                        hashMap.put(r5, A002);
                    }
                } else {
                    A002 = r5.A00(r7.A00, r7.A01, r7.A02).A00();
                }
                AnonymousClass7TV r1 = r7.A00;
                if (A002 instanceof Number) {
                    return new C131486df((CharSequence) A002.toString());
                }
                if (A002 instanceof String) {
                    return new C131446db(A002.toString(), false);
                }
                if (A002 instanceof Boolean) {
                    if (Boolean.parseBoolean(A002.toString().toString())) {
                        return C186738vr.A01;
                    }
                    return C186738vr.A00;
                } else if (A002 instanceof OffsetDateTime) {
                    return new C131456dc(A002.toString());
                } else {
                    if (A002 == null) {
                        return C186738vr.A02;
                    }
                    if (A002 instanceof List) {
                        return new C131476de(r1.A01.A01(List.class, A002));
                    }
                    if (A002 instanceof Map) {
                        return new C131476de(r1.A01.A01(Map.class, A002));
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Could not convert ");
                    AnonymousClass000.A1B(A002.getClass(), A0o);
                    C18270x1.A1H(A0o, ":", A002);
                    throw new C173678Re(AnonymousClass000.A0X(" to a ValueNode", A0o));
                }
            } catch (C131276dK unused2) {
                return C186738vr.A03;
            }
        }
    }

    public String toString() {
        if (!this.A01 || this.A02) {
            return this.A00.toString();
        }
        return C160947oi.A02("!", this.A00.toString());
    }

    public C131436da(C151637Vo r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
