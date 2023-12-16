package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5aJ  reason: invalid class name and case insensitive filesystem */
public class C106875aJ implements C184108rG {
    public Object A00;
    public final int A01;

    public C106875aJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BV5(C109015dw r6, long j) {
        View A0J;
        C620733j r3;
        int i = this.A01;
        Object obj = this.A00;
        if (3 - i != 0) {
            C89654ea r0 = (C89654ea) obj;
            A0J = r0.A00;
            r3 = r0.A00;
        } else {
            BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) obj;
            A0J = businessProductListBaseFragment.A0J();
            r3 = businessProductListBaseFragment.A0C;
            if (r3 == null) {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, j);
        C86644Kx.A16(A0J, r3.A0L(A0L, R.plurals.f9nameremoved, j), -1);
    }

    public void BZG(C109015dw r10, String str, String str2, String str3, int i, long j) {
        C104325Qn r1;
        UserJid userJid;
        switch (this.A01) {
            case 0:
                C87614Tz r0 = ((C90504hW) this.A00).A0I;
                r1 = r0.A0O;
                userJid = r0.A0T;
                break;
            case 1:
                AnonymousClass4Tu r02 = ((ProductListActivity) this.A00).A0I;
                r1 = r02.A06;
                userJid = r02.A09;
                break;
            case 2:
                C87594Tr r03 = ((C90604hu) this.A00).A0H;
                r1 = r03.A05;
                userJid = r03.A06;
                break;
            default:
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                userJid = businessProductListBaseFragment.A1L();
                r1 = ((C125216Gu) businessProductListBaseFragment.A0L.getValue()).A02;
                break;
        }
        r1.A01(r10, userJid, str, str2, str3, j);
    }
}
