package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9WI  reason: invalid class name */
public class AnonymousClass9WI {
    public final C106175Xx A00;
    public final C620633i A01;
    public final C196629bS A02;
    public final C197109ca A03;
    public final C160757oG A04;

    private String A01(SubscriptionInfo subscriptionInfo) {
        boolean A1U;
        String A012;
        if (Build.VERSION.SDK_INT < 29) {
            return subscriptionInfo.getIccId();
        }
        C160757oG r2 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Sub Id : ");
        C1899593h.A1K(r2, A0o, subscriptionInfo.getSubscriptionId());
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(subscriptionInfo.getSubscriptionId());
        C196629bS r22 = this.A02;
        synchronized (r22) {
            A1U = C18320x8.A1U(r22.A0U("device_binding_sim_iccid")[0]);
        }
        if (A1U) {
            A012 = "";
        } else {
            A012 = C627236i.A01(this.A01.A0R());
        }
        return AnonymousClass000.A0X(A012, A0o2);
    }

    public int A03(AnonymousClass9AG r19, String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        this.A04.A06("IndiaUpiSimSwapDetectionUtils : Check sim on version >= 22");
        SubscriptionManager A0M = this.A01.A0M();
        if (A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null || activeSubscriptionInfoList.isEmpty()) {
            this.A04.A06("IndiaUpiSimSwapDetectionUtils : No subscription info found");
            return 1;
        }
        String A09 = this.A02.A09();
        JSONObject A1G = AnonymousClass0x9.A1G();
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        int i = 1;
        boolean z = false;
        int i2 = 0;
        for (SubscriptionInfo next : activeSubscriptionInfoList) {
            JSONObject A1G3 = AnonymousClass0x9.A1G();
            JSONObject A1G4 = AnonymousClass0x9.A1G();
            String A012 = A01(next);
            String number = next.getNumber();
            C160757oG r15 = this.A04;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("checkSimWithWaRegisteredNumberIsInstalled simId : ");
            A0o.append(C195009Vm.A01(A012));
            A0o.append(" | storedId : ");
            C1899593h.A1J(r15, C195009Vm.A01(A09), A0o);
            boolean A002 = AnonymousClass9VY.A00(this.A00, this.A03, number, str);
            C160757oG r152 = this.A04;
            if (A002) {
                r152.A06("Phone matched");
                return 0;
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("checkSimWithWaRegisteredNumberIsInstalled Phone number not matched | sim number : ");
            A0o2.append(number);
            A0o2.append(" | waNumber : ");
            C1899593h.A1J(r152, str, A0o2);
            if (TextUtils.isEmpty(number) && (TextUtils.isEmpty(A012) || TextUtils.isEmpty(A09) || TextUtils.equals(A012, A09))) {
                i = 0;
            }
            if (!z) {
                z = TextUtils.equals(A012, A09);
            }
            try {
                A1G3.put("slotIndex", next.getSimSlotIndex());
                A1G3.put("simPhoneNumber", number);
                A1G3.put("storedId", A09);
                A1G3.put("simId", A012);
                A1G3.put("waPhoneNumber", str);
                A1G4.put("isSimNumberEmpty", TextUtils.isEmpty(number));
                A1G4.put("isSimIdEmpty", TextUtils.isEmpty(A012));
                A1G4.put("isStoredIdEmpty", TextUtils.isEmpty(A09));
                A1G4.put("isSimIdMatched", TextUtils.equals(A012, A09));
                A1G4.put("isAddPaymentAttempted", z);
                A1G.put(C18260x0.A05("subIndex_", i2), A1G4);
                A1G2.put(C18260x0.A05("subIndex_", i2), A1G3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i2++;
        }
        if (i != 0 && z && activeSubscriptionInfoList.size() > 1) {
            i = 2;
        }
        C160757oG r2 = this.A04;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("Fallback to ICCID match ");
        C1899593h.A1K(r2, A0o3, i);
        if (i != 0) {
            AnonymousClass9AG r22 = r19;
            r22.A02 = A1G2;
            r22.A03 = A1G;
            r22.A00("SIM_SWAP", (List) null);
        }
        return i;
    }

    public String A04(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        SubscriptionManager A0M = this.A01.A0M();
        if (!(A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null)) {
            int A032 = this.A02.A03();
            int i = 0;
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                if (A032 == next.getSubscriptionId()) {
                    i = next.getSimSlotIndex();
                }
                String A012 = A01(next);
                if (AnonymousClass9VY.A00(this.A00, this.A03, next.getNumber(), str)) {
                    this.A04.A04("iccid matched number");
                    return A012;
                }
            }
            if (activeSubscriptionInfoList.size() > 0) {
                this.A04.A04("no matching phone number found, storing the selected iccid");
                return A01(activeSubscriptionInfoList.get(i));
            }
        }
        return null;
    }

    public AnonymousClass9WI(C620633i r1, C160757oG r2, C106175Xx r3, C197109ca r4, C196629bS r5) {
        this.A01 = r1;
        this.A04 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static SmsManager A00(int i) {
        return SmsManager.getSmsManagerForSubscriptionId(i);
    }

    public static List A02(Context context) {
        List<SubscriptionInfo> activeSubscriptionInfoList = SubscriptionManager.from(context).getActiveSubscriptionInfoList();
        ArrayList A0s = AnonymousClass001.A0s();
        if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() == 2) {
            A0s.add(((SubscriptionInfo) C18290x4.A0k(activeSubscriptionInfoList)).getNumber());
            A0s.add(activeSubscriptionInfoList.get(1).getNumber());
        }
        return A0s;
    }
}
