package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.94s  reason: invalid class name */
public abstract class AnonymousClass94s extends C05550Ty {
    public String A00;
    public final AnonymousClass08M A01;
    public final C66663Mh A02;
    public final C56612sH A03;
    public final C66543Lv A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass303 A06 = C1899593h.A0K();
    public final C203499no A07;
    public final C45022Yj A08;
    public final AnonymousClass4UC A09 = new AnonymousClass4UC();

    public String A0D() {
        if (this instanceof C191579Fl) {
            return "report_this_payment_submitted";
        }
        if (this instanceof C191549Fi) {
            return "contact_support_integrity_dpo_submitted";
        }
        if (this instanceof C191539Fh) {
            return "appeal_request_ack";
        }
        if (this instanceof C191529Fg) {
            return "contact_support_submitted";
        }
        if (this instanceof C191569Fk) {
            return "contact_support_submitted_p2p";
        }
        return "contact_ombudsman_submitted";
    }

    public String A0E() {
        if (this instanceof C191579Fl) {
            return "report_this_payment";
        }
        if (this instanceof C191549Fi) {
            return "contact_support_integrity_dpo";
        }
        if (this instanceof C191539Fh) {
            return "restore_payment";
        }
        if (this instanceof C191529Fg) {
            return "contact_support";
        }
        if (this instanceof C191569Fk) {
            return "contact_support_p2p";
        }
        return "contact_ombudsman";
    }

    public void A0I(String str) {
        this.A00 = str;
        this.A06.A03("transaction_id", str);
    }

    public AnonymousClass94s(C66663Mh r4, C56612sH r5, C66543Lv r6, AnonymousClass1VX r7, C203499no r8, C45022Yj r9) {
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A01 = A012;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r9;
        this.A07 = r8;
        A012.A0H(new AnonymousClass9OU(1));
    }

    public String A0F(String str, String str2) {
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (this instanceof C191579Fl) {
            str3 = "### ";
        } else if (this instanceof C191549Fi) {
            str3 = "##### ";
        } else if (this instanceof C191539Fh) {
            str3 = "#### ";
        } else if (this instanceof C191529Fg) {
            str3 = "## ";
        } else {
            if (this instanceof C191569Fk) {
                str3 = "###### ";
            }
            return AnonymousClass000.A0X(str2, A0o);
        }
        A0o.append(str3);
        if (!C107575bX.A0F(str)) {
            A0o.append(str);
        }
        A0o.append(10);
        return AnonymousClass000.A0X(str2, A0o);
    }

    public void A0G(String str) {
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("product_flow", "p2m");
        A0K.A01(this.A06);
        A0K.A03("status", str);
        this.A07.BKE(A0K, AnonymousClass001.A0f(), 114, A0E(), (String) null);
    }

    public void A0H(String str) {
        int i;
        if (str.getBytes().length >= 10) {
            Matcher matcher = Pattern.compile("[a-zA-Z\\u0080-\\u00ff]+").matcher(str);
            int i2 = 0;
            while (matcher.find()) {
                i2++;
                if (i2 >= 3) {
                    A0G("sent");
                    this.A01.A0H(new AnonymousClass9OU(4));
                    boolean z = this instanceof C191559Fj;
                    AnonymousClass1VX r1 = this.A05;
                    if (z) {
                        i = 1925;
                    } else {
                        i = 1924;
                    }
                    String A0Q = r1.A0Q(i);
                    C626936e.A06(A0Q);
                    try {
                        this.A04.A0V(this.A08.A00(C106405Yw.A04(A0Q), (C624134x) null, new AnonymousClass3YM(), A0F(this.A00, str), (List) null, this.A03.A0H()));
                        return;
                    } catch (AnonymousClass24P unused) {
                        Log.e("PAY: BrazilPaymentCareBaseViewModel - failed to send message to Payment Support Brazil JID");
                        return;
                    }
                }
            }
        }
        A0G("failed");
        this.A01.A0H(new AnonymousClass9OU(2));
    }
}
