package X;

import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.1t0  reason: invalid class name */
public final class AnonymousClass1t0 extends AnonymousClass5ZM {
    public final Integer A00;
    public final String A01;
    public final /* synthetic */ PrivacyDisclosureContainerViewModel A02;

    public AnonymousClass1t0(PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel, Integer num, String str) {
        this.A02 = privacyDisclosureContainerViewModel;
        this.A00 = num;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r1 < 400) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        if (r4 != null) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.Integer r4 = r13.A00
            r3 = 0
            if (r4 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureContainerViewModel: getDisclosureById: id="
            X.C18260x0.A1P(r1, r0, r4)
            int r5 = r4.intValue()
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02     // Catch:{ Exception -> 0x0020 }
            X.2rB r0 = r6.A05     // Catch:{ Exception -> 0x0020 }
            X.2rs r0 = r0.A06     // Catch:{ Exception -> 0x0020 }
            int r1 = r0.A00(r5)     // Catch:{ Exception -> 0x0020 }
            r0 = 1
            if (r1 < r0) goto L_0x0035
            goto L_0x0044
        L_0x0020:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureContainerViewModel: try to access to disclosureId="
            r1.append(r0)
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            X.C18270x1.A17(r2, r1)
        L_0x0035:
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02
            X.08M r2 = r6.A03
            X.586 r1 = X.AnonymousClass586.LOADING
            X.5SG r0 = new X.5SG
            r0.<init>(r1, r3, r3)
            r2.A0G(r0)
            goto L_0x0048
        L_0x0044:
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x0035
        L_0x0048:
            X.2rB r0 = r6.A05
            java.lang.String r2 = r0.A00(r5)
            goto L_0x00c6
        L_0x004f:
            java.lang.String r10 = r13.A01
            if (r10 == 0) goto L_0x0101
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0101
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PrivacyDisclosureContainerViewModel: getDisclosureByCallerName: surf="
            X.C18260x0.A0q(r0, r10, r1)
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02
            X.2rB r0 = r6.A05
            r0.A01()
            X.2rs r0 = r0.A06
            r0.A04()
            java.util.concurrent.ConcurrentHashMap r0 = r0.A05
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r0)
            r4 = -2
            r9 = r3
            r8 = r3
        L_0x0078:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.util.Map$Entry r11 = X.AnonymousClass001.A0w(r12)
            java.lang.Object r7 = r11.getValue()
            X.7PW r7 = (X.AnonymousClass7PW) r7
            java.lang.String r2 = r7.A07
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "surf="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r10, r1)
            int r0 = r2.indexOf(r0)
            if (r0 <= 0) goto L_0x0078
            int r1 = r7.A01
            java.util.List r0 = X.C39392Bu.A01
            boolean r0 = X.AnonymousClass0x7.A1U(r0, r1)
            if (r0 != 0) goto L_0x0078
            long r1 = r7.A05
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            java.lang.Object r9 = r11.getKey()
            java.lang.String r8 = r7.A06
            long r4 = r7.A05
            goto L_0x0078
        L_0x00b4:
            if (r9 == 0) goto L_0x0101
            if (r8 == 0) goto L_0x0101
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r9, r8)
            java.lang.Object r4 = r0.first
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            if (r4 == 0) goto L_0x0101
        L_0x00c6:
            if (r2 == 0) goto L_0x0101
            int r5 = r4.intValue()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "PrivacyDisclosureContainerViewModel: loadAndParseDisclosure: id="
            X.C18260x0.A0w(r4, r0, r5)
            X.2xp r1 = r6.A06     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r2)     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            X.5Rs r1 = r1.A00(r0, r5)     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            X.586 r0 = X.AnonymousClass586.SUCCESS     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            X.5SG r6 = new X.5SG     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            r6.<init>(r0, r3, r1)     // Catch:{ 23T -> 0x00ef, JSONException -> 0x00e7 }
            return r6
        L_0x00e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r5, r4)
            java.lang.String r0 = ", JSONException"
            goto L_0x00f6
        L_0x00ef:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.C18270x1.A0W(r5, r4)
            java.lang.String r0 = ", PrivacyDisclosureDataException"
        L_0x00f6:
            X.C18260x0.A15(r0, r1, r2)
            X.586 r0 = X.AnonymousClass586.ERROR
            X.5SG r6 = new X.5SG
            r6.<init>(r0, r2, r3)
            return r6
        L_0x0101:
            X.586 r0 = X.AnonymousClass586.SUCCESS
            X.5SG r6 = new X.5SG
            r6.<init>(r0, r3, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1t0.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C1229366k r0;
        AnonymousClass5SG r3 = (AnonymousClass5SG) obj;
        C162457s7.A0J(r3, 0);
        this.A02.A03.A0H(r3);
        if (r3.A00 == AnonymousClass586.SUCCESS && r3.A02 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PrivacyDisclosureContainerViewModel: loadDisclosure: id=");
            A0o.append(this.A00);
            A0o.append(", surf=");
            A0o.append(this.A01);
            C18260x0.A1J(A0o, ", ineligible disclosure");
            WeakReference weakReference = AnonymousClass5WQ.A00;
            if (!(weakReference == null || (r0 = (C1229366k) weakReference.get()) == null)) {
                r0.BXB();
            }
            AnonymousClass5WQ.A00 = null;
        }
    }
}
