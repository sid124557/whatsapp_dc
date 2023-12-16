package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0GC;
import X.AnonymousClass0RN;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass1R1;
import X.AnonymousClass1fY;
import X.AnonymousClass1nB;
import X.AnonymousClass2W5;
import X.AnonymousClass2z0;
import X.AnonymousClass30E;
import X.AnonymousClass33C;
import X.AnonymousClass33F;
import X.AnonymousClass358;
import X.AnonymousClass35Z;
import X.AnonymousClass3ZH;
import X.AnonymousClass4A1;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass51x;
import X.AnonymousClass54E;
import X.AnonymousClass55K;
import X.AnonymousClass5CR;
import X.AnonymousClass5LT;
import X.AnonymousClass5MG;
import X.AnonymousClass5PU;
import X.AnonymousClass5TZ;
import X.AnonymousClass5UP;
import X.AnonymousClass5Ul;
import X.AnonymousClass5YA;
import X.AnonymousClass5YB;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZU;
import X.AnonymousClass647;
import X.AnonymousClass64J;
import X.AnonymousClass65S;
import X.AnonymousClass67Y;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass6AV;
import X.C003203q;
import X.C04840Qw;
import X.C06130Wj;
import X.C08310eF;
import X.C103035Lf;
import X.C104745Se;
import X.C105285Uh;
import X.C105365Uq;
import X.C106995aW;
import X.C107395bF;
import X.C107565bW;
import X.C108845de;
import X.C109525el;
import X.C109755f8;
import X.C110065fd;
import X.C113905mB;
import X.C113995mK;
import X.C114015mM;
import X.C116705qj;
import X.C117635sF;
import X.C1226465e;
import X.C1227665q;
import X.C1227865s;
import X.C1228966g;
import X.C1230066r;
import X.C1233167y;
import X.C124166Bf;
import X.C135166kE;
import X.C135216kJ;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C18330xA;
import X.C183538qC;
import X.C29121iJ;
import X.C29161iN;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C29431io;
import X.C30471mV;
import X.C31971pB;
import X.C50222hp;
import X.C50252hs;
import X.C54232oO;
import X.C54602oz;
import X.C55152pt;
import X.C55702qm;
import X.C55832qz;
import X.C56602sG;
import X.C56612sH;
import X.C56972sr;
import X.C57052sz;
import X.C58152un;
import X.C58422vE;
import X.C620233e;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C627636p;
import X.C64773Ex;
import X.C66543Lv;
import X.C66663Mh;
import X.C70363aN;
import X.C85244Fm;
import X.C85334Fv;
import X.C85344Fw;
import X.C86604Kt;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C87044Mw;
import X.C88694ab;
import X.C89644eZ;
import X.C95814uZ;
import X.C985651j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StatusPlaybackContactFragment extends Hilt_StatusPlaybackContactFragment implements C1228966g, AnonymousClass4A1, AnonymousClass65S, C85334Fv, C85344Fw {
    public int A00 = 0;
    public int A01;
    public C85244Fm A02;
    public C56972sr A03;
    public AnonymousClass5Ul A04;
    public C66663Mh A05;
    public AnonymousClass64J A06;
    public C621033m A07;
    public WfalManager A08;
    public C1230066r A09;
    public C29301ib A0A;
    public C106995aW A0B;
    public C64773Ex A0C;
    public C29421in A0D;
    public AnonymousClass5ZU A0E;
    public C105365Uq A0F;
    public C114015mM A0G;
    public C113905mB A0H;
    public C56612sH A0I;
    public C66543Lv A0J;
    public C29431io A0K;
    public C55152pt A0L;
    public AnonymousClass2W5 A0M;
    public C620233e A0N;
    public AnonymousClass4FV A0O;
    public C54602oz A0P;
    public C29241iV A0Q;
    public UserJid A0R;
    public AnonymousClass5UP A0S;
    public NewsletterLinkLauncher A0T;
    public C624134x A0U;
    public C50222hp A0V;
    public AnonymousClass1R1 A0W;
    public C110065fd A0X;
    public AnonymousClass5PU A0Y;
    public AnonymousClass5TZ A0Z;
    public C50252hs A0a;
    public C113995mK A0b;
    public AnonymousClass55K A0c;
    public C103035Lf A0d;
    public C55832qz A0e;
    public AnonymousClass4FS A0f;
    public AnonymousClass30E A0g;
    public C29121iJ A0h;
    public AnonymousClass5YA A0i;
    public C29161iN A0j;
    public C104745Se A0k;
    public C183538qC A0l;
    public C183538qC A0m;
    public String A0n;
    public List A0o;
    public Map A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public final C04840Qw A0u = new AnonymousClass67Y(this);
    public final C54232oO A0v = new C1233167y(this, 16);
    public final C56602sG A0w = AnonymousClass681.A00(this, 43);
    public final AnonymousClass4FW A0x = new C124166Bf(this, 24);
    public final C55702qm A0y = new AnonymousClass687(this, 16);
    public final C1227665q A0z = new C116705qj(this);
    public final C1227865s A10 = new AnonymousClass6AV(this, 1);

    public void A0k(int i, int i2, Intent intent) {
        C108845de r6;
        if (i != 2) {
            super.A0k(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            List A0r2 = C86604Kt.A0r(intent);
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            String stringExtra = intent.getStringExtra("appended_message");
            if (AnonymousClass000.A1W(C627336j.A03(A0r2))) {
                C626936e.A06(intent);
                r6 = this.A0Z.A00(intent.getExtras());
            } else {
                r6 = null;
            }
            this.A07.A09(this.A04, r6, stringExtra, Collections.singletonList(this.A0U), A0r2, booleanExtra);
            if (A0r2.size() != 1 || (A0r2.get(0) instanceof C135166kE)) {
                ((C89644eZ) A0Q()).Bqv(A0r2);
            } else {
                C57052sz.A00(C86664Kz.A1B().A1O(A1D(), (C95814uZ) A0r2.get(0), 0), this);
            }
        }
    }

    public void A0w(Bundle bundle, View view) {
        View view2;
        int i;
        super.A0w(bundle, view);
        AnonymousClass5LT A0c2 = C86654Ky.A0c(this);
        if (this.A0R != AnonymousClass1fY.A00 || this.A0r) {
            view2 = A0c2.A03;
            i = 0;
        } else {
            view2 = A0c2.A03;
            i = 8;
        }
        view2.setVisibility(i);
        this.A0F = this.A0G.A06(A0G(), "status-playback-contact-fragment");
        A1U();
        AnonymousClass2z0 A032 = C107395bF.A03(A0H(), "");
        C620233e r4 = this.A0N;
        C104745Se r10 = this.A0k;
        C55832qz r9 = this.A0e;
        WfalManager wfalManager = this.A08;
        C55152pt r2 = this.A0L;
        AnonymousClass2W5 r3 = this.A0M;
        C183538qC r11 = this.A0l;
        C183538qC r12 = this.A0m;
        this.A0c = new AnonymousClass55K(wfalManager, r2, r3, r4, this.A0P, this.A0R, A032, this, r9, r10, r11, r12, this.A0s, this.A0t);
    }

    public C110065fd BD8(int i, int i2, boolean z) {
        ViewGroup viewGroup = C86654Ky.A0c(this).A07;
        ArrayList A0s2 = AnonymousClass001.A0s();
        C86654Ky.A0t(A0R(), A0s2, R.id.bottom_sheet);
        C110065fd r2 = new C110065fd(this, C88694ab.A00(viewGroup, i, i2), this.A01, A0s2, z);
        this.A0X = r2;
        r2.A05(new C117635sF(this, 11));
        return this.A0X;
    }

    public static StatusPlaybackContactFragment A00(UserJid userJid, boolean z) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = new StatusPlaybackContactFragment();
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, userJid, "jid");
        A082.putBoolean("unseen_only", z);
        statusPlaybackContactFragment.A0u(A082);
        return statusPlaybackContactFragment;
    }

    public void A0q(Bundle bundle) {
        C624134x r0 = this.A0U;
        if (r0 != null) {
            C107395bF.A07(bundle, r0.A1J);
        }
    }

    public final SpannableStringBuilder A1P(TextView textView, int i, boolean z) {
        Drawable A002;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context A1D = A1D();
        if (!(A1D == null || (A002 = AnonymousClass0RP.A00(A1D, i)) == null)) {
            spannableStringBuilder.append(' ');
            int color = C08310eF.A09(this).getColor(R.color.f5nameremoved);
            int lineHeight = textView.getLineHeight();
            A002.setBounds(0, 0, lineHeight, lineHeight);
            AnonymousClass001.A12(PorterDuff.Mode.SRC_ATOP, A002, color);
            A002.setAutoMirrored(z);
            C06130Wj.A03(textView.getLayoutDirection(), A002);
            spannableStringBuilder.setSpan(new C87044Mw(A002), 0, 1, 33);
        }
        return spannableStringBuilder;
    }

    public final C105285Uh A1Q() {
        List list;
        int i = this.A00;
        if (i < 0 || (list = this.A0o) == null || i >= list.size()) {
            return null;
        }
        return (C105285Uh) this.A0u.A04(C18320x8.A0R(this.A0o, this.A00).A1J);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.51x, X.5Uh] */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.51u] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.51v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C105285Uh A1R(X.C624134x r69) {
        /*
            r68 = this;
            r6 = r68
            X.5LT r5 = X.C86654Ky.A0c(r6)
            X.0Qw r4 = r6.A0u
            r7 = r69
            X.2z0 r3 = r7.A1J
            java.lang.Object r2 = r4.A04(r3)
            X.5Uh r2 = (X.C105285Uh) r2
            if (r2 != 0) goto L_0x0141
            X.5Lf r2 = r6.A0d
            X.5SJ r1 = new X.5SJ
            r1.<init>(r7, r6)
            X.5Uq r0 = r6.A0F
            r25 = r0
            boolean r8 = r3.A02
            X.2sH r0 = r2.A0I
            r40 = r0
            X.1VX r0 = r2.A0R
            if (r8 == 0) goto L_0x0142
            r39 = r0
            X.5Tg r0 = r2.A0g
            r56 = r0
            X.3Wi r0 = r2.A04
            r67 = r0
            X.2sr r0 = r2.A06
            r66 = r0
            X.5Ul r0 = r2.A07
            r65 = r0
            X.4FS r0 = r2.A0h
            r57 = r0
            X.33e r0 = r2.A0P
            r37 = r0
            X.33m r0 = r2.A08
            r19 = r0
            X.5hX r0 = r2.A03
            r64 = r0
            X.5mM r0 = r2.A0E
            r26 = r0
            X.1fd r0 = r2.A0U
            r42 = r0
            X.5Se r0 = r2.A0m
            r62 = r0
            X.36Y r0 = r2.A0Q
            r38 = r0
            X.3Ex r0 = r2.A0B
            r22 = r0
            X.2o2 r0 = r2.A0O
            r36 = r0
            X.5ZU r0 = r2.A0D
            r24 = r0
            X.33j r0 = r2.A0K
            r32 = r0
            X.2eP r0 = r2.A0W
            r44 = r0
            X.5nM r0 = r2.A0N
            r35 = r0
            X.5UP r0 = r2.A0X
            r45 = r0
            X.4Fm r0 = r2.A05
            r63 = r0
            X.1in r0 = r2.A0C
            r23 = r0
            X.3Lv r0 = r2.A0L
            r33 = r0
            X.2qz r0 = r2.A0f
            r55 = r0
            X.1io r0 = r2.A0M
            r34 = r0
            X.1R1 r0 = r2.A0a
            r49 = r0
            com.whatsapp.bridge.wfal.WfalManager r0 = r2.A09
            r20 = r0
            X.1ib r0 = r2.A0A
            r21 = r0
            X.33p r0 = r2.A0J
            r31 = r0
            X.5Ua r0 = r2.A0i
            r58 = r0
            X.5mK r0 = r2.A0c
            r51 = r0
            X.5X9 r0 = r2.A0d
            r52 = r0
            X.2re r0 = r2.A0V
            r43 = r0
            X.5YA r0 = r2.A0l
            r61 = r0
            X.2aN r0 = r2.A0j
            r59 = r0
            X.1iV r0 = r2.A0T
            r41 = r0
            X.5Lc r0 = r2.A0e
            r18 = r0
            X.2q4 r0 = r2.A0G
            r17 = r0
            X.5H2 r0 = r2.A0k
            r16 = r0
            X.33i r14 = r2.A0H
            X.5U1 r13 = r2.A0S
            X.2hp r12 = r2.A0Y
            X.2Yl r11 = r2.A0Z
            X.5Il r10 = r2.A0b
            X.5rC r9 = r2.A02
            X.5rC r8 = r2.A01
            X.5Yq r0 = r2.A0F
            X.5rC r15 = r2.A00
            X.51v r2 = new X.51v
            r27 = r0
            r28 = r17
            r29 = r14
            r30 = r40
            r40 = r13
            r46 = r7
            r47 = r12
            r48 = r11
            r50 = r10
            r53 = r18
            r54 = r1
            r60 = r16
            r10 = r2
            r11 = r9
            r12 = r8
            r13 = r15
            r14 = r63
            r15 = r64
            r16 = r67
            r17 = r66
            r18 = r65
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
        L_0x0100:
            android.view.ViewGroup r8 = r5.A07
            int r1 = r6.A04
            r0 = 7
            boolean r7 = X.C18280x3.A1U(r1, r0)
            android.graphics.Rect r5 = r6.A01
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x013e
            r0 = 1
            r2.A01 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "playbackPage/onCreate page="
            X.C86604Kt.A1W(r1, r0, r2)
            X.5SJ r0 = r2.A0T
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r0.A01
            X.C18260x0.A0o(r0, r1)
            android.view.LayoutInflater r0 = X.C18280x3.A0D(r8)
            android.view.View r0 = r2.A07(r0, r8)
            r2.A00 = r0
            r2.A0K(r0)
            r2.A0E()
            r2.A06(r5)
            if (r7 == 0) goto L_0x013e
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x013e
            r2.A03()
        L_0x013e:
            r4.A08(r3, r2)
        L_0x0141:
            return r2
        L_0x0142:
            r34 = r0
            X.5Tg r0 = r2.A0g
            r47 = r0
            X.3Wi r0 = r2.A04
            r19 = r0
            X.5Ul r0 = r2.A07
            r20 = r0
            X.4FS r0 = r2.A0h
            r48 = r0
            X.33e r0 = r2.A0P
            r32 = r0
            X.33m r0 = r2.A08
            r21 = r0
            X.5hX r0 = r2.A03
            r18 = r0
            X.1fd r0 = r2.A0U
            r35 = r0
            X.36Y r0 = r2.A0Q
            r33 = r0
            X.3Ex r0 = r2.A0B
            r22 = r0
            X.2o2 r0 = r2.A0O
            r31 = r0
            X.5ZU r0 = r2.A0D
            r23 = r0
            X.33j r0 = r2.A0K
            r27 = r0
            X.2eP r0 = r2.A0W
            r37 = r0
            X.5nM r0 = r2.A0N
            r30 = r0
            X.4Fm r0 = r2.A05
            r17 = r0
            X.3Lv r0 = r2.A0L
            r28 = r0
            X.2qz r0 = r2.A0f
            r46 = r0
            X.1io r0 = r2.A0M
            r29 = r0
            X.1R1 r15 = r2.A0a
            X.5Ua r14 = r2.A0i
            X.5mK r13 = r2.A0c
            X.5X9 r12 = r2.A0d
            X.2re r11 = r2.A0V
            X.5Lc r10 = r2.A0e
            X.33i r9 = r2.A0H
            X.2hp r8 = r2.A0Y
            X.2Yl r0 = r2.A0Z
            X.51u r2 = new X.51u
            r16 = r2
            r24 = r25
            r25 = r9
            r26 = r40
            r36 = r11
            r38 = r7
            r39 = r8
            r40 = r0
            r41 = r15
            r42 = r13
            r43 = r12
            r44 = r10
            r45 = r1
            r49 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1R(X.34x):X.5Uh");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r4.A0O.A00(X.AnonymousClass223.INSTAGRAM, r4.A06) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1T() {
        /*
            r5 = this;
            int r1 = r5.A00
            if (r1 < 0) goto L_0x001d
            java.util.List r0 = r5.A0o
            if (r0 == 0) goto L_0x001d
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x001d
            java.util.List r1 = r5.A0o
            int r0 = r5.A00
            X.34x r0 = X.C18320x8.A0R(r1, r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "playbackFragment/refreshCurrentPageSubTitle message is empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001d:
            return
        L_0x001e:
            r5.A1Y(r0)
            X.5Uh r4 = r5.A1R(r0)
            boolean r0 = r4 instanceof X.AnonymousClass51v
            if (r0 == 0) goto L_0x001d
            X.51v r4 = (X.AnonymousClass51v) r4
            X.51t r0 = r4.A0Q()
            X.5TV r1 = r0.A08
            if (r1 == 0) goto L_0x003a
            java.lang.Boolean r0 = r4.A0R()
            r1.A01(r0)
        L_0x003a:
            X.51t r0 = r4.A0Q()
            X.5TV r3 = r0.A08
            if (r3 == 0) goto L_0x005f
            com.whatsapp.bridge.wfal.WfalManager r0 = r4.A07
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0057
            X.2aN r2 = r4.A0O
            X.34x r1 = r4.A06
            X.223 r0 = X.AnonymousClass223.INSTAGRAM
            boolean r1 = r2.A00(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02(r0)
        L_0x005f:
            r4.A0S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1T():void");
    }

    public final void A1W(int i) {
        List list;
        int i2;
        AnonymousClass33F r7;
        if (this.A00 != i && (list = this.A0o) != null) {
            if (list.isEmpty()) {
                C18260x0.A1S(AnonymousClass001.A0o(), "playbackFragment/setPageActive no-messages ", this);
                return;
            }
            this.A00 = i;
            AnonymousClass5LT A0c2 = C86654Ky.A0c(this);
            StatusPlaybackProgressView statusPlaybackProgressView = A0c2.A0F;
            statusPlaybackProgressView.setPosition(i);
            statusPlaybackProgressView.setProgressProvider((AnonymousClass647) null);
            C624134x A0R2 = C18320x8.A0R(this.A0o, i);
            if ((A0R2.A0n() instanceof C135216kJ) && (r7 = (AnonymousClass33F) this.A0p.get(Long.valueOf(A0R2.A1L))) != null) {
                C113995mK r4 = this.A0b;
                String str = A0R2.A1J.A01;
                C162457s7.A0J(str, 0);
                r4.A0H.put(str, false);
                String str2 = r7.A03;
                String str3 = r7.A02;
                if (str2 == null || str3 == null) {
                    A0c2.A08.setVisibility(8);
                } else {
                    Button button = A0c2.A00;
                    if (button == null) {
                        button = (Button) A0c2.A08.inflate();
                        A0c2.A00 = button;
                    }
                    button.setText(r7.A02);
                    button.setOnClickListener(new C109755f8(this, A0R2, str2, 1));
                    button.setVisibility(0);
                }
                this.A0n = r7.A04;
            }
            C105285Uh A1R = A1R(A0R2);
            View view = A0c2.A05;
            if (((AnonymousClass51x) A1R).A08() instanceof C985651j) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            view.setVisibility(C86634Kw.A01(i2));
            View view2 = A1R.A00;
            ViewGroup viewGroup = A0c2.A07;
            if (viewGroup.getChildCount() == 0 || viewGroup.getChildAt(0) != view2) {
                viewGroup.removeAllViews();
                viewGroup.addView(view2);
            }
            Iterator A0v2 = AnonymousClass001.A0v(this.A0u.A06());
            while (A0v2.hasNext()) {
                C105285Uh r1 = (C105285Uh) A0v2.next();
                if (!(r1 == A1R || r1 == null || !r1.A04)) {
                    r1.A05();
                }
            }
            A1Y(A0R2);
            if (!A1R.A04) {
                A1R.A04();
            }
            if (i < AnonymousClass002.A03(this.A0o)) {
                A1R(C18320x8.A0R(this.A0o, i + 1));
            }
            if (i > 0) {
                A1R(C18320x8.A0R(this.A0o, i - 1));
            }
            this.A0H.A05(this.A0R, 9);
        }
    }

    public final void A1Z(C105285Uh r4, int i, int i2) {
        Iterator A0v2 = AnonymousClass001.A0v(this.A0u.A06());
        while (A0v2.hasNext()) {
            C105285Uh r1 = (C105285Uh) A0v2.next();
            if (!(r1 == r4 || r1 == null || !r1.A05)) {
                AnonymousClass51x r12 = (AnonymousClass51x) r1;
                r12.A05 = false;
                r12.A0I(i);
            }
        }
        if (r4 != null && !r4.A05) {
            AnonymousClass51x r42 = (AnonymousClass51x) r4;
            r42.A05 = true;
            r42.A0J(i2, r42.A07);
        }
    }

    public final boolean A1a(int i, int i2) {
        List list = this.A0o;
        if (list == null) {
            return false;
        }
        if (this.A00 < list.size() - 1) {
            A1W(this.A00 + 1);
            A1Z(A1Q(), i, i2);
            return true;
        }
        C1226465e r1 = (C1226465e) A0Q();
        if (r1 != null) {
            return r1.BUq(C18300x5.A0i(this.A0R), i, i2, true);
        }
        return false;
    }

    public AnonymousClass0GC B6S() {
        return this.A0L.A02;
    }

    public String B8C() {
        return "status_playback_fragment";
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A01;
    }

    public void BR7(DialogFragment dialogFragment, boolean z) {
        this.A0q = z;
        A1I();
    }

    public String toString() {
        UserJid userJid = this.A0R;
        if (userJid != null) {
            return userJid.toString();
        }
        String string = A0H().getString("jid");
        C626936e.A06(string);
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a() {
        /*
            r2 = this;
            super.A0a()
            X.1in r1 = r2.A0D
            X.2sG r0 = r2.A0w
            r1.A07(r0)
            X.1io r1 = r2.A0K
            X.4FW r0 = r2.A0x
            r1.A07(r0)
            X.1ib r1 = r2.A0A
            X.2oO r0 = r2.A0v
            r1.A07(r0)
            X.1iV r1 = r2.A0Q
            X.2qm r0 = r2.A0y
            r1.A07(r0)
            X.5PU r0 = r2.A0Y
            r0.A01(r2)
            com.whatsapp.bridge.wfal.WfalManager r0 = r2.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0040
            X.1iJ r1 = r2.A0h
            X.65q r0 = r2.A0z
        L_0x0030:
            r1.A07(r0)
        L_0x0033:
            X.55K r0 = r2.A0c
            X.C18290x4.A1L(r0)
            X.5Uq r0 = r2.A0F
            if (r0 == 0) goto L_0x003f
            r0.A00()
        L_0x003f:
            return
        L_0x0040:
            X.5Se r0 = r2.A0k
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0033
            X.1iN r1 = r2.A0j
            X.65s r0 = r2.A10
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0a():void");
    }

    public void A0c() {
        super.A0c();
        this.A0u.A07(-1);
    }

    public void A0e() {
        super.A0e();
        Iterator A0v2 = AnonymousClass001.A0v(this.A0u.A06());
        while (A0v2.hasNext()) {
            C105285Uh r1 = (C105285Uh) A0v2.next();
            if (r1 != null && r1.A03) {
                r1.A02();
            }
        }
    }

    public void A0f() {
        super.A0f();
        Iterator A0v2 = AnonymousClass001.A0v(this.A0u.A06());
        while (A0v2.hasNext()) {
            C105285Uh r1 = (C105285Uh) A0v2.next();
            if (r1 != null && !r1.A03) {
                r1.A03();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(android.os.Bundle r5) {
        /*
            r4 = this;
            super.A0o(r5)
            X.1in r1 = r4.A0D
            X.2sG r0 = r4.A0w
            r1.A06(r0)
            X.1io r1 = r4.A0K
            X.4FW r0 = r4.A0x
            r1.A06(r0)
            X.1ib r1 = r4.A0A
            X.2oO r0 = r4.A0v
            r1.A06(r0)
            X.1iV r1 = r4.A0Q
            X.2qm r0 = r4.A0y
            r1.A06(r0)
            X.5PU r0 = r4.A0Y
            r0.A00(r4)
            com.whatsapp.bridge.wfal.WfalManager r0 = r4.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0054
            X.1iJ r1 = r4.A0h
            X.65q r0 = r4.A0z
        L_0x0030:
            r1.A06(r0)
        L_0x0033:
            X.4FS r1 = r4.A0f
            X.55K r0 = r4.A0c
            r3 = 0
            X.AnonymousClass0x7.A1B(r0, r1)
            com.whatsapp.jid.UserJid r1 = r4.A0R
            X.1fY r0 = X.AnonymousClass1fY.A00
            if (r1 == r0) goto L_0x0053
            X.3Ex r0 = r4.A0C
            X.3ZH r2 = r0.A0A(r1)
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x0053
            r2.A15 = r3
            X.4FS r1 = r4.A0f
            r0 = 7
            X.C86634Kw.A1Q(r1, r4, r2, r0)
        L_0x0053:
            return
        L_0x0054:
            X.5Se r0 = r4.A0k
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0033
            X.1iN r1 = r4.A0j
            X.65s r0 = r4.A10
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0o(android.os.Bundle):void");
    }

    public void A0p(Bundle bundle) {
        AnonymousClass2z0 A032;
        super.A0p(bundle);
        this.A0t = this.A03.A0Y(C58422vE.A01, 1875);
        this.A0R = C627336j.A05(A0H().getString("jid"));
        this.A0r = C18300x5.A1S(this.A0S);
        this.A0s = this.A06.getBoolean("unseen_only");
        if (bundle != null && (A032 = C107395bF.A03(bundle, "")) != null) {
            this.A0U = this.A0e.A05(A032);
        }
    }

    public void A1J() {
        super.A1J();
        if (this.A0o != null) {
            int i = this.A00;
            this.A00 = -1;
            if (i == -1) {
                i = 0;
            }
            A1W(i);
        }
    }

    public void A1K() {
        super.A1K();
        C105285Uh A1Q = A1Q();
        if (A1Q != null && A1Q.A04) {
            A1Q.A05();
        }
    }

    public void A1O(boolean z) {
        super.A1O(z);
        C105285Uh A1Q = A1Q();
        if (A1Q != null) {
            ((AnonymousClass51x) A1Q).A08().A09(z);
        }
    }

    public final CharSequence A1S(C624134x r13, long j) {
        long currentTimeMillis;
        Object[] objArr;
        int i;
        if (r13.A0z() == null || !this.A03.A0X(6444)) {
            return C107565bW.A00(this.A0I, this.A02, j);
        }
        int i2 = (r13.A0J > 0 ? 1 : (r13.A0J == 0 ? 0 : -1));
        C56612sH r0 = this.A0I;
        if (i2 > 0) {
            currentTimeMillis = r0.A0H();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        C620733j r6 = this.A02;
        long j2 = currentTimeMillis - j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j2);
        if (days > 0) {
            objArr = new Object[1];
            AnonymousClass000.A1Q(objArr, 0, days);
            i = 276;
        } else {
            long millis = j2 - TimeUnit.DAYS.toMillis(days);
            days = timeUnit.toHours(millis);
            if (days > 0) {
                objArr = new Object[1];
                AnonymousClass000.A1Q(objArr, 0, days);
                i = 280;
            } else {
                long millis2 = millis - TimeUnit.HOURS.toMillis(days);
                days = timeUnit.toMinutes(millis2);
                if (days > 0) {
                    objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, days);
                    i = 285;
                } else {
                    long seconds = timeUnit.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(days));
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1Q(objArr2, 0, seconds);
                    return r6.A0K(objArr2, 291, seconds);
                }
            }
        }
        return r6.A0K(objArr, i, days);
    }

    public final void A1U() {
        AnonymousClass5LT A0c2 = C86654Ky.A0c(this);
        C64773Ex r1 = this.A0C;
        C95814uZ r0 = this.A0R;
        AnonymousClass1fY r5 = AnonymousClass1fY.A00;
        if (r0 == r5) {
            r0 = C56972sr.A05(this.A03);
        }
        AnonymousClass3ZH A0A2 = r1.A0A(r0);
        C105365Uq r12 = this.A0F;
        if (r12 != null) {
            r12.A08(A0c2.A0B, A0A2);
        }
        AnonymousClass5YB A002 = AnonymousClass5YB.A00(A0c2.A09, this.A06, R.id.name);
        if (this.A0R == r5) {
            TextEmojiLabel textEmojiLabel = A002.A02;
            textEmojiLabel.setText(R.string.f11nameremoved);
            textEmojiLabel.A0E();
        } else {
            A002.A0B((List) null, this.A0E.A0L(A0A2));
            A002.A06(this.A0R instanceof C135216kJ ? 1 : 0);
        }
        UserJid userJid = this.A0R;
        if (!(userJid instanceof PhoneUserJid) || userJid == r5) {
            A0c2.A0B.setClickable(false);
            A0c2.A04.setClickable(false);
            return;
        }
        A0c2.A0B.setOnClickListener(new C109525el(this, A0c2, A0A2, 10));
        A0c2.A04.setOnClickListener(new C109525el(this, A0c2, A0A2, 11));
    }

    public final void A1V() {
        AnonymousClass33C r1;
        StatusPlaybackProgressView statusPlaybackProgressView = C86654Ky.A0c(this).A0F;
        statusPlaybackProgressView.setCount(this.A0o.size());
        Set set = statusPlaybackProgressView.A08;
        set.clear();
        if (this.A0R == AnonymousClass1fY.A00) {
            Iterator it = this.A0o.iterator();
            int i = 0;
            while (it.hasNext()) {
                C624134x A0T2 = C18300x5.A0T(it);
                if ((A0T2 instanceof C30471mV) && (r1 = ((C30471mV) A0T2).A01) != null && !r1.A0R && !r1.A0c && (!(A0T2 instanceof C31971pB) || !AnonymousClass35Z.A04((AnonymousClass1nB) A0T2))) {
                    C86654Ky.A1R(set, i);
                }
                i++;
            }
        }
    }

    public final void A1X(AnonymousClass3ZH r5, AnonymousClass5LT r6) {
        C003203q A0R2 = A0R();
        AnonymousClass0RN.A00(A0R2, C86664Kz.A1B().A1M(A0R2, r5, C18290x4.A0c()), AnonymousClass5MG.A00(A0R2, r6.A0B, new AnonymousClass5MG(A0R2)));
    }

    public final void A1Y(C624134x r12) {
        SpannableStringBuilder A002;
        View view;
        View findViewById;
        int i;
        AnonymousClass33C r1;
        Context A1D;
        int lineHeight;
        int color;
        int i2;
        AnonymousClass5LT A0c2 = C86654Ky.A0c(this);
        TextView textView = A0c2.A0D;
        TextView textView2 = A0c2.A0C;
        textView2.setVisibility(8);
        if (!(this.A0R instanceof C135216kJ)) {
            textView.setVisibility(0);
            if (!r12.A1J.A02) {
                A002 = C18330xA.A00(A1S(r12, this.A0I.A0I(r12.A0K)));
            } else if (AnonymousClass001.A1U(AnonymousClass358.A00(r12.A0D, 4))) {
                long j = r12.A0J;
                if (j <= 0) {
                    j = r12.A0K;
                }
                A002 = C18330xA.A00(A1S(r12, j));
                if (this.A0k.A02()) {
                    if (this.A0i.A09(r12)) {
                        A1D = A1D();
                        lineHeight = textView.getLineHeight();
                        color = C08310eF.A09(this).getColor(R.color.f5nameremoved);
                        C162457s7.A0J(A1D, 0);
                        i2 = R.drawable.ic_settings_fb;
                    } else if (this.A0i.A08(r12)) {
                        A1D = A1D();
                        lineHeight = textView.getLineHeight();
                        color = C08310eF.A09(this).getColor(R.color.f5nameremoved);
                        C162457s7.A0J(A1D, 0);
                        i2 = R.drawable.ic_settings_fb_hollow;
                    }
                    A002.append(AnonymousClass5CR.A00(A1D, lineHeight, i2, color));
                }
                if (this.A08.A02()) {
                    A002.append(this.A0g.A01(A0G(), r12, textView.getLineHeight(), C08310eF.A09(this).getColor(R.color.f5nameremoved)));
                }
            } else {
                if (!(r12 instanceof C30471mV) || (r1 = ((C30471mV) r12).A01) == null || r1.A0R || r1.A0c) {
                    boolean A0l2 = C627636p.A0l(r12);
                    i = R.string.f11nameremoved;
                    if (A0l2) {
                        i = R.string.f11nameremoved;
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
                textView.setText(i);
                return;
            }
            if (r12.A0z() != null && this.A03.A0X(6444)) {
                A002.append(' ').append("•").append(' ');
                SpannableStringBuilder A003 = C18330xA.A00(A1P(textView2, R.drawable.vec_ic_newsletter_filled, false));
                A003.append(' ');
                String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
                A003.append(string).setSpan(new StyleSpan(1), A003.length() - string.length(), A003.length(), 18);
                A003.append(A1P(textView2, R.drawable.vec_ic_chevron_right, true));
                textView2.setText(A003);
                AnonymousClass54E.A00(textView2, r12, this, 28);
                C105285Uh A1Q = A1Q();
                if (!(A1Q == null || (view = A1Q.A00) == null || (findViewById = view.findViewById(R.id.click_handler)) == null)) {
                    findViewById.post(new C70363aN(this, textView2, findViewById, 12));
                }
                textView2.setVisibility(0);
            }
            textView.setText(A002);
            return;
        }
        textView.setVisibility(8);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C105285Uh A1Q = A1Q();
        if (A1Q != null) {
            A1Q.A00();
        }
    }
}
