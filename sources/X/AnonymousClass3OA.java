package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.3OA  reason: invalid class name */
public class AnonymousClass3OA implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56982ss A00;
    public final AnonymousClass1VX A01;
    public final C59542x5 A02;

    public void AyD(C55032pg r11, C624134x r12) {
        AnonymousClass1DG r0;
        AnonymousClass1EU A0L;
        int i;
        int i2;
        if (r12 instanceof C30451mT) {
            C30451mT r122 = (C30451mT) r12;
            AnonymousClass2z0 r02 = r122.A1J;
            int i3 = r122.A01;
            String str = r122.A03;
            List list = r122.A05;
            boolean A0N = this.A00.A0N(r02.A00);
            boolean A1T = AnonymousClass001.A1T(i3);
            AnonymousClass1A4 r4 = r11.A00;
            AnonymousClass1EU r03 = (AnonymousClass1EU) r4.A00;
            if (A0N) {
                r0 = r03.pollCreationMessageV2_;
            } else if (A1T) {
                r0 = r03.pollCreationMessageV3_;
            } else {
                r0 = r03.pollCreationMessage_;
            }
            if (r0 == null) {
                r0 = AnonymousClass1DG.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r0.A0H();
            if (!TextUtils.isEmpty(str)) {
                AnonymousClass1DG r1 = (AnonymousClass1DG) C18320x8.A0C(A0H);
                str.getClass();
                r1.bitField0_ |= 2;
                r1.name_ = str;
            }
            AnonymousClass3Z2 r3 = r11.A01;
            byte[] bArr = r11.A09;
            if (C59542x5.A01(r3, r122, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A02, r11, r3, r122, bArr);
                AnonymousClass1DG r13 = (AnonymousClass1DG) C18320x8.A0C(A0H);
                A002.getClass();
                r13.contextInfo_ = A002;
                r13.bitField0_ |= 8;
            }
            AnonymousClass1DG r14 = (AnonymousClass1DG) C18320x8.A0C(A0H);
            r14.bitField0_ |= 4;
            r14.selectableOptionsCount_ = i3;
            for (int i4 = 0; i4 < list.size(); i4++) {
                C130546c9 A0G = AnonymousClass1AU.DEFAULT_INSTANCE.A0G();
                String str2 = ((C60142y4) list.get(i4)).A03;
                AnonymousClass1AU r15 = (AnonymousClass1AU) C18320x8.A0C(A0G);
                str2.getClass();
                r15.bitField0_ |= 1;
                r15.optionName_ = str2;
                C130786cX A06 = A0G.A06();
                AnonymousClass1DG r2 = (AnonymousClass1DG) C18320x8.A0C(A0H);
                A06.getClass();
                C188248ya r16 = r2.options_;
                if (!((AnonymousClass8T6) r16).A00) {
                    r16 = C130786cX.A07(r16);
                    r2.options_ = r16;
                }
                r16.add(A06);
            }
            AnonymousClass1DG r04 = (AnonymousClass1DG) A0H.A06();
            if (A0N) {
                A0L = AnonymousClass0x2.A0L(r4, r04);
                A0L.pollCreationMessageV2_ = r04;
                i = A0L.bitField1_;
                i2 = 32768;
            } else if (A1T) {
                A0L = AnonymousClass0x2.A0L(r4, r04);
                A0L.pollCreationMessageV3_ = r04;
                i = A0L.bitField1_;
                i2 = 524288;
            } else {
                AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(r4, r04);
                A0L2.pollCreationMessage_ = r04;
                A0L2.bitField1_ |= 64;
                return;
            }
            A0L.bitField1_ = i | i2;
            return;
        }
        throw AnonymousClass001.A0c("FMessagePollProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r14) {
        AnonymousClass1VX r7;
        AnonymousClass1DG r6;
        String str;
        AnonymousClass1EU r4 = r14.A0B;
        int i = r4.bitField1_;
        if ((i & 64) != 0) {
            r7 = this.A01;
            if (AnonymousClass31e.A01(r7)) {
                r6 = r4.pollCreationMessage_;
            }
            return C30351mJ.A00(r14.A0C, r14.A0D, r14.A05);
        } else if ((32768 & i) != 0) {
            r7 = this.A01;
            if (AnonymousClass31e.A00(r7)) {
                r6 = r4.pollCreationMessageV2_;
            }
            return C30351mJ.A00(r14.A0C, r14.A0D, r14.A05);
        } else if ((i & 524288) == 0) {
            return null;
        } else {
            r7 = this.A01;
            if (AnonymousClass31e.A02(r7)) {
                r6 = r4.pollCreationMessageV3_;
            }
            return C30351mJ.A00(r14.A0C, r14.A0D, r14.A05);
        }
        if (r6 == null) {
            r6 = AnonymousClass1DG.DEFAULT_INSTANCE;
        }
        C30451mT r5 = new C30451mT(r14.A0D, r14.A05);
        boolean A1S = AnonymousClass000.A1S(r6.bitField0_ & 2);
        Integer A0Z = C18300x5.A0Z();
        if (A1S) {
            boolean z = r14.A0O;
            String str2 = r6.name_;
            if (z) {
                if (str2 == null) {
                    str2 = "";
                }
                r5.A03 = str2;
            } else if (TextUtils.isEmpty(str2) || str2.length() > 5000) {
                throw AnonymousClass24W.A01(A0Z, "poll_creation_invalid_name");
            } else {
                r5.A03 = str2;
                if (r6.options_.size() > 0) {
                    C188248ya<AnonymousClass1AU> r2 = r6.options_;
                    int min = Math.min(r7.A0O(C58422vE.A02, 1408), 12);
                    if (r2 == null || r2.size() < 2) {
                        throw AnonymousClass24W.A01(A0Z, "poll_creation_invalid_options_count");
                    }
                    LinkedHashSet A17 = AnonymousClass0x9.A17();
                    for (AnonymousClass1AU r1 : r2) {
                        if ((r1.bitField0_ & 1) != 0) {
                            str = r1.optionName_;
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str) || str.length() > 2500) {
                            throw AnonymousClass24W.A01(A0Z, "poll_creation_invalid_option");
                        }
                        C60142y4 r12 = new C60142y4(str);
                        if (!A17.contains(r12)) {
                            A17.add(r12);
                        }
                    }
                    if (A17.size() < 2 || A17.size() > min) {
                        throw AnonymousClass24W.A01(A0Z, "poll_creation_invalid_options_count");
                    }
                    ArrayList A0J = AnonymousClass002.A0J(A17);
                    List list = r5.A05;
                    list.clear();
                    list.addAll(A0J);
                    if ((r6.bitField0_ & 4) != 0) {
                        int i2 = r6.selectableOptionsCount_;
                        if (i2 < 0 || i2 > list.size()) {
                            throw AnonymousClass24W.A01(A0Z, "poll_creation_invalid_selectable_options_count");
                        }
                        r5.A01 = i2;
                    } else {
                        throw AnonymousClass24W.A01(A0Z, "poll_creation_missing_selectable_options_count");
                    }
                } else {
                    throw AnonymousClass24W.A01(A0Z, "poll_creation_missing_options");
                }
            }
            C21851Dk r0 = r4.messageContextInfo_;
            if (r0 == null) {
                r0 = C21851Dk.DEFAULT_INSTANCE;
            }
            r5.A1a = r0.messageSecret_.A07();
            return r5;
        }
        throw AnonymousClass24W.A01(A0Z, "poll_creation_missing_name");
    }

    public AnonymousClass3OA(C56982ss r1, AnonymousClass1VX r2, C59542x5 r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
