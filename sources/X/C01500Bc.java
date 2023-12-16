package X;

import java.util.List;

/* renamed from: X.0Bc  reason: invalid class name and case insensitive filesystem */
public class C01500Bc extends AnonymousClass0BW {
    public final AnonymousClass0TZ A00 = new AnonymousClass0TZ();

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r7, float f) {
        Object obj;
        Object A01;
        Object obj2 = r7.A0F;
        if (obj2 == null || (obj = r7.A09) == null) {
            throw AnonymousClass001.A0e("Missing values for keyframe.");
        }
        AnonymousClass0TZ r5 = (AnonymousClass0TZ) obj2;
        AnonymousClass0TZ r4 = (AnonymousClass0TZ) obj;
        C05560Tz r0 = this.A03;
        if (r0 != null && (A01 = AnonymousClass0BW.A01(this, r7, r0, r5, r4)) != null) {
            return A01;
        }
        AnonymousClass0TZ r3 = this.A00;
        float A002 = AnonymousClass001.A00(r4.A00, r5.A00, f);
        float A003 = AnonymousClass001.A00(r4.A01, r5.A01, f);
        r3.A00 = A002;
        r3.A01 = A003;
        return r3;
    }

    public C01500Bc(List list) {
        super(list);
    }
}
