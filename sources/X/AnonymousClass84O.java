package X;

import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.84O  reason: invalid class name */
public class AnonymousClass84O implements C180488l9 {
    public static final C181398mh A08 = new C170278Co();
    public int A00;
    public Set A01;
    public final int A02;
    public final int A03;
    public final SparseArray A04;
    public final AnonymousClass84O A05;
    public final LinkedList A06;
    public final List A07;

    public static float A00(C153427bI r5, String str, String str2) {
        if (str != null) {
            try {
                return C162407s0.A01(str);
            } catch (AnonymousClass6u2 e) {
                Object[] A0M = AnonymousClass002.A0M();
                AnonymousClass000.A16(str2, str, A0M);
                C159737mN.A00(r5, "BKBloksComponentsRichTextBinderUtil", String.format("Error parsing %s: %s", A0M), e);
            }
        }
        return 0.0f;
    }

    public static int[] A0A(View view, int i, int i2) {
        view.measure(i, i2);
        int[] iArr = new int[2];
        iArr[0] = view.getMeasuredWidth();
        return iArr;
    }

    public C835248t A0L(int i) {
        int i2 = i;
        Object A052 = A05(this, i);
        if (A052 == null) {
            return null;
        }
        if (A052 instanceof C156077fz) {
            C156077fz r4 = (C156077fz) A052;
            List list = this.A07;
            r4.getClass();
            return new AnonymousClass8DF(r4, (AnonymousClass7KA) null, list);
        } else if (A052 instanceof C835248t) {
            return (C835248t) A052;
        } else {
            if (A052 instanceof C155787fV) {
                return ((C155787fV) A052).A00;
            }
            String str = (String) A052;
            C162457s7.A0J(str, 2);
            return new AnonymousClass8DF(new C156077fz(str, (String) A05(this, 128), this.A02, this.A03, i2), (AnonymousClass7KA) null, this.A07);
        }
    }

    public void A0U(C181388mg r5) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            if (i < sparseArray.size()) {
                Object valueAt = sparseArray.valueAt(i);
                if (valueAt != null) {
                    r5.BsH(sparseArray.keyAt(i), valueAt);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static Uri A02(AnonymousClass84O r1) {
        String A0O = r1.A0O(38);
        if (A0O != null) {
            return Uri.parse(A0O);
        }
        return null;
    }

    public static Object A05(AnonymousClass84O r0, int i) {
        return r0.A04.get(i);
    }

    public static String A06(AnonymousClass84O r1) {
        return r1.A0O(35);
    }

    public static String A07(AnonymousClass84O r1) {
        return r1.A0O(36);
    }

    public static String A08(AnonymousClass84O r1) {
        return r1.A0O(40);
    }

    public int A0C() {
        return this.A02;
    }

    public int A0D() {
        return this.A03;
    }

    public View A0G(C153427bI r3) {
        if (r3 == null) {
            return null;
        }
        return ((C146737Bk) r3.A03(A08, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (A0B(145, 0.0f) != 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r6.A04 == X.C141236vF.A02) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C161797qU A0H(X.C161797qU r6, X.C153427bI r7) {
        /*
            r5 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A0B(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r5.A0B(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r5.A0B(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r5.A0B(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r5.A0B(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r5.A0B(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r3 = r5.A0S(r0)
            if (r4 != 0) goto L_0x0058
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0057
            X.6vF r1 = r6.A04
            X.6vF r0 = X.C141236vF.VIEW
            if (r1 == r0) goto L_0x0096
        L_0x0057:
            return r6
        L_0x0058:
            if (r6 != 0) goto L_0x0096
            int r0 = r5.A02
            long r1 = (long) r0
            boolean r0 = X.C162377rs.A0B(r7)
            X.6ND r6 = new X.6ND
            r6.<init>(r7, r1, r0)
        L_0x0066:
            r1 = 2131427975(0x7f0b0287, float:1.8477581E38)
            X.8mh r0 = A08
            java.lang.Object r1 = r7.A03(r0, r5, r1)
            X.7Bk r1 = (X.C146737Bk) r1
            X.84l r0 = new X.84l
            r0.<init>(r1)
            X.C157267i1.A00(r0, r6)
            if (r4 == 0) goto L_0x0083
            X.84k r0 = new X.84k
            r0.<init>(r5)
            X.C157267i1.A00(r0, r6)
        L_0x0083:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            X.84r r0 = new X.84r
            r0.<init>(r7, r5, r1)
            X.C157267i1.A00(r0, r6)
            return r6
        L_0x0096:
            X.6vF r1 = r6.A04
            X.6vF r0 = X.C141236vF.DRAWABLE
            if (r1 != r0) goto L_0x0066
            java.lang.String r0 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84O.A0H(X.7qU, X.7bI):X.7qU");
    }

    public AnonymousClass84O A0I() {
        return A0K(132);
    }

    /* renamed from: A0J */
    public AnonymousClass84O A0K(int i) {
        SparseArray sparseArray = this.A04;
        Object obj = sparseArray.get(i);
        if (obj instanceof List) {
            List A0R = A0R(i);
            if (!A0R.isEmpty()) {
                return (AnonymousClass84O) C18290x4.A0k(A0R);
            }
            return null;
        } else if (obj instanceof AnonymousClass84O) {
            return (AnonymousClass84O) sparseArray.get(i);
        } else {
            return null;
        }
    }

    public Object A0M() {
        return A05(this, 43);
    }

    public String A0N() {
        Object A052 = A05(this, 33);
        if (A052 == null) {
            return null;
        }
        if (A052 instanceof String) {
            return (String) A052;
        }
        if (A052 instanceof Number) {
            return String.valueOf(C18310x6.A0B(A052));
        }
        throw AnonymousClass000.A0E(A052, "Bloks id only supports long and String types but got: ", AnonymousClass001.A0o());
    }

    public void A0T(int i, Object obj) {
        this.A04.put(i, obj);
    }

    public boolean A0V() {
        return AnonymousClass001.A1U(this.A04.indexOfKey(40));
    }

    public AnonymousClass84O(List list, int i, int i2) {
        this.A06 = null;
        this.A04 = new SparseArray(i2 + 1);
        this.A03 = i;
        this.A02 = AnonymousClass77G.A00.incrementAndGet();
        this.A07 = list;
        this.A05 = null;
        AnonymousClass79U.A03.incrementAndGet();
    }

    public static int A01(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < i) {
            return size;
        }
        return i;
    }

    public static AnonymousClass84M A03(View view, C161797qU r4, int i, int i2) {
        view.measure(i, i2);
        return new AnonymousClass84M(r4, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static Object A04(C152987aU r0, C161797qU r1) {
        return r1.A0C().B0R(r0.A02);
    }

    public static boolean A09(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i3) {
            return true;
        }
        if (mode == Integer.MIN_VALUE && mode2 == 0) {
            if (size >= i3) {
                return true;
            }
            return false;
        } else if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || i3 > size) {
            return false;
        } else {
            return true;
        }
    }

    public float A0B(int i, float f) {
        Number number = (Number) A05(this, i);
        if (number != null) {
            return number.floatValue();
        }
        return f;
    }

    public int A0E(int i, int i2) {
        Object A052 = A05(this, i);
        if (A052 == null) {
            return i2;
        }
        if (!(A052 instanceof String)) {
            return AnonymousClass001.A0K(A052);
        }
        try {
            return Integer.parseInt((String) A052);
        } catch (NumberFormatException unused) {
            C159737mN.A01("BloksModel", "Non-int string parsed as int");
            return i2;
        }
    }

    public long A0F(int i, long j) {
        Object A052 = A05(this, i);
        if (A052 == null) {
            return j;
        }
        if (!(A052 instanceof String)) {
            return C18310x6.A0B(A052);
        }
        try {
            return Long.parseLong((String) A052);
        } catch (NumberFormatException unused) {
            C159737mN.A01("BloksModel", "Non-long string parsed as long");
            return j;
        }
    }

    public String A0O(int i) {
        return (String) A05(this, i);
    }

    public String A0P(int i, String str) {
        String str2 = (String) A05(this, i);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public List A0Q() {
        int intValue;
        List A0R;
        Integer A012 = C158977kt.A00().A0B.A01(this);
        if (A012 == null || (intValue = A012.intValue()) == -1 || (A0R = A0R(intValue)) == null) {
            return Collections.emptyList();
        }
        return A0R;
    }

    public List A0R(int i) {
        Object A052 = A05(this, i);
        if (A052 == null) {
            return Collections.emptyList();
        }
        if (!(A052 instanceof AnonymousClass84O)) {
            return (List) A052;
        }
        ArrayList A0I = AnonymousClass002.A0I(1);
        A0I.add(A052);
        return A0I;
    }

    public List A0S(int i) {
        List list = (List) A05(this, i);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public boolean A0W(int i, boolean z) {
        Object A052 = A05(this, i);
        if (A052 == null) {
            return z;
        }
        if (A052 instanceof Boolean) {
            return AnonymousClass001.A1Z(A052);
        }
        if (A052 instanceof Number) {
            return AnonymousClass001.A1T(AnonymousClass001.A0K(A052));
        }
        C159737mN.A01("ParseUtils", "Attempting to extract boolean value from unrecognized value type");
        return z;
    }

    public boolean A0X(C181438ml r8) {
        if (!r8.BsI(this)) {
            C160317nR A012 = C158977kt.A01();
            int i = this.A03;
            int[] A013 = A012.A01(i);
            int i2 = 0;
            while (i2 < A013.length) {
                AnonymousClass84O A0J = A0K(A013[i2]);
                if (A0J == null || !A0J.A0X(r8)) {
                    i2++;
                }
            }
            int[] A002 = C158977kt.A01().A00(i);
            for (int A0R : A002) {
                List A0R2 = A0R(A0R);
                for (int i3 = 0; i3 < A0R2.size(); i3++) {
                    AnonymousClass84O A0V = AnonymousClass6C9.A0V(A0R2, i3);
                    if (A0V != null && A0V.A0X(r8)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: X.0gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: X.0gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v88, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v93, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v120, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v209, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v214, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v217, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v223, resolved type: X.84M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v226, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v228, resolved type: X.84J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v229, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v233, resolved type: X.8vK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v240, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v241, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v242, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v243, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v244, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v245, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v246, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v247, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v248, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v249, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v250, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v251, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v252, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v253, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v254, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v255, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v256, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v257, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v258, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v259, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v260, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v261, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v262, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v263, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v264, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v265, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v266, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v267, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v268, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v269, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v270, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v271, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v272, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v273, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v274, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v275, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v276, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v277, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v278, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v280, resolved type: X.84I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v281, resolved type: X.84L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v282, resolved type: X.84L} */
    /* JADX WARNING: type inference failed for: r17v30, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r0v230, types: [X.8vK] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x030b, code lost:
        if (android.view.View.MeasureSpec.getMode(r5) == 0) goto L_0x1283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0612, code lost:
        if (r8 != null) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08f5, code lost:
        if (r6 != false) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0901, code lost:
        if (r6 != false) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0907, code lost:
        if (r15 != false) goto L_0x0909;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0de4, code lost:
        if (r10 == Integer.MIN_VALUE) goto L_0x0de6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0f80, code lost:
        if (r6 != null) goto L_0x0f5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0fb4, code lost:
        throw new X.AnonymousClass6u2(X.AnonymousClass000.A0V("can't parse unknown textUniSize: ", r7, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:0x127d, code lost:
        if (android.view.View.MeasureSpec.getMode(r5) == 1073741824) goto L_0x127f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x13b1, code lost:
        r0 = X.AnonymousClass0VC.A02(r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x13b7, code lost:
        r0 = new X.AnonymousClass84M(r3, A01(Integer.MAX_VALUE, r4), A01(Integer.MAX_VALUE, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x13c9, code lost:
        r8 = A0J(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x13cf, code lost:
        if (r8 == null) goto L_0x1650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:895:0x13d1, code lost:
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(r5), Integer.MIN_VALUE);
        r7 = A0J(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x13e1, code lost:
        if (r7 == null) goto L_0x1421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:897:0x13e3, code lost:
        r6 = r7.AyJ(r2, r4, r10);
        X.C162457s7.A0J(r6, 2);
        r7 = X.C160497nj.A00(r2, r6, r7, (java.lang.Object) null, X.C153917cG.A00(r4, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x13f7, code lost:
        r6 = android.view.View.MeasureSpec.getSize(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:899:0x13fb, code lost:
        if (r7 == null) goto L_0x141f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x13fd, code lost:
        r14 = r7.A02.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:901:0x1403, code lost:
        r9 = r8.AyJ(r2, r4, android.view.View.MeasureSpec.makeMeasureSpec(r6 - r14, Integer.MIN_VALUE));
        r8 = new X.AnonymousClass84L(r9, r3, r7, android.view.View.MeasureSpec.getSize(r4), r9.getHeight() + r14, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x141f, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:903:0x1421, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x1423, code lost:
        r7 = A01(Integer.MAX_VALUE, r4);
        r6 = A01(Integer.MAX_VALUE, r5);
        r0 = new X.AnonymousClass84M(r3, new android.graphics.Rect(0, 0, r7, r6), r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x154f, code lost:
        if (r7 != null) goto L_0x1551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:946:0x15a0, code lost:
        if (r13 != 0) goto L_0x1522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:949:0x15b7, code lost:
        r7 = X.C86664Kz.A1Z();
        r7[0] = X.AnonymousClass73N.A00(r4, 0);
        r6 = X.AnonymousClass73N.A00(r5, 0);
        r7[1] = r6;
        r0 = new X.AnonymousClass84M(r3, r7, r7[0], r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:994:0x1656, code lost:
        throw X.AnonymousClass001.A0e("bk.cds.bottomsheet.Wrapper has no content.");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0b26  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0b32  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0bec  */
    /* JADX WARNING: Removed duplicated region for block: B:635:0x0d33 A[Catch:{ 6u2 -> 0x15e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0d3a A[Catch:{ 6u2 -> 0x15e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:935:0x154f  */
    /* JADX WARNING: Removed duplicated region for block: B:938:0x1555  */
    /* JADX WARNING: Removed duplicated region for block: B:943:0x1598  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C186448vK AyJ(X.C152987aU r51, int r52, int r53) {
        /*
            r50 = this;
            r2 = r51
            X.7jG r16 = r2.A03()
            r0 = r16
            X.7Fd r0 = r0.A00
            r1 = r50
            if (r0 != 0) goto L_0x15d1
            r3 = 0
        L_0x000f:
            r4 = r52
            r5 = r53
            if (r3 == 0) goto L_0x0058
            int r7 = r3.A01
            X.8vK r0 = r3.A02
            int r6 = r0.getWidth()
            boolean r6 = A09(r7, r4, r6)
            if (r6 == 0) goto L_0x0058
            int r6 = r3.A00
            int r3 = r0.getHeight()
            boolean r3 = A09(r6, r5, r3)
            if (r3 == 0) goto L_0x0058
            X.7XT r2 = X.C159567m6.A00
            boolean r2 = r2.A02()
            if (r2 == 0) goto L_0x0049
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Bloks cacheTraversal: "
            r3.append(r2)
            int r2 = r1.A03
            java.lang.String r2 = X.AnonymousClass000.A0h(r3, r2)
            X.C159567m6.A01(r2)
        L_0x0049:
            r4 = 1
            X.74L r3 = new X.74L
            r2 = r16
            r3.<init>(r2, r4, r1)
            r1.A0X(r3)
        L_0x0054:
            X.C159567m6.A00()
            return r0
        L_0x0058:
            X.7XT r0 = X.C159567m6.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0079
            r0 = 128(0x80, float:1.794E-43)
            A05(r1, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Bloks Layout: "
            r3.append(r0)
            int r0 = r1.A03
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r0)
            X.7XT r0 = X.C159567m6.A00
            r0.A01(r3)
        L_0x0079:
            java.lang.Object r10 = r2.A03
            r8 = r10
            X.7bI r8 = (X.C153427bI) r8
            java.util.Objects.requireNonNull(r8)
            r0 = 0
            r3 = 156(0x9c, float:2.19E-43)
            android.util.SparseArray r9 = r1.A04
            java.lang.Object r6 = r9.get(r3)
            X.8l9 r6 = (X.C180488l9) r6
            boolean r3 = X.C162377rs.A0C(r8)
            if (r3 == 0) goto L_0x00ca
            if (r6 == 0) goto L_0x00ca
            X.8vK r0 = r6.AyJ(r2, r4, r5)
            boolean r2 = r0 instanceof X.AnonymousClass84I
            if (r2 != 0) goto L_0x00c8
            X.7qU r3 = r0.BC6()
            if (r3 == 0) goto L_0x00a8
            X.6N9 r2 = new X.6N9
            r2.<init>(r3)
            r3 = r2
        L_0x00a8:
            X.7qU r3 = r1.A0H(r3, r8)
        L_0x00ac:
            X.C158977kt.A00()
            boolean r2 = r0 instanceof X.AnonymousClass84I
            if (r2 != 0) goto L_0x00b9
            X.84I r2 = new X.84I
            r2.<init>(r0, r3)
            r0 = r2
        L_0x00b9:
            X.7JE r3 = new X.7JE
            r3.<init>(r0, r4, r5)
            r2 = r16
            X.7Fd r2 = r2.A01
            java.util.Map r2 = r2.A01
            r2.put(r1, r3)
            goto L_0x0054
        L_0x00c8:
            r3 = 0
            goto L_0x00ac
        L_0x00ca:
            X.7kt r3 = X.C158977kt.A00()
            X.7qG r3 = r3.A0B
            X.7qU r3 = r3.A00(r8, r1)
            X.7qU r3 = r1.A0H(r3, r8)
            X.7kt r6 = X.C158977kt.A00()
            X.7qG r6 = r6.A0B
            int r7 = r1.A03
            switch(r7) {
                case 13323: goto L_0x1423;
                case 13889: goto L_0x1451;
                case 13948: goto L_0x1484;
                case 14005: goto L_0x1449;
                case 14093: goto L_0x13c9;
                case 15763: goto L_0x14a6;
                case 15768: goto L_0x14c9;
                case 15972: goto L_0x1449;
                case 15981: goto L_0x13b7;
                case 16094: goto L_0x15b7;
                case 16534: goto L_0x143a;
                case 16682: goto L_0x13b1;
                case 16718: goto L_0x15a4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            switch(r7) {
                case 13496: goto L_0x1328;
                case 13497: goto L_0x15b7;
                case 13498: goto L_0x1368;
                case 13499: goto L_0x134e;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            switch(r7) {
                case 13501: goto L_0x12cc;
                case 13502: goto L_0x128c;
                case 13503: goto L_0x12e5;
                case 13504: goto L_0x1311;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            boolean r6 = X.C153947cK.A01(r7)
            if (r6 == 0) goto L_0x1257
            r6 = 13320(0x3408, float:1.8665E-41)
            if (r7 != r6) goto L_0x02e5
            X.7rT r23 = X.AnonymousClass77I.A00
            r6 = 49
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x010a
            java.lang.String r6 = "gone"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x010a
            X.8vK r0 = X.C159807mU.A01
            goto L_0x00ac
        L_0x010a:
            android.content.Context r6 = r2.A02
            boolean r6 = X.C1443471e.A00(r6)
            r15 = r6 ^ 1
            X.84O r9 = X.C162217rT.A02(r1)
            X.7nG r8 = new X.7nG
            r8.<init>()
            X.8Cl r6 = new X.8Cl
            r6.<init>(r8, r1)
            r1.A0U(r6)
            if (r15 != 0) goto L_0x013f
            X.6x1 r12 = X.C142326x1.RTL
            r6 = 2
            X.C160217nG.A00(r8, r6)
            float[] r10 = r8.A01
            int r11 = r8.A00
            int r7 = r11 + 1
            r8.A00 = r7
            float r6 = (float) r0
            r10[r11] = r6
            int r6 = r7 + 1
            r8.A00 = r6
            int r6 = r12.mIntValue
            float r6 = (float) r6
            r10[r7] = r6
        L_0x013f:
            if (r9 == 0) goto L_0x0149
            X.8Cm r6 = new X.8Cm
            r6.<init>(r8, r15)
            r9.A0U(r6)
        L_0x0149:
            float[] r7 = r8.A01
            int r6 = r8.A00
            float[] r24 = java.util.Arrays.copyOf(r7, r6)
            java.util.List r22 = r1.A0Q()
            int r6 = r22.size()
            float[][] r10 = new float[r6][]
            int r6 = r22.size()
            com.facebook.flexlayout.styles.FlexItemCallback[] r6 = new com.facebook.flexlayout.styles.FlexItemCallback[r6]
            r17 = r6
            java.util.Iterator r21 = r22.iterator()
            r14 = 0
            r20 = 0
        L_0x016a:
            boolean r6 = r21.hasNext()
            if (r6 == 0) goto L_0x0220
            java.lang.Object r13 = r21.next()
            X.8l9 r13 = (X.C180488l9) r13
            boolean r6 = r13 instanceof X.AnonymousClass84O
            if (r6 == 0) goto L_0x0196
            r7 = r13
            X.84O r7 = (X.AnonymousClass84O) r7
            int r8 = r7.A03
            r6 = 13320(0x3408, float:1.8665E-41)
            if (r8 != r6) goto L_0x0196
            r6 = 49
            java.lang.Object r7 = A05(r7, r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0196
            java.lang.String r6 = "gone"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0196
            goto L_0x016a
        L_0x0196:
            X.84O r12 = X.C162217rT.A02(r13)
            if (r12 == 0) goto L_0x021d
            X.7pS r11 = new X.7pS
            r11.<init>()
            r6 = 62
            java.lang.Object r6 = A05(r12, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x021a
            r6 = 62
            java.lang.Object r7 = A05(r12, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "absolute"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x021a
            r19 = 1
            X.6ws r18 = X.C142246ws.ABSOLUTE
            float[] r9 = X.C161337pS.A02(r11)
            int r8 = r11.A00
            int r7 = r8 + 1
            r11.A00 = r7
            r6 = 21
            float r6 = (float) r6
            r9[r8] = r6
            int r6 = r7 + 1
            r11.A00 = r6
            r6 = r18
            int r6 = r6.mIntValue
            float r6 = (float) r6
            r9[r7] = r6
        L_0x01d9:
            if (r15 == 0) goto L_0x0215
            X.6xs r8 = X.C142836xs.LEFT
            X.6xs r7 = X.C142836xs.RIGHT
        L_0x01df:
            X.8Cn r6 = new X.8Cn
            r9 = r19
            r6.<init>(r8, r7, r11, r9)
            r12.A0U(r6)
        L_0x01e9:
            float[] r7 = r11.A01
            int r6 = r11.A00
            float[] r6 = java.util.Arrays.copyOf(r7, r6)
            r10[r14] = r6
            X.7gr r7 = new X.7gr
            r6 = r23
            r7.<init>(r2, r13, r6, r15)
            com.facebook.flexlayout.styles.FlexItemCallback r6 = new com.facebook.flexlayout.styles.FlexItemCallback
            r6.<init>(r7)
            r17[r14] = r6
            X.84O r7 = X.C162217rT.A02(r13)
            if (r7 == 0) goto L_0x0211
            r6 = 81
            int r6 = r7.A0E(r6, r0)
            if (r6 == 0) goto L_0x0211
            r20 = 1
        L_0x0211:
            int r14 = r14 + 1
            goto L_0x016a
        L_0x0215:
            X.6xs r8 = X.C142836xs.RIGHT
            X.6xs r7 = X.C142836xs.LEFT
            goto L_0x01df
        L_0x021a:
            r19 = 0
            goto L_0x01d9
        L_0x021d:
            X.7pS r11 = X.C162217rT.A00
            goto L_0x01e9
        L_0x0220:
            int r2 = r22.size()
            if (r2 <= r14) goto L_0x0238
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r14)
            float[][] r10 = (float[][]) r10
            r2 = r17
            java.lang.Object[] r17 = java.util.Arrays.copyOf(r2, r14)
            r2 = r17
            com.facebook.flexlayout.styles.FlexItemCallback[] r2 = (com.facebook.flexlayout.styles.FlexItemCallback[]) r2
            r17 = r2
        L_0x0238:
            r6 = 0
            if (r20 == 0) goto L_0x0255
            java.lang.Integer[] r6 = new java.lang.Integer[r14]
            r7 = 0
        L_0x023e:
            if (r7 >= r14) goto L_0x0249
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r6[r7] = r2
            int r7 = r7 + 1
            goto L_0x023e
        L_0x0249:
            X.8NN r8 = new X.8NN
            r7 = r23
            r2 = r22
            r8.<init>(r7, r2)
            java.util.Arrays.sort(r6, r8)
        L_0x0255:
            float[] r15 = X.C159807mU.A01(r4)
            float[] r14 = X.C159807mU.A01(r5)
            r8 = 1
            r7 = r15[r8]
            r12 = r14[r8]
            X.84O r11 = X.C162217rT.A02(r1)
            if (r11 != 0) goto L_0x02ad
            r9 = 0
        L_0x0269:
            if (r9 == 0) goto L_0x028b
            r13 = r9[r0]
            r2 = 2
            r12 = r9[r2]
            r2 = 4
            r11 = r9[r2]
            r7 = r15[r0]
            r2 = r15[r8]
            float[] r15 = X.C159807mU.A00(r13, r12, r11, r7, r2)
            r12 = r9[r8]
            r2 = 3
            r11 = r9[r2]
            r2 = 5
            r9 = r9[r2]
            r7 = r14[r0]
            r2 = r14[r8]
            float[] r14 = X.C159807mU.A00(r12, r11, r9, r7, r2)
        L_0x028b:
            r26 = r15[r0]
            r27 = r15[r8]
            r28 = r14[r0]
            r29 = r14[r8]
            int r0 = r10.length
            com.facebook.flexlayout.layoutoutput.LayoutOutput r2 = new com.facebook.flexlayout.layoutoutput.LayoutOutput
            r2.<init>(r0)
            r25 = r10
            r30 = r27
            r31 = r29
            r32 = r2
            r33 = r17
            com.facebook.flexlayout.FlexLayoutNative.jni_calculateLayout(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.84J r0 = new X.84J
            r0.<init>(r2, r3, r6)
            goto L_0x00ac
        L_0x02ad:
            r2 = 6
            float[] r9 = new float[r2]
            r2 = 68
            float r2 = X.C162217rT.A00(r11, r7, r2, r8)
            r9[r0] = r2
            r2 = 42
            float r2 = X.C162217rT.A00(r11, r12, r2, r8)
            r9[r8] = r2
            r2 = 54
            float r13 = X.C162217rT.A00(r11, r7, r2, r0)
            r2 = 2
            r9[r2] = r13
            r2 = 53
            float r13 = X.C162217rT.A00(r11, r12, r2, r0)
            r2 = 3
            r9[r2] = r13
            r2 = 52
            float r7 = X.C162217rT.A00(r11, r7, r2, r0)
            r2 = 4
            r9[r2] = r7
            r2 = 51
            float r7 = X.C162217rT.A00(r11, r12, r2, r0)
            r2 = 5
            r9[r2] = r7
            goto L_0x0269
        L_0x02e5:
            r6 = 16682(0x412a, float:2.3376E-41)
            if (r7 == r6) goto L_0x13b1
            r6 = 15981(0x3e6d, float:2.2394E-41)
            if (r7 == r6) goto L_0x13b7
            r6 = 16260(0x3f84, float:2.2785E-41)
            if (r7 != r6) goto L_0x02f7
            X.8vK r0 = com.bloks.components.bkcomponentszoomable.BKBloksComponentsZoomableBinderUtil.calculateLayoutForComponent(r2, r1, r3, r4, r5)
            goto L_0x00ac
        L_0x02f7:
            r6 = 14093(0x370d, float:1.9748E-41)
            if (r7 == r6) goto L_0x13c9
            r6 = 15778(0x3da2, float:2.211E-41)
            if (r7 != r6) goto L_0x0314
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r7 = 0
            if (r0 != 0) goto L_0x030f
            r6 = 0
        L_0x0307:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != 0) goto L_0x127f
            goto L_0x1283
        L_0x030f:
            int r6 = android.view.View.MeasureSpec.getSize(r4)
            goto L_0x0307
        L_0x0314:
            r6 = 15728(0x3d70, float:2.204E-41)
            if (r7 != r6) goto L_0x0343
            r0 = 35
            X.84O r6 = r1.A0K(r0)
            r2 = 24
            if (r6 != 0) goto L_0x0329
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r2)
            goto L_0x00ac
        L_0x0329:
            r0 = 36
            java.lang.Object r0 = A05(r6, r0)     // Catch:{ 6u2 -> 0x033c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 6u2 -> 0x033c }
            if (r0 != 0) goto L_0x0334
            goto L_0x0339
        L_0x0334:
            float r0 = X.C162407s0.A01(r0)     // Catch:{ 6u2 -> 0x033c }
            goto L_0x033b
        L_0x0339:
            r0 = 1103101952(0x41c00000, float:24.0)
        L_0x033b:
            int r2 = (int) r0     // Catch:{ 6u2 -> 0x033c }
        L_0x033c:
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r2)
            goto L_0x00ac
        L_0x0343:
            r6 = 13334(0x3416, float:1.8685E-41)
            if (r7 != r6) goto L_0x0361
            if (r3 == 0) goto L_0x15db
            java.lang.Object r0 = A04(r2, r3)
            X.0uR r0 = (X.C17030uR) r0
            r0.measure(r4, r5)
            int r6 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x0361:
            r6 = 13336(0x3418, float:1.8688E-41)
            if (r7 != r6) goto L_0x037a
            r3.A0C()
            r0 = 0
            X.7iM r0 = X.AnonymousClass0YO.A03(r2, r1, r0, r4, r5)
            int r7 = r0.A01
            int r6 = r0.A00
            java.lang.Object r2 = r0.A02
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r7, r6)
            goto L_0x00ac
        L_0x037a:
            r6 = 13317(0x3405, float:1.8661E-41)
            if (r7 != r6) goto L_0x0d4d
            r6 = 2
            r11 = 1
            X.C162457s7.A0J(r3, r6)
            X.6us r7 = X.AnonymousClass0VE.A01(r1)
            int r7 = r7.ordinal()
            if (r7 == r0) goto L_0x08c3
            if (r7 == r11) goto L_0x0685
            r30 = 0
            X.0Xo r6 = X.C06410Xo.A00
            android.content.Context r7 = r2.A02
            X.0Np r6 = r6.A04(r7, r1)
            int r12 = r6.A01
            int r10 = r6.A02
            android.graphics.Rect r9 = r6.A04
            int r15 = r6.A00
            int r14 = r6.A03
            boolean r29 = X.AnonymousClass73E.A00(r7)
            java.util.List r6 = r1.A0Q()
            java.util.ArrayList r28 = X.AnonymousClass000.A0p(r6)
            X.0OS r27 = new X.0OS
            r6 = r27
            r6.<init>(r2, r1)
            int r13 = android.view.View.MeasureSpec.getSize(r4)
            int r6 = r9.left
            int r13 = r13 - r6
            int r6 = r9.right
            int r13 = r13 - r6
            int r7 = android.view.View.MeasureSpec.getSize(r5)
            int r6 = r9.top
            int r7 = r7 - r6
            int r6 = r9.bottom
            int r7 = r7 - r6
            if (r12 == r11) goto L_0x03cd
            r13 = r7
        L_0x03cd:
            int[] r6 = new int[r10]
            r26 = r6
            int r18 = r13 / r10
            int r13 = r13 % r10
            r7 = 0
            r17 = 0
        L_0x03d7:
            if (r7 >= r10) goto L_0x03ed
            int r17 = r17 + r13
            if (r17 <= 0) goto L_0x03ea
            int r6 = r10 - r17
            if (r6 >= r13) goto L_0x03ea
            int r6 = r18 + 1
            int r17 = r17 - r10
        L_0x03e5:
            r26[r7] = r6
            int r7 = r7 + 1
            goto L_0x03d7
        L_0x03ea:
            r6 = r18
            goto L_0x03e5
        L_0x03ed:
            r7 = r14
            if (r12 != r11) goto L_0x03f1
            r7 = r15
        L_0x03f1:
            r6 = r29
            android.graphics.Rect[] r25 = X.AnonymousClass0YQ.A04(r12, r7, r10, r6)
            if (r12 != r11) goto L_0x040c
            int r7 = r14 / 2
        L_0x03fb:
            X.0LT[] r6 = new X.AnonymousClass0LT[r10]
            r24 = r6
            r13 = 0
        L_0x0400:
            if (r13 >= r10) goto L_0x040f
            X.0LT r6 = new X.0LT
            r6.<init>()
            r24[r13] = r6
            int r13 = r13 + 1
            goto L_0x0400
        L_0x040c:
            int r7 = r15 / 2
            goto L_0x03fb
        L_0x040f:
            java.util.List r6 = r1.A0Q()
            java.util.ArrayList r23 = X.AnonymousClass000.A0p(r6)
            java.util.List r6 = r1.A0Q()
            X.C162457s7.A0D(r6)
            java.util.Iterator r22 = r6.iterator()
        L_0x0422:
            boolean r6 = r22.hasNext()
            if (r6 == 0) goto L_0x05de
            java.lang.Object r21 = r22.next()
            int r20 = r30 + 1
            if (r30 >= 0) goto L_0x0435
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0435:
            r6 = r21
            X.84O r6 = (X.AnonymousClass84O) r6
            r21 = r6
            X.C162457s7.A0B(r21)
            boolean r19 = X.AnonymousClass0YQ.A02(r21)
            X.3xM r13 = new X.3xM
            r6 = r24
            r13.<init>(r6)
            X.3ZW r6 = new X.3ZW
            r6.<init>(r13)
            java.util.Iterator r17 = r6.iterator()
            boolean r6 = r17.hasNext()
            if (r19 == 0) goto L_0x04e0
            if (r6 == 0) goto L_0x0512
            java.lang.Object r14 = r17.next()
            boolean r6 = r17.hasNext()
            if (r6 == 0) goto L_0x0488
            r6 = r14
            X.2q1 r6 = (X.C55232q1) r6
            java.lang.Object r6 = r6.A01()
            X.0LT r6 = (X.AnonymousClass0LT) r6
            int r13 = r6.A00
        L_0x046f:
            java.lang.Object r15 = r17.next()
            r6 = r15
            X.2q1 r6 = (X.C55232q1) r6
            java.lang.Object r6 = r6.A01()
            X.0LT r6 = (X.AnonymousClass0LT) r6
            int r6 = r6.A00
            if (r13 >= r6) goto L_0x0482
            r13 = r6
            r14 = r15
        L_0x0482:
            boolean r6 = r17.hasNext()
            if (r6 != 0) goto L_0x046f
        L_0x0488:
            X.2q1 r14 = (X.C55232q1) r14
            if (r14 == 0) goto L_0x15e2
            int r18 = r14.A00()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            if (r6 == 0) goto L_0x15e2
            if (r19 == 0) goto L_0x04d8
            android.graphics.Rect r13 = X.AnonymousClass001.A0N()
        L_0x049c:
            r6 = r23
            r6.add(r13)
            r14 = 132(0x84, float:1.85E-43)
            r6 = r21
            X.84O r15 = r6.A0K(r14)
            r17 = 0
            if (r15 == 0) goto L_0x04cc
            int r6 = r15.A03
            r14 = r6
            r6 = 16482(0x4062, float:2.3096E-41)
            if (r14 != r6) goto L_0x04cc
            r14 = 35
            java.lang.Object r14 = A05(r15, r14)
            if (r14 == 0) goto L_0x04cc
            boolean r6 = r14 instanceof java.lang.Number
            if (r6 == 0) goto L_0x04cc
            java.lang.Number r14 = (java.lang.Number) r14
            if (r14 == 0) goto L_0x04cc
            float r6 = r14.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r6)
        L_0x04cc:
            if (r19 == 0) goto L_0x0515
            r6 = 0
            r14 = 0
        L_0x04d0:
            if (r6 >= r10) goto L_0x0517
            r15 = r26[r6]
            int r14 = r14 + r15
            int r6 = r6 + 1
            goto L_0x04d0
        L_0x04d8:
            r6 = r25[r18]
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r6)
            goto L_0x049c
        L_0x04e0:
            if (r6 == 0) goto L_0x0512
            java.lang.Object r14 = r17.next()
            boolean r6 = r17.hasNext()
            if (r6 == 0) goto L_0x0488
            r6 = r14
            X.2q1 r6 = (X.C55232q1) r6
            java.lang.Object r6 = r6.A01()
            X.0LT r6 = (X.AnonymousClass0LT) r6
            int r13 = r6.A00
        L_0x04f7:
            java.lang.Object r15 = r17.next()
            r6 = r15
            X.2q1 r6 = (X.C55232q1) r6
            java.lang.Object r6 = r6.A01()
            X.0LT r6 = (X.AnonymousClass0LT) r6
            int r6 = r6.A00
            if (r13 <= r6) goto L_0x050a
            r13 = r6
            r14 = r15
        L_0x050a:
            boolean r6 = r17.hasNext()
            if (r6 != 0) goto L_0x04f7
            goto L_0x0488
        L_0x0512:
            r14 = 0
            goto L_0x0488
        L_0x0515:
            r14 = r26[r18]
        L_0x0517:
            if (r12 != r11) goto L_0x059e
            int r6 = r13.left
            int r14 = r14 - r6
            int r6 = r13.right
        L_0x051e:
            int r14 = r14 - r6
            if (r17 == 0) goto L_0x059b
            if (r19 != 0) goto L_0x059b
            float r13 = (float) r14
            float r6 = r17.floatValue()
            float r13 = r13 * r6
            int r6 = (int) r13
            int r13 = X.C86664Kz.A05(r6)
        L_0x052e:
            int r6 = X.C86664Kz.A05(r14)
            r14 = r6
            if (r12 != 0) goto L_0x0537
            r14 = r13
            r13 = r6
        L_0x0537:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            X.3Z6 r6 = X.AnonymousClass3Z6.A01(r6, r13)
            int r13 = X.AnonymousClass3Z6.A00(r6)
            java.lang.Object r6 = r6.second
            int r6 = X.AnonymousClass001.A0K(r6)
            r15 = r27
            r14 = r21
            X.7Vn r13 = X.AnonymousClass0VE.A02(r15, r2, r14, r13, r6)
            r6 = r28
            r6.add(r13)
            X.6NK r6 = r13.A00
            java.lang.Object r6 = r6.A00()
            X.7nJ r6 = (X.C160247nJ) r6
            X.7Wn r6 = r6.A02
            if (r12 != r11) goto L_0x0596
            int r14 = r6.A01()
        L_0x0566:
            r18 = r24[r18]
            r6 = r18
            int r13 = r6.A00
            int r13 = r13 + r14
            X.0Kr r6 = r6.A01
            if (r6 == 0) goto L_0x05b3
            int r6 = r7 * 2
            int r13 = r13 + r6
            r15 = 0
        L_0x0575:
            if (r15 >= r10) goto L_0x05a5
            r6 = r24[r15]
            X.0Kr r6 = r6.A01
            if (r6 == 0) goto L_0x058b
            int r6 = r6.A00
            r14 = r23
            java.lang.Object r6 = r14.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r12 != r11) goto L_0x058e
            r6.bottom = r7
        L_0x058b:
            int r15 = r15 + 1
            goto L_0x0575
        L_0x058e:
            if (r29 != 0) goto L_0x0593
            r6.right = r7
            goto L_0x058b
        L_0x0593:
            r6.left = r7
            goto L_0x058b
        L_0x0596:
            int r14 = r6.A02()
            goto L_0x0566
        L_0x059b:
            int r13 = X.C159577m7.A00
            goto L_0x052e
        L_0x059e:
            int r6 = r13.top
            int r14 = r14 - r6
            int r6 = r13.bottom
            goto L_0x051e
        L_0x05a5:
            r14 = r23
            r6 = r30
            java.lang.Object r6 = r14.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            if (r12 != r11) goto L_0x05cc
            r6.top = r7
        L_0x05b3:
            X.0Kr r17 = new X.0Kr
            r14 = r30
            r6 = r17
            r6.<init>(r14)
            if (r19 == 0) goto L_0x05d4
            r15 = 0
        L_0x05bf:
            if (r15 >= r10) goto L_0x05da
            r14 = r24[r15]
            r6 = r17
            r14.A01 = r6
            r14.A00 = r13
            int r15 = r15 + 1
            goto L_0x05bf
        L_0x05cc:
            if (r29 != 0) goto L_0x05d1
            r6.left = r7
            goto L_0x05b3
        L_0x05d1:
            r6.right = r7
            goto L_0x05b3
        L_0x05d4:
            r14 = r18
            r14.A01 = r6
            r14.A00 = r13
        L_0x05da:
            r30 = r20
            goto L_0x0422
        L_0x05de:
            if (r8 == 0) goto L_0x05ed
            java.lang.Object r6 = X.C162377rs.A05(r8, r1)
            r6.getClass()
            X.0Xa r6 = (X.C06300Xa) r6
            r2 = r23
            r6.A08 = r2
        L_0x05ed:
            int r7 = android.view.View.MeasureSpec.getMode(r4)
            int r6 = android.view.View.MeasureSpec.getMode(r5)
            if (r12 != r11) goto L_0x0600
            if (r7 != 0) goto L_0x0609
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0600:
            if (r6 != 0) goto L_0x0609
            java.lang.String r0 = "StaggeredGridCollectionMeasureHelper: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0609:
            r13 = 0
            if (r10 == 0) goto L_0x0616
            r8 = r24[r0]
            int r2 = r10 + -1
            if (r2 != 0) goto L_0x0667
            if (r8 == 0) goto L_0x0616
        L_0x0614:
            int r13 = r8.A00
        L_0x0616:
            if (r12 != r11) goto L_0x0662
            int r2 = r9.top
            int r0 = r9.bottom
        L_0x061c:
            int r2 = r2 + r0
            int r13 = r13 + r2
            int r8 = android.view.View.MeasureSpec.getSize(r4)
            if (r12 != 0) goto L_0x062e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x062e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L_0x0660
            if (r13 < r8) goto L_0x0660
        L_0x062e:
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            if (r12 != r11) goto L_0x063e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 == r0) goto L_0x063e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r0) goto L_0x065e
            if (r13 < r2) goto L_0x065e
        L_0x063e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r0, r2)
            int r7 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            int r6 = X.AnonymousClass001.A0K(r0)
            X.7JG r2 = new X.7JG
            r0 = r28
            r2.<init>(r0, r7, r6)
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r7, r6)
            goto L_0x00ac
        L_0x065e:
            r2 = r13
            goto L_0x063e
        L_0x0660:
            r8 = r13
            goto L_0x062e
        L_0x0662:
            int r2 = r9.left
            int r0 = r9.right
            goto L_0x061c
        L_0x0667:
            int r10 = r8.A00
            X.8Zj r0 = new X.8Zj
            r0.<init>(r11, r2)
            X.3d2 r13 = r0.iterator()
        L_0x0672:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0614
            int r0 = r13.A00()
            r2 = r24[r0]
            int r0 = r2.A00
            if (r10 >= r0) goto L_0x0672
            r8 = r2
            r10 = r0
            goto L_0x0672
        L_0x0685:
            X.0Xo r6 = X.C06410Xo.A00
            android.content.Context r0 = r2.A02
            r46 = r0
            X.0Np r6 = r6.A04(r0, r1)
            int r0 = r6.A01
            r35 = r0
            int r12 = r6.A02
            int r0 = r6.A00
            r38 = r0
            int r0 = r6.A03
            r39 = r0
            android.graphics.Rect r0 = r6.A04
            r45 = r0
            X.84O r6 = r6.A00()
            r0 = 35
            java.lang.Object r34 = A05(r6, r0)
            r0 = r34
            boolean r0 = r0 instanceof java.lang.Number
            r33 = 0
            if (r0 == 0) goto L_0x070b
            r0 = r34
            java.lang.Number r0 = (java.lang.Number) r0
            r34 = r0
        L_0x06b9:
            X.0YJ r44 = X.AnonymousClass0YJ.A00
            java.util.List r13 = r1.A0Q()
            X.C162457s7.A0D(r13)
            java.util.ArrayList r32 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            int r9 = r13.size()
            r7 = 0
            r14 = 0
        L_0x06d0:
            if (r7 >= r9) goto L_0x070e
            X.84O r6 = X.AnonymousClass6C9.A0V(r13, r7)
            boolean r0 = X.AnonymousClass0YJ.A04(r6)
            if (r0 == 0) goto L_0x0706
            r15 = r12
        L_0x06dd:
            int r14 = r14 + r15
            if (r14 <= r12) goto L_0x0702
            java.util.List r14 = X.C73723fy.A0F(r10)
            r0 = r32
            r0.add(r14)
            r10.clear()
            r10.add(r6)
            r14 = r15
        L_0x06f0:
            int r0 = X.AnonymousClass002.A03(r13)
            if (r7 != r0) goto L_0x06ff
            java.util.List r6 = X.C73723fy.A0F(r10)
            r0 = r32
            r0.add(r6)
        L_0x06ff:
            int r7 = r7 + 1
            goto L_0x06d0
        L_0x0702:
            r10.add(r6)
            goto L_0x06f0
        L_0x0706:
            int r15 = X.AnonymousClass0YJ.A00(r6)
            goto L_0x06dd
        L_0x070b:
            r34 = r33
            goto L_0x06b9
        L_0x070e:
            int r40 = r32.size()
            java.util.ArrayList r31 = X.AnonymousClass002.A0I(r40)
            java.util.List r0 = r1.A0Q()
            java.util.ArrayList r30 = X.AnonymousClass000.A0p(r0)
            X.0OS r29 = new X.0OS
            r0 = r29
            r0.<init>(r2, r1)
            int r6 = android.view.View.MeasureSpec.getSize(r4)
            r0 = r45
            int r0 = r0.left
            int r6 = r6 - r0
            r0 = r45
            int r0 = r0.right
            int r6 = r6 - r0
            int r7 = android.view.View.MeasureSpec.getSize(r5)
            r0 = r45
            int r0 = r0.top
            int r7 = r7 - r0
            r0 = r45
            int r0 = r0.bottom
            int r7 = r7 - r0
            r0 = r35
            if (r0 == r11) goto L_0x0746
            r6 = r7
        L_0x0746:
            int[] r0 = new int[r12]
            r28 = r0
            int r10 = r6 / r12
            int r6 = r6 % r12
            r9 = 0
            r7 = 0
        L_0x074f:
            if (r9 >= r12) goto L_0x0762
            int r7 = r7 + r6
            if (r7 <= 0) goto L_0x0760
            int r0 = r12 - r7
            if (r0 >= r6) goto L_0x0760
            int r0 = r10 + 1
            int r7 = r7 - r12
        L_0x075b:
            r28[r9] = r0
            int r9 = r9 + 1
            goto L_0x074f
        L_0x0760:
            r0 = r10
            goto L_0x075b
        L_0x0762:
            java.util.List r0 = r1.A0Q()
            java.util.ArrayList r27 = X.AnonymousClass000.A0p(r0)
            int r26 = r32.size()
            r10 = 0
        L_0x076f:
            r0 = r26
            if (r10 >= r0) goto L_0x0890
            r0 = r32
            java.lang.Object r9 = r0.get(r10)
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r25 = X.AnonymousClass001.A0s()
            java.util.ArrayList r24 = X.AnonymousClass001.A0s()
            boolean r43 = X.AnonymousClass73E.A00(r46)
            r36 = r9
            r37 = r35
            r41 = r12
            r42 = r10
            java.util.List r23 = X.AnonymousClass0YJ.A03(r36, r37, r38, r39, r40, r41, r42, r43)
            int r22 = r9.size()
            r21 = 0
            r20 = 0
            r13 = 0
        L_0x079c:
            r0 = r22
            if (r13 >= r0) goto L_0x0849
            X.84O r19 = X.AnonymousClass6C9.A0V(r9, r13)
            boolean r18 = X.AnonymousClass0YJ.A04(r19)
            if (r18 == 0) goto L_0x0843
            r14 = r12
        L_0x07ab:
            r0 = r23
            java.lang.Object r7 = r0.get(r13)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r0 = r27
            r0.add(r7)
            if (r34 == 0) goto L_0x0840
            float r0 = r34.floatValue()
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
        L_0x07c2:
            r6 = r13
            int r14 = r14 + r13
            r0 = 0
        L_0x07c5:
            if (r6 >= r14) goto L_0x07cd
            r15 = r28[r6]
            int r0 = r0 + r15
            int r6 = r6 + 1
            goto L_0x07c5
        L_0x07cd:
            r6 = r35
            if (r6 != r11) goto L_0x083b
            int r6 = r7.left
            int r14 = r7.right
        L_0x07d5:
            int r6 = r6 + r14
            int r0 = r0 - r6
            if (r17 == 0) goto L_0x0838
            if (r18 != 0) goto L_0x0838
            float r6 = (float) r0
            float r14 = r17.floatValue()
            float r6 = r6 * r14
            int r6 = (int) r6
            int r6 = X.C86664Kz.A05(r6)
        L_0x07e6:
            if (r35 != 0) goto L_0x0833
            r14 = r6
            int r6 = X.C86664Kz.A05(r0)
        L_0x07ed:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r0, r6)
            int r14 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            int r6 = X.AnonymousClass001.A0K(r0)
            X.0Lv r0 = new X.0Lv
            r0.<init>(r7, r14, r6)
            r7 = r25
            r7.add(r0)
            r7 = r29
            r0 = r19
            X.7Vn r0 = X.AnonymousClass0VE.A02(r7, r2, r0, r14, r6)
            X.6NK r0 = r0.A00
            java.lang.Object r0 = r0.A00()
            X.7nJ r0 = (X.C160247nJ) r0
            X.7Wn r7 = r0.A02
            int r6 = r7.A02()
            r0 = r20
            int r20 = java.lang.Math.max(r0, r6)
            int r6 = r7.A01()
            r0 = r21
            int r21 = java.lang.Math.max(r0, r6)
            int r13 = r13 + 1
            goto L_0x079c
        L_0x0833:
            int r14 = X.C86664Kz.A05(r0)
            goto L_0x07ed
        L_0x0838:
            int r6 = X.C159577m7.A00
            goto L_0x07e6
        L_0x083b:
            int r6 = r7.top
            int r14 = r7.bottom
            goto L_0x07d5
        L_0x0840:
            r17 = r33
            goto L_0x07c2
        L_0x0843:
            int r14 = X.AnonymousClass0YJ.A00(r19)
            goto L_0x07ab
        L_0x0849:
            int r17 = r9.size()
            r13 = 0
        L_0x084e:
            r0 = r17
            if (r13 >= r0) goto L_0x0885
            X.84O r15 = X.AnonymousClass6C9.A0V(r9, r13)
            r0 = r25
            java.lang.Object r7 = r0.get(r13)
            X.0Lv r7 = (X.C03860Lv) r7
            if (r35 != 0) goto L_0x087e
            int r14 = X.C86664Kz.A05(r20)
            int r6 = r7.A00
        L_0x0866:
            r0 = r29
            X.7Vn r6 = X.AnonymousClass0VE.A02(r0, r2, r15, r14, r6)
            X.0NH r0 = new X.0NH
            r0.<init>(r7, r6)
            r7 = r24
            r7.add(r0)
            r0 = r30
            r0.add(r6)
            int r13 = r13 + 1
            goto L_0x084e
        L_0x087e:
            int r14 = r7.A01
            int r6 = X.C86664Kz.A05(r21)
            goto L_0x0866
        L_0x0885:
            r6 = r31
            r0 = r24
            r6.add(r0)
            int r10 = r10 + 1
            goto L_0x076f
        L_0x0890:
            if (r8 == 0) goto L_0x089f
            java.lang.Object r2 = X.C162377rs.A05(r8, r1)
            r2.getClass()
            X.0Xa r2 = (X.C06300Xa) r2
            r0 = r27
            r2.A08 = r0
        L_0x089f:
            r46 = r31
            r47 = r4
            r48 = r5
            r49 = r35
            X.3Z6 r0 = r44.A05(r45, r46, r47, r48, r49)
            int r7 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            int r6 = X.AnonymousClass001.A0K(r0)
            X.7JG r2 = new X.7JG
            r0 = r30
            r2.<init>(r0, r7, r6)
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r7, r6)
            goto L_0x00ac
        L_0x08c3:
            r7 = 99
            java.lang.Object r8 = A05(r1, r7)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x08cf
            java.lang.String r8 = "v1"
        L_0x08cf:
            java.lang.String r7 = "v2"
            boolean r7 = X.C162457s7.A0P(r8, r7)
            if (r7 == 0) goto L_0x0b7c
            java.lang.String r12 = "ListCollectionMeasureV2Helper"
            r9 = 1
            int r8 = X.AnonymousClass0JD.A00(r1)
            r6 = 63
            boolean r13 = r1.A0W(r6, r0)
            int r10 = android.view.View.MeasureSpec.getMode(r4)
            int r7 = android.view.View.MeasureSpec.getMode(r5)
            if (r13 != 0) goto L_0x08f7
            if (r8 != r11) goto L_0x0958
            if (r10 != 0) goto L_0x095b
        L_0x08f2:
            r6 = 1
        L_0x08f3:
            r17 = 0
            if (r6 == 0) goto L_0x08f9
        L_0x08f7:
            r17 = 1
        L_0x08f9:
            if (r13 != 0) goto L_0x0903
            if (r8 != r11) goto L_0x0953
            if (r7 != 0) goto L_0x0956
        L_0x08ff:
            r6 = 1
        L_0x0900:
            r15 = 0
            if (r6 == 0) goto L_0x0904
        L_0x0903:
            r15 = 1
        L_0x0904:
            if (r17 != 0) goto L_0x0909
            r14 = 0
            if (r15 == 0) goto L_0x090a
        L_0x0909:
            r14 = 1
        L_0x090a:
            X.0OT r32 = new X.0OT
            r6 = r32
            r6.<init>(r2, r1)
            java.util.List r6 = r1.A0Q()
            java.util.ArrayList r10 = X.AnonymousClass000.A0p(r6)
            java.util.Iterator r13 = r6.iterator()
        L_0x091d:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x095d
            java.lang.Object r11 = r13.next()
            X.84O r11 = (X.AnonymousClass84O) r11
            X.0YK r18 = X.AnonymousClass0YK.A00
            X.C162457s7.A0B(r11)
            r24 = r4
            if (r8 != r9) goto L_0x0934
            r24 = r5
        L_0x0934:
            r25 = r5
            if (r8 != r9) goto L_0x093a
            r25 = r4
        L_0x093a:
            r26 = r17 ^ 1
            r19 = r32
            r20 = r2
            r21 = r11
            r22 = r1
            r23 = r8
            X.6NK r7 = r18.A0B(r19, r20, r21, r22, r23, r24, r25, r26)
            X.7Vn r6 = new X.7Vn
            r6.<init>(r7, r11)
            r10.add(r6)
            goto L_0x091d
        L_0x0953:
            if (r10 != 0) goto L_0x0956
            goto L_0x08ff
        L_0x0956:
            r6 = 0
            goto L_0x0900
        L_0x0958:
            if (r7 != 0) goto L_0x095b
            goto L_0x08f2
        L_0x095b:
            r6 = 0
            goto L_0x08f3
        L_0x095d:
            r6 = 73
            if (r14 != 0) goto L_0x0984
            int r12 = android.view.View.MeasureSpec.getSize(r4)
            int r11 = android.view.View.MeasureSpec.getSize(r5)
            int r2 = r1.A02
            boolean r0 = r1.A0W(r6, r0)
            X.7Aj r6 = X.C161147p5.A01(r10, r2, r0)
        L_0x0973:
            X.7JG r0 = new X.7JG
            r0.<init>(r10, r12, r11)
            X.0Cq r2 = new X.0Cq
            r2.<init>(r6, r0)
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r12, r11)
            goto L_0x00ac
        L_0x0984:
            r11 = 0
            r6 = 55
            java.lang.Object r6 = A05(r1, r6)     // Catch:{ 6u2 -> 0x0996 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u2 -> 0x0996 }
            if (r6 != 0) goto L_0x0991
            r7 = 0
            goto L_0x09af
        L_0x0991:
            float r7 = X.C162407s0.A01(r6)     // Catch:{ 6u2 -> 0x0996 }
            goto L_0x09af
        L_0x0996:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "Invalid format for spacing-after: "
            r7.append(r6)
            r6 = 55
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = X.AnonymousClass000.A0X(r6, r7)
            X.C159737mN.A01(r12, r6)
            r7 = 0
        L_0x09af:
            r6 = 56
            java.lang.Object r6 = A05(r1, r6)     // Catch:{ 6u2 -> 0x09c0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u2 -> 0x09c0 }
            if (r6 != 0) goto L_0x09bb
            r13 = 0
            goto L_0x09d9
        L_0x09bb:
            float r13 = X.C162407s0.A01(r6)     // Catch:{ 6u2 -> 0x09c0 }
            goto L_0x09d9
        L_0x09c0:
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "Invalid format for spacing-before: "
            r13.append(r6)
            r6 = 56
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = X.AnonymousClass000.A0X(r6, r13)
            X.C159737mN.A01(r12, r6)
            r13 = 0
        L_0x09d9:
            r6 = 44
            java.lang.Object r6 = A05(r1, r6)     // Catch:{ 6u2 -> 0x09e8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u2 -> 0x09e8 }
            if (r6 == 0) goto L_0x0a00
            float r11 = X.C162407s0.A01(r6)     // Catch:{ 6u2 -> 0x09e8 }
            goto L_0x0a00
        L_0x09e8:
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            java.lang.String r6 = "Invalid format for item-spacing: "
            r14.append(r6)
            r6 = 44
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = X.AnonymousClass000.A0X(r6, r14)
            X.C159737mN.A01(r12, r6)
        L_0x0a00:
            int r6 = (int) r13
            r31 = r6
            int r6 = (int) r11
            r30 = r6
            int r6 = (int) r7
            r29 = r6
            r6 = r15
            if (r8 != r9) goto L_0x0a0e
            r6 = r17
        L_0x0a0e:
            if (r8 != r9) goto L_0x0a12
            r17 = r15
        L_0x0a12:
            r15 = 0
            r28 = 0
            r27 = 1
            if (r8 != 0) goto L_0x0a1d
            r28 = 1
            r27 = 0
        L_0x0a1d:
            int r26 = android.view.View.MeasureSpec.getMode(r4)
            int r25 = android.view.View.MeasureSpec.getMode(r5)
            int[] r24 = X.C86664Kz.A1Z()
            r24 = {-1, -1} // fill-array
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r26 == 0) goto L_0x0b69
            int r13 = android.view.View.MeasureSpec.getSize(r4)
        L_0x0a35:
            if (r6 != 0) goto L_0x0a39
            r24[r0] = r13
        L_0x0a39:
            if (r25 == 0) goto L_0x0a3f
            int r14 = android.view.View.MeasureSpec.getSize(r5)
        L_0x0a3f:
            if (r17 != 0) goto L_0x0a43
            r24[r9] = r14
        L_0x0a43:
            r6 = r24[r0]
            r12 = -1
            if (r6 <= r12) goto L_0x0a98
            r11 = r24[r9]
            if (r11 <= r12) goto L_0x0a98
        L_0x0a4c:
            r12 = r24[r0]
            java.util.Iterator r17 = r10.iterator()
            r7 = 0
        L_0x0a53:
            boolean r6 = r17.hasNext()
            if (r6 == 0) goto L_0x0b6e
            java.lang.Object r6 = r17.next()
            int r15 = r7 + 1
            if (r7 >= 0) goto L_0x0a66
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0a66:
            X.7Vn r6 = (X.C151627Vn) r6
            X.0YK r18 = X.AnonymousClass0YK.A00
            X.84O r6 = r6.A01
            r14 = r12
            if (r8 != r9) goto L_0x0a70
            r14 = r11
        L_0x0a70:
            r13 = 1073741824(0x40000000, float:2.0)
            int r24 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r14 = r11
            if (r8 != r9) goto L_0x0a7a
            r14 = r12
        L_0x0a7a:
            int r25 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r19 = r32
            r20 = r2
            r21 = r6
            r22 = r1
            r23 = r8
            r26 = r9
            X.6NK r14 = r18.A0B(r19, r20, r21, r22, r23, r24, r25, r26)
            X.7Vn r13 = new X.7Vn
            r13.<init>(r14, r6)
            r10.set(r7, r13)
            r7 = r15
            goto L_0x0a53
        L_0x0a98:
            r23 = 0
            r22 = 0
            r21 = 0
            if (r28 == 0) goto L_0x0aa6
            r23 = r31
            r22 = r30
            r21 = r29
        L_0x0aa6:
            if (r27 != 0) goto L_0x0aae
            r31 = 0
            r30 = 0
            r29 = 0
        L_0x0aae:
            r11 = 0
            r20 = 0
            r7 = 0
            r19 = 0
        L_0x0ab4:
            int r6 = r10.size()
            if (r11 >= r6) goto L_0x0b22
            java.lang.Object r6 = r10.get(r11)
            X.7Vn r6 = (X.C151627Vn) r6
            X.6NK r6 = r6.A00
            java.lang.Object r6 = r6.A00()
            X.7nJ r6 = (X.C160247nJ) r6
            X.7Wn r6 = r6.A02
            r33 = r6
            boolean r18 = X.AnonymousClass000.A1T(r11)
            int r6 = X.AnonymousClass002.A03(r10)
            boolean r17 = X.AnonymousClass001.A1X(r11, r6)
            int r6 = r33.A02()
            if (r17 == 0) goto L_0x0b56
            if (r18 == 0) goto L_0x0ae2
            int r6 = r23 + r6
        L_0x0ae2:
            int r6 = r6 + r22
        L_0x0ae4:
            int r15 = java.lang.Math.max(r15, r6)
            int r20 = r20 + r6
            r6 = r24[r0]
            if (r6 > r12) goto L_0x0afa
            if (r28 == 0) goto L_0x0af4
            r6 = r20
            if (r6 >= r13) goto L_0x0af8
        L_0x0af4:
            if (r27 == 0) goto L_0x0afa
            if (r15 < r13) goto L_0x0afa
        L_0x0af8:
            r24[r0] = r13
        L_0x0afa:
            int r6 = r33.A01()
            if (r17 == 0) goto L_0x0b4f
            if (r18 == 0) goto L_0x0b04
            int r6 = r31 + r6
        L_0x0b04:
            int r6 = r6 + r30
        L_0x0b06:
            int r7 = java.lang.Math.max(r7, r6)
            int r19 = r19 + r6
            if (r25 == 0) goto L_0x0b1a
            if (r27 == 0) goto L_0x0b14
            r6 = r19
            if (r6 >= r14) goto L_0x0b18
        L_0x0b14:
            if (r28 == 0) goto L_0x0b1a
            if (r7 < r14) goto L_0x0b1a
        L_0x0b18:
            r24[r9] = r14
        L_0x0b1a:
            r6 = r24[r0]
            if (r6 <= r12) goto L_0x0b4b
            r6 = r24[r9]
            if (r6 <= r12) goto L_0x0b4b
        L_0x0b22:
            r6 = r24[r0]
            if (r6 > r12) goto L_0x0b2e
            if (r26 != 0) goto L_0x0b3d
            if (r28 == 0) goto L_0x0b2c
            r15 = r20
        L_0x0b2c:
            r24[r0] = r15
        L_0x0b2e:
            r11 = r24[r9]
            if (r11 > r12) goto L_0x0a4c
            if (r25 != 0) goto L_0x0b5d
            if (r27 == 0) goto L_0x0b38
            r7 = r19
        L_0x0b38:
            r24[r9] = r7
            r11 = r7
            goto L_0x0a4c
        L_0x0b3d:
            if (r28 == 0) goto L_0x0b46
            r6 = r20
            int r15 = java.lang.Math.min(r6, r13)
            goto L_0x0b2c
        L_0x0b46:
            int r15 = java.lang.Math.min(r15, r13)
            goto L_0x0b2c
        L_0x0b4b:
            int r11 = r11 + 1
            goto L_0x0ab4
        L_0x0b4f:
            if (r18 == 0) goto L_0x0b53
            int r6 = r31 + r6
        L_0x0b53:
            int r6 = r6 + r29
            goto L_0x0b06
        L_0x0b56:
            if (r18 == 0) goto L_0x0b5a
            int r6 = r23 + r6
        L_0x0b5a:
            int r6 = r6 + r21
            goto L_0x0ae4
        L_0x0b5d:
            if (r27 == 0) goto L_0x0b61
            r7 = r19
        L_0x0b61:
            int r11 = java.lang.Math.min(r7, r14)
            r24[r9] = r11
            goto L_0x0a4c
        L_0x0b69:
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0a35
        L_0x0b6e:
            int r6 = r1.A02
            r2 = 73
            boolean r0 = r1.A0W(r2, r0)
            X.7Aj r6 = X.C161147p5.A01(r10, r6, r0)
            goto L_0x0973
        L_0x0b7c:
            r28 = 1
            int r8 = X.AnonymousClass0JD.A00(r1)
            java.util.List r9 = r1.A0Q()
            X.0OS r11 = new X.0OS
            r11.<init>(r2, r1)
            java.util.List r7 = r1.A0Q()
            java.util.ArrayList r27 = X.AnonymousClass000.A0p(r7)
            X.C162457s7.A0D(r9)
            java.util.Iterator r12 = r9.iterator()
        L_0x0b9a:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto L_0x0bbb
            java.lang.Object r10 = r12.next()
            X.84O r10 = (X.AnonymousClass84O) r10
            X.C162457s7.A0B(r10)
            int r9 = X.AnonymousClass0Xk.A03(r10, r8, r4)
            int r7 = X.AnonymousClass0Xk.A02(r10, r8, r5)
            X.7Vn r9 = X.AnonymousClass0VE.A02(r11, r2, r10, r9, r7)
            r7 = r27
            r7.add(r9)
            goto L_0x0b9a
        L_0x0bbb:
            r2 = 63
            boolean r2 = r1.A0W(r2, r0)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0bea
            int r10 = android.view.View.MeasureSpec.getMode(r4)
            int r9 = android.view.View.MeasureSpec.getMode(r5)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x0bd5
            if (r10 != r7) goto L_0x0bea
        L_0x0bd5:
            if (r9 == r2) goto L_0x0bd9
            if (r9 != r7) goto L_0x0bea
        L_0x0bd9:
            int[] r13 = new int[r6]
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            r13[r0] = r2
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            r13[r28] = r2
        L_0x0be7:
            if (r13 != 0) goto L_0x0c55
            goto L_0x0bec
        L_0x0bea:
            r13 = 0
            goto L_0x0be7
        L_0x0bec:
            r2 = 55
            java.lang.Object r9 = A05(r1, r2)     // Catch:{ 6u2 -> 0x15e7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ 6u2 -> 0x15e7 }
            r2 = 56
            java.lang.Object r10 = A05(r1, r2)     // Catch:{ 6u2 -> 0x15e7 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ 6u2 -> 0x15e7 }
            r2 = 44
            java.lang.Object r7 = A05(r1, r2)     // Catch:{ 6u2 -> 0x15e7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ 6u2 -> 0x15e7 }
            if (r9 != 0) goto L_0x0c07
            goto L_0x0c0c
        L_0x0c07:
            float r9 = X.C162407s0.A01(r9)     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0c0d
        L_0x0c0c:
            r9 = 0
        L_0x0c0d:
            if (r10 != 0) goto L_0x0c2d
            r2 = 0
        L_0x0c10:
            if (r7 != 0) goto L_0x0c28
            r7 = 0
        L_0x0c13:
            int r2 = (int) r2     // Catch:{ 6u2 -> 0x15e7 }
            r26 = r2
            int r2 = (int) r7     // Catch:{ 6u2 -> 0x15e7 }
            r25 = r2
            int r2 = (int) r9     // Catch:{ 6u2 -> 0x15e7 }
            r24 = r2
            r14 = 0
            r23 = 0
            r22 = 1
            if (r8 != 0) goto L_0x0c32
            r23 = 1
            r22 = 0
            goto L_0x0c32
        L_0x0c28:
            float r7 = X.C162407s0.A01(r7)     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0c13
        L_0x0c2d:
            float r2 = X.C162407s0.A01(r10)     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0c10
        L_0x0c32:
            int r12 = android.view.View.MeasureSpec.getMode(r4)     // Catch:{ 6u2 -> 0x15e7 }
            int r11 = android.view.View.MeasureSpec.getMode(r5)     // Catch:{ 6u2 -> 0x15e7 }
            int[] r13 = new int[r6]     // Catch:{ 6u2 -> 0x15e7 }
            r13 = {-1, -1} // fill-array     // Catch:{ 6u2 -> 0x15e7 }
            int r10 = android.view.View.MeasureSpec.getSize(r4)     // Catch:{ 6u2 -> 0x15e7 }
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x0c49
            r13[r0] = r10     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0c49:
            int r9 = android.view.View.MeasureSpec.getSize(r5)     // Catch:{ 6u2 -> 0x15e7 }
            if (r11 != r2) goto L_0x0c51
            r13[r28] = r9     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0c51:
            if (r12 != r2) goto L_0x0c78
            if (r11 != r2) goto L_0x0c78
        L_0x0c55:
            r8 = r13[r0]
            r9 = r13[r28]
            int r6 = r1.A02
            r2 = 73
            boolean r2 = r1.A0W(r2, r0)
            r0 = r27
            X.7Aj r7 = X.C161147p5.A01(r0, r6, r2)
            X.7JG r6 = new X.7JG
            r6.<init>(r0, r8, r9)
            X.0Cq r2 = new X.0Cq
            r2.<init>(r7, r6)
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r8, r9)
            goto L_0x00ac
        L_0x0c78:
            r21 = 0
            r20 = 0
            r19 = 0
            if (r23 == 0) goto L_0x0c86
            r21 = r26
            r20 = r25
            r19 = r24
        L_0x0c86:
            if (r22 != 0) goto L_0x0c8e
            r26 = 0
            r25 = 0
            r24 = 0
        L_0x0c8e:
            r8 = 0
            r18 = 0
            r7 = 0
            r6 = 0
        L_0x0c93:
            int r2 = r27.size()     // Catch:{ 6u2 -> 0x15e7 }
            if (r8 >= r2) goto L_0x0d16
            r2 = r27
            java.lang.Object r2 = r2.get(r8)     // Catch:{ 6u2 -> 0x15e7 }
            X.7Vn r2 = (X.C151627Vn) r2     // Catch:{ 6u2 -> 0x15e7 }
            X.6NK r2 = r2.A00     // Catch:{ 6u2 -> 0x15e7 }
            java.lang.Object r2 = r2.A00()     // Catch:{ 6u2 -> 0x15e7 }
            X.7nJ r2 = (X.C160247nJ) r2     // Catch:{ 6u2 -> 0x15e7 }
            X.7Wn r2 = r2.A02     // Catch:{ 6u2 -> 0x15e7 }
            r29 = r2
            boolean r17 = X.AnonymousClass000.A1T(r8)
            int r2 = X.AnonymousClass002.A03(r27)     // Catch:{ 6u2 -> 0x15e7 }
            boolean r15 = X.AnonymousClass001.A1X(r8, r2)
            int r2 = r29.A02()     // Catch:{ 6u2 -> 0x15e7 }
            if (r15 == 0) goto L_0x0cc6
            if (r17 == 0) goto L_0x0cc3
            int r2 = r21 + r2
        L_0x0cc3:
            int r2 = r2 + r20
            goto L_0x0ccc
        L_0x0cc6:
            if (r17 == 0) goto L_0x0cca
            int r2 = r21 + r2
        L_0x0cca:
            int r2 = r2 + r19
        L_0x0ccc:
            int r14 = java.lang.Math.max(r14, r2)     // Catch:{ 6u2 -> 0x15e7 }
            int r18 = r18 + r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r2) goto L_0x0ce2
            if (r23 == 0) goto L_0x0cdc
            r2 = r18
            if (r2 >= r10) goto L_0x0ce0
        L_0x0cdc:
            if (r22 == 0) goto L_0x0ce2
            if (r14 < r10) goto L_0x0ce2
        L_0x0ce0:
            r13[r0] = r10     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0ce2:
            int r2 = r29.A01()     // Catch:{ 6u2 -> 0x15e7 }
            if (r15 == 0) goto L_0x0cef
            if (r17 == 0) goto L_0x0cec
            int r2 = r2 + r26
        L_0x0cec:
            int r2 = r2 + r25
            goto L_0x0cf5
        L_0x0cef:
            if (r17 == 0) goto L_0x0cf3
            int r2 = r2 + r26
        L_0x0cf3:
            int r2 = r2 + r24
        L_0x0cf5:
            int r7 = java.lang.Math.max(r7, r2)     // Catch:{ 6u2 -> 0x15e7 }
            int r6 = r6 + r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r2) goto L_0x0d08
            if (r22 == 0) goto L_0x0d02
            if (r6 >= r9) goto L_0x0d06
        L_0x0d02:
            if (r23 == 0) goto L_0x0d08
            if (r7 < r9) goto L_0x0d08
        L_0x0d06:
            r13[r28] = r9     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0d08:
            r15 = r13[r0]     // Catch:{ 6u2 -> 0x15e7 }
            r2 = -1
            if (r15 <= r2) goto L_0x0d12
            r15 = r13[r28]     // Catch:{ 6u2 -> 0x15e7 }
            if (r15 <= r2) goto L_0x0d12
            goto L_0x0d16
        L_0x0d12:
            int r8 = r8 + 1
            goto L_0x0c93
        L_0x0d16:
            if (r12 != 0) goto L_0x0d1d
            if (r23 == 0) goto L_0x0d2f
            r14 = r18
            goto L_0x0d2f
        L_0x0d1d:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != r2) goto L_0x0d31
            if (r23 == 0) goto L_0x0d24
            goto L_0x0d29
        L_0x0d24:
            int r14 = java.lang.Math.min(r14, r10)     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0d2f
        L_0x0d29:
            r2 = r18
            int r14 = java.lang.Math.min(r2, r10)     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0d2f:
            r13[r0] = r14     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0d31:
            if (r11 != 0) goto L_0x0d3a
            if (r22 == 0) goto L_0x0d36
            r7 = r6
        L_0x0d36:
            r13[r28] = r7     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0c55
        L_0x0d3a:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r2) goto L_0x0c55
            if (r22 == 0) goto L_0x0d45
            int r2 = java.lang.Math.min(r6, r9)     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0d49
        L_0x0d45:
            int r2 = java.lang.Math.min(r7, r9)     // Catch:{ 6u2 -> 0x15e7 }
        L_0x0d49:
            r13[r28] = r2     // Catch:{ 6u2 -> 0x15e7 }
            goto L_0x0c55
        L_0x0d4d:
            r6 = 13326(0x340e, float:1.8674E-41)
            if (r7 != r6) goto L_0x0d5a
            if (r3 != 0) goto L_0x0f0a
            java.lang.String r0 = "ProgressBar binder returned a null ProgressBarView from createView"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0d5a:
            r6 = 13329(0x3411, float:1.8678E-41)
            if (r7 != r6) goto L_0x0ed5
            android.content.Context r6 = r2.A02
            X.8LO r14 = X.C161187pB.A01(r6)
            r6 = 1
            r14.A0c = r6
            r14.A09 = r0
            r6 = 42
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0d7e
            int r6 = X.C162407s0.A07(r6)     // Catch:{ 6u2 -> 0x15ee }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            X.AnonymousClass8LO.A00(r14, r6)
        L_0x0d7e:
            r6 = 40
            r7 = -1
            int r6 = r1.A0E(r6, r7)
            if (r6 <= r7) goto L_0x0d8d
            r14.A0H = r6
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r14.A0S = r6
        L_0x0d8d:
            r6 = 44
            java.util.List r7 = r1.A0S(r6)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x0da1
            X.0LR r6 = X.AnonymousClass0Yc.A03(r8, r1, r7, r0)
            java.lang.CharSequence r6 = r6.A00
            r14.A0X = r6
        L_0x0da1:
            r6 = 54
            java.lang.Object r9 = A05(r1, r6)
            java.lang.String r9 = (java.lang.String) r9
            android.content.Context r12 = r8.A00
            boolean r7 = X.C1443471e.A00(r12)
            if (r9 == 0) goto L_0x0dbd
            java.lang.String r6 = "text_first_strong"
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x0e00
            X.0ru r6 = X.AnonymousClass0K7.A03
        L_0x0dbb:
            r14.A0T = r6
        L_0x0dbd:
            r6 = 53
            X.84O r6 = r1.A0K(r6)
            if (r6 == 0) goto L_0x0dfe
            int r6 = X.C154127ce.A01(r8, r6, r0)
        L_0x0dc9:
            r14.A09 = r6
            r6 = 52
            int r6 = r1.A0E(r6, r0)
            r14.A0A = r6
            r6 = 46
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r1.A0E(r6, r9)
            r6 = 48
            int r10 = r1.A0E(r6, r9)
            if (r7 == r9) goto L_0x0de6
            r11 = 1
            if (r10 != r9) goto L_0x0de7
        L_0x0de6:
            r11 = 0
        L_0x0de7:
            if (r11 == 0) goto L_0x0dfb
            float r9 = X.C86604Kt.A00(r12)
            float r6 = (float) r7
            int r7 = X.AnonymousClass001.A07(r6, r9)
            float r6 = (float) r10
            int r6 = X.AnonymousClass001.A07(r6, r9)
            r14.A0E = r7
            r14.A0F = r6
        L_0x0dfb:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0e08
        L_0x0dfe:
            r6 = 0
            goto L_0x0dc9
        L_0x0e00:
            if (r7 == 0) goto L_0x0e05
            X.0ru r6 = X.AnonymousClass0K7.A02
            goto L_0x0dbb
        L_0x0e05:
            X.0ru r6 = X.AnonymousClass0K7.A01
            goto L_0x0dbb
        L_0x0e08:
            r6 = 67
            java.lang.Object r6 = A05(r1, r6)     // Catch:{ 6u2 -> 0x0e22 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u2 -> 0x0e22 }
            if (r6 != 0) goto L_0x0e13
            goto L_0x0e18
        L_0x0e13:
            float r7 = X.C162407s0.A01(r6)     // Catch:{ 6u2 -> 0x0e22 }
            goto L_0x0e1a
        L_0x0e18:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0e1a:
            r6 = 0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0e2a
            r14.A02 = r7     // Catch:{ 6u2 -> 0x0e22 }
            goto L_0x0e2a
        L_0x0e22:
            r9 = move-exception
            java.lang.String r7 = "BKBloksComponentsRichTextBinderUtil"
            java.lang.String r6 = "Error parsing lineHeight for RichText"
            X.C159737mN.A00(r8, r7, r6, r9)
        L_0x0e2a:
            r6 = 38
            float r9 = r1.A0B(r6, r10)
            r7 = r11 ^ 1
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0e3b
            r14.A0b = r7
            r14.A03 = r9
        L_0x0e3b:
            r6 = 68
            boolean r7 = r1.A0W(r6, r0)
            r6 = 32
            if (r7 == 0) goto L_0x0e47
            r6 = 69
        L_0x0e47:
            java.util.List r6 = r1.A0S(r6)
            X.0LR r7 = X.AnonymousClass0Yc.A03(r8, r1, r6, r7)
            java.lang.String r6 = r7.A01
            r14.A0Y = r6
            java.lang.CharSequence r6 = r7.A00
            android.text.SpannableString r20 = android.text.SpannableString.valueOf(r6)
            r6 = 50
            boolean r6 = r1.A0W(r6, r0)
            if (r6 == 0) goto L_0x0e64
            X.C158977kt.A00()
        L_0x0e64:
            r6 = 140(0x8c, float:1.96E-43)
            X.84O r13 = r1.A0K(r6)
            if (r13 == 0) goto L_0x0ec2
            r6 = 65
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "background start padding"
            float r12 = A00(r8, r7, r6)
            r6 = 63
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "background end padding"
            float r11 = A00(r8, r7, r6)
            r6 = 66
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "background top padding"
            float r10 = A00(r8, r7, r6)
            r6 = 62
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "background bottom padding"
            float r9 = A00(r8, r7, r6)
            r6 = 58
            java.lang.Object r7 = A05(r1, r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "background corner radius"
            float r7 = A00(r8, r7, r6)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r12, r10, r11, r9)
            int r8 = X.C154127ce.A01(r8, r13, r0)
            X.7JH r0 = new X.7JH
            r0.<init>(r6, r7, r8)
            r14.A0V = r0
        L_0x0ec2:
            r0 = r3
            X.6NC r0 = (X.AnonymousClass6NC) r0
            r17 = r2
            r18 = r0
            r19 = r14
            r21 = r4
            r22 = r5
            X.84M r0 = X.C161607q4.A02(r17, r18, r19, r20, r21, r22)
            goto L_0x00ac
        L_0x0ed5:
            r6 = 16160(0x3f20, float:2.2645E-41)
            if (r7 != r6) goto L_0x0efd
            int r6 = android.view.View.MeasureSpec.getMode(r5)
            if (r6 != 0) goto L_0x0efb
            java.lang.Object r2 = A04(r2, r3)
            android.view.View r2 = (android.view.View) r2
            r2.measure(r4, r5)
            int r2 = r2.getMeasuredHeight()
        L_0x0eec:
            int r6 = X.AnonymousClass73N.A00(r4, r0)
            int r2 = X.AnonymousClass73N.A00(r5, r2)
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x0efb:
            r2 = 0
            goto L_0x0eec
        L_0x0efd:
            r6 = 13666(0x3562, float:1.915E-41)
            if (r7 != r6) goto L_0x0f16
            if (r3 != 0) goto L_0x0f0a
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0f0a:
            java.lang.Object r0 = A04(r2, r3)
            android.view.View r0 = (android.view.View) r0
            X.84M r0 = A03(r0, r3, r4, r5)
            goto L_0x00ac
        L_0x0f16:
            r6 = 13335(0x3417, float:1.8686E-41)
            if (r7 != r6) goto L_0x10e3
            android.content.Context r6 = r2.A02
            r17 = r6
            X.8LO r14 = X.C161187pB.A01(r17)
            r6 = 1
            r14.A0c = r6
            r14.A09 = r0
            r6 = 42
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0f3c
            int r6 = X.C162407s0.A07(r6)     // Catch:{ 6u2 -> 0x15f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            X.AnonymousClass8LO.A00(r14, r6)
        L_0x0f3c:
            r6 = 38
            r13 = -1
            int r6 = r1.A0E(r6, r13)
            if (r6 <= r13) goto L_0x0f4b
            r14.A0H = r6
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.END
            r14.A0S = r6
        L_0x0f4b:
            r6 = 51
            java.util.List r7 = r1.A0S(r6)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x0f78
            X.0LR r6 = X.AnonymousClass0Yc.A03(r8, r1, r7, r0)
            java.lang.CharSequence r6 = r6.A00
        L_0x0f5d:
            r14.A0X = r6
        L_0x0f5f:
            r6 = 45
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r15 = ""
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == 0) goto L_0x0fd8
            r7 = 53
            java.lang.Object r7 = A05(r1, r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0fd2
            goto L_0x0f83
        L_0x0f78:
            r6 = 49
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0f5f
            goto L_0x0f5d
        L_0x0f83:
            java.lang.String r9 = "[^0-9.]"
            java.lang.String r11 = r6.replaceAll(r9, r15)     // Catch:{ 6u2 -> 0x15fa }
            int r9 = r11.length()     // Catch:{ 6u2 -> 0x15fa }
            int r6 = r6.length()     // Catch:{ 6u2 -> 0x15fa }
            if (r9 == r6) goto L_0x0f9a
            java.lang.String r9 = "text_size_ignored"
            java.lang.String r6 = "Only specify a size value for text_size if also specifying the text_size_unit property."
            X.C159737mN.A01(r9, r6)     // Catch:{ 6u2 -> 0x15fa }
        L_0x0f9a:
            float r12 = java.lang.Float.parseFloat(r11)     // Catch:{ 6u2 -> 0x15fa }
            int r6 = r7.hashCode()     // Catch:{ 6u2 -> 0x15fa }
            switch(r6) {
                case 3212: goto L_0x0fc7;
                case 3592: goto L_0x0fbe;
                case 3677: goto L_0x0fb5;
                default: goto L_0x0fa5;
            }     // Catch:{ 6u2 -> 0x15fa }
        L_0x0fa5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 6u2 -> 0x15fa }
            java.lang.String r0 = "can't parse unknown textUniSize: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ 6u2 -> 0x15fa }
            X.6u2 r0 = new X.6u2     // Catch:{ 6u2 -> 0x15fa }
            r0.<init>(r1)     // Catch:{ 6u2 -> 0x15fa }
            throw r0     // Catch:{ 6u2 -> 0x15fa }
        L_0x0fb5:
            java.lang.String r6 = "sp"
            boolean r6 = r7.equals(r6)     // Catch:{ 6u2 -> 0x15fa }
            if (r6 != 0) goto L_0x0fd6
            goto L_0x0fa5
        L_0x0fbe:
            java.lang.String r6 = "px"
            boolean r6 = r7.equals(r6)     // Catch:{ 6u2 -> 0x15fa }
            if (r6 == 0) goto L_0x0fa5
            goto L_0x0fd0
        L_0x0fc7:
            java.lang.String r6 = "dp"
            boolean r6 = r7.equals(r6)     // Catch:{ 6u2 -> 0x15fa }
            if (r6 == 0) goto L_0x0fa5
            goto L_0x0fdc
        L_0x0fd0:
            r11 = 0
            goto L_0x0fdd
        L_0x0fd2:
            float r12 = X.C162407s0.A02(r6)     // Catch:{ 6u2 -> 0x15fa }
        L_0x0fd6:
            r11 = 2
            goto L_0x0fdd
        L_0x0fd8:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = -1
            goto L_0x0fe8
        L_0x0fdc:
            r11 = 1
        L_0x0fdd:
            android.util.DisplayMetrics r6 = X.AnonymousClass000.A0B(r17)
            float r6 = android.util.TypedValue.applyDimension(r11, r12, r6)
            int r6 = (int) r6
            r14.A0O = r6
        L_0x0fe8:
            r6 = 46
            java.lang.Object r6 = A05(r1, r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = A06(r1)
            if (r8 == 0) goto L_0x1012
            if (r6 == 0) goto L_0x1002
            boolean r7 = r6.isEmpty()     // Catch:{ 6u2 -> 0x1600 }
            if (r7 != 0) goto L_0x1002
            int r13 = X.C162407s0.A09(r6)     // Catch:{ 6u2 -> 0x1600 }
        L_0x1002:
            if (r9 == 0) goto L_0x1012
            X.7kt r6 = X.C158977kt.A00()
            X.2UR r7 = r6.A03
            android.content.Context r6 = r8.A00
            android.graphics.Typeface r6 = r7.A00(r6, r9, r13)
            r14.A0R = r6
        L_0x1012:
            r6 = 59
            java.lang.Object r6 = A05(r1, r6)     // Catch:{ 6u2 -> 0x102c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 6u2 -> 0x102c }
            if (r6 != 0) goto L_0x101d
            goto L_0x1022
        L_0x101d:
            float r7 = X.C162407s0.A01(r6)     // Catch:{ 6u2 -> 0x102c }
            goto L_0x1024
        L_0x1022:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x1024:
            r6 = 0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x1034
            r14.A02 = r7     // Catch:{ 6u2 -> 0x102c }
            goto L_0x1034
        L_0x102c:
            r9 = move-exception
            java.lang.String r7 = "BKBloksComponentsTextBinderUtil"
            java.lang.String r6 = "Error parsing lineHeight for Text"
            X.C159737mN.A00(r8, r7, r6, r9)
        L_0x1034:
            r6 = 36
            float r9 = r1.A0B(r6, r10)
            r7 = 1
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x1044
            r14.A0b = r7
            r14.A03 = r9
        L_0x1044:
            r6 = 44
            X.84O r7 = r1.A0K(r6)
            if (r7 == 0) goto L_0x10db
            X.7kt r6 = X.C158977kt.A00()
            X.7hj r6 = r6.A07
            java.lang.CharSequence r6 = r6.A00(r7)
        L_0x1056:
            android.util.DisplayMetrics r10 = X.AnonymousClass000.A0B(r17)
            r7 = 48
            X.84O r7 = r1.A0K(r7)
            if (r7 == 0) goto L_0x10c5
            int r7 = X.C154127ce.A01(r8, r7, r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)
        L_0x106a:
            r7 = 50
            boolean r17 = r1.A0W(r7, r0)
            android.text.SpannableStringBuilder r15 = new android.text.SpannableStringBuilder
            r15.<init>()
            int r9 = r15.length()
            r15.append(r6)
            int r8 = r15.length()
            if (r18 == 0) goto L_0x108e
            int r7 = r18.intValue()
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r7)
            r15.setSpan(r6, r9, r8, r0)
        L_0x108e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x10a1
            float r6 = android.util.TypedValue.applyDimension(r11, r12, r10)
            int r7 = (int) r6
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            r6.<init>(r7)
            r15.setSpan(r6, r9, r8, r0)
        L_0x10a1:
            r6 = -1
            if (r13 == r6) goto L_0x10ac
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r13)
            r15.setSpan(r6, r9, r8, r0)
        L_0x10ac:
            if (r17 == 0) goto L_0x10b6
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r15.setSpan(r6, r9, r8, r0)
        L_0x10b6:
            r0 = r3
            X.6NC r0 = (X.AnonymousClass6NC) r0
            r6 = r2
            r7 = r0
            r8 = r14
            r9 = r15
            r10 = r4
            r11 = r5
            X.84M r0 = X.C161607q4.A02(r6, r7, r8, r9, r10, r11)
            goto L_0x00ac
        L_0x10c5:
            r7 = 43
            java.lang.Object r7 = A05(r1, r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x10d2
            r18 = 0
            goto L_0x106a
        L_0x10d2:
            int r7 = X.C162407s0.A05(r7)     // Catch:{ 6u2 -> 0x1606 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r7)     // Catch:{ 6u2 -> 0x1606 }
            goto L_0x106a
        L_0x10db:
            r6 = 41
            java.lang.String r6 = r1.A0P(r6, r15)
            goto L_0x1056
        L_0x10e3:
            r6 = 13708(0x358c, float:1.9209E-41)
            if (r7 != r6) goto L_0x10ed
            X.8vK r0 = com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil.calculateLayoutForComponent(r2, r1, r3, r4, r5)
            goto L_0x00ac
        L_0x10ed:
            r6 = 16444(0x403c, float:2.3043E-41)
            if (r7 != r6) goto L_0x10f7
            X.8vK r0 = com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil.calculateLayoutForComponent(r2, r1, r3, r4, r5)
            goto L_0x00ac
        L_0x10f7:
            r6 = 13797(0x35e5, float:1.9334E-41)
            if (r7 != r6) goto L_0x11fd
            r7 = 35
            r6 = 0
            float r18 = r1.A0B(r7, r6)
            java.util.List r9 = r1.A0Q()
            int r6 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x1127
            java.lang.Object r0 = r9.get(r0)
        L_0x110e:
            X.84O r0 = (X.AnonymousClass84O) r0
            X.8vK r0 = r0.AyJ(r2, r4, r5)
            java.util.ArrayList r7 = X.C18300x5.A0s(r0)
            int r6 = r0.getWidth()
            int r2 = r0.getHeight()
            X.0gz r0 = new X.0gz
            r0.<init>(r3, r7, r6, r2)
            goto L_0x00ac
        L_0x1127:
            r7 = 1
            r10 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x1133
            java.lang.Object r0 = r9.get(r7)
            goto L_0x110e
        L_0x1133:
            X.84O r6 = X.AnonymousClass6C9.A0V(r9, r0)
            X.8vK r12 = r6.AyJ(r2, r4, r5)
            X.84O r6 = X.AnonymousClass6C9.A0V(r9, r7)
            X.8vK r17 = r6.AyJ(r2, r4, r5)
            int r7 = r12.getWidth()
            float r6 = (float) r7
            int r2 = r17.getWidth()
            int r2 = r2 - r7
            float r2 = (float) r2
            float r2 = r2 * r18
            float r6 = r6 + r2
            int r15 = (int) r6
            int r7 = r12.getHeight()
            float r6 = (float) r7
            int r2 = r17.getHeight()
            int r2 = r2 - r7
            float r2 = (float) r2
            float r2 = r2 * r18
            float r6 = r6 + r2
            int r14 = (int) r6
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            if (r8 == 0) goto L_0x1613
            java.lang.Object r13 = X.C162377rs.A05(r8, r1)
            android.util.Pair r13 = (android.util.Pair) r13
            if (r13 == 0) goto L_0x160c
            r2 = 36
            boolean r2 = r1.A0W(r2, r0)
            if (r2 == 0) goto L_0x11f4
            int r2 = X.C18280x3.A03(r13)
            long r6 = (long) r2
            boolean r2 = X.C162377rs.A0B(r8)
            X.6ND r11 = new X.6ND
            r11.<init>(r8, r6, r2)
            float r10 = r10 - r18
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r6 = 0
            X.0h4 r7 = new X.0h4
            r7.<init>(r6)
            X.7i1 r2 = new X.7i1
            r2.<init>(r7, r10)
            r11.A0L(r2)
            r10 = 0
            int r23 = r12.getWidth()
            int r24 = r12.getHeight()
            X.84L r2 = new X.84L
            r19 = r2
            r20 = r12
            r21 = r11
            r22 = r6
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)
            int r6 = X.C18290x4.A03(r13)
            long r6 = (long) r6
            boolean r12 = X.C162377rs.A0B(r8)
            X.6ND r11 = new X.6ND
            r11.<init>(r8, r6, r12)
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            X.0h4 r7 = new X.0h4
            r7.<init>(r10)
            X.7i1 r6 = new X.7i1
            r6.<init>(r7, r8)
            r11.A0L(r6)
            int r22 = r17.getWidth()
            int r23 = r17.getHeight()
            X.84L r6 = new X.84L
            r18 = r6
            r19 = r17
            r20 = r11
            r21 = r10
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r9.add(r2)
            r9.add(r6)
        L_0x11ed:
            X.0gz r0 = new X.0gz
            r0.<init>(r3, r9, r15, r14)
            goto L_0x00ac
        L_0x11f4:
            r9.add(r12)
            r0 = r17
            r9.add(r0)
            goto L_0x11ed
        L_0x11fd:
            r6 = 13323(0x340b, float:1.867E-41)
            if (r7 == r6) goto L_0x1423
            r6 = 13327(0x340f, float:1.8675E-41)
            if (r7 != r6) goto L_0x1621
            r6 = 35
            java.lang.Object r8 = r9.get(r6)
            X.84O r8 = (X.AnonymousClass84O) r8
            if (r8 == 0) goto L_0x161a
            X.8vK r7 = r8.AyJ(r2, r4, r5)
            r12 = 0
            r6 = 2
            X.C162457s7.A0J(r7, r6)
            long r13 = X.C153917cG.A00(r4, r5)
            r9 = r2
            r10 = r7
            r11 = r8
            X.7nJ r8 = X.C160497nj.A00(r9, r10, r11, r12, r13)
            int[] r6 = new int[r6]
            int r2 = android.view.View.MeasureSpec.getMode(r4)
            if (r2 != 0) goto L_0x1252
            X.7Wn r2 = r8.A02
            int r2 = r2.A02()
        L_0x1231:
            r6[r0] = r2
            int r2 = android.view.View.MeasureSpec.getMode(r5)
            if (r2 != 0) goto L_0x124d
            X.7Wn r2 = r8.A02
            int r7 = r2.A01()
        L_0x123f:
            r2 = 1
            r6[r2] = r7
            r6 = r6[r0]
            X.7Wn r2 = r8.A02
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r6, r7)
            goto L_0x00ac
        L_0x124d:
            int r7 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x123f
        L_0x1252:
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            goto L_0x1231
        L_0x1257:
            java.lang.Object[] r6 = X.AnonymousClass002.A0L()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r7 = 0
            r6[r0] = r2
            java.lang.String r0 = "Attempting to calculateLayoutForComponent for unrecognized component style id %s"
            java.lang.String r2 = java.lang.String.format(r0, r6)
            java.lang.String r0 = "ComponentMapper"
            X.C159737mN.A01(r0, r2)
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x128a
            int r6 = android.view.View.MeasureSpec.getSize(r4)
        L_0x1279:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r2) goto L_0x1283
        L_0x127f:
            int r7 = android.view.View.MeasureSpec.getSize(r5)
        L_0x1283:
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r7)
            goto L_0x00ac
        L_0x128a:
            r6 = 0
            goto L_0x1279
        L_0x128c:
            r2 = 45
            java.lang.Object r2 = A05(r1, r2)     // Catch:{ 6u2 -> 0x1635 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6u2 -> 0x1635 }
            if (r2 != 0) goto L_0x1297
            goto L_0x129c
        L_0x1297:
            float r2 = X.C162407s0.A01(r2)     // Catch:{ 6u2 -> 0x1635 }
            goto L_0x129e
        L_0x129c:
            r2 = 1183252480(0x46870000, float:17280.0)
        L_0x129e:
            int r8 = (int) r2     // Catch:{ 6u2 -> 0x1635 }
            r2 = 40
            java.lang.Object r2 = A05(r1, r2)     // Catch:{ 6u2 -> 0x162f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6u2 -> 0x162f }
            if (r2 != 0) goto L_0x12aa
            goto L_0x12af
        L_0x12aa:
            float r2 = X.C162407s0.A01(r2)     // Catch:{ 6u2 -> 0x162f }
            goto L_0x12b1
        L_0x12af:
            r2 = 1183252480(0x46870000, float:17280.0)
        L_0x12b1:
            int r6 = (int) r2
            int[] r7 = X.C86664Kz.A1Z()
            int r2 = A01(r8, r4)
            r7[r0] = r2
            int r6 = A01(r6, r5)
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r7, r2, r6)
            goto L_0x00ac
        L_0x12cc:
            java.lang.Object r6 = A04(r2, r3)
            android.view.View r6 = (android.view.View) r6
            if (r8 == 0) goto L_0x163b
            r2 = 50
            java.lang.String r0 = ""
            java.lang.String r0 = r1.A0P(r2, r0)
            X.C159757mP.A01(r6, r8, r1, r0)
            X.84M r0 = A03(r6, r3, r4, r5)
            goto L_0x00ac
        L_0x12e5:
            X.8vU r0 = r6.A01
            java.lang.Object r9 = A04(r2, r3)
            android.view.View r9 = (android.view.View) r9
            if (r8 == 0) goto L_0x1642
            r7 = 0
            X.C1449473o.A00(r9, r8, r1, r0)
            r9.measure(r4, r5)
            int r6 = r9.getMeasuredWidth()
            int r2 = r9.getMeasuredHeight()
            r0 = 2131432936(0x7f0b15e8, float:1.8487644E38)
            android.view.View r0 = X.C06560Yg.A02(r9, r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setAdapter(r7)
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x1311:
            X.8vU r6 = r6.A01
            java.lang.Object r2 = A04(r2, r3)
            X.03n r2 = (X.AnonymousClass03n) r2
            if (r8 == 0) goto L_0x1649
            android.text.Spannable r0 = X.C159767mQ.A00(r8, r1, r6)
            X.C159767mQ.A01(r0, r2, r8, r1, r6)
            X.84M r0 = A03(r2, r3, r4, r5)
            goto L_0x00ac
        L_0x1328:
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r2.getDisplayMetrics()
            int[] r7 = X.C86664Kz.A1Z()
            int r2 = r6.widthPixels
            int r2 = A01(r2, r4)
            r7[r0] = r2
            int r2 = r6.heightPixels
            int r6 = A01(r2, r5)
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r6)
            goto L_0x00ac
        L_0x134e:
            java.lang.Object r2 = A04(r2, r3)
            android.view.View r2 = (android.view.View) r2
            int[] r7 = A0A(r2, r4, r5)
            int r6 = r2.getMeasuredHeight()
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r6)
            goto L_0x00ac
        L_0x1368:
            X.8vU r9 = r6.A01
            java.lang.Object r10 = A04(r2, r3)
            android.view.View r10 = (android.view.View) r10
            long r6 = X.C1449373n.A00(r1)
            int[] r14 = X.C86664Kz.A1Z()
            r12 = 0
            r11 = 1
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x13a6
            r2 = 38
            java.lang.Object r8 = A05(r1, r2)
            java.lang.String r8 = (java.lang.String) r8
            r2 = 2131433873(0x7f0b1991, float:1.8489544E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r10, r2)
            r2.setText(r8)
            r9.Bnp(r10, r6)
            r10.measure(r4, r5)
            int r2 = r10.getMeasuredWidth()
            r14[r0] = r2
            int r2 = r10.getMeasuredHeight()
            r14[r11] = r2
            r9.BrI(r10)
        L_0x13a6:
            r6 = r14[r0]
            r2 = r14[r11]
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x13b1:
            X.8vK r0 = X.AnonymousClass0VC.A02(r2, r3, r4, r5)
            goto L_0x00ac
        L_0x13b7:
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r6 = A01(r0, r4)
            int r2 = A01(r0, r5)
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x13c9:
            r0 = 36
            X.84O r8 = r1.A0K(r0)
            if (r8 == 0) goto L_0x1650
            int r0 = android.view.View.MeasureSpec.getSize(r5)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            r0 = 40
            X.84O r7 = r1.A0K(r0)
            if (r7 == 0) goto L_0x1421
            X.8vK r6 = r7.AyJ(r2, r4, r10)
            r13 = 0
            r0 = 2
            X.C162457s7.A0J(r6, r0)
            long r14 = X.C153917cG.A00(r4, r10)
            r10 = r2
            r11 = r6
            r12 = r7
            X.7nJ r7 = X.C160497nj.A00(r10, r11, r12, r13, r14)
        L_0x13f7:
            int r6 = android.view.View.MeasureSpec.getSize(r5)
            if (r7 == 0) goto L_0x141f
            X.7Wn r0 = r7.A02
            int r14 = r0.A01()
        L_0x1403:
            int r6 = r6 - r14
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            X.8vK r9 = r8.AyJ(r2, r4, r0)
            int r12 = android.view.View.MeasureSpec.getSize(r4)
            int r13 = r9.getHeight()
            int r13 = r13 + r14
            X.84L r0 = new X.84L
            r8 = r0
            r10 = r3
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x00ac
        L_0x141f:
            r14 = 0
            goto L_0x1403
        L_0x1421:
            r7 = 0
            goto L_0x13f7
        L_0x1423:
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r7 = A01(r2, r4)
            int r6 = A01(r2, r5)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0, r0, r7, r6)
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r7, r6)
            goto L_0x00ac
        L_0x143a:
            int r6 = X.AnonymousClass73N.A00(r4, r0)
            int r2 = X.AnonymousClass73N.A00(r5, r0)
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x1449:
            r2 = 1
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r2)
            goto L_0x00ac
        L_0x1451:
            X.8vU r9 = r6.A01
            if (r10 == 0) goto L_0x1657
            android.content.Context r6 = r2.A02
            r2 = 2131624177(0x7f0e00f1, float:1.8875526E38)
            android.view.View r8 = X.C86654Ky.A0G(r6, r2)
            java.lang.String r6 = A07(r1)
            r2 = 35
            boolean r2 = r1.A0W(r2, r0)
            r9.Ay3(r8, r6, r2)
            int[] r7 = A0A(r8, r4, r5)
            int r6 = r8.getMeasuredHeight()
            r2 = 1
            r7[r2] = r6
            r9.BrJ(r8)
            r6 = r7[r0]
            r2 = r7[r2]
            X.84M r0 = new X.84M
            r0.<init>(r3, r6, r2)
            goto L_0x00ac
        L_0x1484:
            X.8vU r7 = r6.A01
            android.content.Context r6 = r2.A02
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r6)
            if (r8 == 0) goto L_0x165e
            X.C1449673q.A00(r2, r8, r1, r7)
            int[] r7 = A0A(r2, r4, r5)
            int r6 = r2.getMeasuredHeight()
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r2, r6)
            goto L_0x00ac
        L_0x14a6:
            X.8vU r6 = r6.A01
            if (r8 == 0) goto L_0x1665
            if (r3 == 0) goto L_0x1665
            java.lang.Object r2 = A04(r2, r3)
            android.view.View r2 = (android.view.View) r2
            X.C1449273m.A00(r2, r8, r1, r6)
            int[] r7 = A0A(r2, r4, r5)
            int r6 = r2.getMeasuredHeight()
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r7, r2, r6)
            goto L_0x00ac
        L_0x14c9:
            X.8vU r9 = r6.A01
            if (r10 == 0) goto L_0x166c
            if (r9 == 0) goto L_0x166c
            android.content.Context r6 = r2.A02
            r2 = 2131624163(0x7f0e00e3, float:1.8875498E38)
            r7 = 0
            android.view.View r8 = android.view.View.inflate(r6, r2, r7)
            r2 = 52
            r6 = 1
            r1.A0W(r2, r6)
            r2 = 56
            r1.A0W(r2, r6)
            r2 = 59
            r1.A0W(r2, r0)
            r2 = 44
            java.util.List r2 = r1.A0S(r2)
            java.util.Iterator r17 = r2.iterator()
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x14f6:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x1526
            java.lang.Object r12 = r17.next()
            X.84O r12 = (X.AnonymousClass84O) r12
            r10 = 36
            java.lang.String r2 = "regular"
            java.lang.String r10 = r12.A0P(r10, r2)
            java.lang.String r2 = "hd"
            boolean r11 = r10.equals(r2)
            r10 = 35
            r2 = 41
            if (r11 == 0) goto L_0x159a
            android.net.Uri r15 = A02(r12)
        L_0x151a:
            int r14 = r12.A0E(r2, r0)
            int r13 = r12.A0E(r10, r0)
        L_0x1522:
            if (r15 == 0) goto L_0x14f6
            if (r7 == 0) goto L_0x14f6
        L_0x1526:
            if (r8 == 0) goto L_0x152c
            if (r7 != 0) goto L_0x1544
            if (r15 != 0) goto L_0x1544
        L_0x152c:
            int[] r10 = A0A(r8, r4, r5)
            int r2 = r8.getMeasuredHeight()
            r10[r6] = r2
            r9.BrG(r8)
            r7 = r10[r0]
            r2 = r10[r6]
            X.84M r0 = new X.84M
            r0.<init>(r3, r7, r2)
            goto L_0x00ac
        L_0x1544:
            r2 = 2131434675(0x7f0b1cb3, float:1.849117E38)
            android.view.View r2 = r8.findViewById(r2)
            com.whatsapp.videoplayback.BloksVideoPlayerView r2 = (com.whatsapp.videoplayback.BloksVideoPlayerView) r2
            if (r15 != 0) goto L_0x1598
            if (r7 == 0) goto L_0x152c
        L_0x1551:
            X.6qG r10 = r2.A09
            if (r10 != 0) goto L_0x1593
            X.1VX r24 = r2.getAbProps()
            X.3Wi r19 = r2.getGlobalUI()
            X.33i r22 = r2.getSystemServices()
            android.content.Context r17 = r2.getContext()
            X.2oU r23 = r2.getWaContext()
            com.whatsapp.Mp4Ops r20 = r2.getMp4Ops()
            X.2qk r18 = r2.getCrashLogs()
            X.7bG r21 = r2.getWamediaWamLogger()
            java.lang.String r25 = r7.toString()
            X.5YG r10 = X.AnonymousClass5VT.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r7 = "null cannot be cast to non-null type com.whatsapp.videoplayback.ExoPlayerVideoPlayer"
            X.C162457s7.A0K(r10, r7)
            X.6qG r10 = (X.C138386qG) r10
            r2.A09 = r10
            if (r10 != 0) goto L_0x1593
            r11 = 0
        L_0x1589:
            r10 = -1
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r10, r10)
            r2.addView(r11, r0, r7)
            goto L_0x152c
        L_0x1593:
            android.view.View r11 = r10.A09()
            goto L_0x1589
        L_0x1598:
            r7 = r15
            goto L_0x1551
        L_0x159a:
            android.net.Uri r7 = A02(r12)
            if (r14 == 0) goto L_0x151a
            if (r13 != 0) goto L_0x1522
            goto L_0x151a
        L_0x15a4:
            if (r3 == 0) goto L_0x1673
            java.lang.Object r2 = A04(r2, r3)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.View"
            X.C162457s7.A0K(r2, r0)
            android.view.View r2 = (android.view.View) r2
            X.84M r0 = A03(r2, r3, r4, r5)
            goto L_0x00ac
        L_0x15b7:
            int[] r7 = X.C86664Kz.A1Z()
            int r2 = X.AnonymousClass73N.A00(r4, r0)
            r7[r0] = r2
            int r6 = X.AnonymousClass73N.A00(r5, r0)
            r2 = 1
            r7[r2] = r6
            r2 = r7[r0]
            X.84M r0 = new X.84M
            r0.<init>(r3, r7, r2, r6)
            goto L_0x00ac
        L_0x15d1:
            java.util.Map r0 = r0.A01
            java.lang.Object r3 = r0.get(r1)
            X.7JE r3 = (X.AnonymousClass7JE) r3
            goto L_0x000f
        L_0x15db:
            java.lang.String r0 = "A render unit was defined for this component but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x15e2:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x15e7:
            java.lang.String r0 = "Invalid pixel format for Collection spacing"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x15ee:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x15f4:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x15fa:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x1600:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x1606:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x160c:
            java.lang.String r0 = "Controller for component returned null but it should have returned a Pair<Integer, Integer>"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x1613:
            java.lang.String r0 = "Calculate layout was called without a valid BloksContext"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x161a:
            java.lang.String r0 = "PTR container has no child"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x1621:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.AnonymousClass000.A1P(r1, r7, r0)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0W(r0, r1)
            throw r0
        L_0x162f:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x1635:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x163b:
            java.lang.String r0 = "Cannot measure WaRcFormInputComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1642:
            java.lang.String r0 = "Cannot measure WaRcListViewBinderUtil's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1649:
            java.lang.String r0 = "Cannot measure WaRichTextComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1650:
            java.lang.String r0 = "bk.cds.bottomsheet.Wrapper has no content."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x1657:
            java.lang.String r0 = "Cannot measure WaRcVideoViewComponentBinderUtils's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x165e:
            java.lang.String r0 = "Cannot measure WaTextWithEntitiesComponent's render unit with a null BloksContext"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1665:
            java.lang.String r0 = "Cannot measure WaRcCheckBoxComponentBinderUtils's render unit with a null BloksContext or RenderUnit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x166c:
            java.lang.String r0 = "Cannot measure BKVideoComponentBinderUtils's render unit with a null BloksContext or WaBkComponentConfigurator"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x1673:
            java.lang.String r0 = "A render unit was defined for this node but none was found"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass84O.AyJ(X.7aU, int, int):X.8vK");
    }

    public AnonymousClass84O(AnonymousClass84O r2, AnonymousClass84O r3, List list, int i) {
        this.A06 = r2.A06;
        this.A04 = r2.A04.clone();
        this.A03 = r2.A03;
        this.A02 = i;
        this.A07 = list;
        this.A05 = r3;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        AnonymousClass79U.A03.incrementAndGet();
    }

    public AnonymousClass84O(int i) {
        this.A06 = null;
        this.A04 = AnonymousClass6CA.A0I();
        this.A03 = i;
        this.A02 = AnonymousClass77G.A00.incrementAndGet();
        this.A07 = null;
        this.A05 = null;
        AnonymousClass79U.A03.incrementAndGet();
    }

    public AnonymousClass84O(AnonymousClass84O r2, AnonymousClass7MQ r3) {
        LinkedList linkedList = r2.A06;
        linkedList = linkedList == null ? AnonymousClass0x9.A18() : linkedList;
        this.A06 = linkedList;
        linkedList.addFirst(r3);
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A07 = r2.A07;
        AnonymousClass84O r0 = r2.A05;
        this.A05 = r0 == null ? null : r0;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        AnonymousClass79U.A03.incrementAndGet();
    }
}
