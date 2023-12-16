package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.699  reason: invalid class name */
public class AnonymousClass699 implements View.OnLongClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass699(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    public static final boolean A00(AnonymousClass699 r3) {
        ((C94384r9) r3.A01).A01.invoke(Integer.valueOf(r3.A00), ((C94404rD) r3.A02).A04);
        return true;
    }

    public static final boolean A01(AnonymousClass699 r2) {
        int i = r2.A00;
        ((AnonymousClass4rA) r2.A01).A02.invoke(Integer.valueOf(i), r2.A02);
        return true;
    }

    public static final boolean A02(AnonymousClass699 r3) {
        ((C94394rB) r3.A01).A02.invoke(Integer.valueOf(r3.A00), ((C94404rD) r3.A02).A04);
        return true;
    }

    public final boolean onLongClick(View view) {
        switch (this.A03) {
            case 0:
                C94134px r4 = (C94134px) this.A01;
                int i = this.A00;
                C95814uZ r3 = (C95814uZ) this.A02;
                if (i == 1 && r4.A0A.A0C()) {
                    return true;
                }
                C1230266t r2 = r4.A0E;
                ViewHolder viewHolder = r4.A08;
                return r2.BVx(viewHolder, viewHolder, r3, r4.A05);
            case 1:
                return A00(this);
            case 4:
                return A02(this);
            default:
                return A01(this);
        }
    }
}
