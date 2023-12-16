package com.whatsapp.payments.ui;

import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass2X5;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import X.AnonymousClass4L0;
import X.AnonymousClass94v;
import X.AnonymousClass97a;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C005205m;
import X.C116985rC;
import X.C1899593h;
import X.C1904896y;
import X.C1907099n;
import X.C194259Se;
import X.C204249p3;
import X.C204759ps;
import X.C205049qL;
import X.C205139qU;
import X.C50382i5;
import X.C53602nM;
import X.C620933l;
import X.C625635p;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class ViralityLinkVerifierActivity extends AnonymousClass97a {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public C116985rC A05;
    public C50382i5 A06;
    public WaTextView A07;
    public WaTextView A08;
    public C53602nM A09;
    public C620933l A0A;
    public AnonymousClass9U5 A0B;
    public C1907099n A0C;
    public AnonymousClass9U4 A0D;
    public AnonymousClass94v A0E;
    public C194259Se A0F;
    public AnonymousClass2X5 A0G;
    public WDSButton A0H;
    public WDSButton A0I;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0E = (AnonymousClass94v) AnonymousClass4L0.A0F(new C204759ps(getIntent().getData(), 4, this), this).A01(AnonymousClass94v.class);
        setContentView((int) R.layout.f8nameremoved);
        C204249p3.A02(C005205m.A00(this, R.id.virality_activity_root_view), this, 118);
        this.A02 = C005205m.A00(this, R.id.actionable_container);
        this.A04 = C005205m.A00(this, R.id.virality_texts_container);
        this.A03 = C005205m.A00(this, R.id.progress_container);
        this.A08 = AnonymousClass0x7.A0L(this.A04, R.id.payment_enabled_or_not_title);
        this.A07 = AnonymousClass0x7.A0L(this.A04, R.id.virality_description_text);
        WDSButton wDSButton = (WDSButton) C005205m.A00(this, R.id.done_or_cancel_button);
        this.A0H = wDSButton;
        C204249p3.A02(wDSButton, this, 119);
        WDSButton wDSButton2 = (WDSButton) C005205m.A00(this, R.id.go_to_payments_button);
        this.A0I = wDSButton2;
        C204249p3.A02(wDSButton2, this, 120);
        this.A03.setVisibility(0);
        this.A04.setVisibility(8);
        this.A02.setVisibility(8);
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(C005205m.A00(this, R.id.virality_bottom_sheet));
        A012.A0R(0);
        A012.A0S(3);
        A012.A0a(new C1904896y(this));
        C1899593h.A0h(this);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
        AnonymousClass94v r4 = this.A0E;
        String str = r4.A09;
        if (str != null) {
            AnonymousClass9U5 r7 = r4.A04;
            String A013 = r4.A08.A01();
            if (A013 == null) {
                A013 = "";
            }
            AnonymousClass39V[] r5 = new AnonymousClass39V[2];
            boolean A0F2 = AnonymousClass39V.A0F("action", "verify-deep-link", r5);
            AnonymousClass39V[] r1 = new AnonymousClass39V[AnonymousClass39V.A0G("device-id", A013, r5)];
            AnonymousClass39V.A0B("payload", str, r1, A0F2 ? 1 : 0);
            AnonymousClass36K r6 = new AnonymousClass36K(AnonymousClass36K.A0I("link", r1), "account", r5);
            C205139qU r8 = new C205139qU(r4, 1);
            AnonymousClass31C r72 = r7.A07;
            String A032 = r72.A03();
            AnonymousClass39V[] r2 = new AnonymousClass39V[4];
            r2[0] = AnonymousClass39V.A00();
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2, 1);
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r2);
            r72.A0E(r8, AnonymousClass36K.A0E(r6, "xmlns", "w:pay", r2), A032, 204, C625635p.A0L);
        }
        C205049qL.A02(this, this.A0E.A00, 65);
    }
}
