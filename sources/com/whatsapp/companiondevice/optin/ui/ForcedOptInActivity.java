package com.whatsapp.companiondevice.optin.ui;

import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass1VX;
import X.AnonymousClass2ZS;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4Uq;
import X.AnonymousClass68W;
import X.AnonymousClass698;
import X.AnonymousClass6BG;
import X.AnonymousClass6C6;
import X.C005205m;
import X.C107635bd;
import X.C107695bk;
import X.C110675gq;
import X.C111095hX;
import X.C18310x6;
import X.C620633i;
import X.C64333Db;
import X.C66433Lk;
import X.C69263Wi;
import X.C86604Kt;
import X.C89644eZ;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public class ForcedOptInActivity extends C89644eZ {
    public ProgressDialog A00;
    public View A01;
    public ScrollView A02;
    public TextEmojiLabel A03;
    public AnonymousClass2ZS A04;
    public AnonymousClass4Uq A05;
    public C66433Lk A06;
    public WDSButton A07;
    public boolean A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, (Toolbar) findViewById(R.id.title_toolbar));
        A2S.A0B(R.string.f11nameremoved);
        A2S.A0N(true);
        this.A02 = (ScrollView) C005205m.A00(this, R.id.scroll_view);
        this.A01 = C005205m.A00(this, R.id.update_sheet_shadow);
        this.A03 = (TextEmojiLabel) C005205m.A00(this, R.id.improvement_description);
        this.A07 = (WDSButton) C005205m.A00(this, R.id.update_button);
        C69263Wi r6 = this.A05;
        AnonymousClass4FS r10 = this.A04;
        this.A05 = (AnonymousClass4Uq) AnonymousClass4L0.A0F(new C110675gq(r6, this.A04, this.A07, this.A09, r10), this).A01(AnonymousClass4Uq.class);
        AnonymousClass1VX r102 = this.A0D;
        C69263Wi r7 = this.A05;
        C111095hX r62 = this.A00;
        C620633i r9 = this.A08;
        C107635bd.A0E(this, this.A06.A04("download-and-installation", "about-linked-devices"), r62, r7, this.A03, r9, r102, AnonymousClass002.A0F(this, "learn-more", new Object[1], 0, R.string.f11nameremoved), "learn-more");
        AnonymousClass6BG.A00(this.A02.getViewTreeObserver(), this, 11);
        this.A02.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass698(this, 0));
        C18310x6.A17(this.A07, this, 12);
        AnonymousClass6C6.A01(this, this.A05.A02, 154);
        AnonymousClass6C6.A01(this, this.A05.A06, 155);
        AnonymousClass6C6.A01(this, this.A05.A07, 156);
        AnonymousClass6C6.A01(this, this.A05.A01, 157);
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A06 = C86604Kt.A0e(A2Y);
            this.A04 = (AnonymousClass2ZS) r1.A7j.get();
        }
    }

    public ForcedOptInActivity(int i) {
        this.A08 = false;
        AnonymousClass68W.A00(this, 31);
    }

    public ForcedOptInActivity() {
        this(0);
    }
}
