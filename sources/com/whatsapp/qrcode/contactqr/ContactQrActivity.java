package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass1Hf;
import X.AnonymousClass4BC;
import X.AnonymousClass4SG;
import X.AnonymousClass9Th;
import X.C107335b8;
import X.C107695bk;
import X.C18280x3;
import X.C1892490o;
import X.C42182Nc;
import X.C48352el;
import X.C57162tC;
import X.C64333Db;
import X.C66413Li;
import X.C85244Fm;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C97644yu;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

public class ContactQrActivity extends C97644yu implements AnonymousClass4BC {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db r1 = AnonymousClass4SG.A2X(this).A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A0K = C86604Kt.A0Z(r1);
            this.A03 = C86614Ku.A0J(r1);
            this.A06 = (C85244Fm) r1.AJ2.get();
            this.A09 = C86604Kt.A0P(r1);
            this.A0V = C86614Ku.A0m(r1);
            this.A0C = C86604Kt.A0R(r1);
            this.A05 = (C48352el) r1.A7i.get();
            this.A0O = C86614Ku.A0f(r1);
            this.A0D = (C66413Li) r1.A6U.get();
            this.A04 = C86604Kt.A0N(r1);
            this.A0L = C86614Ku.A0c(r1);
            this.A0H = C86604Kt.A0W(r1);
            this.A0J = (C42182Nc) r1.A7X.get();
            this.A0B = C86644Kx.A0S(r1);
            this.A0G = C86614Ku.A0V(r1);
            this.A0E = C86634Kw.A0c(r1);
            this.A0N = C86614Ku.A0e(r1);
            this.A0M = C107695bk.A2k(r1);
            this.A0P = (AnonymousClass9Th) r1.APb.get();
            this.A0A = C86644Kx.A0R(r1);
            this.A0I = C86634Kw.A0d(r1);
            this.A08 = C107695bk.A0c(r1);
            this.A0F = (C57162tC) r1.AaV.get();
        }
    }

    public ContactQrActivity(int i) {
        this.A00 = false;
        C86604Kt.A1K(this, 82);
    }

    public void A74() {
        super.A74();
        if (getResources().getBoolean(R.bool.f4nameremoved)) {
            setRequestedOrientation(1);
        }
        this.A0W = C18280x3.A0Z(AnonymousClass1Hf.A27(this), "contact_qr_code");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.f11nameremoved).setIcon(C107335b8.A04(this, R.drawable.ic_share, R.color.f5nameremoved)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.f11nameremoved);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            A75();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A6a(new C1892490o(this, 2), new C1892490o(this, 3), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            return true;
        }
    }

    public ContactQrActivity() {
        this(0);
    }
}
