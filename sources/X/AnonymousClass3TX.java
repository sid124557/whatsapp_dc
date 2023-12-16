package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.net.URL;
import java.util.ArrayList;

/* renamed from: X.3TX  reason: invalid class name */
public class AnonymousClass3TX implements AnonymousClass4EZ {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass4D1 A03;
    public final C95814uZ A04;
    public final AnonymousClass31C A05;
    public final AnonymousClass8JP A06;
    public final String A07;
    public final String A08;

    public final AnonymousClass36K A00(C95814uZ r8, String str) {
        String str2 = this.A08;
        boolean equals = "image".equals(str2);
        ArrayList A0s = AnonymousClass001.A0s();
        if (equals || A01()) {
            AnonymousClass39V.A03("query", "url", A0s);
        }
        String str3 = this.A07;
        if (str3 != null) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, A0s);
        }
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, A0s);
        AnonymousClass36K A0I = AnonymousClass36K.A0I("picture", C18300x5.A1Z(A0s, 0));
        AnonymousClass39V[] r2 = new AnonymousClass39V[5];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2, 0);
        AnonymousClass39V.A05("xmlns", "w:profile:picture", r2);
        r2[2] = AnonymousClass39V.A00();
        r2[3] = new AnonymousClass39V((Jid) r8, "target");
        AnonymousClass39V.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2);
        return AnonymousClass36K.A0G(A0I, r2);
    }

    public void BQs(String str) {
        this.A06.markerEnd(154475307, str.hashCode(), 3);
    }

    public AnonymousClass3TX(C56612sH r3, AnonymousClass1VX r4, AnonymousClass4D1 r5, C95814uZ r6, AnonymousClass31C r7, AnonymousClass8JP r8, String str, String str2) {
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A08 = str;
        this.A04 = r6;
        this.A07 = str2;
        this.A06 = r8;
        this.A03 = r5;
    }

    public final boolean A01() {
        String str = this.A08;
        if ("preview".equals(str) && this.A02.A0Y(C58422vE.A02, 101)) {
            return true;
        }
        if (!"image".equals(str) || !this.A02.A0Y(C58422vE.A02, 102)) {
            return false;
        }
        return true;
    }

    public void BSN(AnonymousClass36K r12, String str) {
        int A012 = C57492tj.A01(r12);
        if (A012 == 404 || A012 == 410) {
            this.A03.BYy(new AnonymousClass2T0(this.A04, (String) null, (String) null, (URL) null, (byte[]) null, -1, C18280x3.A00("preview".equals(this.A08) ? 1 : 0)), this.A00);
        } else {
            this.A03.BYx(this.A04, this.A08, A012, this.A00);
        }
        this.A06.markerEnd(154475307, str.hashCode(), 87);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.net.URL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r15, java.lang.String r16) {
        /*
            r14 = this;
            java.lang.String r0 = "picture"
            X.36K r6 = r15.A0l(r0)
            java.lang.String r4 = r14.A07
            r3 = 4158(0x103e, float:5.827E-42)
            r2 = 154475307(0x9351b2b, float:2.1799857E-33)
            r11 = 0
            if (r6 == 0) goto L_0x005f
            byte[] r5 = r6.A01
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "direct_path"
            java.lang.String r8 = r6.A0r(r0, r11)
            X.1VX r4 = r14.A02
            r1 = 4406(0x1136, float:6.174E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "hash"
            java.lang.String r9 = r6.A0r(r0, r11)
        L_0x0031:
            java.lang.String r0 = "url"
            r1 = 0
            java.lang.String r0 = r6.A0r(r0, r11)
            if (r0 == 0) goto L_0x0056
            goto L_0x0041
        L_0x003c:
            r9 = r11
            goto L_0x0031
        L_0x003e:
            r8 = r11
            r9 = r11
            goto L_0x0031
        L_0x0041:
            java.net.URL r11 = X.C18330xA.A0B(r0)     // Catch:{ MalformedURLException -> 0x0046 }
            goto L_0x0056
        L_0x0046:
            X.8JP r1 = r14.A06
            int r0 = r16.hashCode()
            r1.markerEnd(r2, r0, r3)
            java.lang.String r0 = "Malformed picture url"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0056:
            java.lang.String r0 = "id"
            java.lang.String r4 = r6.A0r(r0, r1)
            r10 = r11
            r11 = r5
            goto L_0x0062
        L_0x005f:
            r10 = r11
            r8 = r11
            r9 = r11
        L_0x0062:
            if (r4 != 0) goto L_0x0066
            r12 = -1
            goto L_0x006a
        L_0x0066:
            int r12 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0090 }
        L_0x006a:
            X.4D1 r5 = r14.A03     // Catch:{ NumberFormatException -> 0x0090 }
            X.4uZ r7 = r14.A04     // Catch:{ NumberFormatException -> 0x0090 }
            java.lang.String r1 = r14.A08     // Catch:{ NumberFormatException -> 0x0090 }
            java.lang.String r0 = "preview"
            boolean r0 = r0.equals(r1)     // Catch:{ NumberFormatException -> 0x0090 }
            int r13 = X.C18280x3.A00(r0)
            X.2T0 r6 = new X.2T0     // Catch:{ NumberFormatException -> 0x0090 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ NumberFormatException -> 0x0090 }
            long r0 = r14.A00     // Catch:{ NumberFormatException -> 0x0090 }
            r5.BYy(r6, r0)     // Catch:{ NumberFormatException -> 0x0090 }
            X.8JP r3 = r14.A06
            int r1 = r16.hashCode()
            r0 = 2
            r3.markerEnd(r2, r1, r0)
            return
        L_0x0090:
            X.8JP r1 = r14.A06
            int r0 = r16.hashCode()
            r1.markerEnd(r2, r0, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Malformed photo id="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TX.BdM(X.36K, java.lang.String):void");
    }
}
