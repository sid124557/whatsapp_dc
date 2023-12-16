package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5U0  reason: invalid class name */
public class AnonymousClass5U0 {
    public final AnonymousClass1VX A00;
    public final AnonymousClass8JP A01;
    public final ConcurrentHashMap A02 = AnonymousClass0x9.A1D();

    public void A00(String str) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoipQplLogger/endCallSetupMarker callId: ");
            A0o.append(str);
            A0o.append(" actionId: ");
            A0o.append(213);
            C18260x0.A0q(" point: ", "start_foreground_service", A0o);
            this.A01.BKf(number.intValue(), str.hashCode(), 213, "start_foreground_service");
        }
    }

    public void A01(String str, int i, boolean z, boolean z2) {
        Number A0p = AnonymousClass0x9.A0p(str, this.A02);
        if (A0p != null) {
            AnonymousClass8JP r3 = this.A01;
            int intValue = A0p.intValue();
            int hashCode = str.hashCode();
            r3.markerAnnotate(intValue, hashCode, "is_video_call", z);
            r3.markerAnnotate(intValue, hashCode, "peer_participants_count", i);
            r3.markerAnnotate(intValue, hashCode, "is_rejoin", z2);
        }
    }

    public void A02(String str, String str2) {
        Number A0p = AnonymousClass0x9.A0p(str, this.A02);
        if (A0p != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoipQplLogger/markerPoint callId: ");
            A0o.append(str);
            C18260x0.A0q(" pointer: ", str2, A0o);
            this.A01.markerPoint(A0p.intValue(), str.hashCode(), str2);
        }
    }

    public void A03(String str, short s) {
        Number number = (Number) this.A02.remove(str);
        if (number != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("VoipQplLogger/endCallSetupMarker callId: ");
            A0o.append(str);
            C18260x0.A0w(" actionId: ", A0o, s);
            this.A01.markerEnd(number.intValue(), str.hashCode(), s);
        }
    }

    public final boolean A04(String str, int i) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        Number A0p = AnonymousClass0x9.A0p(str, concurrentHashMap);
        if (!this.A00.A0X(620)) {
            return false;
        }
        if (A0p != null && A0p.intValue() == i) {
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VoipQplLogger/startCallSetupMarker callId: ");
        A0o.append(str);
        C18260x0.A0w(" marker: ", A0o, i);
        this.A01.markerStart(i, str.hashCode());
        AnonymousClass0x2.A1I(str, concurrentHashMap, i);
        return true;
    }

    public AnonymousClass5U0(AnonymousClass1VX r2, AnonymousClass8JP r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
