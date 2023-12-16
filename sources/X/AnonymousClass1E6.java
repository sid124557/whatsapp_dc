package X;

/* renamed from: X.1E6  reason: invalid class name */
public final class AnonymousClass1E6 extends C130786cX implements C181378mf {
    public static final int CALL_CREATOR_JID_FIELD_NUMBER = 12;
    public static final int CALL_ID_FIELD_NUMBER = 11;
    public static final int CALL_LINK_TOKEN_FIELD_NUMBER = 9;
    public static final int CALL_RESULT_FIELD_NUMBER = 1;
    public static final int CALL_TYPE_FIELD_NUMBER = 15;
    public static final AnonymousClass1E6 DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int GROUP_JID_FIELD_NUMBER = 13;
    public static final int IS_CALL_LINK_FIELD_NUMBER = 8;
    public static final int IS_DND_MODE_FIELD_NUMBER = 2;
    public static final int IS_INCOMING_FIELD_NUMBER = 6;
    public static final int IS_VIDEO_FIELD_NUMBER = 7;
    public static volatile C178978iP PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 14;
    public static final int SCHEDULED_CALL_ID_FIELD_NUMBER = 10;
    public static final int SILENCE_REASON_FIELD_NUMBER = 3;
    public static final int START_TIME_FIELD_NUMBER = 5;
    public int bitField0_;
    public String callCreatorJid_ = "";
    public String callId_ = "";
    public String callLinkToken_ = "";
    public int callResult_;
    public int callType_;
    public long duration_;
    public String groupJid_ = "";
    public boolean isCallLink_;
    public boolean isDndMode_;
    public boolean isIncoming_;
    public boolean isVideo_;
    public C188248ya participants_ = C130236bd.A02;
    public String scheduledCallId_ = "";
    public int silenceReason_;
    public long startTime_;

    static {
        AnonymousClass1E6 r1 = new AnonymousClass1E6();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E6.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[20];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "callResult_";
                objArr[2] = C64003Bs.A00;
                objArr[3] = "isDndMode_";
                objArr[4] = "silenceReason_";
                objArr[5] = C64023Bu.A00;
                objArr[6] = "duration_";
                objArr[7] = "startTime_";
                objArr[8] = "isIncoming_";
                objArr[9] = "isVideo_";
                objArr[10] = "isCallLink_";
                objArr[11] = "callLinkToken_";
                objArr[12] = "scheduledCallId_";
                objArr[13] = "callId_";
                objArr[14] = "callCreatorJid_";
                objArr[15] = "groupJid_";
                objArr[16] = "participants_";
                objArr[17] = C21251Bc.class;
                objArr[18] = "callType_";
                objArr[19] = C64013Bt.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000e\u001b\u000fဌ\r", objArr);
            case 3:
                return new AnonymousClass1E6();
            case 4:
                return new AnonymousClass18D();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E6.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        r0 = C18320x8.A0B(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw C18320x8.A0m();
        }
    }
}
