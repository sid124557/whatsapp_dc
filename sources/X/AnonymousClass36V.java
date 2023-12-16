package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.36V  reason: invalid class name */
public final class AnonymousClass36V {
    public static final C162167rN A00 = C162167rN.A00();

    public static C624134x A01(C624134x r1) {
        C30791n7 B5I;
        if (!(r1 instanceof AnonymousClass4DT) || (B5I = ((AnonymousClass4DT) r1).B5I()) == null) {
            return r1;
        }
        return B5I;
    }

    public static void A05(C59542x5 r11, C55032pg r12, C624134x r13) {
        AnonymousClass39W A0Y;
        AnonymousClass22j r0;
        AnonymousClass39E r7;
        AnonymousClass1A4 r3 = r12.A00;
        AnonymousClass1EL r02 = ((AnonymousClass1EU) r3.A00).listMessage_;
        if (r02 == null) {
            r02 = AnonymousClass1EL.DEFAULT_INSTANCE;
        }
        C130546c9 A0H = r02.A0H();
        if ((r13 instanceof AnonymousClass4DV) && (A0Y = AnonymousClass0x9.A0Y(r13)) != null) {
            int i = A0Y.A00;
            if (i == 1) {
                r0 = AnonymousClass22j.SINGLE_SELECT;
            } else if (i == 2 || i == 6) {
                r0 = AnonymousClass22j.PRODUCT_LIST;
            } else {
                r0 = AnonymousClass22j.UNKNOWN;
            }
            AnonymousClass1EL r1 = (AnonymousClass1EL) C18320x8.A0C(A0H);
            r1.listType_ = r0.value;
            r1.bitField0_ |= 8;
            AnonymousClass39A r03 = A0Y.A02;
            if (r03 != null) {
                String str = r03.A01;
                if (!TextUtils.isEmpty(str)) {
                    AnonymousClass1EL A002 = A00(A0H, str);
                    A002.bitField0_ |= 1;
                    A002.title_ = str;
                }
            }
            if (!TextUtils.isEmpty(A0Y.A09)) {
                String str2 = A0Y.A09;
                AnonymousClass1EL A003 = A00(A0H, str2);
                A003.bitField0_ |= 32;
                A003.footerText_ = str2;
            }
            String str3 = A0Y.A08;
            AnonymousClass1EL A004 = A00(A0H, str3);
            A004.bitField0_ |= 2;
            A004.description_ = str3;
            String str4 = A0Y.A07;
            AnonymousClass1EL A005 = A00(A0H, str4);
            A005.bitField0_ |= 4;
            A005.buttonText_ = str4;
            int i2 = A0Y.A00;
            if (i2 == 1) {
                for (C108725dS r5 : A0Y.A0B) {
                    C130546c9 A0G = AnonymousClass1BL.DEFAULT_INSTANCE.A0G();
                    String str5 = r5.A01;
                    if (!TextUtils.isEmpty(str5)) {
                        AnonymousClass1BL r14 = (AnonymousClass1BL) C18320x8.A0C(A0G);
                        r14.bitField0_ |= 1;
                        r14.title_ = str5;
                    }
                    for (C108785dY r6 : r5.A02) {
                        C130546c9 A0G2 = AnonymousClass1CC.DEFAULT_INSTANCE.A0G();
                        String str6 = r6.A03;
                        AnonymousClass1CC r15 = (AnonymousClass1CC) C18320x8.A0C(A0G2);
                        r15.bitField0_ |= 1;
                        r15.title_ = str6;
                        String str7 = r6.A02;
                        AnonymousClass1CC r16 = (AnonymousClass1CC) C18320x8.A0C(A0G2);
                        r16.bitField0_ |= 4;
                        r16.rowId_ = str7;
                        String str8 = r6.A00;
                        if (!TextUtils.isEmpty(str8)) {
                            AnonymousClass1CC r17 = (AnonymousClass1CC) C18320x8.A0C(A0G2);
                            str8.getClass();
                            r17.bitField0_ |= 2;
                            r17.description_ = str8;
                        }
                        C130786cX A06 = A0G2.A06();
                        AnonymousClass1BL r2 = (AnonymousClass1BL) C18320x8.A0C(A0G);
                        A06.getClass();
                        C188248ya r18 = r2.rows_;
                        if (!((AnonymousClass8T6) r18).A00) {
                            r18 = C130786cX.A07(r18);
                            r2.rows_ = r18;
                        }
                        r18.add(A06);
                    }
                    C130786cX A062 = A0G.A06();
                    AnonymousClass1EL A006 = A00(A0H, A062);
                    C188248ya r19 = A006.sections_;
                    if (!((AnonymousClass8T6) r19).A00) {
                        r19 = C130786cX.A07(r19);
                        A006.sections_ = r19;
                    }
                    r19.add(A062);
                }
            } else if ((i2 == 2 || i2 == 6) && (r7 = A0Y.A04) != null) {
                C130546c9 A0G3 = AnonymousClass1CB.DEFAULT_INSTANCE.A0G();
                for (AnonymousClass396 r62 : r7.A02) {
                    C130546c9 A0G4 = AnonymousClass1BK.DEFAULT_INSTANCE.A0G();
                    String str9 = r62.A00;
                    if (!TextUtils.isEmpty(str9)) {
                        AnonymousClass1BK r110 = (AnonymousClass1BK) C18320x8.A0C(A0G4);
                        str9.getClass();
                        r110.bitField0_ |= 1;
                        r110.title_ = str9;
                    }
                    for (AnonymousClass392 r111 : r62.A01) {
                        C130546c9 A0G5 = AnonymousClass1AP.DEFAULT_INSTANCE.A0G();
                        String str10 = r111.A00;
                        if (!TextUtils.isEmpty(str10)) {
                            AnonymousClass1AP r112 = (AnonymousClass1AP) C18320x8.A0C(A0G5);
                            str10.getClass();
                            r112.bitField0_ |= 1;
                            r112.productId_ = str10;
                            C130786cX A063 = A0G5.A06();
                            AnonymousClass1BK r22 = (AnonymousClass1BK) C18320x8.A0C(A0G4);
                            A063.getClass();
                            C188248ya r113 = r22.products_;
                            if (!((AnonymousClass8T6) r113).A00) {
                                r113 = C130786cX.A07(r113);
                                r22.products_ = r113;
                            }
                            r113.add(A063);
                        }
                    }
                    C130786cX A064 = A0G4.A06();
                    AnonymousClass1CB r23 = (AnonymousClass1CB) C18320x8.A0C(A0G3);
                    A064.getClass();
                    C188248ya r114 = r23.productSections_;
                    if (!((AnonymousClass8T6) r114).A00) {
                        r114 = C130786cX.A07(r114);
                        r23.productSections_ = r114;
                    }
                    r114.add(A064);
                    String A0g = C18300x5.A0g(A0G3, r7.A00);
                    AnonymousClass1CB r115 = (AnonymousClass1CB) A0G3.A00;
                    A0g.getClass();
                    r115.bitField0_ |= 2;
                    r115.businessOwnerJid_ = A0g;
                }
                C130546c9 A0G6 = AnonymousClass1BJ.DEFAULT_INSTANCE.A0G();
                AnonymousClass39B r72 = r7.A01;
                byte[] bArr = r72.A02;
                if (bArr != null) {
                    C172548Lq A09 = C18270x1.A09(A0G6, bArr);
                    AnonymousClass1BJ r116 = (AnonymousClass1BJ) A0G6.A00;
                    r116.bitField0_ |= 2;
                    r116.jpegThumbnail_ = A09;
                }
                String str11 = r72.A01;
                AnonymousClass1BJ r117 = (AnonymousClass1BJ) C18320x8.A0C(A0G6);
                str11.getClass();
                r117.bitField0_ |= 1;
                r117.productId_ = str11;
                AnonymousClass1CB r118 = (AnonymousClass1CB) C18320x8.A0C(A0G3);
                AnonymousClass1BJ r04 = (AnonymousClass1BJ) A0G6.A06();
                r04.getClass();
                r118.headerImage_ = r04;
                r118.bitField0_ |= 1;
                AnonymousClass1CB r05 = (AnonymousClass1CB) A0G3.A06();
                AnonymousClass1EL A007 = A00(A0H, r05);
                A007.productListInfo_ = r05;
                A007.bitField0_ |= 16;
            }
            AnonymousClass3Z2 r24 = r12.A01;
            byte[] bArr2 = r12.A09;
            if (C59542x5.A01(r24, r13, bArr2)) {
                AnonymousClass1EF A008 = C55032pg.A00(r11, r12, r24, r13, bArr2);
                AnonymousClass1EL A009 = A00(A0H, A008);
                A009.contextInfo_ = A008;
                A009.bitField0_ |= 64;
            }
            AnonymousClass1EL r06 = (AnonymousClass1EL) A0H.A06();
            AnonymousClass1EU A0L = AnonymousClass0x2.A0L(r3, r06);
            A0L.listMessage_ = r06;
            A0L.bitField0_ |= 134217728;
        }
    }

    public static boolean A06(C624134x r2) {
        AnonymousClass39W A0Y;
        if (!(r2 instanceof AnonymousClass4DV) || !(r2.A1J instanceof C30611mj) || (A0Y = AnonymousClass0x9.A0Y(r2)) == null || !A0Y.A04()) {
            return false;
        }
        return true;
    }

    public static boolean A07(C624134x r4) {
        AnonymousClass39W A0Y;
        if (!(r4 instanceof AnonymousClass4DV) || (A0Y = AnonymousClass0x9.A0Y(r4)) == null || A0Y.A00 != 7 || A0Y.A05 == null) {
            return false;
        }
        return true;
    }

    public static AnonymousClass1EL A00(C130546c9 r0, Object obj) {
        r0.A07();
        AnonymousClass1EL r02 = (AnonymousClass1EL) r0.A00;
        obj.getClass();
        return r02;
    }

    public static C624134x A02(C624134x r1, int i) {
        List list;
        if (!A07(r1) || (list = ((C30791n7) r1).A01) == null || i < 0 || i >= list.size()) {
            return null;
        }
        return C18320x8.A0R(list, i);
    }

    public static Integer A03(C624134x r1) {
        if (A06(r1)) {
            return Integer.valueOf(((C30611mj) r1.A1J).A00);
        }
        return null;
    }

    public static String A04(C624134x r2) {
        String str;
        C47142cm BDY;
        AnonymousClass39W A0Y;
        C624134x A01 = A01(r2);
        if (!(A01 instanceof AnonymousClass4DV) || (A0Y = AnonymousClass0x9.A0Y(A01)) == null) {
            str = null;
        } else {
            str = A0Y.A0A;
        }
        if (!TextUtils.isEmpty(str) || !(A01 instanceof AnonymousClass4FG) || (BDY = ((AnonymousClass4FG) A01).BDY()) == null) {
            return str;
        }
        return BDY.A05;
    }
}
