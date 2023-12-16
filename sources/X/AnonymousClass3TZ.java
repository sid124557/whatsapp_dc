package X;

import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3TZ  reason: invalid class name */
public class AnonymousClass3TZ implements AnonymousClass4EZ {
    public AnonymousClass4F2 A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final C69263Wi A03;
    public final C29411im A04;
    public final C45862ah A05;
    public final AnonymousClass31C A06;
    public final AnonymousClass4FS A07;

    public void BQs(String str) {
        if (!this.A01) {
            C69263Wi r2 = this.A03;
            C45862ah r1 = this.A05;
            Objects.requireNonNull(r1);
            r2.BkS(C69983Zk.A00(r1, 17));
        }
    }

    public void BSN(AnonymousClass36K r5, String str) {
        if (!this.A01) {
            Log.e("GetCTWAContextIQ/response-error");
            AnonymousClass36K A0l = r5.A0l("error");
            if (A0l != null) {
                this.A03.BkS(new C117705sM((Object) this, AnonymousClass36K.A01(A0l, "code"), 27));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.2KP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r19, java.lang.String r20) {
        /*
            r18 = this;
            r2 = r18
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0123
            java.lang.String r0 = "context"
            r1 = r19
            X.36K r4 = r1.A0l(r0)
            if (r4 == 0) goto L_0x00db
            java.lang.String r0 = "headline"
            java.lang.String r12 = A00(r4, r0)
            java.lang.String r0 = "body"
            java.lang.String r13 = A00(r4, r0)
            java.lang.String r0 = "click_id"
            java.lang.String r15 = A00(r4, r0)
            java.lang.String r0 = "referral_parameter"
            java.lang.String r16 = A00(r4, r0)
            java.lang.String r0 = "source"
            X.36K r3 = r4.A0l(r0)
            if (r3 == 0) goto L_0x00db
            java.lang.String r0 = "id"
            java.lang.String r6 = A00(r3, r0)
            java.lang.String r0 = "type"
            java.lang.String r5 = A00(r3, r0)
            java.lang.String r1 = "url"
            java.lang.String r3 = A00(r3, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00db
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00db
            X.2Nb r9 = new X.2Nb
            r9.<init>(r6, r5, r3)
            java.lang.String r0 = "thumbnail"
            X.36K r5 = r4.A0l(r0)
            r10 = 0
            if (r5 == 0) goto L_0x0081
            java.lang.String r3 = A00(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "bytes"
            X.36K r0 = r5.A0l(r0)
            if (r0 == 0) goto L_0x007b
            byte[] r10 = r0.A01
        L_0x007b:
            X.2KP r0 = new X.2KP
            r0.<init>(r3, r10)
            r10 = r0
        L_0x0081:
            java.lang.String r0 = "welcome_message"
            X.36K r0 = r4.A0l(r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r14 = r0.A0n()
        L_0x008e:
            java.lang.String r0 = "icebreaker"
            java.util.List r0 = r4.A0s(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            if (r0 == 0) goto L_0x00f7
            java.util.Iterator r8 = r0.iterator()
        L_0x009e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f7
            X.36K r7 = X.C18310x6.A0Y(r8)
            java.lang.String r0 = "question"
            X.36K r5 = r7.A0l(r0)
            if (r5 == 0) goto L_0x009e
            java.lang.String r0 = r5.A0n()
            if (r0 == 0) goto L_0x009e
            java.lang.String r6 = r5.A0n()
            java.lang.String r0 = "response"
            X.36K r5 = r7.A0l(r0)
            if (r5 == 0) goto L_0x00d7
            java.lang.String r0 = r5.A0n()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r5 = r5.A0n()
        L_0x00ce:
            X.2ez r0 = new X.2ez
            r0.<init>(r6, r5)
            r3.add(r0)
            goto L_0x009e
        L_0x00d7:
            r5 = 0
            goto L_0x00ce
        L_0x00d9:
            r14 = 0
            goto L_0x008e
        L_0x00db:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetCTWAContextIQ/onSuccess corrupted-response context iq="
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = ""
            X.C18260x0.A1K(r1, r0)
            X.3Wi r3 = r2.A03
            r0 = 18
            X.3Zk r1 = X.C69983Zk.A00(r2, r0)
            goto L_0x0120
        L_0x00f7:
            java.lang.String r0 = "video"
            X.36K r0 = r4.A0l(r0)
            r11 = 0
            if (r0 == 0) goto L_0x0110
            java.lang.String r1 = A00(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0110
            X.2Fp r11 = new X.2Fp
            r11.<init>(r1)
        L_0x0110:
            X.2TX r8 = new X.2TX
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.3Wi r3 = r2.A03
            r0 = 48
            X.5rT r1 = new X.5rT
            r1.<init>(r2, r0, r8)
        L_0x0120:
            r3.BkS(r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TZ.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass3TZ(C69263Wi r2, C29411im r3, C45862ah r4, AnonymousClass31C r5, AnonymousClass4FS r6) {
        this.A03 = r2;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
    }

    public static final String A00(AnonymousClass36K r0, String str) {
        AnonymousClass36K A0l = r0.A0l(str);
        if (A0l == null) {
            return null;
        }
        return A0l.A0n();
    }
}
