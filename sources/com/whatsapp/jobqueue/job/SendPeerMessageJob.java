package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1A4;
import X.AnonymousClass24A;
import X.AnonymousClass2z0;
import X.AnonymousClass318;
import X.AnonymousClass31C;
import X.AnonymousClass36G;
import X.AnonymousClass36K;
import X.AnonymousClass39T;
import X.AnonymousClass3H0;
import X.AnonymousClass3ZC;
import X.AnonymousClass49X;
import X.AnonymousClass4BB;
import X.AnonymousClass4II;
import X.C1228065u;
import X.C129526aS;
import X.C135136kB;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C28931i0;
import X.C30301mE;
import X.C30841nI;
import X.C30851nJ;
import X.C381025p;
import X.C389229y;
import X.C45442a1;
import X.C45612aI;
import X.C47222cu;
import X.C48972fm;
import X.C49072fw;
import X.C50412i8;
import X.C51822kR;
import X.C51832kS;
import X.C54222oN;
import X.C55492qR;
import X.C56302rl;
import X.C56662sM;
import X.C56862sg;
import X.C56972sr;
import X.C59542x5;
import X.C61102zi;
import X.C621133n;
import X.C624034w;
import X.C624134x;
import X.C626936e;
import X.C64333Db;
import X.C66383Le;
import X.C66653Mg;
import X.C85284Fq;
import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public class SendPeerMessageJob extends Job implements C1228065u {
    public static final DeviceJid[] A0E = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C55492qR A01;
    public transient C28931i0 A02;
    public transient C621133n A03;
    public transient C48972fm A04;
    public transient C56662sM A05;
    public transient AnonymousClass318 A06;
    public transient C56302rl A07;
    public transient C66383Le A08;
    public transient C59542x5 A09;
    public transient AnonymousClass31C A0A;
    public transient C66653Mg A0B;
    public transient C45612aI A0C;
    public final transient byte[] A0D;
    public final long peerMessageRowId;
    public final int retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPeerMessageJob(com.whatsapp.jid.DeviceJid r4, X.C30301mE r5, byte[] r6, int r7) {
        /*
            r3 = this;
            byte r2 = r5.A1I
            r0 = 35
            if (r2 == r0) goto L_0x008a
            r0 = 47
            if (r2 == r0) goto L_0x0086
            r0 = 50
            if (r2 == r0) goto L_0x0082
            r0 = 84
            if (r2 == r0) goto L_0x007e
            r0 = 38
            if (r2 == r0) goto L_0x007a
            r0 = 39
            if (r2 == r0) goto L_0x0076
            r0 = 70
            if (r2 == r0) goto L_0x0072
            r0 = 71
            if (r2 == r0) goto L_0x006e
            r0 = 75
            if (r2 == r0) goto L_0x006a
            r0 = 76
            if (r2 != r0) goto L_0x008d
            java.lang.String r1 = "peer_data_sticker_request_response"
        L_0x002d:
            X.2gM r2 = X.C49332gM.A01()
            r0 = 1
            r2.A02 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "-"
            java.lang.String r0 = X.C624134x.A0C(r5, r0, r1)
            r2.A00 = r0
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.A05(r0)
            com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            r0.<init>(r4)
            r2.A05(r0)
            if (r6 == 0) goto L_0x005a
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r4, r6)
            r2.A05(r0)
        L_0x005a:
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            long r0 = r5.A1L
            r3.peerMessageRowId = r0
            r3.A0D = r6
            r3.retryCount = r7
            return
        L_0x006a:
            java.lang.String r1 = "peer_data_link_preview_request_response"
            goto L_0x002d
        L_0x006e:
            java.lang.String r1 = "peer_data_request_unknown_response"
            goto L_0x002d
        L_0x0072:
            java.lang.String r1 = "peer_data_operation_request"
            goto L_0x002d
        L_0x0076:
            java.lang.String r1 = "syncd-key-request"
            goto L_0x002d
        L_0x007a:
            java.lang.String r1 = "syncd-key-share"
            goto L_0x002d
        L_0x007e:
            java.lang.String r1 = "peer_data_placeholder_resend_response"
            goto L_0x002d
        L_0x0082:
            java.lang.String r1 = "syncd-fatal-exception-notification"
            goto L_0x002d
        L_0x0086:
            java.lang.String r1 = "sync-security-settings"
            goto L_0x002d
        L_0x008a:
            java.lang.String r1 = "device-history-sync-notification"
            goto L_0x002d
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot send message of type "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPeerMessageJob.<init>(com.whatsapp.jid.DeviceJid, X.1mE, byte[], int):void");
    }

    public void A07() {
        String str;
        C45442a1 r2;
        List list;
        String str2;
        String str3;
        boolean A0Y = this.A00.A0Y();
        if (C66653Mg.A00(this.A0B) || A0Y) {
            if (C56972sr.A04(this.A00) == null) {
                str = "SendPeerMessageJob/onRun/no my user id (unregistered?).";
            } else {
                C30301mE A012 = this.A07.A01(this.peerMessageRowId);
                if (A012 == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SendPeerMessageJob/onRun/no message found (");
                    A0o.append(this.peerMessageRowId);
                    str = AnonymousClass000.A0X(").", A0o);
                } else {
                    DeviceJid deviceJid = A012.A00;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("SendPeerMessageJob/onRun/start send");
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("; peer_msg_row_id=");
                    A0o2.append(AnonymousClass001.A0k(A0o3, this.peerMessageRowId));
                    A0o2.append("; type=");
                    byte b = A012.A1I;
                    A0o2.append(b);
                    A0o2.append("; recipient=");
                    A0o2.append(deviceJid);
                    AnonymousClass2z0 A082 = C624134x.A08(A012, "; id=", A0o2);
                    String str4 = A082.A01;
                    C18260x0.A1L(A0o2, str4);
                    C129526aS A042 = this.A06.A04();
                    if (deviceJid == null || A042.isEmpty()) {
                        str = "SendPeerMessageJob/onRun/no target device or no companion device exists.";
                    } else if (!A042.contains(deviceJid)) {
                        str = "SendPeerMessageJob/onRun/target device is not in db.";
                    } else {
                        C50412i8 A002 = C50412i8.A00(deviceJid);
                        A002.A05 = "message";
                        A002.A07 = str4;
                        AnonymousClass1A4 A0R = C18300x5.A0R();
                        try {
                            this.A08.A01(C47222cu.A00(A0R).A01(), A012);
                        } catch (AnonymousClass24A unused) {
                            C18260x0.A1Q(AnonymousClass001.A0o(), "SendPeerMessageJob/getPlaintextFromE2EForOwn/fail to build protobuf message, key=", A082);
                        }
                        byte[] A1Z = C18290x4.A1Z(A0R);
                        try {
                            if (this.A03.A0X()) {
                                r2 = C381025p.A01(AnonymousClass36G.A02(deviceJid), this.A03, A1Z);
                            } else {
                                r2 = (C45442a1) C48972fm.A01(this.A04, new AnonymousClass4II(deviceJid, this, A1Z, 3));
                            }
                        } catch (Exception unused2) {
                            StringBuilder A0o4 = AnonymousClass001.A0o();
                            A0o4.append("SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=");
                            C18260x0.A1K(A0o4, deviceJid.getRawString());
                            r2 = null;
                        }
                        PhoneUserJid phoneUserJid = null;
                        if (A012 instanceof AnonymousClass4BB) {
                            list = ((AnonymousClass4BB) A012).BDE();
                        } else {
                            list = null;
                        }
                        if (A012.A0P == null || this.retryCount <= 0) {
                            str2 = "text";
                        } else {
                            str2 = "pay";
                        }
                        if (b != 73 && A082.A02 && (deviceJid instanceof C135136kB)) {
                            phoneUserJid = C56662sM.A00(this.A05, deviceJid.userJid);
                        }
                        String A003 = this.A0C.A00(deviceJid, A012, A082);
                        AnonymousClass39T A013 = A002.A01();
                        AnonymousClass31C r12 = this.A0A;
                        int i = this.retryCount;
                        String str5 = A012.A14;
                        Map emptyMap = Collections.emptyMap();
                        int A0k = A012.A0k();
                        int i2 = A012.A01;
                        Map emptyMap2 = Collections.emptyMap();
                        Integer valueOf = Integer.valueOf(A012.A05);
                        if ((A012 instanceof C30851nJ) || (A012 instanceof C30841nI)) {
                            str3 = "high";
                        } else {
                            str3 = null;
                        }
                        r12.A05(Message.obtain((Handler) null, 0, 8, 0, new C54222oN((C624034w) null, (DeviceJid) null, deviceJid, phoneUserJid, (UserJid) null, (C49072fw) null, (C51822kR) null, (C51832kS) null, r2, A082, (AnonymousClass3ZC) null, (AnonymousClass36K) null, A013, (Integer) null, valueOf, A003, (String) null, str5, str2, (String) null, (String) null, "peer", str3, (String) null, (String) null, (String) null, (List) null, list, emptyMap, (Map) null, emptyMap2, b, i, A0k, i2, 0, 0, false, false)), A013).get();
                        A012.A01 = true;
                        C56302rl r4 = this.A07;
                        long j = A012.A1L;
                        C626936e.A00();
                        C85284Fq A0C2 = r4.A00.A0C();
                        try {
                            ContentValues A062 = AnonymousClass0x9.A06();
                            C56862sg A014 = AnonymousClass3H0.A01(A062, A0C2, "acked", 1);
                            String[] strArr = new String[1];
                            C18280x3.A1R(strArr, 0, j);
                            if (((long) A014.A05(A062, "peer_messages", "_id = ?", "PeerMessagesTable.SET_MESSAGE_ACKED", strArr)) == 0) {
                                C18260x0.A11("peer-messages-store/markAckReceived/cannot set ack received for message: ", AnonymousClass001.A0o(), j);
                            }
                            A0C2.close();
                            Iterator A032 = C61102zi.A03(this.A02);
                            while (A032.hasNext()) {
                                ((AnonymousClass49X) A032.next()).BSh(A012);
                            }
                            StringBuilder A0o5 = AnonymousClass001.A0o();
                            A0o5.append("SendPeerMessageJob/onRun/end send");
                            StringBuilder A0o6 = AnonymousClass001.A0o();
                            A0o6.append("; peer_msg_row_id=");
                            A0o5.append(AnonymousClass001.A0k(A0o6, this.peerMessageRowId));
                            C18260x0.A0s("; id=", str4, A0o5);
                            return;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                }
            }
            Log.e(str);
            return;
        }
        Log.w("SendPeerMessageJob/onRun/wap4 disable.");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A00 = A012.BL4();
        this.A0A = A012.BLC();
        this.A04 = (C48972fm) A012.AW6.get();
        this.A05 = (C56662sM) A012.AaX.get();
        this.A07 = (C56302rl) A012.AQS.get();
        this.A03 = C64333Db.A2v(A012);
        this.A06 = (AnonymousClass318) A012.AZQ.get();
        this.A0B = (C66653Mg) A012.AN6.get();
        this.A01 = (C55492qR) A012.AR3.get();
        this.A0C = (C45612aI) A012.AcK.A00.AA6.get();
        this.A09 = A012.AnC();
        this.A08 = (C66383Le) A012.AC5.get();
        this.A02 = (C28931i0) A012.AQN.get();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
