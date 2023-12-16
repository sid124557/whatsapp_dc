package X;

import android.text.TextUtils;
import com.whatsapp.graphapi.GraphApiACSNetworkRequestKt;
import com.whatsapp.util.Log;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8E7  reason: invalid class name */
public abstract class AnonymousClass8E7 implements AnonymousClass66T {
    public String A00;
    public String A01;
    public final C55682qk A02;
    public final C181668n8 A03;
    public final C184408rk A04;
    public final C59722xN A05;
    public final AnonymousClass5ZI A06;
    public final AnonymousClass5ZM A07 = new C138156pr(this);
    public final AnonymousClass4FS A08;

    public abstract Object A05(JSONObject jSONObject);

    public abstract String A06();

    public abstract Map A07();

    public abstract int A0C();

    public abstract int A0D();

    public abstract int A0E();

    public abstract String A0F();

    public abstract JSONObject A0G();

    public abstract void A0H(C149757Nt r1);

    public abstract void A0I(Integer num, Integer num2);

    public abstract void A0J(Integer num, Long l, String str, String str2, String str3, String str4);

    public abstract void A0K(Integer num, Long l, String str, String str2, String str3, String str4);

    public abstract void A0L(String str);

    public void A08() {
        if (this instanceof GraphApiACSNetworkRequestKt) {
            throw AnonymousClass002.A0G("This class only supports Coroutines implementation for now");
        }
        AnonymousClass5ZI r0 = this.A06;
        if (r0 != null) {
            r0.A07();
        }
        this.A03.B3f(this, this.A00);
    }

    public final void A09() {
        int i;
        int i2;
        CronetEngine cronetEngine;
        if (A0D() != 0) {
            C149517Mt r3 = new C149517Mt();
            try {
                C59722xN r9 = this.A05;
                int A0E = A0E();
                String str = C58172up.A0K;
                String A0F = A0F();
                JSONObject A0G = A0G();
                String A062 = A06();
                int A0C = A0C();
                AnonymousClass7Vw r7 = new AnonymousClass7Vw(this, r3);
                if (!r9.A01.A0F()) {
                    i = -1;
                    i2 = 2;
                } else if (TextUtils.isEmpty(A0G.toString())) {
                    i = 3;
                    i2 = 1;
                } else {
                    C133616hf r1 = r9.A03;
                    AnonymousClass7UW r6 = new AnonymousClass7UW(r7, this, r9, str, A0F, A062, A0G, A0C, A0E);
                    synchronized (r1) {
                        if (AnonymousClass7VT.A01 != null) {
                            cronetEngine = AnonymousClass7VT.A01;
                        } else if (C161637q9.A02()) {
                            cronetEngine = r1.A00();
                        } else {
                            synchronized (AnonymousClass7VT.class) {
                                if (!C161637q9.A02()) {
                                    C161637q9.A00(r1.A00.A00).addOnCompleteListener(new AnonymousClass8BP(r1, r6));
                                } else {
                                    r6.A00(r1.A00());
                                }
                            }
                        }
                        r6.A00(cronetEngine);
                    }
                    return;
                }
                r7.A00(new C156437gc(i, i2));
            } catch (Exception e) {
                if (e instanceof JSONException) {
                    this.A02.A0A("GraphApiACSNetworkRequest/startCronetRequest: Error while generating the JSON: ", true, e.getMessage());
                } else {
                    Log.e("GraphApiACSNetworkRequest/startCronetRequest: generic error - ", e);
                }
                A0L(C18310x6.A0n(e));
                r3.A00 = 3;
                AnonymousClass000.A0A().post(new C71343bx(this, 49, r3));
            }
        } else {
            C18270x1.A0w(this.A07, this.A08);
        }
    }

    public final void A0A(C149517Mt r6) {
        C149757Nt r0;
        C184408rk r4 = this.A04;
        if (r4 == null) {
            Log.d("GraphApiACSNetworkRequest/postNetworkResult: Callback is null");
            return;
        }
        int i = r6.A00;
        if (i == 0) {
            Object obj = r6.A03;
            if (obj != null) {
                r4.onSuccess(obj);
            } else {
                this.A02.A0A("GraphApiACSNetworkRequest/postNetworkResult: Null response content", true, (String) null);
            }
        } else {
            AnonymousClass7T4 r1 = r6.A01;
            if (r1 == null) {
                r1 = new AnonymousClass7T4((Integer) null, (String) null, 10);
            }
            r4.BSO(r1, i);
            if (r6.A00 != 4 && (r0 = r6.A02) != null) {
                A0H(r0);
            }
        }
    }

    public void A0B(C149517Mt r8, C156437gc r9) {
        JSONObject optJSONObject;
        Integer num;
        Integer num2;
        String str;
        String str2;
        int i = r9.A01;
        if (i == -1 || i == 3) {
            r8.A00 = i;
            r8.A01 = new AnonymousClass7T4(Integer.valueOf(i), (String) null, r9.A00);
        } else if (i / 100 == 2) {
            JSONObject jSONObject = r9.A02;
            if (jSONObject != null) {
                r8.A03 = A05(jSONObject);
                C18260x0.A1P(AnonymousClass001.A0o(), "GraphApiACSNetworkRequest/parseNetworkResponse: server response content: ", jSONObject);
                r8.A00 = 0;
                return;
            }
            this.A02.A0A("GraphApiACSNetworkRequest/parseNetworkResponse: cannot parse empty response from server", true, "");
            r8.A01 = new AnonymousClass7T4(Integer.valueOf(i), (String) null, 4);
            r8.A00 = 1;
        } else if (i == 410) {
            r8.A01 = new AnonymousClass7T4(Integer.valueOf(i), (String) null, 5);
            r8.A00 = 4;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GraphApiACSNetworkRequest/parseNetworkResponse Request has failed with code ");
            A0o.append(i);
            C18260x0.A1K(A0o, "");
            r8.A00 = 2;
            Integer valueOf = Integer.valueOf(i);
            r8.A01 = new AnonymousClass7T4(valueOf, (String) null, 9);
            C149757Nt r2 = new C149757Nt(valueOf);
            JSONObject jSONObject2 = r9.A02;
            if (!(jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("error")) == null)) {
                if (optJSONObject.has("code")) {
                    num = Integer.valueOf(optJSONObject.optInt("code"));
                } else {
                    num = null;
                }
                r2.A00 = num;
                if (optJSONObject.has("error_subcode")) {
                    num2 = Integer.valueOf(optJSONObject.optInt("error_subcode"));
                } else {
                    num2 = null;
                }
                r2.A01 = num2;
                if (optJSONObject.has("message")) {
                    str = optJSONObject.optString("message");
                } else {
                    str = null;
                }
                r2.A04 = str;
                if (optJSONObject.has("fbtrace_id")) {
                    str2 = optJSONObject.optString("fbtrace_id");
                } else {
                    str2 = null;
                }
                r2.A03 = str2;
            }
            r8.A02 = r2;
        }
    }

    public void BeB(int i) {
        Log.d("GraphApiACSNetworkRequest onTokenIssuanceFailure");
        if (!C18320x8.A1T(this.A07)) {
            C184408rk r3 = this.A04;
            if (r3 != null) {
                if (i == 4) {
                    r3.BSO(new AnonymousClass7T4((Integer) null, (String) null, 0), -1);
                } else {
                    A09();
                }
            }
            A0I(Integer.valueOf(i), (Integer) null);
        }
    }

    public void BeC(String str) {
        Log.d("GraphApiACSNetworkRequest onTokenIssuanceSuccess");
        if (!C18320x8.A1T(this.A07)) {
            this.A01 = str;
            A09();
        }
    }

    public void BeD(int i) {
        Log.d("GraphApiACSNetworkRequest onTokenNotReady");
        if (!C18320x8.A1T(this.A07)) {
            if (this.A04 != null) {
                A09();
            }
            A0I((Integer) null, Integer.valueOf(i));
        }
    }

    public AnonymousClass8E7(C55682qk r3, C181668n8 r4, C184408rk r5, C59722xN r6, AnonymousClass5ZI r7, AnonymousClass4FS r8, String str) {
        this.A02 = r3;
        this.A08 = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = str;
        this.A06 = r7;
        if (r7 != null) {
            String A062 = A06();
            C162457s7.A0J(A062, 0);
            r7.A01 = A062;
        }
    }
}
