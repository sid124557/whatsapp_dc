package X;

import android.text.TextUtils;

/* renamed from: X.3O2  reason: invalid class name */
public class AnonymousClass3O2 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C55682qk A00;
    public final C45042Yl A01;

    public void AyD(C55032pg r2, C624134x r3) {
        C31901p2 r32 = (C31901p2) r3;
        AnonymousClass4DW A002 = this.A01.A00(r32);
        if (A002 != null) {
            A002.AyC(r2, r32);
        }
    }

    public C624134x BgW(C55962rC r14) {
        AnonymousClass20E r12;
        String str;
        AnonymousClass1C9 r0;
        int i;
        String str2;
        AnonymousClass22W r5;
        AnonymousClass397 r02;
        AnonymousClass39N r1;
        C31901p2 r52;
        AnonymousClass22X r03;
        AnonymousClass1EU r9 = r14.A0B;
        if ((r9.bitField0_ & 1073741824) != 0) {
            AnonymousClass1DC r6 = r9.listResponseMessage_;
            if (r6 == null) {
                r6 = AnonymousClass1DC.DEFAULT_INSTANCE;
            }
            C626936e.A06(r6);
            r52 = new C31901p2(r14.A0D, r14.A05);
            String str3 = r6.title_;
            String str4 = r6.description_;
            AnonymousClass1AQ r04 = r6.singleSelectReply_;
            if (r04 == null) {
                r04 = AnonymousClass1AQ.DEFAULT_INSTANCE;
            }
            String str5 = r04.selectedRowId_;
            int i2 = r6.listType_;
            if (i2 == 0 || i2 != 1) {
                r03 = AnonymousClass22X.UNKNOWN;
            } else {
                r03 = AnonymousClass22X.SINGLE_SELECT;
            }
            r1 = new AnonymousClass39N(str3, str4, str5, r03.value);
        } else if ((r9.bitField1_ & 32) == 0) {
            return null;
        } else {
            C55682qk r62 = this.A00;
            AnonymousClass2z0 r7 = r14.A0D;
            long j = r14.A05;
            C21521Cd r2 = r9.interactiveResponseMessage_;
            if (r2 == null) {
                r2 = C21521Cd.DEFAULT_INSTANCE;
            }
            int i3 = r2.interactiveResponseMessageCase_;
            if (i3 == 0) {
                r12 = AnonymousClass20E.INTERACTIVERESPONSEMESSAGE_NOT_SET;
            } else if (i3 != 2) {
                r12 = null;
            } else {
                r12 = AnonymousClass20E.NATIVE_FLOW_RESPONSE_MESSAGE;
            }
            if (r12 == null || r12 == AnonymousClass20E.INTERACTIVERESPONSEMESSAGE_NOT_SET) {
                str = "messageCase null/not_set";
            } else {
                if (r12.ordinal() != 0) {
                    i = -1;
                } else {
                    if (i3 == 2) {
                        r0 = (AnonymousClass1C9) r2.interactiveResponseMessage_;
                    } else {
                        r0 = AnonymousClass1C9.DEFAULT_INSTANCE;
                    }
                    i = r0.version_;
                    if (i <= 1) {
                        if ((r2.bitField0_ & 1) != 0) {
                            AnonymousClass1BI r13 = r2.body_;
                            AnonymousClass1BI r05 = r13;
                            if (r13 == null) {
                                r13 = AnonymousClass1BI.DEFAULT_INSTANCE;
                            }
                            str2 = r13.text_;
                            if (r05 == null) {
                                r05 = AnonymousClass1BI.DEFAULT_INSTANCE;
                            }
                            int i4 = r05.format_;
                            if (i4 == 0 || i4 != 1) {
                                r5 = AnonymousClass22W.DEFAULT;
                            } else {
                                r5 = AnonymousClass22W.EXTENSIONS_1;
                            }
                        } else {
                            str2 = null;
                            r5 = null;
                        }
                        if (i3 != 2) {
                            throw AnonymousClass001.A0e(AnonymousClass000.A0Y("Unexpected value: ", AnonymousClass001.A0o(), 0));
                        } else if (!TextUtils.isEmpty(str2)) {
                            if (r2.interactiveResponseMessageCase_ == 2) {
                                AnonymousClass1C9 r06 = (AnonymousClass1C9) r2.interactiveResponseMessage_;
                                r02 = new AnonymousClass397(r06.name_, r06.paramsJson_);
                            } else {
                                r02 = null;
                            }
                            r1 = new AnonymousClass39N(r5, r02, str2);
                            r52 = new C31901p2(r7, j);
                        } else {
                            throw AnonymousClass24W.A01(C18320x8.A0X(), "NFM response message is required body");
                        }
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("message: ");
                A0o.append(r12.name());
                str = AnonymousClass000.A0Y(", version: ", A0o, i);
            }
            r62.A0A("FMessageInteractiveResponseFactory/isUnknownInteractiveMessage", false, str);
            return C30351mJ.A00(r9, r7, j);
        }
        r52.A00 = r1;
        return r52;
    }

    public AnonymousClass3O2(C55682qk r1, C45042Yl r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
