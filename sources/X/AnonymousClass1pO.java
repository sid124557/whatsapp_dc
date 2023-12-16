package X;

import android.content.Context;

/* renamed from: X.1pO  reason: invalid class name */
public final class AnonymousClass1pO extends AnonymousClass315 {
    public String A0A(Context context) {
        String str = this.A02.A08;
        if (str != null && str.length() != 0) {
            return str;
        }
        String A08 = A08();
        if (A08 == null) {
            return "";
        }
        return A08;
    }

    public String A0B(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("🛍 ");
        String str = this.A02.A08;
        if (str == null || str.length() == 0) {
            str = A08();
        }
        return AnonymousClass000.A0X(str, A0o);
    }

    public void A0C(C55032pg r10, C624134x r11) {
        C130786cX r0;
        String str;
        C375322z r02;
        C18260x0.A0O(r10, r11);
        super.A0C(r10, r11);
        if (r11 instanceof AnonymousClass4DV) {
            AnonymousClass39W A0Y = AnonymousClass0x9.A0Y(r11);
            String str2 = null;
            if (A0Y != null && A0Y.A06 != null) {
                AnonymousClass1A4 r5 = r10.A00;
                C130546c9 A01 = AnonymousClass1A4.A01(r5);
                AnonymousClass1ER r1 = (AnonymousClass1ER) A01.A00;
                if (r1.interactiveMessageCase_ == 4) {
                    r0 = (C130786cX) r1.interactiveMessage_;
                } else {
                    r0 = AnonymousClass1C8.DEFAULT_INSTANCE;
                }
                C130546c9 A0H = r0.A0H();
                C632938r r2 = A0Y.A06;
                if (r2 == null || (str = r2.A02) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    if (r2 != null) {
                        str2 = r2.A02;
                    }
                    AnonymousClass1C8 r12 = (AnonymousClass1C8) C18320x8.A0C(A0H);
                    str2.getClass();
                    r12.bitField0_ |= 1;
                    r12.id_ = str2;
                }
                C162457s7.A0H(r2);
                int i = r2.A00;
                if (i == 1) {
                    r02 = C375322z.FB;
                } else if (i == 2) {
                    r02 = C375322z.IG;
                } else if (i != 3) {
                    r02 = C375322z.UNKNOWN_SURFACE;
                } else {
                    r02 = C375322z.WA;
                }
                AnonymousClass1C8 r13 = (AnonymousClass1C8) C18320x8.A0C(A0H);
                r13.surface_ = r02.value;
                r13.bitField0_ |= 2;
                int i2 = r2.A01;
                AnonymousClass1C8 r14 = (AnonymousClass1C8) C18320x8.A0C(A0H);
                r14.bitField0_ |= 4;
                r14.messageVersion_ = i2;
                if (A0Y.A00 == 4) {
                    AnonymousClass315.A01(A01, A0H).interactiveMessageCase_ = 4;
                }
                r5.A0C((AnonymousClass1ER) A01.A06());
            }
        }
    }

    public AnonymousClass1pO(AnonymousClass39W r1, C41882Ly r2) {
        super(r1, r2);
    }
}
