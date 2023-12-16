package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3Nr  reason: invalid class name and case insensitive filesystem */
public class C67023Nr implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public C50222hp A00;

    public void AyD(C55032pg r4, C624134x r5) {
        C18260x0.A0l(r5, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C30791n7);
        AnonymousClass39W r1 = ((C30791n7) r5).A00;
        if (r1 != null) {
            this.A00.A00(r1).A0C(r4, r5);
        }
    }

    public C624134x BgW(C55962rC r23) {
        C30791n7 r7;
        int i;
        AnonymousClass39E r1;
        AnonymousClass1CB r12;
        C188248ya r0;
        C188248ya<AnonymousClass1CC> r13;
        C55962rC r2 = r23;
        AnonymousClass1EU r6 = r2.A0B;
        if ((r6.bitField0_ & 134217728) == 0) {
            return null;
        }
        AnonymousClass2z0 r3 = r2.A0D;
        long j = r2.A05;
        AnonymousClass1EL r10 = r6.listMessage_;
        if (r10 == null) {
            r10 = AnonymousClass1EL.DEFAULT_INSTANCE;
        }
        C626936e.A06(r10);
        if ((r10.bitField0_ & 8) != 0) {
            AnonymousClass22j A0M = r10.A0M();
            AnonymousClass22j r4 = AnonymousClass22j.SINGLE_SELECT;
            if (A0M == r4) {
                r7 = new AnonymousClass1n5(r3, j);
                i = 1;
            } else if (A0M == AnonymousClass22j.PRODUCT_LIST) {
                r7 = new C30781n6(r3, j);
                i = 2;
            }
            if (!TextUtils.isEmpty(r10.description_) && (r10.bitField0_ & 8) != 0 && (!TextUtils.isEmpty(r10.buttonText_) || r10.A0M() != r4)) {
                AnonymousClass22j A0M2 = r10.A0M();
                if (A0M2 == r4) {
                    C188248ya r42 = r10.sections_;
                    if (!(r42 == null || r42.size() == 0)) {
                        int i2 = 0;
                        while (i2 < r42.size()) {
                            AnonymousClass1BL r14 = (AnonymousClass1BL) r42.get(i2);
                            if (!((i2 != 0 && TextUtils.isEmpty(r14.title_)) || (r13 = r14.rows_) == null || r13.size() == 0)) {
                                for (AnonymousClass1CC r02 : r13) {
                                    if (TextUtils.isEmpty(r02.title_)) {
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                } else if (A0M2 == AnonymousClass22j.PRODUCT_LIST && !(((r12 = r10.productListInfo_) == null && (r12 = AnonymousClass1CB.DEFAULT_INSTANCE) == null) || (r0 = r12.productSections_) == null || r0.size() == 0)) {
                    loop2:
                    for (AnonymousClass1BK r15 : r12.productSections_) {
                        C188248ya r03 = r15.products_;
                        if (r03 != null && r03.size() != 0) {
                            Iterator it = r15.products_.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.isEmpty(((AnonymousClass1AP) it.next()).productId_)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
                AnonymousClass39A r152 = new AnonymousClass39A(r10.title_, (byte[]) null, (String) null);
                String str = r10.description_;
                String str2 = r10.footerText_;
                String str3 = r10.buttonText_;
                C188248ya<AnonymousClass1BL> r04 = r10.sections_;
                ArrayList A0s = AnonymousClass001.A0s();
                if (r04 != null) {
                    for (AnonymousClass1BL r05 : r04) {
                        String str4 = r05.title_;
                        C188248ya<AnonymousClass1CC> r06 = r05.rows_;
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        for (AnonymousClass1CC r07 : r06) {
                            String str5 = r07.rowId_;
                            String str6 = r07.title_;
                            String str7 = r07.description_;
                            C18260x0.A0Q(str5, str6);
                            A0s2.add(new C108785dY(str5, (String) null, str6, str7));
                        }
                        C162457s7.A0J(str4, 1);
                        A0s.add(new C108725dS(str4, (String) null, A0s2));
                    }
                }
                AnonymousClass1CB r9 = r10.productListInfo_;
                if (r9 == null) {
                    r9 = AnonymousClass1CB.DEFAULT_INSTANCE;
                }
                if (r9 == null) {
                    r1 = null;
                } else {
                    AnonymousClass1BJ r08 = r9.headerImage_;
                    if (r08 == null) {
                        r08 = AnonymousClass1BJ.DEFAULT_INSTANCE;
                    }
                    byte[] A07 = r08.jpegThumbnail_.A07();
                    AnonymousClass1BJ r09 = r9.headerImage_;
                    if (r09 == null) {
                        r09 = AnonymousClass1BJ.DEFAULT_INSTANCE;
                    }
                    AnonymousClass39B r102 = new AnonymousClass39B(A07, r09.productId_, false);
                    String str8 = r9.businessOwnerJid_;
                    try {
                        C188248ya<AnonymousClass1BK> r010 = r9.productSections_;
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        if (r010 != null) {
                            for (AnonymousClass1BK r011 : r010) {
                                String str9 = r011.title_;
                                C188248ya<AnonymousClass1AP> r012 = r011.products_;
                                ArrayList A0s4 = AnonymousClass001.A0s();
                                if (r012 != null) {
                                    for (AnonymousClass1AP r013 : r012) {
                                        A0s4.add(new AnonymousClass392(r013.productId_));
                                    }
                                }
                                A0s3.add(new AnonymousClass396(str9, A0s4));
                            }
                        }
                        r1 = new AnonymousClass39E(AnonymousClass32Y.A09(str8), r102, A0s3);
                    } catch (AnonymousClass24P e) {
                        C18260x0.A0u("FMessageListProtobuf/parseE2EProductListInfo/Invalid jid: ", str8, AnonymousClass001.A0o(), e);
                        r1 = null;
                    }
                }
                String str10 = str;
                AnonymousClass39E r16 = r1;
                r7.Blz(new AnonymousClass39W((AnonymousClass39S) null, r152, r16, str10, str2, str3, A0s, i));
                return r7;
            }
            C18260x0.A1S(AnonymousClass001.A0o(), "FMessageListProtobuf/parseFMessageList/invalid message; message.key=", r3);
            throw AnonymousClass24W.A00(26);
        }
        return C30351mJ.A00(r6, r3, j);
    }

    public C67023Nr(C50222hp r1) {
        this.A00 = r1;
    }
}
