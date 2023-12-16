package X;

import com.whatsapp.productinfra.avatar.data.profilephoto.AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1;
import java.util.List;

/* renamed from: X.2cf  reason: invalid class name and case insensitive filesystem */
public final class C47072cf {
    public final C69263Wi A00;
    public final AnonymousClass1VX A01;
    public final C51932kc A02;
    public final C55782qu A03;
    public final AnonymousClass4FS A04;
    public final C183538qC A05;
    public final AnonymousClass4C1 A06;

    public final List A00(List list, boolean z, boolean z2) {
        C49662gt r3 = (C49662gt) this.A05.get();
        List list2 = list;
        boolean z3 = z;
        boolean z4 = z2;
        if (!this.A01.A0Y(C58422vE.A02, 3237)) {
            return r3.A01(list, z, z2);
        }
        return (List) C380725l.A00(C72553du.A00, new AvatarProfilePhotoPosesFetcher$fetchPosesInParallel$1(r3, list2, (C84814Du) null, z3, z4));
    }

    public C47072cf(C69263Wi r1, AnonymousClass1VX r2, C51932kc r3, C55782qu r4, AnonymousClass4FS r5, C183538qC r6, AnonymousClass4C1 r7) {
        C18260x0.A0f(r2, r1, r5, r3, r4);
        C18260x0.A0U(r6, r7);
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = r7;
    }
}
