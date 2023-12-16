package X;

import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: X.0WA  reason: invalid class name */
public class AnonymousClass0WA {
    public final C15910sA A00;
    public final AnonymousClass08Q A01;

    public static AnonymousClass0WA A00(C15910sA r2) {
        return new AnonymousClass0WA(r2, ((C15940sD) r2).BEL());
    }

    public void A01(Bundle bundle, C16850u7 r6) {
        C04740Ql r0;
        AnonymousClass08Q r2 = this.A01;
        if (r2.A01) {
            throw AnonymousClass001.A0e("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            AnonymousClass08L r02 = (AnonymousClass08L) r2.A00.A01(0, (Object) null);
            if (r02 != null) {
                r0 = r02.A0I(false);
            } else {
                r0 = null;
            }
            A02(bundle, r6, r0);
        } else {
            throw AnonymousClass001.A0e("restartLoader must be called on the main thread");
        }
    }

    public final void A02(Bundle bundle, C16850u7 r8, C04740Ql r9) {
        try {
            AnonymousClass08Q r5 = this.A01;
            r5.A01 = true;
            C04740Ql BQO = r8.BQO(bundle, 0);
            Class<?> cls = BQO.getClass();
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                AnonymousClass08L r3 = new AnonymousClass08L(bundle, BQO, r9);
                r5.A00.A03(0, r3);
                r5.A01 = false;
                C15910sA r2 = this.A00;
                C08360eK r1 = new C08360eK(r8, r3.A04);
                r3.A0B(r2, r1);
                C08360eK r0 = r3.A01;
                if (r0 != null) {
                    r3.A0F(r0);
                }
                r3.A00 = r2;
                r3.A01 = r1;
                return;
            }
            throw AnonymousClass000.A0E(BQO, "Object returned from onCreateLoader must not be a non-static inner member class: ", AnonymousClass001.A0o());
        } catch (Throwable th) {
            this.A01.A01 = false;
            throw th;
        }
    }

    public void A03(C16850u7 r6) {
        AnonymousClass08Q r2 = this.A01;
        if (r2.A01) {
            throw AnonymousClass001.A0e("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            AnonymousClass08L r3 = (AnonymousClass08L) r2.A00.A01(0, (Object) null);
            if (r3 == null) {
                A02((Bundle) null, r6, (C04740Ql) null);
                return;
            }
            C15910sA r22 = this.A00;
            C08360eK r1 = new C08360eK(r6, r3.A04);
            r3.A0B(r22, r1);
            C08360eK r0 = r3.A01;
            if (r0 != null) {
                r3.A0F(r0);
            }
            r3.A00 = r22;
            r3.A01 = r1;
        } else {
            throw AnonymousClass001.A0e("initLoader must be called on the main thread");
        }
    }

    @Deprecated
    public void A04(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C10530i5 r5 = this.A01.A00;
        if (r5.A00 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String A0X = AnonymousClass000.A0X("    ", AnonymousClass000.A0l(str));
            for (int i = 0; i < r5.A00; i++) {
                AnonymousClass08L r6 = (AnonymousClass08L) r5.A02[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(r5.A01[i]);
                printWriter.print(": ");
                printWriter.println(r6.toString());
                printWriter.print(A0X);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println(r6.A03);
                printWriter.print(A0X);
                printWriter.print("mLoader=");
                C04740Ql r1 = r6.A04;
                printWriter.println(r1);
                r1.A05(AnonymousClass000.A0X("  ", AnonymousClass000.A0l(A0X)), fileDescriptor, printWriter, strArr);
                if (r6.A01 != null) {
                    printWriter.print(A0X);
                    printWriter.print("mCallbacks=");
                    printWriter.println(r6.A01);
                    C08360eK r12 = r6.A01;
                    printWriter.print(AnonymousClass000.A0T(A0X, "  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(r12.A00);
                }
                printWriter.print(A0X);
                printWriter.print("mData=");
                Object A07 = r6.A07();
                StringBuilder sb = new StringBuilder(64);
                AnonymousClass0I1.A00(A07, sb);
                printWriter.println(AnonymousClass000.A0g(sb));
                printWriter.print(A0X);
                printWriter.print("mStarted=");
                printWriter.println(AnonymousClass001.A1W(r6.A00));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AnonymousClass000.A1J(sb, "LoaderManager{", this);
        sb.append(" in ");
        AnonymousClass0I1.A00(this.A00, sb);
        return AnonymousClass000.A0X("}}", sb);
    }

    public AnonymousClass0WA(C15910sA r3, AnonymousClass0N2 r4) {
        this.A00 = r3;
        this.A01 = (AnonymousClass08Q) new AnonymousClass0XL(AnonymousClass08Q.A02, r4).A01(AnonymousClass08Q.class);
    }

    public AnonymousClass0WA() {
    }
}
