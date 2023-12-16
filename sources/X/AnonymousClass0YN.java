package X;

import android.os.Build;

/* renamed from: X.0YN  reason: invalid class name */
public final class AnonymousClass0YN {
    public static final int A02(AnonymousClass0FO r3) {
        C162457s7.A0J(r3, 0);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new C73153f1();
    }

    public static final int A03(AnonymousClass0GD r1) {
        C162457s7.A0J(r1, 0);
        switch (r1.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw new C73153f1();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A08(byte[] r9) {
        /*
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r0 = r9.length
            r7 = 0
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 != 0) goto L_0x0056
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r9)
            r5 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x0047 }
            int r3 = r4.readInt()     // Catch:{ all -> 0x0040 }
        L_0x0020:
            if (r7 >= r3) goto L_0x003c
            java.lang.String r0 = r4.readUTF()     // Catch:{ all -> 0x0040 }
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0040 }
            boolean r1 = r4.readBoolean()     // Catch:{ all -> 0x0040 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0040 }
            X.0OP r0 = new X.0OP     // Catch:{ all -> 0x0040 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0040 }
            r8.add(r0)     // Catch:{ all -> 0x0040 }
            int r7 = r7 + 1
            goto L_0x0020
        L_0x003c:
            X.AnonymousClass2A8.A00(r4, r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ IOException -> 0x0047 }
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x004f }
        L_0x004b:
            X.AnonymousClass2A8.A00(r6, r5)
            return r8
        L_0x004f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        L_0x0056:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YN.A08(byte[]):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A09(java.util.Set r5) {
        /*
            r1 = 0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x000a
            byte[] r0 = new byte[r1]
            return r0
        L_0x000a:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            int r0 = r5.size()     // Catch:{ all -> 0x0049 }
            r3.writeInt(r0)     // Catch:{ all -> 0x0049 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x0049 }
        L_0x001f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x003a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0049 }
            X.0OP r1 = (X.AnonymousClass0OP) r1     // Catch:{ all -> 0x0049 }
            android.net.Uri r0 = r1.A00     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0049 }
            r3.writeUTF(r0)     // Catch:{ all -> 0x0049 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x0049 }
            r3.writeBoolean(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x001f
        L_0x003a:
            r0 = 0
            X.AnonymousClass2A8.A00(r3, r0)     // Catch:{ all -> 0x0050 }
            X.AnonymousClass2A8.A00(r4, r0)
            byte[] r0 = r4.toByteArray()
            X.C162457s7.A0D(r0)
            return r0
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YN.A09(java.util.Set):byte[]");
    }

    public static final AnonymousClass0FN A04(int i) {
        if (i == 0) {
            return AnonymousClass0FN.EXPONENTIAL;
        }
        if (i == 1) {
            return AnonymousClass0FN.LINEAR;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Could not convert ");
        A0o.append(i);
        throw AnonymousClass000.A0F(" to BackoffPolicy", A0o);
    }

    public static final C02380Fy A05(int i) {
        if (i == 0) {
            return C02380Fy.NOT_REQUIRED;
        }
        if (i == 1) {
            return C02380Fy.CONNECTED;
        }
        if (i == 2) {
            return C02380Fy.UNMETERED;
        }
        if (i == 3) {
            return C02380Fy.NOT_ROAMING;
        }
        if (i == 4) {
            return C02380Fy.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return C02380Fy.TEMPORARILY_UNMETERED;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Could not convert ");
        A0o.append(i);
        throw AnonymousClass000.A0F(" to NetworkType", A0o);
    }

    public static final AnonymousClass0FO A06(int i) {
        if (i == 0) {
            return AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return AnonymousClass0FO.DROP_WORK_REQUEST;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Could not convert ");
        A0o.append(i);
        throw AnonymousClass000.A0F(" to OutOfQuotaPolicy", A0o);
    }

    public static final AnonymousClass0GD A07(int i) {
        if (i == 0) {
            return AnonymousClass0GD.ENQUEUED;
        }
        if (i == 1) {
            return AnonymousClass0GD.RUNNING;
        }
        if (i == 2) {
            return AnonymousClass0GD.SUCCEEDED;
        }
        if (i == 3) {
            return AnonymousClass0GD.FAILED;
        }
        if (i == 4) {
            return AnonymousClass0GD.BLOCKED;
        }
        if (i == 5) {
            return AnonymousClass0GD.CANCELLED;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Could not convert ");
        A0o.append(i);
        throw AnonymousClass000.A0F(" to State", A0o);
    }

    public static final int A00(AnonymousClass0FN r2) {
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new C73153f1();
    }

    public static final int A01(C02380Fy r3) {
        int ordinal = r3.ordinal();
        int i = 1;
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal != 1) {
            i = 3;
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal != 3) {
                i = 5;
                if (ordinal == 4) {
                    return 4;
                }
                if (Build.VERSION.SDK_INT < 30 || r3 != C02380Fy.TEMPORARILY_UNMETERED) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Could not convert ");
                    A0o.append(r3);
                    throw AnonymousClass000.A0F(" to int", A0o);
                }
            }
        }
        return i;
    }
}
