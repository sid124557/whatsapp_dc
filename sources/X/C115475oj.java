package X;

import android.os.Build;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5oj  reason: invalid class name and case insensitive filesystem */
public final class C115475oj implements C184578sA {
    public String A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final C009707r A06;
    public final C54292oU A07;
    public final AnonymousClass5ZR A08;
    public final AnonymousClass33p A09;
    public final AnonymousClass317 A0A;
    public final boolean A0B;

    public void BhU() {
        this.A01 = false;
        A01();
    }

    public void Bpy() {
        this.A01 = true;
        A01();
    }

    public final void A00() {
        this.A00 = "sms";
        AnonymousClass33p r3 = this.A09;
        C18270x1.A0j(C18270x1.A03(r3), "pref_primary_flash_call_status", "primary_eligible");
        C18270x1.A0l(C18270x1.A03(r3), "pref_prefer_sms_over_flash", true);
        A02();
        C100525Bg.A00(this.A07, r3, this, this.A0B);
    }

    public final void A01() {
        String str = this.A00;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 114009) {
                if (hashCode != 97513456) {
                    if (hashCode == 112386354 && str.equals("voice")) {
                        Log.i("PrimaryFlashCallHelper/verifyWithCall");
                        this.A0A.A0B(5, true);
                        C009707r r1 = this.A06;
                        r1.startActivity(C627736r.A0F(r1, this.A04, this.A05, this.A01, false));
                        r1.finish();
                    }
                } else if (str.equals("flash")) {
                    AnonymousClass5ZR r3 = this.A08;
                    if (!r3.A0B()) {
                        Log.i("PrimaryFlashCallHelper/request-flash-call-permissions");
                        RequestPermissionActivity.A0h(this.A06, r3, this.A03, true);
                        return;
                    }
                    A02();
                    A03();
                }
            } else if (!str.equals("sms")) {
            } else {
                if (this.A01 || this.A08.A02("android.permission.RECEIVE_SMS") == 0) {
                    A04();
                    return;
                }
                C009707r r12 = this.A06;
                AnonymousClass0x9.A1L(r12);
                AnonymousClass36l.A0L((C89654ea) r12, 1);
            }
        }
    }

    public final void A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass33p r0 = this.A09;
            AnonymousClass5ZR r4 = this.A08;
            boolean A0A2 = r4.A0A();
            C183538qC r3 = r0.A01;
            C18270x1.A0h(AnonymousClass0x2.A0E(r3), "pref_flash_call_manage_call_permission_granted", A0A2 ? 1 : 0);
            C18270x1.A0h(AnonymousClass0x2.A0E(r3), "pref_flash_call_call_log_permission_granted", r4.A09() ? 1 : 0);
        }
    }

    public final void A03() {
        Log.i("PrimaryFlashCallHelper/attempt-flash-call");
        this.A0A.A0B(8, true);
        C009707r r4 = this.A06;
        r4.startActivity(C627736r.A0y(r4, (String) null, this.A02, 0, 0, this.A04, this.A05, 0, 0, this.A01, false, false, true, false));
        r4.finish();
    }

    public final void A05(int i, int i2) {
        String str = "granted";
        if (i == this.A03) {
            A02();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PrimaryFlashCallHelper/activity-result/request-flash-call-permissions/");
            if (i2 != -1) {
                str = "denied";
            }
            C18260x0.A1L(A0o, str);
            if (i2 == -1) {
                A03();
                return;
            }
            C18270x1.A0j(C18270x1.A03(this.A09), "pref_primary_flash_call_status", "primary_eligible");
        } else if (i == 1) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("PrimaryFlashCallHelper/activity-result/request-sms-permissions/");
            if (i2 != -1) {
                str = "denied";
            }
            C18260x0.A1L(A0o2, str);
        } else {
            return;
        }
        A04();
    }

    public C115475oj(C009707r r1, C54292oU r2, AnonymousClass5ZR r3, AnonymousClass33p r4, AnonymousClass317 r5, int i, int i2, long j, long j2, boolean z) {
        C18260x0.A0c(r3, r5, r4, r2);
        this.A08 = r3;
        this.A0A = r5;
        this.A09 = r4;
        this.A07 = r2;
        this.A06 = r1;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = j;
        this.A05 = j2;
        this.A0B = z;
    }

    public final void A04() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrimaryFlashCallHelper/startverifysms/usesmsretriever=");
        C18260x0.A1V(A0o, this.A01);
        this.A0A.A0B(4, true);
        C009707r r4 = this.A06;
        r4.startActivity(C627736r.A0y(r4, (String) null, -1, 0, 0, this.A04, this.A05, 0, 0, this.A01, true, false, false, false));
        r4.finish();
    }
}
