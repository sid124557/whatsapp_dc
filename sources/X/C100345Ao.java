package X;

import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Ao  reason: invalid class name and case insensitive filesystem */
public class C100345Ao implements C15930sC {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C100345Ao(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void BOf(Object obj) {
        boolean z;
        List list;
        AnonymousClass5PX r0;
        int i;
        int i2;
        CharSequence A05;
        if (this.A02 != 0) {
            C93314oJ r6 = (C93314oJ) this.A00;
            boolean z2 = this.A01;
            r6.setVisibility(0);
            TextView A0G = C18300x5.A0G(r6, R.id.message_text);
            if (z2) {
                A05 = C107575bX.A00(r6.getContext(), new Object[]{obj}, R.string.f11nameremoved);
            } else {
                A05 = r6.A20.A05(A0G.getContext(), C117085rM.A00(r6, 44), C18320x8.A0b(r6.getResources(), "profile-info", C18310x6.A1b(obj, 0), 1, R.string.f11nameremoved), "profile-info");
                C18270x1.A0q(A0G, r6.A0O);
            }
            A0G.setText(A05);
            return;
        }
        AnonymousClass4X5 r4 = (AnonymousClass4X5) this.A00;
        boolean z3 = this.A01;
        AnonymousClass5QZ r8 = (AnonymousClass5QZ) obj;
        r4.A00 = r8;
        C102895Kr r2 = r4.A0D;
        if (r8 == null || !((i2 = r8.A01) == 1 || i2 == 2)) {
            z = false;
        } else {
            z = true;
        }
        r2.A00 = z;
        if (r8 == null || (!((i = r8.A01) == 1 || i == 2) || z3)) {
            list = r4.A0N;
            C86644Kx.A1V(r4.A09, list);
            r0 = r4.A08;
        } else {
            list = r4.A0N;
            AnonymousClass5PX r1 = r4.A08;
            if (!list.contains(r1)) {
                list.add(0, r1);
            }
            r0 = r4.A09;
        }
        list.remove(r0);
    }
}
