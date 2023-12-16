package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.List;

/* renamed from: X.9Bv  reason: invalid class name */
public abstract class AnonymousClass9Bv extends AnonymousClass9DH {
    public AnonymousClass9U4 A00;
    public C1902194o A01;

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        if (i == 300) {
            return new C191269Eg(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 301) {
            return new C191229Ec(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 303) {
            return new AnonymousClass9EV(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i != 305) {
            return super.A74(viewGroup, i);
        }
        return new C191259Ef(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }

    public Dialog onCreateDialog(int i) {
        CharSequence charSequence;
        boolean z = false;
        if (i == 200) {
            charSequence = getString(R.string.f11nameremoved);
        } else if (i != 201) {
            return super.onCreateDialog(i);
        } else {
            z = true;
            int size = AnonymousClass9U4.A01(this.A00).A0N(1).size();
            int i2 = R.string.f11nameremoved;
            if (size > 0) {
                i2 = R.string.f11nameremoved;
            }
            charSequence = C107345b9.A05(this, this.A0C, getString(i2));
        }
        String string = getString(R.string.f11nameremoved);
        int i3 = 200;
        if (z) {
            i3 = 201;
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(charSequence);
        A002.A0i(true);
        A002.A0W(new C204429pL(this, i3, 2), R.string.f11nameremoved);
        A002.A00.A0I(new C204299p8(this, i3, 0, z), string);
        A002.A0V(new C204239p2(this, i3, 2));
        return A002.create();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        C1902194o r3 = (C1902194o) AnonymousClass4L0.A0F(new C203799oK(brazilMerchantDetailsListActivity, 0, brazilMerchantDetailsListActivity.A08), brazilMerchantDetailsListActivity).A01(C1902194o.class);
        brazilMerchantDetailsListActivity.A07 = r3;
        r3.A03.A0B(r3.A07, C205049qL.A00(brazilMerchantDetailsListActivity, 4));
        C1902194o r32 = brazilMerchantDetailsListActivity.A07;
        this.A01 = r32;
        r32.A00.A0B(r32.A07, C205049qL.A00(this, 54));
        C1902194o r33 = this.A01;
        r33.A04.A0B(r33.A07, C205049qL.A00(this, 55));
        C1902194o r2 = this.A01;
        r2.A0T.BkM(new AnonymousClass9h4(r2));
        this.A01.setLockIconVisibility(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.f11nameremoved));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        }
        C1902194o r5 = this.A01;
        List A0A = AnonymousClass9U4.A03(r5.A0P).A0A();
        C160757oG r2 = r5.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("Remove merchant account. #methods=", A0o, A0A);
        C1899593h.A1F(r2, A0o);
        int i = 1;
        if (A0A.size() <= 1) {
            i = 0;
        }
        r5.A04.A0H(new C193079Nb(i));
        return true;
    }
}
