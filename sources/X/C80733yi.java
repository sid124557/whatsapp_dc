package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.3yi  reason: invalid class name and case insensitive filesystem */
public final class C80733yi extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $key = "preselected_jids";
    public final /* synthetic */ C08310eF $this_jidListArg;

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList<String> stringArrayList;
        Bundle bundle = this.$this_jidListArg.A06;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList(this.$key)) == null) {
            return C72023d3.A00;
        }
        return C627336j.A0B(Jid.class, stringArrayList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80733yi(C08310eF r2) {
        super(0);
        this.$this_jidListArg = r2;
    }
}
