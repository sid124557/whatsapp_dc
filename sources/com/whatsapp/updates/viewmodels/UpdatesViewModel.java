package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass1RL;
import X.AnonymousClass20D;
import X.AnonymousClass21F;
import X.AnonymousClass2MD;
import X.AnonymousClass31A;
import X.AnonymousClass495;
import X.AnonymousClass4C1;
import X.AnonymousClass4C8;
import X.AnonymousClass4UC;
import X.AnonymousClass4q3;
import X.AnonymousClass4q7;
import X.AnonymousClass4qB;
import X.AnonymousClass534;
import X.AnonymousClass535;
import X.AnonymousClass536;
import X.AnonymousClass58D;
import X.AnonymousClass58R;
import X.AnonymousClass5FF;
import X.AnonymousClass5FG;
import X.AnonymousClass5FH;
import X.AnonymousClass5SL;
import X.AnonymousClass5TL;
import X.AnonymousClass5UP;
import X.AnonymousClass5WK;
import X.AnonymousClass5X9;
import X.AnonymousClass5ZA;
import X.AnonymousClass649;
import X.AnonymousClass66R;
import X.AnonymousClass6A5;
import X.AnonymousClass8UF;
import X.C05550Ty;
import X.C06270Wx;
import X.C102185Hu;
import X.C102335Il;
import X.C102715Jz;
import X.C102975Kz;
import X.C103295Mi;
import X.C103445Mz;
import X.C103665Nw;
import X.C103685Ny;
import X.C104715Sb;
import X.C113995mK;
import X.C115065o3;
import X.C118475tb;
import X.C136766nE;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C175728Zm;
import X.C18260x0;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C372821q;
import X.C53502nC;
import X.C55152pt;
import X.C56612sH;
import X.C56842se;
import X.C616131n;
import X.C623534r;
import X.C624134x;
import X.C64333Db;
import X.C72023d3;
import X.C73723fy;
import X.C73853gB;
import X.C84814Du;
import X.C85494Gl;
import X.C85504Gn;
import X.C86604Kt;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C94164qC;
import X.C95124sf;
import X.C95804uY;
import X.C95814uZ;
import X.C986252p;
import X.C986352q;
import X.C986452r;
import X.C986752u;
import X.C988353k;
import X.C988453l;
import X.C988553m;
import X.C988653n;
import X.C988753o;
import X.C997458a;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public final class UpdatesViewModel extends C05550Ty implements C17280vG, AnonymousClass649 {
    public AnonymousClass08M A00;
    public C95814uZ A01;
    public C102335Il A02;
    public AnonymousClass4q3 A03;
    public AnonymousClass4qB A04;
    public C94164qC A05;
    public C115065o3 A06;
    public AnonymousClass4q7 A07;
    public Long A08;
    public Timer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C06270Wx A0M;
    public final C06270Wx A0N;
    public final AnonymousClass08J A0O;
    public final AnonymousClass08J A0P;
    public final AnonymousClass08J A0Q;
    public final AnonymousClass08M A0R;
    public final AnonymousClass08M A0S;
    public final AnonymousClass08M A0T;
    public final AnonymousClass08M A0U;
    public final AnonymousClass5FF A0V;
    public final AnonymousClass5FG A0W;
    public final AnonymousClass5FH A0X;
    public final C56612sH A0Y;
    public final C53502nC A0Z;
    public final AnonymousClass5UP A0a;
    public final C103295Mi A0b;
    public final UpdatesAdvertiseViewModel A0c;
    public final C102185Hu A0d;
    public final AnonymousClass2MD A0e;
    public final CrossPostingUpdatesViewModel A0f;
    public final AnonymousClass5X9 A0g;
    public final StatusesViewModel A0h;
    public final C102715Jz A0i;
    public final C103665Nw A0j;
    public final AnonymousClass5WK A0k;
    public final AnonymousClass4UC A0l;
    public final C183538qC A0m;
    public final List A0n;
    public final AnonymousClass4C1 A0o;
    public final AnonymousClass4C1 A0p;
    public final AnonymousClass66R A0q;
    public final AnonymousClass66R A0r;
    public final C73853gB A0s;
    public final C85504Gn A0t;
    public final AnonymousClass4C8 A0u;

    public void A0L(C95804uY r5, C624134x r6, AnonymousClass58R r7) {
        Iterable iterable;
        C162457s7.A0J(r7, 2);
        if (r7 == AnonymousClass58R.FULL_HISTORY_FETCHED || !this.A0n.contains(r5)) {
            if (this.A0A) {
                SearchUsecase searchUsecase = (SearchUsecase) C18300x5.A0d(this.A0r);
                if (searchUsecase.A05() && (iterable = (Iterable) searchUsecase.A05.A07()) != null) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C162457s7.A0P(((AnonymousClass534) next).A02.A0I(), r5)) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
            }
            A0G();
            if (r7 == AnonymousClass58R.ADDED && this.A0a.A03(2) && this.A0D && r6 != null) {
                this.A0Z.A02(r6);
            }
        }
    }

    public void BcK(AnonymousClass0GH r7, C15910sA r8) {
        C95814uZ r3;
        AnonymousClass5SL r0;
        Object obj;
        AnonymousClass1RL r2;
        int A022 = C18320x8.A02(r7, 1);
        if (A022 != 2) {
            if (A022 == 3) {
                Log.d("UpdatesViewModel/Tearing down data load...");
                C86604Kt.A1R(this.A04);
                C86604Kt.A1R(this.A07);
                C86604Kt.A1R(this.A05);
                AnonymousClass495 r02 = this.A06.A00;
                if (r02 != null) {
                    r02.cancel();
                }
                Timer timer = this.A09;
                if (timer != null) {
                    timer.cancel();
                }
                this.A08 = null;
                AnonymousClass5WK r22 = this.A0k;
                r22.A06.A07(r22.A00);
                r22.A05.A07(r22.A01);
                r22.A04.A07(r22.A03);
                r22.A07.A01 = null;
                this.A0g.A00();
                this.A0B = false;
                this.A0n.clear();
            }
        } else if (this.A0F) {
            A0E();
            if (this.A0A) {
                SearchUsecase searchUsecase = (SearchUsecase) C18300x5.A0d(this.A0r);
                if (searchUsecase.A05() && (r3 = searchUsecase.A00) != null && (r0 = (AnonymousClass5SL) searchUsecase.A04.A07()) != null) {
                    Iterator it = r0.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C162457s7.A0P(((AnonymousClass534) obj).A02.A0I(), r3)) {
                            break;
                        }
                    }
                    AnonymousClass534 r1 = (AnonymousClass534) obj;
                    if (r1 != null) {
                        C56842se r03 = searchUsecase.A08;
                        AnonymousClass1RL r32 = r1.A02;
                        C95804uY A0I2 = r32.A0I();
                        C162457s7.A0J(A0I2, 0);
                        AnonymousClass31A A0A2 = r03.A09.A0A(A0I2, false);
                        if (!(A0A2 instanceof AnonymousClass1RL) || (r2 = (AnonymousClass1RL) A0A2) == null) {
                            r2 = r32;
                            C372821q r04 = C372821q.GUEST;
                            C162457s7.A0J(r04, 0);
                            r32.A07 = r04;
                        }
                        if (r2.A07 != r32.A07) {
                            searchUsecase.A00 = null;
                            searchUsecase.A03(r2);
                        }
                    }
                }
            }
        }
    }

    public static final /* synthetic */ void A00(C95814uZ r6, C988353k r7, UpdatesViewModel updatesViewModel) {
        C988753o r0;
        Throwable th = r7.A01;
        if (!(th instanceof C136766nE)) {
            r0 = C988553m.A00;
        } else if (r7.A00 == AnonymousClass21F.FOLLOW) {
            r0 = C988453l.A00;
        } else {
            r0 = C988653n.A00;
        }
        String str = null;
        C616131n.A02((C85494Gl) null, new UpdatesViewModel$handleUpdateSubscriptionStateError$1(r0, updatesViewModel, (C84814Du) null), AnonymousClass0IV.A00(updatesViewModel), (AnonymousClass20D) null, 3);
        AnonymousClass21F r2 = r7.A00;
        if (r2 == AnonymousClass21F.FOLLOW) {
            updatesViewModel.A0n.remove(r6);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("UpdatesViewModel/Subscription state update failed. Attempted action: ");
        A0o2.append(r2);
        A0o2.append(". ");
        if (th != null) {
            str = th.getMessage();
        }
        C18260x0.A1J(A0o2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass58D A0D() {
        /*
            r4 = this;
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0047
            X.08M r0 = r4.A0T
            java.util.List r0 = X.C86644Kx.A0h(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isEmpty()
            if (r0 != r1) goto L_0x0047
            X.5Jz r3 = r4.A0i
            X.66R r0 = r3.A04
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x0047
            X.33p r0 = r3.A01
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r1 = "recommended_newsletters_collapsed"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0035
            boolean r1 = X.C18280x3.A1W(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x003f
        L_0x0035:
            X.5UP r0 = r3.A02
            X.1VX r1 = r0.A01
            r0 = 6372(0x18e4, float:8.929E-42)
            boolean r1 = r1.A0X(r0)
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            X.58D r0 = X.AnonymousClass58D.COLLAPSED
            return r0
        L_0x0044:
            X.58D r0 = X.AnonymousClass58D.EXPANDED
            return r0
        L_0x0047:
            X.58D r0 = X.AnonymousClass58D.NONE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModel.A0D():X.58D");
    }

    public final void A0E() {
        if (!this.A0B) {
            Log.d("UpdatesViewModel/Loading data...");
            this.A0J = false;
            this.A0I = false;
            this.A0B = true;
            AnonymousClass5WK r2 = this.A0k;
            r2.A06.A06(r2.A00);
            r2.A05.A06(r2.A01);
            r2.A04.A06(r2.A03);
            r2.A07.A01 = r2.A0B;
            C86604Kt.A1R(this.A07);
            AnonymousClass4q7 r22 = (AnonymousClass4q7) this.A0p.get();
            C103445Mz.A01(r22, (C103445Mz) this.A0q.getValue(), this, 5);
            this.A07 = r22;
            A0F();
            A0G();
            A0H();
        }
    }

    public final void A0F() {
        C86604Kt.A1R(this.A05);
        AnonymousClass5FG r1 = this.A0W;
        C104715Sb A0D2 = this.A0f.A0D();
        C64333Db r0 = r1.A00.A01;
        C94164qC r2 = new C94164qC((C55152pt) r0.AWi.get(), C86634Kw.A0h(r0), A0D2);
        C103445Mz.A01(r2, (C103445Mz) this.A0q.getValue(), this, 7);
        this.A05 = r2;
    }

    public final void A0G() {
        C86604Kt.A1R(this.A04);
        AnonymousClass4qB r2 = (AnonymousClass4qB) this.A0o.get();
        C103445Mz.A01(r2, (C103445Mz) this.A0q.getValue(), this, 8);
        this.A04 = r2;
    }

    public final void A0H() {
        AnonymousClass5UP r1 = this.A0a;
        if (r1.A01() && r1.A04(4356) && this.A0D) {
            this.A0n.clear();
            this.A0S.A0G(C72023d3.A00);
            C616131n.A02(this.A0s, new UpdatesViewModel$refreshRecommendedNewsletters$1(this, (C84814Du) null), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
        }
    }

    public final void A0I() {
        C103685Ny r6 = (C103685Ny) this.A0M.A07();
        if (r6 != null) {
            Collection A1P = C86664Kz.A1P(this.A0T);
            boolean z = false;
            if ((A1P != null && !A1P.isEmpty()) || this.A0b.A00()) {
                z = true;
            }
            C616131n.A02(this.A0s, new UpdatesViewModel$refreshStatusList$1(r6, this, (C84814Du) null, z), AnonymousClass0IV.A00(this), (AnonymousClass20D) null, 2);
        }
    }

    public final void A0J() {
        long j;
        AnonymousClass536 r0;
        long j2;
        long j3;
        AnonymousClass5ZA r5 = (AnonymousClass5ZA) this.A0Q.A07();
        long j4 = 0;
        if (r5 != null) {
            C623534r A002 = r5.A03.A00();
            if (A002 != null) {
                j = A002.A05();
            } else {
                j = 0;
            }
            C986452r r02 = (C986452r) C73723fy.A04(r5.A05);
            if (r02 != null) {
                j2 = r02.A01.A05();
            } else {
                j2 = 0;
            }
            if (j < j2) {
                j = j2;
            }
            C986452r r03 = (C986452r) C73723fy.A04(r5.A06);
            if (r03 != null) {
                j3 = r03.A01.A05();
            } else {
                j3 = 0;
            }
            if (j < j3) {
                j = j3;
            }
        } else {
            j = 0;
        }
        List A0h2 = C86644Kx.A0h(this.A0T);
        if (!(A0h2 == null || (r0 = (AnonymousClass536) C73723fy.A04(A0h2)) == null)) {
            j4 = r0.A01;
        }
        if (j < j4) {
            j = j4;
        }
        long A052 = AnonymousClass0x9.A05(j);
        Long l = this.A08;
        if (l == null || j != l.longValue()) {
            this.A08 = Long.valueOf(j);
            if (A052 > TimeUnit.HOURS.toMillis(1)) {
                Timer timer = this.A09;
                if (timer != null) {
                    timer.cancel();
                }
                this.A08 = null;
                return;
            }
            Log.d("UpdatesViewModel/Scheduled updates list refresh");
            Timer timer2 = this.A09;
            if (timer2 != null) {
                timer2.cancel();
            }
            Timer timer3 = new Timer();
            timer3.schedule(new C118475tb(this), TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1));
            this.A09 = timer3;
        }
    }

    public final void A0K() {
        Collection<AnonymousClass536> A1P;
        int i;
        int i2;
        int i3;
        if (this.A0H && !this.A0K && this.A0J && this.A0I) {
            this.A0K = true;
            C95124sf r3 = new C95124sf();
            boolean z = false;
            if (this.A0a.A01.A0X(5489) && (A1P = C86664Kz.A1P(this.A0T)) != null) {
                if (A1P.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (AnonymousClass536 r0 : A1P) {
                        if (r0.A03.A07 == C372821q.SUBSCRIBED && (i = i + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                r3.A02 = AnonymousClass0x9.A0m(i);
                if (A1P.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (AnonymousClass536 r02 : A1P) {
                        if (r02.A03.A0L && (i2 = i2 + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                r3.A03 = AnonymousClass0x9.A0m(i2);
                long j = 0;
                if (A1P.isEmpty()) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    for (AnonymousClass536 r03 : A1P) {
                        if (r03.A02 > 0 && (i3 = i3 + 1) < 0) {
                            AnonymousClass8UF.A0q();
                            throw AnonymousClass000.A0L();
                        }
                    }
                }
                r3.A04 = AnonymousClass0x9.A0m(i3);
                for (AnonymousClass536 r04 : A1P) {
                    j += r04.A02;
                }
                r3.A05 = Long.valueOf(j);
            }
            StatusesViewModel statusesViewModel = this.A0h;
            Collection A1P2 = C86664Kz.A1P(this.A0T);
            if (A1P2 == null || A1P2.isEmpty()) {
                z = true;
            }
            boolean z2 = true ^ z;
            C113995mK r2 = statusesViewModel.A0C;
            r2.A09(Boolean.TRUE);
            Map map = statusesViewModel.A00.A04;
            Map map2 = r2.A0G;
            map2.clear();
            map2.putAll(map);
            C102975Kz r1 = r2.A00;
            if (r1 != null && !r1.A04 && r1.A08) {
                r2.A0B(statusesViewModel.A00.A05, statusesViewModel.A00.A02.size());
            }
            r2.A06(r3, statusesViewModel.A00, z2, true);
        }
    }

    public final void A0M(boolean z) {
        AnonymousClass5SL r7;
        boolean booleanValue;
        List list;
        AnonymousClass535 r13;
        C997458a r11;
        List A0h2 = C86644Kx.A0h(this.A0T);
        if (A0h2 == null) {
            A0h2 = C72023d3.A00;
        }
        List list2 = null;
        if (this.A0A) {
            r7 = (AnonymousClass5SL) ((SearchUsecase) C18300x5.A0d(this.A0r)).A04.A07();
        } else {
            r7 = null;
        }
        AnonymousClass08J r4 = this.A0O;
        Boolean bool = (Boolean) this.A00.A07();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (this.A0A) {
            booleanValue = true;
        } else {
            booleanValue = bool.booleanValue();
        }
        AnonymousClass5ZA r14 = (AnonymousClass5ZA) this.A0Q.A07();
        if (this.A0A) {
            SearchUsecase searchUsecase = (SearchUsecase) C18300x5.A0d(this.A0r);
            if (searchUsecase.A05()) {
                if (r14 != null) {
                    List A022 = searchUsecase.A02(r14.A05);
                    List A023 = searchUsecase.A02(r14.A06);
                    List A024 = searchUsecase.A02(r14.A04);
                    C986352q r9 = r14.A03;
                    boolean z2 = r14.A01;
                    C986252p r3 = r14.A02;
                    boolean z3 = r14.A00;
                    C162457s7.A0J(A022, 1);
                    C18270x1.A11(A023, 2, A024);
                    r14 = new AnonymousClass5ZA(r3, r9, A022, A023, A024, z2, true, z3);
                } else {
                    r14 = null;
                }
            }
        }
        if (this.A0A) {
            SearchUsecase searchUsecase2 = (SearchUsecase) C18300x5.A0d(this.A0r);
            list = A0h2;
            if (searchUsecase2.A05()) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (Object next : A0h2) {
                    String str = ((AnonymousClass536) next).A03.A0H;
                    if (str != null && C175728Zm.A0S(str, searchUsecase2.A01(), true)) {
                        A0s2.add(next);
                    }
                }
                list = AnonymousClass6A5.A00(A0s2, searchUsecase2, 9);
            }
        } else {
            list = A0h2;
        }
        C986752u r12 = (C986752u) this.A0P.A07();
        if (this.A0A) {
            r12 = null;
        }
        C104715Sb A0D2 = this.A0f.A0D();
        if (this.A0A) {
            A0D2 = null;
        }
        AnonymousClass58D A0D3 = A0D();
        if (this.A0A) {
            r13 = null;
        } else {
            boolean z4 = false;
            boolean A1Y = AnonymousClass000.A1Y(A0D(), AnonymousClass58D.COLLAPSED);
            List A0h3 = C86644Kx.A0h(this.A0U);
            if (A0h3 == null) {
                A0h3 = C72023d3.A00;
            }
            if (C18310x6.A1X(A0h2) || C18310x6.A1X(this.A0n)) {
                z4 = true;
            }
            r13 = new AnonymousClass535(A0h3, z4, A1Y, this.A0G);
        }
        List A0h4 = C86644Kx.A0h(this.A0S);
        if (r7 != null) {
            list2 = r7.A01;
            r11 = r7.A00;
        } else {
            r11 = C997458a.DONE;
        }
        AnonymousClass5TL r8 = new AnonymousClass5TL(A0D2, A0D3, r11, r12, r13, r14, list, A0h4, list2, booleanValue, this.A0A, z);
        C18260x0.A1P(AnonymousClass001.A0o(), "UpdatesViewModel/UiState updated: ", r8);
        r4.A0G(r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x019a, code lost:
        if (X.C86654Ky.A1T(X.C18300x5.A0B(r1), r8) == false) goto L_0x019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UpdatesViewModel(X.AnonymousClass5FC r20, X.AnonymousClass5FD r21, X.AnonymousClass5FE r22, X.AnonymousClass5FF r23, X.AnonymousClass5FG r24, X.AnonymousClass5FH r25, X.C56612sH r26, X.C53502nC r27, X.AnonymousClass5UP r28, X.C103295Mi r29, X.C102335Il r30, com.whatsapp.status.advertise.UpdatesAdvertiseViewModel r31, X.C102185Hu r32, X.AnonymousClass2MD r33, com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel r34, X.AnonymousClass5X9 r35, com.whatsapp.status.viewmodels.StatusesViewModel r36, X.C102715Jz r37, X.AnonymousClass4FS r38, X.C183538qC r39, X.AnonymousClass4C1 r40, X.AnonymousClass4C1 r41, X.C73853gB r42) {
        /*
            r19 = this;
            r3 = 0
            r8 = r29
            r6 = r38
            r18 = r22
            r5 = r21
            r2 = r20
            r0 = r18
            X.C18260x0.A0f(r6, r2, r5, r0, r8)
            r9 = r28
            r13 = r24
            r14 = r23
            r0 = r41
            r1 = r40
            X.C18260x0.A0g(r9, r14, r1, r0, r13)
            r10 = r27
            r12 = r25
            r7 = r35
            X.C18260x0.A0Y(r12, r10, r7)
            r4 = 17
            r11 = r26
            X.C162457s7.A0J(r11, r4)
            r15 = 19
            r4 = r39
            X.C162457s7.A0J(r4, r15)
            r15 = r19
            r15.<init>()
            r15.A0b = r8
            r15.A0a = r9
            r15.A0V = r14
            r15.A0o = r1
            r15.A0p = r0
            r15.A0W = r13
            r15.A0X = r12
            r15.A0Z = r10
            r15.A0g = r7
            r0 = r30
            r15.A02 = r0
            r0 = r32
            r15.A0d = r0
            r0 = r33
            r15.A0e = r0
            r15.A0Y = r11
            r0 = r37
            r15.A0i = r0
            r15.A0m = r4
            r0 = r42
            r15.A0s = r0
            r1 = r36
            r15.A0h = r1
            r0 = r31
            r15.A0c = r0
            r12 = r34
            r15.A0f = r12
            r15.A0H = r3
            X.1VX r3 = r8.A00
            r0 = 6347(0x18cb, float:8.894E-42)
            boolean r0 = r3.A0X(r0)
            r15.A0E = r0
            X.5yg r0 = new X.5yg
            r0.<init>(r6)
            X.66R r0 = X.C154517dI.A01(r0)
            r15.A0q = r0
            X.4C6 r8 = X.AnonymousClass0IV.A00(r15)
            X.5sy r0 = r5.A00
            X.3Db r0 = r0.A01
            X.2se r5 = X.C64333Db.A66(r0)
            X.3Ex r4 = X.C64333Db.A26(r0)
            X.46Q r16 = X.AnonymousClass2C4.A01
            X.C615931l.A00(r16)
            X.5o3 r0 = new X.5o3
            r6 = r15
            r7 = r16
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r15.A06 = r0
            X.4C6 r17 = X.AnonymousClass0IV.A00(r15)
            X.5sy r0 = r2.A00
            X.3Db r2 = r0.A01
            X.1io r11 = X.C64333Db.A3K(r2)
            X.4C1 r0 = r2.A51
            java.lang.Object r10 = r0.get()
            X.1hu r10 = (X.C28871hu) r10
            X.1in r9 = X.C86614Ku.A0S(r2)
            X.5mK r14 = X.C86634Kw.A0q(r2)
            X.2X0 r13 = r2.Aqw()
            X.3Ex r8 = X.C64333Db.A26(r2)
            X.C615931l.A00(r16)
            X.5WK r7 = new X.5WK
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r15.A0k = r7
            X.4UC r0 = X.AnonymousClass0x9.A0b()
            r15.A0l = r0
            X.4C6 r5 = X.AnonymousClass0IV.A00(r15)
            r0 = r18
            X.5sy r0 = r0.A00
            X.3Db r2 = r0.A01
            X.2se r4 = X.C64333Db.A66(r2)
            X.4C1 r0 = r2.ANq
            java.lang.Object r3 = r0.get()
            X.5YD r3 = (X.AnonymousClass5YD) r3
            X.4C1 r0 = r2.ANW
            java.lang.Object r2 = r0.get()
            X.1ic r2 = (X.C29311ic) r2
            X.5Nw r0 = new X.5Nw
            r0.<init>(r2, r4, r3, r5)
            r15.A0j = r0
            X.08M r7 = X.AnonymousClass08M.A01()
            r15.A0R = r7
            r15.A0M = r7
            X.08J r6 = X.AnonymousClass4L0.A0E()
            r15.A0Q = r6
            X.08M r2 = X.AnonymousClass08M.A01()
            r15.A0T = r2
            X.08M r0 = X.AnonymousClass08M.A01()
            r15.A0S = r0
            X.08M r4 = X.AnonymousClass08M.A01()
            r15.A0U = r4
            X.08J r5 = X.AnonymousClass4L0.A0E()
            r15.A0P = r5
            X.08J r3 = X.AnonymousClass4L0.A0E()
            r15.A0O = r3
            r15.A0N = r3
            int r8 = X.C58062ue.A00
            X.8PR r0 = new X.8PR
            r0.<init>(r8)
            r15.A0t = r0
            X.4C8 r0 = X.C154567dN.A01(r0)
            r15.A0u = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r15.A0n = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r15.A00 = r0
            X.62b r8 = new X.62b
            r8.<init>(r15)
            r0 = 364(0x16c, float:5.1E-43)
            X.AnonymousClass6C6.A03(r7, r6, r8, r0)
            X.0Wx r8 = r1.A04
            X.62c r1 = new X.62c
            r1.<init>(r15)
            r0 = 365(0x16d, float:5.11E-43)
            X.AnonymousClass6C6.A03(r8, r6, r1, r0)
            X.62d r1 = new X.62d
            r1.<init>(r15)
            r0 = 366(0x16e, float:5.13E-43)
            X.AnonymousClass6C6.A03(r2, r6, r1, r0)
            X.5Il r1 = r15.A02
            X.59G r0 = X.AnonymousClass59G.A0e
            java.lang.String r8 = r0.sourceName
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            X.1VX r9 = r1.A02
            r0 = 6215(0x1847, float:8.709E-42)
            boolean r0 = X.C56952sp.A0J(r9, r0)
            if (r0 == 0) goto L_0x01dc
            X.33p r0 = r1.A01
            X.8qC r1 = r0.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x01dc
            r0 = 6216(0x1848, float:8.71E-42)
            boolean r0 = r9.A0X(r0)
            if (r0 == 0) goto L_0x01dc
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            boolean r0 = X.C86654Ky.A1T(r0, r8)
            if (r0 != 0) goto L_0x01dc
        L_0x019c:
            X.62f r1 = new X.62f
            r1.<init>(r15)
            r0 = 368(0x170, float:5.16E-43)
            X.AnonymousClass6C6.A03(r6, r3, r1, r0)
            X.62g r1 = new X.62g
            r1.<init>(r15)
            r0 = 369(0x171, float:5.17E-43)
            X.AnonymousClass6C6.A03(r2, r3, r1, r0)
            X.08M r2 = r15.A00
            X.62h r1 = new X.62h
            r1.<init>(r15)
            r0 = 370(0x172, float:5.18E-43)
            X.AnonymousClass6C6.A03(r2, r3, r1, r0)
            X.62i r1 = new X.62i
            r1.<init>(r15)
            r0 = 371(0x173, float:5.2E-43)
            X.AnonymousClass6C6.A03(r5, r3, r1, r0)
            X.62j r1 = new X.62j
            r1.<init>(r15)
            r0 = 372(0x174, float:5.21E-43)
            X.AnonymousClass6C6.A03(r4, r3, r1, r0)
            X.5yh r0 = new X.5yh
            r0.<init>(r15)
            X.66R r0 = X.C154517dI.A01(r0)
            r15.A0r = r0
            return
        L_0x01dc:
            X.62e r1 = new X.62e
            r1.<init>(r15)
            r0 = 367(0x16f, float:5.14E-43)
            X.AnonymousClass6C6.A03(r7, r5, r1, r0)
            goto L_0x019c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.UpdatesViewModel.<init>(X.5FC, X.5FD, X.5FE, X.5FF, X.5FG, X.5FH, X.2sH, X.2nC, X.5UP, X.5Mi, X.5Il, com.whatsapp.status.advertise.UpdatesAdvertiseViewModel, X.5Hu, X.2MD, com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel, X.5X9, com.whatsapp.status.viewmodels.StatusesViewModel, X.5Jz, X.4FS, X.8qC, X.4C1, X.4C1, X.3gB):void");
    }
}
