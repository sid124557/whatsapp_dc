package com.whatsapp.status.seeall;

import X.AnonymousClass08A;
import X.AnonymousClass0UY;
import X.AnonymousClass1Hf;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5CM;
import X.AnonymousClass5FA;
import X.AnonymousClass5MF;
import X.AnonymousClass62O;
import X.AnonymousClass648;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C101165Ds;
import X.C101175Dt;
import X.C105225Ub;
import X.C106905aM;
import X.C107695bk;
import X.C109495ei;
import X.C110565gf;
import X.C124086Ax;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C627136h;
import X.C627736r;
import X.C64333Db;
import X.C85334Fv;
import X.C85344Fw;
import X.C86604Kt;
import X.C86644Kx;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class StatusSeeAllActivity extends C89644eZ implements C85334Fv, C85344Fw, AnonymousClass648 {
    public ViewGroup A00;
    public TextView A01;
    public RecyclerView A02;
    public C101165Ds A03;
    public C101175Dt A04;
    public AnonymousClass5FA A05;
    public WaTextView A06;
    public C105225Ub A07;
    public StatusSeeAllAdapter A08;
    public StatusSeeAllViewModel A09;
    public StatusesViewModel A0A;
    public boolean A0B;

    public void onCreate(Bundle bundle) {
        AnonymousClass4SG.A37(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        A28.setTitle((int) R.string.f11nameremoved);
        setSupportActionBar(A28);
        AnonymousClass1Hf.A2E(this);
        this.A07 = new C105225Ub(this, AnonymousClass4SG.A2R(this), new AnonymousClass5CM(this, 11), A28, this.A00);
        AnonymousClass5FA r1 = this.A05;
        if (r1 != null) {
            StatusesViewModel A002 = C110565gf.A00(this, r1, true);
            this.A0A = A002;
            C101175Dt r12 = this.A04;
            if (r12 == null) {
                throw C18270x1.A0S("viewModelFactory");
            } else if (A002 == null) {
                throw C18270x1.A0S("statusesViewModel");
            } else {
                this.A09 = (StatusSeeAllViewModel) C124086Ax.A00(this, A002, r12, 12).A01(StatusSeeAllViewModel.class);
                AnonymousClass08A r13 = this.A06;
                StatusesViewModel statusesViewModel = this.A0A;
                if (statusesViewModel == null) {
                    throw C18270x1.A0S("statusesViewModel");
                }
                r13.A00(statusesViewModel);
                AnonymousClass08A r14 = this.A06;
                StatusSeeAllViewModel statusSeeAllViewModel = this.A09;
                if (statusSeeAllViewModel == null) {
                    throw C86604Kt.A0j();
                }
                r14.A00(statusSeeAllViewModel);
                C101165Ds r15 = this.A03;
                if (r15 != null) {
                    AnonymousClass4FS A8y = C64333Db.A8y(r15.A00.A03);
                    C64333Db r0 = r15.A00.A03;
                    StatusSeeAllAdapter statusSeeAllAdapter = new StatusSeeAllAdapter((AnonymousClass5MF) r0.A00.A2a.get(), C64333Db.A29(r0), C64333Db.A2q(r0), this, A8y);
                    this.A08 = statusSeeAllAdapter;
                    this.A06.A00(statusSeeAllAdapter);
                    this.A01 = (TextView) C18290x4.A0N(this, R.id.see_all_empty_text);
                    WaTextView waTextView = (WaTextView) C18290x4.A0N(this, R.id.view_all_text);
                    this.A06 = waTextView;
                    if (waTextView == null) {
                        throw C18270x1.A0S("seeAllText");
                    }
                    C106905aM.A04(waTextView);
                    this.A00 = (ViewGroup) C18290x4.A0N(this, R.id.empty_text_container);
                    View findViewById = findViewById(R.id.see_all_status_list);
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    StatusSeeAllAdapter statusSeeAllAdapter2 = this.A08;
                    if (statusSeeAllAdapter2 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    recyclerView.setAdapter(statusSeeAllAdapter2);
                    C18270x1.A0u(recyclerView);
                    recyclerView.setItemAnimator((AnonymousClass0UY) null);
                    C162457s7.A0D(findViewById);
                    this.A02 = recyclerView;
                    StatusSeeAllViewModel statusSeeAllViewModel2 = this.A09;
                    if (statusSeeAllViewModel2 == null) {
                        throw C86604Kt.A0j();
                    }
                    AnonymousClass6C6.A02(this, statusSeeAllViewModel2.A00, new AnonymousClass62O(this), 349);
                    return;
                }
                throw C18270x1.A0S("adapterFactory");
            }
        } else {
            throw C18270x1.A0S("statusesViewModelFactory");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        menu.add(0, 1002, 0, R.string.f11nameremoved);
        MenuItem add = menu.add(0, 1001, 0, R.string.f11nameremoved);
        View A0F = C86644Kx.A0F(add, R.layout.f8nameremoved);
        if (A0F != null) {
            C109495ei.A00(A0F, this, add, 5);
        }
        add.setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A03 = (C101165Ds) A2W.A4I.get();
            this.A05 = (AnonymousClass5FA) r1.A0a.get();
            this.A04 = (C101175Dt) A2W.A02.get();
        }
    }

    public void BR7(DialogFragment dialogFragment, boolean z) {
    }

    public void onBackPressed() {
        C105225Ub r0 = this.A07;
        if (r0 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        } else if (C86604Kt.A1Y(r0.A04)) {
            C105225Ub r1 = this.A07;
            if (r1 == null) {
                throw C18270x1.A0S("searchToolbarHelper");
            }
            r1.A01(true);
        } else {
            super.onBackPressed();
        }
    }

    public StatusSeeAllActivity(int i) {
        this.A0B = false;
        AnonymousClass68W.A00(this, C627136h.A03);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1001) {
            C105225Ub r1 = this.A07;
            if (r1 == null) {
                throw C18270x1.A0S("searchToolbarHelper");
            }
            r1.A02(false);
            C18280x3.A0o(findViewById(R.id.search_back), this, 6);
        } else if (A042 == 1002) {
            startActivity(C627736r.A07(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public StatusSeeAllActivity() {
        this(0);
    }
}
