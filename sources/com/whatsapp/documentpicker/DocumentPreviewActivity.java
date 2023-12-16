package com.whatsapp.documentpicker;

import X.AnonymousClass4SG;
import X.AnonymousClass5Ul;
import X.AnonymousClass5b1;
import X.C102855Kn;
import X.C103215Lz;
import X.C107105ah;
import X.C107695bk;
import X.C179308iw;
import X.C56042rK;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C88834as;
import X.C89134bh;
import X.C991554q;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.R;
import java.io.File;

public class DocumentPreviewActivity extends C89134bh implements C179308iw {
    public AnonymousClass5Ul A00;
    public C107105ah A01;
    public boolean A02;

    public void BW6(File file, String str) {
        File file2 = file;
        String str2 = str;
        super.BW6(file, str);
        if (isFinishing()) {
            return;
        }
        if (this.A01.A03(str)) {
            this.A04.BkO(new C991554q(this, this, this.A01, file2, str2), new Void[0]);
            return;
        }
        this.A01.setVisibility(8);
        this.A03.setVisibility(8);
        A79(file, str);
    }

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            this.A08 = C64333Db.A39(r1);
            this.A0A = C86634Kw.A0h(r1);
            this.A0C = C86604Kt.A0X(r1);
            this.A0B = C107695bk.A1m(r2);
            this.A0L = C86634Kw.A0s(r1);
            this.A05 = C64333Db.A26(r1);
            this.A06 = C64333Db.A28(r1);
            this.A0K = (C56042rK) r1.AEv.get();
            this.A0J = C86614Ku.A0m(r1);
            this.A0D = C107695bk.A1n(r2);
            this.A0G = C64333Db.A74(r1);
            this.A0H = C107695bk.A5D(r2);
            this.A0M = C72343dZ.A00(r1.A7Q);
            this.A04 = (C103215Lz) A2W.A11.get();
            this.A07 = C107695bk.A15(r2);
            this.A00 = C86644Kx.A0L(r1);
            this.A01 = (C107105ah) r1.A8a.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A79(java.io.File r7, java.lang.String r8) {
        /*
            r6 = this;
            android.view.View r1 = r6.A00
            r0 = 2131434722(0x7f0b1ce2, float:1.8491266E38)
            android.view.View r5 = X.C86614Ku.A0F(r1, r0)
            r0 = 2131429537(0x7f0b08a1, float:1.848075E38)
            android.widget.ImageView r2 = X.AnonymousClass0x9.A0E(r5, r0)
            r1 = 1
            r0 = 0
            android.graphics.drawable.Drawable r0 = X.AnonymousClass5VP.A01(r6, r8, r0, r1)
            r2.setImageDrawable(r0)
            r0 = 2131429535(0x7f0b089f, float:1.8480745E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r5, r0)
            java.lang.String r1 = r6.A78()
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r2 = X.C107575bX.A0D(r1, r0)
            r3.setText(r2)
            r0 = 2131429539(0x7f0b08a3, float:1.8480754E38)
            android.widget.TextView r4 = X.C18300x5.A0G(r5, r0)
            java.lang.String r0 = X.C106695a0.A02(r8)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r3 = r0.toUpperCase(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0052
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = X.C627536m.A08(r2)
            java.lang.String r3 = r0.toUpperCase(r1)
        L_0x0052:
            if (r7 == 0) goto L_0x0071
            r0 = 2131429543(0x7f0b08a7, float:1.8480762E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r5, r0)
            X.33j r2 = r6.A00
            long r0 = r7.length()
            X.C86634Kw.A1J(r5, r2, r0)
            X.5b1 r0 = X.C107105ah.A04     // Catch:{ 6ym -> 0x006b }
            int r1 = r0.A08(r7, r8)     // Catch:{ 6ym -> 0x006b }
            goto L_0x0072
        L_0x006b:
            r1 = move-exception
            java.lang.String r0 = "DocumentPreviewActivity/addStaticDocInfoView/ could not get page count"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0071:
            r1 = 0
        L_0x0072:
            X.33j r0 = r6.A00
            java.lang.String r2 = X.AnonymousClass5b1.A03(r0, r8, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x008c
            r1 = 2131888724(0x7f120a54, float:1.9412091E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r2, r3, r0)
            java.lang.String r3 = r6.getString(r1, r0)
        L_0x008c:
            r4.setText(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.documentpicker.DocumentPreviewActivity.A79(java.io.File, java.lang.String):void");
    }

    public DocumentPreviewActivity(int i) {
        this.A02 = false;
        C86604Kt.A1K(this, 40);
    }

    public final String A78() {
        if (getIntent().getParcelableExtra("uri") == null) {
            return getString(R.string.f11nameremoved);
        }
        return AnonymousClass5b1.A02((Uri) getIntent().getParcelableExtra("uri"), this.A08);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(A78());
    }

    public void onDestroy() {
        super.onDestroy();
        C102855Kn r2 = this.A0I;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A06.A0C();
            r2.A03.dismiss();
            this.A0I = null;
        }
    }

    public DocumentPreviewActivity() {
        this(0);
    }
}
