package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2yJ  reason: invalid class name and case insensitive filesystem */
public class C60292yJ {
    public final C55682qk A00;
    public final C66543Lv A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass33Y A03;
    public final C44642Wx A04;
    public final C48752fP A05;
    public final C51992ki A06;
    public final C59122wO A07;
    public final C54472om A08;
    public final Map A09;

    public final C624134x A01(AnonymousClass1ER r8, AnonymousClass2z0 r9, AnonymousClass39W r10, long j, boolean z, boolean z2) {
        AnonymousClass1ED r2;
        AnonymousClass1DR r22 = r8.header_;
        if (r22 == null) {
            r22 = AnonymousClass1DR.DEFAULT_INSTANCE;
        }
        if (r22.mediaCase_ == 7) {
            r2 = (AnonymousClass1ED) r22.media_;
        } else {
            r2 = AnonymousClass1ED.DEFAULT_INSTANCE;
        }
        C31941p8 r3 = new C31941p8(r9, r10, j);
        C54472om r1 = this.A08;
        r1.A04(r2, r3, r3.A01, z, z2);
        r1.A03(r2, r3, r3.A01, z);
        return r3;
    }

    public C624134x A02(AnonymousClass1EU r26, AnonymousClass2z0 r27, String str, long j, boolean z, boolean z2, boolean z3) {
        int i;
        AnonymousClass24W r0;
        AnonymousClass4DV r1;
        C30791n7 r2;
        AnonymousClass1n1 r9;
        AnonymousClass1EE r12;
        C21991Dy r02;
        AnonymousClass1EB r13;
        AnonymousClass1EE r14;
        AnonymousClass1C8 r3;
        AnonymousClass1BG r32;
        AnonymousClass1C6 r33;
        AnonymousClass1EU r4 = r26;
        AnonymousClass1ER A002 = C625235k.A00(r4);
        AnonymousClass2z0 r122 = r27;
        long j2 = j;
        try {
            if (A00(A002) != 7 || this.A02.A0Y(C58422vE.A02, 4668)) {
                AnonymousClass20G A0M = A002.A0M();
                if (A0M == null || A0M == AnonymousClass20G.INTERACTIVEMESSAGE_NOT_SET) {
                    this.A00.A0A("FMessageInteractiveFactory/isUnknownInteractiveMessage", false, "messageCase null/not_set");
                } else {
                    int ordinal = A0M.ordinal();
                    if (ordinal == 0) {
                        if (A002.interactiveMessageCase_ == 4) {
                            r3 = (AnonymousClass1C8) A002.interactiveMessage_;
                        } else {
                            r3 = AnonymousClass1C8.DEFAULT_INSTANCE;
                        }
                        i = r3.messageVersion_;
                    } else if (ordinal == 2) {
                        i = A002.A0N().messageVersion_;
                    } else if (ordinal == 3) {
                        if (A002.interactiveMessageCase_ == 7) {
                            r32 = (AnonymousClass1BG) A002.interactiveMessage_;
                        } else {
                            r32 = AnonymousClass1BG.DEFAULT_INSTANCE;
                        }
                        i = r32.messageVersion_;
                    } else if (ordinal != 1) {
                        i = -1;
                    } else {
                        if (A002.interactiveMessageCase_ == 5) {
                            r33 = (AnonymousClass1C6) A002.interactiveMessage_;
                        } else {
                            r33 = AnonymousClass1C6.DEFAULT_INSTANCE;
                        }
                        i = r33.messageVersion_;
                    }
                    if (i == -1) {
                        C55682qk r34 = this.A00;
                        StringBuilder A0l = AnonymousClass000.A0l("message: ");
                        A0l.append(A0M.name());
                        r34.A0A("FMessageInteractiveFactory/isUnknownInteractiveMessage", false, AnonymousClass000.A0Y(", version: ", A0l, i));
                    } else if (i <= 1) {
                        int A003 = A00(A002);
                        C619232u r03 = (C619232u) AnonymousClass001.A0i(this.A09, A003);
                        if (r03 != null) {
                            String str2 = str;
                            r03.A00 = str2;
                            r03.A01 = z3;
                            AnonymousClass39W A022 = r03.A02(A002);
                            AnonymousClass1ER A004 = C625235k.A00(r4);
                            if (AnonymousClass34T.A01(A004)) {
                                C162457s7.A0J(r122, 1);
                                r2 = new C30791n7(r122, (byte) 54, j2);
                            } else {
                                int i2 = 0;
                                C162457s7.A0J(A004, 0);
                                AnonymousClass34T r5 = AnonymousClass34T.A00;
                                if (r5.A02(A004, "review_order") || r5.A02(A004, "payment_method") || r5.A02(A004, "payment_status")) {
                                    boolean A0Y = this.A02.A0Y(C58422vE.A02, 5770);
                                    AnonymousClass1ER A005 = C625235k.A00(r4);
                                    C162457s7.A0J(r122, 1);
                                    C30791n7 r22 = new C30791n7(r122, (byte) 55, j2);
                                    r22.A00 = A022;
                                    r22.A1w();
                                    C162457s7.A0J(A005, 0);
                                    if (r5.A02(A005, "payment_method") || r5.A02(A005, "payment_status")) {
                                        r1 = AnonymousClass35F.A01(this.A01, AnonymousClass2z0.A01(r122), r4, A0Y);
                                    } else {
                                        if (r5.A02(A005, "review_order")) {
                                            r1 = AnonymousClass35F.A00(this.A01, AnonymousClass2z0.A01(r122), this.A03, r4, r22, A0Y);
                                        }
                                        return r22;
                                    }
                                    if (r1 != null) {
                                        this.A04.A00(r22, (C624134x) r1);
                                    }
                                    return r22;
                                }
                                boolean z4 = z;
                                boolean z5 = z2;
                                if ((A004.bitField0_ & 1) != 0) {
                                    AnonymousClass1DR r04 = A004.header_;
                                    AnonymousClass1DR r15 = r04;
                                    AnonymousClass1DR r23 = r04;
                                    if (r04 == null) {
                                        r04 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                    }
                                    if ((r04.bitField0_ & 128) != 0) {
                                        if (r15 == null) {
                                            r23 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                        }
                                        if (r23.mediaCase_ == 4 && !"catalog_message".equals(str2)) {
                                            AnonymousClass1n1 r24 = new AnonymousClass1n1(r122, A022, j2);
                                            C51992ki r6 = this.A06;
                                            AnonymousClass1DR r35 = A004.header_;
                                            if (r35 == null) {
                                                r35 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                            }
                                            if (r35.mediaCase_ == 4) {
                                                r14 = (AnonymousClass1EE) r35.media_;
                                            } else {
                                                r14 = AnonymousClass1EE.DEFAULT_INSTANCE;
                                            }
                                            r6.A03(r14, r24, r24.A01, z4, z5);
                                            return r24;
                                        }
                                    }
                                    AnonymousClass1DR r05 = r15;
                                    AnonymousClass1DR r25 = r15;
                                    if (r15 == null) {
                                        r05 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                    }
                                    if ((r05.bitField0_ & 128) != 0) {
                                        if (r15 == null) {
                                            r25 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                        }
                                        if (r25.mediaCase_ == 7) {
                                            return A01(A004, r122, A022, j2, z4, z5);
                                        }
                                    }
                                    AnonymousClass1DR r06 = r15;
                                    AnonymousClass1DR r28 = r15;
                                    if (r15 == null) {
                                        r06 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                    }
                                    if ((r06.bitField0_ & 128) != 0) {
                                        if (r15 == null) {
                                            r28 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                        }
                                        if (r28.mediaCase_ == 3) {
                                            C30741mw r29 = new C30741mw(r122, A022, j2);
                                            C48752fP r36 = this.A05;
                                            AnonymousClass1DR r16 = A004.header_;
                                            if (r16 == null) {
                                                r16 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                            }
                                            if (r16.mediaCase_ == 3) {
                                                r13 = (AnonymousClass1EB) r16.media_;
                                            } else {
                                                r13 = AnonymousClass1EB.DEFAULT_INSTANCE;
                                            }
                                            r36.A01(r13, r29, r29.A01, z4, z5);
                                            return r29;
                                        }
                                    }
                                    AnonymousClass1DR r07 = r15;
                                    if (r15 == null) {
                                        r07 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                    }
                                    if ((r07.bitField0_ & 128) != 0) {
                                        if (r15 == null) {
                                            r15 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                        }
                                        if (r15.mediaCase_ == 8) {
                                            C30991nZ r210 = new C30991nZ(r122, A022, j2);
                                            AnonymousClass1DR r17 = A004.header_;
                                            if (r17 == null) {
                                                r17 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                            }
                                            if (r17.mediaCase_ == 8) {
                                                r02 = (C21991Dy) r17.media_;
                                            } else {
                                                r02 = C21991Dy.DEFAULT_INSTANCE;
                                            }
                                            C59122wO.A00(r02, r210, z5);
                                            return r210;
                                        }
                                    }
                                }
                                if (A004.interactiveMessageCase_ == 7) {
                                    C188248ya r7 = ((AnonymousClass1BG) A004.interactiveMessage_).cards_;
                                    ArrayList A0s = AnonymousClass001.A0s();
                                    while (i2 < r7.size()) {
                                        AnonymousClass1ER r211 = (AnonymousClass1ER) r7.get(i2);
                                        if ((r211.bitField0_ & 1) != 0) {
                                            AnonymousClass1DR r08 = r211.header_;
                                            AnonymousClass1DR r18 = r08;
                                            if (r08 == null) {
                                                r08 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                            }
                                            if ((r08.bitField0_ & 128) != 0) {
                                                if (r18 == null) {
                                                    r18 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                                }
                                                if (r18.mediaCase_ == 4) {
                                                    C30611mj r19 = new C30611mj(r122, i2);
                                                    C631638e r09 = A022.A05;
                                                    C626936e.A06(r09);
                                                    AnonymousClass1n1 r92 = new AnonymousClass1n1(r19, (AnonymousClass39W) r09.A00.get(i2), j2);
                                                    C51992ki r8 = this.A06;
                                                    AnonymousClass1DR r212 = r211.header_;
                                                    if (r212 == null) {
                                                        r212 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                                    }
                                                    if (r212.mediaCase_ == 4) {
                                                        r12 = (AnonymousClass1EE) r212.media_;
                                                    } else {
                                                        r12 = AnonymousClass1EE.DEFAULT_INSTANCE;
                                                    }
                                                    r8.A03(r12, r92, r92.A01, z4, z5);
                                                    r9 = r92;
                                                    A0s.add(r9);
                                                    i2++;
                                                }
                                            }
                                        }
                                        if ((r211.bitField0_ & 1) != 0) {
                                            AnonymousClass1DR r010 = r211.header_;
                                            AnonymousClass1DR r110 = r010;
                                            if (r010 == null) {
                                                r010 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                            }
                                            if ((r010.bitField0_ & 128) != 0) {
                                                if (r110 == null) {
                                                    r110 = AnonymousClass1DR.DEFAULT_INSTANCE;
                                                }
                                                if (r110.mediaCase_ == 7) {
                                                    C30611mj r111 = new C30611mj(r122, i2);
                                                    C631638e r011 = A022.A05;
                                                    C626936e.A06(r011);
                                                    r9 = A01(r211, r111, (AnonymousClass39W) r011.A00.get(i2), j2, z4, z5);
                                                    A0s.add(r9);
                                                    i2++;
                                                }
                                            }
                                        }
                                        r0 = AnonymousClass24W.A01(C18320x8.A0X(), "not supported carousel card type");
                                    }
                                    C162457s7.A0J(r122, 1);
                                    r2 = new C30791n7(r122, (byte) 55, j2);
                                    r2.A00 = A022;
                                    r2.A1w();
                                    r2.A01 = A0s;
                                    r2.A1x();
                                    r2.A1w();
                                    return r2;
                                }
                                C162457s7.A0J(r122, 1);
                                r2 = new C30791n7(r122, (byte) 55, j2);
                            }
                            r2.A00 = A022;
                            r2.A1w();
                            return r2;
                        }
                        r0 = AnonymousClass24W.A01(C18320x8.A0X(), AnonymousClass000.A0Y("unknown type: ", AnonymousClass001.A0o(), A003));
                        throw r0;
                    } else {
                        C55682qk r37 = this.A00;
                        StringBuilder A0l2 = AnonymousClass000.A0l("message: ");
                        A0l2.append(A0M.name());
                        r37.A0A("FMessageInteractiveFactory/isUnknownInteractiveMessage: unsupported version", false, AnonymousClass000.A0Y(", version: ", A0l2, i));
                    }
                }
            }
            return C30351mJ.A00(r4, r122, j2);
        } catch (AnonymousClass24W e) {
            if (e.e2eFailureReason.intValue() != 0) {
                C18260x0.A1S(AnonymousClass001.A0o(), "FMessageInteractiveFactory/parseInteractiveMessage/invalid message; message.key=", r122);
                C55682qk r38 = this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("error: ");
                r38.A0A("FMessageInteractiveFactory/parseInteractiveMessage/invalid_message", true, AnonymousClass000.A0X(e.description, A0o));
                return C30351mJ.A00(r4, r122, j2);
            }
            throw e;
        }
    }

    public C60292yJ(C55682qk r1, C66543Lv r2, AnonymousClass1VX r3, AnonymousClass33Y r4, C44642Wx r5, C48752fP r6, C51992ki r7, C59122wO r8, C54472om r9, Map map) {
        this.A06 = r7;
        this.A08 = r9;
        this.A05 = r6;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = map;
    }

    public static int A00(AnonymousClass1ER r3) {
        int ordinal = r3.A0M().ordinal();
        if (ordinal == 0) {
            return 4;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return 0;
            }
            return 7;
        } else if (AnonymousClass34T.A01(r3)) {
            return 3;
        } else {
            if (r3.interactiveMessageCase_ != 6 || !AnonymousClass34T.A00.A02(r3, "mpm")) {
                return 5;
            }
            return 6;
        }
    }
}
