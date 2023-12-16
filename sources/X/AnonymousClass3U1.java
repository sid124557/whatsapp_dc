package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3U1  reason: invalid class name */
public final class AnonymousClass3U1 implements AnonymousClass672 {
    public C32231pm A00;
    public final C69263Wi A01;
    public final C29411im A02;
    public final C112515jr A03;
    public final AnonymousClass1VX A04;
    public final C56732sT A05;

    public void BF0(String str, Map map) {
        C162457s7.A0J(map, 1);
        if (C379024m.A00) {
            this.A03.A00(new C106645Zu("start_foreground_service_from_push"));
        }
        Object obj = map.get("push_payload");
        if (obj != null && (obj instanceof C32231pm)) {
            AnonymousClass1VX r5 = this.A04;
            C58422vE r2 = C58422vE.A02;
            if (r5.A0O(r2, 4116) >= 2) {
                C32231pm r3 = (C32231pm) obj;
                String str2 = r3.A06;
                if (C162457s7.A0P(str2, "voip_call_offer_1on1")) {
                    if (!r5.A0Y(r2, 6334)) {
                        A00(r3);
                    } else {
                        this.A01.A0S(new C70183a5(this, 22, r3));
                    }
                } else if (C162457s7.A0P(str2, "call_terminate") && C379024m.A00 && r5.A0Y(r2, 6405)) {
                    this.A03.A00(new C106645Zu("handle_push_payload", obj));
                }
            }
        }
    }

    public final void A00(C32231pm r8) {
        Log.i("CallingIncomingPushObserver/postPushPayloadWithPing");
        C29411im r1 = this.A02;
        if (r1.A06 && AnonymousClass000.A1U(r1.A04, 2)) {
            String str = r8.A05;
            AnonymousClass1VX r2 = this.A04;
            if (r2.A0Y(C58422vE.A02, 6005)) {
                Log.i("CallingIncomingPushObserver/sendPing");
                C56732sT r6 = this.A05;
                AnonymousClass4KL r5 = new AnonymousClass4KL(0, str, this);
                long A06 = C56952sp.A06(r2, 6006);
                if (1000 > A06 || A06 >= 32001) {
                    A06 = 8000;
                }
                r6.A08(r5, A06);
            }
        }
        this.A03.A00(new C106645Zu("handle_push_payload", (Object) r8));
    }

    public boolean BoG(C47742dk r3, Long l, String str) {
        String str2;
        if (!C379024m.A00) {
            if (r3 != null) {
                str2 = r3.A00();
            } else {
                str2 = null;
            }
            if (C162457s7.A0P(str2, "voip_call_offer_1on1")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AnonymousClass3U1(C69263Wi r1, C29411im r2, C112515jr r3, AnonymousClass1VX r4, C56732sT r5) {
        C18260x0.A0f(r4, r1, r2, r5, r3);
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = r5;
        this.A03 = r3;
    }
}
