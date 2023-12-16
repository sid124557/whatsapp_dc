package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.7q2  reason: invalid class name */
public abstract class AnonymousClass7q2 {
    public static ConcurrentHashMap A00 = AnonymousClass0x9.A1D();

    public AnonymousClass7q2() {
        throw null;
    }

    public static void A00(Class cls) {
        Class<Object> cls2;
        String concat;
        Class<?> cls3;
        int i;
        Method method;
        boolean z;
        String str;
        C153757bu r27;
        Method method2;
        Method method3;
        Class cls4 = cls;
        A00.get(cls4);
        Class cls5 = cls4;
        HashMap A0t = AnonymousClass001.A0t();
        while (true) {
            cls2 = Object.class;
            if (cls5 == cls2) {
                break;
            }
            for (Field field : cls5.getDeclaredFields()) {
                String name = field.getName();
                if (!A0t.containsKey(name)) {
                    C156857hK r1 = new C156857hK(cls5, field);
                    if (r1.A02 != null || r1.A03 != null || r1.A04 != null) {
                        A0t.put(name, r1);
                    }
                }
            }
            cls5 = cls5.getSuperclass();
        }
        C156857hK[] r9 = (C156857hK[]) A0t.values().toArray(new C156857hK[A0t.size()]);
        String name2 = cls4.getName();
        if (name2.startsWith("java.util.")) {
            concat = AnonymousClass000.A0U("net.minidev.asm.", name2, "AccAccess", AnonymousClass001.A0o());
        } else {
            concat = name2.concat("AccAccess");
        }
        C140826ua r8 = new C140826ua(cls4.getClassLoader());
        try {
            cls3 = r8.loadClass(concat);
        } catch (ClassNotFoundException unused) {
            cls3 = null;
        }
        Class cls6 = cls4;
        LinkedList A18 = AnonymousClass0x9.A18();
        while (!cls6.equals(cls2)) {
            A18.addLast(cls6);
            for (Class addLast : cls6.getInterfaces()) {
                A18.addLast(addLast);
            }
            cls6 = cls6.getSuperclass();
            if (cls6 == null) {
                break;
            }
        }
        A18.addLast(cls2);
        if (cls3 == null) {
            C160567ns r3 = new C160567ns(cls4, r8, r9);
            Iterator it = A18.iterator();
            while (it.hasNext()) {
                Iterable<Class> iterable = (Iterable) C155457eu.A01.get(it.next());
                if (iterable != null) {
                    for (Class cls7 : iterable) {
                        if (cls7 != null) {
                            for (Method method4 : cls7.getMethods()) {
                                if ((method4.getModifiers() & 8) != 0) {
                                    Class[] parameterTypes = method4.getParameterTypes();
                                    if (parameterTypes.length == 1 && parameterTypes[0].equals(cls2)) {
                                        Class<?> returnType = method4.getReturnType();
                                        if (!returnType.equals(Void.TYPE)) {
                                            r3.A04.put(returnType, method4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C152807a9 r14 = new C152807a9();
            C156857hK[] r13 = r3.A06;
            int i2 = 0;
            boolean A1W = C86624Kv.A1W(r1, 10);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Lnet/minidev/asm/BeansAccess<L");
            String str2 = r3.A03;
            A0o.append(str2);
            String A0X = AnonymousClass000.A0X(";>;", A0o);
            String str3 = r3.A01;
            String str4 = C160567ns.A07;
            r14.A0D = 50;
            r14.A00 = 33;
            C153727bq r6 = r14.A0V;
            r6.A03 = 50;
            r6.A05 = str3;
            r14.A0C = r6.A0A(str3, 7).A03;
            if (A0X != null) {
                r14.A09 = r6.A02(A0X);
            }
            if (str4 == null) {
                i = 0;
            } else {
                i = r6.A0A(str4, 7).A03;
            }
            r14.A0B = i;
            C153757bu A03 = r14.A03("<init>", "()V", (String) null, (String[]) null, 1);
            int i3 = 25;
            A03.A05(25, 0);
            int i4 = 0;
            A03.A09(str4, "<init>", "()V", 183, false);
            A03.A01(177);
            A03.A04(1, 1);
            C152807a9 r23 = r14;
            C153757bu A032 = r23.A03("set", "(Ljava/lang/Object;ILjava/lang/Object;)V", (String) null, (String[]) null, 1);
            if (r1 != 0) {
                if (r1 > 14) {
                    A032.A05(21, 2);
                    C158877kh[] r11 = new C158877kh[r1];
                    int i5 = 0;
                    do {
                        r11[i5] = new C158877kh();
                        i5++;
                    } while (i5 < r1);
                    C158877kh r62 = new C158877kh();
                    A032.A0C(r62, r11, 0, r1 - 1);
                    int i6 = 0;
                    int i7 = 0;
                    do {
                        C156857hK r4 = r13[i6];
                        i4++;
                        A032.A0A(r11[i7]);
                        if (r4.A02 == null && r4.A03 == null) {
                            A032.A01(177);
                        } else {
                            r3.A01(r4, A032);
                        }
                        i6++;
                        i7 = i4;
                    } while (i6 < r1);
                    A032.A0A(r62);
                } else {
                    C158877kh[] r63 = new C158877kh[r1];
                    int i8 = 0;
                    do {
                        r63[i8] = new C158877kh();
                        i8++;
                    } while (i8 < r1);
                    int i9 = 0;
                    int i10 = 0;
                    do {
                        C156857hK r10 = r13[i9];
                        C160567ns.A00(r63[i10], A032, i10);
                        r3.A01(r10, A032);
                        A032.A0A(r63[i10]);
                        A032.A0D((Object[]) null, 3, (Object[]) null, 0, 0);
                        i10++;
                        i9++;
                    } while (i9 < r1);
                }
            }
            r3.A02(A032);
            A032.A04(0, 0);
            C153757bu A033 = r14.A03("get", "(Ljava/lang/Object;I)Ljava/lang/Object;", (String) null, (String[]) null, 1);
            int i11 = 192;
            if (r1 == 0) {
                z = false;
                str = null;
                A033.A0D((Object[]) null, 3, (Object[]) null, 0, 0);
            } else if (r1 > 14) {
                A033.A05(21, 2);
                C158877kh[] r5 = new C158877kh[r1];
                int i12 = 0;
                do {
                    r5[i12] = new C158877kh();
                    i12++;
                } while (i12 < r1);
                C158877kh r102 = new C158877kh();
                A033.A0C(r102, r5, 0, r1 - 1);
                int i13 = 0;
                do {
                    C156857hK r64 = r13[i2];
                    int i14 = i13 + 1;
                    A033.A0A(r5[i13]);
                    z = false;
                    r27 = A033;
                    r27.A0D((Object[]) null, 3, (Object[]) null, 0, 0);
                    if (r64.A02 == null && r64.A03 == null) {
                        A033.A01(1);
                    } else {
                        A033.A05(i3, 1);
                        A033.A06(i11, str2);
                        C162147rL A02 = C162147rL.A02(r64.A00);
                        if ((r64.A04 == null && r64.A03 == null) || (method2 = r64.A03) == null) {
                            A033.A08(str2, r64.A01, A02.A06(), 180);
                        } else {
                            A033.A09(str2, method2.getName(), C162147rL.A01(method2), 182, false);
                        }
                        A01(A033, A02);
                    }
                    A033.A01(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    i2++;
                    i13 = i14;
                    i11 = 192;
                    i3 = 25;
                } while (i2 < r1);
                A033.A0A(r102);
                str = null;
                r27.A0D((Object[]) null, 3, (Object[]) null, 0, 0);
            } else {
                C158877kh[] r65 = new C158877kh[r1];
                int i15 = 0;
                do {
                    r65[i15] = new C158877kh();
                    i15++;
                } while (i15 < r1);
                int i16 = 0;
                do {
                    C156857hK r92 = r13[i16];
                    C160567ns.A00(r65[i2], A033, i2);
                    A033.A05(25, 1);
                    A033.A06(192, str2);
                    C162147rL A022 = C162147rL.A02(r92.A00);
                    if ((r92.A04 == null && r92.A03 == null) || (method = r92.A03) == null) {
                        A033.A08(str2, r92.A01, A022.A06(), 180);
                    } else {
                        A033.A09(str2, method.getName(), C162147rL.A01(method), 182, false);
                    }
                    A01(A033, A022);
                    A033.A01(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A033.A0A(r65[i2]);
                    z = false;
                    str = null;
                    A033.A0D((Object[]) null, 3, (Object[]) null, 0, 0);
                    i2++;
                    i16++;
                } while (i16 < r1);
            }
            r3.A02(A033);
            A033.A04(z ? 1 : 0, z);
            int i17 = 153;
            if (!A1W) {
                C153757bu A034 = r14.A03("set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", str, (String[]) null, 1);
                C158877kh[] r0 = new C158877kh[r1];
                for (int i18 = 0; i18 < r1; i18++) {
                    r0[i18] = new C158877kh();
                }
                int i19 = 0;
                for (C156857hK r66 : r13) {
                    A034.A05(25, 2);
                    A034.A07(r66.A01);
                    C153757bu r272 = A034;
                    boolean z2 = z;
                    r272.A09("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, z2);
                    A034.A0B(r0[i19], 153);
                    r3.A01(r66, A034);
                    A034.A0A(r0[i19]);
                    r272.A0D((Object[]) null, 3, (Object[]) null, z ? 1 : 0, z2 ? 1 : 0);
                    i19++;
                }
                r3.A03(A034);
                int i20 = 0;
                A034.A04(z, z);
                C153757bu A035 = r23.A03("get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", (String) null, (String[]) null, 1);
                C158877kh[] r2 = new C158877kh[r1];
                for (int i21 = 0; i21 < r1; i21++) {
                    r2[i21] = new C158877kh();
                }
                int i22 = 0;
                while (i20 < r1) {
                    C156857hK r7 = r13[i20];
                    A035.A05(25, 2);
                    String str5 = r7.A01;
                    A035.A07(str5);
                    C153757bu r232 = A035;
                    boolean z3 = z;
                    r232.A09("java/lang/String", "equals", "(Ljava/lang/Object;)Z", 182, z3);
                    A035.A0B(r2[i22], i17);
                    A035.A05(25, 1);
                    A035.A06(192, str2);
                    C162147rL A023 = C162147rL.A02(r7.A00);
                    if ((r7.A04 == null && r7.A03 == null) || (method3 = r7.A03) == null) {
                        A035.A08(str2, str5, A023.A06(), 180);
                    } else {
                        r232.A09(str2, method3.getName(), C162147rL.A01(method3), 182, z3);
                    }
                    A01(A035, A023);
                    A035.A01(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
                    A035.A0A(r2[i22]);
                    r232.A0D((Object[]) null, 3, (Object[]) null, z ? 1 : 0, z3 ? 1 : 0);
                    i22++;
                    i20++;
                    i17 = 153;
                }
                r3.A03(A035);
                A035.A04(z, z);
            }
            C153757bu A036 = r14.A03("newInstance", "()Ljava/lang/Object;", (String) null, (String[]) null, 1);
            A036.A06(187, str2);
            A036.A01(89);
            A036.A09(str2, "<init>", "()V", 183, z);
            A036.A01(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
            A036.A04(2, 1);
            cls3 = r3.A05.A00(r3.A00, r14.A04());
        }
        try {
            cls3.newInstance();
            throw AnonymousClass001.A0g("setAccessor");
        } catch (Exception e) {
            throw AnonymousClass6CA.A0Q(AnonymousClass000.A0V("Error constructing accessor class: ", concat, AnonymousClass001.A0o()), e);
        }
    }

    public static void A01(C153757bu r6, C162147rL r7) {
        int i;
        String str;
        String str2;
        String str3;
        int i2 = r7.A00;
        if (i2 != 12) {
            switch (i2) {
                case 1:
                    i = 184;
                    str3 = "java/lang/Boolean";
                    str2 = "valueOf";
                    str = "(Z)Ljava/lang/Boolean;";
                    break;
                case 2:
                    i = 184;
                    str3 = "java/lang/Character";
                    str2 = "valueOf";
                    str = "(C)Ljava/lang/Character;";
                    break;
                case 3:
                    i = 184;
                    str3 = "java/lang/Byte";
                    str2 = "valueOf";
                    str = "(B)Ljava/lang/Byte;";
                    break;
                case 4:
                    i = 184;
                    str3 = "java/lang/Short";
                    str2 = "valueOf";
                    str = "(S)Ljava/lang/Short;";
                    break;
                case 5:
                    i = 184;
                    str3 = "java/lang/Integer";
                    str2 = "valueOf";
                    str = "(I)Ljava/lang/Integer;";
                    break;
                case 6:
                    i = 184;
                    str3 = "java/lang/Float";
                    str2 = "valueOf";
                    str = "(F)Ljava/lang/Float;";
                    break;
                case 7:
                    i = 184;
                    str3 = "java/lang/Long";
                    str2 = "valueOf";
                    str = "(J)Ljava/lang/Long;";
                    break;
                case 8:
                    i = 184;
                    str3 = "java/lang/Double";
                    str2 = "valueOf";
                    str = "(D)Ljava/lang/Double;";
                    break;
                default:
                    return;
            }
            r6.A09(str3, str2, str, i, false);
        }
    }
}
