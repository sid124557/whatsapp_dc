package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.IOException;

/* renamed from: X.36k  reason: invalid class name and case insensitive filesystem */
public class C627436k {
    public static String A06(int i) {
        if (i == 0) {
            return "CALL_STATE_IDLE";
        }
        if (i == 1) {
            return "CALL_STATE_RINGING";
        }
        if (i != 2) {
            return "UNKNOWN_TELEPHONY_CALL_STATE";
        }
        return "CALL_STATE_OFFHOOK";
    }

    public static String A07(String str) {
        if (str.startsWith("call:")) {
            return str.replaceFirst("call:", "");
        }
        return str;
    }

    public static String A08(String str) {
        if (str == null) {
            return null;
        }
        return AnonymousClass000.A0V("call:", str, AnonymousClass001.A0o());
    }

    public static boolean A09(C56972sr r2, AnonymousClass1VX r3) {
        if (r3.A0O(C58422vE.A02, 3362) < 2 || r2.A0Y()) {
            return false;
        }
        return true;
    }

    public static boolean A0B(C56972sr r3, AnonymousClass1VX r4, int i) {
        C58422vE r2 = C58422vE.A02;
        if (r4.A0O(r2, 3362) < 2 || r3.A0Y() || i > r4.A0O(r2, 4676) || i < r4.A0O(r2, 4675)) {
            return false;
        }
        return true;
    }

    public static boolean A0E(AnonymousClass1VX r2) {
        if (r2.A0O(C58422vE.A02, 4067) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0F(AnonymousClass1VX r2) {
        return AnonymousClass001.A1W(r2.A0O(C58422vE.A02, 6818));
    }

    public static boolean A0G(AnonymousClass1VX r2) {
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 4800) || r2.A0Y(r1, 4896) || r2.A0Y(r1, 4895)) {
            return true;
        }
        return false;
    }

    public static boolean A0H(AnonymousClass1VX r2) {
        if (r2.A0Y(C58422vE.A02, 3015)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0I(AnonymousClass1VX r2) {
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 3015) || r2.A0Y(r1, 3459)) {
            String str = Build.MANUFACTURER;
            if ("oculus".equalsIgnoreCase(str) || "meta".equalsIgnoreCase(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0J(AnonymousClass1VX r2) {
        if (r2.A0O(C58422vE.A02, 6228) < 1) {
            return false;
        }
        return true;
    }

    public static boolean A0K(AnonymousClass1VX r3, int i) {
        C58422vE r2 = C58422vE.A02;
        if (r3.A0O(r2, 4907) < 3 || i < r3.A0O(r2, 5254)) {
            return false;
        }
        return true;
    }

    public static boolean A0L(AnonymousClass1VX r3, int i) {
        C58422vE r2 = C58422vE.A02;
        if (r3.A0O(r2, 5429) >= 2) {
            return true;
        }
        if (i < r3.A0O(r2, 6069) || i > r3.A0O(r2, 6070)) {
            return false;
        }
        return true;
    }

    public static boolean A0M(AnonymousClass1VX r2, CallState callState, Boolean bool, boolean z) {
        if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY) {
            return true;
        }
        if (!r2.A0Y(C58422vE.A02, 5088)) {
            return false;
        }
        if (!z && (bool == null || !bool.booleanValue())) {
            return false;
        }
        if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED) {
            return true;
        }
        return false;
    }

    public static boolean A0N(GroupJid groupJid, CallInfo callInfo) {
        CallState callState;
        if (callInfo == null || (callState = callInfo.callState) == CallState.NONE || callState == CallState.RECEIVED_CALL || callState == CallState.ACTIVE_ELSEWHERE || !groupJid.equals(callInfo.groupJid)) {
            return false;
        }
        return true;
    }

    public static boolean A0O(CallInfo callInfo) {
        if (callInfo == null || callInfo.callState == CallState.NONE) {
            return false;
        }
        return true;
    }

    public static int A00(Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("android.resource://");
            A0o.append(context.getPackageName());
            mediaMetadataRetriever.setDataSource(context, Uri.parse(AnonymousClass000.A0Y("/", A0o, R.raw.end_call_m4)));
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            try {
                mediaMetadataRetriever.release();
                return parseInt;
            } catch (IOException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "VoipUtilV2/getEndCallToneDurationFromMedia/ ", e);
                return parseInt;
            }
        } catch (IllegalArgumentException | SecurityException e2) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "VoipUtilV2/getEndCallToneDurationFromMedia/ ", e2);
            C626936e.A0A(e2);
            try {
                mediaMetadataRetriever.release();
                return -1;
            } catch (IOException e3) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "VoipUtilV2/getEndCallToneDurationFromMedia/ ", e3);
                return -1;
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException e4) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "VoipUtilV2/getEndCallToneDurationFromMedia/ ", e4);
                throw th;
            }
        }
    }

    public static VoipStanzaChildNode A01(VoipStanzaChildNode voipStanzaChildNode, String str) {
        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
        if (childrenCopy != null) {
            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                if (str.equals(voipStanzaChildNode2.tag)) {
                    return voipStanzaChildNode2;
                }
            }
        }
        return null;
    }

    public static CallInfo A02() {
        if (!Voip.A07()) {
            return Voip.getCallInfo();
        }
        CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
        if (callLinkInfo != null) {
            return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
        }
        return null;
    }

    public static AnonymousClass39J A03() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            return null;
        }
        UserJid peerJid = callInfo.getPeerJid();
        C626936e.A06(peerJid);
        boolean z = callInfo.isCaller;
        return new AnonymousClass39J(callInfo.initialGroupTransactionId, peerJid, A08(callInfo.callId), z);
    }

    public static File A04(Context context) {
        File A0A = AnonymousClass002.A0A(context.getCacheDir(), "voip_time_series");
        if (!A0A.exists() || !A0A.isDirectory()) {
            C18270x1.A0x(A0A);
            if (!A0A.mkdirs()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(A0A, "VoipUtil failed to create time series directory: ", A0o);
                C18280x3.A13(A0o);
                return null;
            }
        }
        return A0A;
    }

    public static Byte A05(VoipStanzaChildNode voipStanzaChildNode) {
        AnonymousClass39V[] attributesCopy = voipStanzaChildNode.getAttributesCopy();
        byte b = 0;
        if (attributesCopy != null) {
            int length = attributesCopy.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass39V r2 = attributesCopy[i];
                if ("count".equals(r2.A02)) {
                    try {
                        b = Byte.parseByte(r2.A03);
                        break;
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                } else {
                    i++;
                }
            }
        }
        return Byte.valueOf(b);
    }

    public static boolean A0A(C56972sr r1, AnonymousClass1VX r2) {
        if (r1.A0Y() || !r2.A0Y(C58422vE.A02, 4933)) {
            return false;
        }
        return true;
    }

    public static boolean A0C(C56972sr r2, AnonymousClass1VX r3, int i) {
        if (r2.A0Y()) {
            return false;
        }
        C58422vE r22 = C58422vE.A02;
        if (r3.A0O(r22, 3362) < 2 || i < r3.A0O(r22, 4675)) {
            return false;
        }
        if (r3.A0Y(r22, 6610) || i <= r3.A0O(r22, 4676)) {
            return true;
        }
        return false;
    }

    public static boolean A0D(C620633i r3) {
        ActivityManager A06 = r3.A06();
        try {
            if (Build.VERSION.SDK_INT >= 28 && A06 != null) {
                return A06.isBackgroundRestricted();
            }
        } catch (RuntimeException unused) {
            Log.e("System server dead, cannot get background restriction setting");
        }
        return false;
    }
}
