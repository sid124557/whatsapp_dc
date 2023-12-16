package com.whatsapp.softenforcementsmb;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1Fp;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18290x4;
import X.C25471aZ;
import X.C50242hr;
import X.C58422vE;
import X.C59952xl;
import X.C64333Db;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class BusinessPolicyView extends WaInAppBrowsingActivity {
    public long A00;
    public C59952xl A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            AnonymousClass1Fp.A0C(A002, r0, this);
            this.A01 = (C59952xl) A002.AU6.get();
        }
    }

    public void onBackPressed() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A00);
        try {
            C50242hr r5 = new C50242hr(AnonymousClass0x9.A1H(getIntent().getStringExtra("notificationJSONObject")));
            C59952xl r4 = this.A01;
            Integer A0a = C18290x4.A0a();
            Long valueOf = Long.valueOf(seconds);
            C25471aZ r3 = new C25471aZ();
            r3.A06 = r5.A05;
            r3.A08 = r5.A07;
            r3.A05 = r5.A04;
            r3.A04 = AnonymousClass0x9.A0m(r5.A00);
            r3.A07 = r5.A06;
            r3.A00 = AnonymousClass001.A0f();
            r3.A01 = A0a;
            r3.A02 = A0a;
            r3.A03 = valueOf;
            if (!r4.A00.A0Y(C58422vE.A02, 1730)) {
                r4.A01.BhD(r3);
            }
        } catch (JSONException e) {
            Log.e("Error deserializing JSON String: notificationJSONObject", e);
        }
        super.onBackPressed();
    }

    public BusinessPolicyView(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 118);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = System.currentTimeMillis();
    }

    public BusinessPolicyView() {
        this(0);
    }
}
