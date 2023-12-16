package X;

import com.whatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.5jq  reason: invalid class name and case insensitive filesystem */
public final class C112505jq implements C1228265z {
    public final /* synthetic */ AnonymousClass3ZH A00;
    public final /* synthetic */ GroupDetailsCard A01;
    public final /* synthetic */ C27991fJ A02;

    public C112505jq(AnonymousClass3ZH r1, GroupDetailsCard groupDetailsCard, C27991fJ r3) {
        this.A01 = groupDetailsCard;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void BhP(AnonymousClass3ZH r12, boolean z, boolean z2) {
        GroupDetailsCard groupDetailsCard = this.A01;
        C1230066r callsManager = groupDetailsCard.getCallsManager();
        AnonymousClass3ZH r3 = this.A00;
        callsManager.Bpm(groupDetailsCard.getContext(), this.A02, AnonymousClass36T.A03(groupDetailsCard.getMeManager(), groupDetailsCard.getContactManager(), groupDetailsCard.getGroupParticipantsManager(), r3), 10, z);
    }

    public void Bpa(AnonymousClass3ZH r1) {
    }
}
