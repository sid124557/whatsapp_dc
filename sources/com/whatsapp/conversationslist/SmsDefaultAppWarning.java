package com.whatsapp.conversationslist;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C1235268t;
import X.C1235568w;
import X.C19340zH;
import X.C48852fa;
import X.C621433s;
import X.C64333Db;
import X.C89644eZ;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.whatsapp.R;

public class SmsDefaultAppWarning extends C89644eZ {
    public C48852fa A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A00 = (C48852fa) r1.ABc.get();
        }
    }

    public final void A74() {
        this.A00.A00(this, getIntent().getData(), 17, AnonymousClass002.A0F(this, "https://whatsapp.com/dl/", AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        if (i == 0) {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            r2.A0X(C1235268t.A00(this, 44), R.string.f11nameremoved);
            C1235268t.A04(r2, this, 45, R.string.f11nameremoved);
            C1235268t.A03(r2, this, 46, R.string.f11nameremoved);
            i2 = 6;
        } else if (i != 1) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            r2.A0X(C1235268t.A00(this, 47), R.string.f11nameremoved);
            C1235268t.A03(r2, this, 48, R.string.f11nameremoved);
            i2 = 7;
        }
        r2.A0V(new C1235568w(this, i2));
        return r2.create();
    }

    public SmsDefaultAppWarning(int i) {
        this.A01 = false;
        AnonymousClass68W.A00(this, 51);
    }

    public void onCreate(Bundle bundle) {
        ActivityInfo activityInfo;
        super.onCreate(bundle);
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.SENDTO");
        A09.setData(getIntent().getData());
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(A09, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !"com.whatsapp".equals(activityInfo.packageName)) {
            C621433s.A01(this, 1);
        } else {
            C621433s.A01(this, 0);
        }
    }

    public SmsDefaultAppWarning() {
        this(0);
    }
}
