package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.9oU  reason: invalid class name and case insensitive filesystem */
public class C203899oU extends C197739dn {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203899oU(Context context, C40602Ha r2, C84104Ba r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void A03(AnonymousClass34V r5) {
        AnonymousClass4EY r0;
        switch (this.A02) {
            case 2:
                ((C193989Rd) this.A01).A00();
                return;
            case 3:
                return;
            case 4:
                C1899593h.A1G(((AnonymousClass9U5) this.A00).A0H, r5, "tosv3 onRequestError: ", AnonymousClass001.A0o());
                break;
            case 5:
                C1899593h.A1G(((AnonymousClass9S6) this.A00).A0A, r5, "BrazilAddCredentialAction : onRequestError: ", AnonymousClass001.A0o());
                AnonymousClass9Bw.A0c(((AnonymousClass9OJ) this.A01).A00, (Map) null, r5.A00);
                return;
            case 6:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9NN) this.A01).A00;
                brazilPaymentTransactionDetailActivity.BjL();
                brazilPaymentTransactionDetailActivity.Box(new Object[0], R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            case 7:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilFetchNetworkInfoAction/onRequestError: ", r5);
                ((AnonymousClass9RN) this.A01).A00((AnonymousClass9Q0) null);
                return;
            case 8:
                ((C194159Ru) this.A00).A06.BU0(r5, (List) null);
                return;
            case 9:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilGetVerificationMethods onRequestError: ", r5);
                ((C203009my) this.A01).BaU(r5, (List) null);
                return;
            case 10:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilRemoveMerchantAccount onRequestError: ", r5);
                break;
            case 11:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilFetchEloChallengeIdAction onRequestError: ", r5);
                ((AnonymousClass9NF) this.A01).A00.A02(r5, (String) null);
                return;
            case 12:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilSubmitVerificationMethodAction onRequestError: ", r5);
                ((AnonymousClass9RL) this.A01).A00(r5, (AnonymousClass99I) null);
                return;
            case 13:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PAY: MFAAction/onRequestError - ");
                A0o.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C18260x0.A1S(A0o, ": ", r5);
                ((AnonymousClass9OD) this.A01).A00.BS8(new AnonymousClass9V4(r5));
                return;
            case 14:
                C203499no A06 = AnonymousClass9U4.A06(((C194329Sl) this.A00).A07);
                if (A06 != null) {
                    A06.reset();
                }
                r0 = (AnonymousClass4EY) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 15:
                ((C194059Rk) this.A01).A00(r5);
                return;
            case 17:
                ((AnonymousClass9Qy) this.A01).A00(r5);
                return;
            case 18:
                AnonymousClass9Qz r3 = (AnonymousClass9Qz) this.A01;
                C1899593h.A1H(r3.A01.A06, r5, "performNameCheck onError: ", AnonymousClass001.A0o());
                r3.A00.BS6(r5);
                return;
            case 19:
                AnonymousClass9R0 r32 = (AnonymousClass9R0) this.A01;
                C1899593h.A1H(r32.A01.A06, r5, "performDobComplianceCheck onError: ", AnonymousClass001.A0o());
                r32.A00.BS6(r5);
                return;
            case 20:
                C18260x0.A1Q(AnonymousClass001.A0o(), "getOfferDetails: failed with error: ", r5);
                C203119n9 r02 = ((AnonymousClass9P1) this.A01).A01;
                if (r02 != null) {
                    r02.BRy();
                    return;
                }
                return;
            case 21:
                C160757oG r2 = ((C194149Rt) this.A00).A05;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("providerKey: onRequestError ");
                r2.A05(AnonymousClass000.A0h(A0o2, r5.A00));
                ((C203069n4) this.A01).BZ3(r5);
                return;
            case 22:
                ((C203079n5) this.A01).BS6(r5);
                return;
            case 23:
                ((AnonymousClass9RM) this.A01).A00(r5);
                return;
            case 24:
                ((BrazilPayBloksActivity) this.A00).A7C((C52792m3) this.A01);
                return;
        }
        r0 = (AnonymousClass4EY) this.A01;
        r0.Ba4(r5);
    }

    public void A04(AnonymousClass34V r5) {
        AnonymousClass4EY r0;
        switch (this.A02) {
            case 2:
                ((C193989Rd) this.A01).A00();
                return;
            case 3:
                return;
            case 4:
                C1899593h.A1G(((AnonymousClass9U5) this.A00).A0H, r5, "tosv3 onResponseError: ", AnonymousClass001.A0o());
                break;
            case 5:
                C1899593h.A1G(((AnonymousClass9S6) this.A00).A0A, r5, "BrazilAddCredentialAction : onResponseError: ", AnonymousClass001.A0o());
                AnonymousClass9Bw.A0c(((AnonymousClass9OJ) this.A01).A00, (Map) null, r5.A00);
                return;
            case 6:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9NN) this.A01).A00;
                brazilPaymentTransactionDetailActivity.BjL();
                brazilPaymentTransactionDetailActivity.Box(new Object[0], R.string.f11nameremoved, R.string.f11nameremoved);
                return;
            case 7:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilFetchNetworkInfoAction/onResponseError: ", r5);
                ((AnonymousClass9RN) this.A01).A00((AnonymousClass9Q0) null);
                return;
            case 8:
                ((C194159Ru) this.A00).A06.BU0(r5, (List) null);
                return;
            case 9:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilGetVerificationMethods onResponseError: ", r5);
                ((C203009my) this.A01).BaU(r5, (List) null);
                return;
            case 10:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilRemoveMerchantAccount onResponseError=", r5);
                break;
            case 11:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilFetchEloChallengeIdAction onResponseError: ", r5);
                ((AnonymousClass9NF) this.A01).A00.A02(r5, (String) null);
                return;
            case 12:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilSubmitVerificationMethodAction onResponseError: ", r5);
                ((AnonymousClass9RL) this.A01).A00(r5, (AnonymousClass99I) null);
                return;
            case 13:
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("PAY: MFAAction/onResponseError - ");
                A0o.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C18260x0.A1Q(A0o, ": ", r5);
                ((AnonymousClass9OD) this.A01).A00.BS8(new AnonymousClass9V4(r5));
                return;
            case 14:
                C203499no A06 = AnonymousClass9U4.A06(((C194329Sl) this.A00).A07);
                if (A06 != null) {
                    A06.reset();
                }
                r0 = (AnonymousClass4EY) this.A01;
                if (r0 == null) {
                    return;
                }
                break;
            case 15:
                ((C194059Rk) this.A01).A00(r5);
                return;
            case 17:
                ((AnonymousClass9Qy) this.A01).A00(r5);
                return;
            case 18:
                AnonymousClass9Qz r3 = (AnonymousClass9Qz) this.A01;
                C1899593h.A1H(r3.A01.A06, r5, "performNameCheck onError: ", AnonymousClass001.A0o());
                r3.A00.BS6(r5);
                return;
            case 19:
                C1899593h.A1G(((C193699Pq) this.A00).A05, r5, "performDobComplianceCheck onResponseError: ", AnonymousClass001.A0o());
                AnonymousClass9R0 r32 = (AnonymousClass9R0) this.A01;
                C1899593h.A1H(r32.A01.A06, r5, "performDobComplianceCheck onError: ", AnonymousClass001.A0o());
                r32.A00.BS6(r5);
                return;
            case 20:
                C18260x0.A1Q(AnonymousClass001.A0o(), "getOfferDetails: failed with error: ", r5);
                C203119n9 r02 = ((AnonymousClass9P1) this.A01).A01;
                if (r02 != null) {
                    r02.BRy();
                    return;
                }
                return;
            case 21:
                C160757oG r2 = ((C194149Rt) this.A00).A05;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("providerKey: onResponseError ");
                r2.A05(AnonymousClass000.A0h(A0o2, r5.A00));
                ((C203069n4) this.A01).BZ3(r5);
                return;
            case 22:
                ((C203079n5) this.A01).BS6(r5);
                return;
            case 23:
                A03(r5);
                return;
            case 24:
                ((BrazilPayBloksActivity) this.A00).A7C((C52792m3) this.A01);
                return;
        }
        r0 = (AnonymousClass4EY) this.A01;
        r0.BaB(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07bd, code lost:
        com.whatsapp.util.Log.e("Pay: requestDyiReport -> error parsing the response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07c2, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07ce  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r15) {
        /*
            r14 = this;
            int r0 = r14.A02
            r7 = r15
            switch(r0) {
                case 0: goto L_0x06a2;
                case 1: goto L_0x076b;
                case 2: goto L_0x065b;
                case 3: goto L_0x0006;
                case 4: goto L_0x064b;
                case 5: goto L_0x0599;
                case 6: goto L_0x0006;
                case 7: goto L_0x04c2;
                case 8: goto L_0x0411;
                case 9: goto L_0x011b;
                case 10: goto L_0x03f9;
                case 11: goto L_0x03d2;
                case 12: goto L_0x0387;
                case 13: goto L_0x029d;
                case 14: goto L_0x00e8;
                case 15: goto L_0x000d;
                case 16: goto L_0x0007;
                case 17: goto L_0x0239;
                case 18: goto L_0x021e;
                case 19: goto L_0x0203;
                case 20: goto L_0x01d9;
                case 21: goto L_0x0703;
                case 22: goto L_0x06b2;
                case 23: goto L_0x01c5;
                case 24: goto L_0x016e;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object r1 = r14.A01
            X.4EY r1 = (X.AnonymousClass4EY) r1
            goto L_0x0112
        L_0x000d:
            java.lang.Object r4 = r14.A01
            X.9Rk r4 = (X.C194059Rk) r4
            X.36K r2 = X.C1899693i.A0T(r15)     // Catch:{ Exception -> 0x07bd }
            X.34V r0 = X.AnonymousClass34V.A00(r2)     // Catch:{ Exception -> 0x07bd }
            if (r0 != 0) goto L_0x0032
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != 0) goto L_0x0025
            X.34V r0 = new X.34V     // Catch:{ Exception -> 0x07bd }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x07bd }
            goto L_0x0032
        L_0x0025:
            java.lang.String r0 = "document"
            X.36K r8 = r2.A0l(r0)     // Catch:{ Exception -> 0x07bd }
            if (r8 != 0) goto L_0x0037
            X.34V r0 = new X.34V     // Catch:{ Exception -> 0x07bd }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x07bd }
        L_0x0032:
            r4.A00(r0)     // Catch:{ Exception -> 0x07bd }
            goto L_0x07af
        L_0x0037:
            java.lang.String r0 = "creation"
            r2 = 0
            long r5 = r8.A0e(r0, r2)     // Catch:{ Exception -> 0x07bd }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            java.lang.String r7 = "expiration"
            long r2 = r8.A0e(r7, r2)     // Catch:{ Exception -> 0x07bd }
            long r0 = r0 * r2
            byte[] r9 = r8.A01     // Catch:{ Exception -> 0x07bd }
            java.lang.String r2 = "DyiViewModel/request-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x07bd }
            X.9Fx r2 = r4.A03     // Catch:{ Exception -> 0x07bd }
            X.9VV r3 = r2.A07     // Catch:{ Exception -> 0x07bd }
            java.lang.String r7 = r2.A09     // Catch:{ Exception -> 0x07bd }
            monitor-enter(r3)     // Catch:{ Exception -> 0x07bd }
            java.lang.String r8 = "dyiReportManager/on-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x07ba }
            java.io.File r8 = r3.A03(r7)     // Catch:{ IOException -> 0x009c }
            X.C627236i.A0B(r8, r9)     // Catch:{ IOException -> 0x009c }
            X.9Oy r8 = X.AnonymousClass9VV.A00(r9, r5)     // Catch:{ all -> 0x07ba }
            r3.A01 = r8     // Catch:{ all -> 0x07ba }
            if (r8 != 0) goto L_0x0071
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-create-message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07ba }
            goto L_0x00a2
        L_0x0071:
            X.33l r10 = r3.A0A     // Catch:{ all -> 0x07ba }
            android.content.SharedPreferences$Editor r11 = X.C620933l.A00(r10)     // Catch:{ all -> 0x07ba }
            java.lang.String r8 = "personal"
            boolean r9 = r8.equals(r7)     // Catch:{ all -> 0x07ba }
            if (r9 == 0) goto L_0x0089
            java.lang.String r8 = "payment_dyi_report_timestamp"
        L_0x0081:
            X.C18270x1.A0i(r11, r8, r5)     // Catch:{ all -> 0x07ba }
            android.content.SharedPreferences$Editor r6 = X.C620933l.A00(r10)     // Catch:{ all -> 0x07ba }
            goto L_0x008c
        L_0x0089:
            java.lang.String r8 = "business_payment_dyi_report_timestamp"
            goto L_0x0081
        L_0x008c:
            if (r9 == 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            java.lang.String r5 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x0094
        L_0x0092:
            java.lang.String r5 = "payment_dyi_report_expiration_timestamp"
        L_0x0094:
            X.C18270x1.A0i(r6, r5, r0)     // Catch:{ all -> 0x07ba }
            r0 = 2
            r10.A0G(r0, r7)     // Catch:{ all -> 0x07ba }
            goto L_0x00a2
        L_0x009c:
            r1 = move-exception
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-save"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07ba }
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ Exception -> 0x07bd }
            X.9Oy r0 = r3.A02(r7)     // Catch:{ Exception -> 0x07bd }
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "DyiViewModel/request-report/on-error :: invalid report info"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x07bd }
            X.08M r0 = r2.A02     // Catch:{ Exception -> 0x07bd }
            java.lang.Integer r3 = X.C18290x4.A0Z()     // Catch:{ Exception -> 0x07bd }
            r0.A0G(r3)     // Catch:{ Exception -> 0x07bd }
            X.08M r2 = r2.A03     // Catch:{ Exception -> 0x07bd }
            r1 = 500(0x1f4, float:7.0E-43)
            X.34V r0 = new X.34V     // Catch:{ Exception -> 0x07bd }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x07bd }
            X.C1899593h.A0p(r2, r3, r0)     // Catch:{ Exception -> 0x07bd }
        L_0x00c3:
            int r1 = r4.A00     // Catch:{ Exception -> 0x07bd }
            r0 = 1
            if (r1 != r0) goto L_0x00e4
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = r4.A02     // Catch:{ Exception -> 0x07bd }
            if (r0 == 0) goto L_0x0006
            r0.A1L()     // Catch:{ Exception -> 0x07bd }
            goto L_0x07b0
        L_0x00d1:
            X.08M r1 = r2.A01     // Catch:{ Exception -> 0x07bd }
            X.9Oy r0 = r3.A02(r7)     // Catch:{ Exception -> 0x07bd }
            r1.A0G(r0)     // Catch:{ Exception -> 0x07bd }
            X.08M r1 = r2.A02     // Catch:{ Exception -> 0x07bd }
            int r0 = r3.A01(r7)     // Catch:{ Exception -> 0x07bd }
            X.C06270Wx.A04(r1, r0)     // Catch:{ Exception -> 0x07bd }
            goto L_0x00c3
        L_0x00e4:
            if (r1 != 0) goto L_0x0006
            goto L_0x07b1
        L_0x00e8:
            java.lang.Object r4 = r14.A00
            X.9Sl r4 = (X.C194329Sl) r4
            X.33l r0 = r4.A04
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r1 = "has_p2mlite_transactions"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x010c
            X.4FS r3 = r4.A09
            X.3Lv r2 = r4.A02
            X.9fl r1 = new X.9fl
            r1.<init>(r14)
            X.9GQ r0 = new X.9GQ
            r0.<init>(r2, r1)
            X.AnonymousClass0x7.A1B(r0, r3)
        L_0x010c:
            java.lang.Object r1 = r14.A01
            X.4EY r1 = (X.AnonymousClass4EY) r1
            if (r1 == 0) goto L_0x0006
        L_0x0112:
            X.9Ab r0 = new X.9Ab
            r0.<init>()
            r1.BaC(r0)
            return
        L_0x011b:
            X.36K r1 = X.C1899693i.A0T(r15)
            if (r1 == 0) goto L_0x0006
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "verify-method-list"
            X.36K r5 = r1.A0l(r0)
            java.lang.String r0 = "card"
            X.36K r1 = r1.A0l(r0)
            r3 = 0
            if (r1 == 0) goto L_0x0154
            X.99I r2 = new X.99I
            r2.<init>()
            java.lang.Object r0 = r14.A00
            X.9S9 r0 = (X.AnonymousClass9S9) r0
            X.32a r0 = r0.A04
            r2.A04(r0, r1, r3)
            X.7yw r1 = r2.A07()
            X.6hr r1 = (X.C133736hr) r1
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r14.A01
            X.9my r0 = (X.C203009my) r0
            r0.BOZ(r1)
            return
        L_0x0154:
            if (r5 == 0) goto L_0x0006
            X.36K[] r0 = r5.A03
            if (r0 == 0) goto L_0x07c3
            int r2 = r0.length
            if (r2 <= 0) goto L_0x07c3
        L_0x015d:
            X.36K r1 = r5.A0k(r3)
            X.9eV r0 = new X.9eV
            r0.<init>(r1)
            r4.add(r0)
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x07c3
            goto L_0x015d
        L_0x016e:
            java.lang.String r3 = "1"
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "account"
            X.36K r1 = r15.A0m(r0)     // Catch:{ 24Y -> 0x01ad }
            X.34V r0 = X.AnonymousClass34V.A00(r1)     // Catch:{ 24Y -> 0x01ad }
            if (r0 == 0) goto L_0x018c
            java.lang.Object r1 = r14.A00     // Catch:{ 24Y -> 0x01ad }
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r1     // Catch:{ 24Y -> 0x01ad }
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x01ad }
            X.2m3 r0 = (X.C52792m3) r0     // Catch:{ 24Y -> 0x01ad }
            r1.A7C(r0)     // Catch:{ 24Y -> 0x01ad }
            return
        L_0x018c:
            java.lang.String r0 = "result"
            X.36K r1 = r1.A0m(r0)     // Catch:{ 24Y -> 0x01ad }
            java.lang.String r0 = "upload_status"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r1, r0)     // Catch:{ 24Y -> 0x01ad }
            boolean r0 = r3.equals(r0)     // Catch:{ 24Y -> 0x01ad }
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = "is_doc_upload_completed"
            r2.put(r0, r3)     // Catch:{ 24Y -> 0x01ad }
            java.lang.Object r1 = r14.A01     // Catch:{ 24Y -> 0x01ad }
            X.2m3 r1 = (X.C52792m3) r1     // Catch:{ 24Y -> 0x01ad }
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)     // Catch:{ 24Y -> 0x01ad }
            return
        L_0x01ad:
            r2 = move-exception
            java.lang.Object r0 = r14.A00
            X.9Bw r0 = (X.AnonymousClass9Bw) r0
            X.7oG r1 = r0.A0M
            java.lang.String r0 = "PAY: performAnswerDocUploadStepUp : invalid response"
            r1.A0A(r0, r2)
        L_0x01b9:
            java.lang.Object r1 = r14.A00
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r1
            java.lang.Object r0 = r14.A01
            X.2m3 r0 = (X.C52792m3) r0
            r1.A7C(r0)
            return
        L_0x01c5:
            X.36K r0 = X.C1899693i.A0T(r15)
            if (r0 == 0) goto L_0x01d7
            X.34V r1 = X.AnonymousClass34V.A00(r0)
        L_0x01cf:
            java.lang.Object r0 = r14.A01
            X.9RM r0 = (X.AnonymousClass9RM) r0
            r0.A00(r1)
            return
        L_0x01d7:
            r1 = 0
            goto L_0x01cf
        L_0x01d9:
            java.lang.Object r6 = r14.A01
            X.9P1 r6 = (X.AnonymousClass9P1) r6
            java.lang.String r0 = "account"
            X.36K r1 = r15.A0m(r0)     // Catch:{ 24Y -> 0x01f7 }
            java.lang.String r0 = "offer_eligibility"
            X.36K r5 = r1.A0m(r0)     // Catch:{ 24Y -> 0x01f7 }
            X.9Vi r4 = r6.A02     // Catch:{ 24Y -> 0x01f7 }
            long r2 = r6.A00     // Catch:{ 24Y -> 0x01f7 }
            r1 = 0
            X.9px r0 = new X.9px     // Catch:{ 24Y -> 0x01f7 }
            r0.<init>(r6, r1)     // Catch:{ 24Y -> 0x01f7 }
            r4.A08(r0, r5, r2)     // Catch:{ 24Y -> 0x01f7 }
            return
        L_0x01f7:
            r1 = move-exception
            X.9n9 r0 = r6.A01
            if (r0 == 0) goto L_0x01ff
            r0.BRy()
        L_0x01ff:
            r1.printStackTrace()
            return
        L_0x0203:
            java.lang.Object r4 = r14.A01
            X.9R0 r4 = (X.AnonymousClass9R0) r4
            r3 = 1
            X.9Sj r0 = r4.A01
            X.7oG r2 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "performDobComplianceCheck onDobCheckComplete, eligible: "
            r1.append(r0)
            X.C1899593h.A1L(r2, r1, r3)
            X.9n7 r0 = r4.A00
            r0.BRQ(r3)
            return
        L_0x021e:
            java.lang.Object r4 = r14.A01
            X.9Qz r4 = (X.AnonymousClass9Qz) r4
            r3 = 1
            X.9Sj r0 = r4.A01
            X.7oG r2 = r0.A06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "performNameCheck onNameCheckComplete, eligible: "
            r1.append(r0)
            X.C1899593h.A1L(r2, r1, r3)
            X.9n8 r0 = r4.A00
            r0.BWr(r3)
            return
        L_0x0239:
            if (r15 == 0) goto L_0x0291
            r0 = 0
            X.36K r1 = r15.A0k(r0)
            if (r1 == 0) goto L_0x0291
            java.lang.String r0 = "account-eligibility-state"
            java.lang.String r5 = X.AnonymousClass36K.A0L(r1, r0)
            if (r5 == 0) goto L_0x0291
            java.lang.Object r4 = r14.A01
            X.9Qy r4 = (X.AnonymousClass9Qy) r4
            X.9Sj r3 = r4.A00
            X.7oG r2 = r3.A06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getComplianceStatus onStatus: "
            r1.append(r0)
            X.C1899593h.A1J(r2, r5, r1)
            int r0 = r5.hashCode()
            switch(r0) {
                case -2093369835: goto L_0x0274;
                case -1753873386: goto L_0x0271;
                case 35394935: goto L_0x026e;
                case 1383663147: goto L_0x026b;
                default: goto L_0x0265;
            }
        L_0x0265:
            java.lang.String r0 = "Compliance state unknown"
            r2.A06(r0)
            return
        L_0x026b:
            java.lang.String r0 = "COMPLETED"
            goto L_0x0276
        L_0x026e:
            java.lang.String r0 = "PENDING"
            goto L_0x0276
        L_0x0271:
            java.lang.String r0 = "NEEDS_MORE_INFO"
            goto L_0x0276
        L_0x0274:
            java.lang.String r0 = "UNSUPPORTED"
        L_0x0276:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0265
            r3.A00 = r5
            X.9OM r1 = r4.A01
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "compliance_status"
            r2.put(r0, r5)
            X.2m3 r1 = r1.A00
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)
            return
        L_0x0291:
            java.lang.Object r1 = r14.A01
            X.9Qy r1 = (X.AnonymousClass9Qy) r1
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r0)
            return
        L_0x029d:
            java.lang.Object r4 = r14.A01
            X.9OD r4 = (X.AnonymousClass9OD) r4
            X.36K r1 = X.C1899693i.A0T(r15)
            r7 = 9
            r6 = 0
            if (r1 == 0) goto L_0x0305
            X.34V r0 = X.AnonymousClass34V.A00(r1)     // Catch:{ 24Y -> 0x030f }
            if (r0 == 0) goto L_0x02b5
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r6, r0)     // Catch:{ 24Y -> 0x030f }
            goto L_0x031e
        L_0x02b5:
            java.lang.String r0 = "auth-ticket"
            X.36K r1 = r1.A0l(r0)     // Catch:{ 24Y -> 0x030f }
            if (r1 != 0) goto L_0x02c7
            X.34V r0 = new X.34V     // Catch:{ 24Y -> 0x030f }
            r0.<init>((int) r7)     // Catch:{ 24Y -> 0x030f }
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r6, r0)     // Catch:{ 24Y -> 0x030f }
            goto L_0x031e
        L_0x02c7:
            java.lang.String r0 = "id"
            r1.A0q(r0)     // Catch:{ 24Y -> 0x030f }
            java.lang.String r0 = "issued-at"
            r1.A0d(r0)     // Catch:{ 24Y -> 0x030f }
            java.lang.String r9 = "ttl"
            r1.A0d(r9)     // Catch:{ 24Y -> 0x030f }
            X.9NG r8 = new X.9NG     // Catch:{ 24Y -> 0x030f }
            r8.<init>()     // Catch:{ 24Y -> 0x030f }
            java.lang.String r0 = "capabilities"
            X.36K r0 = r1.A0m(r0)     // Catch:{ 24Y -> 0x030f }
            X.36K[] r5 = r0.A03     // Catch:{ 24Y -> 0x030f }
            if (r5 == 0) goto L_0x0300
            int r3 = r5.length     // Catch:{ 24Y -> 0x030f }
            r2 = 0
        L_0x02e7:
            if (r2 >= r3) goto L_0x0300
            r1 = r5[r2]     // Catch:{ 24Y -> 0x030f }
            java.lang.String r0 = "name"
            r1.A0q(r0)     // Catch:{ 24Y -> 0x030f }
            r1.A0d(r9)     // Catch:{ 24Y -> 0x030f }
            X.9LY r1 = new X.9LY     // Catch:{ 24Y -> 0x030f }
            r1.<init>()     // Catch:{ 24Y -> 0x030f }
            java.util.List r0 = r8.A00     // Catch:{ 24Y -> 0x030f }
            r0.add(r1)     // Catch:{ 24Y -> 0x030f }
            int r2 = r2 + 1
            goto L_0x02e7
        L_0x0300:
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r8, r6)     // Catch:{ 24Y -> 0x030f }
            goto L_0x031e
        L_0x0305:
            X.34V r0 = new X.34V
            r0.<init>((int) r7)
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r6, r0)
            goto L_0x031e
        L_0x030f:
            r1 = move-exception
            java.lang.String r0 = "PAY: parseResult corruptStreamException"
            com.whatsapp.util.Log.e(r0, r1)
            X.34V r0 = new X.34V
            r0.<init>((int) r7)
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r6, r0)
        L_0x031e:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0375
            X.9Rg r0 = r4.A01     // Catch:{ JSONException -> 0x035f }
            X.9OF r0 = r0.A03     // Catch:{ JSONException -> 0x035f }
            java.lang.String r6 = "td"
            X.33l r5 = r0.A00     // Catch:{ JSONException -> 0x0358 }
            java.lang.String r1 = r5.A06()     // Catch:{ JSONException -> 0x0358 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0358 }
            if (r0 != 0) goto L_0x034e
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0358 }
            org.json.JSONObject r2 = r3.optJSONObject(r6)     // Catch:{ JSONException -> 0x0358 }
            if (r2 != 0) goto L_0x0342
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0358 }
        L_0x0342:
            java.lang.String r1 = "td_is_committed"
            r0 = 1
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0358 }
            r3.put(r6, r2)     // Catch:{ JSONException -> 0x0358 }
            X.C1899593h.A1D(r5, r3)     // Catch:{ JSONException -> 0x0358 }
        L_0x034e:
            X.9n6 r1 = r4.A00     // Catch:{ JSONException -> 0x035f }
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ JSONException -> 0x035f }
            r1.onResult(r0)     // Catch:{ JSONException -> 0x035f }
            return
        L_0x0358:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore markCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x035f }
            throw r1     // Catch:{ JSONException -> 0x035f }
        L_0x035f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: MultiFactorAuthFactors/createTrustedDevice/error while marking trusted device as commited: "
            X.C18260x0.A1Q(r1, r0, r2)
            X.9n6 r2 = r4.A00
            r1 = 0
            X.9V4 r0 = new X.9V4
            r0.<init>((int) r1)
            r2.BS8(r0)
            return
        L_0x0375:
            X.9n6 r2 = r4.A00
            java.lang.Object r1 = r1.A01
            X.C626936e.A06(r1)
            X.34V r1 = (X.AnonymousClass34V) r1
            X.9V4 r0 = new X.9V4
            r0.<init>((X.AnonymousClass34V) r1)
            r2.BS8(r0)
            return
        L_0x0387:
            X.36K r5 = X.C1899693i.A0T(r15)
            r4 = 0
            if (r5 == 0) goto L_0x03c6
            java.lang.String r0 = "card"
            X.36K r3 = r5.A0l(r0)
            if (r3 == 0) goto L_0x03c4
            X.99I r2 = new X.99I
            r2.<init>()
            java.lang.Object r0 = r14.A00
            X.9Q7 r0 = (X.AnonymousClass9Q7) r0
            X.32a r1 = r0.A02
            r0 = 0
            r2.A04(r1, r3, r0)
        L_0x03a5:
            java.lang.String r0 = "elo"
            X.36K r1 = r5.A0l(r0)
            if (r1 == 0) goto L_0x03bc
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0r(r0, r4)
            java.lang.Object r0 = r14.A00
            X.9Q7 r0 = (X.AnonymousClass9Q7) r0
            X.9SD r0 = r0.A05
            r0.A00(r1)
        L_0x03bc:
            java.lang.Object r0 = r14.A01
            X.9RL r0 = (X.AnonymousClass9RL) r0
            r0.A00(r4, r2)
            return
        L_0x03c4:
            r2 = r4
            goto L_0x03a5
        L_0x03c6:
            java.lang.Object r1 = r14.A01
            X.9RL r1 = (X.AnonymousClass9RL) r1
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r0, r4)
            return
        L_0x03d2:
            X.36K r1 = X.C1899693i.A0T(r15)
            r2 = 0
            if (r1 == 0) goto L_0x03eb
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0r(r0, r2)
            if (r1 == 0) goto L_0x03eb
            java.lang.Object r0 = r14.A01
            X.9NF r0 = (X.AnonymousClass9NF) r0
            X.9TL r0 = r0.A00
            r0.A02(r2, r1)
            return
        L_0x03eb:
            java.lang.Object r0 = r14.A01
            X.9NF r0 = (X.AnonymousClass9NF) r0
            X.34V r1 = X.C1899693i.A0M()
            X.9TL r0 = r0.A00
            r0.A02(r1, r2)
            return
        L_0x03f9:
            java.lang.String r0 = "Pay: BrazilRemoveMerchantAccount successfully removed merchant account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r14.A00
            X.9Ry r0 = (X.C194199Ry) r0
            X.4FS r2 = r0.A08
            java.lang.Object r1 = r14.A01
            X.4EY r1 = (X.AnonymousClass4EY) r1
            X.9hi r0 = new X.9hi
            r0.<init>(r14, r1)
            r2.BkM(r0)
            return
        L_0x0411:
            java.lang.String r4 = "account"
            X.36K r0 = r15.A0l(r4)
            r2 = 0
            if (r0 == 0) goto L_0x042a
            X.34V r1 = X.AnonymousClass34V.A00(r0)
            if (r1 == 0) goto L_0x0435
            java.lang.Object r0 = r14.A00
            X.9Ru r0 = (X.C194159Ru) r0
            X.9mC r0 = r0.A06
        L_0x0426:
            r0.BU0(r1, r2)
            return
        L_0x042a:
            java.lang.Object r0 = r14.A00
            X.9Ru r0 = (X.C194159Ru) r0
            X.9mC r0 = r0.A06
            X.34V r1 = X.C1899693i.A0M()
            goto L_0x0426
        L_0x0435:
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x04aa }
            X.2Ir r0 = (X.C41032Ir) r0     // Catch:{ 24Y -> 0x04aa }
            X.36K r6 = X.C41032Ir.A02(r15, r0)     // Catch:{ 24Y -> 0x04aa }
            java.lang.String r0 = "action"
            java.lang.String[] r5 = new java.lang.String[]{r4, r0}     // Catch:{ 24Y -> 0x04aa }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r3 = 0
            java.lang.String r0 = "br-get-payout-banks"
            X.C626836d.A0F(r15, r1, r0, r5)     // Catch:{ 24Y -> 0x04aa }
            r0 = 1
            X.9qI r1 = new X.9qI     // Catch:{ 24Y -> 0x04aa }
            r1.<init>(r6, r0)     // Catch:{ 24Y -> 0x04aa }
            r5 = 0
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ 24Y -> 0x04aa }
            X.C626836d.A04(r15, r1, r0)     // Catch:{ 24Y -> 0x04aa }
            java.lang.String r0 = "bank"
            java.lang.String[] r9 = new java.lang.String[]{r4, r0}     // Catch:{ 24Y -> 0x04aa }
            r0 = 20
            X.9qJ r8 = new X.9qJ     // Catch:{ 24Y -> 0x04aa }
            r8.<init>(r0)     // Catch:{ 24Y -> 0x04aa }
            r10 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r3 = X.C626836d.A0B(r7, r8, r9, r10, r12)     // Catch:{ 24Y -> 0x04aa }
            java.lang.String[] r1 = new java.lang.String[]{r4}     // Catch:{ 24Y -> 0x04aa }
            r0 = 21
            X.C205029qJ.A02(r15, r1, r0)     // Catch:{ 24Y -> 0x04aa }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ 24Y -> 0x04aa }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ 24Y -> 0x04aa }
        L_0x0480:
            boolean r0 = r6.hasNext()     // Catch:{ 24Y -> 0x04aa }
            if (r0 == 0) goto L_0x04a0
            java.lang.Object r4 = r6.next()     // Catch:{ 24Y -> 0x04aa }
            X.2Iq r4 = (X.C41022Iq) r4     // Catch:{ 24Y -> 0x04aa }
            X.99G r3 = new X.99G     // Catch:{ 24Y -> 0x04aa }
            r3.<init>()     // Catch:{ 24Y -> 0x04aa }
            java.lang.Object r0 = r14.A00     // Catch:{ 24Y -> 0x04aa }
            X.9Ru r0 = (X.C194159Ru) r0     // Catch:{ 24Y -> 0x04aa }
            X.32a r1 = r0.A03     // Catch:{ 24Y -> 0x04aa }
            X.36K r0 = r4.A00     // Catch:{ 24Y -> 0x04aa }
            r3.A04(r1, r0, r5)     // Catch:{ 24Y -> 0x04aa }
            r7.add(r3)     // Catch:{ 24Y -> 0x04aa }
            goto L_0x0480
        L_0x04a0:
            java.lang.Object r0 = r14.A00     // Catch:{ 24Y -> 0x04aa }
            X.9Ru r0 = (X.C194159Ru) r0     // Catch:{ 24Y -> 0x04aa }
            X.9mC r0 = r0.A06     // Catch:{ 24Y -> 0x04aa }
            r0.BU0(r2, r7)     // Catch:{ 24Y -> 0x04aa }
            return
        L_0x04aa:
            r0 = move-exception
            java.lang.String r1 = "GetMerchantPayoutBanks"
            java.lang.String r0 = r0.getMessage()
            X.C1899593h.A1Q(r1, r0)
            java.lang.Object r0 = r14.A00
            X.9Ru r0 = (X.C194159Ru) r0
            X.9mC r1 = r0.A06
            X.34V r0 = X.C1899693i.A0M()
            r1.BU0(r0, r2)
            return
        L_0x04c2:
            java.lang.String r2 = "registration_status"
            X.36K r6 = X.C1899693i.A0T(r15)
            r3 = 0
            if (r6 == 0) goto L_0x058c
            java.lang.String r0 = "network_type"
            java.lang.String r1 = r6.A0r(r0, r3)
            java.lang.String r0 = "ELO"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x057b
            java.lang.String r0 = "elo"
            X.36K r5 = r6.A0m(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r1 = r5.A0r(r2, r3)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ 24Y -> 0x056c }
            r4 = 5
            if (r0 == 0) goto L_0x0555
            java.lang.String r0 = "key"
            X.36K r6 = r6.A0m(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.Object r1 = r14.A00     // Catch:{ 24Y -> 0x056c }
            X.9Q4 r1 = (X.AnonymousClass9Q4) r1     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "key-type"
            java.lang.String r11 = r6.A0q(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "provider"
            java.lang.String r9 = r6.A0q(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "key-version"
            java.lang.String r12 = r6.A0q(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "key-scope"
            java.lang.String r10 = r6.A0q(r0)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "expiry-ts"
            r13 = 0
            java.lang.String r7 = r6.A0r(r0, r3)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r11)     // Catch:{ 24Y -> 0x056c }
            r8 = 0
            if (r0 != 0) goto L_0x0526
            java.lang.String r0 = "data"
            X.36K r0 = r6.A0m(r0)     // Catch:{ 24Y -> 0x056c }
            byte[] r13 = r0.A01     // Catch:{ 24Y -> 0x056c }
        L_0x0526:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ 24Y -> 0x056c }
            if (r0 != 0) goto L_0x0534
            long r6 = X.C615531h.A03(r7)     // Catch:{ 24Y -> 0x056c }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ 24Y -> 0x056c }
        L_0x0534:
            X.3Rl r7 = new X.3Rl     // Catch:{ 24Y -> 0x056c }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ 24Y -> 0x056c }
            X.9VU r0 = r1.A06     // Catch:{ 24Y -> 0x056c }
            r0.A03(r7)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r2 = r5.A0r(r2, r3)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "wallet_id"
            java.lang.String r0 = r5.A0r(r0, r3)     // Catch:{ 24Y -> 0x056c }
            X.9Q0 r1 = new X.9Q0     // Catch:{ 24Y -> 0x056c }
            r1.<init>(r2, r3, r0, r4)     // Catch:{ 24Y -> 0x056c }
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x056c }
            X.9RN r0 = (X.AnonymousClass9RN) r0     // Catch:{ 24Y -> 0x056c }
            r0.A00(r1)     // Catch:{ 24Y -> 0x056c }
            return
        L_0x0555:
            java.lang.String r2 = r5.A0r(r2, r3)     // Catch:{ 24Y -> 0x056c }
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r5.A0r(r0, r3)     // Catch:{ 24Y -> 0x056c }
            X.9Q0 r1 = new X.9Q0     // Catch:{ 24Y -> 0x056c }
            r1.<init>(r2, r0, r3, r4)     // Catch:{ 24Y -> 0x056c }
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x056c }
            X.9RN r0 = (X.AnonymousClass9RN) r0     // Catch:{ 24Y -> 0x056c }
            r0.A00(r1)     // Catch:{ 24Y -> 0x056c }
            return
        L_0x056c:
            java.lang.Object r2 = r14.A01
            X.9RN r2 = (X.AnonymousClass9RN) r2
            r1 = 9
            X.34V r0 = new X.34V
            r0.<init>((int) r1)
            r2.A00(r3)
            return
        L_0x057b:
            int r0 = X.C133736hr.A01(r1)
            X.9Q0 r1 = new X.9Q0
            r1.<init>(r3, r3, r3, r0)
            java.lang.Object r0 = r14.A01
            X.9RN r0 = (X.AnonymousClass9RN) r0
            r0.A00(r1)
            return
        L_0x058c:
            java.lang.Object r1 = r14.A01
            X.9RN r1 = (X.AnonymousClass9RN) r1
            X.34V r0 = new X.34V
            r0.<init>()
            r1.A00(r3)
            return
        L_0x0599:
            java.lang.Object r8 = r14.A00
            X.9S6 r8 = (X.AnonymousClass9S6) r8
            X.7oG r1 = r8.A0A
            java.lang.String r0 = "BrazilAddCredentialAction : onResponseSuccess received"
            r1.A05(r0)
            X.36K r1 = X.C1899693i.A0T(r15)
            if (r1 == 0) goto L_0x063a
            java.lang.String r0 = "callback_url"
            java.lang.String r5 = X.AnonymousClass36K.A0L(r1, r0)
            java.lang.String r0 = "credential"
            X.36K r3 = r1.A0l(r0)
            if (r3 == 0) goto L_0x063a
            java.lang.String r0 = "card"
            X.36K r1 = r3.A0l(r0)
            if (r1 == 0) goto L_0x063a
            X.99I r2 = new X.99I
            r2.<init>()
            X.32a r0 = r8.A04
            r7 = 0
            r2.A04(r0, r1, r7)
            X.7yw r4 = r2.A07()
            X.6hr r4 = (X.C133736hr) r4
            X.9TJ r1 = r8.A0B
            r0 = 0
            r1.A01(r0, r4)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x05ee
            X.9U4 r0 = r8.A08
            X.9Tl r3 = X.AnonymousClass9U4.A00(r0)
            java.lang.Object r0 = r14.A01
            X.9OJ r0 = (X.AnonymousClass9OJ) r0
            X.9Wp r2 = new X.9Wp
            r2.<init>(r4, r0, r5, r7)
        L_0x05ea:
            r3.A03(r2, r4)
            return
        L_0x05ee:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0616
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "verify-method-list"
            X.36K r3 = r3.A0l(r0)
            if (r3 == 0) goto L_0x0627
            X.36K[] r0 = r3.A03
            if (r0 == 0) goto L_0x0627
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0627
        L_0x0605:
            X.36K r1 = r3.A0k(r7)
            X.9eV r0 = new X.9eV
            r0.<init>(r1)
            r6.add(r0)
            int r7 = r7 + 1
            if (r7 >= r2) goto L_0x0627
            goto L_0x0605
        L_0x0616:
            X.9U4 r0 = r8.A08
            X.9Tl r3 = X.AnonymousClass9U4.A00(r0)
            java.lang.Object r1 = r14.A01
            X.9OJ r1 = (X.AnonymousClass9OJ) r1
            r0 = 1
            X.9Wp r2 = new X.9Wp
            r2.<init>(r4, r1, r5, r0)
            goto L_0x05ea
        L_0x0627:
            X.9U4 r0 = r8.A08
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            java.lang.Object r1 = r14.A01
            X.9OJ r1 = (X.AnonymousClass9OJ) r1
            X.9au r0 = new X.9au
            r0.<init>(r4, r1, r5, r6)
            r2.A03(r0, r4)
            return
        L_0x063a:
            java.lang.Object r1 = r14.A01
            X.9OJ r1 = (X.AnonymousClass9OJ) r1
            X.34V r0 = X.C1899693i.A0M()
            int r2 = r0.A00
            X.2m3 r1 = r1.A00
            r0 = 0
            X.AnonymousClass9Bw.A0c(r1, r0, r2)
            return
        L_0x064b:
            X.2Oi r1 = new X.2Oi
            r1.<init>()
            r0 = 1
            r1.A02 = r0
            java.lang.Object r0 = r14.A01
            X.4EY r0 = (X.AnonymousClass4EY) r0
            r0.BaC(r1)
            return
        L_0x065b:
            X.36K r1 = X.C1899693i.A0T(r15)
            if (r1 == 0) goto L_0x069a
            java.lang.String r0 = "cancel-status"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r1, r0)
            boolean r0 = X.C1899693i.A0y(r0)
            if (r0 == 0) goto L_0x069a
            java.lang.Object r2 = r14.A01
            X.9Rd r2 = (X.C193989Rd) r2
            X.9Tr r0 = r2.A03
            X.4FS r1 = r0.A0D
            X.2sH r3 = r0.A01
            X.2hU r5 = r0.A05
            X.9U4 r9 = r0.A0A
            X.35J r10 = r0.A0B
            X.3Lv r4 = r0.A03
            X.9U5 r8 = r0.A09
            X.34w r6 = r2.A01
            com.whatsapp.jid.UserJid r7 = r2.A02
            r12 = 18
            X.9m8 r0 = r2.A04
            java.util.Objects.requireNonNull(r0)
            X.9fg r11 = new X.9fg
            r11.<init>(r0)
            X.9Gw r2 = new X.9Gw
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C18270x1.A0w(r2, r1)
            return
        L_0x069a:
            java.lang.Object r0 = r14.A01
            X.9Rd r0 = (X.C193989Rd) r0
            r0.A00()
            return
        L_0x06a2:
            java.lang.Object r0 = r14.A01
            r2 = 1
            X.9Wm r1 = new X.9Wm
            r1.<init>(r0, r2)
            java.lang.Object r0 = r14.A00
            X.9U5 r0 = (X.AnonymousClass9U5) r0
            r0.A07(r1, r15, r2)
            return
        L_0x06b2:
            java.lang.String r0 = "account"
            X.36K r3 = r15.A0m(r0)     // Catch:{ 24Y -> 0x06eb }
            X.34V r1 = X.AnonymousClass34V.A00(r3)     // Catch:{ 24Y -> 0x06eb }
            if (r1 == 0) goto L_0x06c6
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x06eb }
            X.9n5 r0 = (X.C203079n5) r0     // Catch:{ 24Y -> 0x06eb }
        L_0x06c2:
            r0.BS6(r1)     // Catch:{ 24Y -> 0x06eb }
            goto L_0x06dc
        L_0x06c6:
            java.lang.String r0 = "webview_url"
            r1 = 0
            java.lang.String r2 = r3.A0r(r0, r1)     // Catch:{ 24Y -> 0x06eb }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 24Y -> 0x06eb }
            if (r0 == 0) goto L_0x06dd
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x06eb }
            X.9n5 r0 = (X.C203079n5) r0     // Catch:{ 24Y -> 0x06eb }
            X.34V r1 = X.C1899693i.A0M()     // Catch:{ 24Y -> 0x06eb }
            goto L_0x06c2
        L_0x06dc:
            return
        L_0x06dd:
            java.lang.String r0 = "callback_url"
            java.lang.String r1 = r3.A0r(r0, r1)     // Catch:{ 24Y -> 0x06eb }
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x06eb }
            X.9n5 r0 = (X.C203079n5) r0     // Catch:{ 24Y -> 0x06eb }
            r0.BdE(r2, r1)     // Catch:{ 24Y -> 0x06eb }
            return
        L_0x06eb:
            r2 = move-exception
            java.lang.Object r0 = r14.A00
            X.9Rf r0 = (X.C194009Rf) r0
            X.7oG r1 = r0.A04
            java.lang.String r0 = "PAY: PaymentStepUpWebviewAction : invalid response"
            r1.A0A(r0, r2)
            java.lang.Object r1 = r14.A01
            X.9n5 r1 = (X.C203079n5) r1
            X.34V r0 = X.C1899693i.A0M()
            r1.BS6(r0)
            return
        L_0x0703:
            java.lang.String r0 = "account"
            X.36K r1 = r15.A0m(r0)     // Catch:{ 24Y -> 0x0750 }
            java.lang.String r0 = "key"
            X.36K r1 = r1.A0m(r0)     // Catch:{ 24Y -> 0x0750 }
            java.lang.Object r0 = r14.A00     // Catch:{ 24Y -> 0x0750 }
            X.9Rt r0 = (X.C194149Rt) r0     // Catch:{ 24Y -> 0x0750 }
            X.9VU r4 = r0.A04     // Catch:{ 24Y -> 0x0750 }
            X.3Rl r3 = r4.A00(r1)     // Catch:{ 24Y -> 0x0750 }
            X.7oG r2 = r0.A05     // Catch:{ 24Y -> 0x0750 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0750 }
            java.lang.String r0 = "providerKey/onSuccess: isValidSignature="
            r1.append(r0)     // Catch:{ 24Y -> 0x0750 }
            boolean r0 = X.AnonymousClass000.A1W(r3)
            java.lang.String r0 = X.C18300x5.A0m(r1, r0)     // Catch:{ 24Y -> 0x0750 }
            r2.A07(r0)     // Catch:{ 24Y -> 0x0750 }
            if (r3 == 0) goto L_0x073c
            r4.A03(r3)     // Catch:{ 24Y -> 0x0750 }
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x0750 }
            X.9n4 r0 = (X.C203069n4) r0     // Catch:{ 24Y -> 0x0750 }
            r0.BZ4(r3)     // Catch:{ 24Y -> 0x0750 }
            return
        L_0x073c:
            java.lang.String r0 = "providerKey/onSuccess signature is not valid"
            r2.A05(r0)     // Catch:{ 24Y -> 0x0750 }
            java.lang.Object r2 = r14.A01     // Catch:{ 24Y -> 0x0750 }
            X.9n4 r2 = (X.C203069n4) r2     // Catch:{ 24Y -> 0x0750 }
            r1 = 8
            X.34V r0 = new X.34V     // Catch:{ 24Y -> 0x0750 }
            r0.<init>((int) r1)     // Catch:{ 24Y -> 0x0750 }
            r2.BZ3(r0)     // Catch:{ 24Y -> 0x0750 }
            return
        L_0x0750:
            r2 = move-exception
            java.lang.Object r0 = r14.A00
            X.9Rt r0 = (X.C194149Rt) r0
            X.7oG r1 = r0.A05
            java.lang.String r0 = "providerKey/parseResponse failed: "
            r1.A0A(r0, r2)
            java.lang.Object r2 = r14.A01
            X.9n4 r2 = (X.C203069n4) r2
            r1 = 9
            X.34V r0 = new X.34V
            r0.<init>((int) r1)
            r2.BZ3(r0)
            return
        L_0x076b:
            java.lang.String r0 = "account"
            X.36K r0 = r15.A0m(r0)     // Catch:{ 24Y -> 0x0790 }
            X.34V r1 = X.AnonymousClass34V.A00(r0)     // Catch:{ 24Y -> 0x0790 }
            if (r1 == 0) goto L_0x077f
            java.lang.Object r0 = r14.A01     // Catch:{ 24Y -> 0x0790 }
            X.4EY r0 = (X.AnonymousClass4EY) r0     // Catch:{ 24Y -> 0x0790 }
            r0.BaB(r1)     // Catch:{ 24Y -> 0x0790 }
            return
        L_0x077f:
            java.lang.Object r1 = r14.A01
            r0 = 2
            X.9Wm r2 = new X.9Wm
            r2.<init>(r1, r0)
            java.lang.Object r1 = r14.A00
            X.9U5 r1 = (X.AnonymousClass9U5) r1
            r0 = 1
            r1.A07(r2, r15, r0)
            return
        L_0x0790:
            r3 = move-exception
            java.lang.Object r0 = r14.A00
            X.9U5 r0 = (X.AnonymousClass9U5) r0
            X.7oG r2 = r0.A0H
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "removePaymentMethod/onResponseSuccess/corrupt stream exception: "
            X.C1899593h.A1G(r2, r3, r0, r1)
            java.lang.Object r2 = r14.A01
            X.4EY r2 = (X.AnonymousClass4EY) r2
            r1 = 500(0x1f4, float:7.0E-43)
            X.34V r0 = new X.34V
            r0.<init>((int) r1)
            r2.BaB(r0)
            return
        L_0x07af:
            return
        L_0x07b0:
            return
        L_0x07b1:
            X.4eZ r0 = r4.A01     // Catch:{ Exception -> 0x07bd }
            X.C626936e.A06(r0)     // Catch:{ Exception -> 0x07bd }
            r0.BjL()     // Catch:{ Exception -> 0x07bd }
            return
        L_0x07ba:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ Exception -> 0x07bd }
            throw r0     // Catch:{ Exception -> 0x07bd }
        L_0x07bd:
            java.lang.String r0 = "Pay: requestDyiReport -> error parsing the response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x07c3:
            boolean r0 = r4.isEmpty()
            r2 = 0
            java.lang.Object r1 = r14.A01
            X.9my r1 = (X.C203009my) r1
            if (r0 != 0) goto L_0x07d2
            r1.BaU(r2, r4)
            return
        L_0x07d2:
            X.34V r0 = X.C1899693i.A0M()
            r1.BaU(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203899oU.A05(X.36K):void");
    }
}
