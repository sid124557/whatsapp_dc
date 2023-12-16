package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28V  reason: invalid class name */
public class AnonymousClass28V {
    public static C208719q A00(AnonymousClass1A4 r7, C47142cm r8) {
        AnonymousClass1EH r1;
        int i;
        AnonymousClass1EI r0 = ((AnonymousClass1EU) r7.A00).templateMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1EI.DEFAULT_INSTANCE;
        }
        C208719q r4 = (C208719q) AnonymousClass0x9.A0V(r0).A0H();
        String str = r8.A02;
        AnonymousClass1EK r12 = (AnonymousClass1EK) C18320x8.A0C(r4);
        str.getClass();
        r12.bitField0_ |= 32;
        r12.hydratedContentText_ = str;
        String str2 = r8.A03;
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass1EK r13 = (AnonymousClass1EK) C18320x8.A0C(r4);
            str2.getClass();
            r13.bitField0_ |= 64;
            r13.hydratedFooterText_ = str2;
        }
        List<C58932w3> list = r8.A06;
        if (list != null && !list.isEmpty()) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (C58932w3 r72 : list) {
                C130546c9 A0G = AnonymousClass1EH.DEFAULT_INSTANCE.A0G();
                int i2 = r72.A06;
                if (i2 == 1) {
                    C130546c9 A0G2 = AnonymousClass1B8.DEFAULT_INSTANCE.A0G();
                    String str3 = r72.A01;
                    AnonymousClass1B8 r14 = (AnonymousClass1B8) C18320x8.A0C(A0G2);
                    str3.getClass();
                    r14.bitField0_ |= 2;
                    r14.id_ = str3;
                    String str4 = r72.A08;
                    AnonymousClass1B8 r15 = (AnonymousClass1B8) C18320x8.A0C(A0G2);
                    str4.getClass();
                    r15.bitField0_ |= 1;
                    r15.displayText_ = str4;
                    r1 = (AnonymousClass1EH) C18320x8.A0C(A0G);
                    C130786cX A06 = A0G2.A06();
                    A06.getClass();
                    r1.hydratedButton_ = A06;
                    i = 1;
                } else if (i2 == 3) {
                    C130546c9 A0G3 = AnonymousClass1B7.DEFAULT_INSTANCE.A0G();
                    String str5 = r72.A08;
                    AnonymousClass1B7 r16 = (AnonymousClass1B7) C18320x8.A0C(A0G3);
                    str5.getClass();
                    r16.bitField0_ |= 1;
                    r16.displayText_ = str5;
                    String str6 = r72.A01;
                    AnonymousClass1B7 r17 = (AnonymousClass1B7) C18320x8.A0C(A0G3);
                    str6.getClass();
                    r17.bitField0_ |= 2;
                    r17.phoneNumber_ = str6;
                    r1 = (AnonymousClass1EH) C18320x8.A0C(A0G);
                    C130786cX A062 = A0G3.A06();
                    A062.getClass();
                    r1.hydratedButton_ = A062;
                    i = 3;
                } else if (i2 == 2) {
                    C130546c9 A0G4 = C21561Ch.DEFAULT_INSTANCE.A0G();
                    String str7 = r72.A08;
                    C21561Ch r18 = (C21561Ch) C18320x8.A0C(A0G4);
                    str7.getClass();
                    r18.bitField0_ |= 1;
                    r18.displayText_ = str7;
                    String str8 = r72.A01;
                    C21561Ch r19 = (C21561Ch) C18320x8.A0C(A0G4);
                    str8.getClass();
                    r19.bitField0_ |= 2;
                    r19.url_ = str8;
                    C130786cX A063 = A0G4.A06();
                    r1 = (AnonymousClass1EH) C18320x8.A0C(A0G);
                    A063.getClass();
                    r1.hydratedButton_ = A063;
                    i = 2;
                } else {
                    int i3 = r72.A05;
                    AnonymousClass1EH r110 = (AnonymousClass1EH) C18320x8.A0C(A0G);
                    r110.bitField0_ |= 8;
                    r110.index_ = i3;
                    C18320x8.A1B(A0G, A0s);
                }
                r1.hydratedButtonCase_ = i;
                int i32 = r72.A05;
                AnonymousClass1EH r1102 = (AnonymousClass1EH) C18320x8.A0C(A0G);
                r1102.bitField0_ |= 8;
                r1102.index_ = i32;
                C18320x8.A1B(A0G, A0s);
            }
            AnonymousClass1EK r2 = (AnonymousClass1EK) C18320x8.A0C(r4);
            C188248ya r111 = r2.hydratedButtons_;
            if (!((AnonymousClass8T6) r111).A00) {
                r111 = C130786cX.A07(r111);
                r2.hydratedButtons_ = r111;
            }
            C170208Ch.A05(A0s, r111);
        }
        return r4;
    }
}
