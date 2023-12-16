package com.whatsapp.polls;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C56612sH;
import X.C617532c;
import X.C621033m;
import X.C97494yP;
import X.C97504yQ;
import X.C97514yR;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PollCreatorViewModel extends C05550Ty {
    public int A00 = -1;
    public int A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C621033m A04;
    public final C56612sH A05;
    public final AnonymousClass1VX A06;
    public final C97494yP A07 = new C97494yP();
    public final C97514yR A08 = new C97514yR();
    public final C617532c A09;
    public final AnonymousClass4UC A0A = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0B = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0C = AnonymousClass0x9.A0b();
    public final List A0D = AnonymousClass001.A0s();
    public final List A0E = AnonymousClass001.A0s();

    public boolean A0E(int i) {
        int i2;
        List list = this.A0E;
        int size = list.size();
        if (size <= 0 || i != size - 1 || size != this.A06.A0N(1408) || !((C97504yQ) list.get(i2)).A00.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0F(String str, int i) {
        List list = this.A0E;
        C97504yQ r1 = (C97504yQ) list.get(i);
        if (TextUtils.equals(r1.A00, str)) {
            return false;
        }
        r1.A00 = str;
        if (list.size() < this.A06.A0N(1408)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C97504yQ) it.next()).A00.isEmpty()) {
                        break;
                    }
                } else {
                    int i2 = this.A01;
                    this.A01 = i2 + 1;
                    list.add(new C97504yQ(i2));
                    break;
                }
            }
        }
        A0D();
        return true;
    }

    public PollCreatorViewModel(C621033m r4, C56612sH r5, AnonymousClass1VX r6, C617532c r7) {
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r4;
        this.A09 = r7;
        List list = this.A0E;
        list.add(new C97504yQ(0));
        list.add(new C97504yQ(1));
        this.A01 = 2;
        A0D();
    }

    public final void A0D() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(this.A08);
        A0s.add(this.A07);
        A0s.addAll(this.A0E);
        this.A03.A0H(A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r8 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(boolean r8) {
        /*
            r7 = this;
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.List r5 = r7.A0D
            r5.clear()
            r6 = 0
            r2 = 0
            r4 = 0
        L_0x000c:
            java.util.List r1 = r7.A0E
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0038
            java.lang.Object r0 = r1.get(r2)
            X.4yQ r0 = (X.C97504yQ) r0
            java.lang.String r0 = r0.A00
            java.lang.String r1 = r0.trim()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0031
            int r4 = r4 + 1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0034
            r3.add(r1)
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0034:
            X.C86634Kw.A1V(r5, r2)
            goto L_0x0031
        L_0x0038:
            X.4UC r3 = r7.A0A
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r5)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0048
            r0 = 1
            if (r8 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r2, r0)
            r3.A0G(r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x005d
            if (r4 <= r1) goto L_0x005d
            r6 = 1
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.PollCreatorViewModel.A0G(boolean):boolean");
    }
}
