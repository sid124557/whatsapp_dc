package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1A4  reason: invalid class name */
public final class AnonymousClass1A4 extends C130546c9 implements C181378mf {
    public AnonymousClass1A4() {
        super(AnonymousClass1EU.DEFAULT_INSTANCE);
    }

    public static C130546c9 A00(AnonymousClass1A4 r1) {
        C21851Dk r12 = ((AnonymousClass1EU) r1.A00).messageContextInfo_;
        if (r12 == null) {
            r12 = C21851Dk.DEFAULT_INSTANCE;
        }
        C130546c9 A0G = C21851Dk.DEFAULT_INSTANCE.A0G();
        A0G.A08(r12);
        return A0G;
    }

    public static C130546c9 A01(AnonymousClass1A4 r0) {
        AnonymousClass1ER r02 = ((AnonymousClass1EU) r0.A00).interactiveMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1ER.DEFAULT_INSTANCE;
        }
        return r02.A0H();
    }

    public static C209419x A02(AnonymousClass1A4 r0) {
        AnonymousClass1EM r02 = ((AnonymousClass1EU) r0.A00).protocolMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        return (C209419x) r02.A0H();
    }

    public static C208619p A03(AnonymousClass1A4 r0) {
        AnonymousClass1EI r02 = ((AnonymousClass1EU) r0.A00).templateMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1EI.DEFAULT_INSTANCE;
        }
        return (C208619p) r02.A0H();
    }

    public static void A04(C130546c9 r0, AnonymousClass1A4 r1) {
        r1.A0J((C21851Dk) r0.A06());
    }

    public void A09(C21801Df r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        r3.getClass();
        A0T.buttonsMessage_ = r3;
        A0T.bitField1_ |= 1;
    }

    public void A0A(AnonymousClass19Z r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1EB r0 = (AnonymousClass1EB) r3.A06();
        r0.getClass();
        A0T.documentMessage_ = r0;
        A0T.bitField0_ |= 64;
    }

    public void A0B(C207119a r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1EC r0 = (AnonymousClass1EC) r3.A06();
        r0.getClass();
        A0T.extendedTextMessage_ = r0;
        A0T.bitField0_ |= 32;
    }

    public void A0C(AnonymousClass1ER r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        r3.getClass();
        A0T.interactiveMessage_ = r3;
        A0T.bitField1_ |= 8;
    }

    public void A0D(C209419x r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1EM r0 = (AnonymousClass1EM) r3.A06();
        r0.getClass();
        A0T.protocolMessage_ = r0;
        A0T.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
    }

    public void A0E(AnonymousClass1EM r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        r3.getClass();
        A0T.protocolMessage_ = r3;
        A0T.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
    }

    public void A0F(C208419n r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1BQ r0 = (AnonymousClass1BQ) r3.A06();
        r0.getClass();
        A0T.senderKeyDistributionMessage_ = r0;
        A0T.bitField0_ |= 2;
    }

    public void A0G(C208519o r4) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1EA r0 = (AnonymousClass1EA) r4.A06();
        r0.getClass();
        A0T.stickerMessage_ = r0;
        A0T.bitField0_ |= 2097152;
    }

    public void A0H(C208619p r4) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1EI r0 = (AnonymousClass1EI) r4.A06();
        r0.getClass();
        A0T.templateMessage_ = r0;
        A0T.bitField0_ |= 1048576;
    }

    public void A0I(C209519y r3) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        AnonymousClass1ED r0 = (AnonymousClass1ED) r3.A06();
        r0.getClass();
        A0T.videoMessage_ = r0;
        A0T.bitField0_ |= 256;
    }

    public void A0J(C21851Dk r4) {
        AnonymousClass1EU A0T = C18290x4.A0T(this);
        r4.getClass();
        A0T.messageContextInfo_ = r4;
        A0T.bitField0_ |= 67108864;
    }
}
