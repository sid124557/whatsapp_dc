package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3OL  reason: invalid class name */
public final class AnonymousClass3OL implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56122rS A00;

    public AnonymousClass3OL(C56122rS r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public C624134x BgW(C55962rC r17) {
        C95814uZ r7;
        AnonymousClass22h r0;
        C55962rC r5 = r17;
        AnonymousClass1EU A01 = C55962rC.A01(r5);
        if (C18270x1.A1T(A01.bitField1_, 8388608)) {
            AnonymousClass1DB r2 = A01.callLogMesssage_;
            if (r2 == null) {
                r2 = AnonymousClass1DB.DEFAULT_INSTANCE;
            }
            int i = r2.bitField0_;
            if (!AnonymousClass0x2.A1X(i)) {
                throw AnonymousClass24W.A01(11, "call log message missing is_video");
            } else if ((i & 2) == 0) {
                throw AnonymousClass24W.A01(11, "call log message missing call_outcome");
            } else if (AnonymousClass000.A1S(i & 8)) {
                AnonymousClass2z0 r1 = r5.A0D;
                boolean z = r2.isVideo_;
                AnonymousClass23K A002 = AnonymousClass23K.A00(r2.callOutcome_);
                if (A002 == null) {
                    A002 = AnonymousClass23K.CONNECTED;
                }
                C188248ya<C85234Fl> r02 = r2.participants_;
                ArrayList A0t = C18300x5.A0t(r02);
                for (C85234Fl r6 : r02) {
                    if (!r6.BFH()) {
                        throw AnonymousClass24W.A01(11, "call log message participant missing jid");
                    } else if (r6.BFB()) {
                        UserJid A0A = AnonymousClass32Y.A0A(r6.B8p());
                        AnonymousClass23K B59 = r6.B59();
                        C162457s7.A0D(B59);
                        AnonymousClass3ZE.A00(A0A, A0t, A00(B59));
                    } else {
                        throw AnonymousClass24W.A01(11, "call log message participant missing call_outcome");
                    }
                }
                C95814uZ r4 = r1.A00;
                if (r4 instanceof UserJid) {
                    r7 = r4;
                } else {
                    r7 = r5.A08;
                    if (r7 instanceof UserJid) {
                        C162457s7.A0K(r7, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    }
                    throw AnonymousClass24W.A01(11, "call log message missing call_type");
                }
                UserJid userJid = (UserJid) r7;
                if (userJid != null) {
                    AnonymousClass39J r11 = new AnonymousClass39J(-1, userJid, r1.A01, r1.A02);
                    AnonymousClass3ZF r9 = new AnonymousClass3ZF((DeviceJid) null, r11, A0t, r5.A05, z);
                    C162457s7.A0H(A002);
                    r9.A0C(A00(A002));
                    int i2 = r2.callType_;
                    if (i2 == 0) {
                        r0 = AnonymousClass22h.REGULAR;
                    } else if (i2 == 1) {
                        r0 = AnonymousClass22h.SCHEDULED_CALL;
                    } else if (i2 != 2) {
                        r0 = AnonymousClass22h.REGULAR;
                    } else {
                        r0 = AnonymousClass22h.VOICE_CHAT;
                    }
                    C162457s7.A0D(r0);
                    int ordinal = r0.ordinal();
                    int i3 = 1;
                    if (ordinal == 0) {
                        i3 = 0;
                    } else if (ordinal != 1) {
                        i3 = 2;
                    }
                    r9.A0D(i3);
                    if (r4 instanceof GroupJid) {
                        r9.A0H((GroupJid) r4);
                    }
                    if (r5.A0O) {
                        return new C30401mO((C47852dw) null, r1, r9);
                    }
                    AnonymousClass3ZF A03 = this.A00.A03(r11);
                    if (A03 != null) {
                        return new C30401mO((C47852dw) null, r1, A03);
                    }
                }
                throw AnonymousClass24W.A01(11, "call log message missing call_type");
            } else {
                throw AnonymousClass24W.A01(11, "call log message missing call_type");
            }
        }
        return null;
    }

    public static final int A00(AnonymousClass23K r0) {
        switch (r0.ordinal()) {
            case 0:
                return 5;
            case 1:
            case 6:
            case 7:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 6;
            default:
                return 0;
        }
    }

    public static final AnonymousClass23K A01(int i) {
        switch (i) {
            case 1:
            case 2:
                return AnonymousClass23K.MISSED;
            case 3:
                return AnonymousClass23K.FAILED;
            case 4:
                return AnonymousClass23K.REJECTED;
            case 5:
                return AnonymousClass23K.CONNECTED;
            case 6:
                return AnonymousClass23K.ACCEPTED_ELSEWHERE;
            default:
                return AnonymousClass23K.ONGOING;
        }
    }

    public void AyD(C55032pg r10, C624134x r11) {
        AnonymousClass23K A01;
        AnonymousClass22h r0;
        C18260x0.A0O(r11, r10);
        if (r11 instanceof C30401mO) {
            AnonymousClass3ZF r2 = ((C30401mO) r11).A01;
            if (r2 != null) {
                AnonymousClass1A4 r3 = r10.A00;
                AnonymousClass1DB r02 = ((AnonymousClass1EU) r3.A00).callLogMesssage_;
                if (r02 == null) {
                    r02 = AnonymousClass1DB.DEFAULT_INSTANCE;
                }
                C130546c9 A0H = r02.A0H();
                boolean z = r2.A0L;
                AnonymousClass1DB r1 = (AnonymousClass1DB) C18320x8.A0C(A0H);
                r1.bitField0_ |= 1;
                r1.isVideo_ = z;
                if (r2.A0O()) {
                    A01 = AnonymousClass23K.SILENCED_BY_DND;
                } else if (r2.A0N()) {
                    A01 = AnonymousClass23K.SILENCED_UNKNOWN_CALLER;
                } else {
                    A01 = A01(r2.A00);
                }
                AnonymousClass1DB r12 = (AnonymousClass1DB) C18320x8.A0C(A0H);
                r12.callOutcome_ = A01.value;
                r12.bitField0_ |= 2;
                long j = (long) r2.A01;
                AnonymousClass1DB r13 = (AnonymousClass1DB) C18320x8.A0C(A0H);
                r13.bitField0_ |= 4;
                r13.durationSecs_ = j;
                int i = r2.A0H;
                if (i == 1) {
                    r0 = AnonymousClass22h.SCHEDULED_CALL;
                } else if (i != 2) {
                    r0 = AnonymousClass22h.REGULAR;
                } else {
                    r0 = AnonymousClass22h.VOICE_CHAT;
                }
                AnonymousClass1DB r14 = (AnonymousClass1DB) C18320x8.A0C(A0H);
                r14.callType_ = r0.value;
                r14.bitField0_ |= 8;
                List<AnonymousClass3ZE> A08 = r2.A08();
                ArrayList A0c = C73783g4.A0c(A08);
                for (AnonymousClass3ZE r6 : A08) {
                    C130546c9 A0G = AnonymousClass1EV.DEFAULT_INSTANCE.A0G();
                    String A0g = C18300x5.A0g(A0G, r6.A02);
                    AnonymousClass1EV r15 = (AnonymousClass1EV) A0G.A00;
                    A0g.getClass();
                    r15.bitField0_ |= 1;
                    r15.jid_ = A0g;
                    AnonymousClass23K A012 = A01(r6.A00);
                    AnonymousClass1EV r16 = (AnonymousClass1EV) C18320x8.A0C(A0G);
                    r16.callOutcome_ = A012.value;
                    r16.bitField0_ |= 2;
                    C18320x8.A1B(A0G, A0c);
                }
                AnonymousClass1DB r22 = (AnonymousClass1DB) C18320x8.A0C(A0H);
                C188248ya r17 = r22.participants_;
                if (!((AnonymousClass8T6) r17).A00) {
                    r17 = C130786cX.A07(r17);
                    r22.participants_ = r17;
                }
                C170208Ch.A05(A0c, r17);
                AnonymousClass1EU A0T = C18290x4.A0T(r3);
                AnonymousClass1DB r03 = (AnonymousClass1DB) A0H.A06();
                r03.getClass();
                A0T.callLogMesssage_ = r03;
                A0T.bitField1_ |= 8388608;
                return;
            }
            return;
        }
        throw AnonymousClass001.A0c("FMessageCallLogProtobuf/not supported message");
    }
}
