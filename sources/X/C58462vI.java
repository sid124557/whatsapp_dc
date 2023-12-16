package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2vI  reason: invalid class name and case insensitive filesystem */
public class C58462vI {
    public final C56982ss A00;
    public final AnonymousClass4FV A01;

    public static void A00(C55032pg r4, AnonymousClass1A4 r5, C624134x r6) {
        List list = r6.A18;
        if (list != null && !C624435a.A02(GroupJid.class, list).isEmpty()) {
            AnonymousClass1A4 r42 = r4.A00;
            AnonymousClass1AL r0 = ((AnonymousClass1EU) r42.A00).groupMentionedMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1AL.DEFAULT_INSTANCE;
            }
            C209119u r3 = (C209119u) r0.A0H();
            AnonymousClass1AL r1 = (AnonymousClass1AL) C18320x8.A0C(r3);
            AnonymousClass1EU A0W = AnonymousClass0x9.A0W(r5);
            A0W.getClass();
            r1.message_ = A0W;
            r1.bitField0_ |= 1;
            C21851Dk r2 = r3.A09().messageContextInfo_;
            if (r2 == null) {
                r2 = C21851Dk.DEFAULT_INSTANCE;
            }
            C130786cX r12 = r42.A01;
            if (!r12.A0L()) {
                r42.A00 = r12.A0I();
                r42.A0J(r2);
                AnonymousClass1EU A0T = C18290x4.A0T(r42);
                AnonymousClass1AL r02 = (AnonymousClass1AL) r3.A06();
                r02.getClass();
                A0T.groupMentionedMessage_ = r02;
                A0T.bitField1_ |= AnonymousClass35S.A0F;
                return;
            }
            throw AnonymousClass001.A0c("Default instance must be immutable.");
        }
    }

    public C58462vI(C56982ss r1, AnonymousClass4FV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
