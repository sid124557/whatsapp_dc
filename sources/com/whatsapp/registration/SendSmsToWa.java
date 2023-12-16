package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VW;
import X.AnonymousClass317;
import X.AnonymousClass36l;
import X.AnonymousClass3DZ;
import X.AnonymousClass5V0;
import X.C02890Hz;
import X.C107695bk;
import X.C108935do;
import X.C1235268t;
import X.C141026uu;
import X.C153017aX;
import X.C162167rN;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C185138t9;
import X.C19340zH;
import X.C54292oU;
import X.C56612sH;
import X.C56912sl;
import X.C60152y5;
import X.C614930z;
import X.C620733j;
import X.C621433s;
import X.C625635p;
import X.C634339f;
import X.C64333Db;
import X.C69903Yy;
import X.C71543cH;
import X.C89644eZ;
import X.C994055p;
import X.C998958p;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public final class SendSmsToWa extends C89644eZ implements C185138t9 {
    public int A00;
    public C614930z A01;
    public C54292oU A02;
    public AnonymousClass1VW A03;
    public C60152y5 A04;
    public C56912sl A05;
    public AnonymousClass317 A06;
    public C153017aX A07;
    public C994055p A08;
    public boolean A09;
    public boolean A0A;
    public final Runnable A0B;

    public void BPK(C998958p r5, C108935do r6, String str) {
        boolean A1Y = AnonymousClass0x2.A1Y(str, r5);
        C18260x0.A1R(AnonymousClass001.A0o(), "SendSmsToWa/onCodeEntrypointResponse/status=", r5);
        if (r5.ordinal() != 0) {
            A78(5000);
            return;
        }
        C621433s.A00(this, A1Y ? 1 : 0);
        C621433s.A00(this, 2);
        AnonymousClass317 r1 = this.A06;
        if (r1 != null) {
            r1.A0B(4, A1Y);
            Intent A0A2 = C18280x3.A0A(this);
            A0A2.putExtra("use_sms_retriever", A1Y);
            A0A2.putExtra("request_code_method", str);
            A0A2.putExtra("request_code_status", 0);
            A0A2.putExtra("request_code_result", r6);
            A0A2.putExtra("code_verification_mode", 0);
            startActivity(A0A2);
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Hf.A2A(this);
        setContentView((int) R.layout.f8nameremoved);
        C614930z r2 = this.A01;
        if (r2 != null) {
            boolean A0B2 = r2.A0B(getIntent().getBooleanExtra("changeNumber", false));
            this.A0A = A0B2;
            AnonymousClass36l.A0K(this.A00, this, this.A00, R.id.send_sms_to_wa_title_toolbar, false, false, A0B2);
            AnonymousClass1VW r0 = this.A03;
            if (r0 != null) {
                AnonymousClass36l.A0M(this, r0, R.id.send_sms_to_wa_title_toolbar_text);
                C69903Yy r3 = new C69903Yy();
                String stringExtra = getIntent().getStringExtra("sendSmsNumber");
                r3.element = stringExtra;
                if (stringExtra == null || stringExtra.length() == 0) {
                    String A0Z = C18280x3.A0Z(A74(), "send_sms_number");
                    r3.element = A0Z;
                    if (A0Z == null || A0Z.length() == 0) {
                        A76();
                    }
                } else {
                    AnonymousClass317 r22 = this.A06;
                    if (r22 != null) {
                        r22.A0B(22, true);
                        C18270x1.A0j(A74().edit(), "send_sms_number", (String) r3.element);
                    } else {
                        throw C18270x1.A0S("registrationManager");
                    }
                }
                C634339f.A00(C18280x3.A0E(this.A00, R.id.send_sms_to_wa_button), this, r3, 19);
                return;
            }
            throw C18270x1.A0S("abPreChatdProps");
        }
        throw C18270x1.A0S("accountSwitcher");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = R.string.f11nameremoved;
        if (i != 1) {
            if (i != 2) {
                return super.onCreateDialog(i);
            }
            i2 = R.string.f11nameremoved;
        }
        return AnonymousClass36l.A06(this, getString(i2));
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A02 = C64333Db.A2q(A002);
            this.A03 = (AnonymousClass1VW) A002.A03.get();
            this.A01 = C64333Db.A0E(A002);
            this.A07 = (C153017aX) r1.A0h.get();
            this.A06 = (AnonymousClass317) A002.ATf.get();
            this.A05 = (C56912sl) A002.ATe.get();
            this.A04 = C64333Db.A74(A002);
        }
    }

    public final SharedPreferences A74() {
        C60152y5 r1 = this.A04;
        if (r1 != null) {
            return C60152y5.A02(r1, "send_sms_to_wa");
        }
        throw C18270x1.A0S("sharedPreferencesFactory");
    }

    public final String A75() {
        C620733j r3 = this.A00;
        String A0C = AnonymousClass36l.A0C(this.A09.A0Z(), this.A09.A0b());
        String str = null;
        if (A0C != null) {
            str = A0C.replace(' ', 160);
            C162457s7.A0D(str);
        }
        return r3.A0I(str);
    }

    public final void A76() {
        AnonymousClass317 r1 = this.A06;
        if (r1 != null) {
            r1.A0B(4, true);
            Intent A0A2 = C18280x3.A0A(this);
            A0A2.putExtra("return_to_phone_number", true);
            startActivity(A0A2);
            finish();
            return;
        }
        throw C18270x1.A0S("registrationManager");
    }

    public final void A77() {
        Log.i("SendSmsToWa/stopExecutingRequestCodeTask");
        C18290x4.A1L(this.A08);
        this.A04.BjN(this.A0B);
    }

    public final void A79(String str) {
        String replace;
        Intent A092 = AnonymousClass0x9.A09("android.intent.action.SENDTO");
        A092.setData(Uri.parse(AnonymousClass000.A0V("smsto:", str, AnonymousClass001.A0o())));
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(A092, 0);
        C162457s7.A0D(queryIntentActivities);
        if (C18310x6.A1X(queryIntentActivities)) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A092.setClassName(activityInfo.packageName, activityInfo.name);
            } else {
                A092.setPackage(defaultSmsPackage);
            }
            A092.putExtra("sms_body", getString(R.string.f11nameremoved));
            C18270x1.A0l(A74().edit(), "send_sms_intent_triggered", true);
            startActivity(A092);
            return;
        }
        Log.e("SendSmsToWa no sms activities");
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(R.string.f11nameremoved);
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = A75();
        C620733j r3 = this.A00;
        String A0Z = C18280x3.A0Z(A74(), "send_sms_number");
        if (A0Z == null) {
            Log.e("RegistrationUtils/prettyPrintPhoneNumber/fullPhoneNumber is null");
        } else {
            C162167rN A003 = C162167rN.A00();
            try {
                A0Z = A003.A0H(C141026uu.INTERNATIONAL, A003.A0F(AnonymousClass000.A0V("+", A0Z, AnonymousClass001.A0o()), "ZZ"));
                if (A0Z != null) {
                    replace = A0Z.replace(' ', 160);
                    C162457s7.A0D(replace);
                    A002.A0g(C02890Hz.A00(AnonymousClass002.A0F(this, r3.A0I(replace), A0M, 1, R.string.f11nameremoved)));
                    A002.A0i(false);
                    String string = getString(R.string.f11nameremoved);
                    A002.A00.A0I(new C1235268t(this, 100), string);
                    C18280x3.A0q(A002);
                }
            } catch (Exception e) {
                Log.e("RegistrationUtils/prettyPrintPhoneNumber/formatter-exception", e);
            }
        }
        replace = null;
        A002.A0g(C02890Hz.A00(AnonymousClass002.A0F(this, r3.A0I(replace), A0M, 1, R.string.f11nameremoved)));
        A002.A0i(false);
        String string2 = getString(R.string.f11nameremoved);
        A002.A00.A0I(new C1235268t(this, 100), string2);
        C18280x3.A0q(A002);
    }

    public void onBackPressed() {
        if (this.A0A) {
            Log.i("SendSmsToWa/onBackPressed/is adding new account");
            C614930z r2 = this.A01;
            if (r2 != null) {
                AnonymousClass36l.A0D(this, r2, this.A09, this.A0A);
                return;
            }
            throw C18270x1.A0S("accountSwitcher");
        } else if (AnonymousClass0x9.A1N(getIntent(), "changeNumber")) {
            AnonymousClass317 r22 = this.A06;
            if (r22 != null) {
                r22.A0B(3, true);
                AnonymousClass317 r0 = this.A06;
                if (r0 != null) {
                    if (!r0.A0F()) {
                        finish();
                    }
                    Intent A072 = C18320x8.A07();
                    A072.setClassName(getPackageName(), "com.whatsapp.registration.ChangeNumber");
                    startActivity(A072);
                    finish();
                    return;
                }
                throw C18270x1.A0S("registrationManager");
            }
            throw C18270x1.A0S("registrationManager");
        } else {
            super.onBackPressed();
        }
    }

    public SendSmsToWa(int i) {
        this.A09 = false;
        AnonymousClass1Hf.A2D(this, 85);
    }

    public final void A78(long j) {
        int i = 0;
        if (C18280x3.A1W(A74(), "send_sms_intent_triggered")) {
            long j2 = A74().getLong("first_resume_ts_after_trigger", 0);
            if (j2 == 0) {
                Log.i("SendSmsToWa/first resume after send sms intent was triggered");
                C18270x1.A0o(A74(), "first_resume_ts_after_trigger", this.A06.A0H());
            } else {
                long A032 = C56612sH.A03(this.A06, j2);
                C18260x0.A12("SendSmsToWa/timeElapsedSinceTriggerMs=", AnonymousClass001.A0o(), A032);
                if (A032 >= C625635p.A0L) {
                    if (A032 < 60000) {
                        A77();
                        C18260x0.A12("SendSmsToWa/executeRequestCodeTask/delay=", AnonymousClass001.A0o(), j);
                        this.A04.Bkn(this.A0B, "RequestCodeTask", j);
                        i = 2;
                    } else {
                        Log.i("SendSmsToWa/time out reached for waiting for sms, showing try again dialog");
                        C621433s.A00(this, 1);
                        C621433s.A00(this, 2);
                        C18270x1.A0l(A74().edit(), "send_sms_intent_triggered", false);
                        C18270x1.A0o(A74(), "first_resume_ts_after_trigger", 0);
                        C19340zH A002 = AnonymousClass5V0.A00(this);
                        A002.A0U(R.string.f11nameremoved);
                        A002.A0g(C02890Hz.A00(AnonymousClass002.A0F(this, A75(), AnonymousClass002.A0L(), 0, R.string.f11nameremoved)));
                        A002.A0i(false);
                        String string = getString(R.string.f11nameremoved);
                        C1235268t r0 = new C1235268t(this, 98);
                        AnonymousClass0Uj r3 = A002.A00;
                        r3.A0I(r0, string);
                        r3.A0H(new C1235268t(this, 99), getString(R.string.f11nameremoved));
                        C18280x3.A0q(A002);
                    }
                }
            }
            A77();
            C18260x0.A12("SendSmsToWa/executeRequestCodeTask/delay=", AnonymousClass001.A0o(), j);
            this.A04.Bkn(this.A0B, "RequestCodeTask", j);
            i = 1;
        }
        if (i != this.A00) {
            C621433s.A00(this, 1);
            C621433s.A00(this, 2);
            C621433s.A01(this, i);
            this.A00 = i;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A77();
    }

    public void onResume() {
        super.onResume();
        A77();
        A78(0);
    }

    public void BFe(boolean z, String str) {
    }

    public void BpC(boolean z, String str) {
    }

    public SendSmsToWa() {
        this(0);
        this.A0B = new C71543cH((Object) this, 1);
    }
}
