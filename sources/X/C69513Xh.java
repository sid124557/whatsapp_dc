package X;

import org.json.JSONObject;

/* renamed from: X.3Xh  reason: invalid class name and case insensitive filesystem */
public final class C69513Xh implements C84754Do {
    public final /* synthetic */ AnonymousClass4EJ A00;
    public final /* synthetic */ C166557yt A01;
    public final /* synthetic */ C166557yt A02;
    public final /* synthetic */ AnonymousClass3MY A03;

    public void BS9(AnonymousClass24F r2) {
        C162457s7.A0J(r2, 0);
        this.A00.BSB(r2);
    }

    public C69513Xh(AnonymousClass4EJ r1, C166557yt r2, C166557yt r3, AnonymousClass3MY r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void BdI(JSONObject jSONObject) {
        C626936e.A06(jSONObject);
        Object A08 = C18330xA.A08(this.A01);
        C626936e.A06(A08);
        C60272yH A002 = AnonymousClass31V.A00(AnonymousClass3MY.A0B, (String) A08, jSONObject);
        if (C162457s7.A0P(C18330xA.A08(A002.A04), C18330xA.A08(this.A02))) {
            this.A00.Bd3(A002);
        } else {
            C18320x8.A1C(this.A00, "ids do not match");
        }
    }
}
