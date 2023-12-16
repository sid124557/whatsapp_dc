package com.whatsapp.accountsync;

import X.AnonymousClass001;
import X.AnonymousClass0N6;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1Fh;
import X.AnonymousClass317;
import X.AnonymousClass32Y;
import X.AnonymousClass3ZH;
import X.C112455jl;
import X.C116985rC;
import X.C18260x0;
import X.C33701tY;
import X.C44772Xk;
import X.C56972sr;
import X.C621433s;
import X.C627736r;
import X.C64773Ex;
import X.C66493Lq;
import X.C72303dV;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileActivity extends AnonymousClass1Fh {
    public C116985rC A00;
    public C33701tY A01 = null;
    public AnonymousClass0N6 A02;
    public C44772Xk A03;
    public C64773Ex A04;
    public C72303dV A05;
    public C66493Lq A06;
    public WhatsAppLibLoader A07;
    public AnonymousClass317 A08;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A79();
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void A79() {
        Cursor A032;
        if (BHW()) {
            Log.w("sync profile activity already finishing, ignoring gotoActivity call");
        } else if (!this.A03.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, true);
        } else {
            if (!(getIntent().getData() == null || this.A01.A0Y() || (A032 = this.A08.A0R().A03(getIntent().getData(), (String[]) null, (String) null, (String[]) null, (String) null)) == null)) {
                try {
                    if (A032.moveToFirst()) {
                        String A0Z = AnonymousClass0x2.A0Z(A032, "mimetype");
                        UserJid A082 = AnonymousClass32Y.A08(AnonymousClass0x2.A0Z(A032, "data1"));
                        if (A082 != null) {
                            if (this instanceof CallContactLandingActivity) {
                                CallContactLandingActivity callContactLandingActivity = (CallContactLandingActivity) this;
                                AnonymousClass3ZH A0A = callContactLandingActivity.A04.A0A(A082);
                                if ("vnd.android.cursor.item/vnd.com.whatsapp.voip.call".equals(A0Z)) {
                                    ((C112455jl) callContactLandingActivity.A00).Bpk(callContactLandingActivity, A0A, 14, false);
                                } else if ("vnd.android.cursor.item/vnd.com.whatsapp.video.call".equals(A0Z)) {
                                    callContactLandingActivity.A00.Bpk(callContactLandingActivity, A0A, 14, true);
                                }
                            } else {
                                AnonymousClass3ZH A0A2 = this.A04.A0A(A082);
                                if ("vnd.android.cursor.item/vnd.com.whatsapp.profile".equals(A0Z)) {
                                    this.A00.A0B(this, C627736r.A0N(this, A0A2));
                                }
                            }
                            finish();
                            A032.close();
                            return;
                        }
                    }
                    A032.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("failed to go anywhere from sync profile activity; intent=");
            C18260x0.A0n(getIntent(), A0o);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A07.A03()) {
            Log.i("aborting due to native libraries missing");
        } else if (C56972sr.A00(this.A01) == null || !this.A09.A02()) {
            this.A05.A0H(R.string.f11nameremoved, 1);
        } else if (C72303dV.A00(this.A05)) {
            A75();
            return;
        } else if (this.A01.Ayl()) {
            int A0B = AnonymousClass0x7.A0N(this.A02).A0B();
            C18260x0.A0y("profileactivity/create/backupfilesfound ", AnonymousClass001.A0o(), A0B);
            if (A0B > 0) {
                C621433s.A01(this, 105);
                return;
            } else {
                A78(false);
                return;
            }
        } else {
            return;
        }
        finish();
    }
}
