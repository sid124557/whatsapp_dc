package X;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.53e  reason: invalid class name and case insensitive filesystem */
public final class C987753e extends C88504Yz implements C15590rc {
    public final UpdatesFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C987753e(View view, C620733j r13, AnonymousClass1VX r14, AnonymousClass5UP r15, UpdatesFragment updatesFragment) {
        super(view);
        C18260x0.A0Z(r14, r13, r15, 1);
        this.A00 = updatesFragment;
        TextView A09 = AnonymousClass002.A09(view, R.id.update_title);
        A09.setText(R.string.f11nameremoved);
        C106905aM.A04(A09);
        C18290x4.A0M(view, R.id.divider).setVisibility(0);
        C18290x4.A0M(view, R.id.more_button).setVisibility(8);
        View view2 = this.A0H;
        View findViewById = view2.findViewById(R.id.add_update_button);
        if (r15.A00() || r15.A01()) {
            C162457s7.A0H(findViewById);
            C05430Th r5 = new C05430Th(C86634Kw.A0B(findViewById, view2), findViewById, C86664Kz.A04(C620733j.A04(r13) ? 1 : 0), 0, AnonymousClass29M.A00(r14));
            AnonymousClass02O r4 = new AnonymousClass02O(r5.A02);
            C07890cz r3 = r5.A04;
            r4.inflate(R.menu.f10nameremoved, r3);
            C109395eY.A00(findViewById, r5, 14);
            C18300x5.A13(view2.getContext(), findViewById, R.string.f11nameremoved);
            r5.A01 = this;
            r3.findItem(R.id.menu_item_discover_newsletters).setVisible(r15.A01());
            r3.findItem(R.id.menu_item_add_newsletter).setVisible(r15.A00());
        } else {
            C162457s7.A0H(findViewById);
            findViewById.setVisibility(8);
        }
        C107295b4.A06(view, true);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem == null) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (Integer.valueOf(itemId) == null) {
            return true;
        }
        if (itemId == R.id.menu_item_discover_newsletters) {
            this.A00.A1Q(2);
            return true;
        } else if (itemId != R.id.menu_item_add_newsletter) {
            return true;
        } else {
            UpdatesFragment updatesFragment = this.A00;
            AnonymousClass5YD r1 = updatesFragment.A0X;
            if (r1 != null) {
                r1.A0F(true);
                C105325Um r3 = updatesFragment.A0Y;
                if (r3 != null) {
                    C003203q A0Q = updatesFragment.A0Q();
                    AnonymousClass0x9.A1L(A0Q);
                    AnonymousClass1VX r0 = r3.A03;
                    r3.A02((C89654ea) A0Q, C106505Zg.A01(r0), C106505Zg.A00(r0));
                    return true;
                }
                throw C18270x1.A0S("newsletterLauncher");
            }
            throw C18270x1.A0S("newsletterLogging");
        }
    }
}
