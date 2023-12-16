package X;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.0dc  reason: invalid class name and case insensitive filesystem */
public final class C08240dc implements C15880s7, C15060qi {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CharSequence A08;
    public CharSequence A09;
    public String A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final C05930Vn A0I;
    public final C08270df A0J;
    public final ClassLoader A0K;

    public void A01() {
        A00(false);
    }

    public void A02() {
        A00(true);
    }

    public void A09(C08310eF r3, int i) {
        A0F(r3, (String) null, i, 1);
    }

    public void A0A(C08310eF r2, int i) {
        A0E(r2, (String) null, i);
    }

    public void A0C(C08310eF r3, String str) {
        A0F(r3, str, 0, 1);
    }

    public void A0D(C08310eF r2, String str, int i) {
        A0F(r2, str, i, 1);
    }

    public int A00(boolean z) {
        int i;
        if (!this.A0G) {
            if (C08270df.A04()) {
                AnonymousClass000.A1K(AnonymousClass001.A0o(), "Commit: ", this);
                PrintWriter printWriter = new PrintWriter(new AnonymousClass0FF());
                A0H(printWriter, "  ", true);
                printWriter.close();
            }
            this.A0G = true;
            if (this.A0E) {
                i = this.A0J.A0e.getAndIncrement();
            } else {
                i = -1;
            }
            this.A04 = i;
            this.A0J.A0h(this, z);
            return this.A04;
        }
        throw AnonymousClass001.A0e("commit already called");
    }

    public void A03() {
        if (!this.A0E) {
            this.A0F = false;
            this.A0J.A0i(this, false);
            return;
        }
        throw AnonymousClass001.A0e("This transaction is already being added to the back stack");
    }

    public void A04() {
        if (!this.A0E) {
            this.A0F = false;
            this.A0J.A0i(this, true);
            return;
        }
        throw AnonymousClass001.A0e("This transaction is already being added to the back stack");
    }

    public void A05(int i) {
        if (this.A0E) {
            if (C08270df.A05(2)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Bump nesting in ");
                A0o.append(this);
                Log.v("FragmentManager", AnonymousClass000.A0Y(" by ", A0o, i));
            }
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C06170Wn r6 = (C06170Wn) arrayList.get(i2);
                C08310eF r1 = r6.A05;
                if (r1 != null) {
                    r1.A00 += i;
                    if (C08270df.A05(2)) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Bump nesting of ");
                        A0o2.append(r6.A05);
                        A0o2.append(" to ");
                        Log.v("FragmentManager", AnonymousClass000.A0h(A0o2, r6.A05.A00));
                    }
                }
            }
        }
    }

    public void A06(C08310eF r3) {
        C08270df r1 = r3.A0I;
        if (r1 == null || r1 == this.A0J) {
            A0G(new C06170Wn(r3, 4));
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        AnonymousClass000.A1B(r3, A0o);
        throw AnonymousClass000.A0I(" is already attached to a FragmentManager.", A0o);
    }

    public void A07(C08310eF r3) {
        C08270df r1 = r3.A0I;
        if (r1 == null || r1 == this.A0J) {
            A0G(new C06170Wn(r3, 3));
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        AnonymousClass000.A1B(r3, A0o);
        throw AnonymousClass000.A0I(" is already attached to a FragmentManager.", A0o);
    }

    public void A08(C08310eF r3) {
        C08270df r1 = r3.A0I;
        if (r1 == null || r1 == this.A0J) {
            A0G(new C06170Wn(r3, 5));
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        AnonymousClass000.A1B(r3, A0o);
        throw AnonymousClass000.A0I(" is already attached to a FragmentManager.", A0o);
    }

    public void A0B(C08310eF r4, AnonymousClass0GC r5) {
        C08270df r0 = r4.A0I;
        C08270df r2 = this.A0J;
        if (r0 == r2) {
            A0G(new C06170Wn(r4, r5));
            return;
        }
        throw AnonymousClass000.A0E(r2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ", AnonymousClass001.A0o());
    }

    public void A0E(C08310eF r2, String str, int i) {
        if (i != 0) {
            A0F(r2, str, i, 2);
            return;
        }
        throw AnonymousClass001.A0c("Must use non-zero containerViewId");
    }

    public void A0F(C08310eF r5, String str, int i, int i2) {
        String str2 = r5.A0S;
        if (str2 != null) {
            AnonymousClass0Y2.A02(r5, str2);
        }
        Class<?> cls = r5.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Fragment ");
            A0o.append(cls.getCanonicalName());
            throw AnonymousClass000.A0I(" must be a public static class to be  properly recreated from instance state.", A0o);
        }
        if (str != null) {
            String str3 = r5.A0T;
            if (str3 == null || str.equals(str3)) {
                r5.A0T = str;
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass000.A17(r5, "Can't change tag of fragment ", ": was ", A0o2);
                A0o2.append(r5.A0T);
                A0o2.append(" now ");
                throw AnonymousClass000.A0I(str, A0o2);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = r5.A03;
                if (i3 == 0 || i3 == i) {
                    r5.A03 = i;
                    r5.A01 = i;
                } else {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    AnonymousClass000.A17(r5, "Can't change container ID of fragment ", ": was ", A0o3);
                    A0o3.append(r5.A03);
                    throw AnonymousClass001.A0e(AnonymousClass000.A0Y(" now ", A0o3, i));
                }
            } else {
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("Can't add fragment ");
                A0o4.append(r5);
                A0o4.append(" with tag ");
                A0o4.append(str);
                throw AnonymousClass000.A0F(" to container view with no id", A0o4);
            }
        }
        A0G(new C06170Wn(r5, i2));
        r5.A0I = this.A0J;
    }

    public void A0G(C06170Wn r2) {
        this.A0B.add(r2);
        r2.A01 = this.A02;
        r2.A02 = this.A03;
        r2.A03 = this.A05;
        r2.A04 = this.A06;
    }

    public void A0H(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0A);
            printWriter.print(" mIndex=");
            printWriter.print(this.A04);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A0G);
            if (this.A07 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                AnonymousClass001.A1E(printWriter, this.A07);
            }
            if (!(this.A02 == 0 && this.A03 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                AnonymousClass001.A1E(printWriter, this.A02);
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (!(this.A05 == 0 && this.A06 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                AnonymousClass001.A1E(printWriter, this.A05);
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A06));
            }
            if (!(this.A01 == 0 && this.A09 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                AnonymousClass001.A1E(printWriter, this.A01);
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A09);
            }
            if (!(this.A00 == 0 && this.A08 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                AnonymousClass001.A1E(printWriter, this.A00);
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A08);
            }
        }
        ArrayList arrayList = this.A0B;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C06170Wn r4 = (C06170Wn) arrayList.get(i);
                int i2 = r4.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = AnonymousClass000.A0Y("cmd=", AnonymousClass001.A0o(), i2);
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r4.A05);
                if (z) {
                    if (!(r4.A01 == 0 && r4.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        AnonymousClass001.A1E(printWriter, r4.A01);
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A02));
                    }
                    if (r4.A03 != 0 || r4.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        AnonymousClass001.A1E(printWriter, r4.A03);
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A04));
                    }
                }
            }
        }
    }

    public void A0I(String str) {
        if (this.A0F) {
            this.A0E = true;
            this.A0A = str;
            return;
        }
        throw AnonymousClass001.A0e("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AnonymousClass000.A1J(sb, "BackStackEntry{", this);
        int i = this.A04;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A0A;
        if (str != null) {
            AnonymousClass001.A1L(sb);
            sb.append(str);
        }
        return AnonymousClass000.A0g(sb);
    }

    public C08240dc(C08270df r4) {
        ClassLoader classLoader;
        C05930Vn A0E2 = r4.A0E();
        AnonymousClass07u r0 = r4.A07;
        if (r0 != null) {
            classLoader = r0.A01.getClassLoader();
        } else {
            classLoader = null;
        }
        this.A0B = AnonymousClass001.A0s();
        this.A0F = true;
        this.A0H = false;
        this.A0I = A0E2;
        this.A0K = classLoader;
        this.A04 = -1;
        this.A0J = r4;
    }

    public boolean B3h(ArrayList arrayList, ArrayList arrayList2) {
        if (C08270df.A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "Run: ", this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.A0E) {
            return true;
        }
        C08270df r1 = this.A0J;
        ArrayList arrayList3 = r1.A0E;
        if (arrayList3 == null) {
            arrayList3 = AnonymousClass001.A0s();
            r1.A0E = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    @Deprecated
    public C08240dc() {
        this.A0B = AnonymousClass001.A0s();
        this.A0F = true;
        this.A0H = false;
        this.A0I = null;
        this.A0K = null;
    }
}
