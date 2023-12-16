package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9U1  reason: invalid class name */
public class AnonymousClass9U1 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass99E A03;
    public C153607bd A04;
    public ArrayList A05;
    public ArrayList A06;
    public ArrayList A07;
    public HashMap A08;
    public final AnonymousClass1VX A09;
    public final C196629bS A0A;
    public final C197109ca A0B;

    public ArrayList A07(AnonymousClass99H r4) {
        Bundle bundle;
        ArrayList arrayList;
        if (r4 != null && (arrayList = r4.A0G) != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        AnonymousClass99E r0 = this.A03;
        if (r0 == null || (bundle = r0.A00) == null) {
            return null;
        }
        return bundle.getStringArrayList("pspRouting");
    }

    public final AnonymousClass99E A00(AnonymousClass99H r5) {
        C196629bS r2 = this.A0A;
        if (r2.A0P()) {
            String A072 = r2.A07();
            if (TextUtils.isEmpty(A072)) {
                r2.Brs(r5);
                if (r5 != null) {
                    A072 = r5.A0A;
                } else {
                    A072 = r2.A07();
                }
            }
            if (!TextUtils.isEmpty(A072)) {
                return A01(A072);
            }
            return null;
        }
        ArrayList A073 = A07(r5);
        if (A073 != null && !A073.isEmpty()) {
            return A01((String) A073.get(this.A01 % A073.size()));
        }
        Log.e("PAY: IndiaUPIPaymentSetup psps list is null or empty");
        return null;
    }

    public final AnonymousClass99E A01(String str) {
        String str2;
        ArrayList arrayList = this.A07;
        if (arrayList == null || arrayList.size() <= 0) {
            Log.e("PAY: IndiaUPIPaymentSetup pspConfig list is null or empty");
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass99E r2 = (AnonymousClass99E) it.next();
            Bundle bundle = r2.A00;
            if (bundle != null) {
                str2 = bundle.getString("providerType");
            } else {
                str2 = null;
            }
            if (str.equals(str2)) {
                return r2;
            }
        }
        return null;
    }

    public String A04(AnonymousClass99H r4) {
        String str;
        String A072 = this.A0A.A07();
        if (!TextUtils.isEmpty(A072)) {
            return A072;
        }
        AnonymousClass99E A002 = A00(r4);
        if (A002 == null) {
            return "ICICI";
        }
        Bundle bundle = A002.A00;
        if (bundle != null) {
            str = bundle.getString("providerType");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "ICICI";
        }
        Bundle bundle2 = A002.A00;
        if (bundle2 != null) {
            return bundle2.getString("providerType");
        }
        return null;
    }

    public String A06(String str, HashMap hashMap, int i) {
        Object obj = hashMap.get(str);
        String A0e = C18320x8.A0e(str, hashMap);
        if (obj == null || A0e == null) {
            return null;
        }
        try {
            JSONObject A1H = AnonymousClass0x9.A1H(A0e);
            String str2 = "pay";
            switch (i) {
                case 1:
                    str2 = "setMpin";
                    break;
                case 2:
                    str2 = "changeMpin";
                    break;
                case 3:
                case 6:
                    break;
                case 4:
                    str2 = "reqBalChk";
                    break;
                case 5:
                    str2 = "collect";
                    break;
                default:
                    str2 = "mandate";
                    break;
            }
            JSONObject jSONObject = C18300x5.A10(str2, A1H).getJSONObject("data");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(jSONObject.getString("code"));
            A0o.append(",");
            A0o.append(jSONObject.getString("ki"));
            A0o.append(",");
            return AnonymousClass000.A0X(jSONObject.getString("encryptedBase64String"), A0o);
        } catch (JSONException e) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
            A0o2.append(str);
            Log.i(AnonymousClass000.A0X("  blob threw: ", A0o2), e);
            return null;
        }
    }

    public void A09() {
        ArrayList arrayList;
        int i = this.A02 + 1;
        if (i != this.A00 || (arrayList = this.A07) == null || arrayList.size() <= 1) {
            this.A02 = i;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A0A() {
        this.A04 = new C153607bd();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A06 = null;
        this.A05 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A0B.reset();
    }

    public AnonymousClass9U1(AnonymousClass1VX r1, C196629bS r2, C197109ca r3) {
        this.A09 = r1;
        this.A0B = r3;
        this.A0A = r2;
        A0A();
    }

    public C193509Ox A02(C153607bd r8, ArrayList arrayList) {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = arrayList.iterator();
        AnonymousClass99E r2 = null;
        while (it.hasNext()) {
            AnonymousClass38U r5 = (AnonymousClass38U) it.next();
            if (r5 instanceof AnonymousClass99E) {
                AnonymousClass99E r52 = (AnonymousClass99E) r5;
                Bundle bundle = r52.A00;
                if (bundle == null || bundle.getString("keys") == null) {
                    Bundle bundle2 = r52.A00;
                    if (bundle2 == null || bundle2.getString("providerType") == null) {
                        Bundle bundle3 = r52.A00;
                        if (!(bundle3 == null || bundle3.getStringArrayList("pspRouting") == null)) {
                            r2 = r52;
                        }
                    } else {
                        A0s2.add(r52);
                    }
                } else {
                    r8.A04("upi-list-keys");
                    Bundle bundle4 = r52.A00;
                    if (bundle4 != null) {
                        str = bundle4.getString("keys");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.A0A.A0I(str);
                    }
                }
            } else if (r5 instanceof AnonymousClass99H) {
                A0s.add(r5);
            }
        }
        return new C193509Ox(r2, A0s2, A0s);
    }

    public String A05(String str) {
        String str2;
        AnonymousClass99E A012 = A01(str);
        if (A012 != null) {
            Bundle bundle = A012.A00;
            if (bundle != null) {
                str2 = bundle.getString("transactionPrefix");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                Bundle bundle2 = A012.A00;
                if (bundle2 != null) {
                    return bundle2.getString("transactionPrefix");
                }
                return null;
            }
        }
        return this.A0A.A06();
    }

    public final ArrayList A08(AnonymousClass99H r3) {
        Bundle bundle;
        ArrayList<String> stringArrayList;
        AnonymousClass99E A002 = A00(r3);
        if (A002 != null && (bundle = A002.A00) != null && (stringArrayList = bundle.getStringArrayList("smsGateways")) != null && stringArrayList.size() > 0 && !stringArrayList.isEmpty()) {
            return stringArrayList;
        }
        Log.e("PAY: IndiaUPIPaymentSetup smsGateways list is null or empty");
        return null;
    }

    public C153607bd A03() {
        return this.A04;
    }
}
