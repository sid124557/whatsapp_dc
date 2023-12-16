package com.whatsapp.quickcontact;

import X.AnonymousClass000;
import X.AnonymousClass0RN;
import X.AnonymousClass0YZ;
import X.AnonymousClass30F;
import X.AnonymousClass3LP;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass47y;
import X.AnonymousClass4AQ;
import X.AnonymousClass4F0;
import X.AnonymousClass4SG;
import X.AnonymousClass5FA;
import X.AnonymousClass5TW;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass67D;
import X.AnonymousClass681;
import X.AnonymousClass68W;
import X.AnonymousClass697;
import X.AnonymousClass6A1;
import X.AnonymousClass6BQ;
import X.C100295Aj;
import X.C105055Tk;
import X.C105195Ty;
import X.C105365Uq;
import X.C106165Xw;
import X.C106405Yw;
import X.C106995aW;
import X.C107275b2;
import X.C114015mM;
import X.C116985rC;
import X.C1230066r;
import X.C1237769s;
import X.C1237869t;
import X.C153087ae;
import X.C18280x3;
import X.C18300x5;
import X.C185958uW;
import X.C187958y5;
import X.C194079Rm;
import X.C195219Wq;
import X.C27991fJ;
import X.C28071fd;
import X.C29111iI;
import X.C29281iZ;
import X.C29421in;
import X.C33401sw;
import X.C40532Gt;
import X.C44272Vj;
import X.C50392i6;
import X.C50932j0;
import X.C53202mi;
import X.C53312mt;
import X.C53802nh;
import X.C54932pW;
import X.C56072rN;
import X.C56322rn;
import X.C56602sG;
import X.C56762sW;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C58152un;
import X.C59862xc;
import X.C613330g;
import X.C621233o;
import X.C626936e;
import X.C627736r;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C70033Zp;
import X.C84904Ee;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88734ai;
import X.C88744aj;
import X.C89644eZ;
import X.C95814uZ;
import X.C97094xc;
import X.C990454f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.util.FloatingChildLayout;

public class QuickContactActivity extends C89644eZ implements AnonymousClass47y {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public C116985rC A09;
    public C116985rC A0A;
    public AnonymousClass5FA A0B;
    public AnonymousClass64J A0C;
    public C990454f A0D;
    public C33401sw A0E;
    public C1230066r A0F;
    public AnonymousClass5TW A0G;
    public C106995aW A0H;
    public C44272Vj A0I;
    public C56942so A0J;
    public AnonymousClass67D A0K;
    public AnonymousClass5UX A0L;
    public C64773Ex A0M;
    public C29421in A0N;
    public AnonymousClass5ZU A0O;
    public C105365Uq A0P;
    public C114015mM A0Q;
    public C613330g A0R;
    public C53802nh A0S;
    public C64223Cq A0T;
    public C56762sW A0U;
    public C56982ss A0V;
    public C56892sj A0W;
    public C56322rn A0X;
    public C50392i6 A0Y;
    public AnonymousClass3ZH A0Z;
    public C59862xc A0a;
    public AnonymousClass3LP A0b;
    public C50932j0 A0c;
    public C54932pW A0d;
    public C53202mi A0e;
    public C40532Gt A0f;
    public GroupJid A0g;
    public C27991fJ A0h;
    public C621233o A0i;
    public C28071fd A0j;
    public C153087ae A0k;
    public C194079Rm A0l;
    public C195219Wq A0m;
    public C105195Ty A0n;
    public AnonymousClass30F A0o;
    public C29281iZ A0p;
    public StatusesViewModel A0q;
    public C105055Tk A0r;
    public C106165Xw A0s;
    public FloatingChildLayout A0t;
    public C56072rN A0u;
    public C187958y5 A0v;
    public AnonymousClass3ZF A0w;
    public C29111iI A0x;
    public C97094xc A0y;
    public C53312mt A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public final C56602sG A13;
    public final AnonymousClass4AQ A14;
    public final C84904Ee A15;
    public final AnonymousClass4F0 A16;
    public final C185958uW A17;

    public final void A76(boolean z) {
        if (z) {
            FloatingChildLayout floatingChildLayout = this.A0t;
            if (floatingChildLayout.A02 == 1) {
                floatingChildLayout.A02 = 3;
                if (floatingChildLayout.A06.isRunning()) {
                    floatingChildLayout.A06.reverse();
                } else {
                    int[] A1Z = C86664Kz.A1Z();
                    // fill-array-data instruction
                    A1Z[0] = 127;
                    A1Z[1] = 0;
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
                    floatingChildLayout.A06 = ofInt;
                    C100295Aj.A03(ofInt, floatingChildLayout, 25);
                    floatingChildLayout.A06.setDuration((long) floatingChildLayout.A01).start();
                }
            }
            FloatingChildLayout floatingChildLayout2 = this.A0t;
            C70033Zp r3 = new C70033Zp(this, 8);
            int i = floatingChildLayout2.A03;
            if (i == 1 || i == 2) {
                floatingChildLayout2.A03 = 3;
                floatingChildLayout2.A09.invalidate();
                floatingChildLayout2.A00(r3, true);
                return;
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        A76(true);
    }

    public static /* synthetic */ void A0C(QuickContactActivity quickContactActivity) {
        QuickContactActivity quickContactActivity2 = quickContactActivity;
        if (!quickContactActivity2.A10) {
            AnonymousClass3ZH r2 = quickContactActivity2.A0Z;
            if (r2.A0g && r2.A0U()) {
                C56892sj r22 = quickContactActivity2.A0W;
                C27991fJ r0 = quickContactActivity2.A0h;
                C626936e.A06(r0);
                if (!r22.A0C(r0)) {
                    quickContactActivity2.Bot(R.string.f11nameremoved);
                    return;
                }
            }
            C95814uZ r5 = quickContactActivity2.A0Z.A0H;
            C626936e.A06(r5);
            if (!C107275b2.A00) {
                quickContactActivity2.startActivity(C627736r.A0e(quickContactActivity2.getApplicationContext(), r5, (String) null, 0.0f, 0, 0, 0, 0, false));
            } else {
                String stringExtra = quickContactActivity2.getIntent().getStringExtra("transition_name");
                if (stringExtra == null) {
                    stringExtra = quickContactActivity2.getApplicationContext().getResources().getString(R.string.f11nameremoved);
                }
                boolean A1U = C18280x3.A1U(Build.VERSION.SDK_INT, 24);
                int intExtra = quickContactActivity2.getIntent().getIntExtra("status_bar_color", C86634Kw.A03(quickContactActivity2));
                int intExtra2 = quickContactActivity2.getIntent().getIntExtra("navigation_bar_color", C18300x5.A03(quickContactActivity2, R.attr.f3nameremoved, R.color.f5nameremoved));
                AnonymousClass0YZ.A0F(quickContactActivity2.A08, stringExtra);
                Context applicationContext = quickContactActivity2.getApplicationContext();
                float f = 0.0f;
                if (A1U) {
                    f = 0.5f;
                }
                AnonymousClass0RN.A00(quickContactActivity2, C627736r.A0e(applicationContext, r5, stringExtra, f, quickContactActivity2.getWindow().getStatusBarColor(), intExtra, quickContactActivity2.getWindow().getNavigationBarColor(), intExtra2, false), C107275b2.A05(quickContactActivity2, quickContactActivity2.A08, stringExtra));
                if (!A1U) {
                    AnonymousClass000.A0A().postDelayed(new C70033Zp(quickContactActivity2, 10), (long) quickContactActivity2.getResources().getInteger(17694721));
                    return;
                }
            }
            quickContactActivity2.A76(false);
        }
    }

    public void A5r() {
        if (!this.A11) {
            this.A11 = true;
            C64333Db r1 = AnonymousClass4SG.A2X(this).A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A0V = C86614Ku.A0X(r1);
            this.A0b = r1.Akp();
            this.A0F = C86634Kw.A0X(r1);
            this.A0y = (C97094xc) r1.A00.A29.get();
            this.A0Q = C86604Kt.A0S(r1);
            this.A0d = (C54932pW) r1.AGY.get();
            this.A0j = C86614Ku.A0b(r1);
            this.A0m = C86644Kx.A0Z(r1);
            this.A0G = (AnonymousClass5TW) r1.ASQ.get();
            this.A0L = C86614Ku.A0Q(r1);
            this.A0M = C86604Kt.A0P(r1);
            this.A0v = C86614Ku.A0n(r1);
            this.A0O = C86604Kt.A0R(r1);
            this.A0u = C86634Kw.A0r(r1);
            this.A0H = (C106995aW) r1.A4q.get();
            this.A0x = (C29111iI) r1.A4D.get();
            this.A0N = C86604Kt.A0Q(r1);
            this.A0A = C88744aj.A00;
            this.A0r = C86614Ku.A0k(r1);
            this.A0U = (C56762sW) r1.A4R.get();
            this.A0s = C86614Ku.A0l(r1);
            this.A0T = C86604Kt.A0T(r1);
            this.A0S = (C53802nh) r1.A00.A6e.get();
            this.A0a = (C59862xc) r1.APF.get();
            this.A0o = (AnonymousClass30F) r1.AUB.get();
            this.A0J = C86654Ky.A0W(r1);
            this.A0X = (C56322rn) r1.AIT.get();
            Object obj = r1.A3A.get();
            obj.getClass();
            this.A09 = new C88734ai(obj);
            this.A0p = (C29281iZ) r1.AUD.get();
            this.A0i = (C621233o) r1.AJA.get();
            this.A0k = (C153087ae) r1.AQ7.get();
            this.A0I = (C44272Vj) r1.A5U.get();
            this.A0K = r1.AiJ();
            this.A0W = (C56892sj) r1.AGm.get();
            this.A0c = (C50932j0) r1.AGP.get();
            this.A0R = C86634Kw.A0a(r1);
            this.A0B = (AnonymousClass5FA) r1.A00.A0a.get();
            this.A0l = (C194079Rm) r1.A00.A8f.get();
            this.A0C = C86644Kx.A0N(r1);
            this.A0e = C86634Kw.A0j(r1);
            this.A0f = (C40532Gt) r1.AIJ.get();
        }
    }

    public boolean A64() {
        return true;
    }

    public final void A74() {
        C53312mt r0 = this.A0z;
        if (r0 != null) {
            AnonymousClass3ZF A002 = this.A0U.A00(r0.A00);
            if (A002 != null) {
                this.A0w = A002;
                return;
            }
            C990454f r1 = new C990454f(new AnonymousClass6A1(this, 2), this.A0U, this.A0z.A00);
            this.A0D = r1;
            C86614Ku.A1R(r1, this.A04);
        }
    }

    public final void A75() {
        AnonymousClass3ZH A002 = C64773Ex.A00(this.A0M, C106405Yw.A00(this));
        this.A0Z = A002;
        this.A0h = (C27991fJ) AnonymousClass3ZH.A04(A002);
        this.A0g = GroupJid.Companion.A03(getIntent().getStringExtra("gjid"));
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007a, code lost:
        if (X.C86644Kx.A1Z(r10.A0D) == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            boolean r0 = X.C107275b2.A00
            if (r0 == 0) goto L_0x000d
            android.view.Window r1 = r10.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000d:
            super.onCreate(r11)
            X.5mM r1 = r10.A0Q
            java.lang.String r0 = "quick-contact-activity"
            X.5Uq r0 = r1.A06(r10, r0)
            r10.A0P = r0
            r0 = 2131895665(0x7f122571, float:1.942617E38)
            r10.setTitle(r0)
            android.content.Intent r7 = r10.getIntent()
            X.AnonymousClass4SG.A37(r10)
            int r1 = X.C86634Kw.A03(r10)
            java.lang.String r0 = "status_bar_color"
            int r0 = r7.getIntExtra(r0, r1)
            android.view.Window r1 = r10.getWindow()
            r3 = 2130706432(0x7f000000, float:1.7014118E38)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.AnonymousClass0YI.A03(r2, r0, r3)
            r1.setStatusBarColor(r0)
            boolean r0 = X.C107385bE.A05()
            if (r0 == 0) goto L_0x005b
            r1 = 2130969949(0x7f04055d, float:1.7548594E38)
            r0 = 2131101306(0x7f06067a, float:1.7815018E38)
            int r0 = X.C18300x5.A03(r10, r1, r0)
            android.view.Window r1 = r10.getWindow()
            int r0 = X.AnonymousClass0YI.A03(r2, r0, r3)
            r1.setNavigationBarColor(r0)
        L_0x005b:
            android.view.Window r1 = r10.getWindow()
            r0 = 131072(0x20000, float:1.83671E-40)
            r1.setFlags(r0, r0)
            r10.A75()
            X.2sr r1 = r10.A01
            X.3ZH r0 = r10.A0Z
            boolean r0 = X.C56972sr.A08(r1, r0)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x007c
            X.1VX r0 = r10.A0D
            boolean r1 = X.C86644Kx.A1Z(r0)
            r0 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r10.A12 = r0
            X.5Ty r0 = new X.5Ty
            r0.<init>(r10)
            r10.A0n = r0
            com.whatsapp.quickcontact.QuickContactActivity r1 = r0.A00
            r0 = 2131625867(0x7f0e078b, float:1.8878954E38)
            r1.setContentView((int) r0)
            r0 = 2131430806(0x7f0b0d96, float:1.8483323E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A02 = r0
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r10, r0)
            r10.A08 = r0
            r0 = 2131431512(0x7f0b1058, float:1.8484755E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A04 = r0
            r0 = 2131427759(0x7f0b01af, float:1.8477143E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A00 = r0
            r0 = 2131434659(0x7f0b1ca3, float:1.8491138E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A06 = r0
            r0 = 2131434755(0x7f0b1d03, float:1.8491333E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A07 = r0
            r0 = 2131428435(0x7f0b0453, float:1.8478514E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A01 = r0
            r0 = 2131430862(0x7f0b0dce, float:1.8483437E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A03 = r0
            r0 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A05 = r0
            X.1fJ r0 = r10.A0h
            if (r0 == 0) goto L_0x011b
            X.5Ty r0 = r10.A0n
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x011b
            X.2rn r1 = r10.A0X
            X.1fJ r0 = r10.A0h
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x02ea
            X.2rn r1 = r10.A0X
            X.1fJ r0 = r10.A0h
            X.2mt r0 = r1.A02(r0)
            r10.A0z = r0
            r10.A74()
        L_0x0102:
            X.2i6 r0 = r10.A0Y
            if (r0 != 0) goto L_0x011b
            X.1VX r0 = r10.A0D
            boolean r0 = X.C627436k.A0I(r0)
            if (r0 == 0) goto L_0x011b
            X.30F r3 = r10.A0o
            X.1fJ r2 = r10.A0h
            r1 = 2
            X.6A3 r0 = new X.6A3
            r0.<init>(r10, r1)
            r3.A03(r2, r0)
        L_0x011b:
            X.5Ty r3 = r10.A0n
            com.whatsapp.quickcontact.QuickContactActivity r1 = r3.A00
            android.view.View r2 = r1.A04
            r0 = 11
            X.AnonymousClass0x2.A0y(r2, r3, r0)
            android.view.View r6 = r1.A00
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 0
            X.5fL r0 = new X.5fL
            r0.<init>(r9, r2, r9, r2)
            r6.setOnTouchListener(r0)
            android.view.View r6 = r1.A06
            X.5fL r0 = new X.5fL
            r0.<init>(r9, r2, r9, r2)
            r6.setOnTouchListener(r0)
            android.view.View r6 = r1.A01
            X.5fL r0 = new X.5fL
            r0.<init>(r9, r2, r9, r2)
            r6.setOnTouchListener(r0)
            android.view.View r6 = r1.A00
            r8 = 4
            X.542 r0 = new X.542
            r0.<init>(r8, r1, r5)
            r6.setOnClickListener(r0)
            android.view.View r6 = r1.A06
            X.542 r0 = new X.542
            r0.<init>(r8, r1, r4)
            r6.setOnClickListener(r0)
            android.view.View r6 = r1.A07
            if (r6 == 0) goto L_0x0170
            X.5fL r0 = new X.5fL
            r0.<init>(r9, r2, r9, r2)
            r6.setOnTouchListener(r0)
            android.view.View r6 = r1.A07
            r0 = 24
            X.C989653x.A00(r6, r1, r0)
        L_0x0170:
            android.view.View r6 = r1.A01
            r0 = 12
            X.AnonymousClass0x2.A0y(r6, r3, r0)
            android.view.View r6 = r1.A03
            r0 = 13
            X.AnonymousClass0x2.A0y(r6, r3, r0)
            android.view.View r6 = r1.A05
            r0 = 14
            X.AnonymousClass0x2.A0y(r6, r3, r0)
            r3.A00()
            r3.A01()
            r0 = 2131430720(0x7f0b0d40, float:1.8483149E38)
            android.view.View r6 = r1.findViewById(r0)
            r0 = 15
            X.AnonymousClass0x2.A0y(r6, r3, r0)
            X.3ZH r8 = r1.A0Z
            boolean r0 = r8.A10
            r6 = 8
            if (r0 != 0) goto L_0x02dd
            boolean r0 = r8.A0U()
            if (r0 != 0) goto L_0x02dd
            X.3ZH r0 = r1.A0Z
            X.4uZ r0 = r0.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x02dd
            r0 = 2131428365(0x7f0b040d, float:1.8478372E38)
            X.C18280x3.A0r(r1, r0, r6)
            X.3ZH r0 = r1.A0Z
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x02e3
            android.view.View r0 = r1.A02
            r0.setVisibility(r5)
        L_0x01be:
            android.view.View r1 = r1.A02
            r0 = 16
            X.AnonymousClass0x2.A0y(r1, r3, r0)
            r3.A02()
            r0 = 2131430182(0x7f0b0b26, float:1.8482058E38)
            android.view.View r1 = r10.findViewById(r0)
            com.whatsapp.util.FloatingChildLayout r1 = (com.whatsapp.util.FloatingChildLayout) r1
            r10.A0t = r1
            r6 = 9
            X.5CS r0 = new X.5CS
            r0.<init>(r10, r6)
            r1.A08 = r0
            r3 = 2
            X.AnonymousClass0YY.A06(r1, r3)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131167956(0x7f070ad4, float:1.79502E38)
            int r8 = r1.getDimensionPixelOffset(r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "position_top"
            int r1 = r1.getIntExtra(r0, r8)
            android.graphics.Rect r8 = r7.getSourceBounds()
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0t
            r0.A05 = r1
            if (r8 == 0) goto L_0x023e
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "animation_style"
            int r1 = r1.getIntExtra(r0, r3)
            if (r1 != r4) goto L_0x02cc
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = X.C86664Kz.A0f(r10)
            r0.getMetrics(r1)
            int r7 = r1.heightPixels
            int r3 = r1.widthPixels
            int r1 = r3 / 4
            int r0 = r7 / 4
            int r1 = java.lang.Math.min(r1, r0)
            int r7 = r7 - r1
            int r0 = r7 / 2
            r8.top = r0
            int r0 = r0 + r1
            r8.bottom = r0
            int r3 = r3 - r1
            int r0 = r3 / 2
            r8.left = r0
            int r0 = r0 + r1
            r8.right = r0
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0t
            r0.setChildTargetScreen(r8)
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0t
            r0.A04 = r5
            r0.A00 = r2
        L_0x023e:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "show_get_direction"
            boolean r5 = r1.getBooleanExtra(r0, r5)
            r2 = 2131429465(0x7f0b0859, float:1.8480603E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r10, r2)
            r3 = 8
            int r0 = X.AnonymousClass001.A08(r5)
            r1.setVisibility(r0)
            if (r5 == 0) goto L_0x0264
            X.C106905aM.A04(r1)
            android.view.View r0 = r10.findViewById(r2)
            X.AnonymousClass0x2.A0y(r0, r10, r6)
        L_0x0264:
            android.widget.ImageView r1 = r10.A08
            r0 = 10
            X.AnonymousClass0x2.A0y(r1, r10, r0)
            android.widget.ImageView r1 = r10.A08
            r0 = 2131894321(0x7f122031, float:1.9423443E38)
            X.C107295b4.A03(r1, r0)
            r10.A10 = r4
            com.whatsapp.util.FloatingChildLayout r5 = r10.A0t
            r0 = 12
            X.3Zp r2 = new X.3Zp
            r2.<init>(r10, r0)
            r1 = 3
            X.6BO r0 = new X.6BO
            r0.<init>((android.view.View) r5, (java.lang.Runnable) r2, (int) r1)
            X.C86644Kx.A12(r5, r0)
            X.1in r1 = r10.A0N
            X.2sG r0 = r10.A13
            r1.A06(r0)
            X.3ZH r0 = r10.A0Z
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x029d
            X.2j0 r1 = r10.A0c
            X.4AQ r0 = r10.A14
            r1.A00(r0)
        L_0x029d:
            X.1iI r1 = r10.A0x
            X.4F0 r0 = r10.A16
            r1.A06(r0)
            X.4xc r1 = r10.A0y
            X.8uW r0 = r10.A17
            r1.A06(r0)
            X.1iZ r1 = r10.A0p
            X.4Ee r0 = r10.A15
            r1.A06(r0)
            X.3ZH r0 = r10.A0Z
            com.whatsapp.jid.Jid r2 = X.AnonymousClass4L0.A0M(r0)
            X.5rC r1 = r10.A0A
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0304
            if (r2 == 0) goto L_0x0342
            r1.A04()
            java.lang.String r0 = "initSmbLabelScroller"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x02cc:
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0t
            r0.setChildTargetScreen(r8)
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0t
            if (r1 != r3) goto L_0x02d9
            r0.A04 = r4
            goto L_0x023e
        L_0x02d9:
            r0.A04 = r3
            goto L_0x023e
        L_0x02dd:
            r0 = 2131428365(0x7f0b040d, float:1.8478372E38)
            X.C18280x3.A0r(r1, r0, r5)
        L_0x02e3:
            android.view.View r0 = r1.A02
            r0.setVisibility(r6)
            goto L_0x01be
        L_0x02ea:
            X.2rn r3 = r10.A0X
            r0 = 2
            X.6A2 r1 = new X.6A2
            r1.<init>(r10, r0)
            X.1fJ r0 = r10.A0h
            X.1sw r2 = new X.1sw
            r2.<init>(r1, r3, r0)
            r10.A0E = r2
            X.4FS r1 = r10.A04
            java.lang.Void[] r0 = new java.lang.Void[r5]
            r1.BkO(r2, r0)
            goto L_0x0102
        L_0x0304:
            if (r2 == 0) goto L_0x0348
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r2)
            if (r3 != 0) goto L_0x0312
            java.lang.String r0 = "UserJid should not be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0348
        L_0x0312:
            X.1VX r2 = r10.A0D
            X.2vE r1 = X.C58422vE.A01
            r0 = 1533(0x5fd, float:2.148E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0348
            X.5FA r1 = r10.A0B
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = X.C110565gf.A00(r10, r1, r4)
            r10.A0q = r1
            X.08A r0 = r10.A06
            r0.A00(r1)
            com.whatsapp.status.viewmodels.StatusesViewModel r2 = r10.A0q
            X.0Wx r1 = r2.A04
            X.6Ay r0 = new X.6Ay
            r0.<init>(r2, r4, r3)
            X.0Wx r1 = X.C05110Rz.A00(r0, r1)
            r0 = 275(0x113, float:3.85E-43)
            X.AnonymousClass6C6.A01(r10, r1, r0)
            goto L_0x0348
        L_0x0342:
            r0 = 2131432802(0x7f0b1562, float:1.8487372E38)
            X.C18280x3.A0r(r10, r0, r3)
        L_0x0348:
            X.AnonymousClass4SG.A3d(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.quickcontact.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    public QuickContactActivity(int i) {
        this.A11 = false;
        AnonymousClass68W.A00(this, 80);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0N.A07(this.A13);
        this.A0P.A00();
        if (this.A0Z.A0U()) {
            this.A0c.A01(this.A14);
        }
        this.A0x.A07(this.A16);
        this.A0y.A07(this.A17);
        this.A0p.A07(this.A15);
        C33401sw r0 = this.A0E;
        if (r0 != null) {
            r0.A0D(true);
            this.A0E = null;
        }
        C990454f r02 = this.A0D;
        if (r02 != null) {
            r02.A0D(true);
            this.A0D = null;
        }
    }

    public int A5t() {
        return 78318969;
    }

    public QuickContactActivity() {
        this(0);
        this.A13 = AnonymousClass681.A00(this, 37);
        this.A14 = new AnonymousClass697(this, 8);
        this.A16 = new AnonymousClass6BQ(this, 4);
        this.A17 = new C1237769s(this, 7);
        this.A15 = new C1237869t(this, 2);
    }
}
