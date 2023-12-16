package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.UUID;

/* renamed from: X.2he  reason: invalid class name and case insensitive filesystem */
public class C50112he {
    public final C54292oU A00;
    public final AnonymousClass4FV A01;
    public final C28101fh A02;
    public final C135256kN A03;
    public final C135246kM A04;
    public final C49602gn A05;
    public final C989053r A06;

    public AnonymousClass7PV A00(AnonymousClass3QO r21, C47592dV r22) {
        String str;
        AnonymousClass7UI r8;
        C49602gn r2;
        C633138t r0;
        C158797kZ r9 = new C158797kZ(this.A01);
        AnonymousClass3QO r10 = r21;
        String str2 = r10.A0L.A0D;
        r9.A03.A0E = C18290x4.A0g(str2);
        AnonymousClass7PV r1 = new AnonymousClass7PV(r9);
        C47592dV r02 = r22;
        C633138t r5 = r02.A05;
        if (!r02.A0C && r02.A07 == null) {
            C182568od r12 = r1.A06;
            AnonymousClass7E3 r11 = r1.A05;
            C182578oe r13 = r1.A07;
            String str3 = r02.A0B;
            C626936e.A06(str3);
            File A012 = r02.A01();
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(UUID.randomUUID(), A0o);
            this.A05.A01(new C135426ke(r9, r10, r11, r12, r13, A01(A012, AnonymousClass000.A0X(".tmp", A0o)), str3), r5);
        } else if (r5 == C633138t.A04 || r5 == C633138t.A0Q) {
            this.A03.A08(this.A00.A00, new AnonymousClass3QH(r9, r10, r1, this, r02, r5), r10, r02.A08);
            return r1;
        } else if (AnonymousClass36O.A07(r5)) {
            this.A03.A08(this.A00.A00, new AnonymousClass3QG(r9, r10, r1, this, r02), r10, r02.A08);
            return r1;
        } else {
            if (AnonymousClass36O.A03(r5)) {
                C182568od r122 = r1.A06;
                AnonymousClass7E3 r112 = r1.A05;
                C182578oe r132 = r1.A07;
                File file = r02.A07;
                C626936e.A06(file);
                boolean z = r02.A0J;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass000.A1B(UUID.randomUUID(), A0o2);
                r8 = new C135436kf(r9, r10, r112, r122, r132, file, A01(file, AnonymousClass000.A0X(".aac", A0o2)), z);
                r2 = this.A05;
                r0 = C633138t.A05;
            } else {
                C633138t r4 = C633138t.A0C;
                if (r5 == r4 || r5 == C633138t.A0j || r5 == C633138t.A0H || r5 == C633138t.A0Z || r5 == C633138t.A07 || r5 == C633138t.A0M || r5 == C633138t.A08 || r5 == C633138t.A0R || r5 == C633138t.A0F) {
                    String str4 = r02.A0B;
                    C626936e.A06(str4);
                    C182568od r123 = r1.A06;
                    AnonymousClass7E3 r113 = r1.A05;
                    C182578oe r133 = r1.A07;
                    File A013 = r02.A01();
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    AnonymousClass000.A1B(UUID.randomUUID(), A0o3);
                    File A014 = A01(A013, AnonymousClass000.A0X(".jpg", A0o3));
                    C151027Td r14 = r02.A04;
                    C626936e.A06(r14);
                    String str5 = str4;
                    this.A05.A01(new C135446kg(r9, r10, r113, r123, r133, r14, A014, str5, r02.A0H, r02.A0E), r4);
                    return r1;
                } else if (AnonymousClass36O.A06(r5)) {
                    File file2 = r02.A07;
                    String str6 = r02.A0B;
                    String str7 = r02.A09;
                    AnonymousClass330 r142 = r02.A06;
                    String str8 = r02.A0A;
                    C182568od r124 = r1.A06;
                    AnonymousClass7E3 r114 = r1.A05;
                    C182578oe r134 = r1.A07;
                    File A015 = r02.A01();
                    if (r02.A0G) {
                        str = ".json";
                    } else {
                        str = ".webp";
                    }
                    String str9 = str6;
                    r8 = new C135466ki(r9, r10, r114, r124, r134, r142, file2, A01(A015, AnonymousClass000.A0V(C18280x3.A0Y(), str, AnonymousClass001.A0o())), str9, str7, str8);
                    r2 = this.A05;
                    r0 = C633138t.A0b;
                } else if (r5 == C633138t.A09) {
                    File file3 = r02.A07;
                    C626936e.A06(file3);
                    this.A02.A02(r10, new C149087Kz(r1.A06, r1.A07, file3));
                    return r1;
                }
            }
            r2.A01(r8, r0);
            return r1;
        }
        return r1;
    }

    public final File A01(File file, String str) {
        long j;
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        C989053r r2 = this.A06;
        if (file != null) {
            j = file.length();
        } else {
            j = -1;
        }
        return r2.A0F(str, j);
    }

    public C50112he(C54292oU r1, AnonymousClass4FV r2, C28101fh r3, C135256kN r4, C135246kM r5, C49602gn r6, C989053r r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }
}
