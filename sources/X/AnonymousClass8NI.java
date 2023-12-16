package X;

import java.util.Comparator;

/* renamed from: X.8NI  reason: invalid class name */
public class AnonymousClass8NI implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C151187Tt r6 = (C151187Tt) obj;
        C151187Tt r7 = (C151187Tt) obj2;
        long j = r6.A01;
        long j2 = r7.A01;
        if (j == j2) {
            return r6.A03 - r7.A03;
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }
}
