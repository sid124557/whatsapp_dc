package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09N;
import X.AnonymousClass0RP;
import X.AnonymousClass0UY;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass3S8;
import X.AnonymousClass3ZH;
import X.AnonymousClass490;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4OR;
import X.AnonymousClass4SG;
import X.AnonymousClass4W4;
import X.AnonymousClass5RC;
import X.AnonymousClass5RU;
import X.AnonymousClass5U4;
import X.AnonymousClass5UX;
import X.AnonymousClass5UY;
import X.AnonymousClass5YW;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZU;
import X.AnonymousClass65I;
import X.AnonymousClass65L;
import X.AnonymousClass666;
import X.AnonymousClass681;
import X.AnonymousClass68W;
import X.AnonymousClass69N;
import X.AnonymousClass9U4;
import X.C103045Lg;
import X.C104985Tc;
import X.C105045Tj;
import X.C105135Ts;
import X.C105365Uq;
import X.C106035Xj;
import X.C107115ai;
import X.C107465bM;
import X.C113895mA;
import X.C114015mM;
import X.C116985rC;
import X.C153087ae;
import X.C162457s7;
import X.C182358oH;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C187958y5;
import X.C1907099n;
import X.C23911Vj;
import X.C23951Vn;
import X.C24131Wf;
import X.C24151Wh;
import X.C24401Xg;
import X.C29421in;
import X.C47102ci;
import X.C48852fa;
import X.C49762h3;
import X.C52902mE;
import X.C54042o5;
import X.C54482on;
import X.C54982pb;
import X.C55522qU;
import X.C56602sG;
import X.C56972sr;
import X.C57012sv;
import X.C58152un;
import X.C58422vE;
import X.C613330g;
import X.C620733j;
import X.C627736r;
import X.C634039c;
import X.C64333Db;
import X.C64773Ex;
import X.C69263Wi;
import X.C71263bp;
import X.C71283br;
import X.C71453c8;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import X.C94304qv;
import X.C94314qw;
import X.C95814uZ;
import X.C97024xV;
import X.C989653x;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.List;

public class Settings extends C89644eZ implements AnonymousClass666, AnonymousClass490, AnonymousClass65I, AnonymousClass65L {
    public int A00;
    public long A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public RecyclerView A06;
    public C116985rC A07;
    public C116985rC A08;
    public C116985rC A09;
    public C116985rC A0A;
    public C116985rC A0B;
    public C116985rC A0C;
    public C116985rC A0D;
    public C57012sv A0E;
    public C54042o5 A0F;
    public C48852fa A0G;
    public TextEmojiLabel A0H;
    public TextEmojiLabel A0I;
    public TextEmojiLabel A0J;
    public WaImageView A0K;
    public C103045Lg A0L;
    public C97024xV A0M;
    public C105135Ts A0N;
    public AnonymousClass5UX A0O;
    public C64773Ex A0P;
    public C29421in A0Q;
    public AnonymousClass5ZU A0R;
    public C105365Uq A0S;
    public C105365Uq A0T;
    public C114015mM A0U;
    public C613330g A0V;
    public C49762h3 A0W;
    public C47102ci A0X;
    public AnonymousClass5RC A0Y;
    public C113895mA A0Z;
    public C104985Tc A0a;
    public C105045Tj A0b;
    public AnonymousClass3ZH A0c;
    public C54982pb A0d;
    public C52902mE A0e;
    public AnonymousClass4FV A0f;
    public C153087ae A0g;
    public C1907099n A0h;
    public AnonymousClass9U4 A0i;
    public C55522qU A0j;
    public SettingsRowIconText A0k;
    public C54482on A0l;
    public AnonymousClass5U4 A0m;
    public AnonymousClass5RU A0n;
    public AnonymousClass4W4 A0o;
    public AnonymousClass30V A0p;
    public C187958y5 A0q;
    public AnonymousClass5UY A0r;
    public AnonymousClass5UY A0s;
    public WDSSearchBar A0t;
    public C183538qC A0u;
    public C183538qC A0v;
    public C183538qC A0w;
    public C183538qC A0x;
    public C183538qC A0y;
    public C183538qC A0z;
    public C183538qC A10;
    public C183538qC A11;
    public String A12;
    public String A13;
    public List A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public final C56602sG A1B;
    public final C182358oH A1C;

    public final void A78() {
        if (this.A18 && this.A16 && this.A0s != null) {
            Log.i("Settings/updatePushName");
            TextEmojiLabel A0z2 = C86664Kz.A0z(this, R.id.me_tab_profile_info_name_second_line);
            this.A0J = A0z2;
            C105135Ts r2 = this.A0N;
            TextEmojiLabel textEmojiLabel = this.A0I;
            AnonymousClass5UY r4 = this.A0s;
            int A052 = C18300x5.A05(textEmojiLabel, A0z2, 1);
            C162457s7.A0J(r4, 3);
            textEmojiLabel.post(new C71453c8(textEmojiLabel, r2, A0z2, r4, this, A052));
        }
    }

    public void finish() {
        if (C86604Kt.A1Y(this.A0t.A07)) {
            this.A0t.A02(true);
            A74();
            return;
        }
        super.finish();
    }

    public void A5r() {
        if (!this.A15) {
            this.A15 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A0F = (C54042o5) r1.ANE.get();
            this.A0E = C86614Ku.A0J(r1);
            C88744aj r2 = C88744aj.A00;
            this.A0A = r2;
            this.A09 = r2;
            this.A0f = C86604Kt.A0Z(r1);
            this.A0G = (C48852fa) r1.A00.ABc.get();
            this.A0d = (C54982pb) r1.AN9.get();
            this.A08 = r2;
            this.A0U = C86604Kt.A0S(r1);
            this.A07 = C86634Kw.A0S(r1);
            this.A0O = C86614Ku.A0Q(r1);
            this.A0P = C86604Kt.A0P(r1);
            this.A0b = r1.A00.AKk();
            this.A0m = (AnonymousClass5U4) r1.A00.AAo.get();
            this.A0q = C86614Ku.A0n(r1);
            this.A0R = C86604Kt.A0R(r1);
            this.A0i = C86614Ku.A0f(r1);
            this.A0Q = C86604Kt.A0Q(r1);
            this.A0W = (C49762h3) r1.A00.A6f.get();
            this.A11 = C72343dZ.A00(r1.A00.ACE);
            this.A10 = C72343dZ.A00(r1.AbR);
            this.A0l = (C54482on) r1.A00.A7A.get();
            this.A0j = (C55522qU) r1.A00.A8I.get();
            this.A0n = A2X.AD7();
            this.A0u = C72343dZ.A00(r1.A0Q);
            this.A0h = C86614Ku.A0e(r1);
            this.A0g = (C153087ae) r1.AQ7.get();
            this.A0N = (C105135Ts) A2X.A01.get();
            this.A0C = r2;
            this.A0y = C72343dZ.A00(r1.A00.A9G);
            this.A0Y = (AnonymousClass5RC) r1.A00.A7S.get();
            this.A0X = (C47102ci) r1.A00.A2Z.get();
            this.A0V = C86634Kw.A0a(r1);
            this.A0Z = C86604Kt.A0U(r1);
            this.A0p = C86604Kt.A0f(r1);
            this.A0a = (C104985Tc) A2X.A0R.get();
            this.A0x = C72343dZ.A00(r1.A00.A8T);
            this.A0M = (C97024xV) r1.A00.A6B.get();
            this.A0z = C72343dZ.A00(r1.A00.AAW);
            this.A0B = r2;
            this.A0D = r2;
            this.A0v = C72343dZ.A00(r1.A5k);
            this.A0w = C72343dZ.A00(r1.AG8);
        }
    }

    public void A66() {
        this.A0p.A03((C95814uZ) null, 22);
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public final void A74() {
        this.A0o.A0L((List) null);
        this.A06.setVisibility(8);
        this.A05.setVisibility(0);
    }

    public final void A75() {
        C52902mE r4;
        this.A0H.setVisibility(8);
        if (this.A18) {
            View findViewById = findViewById(R.id.me_tab_add_text_status_button);
            this.A03 = findViewById;
            r4 = new C94304qv(this.A05, this.A0C, this.A04, AnonymousClass0x9.A14(findViewById));
        } else {
            View A002 = AnonymousClass5UY.A00(AnonymousClass1Ha.A1p(this, R.id.text_status), 0);
            this.A03 = A002;
            r4 = new C94314qw(this.A05, this.A0C, this.A04, AnonymousClass0x9.A14(A002));
        }
        this.A0e = r4;
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
            C989653x.A00(this.A03, this, 36);
        }
    }

    public final void A76() {
        this.A0f.BhD(new C23911Vj());
        this.A0f.BhD(new C23951Vn());
        LanguageSelectorBottomSheet languageSelectorBottomSheet = new LanguageSelectorBottomSheet();
        languageSelectorBottomSheet.A06 = this;
        languageSelectorBottomSheet.A07 = this;
        languageSelectorBottomSheet.A05 = new C107115ai(languageSelectorBottomSheet, 1, this);
        Boo(languageSelectorBottomSheet);
    }

    public final void A77() {
        AnonymousClass3ZH r2 = this.A0c;
        if (r2 != null) {
            this.A0S.A08(this.A04, r2);
        } else {
            this.A0O.A05(this.A04, -1.0f, R.drawable.avatar_contact, this.A00);
        }
    }

    public final void A79() {
        if (!C86604Kt.A1Y(this.A0t.A07) || this.A12.isEmpty()) {
            A74();
            return;
        }
        this.A05.setVisibility(8);
        this.A0o.A0L(this.A14);
        this.A06.setVisibility(0);
        this.A06.post(new C71283br(this, 41));
    }

    public final void A7C(Integer num, Integer num2) {
        if (!this.A18 || AnonymousClass4SG.A4E(this)) {
            C24401Xg r1 = new C24401Xg();
            r1.A01 = num;
            if (num2 != null) {
                r1.A00 = num2;
            }
            this.A0f.BhA(r1);
        }
    }

    public final void A7D(String str) {
        Integer num;
        int A002;
        boolean equals = str.equals(this.A13);
        if (equals) {
            A002 = 1;
        } else if (AnonymousClass4SG.A4E(this)) {
            A002 = AnonymousClass0x9.A00(this.A18 ? 1 : 0);
        } else {
            num = null;
            if (this.A13 != null || equals) {
                A7C(Integer.valueOf(this.A0n.A00(str)), num);
            }
            return;
        }
        num = Integer.valueOf(A002);
        if (this.A13 != null) {
        }
        A7C(Integer.valueOf(this.A0n.A00(str)), num);
    }

    public AnonymousClass4OR B4A() {
        C620733j r3 = this.A00;
        return new AnonymousClass4OR(this, r3, AnonymousClass5YW.A01(this.A01, this.A08, r3), AnonymousClass5YW.A02());
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BV0() {
        if (this.A01 > 0) {
            C24131Wf r6 = new C24131Wf();
            r6.A00 = C18310x6.A0f(System.currentTimeMillis(), this.A01);
            this.A0f.BhD(r6);
            this.A01 = 0;
        }
    }

    public void BV1() {
        if (this.A1A) {
            this.A1A = false;
            finish();
            startActivity(getIntent());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200 && i2 == -1) {
            this.A07.A04();
            throw AnonymousClass001.A0g("getSubscriptionManagementIntent");
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x06f0, code lost:
        if (r3.A0h.A0H() != false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02a3, code lost:
        if (r1.A02.A0X(1697) != false) goto L_0x02a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x067b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            boolean r0 = X.C107275b2.A00
            r3 = r20
            if (r0 == 0) goto L_0x000f
            android.view.Window r1 = r3.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000f:
            r0 = r21
            super.onCreate(r0)
            X.1VX r0 = r3.A0D
            boolean r0 = X.C86634Kw.A1b(r0)
            r3.A18 = r0
            X.8qC r0 = r3.A0u
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            boolean r0 = r0.A07()
            r3.A16 = r0
            X.1VX r0 = r3.A0D
            boolean r0 = X.C106545Zk.A01(r0)
            r3.A19 = r0
            boolean r0 = r3.A18
            r1 = 2131896309(0x7f1227f5, float:1.9427476E38)
            if (r0 == 0) goto L_0x003c
            r1 = 2131896312(0x7f1227f8, float:1.9427482E38)
        L_0x003c:
            r3.setTitle(r1)
            r0 = 2131625796(0x7f0e0744, float:1.887881E38)
            r3.setContentView((int) r0)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.A05 = r0
            androidx.appcompat.widget.Toolbar r0 = X.AnonymousClass4SG.A2T(r3)
            X.0R8 r0 = X.AnonymousClass4SG.A2S(r3, r0)
            r0.A0B(r1)
            r2 = 1
            r0.A0N(r2)
            X.5U4 r0 = r3.A0m
            r0.A01()
            r0 = 2131434872(0x7f0b1d78, float:1.849157E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            r3.A0t = r0
            com.whatsapp.wds.components.search.WDSSearchView r4 = r0.A07
            r1 = 3
            X.69F r0 = new X.69F
            r0.<init>(r3, r1)
            r4.setOnQueryTextChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0t
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            X.6t3 r0 = X.C140036t3.A00
            r1.setTrailingButtonIcon(r0)
            r0 = 15
            X.4Jv r1 = new X.4Jv
            r1.<init>(r3, r0)
            X.4W4 r0 = new X.4W4
            r0.<init>(r1)
            r3.A0o = r0
            X.1RR r0 = X.AnonymousClass4SG.A2c(r3)
            r3.A0c = r0
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "Settings/onCreate/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.C627736r.A03(r3)
            r3.startActivity(r0)
            r3.finish()
        L_0x00a8:
            return
        L_0x00a9:
            X.2on r5 = r3.A0l
            boolean r4 = r3.A18
            X.1VX r1 = r5.A00
            r0 = 4472(0x1178, float:6.267E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00c7
            X.1Wg r1 = new X.1Wg
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A00 = r0
            X.4FV r0 = r5.A01
            r0.BhD(r1)
        L_0x00c7:
            boolean r9 = r3.A18
            r8 = 0
            r0 = 2131434612(0x7f0b1c74, float:1.8491043E38)
            android.view.View r11 = r3.findViewById(r0)
            r0 = 2131432686(0x7f0b14ee, float:1.8487136E38)
            android.view.View r7 = r3.findViewById(r0)
            r0 = 2131433674(0x7f0b18ca, float:1.848914E38)
            android.view.View r12 = r3.findViewById(r0)
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x013e
            X.8qC r0 = r3.A0u
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0113
            X.33j r1 = r3.A00
            X.2sr r0 = r3.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r1 = X.C86654Ky.A0m(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0113
            r0 = 2131432704(0x7f0b1500, float:1.8487173E38)
            X.5UY r0 = X.AnonymousClass1Ha.A1p(r3, r0)
            android.view.View r0 = X.AnonymousClass5UY.A00(r0, r8)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x0113:
            r0 = 2131427437(0x7f0b006d, float:1.847649E38)
            X.5UY r1 = X.AnonymousClass1Ha.A1p(r3, r0)
            r1.A06(r8)
            X.39c r0 = new X.39c
            r0.<init>(r3, r8)
            r1.A07(r0)
            android.view.View r1 = r1.A04()
            r0 = 2131431642(0x7f0b10da, float:1.8485019E38)
            X.5UY r0 = X.C18290x4.A0X(r1, r0)
            r3.A0r = r0
            X.4FS r4 = r3.A04
            r1 = 8
            X.68M r0 = new X.68M
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass0x7.A1B(r0, r4)
        L_0x013e:
            java.lang.String r10 = "settings-activity-contact-photo"
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 8
            if (r9 != 0) goto L_0x07f9
            r7.setVisibility(r8)
            r11.setVisibility(r5)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167857(0x7f070a71, float:1.795E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r3.A00 = r1
            X.5mM r0 = r3.A0U
            X.5Uq r0 = r0.A07(r10, r6, r1)
            r3.A0S = r0
            r0 = 2131432690(0x7f0b14f2, float:1.8487145E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r3, r0)
            r3.A04 = r0
            r0.setVisibility(r8)
            r0 = 2131432688(0x7f0b14f0, float:1.848714E38)
            com.whatsapp.TextEmojiLabel r0 = X.C86664Kz.A0z(r3, r0)
            r3.A0I = r0
            r0.setVisibility(r8)
            com.whatsapp.TextEmojiLabel r1 = r3.A0I
            java.lang.String r0 = X.AnonymousClass4SG.A2u(r3)
            r4 = 0
            r1.A0K(r4, r0)
            r0 = 2131432693(0x7f0b14f5, float:1.848715E38)
            com.whatsapp.TextEmojiLabel r0 = X.C86664Kz.A0z(r3, r0)
            r3.A0H = r0
        L_0x018c:
            X.1VX r1 = r3.A0D
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01a6
            r3.A75()
            X.2pb r0 = r3.A0d
            X.2mD r1 = r0.A00()
            if (r1 == 0) goto L_0x07e2
            X.2mE r0 = r3.A0e
            r0.A02(r1)
        L_0x01a6:
            if (r9 != 0) goto L_0x07c6
            r0 = 2131432691(0x7f0b14f3, float:1.8487147E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r3.A0K = r0
        L_0x01b3:
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            if (r0 != 0) goto L_0x07bf
            com.whatsapp.WaImageView r4 = r3.A0K
            r1 = 2
            X.39c r0 = new X.39c
            r0.<init>(r3, r1)
            r4.setOnClickListener(r0)
            com.whatsapp.WaImageView r0 = r3.A0K
            r0.setVisibility(r8)
            com.whatsapp.WaImageView r1 = r3.A0K
            r0 = 2131893730(0x7f121de2, float:1.9422245E38)
            X.C18300x5.A13(r3, r1, r0)
            if (r9 != 0) goto L_0x01e2
            com.whatsapp.WaImageView r4 = r3.A0K
            r1 = 2130969791(0x7f0404bf, float:1.7548274E38)
            r0 = 2131101267(0x7f060653, float:1.7814939E38)
            int r0 = X.C18300x5.A03(r3, r1, r0)
            X.C107335b8.A0E(r4, r0)
        L_0x01e2:
            r6 = 18
            X.541 r0 = new X.541
            r0.<init>(r3, r8, r6)
            r7.setOnClickListener(r0)
            r3.A77()
            X.1in r1 = r3.A0Q
            X.2sG r0 = r3.A1B
            r1.A06(r0)
            if (r9 == 0) goto L_0x031c
            r0 = 2131433639(0x7f0b18a7, float:1.848907E38)
            android.view.View r9 = r3.findViewById(r0)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 2131427500(0x7f0b00ac, float:1.8476618E38)
            android.view.View r4 = r3.findViewById(r0)
            r1 = 25
            X.541 r0 = new X.541
            r0.<init>(r3, r1, r6)
            r4.setOnClickListener(r0)
            r0 = 2131427499(0x7f0b00ab, float:1.8476616E38)
            android.view.View r7 = r3.findViewById(r0)
            r0 = 37
            X.C989653x.A00(r7, r3, r0)
            r0 = 2131427498(0x7f0b00aa, float:1.8476614E38)
            android.view.View r6 = r3.findViewById(r0)
            r0 = 38
            X.C989653x.A00(r6, r3, r0)
            X.1VX r1 = r3.A0D
            r0 = 5903(0x170f, float:8.272E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0241
            r9.removeView(r4)
            r9.removeView(r7)
            r9.addView(r7, r8)
            r0 = 2
            r9.addView(r4, r0)
        L_0x0241:
            boolean r0 = r3.A19
            if (r0 == 0) goto L_0x071b
            float r1 = X.C107065ad.A01(r3)
            float r0 = X.C86604Kt.A00(r3)
            float r1 = r1 / r0
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r16 = X.AnonymousClass001.A1V(r0)
        L_0x0256:
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass001.A0T(r7)
            if (r16 == 0) goto L_0x06fb
            r9.setOrientation(r2)
            r4.setMarginStart(r8)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r6)
            r0.setMarginStart(r8)
        L_0x0269:
            r0 = 2131432636(0x7f0b14bc, float:1.8487035E38)
            X.C18280x3.A0r(r3, r0, r5)
            r0 = 2131433604(0x7f0b1884, float:1.8488998E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 39
            X.C989653x.A00(r1, r3, r0)
            r0 = 2131433592(0x7f0b1878, float:1.8488974E38)
            android.view.View r1 = r3.findViewById(r0)
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            if (r0 == 0) goto L_0x06f4
            r1.setVisibility(r5)
        L_0x028b:
            X.99n r0 = r3.A0h
            boolean r0 = r0.A03(r8)
            if (r0 != 0) goto L_0x02a5
            X.99n r1 = r3.A0h
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x06ea
            X.1VX r1 = r1.A02
            r0 = 1697(0x6a1, float:2.378E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x06ea
        L_0x02a5:
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            if (r0 != 0) goto L_0x02dd
            r0 = 2131433597(0x7f0b187d, float:1.8488984E38)
            android.view.View r4 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r4 = (com.whatsapp.settings.SettingsRowIconText) r4
            r4.setVisibility(r8)
            r0 = 41
            X.C989653x.A00(r4, r3, r0)
            X.7ae r0 = r3.A0g
            X.4Fi r0 = r0.A01()
            X.3H6 r0 = (X.AnonymousClass3H6) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "BRL"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x06e5
            java.lang.String r0 = "INR"
            boolean r1 = r1.equals(r0)
            r0 = 2131234161(0x7f080d71, float:1.808448E38)
            if (r1 != 0) goto L_0x02da
            r0 = 0
        L_0x02da:
            r4.setIcon((int) r0)
        L_0x02dd:
            r1 = 2131433612(0x7f0b188c, float:1.8489015E38)
            r0 = 2131234175(0x7f080d7f, float:1.8084508E38)
            r3.A7A(r1, r0)
            r1 = 2131433617(0x7f0b1891, float:1.8489025E38)
            r0 = 2131233961(0x7f080ca9, float:1.8084074E38)
            r3.A7A(r1, r0)
            r1 = 2131433642(0x7f0b18aa, float:1.8489075E38)
            r0 = 2131234181(0x7f080d85, float:1.808452E38)
            r3.A7A(r1, r0)
            r1 = 2131433618(0x7f0b1892, float:1.8489027E38)
            r0 = 2131234169(0x7f080d79, float:1.8084496E38)
            r3.A7A(r1, r0)
            r1 = 2131433637(0x7f0b18a5, float:1.8489065E38)
            r0 = 2131234177(0x7f080d81, float:1.8084512E38)
            r3.A7A(r1, r0)
            r1 = 2131433636(0x7f0b18a4, float:1.8489063E38)
            r0 = 2131234171(0x7f080d7b, float:1.80845E38)
            r3.A7A(r1, r0)
            r1 = 2131433608(0x7f0b1888, float:1.8489006E38)
            r0 = 2131234173(0x7f080d7d, float:1.8084504E38)
            r3.A7A(r1, r0)
        L_0x031c:
            r0 = 2131433636(0x7f0b18a4, float:1.8489063E38)
            android.view.View r5 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r5 = (com.whatsapp.settings.SettingsRowIconText) r5
            r0 = 44
            X.C989653x.A00(r5, r3, r0)
            X.33j r4 = r3.A00
            r0 = 2131232662(0x7f080796, float:1.808144E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r3, r0)
            X.6dw r0 = new X.6dw
            r0.<init>(r1, r4)
            r5.setIcon((android.graphics.drawable.Drawable) r0)
            r0 = 2131433608(0x7f0b1888, float:1.8489006E38)
            android.view.View r0 = r3.findViewById(r0)
            r4 = 8
            r5 = 46
            X.AnonymousClass0x2.A10(r0, r3, r5)
            X.8qC r0 = r3.A0y
            java.lang.Object r7 = r0.get()
            X.2Rb r7 = (X.C43172Rb) r7
            android.content.pm.PackageManager r9 = r3.getPackageManager()
            if (r9 == 0) goto L_0x06e1
            X.2Ul r0 = new X.2Ul
            r0.<init>(r9)
            X.2JE r6 = r0.A00()
            if (r6 == 0) goto L_0x06e1
            r1 = 18
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x06e1
            int r0 = r6.A00
            if (r0 < r1) goto L_0x06e1
            java.lang.String r6 = X.AnonymousClass78K.A00
            java.lang.String r1 = "com.facebook.oxygen.appmanager.appinfo.AppInfoRedirectActivity"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r6, r1)
            int r0 = r9.getComponentEnabledSetting(r0)
            if (r0 != r2) goto L_0x06e1
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            X.2Ul r0 = new X.2Ul
            r0.<init>(r1)
            X.2JE r6 = r0.A00()
            if (r6 == 0) goto L_0x06dd
            r1 = 24
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x06dd
            int r0 = r6.A00
            if (r0 < r1) goto L_0x06dd
            X.4FS r6 = r7.A04
            r0 = 43
            X.3Zz r1 = new X.3Zz
            r1.<init>(r7, r0, r3)
            java.lang.String r0 = "PreloadsManager/syncFirstPartySettings"
            r6.BkN(r1, r0)
            X.5NE r0 = r7.A02
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "first_party_settings_restricted_mode"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0692
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled/first party settings - AppManager is in restricted mode"
        L_0x03b2:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x03b5:
            r6 = 0
            X.8qC r0 = r3.A10
            java.lang.Object r0 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0474
            r0 = 2131430264(0x7f0b0b78, float:1.8482224E38)
            android.view.View r7 = r3.findViewById(r0)
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.ViewGroup r10 = X.C86664Kz.A0m(r3, r0)
            r9 = 0
        L_0x03d3:
            int r0 = r10.getChildCount()
            if (r9 >= r0) goto L_0x0471
            android.view.View r0 = r10.getChildAt(r9)
            if (r0 != r7) goto L_0x068e
            android.view.ViewStub r1 = new android.view.ViewStub
            r1.<init>(r3)
            r10.addView(r1, r9)
            boolean r0 = X.C107405bG.A0D(r3)
            if (r0 == 0) goto L_0x03f3
            r0 = 2131102563(0x7f060b63, float:1.7817567E38)
            X.AnonymousClass0Y8.A04(r3, r0)
        L_0x03f3:
            X.8qC r0 = r3.A11
            java.lang.Object r10 = r0.get()
            r0 = 2131626387(0x7f0e0993, float:1.8880009E38)
            android.view.View r9 = X.C86634Kw.A0M(r1, r0)
            r0 = 2131434911(0x7f0b1d9f, float:1.849165E38)
            android.view.View r1 = X.C18280x3.A0E(r9, r0)
            r0 = 34
            X.C109495ei.A00(r1, r10, r3, r0)
            X.C162457s7.A0H(r9)
            android.content.Intent r1 = r3.getIntent()
            X.C162457s7.A0J(r1, r8)
            X.C162457s7.A0J(r9, r2)
            java.lang.String r0 = "target_settings_wfal"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            if (r0 == 0) goto L_0x042b
            r0 = 2131434911(0x7f0b1d9f, float:1.849165E38)
            android.view.View r0 = X.C18280x3.A0E(r9, r0)
            r0.callOnClick()
        L_0x042b:
            r0 = 2131427357(0x7f0b001d, float:1.8476328E38)
            com.whatsapp.TextEmojiLabel r8 = X.C86614Ku.A0M(r9, r0)
            X.5Tj r9 = r3.A0b
            X.33i r1 = r3.A08
            r0 = 2131893613(0x7f121d6d, float:1.9422007E38)
            r9.A03(r3, r8, r1, r0)
            android.content.Context r9 = r8.getContext()
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            java.lang.String r0 = "  "
            android.text.SpannableStringBuilder r1 = r11.append(r0)
            java.lang.CharSequence r0 = r8.getText()
            android.text.SpannableString r0 = X.AnonymousClass4L0.A0A(r0)
            r1.append(r0)
            r0 = 2131232596(0x7f080754, float:1.8081306E38)
            android.graphics.drawable.Drawable r1 = X.C18310x6.A0G(r9, r0)
            r0 = 2131102351(0x7f060a8f, float:1.7817137E38)
            android.graphics.drawable.Drawable r10 = X.C107335b8.A07(r9, r1, r0)
            android.text.TextPaint r9 = r8.getPaint()
            r12 = -1
            r13 = r6
            r14 = r2
            X.C87044Mw.A04(r9, r10, r11, r12, r13, r14)
            r8.setText(r11)
        L_0x0471:
            r7.setVisibility(r4)
        L_0x0474:
            r0 = 2131428318(0x7f0b03de, float:1.8478277E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2131432598(0x7f0b1496, float:1.8486958E38)
            r3.findViewById(r0)
            r0 = 2131428319(0x7f0b03df, float:1.847828E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.setVisibility(r4)
            r0.setVisibility(r4)
            boolean r8 = r3.A18
            r0 = 2131432636(0x7f0b14bc, float:1.8487035E38)
            android.view.View r7 = r3.findViewById(r0)
            r0 = 2131434611(0x7f0b1c73, float:1.849104E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r8 != 0) goto L_0x0689
            r7.setVisibility(r6)
            r0 = 48
            X.C989653x.A00(r7, r3, r0)
        L_0x04a8:
            r1.setVisibility(r4)
            r0 = 2131433617(0x7f0b1891, float:1.8489025E38)
            android.view.View r1 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r1 = (com.whatsapp.settings.SettingsRowIconText) r1
            r0 = 45
            X.C989653x.A00(r1, r3, r0)
            r0 = 2131887689(0x7f120649, float:1.9409992E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setSubText(r0)
            r0 = 2131433618(0x7f0b1892, float:1.8489027E38)
            android.view.View r1 = X.C005205m.A00(r3, r0)
            com.whatsapp.settings.SettingsRowIconText r1 = (com.whatsapp.settings.SettingsRowIconText) r1
            r0 = 2131893746(0x7f121df2, float:1.9422277E38)
            r1.setText((int) r0)
            X.C989653x.A00(r1, r3, r5)
            r0 = 2131433642(0x7f0b18aa, float:1.8489075E38)
            android.view.View r0 = r3.findViewById(r0)
            r1 = 47
            X.C989653x.A00(r0, r3, r1)
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            if (r0 == 0) goto L_0x067b
            r0 = 2131428916(0x7f0b0634, float:1.847949E38)
            android.view.View r0 = r3.findViewById(r0)
            r0.setVisibility(r6)
            X.AnonymousClass0x2.A10(r0, r3, r1)
            r0 = 2131433612(0x7f0b188c, float:1.8489015E38)
            X.C18280x3.A0r(r3, r0, r4)
            X.8qC r0 = r3.A0v
            java.lang.Object r0 = r0.get()
            X.2ou r0 = (X.C54552ou) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0551
            boolean r0 = r3.A18
            if (r0 == 0) goto L_0x066f
            r0 = 2131431251(0x7f0b0f53, float:1.8484226E38)
            android.view.ViewStub r0 = X.C86664Kz.A0o(r3, r0)
            r0.inflate()
            r0 = 2131431012(0x7f0b0e64, float:1.8483741E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r0)
            r0 = 17
            r1.gravity = r0
        L_0x0525:
            X.1VX r10 = r3.A0D
            X.3Wi r9 = r3.A05
            X.5hX r8 = r3.A00
            X.33i r7 = r3.A08
            r0 = 2131431012(0x7f0b0e64, float:1.8483741E38)
            com.whatsapp.TextEmojiLabel r15 = X.C86664Kz.A0z(r3, r0)
            r5 = 2131893677(0x7f121dad, float:1.9422137E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "learn-more"
            java.lang.String r18 = X.AnonymousClass002.A0F(r3, r1, r0, r6, r5)
            java.lang.String r0 = "https://faq.whatsapp.com/378279804439436"
            android.net.Uri r12 = android.net.Uri.parse(r0)
            r11 = r3
            r13 = r8
            r14 = r9
            r16 = r7
            r17 = r10
            r19 = r1
            X.C107635bd.A0E(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0551:
            boolean r0 = X.AnonymousClass4SG.A45(r3)
            if (r0 != 0) goto L_0x0593
            X.1VX r1 = r3.A0D
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0593
            boolean r5 = r3.A18
            r0 = 2131433613(0x7f0b188d, float:1.8489017E38)
            android.view.View r1 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r1 = (com.whatsapp.settings.SettingsRowIconText) r1
            r0 = 2131893585(0x7f121d51, float:1.942195E38)
            r1.setText((int) r0)
            r0 = 2131893586(0x7f121d52, float:1.9421953E38)
            java.lang.String r0 = r3.getString(r0)
            r1.setSubText(r0)
            r0 = 2131232617(0x7f080769, float:1.8081348E38)
            if (r5 == 0) goto L_0x0584
            r0 = 2131232719(0x7f0807cf, float:1.8081555E38)
        L_0x0584:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r3, r0)
            r1.setIcon((android.graphics.drawable.Drawable) r0)
            r0 = 42
            X.C989653x.A00(r1, r3, r0)
            r1.setVisibility(r6)
        L_0x0593:
            X.1VX r1 = r3.A0D
            r0 = 2090(0x82a, float:2.929E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x05ac
            r0 = 2131433653(0x7f0b18b5, float:1.8489098E38)
            android.view.View r1 = r3.findViewById(r0)
            r1.setVisibility(r6)
            r0 = 43
            X.C989653x.A00(r1, r3, r0)
        L_0x05ac:
            r0 = 2131433637(0x7f0b18a5, float:1.8489065E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r0 = (com.whatsapp.settings.SettingsRowIconText) r0
            r3.A0k = r0
            com.whatsapp.Me r5 = X.AnonymousClass4SG.A2b(r3)
            com.whatsapp.settings.SettingsRowIconText r0 = r3.A0k
            if (r5 != 0) goto L_0x063c
            r0.setVisibility(r4)
        L_0x05c2:
            r3.A1A = r6
            X.33j r0 = r3.A00
            X.8oH r1 = r3.A1C
            java.util.Set r0 = r0.A0A
            r0.add(r1)
            r3.A17 = r2
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x05df
            X.67u r1 = new X.67u
            r1.<init>(r3, r2)
            r3.A0L = r1
            X.4xV r0 = r3.A0M
            r0.A06(r1)
        L_0x05df:
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L_0x05fb
            java.lang.String r2 = "page"
            java.lang.String r1 = r4.getStringExtra(r2)
            if (r1 == 0) goto L_0x05fb
            java.lang.String r0 = "language"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05fb
            r3.A76()
            r4.removeExtra(r2)
        L_0x05fb:
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L_0x00a8
            java.lang.String r0 = "account_switcher"
            boolean r0 = r2.getBooleanExtra(r0, r6)
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x0621
            java.lang.String r1 = "source"
            r0 = 7
            int r1 = r2.getIntExtra(r1, r0)
            java.lang.String r0 = "Settings/showAccountSwitcher"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = X.C379924v.A00(r1)
        L_0x061d:
            r3.Boo(r0)
            return
        L_0x0621:
            X.8qC r0 = r3.A0u
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            X.2sr r0 = r0.A06
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0981
            java.lang.String r0 = "Settings/showAccountSwitcherNotAvailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = new com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment
            r0.<init>()
            goto L_0x061d
        L_0x063c:
            r0.setVisibility(r6)
            boolean r0 = X.AnonymousClass5YW.A02()
            if (r0 == 0) goto L_0x0666
            r4 = 2131888610(0x7f1209e2, float:1.941186E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.33j r0 = r3.A00
            java.util.Locale r0 = X.C620733j.A02(r0)
            java.lang.String r0 = X.C154327cz.A01(r0)
            java.lang.String r1 = X.AnonymousClass002.A0F(r3, r0, r1, r6, r4)
        L_0x0658:
            com.whatsapp.settings.SettingsRowIconText r0 = r3.A0k
            r0.setSubText(r1)
            com.whatsapp.settings.SettingsRowIconText r1 = r3.A0k
            r0 = 40
            X.C634339f.A00(r1, r3, r5, r0)
            goto L_0x05c2
        L_0x0666:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = X.C154327cz.A01(r0)
            goto L_0x0658
        L_0x066f:
            r0 = 2131431011(0x7f0b0e63, float:1.848374E38)
            android.view.ViewStub r0 = X.C86664Kz.A0o(r3, r0)
            r0.inflate()
            goto L_0x0525
        L_0x067b:
            r0 = 2131433612(0x7f0b188c, float:1.8489015E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 48
            X.AnonymousClass0x2.A10(r1, r3, r0)
            goto L_0x0551
        L_0x0689:
            r7.setVisibility(r4)
            goto L_0x04a8
        L_0x068e:
            int r9 = r9 + 1
            goto L_0x03d3
        L_0x0692:
            X.5NE r0 = r7.A02
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "first_party_settings_managed"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x06a4
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled/first party settings - WA not actively managed"
            goto L_0x03b2
        L_0x06a4:
            r0 = 2131429051(0x7f0b06bb, float:1.8479764E38)
            android.view.ViewGroup r6 = X.C86664Kz.A0k(r3, r0)
            X.5NE r0 = r7.A02
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "tos_state"
            int r1 = r1.getInt(r0, r8)
            if (r1 == r2) goto L_0x06be
            r0 = 5
            if (r1 == r0) goto L_0x06be
            goto L_0x03b5
        L_0x06be:
            android.view.LayoutInflater r1 = r3.getLayoutInflater()
            r0 = 2131624111(0x7f0e00af, float:1.8875392E38)
            android.view.View r1 = r1.inflate(r0, r6, r8)
            r0 = 2
            X.C634339f.A00(r1, r7, r3, r0)
            r0 = 2131430264(0x7f0b0b78, float:1.8482224E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            int r0 = r6.indexOfChild(r0)
            r6.addView(r1, r0)
            goto L_0x03b5
        L_0x06dd:
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled/preload sdk status - AppManager Api Level not supported"
            goto L_0x03b2
        L_0x06e1:
            java.lang.String r0 = "PreloadsManager/isSettingsEnabled/app info contract - WA settings not supported"
            goto L_0x03b2
        L_0x06e5:
            r0 = 2131234159(0x7f080d6f, float:1.8084476E38)
            goto L_0x02da
        L_0x06ea:
            X.99n r0 = r3.A0h
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x02dd
            goto L_0x02a5
        L_0x06f4:
            r0 = 40
            X.C989653x.A00(r1, r3, r0)
            goto L_0x028b
        L_0x06fb:
            r9.setOrientation(r8)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168164(0x7f070ba4, float:1.7950622E38)
            float r1 = r1.getDimension(r0)
            float r0 = X.C86604Kt.A00(r3)
            float r1 = r1 / r0
            int r1 = (int) r1
            r4.setMarginStart(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r6)
            r0.setMarginStart(r1)
            goto L_0x0269
        L_0x071b:
            r16 = 0
            r0 = 2131427522(0x7f0b00c2, float:1.8476663E38)
            android.widget.TextView r15 = X.AnonymousClass002.A09(r4, r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r3)
            int r13 = r0.widthPixels
            r0 = 2131896335(0x7f12280f, float:1.9427528E38)
            java.lang.String r11 = r3.getString(r0)
            r0 = 2131896334(0x7f12280e, float:1.9427526E38)
            java.lang.String r10 = r3.getString(r0)
            r0 = 2131895787(0x7f1225eb, float:1.9426417E38)
            java.lang.String r4 = r3.getString(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168163(0x7f070ba3, float:1.795062E38)
            int r14 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167846(0x7f070a66, float:1.7949977E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167845(0x7f070a65, float:1.7949975E38)
            int r12 = X.C86654Ky.A02(r1, r0, r12)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167844(0x7f070a64, float:1.7949973E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r12 = r12 + r0
            android.text.TextPaint r1 = r15.getPaint()
            float r0 = r1.measureText(r11)
            int r11 = (int) r0
            float r0 = r1.measureText(r10)
            int r10 = (int) r0
            float r0 = r1.measureText(r4)
            int r4 = (int) r0
            int r1 = java.lang.Math.max(r11, r14)
            int r0 = java.lang.Math.max(r10, r14)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r4, r14)
            int r1 = r1 + r0
            int r1 = r1 + r12
            if (r13 >= r1) goto L_0x0256
            r16 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Settings/Metab display metric: display:"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", margins: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ", profile: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", privacy: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", contacts: "
            X.C18260x0.A0y(r0, r1, r4)
            goto L_0x0256
        L_0x07bf:
            com.whatsapp.WaImageView r0 = r3.A0K
            r0.setVisibility(r5)
            goto L_0x01e2
        L_0x07c6:
            r0 = 2131431257(0x7f0b0f59, float:1.8484238E38)
            android.view.View r0 = r3.findViewById(r0)
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0
            r3.A0K = r0
            r0 = 2131431258(0x7f0b0f5a, float:1.848424E38)
            android.view.View r1 = r3.findViewById(r0)
            X.39c r0 = new X.39c
            r0.<init>(r3, r2)
            r1.setOnClickListener(r0)
            goto L_0x01b3
        L_0x07e2:
            X.4FS r6 = r3.A04
            r1 = 42
            X.3br r0 = new X.3br
            r0.<init>((com.whatsapp.settings.Settings) r3, (int) r1)
            r6.BkP(r0)
            boolean r0 = r3.A18
            if (r0 != 0) goto L_0x01a6
            X.2mE r0 = r3.A0e
            r0.A02(r4)
            goto L_0x01a6
        L_0x07f9:
            r0 = 2131431261(0x7f0b0f5d, float:1.8484246E38)
            android.view.ViewStub r1 = X.C86664Kz.A0o(r3, r0)
            boolean r0 = r3.A19
            if (r0 == 0) goto L_0x080a
            r0 = 2131626028(0x7f0e082c, float:1.887928E38)
            r1.setLayoutResource(r0)
        L_0x080a:
            r1.inflate()
            X.5Tc r0 = r3.A0a
            X.1VX r1 = r0.A02
            boolean r0 = X.C86634Kw.A1b(r1)
            if (r0 == 0) goto L_0x097a
            r0 = 5235(0x1473, float:7.336E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x097a
            X.5Tc r0 = r3.A0a
            X.33p r0 = r0.A01
            android.content.SharedPreferences r13 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r4 = "create_group_banner_creation_time"
            r0 = 0
            long r17 = r13.getLong(r4, r0)
            int r13 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            boolean r16 = X.AnonymousClass000.A1T(r13)
            long r14 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r0 = r13.toMillis(r0)
            long r17 = r17 + r0
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r0)
            if (r16 != 0) goto L_0x084d
            if (r0 == 0) goto L_0x0977
        L_0x084d:
            X.5Tc r0 = r3.A0a
            X.33p r0 = r0.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "create_group_banner_dismissed"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x0977
            X.5Tc r0 = r3.A0a
            X.33p r0 = r0.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "create_group_tool_tip_perm_dismissed"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x0977
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Tc r0 = r3.A0a
            X.33p r0 = r0.A01
            android.content.SharedPreferences r13 = X.AnonymousClass0x2.A0F(r0)
            r0 = 0
            long r14 = r13.getLong(r4, r0)
            int r13 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r13 != 0) goto L_0x0894
            java.lang.String r0 = "Settings/setupProfileSection/create group banner never created"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Tc r13 = r3.A0a
            long r0 = java.lang.System.currentTimeMillis()
            X.33p r13 = r13.A01
            X.C18260x0.A0M(r13, r4, r0)
        L_0x0894:
            r0 = 2131431250(0x7f0b0f52, float:1.8484224E38)
            android.view.ViewStub r4 = X.C86664Kz.A0o(r3, r0)
            r4.inflate()
            r13 = 2131896170(0x7f12276a, float:1.9427194E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r14 = 2130970361(0x7f0406f9, float:1.754943E38)
            r0 = 2131102203(0x7f0609fb, float:1.7816837E38)
            int r0 = X.AnonymousClass5Yj.A02(r3, r14, r0)
            java.lang.String r0 = X.C107575bX.A04(r3, r0)
            r1[r8] = r0
            android.text.Spanned r1 = X.C107575bX.A00(r3, r1, r13)
            r0 = 2131429212(0x7f0b075c, float:1.848009E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r3, r0)
            r0.setText(r1)
            r0 = 2131429209(0x7f0b0759, float:1.8480084E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 45
            X.AnonymousClass0x2.A10(r1, r3, r0)
            r0 = 2131429208(0x7f0b0758, float:1.8480082E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 39
            X.C634339f.A00(r1, r3, r4, r0)
        L_0x08d9:
            r7.setVisibility(r5)
            r11.setVisibility(r5)
            r12.setVisibility(r8)
            r4 = 2131431256(0x7f0b0f58, float:1.8484236E38)
            android.view.View r7 = r3.findViewById(r4)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131167851(0x7f070a6b, float:1.7949987E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r3.A00 = r1
            X.5mM r0 = r3.A0U
            X.5Uq r0 = r0.A07(r10, r6, r1)
            r3.A0S = r0
            android.widget.ImageView r0 = X.C86654Ky.A0M(r3, r4)
            r3.A04 = r0
            r0 = 2131431253(0x7f0b0f55, float:1.848423E38)
            com.whatsapp.TextEmojiLabel r1 = X.C86664Kz.A0z(r3, r0)
            r3.A0I = r1
            java.lang.String r0 = X.AnonymousClass4SG.A2u(r3)
            r4 = 0
            r1.A0K(r4, r0)
            r0 = 2131432702(0x7f0b14fe, float:1.8487169E38)
            android.widget.TextView r6 = X.C18310x6.A0L(r3, r0)
            X.33j r1 = r3.A00
            X.2sr r0 = r3.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            java.lang.String r0 = X.C86654Ky.A0m(r1, r0)
            r6.setText(r0)
            r0 = 2131431259(0x7f0b0f5b, float:1.8484242E38)
            com.whatsapp.TextEmojiLabel r0 = X.C86664Kz.A0z(r3, r0)
            r3.A0H = r0
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x018c
            X.5Ts r6 = r3.A0N
            r1 = 28
            com.whatsapp.TextEmojiLabel r0 = r3.A0I
            r6.A01(r3, r0, r1)
            r0 = 2131431248(0x7f0b0f50, float:1.848422E38)
            X.5UY r0 = X.AnonymousClass1Ha.A1p(r3, r0)
            r3.A0s = r0
            r0.A06(r8)
            r0 = 2131431254(0x7f0b0f56, float:1.8484232E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 49
            X.AnonymousClass0x2.A10(r1, r3, r0)
            X.5UY r0 = r3.A0s
            android.view.View r1 = r0.A04()
            r0 = 2131431247(0x7f0b0f4f, float:1.8484218E38)
            X.5UY r0 = X.C18290x4.A0X(r1, r0)
            r3.A0r = r0
            X.4FS r1 = r3.A04
            X.68M r0 = new X.68M
            r0.<init>((java.lang.Object) r3, (int) r5)
            X.AnonymousClass0x7.A1B(r0, r1)
            r3.A78()
            goto L_0x018c
        L_0x0977:
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/false"
            goto L_0x097c
        L_0x097a:
            java.lang.String r0 = "Settings/shouldShowGroupCreationBanner/isCreateGroupBannerEnabled is false"
        L_0x097c:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x08d9
        L_0x0981:
            r0 = 2131890255(0x7f12104f, float:1.9415197E38)
            r3.Bot(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.Settings.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        String A2u;
        String A0u2;
        if (this.A1A) {
            this.A1A = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A0c = AnonymousClass4SG.A2c(this);
        if (!this.A18 || !this.A16) {
            Log.i("Settings/onResume/not eligible for updatePushName");
            this.A0I.A0K((List) null, AnonymousClass4SG.A2u(this));
        } else {
            TextEmojiLabel textEmojiLabel = this.A0J;
            if (textEmojiLabel == null || textEmojiLabel.getVisibility() != 0) {
                Log.i("Settings/onResume/pushNameSecondLine null or is GONE");
                A2u = AnonymousClass4SG.A2u(this);
                A0u2 = C86614Ku.A0u(this.A0I);
            } else {
                Log.i("Settings/onResume/pushNameSecondLine not null and is VISIBLE");
                A2u = AnonymousClass4SG.A2u(this);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(C86614Ku.A0u(this.A0I));
                A0u2 = AnonymousClass000.A0X(C86614Ku.A0u(this.A0J), A0o2);
            }
            if (!A2u.equals(A0u2)) {
                Log.i("Settings/onResume/name changed, need to update pushName components");
                this.A0I.A0K((List) null, AnonymousClass4SG.A2u(this));
                A78();
            }
        }
        if (!this.A0D.A0X(4921)) {
            this.A0H.A0K((List) null, this.A0F.A00());
        }
        boolean z = C86664Kz.A1G(this.A0x).A03;
        View view = this.A00;
        if (z) {
            AnonymousClass1VX r15 = this.A0D;
            C69263Wi r13 = this.A05;
            C56972sr r12 = this.A01;
            AnonymousClass4FS r11 = this.A04;
            C114015mM r10 = this.A0U;
            C64773Ex r9 = this.A0P;
            AnonymousClass5ZU r8 = this.A0R;
            C620733j r7 = this.A00;
            AnonymousClass5RC r6 = this.A0Y;
            C113895mA r5 = this.A0Z;
            C183538qC r4 = this.A0x;
            C183538qC r3 = this.A0z;
            View view2 = this.A02;
            C105365Uq r1 = this.A0T;
            C113895mA r24 = r5;
            AnonymousClass5RC r23 = r6;
            C114015mM r22 = r10;
            C105365Uq r21 = r1;
            AnonymousClass5ZU r20 = r8;
            C64773Ex r19 = r9;
            C56972sr r18 = r12;
            C69263Wi r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = C107465bM.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, this.A09, r7, r15, r11, r4, r3, "settings-activity");
            this.A02 = (View) A002.first;
            this.A0T = (C105365Uq) A002.second;
        } else if (C106035Xj.A01(view)) {
            C107465bM.A04(this.A00, this.A0Z, this.A0x);
        }
        C106035Xj.A00(this.A0x);
        boolean A042 = this.A0j.A04();
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.settings_help);
        if (A042) {
            if (settingsRowIconText != null) {
                settingsRowIconText.setBadgeIcon(AnonymousClass0RP.A00(this, R.drawable.ic_settings_row_badge));
            } else {
                Log.e("Settings/showBadge cannot find help view");
            }
            C55522qU r32 = this.A0j;
            if (r32.A04.A0Y(C58422vE.A01, 1799)) {
                AnonymousClass3S8 r2 = r32.A07;
                r2.A00.execute(new C71263bp((Object) r2, 37));
            }
        } else if (settingsRowIconText != null) {
            settingsRowIconText.setBadgeIcon((Drawable) null);
        } else {
            Log.e("Settings/clearBadge cannot find help view");
        }
        this.A0m.A01();
    }

    public boolean onSearchRequested() {
        View findViewById;
        C24151Wh r2 = new C24151Wh();
        if (this.A0l.A00.A0X(4472)) {
            r2.A00 = Integer.valueOf(this.A18 ? 1 : 0);
        }
        if (!this.A18 || this.A0l.A00.A0X(4472)) {
            this.A0f.BhA(r2);
        }
        this.A0t.A01();
        WDSSearchBar wDSSearchBar = this.A0t;
        if (wDSSearchBar != null) {
            findViewById = wDSSearchBar.A07.A07;
        } else {
            findViewById = findViewById(R.id.search_back);
        }
        findViewById.setOnClickListener(new C634039c(this, 3));
        ViewStub A0o2 = C86664Kz.A0o(this, R.id.settings_search_results_list_stub);
        if (A0o2 != null && A0o2.findViewById(R.id.settings_search_results_list_view) == null) {
            RecyclerView recyclerView = (RecyclerView) A0o2.inflate();
            this.A06 = recyclerView;
            recyclerView.setAdapter(this.A0o);
            AnonymousClass0UY r1 = this.A06.A0R;
            if (r1 instanceof AnonymousClass09N) {
                ((AnonymousClass09N) r1).A00 = false;
            }
        }
        A79();
        return false;
    }

    public Settings(int i) {
        this.A15 = false;
        AnonymousClass68W.A00(this, 92);
    }

    public final void A7A(int i, int i2) {
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(i);
        if (settingsRowIconText != null) {
            settingsRowIconText.setIcon(i2);
        }
    }

    public final void A7B(Integer num) {
        Integer num2;
        if (AnonymousClass4SG.A4E(this)) {
            num2 = Integer.valueOf(AnonymousClass0x9.A00(this.A18 ? 1 : 0));
        } else {
            num2 = null;
        }
        A7C(num, num2);
    }

    public void BV2() {
        this.A01 = System.currentTimeMillis();
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            Intent A022 = C627736r.A02(this);
            finishAndRemoveTask();
            startActivity(A022);
            return;
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, R.string.f11nameremoved).setIcon(AnonymousClass0RP.A00(this, R.drawable.ic_action_search)).setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A17) {
            this.A0Q.A07(this.A1B);
            this.A0S.A00();
            C620733j r0 = this.A00;
            r0.A0A.remove(this.A1C);
        }
        C107465bM.A02(this.A02, this.A0Z);
        C105365Uq r02 = this.A0T;
        if (r02 != null) {
            r02.A00();
            this.A0T = null;
        }
        C103045Lg r1 = this.A0L;
        if (r1 != null) {
            this.A0M.A07(r1);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_search) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onSearchRequested();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        C107465bM.A07(this.A0Z);
        AnonymousClass4SG.A3g(this, this.A0x);
    }

    public void BR5(DialogInterface dialogInterface, int i, int i2) {
        dialogInterface.dismiss();
    }

    public Settings() {
        this(0);
        this.A01 = 0;
        this.A14 = AnonymousClass001.A0s();
        this.A12 = "";
        this.A13 = null;
        this.A1B = AnonymousClass681.A00(this, 40);
        this.A1C = new AnonymousClass69N(this, 2);
        this.A0L = null;
    }
}
