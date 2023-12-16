package X;

import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.util.Log;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.4KX  reason: invalid class name */
public class AnonymousClass4KX implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static void A00(AnonymousClass4KX r5, Throwable th) {
        ((AnonymousClass4EP) r5.A02).onError(800);
        Log.e("Connection/handleInvalidJidReceived", th);
        ((C66503Lr) r5.A00).A00.A0A("Connection/handleInvalidJidReceived", true, "invalid-jid-received");
        ((C130076bL) r5.A01).A05((Object) null);
    }

    public AnonymousClass4KX(C35711xJ r2, AnonymousClass5NM r3) {
        this.A03 = 21;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = new AnonymousClass5H7(r3);
    }

    public final void A02(AnonymousClass334 r4, C27991fJ r5) {
        C66503Lr r2 = (C66503Lr) this.A00;
        int i = r4.A00;
        if (5 == i || 6 == i) {
            Set set = r2.A0G;
            synchronized (set) {
                set.remove(r5);
            }
        }
    }

    public void BQs(String str) {
        AnonymousClass0Pc r1;
        Object r0;
        switch (this.A03) {
            case 0:
                ((C84134Bd) this.A02).AwB(AnonymousClass0x7.A0f());
                return;
            case 1:
                C18260x0.A0s("GroupXmppMethods/sendGetGroupInfoByCode/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "sendGetGroupInfoByCode IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 2:
                C18260x0.A0s("GroupXmppMethods/sendModifyAdmin/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                ((AnonymousClass4EP) this.A02).BQs(str);
                C18260x0.A0I((C130076bL) this.A01, "sendModifyAdmin IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 3:
                C18260x0.A0s("GroupXmppMethods/sendGetGroupInfoByInviteAddKey/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "sendGetGroupInfoByInviteAddKey IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 4:
                C18260x0.A0s("GroupXmppMethods/sendGetGroupProfile/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                return;
            case 5:
                C18260x0.A0s("GroupXmppMethods/sendSetGroupDescription/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "sendSetGroupDescription IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 6:
                return;
            case 7:
                A02((AnonymousClass334) this.A02, (C27991fJ) this.A01);
                Log.i("GroupXmppMethod/GetGroupInfo/delivery fail");
                return;
            case 8:
                ((C72183dJ) this.A01).BQr(new AnonymousClass249(str));
                return;
            case 9:
                C18260x0.A0s("LocationSubscriptionSendMethods/unsubscribe/onDeliveryFailure; iqId=", str, AnonymousClass001.A0o());
                return;
            case 10:
                C18260x0.A0s("BroadcastXmppMethods/sendDeleteBroadcastList/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                return;
            case 11:
                AnonymousClass0x9.A1I((C06270Wx) this.A01);
                return;
            case 12:
                Log.e("disclosuregetstagebyidsworker/onDeliveryFailure");
                DisclosureGetStageByIdsWorker disclosureGetStageByIdsWorker = (DisclosureGetStageByIdsWorker) this.A00;
                if (disclosureGetStageByIdsWorker.A01.A00 > 4) {
                    int[] iArr = (int[]) this.A02;
                    AnonymousClass66Y r02 = (AnonymousClass66Y) C18290x4.A0j(disclosureGetStageByIdsWorker.A02.A00, 2);
                    if (r02 != null) {
                        r02.BRF(iArr, 440);
                    }
                    r1 = (AnonymousClass0Pc) this.A01;
                    r0 = new C01400Ao();
                } else {
                    r1 = (AnonymousClass0Pc) this.A01;
                    r0 = new C01390An();
                }
                r1.A01(r0);
                return;
            case 13:
                Log.e("AvatarUserRequestHelper/onDeliveryFailure: Network Failure");
                ((AnonymousClass4EJ) this.A00).BQp();
                return;
            case 14:
                Log.i("marketing_disclosure/GetMMDisclosureAcceptanceRequest delivery fail");
                C41762Lm r03 = (C41762Lm) this.A00;
                C61242zw r2 = r03.A01;
                C61242zw.A00(r2, new C81123zN(r03.A00, r2));
                return;
            case 15:
                C18260x0.A0s("BizVNameXmppMethods/sendGetBizVNameCert/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A02, "Delivery failure: iq=", str, AnonymousClass001.A0o());
                return;
            case 16:
                C18260x0.A0s("GdprXmppMethods/sendRequestGdprReport/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "XMPP IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 17:
                C18260x0.A0s("GdprXmppMethods/sendGetGdprReport/onDeliveryFailure; iq=", str, AnonymousClass001.A0o());
                C18260x0.A0I((C130076bL) this.A01, "XMPP IQ was not delivered: iq=", str, AnonymousClass001.A0o());
                return;
            case 18:
                C18260x0.A0I((C130076bL) this.A01, "Failed deliver: iq=", str, AnonymousClass001.A0o());
                ((C58812vr) this.A00).A04.markerEnd(154475307, str.hashCode(), 3);
                return;
            case 19:
                ((AnonymousClass4EZ) this.A01).BQs(str);
                C18260x0.A0I((C130076bL) this.A02, "Failed to deliver request: iq=", str, AnonymousClass001.A0o());
                return;
            case 20:
                Log.e("ForceSuspendStateIqHelper/sendData:onDeliveryFailure");
                C42952Qe r12 = (C42952Qe) this.A00;
                Log.e("BloksPreConsentPayloadIqHelper/callForceSuspendState:onFailure");
                AnonymousClass2EU r04 = r12.A00;
                r04.A00.A00(r12.A02);
                return;
            default:
                C162457s7.A0J(str, 0);
                ((AnonymousClass5NM) this.A00).A00(new AnonymousClass249(str));
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e1, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        X.C18310x6.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSN(X.AnonymousClass36K r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00fd;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0125;
                case 5: goto L_0x0016;
                case 6: goto L_0x0131;
                case 7: goto L_0x013d;
                case 8: goto L_0x0199;
                case 9: goto L_0x01a6;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01d8;
                case 12: goto L_0x01e0;
                case 13: goto L_0x0234;
                case 14: goto L_0x0255;
                case 15: goto L_0x002e;
                case 16: goto L_0x0070;
                case 17: goto L_0x00a2;
                case 18: goto L_0x0273;
                case 19: goto L_0x00da;
                case 20: goto L_0x02d0;
                case 21: goto L_0x0338;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A02
            X.4EP r1 = (X.AnonymousClass4EP) r1
            int r0 = X.C57492tj.A01(r7)
            r1.onError(r0)
        L_0x0010:
            java.lang.Object r0 = r6.A01
        L_0x0012:
            X.C18310x6.A1H(r0)
            return
        L_0x0016:
            java.lang.Object r0 = r6.A02
            X.2RI r0 = (X.AnonymousClass2RI) r0
            int r5 = X.C57492tj.A01(r7)
            X.3Wi r4 = r0.A00
            X.4AR r3 = r0.A03
            java.lang.String r2 = r0.A04
            r1 = 2
            X.5rY r0 = new X.5rY
            r0.<init>(r3, r2, r5, r1)
            r4.A0S(r0)
            goto L_0x0010
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BizVNameXmppMethods/sendGetBizVNameCert/onError; iq="
            X.C18260x0.A0s(r0, r8, r1)
            int r3 = X.C57492tj.A01(r7)
            java.lang.Object r2 = r6.A00
            X.2dJ r2 = (X.C47472dJ) r2
            java.lang.Object r4 = r6.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert-error jid="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " errorCode="
            X.C18260x0.A0y(r0, r1, r3)
            X.8qC r0 = r2.A0A
            java.lang.Object r3 = r0.get()
            X.2rx r3 = (X.C56422rx) r3
            java.util.Map r2 = r3.A0A
            long r0 = java.lang.System.currentTimeMillis()
            X.AnonymousClass0x2.A1K(r4, r2, r0)
            X.1hh r1 = r3.A06
            X.2WG r0 = new X.2WG
            r0.<init>(r4)
            r1.A08()
            goto L_0x00e1
        L_0x0070:
            int r3 = X.C57492tj.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendRequestGdprReport/onError; iq="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", error="
            X.C18260x0.A0y(r0, r1, r3)
            java.lang.Object r2 = r6.A02
            X.5Ho r2 = (X.C102125Ho) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "send-request-gdpr-report/failed/error "
            X.C18260x0.A0x(r0, r1, r3)
            com.whatsapp.report.ReportActivity r3 = r2.A01
            X.3Wi r2 = r3.A05
            r1 = 5
            X.3br r0 = new X.3br
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0S(r0)
            goto L_0x0010
        L_0x00a2:
            int r2 = X.C57492tj.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport/onError; iq="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", errorCode="
            X.C18260x0.A0y(r0, r1, r2)
            java.lang.Object r1 = r6.A02
            X.5Hp r1 = (X.C102135Hp) r1
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x00ce
            X.3Lm r2 = r1.A00
            X.21u r1 = r2.A04()
            X.21u r0 = X.C373221u.REQUESTED
            if (r1 != r0) goto L_0x0010
            r2.A07()
            goto L_0x0010
        L_0x00ce:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "send-get-gdpr-report/failed/error "
            X.C18260x0.A0x(r0, r1, r2)
            goto L_0x0010
        L_0x00da:
            java.lang.Object r0 = r6.A01
            X.4EZ r0 = (X.AnonymousClass4EZ) r0
            r0.BdM(r7, r8)
        L_0x00e1:
            java.lang.Object r0 = r6.A02
            goto L_0x0012
        L_0x00e5:
            java.lang.String r0 = "error"
            X.36K r1 = r7.A0m(r0)
            java.lang.String r0 = "code"
            int r0 = X.AnonymousClass36K.A02(r1, r0)
            java.lang.Object r1 = r6.A02
            X.4Bd r1 = (X.C84134Bd) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.AwB(r0)
            return
        L_0x00fd:
            int r3 = X.C57492tj.A01(r7)
            r0 = 401(0x191, float:5.62E-43)
            r2 = 0
            if (r3 == r0) goto L_0x0122
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L_0x011f
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2021(0x7e5, float:2.832E-42)
            if (r3 == r0) goto L_0x0112
            r1 = 2018(0x7e2, float:2.828E-42)
        L_0x0112:
            android.os.Handler r0 = X.C66493Lq.A1H
            X.C18290x4.A1C(r0, r2, r1)
            java.lang.Object r0 = r6.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r2)
            return
        L_0x011f:
            r1 = 2020(0x7e4, float:2.83E-42)
            goto L_0x0112
        L_0x0122:
            r1 = 2019(0x7e3, float:2.829E-42)
            goto L_0x0112
        L_0x0125:
            java.lang.Object r1 = r6.A02
            X.4Cz r1 = (X.C84604Cz) r1
            int r0 = X.C57492tj.A01(r7)
            r1.onError(r0)
            return
        L_0x0131:
            java.lang.Object r1 = r6.A01
            X.4B6 r1 = (X.AnonymousClass4B6) r1
            int r0 = X.C57492tj.A01(r7)
            r1.BkI(r0)
            return
        L_0x013d:
            java.lang.Object r3 = r6.A01
            X.1fJ r3 = (X.C27991fJ) r3
            java.lang.Object r0 = r6.A02
            X.334 r0 = (X.AnonymousClass334) r0
            r6.A02(r0, r3)
            int r4 = X.C57492tj.A01(r7)
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 != r0) goto L_0x015f
            java.lang.Object r0 = r6.A00
            X.3Lr r0 = (X.C66503Lr) r0
            java.util.Map r2 = r0.A0F
            X.2sH r0 = r0.A02
            long r0 = r0.A0H()
            X.AnonymousClass0x2.A1K(r3, r2, r0)
        L_0x015f:
            java.lang.Object r0 = r6.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.3Lq r2 = X.C66503Lr.A00(r0)
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x0187
            r0 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r4 == r0) goto L_0x0181
            java.lang.String r0 = "groupmgr/groupInfoError/groupjid = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "errorcode = "
            X.C18260x0.A0y(r0, r1, r4)
            return
        L_0x0181:
            java.lang.String r0 = "groupmgr/groupInfoError/does not exist: "
            X.C18260x0.A1Q(r1, r0, r3)
            return
        L_0x0187:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupmgr/groupInfoError/not a participant: "
            X.C18260x0.A1Q(r1, r0, r3)
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0 = 1
            r2.A0c(r1, r0)
            return
        L_0x0199:
            java.lang.Object r1 = r6.A01
            X.3dJ r1 = (X.C72183dJ) r1
            X.24F r0 = new X.24F
            r0.<init>(r7, r8)
            r1.BQr(r0)
            return
        L_0x01a6:
            int r2 = X.C57492tj.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSubscriptionSendMethods/unsubscribe/onError; iqId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", error="
            X.C18260x0.A0y(r0, r1, r2)
            java.lang.Object r0 = r6.A01
            X.4B6 r0 = (X.AnonymousClass4B6) r0
            r0.BkI(r2)
            return
        L_0x01c3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BroadcastXmppMethods/sendDeleteBroadcastList/onError; iq="
            X.C18260x0.A0s(r0, r8, r1)
            int r1 = X.C57492tj.A01(r7)
            java.lang.Object r0 = r6.A01
            X.4B6 r0 = (X.AnonymousClass4B6) r0
            r0.BkI(r1)
            return
        L_0x01d8:
            java.lang.Object r0 = r6.A01
            X.0Wx r0 = (X.C06270Wx) r0
            X.AnonymousClass0x9.A1I(r0)
            return
        L_0x01e0:
            android.util.Pair r2 = X.C57492tj.A02(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError "
            X.C18260x0.A1Q(r1, r0, r2)
            if (r2 == 0) goto L_0x01fc
            int r1 = X.C18280x3.A03(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x01fc
            java.lang.String r0 = "disclosuregetstagebyidsworker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01fc:
            java.lang.Object r4 = r6.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            androidx.work.WorkerParameters r0 = r4.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x022a
            java.lang.Object r3 = r6.A02
            int[] r3 = (int[]) r3
            r2 = 440(0x1b8, float:6.17E-43)
            X.2Wq r0 = r4.A02
            r1 = 2
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = X.C18290x4.A0j(r0, r1)
            X.66Y r0 = (X.AnonymousClass66Y) r0
            if (r0 == 0) goto L_0x021d
            r0.BRF(r3, r2)
        L_0x021d:
            java.lang.Object r1 = r6.A01
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            X.0Ao r0 = new X.0Ao
            r0.<init>()
        L_0x0226:
            r1.A01(r0)
            return
        L_0x022a:
            java.lang.Object r1 = r6.A01
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            X.0An r0 = new X.0An
            r0.<init>()
            goto L_0x0226
        L_0x0234:
            X.C18260x0.A0O(r8, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AvatarUserRequestHelper/onError: "
            r1.append(r0)
            X.24F r0 = new X.24F
            r0.<init>(r7, r8)
            X.C18260x0.A0n(r0, r1)
            java.lang.Object r1 = r6.A01
            X.4GQ r1 = (X.AnonymousClass4GQ) r1
            X.24F r0 = new X.24F
            r0.<init>(r7, r8)
            r1.invoke(r0)
            return
        L_0x0255:
            int r2 = X.C57492tj.A00(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "marketing_disclosure/GetMMDisclosureAcceptanceRequest/"
            X.C18260x0.A0x(r0, r1, r2)
            java.lang.Object r0 = r6.A00
            X.2Lm r0 = (X.C41762Lm) r0
            X.2zw r2 = r0.A01
            X.4uZ r1 = r0.A00
            X.3zN r0 = new X.3zN
            r0.<init>(r1, r2)
            X.C61242zw.A00(r2, r0)
            return
        L_0x0273:
            int r4 = X.C57492tj.A01(r7)
            java.lang.Object r3 = r6.A02
            X.2LF r3 = (X.AnonymousClass2LF) r3
            r0 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r4 == r0) goto L_0x02ba
            java.lang.String r0 = "error in response while running get status privacy job"
            r2.append(r0)
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r1 = r3.A00
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A1I(r0, r1)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = "; code="
            X.C18260x0.A0x(r0, r2, r4)
        L_0x029d:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A01
            r0.set(r4)
            java.lang.Object r0 = r6.A01
            X.C18310x6.A1H(r0)
            java.lang.Object r0 = r6.A00
            X.2vr r0 = (X.C58812vr) r0
            X.8JP r3 = r0.A04
            int r2 = r8.hashCode()
            r1 = 87
            r0 = 154475307(0x9351b2b, float:2.1799857E-33)
            r3.markerEnd(r0, r2, r1)
            return
        L_0x02ba:
            java.lang.String r0 = "get status privacy job response is 'no settings found on server'"
            r2.append(r0)
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r1 = r3.A00
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A1I(r0, r1)
            java.lang.String r0 = r0.toString()
            X.C18260x0.A1L(r2, r0)
            goto L_0x029d
        L_0x02d0:
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            java.lang.String r0 = "ForceSuspendStateIqHelper/sendData:onError"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r5 = X.C57492tj.A01(r7)
            java.lang.Object r3 = r6.A02
            X.2aM r3 = (X.C45652aM) r3
            java.lang.Object r2 = r6.A00
            X.2Qe r2 = (X.C42952Qe) r2
            java.lang.Object r1 = r6.A01
            X.2p5 r1 = (X.C54662p5) r1
            r0 = 35
            X.3aN r4 = new X.3aN
            r4.<init>(r3, r2, r1, r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r5 == r0) goto L_0x0329
            r0 = 405(0x195, float:5.68E-43)
            if (r5 == r0) goto L_0x0329
            r0 = 408(0x198, float:5.72E-43)
            if (r5 == r0) goto L_0x0317
            r0 = 429(0x1ad, float:6.01E-43)
            if (r5 == r0) goto L_0x0317
            r0 = 481(0x1e1, float:6.74E-43)
            if (r5 == r0) goto L_0x030d
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 == r0) goto L_0x0317
            r0 = 503(0x1f7, float:7.05E-43)
            if (r5 == r0) goto L_0x0329
            return
        L_0x030d:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x0329
            r4.run()
            return
        L_0x0317:
            java.lang.Long r0 = r1.A01()
            if (r0 == 0) goto L_0x0329
            X.4FS r3 = r3.A01
            long r1 = r0.longValue()
            java.lang.String r0 = "ForceSuspendStateIqHelper/retryWithBackoff"
            r3.Bkn(r4, r0, r1)
            return
        L_0x0329:
            java.lang.String r0 = "BloksPreConsentPayloadIqHelper/callForceSuspendState:onFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2EU r0 = r2.A00
            X.24F r1 = r2.A02
            X.2gR r0 = r0.A00
            r0.A00(r1)
            return
        L_0x0338:
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            java.lang.Object r1 = r6.A01     // Catch:{ 24Y -> 0x0348 }
            X.1xJ r1 = (X.C35711xJ) r1     // Catch:{ 24Y -> 0x0348 }
            java.lang.Object r0 = r6.A02     // Catch:{ 24Y -> 0x0348 }
            X.5H7 r0 = (X.AnonymousClass5H7) r0     // Catch:{ 24Y -> 0x0348 }
            A01(r7, r1, r0)     // Catch:{ 24Y -> 0x0348 }
            return
        L_0x0348:
            r1 = move-exception
            java.lang.Object r0 = r6.A00
            X.5NM r0 = (X.AnonymousClass5NM) r0
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KX.BSN(X.36K, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x052b, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0539, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        com.whatsapp.util.Log.i("gdpr/on-report-requested");
        r5.A09(X.C373221u.A06.value);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0548, code lost:
        if ((r5 instanceof X.C32301q8) == false) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x054a, code lost:
        X.C18260x0.A0M(((X.C32301q8) r5).A01, "newsletter_gdpr_report_timestamp", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0556, code lost:
        X.C18260x0.A0M(((X.C32291q7) r5).A01, "gdpr_report_timestamp", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0560, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06b9, code lost:
        X.C18310x6.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a2, code lost:
        X.C18260x0.A0s(r1, r4, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r22, java.lang.String r23) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A03
            r5 = r22
            r4 = r23
            switch(r1) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0033;
                case 2: goto L_0x00dd;
                case 3: goto L_0x017c;
                case 4: goto L_0x01ed;
                case 5: goto L_0x0216;
                case 6: goto L_0x02a5;
                case 7: goto L_0x0228;
                case 8: goto L_0x027b;
                case 9: goto L_0x0295;
                case 10: goto L_0x029c;
                case 11: goto L_0x02ab;
                case 12: goto L_0x02e7;
                case 13: goto L_0x0363;
                case 14: goto L_0x036f;
                case 15: goto L_0x03da;
                case 16: goto L_0x04ab;
                case 17: goto L_0x04e6;
                case 18: goto L_0x058b;
                case 19: goto L_0x06b0;
                case 20: goto L_0x06bd;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 1
            X.C162457s7.A0J(r5, r1)
            java.lang.Object r2 = r0.A01     // Catch:{ 24Y -> 0x06d9 }
            X.1xJ r2 = (X.C35711xJ) r2     // Catch:{ 24Y -> 0x06d9 }
            java.lang.Object r1 = r0.A02     // Catch:{ 24Y -> 0x06d9 }
            X.5H7 r1 = (X.AnonymousClass5H7) r1     // Catch:{ 24Y -> 0x06d9 }
            A01(r5, r2, r1)     // Catch:{ 24Y -> 0x06d9 }
            return
        L_0x001b:
            java.lang.String r1 = "link_code_companion_reg"
            X.36K r2 = r5.A0m(r1)
            java.lang.String r1 = "link_code_pairing_ref"
            X.36K r1 = r2.A0m(r1)
            java.lang.String r1 = r1.A0n()
            java.lang.Object r0 = r0.A01
            X.4Bd r0 = (X.C84134Bd) r0
            r0.AwB(r1)
            return
        L_0x0033:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            java.lang.String r1 = "admin"
            X.AnonymousClass31X.A02(r5, r1, r4, r3)
            java.lang.Object r9 = r0.A02
            X.2GX r9 = (X.AnonymousClass2GX) r9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "modify-admins/"
            r2.append(r1)
            X.1to r11 = r9.A00
            X.1fJ r1 = r11.A06
            r2.append(r1)
            java.lang.String r10 = "/"
            java.lang.String r1 = X.AnonymousClass0x2.A0g(r2, r4, r3)
            X.C18260x0.A1L(r2, r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x052b
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.ref.WeakReference r1 = r11.A07
            java.lang.Object r7 = r1.get()
            android.app.Activity r7 = (android.app.Activity) r7
            if (r7 == 0) goto L_0x052b
            boolean r1 = r7.isFinishing()
            if (r1 != 0) goto L_0x052b
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r3)
        L_0x007c:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00d4
            java.util.Map$Entry r3 = X.AnonymousClass001.A0w(r12)
            X.4uZ r4 = X.C18320x8.A0N(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "modify-admins/error/"
            X.AnonymousClass000.A17(r4, r1, r10, r2)
            java.lang.Object r1 = r3.getValue()
            X.C18260x0.A0n(r1, r2)
            int r3 = X.AnonymousClass0x2.A08(r3)
            X.3Ex r1 = r11.A01
            X.3ZH r6 = r1.A0A(r4)
            java.util.List r1 = r11.A09
            boolean r5 = r1.contains(r4)
            r1 = 404(0x194, float:5.66E-43)
            r4 = 0
            r2 = 1
            if (r3 == r1) goto L_0x00cb
            r1 = 406(0x196, float:5.69E-43)
            if (r3 == r1) goto L_0x00c7
            r1 = 419(0x1a3, float:5.87E-43)
            if (r3 != r1) goto L_0x00cb
            r3 = 2131895908(0x7f122664, float:1.9426662E38)
        L_0x00bc:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.5ZU r1 = r11.A02
            X.C18300x5.A1E(r1, r6, r2, r4)
            X.C18290x4.A1B(r7, r8, r2, r3)
            goto L_0x007c
        L_0x00c7:
            r3 = 2131889118(0x7f120bde, float:1.941289E38)
            goto L_0x00bc
        L_0x00cb:
            r3 = 2131889120(0x7f120be0, float:1.9412895E38)
            if (r5 == 0) goto L_0x00bc
            r3 = 2131889060(0x7f120ba4, float:1.9412773E38)
            goto L_0x00bc
        L_0x00d4:
            X.3Wi r2 = r11.A00
            r1 = 31
            X.C69263Wi.A04(r2, r9, r8, r1)
            goto L_0x052b
        L_0x00dd:
            X.36K r1 = r5.A0j()
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass36K.A09(r1)
            java.lang.String r3 = "creation"
            r2 = 0
            java.lang.String r5 = r1.A0r(r3, r2)
            r3 = 0
            long r17 = X.C615531h.A04(r5, r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r5
            java.lang.String r4 = "subject"
            java.lang.String r10 = r1.A0r(r4, r2)
            long r19 = X.C615531h.A02(r1)
            long r19 = r19 * r5
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.A0r(r3, r2)
            if (r3 != 0) goto L_0x011c
            java.lang.Object r3 = r0.A02
            X.4EP r3 = (X.AnonymousClass4EP) r3
            r1 = 500(0x1f4, float:7.0E-43)
            r3.onError(r1)
            java.lang.Object r0 = r0.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r2)
            return
        L_0x011c:
            X.1fJ r6 = X.C627336j.A04(r3)     // Catch:{ 24P -> 0x0170 }
            java.lang.String r11 = X.AnonymousClass36K.A0K(r1)     // Catch:{ 24P -> 0x0170 }
            java.lang.Object r3 = r0.A00     // Catch:{ 24P -> 0x0170 }
            X.3Lr r3 = (X.C66503Lr) r3     // Catch:{ 24P -> 0x0170 }
            X.2qk r3 = r3.A00     // Catch:{ 24P -> 0x0170 }
            java.util.Map r13 = X.AnonymousClass36J.A06(r1, r3)     // Catch:{ 24P -> 0x0170 }
            int r14 = X.C615531h.A00(r1, r13)     // Catch:{ 24P -> 0x0170 }
            java.lang.String r3 = "parent"
            X.36K r5 = r1.A0l(r3)     // Catch:{ 24P -> 0x0170 }
            if (r5 == 0) goto L_0x0147
            java.lang.String r3 = "num_sub_groups"
            java.lang.String r5 = r5.A0r(r3, r2)     // Catch:{ 24P -> 0x0170 }
            r3 = 0
            int r14 = X.C615531h.A01(r5, r3)     // Catch:{ 24P -> 0x0170 }
        L_0x0147:
            java.lang.Object r5 = r0.A02     // Catch:{ 24P -> 0x0170 }
            X.4EP r5 = (X.AnonymousClass4EP) r5     // Catch:{ 24P -> 0x0170 }
            X.2zN r9 = X.AnonymousClass36J.A04(r1)     // Catch:{ 24P -> 0x0170 }
            int r15 = X.AnonymousClass36J.A02(r1)     // Catch:{ 24P -> 0x0170 }
            int r16 = X.C57482ti.A00(r1)     // Catch:{ 24P -> 0x0170 }
            java.lang.String r3 = "linked_parent"
            X.36K r3 = r1.A0l(r3)     // Catch:{ 24P -> 0x0170 }
            if (r3 == 0) goto L_0x0168
            java.lang.String r12 = r3.A0r(r4, r2)     // Catch:{ 24P -> 0x0170 }
        L_0x0163:
            X.1fJ r7 = X.AnonymousClass36J.A03(r1)     // Catch:{ 24P -> 0x0170 }
            goto L_0x016a
        L_0x0168:
            r12 = 0
            goto L_0x0163
        L_0x016a:
            r5.BU8(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ 24P -> 0x016e }
            goto L_0x0174
        L_0x016e:
            r1 = move-exception
            goto L_0x0171
        L_0x0170:
            r1 = move-exception
        L_0x0171:
            A00(r0, r1)
        L_0x0174:
            java.lang.Object r0 = r0.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r2)
            return
        L_0x017c:
            X.36K r1 = r5.A0j()
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass36K.A09(r1)
            java.lang.String r3 = "creation"
            r2 = 0
            java.lang.String r5 = r1.A0r(r3, r2)
            r3 = 0
            long r17 = X.C615531h.A04(r5, r3)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r5
            java.lang.String r4 = "subject"
            java.lang.String r10 = r1.A0r(r4, r2)
            long r19 = X.C615531h.A02(r1)
            long r19 = r19 * r5
            X.1fJ r6 = X.AnonymousClass36K.A08(r1)     // Catch:{ 24P -> 0x01df }
            java.lang.String r11 = X.AnonymousClass36K.A0K(r1)     // Catch:{ 24P -> 0x01df }
            java.lang.Object r3 = r0.A00     // Catch:{ 24P -> 0x01df }
            X.3Lr r3 = (X.C66503Lr) r3     // Catch:{ 24P -> 0x01df }
            X.2qk r3 = r3.A00     // Catch:{ 24P -> 0x01df }
            java.util.Map r13 = X.AnonymousClass36J.A06(r1, r3)     // Catch:{ 24P -> 0x01df }
            int r14 = X.C615531h.A00(r1, r13)     // Catch:{ 24P -> 0x01df }
            java.lang.Object r5 = r0.A02     // Catch:{ 24P -> 0x01df }
            X.4EP r5 = (X.AnonymousClass4EP) r5     // Catch:{ 24P -> 0x01df }
            X.2zN r9 = X.AnonymousClass36J.A04(r1)     // Catch:{ 24P -> 0x01df }
            int r15 = X.AnonymousClass36J.A02(r1)     // Catch:{ 24P -> 0x01df }
            int r16 = X.C57482ti.A00(r1)     // Catch:{ 24P -> 0x01df }
            java.lang.String r3 = "linked_parent"
            X.36K r3 = r1.A0l(r3)     // Catch:{ 24P -> 0x01df }
            if (r3 == 0) goto L_0x01d9
            java.lang.String r12 = r3.A0r(r4, r2)     // Catch:{ 24P -> 0x01df }
        L_0x01d4:
            X.1fJ r7 = X.AnonymousClass36J.A03(r1)     // Catch:{ 24P -> 0x01df }
            goto L_0x01db
        L_0x01d9:
            r12 = 0
            goto L_0x01d4
        L_0x01db:
            r5.BU8(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ 24P -> 0x01e1 }
            goto L_0x01e5
        L_0x01df:
            r1 = move-exception
            goto L_0x01e2
        L_0x01e1:
            r1 = move-exception
        L_0x01e2:
            A00(r0, r1)
        L_0x01e5:
            java.lang.Object r0 = r0.A01
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r2)
            return
        L_0x01ed:
            java.lang.String r1 = "picture"
            X.36K r3 = r5.A0m(r1)
            java.lang.String r1 = "id"
            r2 = 0
            java.lang.String r4 = r3.A0r(r1, r2)
            java.lang.String r5 = X.AnonymousClass36K.A0K(r3)
            java.lang.String r1 = "url"
            java.lang.String r6 = r3.A0r(r1, r2)
            byte[] r7 = r3.A01
            java.lang.Object r2 = r0.A02
            X.4Cz r2 = (X.C84604Cz) r2
            java.lang.Object r0 = r0.A01
            X.2QT r0 = (X.AnonymousClass2QT) r0
            X.1fJ r3 = r0.A01
            r2.BU9(r3, r4, r5, r6, r7)
            return
        L_0x0216:
            java.lang.Object r1 = r0.A02
            X.2RI r1 = (X.AnonymousClass2RI) r1
            X.1hw r3 = r1.A01
            X.3ZH r1 = r1.A02
            X.4uZ r2 = X.AnonymousClass3ZH.A01(r1)
            r1 = 0
            r3.A0C(r2, r1)
            goto L_0x052b
        L_0x0228:
            java.lang.Object r4 = r0.A01
            X.1fJ r4 = (X.C27991fJ) r4
            java.lang.Object r6 = r0.A02
            X.334 r6 = (X.AnonymousClass334) r6
            r0.A02(r6, r4)
            java.lang.String r2 = r6.A01
            java.lang.String r1 = "prefetch"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0256
            java.lang.String r1 = "interactive"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x026d
            java.lang.Object r1 = r0.A00
            X.3Lr r1 = (X.C66503Lr) r1
            X.1VX r3 = r1.A04
            r2 = 6531(0x1983, float:9.152E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r1, r2)
            if (r1 == 0) goto L_0x026d
        L_0x0256:
            X.36K r1 = X.AnonymousClass36K.A0D(r5)
            if (r1 != 0) goto L_0x026d
            java.lang.String r1 = "GroupXmppMethod/createGetGroupInfoResponseHandler phash match"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            java.lang.Object r0 = r0.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.2aH r0 = r0.A07
            X.2jH r0 = r0.A00
            r0.A01(r4)
            return
        L_0x026d:
            java.lang.Object r0 = r0.A00
            X.3Lr r0 = (X.C66503Lr) r0
            X.2qk r1 = r0.A00
            X.3Lq r0 = X.C66503Lr.A00(r0)
            X.C57482ti.A01(r1, r0, r6, r5)
            return
        L_0x027b:
            java.lang.Object r1 = r0.A00
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r1 = (com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob) r1
            X.2sK r4 = r1.A00
            com.whatsapp.jid.UserJid r3 = r1.A01
            java.lang.Object r1 = r0.A02
            long r1 = X.C18310x6.A0B(r1)
            r4.A0A(r3, r1)
            java.lang.Object r1 = r0.A01
            X.3dJ r1 = (X.C72183dJ) r1
            r0 = 0
            r1.BQt(r0)
            return
        L_0x0295:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "LocationSubscriptionSendMethods/unsubscribe/onSuccess; iqId="
            goto L_0x02a2
        L_0x029c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "BroadcastXmppMethods/sendDeleteBroadcastList/onSuccess; iq="
        L_0x02a2:
            X.C18260x0.A0s(r1, r4, r2)
        L_0x02a5:
            java.lang.Object r0 = r0.A02
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x02ab:
            r4 = 1
            X.C162457s7.A0J(r5, r4)
            java.lang.String r1 = "privacy"
            X.36K r2 = r5.A0m(r1)
            java.lang.String r1 = "category"
            X.36K r2 = r2.A0m(r1)
            java.lang.String r1 = "dhash"
            java.lang.String r3 = X.AnonymousClass36K.A0L(r2, r1)
            if (r3 == 0) goto L_0x02d9
            java.lang.Object r2 = r0.A02
            X.2qy r2 = (X.C55822qy) r2
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            r2.A04(r3, r1, r4)
            java.lang.Object r1 = r0.A01
            X.0Wx r1 = (X.C06270Wx) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x02d5:
            r1.A0G(r0)
            return
        L_0x02d9:
            java.lang.Object r1 = r0.A02
            X.2qy r1 = (X.C55822qy) r1
            r1.A00()
            java.lang.Object r1 = r0.A01
            X.0Wx r1 = (X.C06270Wx) r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x02d5
        L_0x02e7:
            java.lang.Object r4 = r0.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker r4 = (com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker) r4
            java.lang.String r1 = "notice"
            java.util.List r1 = r5.A0s(r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r1.iterator()
        L_0x02fa:
            boolean r1 = r6.hasNext()
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0341
            X.36K r5 = X.C18310x6.A0Y(r6)
            java.lang.String r1 = "id"
            int r8 = X.AnonymousClass36K.A02(r5, r1)
            java.lang.String r1 = "stage"
            int r9 = X.AnonymousClass36K.A02(r5, r1)
            long r11 = X.AnonymousClass36K.A03(r5)
            java.lang.String r1 = "version"
            int r10 = r5.A0b(r1, r2)
            java.lang.String r1 = "type"
            int r1 = r5.A0b(r1, r13)
            if (r1 != r13) goto L_0x0337
            r1 = -1
            if (r9 <= r1) goto L_0x0337
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r9 >= r1) goto L_0x0337
            X.34e r7 = new X.34e
            r7.<init>(r8, r9, r10, r11, r13)
            r3.add(r7)
            goto L_0x02fa
        L_0x0337:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "disclosuregetstagebyidsworker/parseusernoticemetadatalist not valid PDFN metadata id = "
            X.C18260x0.A0z(r1, r2, r8)
            goto L_0x02fa
        L_0x0341:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0356
            X.2Wq r1 = r4.A02
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Object r1 = X.C18290x4.A0j(r1, r13)
            X.66Y r1 = (X.AnonymousClass66Y) r1
            if (r1 == 0) goto L_0x0356
            r1.BEx(r3, r2, r2)
        L_0x0356:
            java.lang.Object r1 = r0.A01
            X.0Pc r1 = (X.AnonymousClass0Pc) r1
            X.0Ap r0 = new X.0Ap
            r0.<init>()
            r1.A01(r0)
            return
        L_0x0363:
            r1 = 1
            X.C162457s7.A0J(r5, r1)
            java.lang.Object r0 = r0.A02
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            r0.invoke(r5)
            return
        L_0x036f:
            r6 = 1
            X.C162457s7.A0J(r5, r6)
            java.lang.Object r3 = r0.A01
            X.1xJ r3 = (X.C35711xJ) r3
            r2 = 17
            X.6sb r1 = new X.6sb
            r1.<init>((X.AnonymousClass36K) r5, (X.C35711xJ) r3, (int) r2)
            java.lang.Object r1 = r1.A01
            java.util.Iterator r8 = X.C18320x8.A0q(r1)
        L_0x0384:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x03c9
            java.lang.Object r7 = r8.next()
            X.1vv r7 = (X.C34851vv) r7
            java.lang.Object r1 = r7.A00
            X.6rH r1 = (X.C138956rH) r1
            java.lang.Object r1 = r1.A00
            java.lang.Number r1 = (java.lang.Number) r1
            r4 = 20231028(0x134b374, double:9.995456E-317)
            if (r1 == 0) goto L_0x0384
            long r2 = r1.longValue()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0384
            java.lang.Object r1 = r7.A01
            java.lang.Number r1 = (java.lang.Number) r1
            X.C162457s7.A0D(r1)
            java.lang.Object r3 = r0.A00
            X.2Lm r3 = (X.C41762Lm) r3
            X.2zw r4 = r3.A01
            X.2Yg r2 = r4.A08
            long r0 = r1.longValue()
            r2.A00(r0, r6)
            X.4uZ r1 = r3.A00
        L_0x03bd:
            r4.A02(r1)
            X.3zO r0 = new X.3zO
            r0.<init>(r1, r4)
            X.C61242zw.A00(r4, r0)
            return
        L_0x03c9:
            java.lang.Object r5 = r0.A00
            X.2Lm r5 = (X.C41762Lm) r5
            r3 = 0
            X.2zw r4 = r5.A01
            X.2Yg r2 = r4.A08
            r0 = 0
            r2.A00(r0, r3)
            X.4uZ r1 = r5.A00
            goto L_0x03bd
        L_0x03da:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "BizVNameXmppMethods/sendGetBizVNameCert/onSuccess; iq="
            X.C18260x0.A0s(r1, r4, r2)
            java.lang.String r1 = "verified_name"
            X.36K r2 = r5.A0l(r1)
            X.C626936e.A06(r2)
            com.whatsapp.jid.Jid r6 = X.AnonymousClass36K.A06(r2)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            if (r6 != 0) goto L_0x03f9
            java.lang.Object r6 = r0.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
        L_0x03f9:
            java.lang.String r1 = "v"
            r4 = 0
            java.lang.String r5 = r2.A0r(r1, r4)
            java.lang.String r1 = "verified_level"
            java.lang.String r3 = r2.A0r(r1, r4)
            java.lang.String r1 = "serial"
            long r11 = X.AnonymousClass36K.A05(r2, r1)
            X.3ZC r7 = X.AnonymousClass36K.A0B(r2)
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x048a
            if (r3 == 0) goto L_0x048a
            byte[] r9 = r2.A01
            java.lang.Object r8 = r0.A00
            X.2dJ r8 = (X.C47472dJ) r8
            X.8qC r1 = r8.A0A
            r1.get()
            if (r9 == 0) goto L_0x0460
            X.1CQ r1 = X.AnonymousClass1CQ.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            X.6cX r2 = X.C130786cX.A05(r1, r9)     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            X.1CQ r2 = (X.AnonymousClass1CQ) r2     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            int r1 = r2.bitField0_     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0460
            X.8Lq r1 = r2.details_     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            byte[] r2 = r1.A07()     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            X.1DL r1 = X.AnonymousClass1DL.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            X.6cX r2 = X.C130786cX.A05(r1, r2)     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            X.1DL r2 = (X.AnonymousClass1DL) r2     // Catch:{ 6u5 -> 0x0449, IllegalArgumentException -> 0x0451 }
            if (r2 == 0) goto L_0x0460
            goto L_0x0469
        L_0x0449:
            r2 = move-exception
            java.lang.String r1 = "vname invalidproto:"
            com.whatsapp.util.Log.w(r1, r2)
            goto L_0x0460
        L_0x0451:
            r5 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "vname failed to get identity entry for jid = "
            java.lang.String r1 = X.AnonymousClass000.A0P(r4, r1, r2)
            com.whatsapp.util.Log.w(r1, r5)
        L_0x0460:
            java.lang.String r1 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, certblob is null."
            goto L_0x0465
        L_0x0463:
            java.lang.String r1 = "BizNameXmppMethods/createGetBizVNameCertResponseHandler/onSuccess, serial is not present in certblob"
        L_0x0465:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0471
        L_0x0469:
            int r1 = r2.bitField0_
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0463
            long r11 = r2.serial_
        L_0x0471:
            int r10 = X.AnonymousClass28W.A00(r3)
            java.lang.Object r5 = r0.A02
            X.6bK r5 = (X.C130066bK) r5
            X.8qC r0 = r8.A0B
            java.lang.Object r0 = r0.get()
            X.4FS r0 = (X.AnonymousClass4FS) r0
            X.3bE r4 = new X.3bE
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.BkM(r4)
            return
        L_0x048a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "BizVNameXmppMethods/unknown vname cert payload version or vlevel for jid:"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = " v="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " vlevel="
            X.C18260x0.A0t(r1, r3, r2)
            java.lang.Object r0 = r0.A02
            X.6bL r0 = (X.C130076bL) r0
            r0.A05(r4)
            return
        L_0x04ab:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GdprXmppMethods/sendRequestGdprReport/onSuccess; iq="
            X.C18260x0.A0s(r1, r4, r2)
            java.lang.String r1 = "gdpr"
            X.36K r2 = r5.A0l(r1)
            r3 = 0
            if (r2 == 0) goto L_0x04c8
            java.lang.String r1 = "timestamp"
            long r1 = r2.A0e(r1, r3)
            r3 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
        L_0x04c8:
            java.lang.Object r5 = r0.A02
            X.5Ho r5 = (X.C102125Ho) r5
            X.20h r2 = r5.A00
            X.20h r1 = X.C369320h.ACCOUNT
            if (r2 != r1) goto L_0x04dd
            com.whatsapp.report.ReportActivity r1 = r5.A01
            X.8qC r1 = r1.A0E
        L_0x04d6:
            java.lang.Object r5 = r1.get()
            X.3Lm r5 = (X.C66453Lm) r5
            goto L_0x0539
        L_0x04dd:
            X.20h r1 = X.C369320h.NEWSLETTER
            if (r2 != r1) goto L_0x052b
            com.whatsapp.report.ReportActivity r1 = r5.A01
            X.8qC r1 = r1.A0F
            goto L_0x04d6
        L_0x04e6:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GdprXmppMethods/sendGetGdprReport/onSuccess; iq="
            X.C18260x0.A0s(r1, r4, r2)
            java.lang.String r1 = "gdpr"
            X.36K r8 = r5.A0l(r1)
            if (r8 == 0) goto L_0x0565
            java.lang.String r1 = "document"
            X.36K r7 = r8.A0l(r1)
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r2 = r0.A02
            X.5Hp r2 = (X.C102135Hp) r2
            if (r7 == 0) goto L_0x052f
            java.lang.String r1 = "creation"
            long r9 = r7.A0e(r1, r3)
            long r9 = r9 * r5
            byte[] r8 = r7.A01
            java.lang.Object r1 = r0.A00
            X.5Hn r1 = (X.C102115Hn) r1
            X.2sH r1 = r1.A00
            long r11 = X.C56612sH.A05(r1, r7)
            X.3Lm r7 = r2.A00
            X.21u r1 = r7.A04()
            int r2 = r1.value
            X.21u r1 = X.C373221u.DOWNLOADED
            int r1 = r1.value
            if (r2 >= r1) goto L_0x052b
            r7.A0B(r8, r9, r11)
        L_0x052b:
            java.lang.Object r0 = r0.A01
            goto L_0x06b9
        L_0x052f:
            java.lang.String r1 = "timestamp"
            long r3 = r8.A0e(r1, r3)
            long r3 = r3 * r5
            X.3Lm r5 = r2.A00
        L_0x0539:
            monitor-enter(r5)
            java.lang.String r1 = "gdpr/on-report-requested"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0562 }
            X.21u r1 = X.C373221u.REQUESTED     // Catch:{ all -> 0x0562 }
            int r1 = r1.value     // Catch:{ all -> 0x0562 }
            r5.A09(r1)     // Catch:{ all -> 0x0562 }
            boolean r1 = r5 instanceof X.C32301q8     // Catch:{ all -> 0x0562 }
            if (r1 == 0) goto L_0x0556
            r1 = r5
            X.1q8 r1 = (X.C32301q8) r1     // Catch:{ all -> 0x0562 }
            X.33p r2 = r1.A01     // Catch:{ all -> 0x0562 }
            java.lang.String r1 = "newsletter_gdpr_report_timestamp"
            X.C18260x0.A0M(r2, r1, r3)     // Catch:{ all -> 0x0562 }
            goto L_0x0560
        L_0x0556:
            r1 = r5
            X.1q7 r1 = (X.C32291q7) r1     // Catch:{ all -> 0x0562 }
            X.33p r2 = r1.A01     // Catch:{ all -> 0x0562 }
            java.lang.String r1 = "gdpr_report_timestamp"
            X.C18260x0.A0M(r2, r1, r3)     // Catch:{ all -> 0x0562 }
        L_0x0560:
            monitor-exit(r5)
            goto L_0x052b
        L_0x0562:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0565:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GdprXmppMethods/sendGetGdprReport/onSuccess; no GDPR node, iq="
            X.C18260x0.A0s(r1, r4, r2)
            r3 = 0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "send-get-gdpr-report/failed/error "
            X.C18260x0.A0x(r1, r2, r3)
            java.lang.Object r2 = r0.A01
            X.6bL r2 = (X.C130076bL) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid response from server for GDPR report request: iq="
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r4, r1)
            r2.A06(r0)
            return
        L_0x058b:
            java.lang.String r1 = "privacy"
            X.36K r2 = r5.A0m(r1)
            java.lang.String r1 = "list"
            java.util.Iterator r13 = X.AnonymousClass36K.A0M(r2, r1)
            r8 = 0
            r11 = r8
            r2 = r8
        L_0x059b:
            r3 = 0
        L_0x059c:
            boolean r1 = r13.hasNext()
            r6 = 154475307(0x9351b2b, float:2.1799857E-33)
            r5 = 2
            if (r1 == 0) goto L_0x0625
            X.36K r10 = X.C18310x6.A0Y(r13)
            java.lang.String r1 = "user"
            java.util.List r5 = r10.A0s(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = r5.size()
            r9.<init>(r1)
            java.util.Iterator r12 = r5.iterator()
        L_0x05be:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x05d4
            X.36K r7 = X.C18310x6.A0Y(r12)
            java.lang.Class<X.4uZ> r5 = X.C95814uZ.class
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r1 = r7.A0g(r5, r1)
            r9.add(r1)
            goto L_0x05be
        L_0x05d4:
            java.lang.String r7 = X.AnonymousClass36K.A0K(r10)
            if (r7 == 0) goto L_0x060e
            java.lang.String r1 = "default"
            boolean r5 = X.AnonymousClass36K.A0X(r10, r1, r8)
            int r1 = r7.hashCode()
            switch(r1) {
                case -1653850041: goto L_0x05e8;
                case -567451565: goto L_0x05f6;
                case 1333012765: goto L_0x0601;
                default: goto L_0x05e7;
            }
        L_0x05e7:
            goto L_0x059c
        L_0x05e8:
            java.lang.String r1 = "whitelist"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x059c
            if (r5 == 0) goto L_0x05f4
            r3 = 1
        L_0x05f4:
            r11 = r9
            goto L_0x059c
        L_0x05f6:
            java.lang.String r1 = "contacts"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x059c
            if (r5 == 0) goto L_0x059c
            goto L_0x059b
        L_0x0601:
            java.lang.String r1 = "blacklist"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x059c
            if (r5 == 0) goto L_0x060c
            r3 = 2
        L_0x060c:
            r2 = r9
            goto L_0x059c
        L_0x060e:
            java.lang.Object r0 = r0.A00
            X.2vr r0 = (X.C58812vr) r0
            X.8JP r2 = r0.A04
            int r1 = r4.hashCode()
            r0 = 4158(0x103e, float:5.827E-42)
            r2.markerEnd(r6, r1, r0)
            java.lang.String r0 = "status list type is null"
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0625:
            java.lang.Object r12 = r0.A02
            X.2LF r12 = (X.AnonymousClass2LF) r12
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "get status privacy job response statusDistributionMode="
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = "; allowList="
            r9.append(r1)
            java.lang.String r7 = "null"
            java.lang.String r10 = ","
            if (r11 != 0) goto L_0x06ab
            r1 = r7
        L_0x0642:
            r9.append(r1)
            java.lang.String r1 = "; denyList="
            r9.append(r1)
            if (r2 == 0) goto L_0x0650
            java.lang.String r7 = android.text.TextUtils.join(r10, r2)
        L_0x0650:
            X.C18260x0.A1L(r9, r7)
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r9 = r12.A00
            X.33e r1 = r9.A01
            boolean r1 = r1.A0F()
            if (r1 != 0) goto L_0x068d
            java.lang.String r1 = "save status privacy"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.33e r1 = r9.A01
            X.2rO r7 = r1.A04
            java.lang.String r1 = "status_distribution"
            r7.A03(r1, r3)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x06a2
            r2 = r3
        L_0x0672:
            java.lang.String r1 = "status_black_list"
            r7.A05(r1, r2)
            if (r11 == 0) goto L_0x0682
            java.lang.String[] r1 = X.C627336j.A0O(r11)
            java.lang.String r3 = android.text.TextUtils.join(r10, r1)
        L_0x0682:
            java.lang.String r1 = "status_white_list"
            r7.A05(r1, r3)
            X.3FH r1 = r9.A00
            r1.A00()
        L_0x068d:
            java.lang.Object r1 = r0.A01
            X.6bL r1 = (X.C130076bL) r1
            r1.A05(r8)
            java.lang.Object r0 = r0.A00
            X.2vr r0 = (X.C58812vr) r0
            X.8JP r1 = r0.A04
            int r0 = r4.hashCode()
            r1.markerEnd(r6, r0, r5)
            return
        L_0x06a2:
            java.lang.String[] r1 = X.C627336j.A0O(r2)
            java.lang.String r2 = android.text.TextUtils.join(r10, r1)
            goto L_0x0672
        L_0x06ab:
            java.lang.String r1 = android.text.TextUtils.join(r10, r11)
            goto L_0x0642
        L_0x06b0:
            java.lang.Object r1 = r0.A01
            X.4EZ r1 = (X.AnonymousClass4EZ) r1
            r1.BdM(r5, r4)
            java.lang.Object r0 = r0.A02
        L_0x06b9:
            X.C18310x6.A1H(r0)
            return
        L_0x06bd:
            java.lang.String r1 = "ForceSuspendStateIqHelper/sendData:onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Object r1 = r0.A00
            X.2Qe r1 = (X.C42952Qe) r1
            java.lang.String r0 = "BloksPreConsentPayloadIqHelper/callForceSuspendState:onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2p5 r0 = r1.A01
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x06e1
            java.lang.Runnable r0 = r1.A03
            r0.run()
            return
        L_0x06d9:
            r1 = move-exception
            java.lang.Object r0 = r0.A00
            X.5NM r0 = (X.AnonymousClass5NM) r0
            r0.A00(r1)
        L_0x06e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4KX.BdM(X.36K, java.lang.String):void");
    }

    public static void A01(AnonymousClass36K r6, C35711xJ r7, AnonymousClass5H7 r8) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C35741xM r0 = new C35741xM(r6, r7);
            AnonymousClass5NM r2 = r8.A00;
            String str = r0.A01;
            C162457s7.A0D(str);
            String str2 = r0.A02;
            C162457s7.A0D(str2);
            AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = r2.A00;
            accountLinkingWebAuthActivity.A07 = AnonymousClass3Z6.A02(str, str2);
            C48792fU r3 = r2.A01;
            r3.A00();
            accountLinkingWebAuthActivity.A05.BkS(new C70163a3(r3, 0, accountLinkingWebAuthActivity));
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("GetNativeSSOLoginTokensResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C139776sb r1 = new C139776sb(r6, r7, 22);
                r8.A00.A00(new AnonymousClass24F(r1.A00, ((C34981w8) r1.A01).A01));
            } catch (AnonymousClass24Y e2) {
                throw AnonymousClass24Y.A03("GetNativeSSOLoginTokensResponseError: ", AnonymousClass001.A0o(), e2, A0s);
            }
        }
    }

    public AnonymousClass4KX(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }
}
