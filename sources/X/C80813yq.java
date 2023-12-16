package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3yq  reason: invalid class name and case insensitive filesystem */
public final class C80813yq extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "invitee_jids";
    public final /* synthetic */ C08310eF $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80813yq(C08310eF r2) {
        super(0);
        this.$this_jidListArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A06;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            return AnonymousClass360.A01(C72023d3.A00);
        }
        List A0B = C627336j.A0B(Jid.class, stringArrayList);
        if (!(A0B instanceof C834348j) || (A0B instanceof C85384Ga)) {
            return A0B;
        }
        throw C73193f5.A00;
    }
}
