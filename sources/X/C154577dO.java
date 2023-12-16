package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: X.7dO  reason: invalid class name and case insensitive filesystem */
public class C154577dO {
    public static void A01(String str, StringBuffer stringBuffer, C177088e3 r16) {
        StringBuilder A0o;
        StringBuilder A0l;
        byte[] bArr;
        String str2;
        StringBuilder A0o2;
        String A02;
        String obj;
        int i;
        String A0U;
        byte[] bArr2;
        StringBuilder A0l2;
        int i2;
        String str3;
        String str4;
        C177088e3 Bqk;
        String str5;
        String str6;
        C177088e3 Bqk2;
        C177088e3 r4 = r16;
        String str7 = C162077rB.A00;
        if (r4 instanceof C176958dq) {
            Enumeration A0V = ((C176958dq) r4).A0V();
            String A0T = AnonymousClass000.A0T(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C176928dn) {
                str6 = "BER Sequence";
            } else if (r4 instanceof C176948dp) {
                str6 = "DER Sequence";
            } else {
                str6 = "Sequence";
            }
            stringBuffer.append(str6);
            while (true) {
                stringBuffer.append(str7);
                while (A0V.hasMoreElements()) {
                    Object nextElement = A0V.nextElement();
                    if (nextElement == null || nextElement.equals(C176108cT.A00)) {
                        stringBuffer.append(A0T);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement instanceof C177088e3) {
                            Bqk2 = (C177088e3) nextElement;
                        } else {
                            Bqk2 = ((C183618qL) nextElement).Bqk();
                        }
                        A01(A0T, stringBuffer, Bqk2);
                    }
                }
                return;
            }
        } else if (r4 instanceof C176908dl) {
            String A0T2 = AnonymousClass000.A0T(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C177008dv) {
                str5 = "BER Tagged [";
            } else {
                str5 = "Tagged [";
            }
            stringBuffer.append(str5);
            C176908dl r42 = (C176908dl) r4;
            stringBuffer.append(Integer.toString(r42.A00));
            stringBuffer.append(']');
            if (!r42.A02) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str7);
            A01(A0T2, stringBuffer, AnonymousClass8Q0.A03(r42));
        } else if (r4 instanceof C176998du) {
            C1894891m r6 = new C1894891m((C176998du) r4);
            String A0T3 = AnonymousClass000.A0T(str, "    ");
            stringBuffer.append(str);
            if (r4 instanceof C176968dr) {
                str4 = "BER Set";
            } else if (r4 instanceof C176988dt) {
                str4 = "DER Set";
            } else {
                str4 = "Set";
            }
            stringBuffer.append(str4);
            while (true) {
                stringBuffer.append(str7);
                while (r6.hasMoreElements()) {
                    Object nextElement2 = r6.nextElement();
                    if (nextElement2 == null) {
                        stringBuffer.append(A0T3);
                        stringBuffer.append("NULL");
                    } else {
                        if (nextElement2 instanceof C177088e3) {
                            Bqk = (C177088e3) nextElement2;
                        } else {
                            Bqk = ((C183618qL) nextElement2).Bqk();
                        }
                        A01(A0T3, stringBuffer, Bqk);
                    }
                }
                return;
            }
        } else {
            if (r4 instanceof C176778dY) {
                C176778dY r3 = (C176778dY) r4;
                boolean z = r4 instanceof C176658dM;
                A0l2 = AnonymousClass001.A0o();
                if (z) {
                    A0l2.append(str);
                    str3 = "BER Constructed Octet String[";
                } else {
                    A0l2.append(str);
                    str3 = "DER Octet String[";
                }
                A0l2.append(str3);
                i2 = r3.A00.length;
            } else {
                if (r4 instanceof C176768dX) {
                    A0o2 = AnonymousClass000.A0l(str);
                    A0o2.append("ObjectIdentifier(");
                    A02 = ((C176768dX) r4).A01;
                } else {
                    if (r4 instanceof C176738dU) {
                        A0o2 = AnonymousClass000.A0l(str);
                        A0o2.append("Boolean(");
                        A0o2.append(AnonymousClass000.A1S(((C176738dU) r4).A00));
                    } else {
                        if (r4 instanceof C176748dV) {
                            A0l = AnonymousClass000.A0l(str);
                            A0l.append("Integer(");
                            bArr = ((C176748dV) r4).A01;
                        } else if (r4 instanceof C176068cP) {
                            C176888dj r43 = (C176888dj) r4;
                            A0l2 = AnonymousClass000.A0l(str);
                            A0l2.append("DER Bit String[");
                            A0l2.append(r43.A0U().length);
                            AnonymousClass001.A1M(A0l2);
                            i2 = r43.A00;
                        } else {
                            if (r4 instanceof C176898dk) {
                                A0o = AnonymousClass000.A0l(str);
                                A0o.append("IA5String(");
                                bArr2 = ((C176898dk) r4).A00;
                            } else {
                                if (r4 instanceof C176868dh) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("UTF8String(");
                                    A0U = ((C176868dh) r4).BDM();
                                } else if (r4 instanceof C176858dg) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("PrintableString(");
                                    bArr2 = ((C176858dg) r4).A00;
                                } else if (r4 instanceof C176848df) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("VisibleString(");
                                    bArr2 = ((C176848df) r4).A00;
                                } else if (r4 instanceof C176808db) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("BMPString(");
                                    A0U = new String(((C176808db) r4).A00);
                                } else if (r4 instanceof C176838de) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("T61String(");
                                    bArr2 = ((C176838de) r4).A00;
                                } else if (r4 instanceof C176788dZ) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("GraphicString(");
                                    bArr2 = ((C176788dZ) r4).A00;
                                } else if (r4 instanceof C176798da) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("VideotexString(");
                                    bArr2 = ((C176798da) r4).A00;
                                } else if (r4 instanceof C176708dR) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("UTCTime(");
                                    A0U = ((C176708dR) r4).A0U();
                                } else if (r4 instanceof C176758dW) {
                                    A0o = AnonymousClass000.A0l(str);
                                    A0o.append("GeneralizedTime(");
                                    A0U = ((C176758dW) r4).A0U();
                                } else {
                                    if (r4 instanceof C176038cM) {
                                        str2 = "BER";
                                    } else if (r4 instanceof C176048cN) {
                                        str2 = "";
                                    } else if (r4 instanceof C176728dT) {
                                        A0l = AnonymousClass000.A0l(str);
                                        A0l.append("DER Enumerated(");
                                        bArr = ((C176728dT) r4).A01;
                                    } else if (r4 instanceof C176718dS) {
                                        C176718dS r44 = (C176718dS) r4;
                                        stringBuffer.append(AnonymousClass000.A0V("External ", str7, AnonymousClass000.A0l(str)));
                                        String A0T4 = AnonymousClass000.A0T(str, "    ");
                                        C176768dX r2 = r44.A02;
                                        if (r2 != null) {
                                            StringBuilder A0l3 = AnonymousClass000.A0l(A0T4);
                                            A0l3.append("Direct Reference: ");
                                            stringBuffer.append(AnonymousClass000.A0V(r2.A01, str7, A0l3));
                                        }
                                        C176748dV r22 = r44.A01;
                                        if (r22 != null) {
                                            StringBuilder A0l4 = AnonymousClass000.A0l(A0T4);
                                            C18270x1.A1H(A0l4, "Indirect Reference: ", r22);
                                            stringBuffer.append(AnonymousClass000.A0X(str7, A0l4));
                                        }
                                        C177088e3 r0 = r44.A03;
                                        if (r0 != null) {
                                            A01(A0T4, stringBuffer, r0);
                                        }
                                        StringBuilder A0l5 = AnonymousClass000.A0l(A0T4);
                                        A0l5.append("Encoding: ");
                                        A0l5.append(r44.A00);
                                        stringBuffer.append(AnonymousClass000.A0X(str7, A0l5));
                                        A01(A0T4, stringBuffer, r44.A04);
                                        return;
                                    } else {
                                        A0o = AnonymousClass001.A0o();
                                        C18270x1.A1H(A0o, str, r4);
                                        obj = AnonymousClass000.A0X(str7, A0o);
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    C176698dQ A0A = C176698dQ.A0A(r4);
                                    StringBuffer A0X = AnonymousClass6CA.A0X();
                                    if (A0A.A01) {
                                        try {
                                            byte[] A0L = A0A.A0L();
                                            if ((A0L[0] & 31) == 31) {
                                                byte b = A0L[1] & 255;
                                                if ((b & Byte.MAX_VALUE) != 0) {
                                                    i = 2;
                                                    while ((b & 128) != 0) {
                                                        b = A0L[i] & 255;
                                                        i++;
                                                    }
                                                } else {
                                                    throw AnonymousClass002.A0C("corrupted stream - invalid high tag number found");
                                                }
                                            } else {
                                                i = 1;
                                            }
                                            int length = (A0L.length - i) + 1;
                                            byte[] bArr3 = new byte[length];
                                            System.arraycopy(A0L, i, bArr3, 1, length - 1);
                                            byte b2 = (byte) 16;
                                            bArr3[0] = b2;
                                            if ((A0L[0] & 32) != 0) {
                                                bArr3[0] = (byte) (b2 | 32);
                                            }
                                            C176958dq A0C = C176958dq.A0C(C177088e3.A0I(bArr3));
                                            StringBuilder A0o3 = AnonymousClass001.A0o();
                                            AnonymousClass001.A1K(str, str2, " ApplicationSpecific[", A0o3);
                                            A0o3.append(A0A.A00);
                                            A0X.append(AnonymousClass000.A0V("]", str7, A0o3));
                                            Enumeration A0V2 = A0C.A0V();
                                            while (A0V2.hasMoreElements()) {
                                                A01(AnonymousClass000.A0T(str, "    "), A0X, (C177088e3) A0V2.nextElement());
                                            }
                                        } catch (IOException e) {
                                            A0X.append(e);
                                        }
                                        obj = A0X.toString();
                                        stringBuffer.append(obj);
                                        return;
                                    }
                                    A0o2 = AnonymousClass001.A0o();
                                    AnonymousClass001.A1K(str, str2, " ApplicationSpecific[", A0o2);
                                    A0o2.append(A0A.A00);
                                    A0o2.append("] (");
                                    byte[] A022 = C161007oo.A02(A0A.A02);
                                    A02 = C162077rB.A02(AnonymousClass35E.A02(A022, 0, A022.length));
                                }
                                A0o.append(A0U);
                                A0o.append(") ");
                                obj = AnonymousClass000.A0X(str7, A0o);
                                stringBuffer.append(obj);
                                return;
                            }
                            A0U = C162077rB.A02(bArr2);
                            A0o.append(A0U);
                            A0o.append(") ");
                            obj = AnonymousClass000.A0X(str7, A0o);
                            stringBuffer.append(obj);
                            return;
                        }
                        A0o2.append(new BigInteger(bArr));
                    }
                    A0o.append(")");
                    obj = AnonymousClass000.A0X(str7, A0o);
                    stringBuffer.append(obj);
                    return;
                }
                A0o2.append(A02);
                A0o.append(")");
                obj = AnonymousClass000.A0X(str7, A0o);
                stringBuffer.append(obj);
                return;
            }
            A0l2.append(i2);
            stringBuffer.append(AnonymousClass000.A0X("] ", A0l2));
            stringBuffer.append(str7);
        }
    }

    public static String A00(Object obj) {
        C177088e3 Bqk;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        if (obj instanceof C177088e3) {
            Bqk = (C177088e3) obj;
        } else if (obj instanceof C183618qL) {
            Bqk = ((C183618qL) obj).Bqk();
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "unknown object type ", obj);
            return A0o.toString();
        }
        A01("", A0X, Bqk);
        return A0X.toString();
    }
}
