package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0O5;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RL;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass31C;
import X.AnonymousClass47C;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4US;
import X.AnonymousClass4X6;
import X.AnonymousClass584;
import X.AnonymousClass59A;
import X.AnonymousClass59R;
import X.AnonymousClass5CM;
import X.AnonymousClass5UP;
import X.AnonymousClass5YD;
import X.AnonymousClass623;
import X.AnonymousClass624;
import X.AnonymousClass625;
import X.AnonymousClass626;
import X.AnonymousClass66R;
import X.AnonymousClass681;
import X.AnonymousClass6A6;
import X.AnonymousClass7N7;
import X.AnonymousClass8SE;
import X.C005205m;
import X.C101025De;
import X.C101035Df;
import X.C101045Dg;
import X.C101055Dh;
import X.C101065Di;
import X.C105225Ub;
import X.C105325Um;
import X.C107295b4;
import X.C107695bk;
import X.C114015mM;
import X.C115085o6;
import X.C118075sx;
import X.C119975xq;
import X.C1231767k;
import X.C123916Ag;
import X.C136756nD;
import X.C136766nE;
import X.C136786nG;
import X.C136806nI;
import X.C136816nJ;
import X.C136836nL;
import X.C136846nM;
import X.C136856nN;
import X.C136866nO;
import X.C136876nP;
import X.C154517dI;
import X.C162457s7;
import X.C175738Zn;
import X.C179568jM;
import X.C179578jN;
import X.C179588jO;
import X.C179598jP;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C29421in;
import X.C49122g1;
import X.C54292oU;
import X.C56602sG;
import X.C56842se;
import X.C64333Db;
import X.C64773Ex;
import X.C72023d3;
import X.C73153f1;
import X.C73753g1;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C87934Wr;
import X.C88834as;
import X.C89644eZ;
import X.C95804uY;
import X.C95814uZ;
import X.C999458u;
import X.C999558v;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.newsletter.viewmodel.NewsletterListViewModel;
import java.util.List;

public final class NewsletterDirectoryActivity extends C89644eZ implements C179568jM, C179578jN, C179588jO, C179598jP {
    public AnonymousClass0O5 A00;
    public RecyclerView A01;
    public RecyclerView A02;
    public C101025De A03;
    public C101035Df A04;
    public C101055Dh A05;
    public C29421in A06;
    public AnonymousClass31C A07;
    public AnonymousClass5UP A08;
    public C49122g1 A09;
    public AnonymousClass5YD A0A;
    public C999458u A0B;
    public AnonymousClass4X6 A0C;
    public C87934Wr A0D;
    public AnonymousClass59R A0E;
    public AnonymousClass4US A0F;
    public NewsletterListViewModel A0G;
    public C105225Ub A0H;
    public AnonymousClass30V A0I;
    public Runnable A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public final Handler A0O;
    public final C56602sG A0P;
    public final AnonymousClass66R A0Q;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A0N = this.A0D.A0X(5126);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        A28.setTitle((int) R.string.f11nameremoved);
        setSupportActionBar(A28);
        AnonymousClass1Ha.A1z(this);
        this.A0H = new C105225Ub(this, AnonymousClass4SG.A2R(this), new AnonymousClass5CM(this, 10), A28, this.A00);
        if (this.A0N) {
            C49122g1 r0 = this.A09;
            if (r0 != null) {
                this.A0K = r0.A00();
                C101055Dh r1 = this.A05;
                if (r1 != null) {
                    this.A0D = new C87934Wr((C101065Di) r1.A00.A01.A1d.get(), C64333Db.A4B(r1.A00.A03), this);
                } else {
                    throw C18270x1.A0S("newsletterDirectoryFilterAdapterFactory");
                }
            } else {
                throw C18270x1.A0S("newsletterDirectoryUtil");
            }
        }
        C101035Df r12 = this.A04;
        if (r12 != null) {
            C114015mM A29 = C64333Db.A29(r12.A00.A03);
            C118075sx r02 = r12.A00;
            C64333Db r13 = r02.A03;
            C54292oU A2q = C64333Db.A2q(r13);
            AnonymousClass4FS A8y = C64333Db.A8y(r13);
            C64773Ex A26 = C64333Db.A26(r13);
            this.A0C = new AnonymousClass4X6((C101045Dg) r02.A01.A3v.get(), C64333Db.A04(r13), A26, A29, A2q, (AnonymousClass5YD) r13.ANq.get(), this, this, A8y);
            C29421in r14 = this.A06;
            if (r14 != null) {
                r14.A06(this.A0P);
                C86604Kt.A1N(this, A75().A02, new AnonymousClass623(this), 287);
                RecyclerView recyclerView = (RecyclerView) C18290x4.A0L(this, R.id.newsletter_list);
                this.A01 = recyclerView;
                if (recyclerView == null) {
                    throw C18270x1.A0S("directoryRecyclerView");
                }
                AnonymousClass4X6 r03 = this.A0C;
                if (r03 == null) {
                    throw C18270x1.A0S("newsletterDirectoryAdapter");
                }
                recyclerView.setAdapter(r03);
                RecyclerView recyclerView2 = this.A01;
                if (recyclerView2 == null) {
                    throw C18270x1.A0S("directoryRecyclerView");
                }
                recyclerView2.setItemAnimator((AnonymousClass0UY) null);
                RecyclerView recyclerView3 = this.A01;
                if (recyclerView3 == null) {
                    throw C18270x1.A0S("directoryRecyclerView");
                }
                C18270x1.A0u(recyclerView3);
                if (C18270x1.A1V(this.A0Q)) {
                    C1231767k r15 = new C1231767k(this, 13);
                    RecyclerView recyclerView4 = this.A01;
                    if (recyclerView4 == null) {
                        throw C18270x1.A0S("directoryRecyclerView");
                    }
                    recyclerView4.A0q(r15);
                    this.A00 = r15;
                }
                if (this.A0N) {
                    RecyclerView recyclerView5 = (RecyclerView) C005205m.A00(this, R.id.filter_list);
                    this.A02 = recyclerView5;
                    if (recyclerView5 != null) {
                        recyclerView5.setVisibility(0);
                    }
                    C86654Ky.A0s(this, R.id.filter_divider, 0);
                    C87934Wr r2 = this.A0D;
                    if (r2 != null) {
                        r2.A0K(AnonymousClass59R.EXPLORE, this.A0K);
                    }
                    RecyclerView recyclerView6 = this.A02;
                    if (recyclerView6 != null) {
                        recyclerView6.setAdapter(this.A0D);
                    }
                    RecyclerView recyclerView7 = this.A02;
                    if (recyclerView7 != null) {
                        C18320x8.A19(recyclerView7, 0);
                    }
                }
                C101025De r22 = this.A03;
                if (r22 != null) {
                    NewsletterListViewModel newsletterListViewModel = (NewsletterListViewModel) AnonymousClass4L0.A0F(new C123916Ag(r22, 2), this).A01(NewsletterListViewModel.class);
                    this.A06.A00(newsletterListViewModel);
                    this.A0G = newsletterListViewModel;
                    if (newsletterListViewModel == null) {
                        throw C18270x1.A0S("newsletterListViewModel");
                    }
                    C86604Kt.A1N(this, newsletterListViewModel.A03.A00, new AnonymousClass624(this), 288);
                    NewsletterListViewModel newsletterListViewModel2 = this.A0G;
                    if (newsletterListViewModel2 == null) {
                        throw C18270x1.A0S("newsletterListViewModel");
                    }
                    C86604Kt.A1N(this, newsletterListViewModel2.A01, new AnonymousClass625(this), 289);
                    NewsletterListViewModel newsletterListViewModel3 = this.A0G;
                    if (newsletterListViewModel3 == null) {
                        throw C18270x1.A0S("newsletterListViewModel");
                    }
                    C86604Kt.A1N(this, newsletterListViewModel3.A00, new AnonymousClass626(this), 290);
                    A78(C18290x4.A0a(), false);
                    return;
                }
                throw C18270x1.A0S("newsletterListViewModelFactory");
            }
            throw C18270x1.A0S("contactObservers");
        }
        throw C18270x1.A0S("newsletterDirectoryAdapterFactory");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        AnonymousClass5UP r1 = this.A08;
        if (r1 != null) {
            if (r1.A01() && r1.A01.A0X(4283)) {
                MenuItem add = menu.add(0, 10002, 0, R.string.f11nameremoved);
                View A0F2 = C86644Kx.A0F(add, R.layout.f8nameremoved);
                if (A0F2 != null) {
                    A0F2.setEnabled(true);
                    C18310x6.A19(A0F2, this, add, 41);
                }
                add.setShowAsAction(1);
            }
            AnonymousClass5UP r12 = this.A08;
            if (r12 != null) {
                if (r12.A01() && r12.A01.A0X(4282) && !this.A0N) {
                    MenuItem add2 = menu.add(0, 10001, 0, R.string.f11nameremoved);
                    View A0F3 = C86644Kx.A0F(add2, R.layout.f8nameremoved);
                    if (A0F3 != null) {
                        A0F3.setEnabled(true);
                        C18310x6.A19(A0F3, this, add2, 41);
                    }
                    add2.setShowAsAction(1);
                }
                return super.onCreateOptionsMenu(menu);
            }
            throw C18270x1.A0S("newsletterConfig");
        }
        throw C18270x1.A0S("newsletterConfig");
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r1 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r1, this, AnonymousClass4SG.A2t(r3, r1, this));
            this.A03 = (C101025De) A2X.A42.get();
            C115085o6 r2 = new C115085o6();
            this.A0F = new AnonymousClass4US(C86604Kt.A0P(r3), (C56842se) r3.ANr.get(), (C105325Um) r3.ANm.get(), r2);
            this.A04 = (C101035Df) A2X.A1c.get();
            this.A05 = (C101055Dh) A2X.A3u.get();
            this.A0A = (AnonymousClass5YD) r3.ANq.get();
            this.A09 = (C49122g1) r3.ANg.get();
            this.A06 = C86614Ku.A0S(r3);
            this.A08 = C86634Kw.A0n(r3);
            this.A07 = C64333Db.A5u(r3);
            this.A0I = C86604Kt.A0f(r3);
        }
    }

    public void A66() {
        AnonymousClass30V r2 = this.A0I;
        if (r2 != null) {
            r2.A03((C95814uZ) null, 27);
            super.A66();
            return;
        }
        throw C18270x1.A0S("navigationTimeSpentManager");
    }

    public boolean A6C() {
        return true;
    }

    public final AnonymousClass5YD A74() {
        AnonymousClass5YD r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public final AnonymousClass4US A75() {
        AnonymousClass4US r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterDirectoryViewModel");
    }

    public final void A76(AnonymousClass1RL r4) {
        NewsletterListViewModel newsletterListViewModel = this.A0G;
        if (newsletterListViewModel == null) {
            throw C18270x1.A0S("newsletterListViewModel");
        }
        C95804uY A0I2 = r4.A0I();
        C162457s7.A0J(A0I2, 0);
        newsletterListViewModel.A04.A09(A0I2);
    }

    public final void A77(AnonymousClass7N7 r10) {
        AnonymousClass4X6 r3;
        Object obj;
        boolean z = false;
        if (r10.A01.ordinal() != 0) {
            r3 = this.A0C;
            if (r3 == null) {
                throw C18270x1.A0S("newsletterDirectoryAdapter");
            }
            if (r10.A02 != null) {
                z = true;
            }
            AnonymousClass8SE r1 = r10.A00;
            if (r1 instanceof C136766nE) {
                obj = C136846nM.A00;
            } else if (r1 instanceof C136786nG) {
                r3.A05.A0E((Integer) null, (Integer) null, (String) null, 4);
                obj = C136876nP.A00;
            } else {
                obj = C136866nO.A00;
            }
            if (z) {
                List list = r3.A08;
                if (C18310x6.A1X(list)) {
                    list.remove(AnonymousClass002.A03(list));
                    list.add(obj);
                    r3.A06(AnonymousClass002.A03(list));
                    return;
                }
            }
        } else {
            AnonymousClass4X6 r7 = this.A0C;
            if (r7 == null) {
                throw C18270x1.A0S("newsletterDirectoryAdapter");
            }
            List list2 = r10.A03;
            if (A75().A01) {
                if (list2.isEmpty()) {
                    r7.A0K();
                } else {
                    List list3 = r7.A08;
                    int size = list3.size();
                    list3.addAll(list2);
                    r7.A01.A02(size, list2.size());
                    C73753g1.A0a(list3, new AnonymousClass6A6(4));
                }
            } else if (C18310x6.A1X(list2)) {
                r7.A0M(list2);
            }
            if (A75().A01 || !list2.isEmpty()) {
                C107295b4.A00(this, this.A08, getString(R.string.f11nameremoved));
                return;
            } else if (r10.A02 != null) {
                A78((Integer) null, true);
                return;
            } else {
                C107295b4.A00(this, this.A08, getString(R.string.f11nameremoved));
                r3 = this.A0C;
                if (r3 == null) {
                    throw C18270x1.A0S("newsletterDirectoryAdapter");
                }
                obj = C136856nN.A00;
            }
        }
        List list4 = r3.A08;
        list4.clear();
        list4.add(obj);
        r3.A06(0);
    }

    public final void A78(Integer num, boolean z) {
        AnonymousClass584 r5;
        C136756nD r52;
        boolean z2;
        String str;
        AnonymousClass59A r6;
        AnonymousClass47C r4;
        AnonymousClass7N7 r0;
        Integer num2;
        int i;
        AnonymousClass7N7 r02;
        String str2;
        AnonymousClass31C r03 = this.A07;
        if (r03 != null) {
            String str3 = null;
            if (!r03.A0I()) {
                AnonymousClass7N7 r04 = (AnonymousClass7N7) A75().A02.A07();
                if (r04 != null) {
                    str2 = r04.A02;
                } else {
                    str2 = null;
                }
                C999558v r3 = C999558v.FAILED;
                if (!z) {
                    str2 = null;
                }
                A77(new AnonymousClass7N7(new C136766nE(), r3, str2, C72023d3.A00));
                return;
            }
            RecyclerView recyclerView = this.A01;
            if (recyclerView == null) {
                throw C18270x1.A0S("directoryRecyclerView");
            }
            recyclerView.A0T();
            AnonymousClass4X6 r32 = this.A0C;
            if (!z) {
                if (r32 == null) {
                    throw C18270x1.A0S("newsletterDirectoryAdapter");
                }
                C136836nL r2 = C136836nL.A00;
                List list = r32.A08;
                list.clear();
                list.add(r2);
                r32.A06(0);
            } else if (r32 == null) {
                throw C18270x1.A0S("newsletterDirectoryAdapter");
            } else {
                List list2 = r32.A08;
                if (C18310x6.A1X(list2) && ((C18300x5.A0c(list2) instanceof C136846nM) || (C18300x5.A0c(list2) instanceof C136876nP) || (C18300x5.A0c(list2) instanceof C136866nO))) {
                    list2.remove(AnonymousClass002.A03(list2));
                    list2.add(C136836nL.A00);
                    r32.A06(AnonymousClass002.A03(list2));
                }
            }
            if (this.A0N) {
                String str4 = this.A0L;
                if (str4 == null || C175738Zn.A0V(str4)) {
                    AnonymousClass4US A75 = A75();
                    int ordinal = this.A0E.ordinal();
                    if (ordinal == 1) {
                        r6 = AnonymousClass59A.TRENDING;
                    } else if (ordinal == 2) {
                        r6 = AnonymousClass59A.FEATURED;
                    } else if (ordinal == 3) {
                        r6 = AnonymousClass59A.NEW;
                    } else if (ordinal != 4) {
                        r6 = AnonymousClass59A.RECOMMENDED;
                    } else {
                        r6 = AnonymousClass59A.POPULAR;
                    }
                    String str5 = this.A0K;
                    C162457s7.A0J(r6, 0);
                    if (!z || A75.A00 == null) {
                        AnonymousClass47C r05 = A75.A00;
                        if (r05 != null) {
                            r05.cancel();
                        }
                        A75.A01 = z;
                        C56842se r22 = A75.A04;
                        String str6 = null;
                        if (z && (r0 = (AnonymousClass7N7) A75.A02.A07()) != null) {
                            str6 = r0.A02;
                        }
                        C115085o6 r7 = A75.A06;
                        if (!C18300x5.A1S(r22.A0E)) {
                            r4 = new C136806nI(r7);
                        } else {
                            if (C162457s7.A0P(str5, "Global")) {
                                str5 = null;
                            }
                            AnonymousClass1VX r1 = r22.A0C;
                            r4 = new C136816nJ(r22.A0G, r6, r7, str5, str6, r1.A0N(5853), r1.A0X(5015));
                        }
                        r22.A07.A02(r4);
                        A75.A00 = r4;
                    }
                    AnonymousClass5YD A74 = A74();
                    switch (this.A0E.ordinal()) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            num2 = null;
                            break;
                        default:
                            throw C73153f1.A00();
                    }
                    num2 = Integer.valueOf(i);
                    A74.A0E(num2, num, this.A0K, 12);
                    return;
                }
                String str7 = this.A0L;
                if (str7 != null) {
                    AnonymousClass4US A752 = A75();
                    if (!z || A752.A00 == null) {
                        AnonymousClass47C r06 = A752.A00;
                        if (r06 != null) {
                            r06.cancel();
                        }
                        A752.A01 = z;
                        C56842se r23 = A752.A04;
                        String str8 = null;
                        if (z && (r02 = (AnonymousClass7N7) A752.A02.A07()) != null) {
                            str8 = r02.A02;
                        }
                        A752.A00 = r23.A01(A752.A06, str7, str8);
                        return;
                    }
                    return;
                }
                return;
            }
            AnonymousClass4US A753 = A75();
            String str9 = this.A0L;
            if (!(str9 == null || str9.length() == 0)) {
                str3 = str9;
            }
            int ordinal2 = this.A0B.ordinal();
            if (ordinal2 == 1) {
                r5 = AnonymousClass584.CREATION_TIME;
            } else if (ordinal2 == 0) {
                r5 = AnonymousClass584.SUBSCRIBERS_COUNT;
            } else {
                throw C73153f1.A00();
            }
            C162457s7.A0J(r5, 1);
            AnonymousClass47C r07 = A753.A00;
            if (r07 != null) {
                r07.cancel();
            }
            C56842se r33 = A753.A04;
            C115085o6 r62 = A753.A06;
            if (C18300x5.A1S(r33.A0E)) {
                if (!r33.A0C.A0X(5015) || (str3 != null && !C175738Zn.A0V(str3))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (r5.ordinal() != 1) {
                    str = "SUBSCRIBER_COUNT";
                } else {
                    str = "CREATION_TIME";
                }
                r52 = new C136756nD(r62, str3, str, 500, false, z2);
                r33.A07.A02(r52);
            } else {
                r52 = null;
            }
            A753.A00 = r52;
            return;
        }
        throw C18270x1.A0S("messageClient");
    }

    public void onBackPressed() {
        C105225Ub r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        } else if (C86604Kt.A1Y(r0.A04)) {
            C105225Ub r1 = this.A0H;
            if (r1 == null) {
                throw C18270x1.A0S("searchToolbarHelper");
            }
            r1.A01(true);
            AnonymousClass0x2.A0x(this.A02);
        } else {
            super.onBackPressed();
            A74().A0E((Integer) null, (Integer) null, (String) null, 2);
        }
    }

    public boolean onSearchRequested() {
        C105225Ub r0 = this.A0H;
        if (r0 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        }
        r0.A02(false);
        C18270x1.A0p(this.A02);
        A74().A0E((Integer) null, (Integer) null, (String) null, 3);
        A74().A0E((Integer) null, (Integer) null, (String) null, 13);
        C18300x5.A19(findViewById(R.id.search_back), this, 31);
        return false;
    }

    public NewsletterDirectoryActivity(int i) {
        this.A0M = false;
        C86604Kt.A1K(this, 71);
    }

    public void onDestroy() {
        super.onDestroy();
        C29421in r1 = this.A06;
        if (r1 != null) {
            r1.A07(this.A0P);
            AnonymousClass47C r0 = A75().A00;
            if (r0 != null) {
                r0.cancel();
            }
            Runnable runnable = this.A0J;
            if (runnable != null) {
                this.A0O.removeCallbacks(runnable);
            }
            AnonymousClass5YD A74 = A74();
            A74.A00 = 0;
            A74.A01 = 0;
            AnonymousClass0O5 r3 = this.A00;
            if (r3 != null) {
                RecyclerView recyclerView = this.A01;
                if (recyclerView == null) {
                    throw C18270x1.A0S("directoryRecyclerView");
                }
                recyclerView.A0r(r3);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 == null) {
                throw C18270x1.A0S("directoryRecyclerView");
            }
            recyclerView2.setAdapter((AnonymousClass0R6) null);
            return;
        }
        throw C18270x1.A0S("contactObservers");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 != 10001) {
            if (A042 == 10002) {
                onSearchRequested();
            } else if (A042 == 16908332) {
                A74().A0E((Integer) null, (Integer) null, (String) null, 2);
            }
        } else if (getSupportFragmentManager().A0D("sort_fragment") == null) {
            int ordinal = this.A0B.ordinal();
            SortOrderBottomSheetFragment sortOrderBottomSheetFragment = new SortOrderBottomSheetFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt("arg_sort_selected", ordinal);
            sortOrderBottomSheetFragment.A0u(A082);
            Bon(sortOrderBottomSheetFragment, "sort_fragment");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public NewsletterDirectoryActivity() {
        this(0);
        this.A0B = C999458u.POPULARITY;
        this.A0E = AnonymousClass59R.EXPLORE;
        this.A0O = AnonymousClass000.A0A();
        this.A0Q = C154517dI.A01(new C119975xq(this));
        this.A0P = AnonymousClass681.A00(this, 30);
    }
}
