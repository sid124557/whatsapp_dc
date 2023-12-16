package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.4Hm  reason: invalid class name and case insensitive filesystem */
public class C85754Hm implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C85754Hm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj4;
        this.A03 = obj6;
        this.A04 = obj3;
        this.A05 = obj2;
        this.A01 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A06;
        Object obj = this.A00;
        if (i2 != 0) {
            Set set = (Set) this.A03;
            C69263Wi r7 = (C69263Wi) this.A04;
            Resources resources = (Resources) this.A05;
            AnonymousClass4BL r5 = (AnonymousClass4BL) this.A01;
            C621433s.A00((Activity) obj, 13);
            ((C621033m) this.A02).A0Z(set, true);
            C162457s7.A0H(resources);
            if (set.size() == 1) {
                r7.A0H(R.string.f11nameremoved, 0);
            } else {
                int size = set.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1P(objArr, set.size(), 0);
                r7.A0P(resources.getQuantityString(R.plurals.f9nameremoved, size, objArr), 0);
            }
            r5.BQj();
            return;
        }
        C15910sA r0 = (C15910sA) this.A02;
        C55562qY r3 = (C55562qY) this.A03;
        AnonymousClass5Ai.A00(r0, (AnonymousClass4FU) obj, (C56942so) this.A04, r3, (C27991fJ) this.A05, (AnonymousClass4FS) this.A01);
    }
}
