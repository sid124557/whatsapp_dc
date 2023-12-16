package X;

import com.whatsapp.jid.UserJid;

@Deprecated
/* renamed from: X.3O4  reason: invalid class name */
public class AnonymousClass3O4 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;

    public void AyD(C55032pg r6, C624134x r7) {
        AnonymousClass22Y r0;
        if (r7 instanceof C30971nX) {
            C30971nX r72 = (C30971nX) r7;
            AnonymousClass1A4 r3 = r6.A00;
            AnonymousClass1BP r02 = ((AnonymousClass1EU) r3.A00).scheduledCallEditMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1BP.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            AnonymousClass1ET r03 = ((AnonymousClass1BP) A0H.A00).key_;
            if (r03 == null) {
                r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r03);
            AnonymousClass1A1.A00(A0X, r72.A1J);
            String str = r72.A02;
            if (str != null) {
                A0X.A0A(str);
            }
            C95814uZ r04 = r72.A01;
            if (r04 != null) {
                A0X.A0B(r04.getRawString());
            }
            AnonymousClass1BP r1 = (AnonymousClass1BP) C18320x8.A0C(A0H);
            r1.key_ = C18290x4.A0V(A0X);
            r1.bitField0_ |= 1;
            int i = r72.A00;
            if (i == 0) {
                r0 = AnonymousClass22Y.UNKNOWN;
            } else if (i == 1) {
                r0 = AnonymousClass22Y.CANCEL;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Unexpected type (");
                A0o.append(i);
                throw AnonymousClass000.A0F(")", A0o);
            }
            AnonymousClass1BP r12 = (AnonymousClass1BP) C18320x8.A0C(A0H);
            r12.editType_ = r0.value;
            r12.bitField0_ |= 2;
            AnonymousClass1BP r05 = (AnonymousClass1BP) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r05);
            A0L.scheduledCallEditMessage_ = r05;
            A0L.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass001.A0c("FMessageScheduledCallEditLegacyProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r9) {
        AnonymousClass22Y r0;
        AnonymousClass1EU r4 = r9.A0B;
        C30971nX r2 = null;
        if (C18270x1.A1T(r4.bitField1_, 1048576) && !this.A01.A0Y(C58422vE.A02, 4164)) {
            AnonymousClass2z0 r7 = r9.A0D;
            AnonymousClass1BP r42 = r4.scheduledCallEditMessage_;
            if (r42 == null) {
                r42 = AnonymousClass1BP.DEFAULT_INSTANCE;
            }
            C626936e.A06(r42);
            boolean A1X = AnonymousClass0x2.A1X(r42.bitField0_);
            Integer A0Z = C18300x5.A0Z();
            if (A1X) {
                AnonymousClass1ET r6 = r42.key_;
                if (r6 == null) {
                    r6 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                UserJid A08 = AnonymousClass32Y.A08(r6.participant_);
                if (r9.A01 == 8) {
                    C626936e.A0D(AnonymousClass000.A1W(A08), "originalMessageKey.getParticipant() can't be null in admin revoke");
                    r7 = AnonymousClass2z0.A05(r7.A00, r7.A01, this.A00.A0a(A08));
                }
                r2 = new C30971nX(r7, r9.A05);
                r2.A02 = r6.id_;
                r2.A01 = A08;
                if ((r42.bitField0_ & 2) != 0) {
                    int i = r42.editType_;
                    if (i == 0 || i != 1) {
                        r0 = AnonymousClass22Y.UNKNOWN;
                    } else {
                        r0 = AnonymousClass22Y.CANCEL;
                    }
                    int ordinal = r0.ordinal();
                    int i2 = 0;
                    if (ordinal != 0) {
                        i2 = 1;
                    }
                    r2.A00 = i2;
                } else {
                    throw AnonymousClass24W.A01(A0Z, "scheduled_call_edit_missing_edit_type");
                }
            } else {
                throw AnonymousClass24W.A01(A0Z, "scheduled_call_edit_missing_creation_message_key");
            }
        }
        return r2;
    }

    public AnonymousClass3O4(C56972sr r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
