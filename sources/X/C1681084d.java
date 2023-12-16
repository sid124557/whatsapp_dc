package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.84d  reason: invalid class name and case insensitive filesystem */
public class C1681084d implements C185318tS {
    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        AnonymousClass7JG r6 = (AnonymousClass7JG) obj3;
        AnonymousClass7JG r7 = (AnonymousClass7JG) obj4;
        return (r6.A01 == r7.A01 && r6.A00 == r7.A00 && r6.A02.equals(r7.A02)) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        C06440Xs layoutManager;
        AnonymousClass6NE r12 = (AnonymousClass6NE) obj2;
        if (obj3 != null) {
            C125336Hk r7 = r12.A0E;
            AnonymousClass7JG r13 = (AnonymousClass7JG) obj3;
            int i = r7.A00;
            int i2 = r13.A00;
            boolean z = true;
            boolean z2 = false;
            boolean A1X = AnonymousClass001.A1X(i, i2);
            int i3 = r7.A01;
            int i4 = r13.A01;
            boolean A1X2 = AnonymousClass001.A1X(i3, i4);
            RecyclerView recyclerView = r7.A02;
            if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                if ((!layoutManager.A17() || !A1X) && (!layoutManager.A18() || !A1X2)) {
                    z = false;
                }
                z2 = z;
            }
            r7.A01 = i4;
            r7.A00 = i2;
            List list = r7.A03;
            r7.A03 = r13.A02;
            if (z2) {
                r7.A05();
                return null;
            }
            AnonymousClass0SC.A00(new AnonymousClass6H9(r7, list)).A02(r7);
            return null;
        }
        throw AnonymousClass001.A0e("List data was not computed during layout");
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
