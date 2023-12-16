package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4uX  reason: invalid class name and case insensitive filesystem */
public class C95794uX extends AnonymousClass5YV {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final AnonymousClass5ZU A02;
    public final C40512Gr A03;
    public final C48672fH A04;
    public final AnonymousClass332 A05;
    public final AnonymousClass4C1 A06;
    public final AnonymousClass4C1 A07;

    public C95794uX(C56972sr r1, C64773Ex r2, AnonymousClass5ZU r3, C40512Gr r4, C48672fH r5, AnonymousClass332 r6, AnonymousClass4C1 r7, AnonymousClass4C1 r8) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static String A00(CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
            case 10:
                return "active";
            default:
                return "idle";
        }
    }

    public static JSONObject A01(C56972sr r22, C64773Ex r23, AnonymousClass5ZU r24, C40512Gr r25, C48672fH r26, AnonymousClass332 r27, C54742pD r28, CallInfo callInfo, CallState callState) {
        C102995Lb infoByJid;
        String A002 = A00(callState);
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("call_state", A002);
        if (!"idle".equals(A002)) {
            CallInfo callInfo2 = callInfo;
            if (callInfo != null) {
                C64773Ex r21 = r23;
                AnonymousClass5ZU r11 = r24;
                C48672fH r20 = r26;
                C54742pD r10 = r28;
                if (!callInfo2.isCaller) {
                    C626936e.A06(callInfo2.getPeerJid());
                    A1G.put("caller_contact_id", r20.A01(callInfo2.getPeerJid(), r10));
                    A1G.put("caller_name", r11.A0E(r21.A0A(callInfo2.getPeerJid()), false).A01);
                }
                GroupJid groupJid = callInfo2.groupJid;
                if (groupJid != null) {
                    A1G.put("group_name", r11.A0H(r21.A0A(groupJid)));
                }
                Set keySet = callInfo2.participants.keySet();
                C40512Gr r12 = r25;
                if (!keySet.isEmpty()) {
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    JSONArray A1F2 = AnonymousClass0x9.A1F();
                    JSONArray A1F3 = AnonymousClass0x9.A1F();
                    Iterator it = keySet.iterator();
                    String str = null;
                    String str2 = null;
                    int i = 0;
                    while (it.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it);
                        String str3 = "on";
                        if (!r22.A0a(A0T)) {
                            JSONObject A1G2 = AnonymousClass0x9.A1G();
                            String str4 = r11.A0E(r21.A0A(A0T), false).A01;
                            String A012 = r20.A01(A0T, r10);
                            if (r12.A00.A0X(6408)) {
                                A1G2.put("call_participant_name", str4);
                                A1G2.put("call_participant_id", A012);
                                C102995Lb infoByJid2 = callInfo2.getInfoByJid(A0T);
                                if (infoByJid2 != null) {
                                    if (infoByJid2.A06 != 1) {
                                        str3 = "off";
                                    }
                                    A1G2.put("call_participant_video_status", str3);
                                }
                                A1F3.put(A1G2);
                            }
                            if (TextUtils.isEmpty(str4)) {
                                i++;
                            } else {
                                A1F.put(A012);
                                A1F2.put(str4);
                            }
                        } else if (r12.A00.A0X(6408) && (infoByJid = callInfo2.getInfoByJid(A0T)) != null) {
                            if (infoByJid.A0F) {
                                str = "muted";
                            } else {
                                str = str3;
                            }
                            str2 = "off";
                            if (infoByJid.A06 == 1) {
                                str2 = str3;
                            }
                        }
                    }
                    A1G.put("call_participant_contact_ids", A1F);
                    A1G.put("call_participant_names", A1F2);
                    A1G.put("unnamed_call_participant_count", i);
                    if (r12.A00.A0X(6408)) {
                        if (str != null) {
                            A1G.put("mic_status", str);
                        }
                        if (str2 != null) {
                            A1G.put("video_status", str2);
                        }
                        A1G.put("call_participant_list", A1F3);
                    }
                }
                A1G.put("call_id", r27.A03(r10, callInfo2.callId));
                A1G.put("video_call", callInfo2.videoEnabled);
                if (r12.A00.A0X(6408)) {
                    A1G.put("call_active_time", callInfo2.callActiveTime);
                }
            }
        }
        return A1G;
    }
}
