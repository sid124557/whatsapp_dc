package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3NY  reason: invalid class name */
public final class AnonymousClass3NY implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void AyD(C55032pg r8, C624134x r9) {
        String str;
        C18260x0.A0O(r9, r8);
        if (r9 instanceof C30251m9) {
            AnonymousClass1A4 r3 = r8.A00;
            C209419x A02 = AnonymousClass1A4.A02(r3);
            A02.A09(AnonymousClass23O.BOT_FEEDBACK_MESSAGE);
            AnonymousClass1EM r0 = ((AnonymousClass1EU) r3.A00).protocolMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            AnonymousClass1DA r02 = r0.botFeedbackMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1DA.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r02.A0H();
            C30251m9 r92 = (C30251m9) r9;
            AnonymousClass23M r03 = r92.A02;
            AnonymousClass1DA r1 = (AnonymousClass1DA) C18320x8.A0C(A0H);
            r1.kind_ = r03.value;
            r1.bitField0_ |= 2;
            long j = r92.A00;
            AnonymousClass1DA r12 = (AnonymousClass1DA) C18320x8.A0C(A0H);
            r12.bitField0_ |= 8;
            r12.kindNegative_ = j;
            long j2 = r92.A01;
            AnonymousClass1DA r13 = (AnonymousClass1DA) C18320x8.A0C(A0H);
            r13.bitField0_ |= 16;
            r13.kindPositive_ = j2;
            String str2 = r92.A04;
            if (!(str2 == null || str2.length() == 0)) {
                AnonymousClass1DA r14 = (AnonymousClass1DA) C18320x8.A0C(A0H);
                r14.bitField0_ |= 4;
                r14.text_ = str2;
            }
            AnonymousClass1EM r04 = ((AnonymousClass1EU) r3.A00).protocolMessage_;
            if (r04 == null) {
                r04 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            AnonymousClass1DA r05 = r04.botFeedbackMessage_;
            if (r05 == null) {
                r05 = AnonymousClass1DA.DEFAULT_INSTANCE;
            }
            AnonymousClass1ET r06 = r05.messageKey_;
            if (r06 == null) {
                r06 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r06);
            AnonymousClass2z0 r15 = r92.A03;
            if (r15 != null) {
                A0X.A0A(r15.A01);
                A0X.A0D(r15.A02);
                C95814uZ r07 = r15.A00;
                if (r07 == null || (str = r07.getRawString()) == null) {
                    str = null;
                }
                A0X.A0C(str);
            }
            AnonymousClass1ET r08 = (AnonymousClass1ET) A0X.A06();
            AnonymousClass1DA r16 = (AnonymousClass1DA) C18320x8.A0C(A0H);
            r08.getClass();
            r16.messageKey_ = r08;
            r16.bitField0_ |= 1;
            AnonymousClass1EM A0W = C18310x6.A0W(A02);
            AnonymousClass1DA r09 = (AnonymousClass1DA) A0H.A06();
            r09.getClass();
            A0W.botFeedbackMessage_ = r09;
            A0W.bitField0_ |= 16384;
            r3.A0D(A02);
            return;
        }
        throw AnonymousClass001.A0c("FMessageBotFeedbackProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r7) {
        AnonymousClass1EU A01 = C55962rC.A01(r7);
        C30251m9 r2 = null;
        if (AnonymousClass000.A1S(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            AnonymousClass1EM r5 = A01.protocolMessage_;
            if (r5 == null) {
                r5 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            int i = r5.bitField0_;
            if (AnonymousClass000.A1S(i & 2)) {
                AnonymousClass23O A00 = AnonymousClass23O.A00(r5.type_);
                if (A00 == null) {
                    A00 = AnonymousClass23O.REVOKE;
                }
                if (A00 == AnonymousClass23O.BOT_FEEDBACK_MESSAGE) {
                    if ((i & 16384) != 0) {
                        AnonymousClass1DA r0 = r5.botFeedbackMessage_;
                        AnonymousClass1DA r1 = r0;
                        if (r0 == null) {
                            r0 = AnonymousClass1DA.DEFAULT_INSTANCE;
                        }
                        if ((r0.bitField0_ & 2) != 0) {
                            if (r1 == null) {
                                r1 = AnonymousClass1DA.DEFAULT_INSTANCE;
                            }
                            if ((r1.bitField0_ & 1) != 0) {
                                r2 = new C30251m9(r7.A0D, r7.A05);
                                AnonymousClass1DA r02 = r5.botFeedbackMessage_;
                                if (r02 == null) {
                                    r02 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                }
                                AnonymousClass23M A002 = AnonymousClass23M.A00(r02.kind_);
                                if (A002 == null) {
                                    A002 = AnonymousClass23M.BOT_FEEDBACK_POSITIVE;
                                }
                                C162457s7.A0D(A002);
                                r2.A02 = A002;
                                AnonymousClass1DA r03 = r5.botFeedbackMessage_;
                                if (r03 == null) {
                                    r03 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                }
                                AnonymousClass1ET r4 = r03.messageKey_;
                                if (r4 == null) {
                                    r4 = AnonymousClass1ET.DEFAULT_INSTANCE;
                                }
                                r2.A03 = AnonymousClass2z0.A05(C106405Yw.A04(r4.remoteJid_), r4.id_, r4.fromMe_);
                                AnonymousClass1DA r04 = r5.botFeedbackMessage_;
                                AnonymousClass1DA r3 = r04;
                                if (r04 == null) {
                                    r04 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                }
                                if ((r04.bitField0_ & 4) != 0) {
                                    AnonymousClass1DA r05 = r3;
                                    if (r3 == null) {
                                        r05 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                    }
                                    r2.A04 = r05.text_;
                                }
                                AnonymousClass1DA r06 = r3;
                                if (r3 == null) {
                                    r06 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                }
                                if ((r06.bitField0_ & 16) != 0) {
                                    AnonymousClass1DA r07 = r3;
                                    if (r3 == null) {
                                        r07 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                    }
                                    r2.A01 = r07.kindPositive_;
                                }
                                AnonymousClass1DA r08 = r3;
                                if (r3 == null) {
                                    r08 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                }
                                if ((r08.bitField0_ & 8) != 0) {
                                    if (r3 == null) {
                                        r3 = AnonymousClass1DA.DEFAULT_INSTANCE;
                                    }
                                    r2.A00 = r3.kindNegative_;
                                }
                            } else {
                                throw AnonymousClass24W.A01(11, "no bot feedback msg messageKey");
                            }
                        } else {
                            throw AnonymousClass24W.A01(11, "no bot feedback msg kind");
                        }
                    } else {
                        throw AnonymousClass24W.A01(11, "no bot feedback msg");
                    }
                }
            } else {
                throw AnonymousClass24W.A01(11, "no protocol msg type");
            }
        }
        return r2;
    }
}
