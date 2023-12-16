package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9Vs  reason: invalid class name and case insensitive filesystem */
public final class C195059Vs {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public C195059Vs(AnonymousClass36K r9) {
        this.A02 = r9.A0r("action", (String) null);
        this.A03 = r9.A0r("status", (String) null);
        String A0r = r9.A0r("pause-start-ts", (String) null);
        if (A0r != null) {
            this.A01 = C615531h.A04(A0r, 0) * 1000;
        }
        String A0r2 = r9.A0r("pause-end-ts", (String) null);
        if (A0r2 != null) {
            this.A00 = C615531h.A04(A0r2, 0) * 1000;
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ action: ");
        C195009Vm.A03(A0o, this.A02);
        A0o.append(" status: ");
        C195009Vm.A03(A0o, this.A03);
        StringBuilder A0w = C18290x4.A0w(" pauseStartDate: ", A0o);
        A0w.append(this.A01);
        C195009Vm.A04(A0w, A0o);
        StringBuilder A0w2 = C18290x4.A0w(" pauseEndDate: ", A0o);
        A0w2.append(this.A00);
        C195009Vm.A04(A0w2, A0o);
        return AnonymousClass000.A0X("]", A0o);
    }

    public C195059Vs(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(str);
                this.A02 = A1H.optString("action");
                this.A03 = A1H.optString("status");
                this.A01 = A1H.optLong("pauseStartTs", -1);
                this.A00 = A1H.optLong("pauseEndTs", -1);
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails threw: ", e);
            }
        }
    }

    public C195059Vs() {
    }
}
