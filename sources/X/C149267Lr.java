package X;

import java.util.AbstractCollection;
import java.util.TreeMap;

/* renamed from: X.7Lr  reason: invalid class name and case insensitive filesystem */
public class C149267Lr {
    public C149257Lq A00;
    public AnonymousClass7JC A01;
    public boolean A02;
    public boolean A03;

    public C149267Lr(C166567yu r8) {
        AnonymousClass7JC r0;
        int A002;
        AbstractCollection abstractCollection;
        int[] iArr;
        try {
            C166507yn r6 = r8.A08;
            TreeMap treeMap = r6.A01;
            if (treeMap == null || (iArr = (int[]) treeMap.get("trace_config.duration_condition")) == null || iArr.length <= 0) {
                r0 = null;
            } else {
                r0 = new AnonymousClass7JC(iArr);
            }
            this.A01 = r0;
            TreeMap treeMap2 = r6.A03;
            String[] strArr = null;
            if (!(treeMap2 == null || (abstractCollection = (AbstractCollection) treeMap2.get("trace_config.string_list_condition")) == null)) {
                strArr = (String[]) abstractCollection.toArray(new String[abstractCollection.size()]);
            }
            C149257Lq r3 = null;
            if (strArr != null && strArr.length > 0 && strArr[0].equals("annotation") && (A002 = r6.A00("trace_config.fallback_sampling_rate_for_string_list_condition", 0)) != 1) {
                r3 = new C149257Lq(strArr, A002);
            }
            this.A00 = r3;
        } catch (IllegalArgumentException unused) {
            this.A02 = true;
        }
        if (this.A01 != null || this.A00 != null) {
            this.A03 = true;
        }
    }
}
