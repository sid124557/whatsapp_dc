package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0YG;
import X.AnonymousClass0x9;
import X.AnonymousClass2T7;
import X.AnonymousClass4DI;
import X.AnonymousClass5V0;
import X.AnonymousClass5Yj;
import X.AnonymousClass95G;
import X.AnonymousClass97Z;
import X.AnonymousClass9U4;
import X.AnonymousClass9UF;
import X.AnonymousClass9dO;
import X.C06560Yg;
import X.C105225Ub;
import X.C160757oG;
import X.C18280x3;
import X.C18300x5;
import X.C1899593h;
import X.C1907099n;
import X.C191779Gk;
import X.C191909Gx;
import X.C19340zH;
import X.C194459Sy;
import X.C194539Ti;
import X.C195219Wq;
import X.C196419ao;
import X.C202159lT;
import X.C202509m8;
import X.C202669mO;
import X.C203499no;
import X.C203719oC;
import X.C204219p0;
import X.C204249p3;
import X.C29271iY;
import X.C620733j;
import X.C66533Lu;
import X.C66543Lv;
import X.C66663Mh;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.ArrayList;

public class PaymentTransactionHistoryActivity extends AnonymousClass97Z implements C202509m8, C202669mO, C202159lT {
    public int A00;
    public View A01;
    public ProgressBar A02;
    public TextView A03;
    public C620733j A04;
    public C66543Lv A05;
    public C66533Lu A06;
    public C95814uZ A07;
    public C194539Ti A08;
    public C29271iY A09;
    public C1907099n A0A;
    public AnonymousClass9U4 A0B;
    public C196419ao A0C;
    public C191779Gk A0D;
    public C191909Gx A0E;
    public AnonymousClass95G A0F;
    public C194459Sy A0G;
    public MultiExclusionChipGroup A0H;
    public C195219Wq A0I;
    public C105225Ub A0J;
    public String A0K;
    public String A0L;
    public ArrayList A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public final AnonymousClass4DI A0U = new AnonymousClass9UF(this, 3);
    public final C160757oG A0V = C160757oG.A00("PaymentTransactionHistoryActivity", "payment-settings", "COMMON");
    public final AnonymousClass2T7 A0W = new AnonymousClass2T7();
    public final ArrayList A0X = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r15.A0A.A01() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r5 = r15
            X.C1899593h.A0h(r15)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "extra_payment_service_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            r15.A0K = r0
            r0 = r16
            super.onCreate(r0)
            X.99n r0 = r15.A0A
            boolean r2 = X.C1899693i.A0x(r0)
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0028
            X.99n r2 = r15.A0A
            boolean r3 = r2.A01()
            r2 = 0
            if (r3 == 0) goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            X.C626936e.A0C(r2)
            r2 = 2131625711(0x7f0e06ef, float:1.8878638E38)
            r15.setContentView((int) r2)
            android.content.Intent r4 = r15.getIntent()
            java.lang.String r3 = "extra_payment_flow_entry_point"
            r2 = 3
            int r2 = r4.getIntExtra(r3, r2)
            r15.A00 = r2
            X.4FS r4 = r15.A04
            X.9Ti r3 = r15.A08
            java.util.Objects.requireNonNull(r3)
            X.9gk r2 = new X.9gk
            r2.<init>(r3)
            r4.BkM(r2)
            X.1iY r3 = r15.A09
            X.4DI r2 = r15.A0U
            r3.A06(r2)
            boolean r2 = r15 instanceof com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity
            X.9Wq r12 = r15.A0I
            X.33j r6 = r15.A04
            X.7oG r9 = r15.A0V
            X.3Lv r7 = r15.A05
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            X.9Sy r11 = r15.A0G
            int r14 = r15.A00
            if (r2 == 0) goto L_0x015f
            X.9Dl r4 = new X.9Dl
            r10 = r15
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0070:
            r15.A0F = r4
            r2 = 2131434415(0x7f0b1baf, float:1.8490643E38)
            android.view.View r3 = r15.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            X.95G r2 = r15.A0F
            r3.setAdapter(r2)
            X.AnonymousClass0YZ.A0G(r3, r1)
            r2 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r2 = r15.findViewById(r2)
            X.AnonymousClass0YZ.A0G(r2, r1)
            r2 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r15.A02 = r2
            r2.setVisibility(r0)
            r2 = 2131429756(0x7f0b097c, float:1.8481194E38)
            android.view.View r2 = r15.findViewById(r2)
            r15.A01 = r2
            r2 = 2131429753(0x7f0b0979, float:1.8481188E38)
            android.widget.TextView r2 = X.C18310x6.A0L(r15, r2)
            r15.A03 = r2
            androidx.appcompat.widget.Toolbar r8 = X.C1899593h.A07(r15)
            r15.setSupportActionBar(r8)
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_empty_list_screen"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0P = r2
            X.33j r9 = r15.A04
            r2 = 2131433301(0x7f0b1755, float:1.8488384E38)
            android.view.View r6 = r15.findViewById(r2)
            r2 = 3
            X.9UH r7 = new X.9UH
            r7.<init>(r15, r2)
            X.5Ub r4 = new X.5Ub
            r4.<init>(r5, r6, r7, r8, r9)
            r15.A0J = r4
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_for_mandates"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0R = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_mandate_pending_requests"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0Q = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_show_requests"
            boolean r2 = r3.getBooleanExtra(r2, r0)
            r15.A0S = r2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r2 = "extra_disable_search"
            boolean r0 = r3.getBooleanExtra(r2, r0)
            r15.A0N = r0
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_predefined_search_filter"
            android.os.Parcelable r2 = r2.getParcelableExtra(r0)
            X.38i r2 = (X.C632038i) r2
            if (r2 == 0) goto L_0x0118
            X.2T7 r0 = r15.A0W
            r0.A01 = r2
        L_0x0118:
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_jid"
            java.lang.String r2 = r2.getStringExtra(r0)
            X.5Yw r0 = X.C95814uZ.A00
            X.4uZ r0 = r0.A05(r2)
            r15.A07 = r0
            X.0R8 r4 = r15.getSupportActionBar()
            if (r4 == 0) goto L_0x0146
            boolean r0 = r15.A0S
            if (r0 == 0) goto L_0x0147
            android.content.res.Resources r3 = r15.getResources()
            r2 = 2131755269(0x7f100105, float:1.9141413E38)
            r0 = 2
            java.lang.String r2 = r3.getQuantityString(r2, r0)
        L_0x0140:
            r4.A0J(r2)
            r4.A0N(r1)
        L_0x0146:
            return
        L_0x0147:
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r0 = "extra_list_screen_configurable_title"
            java.lang.String r2 = r2.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0140
            r0 = 2131892121(0x7f121799, float:1.9418981E38)
            java.lang.String r2 = r15.getString(r0)
            goto L_0x0140
        L_0x015f:
            X.95G r4 = new X.95G
            r10 = r15
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onSearchRequested() {
        this.A0J.A02(false);
        C105225Ub r2 = this.A0J;
        String string = getString(R.string.f11nameremoved);
        SearchView searchView = r2.A02;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        View findViewById = findViewById(R.id.search_back);
        if (this.A06.A08(C66663Mh.A0m) && !this.A0S && (this.A0O || this.A0T)) {
            C18280x3.A0r(this, R.id.appBarLayout, 0);
            if (this.A0H == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) C06560Yg.A02(findViewById(R.id.payment_filters), R.id.payment_filter_group);
                this.A0H = multiExclusionChipGroup;
                String string2 = getString(R.string.f11nameremoved);
                String string3 = getString(R.string.f11nameremoved);
                String string4 = getString(R.string.f11nameremoved);
                String string5 = getString(R.string.f11nameremoved);
                MultiExclusionChip A74 = A74(string2);
                MultiExclusionChip A742 = A74(string3);
                MultiExclusionChip A743 = A74(string4);
                MultiExclusionChip A744 = A74(string5);
                if (this.A0T) {
                    ArrayList A0s = C18300x5.A0s(A74);
                    A0s.add(A742);
                    multiExclusionChipGroup.A00(A0s);
                }
                if (this.A0O) {
                    ArrayList A0s2 = C18300x5.A0s(A743);
                    A0s2.add(A744);
                    multiExclusionChipGroup.A00(A0s2);
                }
                multiExclusionChipGroup.A00 = new AnonymousClass9dO(this, A74, A742, A743, A744);
            }
            this.A0H.setVisibility(0);
        }
        C204249p3.A02(findViewById, this, 112);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.9Gk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.9Gx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.9Gk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.9Gk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A75() {
        /*
            r13 = this;
            X.9Gk r0 = r13.A0D
            r1 = 1
            if (r0 == 0) goto L_0x0008
            r0.A0D(r1)
        L_0x0008:
            X.9Gx r0 = r13.A0E
            if (r0 == 0) goto L_0x000f
            r0.A0D(r1)
        L_0x000f:
            boolean r2 = r13.A0P
            r0 = 0
            android.view.View r1 = r13.A01
            if (r2 == 0) goto L_0x001a
            r1.setVisibility(r0)
            return
        L_0x001a:
            r0 = 8
            r1.setVisibility(r0)
            X.3Mh r1 = r13.A06
            X.1Ei r0 = X.C66663Mh.A0m
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r13.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0057
            X.4uZ r0 = r13.A07
            if (r0 != 0) goto L_0x0057
            X.9Wq r10 = r13.A0I
            X.33j r4 = r13.A04
            X.3Lu r5 = r13.A06
            X.9U4 r6 = r13.A0B
            X.9Sy r9 = r13.A0G
            java.lang.String r11 = r13.A0L
            boolean r12 = r13.A0S
            X.2T7 r7 = r13.A0W
            X.9Qm r8 = new X.9Qm
            r8.<init>(r13)
            X.9Gx r3 = new X.9Gx
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A0E = r3
        L_0x0051:
            X.4FS r0 = r13.A04
            X.AnonymousClass0x7.A1B(r3, r0)
            return
        L_0x0057:
            java.util.ArrayList r2 = r13.A0M
            X.9Qm r1 = new X.9Qm
            r1.<init>(r13)
            X.9Sy r0 = r13.A0G
            X.9Gk r3 = new X.9Gk
            r3.<init>(r1, r13, r0, r2)
            r13.A0D = r3
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.A75():void");
    }

    public final void A76() {
        this.A0J.A01(true);
        MultiExclusionChipGroup multiExclusionChipGroup = this.A0H;
        if (multiExclusionChipGroup != null) {
            for (int i = 0; i < multiExclusionChipGroup.getChildCount(); i++) {
                ((CompoundButton) multiExclusionChipGroup.getChildAt(i)).setChecked(false);
            }
            this.A0H.setVisibility(8);
        }
        A75();
    }

    public final void A77() {
        C203719oC A0G2;
        if (TextUtils.isEmpty(this.A0K) || (A0G2 = this.A0B.A0H(this.A0K)) == null) {
            A0G2 = this.A0B.A0G();
        }
        C203499no B7b = A0G2.B7b();
        if (B7b != null) {
            Integer A0f = AnonymousClass001.A0f();
            B7b.BKB(A0f, A0f, "payment_transaction_history", (String) null);
        }
    }

    public void BQa(String str) {
        this.A0F.A05();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0i(false);
        C204219p0.A01(A002, this, 82, R.string.f11nameremoved);
        A002.A0U(R.string.f11nameremoved);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0N && !this.A0P) {
            menu.add(0, R.id.menuitem_search, 0, getString(R.string.f11nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final MultiExclusionChip A74(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        AnonymousClass0YG.A06(multiExclusionChip.getCheckedIcon(), getResources().getColor(AnonymousClass5Yj.A02(multiExclusionChip.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    public final boolean A78() {
        C203719oC A0G2;
        if (!isTaskRoot()) {
            return false;
        }
        if (TextUtils.isEmpty(this.A0K) || (A0G2 = this.A0B.A0H(this.A0K)) == null) {
            A0G2 = this.A0B.A0G();
        }
        Class BBA = A0G2.BBA();
        C1899593h.A1H(this.A0V, BBA, "PaymentTransactionHistoryActivity maybeOpenPaymentSettings ", AnonymousClass001.A0o());
        Intent A082 = AnonymousClass0x9.A08(this, BBA);
        finishAndRemoveTask();
        startActivity(A082);
        return true;
    }

    public void onBackPressed() {
        A77();
        if (this.A0J.A03()) {
            A76();
        } else if (!A78()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C191779Gk r0 = this.A0D;
        if (r0 != null) {
            r0.A0D(true);
        }
        C191909Gx r02 = this.A0E;
        if (r02 != null) {
            r02.A0D(true);
        }
        this.A09.A07(this.A0U);
        this.A0D = null;
        this.A0E = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A77();
            finish();
            A78();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0S = bundle.getBoolean("extra_show_requests");
        this.A07 = C95814uZ.A00.A05(bundle.getString("extra_jid"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0S);
        C95814uZ r0 = this.A07;
        if (r0 != null) {
            bundle.putString("extra_jid", r0.getRawString());
        }
    }

    public void onStart() {
        super.onStart();
        A75();
        C196419ao r0 = this.A0C;
        r0.A01();
        r0.A02(this);
    }

    public void onStop() {
        super.onStop();
        C191779Gk r0 = this.A0D;
        if (r0 != null) {
            r0.A0D(true);
        }
        C191909Gx r02 = this.A0E;
        if (r02 != null) {
            r02.A0D(true);
        }
        this.A0D = null;
        this.A0E = null;
        this.A0C.A03(this);
    }

    public void BXw() {
        A75();
    }
}
