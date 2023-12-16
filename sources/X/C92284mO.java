package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import java.util.Collection;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4mO  reason: invalid class name and case insensitive filesystem */
public final class C92284mO extends C89904fT implements AnonymousClass4FD {
    public static final AnonymousClass59F A0C = AnonymousClass59F.NEWSLETTER_THREAD;
    public Menu A00;
    public C104595Rp A01;
    public C110065fd A02;
    public boolean A03 = true;
    public boolean A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final C28871hu A07;
    public final AnonymousClass5UP A08;
    public final AnonymousClass5YD A09;
    public final NewsletterViewModel A0A;
    public final C103985Pe A0B;

    public final void A0C(Menu menu, int i, int i2) {
        MenuItem add = menu.add(0, i2, 0, i);
        View A0F = C86644Kx.A0F(add, R.layout.f8nameremoved);
        if (A0F != null) {
            TextView A092 = AnonymousClass002.A09(A0F, R.id.joinable_label);
            if (A092 != null) {
                A092.setText(i);
                C109475eg.A00(A092, this, add, 0);
            }
            C18300x5.A13(this.A01, A0F, i);
        }
        A06(add, i, true);
        add.setShowAsAction(2);
    }

    public void BLe(C95814uZ r2, boolean z) {
        C162457s7.A0J(r2, 0);
        if (C162457s7.A0P(this.A0V, r2)) {
            A09();
        }
    }

    public boolean BYj(Menu menu) {
        int i;
        MenuItem findItem;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        if (menu == null || menu.size() == 0) {
            return false;
        }
        if (A0F()) {
            i = 55;
        } else {
            NewsletterViewModel newsletterViewModel = this.A0A;
            if (C104595Rp.A00(newsletterViewModel).A0L) {
                i = 54;
            } else {
                boolean z = C104595Rp.A00(newsletterViewModel).A0L;
                i = -1;
                if (!z) {
                    i = 53;
                }
            }
        }
        if (this.A03 && (findItem = menu.findItem(i)) != null) {
            C121025zY r3 = C121025zY.A00;
            View actionView = findItem.getActionView();
            if (actionView != null) {
                actionView.setAlpha(0.0f);
            }
            View actionView2 = findItem.getActionView();
            if (!(actionView2 == null || (animate = actionView2.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200)) == null || (withEndAction = duration.withEndAction(C117085rM.A00(r3, 19))) == null)) {
                withEndAction.start();
            }
        }
        this.A03 = true;
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C162457s7.A0J(activity, 0);
        super.onActivityCreated(activity, bundle);
        this.A07.A06(this);
        NewsletterViewModel newsletterViewModel = this.A0A;
        AnonymousClass6C6.A02((AnonymousClass00M) activity, newsletterViewModel.A01, new AnonymousClass616(this), 174);
        C15910sA r6 = (C15910sA) activity;
        AnonymousClass6C6.A02(r6, newsletterViewModel.A00, new AnonymousClass617(this), 175);
        AnonymousClass6C6.A02(r6, newsletterViewModel.A0G(), new AnonymousClass618(this), MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public void onActivityDestroyed(Activity activity) {
        C162457s7.A0J(activity, 0);
        super.onActivityDestroyed(activity);
        this.A07.A07(this);
        ((C004805c) activity).A06.A01(this.A0A);
    }

    public void onActivityResumed(Activity activity) {
        C162457s7.A0J(activity, 0);
        this.A0A.A0G().A07();
        A09();
        super.onActivityResumed(activity);
    }

    public final C95804uY A07() {
        C95814uZ r1 = this.A00.A0H;
        C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C95804uY) r1;
    }

    public final void A08() {
        A0B(55);
        NewsletterViewModel newsletterViewModel = this.A0A;
        C95804uY A072 = A07();
        C162457s7.A0J(A072, 0);
        newsletterViewModel.A04.A09(A072);
        C009707r r1 = this.A01;
        this.A09.A0A(A07(), C106855aH.A00(r1.getIntent()), A0C, (String) null, C106855aH.A01(r1), -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0.isVisible() != true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r1 == A0G()) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isVisible() != true) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r5 = this;
            android.view.Menu r1 = r5.A00
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = "menu"
            r0 = 55
            android.view.MenuItem r0 = r1.findItem(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isVisible()
            r2 = 1
            if (r0 == r3) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0065
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r4)
            throw r0
        L_0x0020:
            android.view.Menu r0 = r5.A00
            if (r0 == 0) goto L_0x0086
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r4 = r5.A0A
            X.1RL r0 = X.C104595Rp.A00(r4)
            boolean r3 = r0.A0K
            android.view.Menu r1 = r5.A00
            java.lang.String r2 = "menu"
            if (r1 != 0) goto L_0x0037
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0037:
            r0 = 53
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0049
            X.1RL r0 = X.C104595Rp.A00(r4)
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0081
            if (r3 != 0) goto L_0x0081
        L_0x0049:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0052
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0052:
            r0 = 54
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0086
            X.1RL r0 = X.C104595Rp.A00(r4)
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x0086
            goto L_0x0081
        L_0x0065:
            r0 = 59
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isVisible()
            r1 = 1
            if (r0 == r3) goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            boolean r0 = r5.A0F()
            if (r2 != r0) goto L_0x0081
            boolean r0 = r5.A0G()
            if (r1 == r0) goto L_0x0020
        L_0x0081:
            X.07r r0 = r5.A01
            r0.invalidateOptionsMenu()
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92284mO.A09():void");
    }

    public final void A0A() {
        Menu menu = this.A00;
        if (menu == null) {
            throw C18270x1.A0S("menu");
        }
        MenuItem findItem = menu.findItem(53);
        if (findItem != null) {
            findItem.setVisible(false);
        }
        MenuItem findItem2 = menu.findItem(54);
        if (findItem2 != null) {
            findItem2.setVisible(false);
        }
        MenuItem findItem3 = menu.findItem(1);
        if (findItem3 != null) {
            findItem3.setVisible(false);
        }
        MenuItem findItem4 = menu.findItem(59);
        if (findItem4 != null) {
            findItem4.setVisible(false);
        }
        A0B(56);
        NewsletterViewModel newsletterViewModel = this.A0A;
        C95804uY A072 = A07();
        C162457s7.A0J(A072, 0);
        newsletterViewModel.A04.A0A(A072);
        C009707r r4 = this.A01;
        this.A09.A0B(A07(), C106855aH.A00(r4.getIntent()), A0C, (String) null, C106855aH.A01(r4), -1);
        C107295b4.A00(r4, this.A05, AnonymousClass002.A0F(r4, C104595Rp.A00(newsletterViewModel).A0H, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
    }

    public final void A0B(int i) {
        Menu menu = this.A00;
        if (menu == null) {
            throw C18270x1.A0S("menu");
        }
        MenuItem findItem = menu.findItem(60);
        if (findItem != null) {
            findItem.setVisible(true);
        }
        Menu menu2 = this.A00;
        if (menu2 == null) {
            throw C18270x1.A0S("menu");
        }
        MenuItem findItem2 = menu2.findItem(i);
        if (findItem2 != null) {
            findItem2.setVisible(false);
        }
    }

    public final void A0D(boolean z) {
        A0B(53);
        NewsletterViewModel newsletterViewModel = this.A0A;
        C95804uY A072 = A07();
        C162457s7.A0J(A072, 0);
        newsletterViewModel.A04.A08(A072);
        C009707r r5 = this.A01;
        this.A09.A08(A07(), C106855aH.A00(r5.getIntent()), A0C, C106855aH.A01(r5));
        this.A04 = z;
    }

    public final void A0E(boolean z) {
        A0B(54);
        this.A0A.A0E(A07());
        C009707r r5 = this.A01;
        this.A09.A09(A07(), C106855aH.A00(r5.getIntent()), A0C, C106855aH.A01(r5));
        this.A04 = z;
    }

    public final boolean A0F() {
        NewsletterViewModel newsletterViewModel = this.A0A;
        if (!AnonymousClass000.A1Y(C104595Rp.A00(newsletterViewModel).A07, C372821q.GUEST) || C104595Rp.A00(newsletterViewModel).A0K) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        NewsletterViewModel newsletterViewModel = this.A0A;
        if (!AnonymousClass000.A1Y(C104595Rp.A00(newsletterViewModel).A07, C372821q.SUBSCRIBED)) {
            return false;
        }
        if (this.A0B.A00(C104595Rp.A00(newsletterViewModel)) || C104595Rp.A00(newsletterViewModel).A0K) {
            return true;
        }
        return false;
    }

    public void BLd() {
    }

    public void BQQ(Menu menu) {
        int i;
        MenuItem A042;
        int i2;
        if (menu != null) {
            if ((menu instanceof C07890cz) && C106545Zk.A00(this.A0R)) {
                ((C07890cz) menu).A0H = true;
            }
            this.A00 = menu;
            MenuItem add = menu.add(0, 60, 0, "");
            View A0F = C86644Kx.A0F(add, R.layout.f8nameremoved);
            if (A0F != null) {
                C18300x5.A13(this.A01, A0F, R.string.f11nameremoved);
            }
            add.setShowAsAction(2);
            add.setVisible(false);
            C103985Pe r1 = this.A0B;
            NewsletterViewModel newsletterViewModel = this.A0A;
            boolean A002 = r1.A00(C104595Rp.A00(newsletterViewModel));
            boolean z = C104595Rp.A00(newsletterViewModel).A0K;
            if (A0G()) {
                A0C(menu, R.string.f11nameremoved, 59);
            }
            if (!A002 && !z) {
                if (A0F()) {
                    A0C(menu, R.string.f11nameremoved, 55);
                    return;
                }
                if (this.A0R.A0X(5041) && C104595Rp.A00(newsletterViewModel).A0K()) {
                    MenuItem A043 = A04(menu, 61, R.string.f11nameremoved, R.drawable.ic_action_link);
                    A043.setShowAsAction(2);
                    if (C107385bE.A04()) {
                        A043.setContentDescription(this.A01.getString(R.string.f11nameremoved));
                    }
                }
                if (A0F()) {
                    A0C(menu, R.string.f11nameremoved, 55);
                } else if (AnonymousClass000.A1Y(C104595Rp.A00(newsletterViewModel).A07, C372821q.SUBSCRIBED)) {
                    if (C104595Rp.A00(newsletterViewModel).A0L) {
                        i = R.string.f11nameremoved;
                        A042 = A04(menu, 54, R.string.f11nameremoved, R.drawable.ic_action_unmute);
                        i2 = R.layout.f8nameremoved;
                    } else {
                        i = R.string.f11nameremoved;
                        A042 = A04(menu, 53, R.string.f11nameremoved, R.drawable.ic_action_mute);
                        i2 = R.layout.f8nameremoved;
                    }
                    View A0F2 = C86644Kx.A0F(A042, i2);
                    if (A0F2 != null) {
                        C18300x5.A13(this.A01, A0F2, i);
                    }
                    A06(A042, i, true);
                    A042.setShowAsAction(2);
                }
                A04(menu, 58, R.string.f11nameremoved, R.drawable.vec_ic_info);
                if (C104595Rp.A00(newsletterViewModel).A0K() && !C104595Rp.A00(newsletterViewModel).A0M(this.A08)) {
                    A04(menu, 62, R.string.f11nameremoved, R.drawable.ic_settings_settings);
                }
                if (!A0F() && !C104595Rp.A00(newsletterViewModel).A0K()) {
                    A04(menu, 56, R.string.f11nameremoved, R.drawable.ic_exit_group);
                }
                A04(menu, 57, R.string.f11nameremoved, R.drawable.ic_share);
                if (!C104595Rp.A00(newsletterViewModel).A0K()) {
                    A04(menu, 9, R.string.f11nameremoved, R.drawable.ic_spam_report);
                }
            }
        }
    }

    public boolean BXQ(MenuItem menuItem) {
        int i;
        String str;
        int i2;
        if (menuItem == null) {
            return super.BXQ(menuItem);
        }
        switch (menuItem.getItemId()) {
            case 53:
                A0D(false);
                return true;
            case 54:
                A0E(false);
                return true;
            case 55:
                A08();
                return true;
            case 56:
            case 59:
                C009707r r4 = this.A01;
                C162457s7.A0C(r4);
                C19340zH A002 = AnonymousClass5V0.A00(r4);
                A002.A0g(C86614Ku.A0s(r4, C104595Rp.A00(this.A0A).A0H, new Object[1], R.string.f11nameremoved));
                A002.A0c(r4, new AnonymousClass5BX(2), R.string.f11nameremoved);
                A002.A0d(r4, AnonymousClass6C6.A00(this, 177), R.string.f11nameremoved);
                C18280x3.A0q(A002);
                return true;
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                Intent A092 = AnonymousClass0x9.A09("android.intent.action.SEND");
                NewsletterViewModel newsletterViewModel = this.A0A;
                boolean A1W = AnonymousClass000.A1W(C104595Rp.A00(newsletterViewModel).A0F);
                AnonymousClass1RL A003 = C104595Rp.A00(newsletterViewModel);
                if (A1W) {
                    str = A003.A0F;
                    i2 = R.string.f11nameremoved;
                } else {
                    str = A003.A0G;
                    i2 = R.string.f11nameremoved;
                }
                C009707r r6 = this.A01;
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = C104595Rp.A00(newsletterViewModel).A0H;
                String A0e = C18300x5.A0e(r6, str, A0M, 1, i2);
                A092.putExtra("android.intent.extra.TEXT", A0e);
                this.A09.A07(A07(), (AnonymousClass59F) null, 3, 3);
                C86624Kv.A0j(A092);
                r6.startActivity(Intent.createChooser(A092, A0e));
                return true;
            case 58:
                C009707r r62 = this.A01;
                Intent intent = r62.getIntent();
                if (intent != null) {
                    i = intent.getIntExtra("mat_entry_point", 0);
                } else {
                    i = 0;
                }
                Intent intent2 = r62.getIntent();
                int i3 = -1;
                if (intent2 != null) {
                    i3 = intent2.getIntExtra("extra_forwarded_message_thread_type", -1);
                }
                Intent A0b = C627736r.A0b(r62, C104595Rp.A00(this.A0A).A05(), i, i3, true);
                Bundle A004 = AnonymousClass5MG.A00(r62, C18290x4.A0N(r62, R.id.transition_start), this.A0A);
                C95804uY A072 = A07();
                AnonymousClass59F r2 = A0C;
                C86624Kv.A1O(A072, 1, r2);
                AnonymousClass5YD.A01(AnonymousClass000.A0P(r2, " InfoClicked, source: ", C18290x4.A0v(A072)));
                AnonymousClass5VI.A00(A0b, C18310x6.A0n(r62));
                AnonymousClass0RN.A00(r62, A0b, A004);
                return true;
            case 61:
                C009707r r63 = this.A01;
                C95804uY A0I = C104595Rp.A00(this.A0A).A0I();
                int i4 = AnonymousClass59F.NEWSLETTER_THREAD.value;
                Intent A073 = C18320x8.A07();
                A073.setClassName(r63.getPackageName(), "com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity");
                AnonymousClass0x2.A0u(A073, A0I, "jid");
                A073.putExtra("entry_point", i4);
                AnonymousClass5VI.A00(A073, C18310x6.A0n(r63));
                AnonymousClass0RN.A00(r63, A073, (Bundle) null);
                return true;
            case 62:
                C009707r r42 = this.A01;
                C95804uY A074 = A07();
                Intent A075 = C18320x8.A07();
                C86604Kt.A13(A075, A074, r42.getPackageName(), "com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity");
                r42.startActivity(A075);
                return true;
            default:
                super.BXQ(menuItem);
                return true;
        }
    }

    public void BLc(C95814uZ r1) {
    }

    public void BLg(C95814uZ r1) {
    }

    public void BLh(C95814uZ r1) {
    }

    public void BLf(C95814uZ r1, Collection collection, int i) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92284mO(X.C009707r r59, X.C116985rC r60, X.C116985rC r61, X.C116985rC r62, X.AnonymousClass5DR r63, X.AnonymousClass5M8 r64, X.AnonymousClass5M9 r65, X.C101365Em r66, X.AnonymousClass4FU r67, X.C69263Wi r68, X.C56972sr r69, X.C66663Mh r70, X.C621033m r71, X.AnonymousClass5MG r72, X.AnonymousClass5TW r73, X.C29301ib r74, X.C46342bT r75, X.C29421in r76, X.AnonymousClass67A r77, X.C113905mB r78, X.C620633i r79, X.C56612sH r80, X.AnonymousClass33p r81, X.C620733j r82, X.C28871hu r83, X.C56982ss r84, X.C66473Lo r85, X.AnonymousClass3ZH r86, X.C29041iB r87, X.AnonymousClass1VX r88, X.AnonymousClass3LP r89, X.C29241iV r90, X.C95814uZ r91, X.C50452iC r92, X.AnonymousClass5UP r93, X.AnonymousClass5YD r94, X.C103985Pe r95, X.AnonymousClass1R1 r96, X.C50282hv r97, X.AnonymousClass4FS r98) {
        /*
            r58 = this;
            r3 = 1
            r21 = r88
            r0 = r21
            X.C162457s7.A0J(r0, r3)
            r24 = r84
            r52 = r68
            r4 = r98
            r51 = r69
            r2 = r24
            r1 = r52
            r0 = r51
            X.C18260x0.A0e(r1, r0, r4, r2)
            r1 = 7
            r50 = r70
            r0 = r50
            X.C162457s7.A0J(r0, r1)
            r20 = r89
            r49 = r71
            r29 = r73
            r2 = r20
            r1 = r29
            r0 = r49
            X.C18260x0.A0X(r0, r2, r1)
            r1 = 11
            r25 = r82
            r0 = r25
            X.C162457s7.A0J(r0, r1)
            r27 = r78
            r6 = r96
            r30 = r74
            r31 = r75
            r32 = r76
            r5 = r31
            r2 = r32
            r1 = r27
            r0 = r30
            X.C18260x0.A0h(r5, r2, r1, r6, r0)
            r1 = 17
            r26 = r81
            r0 = r26
            X.C162457s7.A0J(r0, r1)
            r22 = r87
            r56 = r64
            r55 = r65
            r2 = r22
            r1 = r56
            r0 = r55
            X.C18290x4.A1N(r2, r1, r0)
            r23 = r85
            r16 = r90
            r2 = r97
            r1 = r23
            r0 = r16
            X.C86604Kt.A1T(r1, r2, r0)
            r1 = 25
            r54 = r66
            r0 = r54
            X.C162457s7.A0J(r0, r1)
            r0 = 27
            r14 = r63
            X.C162457s7.A0J(r14, r0)
            r0 = 28
            r8 = r92
            X.C162457s7.A0J(r8, r0)
            r0 = 29
            r12 = r80
            X.C162457s7.A0J(r12, r0)
            r0 = 30
            r11 = r83
            X.C162457s7.A0J(r11, r0)
            r0 = 31
            r5 = r94
            X.C162457s7.A0J(r5, r0)
            r0 = 32
            r13 = r79
            X.C162457s7.A0J(r13, r0)
            r0 = 33
            r1 = r95
            X.C162457s7.A0J(r1, r0)
            r0 = 34
            r7 = r93
            X.C162457s7.A0J(r7, r0)
            r0 = 35
            r9 = r91
            X.C162457s7.A0J(r9, r0)
            r0 = 36
            r10 = r86
            X.C162457s7.A0J(r10, r0)
            r15 = 37
            r57 = r59
            r0 = r57
            X.C162457s7.A0J(r0, r15)
            r15 = 38
            r53 = r67
            r0 = r53
            X.C162457s7.A0J(r0, r15)
            r15 = 40
            r0 = r77
            X.C162457s7.A0J(r0, r15)
            r15 = r58
            r17 = r60
            r18 = r61
            r19 = r62
            r28 = r72
            r33 = r0
            r34 = r27
            r35 = r26
            r36 = r25
            r37 = r24
            r38 = r23
            r39 = r10
            r40 = r22
            r41 = r21
            r42 = r20
            r43 = r16
            r44 = r9
            r45 = r8
            r46 = r6
            r47 = r2
            r48 = r4
            r16 = r57
            r20 = r56
            r21 = r55
            r22 = r54
            r23 = r53
            r24 = r52
            r25 = r51
            r26 = r50
            r27 = r49
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r15.A06 = r12
            r15.A07 = r11
            r15.A09 = r5
            r15.A05 = r13
            r15.A0B = r1
            r15.A08 = r7
            r15.A03 = r3
            X.07r r1 = r15.A01
            X.AnonymousClass0x9.A1L(r1)
            X.4ea r1 = (X.C89654ea) r1
            X.4uY r0 = r15.A07()
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = X.AnonymousClass5BS.A00(r14, r1, r0)
            r15.A0A = r0
            X.0Wx r0 = r0.A0G()
            java.lang.Object r0 = r0.A07()
            X.5Rp r0 = (X.C104595Rp) r0
            r2 = 0
            if (r0 == 0) goto L_0x014f
            X.1RL r1 = r0.A00
            boolean r0 = r0.A01
            X.5Rp r2 = new X.5Rp
            r2.<init>(r1, r0)
        L_0x014f:
            r15.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92284mO.<init>(X.07r, X.5rC, X.5rC, X.5rC, X.5DR, X.5M8, X.5M9, X.5Em, X.4FU, X.3Wi, X.2sr, X.3Mh, X.33m, X.5MG, X.5TW, X.1ib, X.2bT, X.1in, X.67A, X.5mB, X.33i, X.2sH, X.33p, X.33j, X.1hu, X.2ss, X.3Lo, X.3ZH, X.1iB, X.1VX, X.3LP, X.1iV, X.4uZ, X.2iC, X.5UP, X.5YD, X.5Pe, X.1R1, X.2hv, X.4FS):void");
    }
}
