package X;

import android.os.SystemClock;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3U5  reason: invalid class name */
public class AnonymousClass3U5 implements AnonymousClass4BD {
    public long A00;
    public C33621tQ A01;
    public C43242Ri A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final C106175Xx A06;
    public final C48352el A07;
    public final C69263Wi A08;
    public final C29441ip A09;
    public final C64773Ex A0A;
    public final C56422rx A0B;
    public final C66413Li A0C;
    public final C56612sH A0D;
    public final C57162tC A0E;
    public final C53412n3 A0F;
    public final C42182Nc A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass4FV A0I;
    public final AnonymousClass31C A0J;
    public final AnonymousClass4FS A0K;
    public final String A0L;
    public final WeakReference A0M;
    public final boolean A0N;
    public final boolean A0O;

    public void A00(AnonymousClass304 r8, AnonymousClass2UJ r9) {
        long j;
        if (r9 != null && this.A02 == null) {
            this.A02 = new C43242Ri(r9.A0D, (String) null, (String) null, 3, 0);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C69263Wi r4 = this.A08;
        C70133a0 A002 = C70133a0.A00(this, r8, 43);
        if (elapsedRealtime < 500) {
            j = 500 - elapsedRealtime;
        } else {
            j = 0;
        }
        r4.A0T(A002, j);
    }

    public void BaL(C43242Ri r25) {
        boolean z;
        int i;
        String str;
        String str2;
        AnonymousClass316 r2;
        if (!this.A03) {
            AnonymousClass1VX r7 = this.A0H;
            String str3 = this.A0L;
            boolean A082 = AnonymousClass36Y.A08(r7, str3);
            if (A082 && (r2 = (AnonymousClass316) this.A0G.A02.get("fetch_biz_info")) != null) {
                r2.A09("datasource");
            }
            C43242Ri r22 = r25;
            this.A02 = r22;
            UserJid userJid = r22.A02;
            int i2 = r22.A01;
            if (i2 == -1 || (i = this.A05) != i2 || userJid == null) {
                z = true;
                A00((AnonymousClass304) null, (AnonymousClass2UJ) null);
            } else {
                z = false;
                C58422vE r4 = C58422vE.A02;
                if (r7.A0Y(r4, 508)) {
                    if (i == 2) {
                        str = "message_short_link";
                    } else {
                        str = "qr_code";
                    }
                    if (r7.A0Y(r4, 1669) && i == 2) {
                        if (AnonymousClass36Y.A09(r7, str3)) {
                            str = "custom_qr_code_link";
                        } else if (AnonymousClass36Y.A08(r7, str3)) {
                            str = "custom_link";
                        }
                    }
                    if (this.A0N) {
                        str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                    } else {
                        str2 = null;
                    }
                    this.A0F.A03(userJid, str, str2, System.currentTimeMillis(), System.currentTimeMillis());
                }
                C33621tQ r10 = new C33621tQ(this.A07, this.A0A, this.A0C, userJid, this, r22.A04, (String) null);
                this.A01 = r10;
                AnonymousClass0x7.A1B(r10, this.A0K);
            }
            if (A082) {
                boolean z2 = !z;
                Map map = this.A0G.A02;
                AnonymousClass316 r23 = (AnonymousClass316) map.get("fetch_biz_info");
                if (r23 != null) {
                    short s = 3;
                    if (z2) {
                        s = 2;
                    }
                    r23.A0E(s);
                    map.remove("fetch_biz_info");
                }
            }
        }
    }

    public AnonymousClass3U5(C106175Xx r3, C48352el r4, C69263Wi r5, C29441ip r6, C64773Ex r7, C56422rx r8, C66413Li r9, C56612sH r10, C57162tC r11, C53412n3 r12, C42182Nc r13, AnonymousClass1VX r14, AnonymousClass4FV r15, AnonymousClass31C r16, AnonymousClass33I r17, AnonymousClass4FS r18, String str, int i, int i2, boolean z) {
        this.A0D = r10;
        this.A0H = r14;
        this.A08 = r5;
        this.A0K = r18;
        this.A0I = r15;
        this.A0J = r16;
        this.A0A = r7;
        this.A07 = r4;
        this.A0C = r9;
        this.A06 = r3;
        this.A0G = r13;
        this.A05 = i;
        this.A0E = r11;
        this.A0F = r12;
        this.A0L = str;
        this.A0N = z;
        this.A0B = r8;
        this.A09 = r6;
        AnonymousClass33I r1 = r17;
        this.A0M = AnonymousClass0x9.A14(r1);
        this.A04 = i2;
        this.A0O = r1.A02;
    }
}
