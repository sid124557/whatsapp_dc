package X;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.32J  reason: invalid class name */
public class AnonymousClass32J {
    public int A00;
    public final AnonymousClass2UD A01;
    public final C47592dV A02;
    public final C157497iO A03;
    public final String A04;

    public static AnonymousClass32J A00(Uri uri, AnonymousClass32B r25, C151027Td r26, C157497iO r27, C633138t r28, AnonymousClass330 r29, String str, int i, boolean z, boolean z2, boolean z3) {
        C633138t r4 = r28;
        int i2 = i;
        boolean z4 = z2;
        return new AnonymousClass32J(C154347d1.A00(r25, r4, i2, z3), new C47592dV(r26, r4, r29, (File) null, (String) null, uri.toString(), (String) null, (String) null, 0, i2, 0, 0, z, AnonymousClass36O.A05(r4), z4, z4, false, false, false, false), r27, str, 0);
    }

    public static AnonymousClass32J A01(C56972sr r41, AnonymousClass30M r42, C29041iB r43, C55852r1 r44, C162287rd r45, C157497iO r46, boolean z) {
        boolean z2;
        boolean z3;
        AnonymousClass330 r6;
        boolean z4;
        boolean z5;
        AnonymousClass32B r4;
        String str;
        int[] iArr;
        AnonymousClass30M r14 = r42;
        String str2 = C30471mV.A00(r14.A00()).A0I;
        C157497iO r40 = r46;
        Integer num = r40.A00;
        C162287rd r0 = r45;
        Objects.requireNonNull(r0);
        AnonymousClass5GU r47 = new AnonymousClass5GU(r0);
        CopyOnWriteArrayList copyOnWriteArrayList = r14.A02;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (r47.A00.A0K((C30471mV) it.next())) {
                z2 = true;
                break;
            }
        }
        C30471mV A002 = r14.A00();
        boolean A05 = r14.A05();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (AnonymousClass2z0.A0C(C18300x5.A0T(it2))) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        AnonymousClass33C A003 = C30471mV.A00(A002);
        if (A002 instanceof AnonymousClass1nE) {
            AnonymousClass1nE r1 = (AnonymousClass1nE) A002;
            r6 = r1.A04;
            z4 = r1.A24();
        } else {
            r6 = null;
            z4 = false;
        }
        C151027Td A004 = r44.A00(num, A002.A1I, A05);
        String str3 = A003.A0H;
        File file = A003.A0F;
        String A1x = A002.A1x();
        String str4 = A002.A04;
        String str5 = A002.A05;
        C633138t A022 = AnonymousClass36O.A02(A002);
        int i = A003.A05;
        int i2 = A002.A09;
        long j = A003.A0D;
        AnonymousClass330 r19 = r6;
        File file2 = file;
        C47592dV r16 = new C47592dV(A004, A022, r19, file2, str3, A1x, str4, str5, i, i2, j, A003.A0E, A05, z3, z2, !A003.A0Q, z, A003.A0P, A003.A0O, z4);
        C56972sr r3 = r41;
        C29041iB r2 = r43;
        C18270x1.A10(r3, 1, r2);
        Iterator it3 = copyOnWriteArrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (!C627636p.A0T(r3, C18300x5.A0T(it3))) {
                    z5 = true;
                    break;
                }
            } else {
                z5 = !r2.A0C().isEmpty();
                break;
            }
        }
        C30471mV A005 = r14.A00();
        C162457s7.A0D(A005);
        AnonymousClass33C A006 = C30471mV.A00(A005);
        long j2 = A005.A0K;
        byte[] bArr = A006.A0W;
        long j3 = A006.A0B;
        if (bArr == null) {
            r4 = null;
        } else {
            if (j3 <= 0) {
                j3 = j2;
            }
            r4 = new AnonymousClass32B(bArr, j3);
        }
        C613030d A1v = A005.A1v();
        boolean A0C = AnonymousClass2z0.A0C(A005);
        boolean z6 = !A0C;
        C633138t A023 = AnonymousClass36O.A02(A005);
        File file3 = A006.A0F;
        long j4 = A005.A00;
        String str6 = A005.A04;
        String str7 = A005.A03;
        int i3 = A005.A09;
        if (A0C) {
            str = "newsletter";
        } else {
            str = "mms";
        }
        if (A1v != null) {
            iArr = A1v.A07();
        } else {
            iArr = null;
        }
        int i4 = A006.A04;
        List unmodifiableList = Collections.unmodifiableList(copyOnWriteArrayList);
        C162457s7.A0D(unmodifiableList);
        ArrayList A0c = C73783g4.A0c(unmodifiableList);
        Iterator it4 = unmodifiableList.iterator();
        while (it4.hasNext()) {
            A0c.add(AnonymousClass2z0.A06(C18300x5.A0T(it4)));
        }
        boolean A012 = AnonymousClass31H.A01(A005);
        int A007 = C622934l.A00(r14);
        C162457s7.A0H(A023);
        return new AnonymousClass32J(new AnonymousClass2UD(r4, (C148267Hs) null, A023, file3, str6, str7, str, A0c, iArr, i3, i4, A007, j4, z5, true, z6, A012), r16, r40, str2, r14.A00);
    }

    public AnonymousClass32J(AnonymousClass2UD r1, C47592dV r2, C157497iO r3, String str, int i) {
        this.A04 = str;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
