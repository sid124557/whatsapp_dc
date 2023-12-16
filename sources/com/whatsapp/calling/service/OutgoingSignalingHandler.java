package com.whatsapp.calling.service;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2NF;
import X.AnonymousClass2QR;
import X.AnonymousClass35A;
import X.AnonymousClass35J;
import X.AnonymousClass363;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import X.AnonymousClass4FS;
import X.C107285b3;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C28051fP;
import X.C45442a1;
import X.C46602bu;
import X.C46622bw;
import X.C49072fw;
import X.C49402gT;
import X.C49412gU;
import X.C55262q4;
import X.C56222rd;
import X.C56612sH;
import X.C56972sr;
import X.C58422vE;
import X.C626936e;
import X.C627436k;
import X.C70183a5;
import X.C70663ar;
import X.C70953bK;
import X.C71323bv;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.SignalingXmppCallback;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OutgoingSignalingHandler implements SignalingXmppCallback {
    public final AnonymousClass1VX abProps;
    public final C49402gT callSendMethods;
    public final C55262q4 companionModeSharedPreferences;
    public final C56222rd encryptionHelper;
    public final C56972sr meManager;
    public String outgoingCallOfferKey;
    public volatile C46602bu pendingCallOfferStanza;
    public final C56612sH time;
    public final C46622bw voiceChatAcceptPingManager;
    public final C107285b3 voiceService;
    public final AnonymousClass4FS waWorkers;

    public static VoipStanzaChildNode[] A04(Map map, Set set) {
        ArrayList arrayList;
        VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
        Map map2 = map;
        if (map == null) {
            C626936e.A0D(!set.isEmpty(), "no destination jids");
            arrayList = AnonymousClass002.A0J(set);
        } else {
            C626936e.A0D(map.keySet().equals(set), "some device are not encrypted!");
            arrayList = null;
        }
        List A02 = AnonymousClass363.A02((C49072fw) null, (Integer) null, (String) null, (String) null, arrayList, Collections.emptyMap(), (Map) null, map2, 0, false, false, false, false);
        if (!A02.isEmpty()) {
            voipStanzaChildNodeArr = new VoipStanzaChildNode[A02.size()];
            for (int i = 0; i < A02.size(); i++) {
                voipStanzaChildNodeArr[i] = VoipStanzaChildNode.fromProtocolTreeNode((AnonymousClass36K) A02.get(i));
            }
        }
        return voipStanzaChildNodeArr;
    }

    public void clearPendingCallOfferStanza() {
        this.pendingCallOfferStanza = null;
    }

    public void sendCallStanza(Jid jid, String str, VoipStanzaChildNode voipStanzaChildNode) {
        String str2;
        VoipStanzaChildNode voipStanzaChildNode2 = voipStanzaChildNode;
        String str3 = voipStanzaChildNode.tag;
        String A02 = AnonymousClass35J.A02(this.meManager, this.time);
        Jid jid2 = jid;
        String str4 = str;
        switch (str3.hashCode()) {
            case -1624583601:
                if (str3.equals("link_join")) {
                    C107285b3 r3 = this.voiceService;
                    if (r3.A0T == null) {
                        r3.A0T = new AnonymousClass2NF(A02, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case -1423461112:
                if (str3.equals("accept")) {
                    C107285b3 r32 = this.voiceService;
                    if (r32.A0S == null) {
                        r32.A0S = new AnonymousClass2NF(A02, SystemClock.elapsedRealtime());
                    }
                    AnonymousClass2QR r33 = new AnonymousClass2QR(jid, A02, str, voipStanzaChildNode);
                    C46622bw r2 = this.voiceChatAcceptPingManager;
                    C18260x0.A0q("VoiceChatAcceptPingManager/onSendAcceptStanza: callId = ", str, C18270x1.A0X(str));
                    if (r2.A04.contains(str)) {
                        r2.A05.put(str, r33);
                    }
                    this.callSendMethods.A03.A09(C18290x4.A0J(206, r33), r33.A03);
                    return;
                }
                break;
            case -934710369:
                str2 = "reject";
                break;
            case 103144406:
                if (str3.equals("lobby") && this.voiceService.A0V == null && AnonymousClass0x7.A1R(str)) {
                    this.voiceService.A0V = new AnonymousClass2NF(A02, SystemClock.elapsedRealtime());
                    break;
                }
            case 105650780:
                if (str3.equals("offer")) {
                    sendOfferStanza(new C46602bu(jid, str, voipStanzaChildNode));
                    return;
                }
                break;
            case 112202875:
                str2 = "video";
                break;
            case 1063018407:
                if (str3.equals("enc_rekey")) {
                    this.waWorkers.BkM(new C70663ar(this, jid2, voipStanzaChildNode2, A02, str4, 3));
                    return;
                }
                break;
            case 1184155715:
                if (str3.equals("link_query")) {
                    C107285b3 r34 = this.voiceService;
                    if (r34.A0U == null) {
                        r34.A0U = new AnonymousClass2NF(A02, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case 1945493729:
                if (str3.equals("link_create")) {
                    C107285b3.A3R = A02;
                    break;
                }
                break;
            case 2035990113:
                if (str3.equals("terminate") && !preSendTerminate(jid, str)) {
                    return;
                }
        }
        if (str3.equals(str2)) {
            this.callSendMethods.A00(new AnonymousClass2QR(jid, A02, str, voipStanzaChildNode));
            return;
        }
        C49402gT r0 = this.callSendMethods;
        AnonymousClass2QR r35 = new AnonymousClass2QR(jid, A02, str, voipStanzaChildNode);
        r0.A03.A09(C18290x4.A0J(206, r35), r35.A03);
    }

    public void sendOfferStanza(C46602bu r15) {
        C46602bu r11 = r15;
        Jid jid = r15.A01;
        String str = r15.A04;
        VoipStanzaChildNode voipStanzaChildNode = r15.A03;
        String A02 = AnonymousClass35J.A02(this.meManager, this.time);
        this.outgoingCallOfferKey = A02;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator A0q = AnonymousClass000.A0q(r15.A05);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            if (A0w.getValue() != null) {
                A0t.put(key, A0w.getValue());
            }
        }
        Set keySet = A0t.keySet();
        boolean z = !keySet.isEmpty();
        if (z) {
            for (Object next : keySet) {
                C49412gU r1 = this.encryptionHelper.A04;
                C162457s7.A0J(next, 0);
                if (r1.A03.contains(next)) {
                    C18260x0.A1R(AnonymousClass001.A0o(), "VoiceService:sendOfferStanza waiting for PreKey job finishes with ", next);
                    this.pendingCallOfferStanza = r15;
                    return;
                }
            }
        }
        C70953bK r5 = new C70953bK(this, z, jid, str, A0t, r11, voipStanzaChildNode, A02);
        if (z) {
            this.voiceService.A02 = this.abProps.A0O(C58422vE.A02, 3407);
            CallInfo callInfo = Voip.getCallInfo();
            int i = this.voiceService.A02;
            if (i <= 0 || i >= 3000 || callInfo == null || callInfo.callState != CallState.CALLING || r15.A00 != 0) {
                Log.i("VoiceService:sendOfferStanza without delay");
                this.voiceService.A13.execute(r5);
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoiceService:sendOfferStanza with ");
            A0o.append(i);
            C18260x0.A1L(A0o, " ms delay");
            this.voiceService.A3P = true;
            C107285b3 r0 = this.voiceService;
            r0.A13.schedule(r5, (long) r0.A02, TimeUnit.MILLISECONDS);
            return;
        }
        r5.run();
    }

    public static VoipStanzaChildNode A00(C45442a1 r8, VoipStanzaChildNode voipStanzaChildNode, byte b) {
        VoipStanzaChildNode voipStanzaChildNode2;
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        if (r8 != null) {
            voipStanzaChildNode2 = VoipStanzaChildNode.fromProtocolTreeNode(AnonymousClass35A.A00(r8, b));
        } else {
            voipStanzaChildNode2 = null;
        }
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode3 : childrenCopy) {
                if ("enc".equals(voipStanzaChildNode3.tag)) {
                    voipStanzaChildNode3 = voipStanzaChildNode2;
                    if (voipStanzaChildNode2 == null) {
                    }
                }
                builder.addChild(voipStanzaChildNode3);
            }
        }
        return builder.build();
    }

    public static VoipStanzaChildNode A01(VoipStanzaChildNode voipStanzaChildNode, byte[] bArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        builder.addChildren(voipStanzaChildNode.getChildrenCopy());
        VoipStanzaChildNode.Builder builder2 = new VoipStanzaChildNode.Builder("device-identity");
        builder2.setData(bArr);
        builder.addChild(builder2.build());
        return builder.build();
    }

    public static VoipStanzaChildNode A02(VoipStanzaChildNode voipStanzaChildNode, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        VoipStanzaChildNode.Builder builder = new VoipStanzaChildNode.Builder(voipStanzaChildNode.tag);
        builder.addAttributes(voipStanzaChildNode.getAttributesCopy());
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if ("destination".equals(voipStanzaChildNode2.tag)) {
                    if (voipStanzaChildNodeArr != null) {
                        VoipStanzaChildNode.Builder builder2 = new VoipStanzaChildNode.Builder("destination");
                        builder2.addChildren(voipStanzaChildNodeArr);
                        voipStanzaChildNode2 = builder2.build();
                    }
                }
                builder.addChild(voipStanzaChildNode2);
            }
        }
        return builder.build();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallStanza$0(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (jid instanceof C28051fP) {
            C28051fP r2 = (C28051fP) jid;
            C626936e.A06(r2);
            sendReKeyFanoutStanza(str, r2, str2, voipStanzaChildNode);
            return;
        }
        sendReKeyStanza(str, C18320x8.A0O(jid), str2, voipStanzaChildNode);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$sendOfferStanza$1(boolean z, Jid jid, String str, Map map, C46602bu r9, VoipStanzaChildNode voipStanzaChildNode, String str2) {
        C45442a1 r2;
        if (this.voiceService.A3M != 14) {
            this.voiceService.A3P = false;
            if (z) {
                UserJid convertToUserJid = Voip.JidHelper.convertToUserJid(jid);
                C626936e.A06(convertToUserJid);
                Map sendOfferEncryptionTask = sendOfferEncryptionTask(str, convertToUserJid, map);
                if (sendOfferEncryptionTask != null) {
                    if (r9.A02 != null) {
                        voipStanzaChildNode = A02(r9.A03, A04(sendOfferEncryptionTask, r9.A05.keySet()));
                    } else {
                        C626936e.A0D(AnonymousClass000.A1U(sendOfferEncryptionTask.size(), 1), "cannot have multiple encrypted messages in old format!");
                        if (sendOfferEncryptionTask.size() == 1) {
                            r2 = (C45442a1) C18320x8.A0Z(sendOfferEncryptionTask, C18320x8.A0O(r9.A01));
                        } else {
                            r2 = null;
                        }
                        voipStanzaChildNode = A00(r2, r9.A03, r9.A00);
                    }
                    if (this.meManager.A0Y() && A03(voipStanzaChildNode)) {
                        byte[] A03 = this.companionModeSharedPreferences.A03();
                        C626936e.A06(A03);
                        voipStanzaChildNode = A01(voipStanzaChildNode, A03);
                    }
                } else {
                    Log.i("VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed");
                    this.pendingCallOfferStanza = r9;
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("VoiceService:sendOfferStanza without enc (Call ID = ");
                A0o.append(str);
                A0o.append(", peer = ");
                A0o.append(jid);
                C18260x0.A1L(A0o, ")");
            }
            if (voipStanzaChildNode != null) {
                C107285b3 r3 = this.voiceService;
                if (r3.A0W == null) {
                    r3.A0W = new AnonymousClass2NF(str2, SystemClock.elapsedRealtime());
                }
                this.callSendMethods.A00(new AnonymousClass2QR(jid, str2, str, voipStanzaChildNode));
                return;
            }
            this.pendingCallOfferStanza = r9;
        }
    }

    private C45442a1 rekeyEncryptionTask(byte[] bArr, DeviceJid deviceJid, String str, byte b) {
        this.voiceService.A3H.put(deviceJid, Byte.valueOf(b));
        C45442a1 encryptedE2EKey = getEncryptedE2EKey(bArr, deviceJid);
        if (encryptedE2EKey != null) {
            if (!AnonymousClass0x7.A1R(str)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("VoiceService:rekeyEncryptionTask(");
                A0o.append(str);
                AnonymousClass001.A1M(A0o);
                A0o.append(deviceJid);
                C18260x0.A1M(A0o, ", the call has ended, do nothing)");
            } else {
                this.voiceService.A3H.remove(deviceJid);
                return encryptedE2EKey;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de A[SYNTHETIC, Splitter:B:34:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getBulkEncryptedE2EKeys(java.util.Map r13, int r14, boolean r15) {
        /*
            r12 = this;
            X.2rd r3 = r12.encryptionHelper
            boolean r0 = r13.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x001c
            X.2gU r4 = r3.A04
            java.util.Set r1 = r13.keySet()
            r0 = 0
            java.util.Set r5 = r4.A00(r1, r0)
            if (r15 != 0) goto L_0x0034
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0034
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r2)
        L_0x0022:
            java.lang.Object r0 = r1.first
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x002f
            X.5b3 r0 = r12.voiceService
            r0.A0C()
        L_0x002f:
            java.lang.Object r0 = r1.second
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0034:
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r13)
        L_0x003c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0142
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            com.whatsapp.jid.DeviceJid r6 = X.AnonymousClass0x9.A0Q(r0)
            java.lang.Object r1 = r0.getValue()
            byte[] r1 = (byte[]) r1
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x003c
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
            X.6c9 r8 = r0.A0G()
            X.6cX r0 = r8.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Cl r0 = r0.call_
            if (r0 != 0) goto L_0x0066
            X.1Cl r0 = X.C21601Cl.DEFAULT_INSTANCE
        L_0x0066:
            X.6c9 r7 = r0.A0H()
            X.16O r7 = (X.AnonymousClass16O) r7
            int r0 = r1.length
            r9 = 0
            X.8Lq r10 = X.C18300x5.A0J(r7, r1, r0)
            X.6cX r1 = r7.A00
            X.1Cl r1 = (X.C21601Cl) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.callKey_ = r10
            if (r14 != 0) goto L_0x0097
            X.1VX r10 = r3.A0F
            r1 = 520(0x208, float:7.29E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0097
            X.1Qq r1 = r3.A0A
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.2e5 r0 = r1.A00(r0)
            r1.A04(r0, r7)
        L_0x0097:
            X.1EU r1 = X.C18290x4.A0T(r8)
            X.6cX r0 = r7.A06()
            X.1Cl r0 = (X.C21601Cl) r0
            r0.getClass()
            r1.call_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.bitField0_ = r0
            X.33Z r1 = r3.A0E
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.2Ss r7 = r1.A06(r0)
            if (r7 == 0) goto L_0x011b
            X.6cX r1 = r8.A06()
            X.1EU r0 = X.AnonymousClass1EU.DEFAULT_INSTANCE
            X.6c9 r0 = r0.A0G()
            r0.A08(r1)
            X.1A4 r0 = (X.AnonymousClass1A4) r0
            X.C33061sN.A03(r7, r0)
            if (r0 == 0) goto L_0x011b
            X.6cX r7 = r0.A06()
        L_0x00ce:
            X.1EU r7 = (X.AnonymousClass1EU) r7
            X.33n r8 = r3.A07
            boolean r0 = r8.A0X()
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r3.A04()
            if (r0 != 0) goto L_0x00fc
            X.2fm r0 = r3.A08     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            X.4II r1 = new X.4II     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            r1.<init>(r6, r3, r7, r9)     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            r3.A0I = r0     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            java.util.concurrent.Future r0 = r3.A0I     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            java.lang.Object r0 = r0.get()     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            X.2a1 r0 = (X.C45442a1) r0     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            r4.put(r6, r0)     // Catch:{ CancellationException -> 0x0131, InterruptedException -> 0x0120, ExecutionException -> 0x014a }
            r3.A0I = r2
            goto L_0x003c
        L_0x00fc:
            X.2ov r0 = X.AnonymousClass36G.A02(r6)
            boolean r1 = r8.A0Z(r0)
            java.lang.String r0 = "no session with deviceJid"
            X.C626936e.A0D(r1, r0)
            X.2ov r1 = X.AnonymousClass36G.A02(r6)
            byte[] r0 = r7.A0F()
            X.2a1 r0 = X.C381025p.A01(r1, r8, r0)
            r4.put(r6, r0)
            goto L_0x003c
        L_0x011b:
            X.6cX r7 = r8.A06()
            goto L_0x00ce
        L_0x0120:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0150 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0150 }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r2)     // Catch:{ all -> 0x0150 }
            r3.A0I = r2
            goto L_0x0022
        L_0x0131:
            r1 = move-exception
            java.lang.String r0 = "voip/encryption/encryptE2EKey cancelled"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0150 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0150 }
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r2)     // Catch:{ all -> 0x0150 }
            r3.A0I = r2
            goto L_0x0022
        L_0x0142:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            android.util.Pair r1 = X.AnonymousClass0x9.A0C(r0, r4)
            goto L_0x0022
        L_0x014a:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x0150 }
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            r3.A0I = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.getBulkEncryptedE2EKeys(java.util.Map, int, boolean):java.util.Map");
    }

    public void maybeSendPendingOffer(DeviceJid deviceJid, String str) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        C46602bu r4 = this.pendingCallOfferStanza;
        if (r4 != null) {
            String str2 = r4.A04;
            if (str2.equals(str) && r4.A05.containsKey(deviceJid)) {
                this.pendingCallOfferStanza = null;
                VoipStanzaChildNode voipStanzaChildNode = r4.A02;
                if (voipStanzaChildNode != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                    C626936e.A06(childrenCopy);
                    for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                        AnonymousClass39V[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                        C626936e.A06(attributesCopy);
                        int length = attributesCopy.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            AnonymousClass39V r1 = attributesCopy[i];
                            if ("jid".equals(r1.A02)) {
                                DeviceJid of = DeviceJid.of(r1.A01);
                                if (of != null && !of.equals(deviceJid)) {
                                    A0s.add(voipStanzaChildNode2);
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!A0s.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) A0s.toArray(new VoipStanzaChildNode[0])) != null) {
                        sendOfferStanza(new C46602bu(r4.A01, str2, A02(r4.A03, voipStanzaChildNodeArr)));
                    }
                }
            }
        }
    }

    public boolean preSendTerminate(Jid jid, String str) {
        String str2;
        if (this.voiceService.A3M == 14) {
            return false;
        }
        sendPendingCallOfferStanza(jid, str, true);
        if (this.abProps.A0Y(C58422vE.A02, 986) && (str2 = this.outgoingCallOfferKey) != null) {
            LinkedHashMap linkedHashMap = this.callSendMethods.A03.A07.A00;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(str2);
            }
            this.outgoingCallOfferKey = null;
        }
        return true;
    }

    public void sendOfferRetryRequest(DeviceJid deviceJid) {
        String A0o = C18310x6.A0o(deviceJid, this.voiceService.A3G);
        if (A0o != null) {
            C18260x0.A1R(AnonymousClass001.A0o(), "voip/sendOfferRetryRequest for jid:", deviceJid);
            this.voiceService.A3G.remove(deviceJid);
            this.voiceService.A13.execute(new C71323bv(18, A0o, deviceJid));
        }
    }

    public void sendPendingCallOfferStanza(Jid jid, String str, boolean z) {
        VoipStanzaChildNode A00;
        if (str != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/sendPendingCallOfferStanza jid=");
            A0o.append(jid);
            A0o.append(" callId=");
            A0o.append(str);
            A0o.append(" callTerminated=");
            A0o.append(z);
            A0o.append(" pendingCallOfferStanza=(");
            A0o.append(this.pendingCallOfferStanza);
            C18260x0.A1R(A0o, "), this = ", this);
        }
        C46602bu r5 = this.pendingCallOfferStanza;
        if (r5 != null) {
            String str2 = r5.A04;
            if (str2.equals(str)) {
                Jid jid2 = r5.A01;
                Jid jid3 = jid2;
                if (jid2 instanceof DeviceJid) {
                    jid2 = ((DeviceJid) jid2).userJid;
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
                if (jid2.equals(jid)) {
                    if (z) {
                        if (r5.A02 != null) {
                            A00 = A02(r5.A03, A04((Map) null, r5.A05.keySet()));
                        } else {
                            A00 = A00((C45442a1) null, r5.A03, r5.A00);
                        }
                        r5 = new C46602bu(jid3, str2, A00);
                    }
                    this.pendingCallOfferStanza = null;
                    sendOfferStanza(r5);
                }
            }
        }
    }

    public void sendPendingRekeyRequest(DeviceJid deviceJid) {
        byte byteValue;
        Number A0q = AnonymousClass0x9.A0q(deviceJid, this.voiceService.A3H);
        if (A0q != null && (byteValue = A0q.byteValue()) >= 0 && byteValue <= 4) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/sendPendingRekeyRequest for jid:");
            A0o.append(deviceJid);
            C18260x0.A1R(A0o, ", retry:", A0q);
            this.voiceService.A13.execute(new C70183a5(deviceJid, 25, A0q));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r2 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = X.C627436k.A01(r8, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r6.put(r2, r0);
        r13.voiceService.A3H.put(r2, (byte) 0);
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendReKeyFanoutStanza(java.lang.String r14, X.C28051fP r15, java.lang.String r16, com.whatsapp.protocol.VoipStanzaChildNode r17) {
        /*
            r13 = this;
            java.lang.String r0 = "destination"
            r4 = r17
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C627436k.A01(r4, r0)
            if (r1 == 0) goto L_0x0090
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r1.getChildrenCopy()
            if (r0 == 0) goto L_0x0090
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            com.whatsapp.protocol.VoipStanzaChildNode[] r7 = r1.getChildrenCopy()
            int r5 = r7.length
            r12 = 0
            r3 = 0
        L_0x001b:
            if (r3 >= r5) goto L_0x006d
            r8 = r7[r3]
            X.39V[] r11 = r8.getAttributesCopy()
            X.C626936e.A06(r11)
            int r10 = r11.length
            r9 = 0
        L_0x0028:
            if (r9 >= r10) goto L_0x006a
            r2 = r11[r9]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = "enc"
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C627436k.A01(r8, r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:invalid enc node"
        L_0x0048:
            r0 = 0
            X.C626936e.A0D(r0, r1)
        L_0x004c:
            return
        L_0x004d:
            byte[] r0 = r0.getDataCopy()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty"
            goto L_0x0048
        L_0x0056:
            r6.put(r2, r0)
            X.5b3 r0 = r13.voiceService
            java.util.Map r1 = r0.A3H
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            r1.put(r2, r0)
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0067:
            int r9 = r9 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:no device jid"
            goto L_0x0048
        L_0x006d:
            r0 = 1
            java.util.Map r3 = r13.getBulkEncryptedE2EKeys(r6, r0, r0)
            if (r3 == 0) goto L_0x004c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x004c
            java.util.Iterator r2 = X.C18280x3.A0i(r3)
        L_0x007e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r2.next()
            X.5b3 r0 = r13.voiceService
            java.util.Map r0 = r0.A3H
            r0.remove(r1)
            goto L_0x007e
        L_0x0090:
            java.lang.String r1 = "VoiceService:sendReKeyFanoutStanza:bad message format"
            goto L_0x0048
        L_0x0093:
            java.util.Set r0 = r3.keySet()
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = A04(r3, r0)
            com.whatsapp.protocol.VoipStanzaChildNode r2 = A02(r4, r0)
            X.2gT r1 = r13.callSendMethods
            X.2QR r0 = new X.2QR
            r3 = r16
            r0.<init>(r15, r14, r3, r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.service.OutgoingSignalingHandler.sendReKeyFanoutStanza(java.lang.String, X.1fP, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public void sendReKeyStanza(String str, DeviceJid deviceJid, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        String str3;
        VoipStanzaChildNode A01 = C627436k.A01(voipStanzaChildNode, "enc");
        if (A01 == null) {
            str3 = "invalid enc node!";
        } else {
            Byte A05 = C627436k.A05(A01);
            if (A05 == null) {
                str3 = "invalid retry count!";
            } else {
                byte[] dataCopy = A01.getDataCopy();
                if (dataCopy == null) {
                    Log.e("VoiceService:sendReKeyStanza, e2e key is empty");
                    str3 = "e2e key is empty!";
                } else {
                    byte byteValue = A05.byteValue();
                    C45442a1 rekeyEncryptionTask = rekeyEncryptionTask(dataCopy, deviceJid, str2, byteValue);
                    if (rekeyEncryptionTask != null) {
                        VoipStanzaChildNode A00 = A00(rekeyEncryptionTask, voipStanzaChildNode, byteValue);
                        if (this.meManager.A0Y() && A03(A00)) {
                            byte[] A03 = this.companionModeSharedPreferences.A03();
                            C626936e.A06(A03);
                            A00 = A01(A00, A03);
                        }
                        this.callSendMethods.A00(new AnonymousClass2QR(deviceJid, str, str2, A00));
                        return;
                    }
                    return;
                }
            }
        }
        C626936e.A0D(false, str3);
    }

    public OutgoingSignalingHandler(C56612sH r1, AnonymousClass1VX r2, C56972sr r3, AnonymousClass4FS r4, C107285b3 r5, C49402gT r6, C56222rd r7, C55262q4 r8, C46622bw r9) {
        this.time = r1;
        this.abProps = r2;
        this.meManager = r3;
        this.waWorkers = r4;
        this.voiceService = r5;
        this.callSendMethods = r6;
        this.encryptionHelper = r7;
        this.companionModeSharedPreferences = r8;
        this.voiceChatAcceptPingManager = r9;
    }

    public static boolean A03(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass39V r5 = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pkmsg");
        VoipStanzaChildNode A01 = C627436k.A01(voipStanzaChildNode, "enc");
        if (A01 != null) {
            return A01.hasAttribute(r5);
        }
        VoipStanzaChildNode A012 = C627436k.A01(voipStanzaChildNode, "destination");
        if (A012 != null) {
            VoipStanzaChildNode[] childrenCopy = A012.getChildrenCopy();
            if (childrenCopy != null) {
                for (VoipStanzaChildNode A013 : childrenCopy) {
                    VoipStanzaChildNode A014 = C627436k.A01(A013, "enc");
                    if (A014 != null && A014.hasAttribute(r5)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private C45442a1 getEncryptedE2EKey(byte[] bArr, DeviceJid deviceJid) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put(deviceJid, bArr);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(A0t, 1, false);
        if (bulkEncryptedE2EKeys != null) {
            return (C45442a1) bulkEncryptedE2EKeys.get(deviceJid);
        }
        return null;
    }

    public Map sendOfferEncryptionTask(String str, UserJid userJid, Map map) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoiceService:sendOfferEcryptionTask, Call ID = ");
        A0o.append(str);
        C18260x0.A1R(A0o, ", peer = ", userJid);
        Map bulkEncryptedE2EKeys = getBulkEncryptedE2EKeys(map, 0, false);
        if (bulkEncryptedE2EKeys != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null && ((callInfo.isCaller || callInfo.callLinkToken != null) && callInfo.callId.equals(str))) {
                UserJid peerJid = callInfo.getPeerJid();
                C626936e.A06(peerJid);
                if (peerJid.equals(userJid)) {
                    return bulkEncryptedE2EKeys;
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("VoiceService:sendOfferEcryptionTask(");
            A0o2.append(str);
            AnonymousClass001.A1M(A0o2);
            A0o2.append(userJid);
            C18260x0.A1M(A0o2, ", call state does not match, do nothing)");
        }
        return null;
    }
}
