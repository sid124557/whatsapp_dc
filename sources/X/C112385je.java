package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;

/* renamed from: X.5je  reason: invalid class name and case insensitive filesystem */
public class C112385je implements C184248rU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ C109065e1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C112385je(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C109065e1 r2, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A07 = z;
        this.A02 = r2;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public void BWV() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        C111545iG r2 = businessDirectoryContextualSearchViewModel.A0N;
        int i = 20;
        if (this.A07) {
            i = 19;
        }
        r2.A09(C105085Tn.A00(businessDirectoryContextualSearchViewModel), C18290x4.A0c(), (Map) null, 1, i, 1);
        C109065e1 r13 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        businessDirectoryContextualSearchViewModel.A0T(r13);
        businessDirectoryContextualSearchViewModel.A0e.A01(r13.A02, 1, str, str2, businessDirectoryContextualSearchViewModel.A0W.A0P, r13.A0H, str3, str4, i2, 1);
        businessDirectoryContextualSearchViewModel.A0U(r13, str, str2, str3, str4, i2);
    }

    public void BYw(Integer num, Integer num2, Integer num3, Integer num4) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        C111545iG r2 = businessDirectoryContextualSearchViewModel.A0N;
        int i = 18;
        if (this.A07) {
            i = 17;
        }
        r2.A09(C105085Tn.A00(businessDirectoryContextualSearchViewModel), C18290x4.A0b(), (Map) null, 1, i, 1);
        C109065e1 r13 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        businessDirectoryContextualSearchViewModel.A0T(r13);
        businessDirectoryContextualSearchViewModel.A0e.A01(r13.A02, C18290x4.A0Z(), str, str2, businessDirectoryContextualSearchViewModel.A0W.A0P, r13.A0H, str3, str4, i2, 1);
        businessDirectoryContextualSearchViewModel.A0U(r13, str, str2, str3, str4, i2);
    }
}
