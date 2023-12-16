package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0IT;
import X.AnonymousClass0X0;
import X.AnonymousClass0YY;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass10Y;
import X.AnonymousClass1RL;
import X.AnonymousClass1VX;
import X.AnonymousClass20D;
import X.AnonymousClass21J;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass47C;
import X.AnonymousClass487;
import X.AnonymousClass48K;
import X.AnonymousClass495;
import X.AnonymousClass4FI;
import X.AnonymousClass4FV;
import X.AnonymousClass4IC;
import X.AnonymousClass4SG;
import X.AnonymousClass4X3;
import X.AnonymousClass59F;
import X.AnonymousClass5BX;
import X.AnonymousClass5DR;
import X.AnonymousClass5DX;
import X.AnonymousClass5DY;
import X.AnonymousClass5DZ;
import X.AnonymousClass5IY;
import X.AnonymousClass5M2;
import X.AnonymousClass5M3;
import X.AnonymousClass5MG;
import X.AnonymousClass5OF;
import X.AnonymousClass5QK;
import X.AnonymousClass5UP;
import X.AnonymousClass5V0;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YD;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass65Q;
import X.AnonymousClass669;
import X.AnonymousClass66R;
import X.AnonymousClass681;
import X.AnonymousClass68S;
import X.AnonymousClass68T;
import X.AnonymousClass693;
import X.AnonymousClass6C6;
import X.AnonymousClass8PJ;
import X.C05680Um;
import X.C08240dc;
import X.C08310eF;
import X.C100985Da;
import X.C103605Nq;
import X.C103985Pe;
import X.C104595Rp;
import X.C105065Tl;
import X.C105365Uq;
import X.C105895Wv;
import X.C106715a2;
import X.C106855aH;
import X.C107275b2;
import X.C107295b4;
import X.C107345b9;
import X.C107365bC;
import X.C107385bE;
import X.C107635bd;
import X.C110065fd;
import X.C113905mB;
import X.C114015mM;
import X.C118075sx;
import X.C119815xa;
import X.C119825xb;
import X.C120755z7;
import X.C1233167y;
import X.C124216Bk;
import X.C136716n9;
import X.C13750ng;
import X.C13770ni;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C18330xA;
import X.C187388x8;
import X.C19340zH;
import X.C27821ej;
import X.C27981fH;
import X.C29301ib;
import X.C29421in;
import X.C372821q;
import X.C45392Zw;
import X.C46342bT;
import X.C53232ml;
import X.C54232oO;
import X.C55682qk;
import X.C56452s0;
import X.C56602sG;
import X.C56612sH;
import X.C56662sM;
import X.C56842se;
import X.C56972sr;
import X.C60152y5;
import X.C616131n;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C66433Lk;
import X.C66473Lo;
import X.C69263Wi;
import X.C73783g4;
import X.C78953vq;
import X.C84004Aq;
import X.C84014Ar;
import X.C84024As;
import X.C84364Cb;
import X.C84814Du;
import X.C85494Gl;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import X.C87204Ok;
import X.C88694ab;
import X.C89014bL;
import X.C91464jz;
import X.C91534kK;
import X.C94174qF;
import X.C95104sd;
import X.C95804uY;
import X.C989653x;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.product.newsletterenforcements.NewsletterAlertsLauncherBridgeImpl;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class NewsletterInfoActivity extends C91464jz implements C84364Cb, AnonymousClass669, C187388x8, C84004Aq, C84014Ar, AnonymousClass65Q, C84024As {
    public long A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public LinearLayout A07;
    public ListView A08;
    public SwitchCompat A09;
    public AnonymousClass5DR A0A;
    public AnonymousClass5DX A0B;
    public AnonymousClass5DY A0C;
    public AnonymousClass5DZ A0D;
    public C100985Da A0E;
    public AnonymousClass5M3 A0F;
    public WaTextView A0G;
    public AnonymousClass5MG A0H;
    public C29301ib A0I;
    public C46342bT A0J;
    public C105065Tl A0K;
    public NewsletterInfoLayout A0L;
    public C29421in A0M;
    public AnonymousClass5ZU A0N;
    public C105365Uq A0O;
    public C114015mM A0P;
    public C113905mB A0Q;
    public C66473Lo A0R;
    public AnonymousClass3ZH A0S;
    public C56662sM A0T;
    public AnonymousClass5IY A0U;
    public C27821ej A0V;
    public EmojiSearchProvider A0W;
    public AnonymousClass4FV A0X;
    public C95104sd A0Y;
    public AnonymousClass5UP A0Z;
    public AnonymousClass48K A0a;
    public NewsletterInfoMembersListViewModel A0b;
    public C91534kK A0c;
    public C87204Ok A0d;
    public C104595Rp A0e;
    public C56842se A0f;
    public AnonymousClass5YD A0g;
    public AnonymousClass5QK A0h;
    public C45392Zw A0i;
    public AnonymousClass4X3 A0j;
    public NewsletterViewModel A0k;
    public C103985Pe A0l;
    public C53232ml A0m;
    public C60152y5 A0n;
    public NewsletterAlertsLauncherBridgeImpl A0o;
    public C56452s0 A0p;
    public C66433Lk A0q;
    public ReadMoreTextView A0r;
    public C106715a2 A0s;
    public final C54232oO A0t = new C1233167y(this, 13);
    public final C56602sG A0u = AnonymousClass681.A00(this, 29);
    public final AnonymousClass4FI A0v = new AnonymousClass4IC(this, 13);
    public final AnonymousClass66R A0w = C154517dI.A01(new C119815xa(this));
    public final AnonymousClass66R A0x = new C13750ng(new C119825xb(this), new C78953vq(this), new C120755z7(this), new AnonymousClass8PJ(AnonymousClass10Y.class));

    public final void A7Y(String str, boolean z) {
        if (this.A06.A02 != AnonymousClass0GC.DESTROYED) {
            if (z) {
                C91534kK r1 = this.A0c;
                if (r1 == null) {
                    throw C18270x1.A0S("newsletterInfoViewModel");
                }
                r1.A0H(A7H());
            }
            View view = this.A00;
            List emptyList = Collections.emptyList();
            new C110065fd(this, C88694ab.A02(view, str, 2000), this.A08, emptyList, false).A01();
        }
    }

    public void BRM(UserJid userJid) {
        C136716n9 r1;
        C162457s7.A0J(userJid, 0);
        AnonymousClass5QK r4 = this.A0h;
        if (r4 != null) {
            C95804uY A0I2 = A7G().A0I();
            AnonymousClass68S r6 = new AnonymousClass68S(userJid, 0, this);
            C162457s7.A0J(A0I2, 0);
            AnonymousClass495 r0 = r4.A00;
            if (r0 != null) {
                r0.cancel();
            }
            r4.A01.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
            C103605Nq r3 = r4.A03;
            C124216Bk r2 = new C124216Bk(userJid, r6, r4, 0);
            if (r3.A00() || (C18300x5.A1S(r3.A03) && r3.A02.A0X(6535) && r3.A00.A0a(userJid))) {
                r1 = new C136716n9(A0I2, userJid, r2);
                r3.A01.A02(r1);
            } else {
                r1 = null;
            }
            r4.A00 = r1;
            return;
        }
        throw C18270x1.A0S("newsletterAdminInvitationHandler");
    }

    public void Bae(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        AnonymousClass5QK r2 = this.A0h;
        if (r2 != null) {
            r2.A00(A7G().A0I(), userJid, new AnonymousClass68T(this, 0));
            return;
        }
        throw C18270x1.A0S("newsletterAdminInvitationHandler");
    }

    public void BbD(C95804uY r9, String str, List list) {
        C162457s7.A0J(r9, 0);
        C18260x0.A0Q(list, str);
        C13770ni A002 = AnonymousClass0IT.A00(this);
        C616131n.A02((C85494Gl) null, new NewsletterInfoActivity$onSend$1(r9, this, str, list, (C84814Du) null), A002, (AnonymousClass20D) null, 3);
    }

    public void Bek(AnonymousClass21J r4, String str, List list) {
        boolean A1Y = AnonymousClass0x2.A1Y(list, r4);
        int ordinal = r4.ordinal();
        if (ordinal != A1Y) {
            if (ordinal == 3) {
                Bae((UserJid) list.get(0));
            } else if (ordinal == 4) {
                BRM((UserJid) list.get(0));
            }
        } else if (str != null) {
            BbD(A7G().A0I(), str, list);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        long j;
        if (i2 == -1) {
            switch (i) {
                case 50:
                case 51:
                    C91534kK r0 = this.A0c;
                    if (r0 != null) {
                        r0.A0G();
                        break;
                    } else {
                        throw C18270x1.A0S("newsletterInfoViewModel");
                    }
                case 53:
                    C620733j r7 = this.A00;
                    long j2 = 1;
                    if (intent != null) {
                        j = intent.getLongExtra("extra_invitees_count", 1);
                    } else {
                        j = 1;
                    }
                    Object[] A0L2 = AnonymousClass002.A0L();
                    if (intent != null) {
                        j2 = intent.getLongExtra("extra_invitees_count", 1);
                    }
                    C18280x3.A1S(A0L2, j2);
                    String A0L3 = r7.A0L(A0L2, R.plurals.f9nameremoved, j);
                    C162457s7.A0D(A0L3);
                    A7Y(A0L3, true);
                    break;
                case 54:
                    if (intent != null) {
                        Bqv(C86604Kt.A0r(intent));
                        break;
                    }
                    break;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
    }

    public void A66() {
        this.A0W.A03(C95804uY.A03.A01(AnonymousClass0x7.A0l(this)), 28);
    }

    public boolean A6C() {
        return true;
    }

    public final AnonymousClass1RL A7G() {
        NewsletterViewModel newsletterViewModel = this.A0k;
        if (newsletterViewModel != null) {
            return C104595Rp.A00(newsletterViewModel);
        }
        throw C18270x1.A0S("newsletterViewModel");
    }

    public C95804uY A7H() {
        AnonymousClass3ZH r1 = this.A0S;
        if (r1 == null) {
            throw C18270x1.A0S("contact");
        }
        C95804uY r0 = (C95804uY) r1.A0I(C95804uY.class);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Invalid Newsletter Jid");
    }

    public final C87204Ok A7I() {
        AnonymousClass5DX r0 = this.A0B;
        if (r0 != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            C162457s7.A0D(layoutInflater);
            C105365Uq r7 = this.A0O;
            if (r7 == null) {
                throw C18270x1.A0S("contactPhotoLoader");
            }
            C118075sx r1 = r0.A00;
            C64333Db r02 = r1.A03;
            AnonymousClass1VX A4B = C64333Db.A4B(r02);
            C56972sr A062 = C64333Db.A06(r02);
            C620733j A2t = C64333Db.A2t(r02);
            AnonymousClass5ZU A28 = C64333Db.A28(r02);
            return new C87204Ok(layoutInflater, (AnonymousClass5M2) r1.A01.A40.get(), A062, C86614Ku.A0N(r02), A28, r7, A2t, A4B, this);
        }
        throw C18270x1.A0S("newsletterMembersAdapterFactory");
    }

    public final AnonymousClass5YD A7J() {
        AnonymousClass5YD r0 = this.A0g;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterLogging");
    }

    public final C103985Pe A7K() {
        C103985Pe r0 = this.A0l;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("newsletterSuspensionUtils");
    }

    public final void A7R() {
        AnonymousClass3ZH r0 = this.A0S;
        if (r0 == null) {
            throw C18270x1.A0S("contact");
        }
        int i = 0;
        if (!r0.A0g) {
            this.A05.A0H(R.string.f11nameremoved, 0);
            C56452s0 r3 = this.A0p;
            if (r3 != null) {
                C95804uY A7H = A7H();
                AnonymousClass3ZH r02 = this.A0S;
                if (r02 == null) {
                    throw C18270x1.A0S("contact");
                }
                r3.A01(A7H, r02.A06, 2);
                return;
            }
            throw C18270x1.A0S("profilePhotoManager");
        } else if (!this.A0c) {
            int statusBarColor = getWindow().getStatusBarColor();
            if (C107385bE.A05()) {
                i = getWindow().getNavigationBarColor();
            }
            C95804uY A7H2 = A7H();
            Intent A072 = C18320x8.A07();
            C86604Kt.A13(A072, A7H2, getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
            A072.putExtra("circular_transition", true);
            A072.putExtra("start_transition_alpha", 0.0f);
            A072.putExtra("start_transition_status_bar_color", statusBarColor);
            A072.putExtra("return_transition_status_bar_color", 0);
            A072.putExtra("start_transition_navigation_bar_color", i);
            A072.putExtra("return_transition_navigation_bar_color", 0);
            A072.putExtra("open_pic_selection_sheet", false);
            AnonymousClass5MG r1 = this.A0H;
            if (r1 == null) {
                throw C18270x1.A0S("transitionNames");
            }
            String A032 = r1.A03(R.string.f11nameremoved);
            C162457s7.A0D(A032);
            NewsletterInfoLayout newsletterInfoLayout = this.A0L;
            if (newsletterInfoLayout == null) {
                throw C18270x1.A0S("rootLayout");
            }
            C05680Um.A02(this, A072, C107275b2.A05(this, C18280x3.A0E(newsletterInfoLayout, R.id.wds_profile_picture), A032), 51);
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUk(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0066
            X.4kK r0 = r6.A0c
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x000d:
            X.08M r0 = r0.A04
            java.lang.Object r0 = r0.A07()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            X.4uZ r0 = X.C86604Kt.A0b(r1)
            if (r0 == 0) goto L_0x001f
            r5.add(r0)
            goto L_0x001f
        L_0x002f:
            X.3d3 r5 = X.C72023d3.A00
        L_0x0031:
            X.1RL r0 = r6.A7G()
            X.4uY r4 = r0.A0I()
            X.1RL r0 = r6.A7G()
            java.lang.String r3 = r0.A0H
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.C627336j.A0D(r2, r4, r0)
            java.lang.String r0 = "name"
            r2.putExtra(r0, r3)
            java.lang.String r1 = "invited_admins_jids"
            java.util.ArrayList r0 = X.C627336j.A0A(r5)
            r2.putExtra(r1, r0)
            r0 = 53
            r6.startActivityForResult(r2, r0)
            return
        L_0x0066:
            X.0df r3 = r6.getSupportFragmentManager()
            X.4uY r2 = r6.A7H()
            r0 = 1
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r1 = 0
            r0[r1] = r7
            java.util.ArrayList r0 = X.AnonymousClass8UF.A0m(r0)
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r0 = X.AnonymousClass5BM.A00(r2, r0, r1)
            X.AnonymousClass344.A01(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.BUk(com.whatsapp.jid.UserJid):void");
    }

    public void BfY() {
    }

    public void finishAfterTransition() {
        View view = this.A04;
        if (view == null) {
            throw C18270x1.A0S("headerView");
        }
        view.setTransitionName((String) null);
        TransitionSet transitionSet = new TransitionSet();
        Slide slide = new Slide(48);
        View view2 = this.A04;
        if (view2 == null) {
            throw C18270x1.A0S("headerView");
        }
        slide.addTarget(view2);
        transitionSet.addTransition(slide);
        Slide slide2 = new Slide(80);
        ListView listView = this.A08;
        if (listView == null) {
            throw C18270x1.A0S("newsletterListView");
        }
        AnonymousClass4SG.A38(this, slide2, transitionSet, listView);
        NewsletterInfoLayout newsletterInfoLayout = this.A0L;
        if (newsletterInfoLayout == null) {
            throw C18270x1.A0S("rootLayout");
        }
        newsletterInfoLayout.setStatusData((AnonymousClass5OF) null);
        super.finishAfterTransition();
    }

    /* JADX WARNING: Removed duplicated region for block: B:182:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x047c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r3 = r18
            r0 = r19
            super.onCreate(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.A00 = r0
            X.5Yx r1 = X.C95804uY.A03
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r3)
            X.4uY r5 = r1.A01(r0)
            if (r5 != 0) goto L_0x001d
            r3.finish()
        L_0x001c:
            return
        L_0x001d:
            r3.A5U()
            r0 = 2131891165(0x7f1213dd, float:1.9417042E38)
            r3.setTitle(r0)
            X.2bT r1 = r3.A0J
            if (r1 == 0) goto L_0x04ad
            r0 = 2
            r1.A01 = r0
            X.5mM r1 = r3.A0P
            if (r1 == 0) goto L_0x04a6
            java.lang.String r0 = "newsletter-info-activity"
            X.5Uq r0 = r1.A06(r3, r0)
            r3.A0O = r0
            X.3Lo r0 = r3.A0R
            if (r0 == 0) goto L_0x049f
            X.3ZH r0 = r0.A01(r5)
            X.C626936e.A06(r0)
            r3.A0S = r0
            X.5DR r1 = r3.A0A
            if (r1 == 0) goto L_0x0498
            X.4uY r0 = r3.A7H()
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = X.AnonymousClass5BS.A00(r1, r3, r0)
            r3.A0k = r0
            java.lang.String r11 = "newsletterViewModel"
            if (r0 != 0) goto L_0x005d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x005d:
            X.08M r2 = r0.A01
            X.61v r1 = new X.61v
            r1.<init>(r3)
            r0 = 261(0x105, float:3.66E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r3.A0k
            if (r0 != 0) goto L_0x0072
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0072:
            X.08M r2 = r0.A00
            X.61w r1 = new X.61w
            r1.<init>(r3)
            r0 = 262(0x106, float:3.67E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r3.A0k
            if (r0 != 0) goto L_0x0087
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0087:
            X.5m4 r1 = r0.A03
            X.4uY r0 = r0.A00
            X.5Rp r1 = r1.A01(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState"
            X.C162457s7.A0K(r1, r0)
            r3.A0e = r1
            X.5DY r6 = r3.A0C
            if (r6 == 0) goto L_0x0491
            X.4uY r2 = r3.A7H()
            X.C626936e.A06(r2)
            X.3ZH r1 = r3.A0S
            if (r1 != 0) goto L_0x00ac
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ac:
            r4 = 0
            X.6Af r0 = new X.6Af
            r0.<init>(r6, r2, r1, r4)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r0, r3)
            java.lang.Class<X.4kK> r0 = X.C91534kK.class
            X.0Ty r0 = r1.A01(r0)
            X.4kK r0 = (X.C91534kK) r0
            r3.A0c = r0
            java.lang.String r10 = "newsletterInfoViewModel"
            if (r0 != 0) goto L_0x00c9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x00c9:
            r3.A7B(r0)
            X.4kK r0 = r3.A0c
            if (r0 != 0) goto L_0x00d5
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x00d5:
            X.0Wx r2 = r0.A03
            X.61t r1 = new X.61t
            r1.<init>(r3)
            r0 = 256(0x100, float:3.59E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            X.4kK r0 = r3.A0c
            if (r0 != 0) goto L_0x00ea
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x00ea:
            X.0Wx r2 = r0.A02
            X.61u r1 = new X.61u
            r1.<init>(r3)
            r0 = 257(0x101, float:3.6E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            X.4sd r1 = new X.4sd
            r1.<init>()
            r3.A0Y = r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A03 = r0
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131625545(0x7f0e0649, float:1.88783E38)
            android.view.View r0 = X.C86664Kz.A0g(r1, r0)
            r3.setContentView((android.view.View) r0)
            android.view.View r1 = r3.A00
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout"
            X.C162457s7.A0K(r1, r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = (com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout) r1
            r3.A0L = r1
            androidx.appcompat.widget.Toolbar r2 = X.AnonymousClass1Hf.A28(r3)
            if (r2 == 0) goto L_0x013d
            java.lang.String r0 = ""
            r2.setTitle((java.lang.CharSequence) r0)
            r2.A07()
            r3.setSupportActionBar(r2)
            X.AnonymousClass1Hf.A2E(r3)
            X.33j r1 = r3.A00
            r0 = 2131231903(0x7f08049f, float:1.80799E38)
            X.C86604Kt.A11(r3, r2, r1, r0)
        L_0x013d:
            android.widget.ListView r0 = r3.getListView()
            X.C162457s7.A0D(r0)
            r3.A08 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r3.A0L
            java.lang.String r9 = "rootLayout"
            if (r1 != 0) goto L_0x0151
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0151:
            r0 = 2131625548(0x7f0e064c, float:1.8878307E38)
            r1.A0A(r0)
            r0 = 2131430544(0x7f0b0c90, float:1.8482792E38)
            android.view.View r0 = X.C18290x4.A0L(r3, r0)
            r3.A04 = r0
            r0 = 2131427639(0x7f0b0137, float:1.84769E38)
            android.view.View r0 = X.C18290x4.A0L(r3, r0)
            r3.A05 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r3.A0L
            if (r0 != 0) goto L_0x0172
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0172:
            r0.A06()
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r3.A0L
            if (r1 != 0) goto L_0x017e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x017e:
            int r0 = X.C86634Kw.A03(r3)
            r1.setColor(r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = r3.A0L
            if (r2 != 0) goto L_0x018e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x018e:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165198(0x7f07000e, float:1.7944606E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.C18320x8.A00(r3, r0)
            r2.A0B(r1, r0)
            android.view.LayoutInflater r2 = r3.getLayoutInflater()
            r1 = 2131625547(0x7f0e064b, float:1.8878305E38)
            android.widget.ListView r0 = r3.A08
            java.lang.String r8 = "newsletterListView"
            r6 = 0
            if (r0 != 0) goto L_0x01b3
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x01b3:
            android.view.View r2 = X.C18310x6.A0I(r2, r0, r1, r4)
            r3.A02 = r2
            android.widget.ListView r1 = r3.A08
            if (r1 != 0) goto L_0x01c2
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x01c2:
            android.content.Context r0 = r2.getContext()
            android.widget.FrameLayout r0 = X.C86654Ky.A0K(r0, r2)
            r7 = 2
            X.AnonymousClass0YY.A06(r0, r7)
            r1.addFooterView(r0, r6, r4)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r3)
            r3.A07 = r0
            android.graphics.Point r0 = X.AnonymousClass4L0.A07()
            X.C86604Kt.A0x(r3, r0)
            int r1 = r0.y
            android.widget.LinearLayout r0 = r3.A07
            java.lang.String r2 = "footerPadding"
            if (r0 != 0) goto L_0x01ec
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x01ec:
            r0.setPadding(r4, r4, r4, r1)
            android.widget.ListView r1 = r3.A08
            if (r1 != 0) goto L_0x01f8
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x01f8:
            android.widget.LinearLayout r0 = r3.A07
            if (r0 != 0) goto L_0x0201
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0201:
            r1.addFooterView(r0, r6, r4)
            android.widget.LinearLayout r0 = r3.A07
            if (r0 != 0) goto L_0x020d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x020d:
            X.AnonymousClass0YY.A06(r0, r7)
            boolean r0 = r3.A7f()
            if (r0 == 0) goto L_0x0279
            X.5M3 r2 = r3.A0F
            if (r2 == 0) goto L_0x046e
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            X.C162457s7.A0D(r1)
            X.5Uq r0 = r3.A0O
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = "contactPhotoLoader"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022c:
            X.4X3 r0 = r2.A00(r1, r0, r3, r4)
            r3.A0j = r0
            r0 = 2131427641(0x7f0b0139, float:1.8476904E38)
            android.view.View r1 = X.C18290x4.A0L(r3, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.4X3 r0 = r3.A0j
            if (r0 != 0) goto L_0x0246
            java.lang.String r0 = "newsletterInvitedAdminsListAdapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0246:
            r1.setAdapter(r0)
            com.whatsapp.newsletter.NewsletterInfoActivity$setupInvitedAdminsList$layoutManager$1 r0 = new com.whatsapp.newsletter.NewsletterInfoActivity$setupInvitedAdminsList$layoutManager$1
            r0.<init>()
            r1.setLayoutManager(r0)
            r1.setItemAnimator(r6)
            X.4kK r1 = r3.A0c
            if (r1 != 0) goto L_0x025d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x025d:
            X.4uY r0 = r3.A7H()
            r1.A0H(r0)
            X.4kK r0 = r3.A0c
            if (r0 != 0) goto L_0x026d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x026d:
            X.08M r2 = r0.A04
            X.61q r1 = new X.61q
            r1.<init>(r3)
            r0 = 263(0x107, float:3.69E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
        L_0x0279:
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.view.View r0 = X.C18290x4.A0L(r3, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A06 = r0
            X.5MG r0 = new X.5MG
            r0.<init>(r3)
            r3.A0H = r0
            X.4kK r0 = r3.A0c
            if (r0 != 0) goto L_0x0294
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x0294:
            r0.A0G()
            boolean r0 = r3.A7d()
            if (r0 == 0) goto L_0x0304
            X.5Da r13 = r3.A0E
            if (r13 == 0) goto L_0x0475
            X.4uY r14 = r3.A7H()
            X.C626936e.A06(r14)
            X.1RL r0 = r3.A7G()
            long r0 = r0.A05
            X.4kK r15 = r3.A0c
            if (r15 != 0) goto L_0x02b7
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x02b7:
            X.5gn r12 = new X.5gn
            r16 = r0
            r12.<init>(r13, r14, r15, r16)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r12, r3)
            java.lang.Class<com.whatsapp.newsletter.NewsletterInfoMembersListViewModel> r0 = com.whatsapp.newsletter.NewsletterInfoMembersListViewModel.class
            X.0Ty r1 = r1.A01(r0)
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r1
            X.08A r0 = r3.A06
            r0.A00(r1)
            r3.A0b = r1
            if (r1 == 0) goto L_0x02df
            X.0Wx r2 = r1.A03
            X.61r r1 = new X.61r
            r1.<init>(r3)
            r0 = 258(0x102, float:3.62E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
        L_0x02df:
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = r3.A0b
            if (r1 == 0) goto L_0x02e8
            X.21d r0 = X.C371521d.SHORT
            r1.A0E(r0, r4)
        L_0x02e8:
            boolean r0 = r3.A7f()
            if (r0 != 0) goto L_0x02f4
            boolean r0 = r3.A7e()
            if (r0 == 0) goto L_0x0304
        L_0x02f4:
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r0 = r3.A0b
            if (r0 == 0) goto L_0x0304
            X.08M r2 = r0.A04
            X.61s r1 = new X.61s
            r1.<init>(r3)
            r0 = 259(0x103, float:3.63E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
        L_0x0304:
            X.4Ok r1 = r3.A7I()
            r3.A0d = r1
            android.widget.ListView r0 = r3.A08
            if (r0 != 0) goto L_0x0313
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0313:
            r0.setAdapter(r1)
            r1 = 2131434871(0x7f0b1d77, float:1.8491568E38)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r3.A0L
            if (r0 != 0) goto L_0x0322
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0322:
            android.widget.ImageView r1 = X.C86604Kt.A0J(r0, r1)
            r0 = 2131231019(0x7f08012b, float:1.8078107E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0VX.A01(r3, r0)
            r1.setImageDrawable(r0)
            r0 = 2131430450(0x7f0b0c32, float:1.8482601E38)
            android.view.View r1 = X.C18290x4.A0L(r3, r0)
            com.whatsapp.text.ReadMoreTextView r1 = (com.whatsapp.text.ReadMoreTextView) r1
            r3.A0r = r1
            if (r1 != 0) goto L_0x0344
            java.lang.String r0 = "descriptionTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0344:
            r0 = 3
            r1.setLinesLimit(r0)
            X.33i r0 = r3.A08
            X.AnonymousClass0x2.A12(r1, r0)
            r0 = 2131430537(0x7f0b0c89, float:1.8482778E38)
            android.view.View r0 = X.C18290x4.A0L(r3, r0)
            r3.A03 = r0
            r0 = 2131431833(0x7f0b1199, float:1.8485406E38)
            android.view.View r1 = X.C18290x4.A0L(r3, r0)
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            r3.A0G = r1
            if (r1 != 0) goto L_0x036a
            java.lang.String r0 = "noDescription"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x036a:
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131429409(0x7f0b0821, float:1.848049E38)
            android.view.View r0 = X.C18290x4.A0L(r3, r0)
            r3.A01 = r0
            r3.A7W()
            r0 = 1
            r3.A5n(r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = r3.A0L
            if (r2 != 0) goto L_0x0388
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0388:
            r1 = 11
            X.5eW r0 = new X.5eW
            r0.<init>(r3, r1)
            r2.A0A = r0
            X.66R r7 = r3.A0x
            java.lang.Object r0 = r7.getValue()
            X.10Y r0 = (X.AnonymousClass10Y) r0
            X.0Wx r2 = r0.A00
            X.42f r1 = new X.42f
            r1.<init>(r3)
            r0 = 264(0x108, float:3.7E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            java.lang.Object r0 = r7.getValue()
            X.10Y r0 = (X.AnonymousClass10Y) r0
            r0.A0D()
            X.1RL r0 = r3.A7G()
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x03d5
            X.1VX r1 = r3.A0D
            r0 = 5621(0x15f5, float:7.877E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r0 = r7.getValue()
            X.10Y r0 = (X.AnonymousClass10Y) r0
            X.4C6 r2 = X.AnonymousClass0IV.A00(r0)
            com.whatsapp.newsletter.NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1 r1 = new com.whatsapp.newsletter.NewsletterInfoIntegrityViewModel$fetchChannelAlerts$1
            r1.<init>(r0, r6)
            r0 = 3
            X.C616131n.A02(r6, r1, r2, r6, r0)
        L_0x03d5:
            r3.A7c(r4, r4)
            X.1ib r1 = r3.A0I
            if (r1 == 0) goto L_0x048a
            X.2oO r0 = r3.A0t
            r1.A06(r0)
            X.1hw r1 = r3.A0M
            X.4FI r0 = r3.A0v
            r1.A06(r0)
            X.1in r1 = r3.A0M
            if (r1 == 0) goto L_0x0483
            X.2sG r0 = r3.A0u
            r1.A06(r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r3.A0k
            if (r0 != 0) goto L_0x03fa
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x03fa:
            X.0Wx r2 = r0.A0G()
            X.61p r1 = new X.61p
            r1.<init>(r3)
            r0 = 260(0x104, float:3.64E-43)
            X.AnonymousClass6C6.A02(r3, r2, r1, r0)
            r3.A7V()
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            java.lang.String r6 = "transitionNames"
            if (r0 == 0) goto L_0x042d
            android.view.View r2 = r3.A04
            if (r2 != 0) goto L_0x0424
            java.lang.String r0 = "headerView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0424:
            X.5MG r1 = r3.A0H
            if (r1 != 0) goto L_0x043f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x042d:
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0449
            X.5MG r1 = r3.A0H
            if (r1 != 0) goto L_0x043f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x043f:
            r0 = 2131896408(0x7f122858, float:1.9427676E38)
            java.lang.String r0 = r1.A03(r0)
            r2.setTransitionName(r0)
        L_0x0449:
            X.5mB r1 = r3.A0Q
            if (r1 == 0) goto L_0x047c
            r0 = 7
            r1.A05(r5, r0)
            r3.A5n(r4)
            r3.A7X()
            X.1RL r0 = r3.A7G()
            boolean r2 = r0.A0K
            r0 = 2131429393(0x7f0b0811, float:1.8480457E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x001c
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            return
        L_0x046e:
            java.lang.String r0 = "newsletterInvitedAdminsListAdapterFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0475:
            java.lang.String r0 = "newsletterInfoMembersListViewModelFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x047c:
            java.lang.String r0 = "chatMessageCounts"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0483:
            java.lang.String r0 = "contactObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x048a:
            java.lang.String r0 = "chatStateObservers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0491:
            java.lang.String r0 = "newsletterInfoViewModelFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0498:
            java.lang.String r0 = "newsletterViewModelFactory"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x049f:
            java.lang.String r0 = "conversationContactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04a6:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ad:
            java.lang.String r0 = "chatActionLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i2 != 52) {
            return super.onCreateDialog(i2);
        }
        C56612sH r35 = this.A06;
        AnonymousClass1VX r16 = this.A0D;
        C69263Wi r15 = this.A05;
        C105895Wv r14 = this.A0B;
        C55682qk r13 = this.A03;
        AnonymousClass5Y0 r12 = this.A0C;
        C27821ej r8 = this.A0V;
        if (r8 != null) {
            C620633i r11 = this.A08;
            C620733j r10 = this.A00;
            AnonymousClass5IY r7 = this.A0U;
            if (r7 != null) {
                EmojiSearchProvider emojiSearchProvider = this.A0W;
                if (emojiSearchProvider != null) {
                    AnonymousClass33p r5 = this.A09;
                    C60152y5 r4 = this.A0n;
                    if (r4 != null) {
                        AnonymousClass487 r3 = this.A0B;
                        String str = A7G().A0E;
                        AnonymousClass1VX r25 = r16;
                        AnonymousClass487 r20 = r3;
                        AnonymousClass5IY r21 = r7;
                        C27821ej r22 = r8;
                        AnonymousClass33p r17 = r5;
                        C620733j r18 = r10;
                        C107365bC r19 = new C107365bC(this, 4);
                        C69263Wi r142 = r15;
                        C620633i r152 = r11;
                        C56612sH r162 = r35;
                        C89014bL r112 = new C89014bL(this, r13, r142, r152, r162, r17, r18, r19, r20, r21, r22, r12, emojiSearchProvider, r25, r4, r14, str, 52, R.string.f11nameremoved, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, R.string.f11nameremoved, 0, 147457);
                        r112.A07 = true;
                        return r112;
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                throw C18270x1.A0S("emojiSearchProvider");
            }
            throw C18270x1.A0S("emojiTrayLogger");
        }
        throw C18270x1.A0S("recentEmojis");
    }

    public void onDestroy() {
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel;
        AnonymousClass47C r0;
        C95104sd r1 = this.A0Y;
        if (r1 != null) {
            AnonymousClass4FV r02 = this.A0X;
            if (r02 != null) {
                r02.BhD(r1);
            } else {
                throw C18270x1.A0S("wamRuntime");
            }
        }
        C29301ib r12 = this.A0I;
        if (r12 != null) {
            r12.A07(this.A0t);
            this.A0M.A07(this.A0v);
            C29421in r13 = this.A0M;
            if (r13 != null) {
                r13.A07(this.A0u);
                C105365Uq r03 = this.A0O;
                if (r03 == null) {
                    throw C18270x1.A0S("contactPhotoLoader");
                }
                r03.A00();
                ImageView imageView = this.A06;
                if (imageView == null) {
                    throw C18270x1.A0S("photoView");
                }
                imageView.setImageDrawable((Drawable) null);
                if (!(!A7d() || (newsletterInfoMembersListViewModel = this.A0b) == null || (r0 = newsletterInfoMembersListViewModel.A00) == null)) {
                    r0.cancel();
                }
                AnonymousClass5QK r2 = this.A0h;
                if (r2 != null) {
                    AnonymousClass495 r04 = r2.A00;
                    if (r04 != null) {
                        r04.cancel();
                    }
                    C86624Kv.A1D(r2.A01, r2, 39);
                    super.onDestroy();
                    return;
                }
                throw C18270x1.A0S("newsletterAdminInvitationHandler");
            }
            throw C18270x1.A0S("contactObservers");
        }
        throw C18270x1.A0S("chatStateObservers");
    }

    public final void updateMuteInfo(View view) {
        C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.ListItemWithLeftIcon");
        ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) view;
        TextView A0I2 = AnonymousClass0x2.A0I(listItemWithLeftIcon, R.id.list_item_title);
        this.A09 = (SwitchCompat) listItemWithLeftIcon.findViewById(R.id.mute_switch);
        C107295b4.A03(view, R.string.f11nameremoved);
        if (this.A09 == null) {
            LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
            WDSSwitch wDSSwitch = new WDSSwitch(this, (AttributeSet) null, R.attr.f3nameremoved);
            wDSSwitch.setId(R.id.mute_switch);
            wDSSwitch.setLayoutParams(A0C2);
            listItemWithLeftIcon.A07(wDSSwitch);
            this.A09 = wDSSwitch;
        }
        AnonymousClass5Yj.A0B(this, A0I2, R.attr.f3nameremoved, R.color.f5nameremoved);
        SwitchCompat switchCompat = this.A09;
        if (switchCompat != null) {
            C18300x5.A13(this, switchCompat, R.string.f11nameremoved);
            switchCompat.setChecked(A7G().A0L);
            switchCompat.setEnabled(!A7G().A0K);
            AnonymousClass693.A00(switchCompat, this, 6);
        }
    }

    public void A76() {
        super.A76();
        C91534kK r0 = this.A0c;
        if (r0 == null) {
            throw C18270x1.A0S("newsletterInfoViewModel");
        }
        C94174qF r1 = r0.A07;
        C86604Kt.A1R(r1.A00);
        r1.A00 = null;
    }

    public final String A7L() {
        String str;
        int i;
        AnonymousClass1RL A7G = A7G();
        String str2 = A7G.A0F;
        if (str2 == null) {
            str2 = "";
        }
        if (str.length() > 0) {
            i = R.string.f11nameremoved;
        } else {
            str = A7G.A0G;
            if (str == null) {
                str = "impossible-code";
            }
            i = R.string.f11nameremoved;
        }
        Object[] A0M2 = AnonymousClass002.A0M();
        A0M2[0] = A7G.A0H;
        return C18300x5.A0e(this, str, A0M2, 1, i);
    }

    public final String A7M(List list) {
        C27981fH r1;
        ArrayList A0c2 = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid A0T2 = C18310x6.A0T(it);
            if ((A0T2 instanceof C27981fH) && (r1 = (C27981fH) A0T2) != null) {
                C56662sM r0 = this.A0T;
                if (r0 != null) {
                    PhoneUserJid A022 = r0.A02(r1);
                    if (A022 != null) {
                        A0T2 = A022;
                    }
                } else {
                    throw C18270x1.A0S("waJidMapRepository");
                }
            }
            AnonymousClass5ZU r12 = this.A0N;
            if (r12 != null) {
                A0c2.add(C18300x5.A0h(r12, this.A0I.A0A(A0T2)));
            } else {
                throw C18270x1.A0S("waContactNames");
            }
        }
        return (String) AnonymousClass0x9.A0t(A0c2);
    }

    public final void A7N() {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(C86614Ku.A0s(this, A7G().A0H, AnonymousClass002.A0L(), R.string.f11nameremoved));
        A002.A0c(this, new AnonymousClass5BX(4), R.string.f11nameremoved);
        A002.A0d(this, AnonymousClass6C6.A00(this, 255), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public final void A7O() {
        Bp9(R.string.f11nameremoved);
        NewsletterViewModel newsletterViewModel = this.A0k;
        if (newsletterViewModel == null) {
            throw C18270x1.A0S("newsletterViewModel");
        }
        newsletterViewModel.A04.A09(A7H());
        A7J().A0A(A7H(), C106855aH.A00(getIntent()), AnonymousClass59F.NEWSLETTER_INFO, (String) null, C106855aH.A01(this), -1);
        C107295b4.A00(this, this.A08, AnonymousClass002.A0F(this, A7G().A0H, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
    }

    public final void A7P() {
        Bp9(R.string.f11nameremoved);
        NewsletterViewModel newsletterViewModel = this.A0k;
        if (newsletterViewModel == null) {
            throw C18270x1.A0S("newsletterViewModel");
        }
        newsletterViewModel.A04.A08(A7H());
        A7J().A08(A7H(), C106855aH.A00(getIntent()), AnonymousClass59F.NEWSLETTER_INFO, C106855aH.A01(this));
    }

    public final void A7Q() {
        A7a(AnonymousClass000.A1Y(A7G().A07, C372821q.SUBSCRIBED));
        if (AnonymousClass000.A1Y(A7G().A07, C372821q.GUEST) && AnonymousClass4SG.A4C(this)) {
            C18270x1.A0p(findViewById(R.id.unfollow_and_report_card));
        }
        C105065Tl r1 = this.A0K;
        if (r1 != null) {
            AnonymousClass3ZH r0 = this.A0S;
            if (r0 == null) {
                throw C18270x1.A0S("contact");
            }
            r1.A02(r0);
        }
    }

    public final void A7S() {
        Bp9(R.string.f11nameremoved);
        NewsletterViewModel newsletterViewModel = this.A0k;
        if (newsletterViewModel == null) {
            throw C18270x1.A0S("newsletterViewModel");
        }
        newsletterViewModel.A04.A0A(A7H());
        A7J().A0B(A7H(), C106855aH.A00(getIntent()), AnonymousClass59F.NEWSLETTER_INFO, (String) null, C106855aH.A01(this), -1);
        C107295b4.A00(this, this.A08, AnonymousClass002.A0F(this, A7G().A0H, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
    }

    public final void A7T() {
        Bp9(R.string.f11nameremoved);
        NewsletterViewModel newsletterViewModel = this.A0k;
        if (newsletterViewModel == null) {
            throw C18270x1.A0S("newsletterViewModel");
        }
        newsletterViewModel.A0E(A7H());
        A7J().A09(A7H(), C106855aH.A00(getIntent()), AnonymousClass59F.NEWSLETTER_INFO, C106855aH.A01(this));
    }

    public final void A7U() {
        int i = (int) A7G().A05;
        String format = NumberFormat.getInstance(C620733j.A02(this.A00)).format(A7G().A05);
        C86614Ku.A16(getResources(), (TextView) this.A0w.getValue(), AnonymousClass000.A1b(format), R.plurals.f9nameremoved, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r0 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r1.A07 != X.C372821q.OWNER) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7V() {
        /*
            r5 = this;
            X.1RL r4 = r5.A7G()
            X.5Pe r0 = r5.A7K()
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0023
            X.21q r1 = r4.A07
            X.21q r0 = X.C372821q.GUEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0023
            r0 = 2131434478(0x7f0b1bee, float:1.8490771E38)
            android.view.View r0 = r5.findViewById(r0)
            X.C18270x1.A0p(r0)
        L_0x0022:
            return
        L_0x0023:
            X.5Pe r0 = r5.A7K()
            boolean r1 = r0.A00(r4)
            r0 = 2131433016(0x7f0b1638, float:1.8487806E38)
            android.view.View r3 = X.C18290x4.A0L(r5, r0)
            r2 = 0
            if (r1 != 0) goto L_0x0135
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0135
            X.21q r0 = r4.A07
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r2) goto L_0x0050
            if (r1 == r0) goto L_0x0050
            r0 = 2
            if (r1 == r0) goto L_0x012f
            r0 = 3
            if (r1 != r0) goto L_0x013a
            boolean r0 = r5.A7f()
        L_0x004e:
            if (r0 == 0) goto L_0x0135
        L_0x0050:
            r0 = 1
        L_0x0051:
            r3.setVisibility(r2)
            if (r0 == 0) goto L_0x0065
            r0 = 2131433016(0x7f0b1638, float:1.8487806E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            r0 = 10
            X.C989653x.A00(r1, r5, r0)
            X.C107295b4.A02(r1)
        L_0x0065:
            X.21q r1 = r4.A07
            X.21q r0 = X.C372821q.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            r5.A7a(r0)
            boolean r3 = r5.A7e()
            r0 = 2131431737(0x7f0b1139, float:1.8485212E38)
            android.view.View r2 = X.C18290x4.A0L(r5, r0)
            boolean r0 = r5.A7d()
            r1 = 8
            int r0 = X.AnonymousClass001.A08(r0)
            r2.setVisibility(r0)
            r0 = 2131429499(0x7f0b087b, float:1.8480672E38)
            android.view.View r2 = X.C18290x4.A0L(r5, r0)
            if (r3 == 0) goto L_0x0092
            r1 = 0
        L_0x0092:
            r2.setVisibility(r1)
            if (r3 == 0) goto L_0x00ab
            X.1VX r1 = r5.A0D
            r0 = 6096(0x17d0, float:8.542E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 0
            r5.A7b(r1, r0)
            r0 = 12
            X.C989653x.A00(r2, r5, r0)
            X.C107295b4.A02(r2)
        L_0x00ab:
            X.1RL r1 = r5.A7G()
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x00ba
            X.21q r1 = r1.A07
            X.21q r0 = X.C372821q.OWNER
            r2 = 1
            if (r1 == r0) goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            r0 = 2131429372(0x7f0b07fc, float:1.8480415E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x00d3
            r0 = 13
            X.C989653x.A00(r1, r5, r0)
            X.C107295b4.A02(r1)
        L_0x00d3:
            boolean r2 = r5.A7d()
            r0 = 2131431738(0x7f0b113a, float:1.8485214E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x0022
            boolean r2 = r5.A7f()
            r0 = 2131430803(0x7f0b0d93, float:1.8483317E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x0100
            r0 = 13
            X.C18300x5.A19(r1, r5, r0)
        L_0x0100:
            r0 = 2131431750(0x7f0b1146, float:1.8485238E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            r0 = 14
            X.C18300x5.A19(r1, r5, r0)
            boolean r0 = r5.A7f()
            if (r0 == 0) goto L_0x011f
            r0 = 2131430829(0x7f0b0dad, float:1.848337E38)
            android.widget.TextView r1 = X.C005205m.A01(r5, r0)
            r0 = 2131891132(0x7f1213bc, float:1.9416975E38)
            r1.setText(r0)
        L_0x011f:
            r0 = 2131431740(0x7f0b113c, float:1.8485218E38)
            android.view.View r1 = X.C18290x4.A0L(r5, r0)
            r0 = 12
            X.C18300x5.A19(r1, r5, r0)
            r5.A7U()
            return
        L_0x012f:
            boolean r0 = r5.A7e()
            goto L_0x004e
        L_0x0135:
            r0 = 0
            r2 = 8
            goto L_0x0051
        L_0x013a:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A7V():void");
    }

    public final void A7W() {
        String str = A7G().A0E;
        if (str == null) {
            str = "";
        }
        if (!AnonymousClass001.A1W(str.length()) || AnonymousClass4SG.A4C(this)) {
            View view = this.A01;
            if (view == null) {
                throw C18270x1.A0S("descriptionCard");
            }
            view.setVisibility(8);
        } else {
            View view2 = this.A01;
            if (view2 == null) {
                throw C18270x1.A0S("descriptionCard");
            }
            view2.setVisibility(0);
            WaTextView waTextView = this.A0G;
            if (waTextView == null) {
                throw C18270x1.A0S("noDescription");
            }
            waTextView.setVisibility(8);
            View view3 = this.A03;
            if (view3 == null) {
                throw C18270x1.A0S("hasDescription");
            }
            view3.setVisibility(0);
            C620633i r4 = this.A08;
            C60152y5 r2 = this.A0n;
            if (r2 != null) {
                ReadMoreTextView readMoreTextView = this.A0r;
                if (readMoreTextView == null) {
                    throw C18270x1.A0S("descriptionTextView");
                }
                SpannableStringBuilder A002 = C18330xA.A00(C107635bd.A07(r4, r2, C107345b9.A03(this, readMoreTextView.getPaint(), this.A0C, str)));
                C106715a2 r1 = this.A0s;
                if (r1 != null) {
                    ReadMoreTextView readMoreTextView2 = this.A0r;
                    if (readMoreTextView2 == null) {
                        throw C18270x1.A0S("descriptionTextView");
                    }
                    r1.A07(readMoreTextView2.getContext(), A002);
                    ReadMoreTextView readMoreTextView3 = this.A0r;
                    if (readMoreTextView3 == null) {
                        throw C18270x1.A0S("descriptionTextView");
                    }
                    readMoreTextView3.A0K((List) null, A002);
                } else {
                    throw C18270x1.A0S("linkifier");
                }
            } else {
                throw C18270x1.A0S("sharedPreferencesFactory");
            }
        }
        if (A7G().A0K()) {
            View view4 = this.A01;
            if (view4 == null) {
                throw C18270x1.A0S("descriptionCard");
            }
            C18300x5.A19(view4, this, 7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r5 == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7X() {
        /*
            r6 = this;
            boolean r0 = X.AnonymousClass4SG.A4C(r6)
            r4 = 8
            if (r0 == 0) goto L_0x0015
            r0 = 2131428981(0x7f0b0675, float:1.8479622E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x0014
            r0.setVisibility(r4)
        L_0x0014:
            return
        L_0x0015:
            X.1RL r0 = r6.A7G()
            boolean r5 = r0.A0K()
            r0 = 2131431777(0x7f0b1161, float:1.8485293E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x002f
            r0 = r5 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x002f:
            r0 = 2131431778(0x7f0b1162, float:1.8485295E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0042
            int r0 = X.AnonymousClass001.A08(r5)
            r1.setVisibility(r0)
            X.C18300x5.A19(r1, r6, r4)
        L_0x0042:
            r0 = 2131431776(0x7f0b1160, float:1.848529E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0059
            r0 = r5 ^ 1
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
            r0 = 9
            X.C18300x5.A19(r1, r6, r0)
        L_0x0059:
            r0 = 2131431787(0x7f0b116b, float:1.8485313E38)
            android.view.View r3 = r6.findViewById(r0)
            if (r3 == 0) goto L_0x0014
            X.5UP r0 = r6.A0Z
            if (r0 == 0) goto L_0x0095
            X.1VX r1 = r0.A01
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0073
            r2 = 1
            if (r5 != 0) goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            X.5UP r0 = r6.A0Z
            if (r0 == 0) goto L_0x008e
            X.1VX r1 = r0.A01
            r0 = 5625(0x15f9, float:7.882E-42)
            boolean r0 = r1.A0X(r0)
            if (r2 != 0) goto L_0x0084
            if (r0 == 0) goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            r3.setVisibility(r4)
            r0 = 10
            X.C18300x5.A19(r3, r6, r0)
            return
        L_0x008e:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0095:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A7X():void");
    }

    public final void A7Z(boolean z) {
        CharSequence charSequence;
        A7J().A05(15, false);
        NewsletterInfoLayout newsletterInfoLayout = this.A0L;
        if (newsletterInfoLayout == null) {
            throw C18270x1.A0S("rootLayout");
        }
        AnonymousClass0YY.A06(newsletterInfoLayout, 4);
        C08240dc A0J2 = AnonymousClass0x2.A0J(this);
        TextView A0L2 = C18310x6.A0L(this, R.id.newsletter_followers_footer_text);
        if (A0L2 != null) {
            charSequence = A0L2.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        boolean A1W = AnonymousClass001.A1W((A7G().A05 > 5000 ? 1 : (A7G().A05 == 5000 ? 0 : -1)));
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = new NewsletterInfoMembersSearchFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("footer_text", valueOf);
        A082.putBoolean("enter_ime", z);
        A082.putBoolean("is_over_max", A1W);
        A082.putBoolean("enter_animated", true);
        A082.putBoolean("exit_animated", true);
        newsletterInfoMembersSearchFragment.A0u(A082);
        A0J2.A0A(newsletterInfoMembersSearchFragment, R.id.search_container);
        A0J2.A0I((String) null);
        A0J2.A01();
    }

    public final void A7a(boolean z) {
        View A0L2 = C18290x4.A0L(this, R.id.unfollow_newsletter_btn);
        A0L2.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        C989653x.A00(A0L2, this, 11);
        C107295b4.A02(A0L2);
    }

    public final void A7b(boolean z, boolean z2) {
        int i;
        if (A7d() || A7e() || A7f()) {
            TextView A0L2 = C18310x6.A0L(this, R.id.newsletter_followers_footer_text);
            if ((A7f() || A7e()) && (z || z2)) {
                if (A0L2 != null) {
                    i = R.string.f11nameremoved;
                } else {
                    return;
                }
            } else if (A0L2 != null) {
                i = R.string.f11nameremoved;
            } else {
                return;
            }
            A0L2.setText(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (X.AnonymousClass000.A1Y(A7G().A07, X.C372821q.SUBSCRIBED) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r7 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7c(boolean r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.A7f()
            if (r0 == 0) goto L_0x0009
            if (r6 != 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            r0 = 2131427533(0x7f0b00cd, float:1.8476685E38)
            android.view.View r4 = r5.findViewById(r0)
            if (r4 == 0) goto L_0x0008
            boolean r0 = X.AnonymousClass4SG.A4C(r5)
            r3 = 0
            if (r0 != 0) goto L_0x0049
            X.1RL r0 = r5.A7G()
            boolean r0 = r0.A0K
            if (r0 != 0) goto L_0x0049
            r2 = 0
            X.1RL r0 = r5.A7G()
            X.21q r1 = r0.A07
            X.21q r0 = X.C372821q.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 != 0) goto L_0x003a
        L_0x0030:
            boolean r0 = r5.A7e()
            if (r0 != 0) goto L_0x003a
            r0 = 8
            if (r7 == 0) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r4.setVisibility(r0)
            if (r2 != 0) goto L_0x0008
            boolean r0 = r5.A7f()
            if (r0 == 0) goto L_0x004b
            if (r7 != 0) goto L_0x004b
            return
        L_0x0049:
            r2 = 1
            goto L_0x0030
        L_0x004b:
            android.view.View r1 = r5.A00
            r0 = 2131431630(0x7f0b10ce, float:1.8484995E38)
            android.view.View r2 = X.C18280x3.A0E(r1, r0)
            X.1RL r0 = r5.A7G()
            X.21q r1 = r0.A07
            X.21q r0 = X.C372821q.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 != 0) goto L_0x006c
            boolean r0 = r5.A7e()
            if (r0 != 0) goto L_0x006c
            if (r7 != 0) goto L_0x006c
            r3 = 8
        L_0x006c:
            r2.setVisibility(r3)
            r5.updateMuteInfo(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A7c(boolean, boolean):void");
    }

    public final boolean A7d() {
        if (!A7G().A0K() || !this.A0D.A0X(4307)) {
            return false;
        }
        return true;
    }

    public final boolean A7e() {
        AnonymousClass1RL A7G = A7G();
        if (A7G.A0K || A7G.A07 != C372821q.ADMIN) {
            return false;
        }
        if (this.A0D.A0X(6096) || this.A0D.A0X(6535)) {
            return true;
        }
        return false;
    }

    public final boolean A7f() {
        AnonymousClass1RL A7G = A7G();
        if (A7G.A0K || A7G.A07 != C372821q.OWNER || !this.A0D.A0X(6096)) {
            return false;
        }
        return true;
    }

    public void BPt(AnonymousClass3ZH r1) {
    }

    public void BWL(ArrayList arrayList) {
    }

    public void onBackPressed() {
        C08310eF A0B2 = getSupportFragmentManager().A0B(R.id.search_container);
        if (A0B2 instanceof NewsletterInfoMembersSearchFragment) {
            ((NewsletterInfoMembersSearchFragment) A0B2).A1K();
            return;
        }
        if (isTaskRoot()) {
            Intent A0D2 = C86634Kw.A0D(this, C86664Kz.A1B(), A7H());
            C162457s7.A0D(A0D2);
            finishAndRemoveTask();
            startActivity(A0D2);
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!AnonymousClass4SG.A4C(this) && A7G().A0K() && menu != null) {
            menu.add(0, 1001, 0, getString(R.string.f11nameremoved));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A042 = C18290x4.A04(menuItem);
        if (A042 != 1001) {
            if (A042 != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            AnonymousClass0X0.A00(this);
            if (!isTaskRoot()) {
                return true;
            }
            Intent A0D2 = C86634Kw.A0D(this, C86664Kz.A1B(), A7H());
            C162457s7.A0D(A0D2);
            finishAndRemoveTask();
            startActivity(A0D2);
            return true;
        } else if (!A7G().A0K()) {
            C86624Kv.A1D(this.A05, this, 27);
            return true;
        } else {
            A7J().A0F(false);
            C95804uY A7H = A7H();
            Intent A072 = C18320x8.A07();
            C86604Kt.A13(A072, A7H, getPackageName(), "com.whatsapp.newsletter.ui.NewsletterEditActivity");
            startActivityForResult(A072, 50);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        C56842se r1 = this.A0f;
        if (r1 != null) {
            r1.A05(A7H());
            return;
        }
        throw C18270x1.A0S("newsletterManager");
    }

    public void onStart() {
        super.onStart();
        if (this.A00 > 0) {
            AnonymousClass5YD A7J = A7J();
            C95804uY A7H = A7H();
            long uptimeMillis = SystemClock.uptimeMillis() - this.A00;
            AnonymousClass5YD.A01(AnonymousClass000.A0Z(" Info opened, duration ", C18290x4.A0v(A7H), uptimeMillis));
            A7J.A05.A01(A7H, 17, 0, 0, uptimeMillis);
            this.A00 = 0;
        }
    }

    public void BfW() {
        A7R();
    }
}
