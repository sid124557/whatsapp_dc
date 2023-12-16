package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
public final class C80693ye extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "changed_participants";
    public final /* synthetic */ C08310eF $this_jidListArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80693ye(C08310eF r2) {
        super(0);
        this.$this_jidListArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A06;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            return C72023d3.A00;
        }
        return C627336j.A0B(Jid.class, stringArrayList);
    }
}
