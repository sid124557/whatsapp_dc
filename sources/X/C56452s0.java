package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2s0  reason: invalid class name and case insensitive filesystem */
public class C56452s0 {
    public long A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56492s4 A03;
    public final C49712gy A04;
    public final C29411im A05;
    public final C55052pi A06;
    public final C56612sH A07;
    public final C54292oU A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass3LP A0A;
    public final C59792xU A0B;
    public final AnonymousClass31C A0C;
    public final C46072b2 A0D;
    public final C103265Mf A0E;
    public final AnonymousClass8JP A0F;
    public final C55132pq A0G;
    public final C45602aH A0H;
    public final AnonymousClass3FI A0I;
    public final AnonymousClass4FS A0J;

    public void A01(C95814uZ r2, int i, int i2) {
        A03(r2, (C46112b6) null, i, i2);
    }

    public void A03(C95814uZ r11, C46112b6 r12, int i, int i2) {
        C95814uZ r5 = r11;
        if (r11 != null && r11.isProtocolCompliant() && !(r11 instanceof AnonymousClass1fS) && !(r11 instanceof C95804uY)) {
            if (!C57362tW.A00(this.A0A, r11)) {
                C46112b6 r7 = r12;
                int i3 = i2;
                if ((r11 instanceof UserJid) && this.A09.A0O(C58422vE.A02, 609) >= 1) {
                    A06(r12, Collections.singleton(r11), i2);
                } else if (this.A00 < this.A07.A0H() && this.A0H.A00(r11, i2)) {
                    this.A01.A0S(new C117685sK(r5, this, r7, i, i3));
                }
            }
        }
    }

    public void A04(AnonymousClass2T0 r12, long j) {
        AnonymousClass2T0 r3 = r12;
        if (r12.A01 == -1) {
            C51102jH r0 = this.A0H.A02;
            C95814uZ r1 = r12.A03;
            r0.A01(r1);
            this.A06.A02(r1);
            return;
        }
        int i = r12.A02;
        long j2 = j;
        if (r12.A04 != null) {
            this.A0B.A01(r12, j);
        } else if (r12.A06 != null) {
            C54292oU r2 = this.A08;
            AnonymousClass3FI r6 = this.A0I;
            AnonymousClass4FS r7 = this.A0J;
            C34051u9.A01(this.A03, this.A06, r2, r3, this.A0E, this.A0G, r6, r7, 0, j2);
        } else {
            this.A06.A03(r12);
            C103265Mf r22 = this.A0E;
            int i2 = 1;
            if (i == 1) {
                i2 = 2;
            }
            r22.A00((Double) null, C18310x6.A0f(SystemClock.elapsedRealtime(), j), 1, i2, 200);
        }
    }

    public void A00(C95814uZ r5, int i) {
        if (i == 500 || i == 501 || i == 503) {
            this.A00 = this.A07.A0H() + 3600000;
        } else if (i == 401 && r5 != null && !C627336j.A0K(r5)) {
            this.A06.A02(r5);
        }
    }

    public void A02(C95814uZ r22, C27991fJ r23, int i, int i2) {
        String str;
        String str2;
        C95814uZ r4 = r22;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProfilePhotoManager/sendGetSubProfilePhoto photoId:");
        int i3 = i;
        A0o.append(i3);
        A0o.append(" query type:");
        A0o.append("url");
        A0o.append(" jid:");
        A0o.append(r4);
        int i4 = i2;
        C18260x0.A0y(" image type:", A0o, i4);
        if (i4 == 1) {
            str = "image";
        } else {
            str = "preview";
        }
        AnonymousClass31C r1 = this.A0C;
        AnonymousClass3P7 r11 = new AnonymousClass3P7(this, this, this.A0E, (C46112b6) null, this.A0H);
        GroupJid groupJid = (GroupJid) r4;
        if (i > 0) {
            str2 = Integer.toString(i3);
        } else {
            str2 = null;
        }
        String A032 = r1.A03();
        C27991fJ r5 = r23;
        AnonymousClass36K A002 = AnonymousClass27I.A00(groupJid, r5, A032, "url", str, str2, (String) null);
        r1.A0D(new AnonymousClass3T2(r11, r5, groupJid, str, str2), A002, A032, 300, 32000);
    }

    public void A05(AnonymousClass331 r14) {
        C95814uZ r5 = r14.A0G;
        if (r5 != null && r5.isProtocolCompliant() && this.A05.A06 && this.A00 < this.A07.A0H()) {
            Log.w("app/sendSetProfilePhoto");
            C68323Ss r7 = new C68323Ss(r5, this.A0C, r14);
            byte[] bArr = r14.A02;
            boolean A0a = this.A02.A0a(r5);
            r7.A00 = AnonymousClass000.A1X(bArr);
            AnonymousClass31C r6 = r7.A02;
            String A032 = r6.A03();
            C56052rL A012 = C56052rL.A01();
            C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
            C56052rL.A0E(A012, "xmlns", "w:profile:picture");
            C56052rL.A0D(A012, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            if (!A0a) {
                C56052rL.A06(r7.A01, A012, "target");
            }
            C56052rL A042 = C56052rL.A04("picture");
            C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "image");
            C56052rL.A09(A042, A012, bArr);
            r6.A0K(r7, A012.A0F(), A032, 25, 0);
        }
    }

    public boolean A07() {
        return C18280x3.A1U(this.A09.A0O(C58422vE.A02, 609), 2);
    }

    public C56452s0(C69263Wi r2, C56972sr r3, C56492s4 r4, C49712gy r5, C29411im r6, C55052pi r7, C56612sH r8, C54292oU r9, AnonymousClass1VX r10, AnonymousClass3LP r11, C59792xU r12, AnonymousClass31C r13, C46072b2 r14, C103265Mf r15, AnonymousClass8JP r16, C55132pq r17, C45602aH r18, AnonymousClass3FI r19, AnonymousClass4FS r20) {
        this.A08 = r9;
        this.A07 = r8;
        this.A0F = r16;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A0I = r19;
        this.A0J = r20;
        this.A03 = r4;
        this.A0A = r11;
        this.A04 = r5;
        this.A0C = r13;
        this.A0H = r18;
        this.A05 = r6;
        this.A0G = r17;
        this.A06 = r7;
        this.A0E = r15;
        this.A0D = r14;
        this.A0B = r12;
    }

    public final void A06(C46112b6 r5, Set set, int i) {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            if (this.A0H.A00(A0P, i)) {
                A0K.add(A0P);
            }
        }
        if (!A0K.isEmpty()) {
            new C71713cY(this, A0K, i, 12).run();
        }
        if (r5 != null) {
            r5.A00(2);
        }
    }
}
