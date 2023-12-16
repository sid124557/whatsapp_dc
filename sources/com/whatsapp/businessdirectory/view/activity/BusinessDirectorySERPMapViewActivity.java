package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass34K;
import X.AnonymousClass3Z6;
import X.AnonymousClass4CX;
import X.AnonymousClass4SG;
import X.AnonymousClass4U8;
import X.AnonymousClass4w0;
import X.AnonymousClass5CG;
import X.AnonymousClass5EJ;
import X.AnonymousClass5EK;
import X.AnonymousClass5EM;
import X.AnonymousClass5EN;
import X.AnonymousClass5EO;
import X.AnonymousClass5EP;
import X.AnonymousClass5EQ;
import X.AnonymousClass5ES;
import X.AnonymousClass5EU;
import X.AnonymousClass5EV;
import X.AnonymousClass5EW;
import X.AnonymousClass5EX;
import X.AnonymousClass5EZ;
import X.AnonymousClass5U9;
import X.AnonymousClass5UT;
import X.AnonymousClass5ZO;
import X.AnonymousClass5ZR;
import X.C011909n;
import X.C06270Wx;
import X.C06440Xs;
import X.C101255Eb;
import X.C101265Ec;
import X.C101275Ed;
import X.C101285Ee;
import X.C101295Ef;
import X.C101305Eg;
import X.C101315Eh;
import X.C101325Ei;
import X.C101335Ej;
import X.C101345Ek;
import X.C105355Up;
import X.C105375Ur;
import X.C105545Vk;
import X.C107275b2;
import X.C107405bG;
import X.C107605ba;
import X.C107695bk;
import X.C108965dr;
import X.C108975ds;
import X.C109425eb;
import X.C110885hC;
import X.C111545iG;
import X.C1231667j;
import X.C150067Pa;
import X.C151167Tr;
import X.C162457s7;
import X.C166447yh;
import X.C166477yk;
import X.C167077zj;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C28071fd;
import X.C626936e;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C88744aj;
import X.C88834as;
import X.C90724i8;
import X.C90734i9;
import X.C95874ug;
import X.C96254w4;
import android.app.ActionBar;
import android.content.Intent;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Map;
import java.util.Set;

public final class BusinessDirectorySERPMapViewActivity extends C90724i8 implements AnonymousClass4CX {
    public ImageView A00;
    public RecyclerView A01;
    public RecyclerView A02;
    public C110885hC A03;
    public C101345Ek A04;
    public AnonymousClass5U9 A05;
    public C96254w4 A06;
    public C90734i9 A07;
    public C151167Tr A08;
    public AnonymousClass5UT A09;
    public C95874ug A0A;
    public boolean A0B;
    public final C011909n A0C;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        if (this.A06 != null) {
            AnonymousClass4U8 A74 = A74();
            A74.A0I.A06("arg_should_animate_on_gps_change", Boolean.valueOf(A74.A0D));
        }
        C95874ug r0 = this.A0A;
        if (r0 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r0.A0F(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A08 = C86614Ku.A0b(r2);
            this.A07 = C64333Db.A2r(r2);
            this.A05 = A2X.ABg();
            this.A03 = (AnonymousClass4w0) r1.A1g.get();
            this.A04 = A2X.ABc();
            this.A02 = (C111545iG) r1.A3e.get();
            this.A08 = A2X.ABf();
            this.A05 = A2X.ABa();
            this.A06 = A2X.ABd();
            C105355Up A2k = C107695bk.A2k(r2);
            AnonymousClass5EJ r24 = (AnonymousClass5EJ) A2X.A2U.get();
            AnonymousClass5EK r23 = (AnonymousClass5EK) A2X.A2X.get();
            AnonymousClass5EM r22 = (AnonymousClass5EM) A2X.A2Y.get();
            AnonymousClass5EN r21 = (AnonymousClass5EN) A2X.A2Z.get();
            AnonymousClass5EO r20 = (AnonymousClass5EO) A2X.A2a.get();
            AnonymousClass5EP r19 = (AnonymousClass5EP) A2X.A2b.get();
            AnonymousClass5EQ r18 = (AnonymousClass5EQ) A2X.A2d.get();
            AnonymousClass5EJ r27 = r24;
            AnonymousClass5EK r28 = r23;
            this.A07 = new C90734i9(C88744aj.A00, r27, r28, r22, r21, r20, r19, r18, (AnonymousClass5ES) A2X.A2e.get(), (AnonymousClass5EU) A2X.A2f.get(), (AnonymousClass5EV) A2X.A2g.get(), (AnonymousClass5EW) A2X.A2i.get(), (AnonymousClass5EX) A2X.A2k.get(), (AnonymousClass5EZ) A2X.A2m.get(), (C101255Eb) A2X.A2n.get(), (C101265Ec) A2X.A2o.get(), (C101275Ed) A2X.A2p.get(), (C101285Ee) A2X.A2q.get(), (C101295Ef) A2X.A2r.get(), (C101305Eg) A2X.A2t.get(), (C101315Eh) A2X.A2u.get(), (C101325Ei) A2X.A2v.get(), (C101335Ej) A2X.A2w.get(), A2k);
            this.A04 = (C101345Ek) A2X.A30.get();
        }
    }

    public final boolean A78() {
        Object systemService = getSystemService("location");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        AnonymousClass5ZR r0 = this.A07;
        if (r0 == null) {
            throw C18270x1.A0S("waPermissionsHelper");
        } else if (!r0.A05() || !locationManager.isProviderEnabled("gps")) {
            return false;
        } else {
            return true;
        }
    }

    public void BNl() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A06 != null) {
            if (i == 34) {
                if (i2 == -1) {
                    this.A0A = true;
                    AnonymousClass4w0 r0 = this.A03;
                    if (r0 != null) {
                        r0.A02(true);
                        A77(false);
                    } else {
                        throw C18270x1.A0S("businessDirectorySharedPrefs");
                    }
                } else if (i2 == 0) {
                    A74();
                }
                C110885hC r1 = this.A03;
                if (r1 != null) {
                    r1.A0E(A78());
                }
            } else if (i == 35) {
                LocationManager A0F = this.A08.A0F();
                boolean z = false;
                if (A0F != null && (A0F.isProviderEnabled("gps") || A0F.isProviderEnabled("network"))) {
                    z = true;
                }
                AnonymousClass4U8 A74 = A74();
                if (z) {
                    C06270Wx.A03(A74.A0b, 0);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.A06 != null) {
            AnonymousClass4U8 A74 = A74();
            AnonymousClass3Z6 r0 = A74.A08.A06;
            if (r0 == null || r0.first == null) {
                A74.A0K.A09(A74.A0N.A03(), C18280x3.A0S(), (Map) null, 11, 72, 1);
                C06270Wx.A03(A74.A0b, 9);
                return;
            }
            A74.A0F();
            A74.A0K.A09(A74.A0N.A03(), C18300x5.A0Z(), (Map) null, 11, 72, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        float f;
        if (C107275b2.A00) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300);
            changeBounds.setInterpolator(new C167077zj());
            C86634Kw.A19(changeBounds);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            Window window = getWindow();
            C86634Kw.A1F(window);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C166447yh r0 = (C166447yh) getIntent().getParcelableExtra("arg_parent_category");
        String str2 = null;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = null;
        }
        setTitle(str);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        CharSequence title = getTitle();
        if (title != null) {
            str2 = title.toString();
        }
        C626936e.A06(str2);
        C86604Kt.A11(A28.getContext(), A28, this.A00, R.drawable.ic_back);
        A28.setBackgroundResource(AnonymousClass34K.A00(A28.getContext()));
        A28.A0J(A28.getContext(), R.style.f12nameremoved);
        AnonymousClass5CG.A00(A28);
        A28.setTitle((CharSequence) str2);
        setSupportActionBar(A28);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar actionBar2 = getActionBar();
        if (actionBar2 != null) {
            actionBar2.setDisplayShowHomeEnabled(true);
        }
        A28.setNavigationOnClickListener(new C109425eb(this, 31));
        ImageView A0J = C86604Kt.A0J(this.A00, R.id.my_location);
        C18290x4.A1H(A0J, this, 30);
        this.A00 = A0J;
        AnonymousClass5ZO A022 = AnonymousClass5ZO.A02(getIntent().getStringExtra("arg_search_location"));
        if (A022 != null && C162457s7.A0P(A022.A09, "device") && A78()) {
            ImageView imageView = this.A00;
            if (imageView == null) {
                throw C18270x1.A0S("myLocationBtn");
            }
            imageView.setImageResource(R.drawable.icon_my_loc_active);
        }
        RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(this.A00, R.id.filter_bar_list);
        C90734i9 r02 = this.A07;
        if (r02 != null) {
            recyclerView.setAdapter(r02);
            this.A01 = recyclerView;
            C18320x8.A19(recyclerView, 1);
            this.A00 = (ViewGroup) C18280x3.A0E(this.A00, R.id.progress_bar_container);
            RecyclerView recyclerView2 = (RecyclerView) C18280x3.A0E(this.A00, R.id.business_list);
            C96254w4 r03 = this.A06;
            if (r03 != null) {
                recyclerView2.setAdapter(r03);
                this.A02 = recyclerView2;
                C06440Xs layoutManager = recyclerView2.getLayoutManager();
                C162457s7.A0K(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView recyclerView3 = this.A02;
                if (recyclerView3 == null) {
                    throw C18270x1.A0S("horizontalBusinessListView");
                }
                recyclerView3.setClipToPadding(false);
                linearLayoutManager.A08 = true;
                RecyclerView recyclerView4 = this.A02;
                if (recyclerView4 == null) {
                    throw C18270x1.A0S("horizontalBusinessListView");
                }
                recyclerView4.setItemAnimator((AnonymousClass0UY) null);
                C011909n r1 = this.A0C;
                RecyclerView recyclerView5 = this.A02;
                if (recyclerView5 == null) {
                    throw C18270x1.A0S("horizontalBusinessListView");
                }
                r1.A06(recyclerView5);
                RecyclerView recyclerView6 = this.A02;
                if (recyclerView6 == null) {
                    throw C18270x1.A0S("horizontalBusinessListView");
                }
                recyclerView6.A0q(new C1231667j(linearLayoutManager, 1, this));
                CardView cardView = (CardView) C18280x3.A0E(this.A00, R.id.map_view_chip);
                this.A01 = cardView;
                if (cardView == null) {
                    throw C18270x1.A0S("mapViewChip");
                }
                C18290x4.A1H(cardView, this, 33);
                C28071fd r04 = this.A08;
                if (r04 != null) {
                    r04.A03(this);
                    C108965dr r05 = (C108965dr) getIntent().getParcelableExtra("arg_map_view_config");
                    if (r05 != null) {
                        f = r05.A01;
                    } else {
                        f = 16.0f;
                    }
                    AnonymousClass5ZO A023 = AnonymousClass5ZO.A02(getIntent().getStringExtra("arg_search_location"));
                    C626936e.A06(A023);
                    C162457s7.A0D(A023);
                    C150067Pa r6 = new C150067Pa();
                    r6.A00 = 8;
                    r6.A08 = true;
                    r6.A05 = false;
                    r6.A06 = C107405bG.A0D(this);
                    r6.A04 = "whatsapp_smb_business_discovery";
                    Double d = A023.A04;
                    C162457s7.A0H(d);
                    double doubleValue = d.doubleValue();
                    Double d2 = A023.A05;
                    C162457s7.A0H(d2);
                    r6.A02 = new C166477yk(C108975ds.A00(doubleValue, d2.doubleValue()), f, 90.0f, 0.0f);
                    this.A0A = new C95874ug(this, r6);
                    ViewGroup A0I = C86644Kx.A0I(this.A00, R.id.map_view_holder);
                    C95874ug r06 = this.A0A;
                    if (r06 == null) {
                        throw C18270x1.A0S("facebookMapView");
                    }
                    r06.A0E(bundle);
                    C95874ug r07 = this.A0A;
                    if (r07 == null) {
                        throw C18270x1.A0S("facebookMapView");
                    }
                    A0I.addView(r07);
                    if (this.A03 == null) {
                        C95874ug r12 = this.A0A;
                        if (r12 == null) {
                            throw C18270x1.A0S("facebookMapView");
                        }
                        r12.A0J(new C107605ba(bundle, 1, this));
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("locationUtils");
            }
            throw C18270x1.A0S("horizontalBusinessListAdapter");
        }
        throw C18270x1.A0S("filterBarListAdapter");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null && menu.findItem(1) == null) {
            menu.add(0, 4, 1, getString(R.string.f11nameremoved));
            MenuItem icon = menu.add(0, 1, 0, getString(R.string.f11nameremoved)).setIcon(R.drawable.ic_action_search);
            C162457s7.A0D(icon);
            icon.setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (this.A0A == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        C105545Vk.A03 = null;
        C105545Vk.A00 = null;
        C105545Vk.A02 = null;
        C105545Vk.A04 = null;
        C105545Vk.A05 = null;
        C105545Vk.A06 = null;
        C105545Vk.A01 = null;
        super.onDestroy();
    }

    public BusinessDirectorySERPMapViewActivity(int i) {
        this.A0B = false;
        C86604Kt.A1K(this, 24);
    }

    public void BWo(Set set) {
        AnonymousClass4U8 A74 = A74();
        C105375Ur r0 = A74.A0S;
        r0.A01 = set;
        A74.A0K.A04((Boolean) null, A74.A0N.A03(), r0.A06(), 75);
        A74.A0G();
    }

    public void onLowMemory() {
        super.onLowMemory();
        C95874ug r0 = this.A0A;
        if (r0 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r0.A05();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 1) {
            AnonymousClass4U8 A74 = A74();
            A74.A0K.A09(A74.A0N.A03(), 1, (Map) null, 11, 62, 1);
            Intent A082 = AnonymousClass0x9.A08(this, BusinessDirectoryActivity.class);
            A082.putExtra("arg_launch_consumer_home", true);
            A082.setFlags(67108864);
            startActivity(A082);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        C95874ug r2 = this.A0A;
        if (r2 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        SensorManager sensorManager = r2.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(r2.A0D);
        }
    }

    public void onResume() {
        super.onResume();
        C95874ug r1 = this.A0A;
        if (r1 == null) {
            throw C18270x1.A0S("facebookMapView");
        }
        r1.A0K();
        C110885hC r12 = this.A03;
        if (r12 != null) {
            r12.A0E(A78());
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0A == null) {
            throw C18270x1.A0S("facebookMapView");
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0A == null) {
            throw C18270x1.A0S("facebookMapView");
        }
    }

    public BusinessDirectorySERPMapViewActivity() {
        this(0);
        this.A0C = new C011909n();
    }
}
