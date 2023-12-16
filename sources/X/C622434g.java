package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.34g  reason: invalid class name and case insensitive filesystem */
public class C622434g {
    public final C56972sr A00;
    public final C55332qB A01;
    public final AnonymousClass33Z A02;
    public final AnonymousClass36Y A03;
    public final C55832qz A04;
    public final JniBridge A05;
    public final C183538qC A06;

    public static AnonymousClass1EU A00(AnonymousClass1EU r5, int i) {
        C130546c9 A0G = AnonymousClass1EU.DEFAULT_INSTANCE.A0G();
        A0G.A08(r5);
        AnonymousClass1A4 r4 = (AnonymousClass1A4) A0G;
        C21851Dk r0 = ((AnonymousClass1EU) r4.A00).messageContextInfo_;
        if (r0 == null) {
            r0 = C21851Dk.DEFAULT_INSTANCE;
        }
        AnonymousClass17V r3 = (AnonymousClass17V) r0.A0H();
        C172548Lq A0J = C18300x5.A0J(r3, AnonymousClass29O.A01(i), i);
        C21851Dk r1 = (C21851Dk) r3.A00;
        r1.bitField0_ |= 8;
        r1.paddingBytes_ = A0J;
        AnonymousClass1EU A0T = C18290x4.A0T(r4);
        C21851Dk r02 = (C21851Dk) r3.A06();
        r02.getClass();
        A0T.messageContextInfo_ = r02;
        A0T.bitField0_ |= 67108864;
        return AnonymousClass0x9.A0W(r4);
    }

    public static AnonymousClass1EU A01(AnonymousClass1EU r3, C624134x r4) {
        if (r4 == null || r4.A0o() == null || !AnonymousClass000.A1S(r3.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            return r3;
        }
        AnonymousClass1EM r0 = r3.protocolMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return r3;
        }
        AnonymousClass1A4 r32 = (AnonymousClass1A4) r3.A0H();
        AnonymousClass1EM r02 = ((AnonymousClass1EU) r32.A00).protocolMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        C130546c9 A0H = r02.A0H();
        AnonymousClass1EM r03 = ((AnonymousClass1EU) r32.A00).protocolMessage_;
        if (r03 == null) {
            r03 = AnonymousClass1EM.DEFAULT_INSTANCE;
        }
        AnonymousClass1ET r04 = r03.key_;
        if (r04 == null) {
            r04 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r04);
        A0X.A0D(false);
        A0X.A0B(r4.A0o().getRawString());
        AnonymousClass1ET r05 = (AnonymousClass1ET) A0X.A06();
        AnonymousClass1EM A0W = C18310x6.A0W(A0H);
        r05.getClass();
        A0W.key_ = r05;
        A0W.bitField0_ |= 1;
        r32.A0E((AnonymousClass1EM) A0H.A06());
        return AnonymousClass0x9.A0W(r32);
    }

    public static AnonymousClass1EU A02(AnonymousClass1EU r5, String str, String str2) {
        C130546c9 A0G = AnonymousClass1C1.DEFAULT_INSTANCE.A0G();
        if (r5 != null) {
            AnonymousClass1C1 r1 = (AnonymousClass1C1) C18320x8.A0C(A0G);
            r1.message_ = r5;
            r1.bitField0_ |= 2;
        }
        if (str != null) {
            AnonymousClass1C1 r12 = (AnonymousClass1C1) C18320x8.A0C(A0G);
            r12.bitField0_ |= 1;
            r12.destinationJid_ = str;
        }
        if (str2 != null) {
            AnonymousClass1C1 r13 = (AnonymousClass1C1) C18320x8.A0C(A0G);
            r13.bitField0_ |= 4;
            r13.phash_ = str2;
        }
        C130546c9 A0G2 = AnonymousClass1EU.DEFAULT_INSTANCE.A0G();
        AnonymousClass1EU A0T = C18290x4.A0T(A0G2);
        AnonymousClass1C1 r0 = (AnonymousClass1C1) A0G.A06();
        r0.getClass();
        A0T.deviceSentMessage_ = r0;
        A0T.bitField0_ |= 33554432;
        return AnonymousClass0x9.A0W(A0G2);
    }

    public AnonymousClass1EU A04(DeviceJid deviceJid, AnonymousClass1EU r10, C624134x r11, AnonymousClass2z0 r12, String str) {
        String str2;
        C95814uZ r1;
        String str3;
        C56972sr r6 = this.A00;
        if (C56972sr.A09(r6, deviceJid)) {
            if (r12.A00 instanceof AnonymousClass1fI) {
                Set A012 = this.A01.A01(r12);
                HashSet A0K = AnonymousClass002.A0K();
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    UserJid userJid = AnonymousClass0x7.A0R(it).userJid;
                    if (!r6.A0a(userJid)) {
                        A0K.add(userJid.getPrimaryDevice());
                    }
                }
                str3 = C621933y.A03(A0K);
            } else {
                str3 = null;
            }
            AnonymousClass1EU A022 = A02(r10, str, str3);
            if (!A06(r11) || r11 == null || !AnonymousClass000.A1S(A022.bitField0_ & 33554432)) {
                return A022;
            }
            AnonymousClass1C1 r0 = A022.deviceSentMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1C1.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) == 0) {
                return A022;
            }
            C130546c9 A0H = A022.A0H();
            AnonymousClass1C1 r02 = A022.deviceSentMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1C1.DEFAULT_INSTANCE;
            }
            AnonymousClass1EU r03 = r02.message_;
            if (r03 == null) {
                r03 = AnonymousClass1EU.DEFAULT_INSTANCE;
            }
            AnonymousClass1EU A013 = A01(r03, r11);
            AnonymousClass1C1 r04 = A022.deviceSentMessage_;
            if (r04 == null) {
                r04 = AnonymousClass1C1.DEFAULT_INSTANCE;
            }
            C130546c9 A0H2 = r04.A0H();
            AnonymousClass1C1 r13 = (AnonymousClass1C1) C18320x8.A0C(A0H2);
            A013.getClass();
            r13.message_ = A013;
            r13.bitField0_ |= 2;
            AnonymousClass1C1 r05 = (AnonymousClass1C1) A0H2.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(A0H, r05);
            A0L.deviceSentMessage_ = r05;
            A0L.bitField0_ |= 33554432;
            return AnonymousClass0x9.A0W(A0H);
        }
        if (AnonymousClass000.A1S(r10.bitField1_ & 4194304)) {
            C183538qC r5 = this.A06;
            r5.get();
            if (C155477ey.A00(deviceJid.userJid)) {
                AnonymousClass1A4 r3 = (AnonymousClass1A4) r10.A0H();
                AnonymousClass1EU r14 = (AnonymousClass1EU) r3.A00;
                if (AnonymousClass000.A1S(r14.bitField1_ & 4194304)) {
                    AnonymousClass1AL r06 = r14.botInvokeMessage_;
                    if (r06 == null) {
                        r06 = AnonymousClass1AL.DEFAULT_INSTANCE;
                    }
                    if ((r06.bitField0_ & 1) != 0) {
                        if (!AnonymousClass000.A1S(r14.bitField0_ & 67108864)) {
                            str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageContextInfo";
                        } else {
                            C21851Dk r07 = ((AnonymousClass1EU) r3.A00).messageContextInfo_;
                            C21851Dk r15 = r07;
                            if (r07 == null) {
                                r07 = C21851Dk.DEFAULT_INSTANCE;
                            }
                            if ((r07.bitField0_ & 4) != 0) {
                                if (r15 == null) {
                                    r15 = C21851Dk.DEFAULT_INSTANCE;
                                }
                                AnonymousClass17V r2 = (AnonymousClass17V) r15.A0H();
                                JniBridge jniBridge = this.A05;
                                NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOO(3, AnonymousClass0x9.A0r(jniBridge), ((C21851Dk) r2.A00).messageSecret_.A07());
                                if (nativeHolder != null) {
                                    C40932Ih WcmBotMessageSecretAPICreateWithMessageSecret = jniBridge.WcmBotMessageSecretAPICreateWithMessageSecret(new C40922Ig(nativeHolder));
                                    if (WcmBotMessageSecretAPICreateWithMessageSecret == null) {
                                        str2 = "E2eMessageBuilder/createMessageForBot/BotMessageSecret is null";
                                    } else {
                                        JniBridge.getInstance();
                                        C172548Lq A0H3 = C18280x3.A0H(r2, (byte[]) JniBridge.jvidispatchOIO(0, (long) 79, WcmBotMessageSecretAPICreateWithMessageSecret.A00));
                                        C21851Dk r16 = (C21851Dk) r2.A00;
                                        r16.bitField0_ |= 32;
                                        r16.botMessageSecret_ = A0H3;
                                        C21851Dk r17 = (C21851Dk) C18320x8.A0C(r2);
                                        r17.bitField0_ &= -5;
                                        r17.messageSecret_ = C21851Dk.DEFAULT_INSTANCE.messageSecret_;
                                        A05(deviceJid.userJid, r2);
                                        AnonymousClass1A4.A04(r2, r3);
                                        AnonymousClass1AL r08 = ((AnonymousClass1EU) r3.A00).botInvokeMessage_;
                                        if (r08 == null) {
                                            r08 = AnonymousClass1AL.DEFAULT_INSTANCE;
                                        }
                                        AnonymousClass1EU r09 = r08.message_;
                                        if (r09 == null) {
                                            r09 = AnonymousClass1EU.DEFAULT_INSTANCE;
                                        }
                                        AnonymousClass1EC r4 = r09.extendedTextMessage_;
                                        if (!((r4 == null && (r4 = AnonymousClass1EC.DEFAULT_INSTANCE) == null) || (r4.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0)) {
                                            AnonymousClass1EF r010 = r4.contextInfo_;
                                            AnonymousClass1EF r18 = r010;
                                            if (r010 == null) {
                                                r010 = AnonymousClass1EF.DEFAULT_INSTANCE;
                                            }
                                            if ((r010.bitField0_ & 4) != 0) {
                                                if (r18 == null) {
                                                    r18 = AnonymousClass1EF.DEFAULT_INSTANCE;
                                                }
                                                C130546c9 A0H4 = r18.A0H();
                                                try {
                                                    AnonymousClass1EF r19 = (AnonymousClass1EF) A0H4.A00;
                                                    if ((r19.bitField0_ & 2) != 0) {
                                                        r1 = C106405Yw.A04(r19.participant_);
                                                    } else {
                                                        r1 = C106405Yw.A04(r19.remoteJid_);
                                                    }
                                                    if (!r6.A0a(r1)) {
                                                        r5.get();
                                                        if (!C155477ey.A00(r1)) {
                                                            AnonymousClass1EF A0Q = C18300x5.A0Q(A0H4);
                                                            A0Q.bitField0_ &= -2;
                                                            A0Q.stanzaId_ = AnonymousClass1EF.DEFAULT_INSTANCE.stanzaId_;
                                                            AnonymousClass1EF A0Q2 = C18300x5.A0Q(A0H4);
                                                            A0Q2.bitField0_ &= -9;
                                                            A0Q2.remoteJid_ = AnonymousClass1EF.DEFAULT_INSTANCE.remoteJid_;
                                                            AnonymousClass1EF A0Q3 = C18300x5.A0Q(A0H4);
                                                            A0Q3.bitField0_ &= -3;
                                                            A0Q3.participant_ = AnonymousClass1EF.DEFAULT_INSTANCE.participant_;
                                                            AnonymousClass1EF A0Q4 = C18300x5.A0Q(A0H4);
                                                            A0Q4.quotedMessage_ = null;
                                                            A0Q4.bitField0_ &= -5;
                                                            C207119a r110 = (C207119a) r4.A0H();
                                                            r110.A09((AnonymousClass1EF) A0H4.A06());
                                                            AnonymousClass1AL r011 = ((AnonymousClass1EU) r3.A00).botInvokeMessage_;
                                                            if (r011 == null) {
                                                                r011 = AnonymousClass1AL.DEFAULT_INSTANCE;
                                                            }
                                                            AnonymousClass1EU r012 = r011.message_;
                                                            if (r012 == null) {
                                                                r012 = AnonymousClass1EU.DEFAULT_INSTANCE;
                                                            }
                                                            C130546c9 A0H5 = r012.A0H();
                                                            AnonymousClass1EC r013 = (AnonymousClass1EC) r110.A06();
                                                            AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(A0H5, r013);
                                                            A0L2.extendedTextMessage_ = r013;
                                                            A0L2.bitField0_ |= 32;
                                                            AnonymousClass1AL r014 = ((AnonymousClass1EU) r3.A00).botInvokeMessage_;
                                                            if (r014 == null) {
                                                                r014 = AnonymousClass1AL.DEFAULT_INSTANCE;
                                                            }
                                                            AnonymousClass1AL A002 = C209119u.A00(A0H5, (C209119u) r014.A0H());
                                                            AnonymousClass1EU A0L3 = AnonymousClass0x2.A0L(r3, A002);
                                                            A0L3.botInvokeMessage_ = A002;
                                                            A0L3.bitField1_ |= 4194304;
                                                        }
                                                    }
                                                } catch (AnonymousClass24P e) {
                                                    Log.e("E2eMessageBuilder/excludeQuoteAttributesForBotInvokeMessage/Invalid jid", e);
                                                }
                                            }
                                        }
                                        return AnonymousClass0x9.A0W(r3);
                                    }
                                } else {
                                    str2 = "E2eMessageBuilder/createMessageForBot/MessageSecret is null";
                                }
                            } else {
                                str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have MessageSecret";
                            }
                        }
                        Log.e(str2);
                        return r10;
                    }
                }
                str2 = "E2eMessageBuilder/createMessageForBot/E2E.Message doesn't have BotInvokeMessage";
                Log.e(str2);
                return r10;
            }
        }
        C183538qC r22 = this.A06;
        r22.get();
        C95814uZ r111 = r12.A00;
        if (C155477ey.A00(r111)) {
            return A03(r111, r10, r11);
        }
        r22.get();
        if (C155477ey.A00(deviceJid.userJid)) {
            return A03(deviceJid.userJid, r10, r11);
        }
        if (A06(r11)) {
            return A01(r10, r11);
        }
        return r10;
    }

    public void A05(UserJid userJid, AnonymousClass17V r6) {
        String str;
        C56722sS A0I = C18320x8.A0I(this.A06);
        C162457s7.A0J(userJid, 0);
        C54002o1 A002 = ((C48902ff) A0I.A0A.get()).A00(userJid);
        if (A002 != null) {
            str = A002.A08;
        } else {
            str = null;
        }
        if (!C107575bX.A0F(str)) {
            AnonymousClass1D8 r1 = ((C21851Dk) r6.A00).botMetadata_;
            if (r1 == null) {
                r1 = AnonymousClass1D8.DEFAULT_INSTANCE;
            }
            C130546c9 A0G = AnonymousClass1D8.DEFAULT_INSTANCE.A0G();
            A0G.A08(r1);
            AnonymousClass1D8 r12 = (AnonymousClass1D8) C18320x8.A0C(A0G);
            str.getClass();
            r12.bitField0_ |= 2;
            r12.personaId_ = str;
            AnonymousClass1D8 r0 = (AnonymousClass1D8) A0G.A06();
            C21851Dk r13 = (C21851Dk) C18320x8.A0C(r6);
            r0.getClass();
            r13.botMetadata_ = r0;
            r13.bitField0_ |= 64;
        }
    }

    public boolean A06(C624134x r3) {
        if (r3 != null) {
            C183538qC r1 = this.A06;
            r1.get();
            if (C155477ey.A00(r3.A1J.A00) || !C624134x.A0h(r3, r1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C622434g(C56972sr r1, C55332qB r2, AnonymousClass33Z r3, AnonymousClass36Y r4, C55832qz r5, JniBridge jniBridge, C183538qC r7) {
        this.A00 = r1;
        this.A05 = jniBridge;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass1EU A03(C95814uZ r8, AnonymousClass1EU r9, C624134x r10) {
        String str;
        C130546c9 A0G;
        C130546c9 A0G2;
        String str2;
        AnonymousClass2z0 r0;
        UserJid A032 = AnonymousClass32Y.A03(r8);
        if (A032 == null) {
            return r9;
        }
        AnonymousClass1A4 r3 = (AnonymousClass1A4) r9.A0H();
        AnonymousClass17V r02 = (AnonymousClass17V) AnonymousClass1A4.A00(r3);
        A05(A032, r02);
        AnonymousClass1A4.A04(r02, r3);
        if (AnonymousClass000.A1S(r9.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            AnonymousClass1EM r03 = r9.protocolMessage_;
            AnonymousClass1EM r1 = r03;
            if (r03 == null) {
                r03 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            if ((r03.bitField0_ & 16384) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass1EM.DEFAULT_INSTANCE;
                }
                AnonymousClass1DA r04 = r1.botFeedbackMessage_;
                if (r04 == null) {
                    r04 = AnonymousClass1DA.DEFAULT_INSTANCE;
                }
                C130546c9 A0H = r04.A0H();
                AnonymousClass1DA r12 = (AnonymousClass1DA) A0H.A00;
                if ((r12.bitField0_ & 1) != 0) {
                    AnonymousClass1ET r6 = r12.messageKey_;
                    if (r6 == null) {
                        r6 = AnonymousClass1ET.DEFAULT_INSTANCE;
                    }
                    C624134x A012 = C55832qz.A01(C18310x6.A0S(r6.remoteJid_), this.A04, r6.id_, r6.fromMe_);
                    if (A012 == null) {
                        str2 = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botResponseMessage is null";
                    } else {
                        AnonymousClass1ET r05 = ((AnonymousClass1DA) A0H.A00).messageKey_;
                        if (r05 == null) {
                            r05 = AnonymousClass1ET.DEFAULT_INSTANCE;
                        }
                        AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r05);
                        if (A012.A01 != 1 || A012.A11() == null) {
                            r0 = A012.A1J;
                        } else {
                            r0 = A012.A11().A02;
                        }
                        A0X.A0A(r0.A01);
                        A0X.A09();
                        AnonymousClass1ET r06 = (AnonymousClass1ET) A0X.A06();
                        AnonymousClass1DA r13 = (AnonymousClass1DA) C18320x8.A0C(A0H);
                        r06.getClass();
                        r13.messageKey_ = r06;
                        r13.bitField0_ |= 1;
                        AnonymousClass1EM r07 = r9.protocolMessage_;
                        if (r07 == null) {
                            r07 = AnonymousClass1EM.DEFAULT_INSTANCE;
                        }
                        C130546c9 A0H2 = r07.A0H();
                        AnonymousClass1DA r08 = (AnonymousClass1DA) A0H.A06();
                        AnonymousClass1EM A0W = C18310x6.A0W(A0H2);
                        r08.getClass();
                        A0W.botFeedbackMessage_ = r08;
                        A0W.bitField0_ |= 16384;
                        r3.A0E((AnonymousClass1EM) A0H2.A06());
                    }
                } else {
                    str2 = "E2eMessageBuilder/appendProtocolMessageForBotFeedbackMessage/botFeedbackMessage doesn't have MessageKey";
                }
                Log.w(str2);
            }
        }
        if (AnonymousClass000.A1S(r9.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            AnonymousClass1EM r09 = r9.protocolMessage_;
            AnonymousClass1EM r2 = r09;
            AnonymousClass1EM r14 = r09;
            if (r09 == null) {
                r09 = AnonymousClass1EM.DEFAULT_INSTANCE;
            }
            if ((r09.bitField0_ & 1) != 0) {
                AnonymousClass1EM r010 = r2;
                if (r2 == null) {
                    r010 = AnonymousClass1EM.DEFAULT_INSTANCE;
                }
                if ((r010.bitField0_ & 2) != 0) {
                    if (r2 == null) {
                        r14 = AnonymousClass1EM.DEFAULT_INSTANCE;
                    }
                    AnonymousClass23O A002 = AnonymousClass23O.A00(r14.type_);
                    if (A002 == null) {
                        A002 = AnonymousClass23O.REVOKE;
                    }
                    if (A002 == AnonymousClass23O.REVOKE) {
                        if (r2 == null) {
                            r2 = AnonymousClass1EM.DEFAULT_INSTANCE;
                        }
                        AnonymousClass1ET r011 = r2.key_;
                        if (r011 == null) {
                            r011 = AnonymousClass1ET.DEFAULT_INSTANCE;
                        }
                        AnonymousClass1A1 A0X2 = AnonymousClass0x9.A0X(r011);
                        A0X2.A09();
                        AnonymousClass1EM r012 = r9.protocolMessage_;
                        if (r012 == null) {
                            r012 = AnonymousClass1EM.DEFAULT_INSTANCE;
                        }
                        C130546c9 A0H3 = r012.A0H();
                        AnonymousClass1ET r013 = (AnonymousClass1ET) A0X2.A06();
                        AnonymousClass1EM A0W2 = C18310x6.A0W(A0H3);
                        r013.getClass();
                        A0W2.key_ = r013;
                        A0W2.bitField0_ |= 1;
                        r3.A0E((AnonymousClass1EM) A0H3.A06());
                    }
                }
            }
        }
        if (r10 == null || !(r10 instanceof C30961nV)) {
            str = null;
        } else {
            this.A06.get();
            List list = r10.A18;
            C95814uZ r22 = null;
            if (list != null && list.size() == 1 && !C155477ey.A00(((AnonymousClass3ZM) list.get(0)).A00)) {
                r22 = ((AnonymousClass3ZM) list.get(0)).A00;
            }
            str = C627336j.A07(r22);
        }
        if (!C107575bX.A0F(str)) {
            if (AnonymousClass000.A1S(r9.bitField0_ & 67108864)) {
                C21851Dk r014 = r9.messageContextInfo_;
                if (r014 == null) {
                    r014 = C21851Dk.DEFAULT_INSTANCE;
                }
                A0G = r014.A0H();
            } else {
                A0G = C21851Dk.DEFAULT_INSTANCE.A0G();
            }
            C21851Dk r15 = (C21851Dk) A0G.A00;
            if ((r15.bitField0_ & 64) != 0) {
                AnonymousClass1D8 r015 = r15.botMetadata_;
                if (r015 == null) {
                    r015 = AnonymousClass1D8.DEFAULT_INSTANCE;
                }
                A0G2 = r015.A0H();
            } else {
                A0G2 = AnonymousClass1D8.DEFAULT_INSTANCE.A0G();
            }
            AnonymousClass1D8 r16 = (AnonymousClass1D8) C18320x8.A0C(A0G2);
            str.getClass();
            r16.bitField0_ |= 16;
            r16.invokerJid_ = str;
            AnonymousClass1D8 r016 = (AnonymousClass1D8) A0G2.A06();
            C21851Dk r17 = (C21851Dk) C18320x8.A0C(A0G);
            r016.getClass();
            r17.botMetadata_ = r016;
            r17.bitField0_ |= 64;
            AnonymousClass1A4.A04(A0G, r3);
        }
        return AnonymousClass0x9.A0W(r3);
    }
}
