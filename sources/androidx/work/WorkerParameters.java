package androidx.work;

import X.AnonymousClass0Xq;
import X.C03790Lo;
import X.C05500Tp;
import X.C15330rA;
import X.C16130sW;
import X.C16180sb;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public int A00;
    public AnonymousClass0Xq A01;
    public C16130sW A02;
    public C15330rA A03;
    public C05500Tp A04;
    public C03790Lo A05;
    public C16180sb A06;
    public Set A07;
    public UUID A08;
    public Executor A09;

    public WorkerParameters(AnonymousClass0Xq r2, C16130sW r3, C15330rA r4, C05500Tp r5, C03790Lo r6, C16180sb r7, Collection collection, UUID uuid, Executor executor, int i) {
        this.A08 = uuid;
        this.A01 = r2;
        this.A07 = new HashSet(collection);
        this.A05 = r6;
        this.A00 = i;
        this.A09 = executor;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}
