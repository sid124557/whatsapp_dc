package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4KW  reason: invalid class name */
public class AnonymousClass4KW implements AnonymousClass4EZ {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4KW(Object obj, Object obj2, int i, int i2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A00 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r2 > 4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        r0 = new X.C01400Ao();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = new X.C01390An();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQs(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0036;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.String r0 = "disclosuremetadatagetworker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r5.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x0053
            int r4 = r5.A00
            r3 = 430(0x1ae, float:6.03E-43)
            X.2Wq r0 = r2.A03
            r1 = 2
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r2 = X.C18290x4.A0j(r0, r1)
            X.66Y r2 = (X.AnonymousClass66Y) r2
            if (r2 == 0) goto L_0x0031
            int[] r1 = X.C18330xA.A0E()
            r0 = 0
            r1[r0] = r4
            r2.BRF(r1, r3)
        L_0x0031:
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            goto L_0x004a
        L_0x0036:
            java.lang.String r0 = "DisclosureResetOnServerWorker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r5.A01
            X.0QH r0 = (X.AnonymousClass0QH) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r2 = r0.A00
            r0 = 4
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            if (r2 <= r0) goto L_0x0057
        L_0x004a:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
        L_0x004f:
            r1.A01(r0)
            return
        L_0x0053:
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
        L_0x0057:
            X.0An r0 = new X.0An
            r0.<init>()
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KW.BQs(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r2 > 4) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r0 = new X.C01400Ao();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        r0 = new X.C01390An();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSN(X.AnonymousClass36K r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x004d;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            android.util.Pair r2 = X.C57492tj.A02(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "disclosuremetadatagetworker/onError "
            X.C18260x0.A1Q(r1, r0, r2)
            if (r2 == 0) goto L_0x0022
            int r1 = X.C18280x3.A03(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0022
            java.lang.String r0 = "disclosuremetadatagetworker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0022:
            java.lang.Object r2 = r5.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x0081
            int r4 = r5.A00
            r3 = 430(0x1ae, float:6.03E-43)
            X.2Wq r0 = r2.A03
            r1 = 2
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r2 = X.C18290x4.A0j(r0, r1)
            X.66Y r2 = (X.AnonymousClass66Y) r2
            if (r2 == 0) goto L_0x0048
            int[] r1 = X.C18330xA.A0E()
            r0 = 0
            r1[r0] = r4
            r2.BRF(r1, r3)
        L_0x0048:
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            goto L_0x0078
        L_0x004d:
            android.util.Pair r2 = X.C57492tj.A02(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DisclosureResetOnServertWorker/onError "
            X.C18260x0.A1Q(r1, r0, r2)
            if (r2 == 0) goto L_0x0069
            int r1 = X.C18280x3.A03(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0069
            java.lang.String r0 = "DisclosureResetOnServertWorker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0069:
            java.lang.Object r0 = r5.A01
            X.0QH r0 = (X.AnonymousClass0QH) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r2 = r0.A00
            r0 = 4
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            if (r2 <= r0) goto L_0x0085
        L_0x0078:
            X.0Ao r0 = new X.0Ao
            r0.<init>()
        L_0x007d:
            r1.A01(r0)
            return
        L_0x0081:
            java.lang.Object r1 = r5.A02
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
        L_0x0085:
            X.0An r0 = new X.0An
            r0.<init>()
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KW.BSN(X.36K, java.lang.String):void");
    }

    public void BdM(AnonymousClass36K r16, String str) {
        AnonymousClass66Y r1;
        AnonymousClass66Y r0;
        switch (this.A03) {
            case 0:
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A01;
                int i = this.A00;
                List A0s = r16.A0s("notice");
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it = A0s.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    AnonymousClass36K A0Y = C18310x6.A0Y(it);
                    int A022 = AnonymousClass36K.A02(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A023 = AnonymousClass36K.A02(A0Y, "stage");
                    long A032 = AnonymousClass36K.A03(A0Y);
                    int A024 = AnonymousClass36K.A02(A0Y, "version");
                    if (A0Y.A0b(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0) != 2 || A023 <= -1 || A023 >= 1000) {
                        C18260x0.A0z("disclosuremetadatagetworker/parseusernoticemetadatalist not valid PDFN metadata id = ", AnonymousClass001.A0o(), A022);
                    } else {
                        A0s2.add(new C622234e(A022, A023, A024, A032, 2));
                        if (A022 == i) {
                            z = true;
                        }
                    }
                }
                if (!A0s2.isEmpty() && (r0 = (AnonymousClass66Y) C18290x4.A0j(disclosureMetadataGetWorker.A03.A00, 2)) != null) {
                    r0.BEx(A0s2, false, false);
                }
                if (!z && (r1 = (AnonymousClass66Y) C18290x4.A0j(disclosureMetadataGetWorker.A03.A00, 2)) != null) {
                    int[] A0E = C18330xA.A0E();
                    A0E[0] = i;
                    r1.BRF(A0E, 430);
                    break;
                }
                break;
            case 1:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("disclosureresetOnservertWorker/onsuccess disclosureId = ");
                C18260x0.A1G(A0o, this.A00);
                break;
            default:
                return;
        }
        ((AnonymousClass0Pc) this.A02).A01(new C01410Ap());
    }
}
