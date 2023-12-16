package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5oe  reason: invalid class name and case insensitive filesystem */
public abstract class C115425oe implements C1230166s {
    public static final AtomicInteger A01 = new AtomicInteger(1);
    public final C186568vZ A00;

    public void B3O(C103995Pf r6, long j) {
        int i = (int) j;
        int A06 = C86664Kz.A06(j);
        String str = r6.A00;
        if (str != null) {
            this.A00.markerAnnotate(i, A06, "trigger_source_of_restart", str);
        }
        C186568vZ r1 = this.A00;
        r1.markerEnd(i, A06, 111);
        r1.BKl(i, A06, r6.A01);
        if (str != null) {
            r1.markerAnnotate(i, A06, "trigger_source", str);
        }
    }

    public void flowAnnotate(long j, String str, String str2) {
        int A06 = C86664Kz.A06(j);
        this.A00.markerAnnotate((int) j, A06, str, str2);
    }

    public void flowEndCancel(long j, String str) {
        int i = (int) j;
        int A06 = C86664Kz.A06(j);
        C186568vZ r1 = this.A00;
        r1.markerAnnotate(i, A06, "cancel_reason", str);
        r1.markerEnd(i, A06, 4);
    }

    public void flowEndFail(long j, String str, String str2) {
        int i = (int) j;
        int A06 = C86664Kz.A06(j);
        if (str == null) {
            str = "<NULL>";
        }
        C186568vZ r1 = this.A00;
        r1.markerAnnotate(i, A06, "uf_has_error", true);
        if (str2 != null) {
            r1.markerPoint(i, A06, str, str2);
        } else {
            r1.markerPoint(i, A06, str);
        }
        r1.markerEnd(i, A06, 3);
    }

    public void flowEndSuccess(long j) {
        int A06 = C86664Kz.A06(j);
        this.A00.markerEnd((int) j, A06, 2);
    }

    public void flowMarkPoint(long j, String str) {
        int A06 = C86664Kz.A06(j);
        this.A00.markerPoint((int) j, A06, str);
    }

    public C115425oe(C186568vZ r1) {
        this.A00 = r1;
    }

    public void flowAnnotate(long j, String str, boolean z) {
        int A06 = C86664Kz.A06(j);
        this.A00.markerAnnotate((int) j, A06, str, z);
    }
}
