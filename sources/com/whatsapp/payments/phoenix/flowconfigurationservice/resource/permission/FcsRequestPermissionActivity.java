package com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass20M;
import X.AnonymousClass2CT;
import X.AnonymousClass4G9;
import X.AnonymousClass5ZR;
import X.AnonymousClass97k;
import X.C159127lA;
import X.C161447pg;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C44512Wi;
import X.C44522Wj;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import java.util.Map;

public final class FcsRequestPermissionActivity extends AnonymousClass97k {
    public AnonymousClass2CT A00;
    public AnonymousClass5ZR A01;
    public C44512Wi A02;
    public C44522Wj A03;
    public String A04;
    public final Map A05 = C18320x8.A0r();

    public final void A74() {
        C159127lA r1;
        AnonymousClass4G9 r12;
        C44522Wj r13 = this.A03;
        if (r13 != null) {
            String str = this.A04;
            if (str == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r13.A00(str);
            if (!(A002 == null || (r1 = A002.A00) == null || (r12 = (AnonymousClass4G9) r1.A00("request_permission")) == null)) {
                r12.B3J(this.A05);
            }
            finish();
            return;
        }
        throw C18270x1.A0S("fdsManagerRegistry");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 153 || i == 155) {
            Map map = this.A05;
            if (i2 == -1) {
                str = "GRANTED";
            } else {
                str = "NOT_GRANTED";
            }
            map.put("permission_result", str);
            A74();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A02 = r0;
            Class<FcsRequestPermissionActivity> cls = FcsRequestPermissionActivity.class;
            if (!r0.A00(bundle)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o);
                C18260x0.A1K(A0o, ": Activity cannot be launch because it is no longer save to create this activity");
                finish();
                return;
            }
            String A1r = AnonymousClass1Ha.A1r(this);
            if (A1r != null) {
                this.A04 = A1r;
                String stringExtra = getIntent().getStringExtra("extra_permission");
                if (stringExtra == null) {
                    this.A05.put("permission_result", "null_permission");
                    A74();
                    return;
                }
                int ordinal = AnonymousClass20M.valueOf(stringExtra).ordinal();
                if (ordinal == 0) {
                    RequestPermissionActivity.A0a(this);
                } else if (ordinal == 1) {
                    AnonymousClass5ZR r02 = this.A01;
                    if (r02 != null) {
                        RequestPermissionActivity.A0g(this, r02);
                        return;
                    }
                    throw C18270x1.A0S("waPermissionsHelper");
                }
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A0N(cls, A0o2);
                throw AnonymousClass0x2.A0V("/onCreate: FDS Manager ID is null", A0o2);
            }
        } else {
            throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
        }
    }
}
