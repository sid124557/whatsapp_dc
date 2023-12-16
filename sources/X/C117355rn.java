package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.LinkedList;

/* renamed from: X.5rn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117355rn implements Runnable {
    public final /* synthetic */ AnonymousClass5TI A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ C158377js A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final void run() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        String str = this.A03;
        AnonymousClass5TI r8 = this.A00;
        C158377js r7 = this.A02;
        String str2 = this.A04;
        String str3 = this.A05;
        LinkedList linkedList = businessDirectoryContextualSearchViewModel.A0k;
        synchronized (linkedList) {
            if (linkedList.isEmpty() && str.equals(businessDirectoryContextualSearchViewModel.A0F())) {
                businessDirectoryContextualSearchViewModel.A0B.removeCallbacks(businessDirectoryContextualSearchViewModel.A06);
                if (!r8.A09.isEmpty() || !r8.A06.isEmpty()) {
                    businessDirectoryContextualSearchViewModel.A0X.A02(new C109025dx(str, System.currentTimeMillis()));
                }
                C112305jW r1 = businessDirectoryContextualSearchViewModel.A0W;
                AnonymousClass5LW r0 = r1.A0B;
                r0.A0D = str2;
                r0.A0E = str3;
                r0.A08 = r7;
                r1.BNw(r8);
            }
        }
    }

    public /* synthetic */ C117355rn(AnonymousClass5TI r1, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C158377js r3, String str, String str2, String str3) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = str2;
        this.A05 = str3;
    }
}
