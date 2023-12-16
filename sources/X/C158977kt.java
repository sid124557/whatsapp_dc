package X;

import android.content.Context;

/* renamed from: X.7kt  reason: invalid class name and case insensitive filesystem */
public class C158977kt {
    public static volatile C158977kt A0D;
    public final Context A00;
    public final C16800tz A01;
    public final AnonymousClass0Y3 A02;
    public final AnonymousClass2UR A03;
    public final C154987e6 A04;
    public final AnonymousClass737 A05;
    public final AnonymousClass7SD A06;
    public final C157097hj A07;
    public final C161897qn A08;
    public final AnonymousClass73F A09;
    public final C835348u A0A;
    public final C161697qG A0B;
    public final C160317nR A0C;

    public static C158977kt A00() {
        if (A0D == null) {
            synchronized (C158977kt.class) {
                if (A0D == null) {
                    throw AnonymousClass001.A0e("Can't find bloks instance. Is it initialized?");
                }
            }
        }
        return A0D;
    }

    public Context A02() {
        return this.A00;
    }

    public C16800tz A03() {
        return this.A01;
    }

    public AnonymousClass0Y3 A04() {
        return this.A02;
    }

    public AnonymousClass2UR A05() {
        return this.A03;
    }

    public C157097hj A06() {
        return this.A07;
    }

    public C160317nR A07() {
        C160317nR r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("No child attribute mapper configured. Unexpectedly attempting to traverse children nodes.");
    }

    public C158977kt(Context context, C16800tz r3, AnonymousClass0Y3 r4, AnonymousClass2UR r5, C154987e6 r6, AnonymousClass737 r7, C181418mj r8, C157097hj r9, C161897qn r10, AnonymousClass73F r11, C835348u r12, C161697qG r13, C160317nR r14) {
        this.A00 = context;
        this.A0A = r12;
        this.A05 = r7;
        this.A09 = r11;
        this.A0B = r13;
        this.A02 = r4;
        this.A08 = r10;
        this.A07 = r9;
        this.A03 = r5;
        this.A0C = r14;
        this.A04 = r6;
        this.A01 = r3;
        this.A06 = new AnonymousClass7SD(r8);
    }

    public static C160317nR A01() {
        return A00().A07();
    }
}
