package com.whatsapp.extensions.bloks.view;

import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass32Y;
import X.AnonymousClass37G;
import X.AnonymousClass39C;
import X.AnonymousClass40L;
import X.AnonymousClass421;
import X.AnonymousClass422;
import X.AnonymousClass423;
import X.AnonymousClass424;
import X.AnonymousClass425;
import X.AnonymousClass426;
import X.AnonymousClass427;
import X.AnonymousClass4K2;
import X.AnonymousClass4SH;
import X.C003203q;
import X.C08240dc;
import X.C08310eF;
import X.C107575bX;
import X.C117715sN;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C29041iB;
import X.C44052Um;
import X.C50312hy;
import X.C56422rx;
import X.C58422vE;
import X.C59482wz;
import X.C60032xt;
import X.C624134x;
import X.C627136h;
import X.C66543Lv;
import X.C86264Jl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.PercentageBasedMaxHeightLinearLayout;

public final class ExtensionsBottomsheetBaseContainer extends Hilt_ExtensionsBottomsheetBaseContainer {
    public Uri A00;
    public LinearLayout A01;
    public ProgressBar A02;
    public Toolbar A03;
    public C44052Um A04;
    public FAQTextView A05;
    public WaImageView A06;
    public WaTextView A07;
    public WaTextView A08;
    public C59482wz A09;
    public C56422rx A0A;
    public C60032xt A0B;
    public C66543Lv A0C;
    public C29041iB A0D;
    public WaExtensionsNavBarViewModel A0E;
    public WaFlowsViewModel A0F;
    public C50312hy A0G;
    public AnonymousClass1VX A0H;
    public UserJid A0I;
    public C624134x A0J;

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r26, android.view.LayoutInflater r27, android.view.ViewGroup r28) {
        /*
            r25 = this;
            r8 = 0
            r2 = r27
            X.C162457s7.A0J(r2, r8)
            r0 = 2131626339(0x7f0e0963, float:1.8879911E38)
            r7 = 0
            r1 = r28
            android.view.View r6 = X.C18310x6.A0I(r2, r1, r0, r8)
            r5 = r25
            android.app.Dialog r1 = r5.A1I()
            r4 = 1
            X.4JL r0 = new X.4JL
            r0.<init>(r5, r4)
            r1.setOnKeyListener(r0)
            r0 = 2131427968(0x7f0b0280, float:1.8477567E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r5.A03 = r0
            X.03q r1 = r5.A0Q()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.C162457s7.A0K(r1, r0)
            X.07r r1 = (X.C009707r) r1
            androidx.appcompat.widget.Toolbar r0 = r5.A03
            r1.setSupportActionBar(r0)
            X.0R8 r0 = r1.getSupportActionBar()
            if (r0 == 0) goto L_0x0044
            r0.A0Q(r8)
        L_0x0044:
            androidx.appcompat.widget.Toolbar r2 = r5.A03
            if (r2 == 0) goto L_0x0056
            r1 = 2131895753(0x7f1225c9, float:1.9426348E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1)
            r2.setNavigationContentDescription((java.lang.CharSequence) r0)
        L_0x0056:
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r0 = r5.A0E
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "waExtensionsNavBarViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0062:
            X.08M r0 = r0.A06
            X.C18320x8.A18(r0, r8)
            androidx.appcompat.widget.Toolbar r1 = r5.A03
            if (r1 == 0) goto L_0x008c
            r0 = 2131428006(0x7f0b02a6, float:1.8477644E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            if (r0 == 0) goto L_0x008c
            android.graphics.drawable.Drawable r2 = r0.getIndeterminateDrawable()
            if (r2 == 0) goto L_0x008c
            android.content.Context r1 = r6.getContext()
            r0 = 2131100082(0x7f0601b2, float:1.7812535E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
        L_0x008c:
            r0 = 2131427969(0x7f0b0281, float:1.847757E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass0x9.A0L(r6, r0)
            r5.A06 = r0
            r0 = 2131428005(0x7f0b02a5, float:1.8477642E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass0x7.A0L(r6, r0)
            r5.A08 = r0
            r0 = 2131430063(0x7f0b0aaf, float:1.8481816E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass0x7.A0L(r6, r0)
            r5.A07 = r0
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            com.whatsapp.FAQTextView r0 = (com.whatsapp.FAQTextView) r0
            r5.A05 = r0
            r0 = 2131430059(0x7f0b0aab, float:1.8481808E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.A01 = r0
            androidx.appcompat.widget.Toolbar r0 = r5.A03
            if (r0 == 0) goto L_0x00c4
            r0.setVisibility(r8)
        L_0x00c4:
            androidx.appcompat.widget.Toolbar r2 = r5.A03
            if (r2 == 0) goto L_0x00d2
            r1 = 25
            X.39p r0 = new X.39p
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setNavigationOnClickListener(r0)
        L_0x00d2:
            r0 = 2131431536(0x7f0b1070, float:1.8484804E38)
            android.view.View r0 = X.C06560Yg.A02(r6, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r5.A02 = r0
            android.os.Bundle r1 = r5.A06
            r2 = 0
            if (r1 == 0) goto L_0x01dc
            java.lang.String r0 = "make_metadata_request"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x0172
            X.03q r0 = r5.A0Q()
            r3 = 0
            if (r0 == 0) goto L_0x0144
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0144
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0144
            java.lang.String r0 = "message_id"
            java.lang.String r17 = r1.getString(r0)
        L_0x0104:
            X.03q r0 = r5.A0Q()
            if (r0 == 0) goto L_0x0141
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0141
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0141
            java.lang.String r0 = "session_id"
            java.lang.String r18 = r1.getString(r0)
        L_0x011d:
            android.os.Bundle r1 = r5.A06
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A08(r0)
            java.lang.String r0 = "flow_id"
            java.lang.String r9 = r1.getString(r0)
            if (r15 == 0) goto L_0x0160
            if (r9 == 0) goto L_0x0160
            com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel r0 = r5.A0F
            java.lang.String r11 = "waFlowsViewModel"
            if (r0 != 0) goto L_0x0147
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0141:
            r18 = r2
            goto L_0x011d
        L_0x0144:
            r17 = r2
            goto L_0x0104
        L_0x0147:
            X.08M r10 = r0.A05
            X.0sA r2 = r5.A0V()
            X.420 r1 = new X.420
            r1.<init>(r5)
            r0 = 102(0x66, float:1.43E-43)
            X.AnonymousClass4K2.A00(r2, r10, r1, r0)
            com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel r2 = r5.A0F
            if (r2 != 0) goto L_0x0176
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r11)
            throw r0
        L_0x0160:
            r1 = 2131889286(0x7f120c86, float:1.9413231E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1)
            X.C162457s7.A0D(r0)
            r5.A1a(r0, r2)
            goto L_0x01dc
        L_0x0172:
            r5.A1Z(r6, r2)
            goto L_0x01dc
        L_0x0176:
            X.2sH r0 = r2.A08
            long r13 = r0.A0H()
            X.2of r1 = r2.A09
            java.lang.String r0 = r15.user
            long r11 = r1.A00(r0, r9)
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0193
            X.1VX r1 = r2.A0H
            r0 = 2892(0xb4c, float:4.053E-42)
            long r0 = X.C56952sp.A05(r1, r0)
            long r0 = r0 + r11
        L_0x0193:
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01e8
            X.08M r1 = r2.A05
            java.lang.String r0 = "extensions-banned-id-error"
        L_0x019b:
            r1.A0G(r0)
        L_0x019e:
            android.widget.ProgressBar r0 = r5.A02
            if (r0 == 0) goto L_0x01a5
            r0.setVisibility(r8)
        L_0x01a5:
            android.content.Context r1 = r5.A0G()
            r0 = 2131231081(0x7f080169, float:1.8078233E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r1, r0)
            android.widget.ProgressBar r0 = r5.A02
            if (r0 == 0) goto L_0x01ce
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            if (r3 == 0) goto L_0x01ce
            X.03q r0 = r5.A0R()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            r3.height = r0
        L_0x01ce:
            android.widget.ProgressBar r0 = r5.A02
            if (r0 == 0) goto L_0x01d5
            r0.setLayoutParams(r3)
        L_0x01d5:
            android.widget.ProgressBar r0 = r5.A02
            if (r0 == 0) goto L_0x01dc
            r0.setIndeterminateDrawable(r1)
        L_0x01dc:
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r0 = r5.A0E
            if (r0 != 0) goto L_0x0244
            java.lang.String r0 = "waExtensionsNavBarViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01e8:
            X.1Ud r10 = r2.A0F
            java.lang.String r0 = "user_interaction"
            int r23 = r10.A0C(r15, r0)
            X.2rW r14 = r2.A0D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            X.2Kt r0 = r14.A00(r15, r1)
            if (r0 == 0) goto L_0x0225
            java.util.List r0 = r0.A01
            java.util.Iterator r12 = r0.iterator()
        L_0x0203:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r12.next()
            X.2nk r0 = (X.C53832nk) r0
            java.lang.String r11 = r0.A03
            boolean r11 = X.C162457s7.A0P(r11, r9)
            if (r11 == 0) goto L_0x0203
            r9 = 2
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            r10.A0E(r1, r9)
            X.08M r1 = r2.A01
            java.lang.String r0 = r0.A00
            goto L_0x019b
        L_0x0225:
            X.4JN r13 = new X.4JN
            r19 = r13
            r20 = r2
            r21 = r15
            r22 = r9
            r24 = r8
            r19.<init>(r20, r21, r22, r23, r24)
            X.4FS r0 = r14.A09
            X.3b8 r12 = new X.3b8
            r19 = r4
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.BkM(r12)
            goto L_0x019e
        L_0x0244:
            java.lang.String r0 = r0.A01
            java.lang.String r9 = "1"
            boolean r2 = X.C162457s7.A0P(r0, r9)
            com.whatsapp.WaImageView r1 = r5.A06
            if (r1 == 0) goto L_0x0257
            int r0 = X.AnonymousClass001.A08(r2)
            r1.setVisibility(r0)
        L_0x0257:
            com.whatsapp.WaTextView r1 = r5.A08
            if (r1 == 0) goto L_0x0264
            r0 = r2 ^ 1
            if (r0 != 0) goto L_0x0261
            r7 = 8
        L_0x0261:
            r1.setVisibility(r7)
        L_0x0264:
            android.os.Bundle r0 = r5.A06
            r3 = 0
            if (r0 == 0) goto L_0x026d
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A01(r0)
        L_0x026d:
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r0 = r5.A0E
            java.lang.String r10 = "waExtensionsNavBarViewModel"
            if (r0 != 0) goto L_0x0279
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x0279:
            X.08M r2 = r0.A04
            java.lang.String r0 = r0.A01
            boolean r1 = r9.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0285
            r0 = 0
        L_0x0285:
            X.C18320x8.A18(r2, r0)
            android.net.Uri r0 = r5.A00
            if (r0 == 0) goto L_0x02da
            com.whatsapp.FAQTextView r7 = r5.A05
            if (r7 == 0) goto L_0x02da
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r0 = r5.A0E
            if (r0 != 0) goto L_0x0299
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x0299:
            android.content.Context r9 = r5.A0G()
            X.2rx r0 = r0.A09
            X.2qS r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x02b8
            java.lang.String r3 = r0.A08
            if (r3 == 0) goto L_0x02b8
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131889280(0x7f120c80, float:1.941322E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C18320x8.A0b(r2, r3, r0, r8, r1)
            if (r0 != 0) goto L_0x02bf
        L_0x02b8:
            r0 = 2131889281(0x7f120c81, float:1.9413221E38)
            java.lang.String r0 = X.C18290x4.A0l(r9, r0)
        L_0x02bf:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel r0 = r5.A0E
            if (r0 != 0) goto L_0x02cd
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r10)
            throw r0
        L_0x02cd:
            X.1VX r2 = r0.A0A
            r1 = 2069(0x815, float:2.899E-42)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r0 = r2.A0R(r0, r1)
            r7.setEducationTextFromArticleID(r3, r0)
        L_0x02da:
            com.whatsapp.FAQTextView r2 = r5.A05
            if (r2 == 0) goto L_0x02ea
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            X.3A1 r0 = new X.3A1
            r0.<init>(r2)
            r1.addOnGlobalLayoutListener(r0)
        L_0x02ea:
            android.app.Dialog r0 = r5.A1I()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x02f9
            r0 = 16
            r1.setSoftInputMode(r0)
        L_0x02f9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0w(Bundle bundle, View view) {
        Intent intent;
        Bundle extras;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0E;
        String str = null;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel.A03, new AnonymousClass421(this), 103);
        C003203q A0Q = A0Q();
        if (!(A0Q == null || (intent = A0Q.getIntent()) == null || (extras = intent.getExtras()) == null)) {
            str = extras.getString("message_id");
        }
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel2 = this.A0E;
        if (waExtensionsNavBarViewModel2 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        waExtensionsNavBarViewModel2.A0D.BkM(new C117715sN(waExtensionsNavBarViewModel2, this.A0I, str, 44));
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel3 = this.A0E;
        if (waExtensionsNavBarViewModel3 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel3.A02, new AnonymousClass422(this), 104);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel4 = this.A0E;
        if (waExtensionsNavBarViewModel4 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel4.A07, new AnonymousClass423(this), 105);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel5 = this.A0E;
        if (waExtensionsNavBarViewModel5 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel5.A05, new AnonymousClass424(this), 106);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel6 = this.A0E;
        if (waExtensionsNavBarViewModel6 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel6.A06, new AnonymousClass425(this), 107);
        WaFlowsViewModel waFlowsViewModel = this.A0F;
        if (waFlowsViewModel == null) {
            throw C18270x1.A0S("waFlowsViewModel");
        }
        AnonymousClass4K2.A00(this, waFlowsViewModel.A01, new AnonymousClass426(this), C627136h.A03);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel7 = this.A0E;
        if (waExtensionsNavBarViewModel7 == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass4K2.A00(this, waExtensionsNavBarViewModel7.A04, new AnonymousClass427(this), 109);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        Bundle bundle;
        boolean A1Y = AnonymousClass0x2.A1Y(menu, menuInflater);
        if (this.A00 != null) {
            menu.add(0, A1Y, 0, C08310eF.A09(this).getString(R.string.f11nameremoved)).setShowAsAction(0);
        }
        if (this.A0J != null && (bundle = this.A06) != null && bundle.getBoolean("show_report_menu", false)) {
            menu.add(A1Y ? 1 : 0, 2, 0, C08310eF.A09(this).getString(R.string.f11nameremoved));
        }
    }

    public final void A1a(String str, String str2) {
        String str3 = str2;
        if (str2 != null) {
            C60032xt r0 = this.A0B;
            if (r0 != null) {
                C003203q A0Q = A0Q();
                C66543Lv r3 = this.A0C;
                if (r3 != null) {
                    C56422rx r2 = this.A0A;
                    if (r2 != null) {
                        C50312hy r4 = this.A0G;
                        if (r4 != null) {
                            r0.A01(A0Q, r2, r3, r4, str3, (String) null);
                        } else {
                            throw C18270x1.A0S("wamExtensionsStructuredMessageInteractionReporter");
                        }
                    } else {
                        throw C18270x1.A0S("verifiedNameManager");
                    }
                } else {
                    throw C18270x1.A0S("coreMessageStore");
                }
            } else {
                throw C18270x1.A0S("extensionsDataUtil");
            }
        }
        C18270x1.A0p(this.A02);
        WaTextView waTextView = this.A07;
        if (waTextView != null) {
            waTextView.setVisibility(0);
            waTextView.setText(str);
        }
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0E;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        AnonymousClass08M r22 = waExtensionsNavBarViewModel.A04;
        boolean equals = "1".equals(waExtensionsNavBarViewModel.A01);
        boolean z = true;
        if (equals) {
            z = false;
        }
        C18320x8.A18(r22, z);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C18310x6.A1A(this);
    }

    public void A0g() {
        AnonymousClass1VX r2 = this.A0H;
        if (r2 != null) {
            int A0O = r2.A0O(C58422vE.A02, 3319);
            View view = this.A0B;
            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.wabloks.ui.PercentageBasedMaxHeightLinearLayout");
            ((PercentageBasedMaxHeightLinearLayout) view).A00 = A0O;
            super.A0g();
            return;
        }
        throw C18270x1.A0R();
    }

    public final void A1Y() {
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0E;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        boolean A1Q = AnonymousClass0x9.A1Q(waExtensionsNavBarViewModel.A05.A07());
        C003203q A0R = A0R();
        if (A1Q) {
            A0R.onBackPressed();
        } else {
            A0R.finish();
        }
    }

    public final void A1Z(View view, String str) {
        AnonymousClass39C r4;
        Bundle bundle = this.A06;
        if (bundle != null) {
            View A0E2 = C18280x3.A0E(view, R.id.wa_fcs_bottom_sheet_fragment_container);
            C08240dc r5 = new C08240dc(A0T());
            String string = bundle.getString("screen_name");
            if (!C162457s7.A0P(str, "DRAFT")) {
                r4 = (AnonymousClass39C) bundle.getParcelable("screen_cache_config");
            } else {
                r4 = null;
            }
            C162457s7.A0H(string);
            String string2 = bundle.getString("screen_params");
            String string3 = bundle.getString("qpl_param_map");
            C162457s7.A0J(string, 0);
            WaBkExtensionsScreenFragment waBkExtensionsScreenFragment = new WaBkExtensionsScreenFragment();
            waBkExtensionsScreenFragment.A1Q(string);
            waBkExtensionsScreenFragment.A1P(string2);
            waBkExtensionsScreenFragment.A1M(r4);
            waBkExtensionsScreenFragment.A1K();
            waBkExtensionsScreenFragment.A0H().putSerializable("qpl_params", string3);
            r5.A0E(waBkExtensionsScreenFragment, "BK_FRAGMENT", A0E2.getId());
            r5.A01();
        }
    }

    public void A0p(Bundle bundle) {
        Uri uri;
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
        this.A0E = (WaExtensionsNavBarViewModel) C18290x4.A0O(this).A01(WaExtensionsNavBarViewModel.class);
        this.A0F = (WaFlowsViewModel) C18290x4.A0O(this).A01(WaFlowsViewModel.class);
        WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.A0E;
        UserJid userJid = null;
        if (waExtensionsNavBarViewModel == null) {
            throw C18270x1.A0S("waExtensionsNavBarViewModel");
        }
        String A0R = waExtensionsNavBarViewModel.A0A.A0R(C58422vE.A02, 2069);
        if (!C107575bX.A0F(A0R)) {
            Uri.Builder appendPath = waExtensionsNavBarViewModel.A0C.A01().appendPath(A0R);
            C162457s7.A0D(appendPath);
            uri = appendPath.build();
        } else {
            uri = null;
        }
        this.A00 = uri;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            userJid = AnonymousClass32Y.A01(bundle2);
        }
        this.A0I = userJid;
    }

    public boolean A1B(MenuItem menuItem) {
        UserJid A012;
        int A042 = C18290x4.A04(menuItem);
        if (A042 == 1) {
            Uri uri = this.A00;
            if (uri == null) {
                return false;
            }
            uri.toString();
            A0R().startActivity(C18310x6.A0D(uri));
        } else if (A042 != 2) {
            return false;
        } else {
            Bundle bundle = this.A06;
            if (!(bundle == null || (A012 = AnonymousClass32Y.A01(bundle)) == null)) {
                C29041iB r0 = this.A0D;
                if (r0 != null) {
                    r0.A08().A03(new C86264Jl(this, 2, A012));
                    return false;
                }
                throw C18270x1.A0S("companionDeviceManager");
            }
        }
        return true;
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        C162457s7.A0K(A1J, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass4SH r4 = (AnonymousClass4SH) A1J;
        C44052Um r3 = this.A04;
        if (r3 != null) {
            C003203q A0R = A0R();
            AnonymousClass40L r1 = AnonymousClass40L.A00;
            C162457s7.A0J(r4, 1);
            r4.setOnShowListener(new AnonymousClass37G(A0R, r4, r3, r1));
            return r4;
        }
        throw C18270x1.A0S("bottomSheetDragBehavior");
    }
}
