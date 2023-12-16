package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass3UY;
import X.AnonymousClass4A7;
import X.AnonymousClass4FW;
import X.AnonymousClass4SG;
import X.AnonymousClass543;
import X.AnonymousClass675;
import X.AnonymousClass679;
import X.AnonymousClass68W;
import X.C104395Qu;
import X.C107695bk;
import X.C112975kg;
import X.C124166Bf;
import X.C22701Pt;
import X.C49472ga;
import X.C56922sm;
import X.C56972sr;
import X.C64333Db;
import X.C66533Lu;
import X.C86604Kt;
import X.C86614Ku;
import X.C88834as;
import X.C93544ok;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;

public class KeptMessagesActivity extends C93544ok {
    public ProgressBar A00;
    public ScrollView A01;
    public WaTextView A02;
    public AnonymousClass3UY A03;
    public C104395Qu A04;
    public boolean A05;
    public final AnonymousClass4FW A06;

    public /* bridge */ /* synthetic */ AnonymousClass675 A75() {
        AnonymousClass543 r10 = new AnonymousClass543(this, 48, this.A00);
        C56972sr r3 = this.A01;
        C112975kg r0 = this.A00;
        return new C22701Pt(this, r3, r0.A0C, r0.A0F, this.A07, r0.A0M, this, r0.A0y, r10);
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3i(this);
            AnonymousClass4SG.A3G(A2X, r2, r1, this, r2.AUW);
            this.A04 = r2.AkR();
            this.A03 = new AnonymousClass3UY(C86604Kt.A0V(r2), (C56922sm) r2.A58.get(), (C49472ga) r2.A7g.get(), (C66533Lu) r2.AFp.get(), C86614Ku.A0a(r2));
        }
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A00.A0Q.A07;
    }

    public void onDestroy() {
        this.A00.A0a.A07(this.A06);
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        super.onDestroy();
    }

    public KeptMessagesActivity(int i) {
        this.A05 = false;
        AnonymousClass68W.A00(this, 43);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f6, code lost:
        if (r0 == false) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131890355(0x7f1210b3, float:1.94154E38)
            r9.setTitle(r0)
            X.5kg r0 = r9.A00
            X.1io r1 = r0.A0a
            X.4FW r0 = r9.A06
            r1.A06(r0)
            X.5Qu r4 = r9.A04
            X.4uZ r5 = r9.A0F
            X.C626936e.A06(r5)
            android.content.Intent r3 = r9.getIntent()
            java.lang.String r2 = "keptMessageCount"
            r0 = 0
            long r7 = r3.getLongExtra(r2, r0)
            X.1b6 r3 = new X.1b6
            r3.<init>()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r3.A04 = r0
            r6 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.A06 = r0
            X.2ss r1 = r4.A04
            X.3Ex r0 = r4.A02
            int r0 = X.AnonymousClass352.A00(r0, r1, r5)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r3.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r3.A0C = r0
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 == 0) goto L_0x00ff
            X.2sj r2 = r4.A05
            r0 = r5
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r2.A0C(r0)
            boolean r0 = r2.A0D(r0)
            if (r1 == 0) goto L_0x00fc
            if (r0 == 0) goto L_0x00fc
        L_0x0062:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x006a:
            r3.A01 = r0
            X.30N r1 = r4.A07
            java.lang.String r0 = r5.getRawString()
            java.lang.String r0 = r1.A04(r0)
            r3.A0E = r0
            X.4FV r0 = r4.A06
            r0.BhD(r3)
            r0 = 2131625249(0x7f0e0521, float:1.88777E38)
            r9.setContentView((int) r0)
            android.widget.ListView r4 = r9.getListView()
            r2 = 0
            r4.setFastScrollEnabled(r2)
            r0 = 1
            r4.setScrollbarFadingEnabled(r0)
            android.widget.AbsListView$OnScrollListener r0 = r9.A0J
            r4.setOnScrollListener(r0)
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131624584(0x7f0e0288, float:1.8876352E38)
            android.view.View r3 = r1.inflate(r0, r4, r2)
            r0 = 2131429131(0x7f0b070b, float:1.8479926E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r3, r0)
            if (r2 == 0) goto L_0x00c2
            X.4uZ r1 = r9.A0F
            if (r1 == 0) goto L_0x00c2
            X.5kg r0 = r9.A00
            X.3Ex r0 = r0.A0C
            X.3ZH r1 = r0.A07(r1)
            X.4uZ r0 = r9.A0F
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 != 0) goto L_0x00ef
            r1 = 2131890363(0x7f1210bb, float:1.9415416E38)
        L_0x00bf:
            r2.setText(r1)
        L_0x00c2:
            r4.addHeaderView(r3)
            X.675 r0 = r9.A05
            r9.A74(r0)
            r0 = 2131429766(0x7f0b0986, float:1.8481214E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r9.A01 = r0
            r0 = 2131433330(0x7f0b1772, float:1.8488443E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r9.A02 = r0
            r0 = 2131432721(0x7f0b1511, float:1.8487207E38)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A00 = r0
            r9.A78()
            return
        L_0x00ef:
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.A14
            r1 = 2131890362(0x7f1210ba, float:1.9415414E38)
            if (r0 != 0) goto L_0x00bf
        L_0x00f8:
            r1 = 2131890361(0x7f1210b9, float:1.9415412E38)
            goto L_0x00bf
        L_0x00fc:
            r6 = 0
            goto L_0x0062
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        EphemeralDmKicBottomSheetDialog.A00(getSupportFragmentManager(), this.A09, (AnonymousClass4A7) null, this.A0F, 4);
    }

    public KeptMessagesActivity() {
        this(0);
        this.A06 = new C124166Bf(this, 6);
    }
}
