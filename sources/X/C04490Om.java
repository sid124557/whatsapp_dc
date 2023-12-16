package X;

import android.content.Context;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0Om  reason: invalid class name and case insensitive filesystem */
public class C04490Om {
    public AnonymousClass0GB A00 = AnonymousClass0GB.AUTOMATIC;
    public C16060sP A01;
    public List A02 = AnonymousClass001.A0s();
    public Set A03;
    public Set A04 = new LinkedHashSet();
    public Executor A05;
    public Executor A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public final Context A0A;
    public final AnonymousClass0Q6 A0B = new AnonymousClass0Q6();
    public final String A0C;
    public final List A0D = AnonymousClass001.A0s();
    public final List A0E = AnonymousClass001.A0s();

    public C04490Om(Context context, String str) {
        this.A0A = context;
        this.A0C = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ea, code lost:
        r4.set(r2);
        r6.A02.put(r5, r3.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0R5 A00() {
        /*
            r25 = this;
            r9 = r25
            java.util.concurrent.Executor r1 = r9.A05
            java.util.concurrent.Executor r0 = r9.A06
            if (r1 != 0) goto L_0x0042
            if (r0 != 0) goto L_0x000e
            java.util.concurrent.Executor r0 = X.C004004h.A02
            r9.A06 = r0
        L_0x000e:
            r9.A05 = r0
        L_0x0010:
            java.util.Set r0 = r9.A03
            if (r0 == 0) goto L_0x0047
            X.C162457s7.A0H(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r3.next()
            int r2 = X.AnonymousClass001.A0K(r0)
            java.util.Set r1 = r9.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0042:
            if (r0 != 0) goto L_0x0010
            r9.A06 = r1
            goto L_0x0010
        L_0x0047:
            X.0sP r14 = r9.A01
            if (r14 != 0) goto L_0x0050
            X.0eo r14 = new X.0eo
            r14.<init>()
        L_0x0050:
            java.lang.String r1 = "Required value was null."
            android.content.Context r11 = r9.A0A
            java.lang.String r15 = r9.A0C
            X.0Q6 r13 = r9.A0B
            java.util.List r8 = r9.A0D
            boolean r7 = r9.A08
            X.0GB r0 = r9.A00
            X.0GB r12 = r0.A00(r11)
            java.util.concurrent.Executor r6 = r9.A05
            if (r6 == 0) goto L_0x0239
            java.util.concurrent.Executor r5 = r9.A06
            if (r5 == 0) goto L_0x0234
            boolean r4 = r9.A09
            boolean r3 = r9.A07
            java.util.Set r2 = r9.A04
            java.util.List r1 = r9.A0E
            java.util.List r0 = r9.A02
            X.0Mn r10 = new X.0Mn
            r16 = r8
            r17 = r1
            r18 = r0
            r19 = r2
            r20 = r6
            r21 = r5
            r22 = r7
            r23 = r4
            r24 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r6 = X.AnonymousClass0S0.A01()
            X.0R5 r6 = (X.AnonymousClass0R5) r6
            r8 = 0
            r1 = r6
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            X.0Y4 r0 = new X.0Y4
            r0.<init>(r1)
            X.0A5 r2 = new X.0A5
            r2.<init>(r10, r0)
            android.content.Context r0 = r10.A00
            X.0Ob r1 = new X.0Ob
            r1.<init>(r0)
            java.lang.String r0 = r10.A04
            r1.A01 = r0
            r1.A00 = r2
            X.0MP r1 = r1.A00()
            X.0sP r0 = r10.A03
            X.0vT r0 = r0.Azs(r1)
            r6.A00 = r0
            java.util.Set r0 = r6.A05()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0112
            java.lang.Object r5 = r7.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.util.List r3 = r10.A05
            int r2 = X.AnonymousClass002.A03(r3)
            if (r2 < 0) goto L_0x00fb
        L_0x00da:
            int r1 = r2 + -1
            java.lang.Object r0 = r3.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r5.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x00f7
            r4.set(r2)
            java.util.Map r1 = r6.A02
            java.lang.Object r0 = r3.get(r2)
            r1.put(r5, r0)
            goto L_0x00c5
        L_0x00f7:
            if (r1 < 0) goto L_0x00fb
            r2 = r1
            goto L_0x00da
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "A required auto migration spec ("
            r1.append(r0)
            java.lang.String r0 = r5.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = ") is missing in the database configuration."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0112:
            java.util.List r0 = r10.A05
            int r0 = X.AnonymousClass002.A03(r0)
            if (r0 < 0) goto L_0x012d
        L_0x011a:
            int r1 = r0 + -1
            boolean r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0126
            if (r1 < 0) goto L_0x012d
            r0 = r1
            goto L_0x011a
        L_0x0126:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x012d:
            java.util.Map r0 = r6.A02
            java.util.List r0 = r6.A03(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0137:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r3 = r4.next()
            X.0NF r3 = (X.AnonymousClass0NF) r3
            X.0Q6 r2 = r10.A02
            int r1 = r3.A01
            int r0 = r3.A00
            boolean r0 = r2.A03(r1, r0)
            if (r0 != 0) goto L_0x0137
            X.0NF[] r0 = new X.AnonymousClass0NF[r5]
            r0[r8] = r3
            r2.A02(r0)
            goto L_0x0137
        L_0x0157:
            java.lang.Class<X.0es> r1 = X.C08680es.class
            X.0vT r0 = r6.A00()
            r1.isInstance(r0)
            java.lang.Class<X.0er> r1 = X.C08670er.class
            X.0vT r0 = r6.A00()
            r1.isInstance(r0)
            X.0GB r1 = r10.A01
            X.0GB r0 = X.AnonymousClass0GB.WRITE_AHEAD_LOGGING
            boolean r1 = X.AnonymousClass000.A1Y(r1, r0)
            X.0vT r0 = r6.A00()
            r0.Bnt(r1)
            java.util.List r0 = r10.A06
            r6.A01 = r0
            java.util.concurrent.Executor r0 = r10.A09
            r6.A03 = r0
            java.util.concurrent.Executor r1 = r10.A0A
            X.0na r0 = new X.0na
            r0.<init>(r1)
            r6.A04 = r0
            boolean r0 = r10.A0C
            r6.A05 = r0
            java.util.Map r0 = r6.A04()
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r0)
        L_0x019a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0208
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r7 = r0.getKey()
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x01b4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x019a
            java.lang.Object r4 = r8.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.List r3 = r10.A07
            int r2 = X.AnonymousClass002.A03(r3)
            if (r2 < 0) goto L_0x01e9
        L_0x01c8:
            int r1 = r2 + -1
            java.lang.Object r0 = r3.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r4.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x01e5
            r5.set(r2)
            java.util.Map r1 = r6.A09
            java.lang.Object r0 = r3.get(r2)
            r1.put(r4, r0)
            goto L_0x01b4
        L_0x01e5:
            if (r1 < 0) goto L_0x01e9
            r2 = r1
            goto L_0x01c8
        L_0x01e9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "A required type converter ("
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ") for "
            r1.append(r0)
            java.lang.String r0 = r7.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = " is missing in the database configuration."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0208:
            java.util.List r3 = r10.A07
            int r2 = X.AnonymousClass002.A03(r3)
            if (r2 < 0) goto L_0x0233
        L_0x0210:
            int r1 = r2 + -1
            boolean r0 = r5.get(r2)
            if (r0 == 0) goto L_0x021c
            if (r1 < 0) goto L_0x0233
            r2 = r1
            goto L_0x0210
        L_0x021c:
            java.lang.Object r2 = r3.get(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected type converter "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0233:
            return r6
        L_0x0234:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        L_0x0239:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04490Om.A00():X.0R5");
    }

    public void A01(AnonymousClass0NF... r6) {
        if (this.A03 == null) {
            this.A03 = AnonymousClass002.A0K();
        }
        for (AnonymousClass0NF r2 : r6) {
            Set set = this.A03;
            C162457s7.A0H(set);
            set.add(Integer.valueOf(r2.A01));
            Set set2 = this.A03;
            C162457s7.A0H(set2);
            set2.add(Integer.valueOf(r2.A00));
        }
        this.A0B.A02((AnonymousClass0NF[]) Arrays.copyOf(r6, r4));
    }
}
