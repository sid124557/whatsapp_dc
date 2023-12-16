package X;

import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.Map;

/* renamed from: X.3EF  reason: invalid class name */
public class AnonymousClass3EF implements AnonymousClass49J {
    public Map A00 = AnonymousClass001.A0t();
    public final C69263Wi A01;
    public final AnonymousClass30S A02;
    public final C59252wc A03;
    public final C23391Sw A04;
    public final C620733j A05;
    public final AnonymousClass4FS A06;
    public final C55742qq A07;
    public final C60092xz A08;

    public void Bh5(C49382gR r11, AnonymousClass39C r12, String str, String str2, String str3) {
        String str4;
        C162457s7.A0J(str, 0);
        this.A00 = AnonymousClass31O.A01(str2);
        C59252wc r8 = this.A03;
        C34281up r4 = new C34281up(r8, str, (String) null);
        if (r12 != null) {
            String str5 = (String) this.A07.A01(r4, r12.A01);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CommerceCustomBloksRequest/cachedData for key[");
            C162457s7.A0H(r4);
            A0o.append(r4.A00());
            A0o.append("] is ");
            if (str5 != null) {
                str4 = "not null";
            } else {
                str4 = "null";
            }
            C18260x0.A1J(A0o, str4);
            if (str5 != null) {
                r11.A01(str5);
                return;
            }
        }
        C61252zx A002 = A00(str);
        C18260x0.A1P(AnonymousClass001.A0o(), "CommerceCustomBloksRequest/bloksLink -> ", A002);
        if (A002 != null) {
            C23391Sw r42 = this.A04;
            C60092xz r5 = this.A08;
            String A003 = C380125b.A00(A002, r5);
            File A012 = r42.A01(AnonymousClass000.A0V("commerce_flow_", A003, C18280x3.A0g(A003, 0)));
            if (A012 != null) {
                File[] listFiles = A012.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                if (listFiles.length != 0) {
                    String A004 = C380125b.A00(A002, r5);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("CommerceCustomBloksRequest/Loading bloks layout for flow[");
                    A0o2.append(A004);
                    C18260x0.A1J(A0o2, "]...");
                    String A0E = r42.A0E(A004);
                    if (A0E != null) {
                        r11.A01(A0E);
                        if (r12 != null) {
                            this.A07.A02(new C34281up(r8, str, (String) null), new AnonymousClass32G((Object) A0E, r12.A00, r12.A02), r12.A01);
                            return;
                        }
                        return;
                    }
                }
            }
            this.A01.BkS(new C71613cO(A002, this, r11, r12, str, 11));
            return;
        }
        this.A02.A05(new AnonymousClass3E2(r11, r12, this, str));
    }

    public C61252zx A00(String str) {
        if (!(this instanceof C34321ut)) {
            return this.A02.A02(str);
        }
        long parseLong = Long.parseLong(AnonymousClass0x2.A0d("flow_version_id", this.A00));
        if (Long.valueOf(parseLong) != null) {
            return this.A02.A01(parseLong);
        }
        return null;
    }

    public void A01(int i) {
        String str;
        String str2;
        if (this instanceof C34321ut) {
            C34321ut r4 = (C34321ut) this;
            C43302Rp r1 = r4.A00;
            Object obj = r4.A00.get("flow_id");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            UserJid A0E = UserJid.Companion.A0E(AnonymousClass0x2.A0c("chat_jid", r4.A00));
            String A0c = AnonymousClass0x2.A0c("message_id", r4.A00);
            String A0c2 = AnonymousClass0x2.A0c("session_id", r4.A00);
            if (r1.A00.A0F()) {
                str2 = "extensions-layout-fetch-failed-error";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "extensions-layout-fetch-failed-verification-error";
                    } else if (i == 4) {
                        str2 = "extensions-layout-fetch-failed-storing-error";
                    }
                }
            } else {
                str2 = "extensions-layout-fetch-failed-network-error";
            }
            r1.A02.A02(r1.A01, r1.A03, r1.A04, A0E, (Boolean) null, "galaxy_message", str, A0c, A0c2, str2, (String) null);
        }
    }

    public AnonymousClass3EF(C69263Wi r2, AnonymousClass30S r3, C59252wc r4, C23391Sw r5, C620733j r6, AnonymousClass4FS r7, C55742qq r8, C60092xz r9) {
        C18260x0.A0f(r8, r2, r7, r4, r6);
        C18260x0.A0U(r3, r9);
        this.A07 = r8;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A08 = r9;
        this.A04 = r5;
    }
}
