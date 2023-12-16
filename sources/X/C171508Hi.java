package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.tasks.Task;
import com.whatsapp.util.Log;

/* renamed from: X.8Hi  reason: invalid class name and case insensitive filesystem */
public class C171508Hi implements AnonymousClass4DA {
    public final AnonymousClass2M7 A00;

    public boolean BFA(Message message, int i) {
        String str;
        Task A002;
        C86094Iu r1;
        if (i == 179) {
            Bundle data = message.getData();
            String string = data.getString("nonce");
            C626936e.A06(string);
            String string2 = data.getString("apiKey");
            C626936e.A06(string2);
            AnonymousClass2M7 r3 = this.A00;
            Context context = r3.A00.A00;
            int A003 = C159787mS.A00(context);
            if (A003 == 0) {
                AnonymousClass6Qa r0 = new AnonymousClass6Qa(context);
                byte[] bytes = string.getBytes();
                C159087l6 r02 = r0.A05;
                AnonymousClass6XK r2 = new AnonymousClass6XK(r02, string2, bytes);
                r02.A03(r2);
                A002 = C154837dp.A00(r2, new C1695189p(new C127096Qp()));
                A002.addOnSuccessListener(new AnonymousClass93X(r3, 4));
                r1 = new C86094Iu(r3, 1);
            } else {
                r3.A01.A01((String) null, 1001, AnonymousClass000.A0Y("Google Play Services Unavailable. Connection result code: ", AnonymousClass001.A0o(), A003));
                str = "requestAttestation/cannot request attestation Google APIs unavailable";
                Log.i(str);
                return true;
            }
        } else if (i != 223) {
            return false;
        } else {
            int i2 = message.getData().getInt("maxAppsCount");
            AnonymousClass2M7 r5 = this.A00;
            Context context2 = r5.A00.A00;
            int A004 = C159787mS.A00(context2);
            if (A004 == 0) {
                C159087l6 r03 = new AnonymousClass6Qa(context2).A05;
                AnonymousClass6XJ r22 = new AnonymousClass6XJ(r03);
                r03.A03(r22);
                A002 = C154837dp.A00(r22, new C1695189p(new C127106Qq()));
                A002.addOnSuccessListener(new AnonymousClass8BU(r5, i2));
                r1 = new C86094Iu(r5, 0);
            } else {
                r5.A01.A00(AnonymousClass000.A0Y("Google Play Services Unavailable. Connection result code: ", AnonymousClass001.A0o(), A004), 1001);
                str = "requestHarmfulApps/Google APIs unavailable";
                Log.i(str);
                return true;
            }
        }
        A002.addOnFailureListener(r1);
        return true;
    }

    public C171508Hi(AnonymousClass2M7 r1) {
        this.A00 = r1;
    }

    public int[] B81() {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 179;
        A1Z[1] = 223;
        return A1Z;
    }
}
