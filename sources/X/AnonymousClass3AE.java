package X;

import com.whatsapp.community.CommunityHomeActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3AE  reason: invalid class name */
public class AnonymousClass3AE implements C16510tW {
    public final /* synthetic */ CommunityHomeActivity A00;

    public AnonymousClass3AE(CommunityHomeActivity communityHomeActivity) {
        this.A00 = communityHomeActivity;
    }

    public boolean BZJ(String str) {
        C64633Eh r2 = this.A00.A0X.A02;
        List list = r2.A05;
        list.clear();
        ArrayList A03 = C107155an.A03(r2.A02, str);
        C162457s7.A0D(A03);
        list.addAll(A03);
        r2.A04.run();
        return true;
    }

    public boolean BZK(String str) {
        return false;
    }
}
