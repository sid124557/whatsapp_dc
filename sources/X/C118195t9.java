package X;

import com.whatsapp.community.CommunityMembersViewModel;

/* renamed from: X.5t9  reason: invalid class name and case insensitive filesystem */
public final class C118195t9 implements AnonymousClass4C8 {
    public final /* synthetic */ CommunityMembersViewModel A00;
    public final /* synthetic */ AnonymousClass4C8 A01;

    public C118195t9(CommunityMembersViewModel communityMembersViewModel, AnonymousClass4C8 r2) {
        this.A01 = r2;
        this.A00 = communityMembersViewModel;
    }

    public Object Az8(C84814Du r5, AnonymousClass4C9 r6) {
        Object Az8 = this.A01.Az8(r5, new AnonymousClass6AZ(r6, 0, this.A00));
        if (Az8 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return C59022wD.A00;
        }
        return Az8;
    }
}
