package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sD  reason: invalid class name and case insensitive filesystem */
public class C56572sD {
    public final C56972sr A00;
    public final C52192l2 A01;
    public final C64773Ex A02;
    public final C56612sH A03;
    public final C56982ss A04;
    public final C56082rO A05;
    public final C42882Pw A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass3LP A08;
    public final AnonymousClass4FV A09;
    public final C55582qa A0A;
    public final C53202mi A0B;

    public final int A00(C95814uZ r5) {
        int i;
        AnonymousClass31A A002 = C56982ss.A00(this.A04, r5);
        int i2 = 0;
        if (r5 == null) {
            Log.e("spamManager/isCallNotSpamProp/null jid");
        } else {
            List A012 = A01();
            if (A012 != null && A012.contains(r5)) {
                i2 = 1;
            }
        }
        int i3 = i2 ^ 1;
        if (A002 == null) {
            return i3 ^ 1;
        }
        if (i3 == 0) {
            return 1;
        }
        synchronized (A002) {
            i = A002.A04;
        }
        return i;
    }

    public final List A01() {
        String A012 = this.A05.A01("call_not_spam_jids");
        if (A012 == null || A012.length() <= 0) {
            return null;
        }
        return C627336j.A0B(C95814uZ.class, C18310x6.A0t(A012));
    }

    public void A02(C95814uZ r6, Integer num, boolean z) {
        C52192l2 r4 = this.A01;
        long A0H = this.A03.A0H();
        try {
            JSONObject A012 = r4.A01(r6);
            if (A012 == null) {
                A012 = AnonymousClass0x9.A1G();
            }
            A012.put("tb_last_action_ts", A0H);
            r4.A02(r6, A012);
        } catch (JSONException unused) {
        }
        if (z) {
            C24621Yc r1 = new C24621Yc();
            r1.A00 = num;
            r1.A01 = AnonymousClass001.A0f();
            r1.A02 = r6.getRawString();
            AnonymousClass4FV r0 = this.A09;
            r0.BhD(r1);
            r0.BKX();
        }
    }

    public void A04(GroupJid groupJid, UserJid userJid, int i, boolean z) {
        if (z) {
            C55582qa r2 = this.A0A;
            Set set = r2.A0C;
            synchronized (set) {
                r2.A00();
                if (set.remove(groupJid.getRawString())) {
                    r2.A01();
                }
            }
        } else if (userJid == null || this.A02.A09(userJid) == null) {
            A03(groupJid, i);
        } else {
            this.A0A.A02(new AnonymousClass2OD(i, A00(groupJid)), groupJid);
        }
    }

    public boolean A06(C95814uZ r9) {
        C52192l2 r2 = this.A01;
        long A0H = this.A03.A0H();
        try {
            JSONObject A012 = r2.A01(r9);
            if (A012 == null || !A012.has("tb_expired_ts") || !A012.has("tb_cooldown") || A012.getLong("tb_expired_ts") < A0H) {
                return false;
            }
            if (!A012.has("tb_last_action_ts") || A012.getLong("tb_last_action_ts") + A012.getLong("tb_cooldown") <= A0H) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public boolean A07(C95814uZ r7, int i) {
        int intValue;
        C42882Pw r5 = this.A06;
        AnonymousClass31A A002 = C56982ss.A00(r5.A02, r7);
        if (A002 == null) {
            return false;
        }
        int i2 = A002.A04;
        if (i2 != i) {
            A002.A04 = i;
            r5.A00.A01(new C70093Zw(r5, 49, A002), 34);
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null || (intValue = valueOf.intValue()) == i) {
            return false;
        }
        if (i == 1 && (r7 instanceof GroupJid)) {
            this.A0A.A02(new AnonymousClass2OD(1, intValue), (GroupJid) r7);
        }
        return true;
    }

    public boolean A08(C27991fJ r4, Boolean bool) {
        AnonymousClass3ZH r1;
        C64773Ex r12 = this.A02;
        UserJid A0D = r12.A0D(r4);
        if (A0D != null) {
            r1 = r12.A0A(A0D);
        } else {
            r1 = null;
        }
        if ((r1 == null || (!C56972sr.A08(this.A00, r1) && r1.A0F == null)) && !this.A0B.A02(r4) && !bool.booleanValue() && A00(r4) == -1) {
            return true;
        }
        return false;
    }

    public boolean A09(UserJid userJid) {
        if (C57362tW.A00(this.A08, userJid) || C616831v.A00(this.A07, userJid)) {
            return true;
        }
        AnonymousClass3ZH A0A2 = this.A02.A0A(userJid);
        if (this.A00.A0Y()) {
            return true;
        }
        if (A06(userJid) || (A0A2.A0F == null && A00(userJid) == -1)) {
            return false;
        }
        return true;
    }

    public C56572sD(C56972sr r1, C52192l2 r2, C64773Ex r3, C56612sH r4, C56982ss r5, C56082rO r6, C42882Pw r7, AnonymousClass1VX r8, AnonymousClass3LP r9, AnonymousClass4FV r10, C55582qa r11, C53202mi r12) {
        this.A03 = r4;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A0B = r12;
        this.A0A = r11;
        this.A01 = r2;
    }

    public void A03(GroupJid groupJid, int i) {
        int A002 = A00(groupJid);
        if (A002 == 1) {
            this.A0A.A02(new AnonymousClass2OD(i, A002), groupJid);
        } else if (A002 != -2 && A002 != -1) {
            C42882Pw r4 = this.A06;
            AnonymousClass31A A003 = C56982ss.A00(r4.A02, groupJid);
            if (A003 != null && A003.A04 != -1) {
                A003.A04 = -1;
                r4.A00.A01(new C70093Zw(r4, 48, A003), 34);
            }
        }
    }

    public boolean A05(C95814uZ r3) {
        int A002 = A00(r3);
        if (A002 == -1 || A002 == -2 || A002 == 0) {
            return true;
        }
        return false;
    }
}
