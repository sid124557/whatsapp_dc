package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* renamed from: X.9Uu  reason: invalid class name and case insensitive filesystem */
public class C194869Uu {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final AnonymousClass39L A07;
    public final C59942xk A08;
    public final C194679Ub A09;
    public final C194749Ui A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public C194869Uu(String str) {
        JSONObject A1H = AnonymousClass0x9.A1H(str);
        this.A03 = A1H.getInt("state");
        this.A04 = A1H.getLong("end_ts");
        this.A0F = A1H.getString("title");
        this.A0D = A1H.getString("locale");
        this.A06 = A1H.getLong("start_ts");
        this.A0E = A1H.getString("terms_url");
        this.A05 = (long) A1H.getInt("redeem_limit");
        this.A0B = A1H.getString("description");
        this.A0C = A1H.getString("fine_print_url");
        this.A02 = A1H.getBoolean("interactive_sync_done");
        this.A00 = A1H.getInt("kill_switch_info_viewed");
        this.A01 = A1H.getInt("sender_maxed_info_viewed");
        this.A08 = new C59942xk(A1H.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        C60042xu r1 = new C60042xu();
        r1.A02 = AnonymousClass1S3.A06;
        r1.A01();
        this.A07 = new C60042xu(C18300x5.A10("offer_amount", A1H)).A01();
        this.A09 = new C194679Ub(A1H.getString("payment"));
        this.A0A = new C194749Ui(A1H.getString("receiver"));
    }

    public C194869Uu(C617332a r5, C59942xk r6, C192289Ix r7, String str) {
        int i;
        this.A08 = r6;
        this.A0D = str;
        this.A0F = r7.A0E;
        this.A04 = r7.A06.longValue();
        this.A0E = r7.A0D;
        this.A06 = r7.A08.longValue();
        this.A0B = r7.A09;
        this.A0C = r7.A0B;
        this.A05 = r7.A07.longValue();
        String str2 = r7.A0C;
        if (str2.equalsIgnoreCase("active")) {
            i = 0;
        } else if (str2.equalsIgnoreCase("inactive")) {
            i = 1;
        } else if (str2.equalsIgnoreCase("archived")) {
            i = 2;
        } else {
            throw new AnonymousClass24Y(AnonymousClass000.A0V("invalid state for offer: ", str2, AnonymousClass001.A0o()));
        }
        this.A03 = i;
        C192029Hw r3 = r7.A04;
        C60042xu r2 = new C60042xu();
        r2.A02 = r5.A01(r3.A01);
        r2.A01 = Long.parseLong(r3.A03);
        r2.A00 = Integer.parseInt(r3.A02);
        this.A07 = r2.A01();
        C192019Hu r0 = r7.A02;
        C626936e.A06(r0);
        this.A09 = new C194679Ub(r5, r0.A00);
        this.A0A = new C194749Ui(r7.A0A, r7.A05);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }
}
