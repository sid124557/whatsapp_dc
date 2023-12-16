package com.whatsapp.updates.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08A;
import X.AnonymousClass08M;
import X.AnonymousClass0GC;
import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0O5;
import X.AnonymousClass0R6;
import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1RL;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass2LL;
import X.AnonymousClass30V;
import X.AnonymousClass33p;
import X.AnonymousClass4C6;
import X.AnonymousClass4FS;
import X.AnonymousClass4FU;
import X.AnonymousClass4GQ;
import X.AnonymousClass4L0;
import X.AnonymousClass4L4;
import X.AnonymousClass536;
import X.AnonymousClass59F;
import X.AnonymousClass59N;
import X.AnonymousClass5AR;
import X.AnonymousClass5FA;
import X.AnonymousClass5FB;
import X.AnonymousClass5FI;
import X.AnonymousClass5FJ;
import X.AnonymousClass5FO;
import X.AnonymousClass5FP;
import X.AnonymousClass5FQ;
import X.AnonymousClass5FR;
import X.AnonymousClass5FS;
import X.AnonymousClass5FT;
import X.AnonymousClass5FU;
import X.AnonymousClass5FV;
import X.AnonymousClass5FZ;
import X.AnonymousClass5L2;
import X.AnonymousClass5MF;
import X.AnonymousClass5O5;
import X.AnonymousClass5PU;
import X.AnonymousClass5SY;
import X.AnonymousClass5T1;
import X.AnonymousClass5U2;
import X.AnonymousClass5UP;
import X.AnonymousClass5YA;
import X.AnonymousClass5YD;
import X.AnonymousClass5YU;
import X.AnonymousClass5Yj;
import X.AnonymousClass5Z6;
import X.AnonymousClass5ZR;
import X.AnonymousClass5b0;
import X.AnonymousClass622;
import X.AnonymousClass62R;
import X.AnonymousClass62S;
import X.AnonymousClass62T;
import X.AnonymousClass633;
import X.AnonymousClass640;
import X.AnonymousClass66J;
import X.AnonymousClass66R;
import X.AnonymousClass673;
import X.AnonymousClass6C6;
import X.AnonymousClass8JP;
import X.AnonymousClass8UF;
import X.AnonymousClass8s5;
import X.C003203q;
import X.C06440Xs;
import X.C06560Yg;
import X.C08310eF;
import X.C1001059l;
import X.C1001359q;
import X.C101505Fa;
import X.C101935Gv;
import X.C102195Hv;
import X.C102335Il;
import X.C102875Kp;
import X.C102975Kz;
import X.C103295Mi;
import X.C103685Ny;
import X.C104715Sb;
import X.C104745Se;
import X.C105105Tp;
import X.C105125Tr;
import X.C105325Um;
import X.C105795Wl;
import X.C107335b8;
import X.C107695bk;
import X.C107895c5;
import X.C110065fd;
import X.C110565gf;
import X.C111095hX;
import X.C114015mM;
import X.C115155oD;
import X.C116985rC;
import X.C117095rN;
import X.C120335yQ;
import X.C1228966g;
import X.C1229666n;
import X.C1229966q;
import X.C123896Ae;
import X.C154517dI;
import X.C162457s7;
import X.C175728Zm;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C187958y5;
import X.C30471mV;
import X.C372821q;
import X.C380625j;
import X.C383227b;
import X.C386928t;
import X.C387028u;
import X.C45512a8;
import X.C53502nC;
import X.C54292oU;
import X.C55152pt;
import X.C55262q4;
import X.C55592qb;
import X.C56612sH;
import X.C56842se;
import X.C56952sp;
import X.C56972sr;
import X.C57052sz;
import X.C58422vE;
import X.C61072zf;
import X.C613930n;
import X.C616131n;
import X.C620633i;
import X.C623534r;
import X.C624134x;
import X.C627736r;
import X.C64333Db;
import X.C65173Gm;
import X.C66493Lq;
import X.C69263Wi;
import X.C72023d3;
import X.C84814Du;
import X.C85014Ep;
import X.C85324Fu;
import X.C85334Fv;
import X.C85344Fw;
import X.C85494Gl;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88694ab;
import X.C89654ea;
import X.C94884sE;
import X.C95704uI;
import X.C95804uY;
import X.C95814uZ;
import X.C97154xi;
import X.C986752u;
import X.C997458a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import com.whatsapp.updates.viewmodels.SearchUsecase;
import com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

public final class UpdatesFragment extends Hilt_UpdatesFragment implements C1229966q, C1228966g, C1229666n, AnonymousClass66J, AnonymousClass640, C85324Fu, C85334Fv, C85344Fw {
    public long A00;
    public C116985rC A01;
    public C116985rC A02;
    public C116985rC A03;
    public C116985rC A04;
    public C116985rC A05;
    public C107895c5 A06;
    public C111095hX A07;
    public AnonymousClass5FA A08;
    public AnonymousClass5FB A09;
    public AnonymousClass5FI A0A;
    public AnonymousClass5FZ A0B;
    public C101505Fa A0C;
    public C69263Wi A0D;
    public C56972sr A0E;
    public WfalManager A0F;
    public AnonymousClass5O5 A0G;
    public ObservableRecyclerView A0H;
    public C55262q4 A0I;
    public C620633i A0J;
    public C56612sH A0K;
    public C54292oU A0L;
    public AnonymousClass5ZR A0M;
    public AnonymousClass33p A0N;
    public C61072zf A0O;
    public AnonymousClass1VX A0P;
    public C66493Lq A0Q;
    public AnonymousClass5SY A0R;
    public C97154xi A0S;
    public C53502nC A0T;
    public AnonymousClass5UP A0U;
    public NewsletterLinkLauncher A0V;
    public C56842se A0W;
    public AnonymousClass5YD A0X;
    public C105325Um A0Y;
    public C110065fd A0Z;
    public AnonymousClass5PU A0a;
    public C103295Mi A0b;
    public StatusExpirationLifecycleOwner A0c;
    public C105795Wl A0d;
    public C102335Il A0e;
    public C45512a8 A0f;
    public UpdatesAdvertiseViewModel A0g;
    public C102195Hv A0h;
    public CrossPostingUpdatesViewModel A0i;
    public C65173Gm A0j;
    public C105105Tp A0k;
    public C115155oD A0l;
    public C613930n A0m;
    public AnonymousClass30V A0n;
    public AnonymousClass4L4 A0o;
    public UpdatesAdapter A0p;
    public UpdatesViewModel A0q;
    public C187958y5 A0r;
    public AnonymousClass4FS A0s;
    public AnonymousClass5L2 A0t;
    public C104745Se A0u;
    public C183538qC A0v;
    public C183538qC A0w;
    public CharSequence A0x;
    public List A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public final C85014Ep A15 = new AnonymousClass5b0(this, 5);
    public final List A16 = AnonymousClass001.A0s();
    public final AnonymousClass66R A17 = C154517dI.A01(new C120335yQ(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        C115155oD r1 = this.A0l;
        if (r1 != null) {
            r1.A01.A07("StatusesFragment_onCreateView");
            r1.A02.A0A.markerPoint(453128091, 1, "CREATE_VIEW_START");
            View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
            View findViewById = A0R().findViewById(R.id.fab_second);
            View findViewById2 = A0R().findViewById(R.id.fab);
            C162457s7.A0D(findViewById2);
            C162457s7.A0H(findViewById);
            this.A0y = AnonymousClass8UF.A0p(findViewById2, findViewById);
            if (findViewById instanceof ImageView) {
                AnonymousClass1VX r5 = this.A0P;
                if (r5 == null) {
                    throw C18270x1.A0R();
                } else if (r5.A0Y(C58422vE.A01, 1874)) {
                    AnonymousClass5FZ r12 = this.A0B;
                    if (r12 != null) {
                        C69263Wi A042 = C64333Db.A04(r12.A00.A01);
                        C64333Db r13 = r12.A00.A01;
                        this.A0d = new C105795Wl((ImageView) findViewById, A042, (C380625j) r13.ASN.get(), C64333Db.A2s(r13), C64333Db.A8y(r13));
                    } else {
                        throw C18270x1.A0S("textToVoiceAnimationFactory");
                    }
                }
            }
            C115155oD r14 = this.A0l;
            if (r14 != null) {
                r14.A01.A06("StatusesFragment_onCreateView");
                r14.A02.A0A.markerPoint(453128091, 1, "CREATE_VIEW_END");
                return inflate;
            }
            throw C18270x1.A0S("statusUpdatesTracker");
        }
        throw C18270x1.A0S("statusUpdatesTracker");
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        bundle.putBoolean("is_tab_selected", this.A14);
    }

    public boolean A1B(MenuItem menuItem) {
        C162457s7.A0J(menuItem, 0);
        C116985rC r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("smbActivities");
        } else if (r0.A07()) {
            menuItem.getItemId();
            C116985rC r02 = this.A04;
            if (r02 != null) {
                r02.A04();
                throw AnonymousClass001.A0g("getMenuItemBusinessToolsId");
            }
            throw C18270x1.A0S("smbMenus");
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A0m(C627736r.A07(A0G()));
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_see_all_statuses) {
            return false;
        } else {
            A1L();
            return true;
        }
    }

    public void A1M() {
        this.A10 = true;
        C105105Tp r1 = this.A0k;
        if (r1 != null) {
            C65173Gm r0 = this.A0j;
            if (r0 != null) {
                r1.A03(A0R(), this, r1.A03, "status_fragment", C18300x5.A0v(r0.A03));
                return;
            }
            throw C18270x1.A0S("recentStatusManager");
        }
        throw C18270x1.A0S("statusSharingManager");
    }

    public void A1N() {
        this.A10 = false;
        C65173Gm r0 = this.A0j;
        if (r0 != null) {
            ArrayList A0v2 = C18300x5.A0v(r0.A03);
            C105105Tp r02 = this.A0k;
            if (r02 != null) {
                r02.A03(A0R(), this, r02.A04, "status_fragment", A0v2);
                return;
            }
            throw C18270x1.A0S("statusSharingManager");
        }
        throw C18270x1.A0S("recentStatusManager");
    }

    public void A1R(AnonymousClass1RL r12) {
        C95804uY r4;
        if (this.A0K != null) {
            boolean A1V = AnonymousClass001.A1V(((SystemClock.elapsedRealtime() - this.A00) > 1000 ? 1 : ((SystemClock.elapsedRealtime() - this.A00) == 1000 ? 0 : -1)));
            this.A00 = SystemClock.elapsedRealtime();
            if (A1V) {
                return;
            }
            if (AnonymousClass000.A1Y(r12.A07, C372821q.GUEST)) {
                String str = r12.A0G;
                if (str != null) {
                    NewsletterLinkLauncher newsletterLinkLauncher = this.A0V;
                    if (newsletterLinkLauncher != null) {
                        newsletterLinkLauncher.A01(A0G(), Uri.parse(AnonymousClass000.A0V("whatsapp://channel/", str, AnonymousClass001.A0o())), (C95804uY) null, AnonymousClass59N.RECOMMENDED_NEWSLETTERS, str, 0, -1);
                        return;
                    }
                    throw C18270x1.A0S("newsletterLinkLauncher");
                }
                return;
            }
            UpdatesViewModel updatesViewModel = this.A0q;
            if (updatesViewModel != null) {
                updatesViewModel.A01 = r12.A05();
            }
            C95814uZ A052 = r12.A05();
            if ((A052 instanceof C95804uY) && (r4 = (C95804uY) A052) != null) {
                if (this.A0X != null) {
                    AnonymousClass59F r3 = AnonymousClass59F.UPDATES_TAB_LIST;
                    StringBuilder A0v2 = C18290x4.A0v(r4);
                    A0v2.append(" Item clicked, source: ");
                    A0v2.append(r3);
                    A0v2.append(", position: ");
                    A0v2.append(-1);
                    AnonymousClass5YD.A01(AnonymousClass000.A0b(", is in search mode: ", A0v2, false));
                    if (this.A12) {
                        AnonymousClass5YD r2 = this.A0X;
                        if (r2 != null) {
                            C94884sE r1 = new C94884sE();
                            r1.A00 = 3;
                            r2.A03.BhD(r1);
                        } else {
                            throw C18270x1.A0S("newsletterLogging");
                        }
                    }
                    C105325Um r32 = this.A0Y;
                    if (r32 != null) {
                        C003203q A0Q2 = A0Q();
                        AnonymousClass0x9.A1L(A0Q2);
                        r32.A04((C89654ea) A0Q2, r4, (AnonymousClass4GQ) null, 3);
                        return;
                    }
                    throw C18270x1.A0S("newsletterLauncher");
                }
                throw C18270x1.A0S("newsletterLogging");
            }
            return;
        }
        throw C18270x1.A0S("time");
    }

    public C110065fd BD8(int i, int i2, boolean z) {
        AnonymousClass673 r1;
        C110065fd r3 = this.A0Z;
        if (r3 == null) {
            View findViewById = A0R().findViewById(R.id.pager_holder);
            List list = this.A0y;
            if (list == null) {
                throw C18270x1.A0S("fabsList");
            }
            ArrayList A0J2 = AnonymousClass002.A0J(list);
            C620633i r6 = this.A0J;
            if (r6 != null) {
                r3 = new C110065fd(this, C88694ab.A00(findViewById, i, i2), r6, A0J2, z);
            } else {
                throw C18270x1.A0S("systemServices");
            }
        }
        C003203q A0Q2 = A0Q();
        if ((A0Q2 instanceof AnonymousClass673) && (r1 = (AnonymousClass673) A0Q2) != null) {
            C95704uI r12 = (C95704uI) r1;
            r12.A04.A05(r12.A7C(), false);
        }
        this.A0Z = r3;
        r3.A05(new C117095rN(this, 21));
        return r3;
    }

    public void BcS(UserJid userJid, boolean z) {
        DialogFragment A002;
        String str = null;
        UpdatesViewModel updatesViewModel = this.A0q;
        UserJid userJid2 = userJid;
        if (z) {
            if (updatesViewModel != null) {
                str = updatesViewModel.A0h.A0E();
            }
            A002 = C387028u.A00(userJid2, (Long) null, (String) null, (String) null, str, true);
        } else {
            if (updatesViewModel != null) {
                str = updatesViewModel.A0h.A0E();
            }
            A002 = C386928t.A00(userJid2, (Long) null, (String) null, (String) null, str, true);
        }
        C57052sz.A01(A002, this);
    }

    public void A0a() {
        Log.i("UpdatesFragment/onDestroy");
        AnonymousClass4L4 r0 = this.A0o;
        if (r0 != null) {
            AnimatorSet animatorSet = r0.A00;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A0H = null;
            C53502nC r02 = this.A0T;
            if (r02 != null) {
                r02.A00();
                super.A0a();
                return;
            }
            throw C18270x1.A0S("newsletterMediaDownloadManager");
        }
        throw C18270x1.A0S("collapseSublistAnimator");
    }

    public void A0e() {
        Log.i("UpdatesFragment/onPause");
        C105105Tp r0 = this.A0k;
        if (r0 != null) {
            r0.A05.A0A(this);
            C110065fd r02 = this.A0Z;
            if (r02 != null) {
                r02.A00();
            }
            C613930n r03 = this.A0m;
            if (r03 != null) {
                r03.A02();
                C105795Wl r04 = this.A0d;
                if (r04 != null) {
                    r04.A00.cancel();
                }
                super.A0e();
                return;
            }
            throw C18270x1.A0S("statusUndoHandler");
        }
        throw C18270x1.A0S("statusSharingManager");
    }

    public void A0f() {
        C115155oD r0 = this.A0l;
        if (r0 != null) {
            r0.A01.A07("StatusesFragment_onResume");
            Log.i("UpdatesFragment/onResume");
            super.A0f();
            C105105Tp r02 = this.A0k;
            if (r02 != null) {
                AnonymousClass6C6.A02(this, r02.A05, C1001359q.A00(this, 33), 358);
                C115155oD r03 = this.A0l;
                if (r03 != null) {
                    r03.A01.A06("StatusesFragment_onResume");
                    Log.d("Scheduling data init on resume");
                    C69263Wi r3 = this.A0D;
                    if (r3 != null) {
                        r3.A0T(new C117095rN(this, 20), 500);
                        C613930n r04 = this.A0m;
                        if (r04 != null) {
                            r04.A01();
                            return;
                        }
                        throw C18270x1.A0S("statusUndoHandler");
                    }
                    throw C18270x1.A0S("globalUI");
                }
                throw C18270x1.A0S("statusUpdatesTracker");
            }
            throw C18270x1.A0S("statusSharingManager");
        }
        throw C18270x1.A0S("statusUpdatesTracker");
    }

    public void A0g() {
        Log.i("UpdatesFragment/onStart");
        super.A0g();
        C102335Il r0 = this.A0e;
        if (r0 != null) {
            if (C56952sp.A0J(r0.A02, 6215)) {
                C45512a8 r1 = this.A0f;
                if (r1 != null) {
                    C56972sr r02 = this.A0E;
                    if (r02 != null) {
                        PhoneUserJid A052 = C56972sr.A05(r02);
                        C162457s7.A0D(A052);
                        r1.A00(A052);
                    } else {
                        throw C18270x1.A0S("meManager");
                    }
                } else {
                    throw C18270x1.A0S("ctwaEntryPointConfigManager");
                }
            }
            AnonymousClass5PU r03 = this.A0a;
            if (r03 != null) {
                r03.A00(this);
                C104745Se r04 = this.A0u;
                if (r04 != null) {
                    if (r04.A02()) {
                        C183538qC r05 = this.A0w;
                        if (r05 != null) {
                            ((C102875Kp) ((AnonymousClass5YA) r05.get()).A09.get()).A01 = new AnonymousClass5AR(this, 1);
                        } else {
                            throw C18270x1.A0S("xFamilyCrosspostManagerLazy");
                        }
                    }
                    WfalManager wfalManager = this.A0F;
                    if (wfalManager == null) {
                        throw C18270x1.A0S("wfalManager");
                    } else if (wfalManager.A02()) {
                        AnonymousClass5L2 r06 = this.A0t;
                        if (r06 != null) {
                            r06.A06.A01 = new C101935Gv(this);
                            return;
                        }
                        throw C18270x1.A0S("crosspostContextualShareUiManager");
                    }
                } else {
                    throw C18270x1.A0S("xFamilyGating");
                }
            } else {
                throw C18270x1.A0S("waSnackbarRegistry");
            }
        } else {
            throw C18270x1.A0S("advertiseGating");
        }
    }

    public void A0h() {
        Log.i("UpdatesFragment/onStop");
        super.A0h();
        AnonymousClass5PU r0 = this.A0a;
        if (r0 != null) {
            r0.A01(this);
            C104745Se r02 = this.A0u;
            if (r02 != null) {
                if (r02.A02()) {
                    C183538qC r03 = this.A0w;
                    if (r03 != null) {
                        ((C102875Kp) ((AnonymousClass5YA) r03.get()).A09.get()).A01 = null;
                    } else {
                        throw C18270x1.A0S("xFamilyCrosspostManagerLazy");
                    }
                }
                WfalManager wfalManager = this.A0F;
                if (wfalManager == null) {
                    throw C18270x1.A0S("wfalManager");
                } else if (wfalManager.A02()) {
                    AnonymousClass5L2 r04 = this.A0t;
                    if (r04 != null) {
                        r04.A06.A01 = null;
                        return;
                    }
                    throw C18270x1.A0S("crosspostContextualShareUiManager");
                }
            } else {
                throw C18270x1.A0S("xFamilyGating");
            }
        } else {
            throw C18270x1.A0S("waSnackbarRegistry");
        }
    }

    public void A0k(int i, int i2, Intent intent) {
        if (i != 33) {
            if (i != 35) {
                if (i != 151 || i2 != -1) {
                    return;
                }
                if (this.A10) {
                    A1M();
                } else {
                    A1N();
                }
            } else if (this.A10) {
                CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A0i;
                if (crossPostingUpdatesViewModel == null) {
                    throw C18270x1.A0S("crosspostingUpdatesViewModel");
                }
                crossPostingUpdatesViewModel.A06.A00();
                crossPostingUpdatesViewModel.A0E(false, true);
                C105105Tp r0 = this.A0k;
                if (r0 != null) {
                    r0.A00(intent);
                    return;
                }
                throw C18270x1.A0S("statusSharingManager");
            }
        } else if (i2 == -1) {
            A1J();
        }
    }

    public void A0o(Bundle bundle) {
        Log.i("UpdatesFragment/onActivityCreated");
        C115155oD r0 = this.A0l;
        if (r0 != null) {
            r0.A02.A0A.markerPoint(453128091, 1, "CREATE_ACTIVITY_START");
            this.A0X = true;
            A13(true);
            C115155oD r02 = this.A0l;
            if (r02 != null) {
                AnonymousClass8JP r2 = r02.A02.A0A;
                r2.markerPoint(453128091, 1, "CREATE_ACTIVITY_END");
                r2.markerEnd(453128091, 1, 2);
                return;
            }
            throw C18270x1.A0S("statusUpdatesTracker");
        }
        throw C18270x1.A0S("statusUpdatesTracker");
    }

    public void A0p(Bundle bundle) {
        Log.i("UpdatesFragment/onCreate");
        C115155oD r0 = this.A0l;
        if (r0 != null) {
            r0.A00();
            super.A0p(bundle);
            if (bundle != null) {
                this.A14 = bundle.getBoolean("is_tab_selected");
                return;
            }
            return;
        }
        throw C18270x1.A0S("statusUpdatesTracker");
    }

    public void A1I() {
        C103685Ny r0;
        C623534r r02;
        UpdatesViewModel updatesViewModel = this.A0q;
        if (updatesViewModel == null || (r0 = (C103685Ny) updatesViewModel.A0M.A07()) == null || (r02 = r0.A00) == null || r02.A02() <= 0) {
            A1J();
            return;
        }
        Context A0G2 = A0G();
        Intent A072 = C18320x8.A07();
        A072.setClassName(A0G2.getPackageName(), "com.whatsapp.status.playback.MyStatusesActivity");
        A0m(A072);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.A0X(4905) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1J() {
        /*
            r5 = this;
            X.2sr r0 = r5.A0E
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x002f
            X.2q4 r0 = r5.A0I
            if (r0 == 0) goto L_0x0082
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x0026
            X.1VX r1 = r5.A0P
            if (r1 == 0) goto L_0x007d
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0026:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.C57052sz.A01(r0, r5)
        L_0x002e:
            return
        L_0x002f:
            X.1VX r2 = r5.A0P
            if (r2 == 0) goto L_0x00a2
            X.5ZR r1 = r5.A0M
            if (r1 == 0) goto L_0x009b
            r4 = 33
            android.content.Context r0 = r5.A1D()
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0L(r0, r1, r2, r4)
            if (r0 != 0) goto L_0x0097
            X.5O5 r3 = r5.A0G
            if (r3 == 0) goto L_0x0090
            X.03q r2 = r5.A0R()
            X.03q r1 = r5.A0Q()
            boolean r0 = r1 instanceof X.AnonymousClass4FU
            if (r0 == 0) goto L_0x0089
            X.4FU r1 = (X.AnonymousClass4FU) r1
            if (r1 == 0) goto L_0x0089
            X.4Ep r0 = r5.A15
            boolean r0 = r3.A00(r2, r1, r0, r4)
            if (r0 == 0) goto L_0x002e
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r5.A0q
            if (r0 == 0) goto L_0x006a
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r0.A0h
            X.5mK r0 = r0.A0C
            r0.A03()
        L_0x006a:
            android.content.Context r2 = r5.A0G()
            X.6kE r0 = X.C135166kE.A00
            java.lang.String r1 = r0.getRawString()
            r0 = 4
            android.content.Intent r0 = X.C627736r.A0u(r2, r1, r0)
            r5.A0m(r0)
            return
        L_0x007d:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0082:
            java.lang.String r0 = "companionModeSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0089:
            java.lang.String r0 = "Activity should extend DialogInterface"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0090:
            java.lang.String r0 = "cameraPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0097:
            r5.startActivityForResult(r0, r4)
            return
        L_0x009b:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a2:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x00a7:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A1J():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1.A0X(4905) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1K() {
        /*
            r2 = this;
            X.2sr r0 = r2.A0E
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x003b
            X.2q4 r0 = r2.A0I
            if (r0 == 0) goto L_0x0034
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x0026
            X.1VX r1 = r2.A0P
            if (r1 == 0) goto L_0x002f
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x003b
        L_0x0026:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.C57052sz.A01(r0, r2)
            return
        L_0x002f:
            java.lang.RuntimeException r0 = X.C18270x1.A0R()
            throw r0
        L_0x0034:
            java.lang.String r0 = "companionModeSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x003b:
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r2.A0q
            if (r0 == 0) goto L_0x0046
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r0.A0h
            X.5mK r0 = r0.A0C
            r0.A04()
        L_0x0046:
            android.content.Context r1 = r2.A0G()
            java.lang.Integer r0 = X.C18290x4.A0c()
            android.content.Intent r0 = X.C627736r.A0q(r1, r0)
            r2.A0m(r0)
            return
        L_0x0056:
            java.lang.String r0 = "meManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A1K():void");
    }

    public final void A1O() {
        LinearLayoutManager linearLayoutManager;
        UpdatesAdapter updatesAdapter;
        AnonymousClass536 r1;
        C55592qb r0;
        ObservableRecyclerView observableRecyclerView = this.A0H;
        C06440Xs r12 = null;
        if (observableRecyclerView != null) {
            r12 = observableRecyclerView.getLayoutManager();
        }
        if ((r12 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r12) != null) {
            int A1H = linearLayoutManager.A1H();
            int A1J = linearLayoutManager.A1J();
            if (A1H != -1 && A1J != -1 && (updatesAdapter = this.A0p) != null) {
                C53502nC r4 = this.A0T;
                if (r4 != null) {
                    HashSet A0K2 = AnonymousClass002.A0K();
                    HashSet A0K3 = AnonymousClass002.A0K();
                    int size = updatesAdapter.A04.size() - 1;
                    if (A1J > size) {
                        A1J = size;
                    }
                    if (A1H <= A1J) {
                        while (true) {
                            Object obj = updatesAdapter.A04.get(A1H);
                            if ((obj instanceof AnonymousClass536) && (r1 = (AnonymousClass536) obj) != null) {
                                C624134x r13 = r1.A04;
                                if ((r13 instanceof C30471mV) && C383227b.A00((C30471mV) r13)) {
                                    A0K2.add(r13);
                                } else if (!(r13 == null || (r0 = r13.A0l) == null || r0.A09)) {
                                    A0K3.add(r13);
                                }
                            }
                            if (A1H == A1J) {
                                break;
                            }
                            A1H++;
                        }
                    }
                    r4.A01(new AnonymousClass2LL(A0K2, A0K3));
                    return;
                }
                throw C18270x1.A0S("newsletterMediaDownloadManager");
            }
        }
    }

    public void A1Q(int i) {
        AnonymousClass5YD r0 = this.A0X;
        if (r0 != null) {
            r0.A04(i);
            C105325Um r5 = this.A0Y;
            if (r5 != null) {
                C003203q A0Q2 = A0Q();
                AnonymousClass0x9.A1L(A0Q2);
                C89654ea r4 = (C89654ea) A0Q2;
                C162457s7.A0J(r4, 0);
                r5.A04(r4, (C95804uY) null, new AnonymousClass622(AnonymousClass0x9.A14(r4)), 0);
                return;
            }
            throw C18270x1.A0S("newsletterLauncher");
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r5 == r0) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(X.C997157s r5) {
        /*
            r4 = this;
            X.5rC r0 = r4.A03
            if (r0 == 0) goto L_0x0077
            r0.A04()
            r4.A0G()
            com.whatsapp.status.advertise.UpdatesAdvertiseViewModel r3 = r4.A0g
            if (r3 != 0) goto L_0x0015
            java.lang.String r0 = "advertiseViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0015:
            X.5rC r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0027
            r1.A04()
            java.lang.String r0 = "logStatusEntryPointClicked"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0027:
            X.57s r0 = X.C997157s.Banner
            if (r5 != r0) goto L_0x0072
            X.33p r0 = r3.A02
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pref_advertise_banner_status_main_shown"
            X.C18270x1.A0l(r1, r0, r2)
            X.0XV r2 = r3.A00
            java.lang.String r1 = "KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A06(r1, r0)
            X.5Z6 r2 = r3.A03
            X.588 r1 = X.AnonymousClass588.ADVERTISE
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            java.lang.String r1 = X.AnonymousClass5Z6.A00(r1)
            X.33p r0 = r2.A00
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r0)
            X.C18270x1.A0f(r0, r1)
        L_0x0055:
            r3 = 44
        L_0x0057:
            X.57s r0 = X.C997157s.Button
            if (r5 != r0) goto L_0x006f
            X.59G r2 = X.AnonymousClass59G.A0k
        L_0x005d:
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.String r1 = "-1"
            X.6eX r0 = new X.6eX
            r0.<init>(r2, r1, r3)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x006f:
            X.59G r2 = X.AnonymousClass59G.A0j
            goto L_0x005d
        L_0x0072:
            r3 = 43
            if (r5 != r0) goto L_0x0057
            goto L_0x0055
        L_0x0077:
            java.lang.String r0 = "smbAdsCreationActivityRouter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A1S(X.57s):void");
    }

    public boolean Awt() {
        return true;
    }

    public void AxH(AnonymousClass5U2 r9) {
        Object obj;
        CharSequence charSequence;
        C997458a r0;
        String str = r9.A01;
        this.A0x = str;
        UpdatesViewModel updatesViewModel = this.A0q;
        if (updatesViewModel != null) {
            String A012 = ((SearchUsecase) C18300x5.A0d(updatesViewModel.A0r)).A01();
            if (str == null || (obj = C175728Zm.A0I(str)) == null) {
                obj = "";
            }
            if (!C162457s7.A0P(A012, obj)) {
                AnonymousClass66R r5 = updatesViewModel.A0r;
                SearchUsecase searchUsecase = (SearchUsecase) C18300x5.A0d(r5);
                AnonymousClass4C6 A002 = AnonymousClass0IV.A00(updatesViewModel);
                C162457s7.A0J(A002, 1);
                if (str != null) {
                    charSequence = C175728Zm.A0I(str);
                } else {
                    charSequence = null;
                }
                searchUsecase.A03 = charSequence;
                searchUsecase.A05.A0H(C72023d3.A00);
                AnonymousClass66R r1 = searchUsecase.A0B;
                if (C18270x1.A1V(r1)) {
                    r0 = C997458a.LOADING;
                } else {
                    r0 = C997458a.DONE;
                }
                searchUsecase.A04(r0, true);
                if ((!C175738Zn.A0V(searchUsecase.A01())) && C18270x1.A1V(r1)) {
                    C616131n.A02(searchUsecase.A0C, new SearchUsecase$launchRemoteSearch$1(searchUsecase, (C84814Du) null), A002, (AnonymousClass20D) null, 2);
                }
                updatesViewModel.A0A = ((SearchUsecase) C18300x5.A0d(r5)).A05();
                if (C175738Zn.A0V(((SearchUsecase) C18300x5.A0d(r5)).A01())) {
                    updatesViewModel.A0G();
                }
            }
        }
    }

    public boolean B3Y() {
        return true;
    }

    public AnonymousClass0GC B6S() {
        AnonymousClass0GC r0 = this.A0L.A02;
        C162457s7.A0D(r0);
        return r0;
    }

    public String B8C() {
        return "status_fragment";
    }

    public /* synthetic */ String B9K() {
        return null;
    }

    public Drawable BCZ() {
        if (this.A0r != null) {
            Context A0G2 = A0G();
            boolean z = C1001059l.A04;
            int i = R.drawable.ic_text_status_compose;
            if (z) {
                i = R.drawable.ic_text_status_compose_filled_wds;
            }
            return C107335b8.A04(A0G2, i, AnonymousClass5Yj.A02(A0G(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        throw C18270x1.A0S("systemFeatures");
    }

    public int BDV() {
        return 300;
    }

    public /* synthetic */ String BDl() {
        return null;
    }

    public void BR7(DialogFragment dialogFragment, boolean z) {
    }

    public void BTn() {
        Log.d("UpdatesFragment/UpdatesFragment/onFragmentAsyncInit");
        A1P();
        this.A0z = true;
        C97154xi r2 = this.A0S;
        if (r2 != null) {
            r2.A09(300, false);
            return;
        }
        throw C18270x1.A0S("splitWindowManager");
    }

    public boolean BTo() {
        return this.A0z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0.A00() != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0.A00.A0X(56) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcR(com.whatsapp.jid.UserJid r5) {
        /*
            r4 = this;
            boolean r0 = r4.A13
            if (r0 == 0) goto L_0x0012
            X.5Mi r0 = r4.A0b
            if (r0 == 0) goto L_0x0063
            X.1VX r1 = r0.A00
            r0 = 56
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0020
        L_0x0012:
            boolean r0 = r4.A13
            if (r0 != 0) goto L_0x0053
            X.5Mi r0 = r4.A0b
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0053
        L_0x0020:
            r3 = 1
        L_0x0021:
            android.content.Context r2 = r4.A1D()
            r1 = 0
            boolean r0 = r4.A13
            android.content.Intent r0 = X.C627736r.A0S(r2, r5, r1, r0, r3)
            r4.A0m(r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r4.A0q
            if (r0 == 0) goto L_0x0039
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r0.A0h
            r0 = 0
            r1.A0G(r5, r0, r0)
        L_0x0039:
            boolean r0 = r4.A12
            if (r0 == 0) goto L_0x0052
            X.5YD r2 = r4.A0X
            if (r2 == 0) goto L_0x0055
            r0 = 2
            X.4sE r1 = new X.4sE
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.4FV r0 = r2.A03
            r0.BhD(r1)
        L_0x0052:
            return
        L_0x0053:
            r3 = 0
            goto L_0x0021
        L_0x0055:
            java.lang.String r0 = "newsletterLogging"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x005c:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0063:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.BcR(com.whatsapp.jid.UserJid):void");
    }

    public void BnI(boolean z) {
        UpdatesViewModel updatesViewModel;
        Long l;
        int i;
        ObservableRecyclerView observableRecyclerView;
        this.A12 = z;
        Context A1D = A1D();
        if (!(A1D == null || (observableRecyclerView = this.A0H) == null)) {
            int dimensionPixelSize = A1D.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (z) {
                dimensionPixelSize = 0;
            }
            AnonymousClass5SY r0 = this.A0R;
            if (r0 != null) {
                boolean z2 = !r0.A03;
                int dimensionPixelSize2 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                if (z2 && !z) {
                    dimensionPixelSize2 = C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, dimensionPixelSize2);
                }
                observableRecyclerView.setPadding(observableRecyclerView.getPaddingLeft(), dimensionPixelSize2, observableRecyclerView.getPaddingRight(), dimensionPixelSize);
            } else {
                throw C18270x1.A0S("bottomNavHelper");
            }
        }
        if (z && (updatesViewModel = this.A0q) != null) {
            StatusesViewModel statusesViewModel = updatesViewModel.A0h;
            long size = (long) statusesViewModel.A00.A03.size();
            Iterator it = statusesViewModel.A00.A03.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                C623534r A19 = C86664Kz.A19(it);
                i3 += A19.A02() - A19.A03();
            }
            long j = (long) i3;
            Iterator it2 = statusesViewModel.A00.A02.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                C623534r A192 = C86664Kz.A19(it2);
                i4 += A192.A02() - A192.A03();
            }
            long j2 = j + ((long) i4);
            long size2 = (long) statusesViewModel.A00.A02.size();
            Iterator it3 = statusesViewModel.A00.A02.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                i5 += C86664Kz.A19(it3).A03();
            }
            long j3 = (long) i5;
            Iterator it4 = statusesViewModel.A00.A03.iterator();
            int i6 = 0;
            while (it4.hasNext()) {
                i6 += C86664Kz.A19(it4).A03();
            }
            long j4 = j3 + ((long) i6);
            SearchUsecase searchUsecase = (SearchUsecase) C18300x5.A0d(updatesViewModel.A0r);
            AnonymousClass08M r11 = updatesViewModel.A0T;
            Collection<AnonymousClass536> A1P = C86664Kz.A1P(r11);
            Long l2 = null;
            if (A1P != null) {
                if (A1P.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (AnonymousClass536 r02 : A1P) {
                        if (AnonymousClass000.A1Y(r02.A03.A07, C372821q.SUBSCRIBED) && (i = i + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                l = AnonymousClass0x9.A0m(i);
            } else {
                l = null;
            }
            Collection<AnonymousClass536> A1P2 = C86664Kz.A1P(r11);
            if (A1P2 != null) {
                if (!A1P2.isEmpty()) {
                    for (AnonymousClass536 r03 : A1P2) {
                        if (r03.A03.A0K() && (i2 = i2 + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                l2 = AnonymousClass0x9.A0m(i2);
            }
            AnonymousClass5YD r112 = searchUsecase.A09;
            Long valueOf = Long.valueOf(size);
            Long valueOf2 = Long.valueOf(j2);
            Long valueOf3 = Long.valueOf(size2);
            Long valueOf4 = Long.valueOf(j4);
            C94884sE r1 = new C94884sE();
            r1.A00 = 1;
            r1.A06 = valueOf;
            r1.A05 = valueOf2;
            r1.A04 = valueOf3;
            r1.A03 = valueOf4;
            r1.A02 = l;
            r1.A01 = l2;
            r112.A03.BhD(r1);
        }
    }

    public void BnJ(boolean z) {
        ObservableRecyclerView observableRecyclerView;
        UpdatesViewModel updatesViewModel = this.A0q;
        if (updatesViewModel != null) {
            this.A14 = z;
            if (z) {
                AnonymousClass33p r3 = this.A0N;
                if (r3 != null) {
                    C56612sH r0 = this.A0K;
                    if (r0 != null) {
                        C18270x1.A0i(C18270x1.A03(r3), "status_tab_last_opened_time", r0.A0H());
                        AnonymousClass30V r1 = this.A0n;
                        if (r1 != null) {
                            r1.A02((C95814uZ) null, 25);
                            C105795Wl r02 = this.A0d;
                            if (r02 != null) {
                                r02.A00();
                            }
                            AnonymousClass5UP r12 = this.A0U;
                            if (r12 == null) {
                                throw C18270x1.A0S("newsletterConfig");
                            } else if (r12.A03(2) && (observableRecyclerView = this.A0H) != null) {
                                observableRecyclerView.post(new C117095rN(this, 22));
                            }
                        } else {
                            throw C18270x1.A0S("navigationTimeSpentManager");
                        }
                    } else {
                        throw C18270x1.A0S("time");
                    }
                } else {
                    throw C18270x1.A0S("waSharedPreferences");
                }
            } else {
                C105795Wl r03 = this.A0d;
                if (r03 != null) {
                    r03.A00.cancel();
                }
                CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A0i;
                if (crossPostingUpdatesViewModel == null) {
                    throw C18270x1.A0S("crosspostingUpdatesViewModel");
                }
                C104715Sb r04 = crossPostingUpdatesViewModel.A00;
                if (r04 == null) {
                    throw C18270x1.A0S("crossPostingViewModelState");
                } else if (r04.A01) {
                    if (crossPostingUpdatesViewModel.A02.A02()) {
                        crossPostingUpdatesViewModel.A08.A07.A00();
                    } else if (crossPostingUpdatesViewModel.A0A.A00()) {
                        C105125Tr r32 = crossPostingUpdatesViewModel.A09;
                        r32.A08.A04("EXIT_STATUS_VIEW");
                        r32.A09.A04("EXIT_STATUS_VIEW");
                        r32.A06.A01();
                    } else {
                        C102975Kz r05 = crossPostingUpdatesViewModel.A07.A00;
                        if (r05 != null) {
                            r05.A00 = 1;
                        }
                        crossPostingUpdatesViewModel.A06.A00();
                        crossPostingUpdatesViewModel.A0E(false, false);
                    }
                }
            }
            boolean z2 = updatesViewModel.A0D;
            updatesViewModel.A0D = z;
            if (!z) {
                updatesViewModel.A0g.A00();
                Timer timer = updatesViewModel.A09;
                if (timer != null) {
                    timer.cancel();
                }
                updatesViewModel.A08 = null;
                updatesViewModel.A0h.A0C.A05();
                return;
            }
            updatesViewModel.A0H = true;
            updatesViewModel.A0i.A00 = true;
            updatesViewModel.A0H();
            updatesViewModel.A0G();
            C986752u r13 = (C986752u) updatesViewModel.A0P.A07();
            if (r13 != null) {
                updatesViewModel.A0c.A0D(r13);
            }
            updatesViewModel.A0K = false;
            if (!z2) {
                updatesViewModel.A0K();
            }
        }
    }

    public boolean BqR() {
        AnonymousClass5UP r0 = this.A0U;
        if (r0 != null) {
            return r0.A01.A0X(5769);
        }
        throw C18270x1.A0S("newsletterConfig");
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public static final /* synthetic */ void A00(UpdatesFragment updatesFragment, Object[] objArr, int i, int i2) {
        AnonymousClass4FU r1;
        C003203q A0Q2 = updatesFragment.A0Q();
        if ((A0Q2 instanceof AnonymousClass4FU) && (r1 = (AnonymousClass4FU) A0Q2) != null) {
            r1.Box(Arrays.copyOf(objArr, objArr.length), i, i2);
        }
    }

    public void A0c() {
        super.A0c();
        ObservableRecyclerView observableRecyclerView = this.A0H;
        if (observableRecyclerView != null) {
            observableRecyclerView.setAdapter((AnonymousClass0R6) null);
        }
        this.A0p = null;
        List list = this.A0y;
        if (list == null) {
            throw C18270x1.A0S("fabsList");
        }
        list.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.view.Menu r5, android.view.MenuInflater r6) {
        /*
            r4 = this;
            boolean r2 = X.C18270x1.A1U(r5, r6)
            r0 = 2131431398(0x7f0b0fe6, float:1.8484524E38)
            android.view.MenuItem r3 = r5.findItem(r0)
            if (r3 == 0) goto L_0x0024
            boolean r0 = r4.A13
            if (r0 == 0) goto L_0x0020
            X.5Mi r0 = r4.A0b
            if (r0 == 0) goto L_0x0074
            X.1VX r1 = r0.A00
            r0 = 6799(0x1a8f, float:9.527E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r3.setVisible(r0)
        L_0x0024:
            boolean r0 = r4.A13
            r3 = 2
            if (r0 == 0) goto L_0x0047
            X.5Mi r0 = r4.A0b
            if (r0 == 0) goto L_0x006d
            X.1VX r1 = r0.A00
            r0 = 6798(0x1a8e, float:9.526E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0047
            r1 = 2131431468(0x7f0b102c, float:1.8484666E38)
            r0 = 2131893423(0x7f121caf, float:1.9421622E38)
            android.view.MenuItem r1 = r5.add(r3, r1, r2, r0)
            r0 = 2131234202(0x7f080d9a, float:1.8084563E38)
            X.AnonymousClass5B7.A01(r1, r4, r0)
        L_0x0047:
            X.5Mi r0 = r4.A0b
            if (r0 == 0) goto L_0x0066
            X.1VX r1 = r0.A00
            r0 = 6850(0x1ac2, float:9.599E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0065
            r1 = 2131431486(0x7f0b103e, float:1.8484703E38)
            r0 = 2131896368(0x7f122830, float:1.9427595E38)
            android.view.MenuItem r1 = r5.add(r3, r1, r2, r0)
            r0 = 2131234166(0x7f080d76, float:1.808449E38)
            X.AnonymousClass5B7.A01(r1, r4, r0)
        L_0x0065:
            return
        L_0x0066:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x006d:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0074:
            java.lang.String r0 = "statusConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A0y(android.view.Menu, android.view.MenuInflater):void");
    }

    public void A1L() {
        Context A1D = A1D();
        if (A1D != null) {
            Intent A072 = C18320x8.A07();
            A072.setClassName(A1D.getPackageName(), "com.whatsapp.status.seeall.StatusSeeAllActivity");
            A1D.startActivity(A072);
        }
    }

    public final void A1P() {
        UpdatesAdapter updatesAdapter;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Initializing data load ");
        C18260x0.A1U(A0o2, !this.A11);
        if (!this.A11) {
            this.A11 = true;
            C101505Fa r3 = this.A0C;
            if (r3 != null) {
                C69263Wi A042 = C64333Db.A04(r3.A00.A01);
                C64333Db r2 = r3.A00.A01;
                this.A0c = new StatusExpirationLifecycleOwner(this, A042, (C55152pt) r2.AWi.get(), C86634Kw.A0h(r2), C64333Db.A8y(r2));
                Log.d("Instantiating updates view model");
                AnonymousClass5FA r22 = this.A08;
                if (r22 != null) {
                    StatusesViewModel A002 = C110565gf.A00(this, r22, true);
                    this.A0g = (UpdatesAdvertiseViewModel) AnonymousClass0x9.A0H(this).A01(UpdatesAdvertiseViewModel.class);
                    CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) AnonymousClass0x9.A0H(this).A01(CrossPostingUpdatesViewModel.class);
                    this.A0i = crossPostingUpdatesViewModel;
                    AnonymousClass5FB r32 = this.A09;
                    if (r32 != null) {
                        UpdatesAdvertiseViewModel updatesAdvertiseViewModel = this.A0g;
                        if (updatesAdvertiseViewModel == null) {
                            throw C18270x1.A0S("advertiseViewModel");
                        } else if (crossPostingUpdatesViewModel == null) {
                            throw C18270x1.A0S("crosspostingUpdatesViewModel");
                        } else {
                            C162457s7.A0J(A002, 1);
                            UpdatesViewModel updatesViewModel = (UpdatesViewModel) AnonymousClass4L0.A0F(new C123896Ae(A002, crossPostingUpdatesViewModel, r32, updatesAdvertiseViewModel, 1), this).A01(UpdatesViewModel.class);
                            AnonymousClass08A r33 = this.A0L;
                            Log.d("attach lifecycle observers");
                            r33.A00(A002);
                            r33.A00(updatesViewModel);
                            CrossPostingUpdatesViewModel crossPostingUpdatesViewModel2 = this.A0i;
                            if (crossPostingUpdatesViewModel2 == null) {
                                throw C18270x1.A0S("crosspostingUpdatesViewModel");
                            }
                            r33.A00(crossPostingUpdatesViewModel2);
                            this.A0q = updatesViewModel;
                            if (this.A0e != null) {
                                View view = this.A0B;
                                if (view == null) {
                                    Log.e("Cannot setup updates list since the fragmentView is null");
                                    return;
                                }
                                Log.d("Setup updates list");
                                AnonymousClass5FI r34 = this.A0A;
                                if (r34 != null) {
                                    AnonymousClass4FS A8y = C64333Db.A8y(r34.A00.A01);
                                    C64333Db r23 = r34.A00.A01;
                                    C64333Db r232 = r23;
                                    C114015mM A29 = C64333Db.A29(r232);
                                    C54292oU A2q = C64333Db.A2q(r232);
                                    C107695bk r4 = r23.A00;
                                    C64333Db r6 = r4.ACP;
                                    AnonymousClass5T1 r16 = new AnonymousClass5T1(C86614Ku.A0L(r6), C86614Ku.A0W(r6), C86604Kt.A0Z(r6), (AnonymousClass5UP) r6.ANe.get(), (AnonymousClass5Z6) r4.ABA.get(), r4.APb());
                                    AnonymousClass5UP A0n2 = C86634Kw.A0n(r232);
                                    AnonymousClass1VX A4B = C64333Db.A4B(r232);
                                    C102335Il APZ = r4.APZ();
                                    AnonymousClass5FV r26 = (AnonymousClass5FV) r4.AA8.get();
                                    AnonymousClass5FU r25 = (AnonymousClass5FU) r4.A0J.get();
                                    AnonymousClass5MF r24 = (AnonymousClass5MF) r4.A2a.get();
                                    AnonymousClass5FT r233 = (AnonymousClass5FT) r4.A7o.get();
                                    AnonymousClass5FS r222 = (AnonymousClass5FS) r4.AAC.get();
                                    AnonymousClass5FR r21 = (AnonymousClass5FR) r4.A8B.get();
                                    AnonymousClass5FQ r20 = (AnonymousClass5FQ) r4.ABF.get();
                                    AnonymousClass5FP r19 = (AnonymousClass5FP) r4.A80.get();
                                    AnonymousClass5FO r18 = (AnonymousClass5FO) r4.ABE.get();
                                    UpdatesAdapter updatesAdapter2 = new UpdatesAdapter((AnonymousClass5FJ) r4.AB7.get(), r18, r19, r20, r21, r222, r233, r24, r25, r26, A29, A2q, A4B, A0n2, (C103295Mi) r4.ABB.get(), APZ, this, this, this, r16, A8y);
                                    this.A0L.A00(updatesAdapter2);
                                    this.A0p = updatesAdapter2;
                                    ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) C06560Yg.A02(view, R.id.updates_list);
                                    observableRecyclerView.setAdapter(this.A0p);
                                    A0G();
                                    C18320x8.A19(observableRecyclerView, 1);
                                    observableRecyclerView.setItemAnimator((AnonymousClass0UY) null);
                                    AnonymousClass5SY r27 = this.A0R;
                                    if (r27 != null) {
                                        boolean z = !r27.A03;
                                        int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
                                        if (z) {
                                            dimensionPixelSize = C86654Ky.A02(C08310eF.A09(this), R.dimen.f6nameremoved, dimensionPixelSize);
                                        }
                                        C86604Kt.A1D(observableRecyclerView, observableRecyclerView.getPaddingLeft(), dimensionPixelSize);
                                        AnonymousClass5UP r35 = this.A0U;
                                        if (r35 != null) {
                                            if (r35.A03(2)) {
                                                observableRecyclerView.A0q((AnonymousClass0O5) this.A17.getValue());
                                            }
                                            AnonymousClass5YU.A02(this, observableRecyclerView);
                                            this.A0H = observableRecyclerView;
                                            AnonymousClass5UP r28 = this.A0U;
                                            if (r28 != null) {
                                                if (r28.A02() && (updatesAdapter = this.A0p) != null) {
                                                    updatesAdapter.A01 = this;
                                                }
                                                UpdatesViewModel updatesViewModel2 = this.A0q;
                                                if (updatesViewModel2 != null) {
                                                    AnonymousClass6C6.A02(A0V(), updatesViewModel2.A0N, new AnonymousClass62R(this), 359);
                                                    AnonymousClass6C6.A02(A0V(), updatesViewModel2.A0T, new AnonymousClass633(this, updatesViewModel2), 360);
                                                    if (this.A0e != null) {
                                                        AnonymousClass6C6.A02(A0V(), updatesViewModel2.A0M, new AnonymousClass62S(this), 356);
                                                        AnonymousClass6C6.A02(A0V(), updatesViewModel2.A0h.A06, new AnonymousClass62T(this), 357);
                                                        Log.d("UpdatesViewModel/On observers ready");
                                                        updatesViewModel2.A0E();
                                                        updatesViewModel2.A0F = true;
                                                    } else {
                                                        throw C18270x1.A0S("advertiseGating");
                                                    }
                                                }
                                                C616131n.A02((C85494Gl) null, new UpdatesFragment$observeSideEffects$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
                                                return;
                                            }
                                            throw C18270x1.A0S("newsletterConfig");
                                        }
                                        throw C18270x1.A0S("newsletterConfig");
                                    }
                                    throw C18270x1.A0S("bottomNavHelper");
                                }
                                throw C18270x1.A0S("updatesAdapterFactory");
                            }
                            throw C18270x1.A0S("advertiseGating");
                        }
                    } else {
                        throw C18270x1.A0S("statusUpdatesViewModelFactory");
                    }
                } else {
                    throw C18270x1.A0S("statusesViewModelFactory");
                }
            } else {
                throw C18270x1.A0S("statusExpirationLifecycleOwnerFactory");
            }
        }
    }

    public /* synthetic */ void Awb(AnonymousClass8s5 r1) {
        r1.BMG();
    }

    public /* synthetic */ String B9I() {
        return A0G().getString(R.string.f11nameremoved);
    }

    public /* synthetic */ Drawable B9J() {
        Context A0G2 = A0G();
        boolean z = C1001059l.A04;
        int i = R.drawable.ic_camera;
        if (z) {
            i = R.drawable.ic_camera_filled_wds;
        }
        return C107335b8.A04(A0G2, i, R.color.f5nameremoved);
    }

    public /* synthetic */ String BCY() {
        return A0G().getString(R.string.f11nameremoved);
    }

    public void BVy() {
        A1J();
    }

    public void Bb1() {
        A1K();
    }
}
