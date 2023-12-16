package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass303;
import X.AnonymousClass5V0;
import X.AnonymousClass97V;
import X.AnonymousClass9PI;
import X.AnonymousClass9QJ;
import X.AnonymousClass9QM;
import X.AnonymousClass9U5;
import X.AnonymousClass9V7;
import X.C05570Ua;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C191319El;
import X.C19340zH;
import X.C193629Pj;
import X.C194649Ty;
import X.C203499no;
import X.C204019og;
import X.C204379pG;
import X.C40602Ha;
import X.C56972sr;
import X.C624034w;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C88834as;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.whatsapp.R;

public class BrazilPaymentTransactionDetailActivity extends PaymentTransactionDetailsListActivity {
    public AnonymousClass9PI A00;
    public C203499no A01;
    public C194649Ty A02;
    public AnonymousClass9QM A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            C1899593h.A15(r1, this);
            C107695bk r2 = r1.A00;
            C1899593h.A0z(r1, r2, this, C1899593h.A0W(r1, r2, this));
            AnonymousClass97V.A0Y(r1, r2, this);
            AnonymousClass97V.A0X(r1, r2, this);
            this.A0M = C1899593h.A0I(r1);
            AnonymousClass97V.A0L(A0I, r1, r2, this, r1.AMe.get());
            AnonymousClass97V.A0C(A0I, r1, r2, this);
            this.A02 = (C194649Ty) r2.A1I.get();
            this.A03 = (AnonymousClass9QM) r2.A1M.get();
            this.A01 = C1899593h.A0M(r2);
            this.A00 = new AnonymousClass9PI((C69263Wi) r1.AG7.get(), (C56972sr) r1.AJW.get(), (C40602Ha) r1.APq.get(), (AnonymousClass9U5) r1.AQ5.get());
        }
    }

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        if (i == 217) {
            return new C191319El(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        return super.A74(viewGroup, i);
    }

    public void A78(AnonymousClass9QJ r6) {
        C624034w r1;
        String str;
        int i = r6.A00;
        if (i != 10) {
            if (i != 201) {
                switch (i) {
                    case 22:
                        break;
                    case 23:
                        A7B(r6, 124, "wa_p2m_receipt_report_transaction");
                        break;
                    case 24:
                        Intent A08 = AnonymousClass0x9.A08(this, BrazilPaymentSettingsActivity.class);
                        A08.putExtra("referral_screen", "chat");
                        startActivity(A08);
                        finish();
                        return;
                }
            } else {
                C624034w r4 = r6.A05;
                if (r4 != null) {
                    C19340zH A002 = AnonymousClass5V0.A00(this);
                    A002.A0U(R.string.f11nameremoved);
                    C19340zH.A01(getBaseContext(), A002, R.string.f11nameremoved);
                    A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                    A002.A0Y(new C204379pG(r4, 9, this), R.string.f11nameremoved);
                    C18280x3.A0q(A002);
                    A79(AnonymousClass001.A0f(), 161);
                    return;
                }
                return;
            }
        }
        if (i == 22) {
            C193629Pj r0 = this.A0P.A06;
            if (r0 != null) {
                r1 = r0.A01;
            } else {
                r1 = r6.A05;
            }
            if (r1 == null || !AnonymousClass9V7.A00(r1)) {
                str = null;
            } else if (r1.A03 == 200) {
                str = "wa_smb_p2m_payment_details";
            } else {
                str = "wa_p2m_receipt_support";
            }
            A7B(r6, 39, str);
        } else {
            A79(AnonymousClass001.A0f(), 39);
        }
        super.A78(r6);
    }

    public final void A7B(AnonymousClass9QJ r9, Integer num, String str) {
        C624034w r2;
        AnonymousClass303 A0K;
        C193629Pj r0 = this.A0P.A06;
        if (r0 != null) {
            r2 = r0.A01;
        } else {
            r2 = r9.A05;
        }
        if (r2 == null || !AnonymousClass9V7.A00(r2)) {
            A0K = C1899593h.A0K();
        } else {
            A0K = C1899593h.A0K();
            A0K.A03("product_flow", "p2m");
            A0K.A03("transaction_id", r2.A0K);
            C1899693i.A0q(r2, A0K);
            A0K.A03("transaction_status_name", this.A0B.A0C(this.A0S.A0B(r2)));
        }
        A0K.A03("hc_entrypoint", str);
        A0K.A03("app_type", "consumer");
        this.A01.BKE(A0K, AnonymousClass001.A0f(), num, "payment_transaction_details", (String) null);
    }

    public BrazilPaymentTransactionDetailActivity(int i) {
        this.A04 = false;
        C204019og.A00(this, 35);
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0f = AnonymousClass001.A0f();
        A79(A0f, A0f);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            Integer A0f = AnonymousClass001.A0f();
            A79(A0f, A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BrazilPaymentTransactionDetailActivity() {
        this(0);
    }
}
