package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.7Vw  reason: invalid class name */
public class AnonymousClass7Vw {
    public final /* synthetic */ AnonymousClass8E7 A00;
    public final /* synthetic */ C149517Mt A01;

    public void A00(C156437gc r8) {
        C149517Mt r4;
        AnonymousClass8E7 r3;
        AnonymousClass7T4 r2;
        Integer num = null;
        try {
            num = Integer.valueOf(r8.A01);
            r3 = this.A00;
            r4 = this.A01;
            r3.A0B(r4, r8);
        } catch (JSONException e) {
            r3 = this.A00;
            String A0n = C18310x6.A0n(e);
            r3.A0L(A0n);
            r3.A02.A0A("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: Error while parsing the JSON: ", true, e.getMessage());
            r4 = this.A01;
            r4.A00 = 2;
            r2 = new AnonymousClass7T4(num, A0n, 7);
        } catch (Exception e2) {
            r3 = this.A00;
            String A0n2 = C18310x6.A0n(e2);
            r3.A0L(A0n2);
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onResponseReceived: generic error - ", e2);
            r4 = this.A01;
            r4.A00 = 3;
            r2 = new AnonymousClass7T4(num, A0n2, 6);
        }
        AnonymousClass000.A0A().post(new C71343bx(r3, 49, r4));
        r4.A01 = r2;
        AnonymousClass000.A0A().post(new C71343bx(r3, 49, r4));
    }

    public AnonymousClass7Vw(AnonymousClass8E7 r1, C149517Mt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A01(Exception exc) {
        C149517Mt r3;
        int i;
        AnonymousClass8E7 r4 = this.A00;
        r4.A0L(C18310x6.A0n(exc));
        if (exc instanceof JSONException) {
            C55682qk.A05(r4.A02, "GraphApiACSNetworkRequest/createResponseCallback/onError: Error while parsing the JSON: ", exc);
            r3 = this.A01;
            i = 2;
        } else if (exc instanceof IOException) {
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError", exc);
            r3 = this.A01;
            r3.A00 = 1;
            AnonymousClass000.A0A().post(new C71343bx(r4, 49, r3));
        } else {
            Log.e("GraphApiACSNetworkRequest/createResponseCallback/onError: generic error - ", exc);
            r3 = this.A01;
            i = 3;
        }
        r3.A00 = i;
        AnonymousClass000.A0A().post(new C71343bx(r4, 49, r3));
    }
}
