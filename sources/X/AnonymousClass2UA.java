package X;

import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$1;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$3;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$stickersFlow$1;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$stickersFlow$2;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2UA  reason: invalid class name */
public final class AnonymousClass2UA {
    public List A00;
    public final AnonymousClass2EM A01;
    public final C60582yn A02;
    public final AnonymousClass1VX A03;
    public final C55862r2 A04;
    public final C27811eh A05;
    public final AnonymousClass2TU A06;
    public final AnonymousClass32R A07;
    public final C58912w1 A08;
    public final List A09;
    public final List A0A;
    public final C73853gB A0B;
    public final C73853gB A0C;
    public final AnonymousClass4C6 A0D;
    public final AnonymousClass4C8 A0E;
    public final C85564Gt A0F;
    public final C85564Gt A0G;

    public AnonymousClass2UA(AnonymousClass2EM r11, C60582yn r12, AnonymousClass1VX r13, C55862r2 r14, C27811eh r15, AnonymousClass2TU r16, AnonymousClass32R r17, C58912w1 r18, C73853gB r19, C73853gB r20) {
        AnonymousClass32R r3 = r17;
        C58912w1 r2 = r18;
        C18260x0.A0f(r13, r14, r2, r3, r12);
        AnonymousClass2TU r4 = r16;
        C18260x0.A0W(r4, r15, r11);
        C73853gB r1 = r19;
        C162457s7.A0J(r1, 9);
        this.A03 = r13;
        this.A04 = r14;
        this.A08 = r2;
        this.A07 = r3;
        this.A02 = r12;
        this.A06 = r4;
        this.A05 = r15;
        this.A01 = r11;
        this.A0C = r1;
        C73853gB r0 = r20;
        this.A0B = r0;
        this.A0D = AnonymousClass349.A01(r0);
        AnonymousClass8U9 r22 = new AnonymousClass8U9();
        r22.add(C29861lT.A00);
        r22.add(C29881lV.A00);
        r22.add(C29911lY.A00);
        r22.add(C29851lS.A00);
        r22.add(C29891lW.A00);
        r22.add(AnonymousClass1lR.A00);
        if (C56952sp.A0J(this.A03, 4821)) {
            r22.add(C29871lU.A00);
        }
        List<C43952Uc> A0h = C159507lx.A0h(r22);
        this.A00 = A0h;
        ArrayList A0d = C73783g4.A0d(A0h);
        for (C43952Uc r8 : A0h) {
            C23551Tr r42 = new C23551Tr(r8, r8.toString());
            AnonymousClass8U9 r23 = new AnonymousClass8U9();
            r23.add(new C23491Tl((AnonymousClass2UW) r42, (Integer) null, this.A02.A01(r8), 10));
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("loading-");
            A0o.append(r8);
            C23461Ti.A00(r42, AnonymousClass000.A0X("-1", A0o), r23);
            C23461Ti.A00(r42, AnonymousClass000.A0X("-2", AnonymousClass000.A0k(r8, "loading-")), r23);
            C23461Ti.A00(r42, AnonymousClass000.A0X("-3", AnonymousClass000.A0k(r8, "loading-")), r23);
            C23461Ti.A00(r42, AnonymousClass000.A0X("-4", AnonymousClass000.A0k(r8, "loading-")), r23);
            A0d.add(C159507lx.A0h(r23));
        }
        this.A0A = C73783g4.A0e(A0d);
        List<C43952Uc> list = this.A00;
        ArrayList A0d2 = C73783g4.A0d(list);
        for (C43952Uc avatarOnDemandStickerCategory : list) {
            AnonymousClass2EM r110 = this.A01;
            AvatarOnDemandStickers A2Q = r110.A00.A03.A2Q();
            AnonymousClass46Q r111 = AnonymousClass2C4.A02;
            C615931l.A00(r111);
            A0d2.add(new AvatarOnDemandStickerCategory(avatarOnDemandStickerCategory, A2Q, (C55862r2) r110.A00.A02.A1T.get(), r111));
        }
        this.A09 = A0d2;
        AnonymousClass4J6 r82 = new AnonymousClass4J6((AnonymousClass4GR) new AvatarExpressionsDataFlow$all$3(this, (C84814Du) null), (AnonymousClass4C8) new AnonymousClass4J5(new AnonymousClass4J6((AnonymousClass4GR) new AvatarExpressionsDataFlow$all$2(this, (C84814Du) null), (AnonymousClass4C8) new C831846l(new AvatarExpressionsDataFlow$all$1(this, (C84814Du) null)), 9), 2), 6);
        this.A0E = r82;
        C85544Gr r6 = this.A06.A07;
        AnonymousClass4C8 r43 = this.A07.A05;
        AnonymousClass4C8 r112 = this.A08.A07;
        AvatarExpressionsDataFlow$stickersFlow$1 avatarExpressionsDataFlow$stickersFlow$1 = new AvatarExpressionsDataFlow$stickersFlow$1(this, (C84814Du) null);
        AnonymousClass4C8[] r24 = new AnonymousClass4C8[4];
        C18260x0.A0j(r6, r43, r112, r24);
        r24[3] = r82;
        AnonymousClass4J6 r44 = new AnonymousClass4J6((AnonymousClass4GR) new AvatarExpressionsDataFlow$stickersFlow$2(this, (C84814Du) null), (AnonymousClass4C8) new AnonymousClass4J6((Object) avatarExpressionsDataFlow$stickersFlow$1, 11, (Object) r24), 10);
        AnonymousClass4C6 r32 = this.A0D;
        C72913eV r02 = new C72913eV(10000);
        C72023d3 r5 = C72023d3.A00;
        this.A0G = AnonymousClass34B.A03(r5, r32, r44, r02);
        this.A0F = AnonymousClass34B.A03(r5, this.A0D, new AnonymousClass4J6((Object) this, 3, (Object) this.A06.A07), new C72913eV(0));
    }
}
