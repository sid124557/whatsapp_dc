package X;

import android.text.TextUtils;
import com.whatsapp.calling.CallSummary;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.30y  reason: invalid class name and case insensitive filesystem */
public class C614830y {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C106155Xv A02;
    public final C107285b3 A03;
    public final C45812ac A04;
    public final C46332bS A05;
    public final AnonymousClass33T A06;
    public final C56762sW A07;
    public final C56322rn A08;
    public final C620533h A09;
    public final C55422qK A0A;
    public final AnonymousClass1VX A0B;
    public final C72173dI A0C;
    public final C187958y5 A0D;
    public final AnonymousClass4FS A0E;
    public final boolean A0F;

    public int A01(CallGroupInfo callGroupInfo, AnonymousClass3ZF r9) {
        r9.A0C(2);
        int i = 0;
        if (callGroupInfo != null) {
            CallParticipant[] callParticipantArr = callGroupInfo.participants;
            int length = callParticipantArr.length;
            int i2 = 0;
            while (i < length) {
                CallParticipant callParticipant = callParticipantArr[i];
                if ("connected".equals(callParticipant.state)) {
                    r9.A0I(callParticipant.jid, 5);
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        boolean A022 = C615631i.A02();
        C56762sW r0 = this.A07;
        if (A022) {
            r0.A06(r9);
            return i;
        }
        r0.A07(r9);
        return i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bc, code lost:
        if (r14.A0R() == false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3ZF A02(com.whatsapp.jid.DeviceJid r40, com.whatsapp.jid.UserJid r41, java.lang.String r42, int r43, long r44, boolean r46) {
        /*
            r39 = this;
            r2 = 0
            r1 = r39
            r5 = r41
            r0 = r42
            r4 = r43
            X.3ZF r10 = r1.A03(r5, r0, r4, r2)
            if (r10 != 0) goto L_0x01cf
            X.3ZF r11 = r1.A04(r0)
            r31 = r44
            if (r11 == 0) goto L_0x0197
            java.lang.String r0 = X.C627436k.A08(r0)
            X.39J r9 = new X.39J
            r9.<init>(r4, r5, r0, r2)
            int r0 = r11.A01
            X.2sW r8 = r1.A07
            if (r0 != 0) goto L_0x01cb
            X.3ZF r0 = r8.A02(r9)
            boolean r2 = X.AnonymousClass000.A1X(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread callLog already exists for this key="
            X.C18260x0.A0l(r9, r0, r1, r2)
            java.util.List r0 = r11.A08()
            java.util.ArrayList r13 = X.AnonymousClass000.A0p(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r2.next()
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r1 = r0.A02
            int r0 = r0.A00
            X.AnonymousClass3ZE.A00(r1, r13, r0)
            goto L_0x0043
        L_0x0057:
            X.1mG r0 = r11.A0D
            r18 = r0
            r29 = -1
            boolean r0 = r11.A0L
            r35 = r0
            int r0 = r11.A01
            r25 = r0
            int r0 = r11.A00
            r26 = r0
            X.22I r0 = r11.A06
            r20 = r0
            long r4 = r11.A03
            r7 = 0
            boolean r0 = r11.A0F
            r37 = r0
            com.whatsapp.jid.GroupJid r0 = r11.A05
            r17 = r0
            boolean r15 = r11.A0K
            com.whatsapp.jid.DeviceJid r14 = r11.A0C
            java.lang.String r12 = r11.A08
            int r6 = r11.A02
            X.2mt r3 = r11.A07
            X.2l8 r2 = r11.A0I
            int r1 = r11.A0H
            X.2ef r0 = r11.A0J
            X.3ZF r10 = new X.3ZF
            r16 = r14
            r19 = r9
            r21 = r3
            r22 = r0
            r23 = r12
            r24 = r13
            r27 = r6
            r28 = r1
            r33 = r4
            r36 = r7
            r38 = r15
            r14 = r10
            r15 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38)
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r8.A0P
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r2.writeLock()
            r0.lock()
            X.2rS r3 = r8.A08     // Catch:{ all -> 0x0192 }
            monitor-enter(r3)     // Catch:{ all -> 0x0192 }
            r16 = 1
            boolean r0 = r10.A0F     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x00be
            boolean r0 = r10.A0R()     // Catch:{ all -> 0x018f }
            r1 = 1
            if (r0 != 0) goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            java.lang.String r0 = "Only regular call log is stored here"
            X.C626936e.A0E(r1, r0)     // Catch:{ all -> 0x018f }
            X.3dV r0 = r3.A05     // Catch:{ all -> 0x018f }
            X.4Fq r15 = r0.A04()     // Catch:{ all -> 0x018f }
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x0185 }
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x017b }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "call_log"
            java.lang.String r13 = "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?"
            r0 = 4
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x017b }
            X.34p r1 = r3.A03     // Catch:{ all -> 0x017b }
            X.39J r4 = r11.A0E     // Catch:{ all -> 0x017b }
            com.whatsapp.jid.UserJid r0 = r4.A01     // Catch:{ all -> 0x017b }
            long r0 = r1.A05(r0)     // Catch:{ all -> 0x017b }
            X.C18280x3.A1R(r12, r7, r0)     // Catch:{ all -> 0x017b }
            boolean r0 = r4.A03     // Catch:{ all -> 0x017b }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "1"
        L_0x00ed:
            r12[r16] = r0     // Catch:{ all -> 0x017b }
            java.lang.String r1 = r4.A02     // Catch:{ all -> 0x017b }
            r0 = 2
            r12[r0] = r1     // Catch:{ all -> 0x017b }
            int r0 = r4.A00     // Catch:{ all -> 0x017b }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x017b }
            r0 = 3
            r12[r0] = r1     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "deleteCallLog/DELETE_CALL_LOG"
            r6.A07(r5, r13, r0, r12)     // Catch:{ all -> 0x017b }
            X.39J r0 = r10.A0E     // Catch:{ all -> 0x017b }
            android.content.ContentValues r1 = r3.A00(r0, r10)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r6.A09(r5, r0, r1)     // Catch:{ all -> 0x017b }
            r10.A0F(r0)     // Catch:{ all -> 0x017b }
            X.2mt r5 = r10.A07     // Catch:{ all -> 0x017b }
            goto L_0x0117
        L_0x0114:
            java.lang.String r0 = "0"
            goto L_0x00ed
        L_0x0117:
            if (r5 == 0) goto L_0x0126
            long r0 = r10.A05()     // Catch:{ all -> 0x017b }
            r5.A00 = r0     // Catch:{ all -> 0x017b }
            X.2rn r1 = r3.A04     // Catch:{ all -> 0x017b }
            X.2mt r0 = r10.A07     // Catch:{ all -> 0x017b }
            r1.A06(r0)     // Catch:{ all -> 0x017b }
        L_0x0126:
            r10.A0B()     // Catch:{ all -> 0x017b }
            r3.A05(r10)     // Catch:{ all -> 0x017b }
            r14.A00()     // Catch:{ all -> 0x017b }
            r14.close()     // Catch:{ all -> 0x0185 }
            r15.close()     // Catch:{ all -> 0x018f }
            monitor-exit(r3)     // Catch:{ all -> 0x0192 }
            X.2f1 r0 = r8.A00     // Catch:{ all -> 0x0192 }
            r0.A01(r11)     // Catch:{ all -> 0x0192 }
            r0.A00(r10)     // Catch:{ all -> 0x0192 }
            X.2m9 r3 = r8.A07     // Catch:{ all -> 0x0192 }
            r0 = 5
            X.3Zw r1 = new X.3Zw     // Catch:{ all -> 0x0192 }
            r1.<init>(r8, r0, r10)     // Catch:{ all -> 0x0192 }
            r0 = 16
            r3.A01(r1, r0)     // Catch:{ all -> 0x0192 }
            X.AnonymousClass0x7.A1M(r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CallsMessageStore/replaceCallLogOnCurrentThread; callLog.key="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; callLog.row_id="
            r2.append(r0)
            long r0 = r11.A05()
            r2.append(r0)
            java.lang.String r0 = "; new key="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = "; new row_id="
            r2.append(r0)
            long r0 = r10.A05()
            X.C18260x0.A1I(r2, r0)
            return r10
        L_0x017b:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0184
        L_0x0180:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0185 }
        L_0x0184:
            throw r1     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x018a }
            goto L_0x018e
        L_0x018a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x018f }
        L_0x018e:
            throw r1     // Catch:{ all -> 0x018f }
        L_0x018f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            X.AnonymousClass0x7.A1M(r2)
            throw r0
        L_0x0197:
            X.2sW r3 = r1.A07
            java.lang.String r1 = X.C627436k.A08(r0)
            r13 = 0
            java.lang.String r0 = "CallsMessageStore/addCallLogSynchronously "
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.39J r0 = new X.39J
            r0.<init>(r4, r5, r1, r2)
            r3.A05(r0)
            X.3ZF r10 = new X.3ZF
            r11 = r40
            r16 = r46
            r12 = r0
            r14 = r31
            r10.<init>(r11, r12, r13, r14, r16)
            r3.A08(r10)
            X.1VX r2 = r3.A0J
            r1 = 6120(0x17e8, float:8.576E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            r0 = 1
            if (r1 < r0) goto L_0x01cf
            r3.A09(r10)
            return r10
        L_0x01cb:
            X.3ZF r10 = r8.A03(r9, r11)
        L_0x01cf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614830y.A02(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.lang.String, int, long, boolean):X.3ZF");
    }

    public void A06(GroupJid groupJid, AnonymousClass3ZF r11, String str) {
        GroupJid groupJid2 = groupJid;
        if (groupJid != null) {
            String str2 = str;
            if (!TextUtils.isEmpty(str) && this.A0F) {
                C18260x0.A0s("voip/setCallLogIsScheduledCall scheduledId:", str, AnonymousClass001.A0o());
                r11.A0D(1);
                C48292ef r0 = new C48292ef(str);
                synchronized (r11) {
                    r11.A0M = true;
                    r11.A0J = r0;
                }
                C55422qK r3 = this.A0A;
                r3.A02.A01(new C70463aX(r3, groupJid2, str2, 3, r11.A05()), 68);
            }
        }
    }

    public void A0A(AnonymousClass3ZF r10, boolean z) {
        C53312mt r3;
        synchronized (r10) {
            if (r10.A0K != z) {
                r10.A0M = true;
            }
            r10.A0K = z;
        }
        String str = r10.A0E.A02;
        String A072 = C627436k.A07(str);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("voip/setCallLogIsJoinableGroupCall callId:");
        A0o.append(A072);
        C18260x0.A1E(" joinable:", A0o, z);
        if (z) {
            C626936e.A0D(AnonymousClass000.A1W(r10.A0C), "Can't rejoin from call logs missing call creator");
            C46332bS r32 = this.A05;
            r32.A04.execute(new C70183a5(r32, 42, r10));
            if (r10.A07 == null) {
                GroupJid groupJid = r10.A05;
                if (groupJid != null) {
                    this.A0E.BkO(new C33401sw(new AnonymousClass3EX(this, str), this.A08, groupJid), new Void[0]);
                }
                r3 = new C53312mt(r10.A05, str, r10.A05(), r10.A0L);
            } else {
                return;
            }
        } else {
            C46332bS r33 = this.A05;
            r33.A04.execute(new C70183a5(r33, 41, r10));
            if (r10.A07 != null) {
                r3 = null;
            } else {
                this.A02.A07(A072);
                return;
            }
        }
        r10.A0J(r3);
    }

    public void A0B(AnonymousClass3ZF r11, AnonymousClass4CY[] r12) {
        String str;
        int i = 0;
        if (r12 != null) {
            boolean A0G = C627436k.A0G(this.A0B);
            C107285b3 r5 = this.A03;
            boolean A0t = r5.A0t(r11);
            HashSet A0K = AnonymousClass002.A0K();
            HashSet A0K2 = AnonymousClass002.A0K();
            for (AnonymousClass4CY r1 : r12) {
                if (r1 != null) {
                    A0K.add(r1.getCallUserJid());
                    if (r1.isCallConnected()) {
                        A0K2.add(r1.getCallUserJid());
                    }
                }
            }
            Iterator A012 = AnonymousClass3ZF.A01(r11);
            while (A012.hasNext()) {
                AnonymousClass3ZE r0 = (AnonymousClass3ZE) A012.next();
                if (r0 != null) {
                    A0K.add(r0.A02);
                }
            }
            Iterator it = A0K.iterator();
            while (true) {
                int i2 = 2;
                if (!it.hasNext()) {
                    break;
                }
                UserJid A0T = C18310x6.A0T(it);
                if (A0t || A0G || this.A0F) {
                    boolean contains = A0K2.contains(A0T);
                    if (A0t || A0G) {
                        if (contains) {
                            i2 = 5;
                        } else if (r11.A0T(A0T)) {
                            i2 = 100;
                        }
                    }
                    r11.A0I(A0T, i2);
                    if (contains) {
                        i++;
                    }
                }
            }
            if (i >= 2) {
                GroupJid groupJid = r11.A05;
                if (r11.A0J != null) {
                    str = r11.A0J.A00;
                } else {
                    str = null;
                }
                r5.A0X(groupJid, str);
                return;
            }
            return;
        }
        C626936e.A0D(false, "Empty list of participant jids when updating call log");
    }

    public static void A00(CallInfo callInfo, AnonymousClass3ZF r5) {
        Iterator A0q = AnonymousClass000.A0q(callInfo.participants);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            UserJid A0P = C18320x8.A0P(A0w);
            int i = ((C102995Lb) A0w.getValue()).A02;
            int i2 = 2;
            if (i == 1) {
                i2 = 5;
            }
            r5.A0I(A0P, i2);
        }
    }

    public AnonymousClass3ZF A03(UserJid userJid, String str, int i, boolean z) {
        return this.A07.A02(new AnonymousClass39J(i, userJid, C627436k.A08(str), z));
    }

    public AnonymousClass3ZF A04(String str) {
        C53312mt A042 = this.A08.A04(C627436k.A08(str));
        if (A042 != null) {
            return this.A07.A01(A042.A00);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (X.C627436k.A09(r5.A00, r5.A02) != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.GroupJid r7, X.AnonymousClass3ZF r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            X.2mt r0 = r8.A07
            if (r0 == 0) goto L_0x0012
            com.whatsapp.jid.GroupJid r0 = r0.A01
            boolean r0 = X.AnonymousClass75J.A00(r0, r7)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "VoiceService/setGroupJidInCallLog: mismatched groupJid in joinableCallLog and callLog"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            if (r7 == 0) goto L_0x0028
            if (r10 == 0) goto L_0x0028
            X.2sr r0 = r6.A01
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "voip/setCallLogIsAudioChat true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            r8.A0D(r0)
        L_0x0028:
            com.whatsapp.jid.GroupJid r0 = r8.A05
            if (r0 != 0) goto L_0x0011
            if (r7 == 0) goto L_0x0011
            r8.A0H(r7)
            X.2sW r3 = r6.A07
            boolean r0 = X.C18320x8.A1U(r9)
            com.whatsapp.jid.GroupJid r1 = r8.A05
            if (r1 == 0) goto L_0x0011
            if (r0 != 0) goto L_0x0011
            X.2ss r0 = r3.A0A
            X.31A r0 = X.C56982ss.A00(r0, r1)
            if (r0 == 0) goto L_0x0011
            X.1VX r2 = r3.A0J
            com.whatsapp.jid.GroupJid r0 = r8.A05
            if (r0 == 0) goto L_0x0056
            r1 = 4895(0x131f, float:6.86E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0056
            return
        L_0x0056:
            X.2Pc r5 = r3.A03
            X.35J r1 = r5.A03
            com.whatsapp.jid.GroupJid r0 = r8.A05
            X.2z0 r4 = X.AnonymousClass35J.A01(r0, r1)
            long r0 = r8.A0B
            X.1o6 r2 = new X.1o6
            r2.<init>(r4, r0)
            int r1 = r8.A0H
            r0 = 2
            if (r1 != r0) goto L_0x0076
            X.1VX r1 = r5.A02
            X.2sr r0 = r5.A00
            boolean r0 = X.C627436k.A09(r0, r1)
            if (r0 == 0) goto L_0x007a
        L_0x0076:
            int r0 = r8.A0H
            r2.A00 = r0
        L_0x007a:
            X.39J r1 = r8.A0E
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x009b
            X.2sr r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r0)
        L_0x0086:
            r2.A1J(r0)
            boolean r0 = r8.A0L
            r2.A02 = r0
            java.lang.String r0 = r1.A02
            java.lang.String r0 = X.C627436k.A07(r0)
            r2.A01 = r0
            X.3Lv r0 = r3.A0B
            r0.A0V(r2)
            return
        L_0x009b:
            com.whatsapp.jid.UserJid r0 = r1.A01
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614830y.A07(com.whatsapp.jid.GroupJid, X.3ZF, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009f, code lost:
        if (r5.A0t(r8) == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(com.whatsapp.voipcalling.CallInfo r16, com.whatsapp.voipcalling.CallLinkInfo r17) {
        /*
            r15 = this;
            r2 = r16
            java.lang.String r0 = r2.callId
            X.3ZF r0 = r15.A04(r0)
            if (r0 != 0) goto L_0x00ac
            X.5b3 r5 = r15.A03
            r8 = r17
            java.lang.String r6 = r8.token
            com.whatsapp.jid.UserJid r3 = r8.creatorJid
            X.2l7 r0 = r5.A1q
            X.2l8 r4 = r0.A02(r6)
            if (r4 != 0) goto L_0x0023
            long r0 = r0.A00(r3, r6)
            X.2l8 r4 = new X.2l8
            r4.<init>(r3, r6, r0)
        L_0x0023:
            com.whatsapp.jid.UserJid r7 = r2.getPeerJid()
            X.C626936e.A06(r7)
            int r6 = r2.initialGroupTransactionId
            com.whatsapp.jid.UserJid r0 = r2.getCreatorJid()
            X.C626936e.A06(r0)
            com.whatsapp.jid.DeviceJid r9 = r0.getPrimaryDevice()
            X.2sW r3 = r15.A07
            java.lang.String r0 = r2.callId
            java.lang.String r1 = X.C627436k.A08(r0)
            X.2sH r0 = r5.A2X
            long r12 = r0.A0H()
            boolean r14 = r8.videoEnabled
            r11 = 0
            X.C626936e.A06(r9)
            java.lang.String r0 = "CallsMessageStore/addCallLogSynchronously "
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            X.39J r10 = new X.39J
            r10.<init>(r6, r7, r1, r0)
            r3.A05(r10)
            X.3ZF r8 = new X.3ZF
            r8.<init>(r9, r10, r11, r12, r14)
            r3.A08(r8)
            X.1VX r6 = r3.A0J
            r1 = 6120(0x17e8, float:8.576E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r6.A0O(r0, r1)
            r0 = 1
            if (r1 < r0) goto L_0x0071
            r3.A09(r8)
        L_0x0071:
            java.util.Map r0 = r2.participants
            java.util.Iterator r7 = X.AnonymousClass001.A0v(r0)
        L_0x0077:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r6 = r7.next()
            X.5Lb r6 = (X.C102995Lb) r6
            boolean r0 = r5.A0t(r8)
            if (r0 != 0) goto L_0x0093
            X.2sr r1 = r15.A01
            com.whatsapp.jid.UserJid r0 = r6.A08
            boolean r0 = r1.A0a(r0)
            if (r0 != 0) goto L_0x0077
        L_0x0093:
            com.whatsapp.jid.UserJid r2 = r6.A08
            int r1 = r6.A02
            r0 = 1
            if (r1 != r0) goto L_0x00a1
            boolean r1 = r5.A0t(r8)
            r0 = 5
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 2
        L_0x00a2:
            r8.A0I(r2, r0)
            goto L_0x0077
        L_0x00a6:
            r8.A0G(r4)
            r3.A07(r8)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614830y.A08(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.CallLinkInfo):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A09(com.whatsapp.voipcalling.CallInfo r14, com.whatsapp.voipcalling.CallLogInfo r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.callId
            X.3ZF r7 = r13.A04(r0)
            if (r7 != 0) goto L_0x0074
            com.whatsapp.jid.UserJid r0 = r14.getInitialPeerJid()
            java.lang.StringBuilder r1 = X.C18290x4.A0u(r0)
            java.lang.String r0 = "updateCallLogOnCallEnding getCallLog with key[jid="
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r14.getInitialPeerJid()
            r1.append(r0)
            java.lang.String r0 = "; fromMe="
            r1.append(r0)
            boolean r0 = r14.isCaller
            r1.append(r0)
            java.lang.String r0 = "; callId="
            r1.append(r0)
            java.lang.String r0 = r14.callId
            r1.append(r0)
            java.lang.String r0 = "; transactionId="
            r1.append(r0)
            int r0 = r14.initialGroupTransactionId
            r1.append(r0)
            java.lang.String r0 = "]"
            X.C18260x0.A1L(r1, r0)
            com.whatsapp.jid.UserJid r3 = r14.getInitialPeerJid()
            boolean r2 = r14.isCaller
            java.lang.String r1 = r14.callId
            int r0 = r14.initialGroupTransactionId
            X.3ZF r7 = r13.A03(r3, r1, r0, r2)
            if (r7 != 0) goto L_0x0074
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x0073
            boolean r0 = r14.isAudioChat()
            if (r0 != 0) goto L_0x0073
            X.5b3 r0 = r13.A03
            boolean r0 = r0.A3Q
            if (r0 != 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "can not find message for call "
            r1.append(r0)
            java.lang.String r0 = r14.callId
            r1.append(r0)
            X.C18270x1.A0z(r1)
        L_0x0073:
            return
        L_0x0074:
            r2 = 0
            r6 = 0
            if (r15 == 0) goto L_0x0116
            boolean r0 = r14.isJoinableGroupCall
            if (r0 == 0) goto L_0x0088
            com.whatsapp.voipcalling.CallState r1 = r14.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 != r0) goto L_0x0088
            int r1 = r7.A00
            r0 = 5
            if (r1 == r0) goto L_0x008d
        L_0x0088:
            int r0 = r15.callLogResultType
            r7.A0C(r0)
        L_0x008d:
            java.util.Map r0 = r15.groupCallLogs
            if (r0 == 0) goto L_0x00c3
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r0)
        L_0x0095:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r5)
            java.lang.String r0 = X.C18310x6.A0q(r4)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A08(r0)
            if (r1 == 0) goto L_0x00b1
            int r0 = X.AnonymousClass0x2.A08(r4)
            r7.A0I(r1, r0)
            goto L_0x0095
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "updateCallLogOnCallEnding got a bad group participant jid: "
            r1.append(r0)
            java.lang.String r0 = X.C18310x6.A0q(r4)
            X.C18260x0.A1K(r1, r0)
            goto L_0x0095
        L_0x00c3:
            long r0 = r15.txTotalBytes
            r11 = 1073741824(0x40000000, double:5.304989477E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0133
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0133
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (int) r4
            X.5b3 r4 = r13.A03
            X.2s4 r4 = r4.A1f
            r10 = 2
            r4.A06(r0, r10)
            X.2gD r9 = r4.A05
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00fe
            X.0yQ r8 = r9.A00
            if (r8 == 0) goto L_0x00fe
            r4 = 1
            X.C626936e.A0C(r4)
            r5 = 4
            r4 = -1
            android.os.Message r8 = android.os.Message.obtain(r8, r5, r10, r4)
            android.os.Bundle r5 = r8.getData()
            java.lang.String r4 = "long_value"
            r5.putLong(r4, r0)
            r8.sendToTarget()
            r9.A00()
        L_0x00fe:
            long r4 = r15.rxTotalBytes
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0129
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0129
            long r0 = (long) r6
            long r0 = r0 + r4
            int r6 = (int) r0
            X.5b3 r0 = r13.A03
            X.2s4 r1 = r0.A1f
            r0 = 2
            r1.A04(r4, r0)
            r1.A05(r4, r0)
        L_0x0116:
            int r4 = r7.A01
            long r0 = r14.callDuration
            long r2 = java.lang.Math.max(r2, r0)
            r0 = 999(0x3e7, double:4.936E-321)
            long r2 = r2 + r0
            long r1 = X.C18290x4.A0B(r2)
            int r0 = (int) r1
            int r4 = r4 + r0
            monitor-enter(r7)
            goto L_0x013d
        L_0x0129:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Not recording too big value for rxTotalBytes "
            X.C18260x0.A11(r0, r1, r4)
            goto L_0x0116
        L_0x0133:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Not recording too big value for txTotalBytes "
            X.C18260x0.A11(r4, r5, r0)
            goto L_0x00fe
        L_0x013d:
            int r0 = r7.A01     // Catch:{ all -> 0x01d3 }
            if (r0 == r4) goto L_0x0144
            r0 = 1
            r7.A0M = r0     // Catch:{ all -> 0x01d3 }
        L_0x0144:
            r7.A01 = r4     // Catch:{ all -> 0x01d3 }
            monitor-exit(r7)
            X.5b3 r0 = r13.A03
            X.2lA r1 = r0.A0R
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0153
            X.22I r1 = X.AnonymousClass22I.A03
        L_0x0151:
            monitor-enter(r7)
            goto L_0x0161
        L_0x0153:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x015a
            X.22I r1 = X.AnonymousClass22I.A02
            goto L_0x0151
        L_0x015a:
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x016b
            X.22I r1 = X.AnonymousClass22I.A04
            goto L_0x0151
        L_0x0161:
            X.22I r0 = r7.A06     // Catch:{ all -> 0x01d3 }
            if (r0 == r1) goto L_0x0168
            r0 = 1
            r7.A0M = r0     // Catch:{ all -> 0x01d3 }
        L_0x0168:
            r7.A06 = r1     // Catch:{ all -> 0x01d3 }
            monitor-exit(r7)
        L_0x016b:
            long r1 = r7.A03
            long r3 = (long) r6
            long r1 = r1 + r3
            monitor-enter(r7)
            long r3 = r7.A03     // Catch:{ all -> 0x01d3 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            r0 = 1
            r7.A0M = r0     // Catch:{ all -> 0x01d3 }
        L_0x0179:
            r7.A03 = r1     // Catch:{ all -> 0x01d3 }
            monitor-exit(r7)
            boolean r1 = r14.videoEnabled
            monitor-enter(r7)
            boolean r0 = r7.A0L     // Catch:{ all -> 0x01d3 }
            if (r0 == r1) goto L_0x0186
            r0 = 1
            r7.A0M = r0     // Catch:{ all -> 0x01d3 }
        L_0x0186:
            r7.A0L = r1     // Catch:{ all -> 0x01d3 }
            monitor-exit(r7)
            com.whatsapp.jid.GroupJid r2 = r14.groupJid
            java.lang.String r1 = r14.scheduledId
            boolean r0 = r14.isAudioChat()
            r13.A07(r2, r7, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "updateCallLogOnCallEnding call result = "
            r1.append(r0)
            int r0 = r7.A00
            r1.append(r0)
            java.lang.String r0 = ", video="
            r1.append(r0)
            boolean r0 = r7.A0L
            r1.append(r0)
            java.lang.String r0 = ", duration="
            r1.append(r0)
            int r0 = r7.A01
            r1.append(r0)
            java.lang.String r0 = ", total data usage: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "B"
            X.C18260x0.A1L(r1, r0)
            X.2sW r0 = r13.A07
            r0.A06(r7)
            boolean r0 = r14.isGroupCall
            if (r0 != 0) goto L_0x0073
            X.2ac r0 = r13.A04
            r0.A00(r7)
            return
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614830y.A09(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.CallLogInfo):void");
    }

    public C614830y(C55682qk r4, C56972sr r5, C106155Xv r6, C107285b3 r7, C45812ac r8, C46332bS r9, AnonymousClass33T r10, C56762sW r11, C56322rn r12, C620533h r13, C55422qK r14, AnonymousClass1VX r15, C187958y5 r16, AnonymousClass4FS r17, boolean z) {
        this.A0B = r15;
        this.A00 = r4;
        this.A01 = r5;
        AnonymousClass4FS r2 = r17;
        this.A0E = r2;
        this.A03 = r7;
        this.A0D = r16;
        this.A07 = r11;
        this.A04 = r8;
        this.A0A = r14;
        this.A08 = r12;
        this.A02 = r6;
        this.A06 = r10;
        this.A05 = r9;
        this.A09 = r13;
        this.A0F = z;
        this.A0C = new C72173dI(r2, true);
    }

    public void A05(CallSummary callSummary, AnonymousClass3ZF r9, CallParticipant[] callParticipantArr, int i) {
        C18260x0.A0y("updateJoinableCallLogOnCurrentThread updateType=", AnonymousClass001.A0o(), i);
        if (i == 1) {
            GroupJid groupJid = r9.A05;
            if (groupJid != null) {
                AnonymousClass1VX r1 = this.A0B;
                C620533h r6 = this.A09;
                if (C627436k.A0K(r1, r6.A03(groupJid))) {
                    if (r9.A05 == null) {
                        C626936e.A0D(false, "CallLogHelper/updateInvitedParticipantsUsingGroupMembership/ Group jid cannot be null");
                    } else {
                        HashSet A0K = AnonymousClass002.A0K();
                        for (CallParticipant callParticipant : callParticipantArr) {
                            if (callParticipant.isCallConnected()) {
                                A0K.add(callParticipant.jid);
                            }
                        }
                        C172878Nf A012 = C620533h.A01(r6, r9.A05);
                        while (A012.hasNext()) {
                            C60842zG A0G = C18320x8.A0G(A012);
                            C56972sr r0 = this.A01;
                            UserJid userJid = A0G.A03;
                            if (!r0.A0a(userJid)) {
                                int i2 = 2;
                                if (A0K.contains(userJid)) {
                                    i2 = 5;
                                }
                                r9.A0I(userJid, i2);
                            }
                        }
                    }
                }
            }
            A0A(r9, true);
        } else if (i != 2) {
            if (i != 3) {
                C18260x0.A0x("updateJoinableCallLogOnCurrentThread unknown type: ", AnonymousClass001.A0o(), i);
                return;
            }
            String str = r9.A0E.A02;
            String A072 = C627436k.A07(str);
            if (callSummary != null) {
                Log.i("updateJoinableCallLogOnCurrentThread updating call summary");
                int i3 = callSummary.durationMs / 1000;
                synchronized (r9) {
                    if (r9.A01 != i3) {
                        r9.A0M = true;
                    }
                    r9.A01 = i3;
                }
                A0B(r9, callSummary.callSummaryUsers);
            }
            A0A(r9, false);
            this.A07.A06(r9);
            this.A04.A00(r9);
            this.A06.A06(27, C627436k.A07(str), "joinable call");
            if (r9.A0M() && !r9.A0N()) {
                C18300x5.A16(this.A03.A0H, r9, 5, 1);
            }
            C18260x0.A0G(this.A02.A03().edit(), "ad_hoc_call_invitor_", A072, AnonymousClass001.A0o());
            return;
        }
        A0B(r9, callParticipantArr);
        this.A07.A07(r9);
    }
}
