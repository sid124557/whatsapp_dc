package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass30B;
import X.AnonymousClass4EE;
import X.AnonymousClass4SG;
import X.AnonymousClass5O9;
import X.AnonymousClass5ZM;
import X.AnonymousClass5ZR;
import X.AnonymousClass6C6;
import X.AnonymousClass74P;
import X.AnonymousClass7IG;
import X.AnonymousClass8G3;
import X.AnonymousClass91U;
import X.C005205m;
import X.C06270Wx;
import X.C107065ad;
import X.C107405bG;
import X.C107695bk;
import X.C125276He;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C185068t0;
import X.C54292oU;
import X.C56282rj;
import X.C620633i;
import X.C623834u;
import X.C626936e;
import X.C64303Cy;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class WallpaperCategoriesActivity extends C89644eZ implements AnonymousClass4EE {
    public AnonymousClass30B A00;
    public C185068t0 A01;
    public C64303Cy A02;
    public C54292oU A03;
    public AnonymousClass5ZR A04;
    public AnonymousClass5O9 A05;
    public C95814uZ A06;
    public C623834u A07;
    public C125276He A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass74P A0B;

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A03 = C64333Db.A2q(r2);
            this.A00 = C86624Kv.A0M(r2);
            this.A05 = A2W.ACS();
            this.A07 = (C623834u) r1.AC9.get();
            this.A04 = C64333Db.A2r(r2);
        }
    }

    public void BRA(int i) {
        if (i == 112) {
            this.A07.A0D(this, this.A06);
            C18290x4.A18(this);
        } else if (i == 113) {
            this.A07.A0A();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C107065ad.A04(C86664Kz.A0k(this, R.id.container), new AnonymousClass91U(this, 6));
        C107065ad.A03(this);
        C69263Wi r15 = this.A05;
        AnonymousClass8G3 r3 = new AnonymousClass8G3(r15);
        this.A01 = r3;
        this.A02 = new C64303Cy(this, this, r15, r3, this.A0B, this.A08, this.A07);
        this.A06 = C18310x6.A0S(getIntent().getStringExtra("chat_jid"));
        boolean A1N = AnonymousClass0x9.A1N(getIntent(), "is_using_global_wallpaper");
        setSupportActionBar((Toolbar) C005205m.A00(this, R.id.wallpaper_categories_toolbar));
        AnonymousClass1Ha.A1z(this);
        if (this.A06 == null || A1N) {
            boolean A0D = C107405bG.A0D(this);
            i = R.string.f11nameremoved;
            if (A0D) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
        }
        setTitle(i);
        this.A06 = C18310x6.A0S(getIntent().getStringExtra("chat_jid"));
        this.A09 = this.A04.A0E();
        C06270Wx A062 = this.A07.A06();
        C626936e.A06(A062);
        AnonymousClass6C6.A01(this, A062, 345);
        ArrayList A0s = AnonymousClass001.A0s();
        C18270x1.A1K(A0s, 0);
        C18270x1.A1K(A0s, 1);
        C18270x1.A1K(A0s, 2);
        C18270x1.A1K(A0s, 3);
        C18270x1.A1K(A0s, 5);
        boolean z = this.A07.A08(this, this.A06).A03;
        if (!z) {
            C18270x1.A1K(A0s, 4);
        }
        RecyclerView recyclerView = (RecyclerView) C005205m.A00(this, R.id.categories);
        AnonymousClass7IG r10 = new AnonymousClass7IG(this, z);
        Handler A0A2 = AnonymousClass000.A0A();
        C620633i r7 = this.A08;
        C125276He r4 = new C125276He(A0A2, this.A00, r7, this.A03, this.A05, r10, this.A04, A0s);
        this.A08 = r4;
        recyclerView.setLayoutManager(new WallpaperGridLayoutManager(this, r4));
        C86654Ky.A1I(recyclerView, this.A00, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        recyclerView.setAdapter(this.A08);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A06 == null) {
            C18290x4.A1E(menu, 999, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public WallpaperCategoriesActivity(int i) {
        this.A0A = false;
        C86604Kt.A1K(this, 97);
    }

    public void BR8(int i) {
    }

    public void BR9(int i) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            setResult(i2);
            if (this.A02.BM3(intent, i, i2)) {
                finish();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0v = AnonymousClass001.A0v(this.A08.A09);
        while (A0v.hasNext()) {
            ((AnonymousClass5ZM) A0v.next()).A0D(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            C56282rj r1 = new C56282rj(113);
            r1.A02(getString(R.string.f11nameremoved));
            r1.A05(getString(R.string.f11nameremoved));
            r1.A03(getString(R.string.f11nameremoved));
            Boo(r1.A00());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (this.A09 != this.A04.A0E()) {
            this.A09 = this.A04.A0E();
            this.A08.A05();
        }
    }

    public WallpaperCategoriesActivity() {
        this(0);
        this.A0B = new AnonymousClass74P();
        this.A06 = null;
    }
}
