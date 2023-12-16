package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.30X  reason: invalid class name */
public class AnonymousClass30X {
    public static final AnonymousClass39V[] A0E = new AnonymousClass39V[0];
    public int A00;
    public long A01;
    public long A02;
    public Map A03;
    public final C55682qk A04;
    public final C66663Mh A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass1VX A08;
    public final C60592yo A09;
    public final AnonymousClass2OV A0A;
    public final C55352qD A0B;
    public final C55892r5 A0C;
    public final C84864Ea A0D;

    public static String A00(AnonymousClass30X r1, int i) {
        int i2 = i + 1;
        r1.A00 = i2;
        return Integer.toHexString(i2);
    }

    public static void A02(AnonymousClass36K r1, AnonymousClass30X r2) {
        r2.A0D.Bsa(r1);
    }

    public void A03() {
        A02(C35201wU.A00("available"), this);
    }

    public void A04() {
        String A002 = A00(this, this.A00);
        C35671xF r3 = new C35671xF(new C35361wk(A002, 16));
        this.A03.put(A002, new AnonymousClass4HN(this, 2, r3));
        A02(r3.A00, this);
    }

    public void A05(AnonymousClass36K r7, long j) {
        C56202rb A022 = this.A0C.A02(j);
        if (A022 != null) {
            synchronized (A022) {
                int i = A022.A00;
                if (i == 0) {
                    C55682qk r3 = A022.A05;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("tag=");
                    r3.A0A("loggable_stanza_already_acked", true, AnonymousClass000.A0X(A022.A01(), A0o));
                } else {
                    A022.A04(i, SystemClock.uptimeMillis() - A022.A01);
                    A022.A00 = 0;
                    A022.A04(0, SystemClock.uptimeMillis() - A022.A04);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("LoggableStanza/onStanzaAcked/stanzaId=");
                    C18260x0.A1L(A0o2, A022.A0C);
                    C55892r5 r32 = A022.A08;
                    synchronized (r32) {
                        r32.A03(A022.A02).remove(Long.valueOf(A022.A03));
                        Iterator A032 = C61102zi.A03(r32.A02);
                        while (A032.hasNext()) {
                            ((AnonymousClass4FA) A032.next()).Bc2(A022);
                        }
                    }
                }
            }
        }
        A02(r7, this);
    }

    public void A07(boolean z) {
        String A002 = A00(this, this.A00);
        AnonymousClass4HM.A00(this, A002, this.A03, 2);
        String A0Z = C18280x3.A0Z(this.A05.A00, "server_props:config_hash");
        if (A0Z == null || z) {
            A0Z = "";
        }
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F("protocol", "2", r2);
        AnonymousClass39V.A0B("hash", A0Z, r2, 1);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("props", r2);
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(A002, A0F ? 1 : 0);
        AnonymousClass39V.A0C("xmlns", "w", A0H, 1, 2);
        A02(AnonymousClass36K.A0C(C135206kI.A00, A0I, A0H), this);
    }

    public boolean A08() {
        byte[] decode;
        String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(this.A07), "pref_client_auth_token");
        if (TextUtils.isEmpty(A0Z) || (decode = Base64.decode(A0Z, 3)) == null) {
            return false;
        }
        C56052rL A042 = C56052rL.A04("ib");
        C56052rL A043 = C56052rL.A04("cat");
        C626836d.A0H(decode, 1, 1024);
        C56052rL.A09(A043, A042, decode);
        A02(A042.A0F(), this);
        return true;
    }

    public AnonymousClass30X(C55682qk r2, C66663Mh r3, C54292oU r4, AnonymousClass33p r5, AnonymousClass1VX r6, AnonymousClass2H8 r7, C60592yo r8, C55352qD r9, C55892r5 r10, C84864Ea r11, AnonymousClass4FS r12, Map map) {
        this.A08 = r6;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = r3;
        this.A0B = r9;
        this.A0C = r10;
        this.A07 = r5;
        this.A09 = r8;
        this.A03 = map;
        this.A0A = new AnonymousClass2OV(r2, r7, r12);
        this.A0D = r11;
    }

    public static StringBuilder A01(AnonymousClass36K r0, AnonymousClass30X r1, long j) {
        r1.A05(r0, j);
        return new StringBuilder();
    }

    public void A06(AnonymousClass39T r8) {
        AnonymousClass36K A012 = r8.A01();
        C55892r5 r3 = this.A0C;
        long j = r8.A00;
        C56202rb A013 = r3.A01(2, j);
        if (!(A013 == null || A013.A0A == null)) {
            C55352qD r5 = this.A0B;
            if (!r5.A00.A0Y(C58422vE.A01, 4429)) {
                synchronized (r5) {
                    r5.A02.add(r8);
                }
            }
        }
        A05(AnonymousClass36Z.A06(A012, r8), j);
    }
}
