package X;

import android.text.TextUtils;

/* renamed from: X.34V  reason: invalid class name */
public class AnonymousClass34V {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass36K A03;
    public AnonymousClass36K A04;
    public AnonymousClass36K A05;
    public String A06;
    public String A07;
    public String A08;

    public static AnonymousClass34V A00(AnonymousClass36K r1) {
        if (!TextUtils.isEmpty(AnonymousClass36K.A0L(r1, "error-code")) || (r1 = r1.A0l("pin")) != null) {
            return new AnonymousClass34V(r1);
        }
        return null;
    }

    public AnonymousClass34V(AnonymousClass36K r5) {
        this.A01 = -1;
        this.A00 = C615531h.A01(r5.A0r("error-code", (String) null), 0);
        this.A08 = r5.A0r("error-text", (String) null);
        r5.A0r("display_title", (String) null);
        this.A07 = r5.A0r("display_text", (String) null);
        this.A01 = C615531h.A01(r5.A0r("remaining-retries", (String) null), -1);
        this.A02 = C615531h.A03(r5.A0r("next-retry-ts", (String) null));
        this.A06 = r5.A0r("auth-ticket-fp", (String) null);
        this.A04 = r5.A0l("offer_eligibility");
        int i = this.A00;
        if (i == 1448) {
            this.A03 = r5.A0l("key");
        } else if (i == 10718) {
            this.A01 = 0;
        } else if (i == 454) {
            this.A05 = r5.A0l("step_up");
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[ code: ");
        A0o.append(this.A00);
        A0o.append(" text: ");
        A0o.append(this.A08);
        A0o.append(" remaining-retries: ");
        A0o.append(this.A01);
        A0o.append(" next-attempt-ts: ");
        A0o.append(this.A02);
        String str3 = this.A06;
        if (str3 != null) {
            str = AnonymousClass000.A0V(" auth-ticket-fp: ", str3, AnonymousClass001.A0o());
        } else {
            str = "";
        }
        A0o.append(str);
        A0o.append(" key-node: ");
        if (this.A03 != null) {
            str2 = "set";
        } else {
            str2 = "null";
        }
        A0o.append(str2);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    public AnonymousClass34V(int i) {
        this.A01 = -1;
        this.A00 = i;
    }

    public AnonymousClass34V() {
        this.A01 = -1;
        this.A00 = 0;
    }
}
