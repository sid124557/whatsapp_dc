package org.whispersystems.jobqueue;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1CA;
import X.AnonymousClass1ET;
import X.AnonymousClass1EU;
import X.AnonymousClass1gw;
import X.AnonymousClass1h0;
import X.AnonymousClass2z0;
import X.AnonymousClass47C;
import X.AnonymousClass47E;
import X.AnonymousClass47G;
import X.AnonymousClass47H;
import X.AnonymousClass47K;
import X.AnonymousClass47L;
import X.AnonymousClass47V;
import X.AnonymousClass47o;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C28451gt;
import X.C28461gu;
import X.C28471gv;
import X.C28481gx;
import X.C28491gy;
import X.C28501gz;
import X.C49422gV;
import X.C49582gl;
import X.C56612sH;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C69263Wi;
import X.C83994Ap;
import X.C95814uZ;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;
import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob;
import com.whatsapp.jobqueue.job.SendDisableLiveLocationJob;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.jobqueue.job.SendEngagedReceiptJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJob;
import com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2;
import com.whatsapp.jobqueue.job.SendReadReceiptJob;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob;
import com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.whatsapp.jobqueue.job.SyncDevicesJob;
import com.whatsapp.jobqueue.job.SyncProfilePictureJob;
import com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob;
import com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob;
import com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    /* JADX WARNING: Removed duplicated region for block: B:301:0x02c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r15 = this;
            r2 = r15
            boolean r0 = r15 instanceof X.AnonymousClass47E
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof X.AnonymousClass47L
            if (r0 == 0) goto L_0x001c
            X.47L r2 = (X.AnonymousClass47L) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendViewReceiptJob/onAdded; "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1J(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r15 instanceof X.AnonymousClass47o
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof X.C28501gz
            if (r0 == 0) goto L_0x004c
            X.1gz r2 = (X.C28501gz) r2
            java.lang.String r0 = "UpdateNewsletterGraphqlJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2gi r0 = r2.A04
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "mexGraphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0037:
            X.31C r0 = r0.A03
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x001b
            X.4DF r1 = r2.callback
            if (r1 == 0) goto L_0x001b
            X.6nE r0 = new X.6nE
            r0.<init>()
            r1.onError(r0)
            return
        L_0x004c:
            boolean r0 = r15 instanceof X.C28481gx
            if (r0 == 0) goto L_0x0074
            X.1gx r2 = (X.C28481gx) r2
            java.lang.String r0 = "NewsletterSubscribersGraphqlJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2gi r0 = r2.A02
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "graphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0062:
            X.31C r0 = r0.A03
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x001b
            X.4Ao r0 = r2.callback
            if (r0 == 0) goto L_0x001b
            X.6nE r0 = new X.6nE
            r0.<init>()
            return
        L_0x0074:
            boolean r0 = r15 instanceof X.AnonymousClass1gw
            if (r0 == 0) goto L_0x00b4
            X.1gw r2 = (X.AnonymousClass1gw) r2
            java.lang.String r0 = "NewsletterReactionSendersGraphqlJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2gi r0 = r2.A00
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "graphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x008a:
            X.31C r0 = r0.A03
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x001b
            X.8jL r1 = r2.callback
            if (r1 == 0) goto L_0x001b
            X.6nE r0 = new X.6nE
            r0.<init>()
            X.3RO r1 = (X.AnonymousClass3RO) r1
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.3Yv r2 = r1.A02
            boolean r0 = r2.element
            if (r0 != 0) goto L_0x001b
            X.4Du r1 = r1.A01
            X.1hB r0 = new X.1hB
            r0.<init>()
            r1.BkD(r0)
            r0 = 1
            r2.element = r0
            return
        L_0x00b4:
            boolean r0 = r15 instanceof X.AnonymousClass1h0
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "BaseMetadataNewsletterGraphqlJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00be:
            boolean r0 = r15 instanceof X.C28451gt
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "GetNewsletterMyAddOnsMessagesJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00c8:
            boolean r0 = r15 instanceof X.C28461gu
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00d2:
            boolean r0 = r15 instanceof X.C28471gv
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "GetNewsletterMessagesJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00dc:
            boolean r0 = r15 instanceof X.C28491gy
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = "GetNewsletterGeosuspensionJob/onAdded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00e6:
            boolean r0 = r15 instanceof X.AnonymousClass47G
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onadded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00f8:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncProfilePictureJob
            if (r0 == 0) goto L_0x010f
            com.whatsapp.jobqueue.job.SyncProfilePictureJob r2 = (com.whatsapp.jobqueue.job.SyncProfilePictureJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncProfilePictureJob/onAdded/sync profile picture job added param="
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x010f:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDevicesJob
            if (r0 == 0) goto L_0x0126
            com.whatsapp.jobqueue.job.SyncDevicesJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDevicesJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0126:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r0 == 0) goto L_0x013d
            com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDevicesAndSendInvisibleMessageJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x013d:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r0 == 0) goto L_0x0160
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r2 = (com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob) r2
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceForAdvValidationJob/onAdded/sync devices job added param="
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r0, r3)
            java.lang.String r0 = "; jids="
            r1.append(r0)
            java.lang.String[] r0 = r2.jids
            java.lang.String r0 = X.C627336j.A09(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C18260x0.A1L(r3, r0)
            return
        L_0x0160:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob
            if (r0 == 0) goto L_0x0177
            com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r2 = (com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onAdded/sync devices job added param="
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0177:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendRetryReceiptJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendReadReceiptJob
            if (r0 == 0) goto L_0x0196
            com.whatsapp.jobqueue.job.SendReadReceiptJob r2 = (com.whatsapp.jobqueue.job.SendReadReceiptJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendReadReceiptJob/onAdded "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1J(r1, r0)
            return
        L_0x0196:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            if (r0 == 0) goto L_0x01ad
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r2 = (com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendPlayedReceiptJobV2/onAdded; "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1J(r1, r0)
            return
        L_0x01ad:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPeerMessageJob
            if (r0 == 0) goto L_0x0243
            com.whatsapp.jobqueue.job.SendPeerMessageJob r2 = (com.whatsapp.jobqueue.job.SendPeerMessageJob) r2
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendPeerMessageJob/onAdded/job added="
            r4.append(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "; peer_msg_row_id="
            r3.append(r0)
            long r0 = r2.peerMessageRowId
            java.lang.String r0 = X.AnonymousClass001.A0k(r3, r0)
            X.C18260x0.A1L(r4, r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r5 = r0.iterator()
        L_0x01de:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r5.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            if (r0 == 0) goto L_0x0230
            com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement) r1
            java.lang.String r0 = r1.targetJidRawString
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            X.C626936e.A06(r3)
            X.318 r0 = r1.A01
            X.6aS r0 = r0.A04()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x022b
            X.33n r1 = r1.A00
            X.2ov r0 = X.AnonymousClass36G.A02(r3)
            boolean r0 = r1.A0Z(r0)
            if (r0 != 0) goto L_0x022b
            java.util.Set r1 = java.util.Collections.singleton(r3)
        L_0x0215:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01de
            com.whatsapp.jid.DeviceJid[] r0 = com.whatsapp.jobqueue.job.SendPeerMessageJob.A0E
            java.lang.Object[] r4 = r1.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r4 = (com.whatsapp.jid.DeviceJid[]) r4
            X.2qR r3 = r2.A01
            r1 = 0
            r0 = 5
            r3.A04(r4, r0, r1)
            goto L_0x01de
        L_0x022b:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x0215
        L_0x0230:
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x01de
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r1
            boolean r0 = r1.BIR()
            if (r0 != 0) goto L_0x01de
            com.whatsapp.jid.DeviceJid r0 = r1.A01
            java.util.Set r1 = java.util.Collections.singleton(r0)
            goto L_0x0215
        L_0x0243:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendLiveLocationKeyJob
            if (r0 == 0) goto L_0x029a
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r2 = (com.whatsapp.jobqueue.job.SendLiveLocationKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "live location key notification send job added"
            r1.append(r0)
            java.lang.String r0 = r2.A09()
            X.C18260x0.A1L(r1, r0)
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r3 = r0.iterator()
        L_0x026d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05a1
            java.lang.Object r1 = r3.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            if (r0 == 0) goto L_0x028b
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r1
            boolean r0 = r1.BIR()
            if (r0 != 0) goto L_0x026d
            com.whatsapp.jid.DeviceJid r0 = r1.A01
        L_0x0287:
            r4.add(r0)
            goto L_0x026d
        L_0x028b:
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x026d
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r1
            boolean r0 = r1.BIR()
            if (r0 != 0) goto L_0x026d
            com.whatsapp.jid.DeviceJid r0 = r1.A01
            goto L_0x0287
        L_0x029a:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r0 == 0) goto L_0x02f3
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r2 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r2
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r3 = r0.requirements
            java.lang.String r0 = r2.rawDeviceJid
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "final live location notification send retry job added"
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            java.util.Iterator r6 = r3.iterator()
            r5 = 0
            r4 = 0
        L_0x02c0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r3 = r6.next()
            org.whispersystems.jobqueue.requirements.Requirement r3 = (org.whispersystems.jobqueue.requirements.Requirement) r3
            boolean r0 = r3 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r1 = 1
            if (r0 == 0) goto L_0x02e5
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r3 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r3
            boolean r0 = r3.BIR()
        L_0x02d7:
            if (r0 != 0) goto L_0x02f0
            r4 = 1
        L_0x02da:
            X.2qR r3 = r2.A01
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r1]
            r1[r5] = r7
            r0 = 3
            r3.A04(r1, r0, r5)
            goto L_0x02c0
        L_0x02e5:
            boolean r0 = r3 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x02f0
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r3 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r3
            boolean r0 = r3.BIR()
            goto L_0x02d7
        L_0x02f0:
            if (r4 == 0) goto L_0x02c0
            goto L_0x02da
        L_0x02f3:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r0 == 0) goto L_0x032f
            com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r2 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r2
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r3 = r0.requirements
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "final live location notification send job added"
            r1.append(r0)
            java.lang.String r0 = r2.A09()
            X.C18260x0.A1L(r1, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0311:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            if (r0 == 0) goto L_0x0311
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement) r1
            boolean r0 = r1.BIR()
            if (r0 != 0) goto L_0x0311
            X.33o r0 = r2.A04
            r0.A0c()
            goto L_0x0311
        L_0x032f:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r0 == 0) goto L_0x0346
            com.whatsapp.jobqueue.job.SendEngagedReceiptJob r2 = (com.whatsapp.jobqueue.job.SendEngagedReceiptJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendEngagedReceiptJob/onAdded "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1J(r1, r0)
            return
        L_0x0346:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendE2EMessageJob
            if (r0 == 0) goto L_0x04cf
            com.whatsapp.jobqueue.job.SendE2EMessageJob r2 = (com.whatsapp.jobqueue.job.SendE2EMessageJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/e2e message send job added"
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            boolean r0 = r2.duplicate
            if (r0 == 0) goto L_0x036b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/e2e messasge job is duplicate, skipping requirement check"
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r2, r0, r1)
            X.C18260x0.A1M(r1, r0)
            return
        L_0x036b:
            boolean r0 = r2.A0C()
            r4 = 1
            if (r0 == 0) goto L_0x0489
            r11 = 11
        L_0x0374:
            r2.A16 = r4
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r8 = r0.iterator()
            r3 = 0
        L_0x037f:
            boolean r0 = r8.hasNext()
            r14 = 0
            if (r0 == 0) goto L_0x0492
            java.lang.Object r5 = r8.next()
            org.whispersystems.jobqueue.requirements.Requirement r5 = (org.whispersystems.jobqueue.requirements.Requirement) r5
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            if (r0 == 0) goto L_0x039b
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r5 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r5
            boolean r0 = r5.BIR()
            if (r0 != 0) goto L_0x037f
            com.whatsapp.jid.DeviceJid r3 = r5.A01
            goto L_0x037f
        L_0x039b:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            if (r0 == 0) goto L_0x03aa
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r5 = (com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement) r5
            boolean r0 = r5.BIR()
            if (r0 != 0) goto L_0x037f
            com.whatsapp.jid.DeviceJid r3 = r5.A01
            goto L_0x037f
        L_0x03aa:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement
            if (r0 == 0) goto L_0x0414
            com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r5 = (com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement) r5
            java.util.List r0 = r5.A00()
            if (r0 != 0) goto L_0x03f2
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x03ba:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x037f
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r14]
            java.lang.Object[] r10 = r7.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r10 = (com.whatsapp.jid.DeviceJid[]) r10
            r2.A15 = r4
            r2.A16 = r14
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A04 = r0
            int r0 = r7.size()
            r2.A01 = r0
            X.2qR r9 = r2.A0F
            boolean r1 = r5 instanceof com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement
            X.4uZ r0 = r5.A04
            if (r1 == 0) goto L_0x03e4
            X.1fL r0 = X.C57382tY.A00(r0)
        L_0x03e4:
            int r12 = X.AnonymousClass36M.A05(r0)
            int r0 = r2.A01
            int r13 = X.AnonymousClass36M.A00(r0)
            r9.A03(r10, r11, r12, r13, r14)
            goto L_0x037f
        L_0x03f2:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r0.iterator()
        L_0x03fa:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r1 = r6.next()
            java.util.List r1 = (java.util.List) r1
            X.33n r0 = r5.A01
            java.util.Set r0 = r0.A0H(r1)
            java.util.List r0 = X.AnonymousClass36G.A05(r0)
            r7.addAll(r0)
            goto L_0x03fa
        L_0x0414:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            if (r0 == 0) goto L_0x0427
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r5 = (com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement) r5
            boolean r0 = r5.BIR()
            if (r0 != 0) goto L_0x037f
            X.33o r0 = r2.A0k
            r0.A0c()
            goto L_0x037f
        L_0x0427:
            boolean r0 = r5 instanceof com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            if (r0 == 0) goto L_0x0477
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r5 = (com.whatsapp.jobqueue.requirement.ChatConnectionRequirement) r5
            X.1im r0 = r5.A00
            int r1 = r0.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x037f
            r2.A18 = r4
            int r0 = r2.retryCount
            if (r0 != 0) goto L_0x037f
            X.2a7 r5 = r2.A0v
            java.lang.String r0 = "Scheduling job for unsent messages"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33i r1 = r5.A00
            android.app.job.JobScheduler r6 = r1.A05
            if (r6 != 0) goto L_0x0455
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r6 = r1.A0S(r0, r4)
            android.app.job.JobScheduler r6 = (android.app.job.JobScheduler) r6
            r1.A05 = r6
        L_0x0455:
            X.2oU r0 = r5.A01
            android.content.Context r1 = r0.A00
            java.lang.Class<com.whatsapp.service.UnsentMessagesNetworkAvailableJob> r0 = com.whatsapp.service.UnsentMessagesNetworkAvailableJob.class
            android.content.ComponentName r5 = new android.content.ComponentName
            r5.<init>(r1, r0)
            r1 = 6
            android.app.job.JobInfo$Builder r0 = new android.app.job.JobInfo$Builder
            r0.<init>(r1, r5)
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r4)
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r4)
            android.app.job.JobInfo r0 = r0.build()
            r6.schedule(r0)
            goto L_0x037f
        L_0x0477:
            X.5rC r1 = r2.A0A
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x037f
            r1.A04()
            java.lang.String r0 = "isValidVNameRequirementNotFulfilled"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0489:
            int r0 = r2.retryCount
            r11 = 1
            if (r0 <= 0) goto L_0x0374
            r11 = 12
            goto L_0x0374
        L_0x0492:
            if (r3 == 0) goto L_0x04af
            r2.A15 = r4
            r2.A16 = r14
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A04 = r0
            X.2qR r5 = r2.A0F
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r4]
            r0[r14] = r3
            int r8 = X.AnonymousClass36M.A05(r3)
            r10 = r14
            r6 = r0
            r7 = r11
            r9 = r14
            r5.A03(r6, r7, r8, r9, r10)
        L_0x04af:
            X.2qR r0 = r2.A0F
            r0.A00()
            boolean r0 = r2.A15
            if (r0 == 0) goto L_0x001b
            X.36E r1 = r2.A0E
            java.lang.String r0 = r2.id
            int r4 = r0.hashCode()
            byte r3 = r2.messageType
            r2 = 8
            boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x001b
            X.30L r1 = r1.A0O
            r0 = -1
            r1.A05(r4, r2, r0, r3)
            return
        L_0x04cf:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r0 == 0) goto L_0x04e6
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r2 = (com.whatsapp.jobqueue.job.SendDisableLiveLocationJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "disable live location job added"
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x04e6:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r0 == 0) goto L_0x0502
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r2 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "rotate signed pre key job added"
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0502:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.ReceiptProcessingJob
            if (r0 == 0) goto L_0x0519
            com.whatsapp.jobqueue.job.ReceiptProcessingJob r2 = (com.whatsapp.jobqueue.job.ReceiptProcessingJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReceiptProcessingJob/onAdded "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0519:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r0 == 0) goto L_0x0530
            com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r2 = (com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReceiptMultiTargetProcessingJob/onAdded "
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0530:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GetVNameCertificateJob
            if (r0 == 0) goto L_0x057e
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r2 = (com.whatsapp.jobqueue.job.GetVNameCertificateJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetVNameCertificateJob/onAdded"
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            java.util.concurrent.ConcurrentHashMap r3 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r1 = r2.jid
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.put(r1, r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r5 = r0.iterator()
        L_0x0557:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r5.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            if (r0 == 0) goto L_0x0557
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r1 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r1
            boolean r0 = r1.BIR()
            if (r0 != 0) goto L_0x0557
            X.2qR r4 = r2.A00
            r0 = 1
            com.whatsapp.jid.DeviceJid[] r3 = new com.whatsapp.jid.DeviceJid[r0]
            com.whatsapp.jid.DeviceJid r0 = r1.A01
            r1 = 0
            r3[r1] = r0
            r0 = 2
            r4.A04(r3, r0, r1)
            goto L_0x0557
        L_0x057e:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r0 != 0) goto L_0x001b
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r0 == 0) goto L_0x001b
            com.whatsapp.jobqueue.job.BulkGetPreKeyJob r2 = (com.whatsapp.jobqueue.job.BulkGetPreKeyJob) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bulk get pre key job added"
            r1.append(r0)
            java.lang.String r0 = r2.A08()
            X.C18260x0.A1L(r1, r0)
            return
        L_0x05a1:
            X.2qR r3 = r2.A01
            r2 = 0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r2]
            java.lang.Object[] r1 = r4.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r1 = (com.whatsapp.jid.DeviceJid[]) r1
            r0 = 4
            r3.A04(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A04():void");
    }

    public void A02(long j) {
        if (this instanceof SendStatusPrivacyListJob) {
            SendStatusPrivacyListJob sendStatusPrivacyListJob = (SendStatusPrivacyListJob) this;
            sendStatusPrivacyListJob.A01 = j;
            SendStatusPrivacyListJob.A01 = j;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("set persistent id for send status privacy job");
            C18260x0.A1L(A0o, sendStatusPrivacyListJob.A08());
            return;
        }
        this.A01 = j;
    }

    public boolean A03() {
        if (this instanceof SyncDeviceAndResendMessageJob) {
            SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
            for (Requirement requirement : syncDeviceAndResendMessageJob.parameters.requirements) {
                if (!requirement.BIR()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SyncDeviceAndResendMessageJob/isRequirementsMet/req ");
                    A0o.append(requirement);
                    A0o.append(" not present: ");
                    C18260x0.A1K(A0o, syncDeviceAndResendMessageJob.A08());
                    if (requirement instanceof ChatConnectionRequirement) {
                        syncDeviceAndResendMessageJob.A00 = 1;
                        syncDeviceAndResendMessageJob.A0L = true;
                        return false;
                    }
                    syncDeviceAndResendMessageJob.A00 = 2;
                    return false;
                }
            }
            return true;
        } else if (this instanceof SendE2EMessageJob) {
            SendE2EMessageJob sendE2EMessageJob = (SendE2EMessageJob) this;
            if (AnonymousClass001.A1U((sendE2EMessageJob.A0I.A0H() > sendE2EMessageJob.expireTimeMs ? 1 : (sendE2EMessageJob.A0I.A0H() == sendE2EMessageJob.expireTimeMs ? 0 : -1)))) {
                return true;
            }
            for (Requirement requirement2 : sendE2EMessageJob.parameters.requirements) {
                if ((sendE2EMessageJob.A0i == null || (!(requirement2 instanceof AxolotlSessionRequirement) && !(requirement2 instanceof AxolotlDifferentAliceBaseKeyRequirement) && !(requirement2 instanceof AxolotlMultiDeviceSessionRequirement))) && !requirement2.BIR()) {
                    if (!(requirement2 instanceof ChatConnectionRequirement)) {
                        return false;
                    }
                    sendE2EMessageJob.A18 = true;
                    return false;
                } else if (!sendE2EMessageJob.A14 && !sendE2EMessageJob.A16) {
                    if ((requirement2 instanceof AxolotlSessionRequirement) || (requirement2 instanceof AxolotlDifferentAliceBaseKeyRequirement) || (requirement2 instanceof AxolotlMultiDeviceSessionRequirement)) {
                        sendE2EMessageJob.A16 = true;
                        C56612sH r2 = sendE2EMessageJob.A0I;
                        sendE2EMessageJob.A03 = SystemClock.uptimeMillis();
                        sendE2EMessageJob.A02 = r2.A0H();
                    }
                }
            }
            return true;
        } else {
            for (Requirement BIR : this.parameters.requirements) {
                if (!BIR.BIR()) {
                    return false;
                }
            }
            return true;
        }
    }

    public void A05() {
        String str;
        String str2;
        if (this instanceof AnonymousClass47E) {
            Log.w("Fetch2FAEmailStatusJob/canceled");
        } else if (this instanceof AnonymousClass47L) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SendViewReceiptJob/onAdded; ");
            C18260x0.A1M(A0o, ((AnonymousClass47L) this).A08());
        } else if (this instanceof AnonymousClass47o) {
            AnonymousClass47o r2 = (AnonymousClass47o) this;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A1M(A0o2, AnonymousClass47o.A01(r2, "sendNewsletterMessageJob/e2e send job canceled", A0o2));
            r2.A09((C624134x) null);
        } else {
            if (this instanceof C28501gz) {
                if (!((AnonymousClass47C) this).isCancelled) {
                    str2 = "UpdateNewsletterGraphqlJob/onCanceled";
                } else {
                    return;
                }
            } else if (this instanceof C28481gx) {
                Log.i("NewsletterSubscribersGraphqlJob/onCanceled");
                ((C28481gx) this).callback = null;
                return;
            } else if (this instanceof AnonymousClass1gw) {
                Log.i("NewsletterReactionSendersGraphqlJob/onCanceled");
                ((AnonymousClass1gw) this).callback = null;
                return;
            } else if (this instanceof AnonymousClass1h0) {
                AnonymousClass1h0 r1 = (AnonymousClass1h0) this;
                if (!r1.isCancelled) {
                    r1.callback = null;
                    str2 = "BaseMetadataNewsletterGraphqlJob/onCanceled";
                } else {
                    return;
                }
            } else if (this instanceof C28451gt) {
                Log.i("GetNewsletterMyAddOnsMessagesJob/onCanceled");
                return;
            } else if (this instanceof C28461gu) {
                Log.i("GetNewsletterMessagesUpdatesJob/onCanceled");
                return;
            } else if (this instanceof C28471gv) {
                C28471gv r22 = (C28471gv) this;
                Log.i("GetNewsletterMessagesJob/onCanceled");
                C83994Ap r12 = r22.callback;
                if (r12 != null) {
                    r12.Bjl(r22.token);
                    return;
                }
                return;
            } else if (this instanceof C28491gy) {
                Log.i("GetNewsletterGeosuspensionJob/onCanceled");
                return;
            } else if (this instanceof AnonymousClass47G) {
                return;
            } else {
                if (this instanceof AsyncMessageJob) {
                    AsyncMessageJob asyncMessageJob = (AsyncMessageJob) this;
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    StringBuilder A0w = C18290x4.A0w("asyncMessageJob/canceled async message job", A0o3);
                    A0w.append("; rowId=");
                    A0w.append(asyncMessageJob.rowId);
                    A0w.append("; job=");
                    if (asyncMessageJob instanceof ProcessVCardMessageJob) {
                        str = "processVCard";
                    } else {
                        str = "asyncTokenize";
                    }
                    C18260x0.A1M(A0o3, AnonymousClass000.A0X(str, A0w));
                    return;
                } else if (this instanceof SyncdTableEmptyKeyCheckJob) {
                    Log.i("SyncdTableEmptyKeyCheckJob/onCanceled");
                    ((SyncdTableEmptyKeyCheckJob) this).A00.A04(7);
                    return;
                } else if (this instanceof SyncProfilePictureJob) {
                    SyncProfilePictureJob syncProfilePictureJob = (SyncProfilePictureJob) this;
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("SyncProfilePictureJob/onCanceled/cancel sync picture job param=");
                    C18260x0.A1M(A0o4, syncProfilePictureJob.A08());
                    C626936e.A09("jid list is empty", C627336j.A0C(syncProfilePictureJob.jids));
                    return;
                } else if (this instanceof SyncDevicesJob) {
                    SyncDevicesJob syncDevicesJob = (SyncDevicesJob) this;
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    A0o5.append("SyncDevicesJob/onCanceled/cancel sync devices job param=");
                    C18260x0.A1M(A0o5, syncDevicesJob.A08());
                    syncDevicesJob.A01.A00(syncDevicesJob.jids);
                    return;
                } else if (this instanceof SyncDevicesAndSendInvisibleMessageJob) {
                    SyncDevicesAndSendInvisibleMessageJob syncDevicesAndSendInvisibleMessageJob = (SyncDevicesAndSendInvisibleMessageJob) this;
                    StringBuilder A0o6 = AnonymousClass001.A0o();
                    A0o6.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
                    C18260x0.A1M(A0o6, syncDevicesAndSendInvisibleMessageJob.A08());
                    C49422gV r13 = syncDevicesAndSendInvisibleMessageJob.A01;
                    AnonymousClass2z0 r0 = syncDevicesAndSendInvisibleMessageJob.A04;
                    Set set = r13.A02;
                    synchronized (set) {
                        set.remove(r0);
                    }
                    return;
                } else if (this instanceof SyncDeviceForAdvValidationJob) {
                    return;
                } else {
                    if (this instanceof SyncDeviceAndResendMessageJob) {
                        SyncDeviceAndResendMessageJob syncDeviceAndResendMessageJob = (SyncDeviceAndResendMessageJob) this;
                        StringBuilder A0o7 = AnonymousClass001.A0o();
                        A0o7.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
                        C18260x0.A1M(A0o7, syncDeviceAndResendMessageJob.A08());
                        C49422gV r14 = syncDeviceAndResendMessageJob.A05;
                        AnonymousClass2z0 r02 = syncDeviceAndResendMessageJob.A0H;
                        Set set2 = r14.A02;
                        synchronized (set2) {
                            set2.remove(r02);
                        }
                        return;
                    } else if (this instanceof SendStatusPrivacyListJob) {
                        StringBuilder A0o8 = AnonymousClass001.A0o();
                        A0o8.append("canceled send status privacy job");
                        C18260x0.A1M(A0o8, ((SendStatusPrivacyListJob) this).A08());
                        return;
                    } else if (this instanceof SendRetryReceiptJob) {
                        StringBuilder A0o9 = AnonymousClass001.A0o();
                        A0o9.append("canceled sent read receipts job");
                        C18260x0.A1M(A0o9, ((SendRetryReceiptJob) this).A09());
                        return;
                    } else if (this instanceof SendReadReceiptJob) {
                        StringBuilder A0o10 = AnonymousClass001.A0o();
                        A0o10.append("canceled sent read receipts job");
                        C18260x0.A1M(A0o10, ((SendReadReceiptJob) this).A08());
                        return;
                    } else if (this instanceof SendPlayedReceiptJobV2) {
                        StringBuilder A0o11 = AnonymousClass001.A0o();
                        A0o11.append("SendPlayedReceiptJobV2/onCanceled; ");
                        C18260x0.A1M(A0o11, ((SendPlayedReceiptJobV2) this).A08());
                        return;
                    } else if (this instanceof SendPlayedReceiptJob) {
                        StringBuilder A0o12 = AnonymousClass001.A0o();
                        A0o12.append("SendPlayedReceiptJob/canceled send played receipts job; id=");
                        C18260x0.A1M(A0o12, ((SendPlayedReceiptJob) this).messageId);
                        return;
                    } else if (this instanceof SendPermanentFailureReceiptJob) {
                        SendPermanentFailureReceiptJob sendPermanentFailureReceiptJob = (SendPermanentFailureReceiptJob) this;
                        StringBuilder A0o13 = AnonymousClass001.A0o();
                        A0o13.append("canceled send permananent-failure receipt job");
                        StringBuilder A0o14 = AnonymousClass001.A0o();
                        A0o14.append("; jid=");
                        A0o14.append(sendPermanentFailureReceiptJob.jid);
                        A0o14.append("; participant=");
                        A0o14.append(sendPermanentFailureReceiptJob.participant);
                        A0o14.append("; id=");
                        C18260x0.A1M(A0o13, AnonymousClass000.A0X(sendPermanentFailureReceiptJob.messageKeyId, A0o14));
                        return;
                    } else if (this instanceof SendPeerMessageJob) {
                        StringBuilder A0o15 = AnonymousClass001.A0o();
                        A0o15.append("SendPeerMessageJob/onCanceled/cancel send job");
                        StringBuilder A0o16 = AnonymousClass001.A0o();
                        A0o16.append("; peer_msg_row_id=");
                        C18260x0.A1M(A0o15, AnonymousClass001.A0k(A0o16, ((SendPeerMessageJob) this).peerMessageRowId));
                        return;
                    } else if (this instanceof SendOrderStatusUpdateFailureReceiptJob) {
                        SendOrderStatusUpdateFailureReceiptJob sendOrderStatusUpdateFailureReceiptJob = (SendOrderStatusUpdateFailureReceiptJob) this;
                        StringBuilder A0o17 = AnonymousClass001.A0o();
                        StringBuilder A0w2 = C18290x4.A0w("canceled send order-status-update-failure receipt job", A0o17);
                        A0w2.append("; jid=");
                        A0w2.append(sendOrderStatusUpdateFailureReceiptJob.jid);
                        A0w2.append("; id=");
                        C18260x0.A1M(A0o17, AnonymousClass000.A0X(sendOrderStatusUpdateFailureReceiptJob.messageKeyId, A0w2));
                        return;
                    } else if (this instanceof SendMediaErrorReceiptJob) {
                        StringBuilder A0o18 = AnonymousClass001.A0o();
                        A0o18.append("SendMediaErrorReceiptJob/canceled send played receipts job id=");
                        C18260x0.A1M(A0o18, ((SendMediaErrorReceiptJob) this).messageId);
                        return;
                    } else if (this instanceof SendLiveLocationKeyJob) {
                        StringBuilder A0o19 = AnonymousClass001.A0o();
                        A0o19.append("canceled send live location key job");
                        C18260x0.A1M(A0o19, ((SendLiveLocationKeyJob) this).A09());
                        return;
                    } else if (this instanceof SendFinalLiveLocationRetryJob) {
                        StringBuilder A0o20 = AnonymousClass001.A0o();
                        A0o20.append("canceled send final live location retry job");
                        C18260x0.A1M(A0o20, ((SendFinalLiveLocationRetryJob) this).A08());
                        return;
                    } else if (this instanceof SendFinalLiveLocationNotificationJob) {
                        StringBuilder A0o21 = AnonymousClass001.A0o();
                        A0o21.append("canceled send final live location job");
                        C18260x0.A1M(A0o21, ((SendFinalLiveLocationNotificationJob) this).A09());
                        return;
                    } else if (this instanceof SendEngagedReceiptJob) {
                        StringBuilder A0o22 = AnonymousClass001.A0o();
                        A0o22.append("canceled sent engaged receipts job: ");
                        C18260x0.A1M(A0o22, ((SendEngagedReceiptJob) this).A08());
                        return;
                    } else if (this instanceof SendE2EMessageJob) {
                        SendE2EMessageJob sendE2EMessageJob = (SendE2EMessageJob) this;
                        StringBuilder A0o23 = AnonymousClass001.A0o();
                        C18260x0.A1M(A0o23, AnonymousClass0x9.A0x(sendE2EMessageJob, "SendE2EMessageJob/e2e send job canceled", A0o23));
                        SendE2EMessageJob.A19.remove(new C49582gl(sendE2EMessageJob.jid, sendE2EMessageJob.id, sendE2EMessageJob.participant, sendE2EMessageJob.editVersion));
                        AnonymousClass1EU r15 = sendE2EMessageJob.A0q;
                        if ((r15.bitField1_ & 256) != 0) {
                            AnonymousClass1CA r03 = r15.keepInChatMessage_;
                            if (r03 != null || (r03 = AnonymousClass1CA.DEFAULT_INSTANCE) != null) {
                                AnonymousClass1ET r04 = r03.key_;
                                if (r04 == null) {
                                    r04 = AnonymousClass1ET.DEFAULT_INSTANCE;
                                }
                                C95814uZ A0S = C18310x6.A0S(r04.remoteJid_);
                                if (A0S != null) {
                                    sendE2EMessageJob.A0n.A02(sendE2EMessageJob.A0e, AnonymousClass2z0.A05(A0S, sendE2EMessageJob.id, true));
                                    C69263Wi.A0A(sendE2EMessageJob.A0C, sendE2EMessageJob, A0S, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (this instanceof SendDisableLiveLocationJob) {
                        StringBuilder A0o24 = AnonymousClass001.A0o();
                        A0o24.append("canceled disable live location job");
                        C18260x0.A1M(A0o24, ((SendDisableLiveLocationJob) this).A08());
                        return;
                    } else if (this instanceof SendDeleteHistorySyncMmsJob) {
                        StringBuilder A0o25 = AnonymousClass001.A0o();
                        A0o25.append("SendDeleteHistorySyncMmsJob/ cancelled chunkId=");
                        C18260x0.A1M(A0o25, ((SendDeleteHistorySyncMmsJob) this).chunkId);
                        return;
                    } else if (this instanceof RotateSignedPreKeyJob) {
                        StringBuilder A0o26 = AnonymousClass001.A0o();
                        A0o26.append("canceled rotate signed pre key job");
                        C18260x0.A1M(A0o26, ((RotateSignedPreKeyJob) this).A08());
                        return;
                    } else if (this instanceof ReceiptProcessingJob) {
                        StringBuilder A0o27 = AnonymousClass001.A0o();
                        A0o27.append("ReceiptProcessingJob/onCanceled/cancel job param=");
                        C18260x0.A1M(A0o27, ((ReceiptProcessingJob) this).A08());
                        return;
                    } else if (this instanceof ReceiptMultiTargetProcessingJob) {
                        StringBuilder A0o28 = AnonymousClass001.A0o();
                        A0o28.append("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
                        C18260x0.A1M(A0o28, ((ReceiptMultiTargetProcessingJob) this).A08());
                        return;
                    } else if (this instanceof GetVNameCertificateJob) {
                        GetVNameCertificateJob getVNameCertificateJob = (GetVNameCertificateJob) this;
                        StringBuilder A0o29 = AnonymousClass001.A0o();
                        A0o29.append("GetVNameCertificateJob/canceled get vname certificate job");
                        C18260x0.A1M(A0o29, getVNameCertificateJob.A08());
                        GetVNameCertificateJob.A02.remove(getVNameCertificateJob.jid);
                        return;
                    } else if (this instanceof GetStatusPrivacyJob) {
                        StringBuilder A0o30 = AnonymousClass001.A0o();
                        A0o30.append("canceled get status privacy job");
                        StringBuilder A0o31 = AnonymousClass001.A0o();
                        C18270x1.A1I(A0o31, (GetStatusPrivacyJob) this);
                        C18260x0.A1M(A0o30, A0o31.toString());
                        return;
                    } else if (this instanceof GeneratePrivacyTokenJob) {
                        GeneratePrivacyTokenJob generatePrivacyTokenJob = (GeneratePrivacyTokenJob) this;
                        UserJid userJid = generatePrivacyTokenJob.A01;
                        if (userJid != null) {
                            generatePrivacyTokenJob.A03.A01(userJid);
                        }
                        StringBuilder A0o32 = AnonymousClass001.A0o();
                        StringBuilder A0w3 = C18290x4.A0w("canceled generate privacy token job", A0o32);
                        C18270x1.A1I(A0w3, generatePrivacyTokenJob);
                        C18260x0.A1M(A0o32, A0w3.toString());
                        return;
                    } else if (this instanceof DeleteAccountFromHsmServerJob) {
                        StringBuilder A0o33 = AnonymousClass001.A0o();
                        StringBuilder A0w4 = C18290x4.A0w("DeleteAccountFromHsmServerJob/canceled delete account from hsm server job", A0o33);
                        C18270x1.A1I(A0w4, this);
                        C18260x0.A1M(A0o33, A0w4.toString());
                        return;
                    } else if (this instanceof BulkGetPreKeyJob) {
                        StringBuilder A0o34 = AnonymousClass001.A0o();
                        A0o34.append("canceled bulk get pre key job");
                        C18260x0.A1M(A0o34, ((BulkGetPreKeyJob) this).A08());
                        return;
                    } else if (this instanceof AnonymousClass47V) {
                        Log.w("GroupInfoBatchProcessor/FetchTruncatedGroupJob canceled");
                        return;
                    } else if (this instanceof AnonymousClass47H) {
                        AnonymousClass47H r3 = (AnonymousClass47H) this;
                        StringBuilder A0o35 = AnonymousClass001.A0o();
                        StringBuilder A0w5 = C18290x4.A0w("GroupFetchAllMembershipApprovalRequestsJob canceled", A0o35);
                        C18270x1.A1I(A0w5, r3);
                        A0w5.append("; groupJid=");
                        C18260x0.A1M(A0o35, AnonymousClass000.A0X(r3.groupJidRawString, A0w5));
                        return;
                    } else {
                        StringBuilder A0o36 = AnonymousClass001.A0o();
                        A0o36.append("MemberSuggestedGroupsSyncJob/canceled; ");
                        C18260x0.A1M(A0o36, ((AnonymousClass47K) this).A08());
                        return;
                    }
                }
            }
            Log.i(str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0412, code lost:
        if (r1 >= 500) goto L_0x0414;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(java.lang.Exception r16) {
        /*
            r15 = this;
            r4 = r16
            r3 = r15
            boolean r0 = r15 instanceof X.AnonymousClass47E
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "Fetch2FAEmailStatusJob/exception"
            com.whatsapp.util.Log.w(r0, r4)
        L_0x000c:
            r1 = 1
        L_0x000d:
            return r1
        L_0x000e:
            boolean r0 = r15 instanceof X.AnonymousClass47L
            if (r0 != 0) goto L_0x000c
            boolean r0 = r15 instanceof X.AnonymousClass47o
            if (r0 == 0) goto L_0x0043
            X.47o r3 = (X.AnonymousClass47o) r3
            r0 = 0
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r4, r0)
            java.lang.String r0 = "sendNewsletterMessageJob/exception while sending message"
            java.lang.String r0 = X.AnonymousClass47o.A01(r3, r0, r1)
            X.C18260x0.A14(r0, r1, r4)
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.C36771zr
            if (r0 == 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sendNewsletterMessageJob/Cannot send message due to large payload "
            java.lang.String r0 = X.AnonymousClass47o.A01(r3, r0, r1)
            X.C18260x0.A1M(r1, r0)
            r0 = 0
            r3.A09(r0)
        L_0x0041:
            r1 = 0
            return r1
        L_0x0043:
            boolean r0 = r15 instanceof X.C28501gz
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.C28481gx
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.AnonymousClass1gw
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.AnonymousClass1h0
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.C28451gt
            if (r0 != 0) goto L_0x000c
            boolean r0 = r15 instanceof X.C28461gu
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.C28471gv
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof X.C28491gy
            if (r0 != 0) goto L_0x000c
            boolean r0 = r15 instanceof X.AnonymousClass47G
            if (r0 != 0) goto L_0x000c
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r0 == 0) goto L_0x0099
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob r3 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob) r3
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "asyncMessageJob/exception while running async message job"
            java.lang.StringBuilder r2 = X.C18290x4.A0w(r0, r5)
            java.lang.String r0 = "; rowId="
            r2.append(r0)
            long r0 = r3.rowId
            r2.append(r0)
            java.lang.String r0 = "; job="
            r2.append(r0)
            boolean r0 = r3 instanceof com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "processVCard"
        L_0x008d:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            X.C18260x0.A14(r0, r5, r4)
            goto L_0x000c
        L_0x0096:
            java.lang.String r0 = "asyncTokenize"
            goto L_0x008d
        L_0x0099:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r0 == 0) goto L_0x00ab
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r3 = (com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob) r3
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onShouldRetry"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.30l r1 = r3.A00
            r0 = 7
            r1.A04(r0)
            goto L_0x0041
        L_0x00ab:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncProfilePictureJob
            if (r0 == 0) goto L_0x00c3
            com.whatsapp.jobqueue.job.SyncProfilePictureJob r3 = (com.whatsapp.jobqueue.job.SyncProfilePictureJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncProfilePictureJob/onShouldReply/exception while running picture sync param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1M(r1, r0)
            goto L_0x000c
        L_0x00c3:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDevicesJob
            if (r0 == 0) goto L_0x00db
            com.whatsapp.jobqueue.job.SyncDevicesJob r3 = (com.whatsapp.jobqueue.job.SyncDevicesJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDevicesJob/onShouldReply/exception while running devices sync param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1M(r1, r0)
            goto L_0x000c
        L_0x00db:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r0 == 0) goto L_0x00f8
            com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r3 = (com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            r1.append(r0)
            java.lang.String r0 = " ;exception="
            X.C18260x0.A1S(r1, r0, r4)
            goto L_0x000c
        L_0x00f8:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r0 != 0) goto L_0x0041
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob
            if (r0 == 0) goto L_0x0119
            com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob r3 = (com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onShouldReply/param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            r1.append(r0)
            java.lang.String r0 = " ;exception="
            X.C18260x0.A1S(r1, r0, r4)
            goto L_0x000c
        L_0x0119:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r0 == 0) goto L_0x0131
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r3 = (com.whatsapp.jobqueue.job.SendStatusPrivacyListJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send status privacy job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0131:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendRetryReceiptJob
            if (r0 == 0) goto L_0x0149
            com.whatsapp.jobqueue.job.SendRetryReceiptJob r3 = (com.whatsapp.jobqueue.job.SendRetryReceiptJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running sent persistent retry job"
            r1.append(r0)
            java.lang.String r0 = r3.A09()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0149:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendReadReceiptJob
            if (r0 == 0) goto L_0x0161
            com.whatsapp.jobqueue.job.SendReadReceiptJob r3 = (com.whatsapp.jobqueue.job.SendReadReceiptJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running sent read receipts job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0161:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            if (r0 == 0) goto L_0x017d
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r3 = (com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendPlayedReceiptJobV2/exception; "
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.d(r0, r4)
            goto L_0x000c
        L_0x017d:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJob
            if (r0 == 0) goto L_0x0193
            com.whatsapp.jobqueue.job.SendPlayedReceiptJob r3 = (com.whatsapp.jobqueue.job.SendPlayedReceiptJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendPlayedReceiptJob/exception while running sent played receipt job; id="
            r1.append(r0)
            java.lang.String r0 = r3.messageId
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0193:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob
            if (r0 == 0) goto L_0x01ca
            com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob r3 = (com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send permanent failure receipt job"
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "; jid="
            r1.append(r0)
            java.lang.String r0 = r3.jid
            r1.append(r0)
            java.lang.String r0 = "; participant="
            r1.append(r0)
            java.lang.String r0 = r3.participant
            r1.append(r0)
            java.lang.String r0 = "; id="
            r1.append(r0)
            java.lang.String r0 = r3.messageKeyId
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C18260x0.A14(r0, r2, r4)
            goto L_0x000c
        L_0x01ca:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendPeerMessageJob
            if (r0 == 0) goto L_0x01ed
            com.whatsapp.jobqueue.job.SendPeerMessageJob r3 = (com.whatsapp.jobqueue.job.SendPeerMessageJob) r3
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendPeerMessageJob/onShouldReply/exception while running"
            r5.append(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "; peer_msg_row_id="
            r2.append(r0)
            long r0 = r3.peerMessageRowId
            java.lang.String r0 = X.AnonymousClass001.A0k(r2, r0)
            X.C18260x0.A14(r0, r5, r4)
            goto L_0x000c
        L_0x01ed:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob
            if (r0 == 0) goto L_0x0217
            com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob r3 = (com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send order status update failure receipt job"
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r0, r2)
            java.lang.String r0 = "; jid="
            r1.append(r0)
            java.lang.String r0 = r3.jid
            r1.append(r0)
            java.lang.String r0 = "; id="
            r1.append(r0)
            java.lang.String r0 = r3.messageKeyId
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C18260x0.A14(r0, r2, r4)
            goto L_0x000c
        L_0x0217:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob
            if (r0 == 0) goto L_0x022d
            com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob r3 = (com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendMediaErrorReceiptJob/exception while running sent played receipt job id="
            r1.append(r0)
            java.lang.String r0 = r3.messageId
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x022d:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendLiveLocationKeyJob
            if (r0 == 0) goto L_0x0245
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r3 = (com.whatsapp.jobqueue.job.SendLiveLocationKeyJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send live location key job"
            r1.append(r0)
            java.lang.String r0 = r3.A09()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0245:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r0 == 0) goto L_0x025d
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r3 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send final live location retry job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x025d:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r0 == 0) goto L_0x0275
            com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r3 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running send final live location job"
            r1.append(r0)
            java.lang.String r0 = r3.A09()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0275:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r0 == 0) goto L_0x028d
            com.whatsapp.jobqueue.job.SendEngagedReceiptJob r3 = (com.whatsapp.jobqueue.job.SendEngagedReceiptJob) r3
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r4)
            java.lang.String r0 = "exception while running sent engaged receipts job: "
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x028d:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendE2EMessageJob
            if (r0 == 0) goto L_0x0348
            com.whatsapp.jobqueue.job.SendE2EMessageJob r3 = (com.whatsapp.jobqueue.job.SendE2EMessageJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/exception while sending e2e message"
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r3, r0, r1)
            X.C18260x0.A14(r0, r1, r4)
            boolean r0 = r4 instanceof com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r8 = 0
            if (r0 == 0) goto L_0x030a
            X.36E r2 = r3.A0E
            java.lang.String r0 = r3.id
            int r1 = r0.hashCode()
            r0 = 7
            r2.A0C(r1, r0)
            r2 = r4
            com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r2 = (com.whatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException) r2
            int r0 = r2.encryptionRetryCount
            r5 = 3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r0 <= r5) goto L_0x0487
            java.lang.String r0 = "SendE2EMessageJob/encryption failure limit reached for "
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r2.jid
            X.C18260x0.A0n(r0, r1)
            X.36E r1 = r3.A0E
            java.lang.String r0 = r3.id
            int r4 = r0.hashCode()
            boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x02e4
            X.30L r2 = r1.A0O
            X.2WZ r1 = r2.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0484 }
            boolean r0 = X.AnonymousClass0x7.A1V(r0, r4)     // Catch:{ all -> 0x0484 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x02e4
            r2.A06(r4, r5)
        L_0x02e4:
            X.36E r1 = r3.A0E
            X.34x r2 = r3.A0r
            int r5 = r2.A1d
            X.34x r0 = r3.A0r
            int r6 = r0.A0B
            X.2cY r0 = r3.A0h
            java.util.Collection r0 = r0.A00()
            int r7 = r0.size()
            boolean r13 = r3.A0D()
            boolean r14 = r3.A18
            r4 = 12
            r3 = 0
            r10 = r8
            r11 = r8
            r12 = r8
            r9 = r8
            r1.A0N(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0041
        L_0x030a:
            boolean r0 = r4 instanceof com.whatsapp.jobqueue.job.SendE2EMessageJob.OutOfMemoryException
            if (r0 == 0) goto L_0x0324
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/Cannot send message due to oom "
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r3, r0, r1)
            X.C18260x0.A1K(r1, r0)
            com.whatsapp.jobqueue.job.SendE2EMessageJob$OutOfMemoryException r4 = (com.whatsapp.jobqueue.job.SendE2EMessageJob.OutOfMemoryException) r4
            int r0 = r4.messageDistributionType
            r3.A09(r0, r8)
            goto L_0x0041
        L_0x0324:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.C36771zr
            if (r0 == 0) goto L_0x049e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendE2EMessageJob/Cannot send message due to large payload "
            java.lang.String r0 = X.AnonymousClass0x9.A0x(r3, r0, r1)
            X.C18260x0.A1K(r1, r0)
            java.lang.Throwable r0 = r4.getCause()
            X.1zr r0 = (X.C36771zr) r0
            int r1 = r3.A00
            int r0 = r0.excessPayloadByteSize
            r3.A09(r1, r0)
            goto L_0x0041
        L_0x0348:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r0 == 0) goto L_0x0360
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r3 = (com.whatsapp.jobqueue.job.SendDisableLiveLocationJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running disable live location job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0360:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r0 == 0) goto L_0x0376
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r3 = (com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SendDeleteHistorySyncMmsJob/ exception while running job chunkId="
            r1.append(r0)
            java.lang.String r0 = r3.chunkId
            X.C18260x0.A1M(r1, r0)
            goto L_0x000c
        L_0x0376:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r0 == 0) goto L_0x038e
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r3 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running rotate signed pre key job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x038e:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.ReceiptProcessingJob
            if (r0 == 0) goto L_0x03a6
            com.whatsapp.jobqueue.job.ReceiptProcessingJob r3 = (com.whatsapp.jobqueue.job.ReceiptProcessingJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReceiptProcessingJob/onShouldRetry/exception while running param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1M(r1, r0)
            goto L_0x000c
        L_0x03a6:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r0 == 0) goto L_0x03be
            com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r3 = (com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReceiptMultiTargetProcessingJob/onShouldRetry/exception while running param="
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A1M(r1, r0)
            goto L_0x000c
        L_0x03be:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GetVNameCertificateJob
            if (r0 == 0) goto L_0x03d6
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r3 = (com.whatsapp.jobqueue.job.GetVNameCertificateJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GetVNameCertificateJob/onShouldRetry, exception while running get vname certificate job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x03d6:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r0 == 0) goto L_0x03f5
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r3 = (com.whatsapp.jobqueue.job.GetStatusPrivacyJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running get status privacy job"
            r1.append(r0)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18270x1.A1I(r0, r3)
            java.lang.String r0 = r0.toString()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x03f5:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            if (r0 == 0) goto L_0x043b
            java.lang.Throwable r1 = r4.getCause()
            boolean r0 = r1 instanceof X.AnonymousClass24F
            if (r0 == 0) goto L_0x0414
            X.24F r1 = (X.AnonymousClass24F) r1
            X.36K r0 = r1.node
            if (r0 == 0) goto L_0x0414
            int r1 = X.C57492tj.A01(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 < r0) goto L_0x0414
            r0 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            if (r1 < r0) goto L_0x0415
        L_0x0414:
            r2 = 1
        L_0x0415:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running generate privacy token job, "
            r1.append(r0)
            if (r2 == 0) goto L_0x0437
            java.lang.String r0 = ""
        L_0x0422:
            r1.append(r0)
            java.lang.String r0 = "retrying"
            java.lang.StringBuilder r0 = X.C18290x4.A0w(r0, r1)
            X.C18270x1.A1I(r0, r15)
            java.lang.String r0 = r0.toString()
            X.C18260x0.A14(r0, r1, r4)
            return r2
        L_0x0437:
            java.lang.String r0 = "not "
            goto L_0x0422
        L_0x043b:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r0 == 0) goto L_0x0455
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DeleteAccountFromHsmServerJob/exception while running delete account from hsm server job"
            java.lang.StringBuilder r0 = X.C18290x4.A0w(r0, r1)
            X.C18270x1.A1I(r0, r15)
            java.lang.String r0 = r0.toString()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x0455:
            boolean r0 = r15 instanceof com.whatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r0 == 0) goto L_0x046d
            com.whatsapp.jobqueue.job.BulkGetPreKeyJob r3 = (com.whatsapp.jobqueue.job.BulkGetPreKeyJob) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "exception while running bulk get pre key job"
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            goto L_0x000c
        L_0x046d:
            boolean r0 = r15 instanceof X.AnonymousClass47V
            if (r0 == 0) goto L_0x04a3
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            boolean r0 = r4 instanceof X.AnonymousClass24O
            if (r0 != 0) goto L_0x000c
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass24O
            r1 = 0
            if (r0 == 0) goto L_0x000d
            goto L_0x000c
        L_0x0484:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0487:
            java.lang.String r0 = "SendE2EMessageJob/retrying job due to encryption failure for "
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r2.jid
            r1.append(r0)
            java.lang.String r0 = "; encRetryCount "
            r1.append(r0)
            int r0 = r2.encryptionRetryCount
            r1.append(r0)
            X.AnonymousClass0x2.A19(r1)
        L_0x049e:
            boolean r0 = r4 instanceof com.whatsapp.jobqueue.job.E2eMessageEncryptor$UnrecoverableErrorException
            r1 = r0 ^ 1
            return r1
        L_0x04a3:
            boolean r0 = r15 instanceof X.AnonymousClass47H
            if (r0 == 0) goto L_0x04f7
            X.47H r3 = (X.AnonymousClass47H) r3
            r2 = 0
            if (r16 == 0) goto L_0x04f5
            java.lang.Throwable r1 = r4.getCause()
        L_0x04b0:
            boolean r0 = r1 instanceof X.AnonymousClass24F
            if (r0 == 0) goto L_0x04b8
            X.24F r1 = (X.AnonymousClass24F) r1
            X.36K r2 = r1.node
        L_0x04b8:
            r5 = 1
            if (r2 == 0) goto L_0x04c8
            int r1 = X.C57492tj.A01(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x04c8
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x04c8
            r5 = 0
        L_0x04c8:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupFetchAllMembershipApprovalRequestsJob/ exception while running iq call "
            r2.append(r0)
            if (r5 == 0) goto L_0x04f1
            java.lang.String r0 = ""
        L_0x04d5:
            r2.append(r0)
            java.lang.String r0 = "retrying"
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r0, r2)
            X.C18270x1.A1I(r1, r3)
            java.lang.String r0 = "; groupJid="
            r1.append(r0)
            java.lang.String r0 = r3.groupJidRawString
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C18260x0.A14(r0, r2, r4)
            return r5
        L_0x04f1:
            java.lang.String r0 = "not "
            goto L_0x04d5
        L_0x04f5:
            r1 = r2
            goto L_0x04b0
        L_0x04f7:
            X.47K r3 = (X.AnonymousClass47K) r3
            r2 = 0
            if (r16 == 0) goto L_0x0539
            java.lang.Throwable r1 = r4.getCause()
        L_0x0500:
            boolean r0 = r1 instanceof X.AnonymousClass24F
            if (r0 == 0) goto L_0x0507
            r2 = r1
            X.24F r2 = (X.AnonymousClass24F) r2
        L_0x0507:
            r5 = 1
            if (r2 == 0) goto L_0x051a
            X.36K r0 = r2.node
            if (r0 == 0) goto L_0x051a
            int r1 = X.C57492tj.A01(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x0535
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x0535
        L_0x051a:
            java.lang.String r2 = ""
        L_0x051c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MemberSuggestedGroupsSyncJob/exception while running iq call,"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " retrying; "
            r1.append(r0)
            java.lang.String r0 = r3.A08()
            X.C18260x0.A14(r0, r1, r4)
            return r5
        L_0x0535:
            r5 = 0
            java.lang.String r2 = " not"
            goto L_0x051c
        L_0x0539:
            r1 = r2
            goto L_0x0500
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A06(java.lang.Exception):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:356:0x07b9, code lost:
        r2 = X.AnonymousClass0x9.A06();
        r13 = java.lang.Long.valueOf(r0);
        r2.put("message_row_id", r13);
        X.AnonymousClass0x2.A0n(r2, r6, "sender_jid");
        r2.put("chat_jid", X.C627336j.A07(r5));
        r2.put("vcard", r3);
        r17 = r4.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        r16 = r17.Axl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r11 = ((X.AnonymousClass3H0) r17).A03;
        r2 = r11.A08("messages_vcards", "insertIntoLegacyTables/INSERT_MESSAGES_VCARDS", r2);
        r15 = r10.A06.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x07fd, code lost:
        if (r15.hasNext() == false) goto L_0x082b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x07ff, code lost:
        r14 = (X.AnonymousClass7OD) r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0807, code lost:
        if (r14.A01 == null) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0809, code lost:
        r10 = X.AnonymousClass0x9.A06();
        r10.put("message_row_id", r13);
        X.C18270x1.A0c(r10, "vcard_row_id", r2);
        r10.put("vcard_jid", X.C627336j.A07(r14.A01));
        r11.A08("messages_vcards_jids", "insertIntoLegacyTables/INSERT_MESSAGES_VCARDS_JIDS", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x082b, code lost:
        r16.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x083b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0840, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0845, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x084e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x08ab, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x08b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a1f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("SyncDevicesJob/onRun/error, param=");
        X.C18260x0.A1K(r2, r0.A08());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0a31, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0a32, code lost:
        r0.A01.A00(r0.jids);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0a39, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0ac4, code lost:
        if (r0.A00.A0A() != false) goto L_0x0ac6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:881:0x17f7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x17f8, code lost:
        com.whatsapp.jobqueue.job.GetVNameCertificateJob.A02.remove(r0.jid);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x17ff, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:0x1800, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:400:0x0864, B:404:0x0886] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:488:0x09c6, B:502:0x0a20, B:877:0x17c0] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r29 = this;
            r0 = r29
            boolean r1 = r0 instanceof X.AnonymousClass47E
            if (r1 == 0) goto L_0x0087
            X.47E r0 = (X.AnonymousClass47E) r0
            java.lang.String r1 = "Fetch2FAEmailStatusJob/onRun: asking for 2FA status"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2P5 r4 = r0.A01
            X.31C r6 = r4.A01
            java.lang.String r9 = r6.A03()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "TwoFactorXmppMethods/sendGetTwoFactorAuth; iq="
            X.C18260x0.A0s(r1, r9, r2)
            X.6bK r3 = new X.6bK
            r3.<init>()
            r1 = 18
            X.4KT r7 = new X.4KT
            r7.<init>(r3, r1, r4)
            r10 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = "2fa"
            X.36K r5 = X.AnonymousClass36K.A0H(r1)
            X.39V[] r4 = X.AnonymousClass0x9.A1W()
            X.39V r2 = X.AnonymousClass39V.A00()
            r1 = 0
            r4[r1] = r2
            java.lang.String r1 = "id"
            X.AnonymousClass39V.A05(r1, r9, r4)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass39V.A06(r2, r1, r4)
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.36K r8 = X.AnonymousClass36K.A0E(r5, r2, r1, r4)
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0K(r7, r8, r9, r10, r11)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x007a }
            r3.get(r11, r1)     // Catch:{ Exception -> 0x007a }
            X.30e r0 = r0.A00
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "two_factor_auth_email_set"
            int r0 = X.C18280x3.A02(r1, r0)
            if (r0 != 0) goto L_0x1ad9
            java.lang.String r0 = "Fetch2FAEmailStatusJob/onRun: email status fetching failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r1 = "Failing Fetch2FAEmailStatusJob, fetching status failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x007a:
            java.lang.String r0 = "Fetch2FAEmailStatusJob/onRun: timeout waiting for response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "Failing Fetch2FAEmailStatusJob, timeout for response"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0087:
            boolean r1 = r0 instanceof X.AnonymousClass47L
            if (r1 == 0) goto L_0x018d
            X.47L r0 = (X.AnonymousClass47L) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendViewReceiptJob/onRun; "
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1J(r2, r1)
            X.5Yx r2 = X.C95804uY.A03
            java.lang.String r1 = r0.newsletterRawJid
            X.4uY r7 = r2.A01(r1)
            if (r7 == 0) goto L_0x1ad9
            java.util.List r1 = r0.serverMessageIds
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r1.iterator()
        L_0x00b1:
            boolean r1 = r11.hasNext()
            r6 = 16
            java.lang.String r16 = "newsletterMessageStore"
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r10 = r11.next()
            long r1 = X.C18310x6.A0B(r10)
            X.2rZ r3 = r0.A03
            if (r3 != 0) goto L_0x00cd
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x00cd:
            X.34x r5 = r3.A00(r7, r1)
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b1
            int r1 = r5.A0D
            if (r1 == r6) goto L_0x00b1
            r4.add(r10)
            goto L_0x00b1
        L_0x00e1:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x1ad9
            X.2i8 r3 = X.C50412i8.A00(r7)
            java.lang.String r11 = "receipt"
            r3.A05 = r11
            java.lang.String r2 = "view"
            r3.A08 = r2
            java.lang.String r1 = r0.receiptStanzaId
            r3.A07 = r1
            X.39T r8 = r3.A01()
            java.lang.String r1 = r0.receiptStanzaId
            r5 = 0
            r19 = r5
            r22 = r5
            r18 = r5
            r20 = r1
            r21 = r2
            r17 = r7
            X.39V[] r10 = X.AnonymousClass36Z.A08(r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r14 = X.C18300x5.A0t(r10)
            java.util.Iterator r15 = r4.iterator()
        L_0x0118:
            boolean r1 = r15.hasNext()
            r13 = 0
            if (r1 == 0) goto L_0x0137
            long r1 = X.C18270x1.A02(r15)
            X.39V[] r12 = X.AnonymousClass0x9.A1V()
            java.lang.String r9 = "server_id"
            X.39V r3 = new X.39V
            r3.<init>((java.lang.String) r9, (long) r1)
            r12[r13] = r3
            java.lang.String r1 = "item"
            X.AnonymousClass36K.A0R(r1, r14, r12)
            goto L_0x0118
        L_0x0137:
            X.36K[] r2 = X.C18280x3.A1a(r14, r13)
            java.lang.String r1 = "list"
            X.36K r1 = X.AnonymousClass36K.A0J(r1, r5, r2)
            X.36K r3 = X.AnonymousClass36K.A0F(r1, r11, r10)
            X.31C r2 = r0.A02
            if (r2 != 0) goto L_0x0150
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0150:
            r1 = 407(0x197, float:5.7E-43)
            java.util.concurrent.Future r1 = r2.A07(r3, r8, r1)
            r1.get()
            java.util.Iterator r4 = r4.iterator()
        L_0x015d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0187
            long r2 = X.C18270x1.A02(r4)
            X.2rZ r1 = r0.A03
            if (r1 != 0) goto L_0x0170
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r16)
            throw r0
        L_0x0170:
            X.34x r1 = r1.A00(r7, r2)
            if (r1 == 0) goto L_0x015d
            X.300 r2 = r0.A00
            if (r2 != 0) goto L_0x0181
            java.lang.String r0 = "messageStatusStoreBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0181:
            X.2z0 r1 = r1.A1J
            r2.A01(r5, r1, r6)
            goto L_0x015d
        L_0x0187:
            java.lang.String r0 = "SendViewReceiptJob/onRun done"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x018d:
            boolean r1 = r0 instanceof X.C28501gz
            if (r1 == 0) goto L_0x0281
            X.1gz r0 = (X.C28501gz) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.String r1 = "UpdateNewsletterGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterMetadataInput r5 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterMetadataInput
            r5.<init>()
            boolean r1 = r0.updateDescription
            java.lang.String r6 = ""
            r4 = 0
            if (r1 == 0) goto L_0x01b8
            java.lang.String r2 = r0.description
            if (r2 == 0) goto L_0x01b2
            int r1 = r2.length()
            if (r1 != 0) goto L_0x01b3
        L_0x01b2:
            r2 = r6
        L_0x01b3:
            java.lang.String r1 = "description"
            r5.A06(r1, r2)
        L_0x01b8:
            boolean r1 = r0.updateName
            r3 = 0
            if (r1 == 0) goto L_0x01ce
            java.lang.String r2 = r0.name
            if (r2 == 0) goto L_0x01c8
            int r1 = r2.length()
            if (r1 == 0) goto L_0x01c8
            r3 = r2
        L_0x01c8:
            java.lang.String r1 = "name"
            r5.A06(r1, r3)
        L_0x01ce:
            boolean r1 = r0.updatePicture
            if (r1 == 0) goto L_0x01e3
            byte[] r2 = r0.picture
            if (r2 == 0) goto L_0x01fc
            int r1 = r2.length
            if (r1 == 0) goto L_0x01fc
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r4)
            java.lang.String r1 = "picture"
            r5.A06(r1, r2)
        L_0x01e3:
            boolean r1 = r0.updateReactionSetting
            if (r1 == 0) goto L_0x022b
            X.21r r2 = r0.newsletterReactionSettings
            if (r2 == 0) goto L_0x022b
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionCodesInput r3 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionCodesInput
            r3.<init>()
            X.7r8 r1 = r0.A06
            if (r1 != 0) goto L_0x0203
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01fc:
            java.lang.String r1 = "picture"
            r5.A06(r1, r6)
            goto L_0x01e3
        L_0x0203:
            int r2 = r2.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x0279
            if (r2 == r4) goto L_0x0276
            r1 = 2
            if (r2 == r1) goto L_0x0273
            r1 = 3
            if (r2 != r1) goto L_0x027c
            java.lang.String r2 = "BLOCKLIST"
        L_0x0214:
            java.lang.String r1 = "value"
            r3.A06(r1, r2)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSettingsInput r2 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSettingsInput
            r2.<init>()
            java.lang.String r1 = "reaction_codes"
            r2.A05(r3, r1)
            java.lang.String r1 = "settings"
            r5.A05(r2, r1)
        L_0x022b:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateMutationImpl$Builder r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateMutationImpl$Builder
            r3.<init>()
            X.4uY r1 = r0.newsletterJid
            java.lang.String r2 = r1.getRawString()
            X.2ie r4 = r3.A00
            java.lang.String r1 = "newsletter_id"
            r4.A02(r1, r2)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r3.A01 = r1
            java.lang.String r1 = "updates"
            r4.A00(r5, r1)
            r1 = 1
            r3.A02 = r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r1 = "fetch_state"
            r4.A01(r1, r2)
            boolean r1 = r3.A01
            X.C162187rP.A06(r1)
            boolean r1 = r3.A02
            X.C162187rP.A06(r1)
            java.lang.String r3 = "NewsletterMetadataUpdate"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl.class
            X.7J9 r2 = new X.7J9
            r2.<init>(r4, r1, r3)
            X.2gi r1 = r0.A04
            if (r1 != 0) goto L_0x0688
            java.lang.String r0 = "mexGraphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0273:
            java.lang.String r2 = "NONE"
            goto L_0x0214
        L_0x0276:
            java.lang.String r2 = "BASIC"
            goto L_0x0214
        L_0x0279:
            java.lang.String r2 = "ALL"
            goto L_0x0214
        L_0x027c:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0281:
            boolean r1 = r0 instanceof X.C28481gx
            if (r1 == 0) goto L_0x02e3
            X.1gx r0 = (X.C28481gx) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.String r1 = "NewsletterSubscribersGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSubscribersInput r5 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterSubscribersInput
            r5.<init>()
            X.4uY r1 = r0.newsletterJid
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "newsletter_id"
            r5.A06(r1, r2)
            X.21d r3 = r0.typeOfFetch
            X.21d r2 = X.C371521d.SHORT
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r3 != r2) goto L_0x02ab
            r1 = 10
        L_0x02ab:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "count"
            X.6L0 r1 = r5.A00()
            r1.A05(r2, r3)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersQueryImpl$Builder r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersQueryImpl$Builder
            r1.<init>()
            X.2ie r4 = r1.A00
            java.lang.String r1 = "input"
            r4.A00(r5, r1)
            java.lang.String r3 = "NewsletterSubscribers"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.class
            X.7J9 r2 = new X.7J9
            r2.<init>(r4, r1, r3)
            X.2gi r1 = r0.A02
            if (r1 != 0) goto L_0x02d8
            java.lang.String r0 = "graphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02d8:
            X.2fG r2 = r1.A01(r2)
            X.42j r1 = new X.42j
            r1.<init>(r0)
            goto L_0x0691
        L_0x02e3:
            boolean r1 = r0 instanceof X.AnonymousClass1gw
            if (r1 == 0) goto L_0x0335
            X.1gw r0 = (X.AnonymousClass1gw) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.String r1 = "NewsletterReactionSendersGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionSenderListInput r3 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterReactionSenderListInput
            r3.<init>()
            X.4uY r1 = r0.newsletterJid
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "id"
            r3.A06(r1, r2)
            java.lang.String r2 = r0.messageSortId
            java.lang.String r1 = "server_id"
            r3.A06(r1, r2)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListQueryImpl$Builder r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListQueryImpl$Builder
            r1.<init>()
            X.2ie r4 = r1.A00
            java.lang.String r1 = "input"
            r4.A00(r3, r1)
            java.lang.String r3 = "NewsletterReactionSendersList"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterReactionSendersListResponseImpl.class
            X.7J9 r2 = new X.7J9
            r2.<init>(r4, r1, r3)
            X.2gi r1 = r0.A00
            if (r1 != 0) goto L_0x032a
            java.lang.String r0 = "graphqlClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x032a:
            X.2fG r2 = r1.A01(r2)
            X.42i r1 = new X.42i
            r1.<init>(r0)
            goto L_0x0691
        L_0x0335:
            boolean r1 = r0 instanceof X.AnonymousClass1h0
            if (r1 == 0) goto L_0x03e7
            X.1h0 r0 = (X.AnonymousClass1h0) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.String r1 = "BaseMetadataNewsletterGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput r5 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput
            r5.<init>()
            X.4uY r1 = r0.newsletterJid
            if (r1 != 0) goto L_0x039a
            java.lang.String r2 = r0.newsletterHandle
            X.C626936e.A06(r2)
            java.lang.String r1 = "key"
            r5.A06(r1, r2)
            X.2sL r1 = r0.A01
            if (r1 == 0) goto L_0x03d0
            X.C162457s7.A0H(r2)
            X.1RL r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x0369
            X.21q r1 = r1.A07
            X.C384727r.A00(r1, r5)
        L_0x0369:
            X.7r8 r2 = r0.A05
            if (r2 == 0) goto L_0x03c8
            X.7hZ r1 = r0.metadataRequestFields
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r2 = r2.A0C(r5, r1)
        L_0x0373:
            boolean r1 = r2.A01
            X.C162187rP.A06(r1)
            java.lang.String r4 = "NewsletterMetadata"
            X.2ie r2 = r2.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.class
            X.7J9 r3 = new X.7J9
            r3.<init>(r2, r1, r4)
            java.lang.String r2 = r0.handlerType
            java.lang.String r1 = "type"
            r5.A06(r1, r2)
            X.2gi r1 = r0.A02
            if (r1 == 0) goto L_0x03c1
            X.2fG r2 = r1.A01(r3)
            X.42h r1 = new X.42h
            r1.<init>(r0)
            goto L_0x0691
        L_0x039a:
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "key"
            r5.A06(r1, r2)
            X.2ss r2 = r0.A00
            if (r2 == 0) goto L_0x03e0
            X.4uY r1 = r0.newsletterJid
            X.31A r3 = X.C56982ss.A00(r2, r1)
            X.1RL r3 = (X.AnonymousClass1RL) r3
            if (r3 == 0) goto L_0x03b6
            X.21q r1 = r3.A07
            X.C384727r.A00(r1, r5)
        L_0x03b6:
            X.7r8 r2 = r0.A05
            if (r2 == 0) goto L_0x03d8
            X.7hZ r1 = r0.metadataRequestFields
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r2 = r2.A0B(r3, r5, r1)
            goto L_0x0373
        L_0x03c1:
            java.lang.String r0 = "graphqlIqClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03c8:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03d0:
            java.lang.String r0 = "newsletterStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03d8:
            java.lang.String r0 = "newsletterGraphqlUtil"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03e0:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03e7:
            boolean r1 = r0 instanceof X.C28451gt
            if (r1 == 0) goto L_0x0447
            X.1gt r0 = (X.C28451gt) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GetNewsletterMyAddOnsMessagesJob/onRun "
            r3.append(r1)
            X.4uY r1 = r0.newsletterJid
            r3.append(r1)
            r1 = 32
            r3.append(r1)
            long r1 = r0.count
            X.C18260x0.A1I(r3, r1)
            X.31C r1 = r0.A02
            java.lang.String r5 = "messageClient"
            if (r1 != 0) goto L_0x0414
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0414:
            java.lang.String r9 = r1.A03()
            long r1 = r0.count
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            X.4uY r3 = r0.newsletterJid
            r2 = 24
            X.1wm r1 = new X.1wm
            r1.<init>((java.lang.String) r9, (int) r2)
            X.1wk r2 = new X.1wk
            r2.<init>((X.C35381wm) r1)
            X.1xJ r1 = new X.1xJ
            r1.<init>((X.C95804uY) r3, (X.C35361wk) r2, (java.lang.Long) r4)
            X.31C r6 = r0.A02
            if (r6 != 0) goto L_0x043a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x043a:
            r10 = 368(0x170, float:5.16E-43)
            X.36K r8 = X.C41032Ir.A05(r1)
            X.4KT r7 = new X.4KT
            r7.<init>((X.C28451gt) r0, (X.C35711xJ) r1)
            goto L_0x05ed
        L_0x0447:
            boolean r1 = r0 instanceof X.C28461gu
            if (r1 == 0) goto L_0x04f5
            X.1gu r0 = (X.C28461gu) r0
            java.lang.Long r7 = r0.beforeServerId
            java.lang.String r9 = "crashLogs"
            r8 = 0
            r2 = 0
            if (r7 == 0) goto L_0x046c
            long r5 = r7.longValue()
            r3 = 0
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x046c
            X.2qk r1 = r0.A00
            if (r1 != 0) goto L_0x0468
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x0468:
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid params - beforeServerId"
            goto L_0x04f1
        L_0x046c:
            long r3 = r0.count
            r5 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x04e6
            r5 = 300(0x12c, double:1.48E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x04e6
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x1ad9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GetNewsletterMessagesUpdatesJob/onRun "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = ", "
            X.C18310x6.A1Q(r2, r1, r7)
            java.lang.Long r1 = r0.afterServerId
            X.C18260x0.A0o(r1, r2)
            X.31C r1 = r0.A02
            java.lang.String r7 = "messageClient"
            if (r1 != 0) goto L_0x049f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x049f:
            java.lang.String r9 = r1.A03()
            long r1 = r0.count
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            long r1 = r0.sinceMs
            long r1 = X.C18290x4.A0B(r1)
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            X.4uY r3 = r0.newsletterJid
            r2 = 24
            X.1wm r1 = new X.1wm
            r1.<init>((java.lang.String) r9, (int) r2)
            X.1wm r4 = new X.1wm
            r4.<init>((X.C95804uY) r3, (X.C35381wm) r1)
            java.lang.Long r3 = r0.beforeServerId
            if (r3 == 0) goto L_0x04d9
            r1 = 1
        L_0x04c6:
            X.1wp r2 = new X.1wp
            r2.<init>(r3, r1)
            X.1xK r1 = new X.1xK
            r1.<init>((X.C35381wm) r4, (X.C35411wp) r2, (java.lang.Long) r6, (java.lang.Long) r5)
            X.31C r6 = r0.A02
            if (r6 != 0) goto L_0x05e2
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x04d9:
            java.lang.Long r3 = r0.afterServerId
            if (r3 == 0) goto L_0x04df
            r1 = 0
            goto L_0x04c6
        L_0x04df:
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid before/after one of them must be set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x04e6:
            X.2qk r1 = r0.A00
            if (r1 != 0) goto L_0x04ef
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r9)
            throw r0
        L_0x04ef:
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid params - count"
        L_0x04f1:
            r1.A0A(r0, r8, r2)
            return
        L_0x04f5:
            boolean r1 = r0 instanceof X.C28471gv
            if (r1 == 0) goto L_0x0605
            X.1gv r0 = (X.C28471gv) r0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GetNewsletterMessagesJob/onRun "
            r3.append(r1)
            long r1 = r0.count
            r3.append(r1)
            java.lang.String r2 = ", "
            r3.append(r2)
            java.lang.Long r1 = r0.beforeServerId
            r3.append(r1)
            r3.append(r2)
            java.lang.Long r1 = r0.afterServerId
            X.C18260x0.A0o(r1, r3)
            java.lang.Long r1 = r0.beforeServerId
            java.lang.String r7 = "crashLogs"
            r4 = 0
            r8 = 0
            if (r1 == 0) goto L_0x0536
            long r5 = r1.longValue()
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0536
            X.2qk r1 = r0.A00
            if (r1 != 0) goto L_0x05ff
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0536:
            long r5 = r0.count
            r2 = 1
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x05f3
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05f3
            X.2ss r2 = r0.A01
            if (r2 != 0) goto L_0x054f
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x054f:
            X.4uY r1 = r0.newsletterJid
            X.31A r2 = r2.A0A(r1, r4)
            boolean r1 = r2 instanceof X.AnonymousClass1RL
            if (r1 == 0) goto L_0x055f
            X.1RL r2 = (X.AnonymousClass1RL) r2
            if (r2 == 0) goto L_0x055f
            X.21q r8 = r2.A07
        L_0x055f:
            X.31C r1 = r0.A03
            java.lang.String r7 = "messageClient"
            if (r1 != 0) goto L_0x056a
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x056a:
            java.lang.String r9 = r1.A03()
            X.4uY r3 = r0.newsletterJid
            if (r8 == 0) goto L_0x05d4
            int r2 = r8.ordinal()
            if (r2 == r4) goto L_0x05d1
            r1 = 1
            if (r2 == r1) goto L_0x05cd
            r1 = 2
            if (r2 == r1) goto L_0x05ca
            r1 = 3
            if (r2 != r1) goto L_0x05d4
            java.lang.String r2 = "owner"
        L_0x0584:
            X.1x1 r1 = new X.1x1
            r1.<init>(r3, r2)
            X.1wk r6 = new X.1wk
            r6.<init>((X.C35531x1) r1)
            long r1 = r0.count
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Long r3 = r0.beforeServerId
            if (r3 == 0) goto L_0x05c2
            r2 = 1
        L_0x0599:
            X.1wo r1 = new X.1wo
            r1.<init>(r3, r2)
        L_0x059e:
            X.1wm r3 = new X.1wm
            r3.<init>((X.C35401wo) r1, (java.lang.Long) r5)
            r1 = 24
            X.1wm r2 = new X.1wm
            r2.<init>((java.lang.String) r9, (int) r1)
            X.1wk r1 = new X.1wk
            r1.<init>((X.C35381wm) r2)
            X.1wm r2 = new X.1wm
            r2.<init>((X.C35381wm) r3, (X.C35361wk) r6, (X.C35361wk) r1)
            X.1xJ r1 = new X.1xJ
            r1.<init>((X.C35381wm) r2, (int) r4)
            X.31C r6 = r0.A03
            if (r6 != 0) goto L_0x05d6
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x05c2:
            java.lang.Long r3 = r0.afterServerId
            if (r3 == 0) goto L_0x05c8
            r2 = 0
            goto L_0x0599
        L_0x05c8:
            r1 = 0
            goto L_0x059e
        L_0x05ca:
            java.lang.String r2 = "admin"
            goto L_0x0584
        L_0x05cd:
            java.lang.String r2 = "subscriber"
            goto L_0x0584
        L_0x05d1:
            java.lang.String r2 = "guest"
            goto L_0x0584
        L_0x05d4:
            r2 = 0
            goto L_0x0584
        L_0x05d6:
            r10 = 368(0x170, float:5.16E-43)
            X.36K r8 = X.C41032Ir.A05(r1)
            X.4KT r7 = new X.4KT
            r7.<init>((X.C28471gv) r0, (X.C35711xJ) r1)
            goto L_0x05ed
        L_0x05e2:
            r10 = 368(0x170, float:5.16E-43)
            X.36K r8 = X.C41032Ir.A05(r1)
            X.4KT r7 = new X.4KT
            r7.<init>((X.C28461gu) r0, (X.C35721xK) r1)
        L_0x05ed:
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0D(r7, r8, r9, r10, r11)
            return
        L_0x05f3:
            X.2qk r1 = r0.A00
            if (r1 != 0) goto L_0x05fc
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x05fc:
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - count"
            goto L_0x0601
        L_0x05ff:
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - beforeServerId"
        L_0x0601:
            r1.A0A(r0, r4, r8)
            return
        L_0x0605:
            boolean r1 = r0 instanceof X.C28491gy
            if (r1 == 0) goto L_0x0695
            X.1gy r0 = (X.C28491gy) r0
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryImpl$Builder r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryImpl$Builder
            r3.<init>()
            X.4uY r1 = r0.newsletterJid
            java.lang.String r2 = r1.getRawString()
            X.2ie r4 = r3.A00
            java.lang.String r1 = "jid"
            r4.A02(r1, r2)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r3.A04 = r1
            boolean r1 = r0.includeThreadMetadata
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "include_thread_metadata"
            r4.A01(r1, r2)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r3.A03 = r1
            boolean r1 = r0.includeMessageEnforcements
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "include_messages"
            r4.A01(r1, r2)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r3.A02 = r1
            boolean r1 = r0.includePendingAdmins
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "fetch_pending_admin_invites"
            r4.A01(r1, r2)
            boolean r1 = X.AnonymousClass000.A1W(r2)
            r3.A01 = r1
            boolean r1 = r3.A04
            X.C162187rP.A06(r1)
            boolean r1 = r3.A03
            X.C162187rP.A06(r1)
            boolean r1 = r3.A02
            X.C162187rP.A06(r1)
            boolean r1 = r3.A01
            X.C162187rP.A06(r1)
            java.lang.String r3 = "NewsletterAdminMetadataQuery"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl> r1 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterAdminMetadataQueryResponseImpl.class
            X.7J9 r2 = new X.7J9
            r2.<init>(r4, r1, r3)
            X.2gi r1 = r0.A02
            if (r1 != 0) goto L_0x067e
            java.lang.String r0 = "graphqlIqClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x067e:
            X.2fG r2 = r1.A01(r2)
            X.42g r1 = new X.42g
            r1.<init>(r0)
            goto L_0x0691
        L_0x0688:
            X.2fG r2 = r1.A01(r2)
            X.42k r1 = new X.42k
            r1.<init>(r0)
        L_0x0691:
            r2.A01(r1)
            return
        L_0x0695:
            boolean r1 = r0 instanceof X.AnonymousClass47G
            if (r1 == 0) goto L_0x06ad
            X.47G r0 = (X.AnonymousClass47G) r0
            X.5a0 r3 = r0.A00
            java.io.File r2 = r0.fileToDelete
            byte r1 = r0.messageType
            java.lang.String r0 = "MediaUtils/deleteManagedFile actually deleting file"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.C627536m.A0O(r2)
            r3.A08(r2, r1)
            return
        L_0x06ad:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob
            if (r1 == 0) goto L_0x08d1
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob r0 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageJob) r0
            X.3dV r1 = r0.A00
            X.4Fq r22 = r1.A04()
            X.3Yo r21 = r22.Axl()     // Catch:{ all -> 0x08cc }
            X.2qz r3 = r0.A01     // Catch:{ all -> 0x08c2 }
            long r1 = r0.rowId     // Catch:{ all -> 0x08c2 }
            X.34x r6 = X.C55122pp.A00(r3, r1)     // Catch:{ all -> 0x08c2 }
            r21.A00()     // Catch:{ all -> 0x08c2 }
            r21.close()     // Catch:{ all -> 0x08cc }
            r22.close()
            if (r6 == 0) goto L_0x1ad9
            boolean r5 = r0 instanceof com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob
            if (r5 == 0) goto L_0x06f1
            r2 = r0
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r2 = (com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r2
            X.5TD r1 = r2.A06
            java.util.List r7 = X.C615731j.A02(r6, r1)
            if (r7 == 0) goto L_0x0718
            X.2oU r6 = r2.A02     // Catch:{ Exception -> 0x070c }
            X.3Ex r4 = r2.A00     // Catch:{ Exception -> 0x070c }
            X.33i r3 = r2.A01     // Catch:{ Exception -> 0x070c }
            X.33j r2 = r2.A03     // Catch:{ Exception -> 0x070c }
            X.5Y4 r1 = new X.5Y4     // Catch:{ Exception -> 0x070c }
            r1.<init>(r4, r3, r6, r2)     // Catch:{ Exception -> 0x070c }
            java.util.List r2 = r1.A01(r7)     // Catch:{ Exception -> 0x070c }
            goto L_0x071c
        L_0x06f1:
            r4 = r0
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r4 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r4
            java.lang.String r1 = "ftsMessageStore/backgroundTokenize"
            X.33M r3 = X.AnonymousClass33M.A01(r1)
            X.3Lu r1 = r4.A00
            java.lang.String r2 = r1.A0D(r6)
            X.3Lu r1 = r4.A00
            X.33j r1 = r1.A06
            java.lang.String r2 = X.C107155an.A01(r1, r2)
            r3.A07()
            goto L_0x071c
        L_0x070c:
            r3 = move-exception
            java.lang.String r2 = "processvcard/error constructing contacts"
            X.23q r1 = new X.23q
            r1.<init>(r3)
            com.whatsapp.util.Log.e(r2, r1)
        L_0x0718:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x071c:
            X.3dV r1 = r0.A00
            X.4Fq r22 = r1.A04()
            X.3Yo r21 = r22.Axl()     // Catch:{ all -> 0x08cc }
            X.2qz r1 = r0.A01     // Catch:{ all -> 0x08c2 }
            long r3 = r0.rowId     // Catch:{ all -> 0x08c2 }
            X.34x r7 = X.C55122pp.A00(r1, r3)     // Catch:{ all -> 0x08c2 }
            if (r7 == 0) goto L_0x08b8
            boolean r1 = r7.A1N     // Catch:{ all -> 0x08c2 }
            if (r1 != 0) goto L_0x08b8
            if (r5 == 0) goto L_0x0868
            com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob r0 = (com.whatsapp.jobqueue.job.messagejob.ProcessVCardMessageJob) r0     // Catch:{ all -> 0x08c2 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x08c2 }
            boolean r1 = r7 instanceof X.C30411mP     // Catch:{ all -> 0x08c2 }
            if (r1 == 0) goto L_0x0743
            r1 = r7
            X.1mP r1 = (X.C30411mP) r1     // Catch:{ all -> 0x08c2 }
            r1.A02 = r2     // Catch:{ all -> 0x08c2 }
        L_0x0743:
            X.3Lu r1 = r0.A04     // Catch:{ all -> 0x08c2 }
            r1.A0K(r7)     // Catch:{ all -> 0x08c2 }
            X.30v r8 = r0.A05     // Catch:{ all -> 0x08c2 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x08c2 }
            java.lang.String r0 = "vcardmessagestore/onvcardprocessed message.key="
            X.2z0 r3 = X.C624134x.A08(r7, r0, r1)     // Catch:{ all -> 0x08c2 }
            X.C18260x0.A0m(r3, r1)     // Catch:{ all -> 0x08c2 }
            boolean r0 = r3.A02     // Catch:{ all -> 0x08c2 }
            if (r0 == 0) goto L_0x0763
            X.2sr r0 = r8.A00     // Catch:{ all -> 0x08c2 }
            com.whatsapp.jid.PhoneUserJid r6 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x08c2 }
            goto L_0x0767
        L_0x0763:
            com.whatsapp.jid.UserJid r6 = r7.A0o()     // Catch:{ all -> 0x08c2 }
        L_0x0767:
            if (r6 == 0) goto L_0x08b8
            X.3Ex r0 = r8.A01     // Catch:{ all -> 0x08c2 }
            X.3ZH r1 = r0.A07(r6)     // Catch:{ all -> 0x08c2 }
            X.2sr r0 = r8.A00     // Catch:{ all -> 0x08c2 }
            boolean r0 = r0.A0a(r6)     // Catch:{ all -> 0x08c2 }
            if (r0 != 0) goto L_0x077f
            if (r1 == 0) goto L_0x08b8
            X.2k5 r0 = r1.A0F     // Catch:{ all -> 0x08c2 }
            if (r0 != 0) goto L_0x077f
            goto L_0x08b8
        L_0x077f:
            X.4uZ r5 = r3.A00     // Catch:{ all -> 0x08c2 }
            X.3dV r4 = r8.A0A     // Catch:{ all -> 0x08c2 }
            X.4Fq r20 = r4.A04()     // Catch:{ all -> 0x08c2 }
            X.3Yo r19 = r20.Axl()     // Catch:{ all -> 0x0863 }
            java.util.Iterator r18 = r2.iterator()     // Catch:{ all -> 0x0859 }
        L_0x078f:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0859 }
            if (r0 == 0) goto L_0x084f
            java.lang.Object r9 = r18.next()     // Catch:{ all -> 0x0859 }
            X.2Mn r9 = (X.C42032Mn) r9     // Catch:{ all -> 0x0859 }
            java.lang.String r3 = r9.A00     // Catch:{ all -> 0x0859 }
            X.5a1 r10 = r9.A01     // Catch:{ all -> 0x0859 }
            long r0 = r7.A1L     // Catch:{ all -> 0x0859 }
            java.util.List r2 = r10.A06     // Catch:{ all -> 0x0859 }
            if (r2 == 0) goto L_0x0834
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x0859 }
        L_0x07a9:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x0859 }
            if (r2 == 0) goto L_0x0834
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0859 }
            X.7OD r2 = (X.AnonymousClass7OD) r2     // Catch:{ all -> 0x0859 }
            com.whatsapp.jid.UserJid r2 = r2.A01     // Catch:{ all -> 0x0859 }
            if (r2 == 0) goto L_0x07a9
            android.content.ContentValues r2 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0859 }
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0859 }
            java.lang.String r12 = "message_row_id"
            r2.put(r12, r13)     // Catch:{ all -> 0x0859 }
            java.lang.String r0 = "sender_jid"
            X.AnonymousClass0x2.A0n(r2, r6, r0)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "chat_jid"
            java.lang.String r0 = X.C627336j.A07(r5)     // Catch:{ all -> 0x0859 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0859 }
            java.lang.String r0 = "vcard"
            r2.put(r0, r3)     // Catch:{ all -> 0x0859 }
            X.4Fq r17 = r4.A04()     // Catch:{ all -> 0x0859 }
            X.3Yo r16 = r17.Axl()     // Catch:{ all -> 0x0845 }
            r0 = r17
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x083b }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x083b }
            java.lang.String r1 = "messages_vcards"
            java.lang.String r0 = "insertIntoLegacyTables/INSERT_MESSAGES_VCARDS"
            long r2 = r11.A08(r1, r0, r2)     // Catch:{ all -> 0x083b }
            java.util.List r0 = r10.A06     // Catch:{ all -> 0x083b }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x083b }
        L_0x07f9:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x083b }
            if (r0 == 0) goto L_0x082b
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x083b }
            X.7OD r14 = (X.AnonymousClass7OD) r14     // Catch:{ all -> 0x083b }
            com.whatsapp.jid.UserJid r0 = r14.A01     // Catch:{ all -> 0x083b }
            if (r0 == 0) goto L_0x07f9
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x083b }
            r10.put(r12, r13)     // Catch:{ all -> 0x083b }
            java.lang.String r0 = "vcard_row_id"
            X.C18270x1.A0c(r10, r0, r2)     // Catch:{ all -> 0x083b }
            java.lang.String r1 = "vcard_jid"
            com.whatsapp.jid.UserJid r0 = r14.A01     // Catch:{ all -> 0x083b }
            java.lang.String r0 = X.C627336j.A07(r0)     // Catch:{ all -> 0x083b }
            r10.put(r1, r0)     // Catch:{ all -> 0x083b }
            java.lang.String r1 = "messages_vcards_jids"
            java.lang.String r0 = "insertIntoLegacyTables/INSERT_MESSAGES_VCARDS_JIDS"
            r11.A08(r1, r0, r10)     // Catch:{ all -> 0x083b }
            goto L_0x07f9
        L_0x082b:
            r16.A00()     // Catch:{ all -> 0x083b }
            r16.close()     // Catch:{ all -> 0x0845 }
            r17.close()     // Catch:{ all -> 0x0859 }
        L_0x0834:
            long r0 = r7.A1L     // Catch:{ all -> 0x0859 }
            r8.A08(r9, r0)     // Catch:{ all -> 0x0859 }
            goto L_0x078f
        L_0x083b:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0840 }
            goto L_0x0844
        L_0x0840:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0845 }
        L_0x0844:
            throw r1     // Catch:{ all -> 0x0845 }
        L_0x0845:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x084a }
            goto L_0x084e
        L_0x084a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0859 }
        L_0x084e:
            throw r1     // Catch:{ all -> 0x0859 }
        L_0x084f:
            r19.A00()     // Catch:{ all -> 0x0859 }
            r19.close()     // Catch:{ all -> 0x0863 }
            r20.close()     // Catch:{ all -> 0x08c2 }
            goto L_0x08b8
        L_0x0859:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x085e }
            goto L_0x0862
        L_0x085e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0863 }
        L_0x0862:
            throw r1     // Catch:{ all -> 0x0863 }
        L_0x0863:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x08b0 }
            goto L_0x08b4
        L_0x0868:
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r0 = (com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob) r0     // Catch:{ all -> 0x08c2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x08c2 }
            X.3Lu r5 = r0.A00     // Catch:{ all -> 0x08c2 }
            long r6 = r5.A03()     // Catch:{ all -> 0x08c2 }
            long r3 = r0.sortId     // Catch:{ all -> 0x08c2 }
            long r0 = r0.rowId     // Catch:{ all -> 0x08c2 }
            r15 = 1
            X.2vV r14 = new X.2vV     // Catch:{ all -> 0x08c2 }
            r16 = r3
            r18 = r0
            r14.<init>(r15, r16, r18)     // Catch:{ all -> 0x08c2 }
            X.3dV r0 = r5.A0F     // Catch:{ all -> 0x08c2 }
            X.4Fq r3 = r0.A04()     // Catch:{ all -> 0x08c2 }
            android.content.ContentValues r9 = X.AnonymousClass0x9.A07(r15)     // Catch:{ all -> 0x08ab }
            java.lang.String r0 = "content"
            X.2sg r8 = X.AnonymousClass3H0.A03(r9, r3, r0, r2)     // Catch:{ all -> 0x08ab }
            java.lang.String r10 = "message_ftsv2"
            java.lang.String r11 = "docid = ?"
            java.lang.String[] r13 = new java.lang.String[r15]     // Catch:{ all -> 0x08ab }
            long r0 = r14.A02     // Catch:{ all -> 0x08ab }
            X.C18260x0.A1X(r13, r0)     // Catch:{ all -> 0x08ab }
            java.lang.String r12 = "UPDATE_FTS_TEXT"
            r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x08ab }
            r3.close()     // Catch:{ all -> 0x08c2 }
            r3 = 1
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x08b8
            goto L_0x08b5
        L_0x08ab:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x08b0 }
            goto L_0x08b4
        L_0x08b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08c2 }
        L_0x08b4:
            throw r1     // Catch:{ all -> 0x08c2 }
        L_0x08b5:
            r5.A05(r14, r2)     // Catch:{ all -> 0x08c2 }
        L_0x08b8:
            r21.A00()     // Catch:{ all -> 0x08c2 }
            r21.close()     // Catch:{ all -> 0x08cc }
            r22.close()
            return
        L_0x08c2:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x08c7 }
            goto L_0x08cb
        L_0x08c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x08cc }
        L_0x08cb:
            throw r1     // Catch:{ all -> 0x08cc }
        L_0x08cc:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x14c7 }
            throw r1
        L_0x08d1:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            if (r1 == 0) goto L_0x092b
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = (com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob) r0
            java.lang.String r1 = "SyncdTableEmptyKeyCheckJob/onRun/start"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.34v r1 = r0.A01
            X.4GK r4 = X.C18630y0.A01(r1)
            r1 = r4
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0926 }
            X.2sg r3 = r1.A03     // Catch:{ all -> 0x0926 }
            java.lang.String r2 = "SELECT 1 as has_empty_key FROM syncd_mutations WHERE device_id = 0  AND epoch = 0  LIMIT 1 "
            java.lang.String r1 = "SyncdMutationsTable.HAS_EMPTY_KEY_EXIST_STATE"
            android.database.Cursor r3 = X.C56862sg.A01(r3, r2, r1)     // Catch:{ all -> 0x0926 }
            boolean r2 = r3.moveToFirst()     // Catch:{ all -> 0x091a }
            r1 = 0
            if (r2 == 0) goto L_0x0900
            java.lang.String r1 = "has_empty_key"
            int r1 = X.AnonymousClass0x2.A04(r3, r1)     // Catch:{ all -> 0x091a }
            boolean r1 = X.C18310x6.A1W(r1)
        L_0x0900:
            r3.close()     // Catch:{ all -> 0x0926 }
            r4.close()
            if (r1 == 0) goto L_0x0914
            java.lang.String r1 = "SyncdTableEmptyKeyCheckJob/onRun/hasEmptyKeyMutation"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.30l r1 = r0.A00
            r0 = 7
            r1.A04(r0)
            return
        L_0x0914:
            java.lang.String r0 = "SyncdTableEmptyKeyCheckJob/onRun/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x091a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0925
            r3.close()     // Catch:{ all -> 0x0921 }
            goto L_0x0925
        L_0x0921:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0926 }
        L_0x0925:
            throw r1     // Catch:{ all -> 0x0926 }
        L_0x0926:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x14c7 }
            throw r1
        L_0x092b:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SyncProfilePictureJob
            if (r1 == 0) goto L_0x09c0
            com.whatsapp.jobqueue.job.SyncProfilePictureJob r0 = (com.whatsapp.jobqueue.job.SyncProfilePictureJob) r0
            int r1 = r0.type
            boolean r2 = X.AnonymousClass001.A1T(r1)
            java.lang.String[] r1 = r0.jids
            java.util.List r4 = X.C627336j.A0C(r1)
            java.lang.String r1 = "jid list is empty"
            X.C626936e.A09(r1, r4)
            X.3Cq r7 = r0.A00     // Catch:{ Exception -> 0x09ae }
            if (r2 == 0) goto L_0x098b
            X.227 r3 = X.AnonymousClass227.A06     // Catch:{ Exception -> 0x09ae }
        L_0x0948:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x09ae }
            java.lang.String r1 = "contactsyncmethods/requestSyncPicture/start sync user picture size="
            r2.append(r1)     // Catch:{ Exception -> 0x09ae }
            int r1 = r4.size()     // Catch:{ Exception -> 0x09ae }
            X.C18260x0.A1F(r2, r1)     // Catch:{ Exception -> 0x09ae }
            X.2zU r6 = new X.2zU     // Catch:{ Exception -> 0x09ae }
            r6.<init>(r3)     // Catch:{ Exception -> 0x09ae }
            r1 = 1
            r6.A02 = r1     // Catch:{ Exception -> 0x09ae }
            X.2xW r1 = X.C59812xW.A0N     // Catch:{ Exception -> 0x09ae }
            r6.A00 = r1     // Catch:{ Exception -> 0x09ae }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x09ae }
        L_0x0968:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x09ae }
            if (r1 == 0) goto L_0x098e
            com.whatsapp.jid.UserJid r4 = X.C18310x6.A0T(r5)     // Catch:{ Exception -> 0x09ae }
            X.1VX r3 = r7.A0H     // Catch:{ Exception -> 0x09ae }
            r2 = 3311(0xcef, float:4.64E-42)
            X.2vE r1 = X.C58422vE.A02     // Catch:{ Exception -> 0x09ae }
            boolean r1 = r3.A0Y(r1, r2)     // Catch:{ Exception -> 0x09ae }
            if (r1 != 0) goto L_0x0983
            X.3Ex r1 = r7.A09     // Catch:{ Exception -> 0x09ae }
            r1.A0A(r4)     // Catch:{ Exception -> 0x09ae }
        L_0x0983:
            if (r4 == 0) goto L_0x0968
            java.util.Set r1 = r6.A07     // Catch:{ Exception -> 0x09ae }
            r1.add(r4)     // Catch:{ Exception -> 0x09ae }
            goto L_0x0968
        L_0x098b:
            X.227 r3 = X.AnonymousClass227.A07     // Catch:{ Exception -> 0x09ae }
            goto L_0x0948
        L_0x098e:
            X.2zz r2 = r6.A02()     // Catch:{ Exception -> 0x09ae }
            r1 = 0
            X.3dJ r1 = r7.A03(r2, r1)     // Catch:{ Exception -> 0x09ae }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x09ae }
            X.304 r3 = (X.AnonymousClass304) r3     // Catch:{ Exception -> 0x09ae }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x09ae }
            java.lang.String r1 = "SyncProfilePictureJob/onRun/sync is success="
            r2.append(r1)     // Catch:{ Exception -> 0x09ae }
            boolean r1 = r3.A00()     // Catch:{ Exception -> 0x09ae }
            X.C18260x0.A1U(r2, r1)     // Catch:{ Exception -> 0x09ae }
            return
        L_0x09ae:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncProfilePictureJob/onRun/error, param="
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1K(r2, r0)
            throw r3
        L_0x09c0:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SyncDevicesJob
            if (r1 == 0) goto L_0x0a3a
            com.whatsapp.jobqueue.job.SyncDevicesJob r0 = (com.whatsapp.jobqueue.job.SyncDevicesJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0a1f }
            java.lang.String r1 = "SyncDevicesJob/onRun/start sync device. param="
            r2.append(r1)     // Catch:{ Exception -> 0x0a1f }
            java.lang.String r1 = r0.A08()     // Catch:{ Exception -> 0x0a1f }
            X.C18260x0.A1L(r2, r1)     // Catch:{ Exception -> 0x0a1f }
            X.3Cq r3 = r0.A00     // Catch:{ Exception -> 0x0a1f }
            java.lang.String[] r1 = r0.jids     // Catch:{ Exception -> 0x0a1f }
            java.util.List r2 = X.C627336j.A0C(r1)     // Catch:{ Exception -> 0x0a1f }
            java.lang.String r1 = "jid list is empty"
            X.C626936e.A09(r1, r2)     // Catch:{ Exception -> 0x0a1f }
            int r1 = r0.syncType     // Catch:{ Exception -> 0x0a1f }
            switch(r1) {
                case 1: goto L_0x0a14;
                case 2: goto L_0x0a11;
                case 3: goto L_0x0a0e;
                case 4: goto L_0x0a0b;
                case 5: goto L_0x0a08;
                case 6: goto L_0x0a05;
                default: goto L_0x09e8;
            }     // Catch:{ Exception -> 0x0a1f }
        L_0x09e8:
            X.227 r1 = X.AnonymousClass227.A0C     // Catch:{ Exception -> 0x0a1f }
        L_0x09ea:
            X.3dJ r1 = r3.A04(r1, r2)     // Catch:{ Exception -> 0x0a1f }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x0a1f }
            X.304 r3 = (X.AnonymousClass304) r3     // Catch:{ Exception -> 0x0a1f }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0a1f }
            java.lang.String r1 = "SyncDevicesJob/onRun/sync is success="
            r2.append(r1)     // Catch:{ Exception -> 0x0a1f }
            boolean r1 = r3.A00()     // Catch:{ Exception -> 0x0a1f }
            X.C18260x0.A1U(r2, r1)     // Catch:{ Exception -> 0x0a1f }
            goto L_0x0a17
        L_0x0a05:
            X.227 r1 = X.AnonymousClass227.A0E     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a08:
            X.227 r1 = X.AnonymousClass227.A0F     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a0b:
            X.227 r1 = X.AnonymousClass227.A0N     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a0e:
            X.227 r1 = X.AnonymousClass227.A05     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a11:
            X.227 r1 = X.AnonymousClass227.A0I     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a14:
            X.227 r1 = X.AnonymousClass227.A0G     // Catch:{ Exception -> 0x0a1f }
            goto L_0x09ea
        L_0x0a17:
            X.2gV r1 = r0.A01
            java.lang.String[] r0 = r0.jids
            r1.A00(r0)
            return
        L_0x0a1f:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0a31 }
            java.lang.String r1 = "SyncDevicesJob/onRun/error, param="
            r2.append(r1)     // Catch:{ all -> 0x0a31 }
            java.lang.String r1 = r0.A08()     // Catch:{ all -> 0x0a31 }
            X.C18260x0.A1K(r2, r1)     // Catch:{ all -> 0x0a31 }
            throw r3     // Catch:{ all -> 0x1802 }
        L_0x0a31:
            r2 = move-exception
            X.2gV r1 = r0.A01
            java.lang.String[] r0 = r0.jids
            r1.A00(r0)
            throw r2
        L_0x0a3a:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob
            if (r1 == 0) goto L_0x0aa5
            com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob r0 = (com.whatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/param="
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            X.3Cq r3 = r0.A00     // Catch:{ Exception -> 0x0a93 }
            java.util.Set r2 = r0.A05     // Catch:{ Exception -> 0x0a93 }
            java.lang.String r1 = "jid list is empty"
            X.C626936e.A09(r1, r2)     // Catch:{ Exception -> 0x0a93 }
            X.227 r1 = X.AnonymousClass227.A0G     // Catch:{ Exception -> 0x0a93 }
            X.3dJ r1 = r3.A04(r1, r2)     // Catch:{ Exception -> 0x0a93 }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x0a93 }
            X.304 r3 = (X.AnonymousClass304) r3     // Catch:{ Exception -> 0x0a93 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0a93 }
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/sync is success="
            r2.append(r1)     // Catch:{ Exception -> 0x0a93 }
            boolean r1 = r3.A00()     // Catch:{ Exception -> 0x0a93 }
            X.C18260x0.A1V(r2, r1)     // Catch:{ Exception -> 0x0a93 }
            java.lang.String r1 = r0.rawGroupJid     // Catch:{ Exception -> 0x0a93 }
            com.whatsapp.jid.GroupJid r3 = X.AnonymousClass32V.A02(r1)     // Catch:{ Exception -> 0x0a93 }
            r2 = 1
            java.lang.String r1 = r0.messageId     // Catch:{ Exception -> 0x0a93 }
            X.2z0 r5 = X.AnonymousClass2z0.A05(r3, r1, r2)     // Catch:{ Exception -> 0x0a93 }
            X.2sH r1 = r0.A02     // Catch:{ Exception -> 0x0a93 }
            long r3 = r1.A0H()     // Catch:{ Exception -> 0x0a93 }
            X.1mY r2 = new X.1mY     // Catch:{ Exception -> 0x0a93 }
            r2.<init>(r5, r3)     // Catch:{ Exception -> 0x0a93 }
            X.3Lv r1 = r0.A03     // Catch:{ Exception -> 0x0a93 }
            r1.A0V(r2)     // Catch:{ Exception -> 0x0a93 }
            return
        L_0x0a93:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SyncDevicesAndSendInvisibleMessageJob/onRun/error, param="
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1K(r2, r0)
            throw r3
        L_0x0aa5:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob
            if (r1 == 0) goto L_0x0b54
            com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob r0 = (com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob) r0
            java.lang.String[] r1 = r0.jids
            java.util.List r6 = X.C627336j.A0C(r1)
            X.1im r1 = r0.A00
            int r2 = r1.A04
            r1 = 2
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            r3 = 0
            if (r1 == 0) goto L_0x0ac6
            X.1im r1 = r0.A00
            boolean r1 = r1.A0A()
            r5 = 1
            if (r1 == 0) goto L_0x0ace
        L_0x0ac6:
            r5 = 0
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0ace
            return
        L_0x0ace:
            X.33p r1 = r0.A02
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r1)
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.lang.String r4 = "adv_validating_users_to_sync"
            java.util.Set r2 = r2.getStringSet(r4, r1)
            X.C626936e.A06(r2)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = X.C627336j.A0C(r1)
            java.util.HashSet r3 = X.AnonymousClass0x9.A15(r1)
            boolean r1 = r3.addAll(r6)
            if (r1 == 0) goto L_0x0b08
            java.lang.String[] r1 = X.C627336j.A0O(r3)
            java.util.HashSet r2 = X.C18280x3.A0h(r1)
            X.33p r1 = r0.A02
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            X.C18300x5.A15(r1, r4, r2)
        L_0x0b08:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x1ad9
            if (r5 == 0) goto L_0x1ad9
            X.3Cq r2 = r0.A01     // Catch:{ Exception -> 0x0b36 }
            X.227 r1 = X.AnonymousClass227.A05     // Catch:{ Exception -> 0x0b36 }
            X.3dJ r1 = r2.A04(r1, r3)     // Catch:{ Exception -> 0x0b36 }
            java.lang.Object r3 = r1.get()     // Catch:{ Exception -> 0x0b36 }
            X.304 r3 = (X.AnonymousClass304) r3     // Catch:{ Exception -> 0x0b36 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0b36 }
            java.lang.String r1 = "DeviceSyncManager/syncDeviceForAdvValidation is success="
            r2.append(r1)     // Catch:{ Exception -> 0x0b36 }
            boolean r1 = r3.A00()     // Catch:{ Exception -> 0x0b36 }
            X.C18260x0.A1U(r2, r1)     // Catch:{ Exception -> 0x0b36 }
            if (r1 == 0) goto L_0x0b40
            X.33p r1 = r0.A02     // Catch:{ Exception -> 0x0b36 }
            X.C18260x0.A0K(r1, r4)     // Catch:{ Exception -> 0x0b36 }
            goto L_0x0b40
        L_0x0b36:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DeviceSyncManager/syncDeviceForAdvValidation/error ex="
            X.C18260x0.A1Q(r2, r1, r3)
        L_0x0b40:
            X.33p r1 = r0.A02
            X.318 r0 = r0.A03
            X.2sH r0 = r0.A02
            long r2 = r0.A0F()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)
            java.lang.String r0 = "adv_last_device_job_ts"
            X.C18270x1.A0i(r1, r0, r2)
            return
        L_0x0b54:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            if (r1 == 0) goto L_0x0c6c
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = (com.whatsapp.jobqueue.job.SendStatusPrivacyListJob) r0
            long r4 = com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.A01
            long r2 = r0.A01
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r1 == 0) goto L_0x0b7e
            java.lang.String r1 = "skip send status privacy job"
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            r2.append(r0)
            java.lang.String r0 = "; lastJobId="
            r2.append(r0)
            long r0 = com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.A01
            X.C18260x0.A1I(r2, r0)
            return
        L_0x0b7e:
            java.lang.String r1 = "run send status privacy job"
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>()
            X.2vr r13 = r0.A00
            int r14 = r0.statusDistribution
            java.util.Collection r2 = r0.jids
            if (r2 != 0) goto L_0x0bdc
            r12 = 0
        L_0x0b99:
            r1 = 6
            X.4KT r11 = new X.4KT
            r11.<init>(r15, r1, r0)
            X.6bK r10 = new X.6bK
            r10.<init>()
            X.31C r1 = r13.A03
            r16 = r1
            java.lang.String r9 = r16.A03()
            r20 = 120(0x78, float:1.68E-43)
            r8 = 0
            r7 = 1
            r6 = 0
            if (r12 == 0) goto L_0x0be6
            int r1 = r12.size()
            if (r1 <= 0) goto L_0x0be6
            int r1 = r12.size()
            X.36K[] r5 = new X.AnonymousClass36K[r1]
            r4 = 0
        L_0x0bc0:
            int r1 = r12.size()
            if (r4 >= r1) goto L_0x0be7
            X.39V[] r3 = new X.AnonymousClass39V[r7]
            java.lang.Object r2 = r12.get(r4)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.String r1 = "jid"
            X.AnonymousClass39V.A02(r2, r1, r3, r8)
            java.lang.String r1 = "user"
            X.AnonymousClass36K.A0U(r1, r3, r5, r4)
            int r4 = r4 + 1
            goto L_0x0bc0
        L_0x0bdc:
            java.lang.Class<X.4uZ> r1 = X.C95814uZ.class
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()
            X.C627336j.A0G(r1, r2, r12)
            goto L_0x0b99
        L_0x0be6:
            r5 = r6
        L_0x0be7:
            X.39V[] r2 = new X.AnonymousClass39V[r7]
            if (r14 != 0) goto L_0x0c4b
            java.lang.String r1 = "contacts"
        L_0x0bed:
            java.lang.String r4 = "type"
            X.AnonymousClass39V.A0B(r4, r1, r2, r8)
            java.lang.String r1 = "list"
            X.36K r2 = X.AnonymousClass36K.A0J(r1, r2, r5)
            java.lang.String r1 = "privacy"
            X.36K r5 = X.AnonymousClass36K.A0F(r2, r1, r6)
            X.39V[] r3 = X.AnonymousClass39V.A0H(r9, r8)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "status"
            X.AnonymousClass39V.A0B(r2, r1, r3, r7)
            java.lang.String r1 = "set"
            X.AnonymousClass39V.A06(r4, r1, r3)
            X.6kI r1 = X.C135206kI.A00
            X.36K r18 = X.AnonymousClass36K.A0C(r1, r5, r3)
            r2 = 19
            X.4KX r1 = new X.4KX
            r1.<init>(r11, r13, r10, r2)
            r21 = 32000(0x7d00, double:1.581E-319)
            r17 = r1
            r19 = r9
            r16.A0K(r17, r18, r19, r20, r21)
            r10.get()
            int r3 = r15.get()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r3 == r1) goto L_0x0c54
            if (r3 == 0) goto L_0x1ad9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server error code returned during send status privacy job; errorCode="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1M(r2, r0)
            return
        L_0x0c4b:
            if (r14 != r7) goto L_0x0c51
            java.lang.String r1 = "whitelist"
            goto L_0x0bed
        L_0x0c51:
            java.lang.String r1 = "blacklist"
            goto L_0x0bed
        L_0x0c54:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server 500 error during send status privacy job"
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0c6c:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendRetryReceiptJob
            if (r1 == 0) goto L_0x0d5d
            com.whatsapp.jobqueue.job.SendRetryReceiptJob r0 = (com.whatsapp.jobqueue.job.SendRetryReceiptJob) r0
            int r1 = r0.localRegistrationId
            byte[] r19 = X.AnonymousClass36A.A01(r1)
            java.lang.String r1 = r0.jid
            X.32W r2 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r12 = r2.A03(r1)
            java.lang.String r1 = r0.participant
            com.whatsapp.jid.Jid r13 = r2.A03(r1)
            r5 = 0
            android.util.Pair r3 = X.C626635z.A05(r5, r12, r13)
            X.2i8 r2 = new X.2i8
            r2.<init>()
            java.lang.Object r1 = r3.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r2.A02 = r1
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            java.lang.String r1 = "retry"
            r2.A08 = r1
            java.lang.String r1 = r0.id
            r2.A07 = r1
            java.lang.Object r1 = r3.second
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r2.A01 = r1
            java.lang.String r1 = r0.category
            if (r1 == 0) goto L_0x0cb0
            r2.A04 = r1
        L_0x0cb0:
            X.39T r3 = r2.A01()
            int r1 = r0.retryCount
            r23 = 1
            if (r1 <= 0) goto L_0x0d30
            X.33n r1 = r0.A02
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x0d25
            android.util.Pair r1 = r0.A08()
        L_0x0cc6:
            java.lang.Object r4 = r1.first
            byte[] r4 = (byte[]) r4
            java.lang.Object r2 = r1.second
            X.2Ov[] r2 = (X.C42612Ov[]) r2
            r1 = 0
            r15 = r2[r1]
            r16 = r2[r23]
            X.2sr r1 = r0.A00
            boolean r1 = r1.A0Y()
            if (r1 == 0) goto L_0x0ce1
            X.2q4 r1 = r0.A01
            byte[] r5 = r1.A03()
        L_0x0ce1:
            java.lang.String r10 = r0.id
            java.lang.String r1 = r0.recipientJid
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass32Y.A08(r1)
            long r6 = r0.timestamp
            int r1 = r0.retryCount
            int r23 = r23 + r1
            r22 = 5
            long r1 = r0.loggableStanzaId
            java.lang.String r9 = r0.category
            int r8 = r0.retryErrorCode
            X.2U5 r11 = new X.2U5
            r24 = r8
            r25 = r6
            r27 = r1
            r20 = r4
            r21 = r5
            r18 = r9
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
        L_0x0d0a:
            X.2bg r4 = r0.A05
            r2 = 0
            r1 = 11
            r0 = 0
            android.os.Message r1 = android.os.Message.obtain(r2, r0, r1, r0, r11)
            java.lang.Object r0 = r1.obj
            X.2U5 r0 = (X.AnonymousClass2U5) r0
            r4.A00(r0)
            X.31C r0 = r4.A04
            java.util.concurrent.Future r0 = r0.A05(r1, r3)
        L_0x0d21:
            r0.get()
            return
        L_0x0d25:
            X.2fm r2 = r0.A03
            r1 = 9
            java.lang.Object r1 = X.C48972fm.A00(r2, r0, r1)
            android.util.Pair r1 = (android.util.Pair) r1
            goto L_0x0cc6
        L_0x0d30:
            java.lang.String r8 = r0.id
            java.lang.String r1 = r0.recipientJid
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass32Y.A08(r1)
            long r4 = r0.timestamp
            int r1 = r0.retryCount
            int r23 = r23 + r1
            r15 = 0
            long r1 = r0.loggableStanzaId
            java.lang.String r7 = r0.category
            int r6 = r0.retryErrorCode
            r22 = 0
            X.2U5 r11 = new X.2U5
            r20 = r15
            r21 = r15
            r16 = r15
            r24 = r6
            r25 = r4
            r27 = r1
            r18 = r7
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
            goto L_0x0d0a
        L_0x0d5d:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendReadReceiptJob
            if (r1 == 0) goto L_0x0e07
            com.whatsapp.jobqueue.job.SendReadReceiptJob r0 = (com.whatsapp.jobqueue.job.SendReadReceiptJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendReadReceiptJob/onRun "
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1J(r2, r1)
            java.lang.String r1 = r0.jid
            X.5Yw r2 = X.C95814uZ.A00
            X.4uZ r7 = r2.A05(r1)
            boolean r1 = r7 instanceof X.C135216kJ
            if (r1 == 0) goto L_0x0dff
            r8 = 0
        L_0x0d80:
            java.lang.String r1 = r0.remoteSender
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r0.recipient
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A08(r1)
            X.2r4 r11 = r0.A01
            java.lang.String[] r5 = r0.messageIds
            long r1 = r0.originalMessageTimestamp
            boolean r4 = r0.shouldForceReadSelfReceipt
            java.lang.Throwable r3 = r0.A03
            r12 = r7
            r13 = r3
            r14 = r5
            r15 = r1
            r17 = r4
            boolean r1 = r11.A04(r12, r13, r14, r15, r17)
            if (r1 == 0) goto L_0x1ad9
            X.2r4 r6 = r0.A01
            java.lang.String[] r11 = r0.messageIds
            boolean r14 = r0.shouldForceReadSelfReceipt
            long r12 = r0.loggableStanzaId
            X.2T1 r6 = r6.A00(r7, r8, r9, r10, r11, r12, r14)
            android.util.Pair r4 = X.C626635z.A05(r9, r7, r8)
            X.2i8 r3 = new X.2i8
            r3.<init>()
            java.lang.Object r1 = r4.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r3.A02 = r1
            java.lang.String r1 = "receipt"
            r3.A05 = r1
            java.lang.String r1 = r6.A06
            r3.A08 = r1
            java.lang.String[] r2 = r0.messageIds
            r1 = 0
            r1 = r2[r1]
            r3.A07 = r1
            java.lang.Object r1 = r4.second
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r3.A01 = r1
            r3.A03 = r10
            long r1 = r0.loggableStanzaId
            r3.A00 = r1
            X.39T r5 = r3.A01()
            X.2r5 r4 = r0.A02
            long r2 = r0.loggableStanzaId
            r1 = 0
            X.2rb r2 = r4.A01(r1, r2)
            if (r2 == 0) goto L_0x0dec
            r1 = 6
            r2.A03(r1)
        L_0x0dec:
            X.31C r2 = r0.A00
            r1 = 89
            android.os.Message r1 = X.C18290x4.A0J(r1, r6)
            java.util.concurrent.Future r1 = r2.A05(r1, r5)
            r1.get()
            r0.A08()
            return
        L_0x0dff:
            java.lang.String r1 = r0.participant
            X.4uZ r8 = r2.A05(r1)
            goto L_0x0d80
        L_0x0e07:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            if (r1 == 0) goto L_0x0efd
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = (com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2) r0
            java.lang.String r1 = r0.toRawJid
            X.4uZ r3 = X.C106405Yw.A04(r1)
            java.lang.String r1 = r0.participantRawJid
            X.5Yw r6 = X.C95814uZ.A00
            X.4uZ r2 = r6.A05(r1)
            r1 = 0
            android.util.Pair r3 = X.C626635z.A05(r1, r3, r2)
            X.2r4 r2 = r0.A02
            java.lang.Object r1 = r3.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.4uZ r1 = X.C106405Yw.A03(r1)
            boolean r1 = r2.A02(r1)
            r7 = 0
            if (r1 == 0) goto L_0x0ef7
            java.lang.Object r1 = r3.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.4uZ r1 = X.C106405Yw.A03(r1)
            boolean r1 = r1 instanceof X.C95804uY
            if (r1 != 0) goto L_0x0ef7
            r4 = 1
            java.lang.String r8 = "played"
        L_0x0e41:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendPlayedReceiptJobV2/onRun; "
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            r2.append(r1)
            java.lang.String r1 = "; type="
            X.C18260x0.A0q(r1, r8, r2)
            if (r4 != 0) goto L_0x14d3
            X.2KY r11 = r0.A00
            java.lang.String r1 = r0.toRawJid
            X.4uZ r5 = X.C106405Yw.A04(r1)
            java.lang.String r1 = r0.participantRawJid
            X.4uZ r4 = r6.A05(r1)
            java.lang.Long[] r2 = r0.messageRowIds
            java.lang.String[] r1 = r0.messageIds
            X.2b1 r10 = new X.2b1
            r10.<init>(r5, r4, r2, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PlayedSelfReceiptStore/insertPlayedSelfReceipt/toJid = "
            java.lang.String r1 = X.C18300x5.A0k(r10, r1, r2)
            X.C18260x0.A1L(r2, r1)
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()
            r6 = 0
        L_0x0e81:
            java.lang.String[] r14 = r10.A03
            int r1 = r14.length
            if (r6 >= r1) goto L_0x14cc
            r9.clear()
            X.34p r4 = r11.A00
            X.4uZ r1 = r10.A01
            java.lang.Long r2 = X.C623334p.A03(r4, r1)
            java.lang.String r1 = "to_jid_row_id"
            r9.put(r1, r2)
            X.4uZ r1 = r10.A00
            if (r1 == 0) goto L_0x0ea5
            java.lang.Long r2 = X.C623334p.A03(r4, r1)
            java.lang.String r1 = "participant_jid_row_id"
            r9.put(r1, r2)
        L_0x0ea5:
            java.lang.Long[] r1 = r10.A02
            r2 = r1[r6]
            java.lang.String r1 = "message_row_id"
            r9.put(r1, r2)
            r2 = r14[r6]
            java.lang.String r1 = "message_id"
            r9.put(r1, r2)
            X.3dV r1 = r11.A01
            X.4Fq r16 = r1.A04()
            X.3Yo r15 = r16.Axl()     // Catch:{ all -> 0x14c2 }
            r1 = r16
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x14b8 }
            X.2sg r4 = r1.A03     // Catch:{ all -> 0x14b8 }
            java.lang.String r2 = "played_self_receipt"
            java.lang.String r1 = "PlayedSelfReceiptStore/INSERT_PLAYED_SELF_RECEIPT"
            long r12 = r4.A08(r2, r1, r9)     // Catch:{ all -> 0x14b8 }
            r4 = -1
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0edf
            java.lang.String r1 = "PlayedSelfReceiptStore/insertPlayedSelfReceipt fail to insert"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x14b8 }
        L_0x0edb:
            r15.A00()     // Catch:{ all -> 0x14b8 }
            goto L_0x0eee
        L_0x0edf:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x14b8 }
            java.lang.String r1 = "PlayedSelfReceiptStore/insertPlayedSelfReceipt insert success id="
            r2.append(r1)     // Catch:{ all -> 0x14b8 }
            r1 = r14[r6]     // Catch:{ all -> 0x14b8 }
            X.C18260x0.A1J(r2, r1)     // Catch:{ all -> 0x14b8 }
            goto L_0x0edb
        L_0x0eee:
            r15.close()     // Catch:{ all -> 0x14c2 }
            r16.close()
            int r6 = r6 + 1
            goto L_0x0e81
        L_0x0ef7:
            r4 = 0
            java.lang.String r8 = "played-self"
            goto L_0x0e41
        L_0x0efd:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendPlayedReceiptJob
            if (r1 == 0) goto L_0x0f6b
            com.whatsapp.jobqueue.job.SendPlayedReceiptJob r0 = (com.whatsapp.jobqueue.job.SendPlayedReceiptJob) r0
            java.lang.String r1 = r0.remoteJidRawJid
            X.4uZ r9 = X.C106405Yw.A04(r1)
            java.lang.String r1 = r0.remoteResourceRawJid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0f69
            java.lang.String r1 = r0.remoteResourceRawJid
            X.4uZ r3 = X.C18310x6.A0S(r1)
        L_0x0f17:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendPlayedReceiptJob/onRun: remoteJid="
            r2.append(r1)
            r2.append(r9)
            java.lang.String r1 = "; remoteResource="
            X.AnonymousClass0x7.A1G(r2, r1, r3)
            java.lang.String r1 = r0.messageId
            X.C18260x0.A1J(r2, r1)
            boolean r1 = r3 instanceof X.AnonymousClass1fS
            r8 = r3
            if (r1 != 0) goto L_0x0f34
            r8 = r9
            r9 = r3
        L_0x0f34:
            X.2i8 r2 = X.C50412i8.A00(r8)
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            java.lang.String r7 = "played"
            r2.A08 = r7
            java.lang.String r1 = r0.messageId
            r2.A07 = r1
            r2.A01 = r9
            X.39T r6 = r2.A01()
            X.31C r5 = r0.A00
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Y()
            r3 = 0
            java.lang.String r0 = r0.messageId
            r4[r3] = r0
            r2 = 0
            X.2QJ r1 = new X.2QJ
            r1.<init>(r8, r9, r7, r4)
            r0 = 38
            android.os.Message r0 = android.os.Message.obtain(r2, r3, r0, r3, r1)
            java.util.concurrent.Future r0 = r5.A05(r0, r6)
            goto L_0x0d21
        L_0x0f69:
            r3 = 0
            goto L_0x0f17
        L_0x0f6b:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob
            if (r1 == 0) goto L_0x0fbd
            com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob r0 = (com.whatsapp.jobqueue.job.SendPermanentFailureReceiptJob) r0
            java.lang.String r1 = r0.jid
            X.5Yw r2 = X.C95814uZ.A00
            X.4uZ r3 = r2.A05(r1)
            java.lang.String r1 = r0.participant
            X.4uZ r6 = r2.A05(r1)
            X.2i8 r2 = X.C50412i8.A00(r3)
            r2.A01 = r6
            java.lang.String r1 = r0.messageKeyId
            r2.A07 = r1
            java.lang.String r1 = "error"
            r2.A08 = r1
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            X.39T r5 = r2.A01()
            X.31C r4 = r0.A00
            java.lang.String r2 = r0.messageKeyId
            r0 = 163(0xa3, float:2.28E-43)
            android.os.Message r3 = X.C18290x4.A0J(r0, r3)
            android.os.Bundle r1 = r3.getData()
            java.lang.String r0 = "messageKeyId"
            r1.putString(r0, r2)
            android.os.Bundle r2 = r3.getData()
            java.lang.String r1 = "remoteResource"
            java.lang.String r0 = X.C627336j.A07(r6)
            r2.putString(r1, r0)
            java.util.concurrent.Future r0 = r4.A05(r3, r5)
            goto L_0x0d21
        L_0x0fbd:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob
            if (r1 == 0) goto L_0x0ff7
            com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob r0 = (com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob) r0
            java.lang.String r1 = r0.jid
            X.4uZ r6 = X.C18310x6.A0S(r1)
            X.2i8 r2 = X.C50412i8.A00(r6)
            java.lang.String r1 = r0.messageKeyId
            r2.A07 = r1
            java.lang.String r1 = "error"
            r2.A08 = r1
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            X.39T r5 = r2.A01()
            X.31C r4 = r0.A00
            java.lang.String r3 = r0.messageKeyId
            r0 = 295(0x127, float:4.13E-43)
            android.os.Message r2 = X.C18290x4.A0J(r0, r6)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "messageKeyId"
            r1.putString(r0, r3)
            java.util.concurrent.Future r0 = r4.A05(r2, r5)
            goto L_0x0d21
        L_0x0ff7:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob
            if (r1 == 0) goto L_0x10c4
            com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob r0 = (com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob) r0
            java.lang.String r1 = r0.remoteJidRawJid
            X.5Yw r2 = X.C95814uZ.A00
            X.4uZ r8 = r2.A05(r1)
            java.lang.String r1 = r0.remoteResourceRawJid
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r1 != 0) goto L_0x10c1
            java.lang.String r1 = r0.remoteResourceRawJid
            X.4uZ r9 = r2.A05(r1)
        L_0x1014:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendMediaErrorReceiptJob/onRun: remoteJid="
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = "; remoteResource="
            X.AnonymousClass0x7.A1G(r2, r1, r9)
            java.lang.String r1 = r0.messageId
            X.C18260x0.A1J(r2, r1)
            boolean r2 = r9 instanceof X.AnonymousClass1fS
            java.lang.String r1 = r0.myPrimaryJid
            if (r1 == 0) goto L_0x10b7
            r6 = 1
            X.4uZ r7 = X.C106405Yw.A04(r1)
            X.C626936e.A06(r8)
        L_0x1038:
            boolean r1 = X.C627336j.A0K(r8)
            if (r1 != 0) goto L_0x1046
            boolean r1 = r8 instanceof X.C135166kE
            if (r1 != 0) goto L_0x1046
            r9 = r3
            if (r2 == 0) goto L_0x1046
            r9 = r8
        L_0x1046:
            X.2i8 r2 = X.C50412i8.A00(r7)
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            java.lang.String r1 = "server-error"
            r2.A08 = r1
            java.lang.String r1 = r0.messageId
            r2.A07 = r1
            if (r6 != 0) goto L_0x105b
            r3 = r9
        L_0x105b:
            r2.A01 = r3
            X.39T r3 = r2.A01()
            r1 = 12
            byte[] r12 = X.AnonymousClass29O.A01(r1)
            java.lang.String r2 = r0.messageId
            r1 = 0
            X.C162457s7.A0J(r2, r1)
            X.2v2 r1 = new X.2v2
            r1.<init>((java.lang.String) r2)
            byte[] r5 = r0.mediaKey
            java.lang.String r2 = r0.messageId
            X.C18260x0.A0Q(r5, r2)
            X.C59432wu.A00(r5, r12)
            r4 = 0
            com.facebook.simplejni.NativeHolder r1 = r1.A00
            java.lang.Object r11 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r4, r2, r1, r5, r12)
            byte[] r11 = (byte[]) r11
            if (r6 == 0) goto L_0x10a0
            java.lang.String r10 = r0.messageId
            boolean r13 = r0.mediaFromMe
            X.2T2 r6 = new X.2T2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            r2 = 0
            r1 = 327(0x147, float:4.58E-43)
            android.os.Message r1 = android.os.Message.obtain(r4, r2, r1, r2, r6)
        L_0x1098:
            X.31C r0 = r0.A01
            java.util.concurrent.Future r0 = r0.A05(r1, r3)
            goto L_0x0d21
        L_0x10a0:
            java.lang.String r2 = r0.messageId
            java.lang.String r1 = r0.category
            X.2SM r5 = new X.2SM
            r6 = r7
            r7 = r9
            r8 = r2
            r9 = r1
            r10 = r11
            r11 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2 = 0
            r1 = 77
            android.os.Message r1 = android.os.Message.obtain(r2, r4, r1, r4, r5)
            goto L_0x1098
        L_0x10b7:
            r6 = 0
            r7 = r8
            if (r2 == 0) goto L_0x10bc
            r7 = r9
        L_0x10bc:
            X.C626936e.A06(r7)
            goto L_0x1038
        L_0x10c1:
            r9 = r3
            goto L_0x1014
        L_0x10c4:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob
            if (r1 == 0) goto L_0x1100
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r0 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob) r0
            X.2sr r1 = r0.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r1)
            X.2pX r3 = new X.2pX
            r3.<init>(r1)
            double r1 = r0.latitude
            r3.A00 = r1
            double r1 = r0.longitude
            r3.A01 = r1
            long r1 = r0.timestamp
            r3.A05 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "run send final live location retry job"
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            X.1fd r2 = r0.A04
            int r1 = r0.timeOffset
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.1EU r4 = r2.A02(r3, r1)
            goto L_0x1522
        L_0x1100:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob
            if (r1 == 0) goto L_0x114c
            com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob r0 = (com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob) r0
            X.2sr r1 = r0.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A05(r1)
            X.2pX r9 = new X.2pX
            r9.<init>(r1)
            double r1 = r0.latitude
            r9.A00 = r1
            double r1 = r0.longitude
            r9.A01 = r1
            long r1 = r0.timestamp
            r9.A05 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "run send final live location job"
            r2.append(r1)
            java.lang.String r1 = r0.A09()
            X.C18260x0.A1L(r2, r1)
            X.33o r10 = r0.A04
            java.lang.String r1 = r0.rawJid
            X.5Yw r5 = X.C95814uZ.A00
            X.4uZ r2 = r5.A05(r1)
            X.C626936e.A06(r2)
            java.lang.String r1 = r0.msgId
            X.2z0 r1 = X.AnonymousClass2z0.A04(r2, r1)
            X.1n8 r8 = r10.A08(r1)
            if (r8 == 0) goto L_0x15df
            java.lang.Object r4 = r10.A0R
            monitor-enter(r4)
            goto L_0x1589
        L_0x114c:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r1 == 0) goto L_0x1186
            com.whatsapp.jobqueue.job.SendEngagedReceiptJob r0 = (com.whatsapp.jobqueue.job.SendEngagedReceiptJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SendEngagedReceiptJob/onRun "
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1J(r2, r1)
            X.5Yw r2 = X.C95814uZ.A00
            java.lang.String r1 = r0.jidStr
            X.4uZ r7 = r2.A05(r1)
            boolean r1 = r7 instanceof X.C135166kE
            if (r1 == 0) goto L_0x1608
            long r4 = r0.originalMessageTimestamp
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x1608
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r1
            X.2sH r1 = r0.A00
            if (r1 != 0) goto L_0x15ff
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1186:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            if (r1 == 0) goto L_0x11a4
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = (com.whatsapp.jobqueue.job.SendDisableLiveLocationJob) r0
            java.lang.String r1 = r0.rawJid
            X.4uZ r12 = X.C18310x6.A0S(r1)
            if (r12 != 0) goto L_0x16ba
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "skip disable live location job; invalid jid: "
            r2.append(r1)
            java.lang.String r0 = r0.rawJid
            X.C18260x0.A1K(r2, r0)
            return
        L_0x11a4:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r1 == 0) goto L_0x11d4
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r0 = (com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r0
            X.2iJ r2 = new X.2iJ
            r2.<init>()
            X.2H2 r1 = r0.A01
            r2.A01 = r1
            java.lang.String r1 = r0.mediaEncHash
            r2.A08 = r1
            java.lang.String r5 = "md-msg-hist"
            r2.A07 = r5
            r8 = 0
            r2.A0A = r8
            X.1qP r3 = r2.A01()
            X.1i8 r4 = r0.A02
            r6 = 0
            r7 = r6
            r9 = r8
            X.2YO r2 = r4.A09(r5, r6, r7, r8, r9)
            X.4Ke r1 = new X.4Ke
            r1.<init>(r0, r8, r3)
            r2.A00(r1)
            return
        L_0x11d4:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.RotateSignedPreKeyJob
            if (r1 == 0) goto L_0x1289
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = (com.whatsapp.jobqueue.job.RotateSignedPreKeyJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "starting rotate signed pre key job"
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            X.33n r1 = r0.A01
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x127d
            X.33n r1 = r0.A01
            X.2Ov r1 = r1.A0D()
        L_0x11f9:
            byte[] r2 = r0.id
            byte[] r1 = r1.A01
            boolean r1 = java.util.Arrays.equals(r2, r1)
            if (r1 != 0) goto L_0x1214
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "aborting rotate signed pre key job due to id mismatch with latest"
            r2.append(r1)
        L_0x120c:
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1M(r2, r0)
            return
        L_0x1214:
            X.31C r1 = r0.A04
            java.lang.String r8 = r1.A03()
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>()
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            X.31C r6 = r0.A04
            byte[] r5 = r0.id
            byte[] r2 = r0.data
            byte[] r1 = r0.signature
            X.2Ov r3 = new X.2Ov
            r3.<init>(r5, r2, r1)
            X.1mm r1 = new X.1mm
            r1.<init>(r0, r7, r4)
            X.2OX r2 = new X.2OX
            r2.<init>(r1, r3, r8)
            r1 = 86
            android.os.Message r1 = X.C18290x4.A0J(r1, r2)
            java.util.concurrent.Future r1 = r6.A06(r1, r8)
            r1.get()
            int r3 = r7.get()
            r1 = 503(0x1f7, float:7.05E-43)
            if (r3 == r1) goto L_0x174a
            r2 = 409(0x199, float:5.73E-43)
            java.lang.String r1 = "server error code returned during rotate signed pre key job; errorCode="
            if (r3 != r2) goto L_0x1276
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r3, r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1M(r2, r1)
            java.lang.Object r4 = r4.get()
            byte[] r4 = (byte[]) r4
            if (r4 == 0) goto L_0x1ad9
            X.33n r1 = r0.A01
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x173c
            r0.A09(r4)
            return
        L_0x1276:
            if (r3 == 0) goto L_0x1ad9
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r3, r1)
            goto L_0x120c
        L_0x127d:
            X.2fm r2 = r0.A02
            r1 = 8
            java.lang.Object r1 = X.C48972fm.A00(r2, r0, r1)
            X.2Ov r1 = (X.C42612Ov) r1
            goto L_0x11f9
        L_0x1289:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.ReceiptProcessingJob
            if (r1 == 0) goto L_0x12c6
            com.whatsapp.jobqueue.job.ReceiptProcessingJob r0 = (com.whatsapp.jobqueue.job.ReceiptProcessingJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ReceiptProcessingJob/onRun/start param="
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            java.lang.String[] r1 = r0.keyId
            int r7 = r1.length
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r7)
            r6 = 0
            r4 = 0
        L_0x12a8:
            if (r4 >= r7) goto L_0x1762
            java.lang.String[] r1 = r0.keyRemoteChatJidRawString
            r1 = r1[r4]
            X.4uZ r3 = X.C18310x6.A0S(r1)
            if (r3 == 0) goto L_0x12c3
            boolean[] r1 = r0.keyFromMe
            boolean r2 = r1[r4]
            java.lang.String[] r1 = r0.keyId
            r1 = r1[r4]
            X.2z0 r1 = X.AnonymousClass2z0.A05(r3, r1, r2)
            r5.add(r1)
        L_0x12c3:
            int r4 = r4 + 1
            goto L_0x12a8
        L_0x12c6:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r1 == 0) goto L_0x1312
            com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r0 = (com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "ReceiptMultiTargetProcessingJob/onRun/start param="
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            java.lang.String r1 = r0.keyRemoteChatJidRawString
            X.4uZ r3 = X.C106405Yw.A04(r1)
            boolean r2 = r0.keyFromMe
            java.lang.String r1 = r0.keyId
            X.2z0 r7 = X.AnonymousClass2z0.A05(r3, r1, r2)
            java.lang.String r1 = r0.remoteJidString
            com.whatsapp.jid.Jid r6 = X.AnonymousClass32W.A01(r1)
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            int r5 = r1.length
            java.util.ArrayList r10 = X.AnonymousClass002.A0I(r5)
            r4 = 0
        L_0x12f8:
            if (r4 >= r5) goto L_0x179c
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            r1 = r1[r4]
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            if (r3 == 0) goto L_0x130f
            long[] r1 = r0.timestamp
            r1 = r1[r4]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.AnonymousClass0x2.A1F(r3, r1, r10)
        L_0x130f:
            int r4 = r4 + 1
            goto L_0x12f8
        L_0x1312:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.GetVNameCertificateJob
            if (r1 == 0) goto L_0x131a
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = (com.whatsapp.jobqueue.job.GetVNameCertificateJob) r0
            goto L_0x17c0
        L_0x131a:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r1 == 0) goto L_0x13be
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = (com.whatsapp.jobqueue.job.GetStatusPrivacyJob) r0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            X.2vr r6 = r0.A02
            X.2LF r5 = new X.2LF
            r5.<init>(r0, r2)
            X.6bK r1 = new X.6bK
            r1.<init>()
            X.31C r11 = r6.A03
            java.lang.String r15 = r11.A03()
            X.1VX r10 = r6.A02
            r4 = 3845(0xf05, float:5.388E-42)
            X.2vE r3 = X.C58422vE.A02
            boolean r3 = r10.A0Y(r3, r4)
            if (r3 == 0) goto L_0x1356
            X.8JP r9 = r6.A04
            int r8 = r15.hashCode()
            r7 = 154475307(0x9351b2b, float:2.1799857E-33)
            r9.markerStart(r7, r8)
            java.lang.String r4 = "iq_type"
            r3 = 121(0x79, float:1.7E-43)
            r9.markerAnnotate((int) r7, (int) r8, (java.lang.String) r4, (int) r3)
        L_0x1356:
            X.2vE r4 = X.C58422vE.A01
            r3 = 3843(0xf03, float:5.385E-42)
            boolean r3 = r10.A0Y(r4, r3)
            if (r3 == 0) goto L_0x13a8
            X.2sH r12 = r6.A01
            X.36K r14 = X.C58812vr.A00(r15)
            r3 = 18
            X.4KX r13 = new X.4KX
            r13.<init>(r1, r6, r5, r3)
            r16 = 121(0x79, float:1.7E-43)
            r18 = 32000(0x7d00, double:1.581E-319)
            r3 = 1
            X.C162457s7.A0J(r12, r3)
            r17 = 0
            r11.A0C(r12, r13, r14, r15, r16, r17, r18)
        L_0x137a:
            r4 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.get(r4, r3)
            int r2 = r2.get()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != r1) goto L_0x1ad9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server 500 error during get status privacy job"
            r2.append(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.C18270x1.A1I(r1, r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x13a8:
            X.36K r10 = X.C58812vr.A00(r15)
            r4 = 18
            X.4KX r3 = new X.4KX
            r3.<init>(r1, r6, r5, r4)
            r13 = 32000(0x7d00, double:1.581E-319)
            r12 = 121(0x79, float:1.7E-43)
            r8 = r11
            r9 = r3
            r11 = r15
            r8.A0K(r9, r10, r11, r12, r13)
            goto L_0x137a
        L_0x13be:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob
            if (r1 == 0) goto L_0x13ce
            com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob r0 = (com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob) r0
            com.whatsapp.jid.UserJid r2 = r0.A01
            if (r2 != 0) goto L_0x1804
            java.lang.String r0 = "GeneratePrivacyTokenJob/onRun Stored UserJid String was invalid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x13ce:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r1 == 0) goto L_0x141a
            com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob r0 = (com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob) r0
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>()
            X.4FS r5 = r0.A01
            X.7qP r4 = r0.A00
            java.util.Random r1 = r0.A02
            X.2zM r3 = new X.2zM
            r3.<init>(r1)
            X.3Tp r2 = new X.3Tp
            r2.<init>(r0, r6)
            X.0Df r1 = new X.0Df
            r1.<init>(r2, r4, r3, r5)
            r1.A05()
            int r1 = r6.get()
            if (r1 == 0) goto L_0x1ad9
            int r2 = r6.get()
            r1 = 404(0x194, float:5.66E-43)
            if (r2 == r1) goto L_0x1ad9
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "retriable error during delete account from hsm server job"
            java.lang.StringBuilder r1 = X.C18290x4.A0w(r1, r2)
            X.C18270x1.A1I(r1, r0)
            X.AnonymousClass000.A1B(r1, r2)
            java.lang.String r1 = r2.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x141a:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.BulkGetPreKeyJob
            if (r1 == 0) goto L_0x18b0
            com.whatsapp.jobqueue.job.BulkGetPreKeyJob r0 = (com.whatsapp.jobqueue.job.BulkGetPreKeyJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "starting bulk get pre key job"
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            X.31C r1 = r0.A01
            java.lang.String r6 = r1.A03()
            java.lang.Class<com.whatsapp.jid.DeviceJid> r2 = com.whatsapp.jid.DeviceJid.class
            java.lang.String[] r1 = r0.jids
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r4 = X.C627336j.A0B(r2, r1)
            java.lang.String[] r1 = r0.identityChangedJids
            if (r1 == 0) goto L_0x14b3
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r3 = X.C627336j.A0B(r2, r1)
        L_0x144f:
            int r1 = r0.context
            if (r1 == 0) goto L_0x1479
            X.1YT r2 = new X.1YT
            r2.<init>()
            boolean r1 = r3.isEmpty()
            java.lang.Boolean r1 = X.C18320x8.A0V(r1)
            r2.A00 = r1
            int r1 = r4.size()
            java.lang.Long r1 = X.AnonymousClass0x9.A0m(r1)
            r2.A02 = r1
            int r1 = r0.context
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.A01 = r1
            X.4FV r1 = r0.A00
            r1.BhD(r2)
        L_0x1479:
            X.31C r5 = r0.A01
            r1 = 0
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r1]
            java.lang.Object[] r4 = r4.toArray(r0)
            com.whatsapp.jid.Jid[] r4 = (com.whatsapp.jid.Jid[]) r4
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r1]
            java.lang.Object[] r3 = r3.toArray(r0)
            com.whatsapp.jid.Jid[] r3 = (com.whatsapp.jid.Jid[]) r3
            r0 = 87
            android.os.Message r2 = X.AnonymousClass0x7.A0G(r0)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "id"
            r1.putString(r0, r6)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "jids"
            r1.putParcelableArray(r0, r4)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "identityJids"
            r1.putParcelableArray(r0, r3)
            java.util.concurrent.Future r0 = r5.A06(r2, r6)
            goto L_0x0d21
        L_0x14b3:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            goto L_0x144f
        L_0x14b8:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x14bd }
            goto L_0x14c1
        L_0x14bd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x14c2 }
        L_0x14c1:
            throw r1     // Catch:{ all -> 0x14c2 }
        L_0x14c2:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x14c7 }
            throw r1
        L_0x14c7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x14cc:
            boolean r1 = r0.playedSelfFromPeer
            if (r1 == 0) goto L_0x14d3
            java.lang.String r0 = "SendPlayedReceiptJobV2/onRun receipt from peer, no need to send it again"
            goto L_0x151e
        L_0x14d3:
            X.2i8 r2 = new X.2i8
            r2.<init>()
            java.lang.Object r1 = r3.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r2.A02 = r1
            java.lang.String r1 = "receipt"
            r2.A05 = r1
            r2.A08 = r8
            java.lang.String[] r1 = r0.messageIds
            r1 = r1[r7]
            r2.A07 = r1
            java.lang.Object r1 = r3.second
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            r2.A01 = r1
            X.39T r6 = r2.A01()
            X.31C r5 = r0.A01
            java.lang.Object r1 = r3.first
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.4uZ r4 = X.C106405Yw.A03(r1)
            java.lang.Object r1 = r3.second
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.4uZ r3 = X.C106405Yw.A03(r1)
            java.lang.String[] r0 = r0.messageIds
            r2 = 0
            X.2QJ r1 = new X.2QJ
            r1.<init>(r4, r3, r8, r0)
            r0 = 38
            android.os.Message r0 = android.os.Message.obtain(r2, r7, r0, r7, r1)
            java.util.concurrent.Future r0 = r5.A05(r0, r6)
            r0.get()
            java.lang.String r0 = "SendPlayedReceiptJobV2/onRun done"
        L_0x151e:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x1522:
            X.33n r1 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            boolean r1 = r1.A0X()     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            if (r1 == 0) goto L_0x1550
            java.lang.String r1 = r0.rawDeviceJid     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.2ov r3 = X.AnonymousClass36G.A02(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.33n r2 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            byte[] r1 = r4.A0F()     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.2a1 r5 = X.C381025p.A01(r3, r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
        L_0x153e:
            java.lang.String r1 = r0.rawDeviceJid     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.C626936e.A06(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            com.whatsapp.jid.UserJid r3 = r1.userJid     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.2zu r2 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            java.lang.String r1 = r0.contextRawJid     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            if (r1 != 0) goto L_0x1561
            goto L_0x155f
        L_0x1550:
            X.2fm r3 = r0.A03     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            r2 = 2
            X.4IJ r1 = new X.4IJ     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            r1.<init>(r4, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            java.lang.Object r5 = X.C48972fm.A01(r3, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            X.2a1 r5 = (X.C45442a1) r5     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            goto L_0x153e
        L_0x155f:
            r4 = 0
            goto L_0x1565
        L_0x1561:
            X.4uZ r4 = X.C18310x6.A0S(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
        L_0x1565:
            java.lang.String r6 = r0.msgId     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            int r7 = r0.retryCount     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            java.util.concurrent.Future r1 = r2.A00(r3, r4, r5, r6, r7)     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x1571 }
            goto L_0x1577
        L_0x1571:
            r2 = move-exception
            java.lang.String r1 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x1577:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "sent final live location notifications"
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1L(r2, r0)
            return
        L_0x1589:
            X.2pX r2 = r8.A02     // Catch:{ all -> 0x15dc }
            boolean r1 = r9.equals(r2)     // Catch:{ all -> 0x15dc }
            if (r1 != 0) goto L_0x15a0
            if (r2 == 0) goto L_0x159d
            long r6 = r9.A05     // Catch:{ all -> 0x15dc }
            long r2 = r2.A05     // Catch:{ all -> 0x15dc }
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x159d
            monitor-exit(r4)     // Catch:{ all -> 0x15dc }
            goto L_0x15df
        L_0x159d:
            r10.A0W(r9, r8)     // Catch:{ all -> 0x15dc }
        L_0x15a0:
            monitor-exit(r4)     // Catch:{ all -> 0x15dc }
            X.34h r2 = r0.A03
            int r1 = r0.timeOffset
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.1EU r4 = r2.A02(r9, r1)
            X.33n r1 = r0.A01     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            boolean r1 = r1.A0X()     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            if (r1 == 0) goto L_0x15cd
            X.2a1 r4 = r0.A08(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
        L_0x15b9:
            java.lang.String r1 = r0.rawJid     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            X.4uZ r2 = r5.A05(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            X.2zu r1 = r0.A05     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            r3 = 0
            java.lang.String r5 = r0.msgId     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            r6 = 0
            java.util.concurrent.Future r1 = r1.A00(r2, r3, r4, r5, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            goto L_0x15ed
        L_0x15cd:
            X.2fm r3 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            r2 = 1
            X.4IJ r1 = new X.4IJ     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            r1.<init>(r4, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            java.lang.Object r4 = X.C48972fm.A01(r3, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            X.2a1 r4 = (X.C45442a1) r4     // Catch:{ InterruptedException | ExecutionException -> 0x15e7 }
            goto L_0x15b9
        L_0x15dc:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x15dc }
            throw r0
        L_0x15df:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "skip sending final live location job, final live location notification already sent"
            goto L_0x15f4
        L_0x15e7:
            r2 = move-exception
            java.lang.String r1 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x15ed:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "sent final live location notifications"
        L_0x15f4:
            r2.append(r1)
            java.lang.String r0 = r0.A09()
            X.C18260x0.A1L(r2, r0)
            return
        L_0x15ff:
            long r2 = r1.A0H()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x1608
            return
        L_0x1608:
            X.2i8 r6 = X.C50412i8.A00(r7)
            java.lang.String r5 = "receipt"
            r6.A05 = r5
            java.lang.String r2 = "engaged"
            r6.A08 = r2
            java.lang.String r1 = r0.messageId
            r6.A07 = r1
            long r3 = r0.loggableStanzaId
            r6.A00 = r3
            X.39T r3 = r6.A01()
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C162457s7.A0K(r7, r1)
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            r1 = 19
            X.1wk r4 = new X.1wk
            r4.<init>((com.whatsapp.jid.UserJid) r7, (int) r1)
            X.2rL r1 = X.C56052rL.A04(r5)
            X.C41032Ir.A09(r1, r4)
            X.36K r4 = r1.A0F()
            java.lang.String r8 = r0.messageId
            X.2rL r6 = X.C56052rL.A04(r5)
            r13 = 0
            r9 = 0
            r11 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r1 = X.C626836d.A0M(r8, r9, r11, r13)
            if (r1 == 0) goto L_0x1654
            java.lang.String r1 = "id"
            X.C56052rL.A0D(r6, r1, r8)
        L_0x1654:
            X.36K r6 = r6.A0F()
            java.lang.String r14 = r0.value
            java.lang.String r10 = r0.source
            java.lang.String r9 = "biz"
            X.2rL r8 = X.C56052rL.A04(r9)
            java.lang.String r7 = "source"
            java.util.ArrayList r1 = X.C35281wc.A00
            r8.A0L(r10, r7, r1)
            X.36K r8 = r8.A0F()
            X.2rL r7 = X.C56052rL.A04(r5)
            java.lang.String r1 = "type"
            X.C56052rL.A0D(r7, r1, r2)
            X.2rL r2 = X.C56052rL.A04(r9)
            r15 = 1
            r17 = r11
            r19 = r13
            boolean r1 = X.C626836d.A0M(r14, r15, r17, r19)
            if (r1 == 0) goto L_0x168e
            java.lang.String r1 = "value"
            X.C56052rL.A0D(r2, r1, r14)
        L_0x168e:
            r2.A0I(r8)
            X.C56052rL.A07(r2, r7)
            X.36K r2 = r7.A0F()
            X.2rL r1 = X.C56052rL.A04(r5)
            r1.A0I(r4)
            r1.A0I(r6)
            r1.A0I(r2)
            X.36K r2 = r1.A0F()
            X.31C r1 = r0.A01
            if (r1 != 0) goto L_0x16b4
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x16b4:
            r0 = 360(0x168, float:5.04E-43)
            r1.A07(r2, r3, r0)
            return
        L_0x16ba:
            X.33o r1 = r0.A00
            boolean r1 = r1.A0d(r12)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r1 == 0) goto L_0x16d4
            java.lang.String r1 = "skip disable live location job; sharing is currently enabled"
        L_0x16c9:
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1L(r2, r0)
            return
        L_0x16d4:
            java.lang.String r1 = "starting disable live location job"
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1L(r2, r1)
            X.2zu r1 = r0.A01
            long r3 = r0.sequenceNumber
            X.31C r7 = r1.A02
            java.lang.String r5 = r7.A04()
            X.2i8 r1 = X.C50412i8.A00(r12)
            java.lang.String r9 = "notification"
            r1.A05 = r9
            java.lang.String r2 = "location"
            r1.A08 = r2
            r1.A07 = r5
            X.39T r6 = r1.A01()
            r1 = 3
            X.39V[] r8 = new X.AnonymousClass39V[r1]
            java.lang.String r11 = "id"
            boolean r10 = X.AnonymousClass39V.A0F(r11, r5, r8)
            java.lang.String r1 = "type"
            boolean r5 = X.AnonymousClass39V.A0G(r1, r2, r8)
            java.lang.String r1 = "to"
            X.39V r2 = new X.39V
            r2.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r1)
            r1 = 2
            r8[r1] = r2
            X.39V[] r2 = new X.AnonymousClass39V[r5]
            java.lang.String r1 = java.lang.Long.toString(r3)
            X.AnonymousClass39V.A0B(r11, r1, r2, r10)
            java.lang.String r1 = "disable"
            X.36K r1 = X.AnonymousClass36K.A0I(r1, r2)
            X.36K r2 = X.AnonymousClass36K.A0F(r1, r9, r8)
            r1 = 81
            java.util.concurrent.Future r1 = r7.A07(r2, r6, r1)
            r1.get()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "done disable live location job"
            goto L_0x16c9
        L_0x173c:
            X.2fm r3 = r0.A02
            r2 = 4
            X.3by r1 = new X.3by
            r1.<init>(r0, r2, r4)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
            r0.submit(r1)
            return
        L_0x174a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "server 503 error during rotate signed pre key job"
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x1762:
            java.lang.String r1 = r0.remoteJidRawString
            com.whatsapp.jid.Jid r8 = X.AnonymousClass32W.A01(r1)
            java.lang.String r1 = r0.participantDeviceJidRawString
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            X.2z0[] r1 = new X.AnonymousClass2z0[r6]
            java.lang.Object[] r11 = r5.toArray(r1)
            X.2z0[] r11 = (X.AnonymousClass2z0[]) r11
            int r12 = r0.status
            long r13 = r0.timestamp
            r10 = 0
            r15 = 0
            X.3ZC r9 = r0.receiptPrivacyMode
            X.3Qs r6 = new X.3Qs
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15)
            X.3Qn r4 = r0.A00
            X.3dJ r3 = new X.3dJ
            r3.<init>()
            X.2m9 r2 = r4.A0Q
            r0 = 43
            X.3aM r1 = new X.3aM
            r1.<init>(r4, r6, r3, r0)
            r0 = 13
            r2.A02(r1, r0)
            r3.get()
            return
        L_0x179c:
            int r11 = r0.status
            r9 = 0
            r12 = 0
            X.3ZC r8 = r0.receiptPrivacyMode
            X.3Qr r5 = new X.3Qr
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.3Qn r4 = r0.A00
            X.3dJ r3 = new X.3dJ
            r3.<init>()
            X.2m9 r2 = r4.A0Q
            r0 = 43
            X.3aM r1 = new X.3aM
            r1.<init>(r4, r5, r3, r0)
            r0 = 13
            r2.A02(r1, r0)
            r3.get()
            return
        L_0x17c0:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.String r1 = "GetVNameCertificateJob/onRun, starting get vname certificate job"
            r2.append(r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.String r1 = r0.A08()     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            X.C18260x0.A1L(r2, r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            X.2dJ r2 = r0.A01     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.String r1 = r0.jid     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A09(r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.util.concurrent.Future r1 = r2.A00(r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            r1.get()     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.String r1 = "GetVNameCertificateJob/onRun, finished get vname certificate job"
            r2.append(r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.lang.String r1 = r0.A08()     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            X.C18260x0.A1L(r2, r1)     // Catch:{ Exception -> 0x1800, all -> 0x17f7 }
            java.util.concurrent.ConcurrentHashMap r1 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r0 = r0.jid
            r1.remove(r0)
            return
        L_0x17f7:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = com.whatsapp.jobqueue.job.GetVNameCertificateJob.A02
            java.lang.String r0 = r0.jid
            r1.remove(r0)
            throw r2
        L_0x1800:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x1802 }
        L_0x1802:
            r2 = move-exception
            throw r2
        L_0x1804:
            X.2sK r1 = r0.A00
            X.2K9 r1 = r1.A05(r2)
            if (r1 == 0) goto L_0x1896
            long r2 = r1.A00
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            if (r12 == 0) goto L_0x1897
            X.2sK r1 = r0.A00
            long r4 = r1.A02()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x1897
            X.31C r1 = r0.A02
            java.lang.String r14 = r1.A03()
            X.3dJ r10 = new X.3dJ
            r10.<init>()
            X.31C r15 = r0.A02
            r19 = 299(0x12b, float:4.19E-43)
            com.whatsapp.jid.UserJid r13 = r0.A01
            java.lang.String r11 = "trusted_contact"
            java.lang.String r9 = "jid"
            r8 = 3
            r7 = 2
            java.lang.String r6 = "type"
            r5 = 1
            r4 = 0
            X.39V[] r1 = new X.AnonymousClass39V[r8]
            X.AnonymousClass39V.A02(r13, r9, r1, r4)
            X.AnonymousClass39V.A0B(r6, r11, r1, r5)
            java.lang.String r11 = "t"
            X.39V r9 = new X.39V
            r9.<init>((java.lang.String) r11, (long) r2)
            r1[r7] = r9
            java.lang.String r2 = "token"
            X.36K r3 = X.AnonymousClass36K.A0I(r2, r1)
            java.lang.String r2 = "tokens"
            r1 = 0
            X.36K r9 = X.AnonymousClass36K.A0F(r3, r2, r1)
            X.39V[] r3 = X.AnonymousClass39V.A0H(r14, r4)
            X.AnonymousClass39V.A0E(r3, r5)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "privacy"
            X.AnonymousClass39V.A0B(r2, r1, r3, r7)
            java.lang.String r1 = "set"
            X.AnonymousClass39V.A0B(r6, r1, r3, r8)
            X.36K r17 = X.AnonymousClass36K.A0G(r9, r3)
            r2 = 8
            X.4KX r1 = new X.4KX
            r1.<init>(r10, r0, r12, r2)
            r20 = 32000(0x7d00, double:1.581E-319)
            r18 = r14
            r16 = r1
            r15.A0K(r16, r17, r18, r19, r20)
            r10.get()     // Catch:{ Exception -> 0x1891 }
            X.2pK r1 = r0.A03     // Catch:{ Exception -> 0x1891 }
            com.whatsapp.jid.UserJid r0 = r0.A01     // Catch:{ Exception -> 0x1891 }
            r1.A01(r0)     // Catch:{ Exception -> 0x1891 }
            return
        L_0x1891:
            r1 = move-exception
            java.lang.String r0 = "GeneratePrivacyTokenJob/onRun Failed to deliver Privacy Token generate request"
            goto L_0x1a8a
        L_0x1896:
            r12 = 0
        L_0x1897:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GeneratePrivacyTokenJob/onRun Token timestamp "
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = " missing or too old to send"
            X.C18260x0.A1M(r2, r1)
            X.2pK r1 = r0.A03
            com.whatsapp.jid.UserJid r0 = r0.A01
            r1.A01(r0)
            return
        L_0x18b0:
            boolean r1 = r0 instanceof X.AnonymousClass47V
            if (r1 == 0) goto L_0x1a3d
            X.47V r0 = (X.AnonymousClass47V) r0
            X.2GZ r1 = r0.A04
            if (r1 == 0) goto L_0x1a36
            X.1VX r3 = r1.A00
            r2 = 6267(0x187b, float:8.782E-42)
            X.2vE r1 = X.C58422vE.A02
            int r10 = r3.A0O(r1, r2)
            java.util.List r1 = r0.groupsToFetch
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r1.iterator()
            r6 = 0
        L_0x18d3:
            r5 = 0
        L_0x18d4:
            boolean r1 = r7.hasNext()
            r4 = 1
            if (r1 == 0) goto L_0x18fe
            java.lang.Object r3 = r7.next()
            X.3Z6 r3 = (X.AnonymousClass3Z6) r3
            java.lang.Object r1 = r3.second
            int r2 = X.AnonymousClass001.A0K(r1)
            if (r5 == 0) goto L_0x18f9
            int r1 = r5 + r2
            if (r1 < r10) goto L_0x18f9
            r9.add(r8)
            X.3Z6[] r1 = new X.AnonymousClass3Z6[r4]
            r1[r6] = r3
            java.util.List r8 = X.AnonymousClass8UF.A0p(r1)
            goto L_0x18d3
        L_0x18f9:
            r8.add(r3)
            int r5 = r5 + r2
            goto L_0x18d4
        L_0x18fe:
            boolean r1 = X.C18310x6.A1X(r8)
            if (r1 == 0) goto L_0x1907
            r9.add(r8)
        L_0x1907:
            java.util.List r1 = X.C73723fy.A0F(r9)
            java.lang.Object r3 = X.C73723fy.A03(r1)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GroupInfoBatchProcessor/FetchTruncatedGroupsJob/fetching additional\n          | group info; round="
            r2.append(r1)
            int r1 = r0.round
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r1 = X.AnonymousClass47V.A00(r1)
            com.whatsapp.util.Log.d((java.lang.String) r1)
            X.3dJ r2 = new X.3dJ
            r2.<init>()
            X.2L2 r7 = r0.A05
            if (r7 == 0) goto L_0x1a2f
            java.util.ArrayList r6 = X.C73783g4.A0d(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x1938:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x1959
            java.lang.Object r3 = r5.next()
            X.3Z6 r3 = (X.AnonymousClass3Z6) r3
            java.lang.Object r1 = r3.first
            java.lang.String r1 = (java.lang.String) r1
            X.1fJ r4 = X.AnonymousClass34R.A05(r1)
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.2zA r1 = new X.2zA
            r1.<init>(r4, r3)
            r6.add(r1)
            goto L_0x1938
        L_0x1959:
            X.43m r5 = new X.43m
            r5.<init>(r0, r2)
            X.31C r9 = r7.A01
            java.lang.String r12 = r9.A03()
            X.3YS r4 = new X.3YS
            r4.<init>(r12, r6)
            X.7SK r3 = r7.A00
            r1 = 4
            X.274 r6 = new X.274
            r6.<init>(r3, r1)
            r1 = 5
            X.274 r7 = new X.274
            r7.<init>(r3, r1)
            r13 = 20
            r14 = 32000(0x7d00, double:1.581E-319)
            X.66R r1 = r4.A02
            java.lang.Object r1 = r1.getValue()
            X.2Ir r1 = (X.C41032Ir) r1
            X.36K r11 = X.C41032Ir.A05(r1)
            r8 = 0
            X.4HW r3 = new X.4HW
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r3
            r9.A0K(r10, r11, r12, r13, r14)
            java.lang.Object r1 = r2.get()
            X.C162457s7.A0D(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = X.C73783g4.A0d(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x19a2:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x19ac
            X.C18270x1.A1L(r3, r2)
            goto L_0x19a2
        L_0x19ac:
            java.util.HashSet r5 = X.C73723fy.A0B(r3)
            java.util.List r1 = r0.groupsToFetch
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r1.iterator()
        L_0x19ba:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x19d3
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.3Z6 r1 = (X.AnonymousClass3Z6) r1
            java.lang.Object r1 = r1.first
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L_0x19ba
            r6.add(r2)
            goto L_0x19ba
        L_0x19d3:
            boolean r1 = X.AnonymousClass0x7.A1S(r6)
            if (r1 == 0) goto L_0x19fa
            int r1 = r0.round
            int r4 = r1 + 1
            int r3 = r0.params
            java.util.Set r1 = r0.fetchedGroups
            java.util.Set r2 = X.C73823g8.A01(r5, r1)
            X.47V r1 = new X.47V
            r1.<init>(r6, r2, r4, r3)
            X.2gy r0 = r0.A01
            if (r0 == 0) goto L_0x19f2
            r0.A02(r1)
            return
        L_0x19f2:
            java.lang.String r0 = "waJobManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x19fa:
            X.3Lq r4 = r0.A02
            if (r4 == 0) goto L_0x1a28
            int r3 = r0.params
            java.util.Set r0 = r0.fetchedGroups
            java.util.Set r0 = X.C73823g8.A01(r5, r0)
            java.util.ArrayList r2 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x1a0e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1a20
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            X.1fJ r0 = X.AnonymousClass34R.A05(r0)
            r2.add(r0)
            goto L_0x1a0e
        L_0x1a20:
            java.util.Set r0 = X.C73723fy.A0P(r2)
            r4.A0d(r0, r3)
            return
        L_0x1a28:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1a2f:
            java.lang.String r0 = "batchGetGroupInfoProtocolHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1a36:
            java.lang.String r0 = "groupInfoPipelineStrategyController"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x1a3d:
            boolean r1 = r0 instanceof X.AnonymousClass47H
            if (r1 == 0) goto L_0x1a8f
            X.47H r0 = (X.AnonymousClass47H) r0
            X.31C r6 = r0.A02
            if (r6 == 0) goto L_0x1ad9
            X.2oj r1 = r0.A01
            if (r1 == 0) goto L_0x1ad9
            java.lang.String r0 = r0.groupJidRawString
            X.1fJ r5 = X.AnonymousClass34R.A05(r0)
            X.3dJ r4 = new X.3dJ
            r4.<init>()
            r0 = 1
            X.4KT r7 = new X.4KT
            r7.<init>(r1, r0, r4)
            java.lang.String r9 = r6.A03()
            java.lang.String r0 = "membership_approval_requests"
            X.36K r3 = X.AnonymousClass36K.A0H(r0)
            X.39V[] r2 = X.AnonymousClass0x9.A1W()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.AnonymousClass39V.A04(r1, r0, r2)
            java.lang.String r0 = "id"
            X.AnonymousClass39V.A09(r0, r9, r2)
            X.36K r8 = X.AnonymousClass36K.A0C(r5, r3, r2)
            r10 = 355(0x163, float:4.97E-43)
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0K(r7, r8, r9, r10, r11)
            r4.get()     // Catch:{ Exception -> 0x1a87 }
            goto L_0x1a8e
        L_0x1a87:
            r1 = move-exception
            java.lang.String r0 = "GroupFetchAllMembershipApprovalRequestsJob/onRun Failed to fetch pending requests"
        L_0x1a8a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            throw r1
        L_0x1a8e:
            return
        L_0x1a8f:
            X.47K r0 = (X.AnonymousClass47K) r0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r4 = r0.A01
            if (r4 != 0) goto L_0x1aa6
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MemberSuggestedGroupsSyncJob/missing memberSuggestedGroupsManager; "
        L_0x1a9b:
            r2.append(r1)
            java.lang.String r0 = r0.A08()
            X.C18260x0.A1K(r2, r0)
            return
        L_0x1aa6:
            X.2so r2 = r0.A00
            if (r2 == 0) goto L_0x1abd
            X.1fJ r1 = r0.A03
            com.whatsapp.jid.GroupJid r1 = r2.A00(r1)
        L_0x1ab0:
            X.1fJ r3 = X.AnonymousClass34R.A03(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            if (r3 != 0) goto L_0x1abf
            java.lang.String r1 = "MemberSuggestedGroupsSyncJob/missing hintJid; "
            goto L_0x1a9b
        L_0x1abd:
            r1 = 0
            goto L_0x1ab0
        L_0x1abf:
            java.lang.String r1 = "MemberSuggestedGroupsSyncJob/fetching; "
            r2.append(r1)
            java.lang.String r1 = r0.A08()
            X.C18260x0.A1J(r2, r1)
            X.1fJ r2 = r0.A03
            X.2WQ r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L_0x1ad6
            boolean r0 = r1.A00()
        L_0x1ad6:
            r4.A05(r2, r3, r0)
        L_0x1ad9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A07():void");
    }

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }
}
