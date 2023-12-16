package X;

import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.5i5  reason: invalid class name and case insensitive filesystem */
public class C111435i5 implements C181648n6 {
    public final /* synthetic */ SearchFragment A00;

    public C111435i5(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    public boolean Bcj() {
        SearchViewModel searchViewModel = this.A00.A1c;
        AnonymousClass5ZL r3 = searchViewModel.A03;
        if (r3 == null || searchViewModel.A0I() == null) {
            return true;
        }
        C112365jc r2 = r3.A09.A04;
        AnonymousClass5U8 r0 = r2.A02;
        AnonymousClass5ZO r1 = r0.A00;
        if (r0.A03() && r1 != null && !r1.A07() && !r2.A00) {
            return true;
        }
        r3.A04();
        C111515iD r4 = r3.A0A;
        String A02 = r3.A02();
        if (!C111515iD.A00(r4)) {
            return true;
        }
        C94924sJ r22 = new C94924sJ();
        C94924sJ.A00(r4, r22, 50);
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put("location_type", A02);
        r22.A06 = C18290x4.A0o(new JSONObject(A0r));
        r4.A02.BhD(r22);
        return true;
    }
}
