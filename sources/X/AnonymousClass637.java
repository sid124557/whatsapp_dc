package X;

import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.637  reason: invalid class name */
public final class AnonymousClass637 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ int $selectedPosePosition;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass637(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i, int i2) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$selectedPosePosition = i;
        this.$instanceKey = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        C162457s7.A0J(iterable, 0);
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        int i = this.$selectedPosePosition;
        ArrayList A0c = C73783g4.A0c(iterable);
        int i2 = 0;
        for (Object next : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw C18280x3.A0X();
            }
            C51942kd r0 = (C51942kd) next;
            A0c.add(new C132066ed(r0.A00, r0.A01, AnonymousClass0Y8.A04(avatarProfilePhotoViewModel.A04.A00.A00.getApplicationContext(), R.color.f5nameremoved), AnonymousClass000.A1U(i2, i)));
            i2 = i3;
        }
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            C132066ed r8 = (C132066ed) it.next();
            if (r8.A03) {
                this.this$0.A00.A0H(new AnonymousClass5Z8(C86654Ky.A0R(this.this$0.A00).A00, r8, A0c, C86654Ky.A0R(this.this$0.A00).A02, false, false, false));
                AvatarProfilePhotoViewModel avatarProfilePhotoViewModel2 = this.this$0;
                int i4 = this.$instanceKey;
                int size = A0c.size();
                C55782qu r1 = avatarProfilePhotoViewModel2.A0A;
                r1.A03(C137496om.A00, i4, size);
                r1.A01(i4, "poses_sent_to_ui");
                r1.A02(C372621o.SUCCESS, i4);
                return C59022wD.A00;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
