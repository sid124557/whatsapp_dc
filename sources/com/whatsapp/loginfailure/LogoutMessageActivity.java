package com.whatsapp.loginfailure;

import X.AnonymousClass317;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C64333Db;
import X.C85244Fm;
import X.C86614Ku;
import X.C89644eZ;

public final class LogoutMessageActivity extends C89644eZ {
    public C85244Fm A00;
    public AnonymousClass317 A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A00 = C64333Db.A05(A2Y);
            this.A01 = C86614Ku.A0i(A2Y);
        }
    }

    public LogoutMessageActivity(int i) {
        this.A02 = false;
        AnonymousClass68W.A00(this, 62);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (X.C162457s7.A0P(r6.A00.A07(), r1) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131625347(0x7f0e0583, float:1.88779E38)
            r6.setContentView((int) r0)
            android.view.View r1 = r6.A00
            r0 = 2131434242(0x7f0b1b02, float:1.8490292E38)
            android.view.View r3 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r3 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r3
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "logout_message_locale"
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)
            if (r1 == 0) goto L_0x002d
            X.33j r0 = r6.A00
            java.lang.String r0 = r0.A07()
            boolean r0 = X.C162457s7.A0P(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "main_button_text"
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)
            if (r2 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00bd
            boolean r0 = X.C159707mK.A00(r1)
            if (r0 != 0) goto L_0x00bd
        L_0x0042:
            r3.setPrimaryButtonText(r1)
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r5 = "logout_message_header"
            r1 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00b4
            r0 = 2131894918(0x7f122286, float:1.9424654E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0059:
            r3.setHeadlineText(r0)
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r6)
            r4 = 0
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 != 0) goto L_0x00a9
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            if (r0 != 0) goto L_0x00a9
            r0 = 2131892695(0x7f1219d7, float:1.9420146E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x007a:
            r3.setDescriptionText(r0)
            r1 = 0
            X.546 r0 = new X.546
            r0.<init>(r6, r6, r1, r2)
            r3.setPrimaryButtonClickListener(r0)
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "secondary_button_text"
            java.lang.String r1 = X.C18280x3.A0Z(r1, r0)
            if (r2 == 0) goto L_0x00a7
            if (r1 == 0) goto L_0x00a7
            boolean r0 = X.C159707mK.A00(r1)
            if (r0 != 0) goto L_0x00a7
        L_0x009a:
            r3.setSecondaryButtonText(r1)
            r1 = 1
            X.546 r0 = new X.546
            r0.<init>(r6, r6, r1, r2)
            r3.setSecondaryButtonClickListener(r0)
            return
        L_0x00a7:
            r1 = 0
            goto L_0x009a
        L_0x00a9:
            android.content.SharedPreferences r1 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = "logout_message_subtext"
            java.lang.String r0 = r1.getString(r0, r4)
            goto L_0x007a
        L_0x00b4:
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r6)
            java.lang.String r0 = r0.getString(r5, r1)
            goto L_0x0059
        L_0x00bd:
            android.content.Context r1 = r6.getBaseContext()
            r0 = 2131890560(0x7f121180, float:1.9415815E38)
            java.lang.String r1 = X.C18290x4.A0l(r1, r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.loginfailure.LogoutMessageActivity.onCreate(android.os.Bundle):void");
    }

    public LogoutMessageActivity() {
        this(0);
    }
}
