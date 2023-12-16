package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rh  reason: invalid class name and case insensitive filesystem */
public abstract class C56262rh {
    public void A00() {
        if (this instanceof AnonymousClass1f2) {
            ((AnonymousClass1f2) this).A05();
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass1f2) {
            AnonymousClass1f2 r2 = (AnonymousClass1f2) this;
            AnonymousClass2LB r4 = new AnonymousClass2LB("authorization_revoked", (JSONObject) null);
            try {
                C46732c7 r3 = r2.A02;
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("action", "authorization_revoked");
                A1G.putOpt("payload", r4.A01);
                r3.A00(A1G.toString(), false);
            } catch (JSONException unused) {
                Log.e("StellaEventDispatcher/failed to create event");
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass1f2) {
            ((AnonymousClass1f2) this).A05();
        }
    }

    public void A03(int i) {
        String str;
        String str2;
        AnonymousClass2LB r0;
        if (this instanceof AnonymousClass1f2) {
            AnonymousClass1f2 r5 = (AnonymousClass1f2) this;
            try {
                C54742pD A02 = r5.A08.A02("com.facebook.stella");
                AnonymousClass1f4 r1 = r5.A04;
                CallInfo callInfo = Voip.getCallInfo();
                switch (i) {
                    case 1:
                    case 2:
                    case 14:
                    case 18:
                        str = "user_ended_call";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 11:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        str = "call_failed";
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 25:
                    case 27:
                        str = "not_accepted";
                        break;
                    case 12:
                        str = "rejected";
                        break;
                    case 24:
                        str = "missing_voip_permissions";
                        break;
                    default:
                        str = "other";
                        break;
                }
                if (callInfo == null) {
                    str2 = null;
                } else {
                    str2 = r1.A00.A03(A02, callInfo.callId);
                }
                try {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    A1G.put("call_ended_reason", str);
                    A1G.put("call_id", str2);
                    r0 = new AnonymousClass2LB("call_ended", A1G);
                } catch (JSONException unused) {
                    r0 = null;
                }
                r5.A06(r0);
            } catch (SecurityException e) {
                Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
            }
        }
    }

    public void A04(CallState callState, CallInfo callInfo) {
        if (this instanceof AnonymousClass1f2) {
            AnonymousClass1f2 r2 = (AnonymousClass1f2) this;
            if (!C95794uX.A00(callState).equals(C95794uX.A00(callInfo.callState))) {
                try {
                    r2.A06(r2.A05.A00(r2.A08.A02("com.facebook.stella"), callInfo));
                } catch (SecurityException e) {
                    Log.e("StellaEventDispatcher/cannot create event for untrusted package", e);
                }
            }
        }
    }
}
