package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.32x  reason: invalid class name and case insensitive filesystem */
public final class C619532x {
    public static final AnonymousClass66R A04 = C154517dI.A01(AnonymousClass40Q.A00);
    public C53792ng A00;
    public final AnonymousClass4FV A01;
    public final C72173dI A02;
    public final String A03;

    public static final void A00(C60122y2 r3, C25921bI r4, C95814uZ r5, boolean z) {
        int valueOf;
        boolean z2 = false;
        if (r3 != null && r3.A03.contains(r5)) {
            z2 = true;
        }
        if (z) {
            valueOf = 1;
        } else {
            int i = 3;
            if (z2) {
                i = 2;
            }
            valueOf = Integer.valueOf(i);
        }
        r4.A01 = valueOf;
        if (r3 != null) {
            AnonymousClass21M r1 = AnonymousClass21M.ADHOC;
            r4.A04 = r3.A01(r1, r5);
            r4.A05 = Long.valueOf(r3.A00(r1));
            AnonymousClass21M r12 = AnonymousClass21M.LGC;
            r4.A08 = r3.A01(r12, r5);
            r4.A09 = Long.valueOf(r3.A00(r12));
            AnonymousClass21M r13 = AnonymousClass21M.STARRED_CONTACTS;
            r4.A0C = r3.A01(r13, r5);
            r4.A0D = Long.valueOf(r3.A00(r13));
            AnonymousClass21M r14 = AnonymousClass21M.GROUP_CHATS;
            r4.A06 = r3.A01(r14, r5);
            r4.A07 = Long.valueOf(r3.A00(r14));
            AnonymousClass21M r15 = AnonymousClass21M.ONE_ON_ONE;
            r4.A0A = r3.A01(r15, r5);
            r4.A0B = Long.valueOf(r3.A00(r15));
        }
    }

    public final C24921Zg A01(String str) {
        C53792ng r1 = this.A00;
        Boolean bool = null;
        if (r1 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CallUserJourney/");
            A0o.append(str);
            C18260x0.A1M(A0o, " received null event, did you start a session?");
            return null;
        } else if (!r1.A02) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("CallUserJourney/");
            A0o2.append(str);
            C18260x0.A1J(A0o2, " Not logging event");
            return null;
        } else {
            C24921Zg r4 = new C24921Zg();
            r4.A03 = Integer.valueOf(r1.A04);
            r4.A02 = Integer.valueOf(r1.A03);
            r4.A04 = this.A03;
            r4.A05 = r1.A06;
            CallInfo callInfo = r1.A05;
            if (callInfo != null) {
                CallState[] callStateArr = new CallState[2];
                callStateArr[0] = CallState.ACTIVE;
                bool = Boolean.valueOf(AnonymousClass0x9.A19(CallState.CONNECTED_LONELY, callStateArr, 1).contains(callInfo.callState));
            }
            r4.A00 = bool;
            return r4;
        }
    }

    public final C25921bI A02(String str) {
        C53792ng r2 = this.A00;
        if (r2 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamSelectParticipantFromPicker/");
            A0o.append(str);
            C18260x0.A1M(A0o, " received null event, did you start a session?");
            return null;
        }
        C25921bI r1 = new C25921bI();
        r1.A0G = r2.A07.toString();
        r1.A0F = r2.A06;
        r1.A0E = this.A03;
        r1.A03 = Integer.valueOf(r2.A04);
        r1.A02 = C18290x4.A0d();
        return r1;
    }

    public C619532x(AnonymousClass33U r2, AnonymousClass4FV r3, AnonymousClass4FS r4) {
        C18260x0.A0V(r4, r2, r3);
        this.A01 = r3;
        String str = r2.A05;
        C162457s7.A0D(str);
        this.A03 = str;
        this.A02 = C72173dI.A00(r4);
    }
}
