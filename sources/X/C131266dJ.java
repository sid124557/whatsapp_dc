package X;

import android.util.SparseArray;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6dJ  reason: invalid class name and case insensitive filesystem */
public class C131266dJ extends C151147Tp {
    public static final AnonymousClass71U A0B = new AnonymousClass71U();
    public final C153427bI A00;
    public final C158847ke A01;
    public final C154997e7 A02;
    public final C155007e8 A03;
    public final C141446va A04;
    public final C156077fz A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;
    public final Map A09;
    public final Set A0A;

    public static C131266dJ A00(C153427bI r15, C156077fz r16, List list) {
        C835348u A042 = C162377rs.A04(r15);
        C155007e8 r7 = new C155007e8();
        SparseArray sparseArray = r15.A01;
        C154707dc r2 = C154707dc.A00;
        C141446va r8 = C141446va.Action;
        return new C131266dJ(r2, r15, (C153427bI) null, (C158847ke) null, (C154997e7) sparseArray.get(R.id.bk_context_key_performance_logger), r7, r8, r16, A042, (String) sparseArray.get(R.id.bk_context_key_logging_id), (String) null, list, (Map) null, (Set) null);
    }

    public C131266dJ(C154707dc r3, C153427bI r4, C153427bI r5, C158847ke r6, C154997e7 r7, C155007e8 r8, C141446va r9, C156077fz r10, C835348u r11, String str, String str2, List list, Map map, Set set) {
        super(A0B, r3, r11, list);
        this.A00 = r4;
        this.A05 = r10;
        this.A09 = map;
        this.A01 = r6;
        this.A0A = set;
        this.A03 = r8;
        this.A07 = str;
        this.A04 = r9;
        this.A08 = AnonymousClass0x9.A14(r5);
        this.A02 = r7;
        this.A03.A00.add(new AnonymousClass8DD());
        this.A06 = str2 == null ? C18280x3.A0Y() : str2;
    }

    public static C131266dJ A01(C131266dJ r16, List list) {
        C131266dJ r1 = r16;
        List list2 = list;
        if (list2 == r1.A04) {
            return r16;
        }
        C153427bI r5 = r1.A00;
        C156077fz r11 = r1.A05;
        Map map = r1.A09;
        C158847ke r7 = r1.A01;
        Set set = r1.A0A;
        C835348u r12 = r1.A02;
        C155007e8 r9 = r1.A03;
        String str = r1.A07;
        C154707dc r4 = r1.A01;
        String str2 = r1.A06;
        C131266dJ r3 = new C131266dJ(r4, r5, (C153427bI) null, r7, r1.A02, r9, r1.A04, r11, r12, str, str2, list2, map, set);
        AnonymousClass8DE r2 = r3.A03;
        CopyOnWriteArraySet copyOnWriteArraySet = r1.A03.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            r2.A00.addAll(copyOnWriteArraySet);
        }
        return r3;
    }

    public C153427bI A02() {
        if (C161827qc.A04()) {
            return (C153427bI) this.A08.get();
        }
        return null;
    }
}
