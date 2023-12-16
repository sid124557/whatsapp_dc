package X;

import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9k7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201429k7 implements Runnable {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C184518rx A02;
    public final /* synthetic */ C136996nb A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ JSONObject A0B;

    public final void run() {
        C136996nb r3 = this.A03;
        String str = this.A05;
        String str2 = this.A07;
        UserJid userJid = this.A01;
        AnonymousClass39L r0 = this.A00;
        String str3 = this.A08;
        String str4 = this.A09;
        C136996nb.A00(r0, userJid, this.A02, r3, this.A04, str, str2, str3, str4, this.A0A, this.A06, this.A0B);
    }

    public /* synthetic */ C201429k7(AnonymousClass39L r1, UserJid userJid, C184518rx r3, C136996nb r4, Long l, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject) {
        this.A03 = r4;
        this.A05 = str;
        this.A07 = str2;
        this.A01 = userJid;
        this.A00 = r1;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = l;
        this.A0A = str5;
        this.A06 = str6;
        this.A0B = jSONObject;
        this.A02 = r3;
    }
}
