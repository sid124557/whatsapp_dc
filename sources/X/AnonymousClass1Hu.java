package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;

/* renamed from: X.1Hu  reason: invalid class name */
public class AnonymousClass1Hu extends AnonymousClass3OH {
    public final C56972sr A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final AnonymousClass1VX A03;
    public final C53482nA A04;
    public final JniBridge A05;
    public final C183538qC A06;

    public C624134x A02(C55962rC r15) {
        UserJid A0o;
        AnonymousClass1EU r7 = r15.A0B;
        if ((r7.bitField1_ & 128) == 0) {
            return null;
        }
        C21621Cn r3 = r7.pollUpdateMessage_;
        if (r3 == null) {
            r3 = C21621Cn.DEFAULT_INSTANCE;
        }
        boolean A1S = AnonymousClass000.A1S(r3.bitField0_ & 2);
        Integer A0Z = C18300x5.A0Z();
        if (A1S) {
            AnonymousClass1BO r0 = r3.vote_;
            AnonymousClass1BO r2 = r0;
            if (r0 == null) {
                r0 = AnonymousClass1BO.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r2 == null) {
                    r2 = AnonymousClass1BO.DEFAULT_INSTANCE;
                }
                if ((r2.bitField0_ & 1) != 0) {
                    AnonymousClass1ET r02 = r3.pollCreationMessageKey_;
                    if (r02 == null) {
                        r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
                    }
                    if (AnonymousClass3OH.A01(r02)) {
                        AnonymousClass1VX r4 = this.A03;
                        if (AnonymousClass31e.A01(r4) || r4.A0Y(C58422vE.A02, 1541)) {
                            C21621Cn r6 = r7.pollUpdateMessage_;
                            if (r6 == null) {
                                r6 = C21621Cn.DEFAULT_INSTANCE;
                            }
                            AnonymousClass2z0 r12 = r15.A0D;
                            C30591mh r03 = new C30591mh(r12, r15.A05);
                            C95814uZ r9 = r15.A08;
                            C53482nA r5 = this.A04;
                            AnonymousClass1ET r22 = r6.pollCreationMessageKey_;
                            if (r22 == null) {
                                r22 = AnonymousClass1ET.DEFAULT_INSTANCE;
                            }
                            r03.A05 = r5.A00(r9, r22, r12);
                            if (r4.A0Y(C58422vE.A01, 6772)) {
                                C21621Cn r42 = r7.pollUpdateMessage_;
                                if (r42 == null && (r42 = C21621Cn.DEFAULT_INSTANCE) == null) {
                                    Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollUpdateMessage is null for a poll vote message");
                                    throw AnonymousClass24W.A01(A0Z, "poll_update_is_missing");
                                }
                                AnonymousClass1ET r11 = r42.pollCreationMessageKey_;
                                if (r11 == null) {
                                    r11 = AnonymousClass1ET.DEFAULT_INSTANCE;
                                }
                                if ((r42.bitField0_ & 8) != 0) {
                                    r03.A00 = r42.senderTimestampMs_;
                                    AnonymousClass1BO r8 = r42.vote_;
                                    if (r8 == null && (r8 = AnonymousClass1BO.DEFAULT_INSTANCE) == null) {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollEncValue is null for a poll vote message");
                                        throw AnonymousClass24W.A01(A0Z, "poll_update_is_missing_pollEncValue");
                                    }
                                    C30451mT r43 = (C30451mT) ((C55832qz) this.A06.get()).A05(r03.A1v());
                                    if (r43 == null) {
                                        r03.A02 = r7.A0F();
                                        return r03;
                                    }
                                    AnonymousClass2z0 r32 = r03.A1J;
                                    if (r32.A02) {
                                        C56972sr r72 = this.A00;
                                        C56982ss r62 = this.A01;
                                        C95814uZ r33 = r32.A00;
                                        A0o = C615331d.A00(r72, r62, r33, this.A02.A0B(r33));
                                    } else if (r9 != null) {
                                        A0o = (UserJid) r9;
                                    } else {
                                        A0o = r03.A0o();
                                    }
                                    try {
                                        C40682Hi A012 = C615331d.A01((AnonymousClass1A9) C130786cX.A05(AnonymousClass1A9.DEFAULT_INSTANCE, r5.A02(new C53672nT(r8.encIv_, r8.encPayload_, r9, A0o, r11, r12, "Poll Vote"))), r43.A05, r43.A01);
                                        if (A012 != null) {
                                            List list = A012.A00;
                                            List list2 = r03.A06;
                                            list2.clear();
                                            list2.addAll(list);
                                            return r03;
                                        }
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - poll vote payload is null");
                                        throw AnonymousClass24W.A00(0);
                                    } catch (AnonymousClass6u5 e) {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - failed to parse payload into protobuf", e);
                                        throw new AnonymousClass24W(A0Z);
                                    }
                                } else {
                                    throw AnonymousClass24W.A01(A0Z, "poll_update_missing_sender_timestamp");
                                }
                            } else {
                                C626936e.A06(r6);
                                int i = r6.bitField0_;
                                if ((i & 1) == 0) {
                                    throw AnonymousClass24W.A01(A0Z, "poll_update_missing_poll_message_key");
                                } else if ((i & 8) != 0) {
                                    r03.A00 = r6.senderTimestampMs_;
                                    if ((i & 2) != 0) {
                                        AnonymousClass1BO r52 = r6.vote_;
                                        if (r52 == null) {
                                            r52 = AnonymousClass1BO.DEFAULT_INSTANCE;
                                        }
                                        if ((r52.bitField0_ & 2) != 0) {
                                            byte[] A07 = r52.encIv_.A07();
                                            if (A07.length == 12) {
                                                r03.A03 = A07;
                                                if ((r52.bitField0_ & 1) != 0) {
                                                    r03.A04 = r52.encPayload_.A07();
                                                    return r03;
                                                }
                                                throw AnonymousClass24W.A01(A0Z, "poll_update_missing_vote_enc_payload");
                                            }
                                            throw AnonymousClass24W.A01(A0Z, "poll_update_invalid_vote_enc_iv");
                                        }
                                        throw AnonymousClass24W.A01(A0Z, "poll_update_missing_vote_enc_iv");
                                    }
                                    throw AnonymousClass24W.A01(A0Z, "poll_update_missing_update");
                                } else {
                                    throw AnonymousClass24W.A01(A0Z, "poll_update_missing_sender_timestamp");
                                }
                            }
                        } else {
                            C30351mJ A002 = C30351mJ.A00(r15.A0C, r15.A0D, r15.A05);
                            A002.A00 = 67;
                            return A002;
                        }
                    } else {
                        throw AnonymousClass24W.A01(A0Z, "Invalid parent key.");
                    }
                } else {
                    throw AnonymousClass24W.A01(A0Z, "Vote enc payload is missing.");
                }
            } else {
                throw AnonymousClass24W.A01(A0Z, "Vote enc IV is missing.");
            }
        } else {
            throw AnonymousClass24W.A01(A0Z, "Vote is missing.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0171, code lost:
        if (r6 == false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyD(X.C55032pg r19, X.C624134x r20) {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof X.C30591mh
            if (r0 == 0) goto L_0x01e7
            X.1mh r5 = (X.C30591mh) r5
            r8 = r19
            X.1A4 r2 = r8.A00
            X.6cX r0 = r2.A00
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.1Cn r0 = r0.pollUpdateMessage_
            if (r0 != 0) goto L_0x0016
            X.1Cn r0 = X.C21621Cn.DEFAULT_INSTANCE
        L_0x0016:
            X.6c9 r1 = r0.A0H()
            long r3 = r5.A00
            X.6cX r6 = X.C18320x8.A0C(r1)
            X.1Cn r6 = (X.C21621Cn) r6
            int r0 = r6.bitField0_
            r0 = r0 | 8
            r6.bitField0_ = r0
            r6.senderTimestampMs_ = r3
            X.1BO r0 = r6.vote_
            if (r0 != 0) goto L_0x0030
            X.1BO r0 = X.AnonymousClass1BO.DEFAULT_INSTANCE
        L_0x0030:
            X.6c9 r0 = r0.A0H()
            X.19e r0 = (X.C207519e) r0
            r3 = r18
            X.1VX r7 = r3.A03
            X.2vE r6 = X.C58422vE.A01
            r4 = 6772(0x1a74, float:9.49E-42)
            boolean r4 = r7.A0Y(r6, r4)
            if (r4 == 0) goto L_0x0068
            X.1A9 r4 = X.AnonymousClass1A9.DEFAULT_INSTANCE
            X.6c9 r10 = r4.A0G()
            X.19f r10 = (X.C207619f) r10
            java.util.List r4 = r5.A01
            java.util.Iterator r6 = r4.iterator()
        L_0x0052:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0158
            java.lang.String r4 = X.AnonymousClass001.A0m(r6)
            byte[] r4 = X.AnonymousClass0x7.A1X(r4)
            X.8Lq r4 = X.AnonymousClass0x9.A0J(r4)
            r10.A09(r4)
            goto L_0x0052
        L_0x0068:
            X.6cX r4 = r1.A00
            X.1Cn r4 = (X.C21621Cn) r4
            X.1ET r4 = r4.pollCreationMessageKey_
            if (r4 != 0) goto L_0x0072
            X.1ET r4 = X.AnonymousClass1ET.DEFAULT_INSTANCE
        L_0x0072:
            X.1A1 r10 = X.AnonymousClass0x9.A0X(r4)
            X.2z0 r9 = r5.A1v()
            X.4uZ r6 = X.C30331mH.A00(r5)
            X.C626936e.A06(r9)
            r4 = 0
            X.C33051sM.A02(r6, r10, r9, r4)
            X.6cX r7 = X.C18320x8.A0C(r1)
            X.1Cn r7 = (X.C21621Cn) r7
            X.1ET r4 = X.C18290x4.A0V(r10)
            r7.pollCreationMessageKey_ = r4
            int r4 = r7.bitField0_
            r4 = r4 | 1
            r7.bitField0_ = r4
            byte[] r7 = r5.A03
            if (r7 == 0) goto L_0x00bf
            byte[] r4 = r5.A04
            if (r4 == 0) goto L_0x00bf
            int r3 = r7.length
            r6 = 0
            X.8Lq r3 = X.C172548Lq.A02(r7, r6, r3)
            r0.A09(r3)
            byte[] r4 = r5.A04
            int r3 = r4.length
            X.8Lq r5 = X.C172548Lq.A02(r4, r6, r3)
        L_0x00af:
            X.6cX r4 = X.C18320x8.A0C(r0)
            X.1BO r4 = (X.AnonymousClass1BO) r4
            int r3 = r4.bitField0_
            r3 = r3 | 1
            r4.bitField0_ = r3
            r4.encPayload_ = r5
            goto L_0x01ba
        L_0x00bf:
            java.util.List r4 = r5.A01
            X.C626936e.A06(r4)
            byte[] r4 = r5.A05
            X.C626936e.A06(r4)
            com.whatsapp.wamsys.JniBridge r12 = r3.A05
            byte[] r15 = r5.A05
            java.util.List r7 = r5.A01
            java.lang.String r13 = r9.A01
            boolean r4 = r9.A02
            if (r4 == 0) goto L_0x011b
            boolean r6 = r8.A06
            X.2sr r4 = r3.A00
            if (r6 == 0) goto L_0x0120
            X.1fH r10 = r4.A0I()
        L_0x00df:
            X.2z0 r4 = r5.A1J
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x0113
            X.2sr r6 = r3.A00
            X.2ss r5 = r3.A01
            X.4uZ r4 = r9.A00
            boolean r3 = r8.A06
            com.whatsapp.jid.UserJid r11 = X.C615331d.A00(r6, r5, r4, r3)
        L_0x00f1:
            X.1A9 r3 = X.AnonymousClass1A9.DEFAULT_INSTANCE
            X.6c9 r5 = r3.A0G()
            X.19f r5 = (X.C207619f) r5
            java.util.Iterator r4 = r7.iterator()
        L_0x00fd:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0128
            java.lang.String r3 = X.AnonymousClass001.A0m(r4)
            byte[] r3 = X.AnonymousClass0x7.A1X(r3)
            X.8Lq r3 = X.AnonymousClass0x9.A0J(r3)
            r5.A09(r3)
            goto L_0x00fd
        L_0x0113:
            com.whatsapp.jid.UserJid r11 = r5.A0o()
            X.C626936e.A06(r11)
            goto L_0x00f1
        L_0x011b:
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass32Y.A03(r6)
            goto L_0x0124
        L_0x0120:
            com.whatsapp.jid.PhoneUserJid r10 = X.C56972sr.A04(r4)
        L_0x0124:
            X.C626936e.A06(r10)
            goto L_0x00df
        L_0x0128:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0l(r13)
            r3 = 0
            r4.append(r3)
            X.C18280x3.A0u(r11, r4)
            java.lang.String r4 = r4.toString()
            java.nio.charset.Charset r3 = X.C58152un.A0D
            byte[] r16 = r4.getBytes(r3)
            byte[] r17 = X.C18290x4.A1Z(r5)
            java.lang.String r14 = "Poll Vote"
            X.2Lv r4 = X.C57512tl.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r4 != 0) goto L_0x014f
            java.lang.String r0 = "MessageAddOnPollVoteUtils/encryptPollVotePayload encryptionResult is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x014f:
            X.8Lq r3 = r4.A00
            r0.A09(r3)
            X.8Lq r5 = r4.A01
            goto L_0x00af
        L_0x0158:
            X.2sr r9 = r3.A00
            X.2ss r7 = r3.A01
            X.2z0 r4 = r5.A1v()
            X.4uZ r4 = r4.A00
            boolean r6 = r8.A06
            com.whatsapp.jid.UserJid r7 = X.C615331d.A00(r9, r7, r4, r6)
            X.2z0 r4 = r5.A1v()
            boolean r4 = r4.A02
            if (r4 == 0) goto L_0x0173
            r11 = 1
            if (r6 != 0) goto L_0x0174
        L_0x0173:
            r11 = 0
        L_0x0174:
            byte[] r10 = X.C18290x4.A1Z(r10)
            X.2z0 r8 = r5.A1v()
            java.lang.String r9 = "Poll Vote"
            X.2mh r6 = new X.2mh
            r6.<init>(r7, r8, r9, r10, r11)
            X.2nA r3 = r3.A04
            X.3Z1 r6 = r3.A01(r6)
            java.lang.Object r3 = r6.first
            X.8Lq r3 = (X.C172548Lq) r3
            r0.A09(r3)
            java.lang.Object r5 = r6.second
            X.8Lq r5 = (X.C172548Lq) r5
            X.6cX r4 = X.C18320x8.A0C(r0)
            X.1BO r4 = (X.AnonymousClass1BO) r4
            r5.getClass()
            int r3 = r4.bitField0_
            r3 = r3 | 1
            r4.bitField0_ = r3
            r4.encPayload_ = r5
            java.lang.Object r3 = r6.third
            X.1ET r3 = (X.AnonymousClass1ET) r3
            X.6cX r4 = X.C18320x8.A0C(r1)
            X.1Cn r4 = (X.C21621Cn) r4
            r3.getClass()
            r4.pollCreationMessageKey_ = r3
            int r3 = r4.bitField0_
            r3 = r3 | 1
            r4.bitField0_ = r3
        L_0x01ba:
            X.6cX r3 = X.C18320x8.A0C(r1)
            X.1Cn r3 = (X.C21621Cn) r3
            X.6cX r0 = r0.A06()
            X.1BO r0 = (X.AnonymousClass1BO) r0
            r0.getClass()
            r3.vote_ = r0
            int r0 = r3.bitField0_
            r0 = r0 | 2
            r3.bitField0_ = r0
            X.1EU r2 = X.C18290x4.A0T(r2)
            X.6cX r0 = r1.A06()
            X.1Cn r0 = (X.C21621Cn) r0
            r0.getClass()
            r2.pollUpdateMessage_ = r0
            int r0 = r2.bitField1_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r2.bitField1_ = r0
            return
        L_0x01e7:
            java.lang.String r0 = "FMessagePollVoteProtobuf/not supported message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hu.AyD(X.2pg, X.34x):void");
    }

    public AnonymousClass1Hu(C56972sr r1, C56982ss r2, C56892sj r3, AnonymousClass1VX r4, C53482nA r5, JniBridge jniBridge, C183538qC r7) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = jniBridge;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
    }
}
