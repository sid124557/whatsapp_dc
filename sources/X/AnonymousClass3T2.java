package X;

import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import java.net.URL;

/* renamed from: X.3T2  reason: invalid class name */
public class AnonymousClass3T2 implements AnonymousClass4EZ {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass4D1 A01;
    public final GroupJid A02;
    public final String A03;
    public final String A04;

    public void BQs(String str) {
    }

    public AnonymousClass3T2(AnonymousClass4D1 r3, GroupJid groupJid, GroupJid groupJid2, String str, String str2) {
        this.A01 = r3;
        if (groupJid == null) {
            this.A02 = groupJid2;
        } else {
            this.A02 = groupJid;
        }
        this.A04 = str;
        this.A03 = str2;
    }

    public void BSN(AnonymousClass36K r12, String str) {
        int A012 = C57492tj.A01(r12);
        GroupJid groupJid = this.A02;
        if (groupJid == null || A012 != 404) {
            this.A01.BYx(groupJid, this.A04, A012, this.A00);
        } else {
            this.A01.BYy(new AnonymousClass2T0(groupJid, (String) null, (String) null, (URL) null, (byte[]) null, -1, C18280x3.A00("preview".equals(this.A04) ? 1 : 0)), this.A00);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.net.URL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "picture"
            X.36K r5 = r14.A0l(r0)
            java.lang.String r3 = r13.A03
            com.whatsapp.jid.GroupJid r6 = r13.A02
            java.lang.String r4 = r13.A04
            r10 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.String r0 = "id"
            java.lang.String r3 = r5.A0r(r0, r10)
            java.lang.String r4 = X.AnonymousClass36K.A0K(r5)
            java.lang.String r0 = "linked_group_jid"
            java.lang.String r2 = r5.A0r(r0, r10)
            java.lang.String r0 = "url"
            java.lang.String r1 = r5.A0r(r0, r10)
            java.lang.String r0 = "direct_path"
            java.lang.String r7 = r5.A0r(r0, r10)
            java.lang.String r0 = "hash"
            java.lang.String r8 = r5.A0r(r0, r10)
            if (r1 == 0) goto L_0x0045
            java.net.URL r10 = X.C18330xA.A0B(r1)     // Catch:{ MalformedURLException -> 0x003a }
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "Malformed picture url"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0041:
            r9 = r10
            r7 = r10
            r8 = r10
            goto L_0x004f
        L_0x0045:
            byte[] r0 = r5.A01
            if (r2 == 0) goto L_0x004d
            X.1fJ r6 = X.AnonymousClass34R.A04(r2)
        L_0x004d:
            r9 = r10
            r10 = r0
        L_0x004f:
            if (r3 != 0) goto L_0x0055
            r11 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0071
            goto L_0x005a
        L_0x0055:
            int r11 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0072 }
            goto L_0x0052
        L_0x005a:
            X.4D1 r2 = r13.A01     // Catch:{ NumberFormatException -> 0x0072 }
            java.lang.String r0 = "preview"
            boolean r0 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x0072 }
            int r12 = X.C18280x3.A00(r0)
            X.2T0 r5 = new X.2T0     // Catch:{ NumberFormatException -> 0x0072 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ NumberFormatException -> 0x0072 }
            long r0 = r13.A00     // Catch:{ NumberFormatException -> 0x0072 }
            r2.BYy(r5, r0)     // Catch:{ NumberFormatException -> 0x0072 }
        L_0x0071:
            return
        L_0x0072:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Malformed photo id="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T2.BdM(X.36K, java.lang.String):void");
    }
}
