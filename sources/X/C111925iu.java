package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5iu  reason: invalid class name and case insensitive filesystem */
public class C111925iu implements AnonymousClass4CP {
    public final /* synthetic */ AnonymousClass5Y9 A00;
    public final /* synthetic */ C148097Gx A01;
    public final /* synthetic */ UserJid A02;

    public C111925iu(AnonymousClass5Y9 r1, C148097Gx r2, UserJid userJid) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = userJid;
    }

    public void BYZ(String str, int i) {
        if (406 == i || 421 == i) {
            AnonymousClass5Y9.A00(this.A00, this.A02);
        }
        C148097Gx r1 = this.A01;
        C162457s7.A0J(str, 0);
        r1.A00.A0E.A0G(str);
    }

    public void BYa(AnonymousClass2JY r11) {
        C148097Gx r8 = this.A01;
        String str = r11.A01;
        if (C162457s7.A0P(str, "success")) {
            AnonymousClass4V2 r1 = r8.A00;
            AnonymousClass08M r0 = r1.A07;
            String str2 = r8.A01;
            r0.A0G(str2);
            AnonymousClass08M r02 = r1.A06;
            String str3 = r11.A00;
            r02.A0G(str3);
            AnonymousClass33p r5 = r1.A0C;
            UserJid userJid = r1.A0D;
            C18260x0.A0F(C18270x1.A03(r5), "dc_user_postcode_", userJid.getRawString(), str2, AnonymousClass001.A0o());
            if (str3 != null) {
                C18260x0.A0F(C18270x1.A03(r5), "dc_location_name_", userJid.getRawString(), str3, AnonymousClass001.A0o());
            }
        }
        r8.A00.A0E.A0G(str);
    }
}
