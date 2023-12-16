package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.6pq  reason: invalid class name and case insensitive filesystem */
public class C138146pq extends AnonymousClass5ZM {
    public final AnonymousClass5O9 A00;
    public final AnonymousClass7IH A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass5O9 r5 = this.A00;
        C186058ug r4 = null;
        C108945dp r0 = new C108945dp();
        r0.A01 = 2;
        r0.A00 = 1;
        r0.A02 = 2;
        r0.A03 = null;
        r0.A04 = false;
        C186308v5 A002 = r5.A00(r0);
        for (int i = 0; i < A002.getCount() && r4 == null; i++) {
            r4 = A002.B9S(i);
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass7EV r1;
        int A012;
        C186058ug r7 = (C186058ug) obj;
        if (r7 == null) {
            C137716p9 r2 = this.A01.A00;
            r2.A00 = null;
            r1 = r2.A00;
            A012 = r2.A01();
        } else if (!C18320x8.A1T(this)) {
            AnonymousClass7IH r0 = this.A01;
            C137716p9 r5 = r0.A00;
            String str = r0.A01;
            Context context = r5.A0H.getContext();
            C171218Gf r22 = new C171218Gf(r7, r5, r5.A02.A00.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            C171268Gk r12 = new C171268Gk(context, r22, r5, str);
            r5.A05.setTag(r22);
            r5.A04.A02(r22, r12);
            r1 = r5.A00;
            A012 = r5.A01();
        } else {
            return;
        }
        r1.A00.remove(Integer.valueOf(A012));
    }

    public C138146pq(AnonymousClass5O9 r1, AnonymousClass7IH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
