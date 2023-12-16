package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2g5  reason: invalid class name and case insensitive filesystem */
public final class C49162g5 {
    public final C59052wG A00;
    public final AnonymousClass1VX A01;
    public final Map A02 = AnonymousClass001.A0t();

    public final void A00(int i, String str, String str2) {
        C162457s7.A0J(str2, 2);
        Map map = this.A02;
        AnonymousClass316 r2 = (AnonymousClass316) map.get(str);
        if (r2 == null) {
            C47122ck r1 = new C47122ck(i);
            r1.A05 = true;
            r2 = this.A00.A01(r1, str);
            map.put(str, r2);
        }
        C162457s7.A0H(r2);
        r2.A0F(str2, -1);
    }

    public final void A01(AnonymousClass2z0 r6, String str, boolean z) {
        String obj;
        Map map = this.A02;
        AnonymousClass316 r3 = (AnonymousClass316) map.get(str);
        if (r3 == null) {
            Log.d("PaidMessagingExpQplManager/endPrefTracker/pref tracker not found. Have you called startPrefTracker()?");
            return;
        }
        if (!(!this.A01.A0Y(C58422vE.A02, 6837) || r6 == null || (obj = Integer.valueOf(r6.hashCode()).toString()) == null)) {
            r3.A0C("hashed_message_key", true, obj);
        }
        short s = 3;
        if (z) {
            s = 2;
        }
        r3.A0E(s);
        map.remove(str);
    }

    public C49162g5(C59052wG r2, AnonymousClass1VX r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
