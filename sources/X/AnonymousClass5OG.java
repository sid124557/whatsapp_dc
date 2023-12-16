package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.LinkedHashSet;

/* renamed from: X.5OG  reason: invalid class name */
public final class AnonymousClass5OG {
    public BusinessDirectoryContextualSearchViewModel A00;
    public final AnonymousClass5IL A01;
    public final AnonymousClass5J2 A02;
    public final AnonymousClass5HL A03;
    public final C105725Wd A04;
    public final AnonymousClass5W7 A05;

    public final void A00(AnonymousClass7H6 r29, C150967Sx r30, AnonymousClass5ZO r31, C104755Sf r32, AnonymousClass5ZI r33, String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass5J2 r7 = this.A02;
        AnonymousClass5ZI r10 = r33;
        String str5 = str;
        AnonymousClass63T r14 = new AnonymousClass63T(this, r32, r10, str5, z);
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        C69903Yy r4 = new C69903Yy();
        AnonymousClass7UR r0 = new AnonymousClass7UR();
        String str6 = str2;
        r0.A02 = str6;
        String str7 = str3;
        r0.A03 = str7;
        r4.element = r0.A00();
        int i2 = i;
        AnonymousClass63U r20 = new AnonymousClass63U(r7, A17, r14, r4, i2);
        if (r33 != null) {
            r10.A09("text_search_local_business_request_start");
        }
        AnonymousClass64W r142 = r7.A00;
        C59722xN r2 = r7.A02.A00;
        boolean z2 = !z;
        int i3 = 3;
        if (z) {
            i3 = 2;
        }
        AnonymousClass5ZO r11 = r31;
        C59722xN r19 = r2;
        C114435n2 r18 = new C114435n2(r11, r7, r10, r20);
        AnonymousClass5ZO r17 = r11;
        r142.B0F(r29, r30, r17, r18, r19, (AnonymousClass5ZI) null, str5, str6, str7, str4, i3, true, z2).A08();
        if (i == 0 || i2 == 2) {
            AnonymousClass63M r8 = new AnonymousClass63M(r7, A17, r14, r4);
            if (r33 != null) {
                r10.A09("text_search_api_business_request_start");
            }
            r7.A03.B0C(new AnonymousClass93B(r10, r8, 0), r2, (AnonymousClass5ZI) null, str5).A08();
        }
    }

    public AnonymousClass5OG(AnonymousClass5IL r1, AnonymousClass5J2 r2, AnonymousClass5HL r3, C105725Wd r4, AnonymousClass5W7 r5) {
        C18260x0.A0f(r3, r2, r4, r5, r1);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
    }
}
