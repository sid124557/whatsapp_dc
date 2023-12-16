package X;

import android.content.ComponentName;

/* renamed from: X.0QC  reason: invalid class name */
public final class AnonymousClass0QC {
    public final ComponentName A00;
    public final ComponentName A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (X.C175728Zm.A0G(r2, "*", 0, false) == (r1 - 1)) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (X.C175728Zm.A0G(r10, "*", 0, false) == (r8 - 1)) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0QC(android.content.ComponentName r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r0 = 1
            X.C162457s7.A0J(r12, r0)
            r0 = 2
            X.C162457s7.A0J(r13, r0)
            r11.<init>()
            r11.A00 = r12
            r11.A01 = r13
            java.lang.String r2 = r12.getPackageName()
            X.C162457s7.A0D(r2)
            java.lang.String r10 = r12.getClassName()
            X.C162457s7.A0D(r10)
            java.lang.String r6 = r13.getPackageName()
            X.C162457s7.A0D(r6)
            java.lang.String r4 = r13.getClassName()
            X.C162457s7.A0D(r4)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x00a5
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00a5
            int r8 = r10.length()
            if (r8 == 0) goto L_0x009e
            int r7 = r4.length()
            if (r7 == 0) goto L_0x009e
            java.lang.String r5 = "*"
            boolean r0 = X.C175728Zm.A0S(r2, r5, false)
            if (r0 == 0) goto L_0x0054
            int r2 = X.C175728Zm.A0G(r2, "*", 0, false)
            int r1 = r1 + -1
            r0 = 0
            if (r2 != r1) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            java.lang.String r3 = "Wildcard in package name is only allowed at the end."
            if (r0 == 0) goto L_0x0099
            boolean r0 = X.C175728Zm.A0S(r10, r5, false)
            if (r0 == 0) goto L_0x0068
            int r2 = X.C175728Zm.A0G(r10, "*", 0, false)
            int r1 = r8 + -1
            r0 = 0
            if (r2 != r1) goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            java.lang.String r2 = "Wildcard in class name is only allowed at the end."
            if (r0 == 0) goto L_0x0094
            boolean r0 = X.C175728Zm.A0S(r6, r5, false)
            if (r0 == 0) goto L_0x0080
            int r1 = X.C175728Zm.A0G(r6, "*", 0, false)
            int r0 = r9 + -1
            if (r1 == r0) goto L_0x0080
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r3)
            throw r0
        L_0x0080:
            boolean r0 = X.C175728Zm.A0S(r4, r5, false)
            if (r0 == 0) goto L_0x0093
            int r1 = X.C175728Zm.A0G(r4, "*", 0, false)
            int r0 = r7 + -1
            if (r1 == r0) goto L_0x0093
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r2)
            throw r0
        L_0x0093:
            return
        L_0x0094:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r2)
            throw r0
        L_0x0099:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r3)
            throw r0
        L_0x009e:
            java.lang.String r0 = "Activity class name must not be empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x00a5:
            java.lang.String r0 = "Package name must not be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QC.<init>(android.content.ComponentName, android.content.ComponentName):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0QC) {
                AnonymousClass0QC r5 = (AnonymousClass0QC) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r4.A01(r7.getComponentName(), r5.A01) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            X.0Vk r4 = X.C05900Vk.A00
            android.content.ComponentName r0 = r6.getComponentName()
            android.content.ComponentName r3 = r5.A00
            boolean r0 = r4.A01(r0, r3)
            r2 = 1
            if (r0 == 0) goto L_0x001c
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r0 = r5.A01
            boolean r0 = r4.A01(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0042
            android.content.Intent r1 = r7.getIntent()
            X.C162457s7.A0D(r1)
            android.content.ComponentName r0 = r6.getComponentName()
            boolean r0 = r4.A01(r0, r3)
            if (r0 == 0) goto L_0x0042
            android.content.ComponentName r1 = r1.getComponent()
            android.content.ComponentName r0 = r5.A01
            boolean r0 = r4.A01(r1, r0)
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            return r2
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QC.A00(android.app.Activity, android.app.Activity):boolean");
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, this.A00.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SplitPairFilter{primaryActivityName=");
        A0o.append(this.A00);
        A0o.append(", secondaryActivityName=");
        A0o.append(this.A01);
        A0o.append(", secondaryActivityAction=");
        A0o.append((String) null);
        return AnonymousClass000.A0d(A0o);
    }
}
