package X;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.55p  reason: invalid class name and case insensitive filesystem */
public class C994055p extends AnonymousClass5ZM {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final AnonymousClass33p A05;
    public final C56912sl A06;
    public final C153017aX A07;
    public final C97694z5 A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final WeakReference A0F;
    public final boolean A0G;
    public final boolean A0H;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        String str2;
        C108935do r6;
        byte[] bArr;
        Context context = this.A04.A00;
        String str3 = this.A0D;
        String A002 = C57922uQ.A00(context, str3);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RequestCodeTask/method=");
        String str4 = this.A0C;
        A0o.append(str4);
        A0o.append("/useStandaloneVerification=");
        boolean z = this.A0H;
        A0o.append(z);
        A0o.append("/authContext=");
        String str5 = this.A09;
        C18260x0.A1L(A0o, str5);
        AnonymousClass33p r15 = this.A05;
        String string = AnonymousClass0x2.A0F(r15).getString("com.whatsapp.registration.RegisterPhone.mistyped_state", (String) null);
        TelephonyManager A0N = this.A03.A0N();
        if (A0N != null) {
            str = A0N.getNetworkOperator();
        } else {
            str = null;
        }
        AnonymousClass34d A003 = AnonymousClass34d.A00(str);
        if (A0N != null) {
            str2 = A0N.getSimOperator();
        } else {
            str2 = null;
        }
        AnonymousClass34d A004 = AnonymousClass34d.A00(str2);
        if (z) {
            try {
                C626936e.A06(str5);
                C56912sl r5 = this.A06;
                String str6 = this.A0B;
                String str7 = AnonymousClass36l.A00;
                String str8 = this.A0A;
                C97694z5 r7 = this.A08;
                if (!r5.A0F()) {
                    r6 = new C108935do(C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
                } else {
                    r5.A0E(true);
                    byte[] A0H2 = r5.A0H(str6, str3);
                    byte[] A0G2 = r5.A0G("requestCodeForStandaloneVerification");
                    Map A062 = r5.A06(r7, A003, A004, str7, string, str8);
                    r6 = (C108935do) C105935Wz.A00(new AnonymousClass56L(r5.A0N, r5.A0P, str6, str3, A002, str4, str5, r5.A05(), A062, A0H2, A0G2));
                }
            } catch (Exception e) {
                C18260x0.A15("/error ", AnonymousClass000.A0m("RequestCodeTask/doInBackground/", str4), e);
                return AnonymousClass0x9.A0G(C998958p.ERROR_UNSPECIFIED, (Object) null);
            }
        } else {
            if (str4.equals("autoconf")) {
                bArr = this.A07.A03(this.A0E);
                if (bArr == null || bArr.length == 0) {
                    Log.e("RequestCodeTaskdoInBackground/no valid clientStartMessage, skip sending autoconf code request");
                    return AnonymousClass0x9.A0G(C998958p.ERROR_UNSPECIFIED, (Object) null);
                }
            } else {
                bArr = null;
            }
            C56912sl r62 = this.A06;
            String str9 = this.A0B;
            int i = this.A01;
            int i2 = this.A02;
            int i3 = this.A00;
            String str10 = AnonymousClass36l.A00;
            String str11 = this.A0A;
            C97694z5 r72 = this.A08;
            if (!r62.A0F()) {
                r6 = new C108935do(C998958p.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
            } else {
                r62.A0E(true);
                byte[] A0H3 = r62.A0H(str9, str3);
                byte[] A0G3 = r62.A0G("requestCode");
                Map A063 = r62.A06(r72, A003, A004, str10, string, str11);
                r62.A0C(A063);
                r62.A09(A063);
                r62.A0B(A063);
                r62.A0D(A063);
                String string2 = AnonymousClass0x2.A0F(r62.A0A).getString("pref_autoconf_feo2_query_status", "did_not_query");
                C626936e.A06(string2);
                A063.put("feo2_query_status", string2.getBytes());
                C106535Zj r73 = r62.A0P;
                String A042 = r62.A04(str9, "code_entrypoint");
                List A052 = r62.A05();
                r6 = (C108935do) C105935Wz.A00(new AnonymousClass56O(r62.A0N, r73, str9, str3, A002, str4, str5, A042, A052, A063, A0H3, A0G3, bArr, i, i2, i3));
            }
        }
        if (r6 == null) {
            Log.e("RequestCodeTask/doInBackground/null requestCodeResult");
            return AnonymousClass0x9.A0G(C998958p.ERROR_UNSPECIFIED, (Object) null);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("RequestCodeTask/code entrypoint response/autoconfType=");
        A0o2.append(r6.A00);
        A0o2.append("/non-null authChallenge=");
        A0o2.append(AnonymousClass000.A1W(r6.A0B));
        A0o2.append("/emailOtpEligible=");
        A0o2.append(r6.A01);
        A0o2.append("/resetMethod=");
        A0o2.append(r6.A0K);
        A0o2.append("/wipeWait=");
        A0o2.append(r6.A05);
        A0o2.append("/smsWait=");
        A0o2.append(r6.A0N);
        A0o2.append(";voiceWait=");
        A0o2.append(r6.A0P);
        A0o2.append(";waOldWait=");
        A0o2.append(r6.A0Q);
        A0o2.append(";emailOtpWait=");
        C18260x0.A1L(A0o2, r6.A0E);
        C18270x1.A0h(C18270x1.A03(r15), "autoconf_type", r6.A00);
        C998958p r52 = r6.A07;
        if (r52 == C998958p.YES_WITH_CODE) {
            C18260x0.A1K(AnonymousClass000.A0m("RequestCodeTask/doInBackground/", str4), "/status/error/yes-with-code");
        }
        return AnonymousClass0x9.A0G(r52, r6);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass0PJ r6 = (AnonymousClass0PJ) obj;
        Log.d("RequestCodeTask/onPostExecute");
        C185138t9 r4 = (C185138t9) this.A0F.get();
        if (r4 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("RequestCodeTask/method=");
            A0o.append(this.A0C);
            C18260x0.A1K(A0o, "/error/callback null");
            return;
        }
        String str = this.A0C;
        if (!str.equals("sms") || !this.A0G) {
            r4.BFe(this.A0G, str);
            Object obj2 = r6.A00;
            C626936e.A06(obj2);
            r4.BPK((C998958p) obj2, (C108935do) r6.A01, str);
            return;
        }
        new Handler().postDelayed(new C70363aN(this, r4, r6, 7), 2000);
    }

    public C994055p(C620633i r2, C54292oU r3, AnonymousClass33p r4, C56912sl r5, C153017aX r6, C97694z5 r7, C185138t9 r8, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, boolean z, boolean z2) {
        this.A0G = z;
        this.A0B = str;
        this.A0D = str2;
        this.A0C = str3;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A0E = str4;
        this.A0A = str5;
        this.A04 = r3;
        this.A08 = r7;
        this.A0H = z2;
        this.A09 = str6;
        this.A03 = r2;
        this.A0F = AnonymousClass0x9.A14(r8);
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        if (str3.equals("sms")) {
            C626936e.A05(str5);
        }
    }
}
