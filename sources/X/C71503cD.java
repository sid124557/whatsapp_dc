package X;

import com.whatsapp.jid.Jid;
import org.json.JSONObject;

/* renamed from: X.3cD  reason: invalid class name and case insensitive filesystem */
public class C71503cD implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public final int A09;

    public C71503cD(AnonymousClass2Q6 r2, Jid jid, Integer num, Integer num2, String str, String str2, String str3, int i) {
        this.A09 = 0;
        this.A00 = 4;
        this.A01 = i;
        this.A06 = str;
        this.A02 = num;
        this.A03 = jid;
        this.A04 = r2;
        this.A05 = num2;
        this.A07 = str2;
        this.A08 = str3;
    }

    public final void run() {
        String str;
        if (this.A09 != 0) {
            C59722xN r2 = (C59722xN) this.A02;
            AnonymousClass7Vw r1 = (AnonymousClass7Vw) this.A03;
            int i = this.A00;
            JSONObject jSONObject = (JSONObject) this.A04;
            try {
                r1.A00(r2.A01((AnonymousClass8E7) this.A05, this.A06, this.A07, this.A08, jSONObject, i, this.A01));
            } catch (Exception e) {
                r1.A01(e);
            }
        } else {
            int i2 = this.A01;
            String str2 = this.A06;
            Jid jid = (Jid) this.A03;
            AnonymousClass2Q6 r7 = (AnonymousClass2Q6) this.A04;
            Integer num = (Integer) this.A05;
            String str3 = this.A07;
            String str4 = this.A08;
            C25581ak r3 = new C25581ak();
            r3.A02 = 4;
            r3.A03 = Integer.valueOf(i2);
            r3.A07 = str2;
            r3.A00 = (Integer) this.A02;
            if (jid != null) {
                str = r7.A02.A00(jid);
            } else {
                str = null;
            }
            r3.A04 = str;
            if (r7.A00.A0Y(C58422vE.A02, 6381)) {
                if (num != null && num.intValue() == 2) {
                    num = C18290x4.A0Z();
                }
                r3.A01 = num;
                r3.A06 = str3;
                r3.A05 = str4;
            }
            r7.A01.BhA(r3);
        }
    }

    public C71503cD(AnonymousClass7Vw r2, AnonymousClass8E7 r3, C59722xN r4, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        this.A09 = 1;
        this.A02 = r4;
        this.A03 = r2;
        this.A00 = i;
        this.A04 = jSONObject;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = i2;
        this.A05 = r3;
    }
}
