package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.35q  reason: invalid class name and case insensitive filesystem */
public class C625735q {
    public static final int[] A0R = {R.string.f11nameremoved, R.string.f11nameremoved};
    public static final int[] A0S = {R.plurals.f9nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.plurals.f9nameremoved, R.plurals.f9nameremoved};
    public static final int[][] A0T = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0U = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0V = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0W;
    public static final int[][] A0X;
    public static final int[][] A0Y = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0Z;
    public static final int[][] A0a = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0b;
    public static final int[][] A0c = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0d = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0e = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}};
    public static final int[][] A0f;
    public static final int[][] A0g;
    public static final int[][] A0h = {new int[]{R.plurals.f9nameremoved, R.plurals.f9nameremoved, R.plurals.f9nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.plurals.f9nameremoved, R.plurals.f9nameremoved, R.plurals.f9nameremoved}};
    public static final int[][] A0i = {new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}, new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved}};
    public final C116985rC A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C56972sr A03;
    public final AnonymousClass25D A04;
    public final C44272Vj A05;
    public final C56942so A06;
    public final C64773Ex A07;
    public final AnonymousClass5ZU A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final C620733j A0B;
    public final C56982ss A0C;
    public final C56892sj A0D;
    public final C56662sM A0E;
    public final AnonymousClass2R8 A0F;
    public final C49522gf A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass3LP A0I;
    public final C66493Lq A0J;
    public final C52472lX A0K;
    public final C53202mi A0L;
    public final AnonymousClass2YV A0M;
    public final C196439aq A0N;
    public final C56072rN A0O;
    public final C186998wH A0P;
    public final C46572br A0Q;

    static {
        int[][] iArr = new int[3][];
        iArr[0] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr2 = new int[2];
        iArr2[0] = R.string.f11nameremoved;
        int[] A1T = AnonymousClass0x9.A1T(iArr2, iArr, R.string.f11nameremoved, 1, 2);
        A1T[0] = R.string.f11nameremoved;
        A1T[1] = R.string.f11nameremoved;
        iArr[2] = A1T;
        A0X = iArr;
        int[][] iArr3 = new int[3][];
        iArr3[0] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr4 = new int[2];
        iArr4[0] = R.string.f11nameremoved;
        int[] A1T2 = AnonymousClass0x9.A1T(iArr4, iArr3, R.string.f11nameremoved, 1, 2);
        A1T2[0] = R.string.f11nameremoved;
        A1T2[1] = R.string.f11nameremoved;
        iArr3[2] = A1T2;
        A0W = iArr3;
        int[][] iArr5 = new int[3][];
        iArr5[0] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr6 = new int[2];
        iArr6[0] = R.string.f11nameremoved;
        int[] A1T3 = AnonymousClass0x9.A1T(iArr6, iArr5, R.string.f11nameremoved, 1, 2);
        A1T3[0] = R.string.f11nameremoved;
        A1T3[1] = R.string.f11nameremoved;
        iArr5[2] = A1T3;
        A0b = iArr5;
        int[][] iArr7 = new int[3][];
        iArr7[0] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr8 = new int[2];
        iArr8[0] = R.string.f11nameremoved;
        int[] A1T4 = AnonymousClass0x9.A1T(iArr8, iArr7, R.string.f11nameremoved, 1, 2);
        A1T4[0] = R.string.f11nameremoved;
        A1T4[1] = R.string.f11nameremoved;
        iArr7[2] = A1T4;
        A0Z = iArr7;
        int[][] iArr9 = new int[5][];
        iArr9[0] = new int[]{R.plurals.f9nameremoved, R.plurals.f9nameremoved, R.plurals.f9nameremoved};
        iArr9[1] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr10 = new int[3];
        iArr10[0] = R.string.f11nameremoved;
        iArr10[1] = R.string.f11nameremoved;
        int[] A1T5 = AnonymousClass0x9.A1T(iArr10, iArr9, R.string.f11nameremoved, 2, 3);
        A1T5[0] = R.string.f11nameremoved;
        A1T5[1] = R.string.f11nameremoved;
        int[] A1U = AnonymousClass0x9.A1U(A1T5, iArr9, R.string.f11nameremoved, 2, 3);
        A1U[0] = R.plurals.f9nameremoved;
        A1U[1] = R.plurals.f9nameremoved;
        A1U[2] = R.plurals.f9nameremoved;
        iArr9[4] = A1U;
        A0g = iArr9;
        int[][] iArr11 = new int[5][];
        iArr11[0] = new int[]{R.plurals.f9nameremoved, R.plurals.f9nameremoved, R.plurals.f9nameremoved};
        iArr11[1] = new int[]{R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
        int[] iArr12 = new int[3];
        iArr12[0] = R.string.f11nameremoved;
        iArr12[1] = R.string.f11nameremoved;
        int[] A1T6 = AnonymousClass0x9.A1T(iArr12, iArr11, R.string.f11nameremoved, 2, 3);
        A1T6[0] = R.string.f11nameremoved;
        A1T6[1] = R.string.f11nameremoved;
        int[] A1U2 = AnonymousClass0x9.A1U(A1T6, iArr11, R.string.f11nameremoved, 2, 3);
        A1U2[0] = R.plurals.f9nameremoved;
        A1U2[1] = R.plurals.f9nameremoved;
        A1U2[2] = R.plurals.f9nameremoved;
        iArr11[4] = A1U2;
        A0f = iArr11;
    }

    public static void A04(C625735q r4, Iterable iterable, Object[] objArr) {
        objArr[0] = r4.A0B.A0H(r4.A08.A0W(iterable, -1));
    }

    public static void A05(C625735q r4, Object obj, Object[] objArr) {
        C620733j r2 = r4.A0B;
        AnonymousClass5ZU r1 = r4.A08;
        C64773Ex r0 = r4.A07;
        C626936e.A06(obj);
        AnonymousClass3ZH A072 = r0.A07((C95814uZ) obj);
        C626936e.A06(A072);
        objArr[0] = r2.A0H(r1.A0M(A072));
    }

    public final String A0C(AnonymousClass3ZH r4, int i) {
        String A0R2 = this.A08.A0R(r4, i, false);
        if (A0R2 == null) {
            return null;
        }
        return this.A0B.A0H(A0R2);
    }

    public final String A0S(String str, Collection collection, int i, boolean z) {
        char c;
        int[][] iArr;
        List A032 = A03(collection, 3);
        if (z) {
            c = 0;
        } else {
            c = 1;
            if (str == null) {
                c = 2;
            }
        }
        Pair A012 = A01(A032, i);
        if (this.A0H.A0Y(C58422vE.A02, 4345)) {
            iArr = A0f;
        } else {
            iArr = A0g;
        }
        int A033 = C18280x3.A03(A012);
        if (A033 == 1) {
            Resources A002 = A00(this);
            int i2 = iArr[1][c];
            Object[] objArr = new Object[2];
            objArr[0] = A032.get(0);
            return C18320x8.A0b(A002, str, objArr, 1, i2);
        } else if (A033 == 2) {
            Resources A003 = A00(this);
            int i3 = iArr[2][c];
            Object[] objArr2 = new Object[3];
            C18290x4.A1T(A032, objArr2);
            return C18320x8.A0b(A003, str, objArr2, 2, i3);
        } else if (A033 == 3) {
            Resources A004 = A00(this);
            int i4 = iArr[3][c];
            Object[] objArr3 = new Object[4];
            C18290x4.A1T(A032, objArr3);
            objArr3[2] = A032.get(2);
            return C18320x8.A0b(A004, str, objArr3, 3, i4);
        } else if (A033 != 4) {
            Resources A005 = A00(this);
            int i5 = iArr[0][c];
            Object[] objArr4 = new Object[2];
            AnonymousClass000.A1P(objArr4, i, 0);
            objArr4[1] = str;
            return A005.getQuantityString(i5, i, objArr4);
        } else {
            Resources A006 = A00(this);
            int i6 = iArr[4][c];
            int A034 = C18290x4.A03(A012);
            Object[] objArr5 = new Object[4];
            C18290x4.A1T(A032, objArr5);
            objArr5[2] = str;
            objArr5[3] = A012.second;
            return A006.getQuantityString(i6, A034, objArr5);
        }
    }

    public boolean A0U(C624134x r6, boolean z) {
        C27991fJ A012;
        AnonymousClass3ZH A082;
        if (!z || (A012 = AnonymousClass34R.A01(r6.A1J.A00)) == null || (A082 = this.A07.A08(A012)) == null || this.A0C.A06(A012) != 0 || !this.A0H.A0Y(C58422vE.A02, 6572)) {
            return false;
        }
        return AnonymousClass31Y.A01(this.A0D, A082, this.A0K);
    }

    public static Resources A00(C625735q r0) {
        return r0.A0A.A00.getResources();
    }

    public static String A02(C625735q r2, C95814uZ r3) {
        return r2.A08.A0H(r2.A07.A0A(r3));
    }

    public static boolean A06(C625735q r1, C624134x r2) {
        return r1.A03.A0a(r2.A0n());
    }

    public static boolean A07(AnonymousClass1VX r2, int i) {
        if (i <= Math.max(r2.A0O(C58422vE.A02, 3449), 2) || i <= 3) {
            return false;
        }
        return true;
    }

    public C42072Mr A08(C624134x r8, String str, boolean z) {
        boolean z2;
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2;
        boolean A052 = this.A0O.A05(AnonymousClass34R.A01(r8.A1J.A00));
        String A13 = r8.A13();
        if (!TextUtils.isEmpty(A13) || !this.A0H.A0Y(C58422vE.A02, 3010)) {
            if (!A06(this, r8)) {
                if (r8.A0n() != null) {
                    i = R.string.f11nameremoved;
                    if (A052) {
                        i = R.string.f11nameremoved;
                    }
                    objArr2 = C18310x6.A1b(str, 0);
                    C620733j.A03(this.A0B, A13, objArr2, 1);
                } else {
                    i2 = R.string.f11nameremoved;
                    if (A052) {
                        i2 = R.string.f11nameremoved;
                    }
                }
            } else if (A052) {
                i2 = R.string.f11nameremoved;
            } else {
                z2 = A0U(r8, z);
                int i3 = R.string.f11nameremoved;
                if (z2) {
                    i3 = R.string.f11nameremoved;
                }
                objArr = new Object[1];
                C620733j.A03(this.A0B, A13, objArr, 0);
                return new C42072Mr(objArr, r2, z2);
            }
            objArr2 = new Object[1];
            C620733j.A03(this.A0B, A13, objArr2, 0);
        } else if (A06(this, r8)) {
            z2 = A0U(r8, z);
            int i4 = R.string.f11nameremoved;
            if (z2) {
                i4 = R.string.f11nameremoved;
            }
            objArr = new Object[0];
            return new C42072Mr(objArr, i4, z2);
        } else if (r8.A0n() != null) {
            i = R.string.f11nameremoved;
            objArr2 = new Object[]{str};
        } else {
            i = R.string.f11nameremoved;
            objArr2 = new Object[0];
        }
        return new C42072Mr(objArr2, i, false);
    }

    public C42072Mr A09(C624134x r6, String str, boolean z) {
        int i;
        Object[] objArr;
        boolean A052 = this.A0O.A05(AnonymousClass34R.A01(r6.A1J.A00));
        List list = ((C31891p1) r6).A01;
        if (list.size() != 1 || !C56972sr.A0B(this.A03, list)) {
            i = R.string.f11nameremoved;
            if (A052) {
                i = R.string.f11nameremoved;
            }
            objArr = new Object[]{str};
        } else if (A052) {
            i = R.string.f11nameremoved;
            objArr = new Object[0];
        } else {
            boolean A0U2 = A0U(r6, z);
            int i2 = R.string.f11nameremoved;
            if (A0U2) {
                i2 = R.string.f11nameremoved;
            }
            return new C42072Mr(new Object[0], i2, A0U2);
        }
        return new C42072Mr(objArr, i, false);
    }

    public final PhoneUserJid A0A(UserJid userJid, String str) {
        if (userJid instanceof PhoneUserJid) {
            return (PhoneUserJid) userJid;
        }
        if (userJid instanceof C27981fH) {
            return C56662sM.A00(this.A0E, userJid);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid ");
        A0o.append(str);
        throw AnonymousClass002.A0G(AnonymousClass000.A0P(userJid, " JID type: ", A0o));
    }

    public String A0B(Context context, GroupJid groupJid, String str, boolean z, boolean z2) {
        String A0D2 = this.A0C.A0D(groupJid);
        char A0F2 = C107575bX.A0F(A0D2);
        if (z2) {
            if (A0F2 != 0) {
                return context.getString(R.string.f11nameremoved);
            }
            return AnonymousClass0x2.A0X(context, A0D2, 1, R.string.f11nameremoved);
        } else if (z) {
            return AnonymousClass0x2.A0X(context, A0D2, 1, A0a[A0F2][0]);
        } else {
            int[] iArr = A0a[A0F2];
            if (str == null) {
                return AnonymousClass0x2.A0X(context, A0D2, 1, iArr[2]);
            }
            int i = iArr[1];
            Object[] objArr = new Object[2];
            objArr[0] = str;
            return AnonymousClass002.A0F(context, A0D2, objArr, 1, i);
        }
    }

    public String A0D(C95814uZ r8, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        if (this.A03.A0a(r8) || r8 == AnonymousClass1fY.A00) {
            r8 = null;
        }
        if (i <= 86400) {
            i2 = i / 3600;
            i3 = R.plurals.f9nameremoved;
        } else {
            i2 = i / 86400;
            i3 = R.plurals.f9nameremoved;
        }
        Context context = this.A0A.A00;
        Resources resources = context.getResources();
        Object[] objArr2 = new Object[1];
        char A1Y = C18300x5.A1Y(objArr2, i2);
        String quantityString = resources.getQuantityString(i3, i2, objArr2);
        if (r8 == null) {
            i4 = R.string.f11nameremoved;
            if (z) {
                i4 = R.string.f11nameremoved;
            }
            objArr = new Object[1];
            objArr[A1Y] = quantityString;
        } else {
            String A0C2 = A0C(this.A07.A0A(r8), C18280x3.A01(C627336j.A0K(r8) ? 1 : 0));
            int i5 = R.string.f11nameremoved;
            if (z) {
                i5 = R.string.f11nameremoved;
            }
            objArr = new Object[2];
            objArr[A1Y] = A0C2;
            objArr[1] = quantityString;
        }
        return context.getString(i4, objArr);
    }

    public String A0E(C95814uZ r9, int i, boolean z) {
        Context context;
        int i2;
        if (r9 != null) {
            if (!this.A03.A0a(r9) && r9 != AnonymousClass1fY.A00) {
                String A0C2 = A0C(this.A07.A0A(r9), C18280x3.A01(C627336j.A0K(r9) ? 1 : 0));
                if (A0C2 != null) {
                    if (i <= 0) {
                        Context context2 = this.A0A.A00;
                        int i3 = R.string.f11nameremoved;
                        if (z) {
                            i3 = R.string.f11nameremoved;
                        }
                        return AnonymousClass0x2.A0X(context2, A0C2, 1, i3);
                    }
                    int i4 = R.string.f11nameremoved;
                    if (z) {
                        i4 = R.string.f11nameremoved;
                    }
                    int i5 = R.plurals.f9nameremoved;
                    if (i > 86400) {
                        i /= 86400;
                        i5 = R.plurals.f9nameremoved;
                    } else if (i >= 3600) {
                        i /= 3600;
                        i5 = R.plurals.f9nameremoved;
                    } else if (i >= 60) {
                        i /= 60;
                        i5 = R.plurals.f9nameremoved;
                    }
                    Context context3 = this.A0A.A00;
                    String A0Y2 = AnonymousClass0x2.A0Y(context3.getResources(), i, 0, i5);
                    Resources resources = context3.getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = A0C2;
                    return C18320x8.A0b(resources, A0Y2, objArr, 1, i4);
                }
            } else if (i <= 0) {
                context = this.A0A.A00;
                i2 = R.string.f11nameremoved;
                if (z) {
                    i2 = R.string.f11nameremoved;
                }
                return context.getString(i2);
            } else {
                int i6 = R.string.f11nameremoved;
                if (z) {
                    i6 = R.string.f11nameremoved;
                }
                int i7 = R.plurals.f9nameremoved;
                if (i > 86400) {
                    i /= 86400;
                    i7 = R.plurals.f9nameremoved;
                } else if (i >= 3600) {
                    i /= 3600;
                    i7 = R.plurals.f9nameremoved;
                } else if (i >= 60) {
                    i /= 60;
                    i7 = R.plurals.f9nameremoved;
                }
                Context context4 = this.A0A.A00;
                Resources resources2 = context4.getResources();
                Object[] objArr2 = new Object[1];
                boolean A1Y = C18300x5.A1Y(objArr2, i);
                return C18320x8.A0b(context4.getResources(), resources2.getQuantityString(i7, i, objArr2), new Object[1], A1Y ? 1 : 0, i6);
            }
        }
        if (i <= 0) {
            context = this.A0A.A00;
            i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            return context.getString(i2);
        }
        int i8 = R.string.f11nameremoved;
        if (z) {
            i8 = R.string.f11nameremoved;
        }
        int i9 = R.plurals.f9nameremoved;
        if (i > 86400) {
            i /= 86400;
            i9 = R.plurals.f9nameremoved;
        } else if (i >= 3600) {
            i /= 3600;
            i9 = R.plurals.f9nameremoved;
        } else if (i >= 60) {
            i /= 60;
            i9 = R.plurals.f9nameremoved;
        }
        Context context5 = this.A0A.A00;
        Resources resources3 = context5.getResources();
        Object[] objArr3 = new Object[1];
        boolean A1Y2 = C18300x5.A1Y(objArr3, i);
        return C18320x8.A0b(context5.getResources(), resources3.getQuantityString(i9, i, objArr3), new Object[1], A1Y2 ? 1 : 0, i8);
    }

    public final String A0G(C30341mI r8) {
        int i;
        Object[] objArr;
        C31881p0 r82 = (C31881p0) r8;
        String A0D2 = this.A0C.A0D(r82.A1x(2));
        if (A0D2 == null) {
            A0D2 = r82.A1y(2);
        }
        List list = r82.A01;
        if (list.size() != 1 || !C56972sr.A0B(this.A03, list)) {
            Resources A002 = A00(this);
            int size = list.size();
            Object[] objArr2 = new Object[1];
            A04(this, list, objArr2);
            return A002.getQuantityString(R.plurals.f9nameremoved, size, objArr2);
        }
        if (A0D2 == null) {
            i = R.string.f11nameremoved;
            objArr = new Object[0];
        } else {
            i = R.string.f11nameremoved;
            objArr = new Object[]{A0D2};
        }
        return this.A0A.A00.getString(i, objArr);
    }

    public final String A0I(C30341mI r8, int i, int i2, int i3) {
        List list = ((C31891p1) r8).A01;
        if (list.size() == 1 && C56972sr.A0B(this.A03, list)) {
            return this.A0A.A00.getString(i);
        }
        C56972sr r5 = this.A03;
        if (list.contains(C56972sr.A04(r5)) || list.contains(r5.A0H())) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C95814uZ A0P2 = C18300x5.A0P(it);
                if (!r5.A0a(A0P2)) {
                    A0s.add(A0P2);
                }
            }
            Resources A002 = A00(this);
            int size = A0s.size();
            Object[] objArr = new Object[1];
            A04(this, A0s, objArr);
            return A002.getQuantityString(i2, size, objArr);
        }
        Resources A003 = A00(this);
        int size2 = list.size();
        Object[] objArr2 = new Object[1];
        A04(this, list, objArr2);
        return A003.getQuantityString(i3, size2, objArr2);
    }

    public final String A0L(C30341mI r5, String str, int i, int i2, int i3) {
        if (r5.A1J.A00 instanceof AnonymousClass1fS) {
            return AnonymousClass0x2.A0X(this.A0A.A00, str, 1, i);
        }
        boolean A062 = A06(this, r5);
        C54292oU r0 = this.A0A;
        if (A062) {
            return r0.A00.getString(i2);
        }
        return C54292oU.A00(r0).getQuantityString(i3, 1, new Object[]{str});
    }

    public final String A0N(C30341mI r19, String str, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String A0W2;
        String A0W3;
        String A0W4;
        C30341mI r1 = r19;
        List list = ((C31891p1) r1).A01;
        int size = list.size();
        if (z) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            i3 = R.plurals.f9nameremoved;
            i4 = R.string.f11nameremoved;
            i5 = R.string.f11nameremoved;
            boolean z3 = z2;
            if (z2 && !A07(this.A0H, list.size())) {
                if (A0U(r1, z3)) {
                    i4 = R.string.f11nameremoved;
                }
                if (AnonymousClass31Y.A00(this.A0C, this.A0D, r1)) {
                    i5 = R.string.f11nameremoved;
                }
            }
            i6 = R.plurals.f9nameremoved;
        } else {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
            i3 = R.plurals.f9nameremoved;
            i4 = R.string.f11nameremoved;
            i5 = R.string.f11nameremoved;
            i6 = R.plurals.f9nameremoved;
        }
        C95814uZ r13 = r1.A1J.A00;
        if (r13 instanceof AnonymousClass1fS) {
            Resources A002 = A00(this);
            Object[] objArr = new Object[1];
            A04(this, list, objArr);
            return A002.getQuantityString(i6, size, objArr);
        }
        C56972sr r12 = this.A03;
        if (C56972sr.A0A(r12, r1)) {
            Context context = this.A0A.A00;
            Object[] objArr2 = new Object[1];
            C620733j r2 = this.A0B;
            boolean A072 = A07(this.A0H, size);
            AnonymousClass5ZU r14 = this.A08;
            if (A072) {
                A0W4 = r14.A0V(list, 2);
            } else {
                A0W4 = r14.A0W(list, -1);
            }
            C620733j.A03(r2, A0W4, objArr2, 0);
            return context.getString(i, objArr2);
        }
        String str2 = str;
        if (str == null) {
            if (size == 1 && C56972sr.A0B(r12, list)) {
                return this.A0A.A00.getString(i2);
            }
            Resources A003 = A00(this);
            Object[] objArr3 = new Object[1];
            C620733j r22 = this.A0B;
            boolean A073 = A07(this.A0H, size);
            AnonymousClass5ZU r15 = this.A08;
            if (A073) {
                A0W3 = r15.A0V(list, 2);
            } else {
                A0W3 = r15.A0W(list, -1);
            }
            C620733j.A03(r22, A0W3, objArr3, 0);
            return A003.getQuantityString(i3, size, objArr3);
        } else if (size == 1 && C56972sr.A0B(r12, list)) {
            return AnonymousClass0x2.A0X(this.A0A.A00, str2, 1, i4);
        } else {
            int A012 = C18280x3.A01(C627336j.A0K(r13) ? 1 : 0);
            Context context2 = this.A0A.A00;
            Object[] objArr4 = new Object[2];
            objArr4[0] = str;
            C620733j r16 = this.A0B;
            boolean A074 = A07(this.A0H, size);
            AnonymousClass5ZU r122 = this.A08;
            if (A074) {
                HashSet A0K2 = AnonymousClass002.A0K();
                A0W2 = r122.A0X(A0K2, 2, A012, r122.A0g(list, A0K2), true);
            } else {
                A0W2 = r122.A0W(list, A012);
            }
            C620733j.A03(r16, A0W2, objArr4, 1);
            return context2.getString(i5, objArr4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v270, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v273, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v291, resolved type: X.1p0} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v62, types: [X.4uZ] */
    /* JADX WARNING: type inference failed for: r5v141 */
    /* JADX WARNING: type inference failed for: r5v142 */
    /* JADX WARNING: type inference failed for: r5v143 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04cf, code lost:
        if (r20 == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04d1, code lost:
        r1 = A0P((X.C31871oz) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04d7, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d9, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04f7, code lost:
        r1 = A0P((X.C31871oz) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04fd, code lost:
        if (r1 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0503, code lost:
        return A0G(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0590, code lost:
        return r2.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05eb, code lost:
        return r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0661, code lost:
        if (r6.lastIndexOf("\"") > r6.indexOf("\"")) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a91, code lost:
        return X.AnonymousClass0x2.A0X(r5, r2, 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b5c, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d38, code lost:
        return r5.A00(r2, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0da0, code lost:
        r0 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0db4, code lost:
        return X.C18320x8.A0b(r2, r6, r0, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0df1, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0e05, code lost:
        if (r0.A03.A0a(r5) == false) goto L_0x0e07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0e3a, code lost:
        if (r5 == null) goto L_0x0e3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0eda, code lost:
        if (r16 != false) goto L_0x0edc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0eff, code lost:
        return X.C54292oU.A00(r0.A0A).getString(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0fb3, code lost:
        if (r2 != false) goto L_0x1062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x102e, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x1031, code lost:
        if (r2 == false) goto L_0x1065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x1033, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x1060, code lost:
        if (r1 != false) goto L_0x1062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x1062, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x1069, code lost:
        return r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x1080, code lost:
        if (r2 != null) goto L_0x108a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x1089, code lost:
        return r3.getString(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x1091, code lost:
        return X.AnonymousClass0x2.A0X(r3, r2, 1, com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x122e, code lost:
        return X.C54292oU.A00(r0).getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:0x1294, code lost:
        if (r9 == null) goto L_0x12a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x1296, code lost:
        r2 = r0.A06.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x129c, code lost:
        if (r2 == null) goto L_0x12a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x129e, code lost:
        if (r20 == false) goto L_0x12a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:836:0x12a6, code lost:
        if (r0.A0D.A0D(r2) == false) goto L_0x12a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x12a8, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x12af, code lost:
        if (X.C56952sp.A0D(r0.A0H) == false) goto L_0x12c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x12b1, code lost:
        r1 = A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x12c1, code lost:
        return r0.A0A.A00.getString(r1[r5][r4], new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:843:0x12c2, code lost:
        r1 = A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:878:0x13a6, code lost:
        r15 = A0P((X.C31871oz) r1);
        X.C626936e.A06(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x13af, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x13b5, code lost:
        r7 = r0.A0B.A0H(A0F(r1));
        r2 = r0.A0D;
        r6 = r0.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x13c3, code lost:
        if (r9 == null) goto L_0x13d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x13c9, code lost:
        if (r2.A0D(r9) == false) goto L_0x13d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x13cb, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x13d4, code lost:
        if (r6.A0Y(X.C58422vE.A02, 5191) != false) goto L_0x13d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x13d6, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:889:0x13d7, code lost:
        r2 = X.C627636p.A0Q(r0.A03, r1);
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x13de, code lost:
        if (r2 != false) goto L_0x13f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x13e0, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x13e1, code lost:
        if (r7 == null) goto L_0x13f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x13f3, code lost:
        return r0.A0A.A00.getString(r8[0][r5], new java.lang.Object[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x1402, code lost:
        return r0.A0A.A00.getString(r8[r1][r5], new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:947:0x1535, code lost:
        return X.C54292oU.A00(r0.A0A).getString(com.whatsapp.R.string.f11nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:949:0x153a, code lost:
        return A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:952:?, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:699:0x0f1e  */
    /* JADX WARNING: Removed duplicated region for block: B:707:0x0f38  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0O(X.C30341mI r19, boolean r20) {
        /*
            r18 = this;
            r1 = r19
            boolean r0 = X.C627636p.A0d(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0619
            r0 = r1
            X.1o8 r0 = (X.C31341o8) r0
            com.whatsapp.jid.UserJid r10 = r0.A01
        L_0x000e:
            X.2z0 r8 = r1.A1J
            X.4uZ r6 = r8.A00
            boolean r17 = X.C627336j.A0K(r6)
            r7 = 2
            r4 = 1
            int r13 = X.C18280x3.A01(r17)
            r0 = r18
            if (r10 != 0) goto L_0x0605
            r2 = r5
        L_0x0021:
            X.2rN r3 = r0.A0O
            X.1fJ r9 = X.AnonymousClass34R.A01(r6)
            boolean r16 = r3.A05(r9)
            int r14 = r1.A00
            r12 = 3
            java.lang.String r15 = ""
            r3 = 0
            r11 = r20
            switch(r14) {
                case 1: goto L_0x0628;
                case 2: goto L_0x0036;
                case 3: goto L_0x0036;
                case 4: goto L_0x0798;
                case 5: goto L_0x07a6;
                case 6: goto L_0x01a3;
                case 7: goto L_0x07c0;
                case 8: goto L_0x0037;
                case 9: goto L_0x07ce;
                case 10: goto L_0x01ca;
                case 11: goto L_0x0811;
                case 12: goto L_0x0822;
                case 13: goto L_0x0827;
                case 14: goto L_0x085d;
                case 15: goto L_0x0862;
                case 16: goto L_0x0870;
                case 17: goto L_0x0056;
                case 18: goto L_0x087e;
                case 19: goto L_0x0036;
                case 20: goto L_0x08a5;
                case 21: goto L_0x007f;
                case 22: goto L_0x08d2;
                case 23: goto L_0x08de;
                case 24: goto L_0x08ea;
                case 25: goto L_0x08f6;
                case 26: goto L_0x0902;
                case 27: goto L_0x090e;
                case 28: goto L_0x0224;
                case 29: goto L_0x00a9;
                case 30: goto L_0x00bd;
                case 31: goto L_0x0927;
                case 32: goto L_0x0941;
                case 33: goto L_0x00d1;
                case 34: goto L_0x095b;
                case 35: goto L_0x0967;
                case 36: goto L_0x0973;
                case 37: goto L_0x097f;
                case 38: goto L_0x0036;
                case 39: goto L_0x0988;
                case 40: goto L_0x0991;
                case 41: goto L_0x09a2;
                case 42: goto L_0x09b3;
                case 43: goto L_0x0036;
                case 44: goto L_0x09cf;
                case 45: goto L_0x0036;
                case 46: goto L_0x09d8;
                case 47: goto L_0x09e4;
                case 48: goto L_0x09f9;
                case 49: goto L_0x0a0e;
                case 50: goto L_0x0a23;
                case 51: goto L_0x028a;
                case 52: goto L_0x0a2f;
                case 53: goto L_0x00df;
                case 54: goto L_0x00f3;
                case 55: goto L_0x0a92;
                case 56: goto L_0x0a9e;
                case 57: goto L_0x0b38;
                case 58: goto L_0x0504;
                case 59: goto L_0x0b85;
                case 60: goto L_0x02aa;
                case 61: goto L_0x0c33;
                case 62: goto L_0x0ba3;
                case 63: goto L_0x0baf;
                case 64: goto L_0x0bbb;
                case 65: goto L_0x0bd6;
                case 66: goto L_0x0be2;
                case 67: goto L_0x0107;
                case 68: goto L_0x0bee;
                case 69: goto L_0x0c0f;
                case 70: goto L_0x02e2;
                case 71: goto L_0x0db5;
                case 72: goto L_0x0036;
                case 73: goto L_0x0dd4;
                case 74: goto L_0x0de1;
                case 75: goto L_0x0312;
                case 76: goto L_0x0df2;
                case 77: goto L_0x0e42;
                case 78: goto L_0x0e51;
                case 79: goto L_0x0abf;
                case 80: goto L_0x0e60;
                case 81: goto L_0x0e6e;
                case 82: goto L_0x0e7c;
                case 83: goto L_0x0e8a;
                case 84: goto L_0x0eac;
                case 85: goto L_0x0ec3;
                case 86: goto L_0x0eda;
                case 87: goto L_0x0f00;
                case 88: goto L_0x0036;
                case 89: goto L_0x0036;
                case 90: goto L_0x0f44;
                case 91: goto L_0x0f4b;
                case 92: goto L_0x0f63;
                case 93: goto L_0x0edc;
                case 94: goto L_0x0edc;
                case 95: goto L_0x0f7b;
                case 96: goto L_0x0fb7;
                case 97: goto L_0x0036;
                case 98: goto L_0x0fc3;
                case 99: goto L_0x0fd3;
                case 100: goto L_0x0fdf;
                case 101: goto L_0x1536;
                case 102: goto L_0x1007;
                case 103: goto L_0x1037;
                case 104: goto L_0x1053;
                case 105: goto L_0x106a;
                case 106: goto L_0x0f44;
                case 107: goto L_0x1092;
                case 108: goto L_0x10a6;
                case 109: goto L_0x10bd;
                case 110: goto L_0x0036;
                case 111: goto L_0x0036;
                case 112: goto L_0x10d4;
                case 113: goto L_0x10ea;
                case 114: goto L_0x10ea;
                case 115: goto L_0x0036;
                case 116: goto L_0x1101;
                case 117: goto L_0x1136;
                case 118: goto L_0x1159;
                case 119: goto L_0x0036;
                case 120: goto L_0x1181;
                case 121: goto L_0x11c8;
                case 122: goto L_0x04b3;
                case 123: goto L_0x036e;
                case 124: goto L_0x0390;
                case 125: goto L_0x03c2;
                case 126: goto L_0x057b;
                case 127: goto L_0x03d9;
                case 128: goto L_0x1218;
                case 129: goto L_0x03f6;
                case 130: goto L_0x122f;
                case 131: goto L_0x123d;
                case 132: goto L_0x0429;
                case 133: goto L_0x0429;
                case 134: goto L_0x0429;
                case 135: goto L_0x1242;
                case 136: goto L_0x125a;
                case 137: goto L_0x1293;
                case 138: goto L_0x1291;
                case 139: goto L_0x0036;
                case 140: goto L_0x12c5;
                case 141: goto L_0x12dc;
                case 142: goto L_0x046b;
                case 143: goto L_0x047f;
                case 144: goto L_0x04da;
                case 145: goto L_0x12f3;
                case 146: goto L_0x0591;
                case 147: goto L_0x1335;
                case 148: goto L_0x1350;
                case 149: goto L_0x1360;
                case 150: goto L_0x13b0;
                case 151: goto L_0x13b3;
                case 152: goto L_0x1403;
                case 153: goto L_0x05cf;
                case 154: goto L_0x0036;
                case 155: goto L_0x1335;
                case 156: goto L_0x05ec;
                case 157: goto L_0x1423;
                case 158: goto L_0x142f;
                case 159: goto L_0x0036;
                case 160: goto L_0x0036;
                case 161: goto L_0x0036;
                case 162: goto L_0x143b;
                case 163: goto L_0x147c;
                case 164: goto L_0x1488;
                case 165: goto L_0x1494;
                default: goto L_0x0036;
            }
        L_0x0036:
            return r15
        L_0x0037:
            if (r6 == 0) goto L_0x0041
            X.3Ex r1 = r0.A07
            X.3ZH r1 = r1.A0A(r6)
            boolean r3 = r1.A0j
        L_0x0041:
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r3 == 0) goto L_0x004c
            r0 = 2131887449(0x7f120559, float:1.9409505E38)
            goto L_0x05e7
        L_0x004c:
            r0 = 2131887450(0x7f12055a, float:1.9409507E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            goto L_0x05e7
        L_0x0056:
            X.3Ex r1 = r0.A07
            X.C626936e.A06(r6)
            X.3ZH r1 = r1.A07(r6)
            if (r1 == 0) goto L_0x0071
            boolean r1 = r1.A0j
            if (r1 == 0) goto L_0x0071
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131887445(0x7f120555, float:1.9409497E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0071:
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            r0 = 2131889844(0x7f120eb4, float:1.9414363E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131891636(0x7f1215b4, float:1.9417998E38)
            goto L_0x05e7
        L_0x007f:
            X.4uZ r3 = r1.A0n()
            if (r3 != 0) goto L_0x0093
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            r0 = 2131890291(0x7f121073, float:1.941527E38)
            if (r20 == 0) goto L_0x05e7
            r0 = 2131890290(0x7f121072, float:1.9415268E38)
            goto L_0x05e7
        L_0x0093:
            X.2sr r1 = r0.A03
            boolean r1 = r1.A0a(r3)
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x08c8
            r0 = 2131890295(0x7f121077, float:1.9415278E38)
            if (r20 == 0) goto L_0x05e7
            r0 = 2131890294(0x7f121076, float:1.9415276E38)
            goto L_0x05e7
        L_0x00a9:
            boolean r1 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0913
            r0 = 2131890016(0x7f120f60, float:1.9414712E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131891654(0x7f1215c6, float:1.9418034E38)
            goto L_0x05e7
        L_0x00bd:
            boolean r1 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x091d
            r0 = 2131890014(0x7f120f5e, float:1.9414708E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131891652(0x7f1215c4, float:1.941803E38)
            goto L_0x05e7
        L_0x00d1:
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            r0 = 2131889309(0x7f120c9d, float:1.9413278E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131889310(0x7f120c9e, float:1.941328E38)
            goto L_0x05e7
        L_0x00df:
            boolean r1 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0a7c
            r0 = 2131889976(0x7f120f38, float:1.941463E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131891646(0x7f1215be, float:1.9418018E38)
            goto L_0x05e7
        L_0x00f3:
            boolean r1 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x0a85
            r0 = 2131889974(0x7f120f36, float:1.9414627E38)
            if (r16 == 0) goto L_0x05e7
            r0 = 2131891644(0x7f1215bc, float:1.9418014E38)
            goto L_0x05e7
        L_0x0107:
            X.2mi r2 = r0.A0L
            boolean r2 = r2.A02(r6)
            if (r2 == 0) goto L_0x011b
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131887630(0x7f12060e, float:1.9409873E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x011b:
            X.1VX r9 = r0.A0H
            boolean r2 = X.C616831v.A00(r9, r6)
            if (r2 == 0) goto L_0x0137
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            r2 = 2131890191(0x7f12100f, float:1.9415067E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "WhatsApp Surveys"
            r1[r3] = r0
            java.lang.String r0 = "Meta"
            java.lang.String r15 = X.AnonymousClass002.A0F(r5, r0, r1, r4, r2)
            return r15
        L_0x0137:
            X.3LP r2 = r0.A0I
            boolean r2 = X.C57362tW.A00(r2, r6)
            if (r2 == 0) goto L_0x014b
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895462(0x7f1224a6, float:1.9425758E38)
            java.lang.String r15 = X.AnonymousClass1RT.A00(r1, r0)
            return r15
        L_0x014b:
            r2 = r1
            X.1nv r2 = (X.C31211nv) r2
            int r8 = r2.A00
            X.2oU r2 = r0.A0A
            android.content.Context r5 = r2.A00
            X.5rC r7 = r0.A00
            X.2sr r0 = r0.A03
            boolean r0 = r0.A0a(r6)
            if (r0 == 0) goto L_0x0174
            r2 = 1967(0x7af, float:2.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r2)
            if (r0 == 0) goto L_0x0174
        L_0x0168:
            boolean r1 = X.C616831v.A01(r9, r1)
            java.lang.Object r0 = r7.A05()
            switch(r8) {
                case 0: goto L_0x0176;
                case 1: goto L_0x0176;
                case 2: goto L_0x017d;
                case 3: goto L_0x017d;
                case 4: goto L_0x017d;
                case 5: goto L_0x0199;
                case 6: goto L_0x0199;
                case 7: goto L_0x0187;
                case 8: goto L_0x0187;
                case 9: goto L_0x0199;
                case 10: goto L_0x0199;
                case 11: goto L_0x0173;
                case 12: goto L_0x0173;
                case 13: goto L_0x0173;
                case 14: goto L_0x0173;
                case 15: goto L_0x018c;
                case 16: goto L_0x0199;
                case 17: goto L_0x019e;
                default: goto L_0x0173;
            }
        L_0x0173:
            return r15
        L_0x0174:
            r4 = 0
            goto L_0x0168
        L_0x0176:
            if (r4 == 0) goto L_0x017d
            r0 = 2131890779(0x7f12125b, float:1.941626E38)
            goto L_0x05e7
        L_0x017d:
            r0 = 2131887629(0x7f12060d, float:1.940987E38)
            if (r1 == 0) goto L_0x05e7
            r0 = 2131887631(0x7f12060f, float:1.9409875E38)
            goto L_0x05e7
        L_0x0187:
            r0 = 2131890189(0x7f12100d, float:1.9415063E38)
            goto L_0x05e7
        L_0x018c:
            if (r0 == 0) goto L_0x0199
            X.C162457s7.A0J(r5, r3)
            r0 = 2131886942(0x7f12035e, float:1.9408477E38)
            java.lang.String r15 = X.C18290x4.A0l(r5, r0)
            return r15
        L_0x0199:
            r0 = 2131890190(0x7f12100e, float:1.9415065E38)
            goto L_0x05e7
        L_0x019e:
            r0 = 2131895960(0x7f122698, float:1.9426768E38)
            goto L_0x05e7
        L_0x01a3:
            r6 = r1
            X.1o7 r6 = (X.C31331o7) r6
            X.4uZ r3 = r1.A0n()
            if (r3 == 0) goto L_0x0036
            X.2sr r1 = r0.A03
            boolean r5 = r1.A0a(r3)
            java.lang.String r1 = r6.A1w()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            if (r5 == 0) goto L_0x14ca
            if (r3 == 0) goto L_0x14c2
            r0 = 2131892571(0x7f12195b, float:1.9419894E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x01ca:
            X.1o8 r1 = (X.C31341o8) r1
            com.whatsapp.jid.UserJid r5 = r1.A01
            java.lang.String r2 = "old"
            com.whatsapp.jid.PhoneUserJid r6 = r0.A0A(r5, r2)
            com.whatsapp.jid.UserJid r2 = r1.A00
            java.lang.String r1 = "new"
            com.whatsapp.jid.PhoneUserJid r5 = r0.A0A(r2, r1)
            if (r6 == 0) goto L_0x0036
            r6.getRawString()
            X.3Ex r1 = r0.A07
            X.3ZH r2 = r1.A0A(r6)
            java.lang.String r10 = r0.A0C(r2, r4)
            X.C626936e.A06(r10)
            r11 = 160(0xa0, float:2.24E-43)
            r9 = 32
            X.5ZU r1 = r0.A08
            boolean r1 = r1.A0e(r2, r4)
            if (r1 == 0) goto L_0x14dc
            X.C626936e.A06(r5)
            java.lang.String r8 = X.AnonymousClass36P.A03(r5)
            X.2oU r1 = r0.A0A
            android.content.Context r6 = r1.A00
            r5 = 2131889980(0x7f120f3c, float:1.9414639E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r1 = r10.replace(r9, r11)
            r2[r3] = r1
            X.C626936e.A06(r8)
            X.33j r1 = r0.A0B
            java.lang.String r0 = r8.replace(r9, r11)
            java.lang.String r0 = r1.A0I(r0)
            java.lang.String r15 = X.AnonymousClass002.A0F(r6, r0, r2, r4, r5)
            return r15
        L_0x0224:
            X.1o8 r1 = (X.C31341o8) r1
            com.whatsapp.jid.UserJid r5 = r1.A01
            java.lang.String r2 = "old"
            com.whatsapp.jid.PhoneUserJid r6 = r0.A0A(r5, r2)
            com.whatsapp.jid.UserJid r5 = r1.A00
            java.lang.String r2 = "new"
            r0.A0A(r5, r2)
            if (r6 == 0) goto L_0x0036
            r6.getRawString()
            X.3Ex r2 = r0.A07
            X.3ZH r5 = r2.A0A(r6)
            java.lang.String r9 = r0.A0C(r5, r7)
            X.C626936e.A06(r9)
            r8 = 160(0xa0, float:2.24E-43)
            r7 = 32
            X.C626936e.A06(r6)
            boolean r2 = X.AnonymousClass2z0.A0E(r1, r6)
            X.2sr r1 = r0.A03
            boolean r1 = r1.A0Y()
            if (r1 != 0) goto L_0x0281
            r6 = 2131887625(0x7f120609, float:1.9409862E38)
            if (r2 == 0) goto L_0x0264
            r6 = 2131887627(0x7f12060b, float:1.9409866E38)
        L_0x0264:
            X.5ZU r2 = r0.A08
            r1 = -1
            boolean r5 = r2.A0e(r5, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            if (r5 == 0) goto L_0x027e
            java.lang.String r0 = r9.replace(r7, r8)
            r1[r3] = r0
        L_0x0279:
            java.lang.String r15 = r2.getString(r6, r1)
            return r15
        L_0x027e:
            r1[r3] = r9
            goto L_0x0279
        L_0x0281:
            r6 = 2131887626(0x7f12060a, float:1.9409864E38)
            if (r2 == 0) goto L_0x0264
            r6 = 2131887628(0x7f12060c, float:1.9409868E38)
            goto L_0x0264
        L_0x028a:
            r6 = 2131755153(0x7f100091, float:1.9141177E38)
            r2 = r1
            X.1p1 r2 = (X.C31891p1) r2
            java.util.List r5 = r2.A01
            boolean r1 = A06(r0, r1)
            if (r1 == 0) goto L_0x0036
            android.content.res.Resources r3 = A00(r0)
            int r2 = r5.size()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A04(r0, r5, r1)
            java.lang.String r15 = r3.getQuantityString(r6, r2, r1)
            return r15
        L_0x02aa:
            X.1nz r1 = (X.C31251nz) r1
            int r1 = r1.A00
            r2 = 2131889045(0x7f120b95, float:1.9412742E38)
            r3 = 2131889046(0x7f120b96, float:1.9412745E38)
            if (r1 <= 0) goto L_0x02bc
            r2 = 2131889047(0x7f120b97, float:1.9412747E38)
            r3 = 2131889048(0x7f120b98, float:1.9412749E38)
        L_0x02bc:
            boolean r1 = r8.A02
            if (r1 == 0) goto L_0x02c9
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r2)
            return r15
        L_0x02c9:
            int r2 = X.C18280x3.A01(r17)
            if (r6 == 0) goto L_0x0036
            X.3Ex r1 = r0.A07
            X.3ZH r1 = r1.A0A(r6)
            java.lang.String r1 = r0.A0C(r1, r2)
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r0, r1, r4, r3)
            return r15
        L_0x02e2:
            boolean r2 = r1 instanceof X.C31321o6
            if (r2 == 0) goto L_0x0036
            X.4uZ r5 = r1.A0n()
            if (r5 == 0) goto L_0x0036
            r3 = r1
            X.1o6 r3 = (X.C31321o6) r3
            X.2sr r2 = r0.A03
            boolean r2 = r2.A0a(r5)
            if (r2 == 0) goto L_0x14e8
            android.content.res.Resources r2 = A00(r0)
            int r0 = r3.A00
            if (r0 != r7) goto L_0x0307
            r1 = 2131895197(0x7f12239d, float:1.942522E38)
        L_0x0302:
            java.lang.String r1 = r2.getString(r1)
            return r1
        L_0x0307:
            boolean r0 = r3.A02
            r1 = 2131890476(0x7f12112c, float:1.9415645E38)
            if (r0 == 0) goto L_0x0302
            r1 = 2131890474(0x7f12112a, float:1.941564E38)
            goto L_0x0302
        L_0x0312:
            X.1oV r1 = (X.C31571oV) r1
            X.2oU r3 = r0.A0A
            android.content.Context r5 = r3.A00
            java.lang.Integer r8 = r1.A02
            int r3 = r1.A00
            boolean r6 = X.C57192tF.A00(r3)
            if (r8 == 0) goto L_0x032c
            int r3 = r8.intValue()
            if (r3 != r7) goto L_0x032c
            int r3 = r1.A00
            if (r3 == 0) goto L_0x032d
        L_0x032c:
            r4 = 0
        L_0x032d:
            com.whatsapp.jid.GroupJid r3 = r1.A01
            if (r6 == 0) goto L_0x0341
            boolean r9 = X.AnonymousClass000.A1X(r8)
            boolean r8 = A06(r0, r1)
            r4 = r0
            r6 = r3
            r7 = r2
            java.lang.String r15 = r4.A0B(r5, r6, r7, r8, r9)
            return r15
        L_0x0341:
            if (r4 == 0) goto L_0x0036
            boolean r1 = A06(r0, r1)
            X.2ss r0 = r0.A0C
            java.lang.String r8 = r0.A0D(r3)
            r6 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0365
            r3 = 0
        L_0x0352:
            boolean r1 = X.C107575bX.A0F(r8)
            int[][] r0 = A0b
            r0 = r0[r3]
            r1 = r0[r1]
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r2
            java.lang.String r15 = X.AnonymousClass002.A0F(r5, r8, r0, r6, r1)
            return r15
        L_0x0365:
            boolean r0 = X.C107575bX.A0F(r2)
            int r3 = X.C18280x3.A00(r0)
            goto L_0x0352
        L_0x036e:
            if (r20 == 0) goto L_0x0380
            X.2oU r6 = r0.A0A
            r5 = 2131893243(0x7f121bfb, float:1.9421257E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.A0F(r1)
            java.lang.String r15 = X.C54292oU.A05(r6, r0, r2, r3, r5)
            return r15
        L_0x0380:
            r2 = r1
            X.1oz r2 = (X.C31871oz) r2
            java.lang.String r15 = r0.A0P(r2)
            if (r15 != 0) goto L_0x0036
            X.1p1 r1 = (X.C31891p1) r1
            java.lang.String r1 = r0.A0Q(r1)
            return r1
        L_0x0390:
            if (r20 == 0) goto L_0x03b1
            X.1VX r6 = r0.A0H
            r5 = 3380(0xd34, float:4.736E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r6.A0Y(r2, r5)
            X.2oU r6 = r0.A0A
            r5 = 2131893238(0x7f121bf6, float:1.9421247E38)
            if (r2 == 0) goto L_0x03a6
            r5 = 2131893239(0x7f121bf7, float:1.9421249E38)
        L_0x03a6:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.A0F(r1)
            java.lang.String r15 = X.C54292oU.A05(r6, r0, r2, r3, r5)
            return r15
        L_0x03b1:
            X.1oz r1 = (X.C31871oz) r1
            java.lang.String r1 = r0.A0P(r1)
            if (r1 != 0) goto L_0x052e
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131891648(0x7f1215c0, float:1.9418022E38)
            goto L_0x058c
        L_0x03c2:
            boolean r2 = r1 instanceof X.C31431oH
            if (r2 == 0) goto L_0x1536
            r2 = r1
            if (r20 == 0) goto L_0x04f7
            X.2oU r6 = r0.A0A
            r5 = 2131893243(0x7f121bfb, float:1.9421257E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r0.A0F(r1)
            java.lang.String r1 = X.C54292oU.A05(r6, r0, r2, r3, r5)
            return r1
        L_0x03d9:
            if (r20 != 0) goto L_0x1528
            r2 = r1
            X.1oz r2 = (X.C31871oz) r2
            java.lang.String r15 = r0.A0P(r2)
            if (r15 != 0) goto L_0x0036
            X.2oU r0 = r0.A0A
            android.content.Context r6 = r0.A00
            r5 = 2131889993(0x7f120f49, float:1.9414665E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.4uZ r0 = r1.A0n()
            java.lang.String r1 = X.AnonymousClass002.A0F(r6, r0, r2, r3, r5)
            return r1
        L_0x03f6:
            X.3Ex r1 = r0.A07
            X.3ZH r6 = X.C64773Ex.A00(r1, r6)
            boolean r1 = r6.A0R()
            if (r1 == 0) goto L_0x040f
            X.1VX r5 = r0.A0H
            r2 = 5263(0x148f, float:7.375E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r5.A0Y(r1, r2)
            if (r1 != 0) goto L_0x040f
            return r15
        L_0x040f:
            X.2k5 r1 = r6.A0F
            if (r1 != 0) goto L_0x0417
            X.3ZH r1 = r6.A0G
            if (r1 == 0) goto L_0x0036
        L_0x0417:
            X.2oU r1 = r0.A0A
            android.content.Context r5 = r1.A00
            r2 = 2131889396(0x7f120cf4, float:1.9413454E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r0.A0C(r6, r13)
            java.lang.String r15 = X.AnonymousClass002.A0F(r5, r0, r1, r3, r2)
            return r15
        L_0x0429:
            if (r6 == 0) goto L_0x0036
            X.2ss r1 = r0.A0C
            X.31A r2 = r1.A0A(r6, r3)
            boolean r1 = r2 instanceof X.AnonymousClass1RL
            if (r1 == 0) goto L_0x0036
            X.1RL r2 = (X.AnonymousClass1RL) r2
            X.3Ex r1 = r0.A07
            X.3ZH r1 = r1.A0A(r6)
            java.lang.String r7 = r0.A0C(r1, r4)
            switch(r14) {
                case 132: goto L_0x045c;
                case 133: goto L_0x0456;
                default: goto L_0x0444;
            }
        L_0x0444:
            boolean r1 = r2.A0K()
            X.2oU r6 = r0.A0A
            if (r1 == 0) goto L_0x1510
            r5 = 2131887619(0x7f120603, float:1.940985E38)
        L_0x044f:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r15 = X.C54292oU.A05(r6, r7, r0, r3, r5)
            return r15
        L_0x0456:
            X.2oU r6 = r0.A0A
            r5 = 2131887617(0x7f120601, float:1.9409846E38)
            goto L_0x044f
        L_0x045c:
            X.21q r2 = r2.A07
            X.21q r1 = X.C372821q.OWNER
            X.2oU r6 = r0.A0A
            r5 = 2131887615(0x7f1205ff, float:1.9409842E38)
            if (r2 != r1) goto L_0x044f
            r5 = 2131887616(0x7f120600, float:1.9409844E38)
            goto L_0x044f
        L_0x046b:
            boolean r2 = r1 instanceof X.C31541oS
            if (r2 == 0) goto L_0x0036
            X.1oS r1 = (X.C31541oS) r1
            android.content.res.Resources r4 = A00(r0)
            r2 = 2131755156(0x7f100094, float:1.9141183E38)
            int r0 = r1.A00
            java.lang.String r15 = X.AnonymousClass0x2.A0Y(r4, r0, r3, r2)
            return r15
        L_0x047f:
            r7 = r1
            X.1oL r7 = (X.C31471oL) r7
            java.lang.String r6 = r7.A1y(r4)
            X.2oU r5 = r0.A0A
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.33j r2 = r0.A0B
            X.C620733j.A03(r2, r6, r4, r3)
            r3 = 2131893226(0x7f121bea, float:1.9421223E38)
            android.content.res.Resources r2 = X.C54292oU.A00(r5)
            java.lang.String r15 = r2.getString(r3, r4)
            if (r20 != 0) goto L_0x0036
            java.lang.String r3 = r7.A01
            java.lang.String r2 = "sub_group_suggestion_approved"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x04d1
            r1 = 2131894144(0x7f121f80, float:1.9423084E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r5)
            java.lang.String r1 = r0.getString(r1)
            return r1
        L_0x04b3:
            X.1VX r4 = r0.A0H
            r3 = 3380(0xd34, float:4.736E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r4 = r4.A0Y(r2, r3)
            X.2oU r2 = r0.A0A
            r3 = 2131893235(0x7f121bf3, float:1.942124E38)
            if (r4 == 0) goto L_0x04c7
            r3 = 2131893236(0x7f121bf4, float:1.9421243E38)
        L_0x04c7:
            android.content.res.Resources r2 = X.C54292oU.A00(r2)
            java.lang.String r15 = r2.getString(r3)
            if (r20 != 0) goto L_0x0036
        L_0x04d1:
            X.1oz r1 = (X.C31871oz) r1
            java.lang.String r1 = r0.A0P(r1)
            if (r1 == 0) goto L_0x0036
            return r1
        L_0x04da:
            boolean r2 = r1 instanceof X.C31411oF
            if (r2 == 0) goto L_0x1536
            r2 = r1
            X.1p0 r2 = (X.C31881p0) r2
            if (r20 == 0) goto L_0x04f7
            java.lang.String r5 = r2.A1y(r7)
            if (r5 != 0) goto L_0x151c
            X.2oU r0 = r0.A0A
            r1 = 2131893242(0x7f121bfa, float:1.9421255E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r1 = r0.getString(r1)
            return r1
        L_0x04f7:
            X.1oz r1 = (X.C31871oz) r1
            java.lang.String r1 = r0.A0P(r1)
            if (r1 != 0) goto L_0x052e
            java.lang.String r1 = r0.A0G(r2)
            return r1
        L_0x0504:
            boolean r2 = r1 instanceof X.C31241ny
            if (r2 == 0) goto L_0x0036
            X.1ny r1 = (X.C31241ny) r1
            boolean r4 = r1.A00
            X.3Ex r1 = r0.A07
            X.C626936e.A06(r6)
            X.3ZH r3 = r1.A07(r6)
            if (r3 == 0) goto L_0x0036
            X.3LP r2 = r0.A0I
            X.4uZ r1 = r3.A0H
            boolean r1 = X.C57362tW.A00(r2, r1)
            if (r4 == 0) goto L_0x054e
            if (r1 == 0) goto L_0x052f
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895451(0x7f12249b, float:1.9425735E38)
            java.lang.String r1 = X.AnonymousClass1RT.A00(r1, r0)
        L_0x052e:
            return r1
        L_0x052f:
            boolean r1 = r3.A0T()
            if (r1 == 0) goto L_0x053d
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131886830(0x7f1202ee, float:1.940825E38)
            goto L_0x058c
        L_0x053d:
            boolean r1 = r3.A0R()
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131886834(0x7f1202f2, float:1.9408258E38)
            if (r1 == 0) goto L_0x058c
            r0 = 2131886831(0x7f1202ef, float:1.9408252E38)
            goto L_0x058c
        L_0x054e:
            if (r1 == 0) goto L_0x055c
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895465(0x7f1224a9, float:1.9425764E38)
            java.lang.String r1 = X.AnonymousClass1RT.A00(r1, r0)
            return r1
        L_0x055c:
            boolean r1 = r3.A0T()
            if (r1 == 0) goto L_0x056a
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131894581(0x7f122135, float:1.942397E38)
            goto L_0x058c
        L_0x056a:
            boolean r1 = r3.A0R()
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131894583(0x7f122137, float:1.9423975E38)
            if (r1 == 0) goto L_0x058c
            r0 = 2131894582(0x7f122136, float:1.9423973E38)
            goto L_0x058c
        L_0x057b:
            if (r20 != 0) goto L_0x1528
            X.1oz r1 = (X.C31871oz) r1
            java.lang.String r1 = r0.A0P(r1)
            if (r1 != 0) goto L_0x052e
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131889983(0x7f120f3f, float:1.9414645E38)
        L_0x058c:
            java.lang.String r1 = r2.getString(r0)
            return r1
        L_0x0591:
            X.5rC r2 = r0.A00
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r2.A04()
            X.66o r1 = (X.C1229766o) r1
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            X.5jK r1 = (X.C112185jK) r1
            X.C162457s7.A0J(r2, r3)
            X.8qC r0 = r1.A0F
            java.lang.Object r0 = r0.get()
            X.33R r0 = (X.AnonymousClass33R) r0
            X.3ZH r0 = r0.A08
            if (r0 == 0) goto L_0x05ba
            java.lang.String r1 = r0.A0J()
            if (r1 != 0) goto L_0x05c1
        L_0x05ba:
            r0 = 2131895701(0x7f122595, float:1.9426242E38)
            java.lang.String r1 = r2.getString(r0)
        L_0x05c1:
            X.C162457s7.A0H(r1)
            r0 = 2131886943(0x7f12035f, float:1.940848E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r2, r1, r4, r0)
            X.C162457s7.A0D(r15)
            return r15
        L_0x05cf:
            boolean r2 = r1 instanceof X.C31261o0
            if (r2 == 0) goto L_0x0036
            X.1o0 r1 = (X.C31261o0) r1
            int r2 = r1.A00
            int r1 = r1.A01
            if (r1 != 0) goto L_0x0036
            X.2oU r0 = r0.A0A
            android.content.Context r5 = r0.A00
            r0 = 2131895700(0x7f122594, float:1.942624E38)
            if (r2 != 0) goto L_0x05e7
            r0 = 2131895697(0x7f122591, float:1.9426234E38)
        L_0x05e7:
            java.lang.String r15 = r5.getString(r0)
            return r15
        L_0x05ec:
            X.5rC r2 = r0.A01
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0036
            X.2oU r0 = r0.A0A
            r2.A04()
            r1 = 2131896384(0x7f122840, float:1.9427628E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x0605:
            X.3Ex r2 = r0.A07
            X.3ZH r3 = r2.A0A(r10)
            if (r13 != r4) goto L_0x0613
            X.5ZU r2 = r0.A08
            int r13 = r2.A09(r6)
        L_0x0613:
            java.lang.String r2 = r0.A0C(r3, r13)
            goto L_0x0021
        L_0x0619:
            boolean r0 = r1.A1v()
            if (r0 == 0) goto L_0x0625
            X.4uZ r10 = r1.A0n()
            goto L_0x000e
        L_0x0625:
            r10 = r5
            goto L_0x000e
        L_0x0628:
            java.lang.String r6 = r1.A13()
            r10 = 0
            if (r6 == 0) goto L_0x0639
            java.lang.String r6 = r1.A13()
            java.lang.String r5 = "\n"
            java.lang.String[] r5 = r6.split(r5)
        L_0x0639:
            boolean r6 = r1 instanceof X.C31611oZ
            if (r6 == 0) goto L_0x0642
            r6 = r1
            X.1oZ r6 = (X.C31611oZ) r6
            java.lang.String r10 = r6.A01
        L_0x0642:
            java.lang.String r8 = "\""
            if (r5 == 0) goto L_0x06cc
            int r6 = r5.length
            if (r6 != r7) goto L_0x06cc
            X.4uZ r6 = r1.A0n()
            if (r6 == 0) goto L_0x0663
            r6 = r5[r3]
            X.4uZ r6 = X.C18310x6.A0S(r6)
            if (r6 == 0) goto L_0x06cc
            r6 = r5[r4]
            int r9 = r6.lastIndexOf(r8)
            int r6 = r6.indexOf(r8)
            if (r9 <= r6) goto L_0x06cc
        L_0x0663:
            r6 = r5[r3]
            X.4uZ r11 = X.C18310x6.A0S(r6)
            if (r11 == 0) goto L_0x0679
            int r6 = X.C18280x3.A01(r17)
            X.3Ex r2 = r0.A07
            X.3ZH r2 = r2.A0A(r11)
            java.lang.String r2 = r0.A0C(r2, r6)
        L_0x0679:
            r6 = r5[r4]
            int r10 = r6.indexOf(r8)
            int r8 = r6.lastIndexOf(r8)
            if (r8 > r10) goto L_0x06a0
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "divider_row/rr="
            X.C624134x.A0R(r1, r6, r9)
            java.lang.String r1 = " jid="
            r9.append(r1)
            r9.append(r11)
            java.lang.String r1 = " s="
            r9.append(r1)
            r1 = r5[r4]
            X.C18260x0.A1K(r9, r1)
        L_0x06a0:
            X.2oU r1 = r0.A0A
            android.content.Context r9 = r1.A00
            X.1VX r11 = r0.A0H
            r6 = 3088(0xc10, float:4.327E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r11.A0Y(r1, r6)
            r6 = 2131890032(0x7f120f70, float:1.9414744E38)
            if (r1 == 0) goto L_0x06b6
            r6 = 2131889966(0x7f120f2e, float:1.941461E38)
        L_0x06b6:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r2
            X.33j r2 = r0.A0B
            r1 = r5[r4]
            int r0 = r10 + 1
            java.lang.String r0 = r1.substring(r0, r8)
        L_0x06c4:
            X.C620733j.A03(r2, r0, r7, r4)
            java.lang.String r15 = r9.getString(r6, r7)
            return r15
        L_0x06cc:
            boolean r5 = A06(r0, r1)
            if (r5 != 0) goto L_0x0703
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            X.2oU r5 = r0.A0A
            android.content.Context r9 = r5.A00
            X.1VX r8 = r0.A0H
            r6 = 3088(0xc10, float:4.327E-42)
            X.2vE r5 = X.C58422vE.A02
            boolean r5 = r8.A0Y(r5, r6)
            if (r11 != 0) goto L_0x0784
            r6 = 2131890033(0x7f120f71, float:1.9414746E38)
            if (r5 == 0) goto L_0x06ee
            r6 = 2131889967(0x7f120f2f, float:1.9414613E38)
        L_0x06ee:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r3] = r2
            X.33j r2 = r0.A0B
            X.C620733j.A03(r2, r10, r5, r4)
            java.lang.String r0 = r1.A13()
            X.C620733j.A03(r2, r0, r5, r7)
            java.lang.String r15 = r9.getString(r6, r5)
            return r15
        L_0x0703:
            java.lang.String r2 = r1.A13()
            X.C626936e.A06(r2)
            int r6 = r2.indexOf(r8)
            java.lang.String r2 = r1.A13()
            int r5 = r2.lastIndexOf(r8)
            if (r6 != 0) goto L_0x074f
            java.lang.String r2 = r1.A13()
            int r2 = r2.length()
            int r2 = r2 - r4
            if (r5 != r2) goto L_0x074f
            if (r6 == r5) goto L_0x074f
            java.lang.String r1 = r1.A13()
            java.lang.String r6 = r1.substring(r4, r5)
            X.2oU r1 = r0.A0A
            android.content.Context r9 = r1.A00
            X.1VX r5 = r0.A0H
            r2 = 3088(0xc10, float:4.327E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r5.A0Y(r1, r2)
            r5 = 2131890034(0x7f120f72, float:1.9414748E38)
            if (r1 == 0) goto L_0x0743
            r5 = 2131889968(0x7f120f30, float:1.9414615E38)
        L_0x0743:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.33j r0 = r0.A0B
        L_0x0747:
            X.C620733j.A03(r0, r6, r2, r3)
            java.lang.String r15 = r9.getString(r5, r2)
            return r15
        L_0x074f:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            X.2oU r2 = r0.A0A
            android.content.Context r9 = r2.A00
            X.1VX r6 = r0.A0H
            r5 = 3088(0xc10, float:4.327E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r6.A0Y(r2, r5)
            if (r8 != 0) goto L_0x0773
            r6 = 2131890035(0x7f120f73, float:1.941475E38)
            if (r2 == 0) goto L_0x076b
            r6 = 2131889969(0x7f120f31, float:1.9414617E38)
        L_0x076b:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            X.33j r2 = r0.A0B
            X.C620733j.A03(r2, r10, r7, r3)
            goto L_0x0792
        L_0x0773:
            r5 = 2131890034(0x7f120f72, float:1.9414748E38)
            if (r2 == 0) goto L_0x077b
            r5 = 2131889968(0x7f120f30, float:1.9414615E38)
        L_0x077b:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.33j r0 = r0.A0B
            java.lang.String r6 = r1.A13()
            goto L_0x0747
        L_0x0784:
            r6 = 2131890032(0x7f120f70, float:1.9414744E38)
            if (r5 == 0) goto L_0x078c
            r6 = 2131889966(0x7f120f2e, float:1.941461E38)
        L_0x078c:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r2
            X.33j r2 = r0.A0B
        L_0x0792:
            java.lang.String r0 = r1.A13()
            goto L_0x06c4
        L_0x0798:
            r3 = 2131890489(0x7f121139, float:1.9415671E38)
            r4 = 2131889978(0x7f120f3a, float:1.9414635E38)
            r5 = 2131755147(0x7f10008b, float:1.9141165E38)
            java.lang.String r15 = r0.A0L(r1, r2, r3, r4, r5)
            return r15
        L_0x07a6:
            boolean r3 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            if (r3 == 0) goto L_0x07b8
            r0 = 2131889986(0x7f120f42, float:1.9414651E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x07b8:
            r0 = 2131889985(0x7f120f41, float:1.941465E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x07c0:
            r3 = 2131890490(0x7f12113a, float:1.9415673E38)
            r4 = 2131889988(0x7f120f44, float:1.9414655E38)
            r5 = 2131755152(0x7f100090, float:1.9141175E38)
            java.lang.String r15 = r0.A0L(r1, r2, r3, r4, r5)
            return r15
        L_0x07ce:
            r2 = r1
            X.1p1 r2 = (X.C31891p1) r2
            java.util.List r9 = r2.A01
            boolean r2 = X.C624134x.A0a(r1)
            if (r2 == 0) goto L_0x07f2
            android.content.res.Resources r6 = A00(r0)
            r5 = 2131755417(0x7f100199, float:1.9141713E38)
            int r2 = r9.size()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            int r0 = r9.size()
            X.AnonymousClass000.A1P(r1, r0, r3)
            java.lang.String r15 = r6.getQuantityString(r5, r2, r1)
            return r15
        L_0x07f2:
            android.content.res.Resources r8 = A00(r0)
            r6 = 2131755416(0x7f100198, float:1.914171E38)
            int r5 = r9.size()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r0 = r1.A13()
            r2[r3] = r0
            int r0 = r9.size()
            X.AnonymousClass000.A1P(r2, r0, r4)
            java.lang.String r15 = r8.getQuantityString(r6, r5, r2)
            return r15
        L_0x0811:
            X.2Mr r3 = r0.A08(r1, r2, r11)
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            int r1 = r3.A00
            java.lang.Object[] r0 = r3.A02
            java.lang.String r15 = r2.getString(r1, r0)
            return r15
        L_0x0822:
            java.lang.String r15 = r0.A0N(r1, r2, r4, r11)
            return r15
        L_0x0827:
            X.1p1 r1 = (X.C31891p1) r1
            java.util.List r8 = r1.A01
            if (r20 != 0) goto L_0x084c
            int r1 = r8.size()
            if (r1 <= r7) goto L_0x084c
            X.2oU r1 = r0.A0A
            android.content.Context r6 = r1.A00
            r5 = 2131889985(0x7f120f41, float:1.941465E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.33j r1 = r0.A0B
            X.5ZU r0 = r0.A08
            java.lang.String r0 = r0.A0V(r8, r7)
            X.C620733j.A03(r1, r0, r2, r3)
            java.lang.String r15 = r6.getString(r5, r2)
            return r15
        L_0x084c:
            X.2oU r1 = r0.A0A
            android.content.Context r3 = r1.A00
            r2 = 2131889985(0x7f120f41, float:1.941465E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A04(r0, r8, r1)
            java.lang.String r15 = r3.getString(r2, r1)
            return r15
        L_0x085d:
            java.lang.String r15 = r0.A0N(r1, r2, r3, r11)
            return r15
        L_0x0862:
            r4 = 2131889987(0x7f120f43, float:1.9414653E38)
            r3 = 2131755151(0x7f10008f, float:1.9141173E38)
            r2 = 2131755150(0x7f10008e, float:1.9141171E38)
            java.lang.String r15 = r0.A0I(r1, r4, r3, r2)
            return r15
        L_0x0870:
            r4 = 2131889981(0x7f120f3d, float:1.941464E38)
            r3 = 2131755149(0x7f10008d, float:1.914117E38)
            r2 = 2131755148(0x7f10008c, float:1.9141167E38)
            java.lang.String r15 = r0.A0I(r1, r4, r3, r2)
            return r15
        L_0x087e:
            r7 = 2131890098(0x7f120fb2, float:1.9414878E38)
            X.4uZ r1 = r1.A0n()
            if (r1 != 0) goto L_0x089c
            X.2oU r1 = r0.A0A
            android.content.Context r5 = r1.A00
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.3Ex r1 = r0.A07
            X.3ZH r1 = X.C64773Ex.A00(r1, r6)
            java.lang.String r0 = r0.A0C(r1, r13)
            java.lang.String r15 = X.AnonymousClass002.A0F(r5, r0, r2, r3, r7)
            return r15
        L_0x089c:
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r0, r2, r4, r7)
            return r15
        L_0x08a5:
            r2 = r1
            X.1p1 r2 = (X.C31891p1) r2
            java.util.List r5 = r2.A01
            X.33j r4 = r0.A0B
            X.5ZU r3 = r0.A08
            r2 = -1
            java.lang.String r2 = r3.A0W(r5, r2)
            java.lang.String r2 = r4.A0H(r2)
            X.2Mr r3 = r0.A09(r1, r2, r11)
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            int r1 = r3.A00
            java.lang.Object[] r0 = r3.A02
            java.lang.String r15 = r2.getString(r1, r0)
            return r15
        L_0x08c8:
            r0 = 2131890293(0x7f121075, float:1.9415274E38)
            if (r20 == 0) goto L_0x0a8d
            r0 = 2131890292(0x7f121074, float:1.9415272E38)
            goto L_0x0a8d
        L_0x08d2:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895177(0x7f122389, float:1.942518E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x08de:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895173(0x7f122385, float:1.9425172E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x08ea:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895166(0x7f12237e, float:1.9425157E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x08f6:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895161(0x7f122379, float:1.9425147E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x0902:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895155(0x7f122373, float:1.9425135E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x090e:
            java.lang.String r15 = r0.A0M(r1, r2, r12, r11)
            return r15
        L_0x0913:
            r0 = 2131890015(0x7f120f5f, float:1.941471E38)
            if (r16 == 0) goto L_0x0a8d
            r0 = 2131891653(0x7f1215c5, float:1.9418032E38)
            goto L_0x0a8d
        L_0x091d:
            r0 = 2131890013(0x7f120f5d, float:1.9414706E38)
            if (r16 == 0) goto L_0x0a8d
            r0 = 2131891651(0x7f1215c3, float:1.9418028E38)
            goto L_0x0a8d
        L_0x0927:
            boolean r3 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            if (r3 == 0) goto L_0x0939
            r0 = 2131889778(0x7f120e72, float:1.941423E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0939:
            r0 = 2131889777(0x7f120e71, float:1.9414227E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x0941:
            boolean r3 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            if (r3 == 0) goto L_0x0953
            r0 = 2131889776(0x7f120e70, float:1.9414225E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0953:
            r0 = 2131889775(0x7f120e6f, float:1.9414223E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x095b:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895175(0x7f122387, float:1.9425176E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0967:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895179(0x7f12238b, float:1.9425184E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x0973:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895171(0x7f122383, float:1.9425167E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x097f:
            X.9aq r0 = r0.A0N
            X.1of r1 = (X.C31671of) r1
            java.lang.String r15 = r0.A03(r1)
            return r15
        L_0x0988:
            X.9aq r0 = r0.A0N
            X.1og r1 = (X.C31681og) r1
            java.lang.String r15 = r0.A02(r1)
            return r15
        L_0x0991:
            X.2oU r1 = r0.A0A
            android.content.Context r3 = r1.A00
            r2 = 2131892131(0x7f1217a3, float:1.9419002E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A05(r0, r10, r1)
            java.lang.String r15 = r3.getString(r2, r1)
            return r15
        L_0x09a2:
            X.2oU r1 = r0.A0A
            android.content.Context r3 = r1.A00
            r2 = 2131892100(0x7f121784, float:1.9418939E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A05(r0, r10, r1)
            java.lang.String r15 = r3.getString(r2, r1)
            return r15
        L_0x09b3:
            X.2oU r2 = r0.A0A
            android.content.Context r6 = r2.A00
            r5 = 2131891990(0x7f121716, float:1.9418716E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.5ZU r3 = r0.A08
            X.3Ex r2 = r0.A07
            X.4uZ r0 = r1.A0n()
            X.C626936e.A06(r0)
            X.C64773Ex.A01(r2, r3, r0, r4)
            java.lang.String r15 = r6.getString(r5, r4)
            return r15
        L_0x09cf:
            X.9aq r0 = r0.A0N
            X.1o9 r1 = (X.C31351o9) r1
            java.lang.String r15 = r0.A01(r1)
            return r15
        L_0x09d8:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131886891(0x7f12032b, float:1.9408374E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x09e4:
            X.2YV r7 = r0.A0M
            r6 = 2131886892(0x7f12032c, float:1.9408376E38)
            r5 = 2131886893(0x7f12032d, float:1.9408378E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.1nu r1 = (X.C31201nu) r1
            java.lang.String r0 = r1.A00
            r2[r3] = r0
            java.lang.String r15 = r7.A00(r6, r5, r2)
            return r15
        L_0x09f9:
            X.2YV r7 = r0.A0M
            r6 = 2131895169(0x7f122381, float:1.9425163E38)
            r5 = 2131895170(0x7f122382, float:1.9425165E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.1nu r1 = (X.C31201nu) r1
            java.lang.String r0 = r1.A00
            r2[r3] = r0
            java.lang.String r15 = r7.A00(r6, r5, r2)
            return r15
        L_0x0a0e:
            X.2YV r7 = r0.A0M
            r6 = 2131895164(0x7f12237c, float:1.9425153E38)
            r5 = 2131895165(0x7f12237d, float:1.9425155E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.1nu r1 = (X.C31201nu) r1
            java.lang.String r0 = r1.A00
            r2[r3] = r0
            java.lang.String r15 = r7.A00(r6, r5, r2)
            return r15
        L_0x0a23:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131895158(0x7f122376, float:1.9425141E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0a2f:
            r3 = r1
            X.1p1 r3 = (X.C31891p1) r3
            java.util.List r8 = r3.A01
            int r6 = r8.size()
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A07(r1)
            X.2sr r3 = r0.A03
            boolean r1 = r3.A0a(r1)
            if (r1 == 0) goto L_0x0a55
            android.content.res.Resources r3 = A00(r0)
            r2 = 2131755418(0x7f10019a, float:1.9141715E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A04(r0, r8, r1)
            java.lang.String r15 = r3.getQuantityString(r2, r6, r1)
            return r15
        L_0x0a55:
            if (r6 != r4) goto L_0x0a69
            boolean r1 = X.C56972sr.A0B(r3, r8)
            if (r1 == 0) goto L_0x0a69
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131890307(0x7f121083, float:1.9415302E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x0a69:
            android.content.res.Resources r5 = A00(r0)
            r3 = 2131755165(0x7f10009d, float:1.9141202E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            A04(r0, r8, r1)
            r1[r4] = r2
            java.lang.String r15 = r5.getQuantityString(r3, r6, r1)
            return r15
        L_0x0a7c:
            r0 = 2131889975(0x7f120f37, float:1.9414629E38)
            if (r16 == 0) goto L_0x0a8d
            r0 = 2131891645(0x7f1215bd, float:1.9418016E38)
            goto L_0x0a8d
        L_0x0a85:
            r0 = 2131889973(0x7f120f35, float:1.9414625E38)
            if (r16 == 0) goto L_0x0a8d
            r0 = 2131891643(0x7f1215bb, float:1.9418012E38)
        L_0x0a8d:
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r5, r2, r4, r0)
            return r15
        L_0x0a92:
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131895160(0x7f122378, float:1.9425145E38)
            java.lang.String r15 = X.C31201nu.A01(r2, r1, r0)
            return r15
        L_0x0a9e:
            X.1oX r1 = (X.C31591oX) r1
            int r4 = r1.A00
            if (r20 == 0) goto L_0x0ab6
            X.4uZ r2 = r1.A0n()
            X.2sj r1 = r0.A0D
            X.C626936e.A06(r9)
            boolean r1 = r1.A0D(r9)
            java.lang.String r15 = r0.A0E(r2, r4, r1)
            return r15
        L_0x0ab6:
            X.4uZ r1 = r1.A0n()
            java.lang.String r15 = r0.A0E(r1, r4, r3)
            return r15
        L_0x0abf:
            X.3Lq r2 = r0.A0J
            X.2rN r2 = r2.A1B
            boolean r9 = r2.A01()
            X.1p1 r1 = (X.C31891p1) r1
            java.util.List r8 = r1.A01
            int r1 = r8.size()
            if (r1 != r4) goto L_0x0ae6
            X.2sr r1 = r0.A03
            boolean r1 = X.C56972sr.A0B(r1, r8)
            if (r1 == 0) goto L_0x0ae6
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131889978(0x7f120f3a, float:1.9414635E38)
            if (r9 == 0) goto L_0x0b58
            r0 = 2131890054(0x7f120f86, float:1.9414789E38)
            goto L_0x0b58
        L_0x0ae6:
            X.33j r5 = r0.A0B
            X.1VX r2 = r0.A0H
            int r1 = r8.size()
            boolean r1 = A07(r2, r1)
            X.5ZU r2 = r0.A08
            if (r1 == 0) goto L_0x0b19
            java.lang.String r1 = r2.A0V(r8, r7)
        L_0x0afa:
            java.lang.String r6 = r5.A0H(r1)
            boolean r1 = X.C107575bX.A0F(r6)
            if (r1 == 0) goto L_0x0b1f
            android.content.res.Resources r2 = A00(r0)
            r1 = 2131755137(0x7f100081, float:1.9141145E38)
            if (r9 == 0) goto L_0x0b10
            r1 = 2131755136(0x7f100080, float:1.9141143E38)
        L_0x0b10:
            int r0 = r8.size()
            java.lang.String r15 = r2.getQuantityString(r1, r0)
            return r15
        L_0x0b19:
            r1 = -1
            java.lang.String r1 = r2.A0W(r8, r1)
            goto L_0x0afa
        L_0x0b1f:
            android.content.res.Resources r5 = A00(r0)
            r2 = 2131755135(0x7f10007f, float:1.914114E38)
            if (r9 == 0) goto L_0x0b2b
            r2 = 2131755134(0x7f10007e, float:1.9141139E38)
        L_0x0b2b:
            int r1 = r8.size()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
            java.lang.String r15 = r5.getQuantityString(r2, r1, r0)
            return r15
        L_0x0b38:
            X.2br r3 = r0.A0Q
            X.C626936e.A06(r2)
            X.2sr r0 = r3.A00
            boolean r0 = X.C56972sr.A0A(r0, r1)
            if (r0 == 0) goto L_0x0b6b
            X.3Ex r0 = r3.A01
            X.3ZH r1 = r0.A0A(r6)
            boolean r0 = r1.A0U()
            if (r0 == 0) goto L_0x0b5d
            X.2oU r0 = r3.A03
            android.content.Context r1 = r0.A00
            r0 = 2131893456(0x7f121cd0, float:1.942169E38)
        L_0x0b58:
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0b5d:
            X.4uZ r0 = r1.A0H
            boolean r0 = r0 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x0b7d
            X.2oU r0 = r3.A03
            android.content.Context r1 = r0.A00
            r0 = 2131893457(0x7f121cd1, float:1.9421691E38)
            goto L_0x0b58
        L_0x0b6b:
            X.4uZ r0 = r1.A0n()
            if (r0 == 0) goto L_0x0b7d
            X.2oU r0 = r3.A03
            android.content.Context r1 = r0.A00
            r0 = 2131890098(0x7f120fb2, float:1.9414878E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x0b7d:
            r0 = 2131890098(0x7f120fb2, float:1.9414878E38)
            java.lang.String r15 = r3.A00(r6, r0)
            return r15
        L_0x0b85:
            X.1nr r1 = (X.C31171nr) r1
            X.2z0 r3 = r1.A1J
            boolean r2 = r3.A02
            if (r2 == 0) goto L_0x0ba0
            X.4uZ r2 = r1.A0n()
            if (r2 == 0) goto L_0x0b99
            X.2sr r2 = r0.A03
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A04(r2)
        L_0x0b99:
            int r1 = r1.A00
            java.lang.String r15 = r0.A0E(r5, r1, r4)
            return r15
        L_0x0ba0:
            X.4uZ r5 = r3.A00
            goto L_0x0b99
        L_0x0ba3:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131889677(0x7f120e0d, float:1.9414024E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0baf:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131894245(0x7f121fe5, float:1.942329E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0bbb:
            android.content.res.Resources r3 = A00(r0)
            if (r20 == 0) goto L_0x0bce
            r2 = 2131892100(0x7f121784, float:1.9418939E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            A05(r0, r10, r1)
            java.lang.String r1 = r3.getString(r2, r1)
            return r1
        L_0x0bce:
            r0 = 2131892097(0x7f121781, float:1.9418933E38)
            java.lang.String r1 = r3.getString(r0)
            return r1
        L_0x0bd6:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131891992(0x7f121718, float:1.941872E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0be2:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131891991(0x7f121717, float:1.9418718E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0bee:
            X.1nq r1 = (X.C31161nq) r1
            X.2sr r3 = r0.A03
            int r2 = r1.A00
            if (r2 != r7) goto L_0x0c0a
            X.2z0 r2 = r1.A1J
            X.4uZ r3 = r2.A00
        L_0x0bfa:
            X.C626936e.A06(r3)
            X.2gf r2 = r0.A0G
            boolean r2 = r2.A01()
            int r1 = r1.A00
            java.lang.String r15 = r0.A0D(r3, r1, r2)
            return r15
        L_0x0c0a:
            com.whatsapp.jid.PhoneUserJid r3 = X.C56972sr.A04(r3)
            goto L_0x0bfa
        L_0x0c0f:
            X.1o1 r1 = (X.C31271o1) r1
            android.content.res.Resources r2 = A00(r0)
            int r1 = r1.A00
            if (r1 == r4) goto L_0x0c2f
            if (r1 == r7) goto L_0x0c2b
            r0 = 2131886778(0x7f1202ba, float:1.9408144E38)
            if (r1 == r12) goto L_0x0c26
            r0 = 4
            if (r1 != r0) goto L_0x0c69
            r0 = 2131896411(0x7f12285b, float:1.9427682E38)
        L_0x0c26:
            java.lang.String r15 = r2.getString(r0)
            return r15
        L_0x0c2b:
            r0 = 2131886779(0x7f1202bb, float:1.9408146E38)
            goto L_0x0c26
        L_0x0c2f:
            r0 = 2131889677(0x7f120e0d, float:1.9414024E38)
            goto L_0x0c26
        L_0x0c33:
            X.1o1 r1 = (X.C31271o1) r1
            X.3Ex r2 = r0.A07
            X.3ZH r5 = r2.A07(r6)
            X.C626936e.A06(r5)
            X.2k5 r2 = r5.A0F
            if (r2 == 0) goto L_0x0c6b
            X.5ZU r2 = r0.A08
            boolean r2 = r2.A0d(r5)
            if (r2 != 0) goto L_0x0c6b
        L_0x0c4a:
            X.2oU r0 = r0.A0A
            int r2 = r1.A00
            java.lang.String r6 = r1.A01
            X.C626936e.A06(r6)
            android.content.Context r1 = r0.A00
            java.lang.Class<X.3Db> r0 = X.C64333Db.class
            java.lang.Object r0 = X.AnonymousClass29x.A00(r0, r1)
            X.3Db r0 = (X.C64333Db) r0
            X.4C1 r0 = r0.AMs
            java.lang.Object r5 = r0.get()
            X.2YV r5 = (X.AnonymousClass2YV) r5
            r0 = 1
            switch(r2) {
                case 1: goto L_0x0c6d;
                case 2: goto L_0x0c75;
                case 3: goto L_0x0c7d;
                case 4: goto L_0x0c85;
                case 5: goto L_0x0c8d;
                case 6: goto L_0x0c95;
                case 7: goto L_0x0c9d;
                case 8: goto L_0x0ca5;
                case 9: goto L_0x0cad;
                case 10: goto L_0x0cb4;
                case 11: goto L_0x0cbb;
                case 12: goto L_0x0cc2;
                case 13: goto L_0x0cc9;
                case 14: goto L_0x0cd0;
                case 15: goto L_0x0cdf;
                case 16: goto L_0x0ce6;
                case 17: goto L_0x0cf5;
                case 18: goto L_0x0d04;
                case 19: goto L_0x0d13;
                case 20: goto L_0x0d22;
                case 21: goto L_0x0d39;
                case 22: goto L_0x0d41;
                case 23: goto L_0x0d49;
                case 24: goto L_0x0d51;
                case 25: goto L_0x0d59;
                case 26: goto L_0x0d61;
                case 27: goto L_0x0d69;
                case 28: goto L_0x0d71;
                case 29: goto L_0x0d79;
                case 30: goto L_0x0d81;
                case 31: goto L_0x0d89;
                case 32: goto L_0x0d91;
                case 33: goto L_0x0d99;
                case 34: goto L_0x0da3;
                default: goto L_0x0c69;
            }
        L_0x0c69:
            r15 = 0
            return r15
        L_0x0c6b:
            r4 = 0
            goto L_0x0c4a
        L_0x0c6d:
            r2 = 2131886861(0x7f12030d, float:1.9408313E38)
            r1 = 2131886862(0x7f12030e, float:1.9408315E38)
            goto L_0x0d30
        L_0x0c75:
            r2 = 2131886867(0x7f120313, float:1.9408325E38)
            r1 = 2131886868(0x7f120314, float:1.9408327E38)
            goto L_0x0d30
        L_0x0c7d:
            r2 = 2131886870(0x7f120316, float:1.9408331E38)
            r1 = 2131886871(0x7f120317, float:1.9408333E38)
            goto L_0x0d30
        L_0x0c85:
            r2 = 2131886872(0x7f120318, float:1.9408335E38)
            r1 = 2131886873(0x7f120319, float:1.9408337E38)
            goto L_0x0d30
        L_0x0c8d:
            r2 = 2131886884(0x7f120324, float:1.940836E38)
            r1 = 2131886885(0x7f120325, float:1.9408361E38)
            goto L_0x0d30
        L_0x0c95:
            r2 = 2131886888(0x7f120328, float:1.9408368E38)
            r1 = 2131886889(0x7f120329, float:1.940837E38)
            goto L_0x0d30
        L_0x0c9d:
            r2 = 2131886917(0x7f120345, float:1.9408426E38)
            r1 = 2131886918(0x7f120346, float:1.9408428E38)
            goto L_0x0d30
        L_0x0ca5:
            r2 = 2131886915(0x7f120343, float:1.9408422E38)
            r1 = 2131886916(0x7f120344, float:1.9408424E38)
            goto L_0x0d30
        L_0x0cad:
            r2 = 2131886865(0x7f120311, float:1.940832E38)
            r1 = 2131886866(0x7f120312, float:1.9408323E38)
            goto L_0x0d30
        L_0x0cb4:
            r2 = 2131886913(0x7f120341, float:1.9408418E38)
            r1 = 2131886914(0x7f120342, float:1.940842E38)
            goto L_0x0d30
        L_0x0cbb:
            r2 = 2131886886(0x7f120326, float:1.9408364E38)
            r1 = 2131886887(0x7f120327, float:1.9408366E38)
            goto L_0x0d30
        L_0x0cc2:
            r2 = 2131886863(0x7f12030f, float:1.9408317E38)
            r1 = 2131886864(0x7f120310, float:1.9408319E38)
            goto L_0x0d30
        L_0x0cc9:
            r2 = 2131886911(0x7f12033f, float:1.9408414E38)
            r1 = 2131886912(0x7f120340, float:1.9408416E38)
            goto L_0x0d30
        L_0x0cd0:
            r2 = 2131886897(0x7f120331, float:1.9408386E38)
            r1 = 2131886900(0x7f120334, float:1.9408392E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886898(0x7f120332, float:1.9408388E38)
            r1 = 2131886899(0x7f120333, float:1.940839E38)
            goto L_0x0d30
        L_0x0cdf:
            r2 = 2131886909(0x7f12033d, float:1.940841E38)
            r1 = 2131886910(0x7f12033e, float:1.9408412E38)
            goto L_0x0d30
        L_0x0ce6:
            r2 = 2131886905(0x7f120339, float:1.9408402E38)
            r1 = 2131886908(0x7f12033c, float:1.9408408E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886906(0x7f12033a, float:1.9408404E38)
            r1 = 2131886907(0x7f12033b, float:1.9408406E38)
            goto L_0x0d30
        L_0x0cf5:
            r2 = 2131886857(0x7f120309, float:1.9408305E38)
            r1 = 2131886860(0x7f12030c, float:1.940831E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886858(0x7f12030a, float:1.9408307E38)
            r1 = 2131886859(0x7f12030b, float:1.9408309E38)
            goto L_0x0d30
        L_0x0d04:
            r2 = 2131886901(0x7f120335, float:1.9408394E38)
            r1 = 2131886904(0x7f120338, float:1.94084E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886902(0x7f120336, float:1.9408396E38)
            r1 = 2131886903(0x7f120337, float:1.9408398E38)
            goto L_0x0d30
        L_0x0d13:
            r2 = 2131886880(0x7f120320, float:1.9408351E38)
            r1 = 2131886883(0x7f120323, float:1.9408357E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886881(0x7f120321, float:1.9408353E38)
            r1 = 2131886882(0x7f120322, float:1.9408355E38)
            goto L_0x0d30
        L_0x0d22:
            r2 = 2131886853(0x7f120305, float:1.9408297E38)
            r1 = 2131886856(0x7f120308, float:1.9408303E38)
            if (r4 == 0) goto L_0x0d30
            r2 = 2131886854(0x7f120306, float:1.9408299E38)
            r1 = 2131886855(0x7f120307, float:1.94083E38)
        L_0x0d30:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            java.lang.String r15 = r5.A00(r2, r1, r0)
            return r15
        L_0x0d39:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886852(0x7f120304, float:1.9408295E38)
            goto L_0x0da0
        L_0x0d41:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886850(0x7f120302, float:1.940829E38)
            goto L_0x0da0
        L_0x0d49:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886851(0x7f120303, float:1.9408293E38)
            goto L_0x0da0
        L_0x0d51:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886879(0x7f12031f, float:1.940835E38)
            goto L_0x0da0
        L_0x0d59:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886878(0x7f12031e, float:1.9408347E38)
            goto L_0x0da0
        L_0x0d61:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886890(0x7f12032a, float:1.9408372E38)
            goto L_0x0da0
        L_0x0d69:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886869(0x7f120315, float:1.940833E38)
            goto L_0x0da0
        L_0x0d71:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886894(0x7f12032e, float:1.940838E38)
            goto L_0x0da0
        L_0x0d79:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886896(0x7f120330, float:1.9408384E38)
            goto L_0x0da0
        L_0x0d81:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886877(0x7f12031d, float:1.9408345E38)
            goto L_0x0da0
        L_0x0d89:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886876(0x7f12031c, float:1.9408343E38)
            goto L_0x0da0
        L_0x0d91:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886875(0x7f12031b, float:1.9408341E38)
            goto L_0x0da0
        L_0x0d99:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886874(0x7f12031a, float:1.940834E38)
        L_0x0da0:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            goto L_0x0db0
        L_0x0da3:
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131886895(0x7f12032f, float:1.9408382E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = X.C107555bV.A02(r6)
        L_0x0db0:
            java.lang.String r15 = X.C18320x8.A0b(r2, r6, r0, r3, r1)
            return r15
        L_0x0db5:
            X.2br r3 = r0.A0Q
            X.C626936e.A06(r2)
            X.4uZ r0 = r1.A0n()
            if (r0 != 0) goto L_0x0dc8
            r0 = 2131894645(0x7f122175, float:1.94241E38)
            java.lang.String r15 = r3.A00(r6, r0)
            return r15
        L_0x0dc8:
            X.2oU r0 = r3.A03
            android.content.Context r1 = r0.A00
            r0 = 2131894645(0x7f122175, float:1.94241E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x0dd4:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131890313(0x7f121089, float:1.9415314E38)
            if (r20 == 0) goto L_0x0ded
            r0 = 2131890312(0x7f121088, float:1.9415312E38)
            goto L_0x0ded
        L_0x0de1:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131890311(0x7f121087, float:1.941531E38)
            if (r20 == 0) goto L_0x0ded
            r0 = 2131890310(0x7f121086, float:1.9415308E38)
        L_0x0ded:
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0df2:
            boolean r2 = r1.A1v()
            if (r2 == 0) goto L_0x0e07
            X.4uZ r5 = r1.A0n()
            if (r5 == 0) goto L_0x0e07
            X.2sr r2 = r0.A03
            boolean r5 = r2.A0a(r5)
            r2 = 1
            if (r5 != 0) goto L_0x0e08
        L_0x0e07:
            r2 = 0
        L_0x0e08:
            r5 = 5
            if (r2 == 0) goto L_0x0e27
            if (r6 == 0) goto L_0x0e27
            X.3Ex r1 = r0.A07
            X.3ZH r1 = r1.A0A(r6)
            java.lang.String r5 = r0.A0C(r1, r5)
            r2 = 2131888107(0x7f1207eb, float:1.941084E38)
        L_0x0e1a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
        L_0x0e1e:
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r2, r1)
            return r15
        L_0x0e27:
            X.4uZ r2 = r1.A0n()
            if (r2 == 0) goto L_0x0e3c
            X.3Ex r1 = r0.A07
            X.3ZH r1 = r1.A0A(r2)
            java.lang.String r5 = r0.A0C(r1, r5)
            r2 = 2131886656(0x7f120240, float:1.9407897E38)
            if (r5 != 0) goto L_0x0e1a
        L_0x0e3c:
            r2 = 2131886655(0x7f12023f, float:1.9407895E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            goto L_0x0e1e
        L_0x0e42:
            X.1oW r1 = (X.C31581oW) r1
            int r4 = r1.A00
            boolean r3 = A06(r0, r1)
            java.util.Set r1 = r1.A03
            java.lang.String r15 = r0.A0S(r2, r1, r4, r3)
            return r15
        L_0x0e51:
            X.1oW r1 = (X.C31581oW) r1
            int r4 = r1.A00
            java.util.Set r3 = r1.A03
            boolean r1 = A06(r0, r1)
            java.lang.String r15 = r0.A0T(r2, r3, r4, r1)
            return r15
        L_0x0e60:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 2131890380(0x7f1210cc, float:1.941545E38)
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r1, r2)
            return r15
        L_0x0e6e:
            r4 = 2131887978(0x7f12076a, float:1.9410578E38)
            r3 = 2131755047(0x7f100027, float:1.9140962E38)
            r2 = 2131755046(0x7f100026, float:1.914096E38)
            java.lang.String r15 = r0.A0I(r1, r4, r3, r2)
            return r15
        L_0x0e7c:
            r4 = 2131887977(0x7f120769, float:1.9410576E38)
            r3 = 2131755045(0x7f100025, float:1.9140958E38)
            r2 = 2131755044(0x7f100024, float:1.9140956E38)
            java.lang.String r15 = r0.A0I(r1, r4, r3, r2)
            return r15
        L_0x0e8a:
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A07(r1)
            X.C626936e.A06(r2)
            X.2sr r1 = r0.A03
            boolean r1 = r1.A0a(r2)
            r1 = r1 ^ 1
            X.C626936e.A0C(r1)
            java.lang.String r2 = A02(r0, r2)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131889766(0x7f120e66, float:1.9414205E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x0eac:
            r2 = 2131889957(0x7f120f25, float:1.9414592E38)
            r3 = 2131889958(0x7f120f26, float:1.9414594E38)
            r4 = 2131889955(0x7f120f23, float:1.9414588E38)
            r5 = 2131889956(0x7f120f24, float:1.941459E38)
            r6 = 2131889758(0x7f120e5e, float:1.9414189E38)
            r7 = 2131889759(0x7f120e5f, float:1.941419E38)
            java.lang.String r15 = r0.A0J(r1, r2, r3, r4, r5, r6, r7)
            return r15
        L_0x0ec3:
            r2 = 2131889953(0x7f120f21, float:1.9414584E38)
            r3 = 2131889954(0x7f120f22, float:1.9414586E38)
            r4 = 2131889950(0x7f120f1e, float:1.9414578E38)
            r5 = 2131889952(0x7f120f20, float:1.9414582E38)
            r6 = 2131889949(0x7f120f1d, float:1.9414576E38)
            r7 = 2131889951(0x7f120f1f, float:1.941458E38)
            java.lang.String r15 = r0.A0J(r1, r2, r3, r4, r5, r6, r7)
            return r15
        L_0x0eda:
            if (r16 == 0) goto L_0x0ef2
        L_0x0edc:
            X.2Vj r1 = r0.A05
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0ef2
            X.2oU r0 = r0.A0A
            r1 = 2131887961(0x7f120759, float:1.9410544E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r1 = r0.getString(r1)
            return r1
        L_0x0ef2:
            X.2oU r0 = r0.A0A
            r1 = 2131889989(0x7f120f45, float:1.9414657E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r1 = r0.getString(r1)
            return r1
        L_0x0f00:
            X.2oU r5 = r0.A0A
            android.content.Context r9 = r5.A00
            X.1oU r1 = (X.C31561oU) r1
            java.lang.String r8 = r1.A00
            boolean r0 = A06(r0, r1)
            if (r0 == 0) goto L_0x0f29
            r10 = 0
        L_0x0f0f:
            r6 = 0
        L_0x0f10:
            boolean r1 = X.C107575bX.A0F(r8)
            r5 = r1 ^ 1
            int[][] r0 = A0Z
            r0 = r0[r10]
            r1 = r0[r1]
            if (r5 == 0) goto L_0x0f38
            if (r6 == 0) goto L_0x0f33
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r2
            java.lang.String r15 = X.AnonymousClass002.A0F(r9, r8, r0, r4, r1)
            return r15
        L_0x0f29:
            boolean r0 = X.C107575bX.A0F(r2)
            r10 = 2
            if (r0 != 0) goto L_0x0f0f
            r10 = 1
            r6 = 1
            goto L_0x0f10
        L_0x0f33:
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r9, r8, r4, r1)
            return r15
        L_0x0f38:
            if (r6 == 0) goto L_0x0f3f
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r9, r2, r4, r1)
            return r15
        L_0x0f3f:
            java.lang.String r15 = r9.getString(r1)
            return r15
        L_0x0f44:
            X.1p1 r1 = (X.C31891p1) r1
            java.lang.String r15 = r0.A0Q(r1)
            return r15
        L_0x0f4b:
            if (r16 == 0) goto L_0x0f58
            r3 = 2131887202(0x7f120462, float:1.9409004E38)
            r2 = 2131887204(0x7f120464, float:1.9409008E38)
            java.lang.String r15 = r0.A0H(r1, r3, r2)
            return r15
        L_0x0f58:
            r3 = 2131889918(0x7f120efe, float:1.9414513E38)
            r2 = 2131889922(0x7f120f02, float:1.9414521E38)
            java.lang.String r15 = r0.A0H(r1, r3, r2)
            return r15
        L_0x0f63:
            if (r16 == 0) goto L_0x0f70
            r3 = 2131887201(0x7f120461, float:1.9409002E38)
            r2 = 2131887203(0x7f120463, float:1.9409006E38)
            java.lang.String r15 = r0.A0H(r1, r3, r2)
            return r15
        L_0x0f70:
            r3 = 2131889917(0x7f120efd, float:1.9414511E38)
            r2 = 2131889921(0x7f120f01, float:1.941452E38)
            java.lang.String r15 = r0.A0H(r1, r3, r2)
            return r15
        L_0x0f7b:
            X.1oV r1 = (X.C31571oV) r1
            com.whatsapp.jid.GroupJid r3 = r1.A01
            X.2ss r2 = r0.A0C
            java.lang.String r5 = r2.A0D(r3)
            X.2oU r2 = r0.A0A
            android.content.Context r4 = r2.A00
            X.1fJ r3 = X.AnonymousClass2z0.A02(r1)
            X.C626936e.A06(r3)
            X.3Lq r2 = r0.A0J
            int r1 = r2.A03(r3)
            r0 = 4
            boolean r2 = r2.A0g(r3)
            if (r1 == r0) goto L_0x0fb0
            if (r5 == 0) goto L_0x102e
            r1 = 2131889763(0x7f120e63, float:1.9414199E38)
            if (r2 == 0) goto L_0x0fa7
            r1 = 2131889762(0x7f120e62, float:1.9414197E38)
        L_0x0fa7:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5)
            java.lang.String r15 = r4.getString(r1, r0)
            return r15
        L_0x0fb0:
            r0 = 2131889759(0x7f120e5f, float:1.941419E38)
            if (r2 == 0) goto L_0x1065
            goto L_0x1062
        L_0x0fb7:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131892652(0x7f1219ac, float:1.9420058E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0fc3:
            X.1oV r1 = (X.C31571oV) r1
            X.2oU r2 = r0.A0A
            android.content.Context r3 = r2.A00
            X.2ss r2 = r0.A0C
            com.whatsapp.jid.GroupJid r0 = r1.A01
            java.lang.String r2 = r2.A0D(r0)
            goto L_0x1080
        L_0x0fd3:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131892636(0x7f12199c, float:1.9420026E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x0fdf:
            X.1oW r1 = (X.C31581oW) r1
            java.lang.String r7 = r1.A1x()
            X.C626936e.A06(r7)
            java.util.Set r5 = r1.A03
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r5)
            int r5 = r6.size()
            if (r5 == r4) goto L_0x0ffe
            r3 = 0
        L_0x0ff5:
            boolean r1 = A06(r0, r1)
            java.lang.String r15 = r0.A0R(r2, r3, r7, r1)
            return r15
        L_0x0ffe:
            java.lang.Object r3 = r6.get(r3)
            X.2mC r3 = (X.C52882mC) r3
            java.lang.String r3 = r3.A03
            goto L_0x0ff5
        L_0x1007:
            X.1p0 r1 = (X.C31881p0) r1
            java.lang.String r3 = r1.A1y(r4)
            X.1fJ r2 = X.AnonymousClass2z0.A02(r1)
            X.3Lq r1 = r0.A0J
            boolean r2 = r1.A0g(r2)
            X.2oU r0 = r0.A0A
            android.content.Context r4 = r0.A00
            if (r3 == 0) goto L_0x102e
            r1 = 2131889763(0x7f120e63, float:1.9414199E38)
            if (r2 == 0) goto L_0x1025
            r1 = 2131889762(0x7f120e62, float:1.9414197E38)
        L_0x1025:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r3)
            java.lang.String r15 = r4.getString(r1, r0)
            return r15
        L_0x102e:
            r0 = 2131889765(0x7f120e65, float:1.9414203E38)
            if (r2 == 0) goto L_0x1065
            r0 = 2131889764(0x7f120e64, float:1.94142E38)
            goto L_0x1065
        L_0x1037:
            X.1p0 r1 = (X.C31881p0) r1
            java.lang.String r2 = r1.A1y(r4)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            if (r2 != 0) goto L_0x104b
            r0 = 2131889761(0x7f120e61, float:1.9414195E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x104b:
            r0 = 2131889760(0x7f120e60, float:1.9414193E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x1053:
            X.2oU r1 = r0.A0A
            android.content.Context r4 = r1.A00
            X.3Lq r0 = r0.A0J
            boolean r1 = r0.A0g(r9)
            r0 = 2131889759(0x7f120e5f, float:1.941419E38)
            if (r1 == 0) goto L_0x1065
        L_0x1062:
            r0 = 2131889758(0x7f120e5e, float:1.9414189E38)
        L_0x1065:
            java.lang.String r15 = r4.getString(r0)
            return r15
        L_0x106a:
            X.1p0 r1 = (X.C31881p0) r1
            X.2oU r2 = r0.A0A
            android.content.Context r3 = r2.A00
            X.2ss r2 = r0.A0C
            com.whatsapp.jid.GroupJid r0 = r1.A1x(r4)
            java.lang.String r2 = r2.A0D(r0)
            if (r2 != 0) goto L_0x108a
            java.lang.String r2 = r1.A1y(r4)
        L_0x1080:
            if (r2 != 0) goto L_0x108a
            r0 = 2131894232(0x7f121fd8, float:1.9423263E38)
            java.lang.String r15 = r3.getString(r0)
            return r15
        L_0x108a:
            r0 = 2131894231(0x7f121fd7, float:1.942326E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r3, r2, r4, r0)
            return r15
        L_0x1092:
            X.1p0 r1 = (X.C31881p0) r1
            java.lang.String r4 = r1.A1y(r4)
            r3 = 4
            java.lang.String r3 = r1.A1y(r3)
            boolean r1 = A06(r0, r1)
            java.lang.String r15 = r0.A0R(r2, r3, r4, r1)
            return r15
        L_0x10a6:
            X.1ov r1 = (X.C31831ov) r1
            java.util.List r3 = r1.A1z(r7)
            int r4 = r3.size()
            boolean r3 = A06(r0, r1)
            java.util.List r1 = r1.A20(r12)
            java.lang.String r15 = r0.A0S(r2, r1, r4, r3)
            return r15
        L_0x10bd:
            X.1ov r1 = (X.C31831ov) r1
            java.util.List r3 = r1.A1z(r7)
            int r5 = r3.size()
            boolean r3 = A06(r0, r1)
            java.util.List r1 = r1.A20(r4)
            java.lang.String r15 = r0.A0T(r2, r1, r5, r3)
            return r15
        L_0x10d4:
            X.1p0 r1 = (X.C31881p0) r1
            boolean r8 = A06(r0, r1)
            X.2oU r5 = r0.A0A
            android.content.Context r5 = r5.A00
            com.whatsapp.jid.GroupJid r6 = r1.A1x(r4)
            r4 = r0
            r7 = r2
            r9 = r3
            java.lang.String r15 = r4.A0B(r5, r6, r7, r8, r9)
            return r15
        L_0x10ea:
            X.1p0 r1 = (X.C31881p0) r1
            boolean r9 = A06(r0, r1)
            X.2oU r3 = r0.A0A
            android.content.Context r3 = r3.A00
            com.whatsapp.jid.GroupJid r7 = r1.A1x(r4)
            r5 = r0
            r6 = r3
            r8 = r2
            r10 = r4
            java.lang.String r15 = r5.A0B(r6, r7, r8, r9, r10)
            return r15
        L_0x1101:
            r5 = r1
            X.1p0 r5 = (X.C31881p0) r5
            X.2oU r3 = r0.A0A
            android.content.Context r8 = r3.A00
            boolean r3 = A06(r0, r1)
            com.whatsapp.jid.GroupJid r1 = r5.A1x(r4)
            X.2ss r0 = r0.A0C
            java.lang.String r6 = r0.A0D(r1)
            r5 = 0
            if (r3 == 0) goto L_0x112d
            r3 = 0
        L_0x111a:
            boolean r1 = X.C107575bX.A0F(r6)
            int[][] r0 = A0b
            r0 = r0[r3]
            r1 = r0[r1]
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r5] = r2
            java.lang.String r15 = X.AnonymousClass002.A0F(r8, r6, r0, r4, r1)
            return r15
        L_0x112d:
            boolean r0 = X.C107575bX.A0F(r2)
            int r3 = X.C18280x3.A00(r0)
            goto L_0x111a
        L_0x1136:
            X.1o5 r1 = (X.C31311o5) r1
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            long r5 = r1.A00
            r8.setTimeInMillis(r5)
            X.33j r2 = r0.A0B
            java.lang.String r8 = X.C107145am.A03(r2, r8)
            android.content.res.Resources r6 = A00(r0)
            r5 = 2131893321(0x7f121c49, float:1.9421415E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r0 = r1.A02
            r2[r3] = r0
            java.lang.String r15 = X.C18320x8.A0b(r6, r8, r2, r4, r5)
            return r15
        L_0x1159:
            X.2sr r1 = r0.A03
            boolean r1 = r1.A0a(r10)
            if (r1 == 0) goto L_0x1168
            X.2oU r0 = r0.A0A
            r1 = 2131892582(0x7f121966, float:1.9419916E38)
            goto L_0x1226
        L_0x1168:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x1175
            X.2oU r0 = r0.A0A
            r1 = 2131892581(0x7f121965, float:1.9419914E38)
            goto L_0x1226
        L_0x1175:
            X.2oU r5 = r0.A0A
            r1 = 2131892579(0x7f121963, float:1.941991E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r15 = X.C54292oU.A05(r5, r2, r0, r3, r1)
            return r15
        L_0x1181:
            X.1p1 r1 = (X.C31891p1) r1
            java.util.List r2 = r1.A01
            java.lang.Object r2 = r2.get(r3)
            X.C162457s7.A0D(r2)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A04(r2)
            X.2sr r2 = r0.A03
            boolean r2 = r2.A0a(r5)
            r2 = r2 ^ 1
            X.C626936e.A0C(r2)
            X.3Ex r2 = r0.A07
            X.3ZH r2 = r2.A0A(r5)
            X.5ZU r5 = r0.A08
            java.lang.String r6 = r5.A0H(r2)
            java.util.List r2 = r1.A01
            int r1 = r2.size()
            java.util.List r2 = r2.subList(r4, r1)
            r1 = -1
            java.lang.String r5 = r5.A0W(r2, r1)
            X.2oU r0 = r0.A0A
            android.content.Context r2 = r0.A00
            r1 = 2131894234(0x7f121fda, float:1.9423267E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r6
            java.lang.String r15 = X.AnonymousClass002.A0F(r2, r5, r0, r4, r1)
            return r15
        L_0x11c8:
            X.2oU r2 = r0.A0A
            android.content.Context r9 = r2.A00
            X.3Ex r5 = r0.A07
            X.5ZU r8 = r0.A08
            com.whatsapp.jid.UserJid r2 = r1.A0o()
            if (r2 != 0) goto L_0x120b
            r2 = 2131888111(0x7f1207ef, float:1.9410848E38)
            java.lang.String r8 = r9.getString(r2)
        L_0x11dd:
            X.2sr r2 = r0.A03
            com.whatsapp.jid.UserJid r0 = r1.A0o()
            boolean r0 = r2.A0a(r0)
            android.content.res.Resources r6 = r9.getResources()
            if (r0 == 0) goto L_0x11fd
            r5 = 2131893299(0x7f121c33, float:1.942137E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r0 = r1.A18()
            r2[r3] = r0
        L_0x11f8:
            java.lang.String r15 = r6.getString(r5, r2)
            return r15
        L_0x11fd:
            r5 = 2131893298(0x7f121c32, float:1.9421369E38)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r3] = r8
            java.lang.String r0 = r1.A18()
            r2[r4] = r0
            goto L_0x11f8
        L_0x120b:
            X.3ZH r5 = r5.A0A(r2)
            int r2 = r8.A0A(r6)
            java.lang.String r8 = r8.A0P(r5, r2)
            goto L_0x11dd
        L_0x1218:
            boolean r2 = A06(r0, r1)
            X.2oU r0 = r0.A0A
            r1 = 2131893247(0x7f121bff, float:1.9421265E38)
            if (r2 == 0) goto L_0x1226
            r1 = 2131893246(0x7f121bfe, float:1.9421263E38)
        L_0x1226:
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x122f:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 2131889026(0x7f120b82, float:1.9412704E38)
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r1, r2)
            return r15
        L_0x123d:
            java.lang.String r15 = r0.A0M(r1, r2, r4, r11)
            return r15
        L_0x1242:
            X.2oU r1 = r0.A0A
            android.content.Context r5 = r1.A00
            r3 = 2131894233(0x7f121fd9, float:1.9423265E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.5ZU r1 = r0.A08
            X.3Ex r0 = r0.A07
            X.C626936e.A06(r6)
            X.C64773Ex.A01(r0, r1, r6, r2)
            java.lang.String r15 = r5.getString(r3, r2)
            return r15
        L_0x125a:
            X.5ZU r5 = r0.A08
            X.3Ex r2 = r0.A07
            X.3ZH r2 = X.C64773Ex.A00(r2, r6)
            java.lang.String r6 = r5.A0H(r2)
            java.lang.String r1 = r1.A13()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            X.2oU r0 = r0.A0A
            if (r1 == 0) goto L_0x127c
            android.content.Context r1 = r0.A00
            r0 = 2131894242(0x7f121fe2, float:1.9423283E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r6, r4, r0)
            return r15
        L_0x127c:
            android.content.Context r5 = r0.A00
            r2 = 2131894243(0x7f121fe3, float:1.9423285E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r3] = r6
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r15 = X.AnonymousClass002.A0F(r5, r0, r1, r4, r2)
            return r15
        L_0x1291:
            r5 = 1
            goto L_0x1294
        L_0x1293:
            r5 = 0
        L_0x1294:
            if (r9 == 0) goto L_0x12a9
            X.2so r1 = r0.A06
            X.1fJ r2 = r1.A01(r9)
            if (r2 == 0) goto L_0x12a9
            if (r20 == 0) goto L_0x12a9
            X.2sj r1 = r0.A0D
            boolean r1 = r1.A0D(r2)
            if (r1 == 0) goto L_0x12a9
            r4 = 0
        L_0x12a9:
            X.1VX r1 = r0.A0H
            boolean r1 = X.C56952sp.A0D(r1)
            if (r1 == 0) goto L_0x12c2
            int[][] r1 = A0U
        L_0x12b3:
            r1 = r1[r5]
            r2 = r1[r4]
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r2, r1)
            return r15
        L_0x12c2:
            int[][] r1 = A0T
            goto L_0x12b3
        L_0x12c5:
            r2 = 2131893497(0x7f121cf9, float:1.9421772E38)
            r3 = 2131893495(0x7f121cf7, float:1.9421768E38)
            r4 = 2131893499(0x7f121cfb, float:1.9421776E38)
            r5 = 2131893498(0x7f121cfa, float:1.9421774E38)
            r6 = 2131893496(0x7f121cf8, float:1.942177E38)
            r7 = 2131893500(0x7f121cfc, float:1.9421778E38)
            java.lang.String r15 = r0.A0K(r1, r2, r3, r4, r5, r6, r7)
            return r15
        L_0x12dc:
            r2 = 2131893491(0x7f121cf3, float:1.942176E38)
            r3 = 2131893489(0x7f121cf1, float:1.9421756E38)
            r4 = 2131893493(0x7f121cf5, float:1.9421764E38)
            r5 = 2131893492(0x7f121cf4, float:1.9421762E38)
            r6 = 2131893490(0x7f121cf2, float:1.9421758E38)
            r7 = 2131893494(0x7f121cf6, float:1.9421766E38)
            java.lang.String r15 = r0.A0K(r1, r2, r3, r4, r5, r6, r7)
            return r15
        L_0x12f3:
            X.C626936e.A06(r6)
            X.2ss r5 = r0.A0C
            boolean r5 = r5.A0N(r6)
            if (r5 == 0) goto L_0x1317
            X.2oU r5 = r0.A0A
            android.content.Context r8 = r5.A00
            r6 = 2131894147(0x7f121f83, float:1.942309E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r3] = r2
            X.33j r2 = r0.A0B
            java.lang.String r0 = r1.A13()
            X.C620733j.A03(r2, r0, r5, r4)
            java.lang.String r15 = r8.getString(r6, r5)
            return r15
        L_0x1317:
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A07(r1)
            X.C626936e.A06(r3)
            X.2sr r1 = r0.A03
            boolean r1 = r1.A0a(r3)
            r1 = r1 ^ 1
            X.C626936e.A0C(r1)
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131894145(0x7f121f81, float:1.9423087E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x1335:
            X.2oU r2 = r0.A0A
            X.C162457s7.A0J(r2, r4)
            r0 = 147(0x93, float:2.06E-43)
            r1 = 2131895442(0x7f122492, float:1.9425717E38)
            if (r14 != r0) goto L_0x1344
            r1 = 2131895441(0x7f122491, float:1.9425715E38)
        L_0x1344:
            android.content.res.Resources r0 = X.C54292oU.A00(r2)
            java.lang.String r15 = r0.getString(r1)
            X.C162457s7.A0H(r15)
            return r15
        L_0x1350:
            if (r20 == 0) goto L_0x13a6
            X.2oU r0 = r0.A0A
            r1 = 2131893231(0x7f121bef, float:1.9421233E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x1360:
            if (r20 == 0) goto L_0x13a6
            java.lang.String r5 = r1.A0y
            java.lang.String r1 = "linked_group_join"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x1396
            java.lang.String r1 = "invite"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x1396
            java.lang.String r1 = "general_chat_auto_add"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x138a
            X.2oU r5 = r0.A0A
            r1 = 2131893228(0x7f121bec, float:1.9421227E38)
        L_0x1381:
            android.content.res.Resources r0 = X.C54292oU.A00(r5)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x138a:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            X.2oU r5 = r0.A0A
            if (r1 == 0) goto L_0x139c
            r1 = 2131893230(0x7f121bee, float:1.942123E38)
            goto L_0x1381
        L_0x1396:
            X.2oU r5 = r0.A0A
            r1 = 2131893233(0x7f121bf1, float:1.9421237E38)
            goto L_0x1381
        L_0x139c:
            r1 = 2131893229(0x7f121bed, float:1.9421229E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r15 = X.C54292oU.A05(r5, r2, r0, r3, r1)
            return r15
        L_0x13a6:
            X.1oz r1 = (X.C31871oz) r1
            java.lang.String r15 = r0.A0P(r1)
            X.C626936e.A06(r15)
            return r15
        L_0x13b0:
            int[][] r8 = A0X
            goto L_0x13b5
        L_0x13b3:
            int[][] r8 = A0W
        L_0x13b5:
            X.33j r5 = r0.A0B
            java.lang.String r2 = r0.A0F(r1)
            java.lang.String r7 = r5.A0H(r2)
            X.2sj r2 = r0.A0D
            X.1VX r6 = r0.A0H
            if (r9 == 0) goto L_0x13d6
            boolean r2 = r2.A0D(r9)
            if (r2 == 0) goto L_0x13d6
            r5 = 5191(0x1447, float:7.274E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r2 = r6.A0Y(r2, r5)
            r5 = 1
            if (r2 != 0) goto L_0x13d7
        L_0x13d6:
            r5 = 0
        L_0x13d7:
            X.2sr r2 = r0.A03
            boolean r2 = X.C627636p.A0Q(r2, r1)
            r1 = 2
            if (r2 != 0) goto L_0x13f4
            r1 = 1
            if (r7 == 0) goto L_0x13f4
            r1 = r8[r3]
            r2 = r1[r5]
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r2, r1)
            return r15
        L_0x13f4:
            r1 = r8[r1]
            r2 = r1[r5]
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r2, r1)
            return r15
        L_0x1403:
            java.lang.String r5 = r1.A13()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x141b
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 2131889640(0x7f120de8, float:1.941395E38)
        L_0x1412:
            X.2oU r0 = r0.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r15 = r0.getString(r1, r2)
            return r15
        L_0x141b:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r5
            r1 = 2131889639(0x7f120de7, float:1.9413947E38)
            goto L_0x1412
        L_0x1423:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131890809(0x7f121279, float:1.941632E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x142f:
            android.content.res.Resources r1 = A00(r0)
            r0 = 2131888408(0x7f120918, float:1.941145E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x143b:
            X.1nx r1 = (X.C31231nx) r1
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r5 = r1.A01
            r2.setTimeInMillis(r5)
            X.33j r8 = r0.A0B
            java.lang.String r6 = X.C107145am.A03(r8, r2)
            long r1 = r1.A01
            java.lang.String r5 = X.C107505bQ.A02(r8, r1)
            X.2sH r1 = r0.A09
            long r1 = r1.A0H()
            java.lang.String r1 = X.C107505bQ.A02(r8, r1)
            boolean r1 = r5.equals(r1)
            android.content.res.Resources r2 = A00(r0)
            if (r1 == 0) goto L_0x1472
            r1 = 2131896150(0x7f122756, float:1.9427153E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
        L_0x146d:
            java.lang.String r15 = r2.getString(r1, r0)
            return r15
        L_0x1472:
            r1 = 2131896149(0x7f122755, float:1.9427151E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r6
            r0[r4] = r5
            goto L_0x146d
        L_0x147c:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131896144(0x7f122750, float:1.942714E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x1488:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131896147(0x7f122753, float:1.9427147E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x1494:
            X.1ns r1 = (X.C31181ns) r1
            java.lang.String r6 = r1.A01
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x14b4
            java.lang.String r5 = r1.A00
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x14b4
            X.2oU r2 = r0.A0A
            r1 = 2131894920(0x7f122288, float:1.9424658E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r3] = r6
            java.lang.String r15 = X.C54292oU.A05(r2, r5, r0, r4, r1)
            return r15
        L_0x14b4:
            X.2oU r0 = r0.A0A
            r1 = 2131894921(0x7f122289, float:1.942466E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x14c2:
            r0 = 2131892562(0x7f121952, float:1.9419876E38)
            java.lang.String r15 = r1.getString(r0)
            return r15
        L_0x14ca:
            if (r3 == 0) goto L_0x14d4
            r0 = 2131892570(0x7f12195a, float:1.9419892E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x14d4:
            r0 = 2131892561(0x7f121951, float:1.9419874E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r2, r4, r0)
            return r15
        L_0x14dc:
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            r0 = 2131889979(0x7f120f3b, float:1.9414637E38)
            java.lang.String r15 = X.AnonymousClass0x2.A0X(r1, r10, r4, r0)
            return r15
        L_0x14e8:
            android.content.res.Resources r6 = A00(r0)
            int r2 = r3.A00
            if (r2 != r7) goto L_0x1505
            r5 = 2131895196(0x7f12239c, float:1.9425218E38)
        L_0x14f3:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.5ZU r3 = r0.A08
            X.3Ex r2 = r0.A07
            X.4uZ r0 = r1.A0n()
            X.C64773Ex.A01(r2, r3, r0, r4)
            java.lang.String r1 = r6.getString(r5, r4)
            return r1
        L_0x1505:
            boolean r2 = r3.A02
            r5 = 2131890475(0x7f12112b, float:1.9415643E38)
            if (r2 == 0) goto L_0x14f3
            r5 = 2131890473(0x7f121129, float:1.9415639E38)
            goto L_0x14f3
        L_0x1510:
            r1 = 2131887618(0x7f120602, float:1.9409848E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r6)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x151c:
            X.2oU r2 = r0.A0A
            r1 = 2131893241(0x7f121bf9, float:1.9421253E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = X.C54292oU.A05(r2, r5, r0, r3, r1)
            return r1
        L_0x1528:
            X.2oU r0 = r0.A0A
            r1 = 2131893247(0x7f121bff, float:1.9421265E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)
            java.lang.String r15 = r0.getString(r1)
            return r15
        L_0x1536:
            java.lang.String r15 = r0.A0G(r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625735q.A0O(X.1mI, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (X.C56972sr.A0B(r11.A03, r8) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 == null) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0Q(X.C31891p1 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C31801os
            r5 = 0
            if (r0 == 0) goto L_0x0065
            X.2ss r2 = r11.A0C
            r1 = r12
            X.1p0 r1 = (X.C31881p0) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r0 = r1.A1x(r0)
            java.lang.String r2 = r2.A0D(r0)
            if (r2 != 0) goto L_0x001a
        L_0x0015:
            r0 = 1
            java.lang.String r2 = r1.A1y(r0)
        L_0x001a:
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A07(r12)
            java.util.List r8 = r12.A01
            if (r1 == 0) goto L_0x0063
            java.lang.String r5 = A02(r11, r1)
            X.2sr r0 = r11.A03
            boolean r9 = r0.A0a(r1)
        L_0x002c:
            X.3Lq r0 = r11.A0J
            X.2rN r0 = r0.A1B
            boolean r10 = r0.A01()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r6 = 1
            r3 = r0 ^ 1
            int r0 = r8.size()
            r7 = 0
            if (r0 != r6) goto L_0x004f
            X.2sr r0 = r11.A03
            boolean r0 = X.C56972sr.A0B(r0, r8)
            r1 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r9 == 0) goto L_0x0079
            X.2oU r0 = r11.A0A
            android.content.Context r2 = r0.A00
            r1 = 2131889910(0x7f120ef6, float:1.9414497E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            A04(r11, r8, r0)
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x0063:
            r9 = 0
            goto L_0x002c
        L_0x0065:
            boolean r0 = r12 instanceof X.C31561oU
            if (r0 == 0) goto L_0x006f
            r0 = r12
            X.1oU r0 = (X.C31561oU) r0
            java.lang.String r2 = r0.A00
            goto L_0x001a
        L_0x006f:
            boolean r0 = r12 instanceof X.C31441oI
            if (r0 == 0) goto L_0x0077
            r1 = r12
            X.1p0 r1 = (X.C31881p0) r1
            goto L_0x0015
        L_0x0077:
            r2 = r5
            goto L_0x001a
        L_0x0079:
            if (r3 == 0) goto L_0x00b6
            r9 = 2
            X.2oU r0 = r11.A0A
            if (r1 == 0) goto L_0x009d
            if (r10 != 0) goto L_0x008c
            android.content.Context r1 = r0.A00
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r5, r6, r0)
            return r0
        L_0x008c:
            android.content.Context r3 = r0.A00
            int[][] r0 = A0c
            r0 = r0[r6]
            r1 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r5
            java.lang.String r0 = X.AnonymousClass002.A0F(r3, r2, r0, r6, r1)
            return r0
        L_0x009d:
            android.content.Context r4 = r0.A00
            r3 = 2131889909(0x7f120ef5, float:1.9414495E38)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r7] = r5
            X.33j r1 = r11.A0B
            X.5ZU r0 = r11.A08
            java.lang.String r0 = r0.A0W(r8, r6)
            X.C620733j.A03(r1, r0, r2, r6)
            java.lang.String r0 = r4.getString(r3, r2)
            return r0
        L_0x00b6:
            X.2oU r0 = r11.A0A
            if (r1 == 0) goto L_0x00d1
            android.content.Context r1 = r0.A00
            if (r10 != 0) goto L_0x00c6
            r0 = 2131889978(0x7f120f3a, float:1.9414635E38)
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x00c6:
            int[][] r0 = A0c
            r0 = r0[r7]
            r0 = r0[r4]
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r6, r0)
            return r0
        L_0x00d1:
            android.content.res.Resources r5 = X.C54292oU.A00(r0)
            r4 = 2131755143(0x7f100087, float:1.9141157E38)
            int r3 = r8.size()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.33j r1 = r11.A0B
            X.5ZU r0 = r11.A08
            java.lang.String r0 = r0.A0W(r8, r6)
            X.C620733j.A03(r1, r0, r2, r7)
            java.lang.String r0 = r5.getQuantityString(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625735q.A0Q(X.1p1):java.lang.String");
    }

    public String A0R(String str, String str2, String str3, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        if (str3 == null) {
            return this.A0A.A00.getString(R.string.f11nameremoved);
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        Context context = this.A0A.A00;
        if (isEmpty) {
            if (z) {
                i = R.string.f11nameremoved;
            } else if (str == null) {
                i = R.string.f11nameremoved;
            } else {
                i2 = R.string.f11nameremoved;
                objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = str3;
            }
            objArr = new Object[]{str3};
        } else {
            if (z) {
                i2 = R.string.f11nameremoved;
            } else if (str == null) {
                i2 = R.string.f11nameremoved;
            } else {
                i = R.string.f11nameremoved;
                objArr = AnonymousClass0x9.A1X();
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = str3;
            }
            objArr = new Object[2];
            objArr[0] = str2;
            objArr[1] = str3;
        }
        return context.getString(i, objArr);
    }

    public final String A0T(String str, Collection collection, int i, boolean z) {
        char c;
        if (z) {
            c = 0;
        } else {
            c = 1;
            if (str == null) {
                c = 2;
            }
        }
        List A032 = A03(collection, 1);
        if (A032.size() < 1) {
            Resources A002 = A00(this);
            int i2 = A0h[0][c];
            Object[] objArr = new Object[2];
            AnonymousClass000.A1P(objArr, i, 0);
            objArr[1] = str;
            return A002.getQuantityString(i2, i, objArr);
        } else if (i == 1) {
            Context context = this.A0A.A00;
            int i3 = A0h[1][c];
            Object[] objArr2 = new Object[2];
            objArr2[0] = A032.get(0);
            return AnonymousClass002.A0F(context, str, objArr2, 1, i3);
        } else {
            Resources A003 = A00(this);
            int i4 = A0h[2][c];
            int i5 = i - 1;
            Object[] A1X = AnonymousClass0x9.A1X();
            A1X[0] = A032.get(0);
            AnonymousClass000.A1P(A1X, i5, 1);
            A1X[2] = str;
            return A003.getQuantityString(i4, i5, A1X);
        }
    }

    public C625735q(C116985rC r2, C116985rC r3, C116985rC r4, C56972sr r5, AnonymousClass25D r6, C44272Vj r7, C56942so r8, C64773Ex r9, AnonymousClass5ZU r10, C56612sH r11, C54292oU r12, C620733j r13, C56982ss r14, C56892sj r15, C56662sM r16, AnonymousClass2R8 r17, C49522gf r18, AnonymousClass1VX r19, AnonymousClass3LP r20, C66493Lq r21, C52472lX r22, C53202mi r23, AnonymousClass2YV r24, C196439aq r25, C56072rN r26, C186998wH r27, C46572br r28) {
        this.A09 = r11;
        this.A0H = r19;
        this.A03 = r5;
        this.A0A = r12;
        this.A0C = r14;
        this.A02 = r2;
        this.A0I = r20;
        this.A0P = r27;
        this.A07 = r9;
        this.A08 = r10;
        this.A0B = r13;
        this.A0O = r26;
        this.A0J = r21;
        this.A0E = r16;
        this.A0K = r22;
        this.A0L = r23;
        this.A0F = r17;
        this.A00 = r3;
        this.A06 = r8;
        this.A0N = r25;
        this.A05 = r7;
        this.A0D = r15;
        this.A0G = r18;
        this.A0M = r24;
        this.A04 = r6;
        this.A0Q = r28;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r3 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.util.List r4, int r5) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r0 = r4.size()
            r1 = 3
            if (r0 >= r1) goto L_0x0010
            r0 = 0
            r4.add(r0)
            goto L_0x0004
        L_0x0010:
            r0 = 1
            r2 = 0
            if (r5 < r0) goto L_0x003f
            if (r3 >= r1) goto L_0x001a
            if (r3 != r5) goto L_0x003f
            if (r3 == r0) goto L_0x0028
        L_0x001a:
            r0 = 2
            if (r3 == r0) goto L_0x0028
            if (r5 != r1) goto L_0x0031
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.util.Pair r0 = X.C18290x4.A0K(r0, r2)
            return r0
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x003a
        L_0x0031:
            java.lang.Integer r1 = X.C18290x4.A0b()
            int r5 = r5 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x003a:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            return r0
        L_0x003f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625735q.A01(java.util.List, int):android.util.Pair");
    }

    public static List A03(Collection collection, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection.iterator();
        while (it.hasNext() && A0s.size() < i) {
            String str = AnonymousClass0x7.A0O(it).A03;
            if (!TextUtils.isEmpty(str)) {
                A0s.add(str);
            }
        }
        return A0s;
    }

    public String A0F(C624134x r5) {
        UserJid A072 = AnonymousClass32Y.A07(r5);
        if (A072 == null) {
            return null;
        }
        return this.A08.A0R(this.A07.A0A(A072), 1, false);
    }

    public final String A0H(C30341mI r4, int i, int i2) {
        Context context;
        UserJid A072 = AnonymousClass32Y.A07(r4);
        C27991fJ A022 = AnonymousClass2z0.A02(r4);
        if (A072 == null) {
            C56892sj r0 = this.A0D;
            C626936e.A06(A022);
            boolean A0D2 = r0.A0D(A022);
            context = this.A0A.A00;
            i = R.string.f11nameremoved;
            if (A0D2) {
                i = R.string.f11nameremoved;
            }
        } else if (this.A03.A0a(A072)) {
            context = this.A0A.A00;
        } else {
            return this.A0A.A00.getString(i2, AnonymousClass000.A1b(A02(this, A072)));
        }
        return context.getString(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.A0J.A0g(r1) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0J(X.C30341mI r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A07(r6)
            X.1fJ r1 = X.AnonymousClass2z0.A02(r6)
            r3 = 1
            if (r1 == 0) goto L_0x0014
            X.3Lq r0 = r5.A0J
            boolean r0 = r0.A0g(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            X.2sr r0 = r5.A03
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x0029
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            if (r2 != 0) goto L_0x0024
            r7 = r8
        L_0x0024:
            java.lang.String r0 = r0.getString(r7)
            return r0
        L_0x0029:
            if (r4 == 0) goto L_0x003b
            java.lang.String r1 = A02(r5, r4)
            if (r2 != 0) goto L_0x0032
            r9 = r10
        L_0x0032:
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r0, r1, r3, r9)
            return r0
        L_0x003b:
            if (r2 != 0) goto L_0x003e
            r11 = r12
        L_0x003e:
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625735q.A0J(X.1mI, int, int, int, int, int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.A0J.A0h(r1) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0K(X.C30341mI r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A07(r6)
            X.1fJ r1 = X.AnonymousClass2z0.A02(r6)
            r3 = 1
            if (r1 == 0) goto L_0x0014
            X.3Lq r0 = r5.A0J
            boolean r0 = r0.A0h(r1)
            r2 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            X.2sr r0 = r5.A03
            boolean r0 = r0.A0a(r4)
            if (r0 == 0) goto L_0x0029
            if (r2 != 0) goto L_0x0020
            r7 = r10
        L_0x0020:
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r7)
            return r0
        L_0x0029:
            if (r4 == 0) goto L_0x003b
            java.lang.String r1 = A02(r5, r4)
            if (r2 != 0) goto L_0x0032
            r8 = r11
        L_0x0032:
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r0, r1, r3, r8)
            return r0
        L_0x003b:
            if (r2 != 0) goto L_0x003e
            r9 = r12
        L_0x003e:
            X.2oU r0 = r5.A0A
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C625735q.A0K(X.1mI, int, int, int, int, int, int):java.lang.String");
    }

    public final String A0M(C30341mI r7, String str, int i, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        boolean z2 = false;
        boolean z3 = true;
        boolean A1X = AnonymousClass000.A1X(r7.A13());
        if (A06(this, r7)) {
            if (i == 1) {
                z2 = true;
            }
            iArr = A0e[!z2];
            if (A1X) {
                i2 = iArr[0];
            } else {
                if (z) {
                    i2 = iArr[1];
                }
                i2 = iArr[2];
            }
        } else if (r7.A0n() == null) {
            if (i != 1) {
                z3 = false;
            }
            iArr = A0i[!z3];
            if (A1X) {
                i2 = iArr[0];
            } else {
                if (z) {
                    i2 = iArr[1];
                }
                i2 = iArr[2];
            }
        } else {
            int[] iArr2 = A0d[!AnonymousClass000.A1U(i, 1)];
            if (A1X) {
                i3 = iArr2[0];
            } else if (z) {
                i3 = iArr2[1];
            } else {
                i3 = iArr2[2];
            }
            return AnonymousClass0x2.A0X(this.A0A.A00, str, 1, i3);
        }
        return this.A0A.A00.getString(i2);
    }

    public String A0P(C31871oz r8) {
        String str;
        int[] iArr;
        C95814uZ A0n = r8.A0n();
        if (A0n != null) {
            str = A02(this, A0n);
        } else {
            str = null;
        }
        C56982ss r2 = this.A0C;
        String A0D2 = r2.A0D(r8.A1x(1));
        if (A0D2 == null) {
            A0D2 = r8.A1y(1);
        }
        int i = r8.A00;
        if (i == 124 || i == 123 || i == 144 || i == 125) {
            return C54292oU.A00(this.A0A).getString(R.string.f11nameremoved);
        }
        if (i == 122) {
            return C54292oU.A00(this.A0A).getString(R.string.f11nameremoved);
        }
        if (i == 126) {
            C54292oU r0 = this.A0A;
            if (A0D2 == null) {
                return C54292oU.A00(r0).getString(R.string.f11nameremoved);
            }
            return C54292oU.A00(r0).getString(R.string.f11nameremoved, AnonymousClass000.A1b(A0D2));
        } else if (i == 127) {
            char c = 0;
            char c2 = 1;
            if (str != null) {
                c2 = 0;
            }
            if (A0D2 == null) {
                c = 1;
            }
            int i2 = A0Y[c2][c];
            C54292oU r02 = this.A0A;
            Object[] A0M2 = AnonymousClass002.A0M();
            AnonymousClass000.A16(str, A0D2, A0M2);
            return C54292oU.A00(r02).getString(i2, A0M2);
        } else if (i == 128) {
            char c3 = 0;
            if (this.A03.A0a(A0n)) {
                if (A0D2 == null) {
                    c3 = 1;
                }
                iArr = A0R;
            } else {
                char c4 = 1;
                if (str != null) {
                    c4 = 0;
                }
                if (A0D2 == null) {
                    c3 = 1;
                }
                iArr = A0V[c4];
            }
            int i3 = iArr[c3];
            C54292oU r03 = this.A0A;
            Object[] A0M3 = AnonymousClass002.A0M();
            AnonymousClass000.A16(str, A0D2, A0M3);
            return C54292oU.A00(r03).getString(i3, A0M3);
        } else if (i == 139) {
            return C54292oU.A00(this.A0A).getString(R.string.f11nameremoved);
        } else {
            if (i == 143) {
                GroupJid A1x = r8.A1x(2);
                String A1y = r8.A1y(2);
                String A0D3 = r2.A0D(A1x);
                if (A0D3 != null) {
                    A1y = A0D3;
                }
                return C54292oU.A05(this.A0A, A1y, new Object[1], 0, R.string.f11nameremoved);
            } else if (i != 148 && i != 149) {
                return null;
            } else {
                String A1y2 = r8.A1y(2);
                C54292oU r3 = this.A0A;
                Object[] objArr = new Object[1];
                C620733j.A03(this.A0B, A1y2, objArr, 0);
                return C54292oU.A00(r3).getString(R.string.f11nameremoved, objArr);
            }
        }
    }
}
