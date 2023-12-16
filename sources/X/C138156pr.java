package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.6pr  reason: invalid class name and case insensitive filesystem */
public final class C138156pr extends AnonymousClass5ZM {
    public Thread A00;
    public final /* synthetic */ AnonymousClass8E7 A01;

    public C138156pr(AnonymousClass8E7 r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass7T4 r4;
        String str;
        int i;
        C173778Rq r0 = new C173778Rq(new C69993Zl(this, 40), "MAIN_CHECK");
        this.A00 = r0;
        r0.start();
        C149517Mt r2 = new C149517Mt();
        try {
            AnonymousClass8E7 r7 = this.A01;
            C59722xN r6 = r7.A05;
            int A0E = r7.A0E();
            C156437gc A012 = r6.A01(r7, r7.A06(), C58172up.A0K, r7.A0F(), r7.A0G(), A0E, r7.A0C());
            AnonymousClass5ZI r1 = r7.A06;
            if (r1 != null) {
                r1.A06();
            }
            Integer valueOf = Integer.valueOf(A012.A01);
            r7.A0B(r2, A012);
            if (r1 != null) {
                r1.A05();
            }
            if (this.A00.isAlive()) {
                this.A00.interrupt();
                return r2;
            }
        } catch (JSONException e) {
            AnonymousClass8E7 r02 = this.A01;
            str = C18310x6.A0n(e);
            r02.A0L(str);
            C55682qk.A05(r02.A02, "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON: ", e);
            Log.e("GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON", e);
            r2.A00 = 2;
            i = 7;
            r4 = new AnonymousClass7T4((Integer) null, str, i);
            r2.A01 = r4;
            return r2;
        } catch (IOException e2) {
            AnonymousClass8E7 r03 = this.A01;
            String A0n = C18310x6.A0n(e2);
            r03.A0L(A0n);
            if (!C18320x8.A1T(this)) {
                Log.e("GraphApiACSNetworkRequest/TimeoutTask/doInBackground failed", e2);
                r2.A00 = 1;
                r4 = new AnonymousClass7T4((Integer) null, A0n, 8);
                r2.A01 = r4;
                return r2;
            }
            Log.d("GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Request cancelled");
            return r2;
        } catch (Exception e3) {
            AnonymousClass8E7 r04 = this.A01;
            str = C18310x6.A0n(e3);
            r04.A0L(str);
            C55682qk.A05(r04.A02, "GraphApiACSNetworkRequest/TimeoutTask/doInBackground: Error while generating or parsing the JSON: ", e3);
            Log.e("GraphApiACSNetworkRequest/TimeoutTask/doInBackground: generic error - ", e3);
            r2.A00 = 3;
            i = 6;
            r4 = new AnonymousClass7T4((Integer) null, str, i);
            r2.A01 = r4;
            return r2;
        }
        return r2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C149517Mt r3 = (C149517Mt) obj;
        if (C18320x8.A1T(this)) {
            Log.d("GraphApiACSNetworkRequest/TimeoutTask/onPostExecute: Request cancelled");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GraphApiACSNetworkRequest/TimeoutTask/onPostExecute: resultCode=");
        A0o.append(r3.A00);
        A0o.append("; content=");
        C18260x0.A0m(r3.A03, A0o);
        this.A01.A0A(r3);
    }
}
