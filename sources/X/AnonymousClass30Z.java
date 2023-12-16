package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.Map;

/* renamed from: X.30Z  reason: invalid class name */
public class AnonymousClass30Z {
    public long A00;
    public long A01;
    public long A02;
    public long A03 = Long.MAX_VALUE;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08 = Long.MAX_VALUE;
    public Map A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public final long A0D;
    public final C29171iO A0E;
    public final C55682qk A0F;
    public final C56972sr A0G;
    public final C56612sH A0H;
    public final C56982ss A0I;
    public final AnonymousClass1VX A0J;
    public final AnonymousClass4FV A0K;
    public final C60592yo A0L;
    public final AnonymousClass31C A0M;
    public final AnonymousClass4DS A0N;
    public final C67823Qu A0O;
    public volatile long A0P;
    public volatile long A0Q;

    public void A01() {
        A06(false);
    }

    public void A03() {
        A06(true);
    }

    public void A02() {
        C56612sH r2 = this.A0H;
        this.A0P = SystemClock.uptimeMillis();
        this.A0Q = r2.A0H();
    }

    public void A04(AnonymousClass36K r5, int i) {
        C24451Xl r2 = new C24451Xl();
        String str = r5.A00;
        r2.A00 = str;
        r2.A01 = AnonymousClass36K.A0L(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A0K.BhD(r2);
        String A002 = A00(str);
        if (A002 == null) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "ConnectionReader/read/can't send nack for non ackable stanza:", r5);
            return;
        }
        C50412i8 r22 = new C50412i8();
        r22.A05 = A002;
        r22.A07 = r5.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r22.A02("error", String.valueOf(i));
        r22.A00 = -1;
        Class<Jid> cls = Jid.class;
        Jid A0g = r5.A0g(cls, "from");
        if (A0g != null) {
            r22.A02 = A0g;
        }
        String A0L2 = AnonymousClass36K.A0L(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (A0L2 != null) {
            r22.A08 = A0L2;
        }
        Jid A0g2 = r5.A0g(cls, "participant");
        if (A0g2 != null) {
            r22.A01 = A0g2;
        }
        this.A0M.A0H(r22.A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if ((r5 instanceof X.AnonymousClass1fS) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass36K r9, int r10) {
        /*
            r8 = this;
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r5 = r9.A0g(r2, r0)
            boolean r1 = r5 instanceof X.AnonymousClass1fI
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r2 = r9.A0g(r2, r0)
            if (r1 == 0) goto L_0x0016
            r0 = r2
            r2 = r5
            r5 = r0
        L_0x0016:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r6 = r9.A0g(r1, r0)
            boolean r0 = X.C627336j.A0K(r5)
            if (r0 != 0) goto L_0x002a
            boolean r0 = r5 instanceof X.AnonymousClass1fS
            r7 = r5
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r7 = r2
        L_0x002b:
            X.1az r3 = new X.1az
            r3.<init>()
            X.4uZ r1 = X.C106405Yw.A03(r5)
            X.2ss r0 = r8.A0I
            java.lang.Integer r0 = X.AnonymousClass36M.A07(r0, r1)
            r3.A09 = r0
            java.lang.String r0 = "type"
            r4 = 0
            java.lang.String r0 = r9.A0r(r0, r4)
            int r0 = X.AnonymousClass368.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A06 = r0
            if (r6 == 0) goto L_0x0057
            r5 = r6
        L_0x0057:
            java.lang.Integer r0 = X.AnonymousClass368.A06(r5, r2)
            r3.A03 = r0
            X.2sr r1 = r8.A0G
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r7)
            java.lang.Integer r0 = X.AnonymousClass368.A05(r1, r0)
            r3.A05 = r0
            java.lang.String r0 = "offline"
            java.lang.String r1 = r9.A0r(r0, r4)
            boolean r0 = X.AnonymousClass000.A1W(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            r2 = 0
            if (r1 == 0) goto L_0x00a2
            java.lang.Long r0 = X.C829745q.A07(r1)
        L_0x0081:
            r3.A0A = r0
            java.lang.String r0 = "edit"
            java.lang.String r1 = r9.A0r(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x009a
            X.C626936e.A06(r1)
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r2 = X.AnonymousClass368.A04(r0)
        L_0x009a:
            r3.A08 = r2
            X.4FV r0 = r8.A0K
            r0.BhA(r3)
            return
        L_0x00a2:
            r0 = r4
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30Z.A05(X.36K, int):void");
    }

    public void A06(boolean z) {
        if (!this.A0C) {
            this.A0C = true;
            if (this.A04 + this.A06 + this.A05 != 0) {
                C25791b5 r5 = new C25791b5();
                r5.A0D = Long.valueOf(this.A0Q);
                r5.A0A = C18310x6.A0f(this.A07, this.A0P);
                r5.A06 = C18310x6.A0f(this.A03, this.A0P);
                r5.A0B = C18310x6.A0f(SystemClock.uptimeMillis(), this.A0P);
                r5.A02 = Integer.valueOf(C18280x3.A01(z ? 1 : 0));
                r5.A01 = Boolean.valueOf(this.A0E.A00);
                r5.A00 = C18320x8.A0V(this.A0B);
                r5.A03 = Long.valueOf(this.A00);
                r5.A08 = Long.valueOf(this.A04);
                r5.A05 = Long.valueOf(this.A02);
                r5.A0C = Long.valueOf(this.A06);
                r5.A04 = Long.valueOf(this.A01);
                r5.A09 = Long.valueOf(this.A05);
                if (this.A08 != Long.MAX_VALUE) {
                    r5.A07 = AnonymousClass0x9.A0o(this.A0Q - this.A08, 86400000);
                }
                this.A0K.BhD(r5);
            }
        }
    }

    public AnonymousClass30Z(C29171iO r3, C55682qk r4, C56972sr r5, C56612sH r6, C56982ss r7, AnonymousClass1VX r8, AnonymousClass4FV r9, C60592yo r10, AnonymousClass31C r11, AnonymousClass4DS r12, C67823Qu r13, Map map, Map map2) {
        this.A0H = r6;
        this.A0J = r8;
        this.A0F = r4;
        this.A0G = r5;
        this.A0I = r7;
        this.A0K = r9;
        this.A0M = r11;
        this.A0O = r13;
        this.A0E = r3;
        this.A0L = r10;
        this.A0A = map;
        this.A09 = map2;
        this.A0N = r12;
        this.A0D = C56952sp.A06(r8, 3448);
    }

    public static String A00(String str) {
        if ("receipt".equals(str) || "notification".equals(str) || "message".equals(str) || "call".equals(str)) {
            return str;
        }
        return null;
    }
}
