package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3TV  reason: invalid class name */
public abstract class AnonymousClass3TV implements AnonymousClass4EZ {
    public Long A00 = null;
    public String A01 = null;
    public final AnonymousClass7T5 A02;
    public final UserJid A03;
    public final C85084Ew A04;

    public void A00(AnonymousClass36K r9, int i) {
        A01(r9, Integer.valueOf(i), (Integer) null, (String) null, 0, true);
    }

    public void A01(AnonymousClass36K r11, Integer num, Integer num2, String str, long j, boolean z) {
        int i;
        int intValue;
        int intValue2;
        AnonymousClass7T5 r2 = this.A02;
        UserJid userJid = this.A03;
        if (this instanceof C32161pf) {
            i = 2;
        } else {
            i = 1;
        }
        r2.A00(userJid, r11, num, num2, this.A00, this.A01, i);
        this.A01 = "RESET";
        if (z) {
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
                if (417 == intValue) {
                    this.A04.BS3(userJid, intValue);
                    return;
                }
            }
            if (num != null && (intValue2 = num.intValue()) != 200) {
                this.A04.BS3(userJid, intValue2);
                return;
            } else if (401 == intValue || 403 == intValue || 404 == intValue) {
                this.A04.BQk(userJid);
                return;
            }
        } else if (str != null) {
            this.A04.BcP(userJid, str, j);
            return;
        }
        this.A04.BX9(userJid);
    }

    public void BQs(String str) {
        int i;
        AnonymousClass7T5 r1 = this.A02;
        UserJid userJid = this.A03;
        if (this instanceof C32161pf) {
            i = 2;
        } else {
            i = 1;
        }
        r1.A00(userJid, (AnonymousClass36K) null, 500, 500, this.A00, this.A01, i);
    }

    public AnonymousClass3TV(AnonymousClass7T5 r2, UserJid userJid, C85084Ew r4) {
        this.A03 = userJid;
        this.A02 = r2;
        this.A04 = r4;
    }

    public void BSN(AnonymousClass36K r2, String str) {
        A00(r2, C57492tj.A01(r2));
    }
}
