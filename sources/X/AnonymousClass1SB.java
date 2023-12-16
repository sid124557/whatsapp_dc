package X;

/* renamed from: X.1SB  reason: invalid class name */
public class AnonymousClass1SB extends AnonymousClass33W {
    public final AnonymousClass1P3 A00;
    public final Object A01;
    public final String A02;

    public AnonymousClass1SB(AnonymousClass1P3 r10, AnonymousClass33J r11, Object obj, String str, String str2, long j, boolean z) {
        super(C60642yt.A03, r11, str2, r10.A03(), 7, j, z);
        this.A02 = str;
        this.A01 = obj;
        this.A00 = r10;
    }

    public AnonymousClass18L A06() {
        AnonymousClass18L r1;
        String str;
        AnonymousClass1EO A0W;
        int i;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        boolean z;
        AnonymousClass1P3 r12 = this.A00;
        AnonymousClass18L A06 = super.A06();
        C626936e.A06(A06);
        C162457s7.A0D(A06);
        Object obj = this.A01;
        if (r12 instanceof AnonymousClass1P2) {
            if (obj instanceof Boolean) {
                bool4 = (Boolean) obj;
            } else {
                bool4 = null;
            }
            C130546c9 A0G = C21001Ad.DEFAULT_INSTANCE.A0G();
            if (bool4 != null) {
                z = bool4.booleanValue();
            } else {
                z = false;
            }
            C21001Ad r13 = (C21001Ad) C18320x8.A0C(A0G);
            r13.bitField0_ |= 1;
            r13.isSent_ = z;
            C21001Ad r0 = (C21001Ad) A0G.A06();
            A0W = C18290x4.A0W(A06, r0);
            A0W.botWelcomeRequestAction_ = r0;
            i = A0W.bitField1_ | 64;
        } else {
            if (r12 instanceof AnonymousClass1P1) {
                r1 = null;
                if ((obj instanceof Boolean) && (bool3 = (Boolean) obj) != null) {
                    boolean booleanValue = bool3.booleanValue();
                    C130546c9 A0K = C18300x5.A0K(C21071Ak.DEFAULT_INSTANCE);
                    C21071Ak r14 = (C21071Ak) A0K.A00;
                    r14.bitField0_ |= 1;
                    r14.acknowledged_ = booleanValue;
                    C21071Ak r02 = (C21071Ak) A0K.A06();
                    AnonymousClass1EO A0W2 = C18290x4.A0W(A06, r02);
                    A0W2.nuxAction_ = r02;
                    A0W2.bitField0_ |= 33554432;
                    return A06;
                }
            } else if (r12 instanceof AnonymousClass1P0) {
                r1 = null;
                if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    C130546c9 A0K2 = C18300x5.A0K(C21111Ao.DEFAULT_INSTANCE);
                    C21111Ao r15 = (C21111Ao) A0K2.A00;
                    r15.bitField0_ |= 1;
                    r15.isEnabled_ = booleanValue2;
                    C21111Ao r03 = (C21111Ao) A0K2.A06();
                    A0W = C18290x4.A0W(A06, r03);
                    A0W.privacySettingRelayAllCalls_ = r03;
                    i = A0W.bitField1_ | 4;
                }
            } else if (r12 instanceof C22641Oz) {
                r1 = null;
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                    boolean booleanValue3 = bool.booleanValue();
                    C130546c9 A0K3 = C18300x5.A0K(C21041Ah.DEFAULT_INSTANCE);
                    C21041Ah r16 = (C21041Ah) A0K3.A00;
                    r16.bitField0_ |= 1;
                    r16.isOptIn_ = booleanValue3;
                    C21041Ah r04 = (C21041Ah) A0K3.A06();
                    A0W = C18290x4.A0W(A06, r04);
                    A0W.externalWebBetaAction_ = r04;
                    i = A0W.bitField1_ | 2;
                }
            } else {
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                C130546c9 A0G2 = C21161At.DEFAULT_INSTANCE.A0G();
                if (str != null) {
                    C172548Lq A09 = C18270x1.A09(A0G2, AnonymousClass0x2.A1a(str));
                    C21161At r17 = (C21161At) A0G2.A00;
                    r17.bitField0_ |= 1;
                    r17.definition_ = A09;
                }
                C21161At r05 = (C21161At) A0G2.A06();
                A0W = C18290x4.A0W(A06, r05);
                A0W.ugcBot_ = r05;
                i = A0W.bitField1_ | 16;
            }
            return r1;
        }
        A0W.bitField1_ = i;
        return A06;
    }
}
