package com.whatsapp.companiondevice;

import X.AnonymousClass1Hf;
import X.AnonymousClass2R8;
import X.AnonymousClass33G;
import X.AnonymousClass49W;
import X.AnonymousClass4SG;
import X.AnonymousClass66R;
import X.AnonymousClass68W;
import X.AnonymousClass6C6;
import X.C1001359q;
import X.C107695bk;
import X.C116985rC;
import X.C119335wo;
import X.C119345wp;
import X.C119355wq;
import X.C1215260w;
import X.C1215360x;
import X.C154517dI;
import X.C18270x1;
import X.C29041iB;
import X.C50492iG;
import X.C64333Db;
import X.C70193a6;
import X.C88744aj;
import X.C89644eZ;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import java.util.Map;

public final class LinkedDeviceEditDeviceActivity extends C89644eZ implements AnonymousClass49W {
    public C116985rC A00;
    public C116985rC A01;
    public AnonymousClass33G A02;
    public C29041iB A03;
    public AnonymousClass2R8 A04;
    public DeviceJid A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db r2 = AnonymousClass4SG.A2X(this).A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            C88744aj r12 = C88744aj.A00;
            this.A00 = r12;
            this.A04 = (AnonymousClass2R8) r2.AWC.get();
            this.A01 = r12;
            this.A03 = C64333Db.A3S(r2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74() {
        /*
            r8 = this;
            X.33G r7 = r8.A02
            if (r7 != 0) goto L_0x0008
            r8.finish()
            return
        L_0x0008:
            android.view.View r1 = r8.A00
            r0 = 2131429436(0x7f0b083c, float:1.8480545E38)
            android.widget.ImageView r1 = X.C86604Kt.A0J(r1, r0)
            int r0 = X.C57112t6.A00(r7)
            r1.setImageResource(r0)
            android.view.View r1 = r8.A00
            r0 = 2131429437(0x7f0b083d, float:1.8480547E38)
            android.widget.TextView r1 = X.AnonymousClass0x2.A0I(r1, r0)
            X.1VX r0 = r8.A0D
            java.lang.String r2 = X.AnonymousClass33G.A01(r8, r7, r0)
            X.C162457s7.A0D(r2)
            r1.setText(r2)
            android.view.View r1 = r8.A00
            r0 = 2131429438(0x7f0b083e, float:1.8480549E38)
            android.view.View r1 = X.C18280x3.A0E(r1, r0)
            r5 = 0
            X.5f8 r0 = new X.5f8
            r0.<init>(r8, r7, r2, r5)
            r1.setOnClickListener(r0)
            android.view.View r1 = r8.A00
            r0 = 2131433943(0x7f0b19d7, float:1.8489686E38)
            android.widget.TextView r6 = X.AnonymousClass0x2.A0I(r1, r0)
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x00a6
            r0 = 2131890440(0x7f121108, float:1.9415572E38)
        L_0x0051:
            java.lang.String r0 = r8.getString(r0)
        L_0x0055:
            r6.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131432474(0x7f0b141a, float:1.8486706E38)
            android.widget.TextView r1 = X.AnonymousClass0x2.A0I(r1, r0)
            java.lang.String r0 = X.AnonymousClass33G.A00(r8, r7)
            r1.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131431098(0x7f0b0eba, float:1.8483916E38)
            android.view.View r6 = X.C18280x3.A0E(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131431110(0x7f0b0ec6, float:1.848394E38)
            android.widget.TextView r4 = X.AnonymousClass0x2.A0I(r1, r0)
            java.lang.String r3 = r7.A03
            r2 = 1
            if (r3 == 0) goto L_0x00a0
            boolean r0 = X.C175738Zn.A0V(r3)
            if (r0 != 0) goto L_0x00a0
            r6.setVisibility(r5)
            r1 = 2131890438(0x7f121106, float:1.9415568E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r5] = r3
            X.AnonymousClass001.A0y(r8, r4, r0, r1)
        L_0x0092:
            android.view.View r1 = r8.A00
            r0 = 2131431120(0x7f0b0ed0, float:1.848396E38)
            android.view.View r1 = X.C18280x3.A0E(r1, r0)
            r0 = 4
            X.C18310x6.A17(r1, r8, r0)
            return
        L_0x00a0:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x0092
        L_0x00a6:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00ae
            r0 = 2131890460(0x7f12111c, float:1.9415612E38)
            goto L_0x0051
        L_0x00ae:
            X.33j r4 = r8.A00
            long r2 = r7.A00
            X.1iB r0 = r8.A03
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.jid.DeviceJid r1 = r8.A05
            if (r1 != 0) goto L_0x00c1
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00c1:
            java.util.Set r0 = r0.A0R
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00d1
            r0 = 2131890428(0x7f1210fc, float:1.9415548E38)
            java.lang.String r0 = r4.A0B(r0)
            goto L_0x0055
        L_0x00d1:
            java.lang.CharSequence r0 = X.C107565bW.A02(r4, r2)
            goto L_0x0055
        L_0x00d6:
            java.lang.String r0 = "companionDeviceManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity.A74():void");
    }

    public void Bre(Map map) {
        boolean z;
        AnonymousClass33G r1 = this.A02;
        if (r1 != null && !r1.A02()) {
            Boolean bool = (Boolean) map.get(r1.A07);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.A07 = z;
            A74();
        }
    }

    public LinkedDeviceEditDeviceActivity(int i) {
        this.A06 = false;
        AnonymousClass68W.A00(this, 30);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = DeviceJid.Companion.A02(getIntent().getStringExtra("device_jid_raw_string"));
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass1Hf.A2E(this);
        AnonymousClass6C6.A02(this, ((LinkedDeviceEditDeviceViewModel) this.A0A.getValue()).A00, C1001359q.A00(this, 20), 150);
        AnonymousClass66R r3 = this.A08;
        AnonymousClass6C6.A02(this, ((LinkedDevicesSharedViewModel) r3.getValue()).A0Q, new C1215260w(this), 151);
        AnonymousClass6C6.A02(this, ((LinkedDevicesSharedViewModel) r3.getValue()).A0W, new C1215360x(this), 152);
        ((LinkedDevicesSharedViewModel) r3.getValue()).A0D();
        ((C50492iG) this.A09.getValue()).A00();
    }

    public void onDestroy() {
        super.onDestroy();
        ((LinkedDevicesSharedViewModel) this.A08.getValue()).A0E();
    }

    public void onStart() {
        super.onStart();
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.A0A.getValue();
        DeviceJid deviceJid = this.A05;
        if (deviceJid == null) {
            throw C18270x1.A0S("deviceJid");
        }
        C70193a6.A01(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 22);
    }

    public LinkedDeviceEditDeviceActivity() {
        this(0);
        this.A0A = C154517dI.A01(new C119355wq(this));
        this.A08 = C154517dI.A01(new C119335wo(this));
        this.A09 = C154517dI.A01(new C119345wp(this));
    }
}
