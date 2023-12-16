package com.whatsapp.group;

import X.AnonymousClass0R8;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass34R;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5UY;
import X.C08270df;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C19410zx;
import X.C27581e9;
import X.C56892sj;
import X.C58422vE;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

public final class GroupPendingParticipantsActivity extends C89644eZ {
    public C56892sj A00;
    public boolean A01;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A0Y = this.A0D.A0Y(C58422vE.A02, 3571);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        String stringExtra = getIntent().getStringExtra("gid");
        if (stringExtra != null) {
            C56892sj r1 = this.A00;
            if (r1 != null) {
                boolean A0D = r1.A0D(AnonymousClass34R.A05(stringExtra));
                AnonymousClass1Hf.A2E(this);
                ViewPager viewPager = (ViewPager) C18290x4.A0N(this, R.id.pending_participants_root_layout);
                AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.pending_participants_tabs);
                if (A0Y) {
                    A1p.A06(0);
                    C08270df supportFragmentManager = getSupportFragmentManager();
                    View A04 = A1p.A04();
                    C162457s7.A0D(A04);
                    viewPager.setAdapter(new C27581e9(this, supportFragmentManager, (PagerSlidingTabStrip) A04, stringExtra, A0D));
                    ((PagerSlidingTabStrip) A1p.A04()).setViewPager(viewPager);
                    AnonymousClass0YY.A06(A1p.A04(), 2);
                    AnonymousClass0YH.A06(A1p.A04(), 0);
                    AnonymousClass0R8 supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A08(0.0f);
                        return;
                    }
                    return;
                }
                viewPager.setAdapter(new C19410zx(this, getSupportFragmentManager(), stringExtra, false, A0D));
                return;
            }
            throw C18270x1.A0S("groupParticipantsManager");
        }
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A00 = C64333Db.A3G(A002);
        }
    }

    public GroupPendingParticipantsActivity(int i) {
        this.A01 = false;
        AnonymousClass4HY.A00(this, 64);
    }

    public GroupPendingParticipantsActivity() {
        this(0);
    }
}
