package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.7ns  reason: invalid class name and case insensitive filesystem */
public class C160567ns {
    public static String A07 = AnonymousClass7q2.class.getName().replace('.', '/');
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04 = AnonymousClass001.A0t();
    public final C140826ua A05;
    public final C156857hK[] A06;

    public static final void A00(C158877kh r5, C153757bu r6, int i) {
        r6.A05(21, 2);
        if (i == 0) {
            r6.A0B(r5, 154);
            return;
        }
        if (i == 1) {
            r6.A01(4);
        } else if (i == 2) {
            r6.A01(5);
        } else {
            int i2 = 6;
            if (i != 3) {
                if (i == 4) {
                    i2 = 7;
                } else if (i == 5) {
                    i2 = 8;
                } else if (i >= 6) {
                    r6.A03(16, i);
                } else {
                    throw AnonymousClass002.A0E("non supported negative values");
                }
            }
            r6.A01(i2);
        }
        r6.A0B(r5, 160);
    }

    public final void A01(C156857hK r19, C153757bu r20) {
        C158877kh r5;
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        C153757bu r12 = r20;
        r12.A05(25, 1);
        String str4 = this.A03;
        r12.A06(192, str4);
        r12.A05(25, 3);
        C156857hK r6 = r19;
        Class cls = r6.A00;
        C162147rL A022 = C162147rL.A02(cls);
        String replace = cls.getName().replace('.', '/');
        Method method = (Method) this.A04.get(cls);
        if (method != null) {
            r12.A09(method.getDeclaringClass().getName().replace('.', '/'), method.getName(), C162147rL.A01(method), 184, false);
        } else {
            if (cls.isEnum()) {
                r5 = new C158877kh();
                r12.A0B(r5, 198);
                r12.A05(25, 3);
                z = false;
                r12.A09("java/lang/Object", "toString", "()Ljava/lang/String;", 182, false);
                i = 184;
                str2 = "valueOf";
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("(Ljava/lang/String;)L");
                A0o.append(replace);
                str3 = AnonymousClass000.A0X(";", A0o);
                str = replace;
            } else if (cls.equals(String.class)) {
                r5 = new C158877kh();
                r12.A0B(r5, 198);
                r12.A05(25, 3);
                i = 182;
                str = "java/lang/Object";
                str2 = "toString";
                str3 = "()Ljava/lang/String;";
                z = false;
            } else {
                r12.A06(192, replace);
            }
            r12.A09(str, str2, str3, i, z);
            r12.A05(58, 3);
            r12.A0A(r5);
            boolean z2 = z;
            r12.A0D((Object[]) null, 3, (Object[]) null, z2 ? 1 : 0, z ? 1 : 0);
            r12.A05(25, 1);
            r12.A06(192, str4);
            r12.A05(25, 3);
            r12.A06(192, replace);
        }
        Method method2 = r6.A04;
        if (method2 == null) {
            r12.A08(str4, r6.A01, A022.A06(), 181);
        } else {
            String A012 = C162147rL.A01(method2);
            r12.A09(str4, method2.getName(), A012, 182, false);
        }
        r12.A01(177);
    }

    public final void A02(C153757bu r15) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        C153757bu r2 = r15;
        r15.A06(187, replace);
        r15.A01(89);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mapping ");
        A0o.append(this.A02);
        r15.A07(AnonymousClass000.A0X(" failed to map field:", A0o));
        r15.A05(21, 2);
        r2.A09("java/lang/Integer", "toString", "(I)Ljava/lang/String;", 184, false);
        r2.A09("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r15.A09(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r15.A01(191);
    }

    public final void A03(C153757bu r15) {
        String replace = NoSuchFieldException.class.getName().replace('.', '/');
        r15.A06(187, replace);
        r15.A01(89);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mapping ");
        A0o.append(this.A02);
        r15.A07(AnonymousClass000.A0X(" failed to map field:", A0o));
        r15.A05(25, 2);
        r15.A09("java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", 182, false);
        r15.A09(replace, "<init>", "(Ljava/lang/String;)V", 183, false);
        r15.A01(191);
    }

    public C160567ns(Class cls, C140826ua r6, C156857hK[] r7) {
        String concat;
        this.A06 = r7;
        this.A05 = r6;
        String name = cls.getName();
        this.A02 = name;
        if (name.startsWith("java.")) {
            concat = AnonymousClass000.A0U("net.minidev.asm.", name, "AccAccess", AnonymousClass001.A0o());
        } else {
            concat = name.concat("AccAccess");
        }
        this.A00 = concat;
        this.A01 = concat.replace('.', '/');
        this.A03 = name.replace('.', '/');
    }
}
