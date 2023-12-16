package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0OU  reason: invalid class name */
public class AnonymousClass0OU {
    public static int A03;
    public C07830ct A00;
    public C07830ct A01 = null;
    public ArrayList A02 = AnonymousClass001.A0s();

    public final long A00(C07820cs r10, long j) {
        C07830ct r4 = r10.A06;
        if (r4 instanceof AnonymousClass05T) {
            return j;
        }
        List list = r10.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C15710ro r8 = (C15710ro) list.get(i);
            if (r8 instanceof C07820cs) {
                C07820cs r82 = (C07820cs) r8;
                if (r82.A06 != r4) {
                    j2 = Math.min(j2, A00(r82, ((long) r82.A00) + j));
                }
            }
        }
        if (r10 != r4.A04) {
            return j2;
        }
        long A09 = r4.A09();
        C07820cs r42 = r4.A05;
        long j3 = j - A09;
        return Math.min(Math.min(j2, A00(r42, j3)), j3 - ((long) r42.A00));
    }

    public final long A01(C07820cs r10, long j) {
        C07830ct r4 = r10.A06;
        if (r4 instanceof AnonymousClass05T) {
            return j;
        }
        List list = r10.A07;
        int size = list.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C15710ro r8 = (C15710ro) list.get(i);
            if (r8 instanceof C07820cs) {
                C07820cs r82 = (C07820cs) r8;
                if (r82.A06 != r4) {
                    j2 = Math.max(j2, A01(r82, ((long) r82.A00) + j));
                }
            }
        }
        if (r10 != r4.A05) {
            return j2;
        }
        long A09 = r4.A09();
        C07820cs r42 = r4.A04;
        long j3 = j + A09;
        return Math.max(Math.max(j2, A01(r42, j3)), j3 - ((long) r42.A00));
    }

    public AnonymousClass0OU(C07830ct r2) {
        A03++;
        this.A00 = r2;
        this.A01 = r2;
    }
}
