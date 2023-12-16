package com.whatsapp.account.delete;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass30P;
import X.AnonymousClass33S;
import X.AnonymousClass4CG;
import X.AnonymousClass4HY;
import X.AnonymousClass5V0;
import X.C116985rC;
import X.C18260x0;
import X.C18320x8;
import X.C1907099n;
import X.C19340zH;
import X.C28911hy;
import X.C614930z;
import X.C627736r;
import X.C88834as;
import X.C89644eZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class DeleteAccountConfirmation extends C89644eZ {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public C116985rC A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass4CG A07;
    public C28911hy A08;
    public C614930z A09;
    public AnonymousClass30P A0A;
    public AnonymousClass33S A0B;
    public C1907099n A0C;
    public WDSButton A0D;
    public boolean A0E;

    public Dialog onCreateDialog(int i) {
        C19340zH r3;
        int i2;
        int i3;
        if (i != 1) {
            if (i == 2) {
                r3 = AnonymousClass5V0.A00(this);
                r3.A0g(AnonymousClass002.A0F(this, getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved));
                i2 = R.string.f11nameremoved;
                i3 = 17;
            } else if (i != 3) {
                return super.onCreateDialog(i);
            } else {
                r3 = AnonymousClass5V0.A00(this);
                r3.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 18;
            }
            C19340zH.A08(r3, this, i3, i2);
            return r3.create();
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C18320x8.A0w(progressDialog, this, R.string.f11nameremoved);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            ((C88834as) AnonymousClass0x9.A0K(this)).ADV(this);
        }
    }

    public DeleteAccountConfirmation(int i) {
        this.A0E = false;
        AnonymousClass4HY.A00(this, 7);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass1Ha.A1y(this.A03.getViewTreeObserver(), this, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            X.2sr r0 = r5.A01
            X.1fH r0 = r0.A0H()
            r2 = 1
            if (r0 != 0) goto L_0x0013
            android.content.Intent r0 = X.C627736r.A01(r5)
            r5.A6T(r0, r2)
        L_0x0013:
            X.2jE r1 = r5.A09
            X.0yE r0 = new X.0yE
            r0.<init>(r5, r1)
            r5.A01 = r0
            X.3Cv r0 = new X.3Cv
            r0.<init>(r5)
            r5.A07 = r0
            r0 = 2131893611(0x7f121d6b, float:1.9422003E38)
            X.0R8 r0 = X.AnonymousClass1Ha.A1l(r5, r0)
            if (r0 == 0) goto L_0x002f
            r0.A0N(r2)
        L_0x002f:
            r0 = 2131624733(0x7f0e031d, float:1.8876654E38)
            r5.setContentView((int) r0)
            r0 = 2131433256(0x7f0b1728, float:1.8488293E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r5.A03 = r0
            r0 = 2131428112(0x7f0b0310, float:1.847786E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A02 = r0
            r0 = 2131429356(0x7f0b07ec, float:1.8480382E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r5.A0D = r0
            r0 = 2131429354(0x7f0b07ea, float:1.8480378E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r5.A06 = r0
            r0 = 2131429351(0x7f0b07e7, float:1.8480372E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r5.A05 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A0D
            r0 = 27
            X.C18280x3.A0p(r1, r5, r0)
            r3 = 8
            X.30z r0 = r5.A09     // Catch:{ 24P -> 0x0099 }
            X.2nq r0 = r0.A01()     // Catch:{ 24P -> 0x0099 }
            if (r0 == 0) goto L_0x008e
            X.33j r1 = r5.A00     // Catch:{ 24P -> 0x0099 }
            java.lang.String r0 = r0.A06     // Catch:{ 24P -> 0x0099 }
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass32X.A00(r0)     // Catch:{ 24P -> 0x0099 }
            java.lang.String r0 = X.AnonymousClass36P.A03(r0)     // Catch:{ 24P -> 0x0099 }
            java.lang.String r1 = r1.A0I(r0)     // Catch:{ 24P -> 0x0099 }
            if (r1 == 0) goto L_0x0093
            goto L_0x00a9
        L_0x008e:
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/currentAccount is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 24P -> 0x0099 }
        L_0x0093:
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setVisibility(r3)
            goto L_0x00ae
        L_0x0099:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/InvalidJidException : "
            X.C18260x0.A1Q(r1, r0, r2)
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setVisibility(r3)
            goto L_0x00ae
        L_0x00a9:
            com.whatsapp.WaTextView r0 = r5.A06
            r0.setText(r1)
        L_0x00ae:
            r0 = 2131893606(0x7f121d66, float:1.9421993E38)
            java.lang.String r4 = r5.getString(r0)
            android.content.Context r0 = r5.getApplicationContext()
            boolean r0 = X.AnonymousClass0YV.A0F(r0)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0112
            X.33p r0 = r5.A09
            java.lang.String r0 = r0.A0X()
            if (r0 == 0) goto L_0x0112
            X.99n r0 = r5.A0C
            boolean r1 = r0.A02()
            r0 = 2131893607(0x7f121d67, float:1.9421995E38)
            if (r1 == 0) goto L_0x00d7
            r0 = 2131893608(0x7f121d68, float:1.9421997E38)
        L_0x00d7:
            java.lang.String r4 = X.AnonymousClass0x2.A0X(r5, r4, r2, r0)
        L_0x00db:
            com.whatsapp.WaTextView r0 = r5.A05
            r0.setText(r4)
            android.content.res.Resources r0 = r5.getResources()
            r2 = 2131168143(0x7f070b8f, float:1.795058E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r5.A00 = r0
            X.1hy r1 = r5.A08
            X.4CG r0 = r5.A07
            r1.A06(r0)
            int r0 = X.C18320x8.A00(r5, r2)
            r5.A00 = r0
            android.widget.ScrollView r0 = r5.A03
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.4Hy r0 = new X.4Hy
            r0.<init>(r5, r3)
            r1.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r5.A03
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            X.AnonymousClass1Ha.A1y(r0, r5, r3)
            return
        L_0x0112:
            X.99n r0 = r5.A0C
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00db
            r0 = 2131893609(0x7f121d69, float:1.9422E38)
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.delete.DeleteAccountConfirmation.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.A07(this.A07);
        this.A01.removeMessages(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        int A002 = this.A09.A00();
        C18260x0.A0w("DeleteAccountConfirmation/resume ", AnonymousClass001.A0o(), A002);
        if (!this.A09.A02() && A002 != 6) {
            C18260x0.A0x("DeleteAccountConfirmation/wrong-state bounce to main ", AnonymousClass001.A0o(), A002);
            startActivity(C627736r.A03(this));
            finish();
        }
    }

    public DeleteAccountConfirmation() {
        this(0);
    }
}
