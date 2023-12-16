package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.5ws  reason: invalid class name and case insensitive filesystem */
public final class C119375ws extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119375ws(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        FrameLayout frameLayout = new FrameLayout(this.this$0);
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        View A00 = AnonymousClass5V7.A00(addGroupParticipantsSelector.getLayoutInflater(), (ViewGroup) null, R.drawable.ic_share, R.string.f11nameremoved);
        C18310x6.A17(A00, addGroupParticipantsSelector, 24);
        C107295b4.A02(A00);
        frameLayout.addView(A00);
        return frameLayout;
    }
}
