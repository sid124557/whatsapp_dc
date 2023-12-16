package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.util.List;

/* renamed from: X.6Bo  reason: invalid class name and case insensitive filesystem */
public class C124256Bo implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C124256Bo(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void AwB(Object obj) {
        String A032;
        if (this.A03 != 0) {
            C95884uo r4 = (C95884uo) this.A00;
            C30721mu r3 = (C30721mu) this.A01;
            Object obj2 = this.A02;
            File file = ((AnonymousClass7YU) obj).A01;
            if (file != null) {
                r4.A09(new AnonymousClass5SM(r3, file, AnonymousClass0x9.A14(obj2)));
                return;
            }
            return;
        }
        C97944zZ r9 = (C97944zZ) this.A00;
        Object obj3 = this.A01;
        List list = (List) this.A02;
        AnonymousClass7O9 r12 = (AnonymousClass7O9) obj;
        if (obj3 instanceof C30421mQ) {
            C106705a1 r32 = r12.A04;
            if (r32 != null) {
                r9.A0D.A0B(r9.A06, r32);
                r9.A07.setTitleAndDescription(C107575bX.A0C(r32.A03(), 128), (String) null, list);
                List list2 = r32.A06;
                if (list2 != null && !list2.isEmpty()) {
                    r9.A07.setSubText(((AnonymousClass7OD) C18290x4.A0k(r32.A06)).A02, list);
                    return;
                }
                return;
            }
            return;
        }
        List list3 = r12.A03;
        for (int i = 0; i < r9.A09.size(); i++) {
            if (i < list3.size()) {
                r9.A0D.A0B((ImageView) r9.A09.get(i), (C106705a1) list3.get(i));
            }
        }
        int i2 = r12.A00;
        C106705a1 r0 = r12.A04;
        if (r0 == null || (A032 = r0.A03()) == null) {
            r9.A07.setTitleAndDescription(C86604Kt.A0q(r9.A0E, i2, 0, R.plurals.f9nameremoved), (String) null, (List) null);
            return;
        }
        int i3 = i2 - 1;
        Object[] A1b = C18310x6.A1b(C107575bX.A0C(A032, 128), 0);
        AnonymousClass000.A1P(A1b, i3, 1);
        r9.A07.setTitleAndDescription(r9.A0E.A0L(A1b, R.plurals.f9nameremoved, (long) i3), (String) null, list);
    }
}
