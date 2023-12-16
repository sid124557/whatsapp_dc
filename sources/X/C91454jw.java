package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4jw  reason: invalid class name and case insensitive filesystem */
public abstract class C91454jw extends C131806eD {
    public C29201iR A00;
    public AnonymousClass5UW A01;
    public C181728nE A02;
    public C105145Tt A03;
    public C181798nL A04;
    public UserJid A05;
    public C103115Lp A06;
    public String A07;
    public final AnonymousClass66R A08 = C154517dI.A01(new C119105wR(this));
    public final AnonymousClass66R A09 = C154517dI.A01(new C119115wS(this));

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        View A0F = C86644Kx.A0F(findItem, R.layout.f8nameremoved);
        C162457s7.A0H(A0F);
        C107295b4.A02(A0F);
        View actionView = findItem.getActionView();
        C162457s7.A0H(actionView);
        C109315eQ.A01(actionView, this, 26);
        View actionView2 = findItem.getActionView();
        C162457s7.A0H(actionView2);
        TextView A092 = AnonymousClass002.A09(actionView2, R.id.cart_total_quantity);
        if (this.A07 != null) {
            C162457s7.A0H(A092);
            A092.setText(this.A07);
        }
        AnonymousClass66R r3 = this.A08;
        C86604Kt.A1N(this, ((C87604Ty) r3.getValue()).A00, new C175428Yi(findItem, this), 162);
        ((C87604Ty) r3.getValue()).A0E();
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("business_owner_jid", A74());
    }

    public final UserJid A74() {
        UserJid userJid = this.A05;
        if (userJid != null) {
            return userJid;
        }
        throw C18270x1.A0S("bizJid");
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        if (bundle == null) {
            parcelable = getIntent().getParcelableExtra("business_owner_jid");
        } else {
            parcelable = bundle.getParcelable("business_owner_jid");
        }
        C626936e.A06(parcelable);
        C162457s7.A0H(parcelable);
        UserJid userJid = (UserJid) parcelable;
        C162457s7.A0J(userJid, 0);
        this.A05 = userJid;
        AnonymousClass66R r3 = this.A09;
        C86604Kt.A1N(this, ((AnonymousClass6H0) r3.getValue()).A00, new AnonymousClass60R(this), 160);
        C86604Kt.A1N(this, ((AnonymousClass6H0) r3.getValue()).A01, new AnonymousClass60S(this), 161);
    }

    public void onResume() {
        super.onResume();
        ((AnonymousClass6H0) this.A09.getValue()).A04.A00();
    }
}
