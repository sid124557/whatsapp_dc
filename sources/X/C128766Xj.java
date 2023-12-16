package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.6Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C128766Xj extends C169798Ar {
    public static Map zzd = AnonymousClass0x9.A1D();
    public C160657o4 zzb = C160657o4.A05;
    public int zzc = -1;

    public static AnonymousClass6XT A01(C128766Xj r1) {
        return (AnonymousClass6XT) r1.A09(5);
    }

    public static void A07(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
    }

    public static void A08(Object[] objArr) {
        objArr[0] = "zzc";
        objArr[1] = "zzd";
        objArr[2] = "zze";
        objArr[3] = "zzf";
    }

    public final /* synthetic */ C187848xu BuK() {
        return (C169798Ar) A09(6);
    }

    public static int A00(C186268v1 r3, Object obj) {
        C169798Ar r4 = (C169798Ar) obj;
        C128766Xj r2 = (C128766Xj) r4;
        int i = r2.zzc;
        if (i != -1) {
            return i;
        }
        int BtX = r3.BtX(r4);
        r2.zzc = BtX;
        return BtX;
    }

    public static void A05(Object obj, Object obj2) {
        zzd.put(obj, obj2);
    }

    public static final void A06(Object obj, String str, StringBuilder sb, int i) {
        String A00;
        if (obj instanceof List) {
            Iterator A0q = C18320x8.A0q(obj);
            while (A0q.hasNext()) {
                A06(A0q.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0q2 = AnonymousClass000.A0q((Map) obj);
            while (A0q2.hasNext()) {
                A06(A0q2.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                A00 = C1445672b.A00(new C128876Xu(((String) obj).getBytes(C155597fA.A02)));
            } else if (obj instanceof C172538Lp) {
                sb.append(": \"");
                A00 = C1445672b.A00((C172538Lp) obj);
            } else {
                if (obj instanceof C128766Xj) {
                    sb.append(" {");
                    A04((C169798Ar) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A06(entry.getKey(), "key", sb, i4);
                    A06(entry.getValue(), "value", sb, i4);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    C18270x1.A1H(sb, ": ", obj);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v20, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v27, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v34, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v41, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v48, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v55, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v62, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v69, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v76, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v83, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v90, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v97, types: [X.8hs, java.lang.Object, X.6Xk] */
    /* JADX WARNING: type inference failed for: r3v104, types: [X.8hs, java.lang.Object, X.6Xk] */
    public Object A09(int i) {
        ? r3;
        ? r32;
        ? r33;
        ? r34;
        ? r35;
        ? r36;
        ? r37;
        ? r38;
        ? r39;
        ? r310;
        ? r311;
        ? r312;
        ? r313;
        ? r314;
        ? r315;
        if (this instanceof C128706Xd) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128706Xd();
                case 2:
                    return new AnonymousClass6YA();
                case 3:
                    Object[] objArr = new Object[6];
                    A08(objArr);
                    objArr[4] = "zzg";
                    objArr[5] = "zzh";
                    return new C169788Aq(C128706Xd.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", objArr);
                case 4:
                    return C128706Xd.zzi;
                case 5:
                    synchronized (C128706Xd.class) {
                        r315 = new C128776Xk(C128706Xd.zzi);
                        C128706Xd.zzj = r315;
                    }
                    return r315;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128686Xb) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128686Xb();
                case 2:
                    return new AnonymousClass6Y9();
                case 3:
                    Object[] objArr2 = new Object[5];
                    A08(objArr2);
                    objArr2[4] = "zzg";
                    return new C169788Aq(C128686Xb.zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", objArr2);
                case 4:
                    return C128686Xb.zzh;
                case 5:
                    synchronized (C128686Xb.class) {
                        r314 = new C128776Xk(C128686Xb.zzh);
                        C128686Xb.zzi = r314;
                    }
                    return r314;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof AnonymousClass6XY) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new AnonymousClass6XY();
                case 2:
                    return new AnonymousClass6Y8();
                case 3:
                    Object[] A1X = AnonymousClass0x9.A1X();
                    A07(A1X);
                    A1X[2] = "zze";
                    return new C169788Aq(AnonymousClass6XY.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", A1X);
                case 4:
                    return AnonymousClass6XY.zzf;
                case 5:
                    synchronized (AnonymousClass6XY.class) {
                        r313 = new C128776Xk(AnonymousClass6XY.zzf);
                        AnonymousClass6XY.zzg = r313;
                    }
                    return r313;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof AnonymousClass6XX) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new AnonymousClass6XX();
                case 2:
                    return new AnonymousClass6Y7();
                case 3:
                    Object[] A1X2 = AnonymousClass0x9.A1X();
                    A07(A1X2);
                    A1X2[2] = "zze";
                    return new C169788Aq(AnonymousClass6XX.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", A1X2);
                case 4:
                    return AnonymousClass6XX.zzf;
                case 5:
                    synchronized (AnonymousClass6XX.class) {
                        r312 = new C128776Xk(AnonymousClass6XX.zzf);
                        AnonymousClass6XX.zzg = r312;
                    }
                    return r312;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128736Xg) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128736Xg();
                case 2:
                    return new AnonymousClass6Y6();
                case 3:
                    Object[] objArr3 = new Object[7];
                    A08(objArr3);
                    objArr3[4] = "zzg";
                    objArr3[5] = "zzh";
                    objArr3[6] = "zzi";
                    return new C169788Aq(C128736Xg.zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", objArr3);
                case 4:
                    return C128736Xg.zzj;
                case 5:
                    synchronized (C128736Xg.class) {
                        r311 = new C128776Xk(C128736Xg.zzj);
                        C128736Xg.zzk = r311;
                    }
                    return r311;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128696Xc) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128696Xc();
                case 2:
                    return new AnonymousClass6Y5();
                case 3:
                    Object[] objArr4 = new Object[7];
                    A07(objArr4);
                    objArr4[2] = C169748Am.A00;
                    objArr4[3] = "zze";
                    objArr4[4] = "zzf";
                    objArr4[5] = "zzh";
                    objArr4[6] = "zzg";
                    return new C169788Aq(C128696Xc.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", objArr4);
                case 4:
                    return C128696Xc.zzi;
                case 5:
                    synchronized (C128696Xc.class) {
                        r310 = new C128776Xk(C128696Xc.zzi);
                        C128696Xc.zzj = r310;
                    }
                    return r310;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128676Xa) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128676Xa();
                case 2:
                    return new AnonymousClass6Y4();
                case 3:
                    Object[] objArr5 = new Object[5];
                    A08(objArr5);
                    objArr5[4] = C128756Xi.class;
                    return new C169788Aq(C128676Xa.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", objArr5);
                case 4:
                    return C128676Xa.zzg;
                case 5:
                    synchronized (C128676Xa.class) {
                        r39 = new C128776Xk(C128676Xa.zzg);
                        C128676Xa.zzh = r39;
                    }
                    return r39;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128726Xf) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128726Xf();
                case 2:
                    return new AnonymousClass6Y3();
                case 3:
                    Object[] objArr6 = new Object[7];
                    A08(objArr6);
                    objArr6[4] = "zzg";
                    objArr6[5] = "zzh";
                    objArr6[6] = "zzi";
                    return new C169788Aq(C128726Xf.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", objArr6);
                case 4:
                    return C128726Xf.zzj;
                case 5:
                    synchronized (C128726Xf.class) {
                        r38 = new C128776Xk(C128726Xf.zzj);
                        C128726Xf.zzk = r38;
                    }
                    return r38;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128716Xe) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128716Xe();
                case 2:
                    return new AnonymousClass6Y2();
                case 3:
                    Object[] objArr7 = new Object[10];
                    A07(objArr7);
                    objArr7[2] = C169738Al.A00;
                    objArr7[3] = "zze";
                    objArr7[4] = C169728Ak.A00;
                    objArr7[5] = "zzf";
                    objArr7[6] = C169718Aj.A00;
                    objArr7[7] = "zzg";
                    objArr7[8] = "zzh";
                    objArr7[9] = "zzi";
                    return new C169788Aq(C128716Xe.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", objArr7);
                case 4:
                    return C128716Xe.zzj;
                case 5:
                    synchronized (C128716Xe.class) {
                        r37 = new C128776Xk(C128716Xe.zzj);
                        C128716Xe.zzk = r37;
                    }
                    return r37;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128756Xi) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128756Xi();
                case 2:
                    return new AnonymousClass6Y1();
                case 3:
                    Object[] objArr8 = new Object[11];
                    A08(objArr8);
                    objArr8[4] = "zzg";
                    objArr8[5] = C169708Ai.A00;
                    objArr8[6] = "zzh";
                    objArr8[7] = "zzi";
                    objArr8[8] = "zzj";
                    objArr8[9] = "zzk";
                    objArr8[10] = C128686Xb.class;
                    return new C169788Aq(C128756Xi.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", objArr8);
                case 4:
                    return C128756Xi.zzl;
                case 5:
                    synchronized (C128756Xi.class) {
                        r36 = new C128776Xk(C128756Xi.zzl);
                        C128756Xi.zzm = r36;
                    }
                    return r36;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof C128746Xh) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new C128746Xh();
                case 2:
                    return new AnonymousClass6Y0();
                case 3:
                    Object[] objArr9 = new Object[10];
                    A08(objArr9);
                    objArr9[4] = C169698Ah.A00;
                    objArr9[5] = "zzg";
                    objArr9[6] = "zzh";
                    objArr9[7] = "zzi";
                    objArr9[8] = "zzj";
                    objArr9[9] = "zzk";
                    return new C169788Aq(C128746Xh.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", objArr9);
                case 4:
                    return C128746Xh.zzl;
                case 5:
                    synchronized (C128746Xh.class) {
                        r35 = new C128776Xk(C128746Xh.zzl);
                        C128746Xh.zzm = r35;
                    }
                    return r35;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof AnonymousClass6XU) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new AnonymousClass6XU();
                case 2:
                    return new C128926Xz();
                case 3:
                    Object[] A0M = AnonymousClass002.A0M();
                    A0M[0] = "zzc";
                    A0M[1] = AnonymousClass6XY.class;
                    return new C169788Aq(AnonymousClass6XU.zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M);
                case 4:
                    return AnonymousClass6XU.zzd;
                case 5:
                    synchronized (AnonymousClass6XU.class) {
                        r34 = new C128776Xk(AnonymousClass6XU.zzd);
                        AnonymousClass6XU.zze = r34;
                    }
                    return r34;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else if (this instanceof AnonymousClass6XZ) {
            switch (AnonymousClass770.A00[i - 1]) {
                case 1:
                    return new AnonymousClass6XZ();
                case 2:
                    return new C128916Xy();
                case 3:
                    Object[] objArr10 = new Object[6];
                    A07(objArr10);
                    objArr10[2] = C169758An.A00;
                    objArr10[3] = "zze";
                    objArr10[4] = C169768Ao.A00;
                    objArr10[5] = "zzf";
                    return new C169788Aq(AnonymousClass6XZ.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", objArr10);
                case 4:
                    return AnonymousClass6XZ.zzg;
                case 5:
                    synchronized (AnonymousClass6XZ.class) {
                        r33 = new C128776Xk(AnonymousClass6XZ.zzg);
                        AnonymousClass6XZ.zzh = r33;
                    }
                    return r33;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw C18320x8.A0m();
            }
        } else {
            boolean z = this instanceof AnonymousClass6XV;
            int[] iArr = AnonymousClass770.A00;
            if (z) {
                switch (iArr[i - 1]) {
                    case 1:
                        return new AnonymousClass6XV();
                    case 2:
                        return new C128906Xx();
                    case 3:
                        Object[] A0M2 = AnonymousClass002.A0M();
                        A0M2[0] = "zzc";
                        A0M2[1] = C169758An.A00;
                        return new C169788Aq(AnonymousClass6XV.zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", A0M2);
                    case 4:
                        return AnonymousClass6XV.zze;
                    case 5:
                        synchronized (AnonymousClass6XV.class) {
                            r32 = new C128776Xk(AnonymousClass6XV.zze);
                            AnonymousClass6XV.zzf = r32;
                        }
                        return r32;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C18320x8.A0m();
                }
            } else {
                switch (iArr[i - 1]) {
                    case 1:
                        return new AnonymousClass6XW();
                    case 2:
                        return new C128896Xw();
                    case 3:
                        Object[] A1X3 = AnonymousClass0x9.A1X();
                        A07(A1X3);
                        A1X3[2] = "zze";
                        return new C169788Aq(AnonymousClass6XW.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1X3);
                    case 4:
                        return AnonymousClass6XW.zzf;
                    case 5:
                        synchronized (AnonymousClass6XW.class) {
                            r3 = new C128776Xk(AnonymousClass6XW.zzf);
                            AnonymousClass6XW.zzg = r3;
                        }
                        return r3;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw C18320x8.A0m();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C157377iC.A02.A00(cls).BtO(this, obj);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int BtE = AnonymousClass6C9.A0U(this).BtE(this);
        this.zza = BtE;
        return BtE;
    }

    public static Object A02(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw AnonymousClass6CA.A0Q("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw AnonymousClass6CA.A0Q("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final String A03(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int i = 0; i < str.length(); i++) {
            A0o.append(Character.toLowerCase(AnonymousClass6C9.A01(str, A0o, i)));
        }
        return A0o.toString();
    }

    public static void A04(C187848xu r13, StringBuilder sb, int i) {
        String str;
        int ordinal;
        Object obj;
        Method method;
        String A03;
        HashMap A0t = AnonymousClass001.A0t();
        HashMap A0t2 = AnonymousClass001.A0t();
        TreeSet treeSet = new TreeSet();
        for (Method A1P : r13.getClass().getDeclaredMethods()) {
            AnonymousClass6C7.A1P(A1P, treeSet, A0t2, A0t);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (A0m.startsWith("get")) {
                str = A0m.substring(3);
            } else {
                str = A0m;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String A0j = AnonymousClass6C7.A0j(AnonymousClass6C7.A0i(str), str.substring(1, str.length() - 4));
                method = (Method) A0t.get(A0m);
                if (method != null && method.getReturnType().equals(List.class)) {
                    A03 = A03(A0j);
                    A06(A02(r13, method, new Object[0]), A03, sb, i);
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String A0j2 = AnonymousClass6C7.A0j(AnonymousClass6C7.A0i(str), str.substring(1, str.length() - 3));
                method = (Method) A0t.get(A0m);
                if (method != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    A03 = A03(A0j2);
                    A06(A02(r13, method, new Object[0]), A03, sb, i);
                }
            }
            int length = str.length();
            if (A0t2.get(AnonymousClass6C7.A0k("set", str, length)) != null && (!str.endsWith("Bytes") || !A0t.containsKey(AnonymousClass6C7.A0j("get", str.substring(0, length - 5))))) {
                String A0j3 = AnonymousClass6C7.A0j(AnonymousClass6C7.A0i(str), str.substring(1));
                Method method2 = (Method) A0t.get(AnonymousClass6C7.A0k("get", str, length));
                Method method3 = (Method) A0t.get(AnonymousClass6C7.A0k("has", str, length));
                if (method2 != null) {
                    Object A02 = A02(r13, method2, new Object[0]);
                    if (method3 == null) {
                        if (A02 instanceof Boolean) {
                            ordinal = AnonymousClass001.A1Z(A02);
                        } else if (A02 instanceof Integer) {
                            ordinal = AnonymousClass001.A0K(A02);
                        } else if (A02 instanceof Float) {
                            ordinal = (AnonymousClass001.A05(A02) > 0.0f ? 1 : (AnonymousClass001.A05(A02) == 0.0f ? 0 : -1));
                        } else if (A02 instanceof Double) {
                            ordinal = (AnonymousClass6C9.A02(A02) > 0.0d ? 1 : (AnonymousClass6C9.A02(A02) == 0.0d ? 0 : -1));
                        } else {
                            if (A02 instanceof String) {
                                obj = "";
                            } else if (A02 instanceof C172538Lp) {
                                obj = C172538Lp.A00;
                            } else if (A02 instanceof C187848xu) {
                                if (A02 == ((C181058m4) A02).BuK()) {
                                }
                            } else if (A02 instanceof Enum) {
                                ordinal = ((Enum) A02).ordinal();
                            }
                            if (A02.equals(obj)) {
                            }
                        }
                        if (ordinal == 0) {
                        }
                    } else if (!AnonymousClass001.A1Z(A02(r13, method3, new Object[0]))) {
                    }
                    A06(A02, A03(A0j3), sb, i);
                }
            }
        }
        C160657o4 r3 = ((C128766Xj) r13).zzb;
        if (r3 != null) {
            for (int i2 = 0; i2 < r3.A00; i2++) {
                A06(r3.A04[i2], String.valueOf(r3.A03[i2] >>> 3), sb, i);
            }
        }
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("# ");
        A0o.append(obj);
        A04(this, A0o, 0);
        return A0o.toString();
    }
}
