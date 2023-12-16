package X;

import android.util.LongSparseArray;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.7Wn  reason: invalid class name and case insensitive filesystem */
public final class C151847Wn {
    public final long A00;
    public final LongSparseArray A01 = new LongSparseArray();
    public final RenderTreeNode A02;
    public final Object A03;
    public final RenderTreeNode[] A04;

    public C151847Wn(RenderTreeNode renderTreeNode, Object obj, RenderTreeNode[] renderTreeNodeArr, long j) {
        Object valueOf;
        RenderTreeNode[] renderTreeNodeArr2 = renderTreeNodeArr;
        C162457s7.A0J(renderTreeNodeArr2, 2);
        this.A02 = renderTreeNode;
        this.A04 = renderTreeNodeArr2;
        this.A00 = j;
        this.A03 = obj;
        int length = renderTreeNodeArr2.length;
        int i = 0;
        while (i < length) {
            RenderTreeNode[] renderTreeNodeArr3 = this.A04;
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr3[i];
            LongSparseArray longSparseArray = this.A01;
            if (longSparseArray.get(renderTreeNode2.A07.A0B()) == null) {
                this.A01.put(this.A04[i].A07.A0B(), Integer.valueOf(i));
                i++;
            } else {
                Number number = (Number) longSparseArray.get(renderTreeNode2.A07.A0B());
                C162457s7.A0B(number);
                RenderTreeNode renderTreeNode3 = renderTreeNodeArr3[number.intValue()];
                Locale locale = Locale.US;
                Object[] objArr = new Object[5];
                C18270x1.A1Q(objArr, i);
                C18300x5.A1K(renderTreeNode2.A00((C151847Wn) null), number, objArr);
                objArr[3] = renderTreeNode3.A00((C151847Wn) null);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("RenderTree details:\n");
                Object[] objArr2 = new Object[1];
                long j2 = this.A00;
                C153227at A002 = AnonymousClass71Z.A00(C86664Kz.A06(j2));
                int A022 = A002.A02(j2);
                Object obj2 = "Infinity";
                if (A022 == Integer.MAX_VALUE) {
                    valueOf = obj2;
                } else {
                    valueOf = Integer.valueOf(A022);
                }
                int i2 = (int) j2;
                int A012 = AnonymousClass71Z.A00(i2).A01(j2);
                obj2 = A012 != Integer.MAX_VALUE ? Integer.valueOf(A012) : obj2;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("SizeConstraints[minWidth = ");
                A0o2.append(A002.A04(j2));
                A0o2.append(", maxWidth = ");
                A0o2.append(valueOf);
                A0o2.append(", minHeight = ");
                A0o2.append(AnonymousClass71Z.A00(i2).A03(j2));
                A0o2.append(", maxHeight = ");
                A0o2.append(obj2);
                objArr2[0] = AnonymousClass0x2.A0f(A0o2);
                A0o.append(C86654Ky.A0n(locale, "%s\n", Arrays.copyOf(objArr2, 1)));
                Object[] objArr3 = new Object[1];
                int length2 = renderTreeNodeArr3.length;
                AnonymousClass000.A1P(objArr3, length2, 0);
                A0o.append(C86654Ky.A0n(locale, "Full child list (size = %d):\n", Arrays.copyOf(objArr3, 1)));
                for (int i3 = 0; i3 < length2; i3++) {
                    A0o.append(C86654Ky.A0n(locale, "%s\n", Arrays.copyOf(new Object[]{renderTreeNodeArr3[i3].A00(this)}, 1)));
                }
                objArr[4] = C18290x4.A0o(A0o);
                throw AnonymousClass001.A0e(C86654Ky.A0n(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", Arrays.copyOf(objArr, 5)));
            }
        }
    }

    public static boolean A00(C151847Wn r7, long j) {
        long j2 = r7.A00;
        int A022 = r7.A02();
        return C159227lS.A02(j, j2, (((long) r7.A01()) & 4294967295L) | (((long) A022) << 32));
    }

    public final int A01() {
        return this.A02.A04.height();
    }

    public final int A02() {
        return this.A02.A04.width();
    }
}
