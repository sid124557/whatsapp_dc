package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.9Co  reason: invalid class name and case insensitive filesystem */
public abstract class C191129Co extends AnonymousClass9D0 implements C203049n2, C202599mH {
    public C133686hm A00;
    public AnonymousClass9AH A01;
    public String A02;
    public final BroadcastReceiver A03 = new C1899893k(this);
    public final C160757oG A04 = C160757oG.A00("IndiaUpiBaseResetPinActivity", "payment-settings", "IN");

    public void A7j() {
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this;
        AnonymousClass9AH r3 = indiaUpiDebitCardVerificationActivity.A01;
        C133796hx r2 = indiaUpiDebitCardVerificationActivity.A07.A08;
        C626936e.A06(r2);
        r3.A01((C166557yt) null, (AnonymousClass99H) r2, indiaUpiDebitCardVerificationActivity, "BANK");
    }

    public void A7m(C139716sV r9, String str) {
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this;
        String A0B = indiaUpiDebitCardVerificationActivity.A0M.A0B();
        C133686hm r0 = indiaUpiDebitCardVerificationActivity.A07;
        indiaUpiDebitCardVerificationActivity.A7g((AnonymousClass99H) r0.A08, A0B, r0.A0B, str, (String) C1899593h.A0X(r0.A09), 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C69263Wi r2 = this.A05;
        AnonymousClass31C r3 = this.A0H;
        C194259Se r10 = this.A0E;
        AnonymousClass9U1 r4 = this.A0L;
        AnonymousClass9U5 r7 = this.A0M;
        C194389Sr r8 = this.A07;
        C197109ca r9 = this.A0S;
        this.A01 = new AnonymousClass9AH(this, r2, r3, r4, this.A0M, this.A0K, r7, r8, r9, r10);
        C05870Vh A002 = C05870Vh.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A03;
        IntentFilter intentFilter = new IntentFilter("TRIGGER_OTP");
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            C04170Nc r5 = new C04170Nc(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = AnonymousClass002.A0I(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(r5);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = A002.A03;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = AnonymousClass002.A0I(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(r5);
            }
        }
    }

    public void A7k(C133686hm r4) {
        this.A00 = r4;
        Bp9(R.string.f11nameremoved);
        C160757oG r2 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onResume with states: ");
        C1899593h.A1I(r2, this.A05, A0o);
        if (!this.A05.A07.contains("upi-get-challenge") && this.A0M.A05().A00 == null) {
            this.A05.A02("upi-get-challenge");
            A7Y();
        } else if (!this.A05.A07.contains("upi-get-challenge")) {
            A7c();
        }
    }

    public void A7n(String str, HashMap hashMap) {
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this;
        C133796hx r4 = indiaUpiDebitCardVerificationActivity.A07.A08;
        C626936e.A06(r4);
        AnonymousClass99H r42 = (AnonymousClass99H) r4;
        C35371wl r9 = new C35371wl(indiaUpiDebitCardVerificationActivity.A0C, indiaUpiDebitCardVerificationActivity.A0A, indiaUpiDebitCardVerificationActivity.A0B, 11);
        indiaUpiDebitCardVerificationActivity.A09.A01(r42.A09, r42.A06, r9, (C35371wl) null, r42.A0F, indiaUpiDebitCardVerificationActivity.A07.A0A, str, "BANK", hashMap);
    }

    public void BVC(AnonymousClass34V r5, String str) {
        Integer num;
        C133686hm r0;
        this.A0S.A07(this.A00, r5, 1);
        if (!TextUtils.isEmpty(str) && (r0 = this.A00) != null && r0.A08 != null) {
            A7j();
        } else if (r5 != null && !C196719bd.A02(this, "upi-list-keys", r5.A00, true)) {
            if (this.A05.A06("upi-list-keys")) {
                this.A0M.A0D();
                AnonymousClass97T.A10(this);
                return;
            }
            C160757oG r3 = this.A04;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onListKeys: ");
            C133796hx r1 = null;
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0o.append(num);
            A0o.append(" bankAccount: ");
            A0o.append(this.A00);
            A0o.append(" countrydata: ");
            C133686hm r02 = this.A00;
            if (r02 != null) {
                r1 = r02.A08;
            }
            A0o.append(r1);
            C1899593h.A1J(r3, " failed; ; showErrorAndFinish", A0o);
            A7b();
        }
    }

    public void BXW(AnonymousClass34V r4) {
        this.A0S.A07(this.A00, r4, 16);
        if (!C196719bd.A02(this, "upi-generate-otp", r4.A00, true)) {
            this.A04.A06("onRequestOtp failed; showErrorAndFinish");
            A7l(new AnonymousClass9VW(R.string.f11nameremoved));
        }
    }

    public void BbO(AnonymousClass34V r5) {
        int i;
        this.A0S.A07(this.A00, r5, 6);
        if (r5 == null) {
            this.A04.A06("onSetPin success; showSuccessAndFinish");
            C18270x1.A0w(new C203989od(this, 1), this.A04);
            return;
        }
        BjL();
        if (!C196719bd.A02(this, "upi-set-mpin", r5.A00, true)) {
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("error_code", r5.A00);
            C133686hm r0 = this.A00;
            if (!(r0 == null || r0.A08 == null)) {
                int i2 = r5.A00;
                if (i2 == 11460 || i2 == 11461) {
                    i = 14;
                } else if (i2 == 11456 || i2 == 11471) {
                    i = 13;
                } else if (i2 == 11458 || i2 == 11457) {
                    i = 17;
                } else {
                    i = 10;
                    if (i2 != 11459) {
                        i = 16;
                        if (i2 != 11496) {
                            if (i2 == 11499) {
                                i = 23;
                            } else {
                                this.A04.A06("onSetPin failed; showErrorAndFinish");
                            }
                        }
                    }
                }
                C621433s.A02(this, A08, i);
                return;
            }
            A7b();
        }
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 10) {
            String A0B = this.A0M.A0B();
            return A7W(new C200289i5(this, A0B), this.A0A.A01(bundle, getString(R.string.f11nameremoved)), 10, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i == 23) {
            return A7W(new C199169g9(this), this.A0A.A01(bundle, getString(R.string.f11nameremoved)), 23, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i == 13) {
            this.A0M.A0E();
            return A7W(new C199159g8(this), this.A0A.A01(bundle, getString(R.string.f11nameremoved)), 13, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i == 14) {
            return A7W(new AnonymousClass9g6(this), this.A0A.A01(bundle, getString(R.string.f11nameremoved)), 14, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i == 16) {
            return A7W(new C199149g7(this), this.A0A.A01(bundle, getString(R.string.f11nameremoved)), 16, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (i != 17) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass9TZ r3 = this.A0A;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, 6);
            return A7W((Runnable) null, r3.A01(bundle, getString(R.string.f11nameremoved, A0L)), 17, R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public void A7a() {
        super.A7a();
        Bru(getString(R.string.f11nameremoved));
    }

    public void A7e() {
        Bp9(R.string.f11nameremoved);
        super.A7e();
    }

    public final void A7l(AnonymousClass9VW r4) {
        BjL();
        if (r4.A00 == 0) {
            r4.A00 = R.string.f11nameremoved;
        }
        if (this.A0k) {
            A7H();
            Intent A08 = AnonymousClass0x9.A08(this, IndiaUpiOnboardingErrorEducationActivity.class);
            if (AnonymousClass000.A1W(r4.A01)) {
                A08.putExtra("error", r4.A02(this));
            }
            A08.putExtra("error", r4.A00);
            A7O(A08);
            A6T(A08, true);
            return;
        }
        Bou(r4.A02(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C05870Vh A002 = C05870Vh.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A03;
        HashMap hashMap = A002.A04;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C04170Nc r7 = (C04170Nc) arrayList.get(size);
                    r7.A01 = true;
                    for (int i = 0; i < r7.A03.countActions(); i++) {
                        String action = r7.A03.getAction(i);
                        HashMap hashMap2 = A002.A03;
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C04170Nc r1 = (C04170Nc) arrayList2.get(size2);
                                if (r1.A02 == broadcastReceiver) {
                                    r1.A01 = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                hashMap2.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0k = bundle.getBoolean("inSetupSavedInst");
        C133686hm r0 = (C133686hm) bundle.getParcelable("bankAccountSavedInst");
        if (r0 != null) {
            this.A00 = r0;
            this.A00.A08 = (C133796hx) bundle.getParcelable("countryDataSavedInst");
        }
        if (bundle.containsKey("seqNumSavedInst")) {
            this.A02 = bundle.getString("seqNumSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C133796hx r1;
        super.onSaveInstanceState(bundle);
        if (this.A0k) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        C133686hm r12 = this.A00;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C133686hm r0 = this.A00;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A02;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public Dialog onCreateDialog(int i) {
        return onCreateDialog(i, (Bundle) null);
    }
}
